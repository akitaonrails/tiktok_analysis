package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.CreatorCareModeSheetUtil$changeFilterAllExpiredStatusSuspend$2$1", f = "CreatorCareModeSheetUtil.kt", l = {137}, m = "invokeSuspend")
public final class C1415405gO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C1415405gO(InterfaceC1364105Vn<? super C1415405gO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1415405gO c1415405gO = new C1415405gO(interfaceC1364105Vn);
        c1415405gO.LLILLJJLI = obj;
        return c1415405gO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorCareModeSheetUtil@dd8b.changeFilterAllExpiredStatusSuspend$2$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            AnonymousClass0957[] anonymousClass0957Arr = {C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1415305gN(null), 3), C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1415505gP(null), 3)};
            this.LL = 1;
            if (C1D9F.LIZIZ(anonymousClass0957Arr, this) == objLJFF) {
                C1C7U.LIZIZ("CreatorCareModeSheetUtil@dd8b.changeFilterAllExpiredStatusSuspend$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(unit);
        C1C7U.LIZIZ("CreatorCareModeSheetUtil@dd8b.changeFilterAllExpiredStatusSuspend$2$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
