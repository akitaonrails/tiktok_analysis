package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.image.bottombar.CommentImageEditBottomBarComponent$saveAction$2", f = "CommentImageEditBottomBarComponent.kt", l = {269}, m = "invokeSuspend")
public final class C0NTG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AnonymousClass0956 LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1451860nsu LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NTG(C1451860nsu c1451860nsu, boolean z, InterfaceC1364105Vn<? super C0NTG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1451860nsu;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NTG c0ntg = new C0NTG(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0ntg.LLILLL = obj;
        return c0ntg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        AnonymousClass0956 anonymousClass0956LIZLLL;
        C1C7U.LIZ("CommentImageEditBottomBarComponent@a28c.saveAction$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                anonymousClass0956LIZLLL = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0NTH(this.LLILZ, this.LLILZIL, null), 3);
            this.LLILLL = interfaceC497601wk;
            this.LL = anonymousClass0956LIZLLL;
            this.LLILLJJLI = 1;
            if (AnonymousClass0958.LIZIZ(60000L, this) == objLJFF) {
                C1C7U.LIZIZ("CommentImageEditBottomBarComponent@a28c.saveAction$2");
                return objLJFF;
            }
        }
        if (C2296808zG.LJI(interfaceC497601wk) && !anonymousClass0956LIZLLL.isCompleted() && !anonymousClass0956LIZLLL.isCancelled()) {
            C0FNV.LIZ(this.LLILZ.t5());
            anonymousClass0956LIZLLL.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CommentImageEditBottomBarComponent@a28c.saveAction$2");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CommentImageEditBottomBarComponent@a28c.saveAction$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
