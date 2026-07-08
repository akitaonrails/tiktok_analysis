package X;

import Y.ACListenerS130S0200000_28;
import Y.ARunnableS85S0200000_16;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.tiktok.pns.privacy.setting.agechange.AgeDownReminderInfo;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IAgeGradService;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS65S0310000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.108D, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C108D implements C103R {
    public C989500brA LIZ;
    public final C107V LIZIZ = new InterfaceC1141530foN() { // from class: X.107V
        @Override // X.InterfaceC1141530foN
        public final void mh2(C262100zr c262100zr) {
            if (Intrinsics.LJFF(c262100zr.LIZ, "privacy-settings-refresh")) {
                if (C1207604ny.LIZ()) {
                    C106V.LIZ.getClass();
                    C191880104w.LJFF(C106V.LIZIZ(), "refresh_after_fe_change");
                } else {
                    C106V.LIZ.getClass();
                    C106V.LIZIZ().getClass();
                    C191880104w.LIZIZ("refresh_after_fe_change", null);
                    C106V.LIZIZ().getClass();
                    C191880104w.LIZLLL("refresh_after_fe_change", null, true);
                }
                C106V.LIZ.getClass();
                C106V.LIZIZ().getClass();
                C191871104n.LIZ().getClass();
                C1888960zFu.LIZ();
            }
        }
    };

    @Override // X.C103R
    public final void LIZIZ(C19EG c19eg) {
    }

    @Override // X.C103R
    public final void LIZJ() {
    }

    @Override // X.C103R
    public final void LIZLLL(Context context, ViewModelStoreOwner viewModelStoreOwner) {
    }

    @Override // X.C103R
    public final void LJ(List<? extends AbstractC191843103l> list) {
    }

    @Override // X.C103R
    public final void LJFF() {
    }

    @Override // X.C103R
    public final void LLFF() {
    }

    @Override // X.C103R
    public final void onPagePause() {
    }

    @Override // X.C103R
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.C103R
    public final void LIZ() {
        C1548820qPI.LJIIIIZZ("privacy-settings-refresh", this.LIZIZ);
        C989500brA c989500brA = this.LIZ;
        if (c989500brA != null) {
            C191871104n.LJ().getClass();
            C191862104e.LIZLLL(c989500brA);
        }
        this.LIZ = null;
    }

    public static void LJIIIIZZ(View view) {
        boolean z;
        Context context;
        View viewFindViewById = view.findViewById(R.id.y_2);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.jow);
        View viewFindViewById2 = view.findViewById(R.id.e26);
        C108N.LIZ.getClass();
        C106V.LIZ.getClass();
        C106V.LIZIZ().getClass();
        Integer numLJIIIIZZ = C191880104w.LJIIIIZZ("age_down_reminder", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        boolean z2 = true;
        if (numLJIIIIZZ != null && numLJIIIIZZ.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        C108G.LIZ.getClass();
        boolean z3 = false;
        IAgeGradService iAgeGradService = (IAgeGradService) PluggableExtentionKt.pluggableSpi$default(IAgeGradService.class, false, false, false, 14, null);
        if (iAgeGradService != null && iAgeGradService.LIZIZ("privacy_settings") == 1) {
            z3 = true;
        }
        AnonymousClass1087.LIZ.getClass();
        C191880104w.LIZ.getClass();
        int iLIZ = C105F.LIZ(C191880104w.LJIIL(), "pause_interaction_from", 0);
        if (iLIZ != 2 && iLIZ != 1) {
            z2 = false;
        }
        if (z) {
            AgeDownReminderInfo ageDownReminderInfoLIZ = C108N.LIZ();
            if (ageDownReminderInfoLIZ != null && (context = tuxTextView.getContext()) != null) {
                String strLIZIZ = C108N.LIZIZ(context, ageDownReminderInfoLIZ);
                C444940Hca c444940Hca = new C444940Hca();
                c444940Hca.LIZJ = context.getString(2131857739);
                c444940Hca.LIZLLL(0);
                c444940Hca.LIZIZ = false;
                c444940Hca.LIZIZ(52);
                c444940Hca.LJIIIIZZ = new AwS429S0200000_28(context, ageDownReminderInfoLIZ, 113);
                tuxTextView.setText(new SpannableStringBuilder(strLIZIZ).append((CharSequence) "\n").append(c444940Hca.LIZ(context)));
                tuxTextView.setMovementMethod(C431260Gvc.LIZ);
                C786410Ut5.I7(new ACListenerS130S0200000_28(viewFindViewById, ageDownReminderInfoLIZ, 42), viewFindViewById2);
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
                C108N.LJ(ageDownReminderInfoLIZ);
                return;
            }
            return;
        }
        if (z3) {
            IAgeGradService iAgeGradService2 = (IAgeGradService) PluggableExtentionKt.pluggableSpi$default(IAgeGradService.class, false, false, false, 14, null);
            if (iAgeGradService2 == null) {
                return;
            }
            iAgeGradService2.LIZJ(new AwS65S0310000_28(viewFindViewById, viewFindViewById2, tuxTextView, z2, 0));
            return;
        }
        if (z2) {
            AnonymousClass1087.LIZJ(viewFindViewById, viewFindViewById2, tuxTextView);
        } else {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0brA, X.0brB] */
    @Override // X.C103R
    public final void LJI(final View view) {
        LJIIIIZZ(view);
        ?? r1 = new InterfaceC989510brB<PrivacyUserSettingsV2>() { // from class: X.0brA
            @Override // X.InterfaceC989510brB
            public final void LLZZLLIL(PrivacyUserSettingsV2 privacyUserSettingsV2) {
                View view2 = view;
                HandlerHook.viewPost(view2, new ARunnableS85S0200000_16(view2, this, 36));
            }
        };
        this.LIZ = r1;
        C191871104n.LJ().getClass();
        C191862104e.LIZJ(r1);
    }

    @Override // X.C103R
    public final void LJII(C103L c103l, Bundle bundle, Bundle bundle2) {
        C1163504gr.LIZIZ.onEventV3("show_privacy_settings_page", C2097608Jq.LJ());
        C1548820qPI.LIZLLL("privacy-settings-refresh", this.LIZIZ);
    }
}
