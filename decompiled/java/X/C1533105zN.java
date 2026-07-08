package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.exp.RecommendCreateGroupConfig;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: X.05zN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1533105zN {
    public static final C1533105zN LJ = new C1533105zN(0);
    public static final C054G LJFF = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final C1231704rr LIZ;
    public final long LIZIZ;
    public final Keva LIZJ;
    public AnonymousClass0956 LIZLLL;

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recommend_create_group_info_");
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1533105zN(int i) {
        C1231704rr c1231704rr = new C1231704rr("RecommendCreateGroupDataMgr", null, 6);
        long j = ((RecommendCreateGroupConfig) C1533405zQ.LIZIZ.getValue()).fetchRecommendInMs;
        Keva repo = Keva.getRepo("im_group_chat_recommend_create_group");
        this.LIZ = c1231704rr;
        this.LIZIZ = j;
        this.LIZJ = repo;
    }

    public static C1533305zP LIZJ(byte[] bArr) {
        try {
            Object object = new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            if (!(object instanceof C1533305zP)) {
                return null;
            }
            return (C1533305zP) object;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1533005zM
            if (r0 == 0) goto L20
            r4 = r7
            X.05zM r4 = (X.C1533005zM) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L43
        L20:
            X.05zM r4 = new X.05zM
            r4.<init>(r6, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = X.C1477105qL.LIZJ     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L4c
            com.ss.android.ugc.aweme.im.common.api.TikTokImApi r1 = (com.ss.android.ugc.aweme.im.common.api.TikTokImApi) r1     // Catch: java.lang.Throwable -> L4c
            r4.LLILLL = r2     // Catch: java.lang.Throwable -> L4c
            r0 = 7
            java.lang.Object r1 = r1.getCreateGroupChatEntry(r0, r4)     // Catch: java.lang.Throwable -> L4c
            if (r1 != r3) goto L46
            return r3
        L43:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L4c
        L46:
            com.ss.android.ugc.aweme.im.common.model.CreateGroupChatEntryResponse r1 = (com.ss.android.ugc.aweme.im.common.model.CreateGroupChatEntryResponse) r1     // Catch: java.lang.Throwable -> L4c
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L4c
            goto L58
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L58:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto L63
            X.04rr r0 = r6.LIZ
            r0.LIZIZ()
        L63:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            r3 = 0
            if (r0 == 0) goto L6b
            r1 = r3
        L6b:
            com.ss.android.ugc.aweme.im.common.model.CreateGroupChatEntryResponse r1 = (com.ss.android.ugc.aweme.im.common.model.CreateGroupChatEntryResponse) r1
            if (r1 != 0) goto L72
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L72:
            com.ss.android.ugc.aweme.im.common.model.GroupChatRecommendInfo r5 = r1.getGroupRecInfo()
            if (r5 != 0) goto L7b
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7b:
            X.054G r2 = X.C1533105zN.LJFF
            X.05LC r1 = new X.05LC
            r1.<init>(r5, r3)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            X.05zP r4 = new X.05zP
            java.util.List<java.lang.Long> r3 = r5.recUserIds
            com.ss.android.ugc.aweme.im.common.model.GroupRecEventTracking r2 = r5.eventTracking
            long r0 = java.lang.System.currentTimeMillis()
            r4.<init>(r3, r2, r0)
            com.bytedance.keva.Keva r3 = r6.LIZJ
            java.lang.String r2 = LIZIZ()
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> Lab
            r1.<init>()     // Catch: java.lang.Exception -> Lab
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch: java.lang.Exception -> Lab
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lab
            r0.writeObject(r4)     // Catch: java.lang.Exception -> Lab
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Exception -> Lab
            goto Lb2
        Lab:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            byte[] r0 = new byte[r0]
        Lb2:
            r3.storeBytes(r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533105zN.LIZ(X.05Vn):java.lang.Object");
    }
}
