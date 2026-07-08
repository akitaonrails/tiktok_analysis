package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1ANQ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.api.pages.preview.player.CameoPlayerScene$onActivityCreated$1$1$successState$1", f = "CameoPlayerScene.kt", l = {286}, m = "invokeSuspend")
public final class C1ANQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LN7<String>>, Object> {
    public int LL;
    public final /* synthetic */ C0LN8 LLILLJJLI;
    public final /* synthetic */ C1ANM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ANQ(C0LN8 c0ln8, C1ANM c1anm, InterfaceC1364105Vn<? super C1ANQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ln8;
        this.LLILLL = c1anm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1ANQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CameoPlayerScene@cabc.onActivityCreated$1$1$successState$1");
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
            C547860LeC.LIZ.getClass();
            C2189761An0 c2189761An0 = new C2189761An0(C547860LeC.LJ().LIZ(3, this.LLILLJJLI, this.LLILLL.LLLLILI().LIZ.LIZJ, this.LLILLL.LLLLILI().LIZ.LJ, ".mp4"), 2);
            this.LL = 1;
            obj = C09IC.LJIJI(c2189761An0, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CameoPlayerScene@cabc.onActivityCreated$1$1$successState$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CameoPlayerScene@cabc.onActivityCreated$1$1$successState$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LN7<String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
