package X;

import Y.ACListenerS144S0100000_9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.inbox.workbench.ability.WorkbenchCardAbility;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionTopStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionUIStruct;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Ovb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635090Ovb extends AbstractViewOnClickListenerC635100Ovc {
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxIconView LLIZLLLIL;

    @Override // X.AbstractViewOnClickListenerC635100Ovc
    public String getClickEnterMethod() {
        return "title";
    }

    public final TuxIconView getWorkbenchCardTopIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_top_icon);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getWorkbenchCardTopMoreFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_top_more);
            this.LLIZLLLIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getWorkbenchCardTopTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_top_title);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getWorkbenchCardTopUnsubscribeLabelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_top_unsubscribe_label);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.AbstractViewOnClickListenerC635100Ovc
    public String getSchemaUrl() {
        MissionUIStruct missionUIStruct;
        MissionTopStruct missionTopStruct;
        MissionStruct mission = getMission();
        if (mission == null || (missionUIStruct = mission.uiStruct) == null || (missionTopStruct = missionUIStruct.top) == null) {
            return null;
        }
        return missionTopStruct.schemaUrl;
    }

    public final void setWorkbenchCardTopIconFromXml(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setWorkbenchCardTopMoreFromXml(TuxIconView tuxIconView) {
        this.LLIZLLLIL = tuxIconView;
    }

    public final void setWorkbenchCardTopTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setWorkbenchCardTopUnsubscribeLabelFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public C635090Ovb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C635090Ovb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aa6, this, true);
        C0OSB.LIZLLL(this, 8, 8, 0, 0);
    }

    @Override // X.AbstractViewOnClickListenerC635100Ovc
    public final void e0(MissionStruct missionStruct, WorkBenchViewModel workBenchViewModel, WorkbenchCardAbility workbenchCardAbility) {
        MissionTopStruct missionTopStruct;
        ImageUrlModel imageUrlModelLIZIZ;
        super.e0(missionStruct, workBenchViewModel, workbenchCardAbility);
        MissionUIStruct missionUIStruct = missionStruct.uiStruct;
        if (missionUIStruct != null && (missionTopStruct = missionUIStruct.top) != null) {
            TuxIconView workbenchCardTopIconFromXml = getWorkbenchCardTopIconFromXml();
            TuxImageModel tuxImageModel = missionTopStruct.iconModel;
            if (tuxImageModel != null) {
                imageUrlModelLIZIZ = C0OSD.LIZIZ(getContext(), tuxImageModel);
            } else {
                imageUrlModelLIZIZ = null;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZIZ);
            c1331670kl3LJIIIIZZ.LJJI(workbenchCardTopIconFromXml);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            C635240Ovq.LIZ(getWorkbenchCardTopTitleFromXml(), missionTopStruct.title);
            if (missionStruct.unsubscribeStatus == EnumC635130Ovf.SUBSCRIBE.getValue()) {
                C12ES.LJIILL(0, getWorkbenchCardTopUnsubscribeLabelFromXml());
            } else {
                C0DTR.LIZIZ(getWorkbenchCardTopUnsubscribeLabelFromXml());
            }
            List<MissionSetting> list = WorkBenchViewModel.LLIZLLLIL;
            if (list != null && !list.isEmpty()) {
                C12ES.LJIILL(0, getWorkbenchCardTopMoreFromXml());
                C0OSB.LIZJ(getWorkbenchCardTopMoreFromXml(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
                C786410Ut5.a9(getWorkbenchCardTopMoreFromXml(), new ACListenerS144S0100000_9(this, 96));
                return;
            }
            C0DTR.LIZIZ(getWorkbenchCardTopMoreFromXml());
        }
    }
}
