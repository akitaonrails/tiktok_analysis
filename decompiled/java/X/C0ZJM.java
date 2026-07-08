package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS101S0110000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZJM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZJM implements C0ZJT {
    public final Function0<Keva> LIZ;
    public final C1231704rr LIZIZ;
    public final MutableLiveData<Boolean> LIZJ;
    public final PrivacySettingsFeature LIZLLL;
    public final C11PQ<Unit> LJ;

    @Override // X.C0ZJT
    public final boolean LIZ() {
        return C0ZH6.LIZIZ(this.LIZLLL);
    }

    @Override // X.C0ZJT
    public final void LIZJ() {
        this.LIZ.invoke().storeBoolean("has_permission_sheet_shown", true);
    }

    @Override // X.C0ZJT
    public final EnumC1643306c3 LJFF() {
        return C0ZH6.LIZ(this.LIZLLL);
    }

    @Override // X.C0ZJT
    public final boolean LJI() {
        return C0ZH6.LIZJ(this.LIZLLL);
    }

    @Override // X.C0ZJT
    public final void LJII() {
        PrivacySettingsFeature privacySettingsFeature = this.LIZLLL;
        if (privacySettingsFeature != null) {
            privacySettingsFeature.LJJII(C0ZJN.LIZ());
        }
    }

    @Override // X.C0ZJT
    public final boolean LJIIIIZZ() {
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJJ;
        PrivacySettingsFeature privacySettingsFeature = this.LIZLLL;
        return (privacySettingsFeature == null || (privacySettingsRestrictionItemLJJ = privacySettingsFeature.LJJ(0, "activity_status_v2")) == null || privacySettingsRestrictionItemLJJ.showType != 0) ? false : true;
    }

    @Override // X.C0ZJT
    public final MutableLiveData LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.C0ZJT
    public final C11PQ<Unit> LJIIJ() {
        return this.LJ;
    }

    public C0ZJM(int i) {
        C054E c054e = new C054E();
        C1231704rr c1231704rr = new C1231704rr("[Activity Status Settings]", null, 6);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        PrivacySettingsFeature privacySettingsFeatureLIZ = PrivacySettingsFeature.LIZ.LIZ();
        C11PQ<Unit> c11pq = new C11PQ<>();
        this.LIZ = c054e;
        this.LIZIZ = c1231704rr;
        this.LIZJ = mutableLiveData;
        this.LIZLLL = privacySettingsFeatureLIZ;
        this.LJ = c11pq;
        c1231704rr.LIZIZ();
    }

    public static int LJIILIIL(EnumC1643306c3 enumC1643306c3) {
        if (C1689706jX.LIZ()) {
            int i = C1643506c5.LIZ[enumC1643306c3.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return 5;
                    }
                    throw new C1954807lC();
                }
                return 4;
            }
            return 1;
        }
        int i2 = C1643506c5.LIZ[enumC1643306c3.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                return 2;
            }
            throw new C1954807lC();
        }
        return 1;
    }

    @Override // X.C0ZJT
    public final void LJIIL(boolean z) {
        this.LIZJ.setValue(Boolean.valueOf(z));
        LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // X.C0ZJT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C19EG r9, kotlin.jvm.internal.AFwS229S0000000_2 r10) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature r0 = r8.LIZLLL
            boolean r1 = X.C0ZH6.LIZIZ(r0)
            kotlin.jvm.internal.AwS101S0110000_14 r2 = new kotlin.jvm.internal.AwS101S0110000_14
            r0 = 9
            r2.<init>(r10, r1, r0)
            X.0ZJR r6 = new X.0ZJR
            androidx.fragment.app.FragmentManager r1 = r9.getSupportFragmentManager()
            com.ss.android.ugc.aweme.im.common.experiment.RemindUserTurnActiveStatusFrequencyControl r0 = X.C1687706jD.LIZ()
            boolean r0 = r0.euUser
            r7 = 0
            if (r0 != 0) goto L2d
            X.05h5 r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi r0 = X.C1419705h5.LIZ()
            if (r0 == 0) goto L8b
            boolean r0 = r0.LJIIL()
            if (r0 == 0) goto L8b
        L2d:
            r5 = 1
        L2e:
            r6.<init>(r9, r1, r5)
            r6.LJI(r2)
            X.0ZHA r4 = X.C0ZHA.CHAT
            r6.LJIJJLI = r4
            android.widget.TextView r1 = r6.LJIIJJI
            r3 = 0
            if (r1 != 0) goto L3e
            r1 = r3
        L3e:
            r0 = 2131830849(0x7f112841, float:1.9294707E38)
            r1.setText(r0)
            r2 = 2
            r6.LIZIZ(r2)
            com.bytedance.tux.input.TuxTextView r1 = r6.LJIILL
            if (r1 != 0) goto L4d
            r1 = r3
        L4d:
            r0 = 2131830836(0x7f112834, float:1.929468E38)
            r1.setText(r0)
            if (r5 == 0) goto L78
            com.bytedance.tux.input.TuxTextView r0 = r6.LJIIZILJ
            if (r0 != 0) goto L5a
            r0 = r3
        L5a:
            X.C786410Ut5.LLLLZLL(r0, r7)
            com.bytedance.tux.input.TuxTextView r0 = r6.LJIILLIIL
            if (r0 == 0) goto L62
            r3 = r0
        L62:
            X.C786410Ut5.LLLLZLL(r3, r7)
            r6.LIZJ(r2)
        L68:
            X.0ZIh r0 = X.InterfaceC897380ZIi.LIZIZ
            r0.getClass()
            X.0ZIi r0 = X.C897370ZIh.LIZ()
            r0.LJIIJJI()
            X.C0ZE8.LJI(r4)
            return
        L78:
            com.bytedance.tux.input.TuxTextView r0 = r6.LJIIZILJ
            if (r0 != 0) goto L7d
            r0 = r3
        L7d:
            r1 = 8
            X.C786410Ut5.LLLLZLL(r0, r1)
            com.bytedance.tux.input.TuxTextView r0 = r6.LJIILLIIL
            if (r0 == 0) goto L87
            r3 = r0
        L87:
            X.C786410Ut5.LLLLZLL(r3, r1)
            goto L68
        L8b:
            r5 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZJM.LJ(X.19EG, kotlin.jvm.internal.AFwS229S0000000_2):void");
    }

    @Override // X.C0ZJT
    public final void LJIIIZ(EnumC1643306c3 enumC1643306c3, Function0<Unit> function0) {
        PrivacySettingsFeature privacySettingsFeature = this.LIZLLL;
        if (privacySettingsFeature != null) {
            privacySettingsFeature.LJJII(C0ZJN.LIZ());
        }
        if (Intrinsics.LJFF(C0ZJN.LIZ(), "activity_status_v2")) {
            PrivacySettingsFeature privacySettingsFeature2 = this.LIZLLL;
            if (privacySettingsFeature2 != null) {
                privacySettingsFeature2.LJJIFFI(C2097908Jt.LIZJ(new Pair(C0ZJN.LIZ(), Integer.valueOf(LJIILIIL(enumC1643306c3)))), C11S5.LIZ(), C1701940uOG.LIZIZ(), new AwS415S0200000_14(this, (C0ZJM) function0, (Function0<Unit>) 138), new AwS593S0100000_14(this, 381), true);
                return;
            }
            return;
        }
        PrivacySettingsFeature privacySettingsFeature3 = this.LIZLLL;
        if (privacySettingsFeature3 == null) {
            return;
        }
        privacySettingsFeature3.LJFF(C0ZJN.LIZ(), LJIILIIL(enumC1643306c3), C11S5.LIZ(), C1701940uOG.LIZIZ(), new AwS415S0200000_14(this, (C0ZJM) function0, (Function0<Unit>) 139), new AwS593S0100000_14(this, 382), true);
    }

    @Override // X.C0ZJT
    public final void LIZIZ(C19EG c19eg, InboxFragmentV2 inboxFragmentV2, AwS593S0100000_14 awS593S0100000_14) {
        PopupManager.LJIJ(new C0ZJQ(c19eg, inboxFragmentV2, new AwS101S0110000_14(awS593S0100000_14, C0ZH6.LIZIZ(this.LIZLLL), 10)), "inbox_activity_status_init_pop", new C06IC("inbox_activity_status_init_trigger"));
    }

    @Override // X.C0ZJT
    public final void LJIIJJI(final C19EG c19eg, final InboxFragmentV2 inboxFragmentV2, AwS593S0100000_14 awS593S0100000_14) {
        if (C1689706jX.LIZ()) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "aweme://privacy/activity_status_v2_popup");
            C0ZHA c0zha = C0ZHA.INBOX_TITLE;
            smartRouteBuildRoute.withParam("enter_from", c0zha.getValue());
            smartRouteBuildRoute.withParam("enter_method", c0zha.getValue());
            smartRouteBuildRoute.open();
            return;
        }
        final AwS101S0110000_14 awS101S0110000_14 = new AwS101S0110000_14(awS593S0100000_14, C0ZH6.LIZIZ(this.LIZLLL), 8);
        PopupManager.LJIJ(new AbstractC20660115st<DialogFragment>(c19eg, inboxFragmentV2, awS101S0110000_14) { // from class: X.0ZJP
            public final C19EG LL;
            public final Function1<Boolean, Unit> LLILLJJLI;
            public final int LLILLL;

            @Override // X.AbstractC20656215sG
            public final boolean canShow() {
                return super.canShow();
            }

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return this.LLILLL;
            }

            @Override // com.bytedance.poplayer.IPopupTask
            public final Object showPopup(C688120Qyw c688120Qyw) {
                boolean zLJIIL;
                C19EG c19eg2 = this.LL;
                FragmentManager supportFragmentManager = c19eg2.getSupportFragmentManager();
                IMHostApi.LIZ.getClass();
                IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
                if (iMHostApiLIZ != null) {
                    zLJIIL = iMHostApiLIZ.LJIIL();
                } else {
                    zLJIIL = false;
                }
                C0ZJR c0zjr = new C0ZJR(c19eg2, supportFragmentManager, zLJIIL);
                c0zjr.LJI(this.LLILLJJLI);
                InterfaceC897380ZIi.LIZIZ.getClass();
                C897370ZIh.LIZ().LJIIJJI();
                C0ZE8.LJI(C0ZHA.INBOX_TITLE);
                TuxSheet tuxSheet = c0zjr.LIZLLL;
                if (tuxSheet == null) {
                    return null;
                }
                return tuxSheet;
            }

            {
                super(inboxFragmentV2);
                this.LL = c19eg;
                this.LLILLJJLI = awS101S0110000_14;
                this.LLILLL = 500;
            }
        }, "inbox_activity_status_init_pop", new C06IC("inbox_activity_status_init_trigger"));
    }
}
