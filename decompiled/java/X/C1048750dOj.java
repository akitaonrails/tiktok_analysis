package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import com.ss.android.ugc.aweme.ad.feed.adexperience.event.AdExperienceEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0dOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1048750dOj implements C0SCN {
    public final InterfaceC988720bpu LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public Context LLILZLL;
    public Aweme LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public SmartImageView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public C1203270hPx LLJILLL;
    public TuxTextView LLJJ;
    public C197039127h LLJJI;
    public AdFollowUpAceSurveyVM LLJJIII;
    public C20286814Zm LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public LifecycleOwner LLJJIJIL;
    public final AdExperienceEventLogger LLJJJ = new AdExperienceEventLogger();
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(83));
    public AnonymousClass0956 LLJJJJ;
    public boolean LLJJJJJIL;

    @Override // X.InterfaceC690490R6p
    public final void LIZ() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC690000R4s
    public final void LJ(Aweme aweme, boolean z) {
    }

    @Override // X.InterfaceC20289914aH
    public final void LJFF() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LJJLJLI() {
    }

    @Override // X.InterfaceC20289914aH
    public final boolean So() {
        return true;
    }

    @Override // X.InterfaceC690490R6p
    public final void g2() {
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LIZJ() {
        View view = this.LLIZLLLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LLILZ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LLILZIL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LLJI;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
            C786410Ut5.T4(view5, 1.0f);
        }
    }

    @Override // X.InterfaceC690490R6p
    public final void LJI() {
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLILZIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
    }

    @Override // X.InterfaceC690490R6p
    public final boolean isShowing() {
        View view = this.LLIZLLLIL;
        return view != null && view.getVisibility() == 0;
    }

    @Override // X.C0SCN
    public final boolean nE2() {
        C20286814Zm c20286814Zm = this.LLJJIJI;
        if (c20286814Zm != null) {
            return c20286814Zm.LJJIFFI;
        }
        return false;
    }

    @Override // X.InterfaceC690000R4s
    public final void LJIILIIL() {
        if (isShowing()) {
            AdFollowUpAceSurveyVM adFollowUpAceSurveyVM = this.LLJJIII;
            if (adFollowUpAceSurveyVM == null) {
                adFollowUpAceSurveyVM = null;
            }
            adFollowUpAceSurveyVM.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(adFollowUpAceSurveyVM), null, null, new C1048670dOb(adFollowUpAceSurveyVM, true, null), 3);
            if (!this.LLJJJJJIL) {
                AdExperienceEventLogger adExperienceEventLogger = this.LLJJJ;
                C1048520dOM.LIZ.getClass();
                adExperienceEventLogger.logAd(C1048520dOM.LIZLLL);
            }
            this.LLJJJJJIL = false;
        }
    }

    @Override // X.InterfaceC20289914aH
    public final void LJIIIZ() {
        LJIILIIL();
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC988720bpu Mh() {
        return this.LL;
    }

    public C1048750dOj(InterfaceC988720bpu interfaceC988720bpu) {
        this.LL = interfaceC988720bpu;
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIL(C1049060dPE c1049060dPE) {
        C1049070dPF.LIZ(this, c1049060dPE);
    }

    @C14EU
    public final void onEvent$commercialize_feed_impl_release(C484220Iyq c484220Iyq) {
        LifecycleCoroutineScope lifecycleScope;
        if (c484220Iyq == null) {
            return;
        }
        try {
            LifecycleOwner lifecycleOwner = this.LLJJIJIL;
            AnonymousClass0956 anonymousClass0956LIZLLL = null;
            if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, null, null, new C1048740dOi(c484220Iyq, this, null), 3);
            }
            C189200o6.m2constructorimpl(anonymousClass0956LIZLLL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC690000R4s
    public final void LJIIJJI(EnumC20283814Yi enumC20283814Yi, Aweme aweme, boolean z) {
        AdExperienceEventLogger adExperienceEventLogger = this.LLJJJ;
        C1048520dOM.LIZ.getClass();
        adExperienceEventLogger.logAd(C1048520dOM.LJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025e A[PHI: r11
      0x025e: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v8 java.lang.String) binds: [B:135:0x025a, B:86:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0263 A[PHI: r11 r12
      0x0263: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v7 java.lang.String) binds: [B:138:0x025f, B:89:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v4 java.lang.String) binds: [B:138:0x025f, B:89:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dd  */
    @Override // X.InterfaceC690490R6p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(android.view.ViewStub r20, android.content.Context r21, com.ss.android.ugc.aweme.feed.model.Aweme r22, android.view.View r23, android.view.View r24, android.view.View r25, android.view.View r26, boolean r27, X.AbstractC19368810q6 r28) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1048750dOj.LJIIJ(android.view.ViewStub, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View, android.view.View, android.view.View, android.view.View, boolean, X.10q6):void");
    }
}
