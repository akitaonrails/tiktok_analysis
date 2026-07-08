package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.144A, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.livephoto.BaseLivePhotoComponent$realTakeLivePhoto$2", f = "BaseLivePhotoComponent.kt", l = {285}, m = "invokeSuspend")
public final class C144A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC2180011ATn<T> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C144A(AbstractC2180011ATn<T> abstractC2180011ATn, InterfaceC1364105Vn<? super C144A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC2180011ATn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C144A c144a = new C144A(this.LLILLL, interfaceC1364105Vn);
        c144a.LLILLJJLI = obj;
        return c144a;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseLivePhotoComponent@401f.realTakeLivePhoto$2");
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
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, C0PEM.LIZJ, null, new AnonymousClass1449(this.LLILLL, null), 2);
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseLivePhotoComponent@401f.realTakeLivePhoto$2");
                return objLJFF;
            }
        }
        if (((Number) obj).intValue() < 0) {
            AbstractC2180011ATn<T> abstractC2180011ATn = this.LLILLL;
            if (abstractC2180011ATn.LLJILJILJ == 0) {
                abstractC2180011ATn.LLJILJILJ = 3;
            }
            abstractC2180011ATn.o2().setOpen(false);
        }
        long jLJIIIIZZ = this.LLILLL.LLILZLL.LIZIZ.LJJJ.LJIIIIZZ("SegmentFrameTime");
        if (jLJIIIIZZ < 500000) {
            AbstractC2180011ATn<T> abstractC2180011ATn2 = this.LLILLL;
            if (abstractC2180011ATn2.LLJILJILJ == 0) {
                abstractC2180011ATn2.LLJILJILJ = 5;
            }
            abstractC2180011ATn2.o2().setOpen(false);
        }
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livephoto: duration ");
        sbLIZ.append(jLJIIIIZZ);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL.getClass();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
