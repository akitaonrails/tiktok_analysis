package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponent;

/* JADX INFO: renamed from: X.14aA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20289214aA implements InterfaceC1049140dPM {
    public final /* synthetic */ CellSurveyComponent LIZ;

    @Override // X.InterfaceC1049140dPM
    public final View LIZ() {
        IVideoCellAbility iVideoCellAbilityLp = this.LIZ.lp();
        if (iVideoCellAbilityLp != null) {
            return iVideoCellAbilityLp.by1();
        }
        return null;
    }

    public C20289214aA(CellSurveyComponent cellSurveyComponent) {
        this.LIZ = cellSurveyComponent;
    }
}
