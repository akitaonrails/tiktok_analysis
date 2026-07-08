package X;

import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.top.BottomNoticeViewModel;
import com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06hk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1678606hk extends FrameLayout implements InterfaceC1632106aF, GenericLifecycleObserver {
    public final /* synthetic */ C1631706aB LL;
    public boolean LLILLJJLI;
    public final C01GW LLILLL;
    public String LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public SessionInfo LLJI;

    @Override // X.InterfaceC1632106aF
    public final void LJIILIIL() {
        this.LL.LJIILIIL();
    }

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    private final TuxTextView getBodyTv() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    private final View getCloseButton() {
        return (View) this.LLJ.getValue();
    }

    private final TuxTextView getDestructiveButton() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    private final TuxTextView getMarkSafeButton() {
        return (TuxTextView) this.LLIZLLLIL.getValue();
    }

    private final TuxTextView getTitleTv() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    public final BottomNoticeViewModel getViewModel() {
        return (BottomNoticeViewModel) this.LLILLL.getValue();
    }

    public C1678606hk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C1631706aB();
        this.LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(context, 10));
        this.LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 9));
        this.LLILZLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 5));
        this.LLIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 7));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 8));
        this.LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 6));
    }

    public static void LIZ(C1678606hk c1678606hk, int i) {
        boolean z;
        boolean z2;
        SessionInfo sessionInfo;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c1678606hk.getVisibility() != 8) {
            if (z) {
                c1678606hk.getViewModel().wQ2(1);
            }
            c1678606hk.LL.LIZ(c1678606hk);
            if (z2 && (sessionInfo = c1678606hk.LLJI) != null) {
                sessionInfo.setShowSafeConversationAfterKeyboardDismiss(false);
            }
        }
    }

    public final void LIZIZ(SessionInfo sessionInfo, String str, String str2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C909290Zln c909290Zln;
        BottomNoticeViewModel viewModel = getViewModel();
        viewModel.LLILLJJLI = sessionInfo;
        viewModel.LLILLL = str;
        this.LLILZ = str;
        IMUser fromUser = null;
        if (this.LLILLJJLI) {
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            LJIILIIL();
        } else {
            this.LLILLJJLI = true;
            C786410Ut5.LJLLJ(getContext(), R.layout.csf, this);
            View viewFindViewById = findViewById(R.id.ftc);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            View viewFindViewById2 = findViewById(R.id.fsx);
            if (viewFindViewById2 != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C0I73.LIZ);
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
                viewFindViewById2.setBackground(c384050F3z.LIZ(getContext()));
                viewFindViewById2.setPadding(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    C426750GoL.LJIIJ(marginLayoutParams, viewFindViewById2.getContext(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 32);
                    C786410Ut5.W5(viewFindViewById2, marginLayoutParams);
                }
            }
            C786410Ut5.h9(getDestructiveButton(), new ACListenerS137S0100000_2(this, 1));
            C786410Ut5.h9(getMarkSafeButton(), new ACListenerS137S0100000_2(this, 2));
            C786410Ut5.I7(new ACListenerS137S0100000_2(this, 3), getCloseButton());
            if (getViewModel().LLILLJJLI instanceof C913140Zs0) {
                getTitleTv().setText(2131832035);
                getBodyTv().setText(2131832034);
            } else {
                if (Intrinsics.LJFF(str, "safe_conversation_block_notice")) {
                    getTitleTv().setText(2131831718);
                    getBodyTv().setText(2131831620);
                    TuxTextView destructiveButton = getDestructiveButton();
                    destructiveButton.setText(R.string.eh0);
                    C786410Ut5.h9(destructiveButton, new ACListenerS137S0100000_2(this, 0));
                    if (((Boolean) C258430AAv.LIZIZ.getValue()).booleanValue()) {
                        getMarkSafeButton().setText(2131831719);
                    }
                }
                if (((Boolean) C258430AAv.LIZIZ.getValue()).booleanValue() && C1697810uHb.LJIIJJI("high_risk_predator_report_notice", "high_risk_report_notice", "predator_report_notice").contains(str)) {
                    getTitleTv().setText(2131831718);
                    getBodyTv().setText(getContext().getString(2131831717));
                    getMarkSafeButton().setText(2131831719);
                }
            }
            BottomNoticeViewModel viewModel2 = getViewModel();
            viewModel2.vQ2(1, viewModel2.LLILLL, false);
            int visibility2 = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, this);
            LJIILIIL();
        }
        IImDmProminenceAnalytics.LIZ.getClass();
        IImDmProminenceAnalytics iImDmProminenceAnalyticsLIZ = C1673406gu.LIZ();
        if (iImDmProminenceAnalyticsLIZ != null) {
            boolean z = getViewModel().LLILLJJLI instanceof C913140Zs0;
            String strLIZ = C1677606ha.LIZ(sessionInfo.getChatType());
            boolean zLJFF = Intrinsics.LJFF(str, "safe_conversation_block_notice");
            if ((sessionInfo instanceof C909290Zln) && (c909290Zln = (C909290Zln) sessionInfo) != null) {
                fromUser = c909290Zln.getFromUser();
            }
            iImDmProminenceAnalyticsLIZ.LJII(C0I0B.LJFF.LIZIZ(), z, str, str2, strLIZ, zLJFF, fromUser);
        }
        this.LLJI = sessionInfo;
    }
}
