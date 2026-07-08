package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0cb1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class BinderC1017930cb1 extends C1ASY {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1022120chm LLILLJJLI;

    public BinderC1017930cb1(String str, C1022120chm c1022120chm) {
        this.LL = str;
        this.LLILLJJLI = c1022120chm;
    }

    @Override // X.C1ASX
    public final void LJJJJI(String str, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" callback onError: ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        sbLIZ.append(' ');
        C1022620cia.LJ("AdCIPServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (str == null) {
            return;
        }
        this.LLILLJJLI.LJIJI(str).onNext(new C1017890cax(i, str));
    }

    @Override // X.C1ASX
    public final void LLLZLL(long j, String str, float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" callback onProgressUpdate: ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(f);
        C1022620cia.LIZ("AdCIPServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (str == null) {
            return;
        }
        this.LLILLJJLI.LJIJI(str).onNext(new C1017870cav(j, str, f));
    }

    @Override // X.C1ASX
    public final void O(int i, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" callback onStateChange: ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        C1022620cia.LJ("AdCIPServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (str == null) {
            return;
        }
        C11PQ<AbstractC1017850cat> c11pqLJIJI = this.LLILLJJLI.LJIJI(str);
        EnumC1017980cb6.Companion.getClass();
        c11pqLJIJI.onNext(new C1017880caw(C1018020cbA.LIZ(i), str));
        ((ConcurrentHashMap) this.LLILLJJLI.LJFF).put(str, C1018020cbA.LIZ(i));
    }
}
