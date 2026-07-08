package X;

import com.ss.android.ugc.aweme.im.activestatus.api.model.ActivityStatus;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.065p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.im.activestatus.push.ActivityStatusInAppPushHandler$acceptMessage$1", f = "ActivityStatusInAppPushHandler.kt", l = {99}, m = "invokeSuspend")
public final class C15515065p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C896420ZEq LLILLJJLI;
    public final /* synthetic */ ActivityStatus LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15515065p(C896420ZEq c896420ZEq, ActivityStatus activityStatus, InterfaceC1364105Vn<? super C15515065p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c896420ZEq;
        this.LLILLL = activityStatus;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15515065p(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusInAppPushHandler@980e.acceptMessage$1");
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
            C05YC<List<C0NXK>> c05yc = this.LLILLJJLI.LLILLJJLI;
            ActivityStatus activityStatus = this.LLILLL;
            List<C0NXK> listSingletonList = Collections.singletonList(new C0NXK(activityStatus.userID, activityStatus.activeTime, activityStatus.inactiveTime));
            this.LL = 1;
            if (c05yc.emit(listSingletonList, this) == objLJFF) {
                C1C7U.LIZIZ("ActivityStatusInAppPushHandler@980e.acceptMessage$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusInAppPushHandler@980e.acceptMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
