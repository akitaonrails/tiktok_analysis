package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05gQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.CreatorCareModeSheetUtil$changeFilterAllExpiredStatusSuspend$2", f = "CreatorCareModeSheetUtil.kt", l = {130}, m = "invokeSuspend")
public final class C1415605gQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public int LL;

    public C1415605gQ(InterfaceC1364105Vn<? super C1415605gQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1415605gQ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorCareModeSheetUtil@dd8b.changeFilterAllExpiredStatusSuspend$2");
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
            C1415405gO c1415405gO = new C1415405gO(null);
            this.LL = 1;
            obj = C2296808zG.LJ(c1415405gO, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CreatorCareModeSheetUtil@dd8b.changeFilterAllExpiredStatusSuspend$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CreatorCareModeSheetUtil@dd8b.changeFilterAllExpiredStatusSuspend$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return new C1415605gQ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
