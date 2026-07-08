package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.EditAutoCutComponent$requestNLEModel$3", f = "EditAutoCutComponent.kt", l = {}, m = "invokeSuspend")
public final class C1417410mzL extends C09AX implements Function2<C096H, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1417330mzD LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C0MJ9 LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ EnumC1417520mzW LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417410mzL(C1417330mzD c1417330mzD, int i, C0MJ9 c0mj9, int i2, String str, String str2, EnumC1417520mzW enumC1417520mzW, String str3, String str4, InterfaceC1364105Vn<? super C1417410mzL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1417330mzD;
        this.LLILLL = i;
        this.LLILZ = c0mj9;
        this.LLILZIL = i2;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = enumC1417520mzW;
        this.LLJ = str3;
        this.LLJI = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1417410mzL c1417410mzL = new C1417410mzL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c1417410mzL.LL = obj;
        return c1417410mzL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditAutoCutComponent@9215.requestNLEModel$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C096H c096h = (C096H) this.LL;
        if (c096h instanceof C23152095i) {
            if (!this.LLILLJJLI.Yc(this.LLILLL, this.LLILZ)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EditAutoCutComponent@9215.requestNLEModel$3");
                return unit;
            }
        } else if (c096h instanceof C23146095c) {
            C1417330mzD c1417330mzD = this.LLILLJJLI;
            c1417330mzD.LLZZZZ = 0;
            c1417330mzD.LLZZZIL = ((C23146095c) c096h).LIZ.size();
            this.LLILLJJLI.LLZL = System.currentTimeMillis();
        } else if (c096h instanceof C095S) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EditAutoCutComponent onCompressProgress progress: ");
            sbLIZ.append(c096h);
            sbLIZ.append(".progress");
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
            if (!this.LLILLJJLI.Yc(this.LLILLL, this.LLILZ)) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("EditAutoCutComponent@9215.requestNLEModel$3");
                return unit2;
            }
        } else if (c096h instanceof C095T) {
            this.LLILLJJLI.Wd(((C095T) c096h).LIZ);
        } else if (c096h instanceof C1417890n07) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("EditAutoCutComponent requestNLEModel onTemplateFailure: ");
            sbLIZ2.append(c096h);
            sbLIZ2.append(".code, ");
            sbLIZ2.append(c096h);
            sbLIZ2.append(".subCode, ");
            sbLIZ2.append(c096h);
            sbLIZ2.append(".msg");
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
            if (!this.LLILLJJLI.Yc(this.LLILLL, this.LLILZ)) {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("EditAutoCutComponent@9215.requestNLEModel$3");
                return unit3;
            }
            C1417890n07 c1417890n07 = (C1417890n07) c096h;
            C1417330mzD.oc(this.LLILLJJLI, c1417890n07.LIZ, c1417890n07.LIZJ, this.LLILLL, this.LLILZ, c1417890n07.LIZIZ, null);
        } else if (c096h instanceof C096G) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("EditAutoCutComponent requestNLEModel onFailure: urs=");
            C096G c096g = (C096G) c096h;
            sbLIZ3.append(c096g.LIZ);
            sbLIZ3.append(", ");
            sbLIZ3.append(c096g.LIZIZ);
            sbLIZ3.append(", ");
            sbLIZ3.append(c096g.LIZJ);
            sbLIZ3.append(" extraParams=");
            sbLIZ3.append(c096g.LIZLLL);
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ3));
            if (!this.LLILLJJLI.Yc(this.LLILLL, this.LLILZ)) {
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("EditAutoCutComponent@9215.requestNLEModel$3");
                return unit4;
            }
            if (c096g.LIZIZ != SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue()) {
                C1417330mzD.oc(this.LLILLJJLI, c096g.LIZIZ, c096g.LIZJ, this.LLILLL, this.LLILZ, Integer.MIN_VALUE, null);
            } else {
                C1417710mzp.LJIJI("source_switch", c096g.LIZ, c096g.LIZIZ, c096g.LIZJ, c096g.LIZLLL, null);
                C1417330mzD c1417330mzD2 = this.LLILLJJLI;
                int i = c1417330mzD2.LLZZZZ;
                c1417330mzD2.LLZZZZ = i + 1;
                C2286608xc.LJ(i);
            }
        } else if (c096h instanceof C23149095f) {
            C23149095f c23149095f = (C23149095f) c096h;
            this.LLILLJJLI.he(c23149095f.LIZ, this.LLILLL, this.LLILZ, c23149095f.LIZIZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI);
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("EditAutoCutComponent@9215.requestNLEModel$3");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C096H c096h, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c096h, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
