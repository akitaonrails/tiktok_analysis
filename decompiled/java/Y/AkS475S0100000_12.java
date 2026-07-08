package Y;

import X.C0TBQ;
import X.C0TCX;
import X.C0TE2;
import X.C0U5Z;
import X.C1129650fVD;
import X.C11NZ;
import X.C11PQ;
import X.C11RB;
import X.C1273890jFr;
import X.C743580TEu;
import X.C776310Ucn;
import X.C786330Usx;
import X.C786410Ut5;
import X.InterfaceC1487280oo2;
import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceQRCodeFragment;
import com.bytedance.android.livesdk.game.multidevicesdk.dualdevice.CastLinkerWrapper;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerCategoryListViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AkS475S0100000_12 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return apply$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return apply$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return apply$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return apply$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return apply$13(this, obj);
            case 14:
                return apply$14(this, obj);
            default:
                return null;
        }
    }

    public AkS475S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        C11PQ<SpannableStringBuilder> c11pq = C743580TEu.LIZ;
        Fragment fragment = (Fragment) akS475S0100000_12.l0;
        Context context = fragment.getContext();
        if (context == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = fragment.getString(2131842994);
        SpannableStringBuilder spannableStringBuilderLIZ = C743580TEu.LIZ(C786410Ut5.j4(fragment.getString(2131842988), Arrays.copyOf(new Object[]{string}, 1)), string);
        C743580TEu.LIZLLL(context, spannableStringBuilderLIZ, "ttlive_icon_person_bold.png", "{icon}");
        spannableStringBuilder.append((CharSequence) spannableStringBuilderLIZ);
        spannableStringBuilder.append((CharSequence) "\n");
        String string2 = fragment.getString(2131842995);
        String string3 = fragment.getString(2131842996);
        SpannableStringBuilder spannableStringBuilderLIZ2 = C743580TEu.LIZ(C786410Ut5.j4(fragment.getString(2131842989), Arrays.copyOf(new Object[]{string2, string3}, 2)), string2, string3);
        C743580TEu.LIZLLL(context, spannableStringBuilderLIZ2, "ttlive_icon_lines_horizon.png", "{icon1}");
        C743580TEu.LIZLLL(context, spannableStringBuilderLIZ2, "ttlive_icon_qr_code.png", "{icon2}");
        spannableStringBuilder.append((CharSequence) spannableStringBuilderLIZ2);
        spannableStringBuilder.append((CharSequence) "\n");
        String string4 = fragment.getString(2131842997);
        SpannableStringBuilder spannableStringBuilderLIZ3 = C743580TEu.LIZ(C786410Ut5.j4(fragment.getString(2131842990), Arrays.copyOf(new Object[]{string4}, 1)), string4);
        C743580TEu.LIZLLL(context, spannableStringBuilderLIZ3, "ttlive_icon_scan.png", "{icon}");
        spannableStringBuilder.append((CharSequence) spannableStringBuilderLIZ3);
        spannableStringBuilder.append((CharSequence) "\n");
        return spannableStringBuilder;
    }

    public static final Object apply$1(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        return ((GameDualDeviceQRCodeFragment) akS475S0100000_12.l0).PR();
    }

    public static final Object apply$10(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        return ((C1129650fVD) akS475S0100000_12.l0).LIZLLL((BaseResponse) obj);
    }

    public static final Object apply$11(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        return ((C1129650fVD) akS475S0100000_12.l0).LIZLLL((BaseResponse) obj);
    }

    public static final Object apply$12(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        return new C1273890jFr((C776310Ucn) akS475S0100000_12.l0);
    }

    public static final Object apply$13(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        return ((C0TCX) akS475S0100000_12.l0).LJIIIIZZ;
    }

    public static final Object apply$14(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        return C11RB.LIZIZ(((C0TBQ) akS475S0100000_12.l0).LIZ).LIZIZ;
    }

    public static final Object apply$2(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        return ((GameDualDeviceQRCodeFragment) akS475S0100000_12.l0).PR();
    }

    public static final Object apply$3(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        Function1<Effect, Boolean> function1 = ((InfoStickerCategoryListViewModel) akS475S0100000_12.l0).LLIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (function1.invoke((Effect) obj2).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final Object apply$4(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        Function1<Effect, Boolean> function1 = ((InfoStickerCategoryListViewModel) akS475S0100000_12.l0).LLIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (function1.invoke((Effect) obj2).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final Object apply$5(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        return C11NZ.LJIJJLI(new C786330Usx((C0U5Z) akS475S0100000_12.l0, (LiveEffect) obj, 0));
    }

    public static final Object apply$6(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        CastLinkerWrapper castLinkerWrapper = ((C0TE2) akS475S0100000_12.l0).LJI;
        if (castLinkerWrapper != null) {
            return Integer.valueOf(castLinkerWrapper.checkConnection());
        }
        return null;
    }

    public static final Object apply$7(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        return (C11NZ) akS475S0100000_12.l0;
    }

    public static final Object apply$8(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        return (BaseResponse) akS475S0100000_12.l0;
    }

    public static final Object apply$9(AkS475S0100000_12 akS475S0100000_12, Object obj) {
        return ((C11PQ) akS475S0100000_12.l0).LJJJJZI(new AkS475S0100000_12((BaseResponse) obj, 8));
    }
}
