package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mxC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416080mxC extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C1417330mzD LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C259800zU<C1417310mzB> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ AutoCutThemeData LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1416080mxC(C1417330mzD c1417330mzD, String str, C259800zU<C1417310mzB> c259800zU, boolean z, int i, String str2, AutoCutThemeData autoCutThemeData) {
        super(1);
        this.LL = c1417330mzD;
        this.LLILLJJLI = str;
        this.LLILLL = c259800zU;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = str2;
        this.LLIZ = autoCutThemeData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        C1417330mzD c1417330mzD = this.LL;
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(c1417330mzD.T2().LIZIZ.LIZ.intValue(), c1417330mzD.d);
        String str2 = null;
        if (autoCutThemeData != null) {
            str2 = autoCutThemeData.templateId;
        }
        if (Intrinsics.LJFF(str2, str)) {
            InterfaceC1417440mzO interfaceC1417440mzOMc = this.LL.mc();
            if (interfaceC1417440mzOMc != null) {
                interfaceC1417440mzOMc.LJIIL();
            }
            C1417330mzD.J6(this.LL, this.LLILLJJLI, false);
            this.LL.U5();
            C1417330mzD.Jf(this.LLILLL, this.LLILZ, this.LL, this.LLILZIL, this.LLILZLL, this.LLIZ);
        }
        return Unit.LIZ;
    }
}
