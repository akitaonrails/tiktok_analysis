package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HeB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.end.weakcontainer.components.RankingWeakContainerComponent$setupAvatarDelegate$2", f = "RankingWeakContainerComponent.kt", l = {127, 128}, m = "invokeSuspend")
public final class C445930HeB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1337250ku3 LLILLJJLI;
    public final /* synthetic */ C1295960jpS LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ AtomicReference<Bitmap> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445930HeB(C1337250ku3 c1337250ku3, C1295960jpS c1295960jpS, String str, int i, int i2, float f, AtomicReference<Bitmap> atomicReference, InterfaceC1364105Vn<? super C445930HeB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1337250ku3;
        this.LLILLL = c1295960jpS;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = f;
        this.LLIZLLLIL = atomicReference;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C445930HeB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RankingWeakContainerComponent@3a78.setupAvatarDelegate$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("RankingWeakContainerComponent@3a78.setupAvatarDelegate$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1337250ku3 c1337250ku3 = this.LLILLJJLI;
            Context context = this.LLILLL.getContext();
            String str = this.LLILZ;
            int i2 = this.LLILZIL;
            int i3 = this.LLILZLL;
            this.LL = 1;
            obj = c1337250ku3.LJIILLIIL(context, str, i2, i3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RankingWeakContainerComponent@3a78.setupAvatarDelegate$2");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C445920HeA c445920HeA = new C445920HeA(this.LLIZLLLIL, (Bitmap) obj, this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c445920HeA) == objLJFF) {
            C1C7U.LIZIZ("RankingWeakContainerComponent@3a78.setupAvatarDelegate$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RankingWeakContainerComponent@3a78.setupAvatarDelegate$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
