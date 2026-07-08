package X;

import com.ss.android.ugc.aweme.feed.consume.FollowingFeedConsumeMonitorConfigModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0Vi4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.consume.FollowingFeedConsumeMonitorService$initService$1$1", f = "FollowingFeedConsumeMonitorService.kt", l = {49}, m = "invokeSuspend")
public final class C805060Vi4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C805060Vi4(InterfaceC1364105Vn<? super C805060Vi4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C805060Vi4(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingFeedConsumeMonitorService@d6f6.initService$1$1");
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
            C805030Vi1.LIZ.getClass();
            IntRange intRange = new IntRange(1, ((FollowingFeedConsumeMonitorConfigModel) C805030Vi1.LIZJ.getValue()).days);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRange, 10));
            C531650Kt9 it2 = intRange.iterator();
            while (it2.LLILLL) {
                int iNextInt = it2.nextInt();
                C805030Vi1.LIZ.getClass();
                arrayList.add(C23250099c.LIZIZ((InterfaceC497601wk) C805030Vi1.LIZLLL.getValue(), null, null, new C805050Vi3(iNextInt, null), 3));
            }
            this.LL = 1;
            if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                C1C7U.LIZIZ("FollowingFeedConsumeMonitorService@d6f6.initService$1$1");
                return objLJFF;
            }
        }
        C805030Vi1.LIZ.getClass();
        long jLongValue = ((Number) C805030Vi1.LIZIZ(1).getSecond()).longValue();
        InterfaceC805040Vi2 interfaceC805040Vi2LIZ = C805030Vi1.LIZ();
        if (interfaceC805040Vi2LIZ != null) {
            interfaceC805040Vi2LIZ.LIZJ(jLongValue, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingFeedConsumeMonitorService@d6f6.initService$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C805060Vi4(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
