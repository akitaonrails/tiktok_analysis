package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import njp.a;

/* JADX INFO: renamed from: X.0sQG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.EffectSourceComponent$effectContainerMob$1", f = "EffectSourceComponent.kt", l = {}, m = "invokeSuspend")
public final class C1626300sQG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1626480sQY LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626300sQG(C1626480sQY c1626480sQY, InterfaceC1364105Vn<? super C1626300sQG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1626480sQY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626300sQG(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectSourceComponent@ccfb.effectContainerMob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1449210nod c1449210nod = C1449210nod.LIZ;
        ShortVideoContext shortVideoContext = this.LL.getShortVideoContext();
        q qVarYq = this.LL.yq();
        boolean zLJFF = Intrinsics.LJFF(this.LL.iq().ec().LIZJ(), true);
        c1449210nod.getClass();
        C1449210nod.LIZ(shortVideoContext, qVarYq, zLJFF, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectSourceComponent@ccfb.effectContainerMob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
