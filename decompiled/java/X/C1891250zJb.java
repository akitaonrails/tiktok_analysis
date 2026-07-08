package X;

import com.ss.android.ugc.aweme.emojisticker.api.model.StickerInteractionDetailsInsertion;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.emojisticker.interactiveemoji.service.InteractiveEmojiReactionManager$initPowerList$1$onRefresh$1", f = "InteractiveEmojiReactionManager.kt", l = {113}, m = "invokeSuspend")
public final class C1891250zJb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1364105Vn LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Long>> LLILLL;
    public final /* synthetic */ C1891750zKP LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1891250zJb(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn, C1891750zKP c1891750zKP, InterfaceC1364105Vn<? super C1891250zJb> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = interfaceC1364105Vn;
        this.LLILZ = c1891750zKP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1891250zJb(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1364105Vn<AbstractC316870CbV<Long>> interfaceC1364105Vn;
        C1C7U.LIZ("InteractiveEmojiReactionManager@dd94.initPowerList$1$onRefresh$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                interfaceC1364105Vn = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC1364105Vn = this.LLILLL;
            C1891750zKP c1891750zKP = this.LLILZ;
            if (c1891750zKP.LIZLLL == 5) {
                C1891790zKT c1891790zKTLIZJ = c1891750zKP.LIZJ();
                List<StickerInteractionDetailsInsertion> list = this.LLILZ.LJIIIZ;
                this.LL = interfaceC1364105Vn;
                this.LLILLJJLI = 1;
                obj = c1891790zKTLIZJ.LIZIZ(0L, 20L, list, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("InteractiveEmojiReactionManager@dd94.initPowerList$1$onRefresh$1");
                    return objLJFF;
                }
            } else {
                obj = c1891750zKP.LIZJ().LIZ(this.LLILZ.LJIIIZ, 0L);
            }
        }
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InteractiveEmojiReactionManager@dd94.initPowerList$1$onRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
