package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17xe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21199217xe implements InterfaceC21200817xu {
    public boolean LIZ;
    public final /* synthetic */ C21200317xp LIZIZ;
    public final /* synthetic */ C21199517xh LIZJ;

    @Override // X.InterfaceC21200817xu
    public final void LIZ() {
        this.LIZJ.LJJJLZIJ(EnumC21193117wf.LYNX_CARD_LOAD_START, null);
    }

    public final void LIZJ() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        C599810Nfn c599810Nfn = C599810Nfn.LIZ;
        String message = EnumC1782950wUv.LOAD_INTERRUPT.getMessage();
        c599810Nfn.getClass();
        C599810Nfn.LIZ("geckoLoadListener", message);
        this.LIZJ.LJJJLZIJ(EnumC21193117wf.FAIL_LYNX_CANCEL, null);
    }

    public C21199217xe(C21200317xp c21200317xp, C21199517xh c21199517xh) {
        this.LIZIZ = c21200317xp;
        this.LIZJ = c21199517xh;
    }

    @Override // X.InterfaceC21200817xu
    public final void LIZIZ(boolean z, String str, C1783920wWU c1783920wWU, InterfaceC21200617xs interfaceC21200617xs) {
        C1776350wKH c1776350wKH;
        if (this.LIZ) {
            this.LIZIZ.LIZJ(interfaceC21200617xs);
            return;
        }
        this.LIZJ.LLLLL = null;
        C599810Nfn c599810Nfn = C599810Nfn.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load result, success: ");
        sbLIZ.append(z);
        sbLIZ.append(", message: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599810Nfn.getClass();
        C599810Nfn.LIZ("geckoLoadListener", strLIZIZ);
        if (!z) {
            this.LIZJ.LJJJLZIJ(EnumC21193117wf.FAIL_LYNX_LOAD_FAIL, str);
            return;
        }
        if (interfaceC21200617xs == null) {
            this.LIZJ.LJJJLZIJ(EnumC21193117wf.FAIL_LYNX_EXCEPTION, "card is null");
            return;
        }
        C21200317xp c21200317xp = this.LIZIZ;
        if (c1783920wWU == null) {
            c1776350wKH = null;
        } else {
            c21200317xp.getClass();
            c1776350wKH = new C1776350wKH(c1783920wWU.LIZ);
        }
        c21200317xp.LIZLLL = c1776350wKH;
        if (c1776350wKH != null) {
            c21200317xp.LIZJ.put(c1776350wKH, interfaceC21200617xs);
        }
        if (Intrinsics.LJFF(str, "sea_live_lynx_reuse_card")) {
            this.LIZJ.LJJJLZIJ(EnumC21193117wf.LYNX_CARD_REUSE, null);
        } else {
            this.LIZJ.LJJJLZIJ(EnumC21193117wf.LYNX_CARD_LOADED, null);
        }
        this.LIZJ.LJJLIIIIJ();
    }
}
