package X;

import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823190WQz {
    public static final C823190WQz LIZ = new C823190WQz();
    public static final ConcurrentHashMap<String, HashSet<String>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashSet<String> LIZJ = new ConcurrentHashSet<>();

    public final synchronized void LIZJ(String str) {
        String strLJJLIIIJ;
        if (!((Boolean) C262800ARq.LIZ.getValue()).booleanValue()) {
            return;
        }
        HashSet<String> hashSetRemove = LIZIZ.remove(str);
        if (hashSetRemove != null) {
            LIZJ.removeAll(hashSetRemove);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("end protect: key=");
        sbLIZ.append(str);
        sbLIZ.append(", file=");
        if (hashSetRemove == null) {
            strLJJLIIIJ = null;
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(hashSetRemove, null, null, null, 0, null, null, 63);
        }
        sbLIZ.append(strLJJLIIIJ);
        C201955140j.LJIIIIZZ(C830690WiJ.LIZIZ, "FileChecker", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final synchronized void LIZ(String str, String str2) {
        HashSet<String> hashSetPutIfAbsent;
        if (!((Boolean) C262800ARq.LIZ.getValue()).booleanValue()) {
            return;
        }
        ConcurrentHashMap<String, HashSet<String>> concurrentHashMap = LIZIZ;
        HashSet<String> hashSet = concurrentHashMap.get(str);
        if (hashSet == null && (hashSetPutIfAbsent = concurrentHashMap.putIfAbsent(str, (hashSet = new HashSet<>()))) != null) {
            hashSet = hashSetPutIfAbsent;
        }
        hashSet.add(str2);
        LIZJ.add(str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start protect: key=");
        sbLIZ.append(str);
        sbLIZ.append(", file=");
        sbLIZ.append(str2);
        C201955140j.LJIIIIZZ(C830690WiJ.LIZIZ, "FileChecker", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final synchronized void LIZIZ(String str, Collection<String> collection) {
        HashSet<String> hashSetPutIfAbsent;
        if (!((Boolean) C262800ARq.LIZ.getValue()).booleanValue()) {
            return;
        }
        ConcurrentHashMap<String, HashSet<String>> concurrentHashMap = LIZIZ;
        HashSet<String> hashSet = concurrentHashMap.get(str);
        if (hashSet == null && (hashSetPutIfAbsent = concurrentHashMap.putIfAbsent(str, (hashSet = new HashSet<>()))) != null) {
            hashSet = hashSetPutIfAbsent;
        }
        hashSet.addAll(collection);
        LIZJ.addAll(collection);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start protect: key=");
        sbLIZ.append(str);
        sbLIZ.append(", files=");
        sbLIZ.append(C13LP.LJJLIIIJ(collection, null, null, null, 0, null, null, 63));
        C201955140j.LJIIIIZZ(C830690WiJ.LIZIZ, "FileChecker", C2188811AlT.LIZIZ(sbLIZ));
    }
}
