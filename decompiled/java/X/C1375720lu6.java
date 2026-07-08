package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375720lu6 extends AbstractC736370SuZ {
    public final SharePackage LLILZ;

    @Override // X.AbstractC1376810lvr
    public final void LIZIZ(View view) {
        C1376170lup c1376170lupLJIJ;
        Aweme aweme;
        InterfaceC1370310llN interfaceC1370310llNLJIIJ;
        C1379220lzk.LIZ = "long_press_download";
        C1379220lzk.LIZIZ = this.LLILLL;
        Aweme aweme2 = this.LLILLJJLI;
        if (aweme2 != null && aweme2.getAwemeType() == 150) {
            Activity activityLJII = C1375500ltk.LJII(view.getContext());
            if (activityLJII != null && (aweme = this.LLILLJJLI) != null && (interfaceC1370310llNLJIIJ = C1375730lu7.LIZIZ.LJIIJ(activityLJII, aweme, this.LLILLL, "long_press_download", "long_press_download", this.LLILZ.extras.getString("from_page"), this.LLILZ.extras.getString("explore_from_group_id"), Integer.valueOf(this.LLILZ.extras.getInt("is_enter_graphic_detail")))) != null) {
                interfaceC1370310llNLJIIJ.LJJLIIIJILLIZJL(view.getContext(), this.LLILZ);
                return;
            }
            return;
        }
        Activity activityLJII2 = C1375500ltk.LJII(view.getContext());
        if (activityLJII2 == null || (c1376170lupLJIJ = C621180OYa.LIZIZ.LJIJ(activityLJII2, this.LLILLJJLI, this.LLILLL, "long_press_download", "long_press_download")) == null) {
            return;
        }
        C1370320llO.LIZLLL(view.getContext(), this.LLILZ, c1376170lupLJIJ);
    }

    @Override // X.AbstractC1376810lvr
    public final void LJII(View view) {
        Boolean boolValueOf;
        Activity activityLJII = C1375500ltk.LJII(view.getContext());
        if (activityLJII != null) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_from", "download", bundle);
            IShareWarningInfoService iShareWarningInfoServiceLJJIFFI = ComplianceServiceProvider.LJJIFFI();
            if (iShareWarningInfoServiceLJJIFFI != null) {
                boolValueOf = Boolean.valueOf(iShareWarningInfoServiceLJJIFFI.LIZIZ(activityLJII, this.LLILLJJLI, bundle, new AwS422S0200000_21(this, view, 73)));
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                return;
            }
        }
        super.LJII(view);
    }

    public C1375720lu6(C1379170lzf c1379170lzf, InterfaceC1374230lrh interfaceC1374230lrh) {
        super(c1379170lzf, interfaceC1374230lrh);
        this.LLILZ = c1379170lzf.LLJILJILJ;
    }
}
