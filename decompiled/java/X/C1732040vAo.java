package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS1S2301000_26;
import kotlin.jvm.internal.AwS22S1201000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.EffectBillboardDisplayHelper$cancelBillboard$1", f = "EffectBillboardDisplayHelper.kt", l = {153}, m = "invokeSuspend")
public final class C1732040vAo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EffectRootData LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ InterfaceC1731950vAf LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732040vAo(EffectRootData effectRootData, String str, int i, String str2, InterfaceC1731950vAf interfaceC1731950vAf, InterfaceC1364105Vn<? super C1732040vAo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = effectRootData;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = str2;
        this.LLIZ = interfaceC1731950vAf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1732040vAo c1732040vAo = new C1732040vAo(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1732040vAo.LLILLJJLI = obj;
        return c1732040vAo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectBillboardDisplayHelper@c417.cancelBillboard$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1732020vAm c1732020vAm = C1732020vAm.LIZ;
            EffectRootData effectRootData = this.LLILLL;
            AwS1S2301000_26 awS1S2301000_26 = new AwS1S2301000_26(effectRootData, interfaceC497601wk, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, 1);
            AwS22S1201000_26 awS22S1201000_26 = new AwS22S1201000_26(interfaceC497601wk, this.LLILZ, this.LLILZIL, this.LLIZ, 2);
            this.LL = 1;
            if (c1732020vAm.LIZLLL(effectRootData, awS1S2301000_26, awS22S1201000_26, this) == objLJFF) {
                C1C7U.LIZIZ("EffectBillboardDisplayHelper@c417.cancelBillboard$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectBillboardDisplayHelper@c417.cancelBillboard$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
