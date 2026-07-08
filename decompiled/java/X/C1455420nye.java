package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455420nye implements InterfaceC578380MmK {
    public final /* synthetic */ C1455260nyO LIZ;

    @Override // X.InterfaceC578380MmK
    public final boolean C1() {
        C1462070o9N c1462070o9NLLLLLJIL;
        if (!this.LIZ.LLLLLLZ() || (c1462070o9NLLLLLJIL = this.LIZ.LLLLLJIL()) == null || !c1462070o9NLLLLLJIL.C1()) {
            VideoPublishEditModel videoPublishEditModel = this.LIZ.LLLFZ;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            if (!videoPublishEditModel.hasUserAddStickers()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC578380MmK
    public final void LJJLIIIJJIZ() {
        this.LIZ.LLLLLLL(true);
    }

    @Override // X.InterfaceC578380MmK
    public final boolean nu() {
        InterfaceC2180241AUk interfaceC2180241AUkLLZLI = this.LIZ.LLZLI();
        return interfaceC2180241AUkLLZLI != null && interfaceC2180241AUkLLZLI.nu();
    }

    @Override // X.InterfaceC578380MmK
    public final void pu() {
        InterfaceC2180241AUk interfaceC2180241AUkLLZLI = this.LIZ.LLZLI();
        if (interfaceC2180241AUkLLZLI != null) {
            interfaceC2180241AUkLLZLI.jn0(false);
        }
    }

    public C1455420nye(C1455260nyO c1455260nyO) {
        this.LIZ = c1455260nyO;
    }

    @Override // X.InterfaceC578380MmK
    public final void ou(Runnable runnable) {
        C1455260nyO c1455260nyO = this.LIZ;
        c1455260nyO.LLZZJLIL = true;
        c1455260nyO.LLLLLLJ(new Runnable() { // from class: X.0nzq
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("EditRootScene@37d3.editExitHelper$1$nextStepCustom$1");
                C1C7U.LIZIZ("EditRootScene@37d3.editExitHelper$1$nextStepCustom$1");
            }
        }, runnable, c1455260nyO.LLLI, c1455260nyO.LLLII, true);
    }
}
