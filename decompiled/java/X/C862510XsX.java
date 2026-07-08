package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XsX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$addMembers$1", f = "DefaultIMUseCaseCenter.kt", l = {403}, m = "invokeSuspend")
public final class C862510XsX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ C873240YNm LLILLL;
    public final /* synthetic */ InterfaceC867020Xzo<List<C0YAE>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862510XsX(C863650XuN c863650XuN, C873240YNm c873240YNm, InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo, InterfaceC1364105Vn<? super C862510XsX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = c873240YNm;
        this.LLILZ = interfaceC867020Xzo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862510XsX(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.addMembers$1");
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
            C873220YNk c873220YNkLJIIJ = this.LLILLJJLI.LLILZIL.LJIIJ();
            C873240YNm c873240YNm = this.LLILLL;
            InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo = this.LLILZ;
            this.LL = 1;
            if (c873220YNkLJIIJ.LIZIZ(c873240YNm, interfaceC867020Xzo, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.addMembers$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.addMembers$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
