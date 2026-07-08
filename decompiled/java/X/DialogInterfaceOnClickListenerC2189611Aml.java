package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.biometric.FingerprintDialogFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Aml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class DialogInterfaceOnClickListenerC2189611Aml implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
            case 3:
                onClick$3(this, dialogInterface, i);
                break;
            case 4:
                onClick$4(this, dialogInterface, i);
                break;
            case 5:
                onClick$5(this, dialogInterface, i);
                break;
            case 6:
                onClick$6(this, dialogInterface, i);
                break;
            case 7:
                onClick$7(this, dialogInterface, i);
                break;
            case 8:
                onClick$8(this, dialogInterface, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, dialogInterface, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, dialogInterface, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, dialogInterface, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, dialogInterface, i);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, dialogInterface, i);
                break;
            case 14:
                onClick$14(this, dialogInterface, i);
                break;
            case 15:
                onClick$15(this, dialogInterface, i);
                break;
            case 16:
                onClick$16(this, dialogInterface, i);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onClick$17(this, dialogInterface, i);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onClick$18(this, dialogInterface, i);
                break;
            case 19:
                onClick$19(this, dialogInterface, i);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onClick$20(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC2189611Aml(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((FingerprintDialogFragment) dialogInterfaceOnClickListenerC2189611Aml.l0).LLILLL.AQ2(true);
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC2189611Aml.l0).invoke();
    }

    public static final void onClick$10(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((C2180231AUj) dialogInterfaceOnClickListenerC2189611Aml.l0).X1().O90();
    }

    public static final void onClick$11(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC2189611Aml.l0).invoke();
    }

    public static final void onClick$12(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC2189611Aml.l0).invoke();
    }

    public static final void onClick$13(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC2189611Aml.l0).invoke();
    }

    public static final void onClick$14(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC2189611Aml.l0).invoke();
    }

    public static final void onClick$15(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC2189611Aml.l0).invoke();
    }

    public static final void onClick$16(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC2189611Aml.l0).invoke();
    }

    public static final void onClick$17(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC2189611Aml.l0).invoke();
    }

    public static final void onClick$18(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        Function0 function0 = (Function0) dialogInterfaceOnClickListenerC2189611Aml.l0;
        dialogInterface.dismiss();
        function0.invoke();
    }

    public static final void onClick$19(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        Keva keva = C1A5O.LIZ;
        C1A5D c1a5d = (C1A5D) dialogInterfaceOnClickListenerC2189611Aml.l0;
        String[] strArr = (String[]) C13DL.LJIIIIZZ(c1a5d.LIZ(false), C1A5O.LIZIZ);
        C1A5O.LIZIZ = strArr;
        C1A5O.LIZ.storeStringArray("gesture_alarm_records", strArr);
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC2189611Aml.l0).invoke();
    }

    public static final void onClick$20(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((Activity) dialogInterfaceOnClickListenerC2189611Aml.l0).finish();
    }

    public static final void onClick$3(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC2189611Aml.l0).invoke();
    }

    public static final void onClick$4(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((C2180231AUj) dialogInterfaceOnClickListenerC2189611Aml.l0).X1().Ad1();
    }

    public static final void onClick$5(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((C2180231AUj) dialogInterfaceOnClickListenerC2189611Aml.l0).X1().cs2();
    }

    public static final void onClick$6(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((C2180231AUj) dialogInterfaceOnClickListenerC2189611Aml.l0).X1().Aj0();
    }

    public static final void onClick$7(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((C2180231AUj) dialogInterfaceOnClickListenerC2189611Aml.l0).X1().PI1();
    }

    public static final void onClick$8(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((C2180231AUj) dialogInterfaceOnClickListenerC2189611Aml.l0).X1().vN1();
    }

    public static final void onClick$9(DialogInterfaceOnClickListenerC2189611Aml dialogInterfaceOnClickListenerC2189611Aml, DialogInterface dialogInterface, int i) {
        ((C2180231AUj) dialogInterfaceOnClickListenerC2189611Aml.l0).X1().K30();
    }
}
