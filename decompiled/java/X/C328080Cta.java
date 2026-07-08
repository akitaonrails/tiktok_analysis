package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.CreateInfoCache$preRequest$2", f = "CreateInfoCache.kt", l = {192}, m = "invokeSuspend")
public final class C328080Cta extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0UPM>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328080Cta(String str, boolean z, InterfaceC1364105Vn<? super C328080Cta> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C328080Cta c328080Cta = new C328080Cta(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c328080Cta.LLILLJJLI = obj;
        return c328080Cta;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateInfoCache@cc22.preRequest$2");
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
            if (C0UON.LIZIZ == null) {
                C0UON.LIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C0UPP(this.LLILLL, this.LLILZ, null), 3);
            }
            this.LL = 1;
            obj = C2296808zG.LJ(new C328070CtZ(null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CreateInfoCache@cc22.preRequest$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CreateInfoCache@cc22.preRequest$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0UPM> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
