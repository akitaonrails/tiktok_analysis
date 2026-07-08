package X;

import Y.ACListenerS81S1100000_9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.workbench.ability.WorkbenchCardAbility;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionBottomStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionButtonStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionTextStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionUIStruct;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Ovo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635220Ovo extends AbstractViewOnClickListenerC635100Ovc {
    public TuxTextView LLILZIL;
    public TuxIconView LLILZLL;
    public C197039127h LLIZ;
    public ConstraintLayout LLIZLLLIL;

    @Override // X.AbstractViewOnClickListenerC635100Ovc
    public String getClickEnterMethod() {
        return "bottom";
    }

    public final C197039127h getWorkbenchCardBottomCtaButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_bottom_cta_button);
            this.LLIZ = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final TuxIconView getWorkbenchCardBottomCtaNextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_bottom_cta_next);
            this.LLILZLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final ConstraintLayout getWorkbenchCardBottomRootFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_bottom_root);
            this.LLIZLLLIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxTextView getWorkbenchCardBottomTimeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_bottom_time);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.AbstractViewOnClickListenerC635100Ovc
    public String getSchemaUrl() {
        MissionUIStruct missionUIStruct;
        MissionBottomStruct missionBottomStruct;
        MissionStruct mission = getMission();
        if (mission == null || (missionUIStruct = mission.uiStruct) == null || (missionBottomStruct = missionUIStruct.bottom) == null) {
            return null;
        }
        return missionBottomStruct.schemaUrl;
    }

    public static boolean h0(MissionStruct missionStruct) {
        MissionBottomStruct missionBottomStruct;
        MissionTextStruct missionTextStruct;
        String str;
        MissionUIStruct missionUIStruct;
        MissionBottomStruct missionBottomStruct2;
        MissionButtonStruct missionButtonStruct;
        MissionUIStruct missionUIStruct2 = missionStruct.uiStruct;
        if (missionUIStruct2 != null && (missionBottomStruct = missionUIStruct2.bottom) != null && (missionTextStruct = missionBottomStruct.leftText) != null && (str = missionTextStruct.text) != null && a0.LJJJIL(str) && (missionUIStruct = missionStruct.uiStruct) != null && (missionBottomStruct2 = missionUIStruct.bottom) != null && (missionButtonStruct = missionBottomStruct2.rightButton) != null && missionButtonStruct.buttonType == EnumC114100bz.BUTTON_CTA.getValue()) {
            return true;
        }
        return false;
    }

    private final void setPadding(MissionStruct missionStruct) {
        if (h0(missionStruct)) {
            ConstraintLayout workbenchCardBottomRootFromXml = getWorkbenchCardBottomRootFromXml();
            if (workbenchCardBottomRootFromXml != null) {
                workbenchCardBottomRootFromXml.setPadding(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                return;
            }
            return;
        }
        ConstraintLayout workbenchCardBottomRootFromXml2 = getWorkbenchCardBottomRootFromXml();
        if (workbenchCardBottomRootFromXml2 == null) {
            return;
        }
        workbenchCardBottomRootFromXml2.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
    }

    public final void setWorkbenchCardBottomCtaButtonFromXml(C197039127h c197039127h) {
        this.LLIZ = c197039127h;
    }

    public final void setWorkbenchCardBottomCtaNextFromXml(TuxIconView tuxIconView) {
        this.LLILZLL = tuxIconView;
    }

    public final void setWorkbenchCardBottomRootFromXml(ConstraintLayout constraintLayout) {
        this.LLIZLLLIL = constraintLayout;
    }

    public final void setWorkbenchCardBottomTimeFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public C635220Ovo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C635220Ovo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aa1, this, true);
        C0OSB.LIZLLL(this, 0, 0, 8, 8);
    }

    @Override // X.AbstractViewOnClickListenerC635100Ovc
    public final void e0(MissionStruct missionStruct, WorkBenchViewModel workBenchViewModel, WorkbenchCardAbility workbenchCardAbility) {
        MissionBottomStruct missionBottomStruct;
        MissionBottomStruct missionBottomStruct2;
        MissionButtonStruct missionButtonStruct;
        super.e0(missionStruct, workBenchViewModel, workbenchCardAbility);
        MissionUIStruct missionUIStruct = missionStruct.uiStruct;
        if (missionUIStruct != null && (missionBottomStruct = missionUIStruct.bottom) != null) {
            C635240Ovq.LIZ(getWorkbenchCardBottomTimeFromXml(), missionBottomStruct.leftText);
            MissionUIStruct missionUIStruct2 = missionStruct.uiStruct;
            if (missionUIStruct2 != null && (missionBottomStruct2 = missionUIStruct2.bottom) != null && (missionButtonStruct = missionBottomStruct2.rightButton) != null) {
                int i = missionButtonStruct.buttonType;
                if (i == EnumC114100bz.BUTTON_ARROW.getValue()) {
                    TuxIconView workbenchCardBottomCtaNextFromXml = getWorkbenchCardBottomCtaNextFromXml();
                    if (workbenchCardBottomCtaNextFromXml != null) {
                        C12ES.LJIILL(0, workbenchCardBottomCtaNextFromXml);
                    }
                    C197039127h workbenchCardBottomCtaButtonFromXml = getWorkbenchCardBottomCtaButtonFromXml();
                    if (workbenchCardBottomCtaButtonFromXml != null) {
                        C0DTR.LIZIZ(workbenchCardBottomCtaButtonFromXml);
                    }
                } else if (i == EnumC114100bz.BUTTON_CTA.getValue()) {
                    TuxIconView workbenchCardBottomCtaNextFromXml2 = getWorkbenchCardBottomCtaNextFromXml();
                    if (workbenchCardBottomCtaNextFromXml2 != null) {
                        C0DTR.LIZIZ(workbenchCardBottomCtaNextFromXml2);
                    }
                    C197039127h workbenchCardBottomCtaButtonFromXml2 = getWorkbenchCardBottomCtaButtonFromXml();
                    if (workbenchCardBottomCtaButtonFromXml2 != null) {
                        C635240Ovq.LIZ(workbenchCardBottomCtaButtonFromXml2, missionButtonStruct.text);
                        C12ES.LJIILL(0, workbenchCardBottomCtaButtonFromXml2);
                        String schemaUrl = missionButtonStruct.schemaUrl;
                        if (a0.LJJJIL(schemaUrl) && (schemaUrl = getSchemaUrl()) == null) {
                            schemaUrl = "";
                        }
                        C786410Ut5.U8(workbenchCardBottomCtaButtonFromXml2, new ACListenerS81S1100000_9(this, schemaUrl, 0));
                    }
                }
            }
            setPadding(missionStruct);
        }
    }
}
