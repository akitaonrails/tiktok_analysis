package X;

import com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent$setUpHeartbeatTimer$1$1", f = "BaseInterestSelectionComponent.kt", l = {728}, m = "invokeSuspend")
public final class C1326405Ha extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ BaseInterestSelectionComponent LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1326405Ha(int i, BaseInterestSelectionComponent baseInterestSelectionComponent, InterfaceC1364105Vn<? super C1326405Ha> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = baseInterestSelectionComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1326405Ha c1326405Ha = new C1326405Ha(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1326405Ha.LLILLJJLI = obj;
        return c1326405Ha;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0031 -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "BaseInterestSelectionComponent@f1ee.setUpHeartbeatTimer$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 1
            if (r0 == 0) goto L37
            if (r0 != r5) goto L45
            java.lang.Object r0 = r8.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            X.C155000ia.LIZIZ(r9)
        L17:
            com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent r1 = r8.LLILZ
            r1.oS(r5)
        L1c:
            boolean r1 = X.C2296808zG.LJI(r0)
            if (r1 == 0) goto L3f
            int r1 = r8.LLILLL
            long r3 = (long) r1
            r1 = 1000(0x3e8, float:1.401E-42)
            long r1 = (long) r1
            long r3 = r3 * r1
            r8.LLILLJJLI = r0
            r8.LL = r5
            java.lang.Object r1 = X.AnonymousClass0958.LIZIZ(r3, r8)
            if (r1 != r6) goto L17
            X.C1C7U.LIZIZ(r7)
            return r6
        L37:
            X.C155000ia.LIZIZ(r9)
            java.lang.Object r0 = r8.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            goto L1c
        L3f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1326405Ha.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
