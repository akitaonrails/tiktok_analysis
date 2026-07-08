package X;

import android.graphics.Bitmap;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0D1M, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D1M extends AbstractC2255721DQs<InterfaceC332600D2c> implements InterfaceC332600D2c {
    public static final C0D1P LLJILJILJ = new Object() { // from class: X.0D1P
    };
    public static final int LLJILLL = 8;
    public final int LL;
    public final int LLILLJJLI;
    public final C01GW LLILLL;
    public final ConcurrentHashMap<String, C322190Ck5> LLILZ;
    public final C095E<String> LLILZIL;
    public final C095E<String> LLILZLL;
    public final InterfaceC497601wk LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final InterfaceC332600D2c LLJILJIL;

    public C0D1M() {
        this(2, 3, 1);
    }

    private final boolean T2() {
        return ((Boolean) this.LLILLL.getValue()).booleanValue();
    }

    private final InterfaceC497601wk Z1() {
        return (InterfaceC497601wk) this.LLJIJIL.getValue();
    }

    private final void c3() {
        C23250099c.LIZLLL(this.LLIZ, null, null, new C0D1I(this, null), 3);
        C23250099c.LIZLLL(this.LLIZ, null, null, new C0D1J(this, null), 3);
    }

    private final InterfaceC497601wk w2() {
        return (InterfaceC497601wk) this.LLJI.getValue();
    }

    public final InterfaceC1337805Lk G2() {
        return (InterfaceC1337805Lk) this.LLIZLLLIL.getValue();
    }

    public final InterfaceC1337805Lk o2() {
        return (InterfaceC1337805Lk) this.LLJ.getValue();
    }

    private final void close() {
        if (T2()) {
            C2296808zG.LIZJ(this.LLIZ, null);
        } else {
            C2296808zG.LIZJ(w2(), null);
            C2296808zG.LIZJ(Z1(), null);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (T2()) {
            c3();
        } else {
            W2(this.LL, this.LLILLJJLI);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        close();
    }

    public InterfaceC332600D2c X1() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJILJIL;
    }

    private final C322190Ck5 H2(String str) {
        C322190Ck5 c322190Ck5PutIfAbsent;
        ConcurrentHashMap<String, C322190Ck5> concurrentHashMap = this.LLILZ;
        C322190Ck5 c322190Ck5 = concurrentHashMap.get(str);
        if (c322190Ck5 == null && (c322190Ck5PutIfAbsent = concurrentHashMap.putIfAbsent(str, (c322190Ck5 = new C322190Ck5(null)))) != null) {
            c322190Ck5 = c322190Ck5PutIfAbsent;
        }
        return c322190Ck5;
    }

    public final void i3(String str) {
        C201955140j.LJIILL(C1632470saD.LIZIZ, "ColorExtractionComponentImpl", str);
    }

    private final void W2(int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            C23250099c.LIZLLL(w2(), null, null, new C0D1K(this, null), 3);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C23250099c.LIZLLL(Z1(), null, null, new C0D1L(this, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer W1(String str, Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return null;
        }
        try {
            C1302050jzH.LIZ.getClass();
            C05XE c05xe = new C05XE(FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null)).LIZIZ(), C1302080jzK.LIZJ(C1302050jzH.LIZ()), null);
            Integer num = (Integer) c05xe.LIZ;
            long j = c05xe.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Extraction for '");
            sbLIZ.append(str);
            sbLIZ.append("' took ");
            sbLIZ.append((Object) C19990113Jj.LJIJJ(j));
            sbLIZ.append(" ms.");
            i3(C2188811AlT.LIZIZ(sbLIZ));
            return num;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Extraction failed with ");
            sbLIZ2.append(e);
            i3(C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
    }

    @Override // X.InterfaceC332600D2c
    public Object get(String str, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        C322190Ck5 c322190Ck5H2 = H2(str);
        if (c322190Ck5H2.LIZIZ.isCompleted()) {
            return c322190Ck5H2.LIZIZ.LJLIIIL(interfaceC1364105Vn);
        }
        if (!(!(this.LLILZLL.LJIIIIZZ(str) instanceof C094O))) {
            String str2 = (String) C094N.LIZIZ(this.LLILZLL.LJIIJ());
            if (str2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("!! High-priority queue full. Kicked out '");
                sbLIZ.append(str2);
                sbLIZ.append("' to make room for '");
                sbLIZ.append(str);
                sbLIZ.append("'.");
                i3(C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LLILZLL.LJIIIIZZ(str);
        }
        return C099A.LIZJ(Mp4ScreenVideoLoadTimeout.CONTROL, new C322180Ck4(c322190Ck5H2, null), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC332600D2c
    public void tb2(String str, Bitmap bitmap) {
        C322190Ck5 c322190Ck5H2 = H2(str);
        if (!c322190Ck5H2.LIZIZ.isCompleted() && !bitmap.isRecycled()) {
            try {
                Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.RGB_565, false);
                if (bitmapCopy != null) {
                    c322190Ck5H2.LIZ.LJIIZILJ(bitmapCopy);
                    i3("-> Queued LOW priority task for '" + str + "'. Success: " + (!(this.LLILZIL.LJIIIIZZ(str) instanceof C094O)));
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public C0D1M(int i, int i2, int i3) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2299));
        this.LLILZ = new ConcurrentHashMap<>();
        this.LLILZIL = C095G.LIZ(Integer.MAX_VALUE, null, 6);
        this.LLILZLL = C095G.LIZ(i3, null, 6);
        this.LLIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()).plus(new C346550DiH(CoroutineExceptionHandler.LJJLIL, this, 0)));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 386));
        this.LLJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 384));
        this.LLJI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 385));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 383));
        this.LLJILJIL = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3(java.lang.String r10, java.lang.String r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D1M.m3(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q3(java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D1M.q3(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
