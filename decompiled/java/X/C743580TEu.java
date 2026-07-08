package X;

import Y.AkS475S0100000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0TEu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743580TEu {
    public static final C11PQ<SpannableStringBuilder> LIZ = new C11PQ<>();
    public static final C11PQ<SpannableStringBuilder> LIZIZ = new C11PQ<>();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public static boolean LIZIZ() {
        AtomicBoolean atomicBoolean = LIZLLL;
        if (atomicBoolean.get()) {
            C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "has tips cache");
            return true;
        }
        atomicBoolean.set(true);
        C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "load tips start");
        C11NZ.LJJJJZ(1).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0TEy
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C11PQ<SpannableStringBuilder> c11pq = C743580TEu.LIZ;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String strLJIJI = C497740JfY.LJIJI(2131842993);
                spannableStringBuilder.append((CharSequence) C743580TEu.LIZ(C786410Ut5.j4(u.LJJIFFI(C497740JfY.LJIJI(2131853785), "%@", "%s", false), Arrays.copyOf(new Object[]{strLJIJI}, 1)), strLJIJI));
                return spannableStringBuilder;
            }
        }).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0TEt
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DualDeviceQRCodeTipsHelper@fbed.cacheContentTips$2");
                C743580TEu.LIZIZ.onNext(obj);
                C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "load tips cache  succeed");
                C1C7U.LIZIZ("DualDeviceQRCodeTipsHelper@fbed.cacheContentTips$2");
            }
        }, new C09JN() { // from class: X.0TEw
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DualDeviceQRCodeTipsHelper@fbed.cacheContentTips$3");
                C11PQ<SpannableStringBuilder> c11pq = C743580TEu.LIZ;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(C786410Ut5.j4(C497740JfY.LJIJI(2131842987), Arrays.copyOf(new Object[]{C497740JfY.LJIJI(2131842993)}, 1)));
                stringBuffer.append(C497740JfY.LJIJI(2131842991));
                C743580TEu.LIZIZ.onNext(new SpannableStringBuilder(stringBuffer.toString()));
                C743580TEu.LIZLLL.set(false);
                C20441214yg.LJ("DualDeviceQRCodeHelper", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("DualDeviceQRCodeTipsHelper@fbed.cacheContentTips$3");
            }
        });
        return false;
    }

    public static boolean LIZJ(Fragment fragment) {
        AtomicBoolean atomicBoolean = LIZJ;
        if (atomicBoolean.get()) {
            C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "has intro cache");
            return true;
        }
        atomicBoolean.set(true);
        C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "load intro start");
        ((C0J1N) C11NZ.LJJJJZ(1).LJJJJZI(new AkS475S0100000_12(fragment, 0)).LJIILIIL(new C0UO0()).LIZJ(C11RD.LIZLLL(fragment))).LIZ(new C09JN() { // from class: X.0TEx
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DualDeviceQRCodeTipsHelper@fbed.cacheIntro$2");
                if (obj != null) {
                    C743580TEu.LIZ.onNext(obj);
                }
                C11PQ<SpannableStringBuilder> c11pq = C743580TEu.LIZ;
                C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "load intro cache succeed");
                C1C7U.LIZIZ("DualDeviceQRCodeTipsHelper@fbed.cacheIntro$2");
            }
        }, new C09JN() { // from class: X.0TEv
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DualDeviceQRCodeTipsHelper@fbed.cacheIntro$3");
                C11PQ<SpannableStringBuilder> c11pq = C743580TEu.LIZ;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(C786410Ut5.j4(C497740JfY.LJIJI(2131842988), Arrays.copyOf(new Object[]{C497740JfY.LJIJI(2131842994)}, 1)));
                stringBuffer.append("\n");
                stringBuffer.append(C786410Ut5.j4(C497740JfY.LJIJI(2131842989), Arrays.copyOf(new Object[]{C497740JfY.LJIJI(2131842995), C497740JfY.LJIJI(2131842996)}, 2)));
                stringBuffer.append("\n");
                stringBuffer.append(C786410Ut5.j4(C497740JfY.LJIJI(2131842990), Arrays.copyOf(new Object[]{C497740JfY.LJIJI(2131842997)}, 1)));
                C743580TEu.LIZ.onNext(new SpannableStringBuilder(stringBuffer.toString()));
                C743580TEu.LIZJ.set(false);
                C20441214yg.LJ("DualDeviceQRCodeHelper", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("DualDeviceQRCodeTipsHelper@fbed.cacheIntro$3");
            }
        });
        return false;
    }

    public static SpannableStringBuilder LIZ(CharSequence charSequence, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (String str : strArr) {
            int iLJJJ = a0.LJJJ(charSequence, str, 0, false, 6);
            if (iLJJJ >= 0) {
                C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, str.length() + iLJJJ, 33);
            }
        }
        return spannableStringBuilder;
    }

    public static void LIZLLL(Context context, SpannableStringBuilder spannableStringBuilder, String str, String str2) {
        Drawable drawableLIZ = C1143680frq.LIZ("tiktok_live_game_demand_2", str);
        if (drawableLIZ != null) {
            drawableLIZ.setTint(C20736316Cj.LIZIZ(R.attr.ezt, context));
            drawableLIZ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            int iLJJJ = a0.LJJJ(spannableStringBuilder, str2, 0, false, 6);
            if (iLJJJ != -1) {
                C786410Ut5.q2(spannableStringBuilder, new C419890GdH(drawableLIZ, 2), iLJJJ, str2.length() + iLJJJ, 33);
            }
        }
    }
}
