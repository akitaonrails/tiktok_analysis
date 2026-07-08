package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.model.message.BillboardInfo;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.model.SeaLiveBillboard;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vBN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1732390vBN {
    public static final C1732390vBN LIZ = new C1732390vBN();
    public static final InterfaceC1728700v5Q LIZIZ;
    public static final C1732560vBe LIZJ;
    public static final C1728680v5O LIZLLL;
    public static final C1728650v5L LJ;
    public static C054G LJFF;
    public static final C01GW LJI;
    public static final C01GW LJII;

    static {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        LIZIZ = (iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null) ? null : interfaceC20673515v3K4.LLI();
        LIZJ = new C1732560vBe();
        LIZLLL = new C1728680v5O();
        LJ = new C1728650v5L();
        LJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4149));
        LJII = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(452));
    }

    public static InterfaceC497601wk LJIIIZ() {
        if (LJFF == null) {
            LJFF = C2296808zG.LIZ(C2126308Ur.LIZIZ);
        }
        return LJFF;
    }

    public static void LJIILIIL(String str, boolean z) {
        InterfaceC497601wk interfaceC497601wkLJIIIZ = LJIIIZ();
        if (interfaceC497601wkLJIIIZ != null) {
            C23250099c.LIZLLL(interfaceC497601wkLJIIIZ, null, null, new C1732430vBR(str, z, null), 3);
        }
    }

    public static void LJIILJJIL(String str, String str2) {
        C1729260v6K.LIZ(str, str2, "prelive_request", CardStruct.IStatusCode.DEFAULT, null, null, "", 0, 0, 944);
    }

    public static String LIZ(String str, String str2, boolean z) {
        boolean z2;
        String str3;
        String str4;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Integer num = C1732670vBp.LIZ;
        if (num != null && num.intValue() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("author_id", str);
        pairArr[1] = new Pair("room_id", str2);
        pairArr[2] = new Pair("is_living", String.valueOf(!z2));
        if (z2) {
            str3 = "before_live";
        } else {
            str3 = "during_live";
        }
        pairArr[3] = new Pair("live_status", str3);
        if (z) {
            str4 = "template";
        } else {
            str4 = "image";
        }
        pairArr[4] = new Pair("selected_tab", str4);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        String string = (String) LJI.getValue();
        Uri uri = UriProtector.parse(string);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "lynx_url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
            Uri.Builder builderBuildUpon = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2).buildUpon();
            for (Map.Entry entry : mapLJIIIIZZ.entrySet()) {
                String str5 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    builderBuildUpon.appendQueryParameter(str5, value.toString());
                }
            }
            String string2 = builderBuildUpon.build().toString();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            for (String str6 : UriProtector.getQueryParameterNames(uri)) {
                if (!Intrinsics.LJFF(str6, "lynx_url") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str6)) != null) {
                    builderClearQuery.appendQueryParameter(str6, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
            }
            string = builderClearQuery.appendQueryParameter("lynx_url", string2).build().toString();
        }
        C599810Nfn c599810Nfn = C599810Nfn.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("newSchema: ");
        sbLIZ.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599810Nfn.getClass();
        C599810Nfn.LIZ("buildDefaultSchema:", strLIZIZ);
        return string;
    }

    public static void LJIILLIIL(SeaLiveEffectRootData seaLiveEffectRootData, int i, String str) {
        C1729260v6K.LIZ("apply_effect", null, "prelive_request", CardStruct.IStatusCode.DEFAULT, null, seaLiveEffectRootData.authorId, str, i, 0, 786);
    }

    public static void LJIIZILJ(String str, String str2, List list) {
        int iIntValue;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SeaLiveBillboard seaLiveBillboard = (SeaLiveBillboard) it2.next();
                Integer num = seaLiveBillboard.billboardType;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                C1729260v6K.LIZ("billboard_on_screen", str2, "prelive_request", CardStruct.IStatusCode.DEFAULT, null, str, String.valueOf(seaLiveBillboard.billboardId), iIntValue, 0, 784);
            }
        }
    }

    public static void LJIJ(String str, String str2, List list) {
        int iIntValue;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SeaLiveBillboard seaLiveBillboard = (SeaLiveBillboard) it2.next();
                Integer num = seaLiveBillboard.billboardType;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                C1729260v6K.LIZ("billboard_show_fail", str2, "prelive_request", CardStruct.IStatusCode.DEFAULT, null, str, String.valueOf(seaLiveBillboard.billboardId), iIntValue, 0, 784);
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
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData r9, X.InterfaceC1732650vBn r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732390vBN.LIZIZ(com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData, X.0vBn, X.05Vn):java.lang.Object");
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
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData r11, kotlin.jvm.internal.AwS1S2301000_26 r12, kotlin.jvm.internal.AwS22S1201000_26 r13, X.InterfaceC1364105Vn r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732390vBN.LIZLLL(com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData, kotlin.jvm.internal.AwS1S2301000_26, kotlin.jvm.internal.AwS22S1201000_26, X.05Vn):java.lang.Object");
    }

    public static void LIZJ(SeaLiveEffectRootData seaLiveEffectRootData, String str, int i, InterfaceC1732650vBn interfaceC1732650vBn, String str2) {
        InterfaceC497601wk interfaceC497601wkLJIIIZ = LJIIIZ();
        if (interfaceC497601wkLJIIIZ != null) {
            C23250099c.LIZLLL(interfaceC497601wkLJIIIZ, null, null, new C1732460vBU(seaLiveEffectRootData, str, i, str2, interfaceC1732650vBn, null), 3);
        } else {
            interfaceC1732650vBn.LIZ("cancel effect fail getscope fail");
        }
    }

    public static void LJIIJJI(Context context, String str, final String str2, BillboardInfo billboardInfo, final String str3) {
        SeaLiveEffectRootData seaLiveEffectRootData = new SeaLiveEffectRootData(str2, str, (Map) null, str3, "old_msg", 36);
        CharSequence charSequence = (CharSequence) C13LP.LJJJLZIJ(0, billboardInfo.billboardIds);
        if (charSequence != null && charSequence.length() != 0) {
            final String str4 = (String) C13LP.LJJJLZIJ(0, billboardInfo.billboardIds);
            if (str4 == null) {
                str4 = "";
            }
            LJIIL("billboard_get", "", str4, str2, str3);
            LJFF(context, seaLiveEffectRootData, str4, billboardInfo.billboardType, new InterfaceC1732650vBn() { // from class: X.0vBh
                @Override // X.InterfaceC1732650vBn
                public final void onSuccess() {
                    C1732390vBN c1732390vBN = C1732390vBN.LIZ;
                    String str5 = str4;
                    String str6 = str2;
                    String str7 = str3;
                    c1732390vBN.getClass();
                    C1732390vBN.LJIIL("billboard_on_screen", "", str5, str6, str7);
                }

                @Override // X.InterfaceC1732650vBn
                public final void LIZ(String str5) {
                    C1732390vBN c1732390vBN = C1732390vBN.LIZ;
                    String str6 = str4;
                    String str7 = str2;
                    String str8 = str3;
                    c1732390vBN.getClass();
                    C1732390vBN.LJIIL("billboard_show_fail", str5, str6, str7, str8);
                }
            }, null);
            return;
        }
        LIZJ(seaLiveEffectRootData, str2, billboardInfo.billboardType, new InterfaceC1732650vBn() { // from class: X.0vBg
            @Override // X.InterfaceC1732650vBn
            public final void onSuccess() {
                C1732390vBN c1732390vBN = C1732390vBN.LIZ;
                String str5 = str2;
                String str6 = str3;
                c1732390vBN.getClass();
                C1732390vBN.LJIIL("billboard_delete_success", "", "", str5, str6);
            }

            @Override // X.InterfaceC1732650vBn
            public final void LIZ(String str5) {
                C1732390vBN c1732390vBN = C1732390vBN.LIZ;
                String str6 = str2;
                String str7 = str3;
                c1732390vBN.getClass();
                C1732390vBN.LJIIL("billboard_delete_fail", str5, "", str6, str7);
            }
        }, null);
    }

    public static void LJIIL(String str, String str2, String str3, String str4, String str5) {
        C1729260v6K.LIZ(str, str2, "old_msg", str5, null, str4, str3, 4, 0, 272);
    }

    public static void LJIILL(InterfaceC497601wk interfaceC497601wk, String str, int i, List list, boolean z) {
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1732420vBQ(str, list, i, z, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData r16, java.lang.String r17, X.InterfaceC1732650vBn r18, java.lang.String r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732390vBN.LJ(com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData, java.lang.String, X.0vBn, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static void LJFF(Context context, SeaLiveEffectRootData seaLiveEffectRootData, String str, int i, InterfaceC1732650vBn interfaceC1732650vBn, String str2) {
        InterfaceC497601wk interfaceC497601wkLJIIIZ = LJIIIZ();
        if (interfaceC497601wkLJIIIZ != null) {
            C23250099c.LIZLLL(interfaceC497601wkLJIIIZ, null, null, new C1732400vBO(seaLiveEffectRootData, i, str, context, str2, interfaceC1732650vBn, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.util.List r24, java.util.List r25, java.lang.String r26, com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData r27, android.content.Context r28, X.InterfaceC1364105Vn r29) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732390vBN.LJII(java.util.List, java.util.List, java.lang.String, com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData, android.content.Context, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData r14, int r15, com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveBillboardListData r16, kotlin.jvm.internal.AwS9S1401000_26 r17, kotlin.jvm.internal.AwS5S1401000_26 r18, java.lang.String r19, X.InterfaceC1364105Vn r20) {
        /*
            r13 = this;
            r7 = r19
            r9 = 0
            r3 = r20
            boolean r0 = r3 instanceof X.C1732540vBc
            if (r0 == 0) goto L71
            r12 = r3
            X.0vBc r12 = (X.C1732540vBc) r12
            int r2 = r12.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r12.LLILZ = r2
        L17:
            java.lang.Object r1 = r12.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r12.LLILZ
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L77
            X.C155000ia.LIZIZ(r1)
        L27:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            r1 = r16
            r11 = r18
            if (r1 == 0) goto L64
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.ImageItem> r0 = r1.imageList
            if (r0 == 0) goto L64
            java.lang.Object r6 = X.C13LP.LJJJLZIJ(r9, r0)
            com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.ImageItem r6 = (com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.ImageItem) r6
            if (r6 == 0) goto L64
            X.0vBN r4 = X.C1732390vBN.LIZ
            java.lang.String r8 = r1.latestBillboardId
            r5 = r14
            if (r7 == 0) goto L4c
            int r0 = r7.length()
            if (r0 != 0) goto L57
        L4c:
            java.lang.String r1 = r5.authorId
            java.lang.String r0 = r5.roomId
            r4.getClass()
            java.lang.String r7 = LIZ(r1, r0, r9)
        L57:
            r12.LL = r11
            r12.LLILZ = r2
            r10 = r17
            java.lang.Object r0 = r4.LJI(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r3) goto L27
            return r3
        L64:
            if (r11 == 0) goto L27
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r0 = "get billboard image data null"
            r1.<init>(r0)
            r11.invoke(r1)
            goto L27
        L71:
            X.0vBc r12 = new X.0vBc
            r12.<init>(r13, r3)
            goto L17
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732390vBN.LJIIIIZZ(com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData, int, com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveBillboardListData, kotlin.jvm.internal.AwS9S1401000_26, kotlin.jvm.internal.AwS5S1401000_26, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static void LJIIJ(String str, String str2, boolean z, String str3, InterfaceC1732650vBn interfaceC1732650vBn, String str4, String str5, String str6) {
        InterfaceC497601wk interfaceC497601wkLJIIIZ = LJIIIZ();
        if (interfaceC497601wkLJIIIZ != null) {
            C23250099c.LIZLLL(interfaceC497601wkLJIIIZ, null, null, new C1732490vBX(z, str2, str, str5, str4, str3, interfaceC1732650vBn, str6, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData r29, com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.ImageItem r30, java.lang.String r31, java.lang.String r32, boolean r33, kotlin.jvm.functions.Function0 r34, kotlin.jvm.functions.Function1 r35, X.InterfaceC1364105Vn r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1732390vBN.LJI(com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData, com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.ImageItem, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
