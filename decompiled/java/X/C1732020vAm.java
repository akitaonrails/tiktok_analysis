package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.message.BillboardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0vAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1732020vAm {
    public static final C1732020vAm LIZ = new C1732020vAm();
    public static final InterfaceC1728700v5Q LIZIZ;
    public static final C1732120vAw LIZJ;
    public static final C1728820v5c LIZLLL;
    public static final C1728760v5W LJ;
    public static C054G LJFF;
    public static final C01GW LJI;
    public static final C01GW LJII;

    static {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        LIZIZ = (iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null) ? null : interfaceC20673515v3K4.LLI();
        LIZJ = new C1732120vAw();
        LIZLLL = new C1728820v5c();
        LJ = new C1728760v5W();
        LJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5975));
        LJII = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(542));
    }

    public static InterfaceC497601wk LJIIJ() {
        if (LJFF == null) {
            LJFF = C2296808zG.LIZ(C2126308Ur.LIZIZ);
        }
        return LJFF;
    }

    public static void LJIILJJIL(String str, boolean z) {
        InterfaceC497601wk interfaceC497601wkLJIIJ = LJIIJ();
        if (interfaceC497601wkLJIIJ != null) {
            C23250099c.LIZLLL(interfaceC497601wkLJIIJ, null, null, new C1731980vAi(str, z, null), 3);
        }
    }

    public static void LJIILL(String str, String str2) {
        C1729270v6L.LIZ(str, str2, "prelive_request", "guide", null, null, "", 0, 0, 0, 944);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData r8, boolean r9, boolean r10) {
        /*
            r7 = 0
            X.0vAm r0 = X.C1732020vAm.LIZ     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            r0.getClass()     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            X.01GW r0 = X.C1732020vAm.LJI     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            android.net.Uri r4 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            if (r4 == 0) goto L43
            r0 = 5
            kotlin.Pair[] r3 = new kotlin.Pair[r0]     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            java.lang.String r2 = "author_id"
            java.lang.String r1 = r8.authorId     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            r6 = 0
            r3[r6] = r0     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            java.lang.String r5 = "room_id"
            java.lang.String r2 = r8.roomId     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            r1 = 1
            if (r0 != 0) goto L2f
            goto L31
        L2f:
            r0 = 0
            goto L32
        L31:
            r0 = 1
        L32:
            if (r0 == 0) goto L36
            java.lang.String r2 = "0"
        L36:
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            r0.<init>(r5, r2)     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            r3[r1] = r0     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            java.lang.String r2 = "is_living"
            if (r9 != 0) goto L45
            r6 = 1
            goto L45
        L43:
            r0 = r7
            goto L77
        L45:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            kotlin.Pair r1 = new kotlin.Pair     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            r0 = 2
            r3[r0] = r1     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            java.lang.String r2 = "live_status"
            if (r9 == 0) goto L7f
            java.lang.String r0 = "before_live"
        L57:
            kotlin.Pair r1 = new kotlin.Pair     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            r0 = 3
            r3[r0] = r1     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            java.lang.String r2 = "selected_tab"
            if (r10 == 0) goto L7c
            java.lang.String r0 = "template"
        L65:
            kotlin.Pair r1 = new kotlin.Pair     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            r0 = 4
            r3[r0] = r1     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            android.net.Uri$Builder r0 = X.C1976807ok.LIZ(r4, r3)     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            if (r0 == 0) goto L43
            android.net.Uri r0 = r0.build()     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
        L77:
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L8b
            goto L86
        L7c:
            java.lang.String r0 = "image"
            goto L65
        L7f:
            java.lang.String r0 = "during_live"
            goto L57
        L82:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L86:
            if (r7 != 0) goto L8a
            java.lang.String r7 = ""
        L8a:
            return r7
        L8b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732020vAm.LIZ(com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData, boolean, boolean):java.lang.String");
    }

    public static void LJIIZILJ(EffectRootData effectRootData, int i, String str) {
        C1729270v6L.LIZ("apply_effect", null, "prelive_request", "guide", null, effectRootData.authorId, str, i, 0, 0, 786);
    }

    public static void LJIJ(String str, String str2, List list) {
        int iIntValue;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ECBillboard eCBillboard = (ECBillboard) it2.next();
                Integer num = eCBillboard.billboardType;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                C1729270v6L.LIZ("billboard_on_screen", str2, "prelive_request", "guide", null, str, String.valueOf(eCBillboard.billboardId), iIntValue, 0, 0, 784);
            }
        }
    }

    public static void LJIJI(String str, String str2, List list) {
        int iIntValue;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ECBillboard eCBillboard = (ECBillboard) it2.next();
                Integer num = eCBillboard.billboardType;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                C1729270v6L.LIZ("billboard_show_fail", str2, "prelive_request", "guide", null, str, String.valueOf(eCBillboard.billboardId), iIntValue, 0, 0, 784);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData r9, X.InterfaceC1731950vAf r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732020vAm.LIZIZ(com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData, X.0vAf, X.05Vn):java.lang.Object");
    }

    public static Object LJIIIZ(Context context, C1732230vB7 c1732230vB7, String str, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        LIZLLL.LL.getClass();
        ((HashMap) C1728840v5e.LIZ.getValue()).clear();
        if (str == null) {
            LJIILL("auto_display_before_request_fail", "author id null");
            return Unit.LIZ;
        }
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2126308Ur.LIZIZ, new C1732090vAt(context, c1732230vB7, str, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.05m9, kotlin.jvm.internal.AwS1S2301000_26] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r12v6, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AwS22S1201000_26] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.05m9, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r13v5, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData r11, kotlin.jvm.internal.AwS1S2301000_26 r12, kotlin.jvm.internal.AwS22S1201000_26 r13, X.InterfaceC1364105Vn r14) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732020vAm.LIZLLL(com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData, kotlin.jvm.internal.AwS1S2301000_26, kotlin.jvm.internal.AwS22S1201000_26, X.05Vn):java.lang.Object");
    }

    public static void LIZJ(EffectRootData effectRootData, String str, int i, InterfaceC1731950vAf interfaceC1731950vAf, String str2) {
        InterfaceC497601wk interfaceC497601wkLJIIJ = LJIIJ();
        if (interfaceC497601wkLJIIJ != null) {
            C23250099c.LIZLLL(interfaceC497601wkLJIIJ, null, null, new C1732040vAo(effectRootData, str, i, str2, interfaceC1731950vAf, null), 3);
        } else {
            interfaceC1731950vAf.LIZ("cancel effect fail getscope fail");
        }
    }

    public static void LJIIL(Context context, String str, final String str2, BillboardInfo billboardInfo, final String str3) {
        EffectRootData effectRootData = new EffectRootData(str2, str, (Map) null, str3, "old_msg", 36);
        CharSequence charSequence = (CharSequence) C13LP.LJJJLZIJ(0, billboardInfo.billboardIds);
        if (charSequence != null && charSequence.length() != 0) {
            final String str4 = (String) C13LP.LJJJLZIJ(0, billboardInfo.billboardIds);
            if (str4 == null) {
                str4 = "";
            }
            LJIILIIL("billboard_get", "", str4, str2, str3);
            LJFF(context, effectRootData, str4, billboardInfo.billboardType, new InterfaceC1731950vAf() { // from class: X.0vAz
                @Override // X.InterfaceC1731950vAf
                public final void onSuccess() {
                    C1732020vAm c1732020vAm = C1732020vAm.LIZ;
                    String str5 = str4;
                    String str6 = str2;
                    String str7 = str3;
                    c1732020vAm.getClass();
                    C1732020vAm.LJIILIIL("billboard_on_screen", "", str5, str6, str7);
                }

                @Override // X.InterfaceC1731950vAf
                public final void LIZ(String str5) {
                    C1732020vAm c1732020vAm = C1732020vAm.LIZ;
                    String str6 = str4;
                    String str7 = str2;
                    String str8 = str3;
                    c1732020vAm.getClass();
                    C1732020vAm.LJIILIIL("billboard_show_fail", str5, str6, str7, str8);
                }
            }, null);
            return;
        }
        LIZJ(effectRootData, str2, billboardInfo.billboardType, new InterfaceC1731950vAf() { // from class: X.0vB0
            @Override // X.InterfaceC1731950vAf
            public final void onSuccess() {
                C1732020vAm c1732020vAm = C1732020vAm.LIZ;
                String str5 = str2;
                String str6 = str3;
                c1732020vAm.getClass();
                C1732020vAm.LJIILIIL("billboard_delete_success", "", "", str5, str6);
            }

            @Override // X.InterfaceC1731950vAf
            public final void LIZ(String str5) {
                C1732020vAm c1732020vAm = C1732020vAm.LIZ;
                String str6 = str2;
                String str7 = str3;
                c1732020vAm.getClass();
                C1732020vAm.LJIILIIL("billboard_delete_fail", str5, "", str6, str7);
            }
        }, null);
    }

    public static void LJIILIIL(String str, String str2, String str3, String str4, String str5) {
        C1729270v6L.LIZ(str, str2, "old_msg", str5, null, str4, str3, 4, 0, 0, 272);
    }

    public static void LJIILLIIL(InterfaceC497601wk interfaceC497601wk, String str, int i, List list, boolean z) {
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1731970vAh(str, list, i, z, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData r15, java.lang.String r16, X.InterfaceC1731950vAf r17, java.lang.String r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732020vAm.LJ(com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData, java.lang.String, X.0vAf, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static void LJFF(Context context, EffectRootData effectRootData, String str, int i, InterfaceC1731950vAf interfaceC1731950vAf, String str2) {
        InterfaceC497601wk interfaceC497601wkLJIIJ = LJIIJ();
        if (interfaceC497601wkLJIIJ != null) {
            C23250099c.LIZLLL(interfaceC497601wkLJIIJ, null, null, new C1732030vAn(effectRootData, i, str, context, str2, interfaceC1731950vAf, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.util.List r24, java.util.List r25, java.lang.String r26, com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData r27, android.content.Context r28, X.InterfaceC1364105Vn r29) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732020vAm.LJII(java.util.List, java.util.List, java.lang.String, com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData, android.content.Context, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData r15, int r16, com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.BillboardListData r17, kotlin.jvm.internal.AwS9S1401000_26 r18, kotlin.jvm.internal.AwS5S1401000_26 r19, java.lang.String r20, X.InterfaceC1364105Vn r21) {
        /*
            r14 = this;
            r3 = r21
            r8 = r20
            boolean r0 = r3 instanceof X.C1732100vAu
            if (r0 == 0) goto L68
            r13 = r3
            X.0vAu r13 = (X.C1732100vAu) r13
            int r2 = r13.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r13.LLILZ = r2
        L16:
            java.lang.Object r1 = r13.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LLILZ
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L6e
            X.C155000ia.LIZIZ(r1)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            r12 = r19
            r4 = r17
            if (r4 == 0) goto L5b
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.ImageItem> r1 = r4.imageList
            if (r1 == 0) goto L5b
            r0 = 0
            java.lang.Object r7 = X.C13LP.LJJJLZIJ(r0, r1)
            com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.ImageItem r7 = (com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.ImageItem) r7
            if (r7 == 0) goto L5b
            X.0vAm r5 = X.C1732020vAm.LIZ
            java.lang.String r9 = r4.latestBillboardId
            r6 = r15
            if (r8 != 0) goto L4d
            r5.getClass()
            java.lang.String r8 = LIZ(r6, r0, r0)
        L4d:
            r13.LL = r12
            r13.LLILZ = r2
            r10 = 0
            r11 = r18
            java.lang.Object r0 = r5.LJI(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r0 != r3) goto L26
            return r3
        L5b:
            if (r12 == 0) goto L26
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r0 = "get billboard image data null"
            r1.<init>(r0)
            r12.invoke(r1)
            goto L26
        L68:
            X.0vAu r13 = new X.0vAu
            r13.<init>(r14, r3)
            goto L16
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732020vAm.LJIIIIZZ(com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData, int, com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.BillboardListData, kotlin.jvm.internal.AwS9S1401000_26, kotlin.jvm.internal.AwS5S1401000_26, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static void LJIIJJI(String str, String str2, boolean z, String str3, InterfaceC1731950vAf interfaceC1731950vAf, String str4, String str5, String str6) {
        InterfaceC497601wk interfaceC497601wkLJIIJ = LJIIJ();
        if (interfaceC497601wkLJIIJ != null) {
            C23250099c.LIZLLL(interfaceC497601wkLJIIJ, null, null, new C1731940vAe(z, str2, str, str5, str4, str3, interfaceC1731950vAf, str6, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData r29, com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.ImageItem r30, java.lang.String r31, java.lang.String r32, boolean r33, kotlin.jvm.functions.Function0 r34, kotlin.jvm.functions.Function1 r35, X.InterfaceC1364105Vn r36) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732020vAm.LJI(com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData, com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.ImageItem, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
