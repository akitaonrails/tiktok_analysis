package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Npg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C605940Npg extends C2217421BqW implements Function1<BulletinListResponse, Unit> {
    public C605940Npg(Object obj) {
        super(1, obj, C605910Npd.class, "updateInteractionAfterPoll", "updateInteractionAfterPoll(Lcom/ss/android/ugc/aweme/notice/repo/list/bean/BulletinListResponse;)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099 A[Catch: Exception -> 0x00a1, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a1, blocks: (B:3:0x000e, B:5:0x001d, B:6:0x0023, B:9:0x002f, B:11:0x0033, B:12:0x0042, B:14:0x0048, B:16:0x0060, B:17:0x0068, B:19:0x007c, B:21:0x0090, B:23:0x0099), top: B:28:0x000e }] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse r14) {
        /*
            r13 = this;
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse r14 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse) r14
            java.lang.Object r3 = r13.receiver
            X.0Npd r3 = (X.C605910Npd) r3
            r3.getClass()
            java.lang.String r0 = "BulletinItemListPeriodicRequestHandler is receive."
            X.C0OPX.LJII(r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> La1
            r2.<init>()     // Catch: java.lang.Exception -> La1
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.LJIIJ     // Catch: java.lang.Exception -> La1
            r2.putAll(r0)     // Catch: java.lang.Exception -> La1
            java.lang.String r1 = "status_code"
            r12 = 0
            if (r14 == 0) goto L2b
            int r0 = r14.statusCode     // Catch: java.lang.Exception -> La1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> La1
        L23:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> La1
            r2.put(r1, r0)     // Catch: java.lang.Exception -> La1
            goto L2d
        L2b:
            r0 = r12
            goto L23
        L2d:
            if (r14 == 0) goto L99
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem> r1 = r14.bulletinItems     // Catch: java.lang.Exception -> La1
            if (r1 == 0) goto L99
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> La1
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)     // Catch: java.lang.Exception -> La1
            r4.<init>(r0)     // Catch: java.lang.Exception -> La1
            java.util.Iterator r5 = r1.iterator()     // Catch: java.lang.Exception -> La1
        L42:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Exception -> La1
            if (r0 == 0) goto L7c
            java.lang.Object r10 = r5.next()     // Catch: java.lang.Exception -> La1
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem r10 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem) r10     // Catch: java.lang.Exception -> La1
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEvent r6 = new com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEvent     // Catch: java.lang.Exception -> La1
            X.0Nph r0 = X.EnumC605950Nph.CHANNEL_LIST_EVENT_TYPE_UPDATE_INTERACTION     // Catch: java.lang.Exception -> La1
            int r0 = r0.getType()     // Catch: java.lang.Exception -> La1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> La1
            java.lang.String r0 = r10.getItemId()     // Catch: java.lang.Exception -> La1
            if (r0 == 0) goto L7a
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> La1
            java.lang.Long r8 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> La1
        L68:
            r0 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> La1
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> La1
            r11.<init>()     // Catch: java.lang.Exception -> La1
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> La1
            r4.add(r6)     // Catch: java.lang.Exception -> La1
            goto L42
        L7a:
            r8 = r12
            goto L68
        L7c:
            X.0OJU r0 = r3.LJI     // Catch: java.lang.Exception -> La1
            r0.p81(r4, r2)     // Catch: java.lang.Exception -> La1
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService> r7 = com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService.class
            r8 = 0
            r11 = 14
            r9 = r8
            r10 = r8
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> La1
            com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService r1 = (com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService) r1     // Catch: java.lang.Exception -> La1
            if (r1 == 0) goto L99
            java.lang.String r0 = r3.LJFF     // Catch: java.lang.Exception -> La1
            r1.LJIILIIL(r14, r0, r8)     // Catch: java.lang.Exception -> La1
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> La1
            if (r0 != 0) goto Laa
        L99:
            kotlin.jvm.internal.AwS553S0100000_9 r1 = new kotlin.jvm.internal.AwS553S0100000_9     // Catch: java.lang.Exception -> La1
            r0 = 1835(0x72b, float:2.571E-42)
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> La1
            goto Laa
        La1:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = "Bulletin ItemId translate to Long error"
            X.C0OPX.LJIIIIZZ(r0)
        Laa:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C605940Npg.invoke(java.lang.Object):java.lang.Object");
    }
}
