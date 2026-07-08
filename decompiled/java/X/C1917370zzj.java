package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("inbox_guide_user_out_push")
public final class C1917370zzj extends AbstractC20659615so<TuxSheet> {
    public final C19EG LL;
    public final C10CQ LLILLJJLI;
    public final InterfaceC1917380zzk LLILLL;
    public final InterfaceC1917330zzf LLILZ;
    public final int LLILZIL = 500;

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void LIZIZ() {
        this.LLILLJJLI.onShow();
        InterfaceC1917330zzf interfaceC1917330zzf = this.LLILZ;
        if (interfaceC1917330zzf != null) {
            interfaceC1917330zzf.LIZIZ();
        }
        if (Intrinsics.LJFF(this.LLILLJJLI.getParam().LIZ, "customized_ui_edm")) {
            C1917240zzW c1917240zzW = C1917240zzW.LIZ;
            C19EG c19eg = this.LL;
            c1917240zzW.getClass();
            C1917240zzW.LIZIZ(c19eg);
            return;
        }
        C1917240zzW c1917240zzW2 = C1917240zzW.LIZ;
        C19EG c19eg2 = this.LL;
        c1917240zzW2.getClass();
        C1917240zzW.LIZLLL(c19eg2);
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        C10CQ c10cq = this.LLILLJJLI;
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = c10cq;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC19333210kM(this, 21);
        tuxSheet.LL = new DialogInterfaceOnCancelListenerC19332810kI(this, 11);
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        return tuxSheet2;
    }

    @Override // X.AbstractC20656215sG
    public final void showPopupFailed(int i, String str) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPopupFailed! errCode = ");
        sbLIZ.append(i);
        sbLIZ.append(", errMsg = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1917330zzf interfaceC1917330zzf = this.LLILZ;
        if (interfaceC1917330zzf != null) {
            interfaceC1917330zzf.LIZ("popup_manager_filtered");
        }
    }

    public C1917370zzj(C19EG c19eg, C10CQ c10cq, InterfaceC1917380zzk interfaceC1917380zzk, InterfaceC1917330zzf interfaceC1917330zzf) {
        this.LL = c19eg;
        this.LLILLJJLI = c10cq;
        this.LLILLL = interfaceC1917380zzk;
        this.LLILZ = interfaceC1917330zzf;
    }
}
