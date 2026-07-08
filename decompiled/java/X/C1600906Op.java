package X;

import Y.ACListenerS137S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06Op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1600906Op extends FrameLayout implements InterfaceC1632106aF {
    public final /* synthetic */ C1631706aB LL;
    public final Activity LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public SessionInfo LLILZLL;
    public IMUser LLIZ;
    public InterfaceC1600806Oo LLIZLLLIL;
    public boolean LLJ;

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

    private final TuxTextView getContentTv() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final TuxTextView getDeleteBtn() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    private final TuxTextView getUnblockBtn() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    public final void LIZ() {
        Object c098200Yq;
        if (getVisibility() == 8) {
            if (!this.LLJ) {
                TuxTextView contentTv = getContentTv();
                if (contentTv != null) {
                    try {
                        C1601006Oq c1601006Oq = C1601006Oq.LIZ;
                        Activity activity = this.LLILLJJLI;
                        IMUser iMUser = this.LLIZ;
                        SessionInfo sessionInfo = this.LLILZLL;
                        c1601006Oq.getClass();
                        c098200Yq = C1601006Oq.LIZ(activity, iMUser, sessionInfo);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    CharSequence charSequence = (CharSequence) c098200Yq;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    contentTv.setText(charSequence);
                    C1697806kq.LIZ(contentTv);
                }
                TuxTextView deleteBtn = getDeleteBtn();
                if (deleteBtn != null) {
                    C786410Ut5.h9(deleteBtn, new ACListenerS137S0100000_2(this, 62));
                }
                TuxTextView unblockBtn = getUnblockBtn();
                if (unblockBtn != null) {
                    C786410Ut5.h9(unblockBtn, new ACListenerS137S0100000_2(this, 63));
                }
                this.LLJ = true;
            }
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            LJIILIIL();
            IImImproveBlockExperienceAnalytics.LIZ.getClass();
            IImImproveBlockExperienceAnalytics iImImproveBlockExperienceAnalyticsLIZ = C2202101BGm.LIZ();
            if (iImImproveBlockExperienceAnalyticsLIZ != null) {
                iImImproveBlockExperienceAnalyticsLIZ.LIZ(C0I0B.LJFF.LIZIZ());
            }
        }
    }

    public C1600906Op(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C1631706aB();
        Activity activityLIZ = C06MM.LIZ(context);
        if (activityLIZ != null) {
            this.LLILLJJLI = activityLIZ;
            this.LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 992));
            this.LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 993));
            this.LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 996));
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
