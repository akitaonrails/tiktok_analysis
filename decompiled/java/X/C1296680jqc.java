package X;

import android.content.Context;
import android.graphics.Typeface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0jqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
public final class C1296680jqc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1294720jnS LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1296680jqc(Context context, C1294720jnS c1294720jnS, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1294720jnS;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1296680jqc(this.LLILLJJLI, this.LL, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RememberLottieCompositionKt@1ea3.loadFontsFromAssets$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (C1294400jmw c1294400jmw : this.LL.LJ.values()) {
            Context context = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(c1294400jmw.LIZ);
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            try {
                Typeface typefaceV4 = C786410Ut5.v4(context.getAssets(), strLIZIZ);
                try {
                    String str3 = c1294400jmw.LIZJ;
                    int i = 0;
                    boolean zLJJIIZI = a0.LJJIIZI(str3, "Italic", false);
                    boolean zLJJIIZI2 = a0.LJJIIZI(str3, "Bold", false);
                    if (zLJJIIZI && zLJJIIZI2) {
                        i = 3;
                    } else if (zLJJIIZI) {
                        i = 2;
                    } else if (zLJJIIZI2) {
                        i = 1;
                    }
                    if (typefaceV4.getStyle() != i) {
                        typefaceV4 = Typeface.create(typefaceV4, i);
                    }
                    c1294400jmw.LIZLLL = typefaceV4;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Failed to create ");
                    sbLIZ2.append(c1294400jmw.LIZ);
                    sbLIZ2.append(" typeface with style=");
                    sbLIZ2.append(c1294400jmw.LIZJ);
                    sbLIZ2.append('!');
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1292050jj9.LIZ.getClass();
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Failed to find typeface in assets with path ");
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append('.');
                C2188811AlT.LIZIZ(sbLIZ3);
                C1292050jj9.LIZ.getClass();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RememberLottieCompositionKt@1ea3.loadFontsFromAssets$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
