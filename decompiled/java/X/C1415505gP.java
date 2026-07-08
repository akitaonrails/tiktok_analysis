package X;

import com.ss.android.ugc.aweme.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05gP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.CreatorCareModeSheetUtil$changeFilterAllExpiredStatusSuspend$2$1$expired$1", f = "CreatorCareModeSheetUtil.kt", l = {135}, m = "invokeSuspend")
public final class C1415505gP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse>, Object> {
    public int LL;

    public C1415505gP(InterfaceC1364105Vn<? super C1415505gP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1415505gP(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJII;
        C1C7U.LIZ("CreatorCareModeSheetUtil@dd8b.changeFilterAllExpiredStatusSuspend$2$1$expired$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJII = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
            C06TC c06tc = C06TC.NOT_ON;
            this.LL = 1;
            objLJII = c1888220zEi.LJII(c06tc, this);
            if (objLJII == objLJFF) {
                C1C7U.LIZIZ("CreatorCareModeSheetUtil@dd8b.changeFilterAllExpiredStatusSuspend$2$1$expired$1");
                return objLJFF;
            }
        }
        C155000ia.LIZIZ(objLJII);
        C1C7U.LIZIZ("CreatorCareModeSheetUtil@dd8b.changeFilterAllExpiredStatusSuspend$2$1$expired$1");
        return objLJII;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return new C1415505gP(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
