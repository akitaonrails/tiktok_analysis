package X;

import com.bytedance.touchpoint.api.model.ProgressInfo;
import com.bytedance.touchpoint.api.model.TimeInfo;
import com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager;
import com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zV3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898350zV3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ BaseTimerPendantManager<Object> LL;
    public final /* synthetic */ TimeInfo LLILLJJLI;
    public final /* synthetic */ ProgressInfo LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1898350zV3(ProgressInfo progressInfo, TimeInfo timeInfo, BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager, boolean z) {
        super(0);
        this.LL = baseTaskEventTimerPendantManager;
        this.LLILLJJLI = timeInfo;
        this.LLILLL = progressInfo;
        this.LLILZ = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f A[PHI: r4
      0x000f: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:7:0x000d, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0zV7] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r8 = this;
            com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager<java.lang.Object> r3 = r8.LL
            com.bytedance.touchpoint.api.model.TimeInfo r2 = r8.LLILLJJLI
            java.lang.String r5 = ""
            if (r2 == 0) goto Lc
            java.lang.String r4 = r2.lottieName
            if (r4 != 0) goto Lf
        Lc:
            r4 = r5
            if (r2 == 0) goto L14
        Lf:
            java.lang.String r0 = r2.animationLottieName
            if (r0 == 0) goto L14
            r5 = r0
        L14:
            X.0zV7 r6 = new X.0zV7
            com.bytedance.touchpoint.api.model.ProgressInfo r1 = r8.LLILLL
            boolean r0 = r8.LLILZ
            r6.<init>()
            r3.getClass()
            kotlin.jvm.internal.AwS37S2200000_28 r2 = new kotlin.jvm.internal.AwS37S2200000_28
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            X.C01U6.LIZIZ(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1898350zV3.invoke():java.lang.Object");
    }
}
