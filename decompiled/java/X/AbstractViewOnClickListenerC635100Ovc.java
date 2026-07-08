package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.inbox.workbench.ability.WorkbenchCardAbility;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionStruct;
import mf.a;

/* JADX INFO: renamed from: X.0Ovc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractViewOnClickListenerC635100Ovc extends ConstraintLayout implements View.OnClickListener {
    public WorkBenchViewModel LL;
    public int LLILLJJLI;
    public MissionStruct LLILLL;
    public WorkbenchCardAbility LLILZ;

    public abstract String getClickEnterMethod();

    public abstract String getSchemaUrl();

    public final WorkbenchCardAbility getAbility() {
        return this.LLILZ;
    }

    public final WorkBenchViewModel getMainVm() {
        return this.LL;
    }

    public final MissionStruct getMission() {
        return this.LLILLL;
    }

    public final int getTabId() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activityLIZ;
        if (C0OBG.LIZIZ(view) || (activityLIZ = C1388190mED.LIZ(getContext())) == null) {
            return;
        }
        SmartRouter.buildRoute(activityLIZ, getSchemaUrl()).open();
        WorkbenchCardAbility workbenchCardAbility = this.LLILZ;
        if (workbenchCardAbility != null) {
            String schemaUrl = getSchemaUrl();
            if (schemaUrl == null) {
                schemaUrl = "";
            }
            workbenchCardAbility.cQ2(schemaUrl, getClickEnterMethod());
        }
    }

    public final void setAbility(WorkbenchCardAbility workbenchCardAbility) {
        this.LLILZ = workbenchCardAbility;
    }

    public final void setMainVm(WorkBenchViewModel workBenchViewModel) {
        this.LL = workBenchViewModel;
    }

    public final void setMission(MissionStruct missionStruct) {
        this.LLILLL = missionStruct;
    }

    public final void setTabId(int i) {
        this.LLILLJJLI = i;
    }

    public AbstractViewOnClickListenerC635100Ovc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void e0(MissionStruct missionStruct, WorkBenchViewModel workBenchViewModel, WorkbenchCardAbility workbenchCardAbility) {
        View.OnClickListener fVar;
        this.LLILLL = missionStruct;
        this.LL = workBenchViewModel;
        this.LLILZ = workbenchCardAbility;
        if (C1848410yCV.LIZ) {
            fVar = new f(this);
        } else {
            fVar = this;
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }
}
