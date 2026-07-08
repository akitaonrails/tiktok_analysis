package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.message.BillboardInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0v6Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729400v6Y {
    public static final C1729400v6Y LIZ = new C1729400v6Y();
    public static final InterfaceC1728700v5Q LIZIZ;
    public static final C1728230v4f LIZJ;
    public static final C1728950v5p LIZLLL;
    public static final C1728720v5S LJ;
    public static C054G LJFF;
    public static final C01GW LJI;

    static {
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        LIZIZ = interfaceC20673515v3K4 != null ? interfaceC20673515v3K4.LLI() : null;
        LIZJ = new C1728230v4f();
        LIZLLL = new C1728950v5p();
        LJ = new C1728720v5S();
        LJI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(417));
    }

    public static InterfaceC497601wk LJFF() {
        if (LJFF == null) {
            LJFF = C2296808zG.LIZ(C2126308Ur.LIZIZ);
        }
        return LJFF;
    }

    public static void LJII(String str, boolean z) {
        InterfaceC497601wk interfaceC497601wkLJFF = LJFF();
        if (interfaceC497601wkLJFF != null) {
            C23250099c.LIZLLL(interfaceC497601wkLJFF, null, null, new C1728260v4i(str, z, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C1729460v6e
            if (r0 == 0) goto La1
            r6 = r11
            X.0v6e r6 = (X.C1729460v6e) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La1
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r8 = r6.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r5 = 0
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L55
            if (r0 == r1) goto L52
            if (r0 != r4) goto La8
            X.0v6c r3 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r10 = r6.LL
            X.C155000ia.LIZIZ(r8)
        L2a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r4 = r8.booleanValue()
            if (r4 == 0) goto L4c
            X.01wk r2 = LJFF()
            if (r2 == 0) goto L41
            X.0NSz r1 = new X.0NSz
            r1.<init>(r5)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r5, r5, r1, r0)
        L41:
            r3.LIZJ()
        L44:
            java.lang.String r0 = r10.authorId
            LJII(r0, r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4c:
            java.lang.String r0 = "cancel effect failed"
            r3.LIZIZ(r0)
            goto L44
        L52:
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r10 = r6.LL
            goto L68
        L55:
            X.C155000ia.LIZIZ(r8)
            X.0v7z r0 = X.C1730290v7z.LIZ     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> Lb1
            r6.LL = r10     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> Lb1
            r6.LLILZIL = r1     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> Lb1
            r0.getClass()     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> Lb1
            java.lang.Object r8 = X.C1730290v7z.LIZJ(r6)     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> Lb1
            if (r8 != r7) goto L6b
            goto Lb0
        L68:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> Lb1
        L6b:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r8 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r8     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> Lb1
            goto L73
        L6e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r8 = r5
        L73:
            if (r8 != 0) goto L7e
            java.lang.String r1 = r10.authorId
            r0 = 0
            LJII(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7e:
            X.0v6c r3 = new X.0v6c
            java.lang.String r0 = "pc_live_panel"
            r3.<init>(r10, r0)
            r1 = 0
            java.lang.String r0 = "campaign_banner"
            r3.LIZ(r1, r0, r5)
            X.01GW r0 = X.C1729400v6Y.LJI
            java.lang.Object r0 = r0.getValue()
            X.0v4p r0 = (X.C1728330v4p) r0
            r6.LL = r10
            r6.LLILLJJLI = r3
            r6.LLILZIL = r4
            java.lang.Object r8 = r0.LJFF(r8, r6)
            if (r8 != r7) goto L2a
            return r7
        La1:
            X.0v6e r6 = new X.0v6e
            r6.<init>(r9, r11)
            goto L12
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb0:
            return r7
        Lb1:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1729400v6Y.LIZ(com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r14, java.lang.String r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            r13 = this;
            r3 = r16
            r7 = r14
            r9 = r15
            boolean r0 = r3 instanceof X.C1729470v6f
            if (r0 == 0) goto L90
            r12 = r3
            X.0v6f r12 = (X.C1729470v6f) r12
            int r2 = r12.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r12.LLILZIL = r2
        L16:
            java.lang.Object r8 = r12.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r12.LLILZIL
            r5 = 0
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 == r1) goto L2d
            if (r0 != r3) goto L96
            X.C155000ia.LIZIZ(r8)
        L2a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2d:
            java.lang.Object r9 = r12.LLILLJJLI
            java.lang.String r9 = (java.lang.String) r9
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r7 = r12.LL
            goto L49
        L34:
            X.C155000ia.LIZIZ(r8)
            X.0v7z r0 = X.C1730290v7z.LIZ     // Catch: java.lang.Throwable -> L4f java.util.concurrent.CancellationException -> L9f
            r12.LL = r7     // Catch: java.lang.Throwable -> L4f java.util.concurrent.CancellationException -> L9f
            r12.LLILLJJLI = r9     // Catch: java.lang.Throwable -> L4f java.util.concurrent.CancellationException -> L9f
            r12.LLILZIL = r1     // Catch: java.lang.Throwable -> L4f java.util.concurrent.CancellationException -> L9f
            r0.getClass()     // Catch: java.lang.Throwable -> L4f java.util.concurrent.CancellationException -> L9f
            java.lang.Object r8 = X.C1730290v7z.LIZJ(r12)     // Catch: java.lang.Throwable -> L4f java.util.concurrent.CancellationException -> L9f
            if (r8 != r4) goto L4c
            goto L9e
        L49:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Throwable -> L4f java.util.concurrent.CancellationException -> L9f
        L4c:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r8 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r8     // Catch: java.lang.Throwable -> L4f java.util.concurrent.CancellationException -> L9f
            goto L54
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r8 = r5
        L54:
            if (r8 != 0) goto L5f
            java.lang.String r1 = r7.authorId
            r0 = 0
            LJII(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5f:
            X.0v6c r2 = new X.0v6c
            java.lang.String r0 = "pc_live_panel"
            r2.<init>(r7, r0)
            r0 = 0
            java.lang.String r6 = "campaign_banner"
            r2.LIZ(r0, r6, r5)
            X.01GW r0 = X.C1729400v6Y.LJI
            java.lang.Object r6 = r0.getValue()
            X.0v4p r6 = (X.C1728330v4p) r6
            kotlin.jvm.internal.AwS427S0200000_26 r10 = new kotlin.jvm.internal.AwS427S0200000_26
            r0 = 72
            r10.<init>(r7, r2, r0)
            kotlin.jvm.internal.AwS392S0200000_26 r11 = new kotlin.jvm.internal.AwS392S0200000_26
            r0 = 141(0x8d, float:1.98E-43)
            r11.<init>(r7, r2, r0)
            r12.LL = r5
            r12.LLILLJJLI = r5
            r12.LLILZIL = r3
            java.lang.Object r0 = r6.LJI(r7, r8, r9, r10, r11, r12)
            if (r0 != r4) goto L2a
            return r4
        L90:
            X.0v6f r12 = new X.0v6f
            r12.<init>(r13, r3)
            goto L16
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9e:
            return r4
        L9f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1729400v6Y.LIZJ(com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static void LJI(Context context, String str, String str2, BillboardInfo billboardInfo) {
        boolean z = false;
        RootData rootData = new RootData(str2, str, false, 24);
        CharSequence charSequence = (CharSequence) C13LP.LJJJLZIJ(0, billboardInfo.billboardIds);
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (z) {
            int i = billboardInfo.billboardType;
            InterfaceC497601wk interfaceC497601wkLJFF = LJFF();
            if (interfaceC497601wkLJFF != null) {
                C23250099c.LIZLLL(interfaceC497601wkLJFF, null, null, new C1729410v6Z(rootData, i, str2, null), 3);
                return;
            }
            return;
        }
        List<String> list = billboardInfo.billboardIds;
        int i2 = billboardInfo.billboardType;
        InterfaceC497601wk interfaceC497601wkLJFF2 = LJFF();
        if (interfaceC497601wkLJFF2 == null) {
            return;
        }
        C23250099c.LIZLLL(interfaceC497601wkLJFF2, null, null, new C1729350v6T(i2, rootData, list, context, null), 3);
    }

    public static void LJIIJ(RootData rootData, int i, String str, long j) {
        C1730290v7z.LIZ.getClass();
        String strLJI = C1730290v7z.LJI(i);
        if (strLJI == null) {
            strLJI = "";
        }
        C1728460v52.LIZ(rootData, "", strLJI, str, "display_total_success", "display_total", true, Long.valueOf(System.currentTimeMillis() - j), null, null);
    }

    public static void LJIIIIZZ(InterfaceC497601wk interfaceC497601wk, String str, int i, List list, boolean z) {
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1728270v4j(str, list, i, z, null), 3);
    }

    public static void LJIIIZ(RootData rootData, int i, String str, long j, String str2) {
        C1730290v7z.LIZ.getClass();
        String strLJI = C1730290v7z.LJI(i);
        if (strLJI == null) {
            strLJI = "";
        }
        C1728460v52.LIZ(rootData, "", strLJI, str, "display_total_fail", "display_total", false, Long.valueOf(System.currentTimeMillis() - j), null, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.05m9, X.0v6g] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r11v7, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AwS29S1101000_26] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [X.05m9, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r12v6, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r9, boolean r10, X.C1729480v6g r11, kotlin.jvm.internal.AwS29S1101000_26 r12, X.InterfaceC1364105Vn r13) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1729400v6Y.LIZIZ(com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData, boolean, X.0v6g, kotlin.jvm.internal.AwS29S1101000_26, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(android.content.Context r21, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r22, int r23, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardListData r24, boolean r25, kotlin.jvm.functions.Function0<kotlin.Unit> r26, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r27, X.InterfaceC1364105Vn<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1729400v6Y.LJ(android.content.Context, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData, int, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardListData, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(android.content.Context r32, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r33, int r34, java.util.List<? extends com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem> r35, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageItem r36, java.lang.String r37, boolean r38, kotlin.jvm.functions.Function0<kotlin.Unit> r39, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r40, X.InterfaceC1364105Vn<? super kotlin.Unit> r41) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1729400v6Y.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData, int, java.util.List, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageItem, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
