package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07jm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1946007jm {
    public static final C603820NmG<String, Uri> LIZ = new C603820NmG<>(20);

    public static final Uri LIZ(String str) {
        boolean z;
        Object c098200Yq;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        Uri uriLIZJ = LIZ.LIZJ(str);
        if (uriLIZJ != null) {
            if (!(!Intrinsics.LJFF(uriLIZJ, Uri.EMPTY))) {
                return null;
            }
            return uriLIZJ;
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Uri uri = (Uri) obj;
        if (uri == null) {
            LIZ.LIZLLL(str, Uri.EMPTY);
            return uri;
        }
        LIZ.LIZLLL(str, uri);
        return uri;
    }

    public static final Map<String, String> LIZIZ(String str) {
        final C08LY c08ly = new C08LY(new C1957407lc(new C1421505hN(str, '&', null)), new C1945907jl());
        C08SN<Pair<? extends String, ? extends String>, String> c08sn = new C08SN<Pair<? extends String, ? extends String>, String>() { // from class: X.07jn
            @Override // X.C08SN
            public final Iterator<Pair<? extends String, ? extends String>> LIZ() {
                return c08ly.iterator();
            }

            @Override // X.C08SN
            public final String LIZIZ(Pair<? extends String, ? extends String> pair) {
                return pair.getFirst();
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Pair<? extends String, ? extends String>> itLIZ = c08sn.LIZ();
        while (itLIZ.hasNext()) {
            Pair<? extends String, ? extends String> next = itLIZ.next();
            Object objLIZIZ = c08sn.LIZIZ(next);
            Object second = linkedHashMap.get(objLIZIZ);
            if (second == null) {
                linkedHashMap.containsKey(objLIZIZ);
            }
            Pair<? extends String, ? extends String> pair = next;
            if (second == null) {
                second = pair.getSecond();
            }
            linkedHashMap.put(objLIZIZ, second);
        }
        return linkedHashMap;
    }

    public static final Map<String, String> LIZLLL(Uri uri) {
        if (uri.isOpaque()) {
            return C2097608Jq.LJ();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            encodedQuery = "";
        }
        return LIZIZ(encodedQuery);
    }

    public static final Uri LJ(String str) {
        try {
            Uri uriLIZ = LIZ(str);
            if (uriLIZ == null) {
                return Uri.EMPTY;
            }
            return uriLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return Uri.EMPTY;
        }
    }

    public static final String LIZJ(Uri uri, String str) {
        try {
            return C1942407jC.LIZIZ(uri, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
