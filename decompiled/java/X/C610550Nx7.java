package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nx7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.avatar.StoryUserRelationServiceImpl$markDislike$1", f = "StoryUserRelationServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C610550Nx7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610550Nx7(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610550Nx7(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryUserRelationServiceImpl@f7e1.markDislike$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean zLJJIII = C614770O9j.LIZIZ.LJ().LJJIII(this.LLILLJJLI, this.LL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markDislike: success=");
        sbLIZ.append(zLJJIII);
        C2188811AlT.LIZIZ(sbLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryUserRelationServiceImpl@f7e1.markDislike$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
