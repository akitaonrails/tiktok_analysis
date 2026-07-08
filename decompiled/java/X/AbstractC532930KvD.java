package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC532930KvD implements InterfaceC533130KvX {
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(423));

    @Override // X.InterfaceC533130KvX
    public abstract void LIZIZ(String str, InterfaceC531800KtO interfaceC531800KtO);

    public abstract String LJ();

    @Override // X.InterfaceC533130KvX
    public String LIZJ(String str) {
        String str2 = this.LIZ.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final void LJFF(String str) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ());
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJI(String str) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ());
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJII(String str) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ());
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC533130KvX
    public void LIZ(List list, C535880Kzy c535880Kzy) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LIZIZ((String) it2.next(), c535880Kzy);
        }
    }

    public final void LIZLLL(String str, String str2) {
        this.LIZ.put(str, str2);
    }

    public final boolean LJIIIIZZ(C297501Dh c297501Dh, String str, InterfaceC531800KtO interfaceC531800KtO, String str2, int i) {
        if (!Intrinsics.LJFF(c297501Dh.LIZ, str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid host: ");
            sbLIZ.append(c297501Dh.LIZ);
            sbLIZ.append(", expected: ");
            sbLIZ.append(str);
            sbLIZ.append(", urs: ");
            sbLIZ.append(str2);
            LJI(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Invalid host: ");
            sbLIZ2.append(c297501Dh.LIZ);
            interfaceC531800KtO.onError(str2, i, C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        return true;
    }

    public final boolean LJIIIZ(String str, String str2, InterfaceC531800KtO interfaceC531800KtO, String str3, int i) {
        if (str != null && str.length() != 0) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid param: ");
        sbLIZ.append(str2);
        sbLIZ.append(" is empty, urs: ");
        sbLIZ.append(str3);
        LJI(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append(" is empty");
        interfaceC531800KtO.onError(str3, i, C2188811AlT.LIZIZ(sbLIZ2));
        return false;
    }
}
