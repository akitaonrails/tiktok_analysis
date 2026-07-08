package X;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YZG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.innerpush.workflow.IMInnerPushLocalCompensationProcessor$tryReviewMsgWhichShouldHaveShownAsInnerPush$1", f = "IMInnerPushLocalCompensationProcessor.kt", l = {95}, m = "invokeSuspend")
public final class C0YZG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C876390YZp LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YZG(long j, C876390YZp c876390YZp, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c876390YZp;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YZG(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        C1C7U.LIZ("IMInnerPushLocalCompensationProcessor@8d0b.tryReviewMsgWhichShouldHaveShownAsInnerPush$1");
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
            this.LLILLJJLI.LIZ.LIZJ.LIZIZ = SystemClock.elapsedRealtime() - C202094145s.LJ;
            long j = this.LLILLL;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("IMInnerPushLocalCompensationProcessor@8d0b.tryReviewMsgWhichShouldHaveShownAsInnerPush$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.getClass();
        if (!C1906580ziK.LIZ && C1906580ziK.LJI()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMInnerPushLocalCompensationProcessor@8d0b.tryReviewMsgWhichShouldHaveShownAsInnerPush$1");
            return unit;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.LLILLJJLI.LIZ.LJFF.LIZ().getLong("index_of_latest_message_consumed_by_push", Long.MIN_VALUE);
        C0YNY c0yny = InterfaceC874680YTa.LIZ;
        Long lLJFF = C2286608xc.LJFF(C0YNY.LIZ(c0yny).LJII());
        long jLongValue2 = lLJFF.longValue();
        if (jLongValue2 != 0 && jLongValue2 > j2) {
            jLongValue = lLJFF.longValue();
        } else {
            jLongValue = j2;
        }
        if (j2 != Long.MIN_VALUE && jLongValue > j2) {
            this.LLILLJJLI.LIZIZ.invoke(C0YNY.LIZ(c0yny).LJFF(j2, Long.MAX_VALUE, C2286608xc.LJ(50), true, null, false, false), C2286608xc.LJ(C0YNY.LIZ(c0yny).LJJ(j2, jLongValue, "", true) - 1), C2286608xc.LJFF(jElapsedRealtime));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("IMInnerPushLocalCompensationProcessor@8d0b.tryReviewMsgWhichShouldHaveShownAsInnerPush$1");
            return unit2;
        }
        this.LLILLJJLI.LIZIZ.invoke(C13BV.INSTANCE, C2286608xc.LJ(0), C2286608xc.LJFF(jElapsedRealtime));
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("IMInnerPushLocalCompensationProcessor@8d0b.tryReviewMsgWhichShouldHaveShownAsInnerPush$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
