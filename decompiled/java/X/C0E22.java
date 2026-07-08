package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E22, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.stickpoint.EditorProStickPointNLEHandler$startDefaultStickPoint$1", f = "EditorProStickPointNLEHandler.kt", l = {751, 767}, m = "invokeSuspend")
public final class C0E22 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C357990E1t LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ VEAlgorithmPath LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ AVMusic LLIZ;
    public final /* synthetic */ InterfaceC358010E1v LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E22(C357990E1t c357990E1t, String str, VEAlgorithmPath vEAlgorithmPath, int i, int i2, AVMusic aVMusic, InterfaceC358010E1v interfaceC358010E1v, InterfaceC1364105Vn<? super C0E22> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c357990E1t;
        this.LLILLL = str;
        this.LLILZ = vEAlgorithmPath;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = aVMusic;
        this.LLIZLLLIL = interfaceC358010E1v;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0E22(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPoint$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPoint$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            C1DFB c1dfb = C0PEM.LIZJ;
            C0E23 c0e23 = new C0E23(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c0e23);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPoint$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C0E24 c0e24 = new C0E24((Pair) objLJI, this.LLIZ, this.LLILLJJLI, this.LLIZLLLIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c0e24) == objLJFF) {
            C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPoint$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPoint$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
