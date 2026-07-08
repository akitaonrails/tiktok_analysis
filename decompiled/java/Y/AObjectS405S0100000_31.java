package Y;

import X.C0FNV;
import X.C1192870h9B;
import X.C1193630hAP;
import X.C1486090om7;
import X.C15Q0;
import X.C204686157k;
import X.C204690157o;
import X.C20516815Py;
import X.C2188811AlT;
import X.C2260271DdR;
import X.C559920Lxe;
import X.DialogC1389620mGW;
import X.InterfaceC559980Lxk;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.applog.priority.PriorityWrapper;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.CollectMusicFragment;
import com.ss.android.ugc.aweme.qrcode.QRCodeFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.trill.setting.PushSettingActivity;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AObjectS405S0100000_31 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(Y.AObjectS405S0100000_31 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.STMMeditationAssem r4 = (com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.STMMeditationAssem) r4
            X.0QSJ r1 = r4.LLJZ
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJLLL
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJLLL = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.feed.platform.panel.RootPanelScope> r0 = com.ss.android.ugc.feed.platform.panel.RootPanelScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJZ = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.compliance.protection.timelock.ui.viewmodel.STMMeditationViewModel r0 = new com.ss.android.ugc.aweme.compliance.protection.timelock.ui.viewmodel.STMMeditationViewModel
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility> r0 = com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility.class
            java.lang.Object r1 = r1.getAbility(r0)
            com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility r1 = (com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility) r1
            java.lang.Class<com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility> r0 = com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS405S0100000_31.invoke$0(Y.AObjectS405S0100000_31):java.lang.Object");
    }

    public static final Object invoke$1(AObjectS405S0100000_31 aObjectS405S0100000_31) {
        C1193630hAP c1193630hAP = (C1193630hAP) aObjectS405S0100000_31.l0;
        String str = MusicDetailListActivity._pnsPageId;
        c1193630hAP.getClass();
        return C1192870h9B.LIZJ;
    }

    public static final Object invoke$10(AObjectS405S0100000_31 aObjectS405S0100000_31) {
        InterfaceC559980Lxk interfaceC559980Lxk = ((C204690157o) aObjectS405S0100000_31.l0).LLILLL;
        if (interfaceC559980Lxk == null) {
            return Unit.LIZ;
        }
        ((C559920Lxe) interfaceC559980Lxk).LIZ();
        throw null;
    }

    public static final Object invoke$11(AObjectS405S0100000_31 aObjectS405S0100000_31) {
        C20516815Py c20516815Py = (C20516815Py) aObjectS405S0100000_31.l0;
        DialogC1389620mGW dialogC1389620mGW = c20516815Py.LJFF.LIZ;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
        C15Q0 c15q0 = c20516815Py.LJFF.LJIIIIZZ;
        if (c15q0 != null) {
            c15q0.LIZ(0, null);
        }
        return null;
    }

    public static final Object invoke$12(AObjectS405S0100000_31 aObjectS405S0100000_31) {
        JSONObject jSONObject = (JSONObject) aObjectS405S0100000_31.l0;
        List<String> list = PriorityWrapper.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sart update priority config by default response: ");
        sbLIZ.append(jSONObject);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$13(AObjectS405S0100000_31 aObjectS405S0100000_31) {
        C1486090om7 c1486090om7 = (C1486090om7) aObjectS405S0100000_31.l0;
        c1486090om7.getClass();
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(0, ((Number) C2260271DdR.LIZJ.getValue()).intValue());
        valueAnimatorOfArgb.setDuration(1500L);
        valueAnimatorOfArgb.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfArgb.addUpdateListener(new AUListenerS278S0100000_31(c1486090om7, 67));
        return valueAnimatorOfArgb;
    }

    public static final Object invoke$2(AObjectS405S0100000_31 aObjectS405S0100000_31) {
        C1193630hAP c1193630hAP = (C1193630hAP) aObjectS405S0100000_31.l0;
        String str = PushSettingActivity._pnsPageId;
        c1193630hAP.getClass();
        return C1192870h9B.LIZJ;
    }

    public static final Object invoke$3(AObjectS405S0100000_31 aObjectS405S0100000_31) {
        C1193630hAP c1193630hAP = (C1193630hAP) aObjectS405S0100000_31.l0;
        String str = QRCodeFragment._pnsPageId;
        c1193630hAP.getClass();
        return C1192870h9B.LIZJ;
    }

    public static final Object invoke$4(AObjectS405S0100000_31 aObjectS405S0100000_31) {
        return Boolean.valueOf(((BaseNewMusicTabFragment) aObjectS405S0100000_31.l0).LLLIL);
    }

    public static final Object invoke$5(AObjectS405S0100000_31 aObjectS405S0100000_31) {
        BaseNewMusicTabFragment baseNewMusicTabFragment = (BaseNewMusicTabFragment) aObjectS405S0100000_31.l0;
        String str = BaseNewMusicTabFragment.LLLILZLLLI;
        return baseNewMusicTabFragment.aS();
    }

    public static final Object invoke$6(AObjectS405S0100000_31 aObjectS405S0100000_31) {
        boolean z;
        CollectMusicFragment collectMusicFragment = (CollectMusicFragment) aObjectS405S0100000_31.l0;
        if (collectMusicFragment.getUserVisibleHint() && collectMusicFragment.LJJLIIIJILLIZJL() != null && collectMusicFragment.LJJLIIIJILLIZJL().isShown()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$7(AObjectS405S0100000_31 aObjectS405S0100000_31) {
        ((C204686157k) aObjectS405S0100000_31.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AObjectS405S0100000_31 aObjectS405S0100000_31) {
        ((C204686157k) aObjectS405S0100000_31.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AObjectS405S0100000_31 aObjectS405S0100000_31) {
        InterfaceC559980Lxk interfaceC559980Lxk = ((C204690157o) aObjectS405S0100000_31.l0).LLILLL;
        if (interfaceC559980Lxk == null) {
            return Unit.LIZ;
        }
        ((C559920Lxe) interfaceC559980Lxk).LIZ();
        throw null;
    }

    public AObjectS405S0100000_31(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
