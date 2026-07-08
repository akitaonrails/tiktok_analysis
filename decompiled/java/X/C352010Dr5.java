package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dr5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.VOLogicComponent$prepareSaving$1", f = "VOApiComponent.kt", l = {605}, m = "invokeSuspend")
public final class C352010Dr5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ InterfaceC352140DrI LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C0EZ9 LLILZIL;
    public final /* synthetic */ AudioRecorderParam LLILZLL;
    public final /* synthetic */ AudioRecorderParam LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352010Dr5(boolean z, InterfaceC352140DrI interfaceC352140DrI, boolean z2, C0EZ9 c0ez9, AudioRecorderParam audioRecorderParam, AudioRecorderParam audioRecorderParam2, InterfaceC1364105Vn<? super C352010Dr5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = interfaceC352140DrI;
        this.LLILZ = z2;
        this.LLILZIL = c0ez9;
        this.LLILZLL = audioRecorderParam;
        this.LLIZ = audioRecorderParam2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352010Dr5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CoroutineContext coroutineContext;
        C1C7U.LIZ("VOLogicComponent@4430.prepareSaving$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                C1DFH c1dfh = C0PEM.LIZ;
                coroutineContext = C2107308Nj.LIZ;
            } else {
                coroutineContext = C0PEM.LIZJ;
            }
            C352120DrG c352120DrG = new C352120DrG(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, coroutineContext, c352120DrG) == objLJFF) {
                C1C7U.LIZIZ("VOLogicComponent@4430.prepareSaving$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VOLogicComponent@4430.prepareSaving$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
