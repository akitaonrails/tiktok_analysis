package Y;

import X.AbstractC19484711Kz;
import X.C0IHH;
import X.C0IIK;
import X.C0IJB;
import X.C0ITM;
import X.C118300cf;
import X.C11NZ;
import X.C259800zU;
import X.C466790ISf;
import X.C470510Icj;
import X.C471000IdW;
import X.C471030IdZ;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1487280oo2;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceQRCodeFragment;
import com.bytedance.android.livesdk.model.ItemTab;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: loaded from: classes8.dex */
public class AkS471S0100000_7 implements InterfaceC1487280oo2 {
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
            default:
                return null;
        }
    }

    public AkS471S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS471S0100000_7 akS471S0100000_7, Object obj) {
        GameDualDeviceQRCodeFragment gameDualDeviceQRCodeFragment = (GameDualDeviceQRCodeFragment) akS471S0100000_7.l0;
        gameDualDeviceQRCodeFragment.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = gameDualDeviceQRCodeFragment.getString(2131842993);
        spannableStringBuilder.append((CharSequence) GameDualDeviceQRCodeFragment.NR(C786410Ut5.j4(u.LJJIFFI(C497740JfY.LJIJI(2131853785), "%@", "%s", false), Arrays.copyOf(new Object[]{string}, 1)), string));
        return spannableStringBuilder;
    }

    public static final Object apply$1(AkS471S0100000_7 akS471S0100000_7, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C0IIK) {
            C0IJB c0ijb = (C0IJB) akS471S0100000_7.l0;
            int i = c0ijb.LL;
            c0ijb.LL = i + 1;
            if (i < ((Number) c0ijb.LLILLJJLI.getValue()).intValue()) {
                return C11NZ.LJLJJLL(((Number) ((C0IJB) akS471S0100000_7.l0).LLILLL.getValue()).longValue(), TimeUnit.MILLISECONDS);
            }
        }
        return C11NZ.LJJIJLIJ(th);
    }

    public static final Object apply$10(AkS471S0100000_7 akS471S0100000_7, Object obj) {
        final C11NZ c11nz = (C11NZ) obj;
        final C118300cf c118300cf = (C118300cf) akS471S0100000_7.l0;
        final int i = 1;
        final long j = 500;
        return c11nz.LJJJ(new InterfaceC1487280oo2() { // from class: X.0Itm
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                C118300cf c118300cf2 = c118300cf;
                int i2 = c118300cf2.element;
                if (i2 < i) {
                    c118300cf2.element = i2 + 1;
                    return C11NZ.LJJJJZ(c11nz).LJJI(j, TimeUnit.MILLISECONDS);
                }
                return c11nz;
            }
        }, false);
    }

    public static final Object apply$11(AkS471S0100000_7 akS471S0100000_7, Object obj) {
        C11NZ c11nz = (C11NZ) obj;
        return c11nz.LJJJ(new AkS323S0200000_7((C118300cf) akS471S0100000_7.l0, c11nz, 5), false);
    }

    public static final Object apply$12(AkS471S0100000_7 akS471S0100000_7, Object obj) {
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        ArrayList arrayList = new ArrayList();
        Collection collection = baseListResponse.data;
        if (collection != null) {
            arrayList.addAll(collection);
        }
        return new C0ITM(Pair.create(arrayList, baseListResponse.extra), baseListResponse.LIZIZ, baseListResponse.LIZJ, baseListResponse.LIZLLL, "draw", ((C466790ISf) akS471S0100000_7.l0).LIZ);
    }

    public static final Object apply$13(AkS471S0100000_7 akS471S0100000_7, Object obj) {
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        ArrayList arrayList = new ArrayList();
        Collection collection = baseListResponse.data;
        if (collection != null) {
            arrayList.addAll(collection);
        }
        return new C0ITM(Pair.create(arrayList, baseListResponse.extra), baseListResponse.LIZIZ, baseListResponse.LIZJ, baseListResponse.LIZLLL, "draw", ((C466790ISf) akS471S0100000_7.l0).LIZ);
    }

    public static final Object apply$2(AkS471S0100000_7 akS471S0100000_7, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ((LivePlayFragment) akS471S0100000_7.l0).LLLLLZ.draw(new Canvas(bitmap));
        return AbstractC19484711Kz.LJIJJLI(bitmap);
    }

    public static final Object apply$3(AkS471S0100000_7 akS471S0100000_7, Object obj) {
        T t;
        C0IHH c0ihh = (C0IHH) obj;
        if (c0ihh != null && (t = c0ihh.LIZ) != 0 && (t instanceof Bitmap)) {
            return AbstractC19484711Kz.LJIJJLI(c0ihh);
        }
        return ((LivePlayFragment) akS471S0100000_7.l0).SR();
    }

    public static final Object apply$4(AkS471S0100000_7 akS471S0100000_7, Object obj) {
        C471000IdW c471000IdW = (C471000IdW) akS471S0100000_7.l0;
        List<ItemTab> list = (List) obj;
        boolean zLJIIIZ = c471000IdW.LJIIIZ(list);
        if (C471030IdZ.LIZ().getEnableGetLiveTabTypeOpt()) {
            c471000IdW.LIZ(list);
        }
        if (!zLJIIIZ) {
            return new ArrayList();
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$5(AkS471S0100000_7 akS471S0100000_7, Object obj) {
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        ArrayList arrayList = new ArrayList();
        Collection collection = baseListResponse.data;
        if (collection != null) {
            arrayList.addAll(collection);
        }
        return new C0ITM(Pair.create(arrayList, baseListResponse.extra), baseListResponse.LIZIZ, baseListResponse.LIZJ, baseListResponse.LIZLLL, "draw", (String) ((C259800zU) akS471S0100000_7.l0).element);
    }

    public static final Object apply$6(AkS471S0100000_7 akS471S0100000_7, Object obj) {
        return ((Function1) akS471S0100000_7.l0).invoke(obj);
    }

    public static final Object apply$7(AkS471S0100000_7 akS471S0100000_7, Object obj) {
        return ((Function1) akS471S0100000_7.l0).invoke(obj);
    }

    public static final Object apply$8(AkS471S0100000_7 akS471S0100000_7, Object obj) {
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        ArrayList arrayList = new ArrayList();
        Collection collection = baseListResponse.data;
        if (collection != null) {
            arrayList.addAll(collection);
        }
        return new C0ITM(Pair.create(arrayList, baseListResponse.extra), baseListResponse.LIZIZ, baseListResponse.LIZJ, baseListResponse.LIZLLL, "draw", ((C466790ISf) akS471S0100000_7.l0).LIZ);
    }

    public static final Object apply$9(AkS471S0100000_7 akS471S0100000_7, Object obj) {
        List<TranslatedRegion> list = ((C470510Icj) akS471S0100000_7.l0).LL;
        ArrayList arrayList = new ArrayList();
        for (TranslatedRegion translatedRegion : list) {
            if (translatedRegion.selected) {
                arrayList.add(translatedRegion);
            }
        }
        return arrayList;
    }
}
