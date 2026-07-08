package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qLG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546320qLG extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1546290qLD LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1546340qLI LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C013C LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546320qLG(String str, C1546290qLD c1546290qLD, long j, String str2, C1546340qLI c1546340qLI, String str3, C013C c013c) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c1546290qLD;
        this.LLILLL = j;
        this.LLILZ = str2;
        this.LLILZIL = c1546340qLI;
        this.LLILZLL = str3;
        this.LLIZ = c013c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r5 = (com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams) r5
            java.lang.String r1 = "step"
            java.lang.String r0 = "load_Finish"
            r5.plusAssign(r1, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r5.plusAssign(r0, r1)
            java.lang.String r1 = "current_url"
            java.lang.String r0 = r4.LL
            r5.plusAssign(r1, r0)
            X.0qLD r0 = r4.LLILLJJLI
            X.0qMx r0 = r0.LIZLLL
            if (r0 == 0) goto L69
            long r2 = r0.LLILZIL
        L25:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r2
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration"
            r5.plusAssign(r0, r1)
            java.lang.String r1 = "resourse_type"
            java.lang.String r0 = r4.LLILZ
            r5.plusAssign(r1, r0)
            X.0qLI r0 = r4.LLILZIL
            if (r0 == 0) goto L67
            boolean r1 = r0.LIZIZ
            r0 = 1
            if (r1 != r0) goto L67
        L43:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "predecode"
            r5.plusAssign(r0, r1)
            java.lang.String r1 = r4.LLILZLL
            if (r1 != 0) goto L52
            java.lang.String r1 = ""
        L52:
            java.lang.String r0 = "pid"
            r5.plusAssign(r0, r1)
            X.013C r0 = r4.LLIZ
            boolean r0 = r0.element
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "pre_create"
            r5.plusAssign(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L67:
            r0 = 0
            goto L43
        L69:
            long r2 = r4.LLILLL
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1546320qLG.invoke(java.lang.Object):java.lang.Object");
    }
}
