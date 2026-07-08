package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1137000fh4 {
    public static final C1137000fh4 LIZ = new C1137000fh4();

    public static Spannable LIZ(boolean z) {
        String strLJIJI = C497740JfY.LJIJI(2131841686);
        if (z) {
            LIZ.getClass();
            LJIIL(strLJIJI);
        }
        return SpannableString.valueOf(strLJIJI);
    }

    public static Spannable LIZIZ(boolean z) {
        String strLJIJI = C497740JfY.LJIJI(2131841980);
        if (z) {
            LIZ.getClass();
            LJIIL(strLJIJI);
        }
        return SpannableString.valueOf(strLJIJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Spannable LIZJ(com.bytedance.android.livesdk.model.message.GiftMessage r13) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1137000fh4.LIZJ(com.bytedance.android.livesdk.model.message.GiftMessage):android.text.Spannable");
    }

    public static Spannable LJFF(boolean z) {
        String strLJIJI = C497740JfY.LJIJI(2131841887);
        if (z) {
            LIZ.getClass();
            LJIIL(strLJIJI);
        }
        return SpannableString.valueOf(strLJIJI);
    }

    public static void LJIIL(CharSequence charSequence) {
        if (C497740JfY.LJJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(' ');
            sbLIZ.append((Object) charSequence);
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append((Object) charSequence);
        sbLIZ2.append(' ');
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LJIIJ(C16F5 c16f5, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable background = null;
        if (c16f5 != null) {
            background = c16f5.getBackground();
        }
        if ((background instanceof TransitionDrawable) && (layerDrawable = (LayerDrawable) background) != null) {
            layerDrawable.setDrawableByLayerId(R.id.view_bg, drawable);
            layerDrawable.invalidateSelf();
        }
    }

    public static CharSequence LJI(GiftMessage giftMessage, DataChannel dataChannel, boolean z) {
        if (giftMessage != null && giftMessage.isFirstSendGift) {
            return LIZ(z);
        }
        if (C1132700fa8.LJIILJJIL(giftMessage) && C1132700fa8.LJIILLIIL(giftMessage)) {
            return LIZJ(giftMessage);
        }
        if (C1132700fa8.LJIILJJIL(giftMessage)) {
            return LJFF(z);
        }
        if (C1132700fa8.LJIILLIIL(giftMessage)) {
            return LIZJ(giftMessage);
        }
        if (C1132700fa8.LIZLLL(giftMessage)) {
            return LIZJ(giftMessage);
        }
        if (C1132700fa8.LJIIJJI(dataChannel, giftMessage)) {
            return LIZIZ(z);
        }
        return "";
    }

    public static void LJII(C1135810ff9 c1135810ff9, DataChannel dataChannel, Function1 function1) {
        boolean z;
        GiftMessage giftMessage;
        GiftMessage giftMessage2;
        if (c1135810ff9 != null && (giftMessage2 = c1135810ff9.LIZ) != null && C1132700fa8.LJIILLIIL(giftMessage2)) {
            z = true;
        } else {
            z = false;
        }
        GiftMessage giftMessage3 = null;
        if (!z) {
            if (c1135810ff9 != null) {
                giftMessage = c1135810ff9.LIZ;
            } else {
                giftMessage = null;
            }
            if (!C1132700fa8.LIZLLL(giftMessage)) {
                if (c1135810ff9 != null) {
                    giftMessage3 = c1135810ff9.LIZ;
                }
                function1.invoke(LJI(giftMessage3, dataChannel, true));
                return;
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C326701On(c1135810ff9, function1, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Spannable LJIIIZ(android.text.Spannable r10, com.bytedance.android.livesdk.model.message.common.TextPiece r11, int r12) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1137000fh4.LJIIIZ(android.text.Spannable, com.bytedance.android.livesdk.model.message.common.TextPiece, int):android.text.Spannable");
    }

    public static Object LJIIIIZZ(C1137000fh4 c1137000fh4, EnumC1137110fhF enumC1137110fhF, C1135810ff9 c1135810ff9, AbstractC23140094w abstractC23140094w) {
        GiftMessage giftMessage;
        c1137000fh4.getClass();
        switch (C1137220fhQ.LIZ[enumC1137110fhF.ordinal()]) {
            case 1:
                return LIZ(true);
            case 2:
                return LIZIZ(true);
            case 3:
                return LJFF(true);
            case 4:
            case 5:
            case 6:
                if (c1135810ff9 != null) {
                    giftMessage = c1135810ff9.LIZ;
                } else {
                    giftMessage = null;
                }
                return C23250099c.LJI(abstractC23140094w, C0PEM.LIZ, new C326501Ol(giftMessage, null));
            default:
                throw new C1954807lC();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0062 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C1135810ff9 r12, X.C16F5 r13, java.util.List<? extends X.EnumC1137110fhF> r14, X.InterfaceC1364105Vn<? super X.C988890bqB> r15) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1137000fh4.LJ(X.0ff9, X.16F5, java.util.List, X.05Vn):java.lang.Object");
    }

    public static void LJIIJJI(C16F5 c16f5, C1135810ff9 c1135810ff9, DataChannel dataChannel, boolean z, boolean z2) {
        Context context;
        if (c16f5 != null && (context = c16f5.getContext()) != null) {
            LJII(c1135810ff9, dataChannel, new C5183020f(c16f5, 25));
            C786410Ut5.ac(c16f5, 0.5f);
            C786410Ut5.yc(c16f5, 0.5f);
            C786410Ut5.k5(c16f5, 1.0f);
            C786410Ut5.od(c16f5, -((int) C497740JfY.LIZIZ(6.0f)));
            if (!z2) {
                c16f5.setBackground(C1135990ffR.LJ(context, c1135810ff9));
            }
            C786410Ut5.Rc(c16f5, C1136970fh1.LJFF() * ((int) C497740JfY.LIZIZ(51.0f)));
            c16f5.setPivotX(0.0f);
            c16f5.setPivotY(0.0f);
            if (z) {
                C500260Jjc.LLFFF(c16f5);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01af  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006f -> B:11:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C1135810ff9 r18, X.C16F5 r19, X.C1126540fQC r20, android.view.View r21, X.C16F5 r22, java.util.List r23, X.InterfaceC1364105Vn r24) {
        /*
            Method dump skipped, instruction units count: 2024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1137000fh4.LIZLLL(X.0ff9, X.16F5, X.0fQC, android.view.View, X.16F5, java.util.List, X.05Vn):java.lang.Object");
    }
}
