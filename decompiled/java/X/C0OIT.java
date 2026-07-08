package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notification.api.EventExtra;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OIT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$reportBulletinEvent$1", f = "BulletinProfileViewModel.kt", l = {1671}, m = "invokeSuspend")
public final class C0OIT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinProfileViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C0OM6 LLILZ;
    public final /* synthetic */ C0ONE LLILZIL;
    public final /* synthetic */ List<EventExtra> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OIT(BulletinProfileViewModel bulletinProfileViewModel, long j, C0OM6 c0om6, C0ONE c0one, List<EventExtra> list, InterfaceC1364105Vn<? super C0OIT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinProfileViewModel;
        this.LLILLL = j;
        this.LLILZ = c0om6;
        this.LLILZIL = c0one;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OIT(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinProfileViewModel@3b06.reportBulletinEvent$1");
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
            C0OIU c0oiu = (C0OIU) this.LLILLJJLI.DQ2().getOperator();
            String strValueOf = String.valueOf(this.LLILLL);
            C0OM6 c0om6 = this.LLILZ;
            C0ONE c0one = this.LLILZIL;
            List<EventExtra> list = this.LLILZLL;
            this.LL = 1;
            if (c0oiu.LLILIL(strValueOf, c0om6, c0one, list, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinProfileViewModel@3b06.reportBulletinEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.reportBulletinEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
