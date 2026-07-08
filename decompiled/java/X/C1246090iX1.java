package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget;
import com.ss.android.ugc.profile.business.profile.popup.MyProfileGuideWidgetV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iX1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1246090iX1 extends C2217421BqW implements Function0<Unit> {
    public C1246090iX1(Object obj) {
        super(0, obj, MyProfileGuideWidgetV2.class, "showViewerPopup", "showViewerPopup()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BaseMyProfileGuideWidget baseMyProfileGuideWidget = (BaseMyProfileGuideWidget) this.receiver;
        baseMyProfileGuideWidget.getClass();
        ComplianceServiceProvider.LJIJJ().LIZLLL(baseMyProfileGuideWidget.LLJIJIL.requireActivity());
        return Unit.LIZ;
    }
}
