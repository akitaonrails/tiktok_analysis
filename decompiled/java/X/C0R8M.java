package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponent;

/* JADX INFO: renamed from: X.0R8M, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R8M implements InterfaceC20289314aB {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ CellSurveyComponent LIZIZ;

    @Override // X.InterfaceC20289314aB
    public final C1048590dOT LIZ() {
        C1047660dMy c1047660dMy = C1047660dMy.LIZIZ;
        return c1047660dMy.b3(this.LIZ) ? c1047660dMy.i3(this.LIZ) : c1047660dMy.e3(this.LIZ);
    }

    @Override // X.InterfaceC20289314aB
    public final View getRootView() {
        return this.LIZIZ.LJJIJL();
    }

    @Override // X.InterfaceC20289314aB
    public final C0RQC getScene() {
        C1047660dMy c1047660dMy = C1047660dMy.LIZIZ;
        if (c1047660dMy.b3(this.LIZ)) {
            return C0RQC.AD_EXT_LAYER;
        }
        if (c1047660dMy.Z2(this.LIZ)) {
            return C0RQC.ACE_SURVEY;
        }
        Aweme aweme = this.LIZ;
        return (aweme == null || !aweme.isAd()) ? C0RQC.FEED_SURVEY : C0RQC.AD_SURVEY;
    }

    public C0R8M(Aweme aweme, CellSurveyComponent cellSurveyComponent) {
        this.LIZ = aweme;
        this.LIZIZ = cellSurveyComponent;
    }
}
