package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0D2J, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.im.core.client.DefaultSendMessageQueue$handleNetworkRequest$result$1", f = "DefaultSendMessageQueue.kt", l = {149}, m = "invokeSuspend")
public final class C0D2J<T> extends C09AX implements Function1<InterfaceC1364105Vn<? super T>, Object> {
    public int LL;
    public final /* synthetic */ C0D2I<T> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C0D2H<T> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D2J(C0D2I<T> c0d2i, int i, long j, C0D2H<T> c0d2h, InterfaceC1364105Vn<? super C0D2J> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c0d2i;
        this.LLILLL = i;
        this.LLILZ = j;
        this.LLILZIL = c0d2h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D2J(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((a) create((InterfaceC1364105Vn) obj)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DefaultSendMessageQueue@501f.handleNetworkRequest$result$1");
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
            C868780Y6i c868780Y6iLIZLLL = this.LLILLJJLI.LIZIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Handling network request on ");
            sbLIZ.append(this.LLILLL + 1);
            sbLIZ.append(" attempt after ");
            sbLIZ.append(this.LLILZ);
            sbLIZ.append(" delay");
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "DefaultSendMessageQueue", C2188811AlT.LIZIZ(sbLIZ), 4);
            C0D2H<T> c0d2h = this.LLILZIL;
            this.LL = 1;
            c0d2h.LJ.incrementAndGet();
            obj = C23250099c.LJI(this, c0d2h.LIZIZ, new C0CTG(c0d2h, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultSendMessageQueue@501f.handleNetworkRequest$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultSendMessageQueue@501f.handleNetworkRequest$result$1");
        return obj;
    }
}
