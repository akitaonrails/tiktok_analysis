package X;

import com.ss.android.ugc.profile.business.effect.StickerItemList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.EffectProfileListRepository$refreshCommon$1$1$stickerItemListDeferred$1", f = "EffectProfileListRepository.kt", l = {51}, m = "invokeSuspend")
public final class C317970CdH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends StickerItemList>>, Object> {
    public int LL;
    public final /* synthetic */ C318050CdP LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317970CdH(C318050CdP c318050CdP, InterfaceC1364105Vn<? super C317970CdH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c318050CdP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317970CdH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZLLL;
        C1C7U.LIZ("EffectProfileListRepository@4ea9.refreshCommon$1$1$stickerItemListDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZLLL = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C318050CdP c318050CdP = this.LLILLJJLI;
            this.LL = 1;
            objLIZLLL = c318050CdP.LIZLLL(this);
            if (objLIZLLL == objLJFF) {
                C1C7U.LIZIZ("EffectProfileListRepository@4ea9.refreshCommon$1$1$stickerItemListDeferred$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZLLL);
        C1C7U.LIZIZ("EffectProfileListRepository@4ea9.refreshCommon$1$1$stickerItemListDeferred$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends StickerItemList>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
