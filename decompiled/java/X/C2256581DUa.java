package X;

import android.content.Context;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.QuickLiveVideoTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS325S0000000_35;

/* JADX INFO: renamed from: X.1DUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256581DUa {
    public static final C2256581DUa LIZ = new C2256581DUa();
    public static final AFwS325S0000000_35 LIZIZ = AFwS325S0000000_35.get$arr$(4);
    public static final C2325401G0s LIZJ = C2325401G0s.get$arr$(1);

    public static void LJ(C0Y3I c0y3i, C869590Y9l c869590Y9l, C09KS c09ks, C2256701DUm c2256701DUm) {
        IMediaPublishManager iMediaPublishManager = (IMediaPublishManager) PluggableExtentionKt.pluggableSpiForReal(IMediaPublishManager.class);
        if (iMediaPublishManager != null) {
            iMediaPublishManager.LJIIJJI(c09ks, c869590Y9l.getUuid());
        }
        C0Y3I c0y3iLIZ = c0y3i.LIZ();
        c869590Y9l.setMsgStatus(3);
        C458020Hxg.LIZ(c0y3iLIZ, c869590Y9l);
        C2256641DUg.LIZIZ(false, c2256701DUm, c869590Y9l, null, "upload_or_compile_fail");
    }

    public static void LIZJ(C0Y3I c0y3i, C869590Y9l c869590Y9l, String str, C1DUR c1dur, Function1 function1) {
        C1DUR c1durLIZIZ = C1DUR.LIZIZ(c1dur, null, str, null, 0, 0, null, null, null, null, 1048571);
        if (function1 != null) {
            function1.invoke(c1durLIZIZ);
        }
        C0Y3I c0y3iLIZ = c0y3i.LIZ();
        c869590Y9l.setAttachments(c1durLIZIZ.LIZ(c869590Y9l.getUuid()));
        C458020Hxg.LIZ(c0y3iLIZ, c869590Y9l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(C0Y3I c0y3i, C869590Y9l c869590Y9l, C0OPV c0opv, C1DUR c1dur, Function1 function1) {
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        C1DUR c1durLIZIZ;
        AttachmentComponent attachmentComponentLIZ;
        C2242321Cpa c2242321Cpa;
        C2242771CqJ c2242771CqJ;
        int i = c0opv.LIZIZ;
        if (i == 0) {
            i = c1dur.LJ;
        }
        int i2 = c0opv.LIZJ;
        if (i2 == 0) {
            i2 = c1dur.LJFF;
        }
        if (c1dur.LJIIJJI) {
            baseHeaderComponentLIZIZ = null;
            c1durLIZIZ = C1DUR.LIZIZ(c1dur, c0opv.LIZ, null, null, 0, 0, null, EnumC2249741D3s.SYNTHESISED, null, null, 1048062);
        } else {
            baseHeaderComponentLIZIZ = null;
            c1durLIZIZ = C1DUR.LIZIZ(c1dur, c0opv.LIZ, null, null, i, i2, null, EnumC2249741D3s.SYNTHESISED, null, null, 1048014);
        }
        if (function1 != null) {
            function1.invoke(c1durLIZIZ);
        }
        C0Y3I c0y3iLIZ = c0y3i.LIZ();
        C2256581DUa c2256581DUa = LIZ;
        String str = c1dur.LJII;
        String str2 = c1dur.LJIIIIZZ;
        boolean z = c1dur.LJIILIIL;
        boolean z2 = c1dur.LJIILJJIL;
        boolean z3 = c1dur.LJIIZILJ;
        ProtoAdapter<C2241941Coy> protoAdapter = C2241941Coy.ADAPTER;
        C2241941Coy c2241941CoyDecode = protoAdapter.decode(c869590Y9l.getContentPB());
        if (c2241941CoyDecode != null && (c2242771CqJ = c2241941CoyDecode.attachment) != null) {
            attachmentComponentLIZ = C2242791CqL.LIZ(c2242771CqJ);
        } else {
            attachmentComponentLIZ = baseHeaderComponentLIZIZ;
        }
        C2241941Coy c2241941CoyDecode2 = protoAdapter.decode(c869590Y9l.getContentPB());
        if (c2241941CoyDecode2 != null && (c2242321Cpa = c2241941CoyDecode2.header) != null) {
            baseHeaderComponentLIZIZ = C2242351Cpd.LIZIZ(c2242321Cpa);
        }
        C1777570wMF c1777570wMF = c1dur.LJIJ;
        c2256581DUa.getClass();
        c869590Y9l.setContentPB(LIZ(str, str2, z, z2, attachmentComponentLIZ, z3, false, null, baseHeaderComponentLIZIZ, c1777570wMF).encode());
        c869590Y9l.setAttachments(c1durLIZIZ.LIZ(c869590Y9l.getUuid()));
        C458020Hxg.LIZ(c0y3iLIZ, c869590Y9l);
    }

    public static void LJFF(C0Y3I c0y3i, C869590Y9l c869590Y9l, C1DUR c1dur, C2256911DVh c2256911DVh, C09KS c09ks, C2256701DUm c2256701DUm, Function1 function1) {
        AttachmentComponent attachmentComponentLIZ;
        C2242321Cpa c2242321Cpa;
        C2242771CqJ c2242771CqJ;
        IMediaPublishManager iMediaPublishManager = (IMediaPublishManager) PluggableExtentionKt.pluggableSpiForReal(IMediaPublishManager.class);
        if (iMediaPublishManager != null) {
            iMediaPublishManager.LJIIJJI(c09ks, c869590Y9l.getUuid());
        }
        String str = c2256911DVh.LL;
        if (str != null && str.length() != 0) {
            c1dur.getClass();
            String str2 = c2256911DVh.LL;
            BaseHeaderComponent baseHeaderComponentLIZIZ = null;
            C1DUR c1durLIZIZ = C1DUR.LIZIZ(C1DUR.LIZIZ(c1dur, c1dur.LIZ, null, str2, 0, 0, null, null, null, null, 1048566), null, null, null, 0, 0, null, EnumC2249741D3s.UPLOADED, null, null, 1048063);
            if (function1 != null) {
                function1.invoke(c1durLIZIZ);
            }
            C2256581DUa c2256581DUa = LIZ;
            String str3 = c1durLIZIZ.LJII;
            String str4 = c1durLIZIZ.LJIIIIZZ;
            boolean z = c1durLIZIZ.LJIILIIL;
            boolean z2 = c1durLIZIZ.LJIILJJIL;
            boolean z3 = c1durLIZIZ.LJIIZILJ;
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
            C1777570wMF c1777570wMF = c1durLIZIZ.LJIJ;
            c2256581DUa.getClass();
            c869590Y9l.setContentPB(LIZ(str3, str4, z, z2, attachmentComponentLIZ, z3, false, null, baseHeaderComponentLIZIZ, c1777570wMF).encode());
            c869590Y9l.getExt().put("a:media_task_id", String.valueOf(c2256701DUm.LJII));
            c869590Y9l.setAttachments(c1durLIZIZ.LIZ(c869590Y9l.getUuid()));
            return;
        }
        C0Y3I c0y3iLIZ = c0y3i.LIZ();
        c869590Y9l.setMsgStatus(3);
        C458020Hxg.LIZ(c0y3iLIZ, c869590Y9l);
    }

    public static BaseTemplate LIZ(String str, String str2, boolean z, boolean z2, AttachmentComponent attachmentComponent, boolean z3, boolean z4, ReferenceInfo referenceInfo, BaseHeaderComponent baseHeaderComponent, C1777570wMF c1777570wMF) {
        String str3;
        Object obj;
        PreviewHintComponent previewHintComponentLIZ;
        String str4;
        String str5;
        String str6;
        String str7 = str;
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        BaseFooterComponent baseFooterComponent = null;
        if (c1777570wMF != null) {
            str3 = c1777570wMF.effectId;
        } else {
            str3 = null;
        }
        boolean zLIZ = C123100dR.LIZ(str3);
        C13DA c13da = new C13DA();
        c13da.put("effect_ids", str7);
        String str9 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("is_dm_text_icon", obj);
        if (!z2) {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("has_text", str9);
        if (C123100dR.LIZ(str2)) {
            c13da.put("remix_item_ids", str2);
        }
        if (zLIZ) {
            c13da.remove("effect_ids");
            if (c1777570wMF == null || (str4 = c1777570wMF.effectId) == null) {
                str4 = "";
            }
            c13da.put("effect_game_id", str4);
            if (c1777570wMF == null || (str5 = c1777570wMF.effectName) == null) {
                str5 = "";
            }
            c13da.put("effect_game_name", str5);
            if (c1777570wMF != null && (str6 = c1777570wMF.effectIcon) != null) {
                str8 = str6;
            }
            c13da.put("effect_game_icon_url", str8);
            c13da.put("sender_preview", "dmGames_inbox_notification_body2");
            c13da.put("receiver_preview", "dmGames_inbox_notification_body");
            c13da.put("quote_preview", "dm_cam_preview_video");
            c13da.put("out_push_preview", "dmGames_outOfApp_pushNotification_body");
        }
        Map mapBuild = c13da.build();
        if (z4 && referenceInfo != null) {
            C0I0B.LJFF.LIZJ();
            Context contextLIZ = C894660Z7w.LIZ();
            PreviewHintComponent previewHintComponent = new PreviewHintComponent(new TextComponent(contextLIZ.getString(2131831583), null, null), new TextComponent(contextLIZ.getString(2131831582), null, null), new TextComponent(contextLIZ.getString(2131831881), null, null), null, null, new TextComponent(contextLIZ.getString(2131831582), null, null), 24);
            BaseRequestComponent baseRequestComponent = new BaseRequestComponent(new QueryDataComponent(null, mapBuild, 1));
            if (z3) {
                TextComponent.Companion.getClass();
                baseFooterComponent = new BaseFooterComponent(C2243491CrT.LIZ(), "share_live_highlight_notice");
            }
            return new QuickLiveVideoTemplate(previewHintComponent, baseRequestComponent, attachmentComponent, baseFooterComponent, 83);
        }
        if (zLIZ) {
            C0I0B.LJFF.LIZJ();
            Context contextLIZ2 = C894660Z7w.LIZ();
            previewHintComponentLIZ = new PreviewHintComponent(new TextComponent(contextLIZ2.getString(2131830765), null, null), new TextComponent(contextLIZ2.getString(2131830767), null, null), new TextComponent(contextLIZ2.getString(2131831019), null, null), null, null, new TextComponent(contextLIZ2.getString(2131830763), null, null), 24);
        } else {
            previewHintComponentLIZ = C462100IAe.LIZ(2131831019);
        }
        BaseRequestComponent baseRequestComponent2 = new BaseRequestComponent(new QueryDataComponent(null, mapBuild, 1));
        if (z3) {
            TextComponent.Companion.getClass();
            baseFooterComponent = new BaseFooterComponent(C2243491CrT.LIZ(), "share_live_highlight_notice");
        }
        return new VideoCardTemplate(previewHintComponentLIZ, baseRequestComponent2, attachmentComponent, baseHeaderComponent, baseFooterComponent, 19);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.C2256581DUa r60, X.C0Y3I r61, java.lang.String r62, X.C1DUR r63, boolean r64, boolean r65, com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r66, final X.C2256701DUm r67, java.util.Map r68, java.util.Map r69, java.lang.String r70, X.C0YTK r71, com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent r72, boolean r73, boolean r74, com.bytedance.im.core.proto.ReferenceInfo r75, com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent r76, com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData r77, X.C19370210qK r78, int r79) {
        /*
            Method dump skipped, instruction units count: 1798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2256581DUa.LJI(X.1DUa, X.0Y3I, java.lang.String, X.1DUR, boolean, boolean, com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext, X.1DUm, java.util.Map, java.util.Map, java.lang.String, X.0YTK, com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent, boolean, boolean, com.bytedance.im.core.proto.ReferenceInfo, com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent, com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData, X.10qK, int):void");
    }
}
