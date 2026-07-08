package X;

import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContent;
import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContentExtra;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.swap.IPhotoSwapSendCallback;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AFwS325S0000000_35;
import kotlin.jvm.internal.AFwS358S0000000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256591DUb {
    public static C1435510nSX LIZIZ;
    public static final C2256591DUb LIZ = new C2256591DUb();
    public static final AFwS325S0000000_35 LIZJ = AFwS325S0000000_35.get$arr$(5);
    public static final C2325401G0s LIZLLL = C2325401G0s.get$arr$(2);

    public static AbstractC873650YPb LIZIZ(C0Y3I c0y3i) {
        if (C258300AAi.LIZIZ) {
            return C0YNS.LIZ(C0YNS.LIZ).LIZ(new C874220YRg(AFwS325S0000000_35.get$arr$(6), AFwS261S0000000_22.get$arr$(273), AFwS283S0000000_35.get$arr$(131), AFwS358S0000000_35.get$arr$(0)), c0y3i.LIZ());
        }
        return null;
    }

    public static void LJFF(C2256701DUm c2256701DUm, C0Y3I c0y3i, C869590Y9l c869590Y9l) {
        IPhotoSwapSendCallback iPhotoSwapSendCallback;
        if (c869590Y9l != null && C896400ZEo.LJIIIZ(c869590Y9l) && (iPhotoSwapSendCallback = (IPhotoSwapSendCallback) PluggableExtentionKt.pluggableSpi$default(IPhotoSwapSendCallback.class, false, false, false, 14, null)) != null) {
            iPhotoSwapSendCallback.LIZ(c0y3i, c869590Y9l);
        }
        LIZJ.invoke(c2256701DUm, c869590Y9l);
    }

    public static void LJI(C0Y3I c0y3i, C869590Y9l c869590Y9l, C09KS c09ks, C2256701DUm c2256701DUm) {
        IPhotoSwapSendCallback iPhotoSwapSendCallback;
        IMediaPublishManager iMediaPublishManager = (IMediaPublishManager) PluggableExtentionKt.pluggableSpiForReal(IMediaPublishManager.class);
        if (iMediaPublishManager != null) {
            iMediaPublishManager.LJIIJJI(c09ks, c869590Y9l.getUuid());
        }
        if (C896400ZEo.LJIIIZ(c869590Y9l) && (iPhotoSwapSendCallback = (IPhotoSwapSendCallback) PluggableExtentionKt.pluggableSpi$default(IPhotoSwapSendCallback.class, false, false, false, 14, null)) != null) {
            iPhotoSwapSendCallback.LIZLLL(c0y3i, c869590Y9l);
        }
        C0Y3I c0y3iLIZ = c0y3i.LIZ();
        c869590Y9l.setMsgStatus(3);
        C458020Hxg.LIZ(c0y3iLIZ, c869590Y9l);
        C2256641DUg.LIZIZ(false, c2256701DUm, c869590Y9l, null, "upload_or_compile_fail");
    }

    public static void LIZJ(C0Y3I c0y3i, C869590Y9l c869590Y9l, String str, C1DUQ c1duq, Function1 function1) {
        C1DUQ c1duqLIZIZ = C1DUQ.LIZIZ(c1duq, str, 0, 0, null, null, null, null, 8190);
        if (function1 != null) {
            function1.invoke(c1duqLIZIZ);
        }
        C0Y3I c0y3iLIZ = c0y3i.LIZ();
        c869590Y9l.setAttachments(c1duqLIZIZ.LIZ(c869590Y9l.getUuid()));
        C458020Hxg.LIZ(c0y3iLIZ, c869590Y9l);
    }

    public static void LIZLLL(C0Y3I c0y3i, C869590Y9l c869590Y9l, C0OPV c0opv, C1DUQ c1duq, Function1 function1) {
        AttachmentComponent attachmentComponentLIZ;
        C2242321Cpa c2242321Cpa;
        C2242771CqJ c2242771CqJ;
        BaseHeaderComponent baseHeaderComponentLIZIZ = null;
        C1DUQ c1duqLIZIZ = C1DUQ.LIZIZ(c1duq, c0opv.LIZ, c0opv.LIZIZ, c0opv.LIZJ, null, null, null, EnumC2249741D3s.SYNTHESISED, 7922);
        if (function1 != null) {
            function1.invoke(c1duqLIZIZ);
        }
        C0Y3I c0y3iLIZ = c0y3i.LIZ();
        C2256591DUb c2256591DUb = LIZ;
        String scene = c869590Y9l.getScene();
        if (scene == null) {
            scene = "";
        }
        String str = c1duq.LJII;
        boolean z = c1duq.LJIIJ;
        boolean z2 = c1duq.LJIIJJI;
        String str2 = c1duq.LJIIL;
        ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
        C2241941Coy c2241941CoyDecode = protoAdapter.decode(c869590Y9l.getContentPB());
        if (c2241941CoyDecode != null && (c2242771CqJ = c2241941CoyDecode.attachment) != null) {
            attachmentComponentLIZ = C2242791CqL.LIZ(c2242771CqJ);
        } else {
            attachmentComponentLIZ = null;
        }
        C2241941Coy c2241941CoyDecode2 = protoAdapter.decode(c869590Y9l.getContentPB());
        if (c2241941CoyDecode2 != null && (c2242321Cpa = c2241941CoyDecode2.header) != null) {
            baseHeaderComponentLIZIZ = C2242351Cpd.LIZIZ(c2242321Cpa);
        }
        c2256591DUb.getClass();
        c869590Y9l.setContentPB(LIZ(scene, str, z, z2, str2, attachmentComponentLIZ, baseHeaderComponentLIZIZ).encode());
        c869590Y9l.setAttachments(c1duqLIZIZ.LIZ(c869590Y9l.getUuid()));
        C458020Hxg.LIZ(c0y3iLIZ, c869590Y9l);
    }

    public static void LJ(C2256701DUm c2256701DUm, C0Y3I c0y3i, C869590Y9l c869590Y9l, C0YMW c0ymw, String str) {
        IPhotoSwapSendCallback iPhotoSwapSendCallback;
        if (c869590Y9l != null && C896400ZEo.LJIIIZ(c869590Y9l) && (iPhotoSwapSendCallback = (IPhotoSwapSendCallback) PluggableExtentionKt.pluggableSpi$default(IPhotoSwapSendCallback.class, false, false, false, 14, null)) != null) {
            iPhotoSwapSendCallback.LIZLLL(c0y3i, c869590Y9l);
        }
        LIZLLL.invoke(c2256701DUm, c0ymw, c869590Y9l, str);
    }

    public static void LJIIIZ(Map map, Map map2, String str, String str2, Map map3) {
        String str3;
        if (Intrinsics.LJFF(str, "photo_swap_pong")) {
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            map.put("local_ext_paired_msg_id", str3);
            if (map2 != null) {
                if (str2 == null) {
                    str2 = "";
                }
                map2.put("local_ext_paired_msg_id", str2);
            }
            map.put("is_photoswap_reply", "1");
            if (map2 != null) {
                map2.put("is_photoswap_reply", "1");
            }
        } else {
            map.put("is_photoswap_reply", CardStruct.IStatusCode.DEFAULT);
            if (map2 != null) {
                map2.put("is_photoswap_reply", CardStruct.IStatusCode.DEFAULT);
            }
        }
        Object obj = map3.get("enter_method_type");
        if (obj != null) {
            map.put("enter_method_type", obj);
            if (map2 != null) {
                map2.put("enter_method_type", obj);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "photo_swap_pong") && !Intrinsics.LJFF(str, "photo_swap_ping")) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("photoswap_");
        sbLIZ.append((String) map3.get("enter_dm"));
        map.put("enter_method_type", C2188811AlT.LIZIZ(sbLIZ));
        if (map2 == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("photoswap_");
        sbLIZ2.append((String) map3.get("enter_dm"));
        map2.put("enter_method_type", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static PictureCardTemplate LIZ(String str, String str2, boolean z, boolean z2, String str3, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent) {
        Object obj;
        String str4;
        if (str2 == null) {
            str2 = "";
        }
        PreviewHintComponent previewHintComponentLIZ = C462100IAe.LIZ(2131831018);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("effect_ids", str2);
        String str5 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_dm_text_icon", obj);
        if (!z2) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("has_text", str5);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (C909170Zlb.LIZ() == 3) {
            str4 = "dm_name_photoSwap";
        } else {
            str4 = "dm_name_Swap";
        }
        if (Intrinsics.LJFF(str, "photo_swap_ping")) {
            mapLJIIJ.put("sender_preview", "dm_photoSwap_inappPush_startedPhotoswap");
            mapLJIIJ.put("receiver_preview", "dm_photoSwap_inappPush_startedPhotoswap");
            mapLJIIJ.put("sender_preview_placeholder", str4);
            mapLJIIJ.put("receiver_preview_placeholder", str4);
        } else if (Intrinsics.LJFF(str, "photo_swap_pong")) {
            mapLJIIJ.put("sender_preview", "dm_photoSwap_senderView_sentPhotoswapback");
            mapLJIIJ.put("receiver_preview", "dm_photoSwap_inappPush_sentPhotoswapback");
            mapLJIIJ.put("sender_preview_placeholder", str4);
            mapLJIIJ.put("receiver_preview_placeholder", str4);
            if (str3 != null) {
                mapLJIIJ.put("paired_msg_id", str3);
            }
        }
        return new PictureCardTemplate(previewHintComponentLIZ, new BaseRequestComponent(new QueryDataComponent(null, mapLJIIJ, 1)), attachmentComponent, baseHeaderComponent, 1183);
    }

    public static void LJII(C0Y3I c0y3i, C869590Y9l c869590Y9l, C1DUQ c1duq, DMUploadImageResult dMUploadImageResult, C09KS c09ks, C2256701DUm c2256701DUm, Function1 function1) {
        String uri;
        int i;
        int i2;
        String secretKey;
        String uri2;
        AttachmentComponent attachmentComponentLIZ;
        C2242321Cpa c2242321Cpa;
        C2242771CqJ c2242771CqJ;
        DMEncryptedImageContentExtra extra;
        DMEncryptedImageContentExtra extra2;
        IMediaPublishManager iMediaPublishManager = (IMediaPublishManager) PluggableExtentionKt.pluggableSpiForReal(IMediaPublishManager.class);
        if (iMediaPublishManager != null) {
            iMediaPublishManager.LJIIJJI(c09ks, c869590Y9l.getUuid());
        }
        DMEncryptedImageContent dMEncryptedImageContent = dMUploadImageResult.decryptData;
        BaseHeaderComponent baseHeaderComponentLIZIZ = null;
        if (dMEncryptedImageContent != null) {
            uri = dMEncryptedImageContent.getUri();
        } else {
            uri = null;
        }
        DMEncryptedImageContent dMEncryptedImageContent2 = dMUploadImageResult.decryptData;
        if (dMEncryptedImageContent2 != null && (extra2 = dMEncryptedImageContent2.getExtra()) != null) {
            i = extra2.width;
        } else {
            i = c1duq.LIZJ;
        }
        DMEncryptedImageContent dMEncryptedImageContent3 = dMUploadImageResult.decryptData;
        if (dMEncryptedImageContent3 != null && (extra = dMEncryptedImageContent3.getExtra()) != null) {
            i2 = extra.height;
        } else {
            i2 = c1duq.LIZLLL;
        }
        if (i <= 0 || i2 <= 0) {
            i = c1duq.LIZJ;
            i2 = c1duq.LIZLLL;
        }
        if (uri != null && uri.length() != 0) {
            c1duq.getClass();
            DMEncryptedImageContent dMEncryptedImageContent4 = dMUploadImageResult.decryptData;
            if (dMEncryptedImageContent4 != null) {
                secretKey = dMEncryptedImageContent4.getSecretKey();
            } else {
                secretKey = null;
            }
            DMEncryptedImageContent dMEncryptedImageContent5 = dMUploadImageResult.decryptData;
            if (dMEncryptedImageContent5 != null) {
                uri2 = dMEncryptedImageContent5.getUri();
            } else {
                uri2 = null;
            }
            C1DUQ c1duqLIZIZ = C1DUQ.LIZIZ(C1DUQ.LIZIZ(c1duq, null, 0, 0, secretKey, uri2, null, null, 8095), null, i, i2, null, null, null, EnumC2249741D3s.UPLOADED, 7923);
            if (function1 != null) {
                function1.invoke(c1duqLIZIZ);
            }
            C2256591DUb c2256591DUb = LIZ;
            String scene = c869590Y9l.getScene();
            if (scene == null) {
                scene = "";
            }
            String str = c1duqLIZIZ.LJII;
            boolean z = c1duqLIZIZ.LJIIJ;
            boolean z2 = c1duqLIZIZ.LJIIJJI;
            String str2 = c1duqLIZIZ.LJIIL;
            ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
            C2241941Coy c2241941CoyDecode = protoAdapter.decode(c869590Y9l.getContentPB());
            if (c2241941CoyDecode != null && (c2242771CqJ = c2241941CoyDecode.attachment) != null) {
                attachmentComponentLIZ = C2242791CqL.LIZ(c2242771CqJ);
            } else {
                attachmentComponentLIZ = null;
            }
            C2241941Coy c2241941CoyDecode2 = protoAdapter.decode(c869590Y9l.getContentPB());
            if (c2241941CoyDecode2 != null && (c2242321Cpa = c2241941CoyDecode2.header) != null) {
                baseHeaderComponentLIZIZ = C2242351Cpd.LIZIZ(c2242321Cpa);
            }
            c2256591DUb.getClass();
            c869590Y9l.setContentPB(LIZ(scene, str, z, z2, str2, attachmentComponentLIZ, baseHeaderComponentLIZIZ).encode());
            c869590Y9l.getExt().put("a:media_task_id", String.valueOf(c2256701DUm.LJII));
            c869590Y9l.setAttachments(c1duqLIZIZ.LIZ(c869590Y9l.getUuid()));
            return;
        }
        C0Y3I c0y3iLIZ = c0y3i.LIZ();
        c869590Y9l.setMsgStatus(3);
        C458020Hxg.LIZ(c0y3iLIZ, c869590Y9l);
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0513  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(X.C2256591DUb r45, final X.C0Y3I r46, java.lang.String r47, X.C1DUQ r48, boolean r49, boolean r50, com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r51, final X.C2256701DUm r52, java.lang.String r53, java.util.Map r54, java.util.Map r55, java.lang.String r56, X.C0YTK r57, com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent r58, com.bytedance.im.core.proto.ReferenceInfo r59, com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent r60, com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData r61, X.C19370210qK r62, int r63) {
        /*
            Method dump skipped, instruction units count: 1703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2256591DUb.LJIIIIZZ(X.1DUb, X.0Y3I, java.lang.String, X.1DUQ, boolean, boolean, com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext, X.1DUm, java.lang.String, java.util.Map, java.util.Map, java.lang.String, X.0YTK, com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent, com.bytedance.im.core.proto.ReferenceInfo, com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent, com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData, X.10qK, int):void");
    }
}
