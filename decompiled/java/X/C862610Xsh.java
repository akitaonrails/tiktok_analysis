package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xsh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$resolveMessagesGapsAndCheckMissing$2", f = "DefaultIMUseCaseCenter.kt", l = {729}, m = "invokeSuspend")
public final class C862610Xsh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C863650XuN LLILLL;
    public final /* synthetic */ C0YL9 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862610Xsh(boolean z, C863650XuN c863650XuN, C0YL9 c0yl9, InterfaceC1364105Vn<? super C862610Xsh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c863650XuN;
        this.LLILZ = c0yl9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862610Xsh(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.resolveMessagesGapsAndCheckMissing$2");
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
                this.LLILLL.LLILZIL.LJJ().LIZLLL();
            }
            InterfaceC862620Xsi interfaceC862620XsiLJJ = this.LLILLL.LLILZIL.LJJ();
            C0YL9 c0yl9 = this.LLILZ;
            this.LL = 1;
            if (interfaceC862620XsiLJJ.LIZJ(c0yl9, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.resolveMessagesGapsAndCheckMissing$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.resolveMessagesGapsAndCheckMissing$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
