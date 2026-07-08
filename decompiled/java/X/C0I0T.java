package X;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.dialog.PcsServiceBioDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I0T, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I0T extends C09AY implements Function2<C0I0L, Integer, Unit> {
    public final /* synthetic */ PcsServiceBioDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I0T(PcsServiceBioDialog pcsServiceBioDialog) {
        super(2);
        this.LL = pcsServiceBioDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C0I0L c0i0l, Integer num) {
        LiveSheetFragment liveSheetFragment;
        LinearLayout linearLayoutVd2;
        View childAt;
        C20246014Ju c20246014Ju;
        C0I0L c0i0l2 = c0i0l;
        int iIntValue = num.intValue();
        PcsServiceBioDialog pcsServiceBioDialog = this.LL;
        if (!Intrinsics.LJFF(pcsServiceBioDialog.LLLIIII, c0i0l2) && (linearLayoutVd2 = pcsServiceBioDialog.vd2()) != null && (childAt = linearLayoutVd2.getChildAt(0)) != null) {
            if (((pcsServiceBioDialog.LLLIIII instanceof C0I0O) && Intrinsics.LJFF(c0i0l2, C0I0M.LIZ)) || (Intrinsics.LJFF(pcsServiceBioDialog.LLLIIII, C0I0M.LIZ) && (c0i0l2 instanceof C0I0O))) {
                pcsServiceBioDialog.LLLIIII = c0i0l2;
                LinearLayout linearLayoutVd22 = pcsServiceBioDialog.vd2();
                if (linearLayoutVd22 != null && (c20246014Ju = pcsServiceBioDialog.LLLII) != null) {
                    pcsServiceBioDialog.yS(linearLayoutVd22, c20246014Ju);
                }
            } else {
                pcsServiceBioDialog.LLLIIII = c0i0l2;
            }
            if (!Intrinsics.LJFF(pcsServiceBioDialog.LLLIIII, C0I0M.LIZ)) {
                View view = pcsServiceBioDialog.LLLFFI;
                if (view != null) {
                    C500260Jjc.LLFFF(view);
                }
                C500260Jjc.LJIILIIL(childAt);
            } else {
                View view2 = pcsServiceBioDialog.LLLFFI;
                if (view2 != null) {
                    C500260Jjc.LJIILIIL(view2);
                }
                C500260Jjc.LLFFF(childAt);
            }
        }
        C1822680xX0 c1822680xX0 = this.LL.wS().LLILZ;
        if (c1822680xX0 != null && (liveSheetFragment = c1822680xX0.LIZ) != null) {
            liveSheetFragment.OR(iIntValue, 0, false);
        }
        return Unit.LIZ;
    }
}
