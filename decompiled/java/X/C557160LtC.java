package X;

import Y.AgS289S0100000_8;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ailivephoto.AILivePhotoRestoreTaskHandler$retryTask$1", f = "AILivePhotoRestoreTaskHandler.kt", l = {98, 101}, m = "invokeSuspend")
public final class C557160LtC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ICreationAsyncTaskManager LLILLJJLI;
    public final /* synthetic */ C557190LtF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C557160LtC(ICreationAsyncTaskManager iCreationAsyncTaskManager, C557190LtF c557190LtF, InterfaceC1364105Vn<? super C557160LtC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iCreationAsyncTaskManager;
        this.LLILLL = c557190LtF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C557160LtC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILivePhotoRestoreTaskHandler@7924.retryTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AILivePhotoRestoreTaskHandler@7924.retryTask$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ICreationAsyncTaskManager iCreationAsyncTaskManager = this.LLILLJJLI;
            String str = this.LLILLL.LIZ;
            this.LL = 1;
            obj = iCreationAsyncTaskManager.LIZJ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AILivePhotoRestoreTaskHandler@7924.retryTask$1");
                return objLJFF;
            }
        }
        C0LSZ c0lsz = (C0LSZ) obj;
        if (c0lsz == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AILivePhotoRestoreTaskHandler@7924.retryTask$1");
            return unit2;
        }
        this.LLILLJJLI.LJJIJ(c0lsz.LIZ, this.LLILLL.LIZIZ);
        InterfaceC346201Wa<C0LSZ> interfaceC346201WaLJJJJL = this.LLILLJJLI.LJJJJL(c0lsz.LIZ);
        AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(this.LLILLL, 9);
        this.LL = 2;
        if (interfaceC346201WaLJJJJL.collect(agS289S0100000_8, this) == objLJFF) {
            C1C7U.LIZIZ("AILivePhotoRestoreTaskHandler@7924.retryTask$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoRestoreTaskHandler@7924.retryTask$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
