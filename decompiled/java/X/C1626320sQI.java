package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.slideslip.fullwidthhorizontal.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import njp.a;

/* JADX INFO: renamed from: X.0sQI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthEffectCarouselComponent$effectContainerMob$1", f = "FullWidthEffectCarouselComponent.kt", l = {}, m = "invokeSuspend")
public final class C1626320sQI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ o LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626320sQI(String str, o oVar, InterfaceC1364105Vn<? super C1626320sQI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = oVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626320sQI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthEffectCarouselComponent@e1ee.effectContainerMob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C123100dR.LIZ(this.LL)) {
            this.LLILLJJLI.getShortVideoContext().showStickerMode = this.LL;
        }
        C1449210nod c1449210nod = C1449210nod.LIZ;
        ShortVideoContext shortVideoContext = this.LLILLJJLI.getShortVideoContext();
        q qVarYq = this.LLILLJJLI.yq();
        boolean zLJFF = Intrinsics.LJFF(this.LLILLJJLI.iq().ec().LIZJ(), true);
        String str = this.LLILLJJLI.getShortVideoContext().showStickerMode;
        c1449210nod.getClass();
        C1449210nod.LIZ(shortVideoContext, qVarYq, zLJFF, str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.effectContainerMob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
