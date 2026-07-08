package X;

import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsSharedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsSharedViewModel$onInvitationAccomplished$1", f = "MyMomentsSharedViewModel.kt", l = {107}, m = "invokeSuspend")
public final class C1198280hHu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ MyMomentsSharedViewModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1198280hHu(String str, String str2, String str3, MyMomentsSharedViewModel myMomentsSharedViewModel, InterfaceC1364105Vn<? super C1198280hHu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = myMomentsSharedViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1198280hHu(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[Catch: Exception -> 0x0095, TRY_LEAVE, TryCatch #0 {Exception -> 0x0095, blocks: (B:13:0x005f, B:14:0x0062, B:16:0x0068, B:18:0x006e, B:19:0x0076), top: B:26:0x005f }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "MyMomentsSharedViewModel@7ad7.onInvitationAccomplished$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r10.LLILLJJLI
            r5 = 0
            r7 = 1
            if (r0 == 0) goto L1e
            if (r0 != r7) goto L16
            java.lang.Object r3 = r10.LL
            java.lang.String r3 = (java.lang.String) r3
            goto L5f
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.C155000ia.LIZIZ(r11)
            java.lang.String r1 = "ttls_rd_add_poi_campaign_experience_track"
            java.lang.String r0 = "invite_success_api"
            java.lang.String r3 = X.C2177408g0.LIZ(r1, r0, r5)
            X.0hKf r0 = X.C1200000hKg.LIZIZ(r3)
            r0.start()
            com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsInvitingRequest r6 = new com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsInvitingRequest     // Catch: java.lang.Exception -> L93
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.Integer r4 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> L93
            java.lang.String r2 = r10.LLILLL     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = r10.LLILZ     // Catch: java.lang.Exception -> L93
            java.lang.String r0 = r10.LLILZIL     // Catch: java.lang.Exception -> L93
            r6.<init>(r4, r2, r1, r0)     // Catch: java.lang.Exception -> L93
            com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsSharedViewModel r0 = r10.LLILZLL     // Catch: java.lang.Exception -> L93
            X.09R9 r0 = r0.LL     // Catch: java.lang.Exception -> L93
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L93
            X.0SvR r0 = (X.InterfaceC736910SvR) r0     // Catch: java.lang.Exception -> L93
            X.00hg r0 = r0.getOperator()     // Catch: java.lang.Exception -> L93
            X.0hI0 r0 = (X.InterfaceC1198340hI0) r0     // Catch: java.lang.Exception -> L93
            r10.LL = r3     // Catch: java.lang.Exception -> L93
            r10.LLILLJJLI = r7     // Catch: java.lang.Exception -> L93
            java.lang.Object r11 = r0.postInvitationData(r6, r10)     // Catch: java.lang.Exception -> L93
            if (r11 != r8) goto L62
            X.C1C7U.LIZIZ(r9)
            return r8
        L5f:
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Exception -> L95
        L62:
            com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsInvitingResponse r11 = (com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsInvitingResponse) r11     // Catch: java.lang.Exception -> L95
            java.lang.Integer r0 = r11.statusCode     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L76
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L95
            if (r0 != 0) goto L76
            X.0hKf r0 = X.C1200000hKg.LIZIZ(r3)     // Catch: java.lang.Exception -> L95
            r0.LJJ(r5)     // Catch: java.lang.Exception -> L95
            goto La3
        L76:
            X.0hKf r2 = X.C1200000hKg.LIZIZ(r3)     // Catch: java.lang.Exception -> L95
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L95
            java.lang.String r0 = "net_server_"
            r1.append(r0)     // Catch: java.lang.Exception -> L95
            java.lang.Integer r0 = r11.statusCode     // Catch: java.lang.Exception -> L95
            r1.append(r0)     // Catch: java.lang.Exception -> L95
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L95
            r2.LJIJI(r0)     // Catch: java.lang.Exception -> L95
            r2.LJJIFFI()     // Catch: java.lang.Exception -> L95
            goto La3
        L93:
            r1 = move-exception
            goto L96
        L95:
            r1 = move-exception
        L96:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0hKf r0 = X.C1200000hKg.LIZIZ(r3)
            r0.LJJI(r1)
            r0.LJJIFFI()
        La3:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1198280hHu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
