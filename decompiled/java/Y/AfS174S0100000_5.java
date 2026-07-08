package Y;

import X.AbstractC19852312lt;
import X.C098200Yq;
import X.C09JN;
import X.C0FPB;
import X.C0FPE;
import X.C0LAB;
import X.C1428470nHB;
import X.C1462570oAB;
import X.C15KO;
import X.C189200o6;
import X.C19560811fy;
import X.C1C7U;
import X.C204607154j;
import X.C20684815ws;
import X.C363230ELx;
import X.InterfaceC1364105Vn;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.lyric.LyricStickerPanelTagController;
import com.ss.android.vesdk.VEUtils;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AfS174S0100000_5 implements C09JN {
    public final int $t;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
        }
    }

    public AfS174S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS174S0100000_5 afS174S0100000_5, Object obj) {
        C1C7U.LIZ("EditProMusicController@be56.initV2$2");
        C204607154j c204607154j = (C204607154j) obj;
        if (c204607154j != null) {
            ((C363230ELx) afS174S0100000_5.l0).LJIIJJI = C15KO.LIZIZ(c204607154j.LIZ);
        }
        C1C7U.LIZIZ("EditProMusicController@be56.initV2$2");
    }

    public static final void accept$1(AfS174S0100000_5 afS174S0100000_5, Object obj) {
        C1C7U.LIZ("VoiceChooseVideoCoverView$Adapter@996d.loadThumb$2");
        Pair pair = (Pair) obj;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        ListProtector.set(((C0FPE) afS174S0100000_5.l0).LLILZ, iIntValue + 1, new Pair(2, pair));
        C0FPE c0fpe = (C0FPE) afS174S0100000_5.l0;
        C19560811fy c19560811fy = c0fpe.LL;
        if (c19560811fy != null) {
            int i = c19560811fy.LIZLLL;
            if (iIntValue == i - 1) {
                c0fpe.notifyItemChanged(i);
            }
        }
        C0FPE c0fpe2 = (C0FPE) afS174S0100000_5.l0;
        if (c0fpe2.LLILZIL) {
            c0fpe2.LLILZIL = false;
            c0fpe2.notifyDataSetChanged();
        } else {
            c0fpe2.notifyItemChanged(iIntValue);
        }
        C1C7U.LIZIZ("VoiceChooseVideoCoverView$Adapter@996d.loadThumb$2");
    }

    public static final void accept$2(AfS174S0100000_5 afS174S0100000_5, Object obj) {
        C1C7U.LIZ("VideoEditMobHelperKt@d050.mobLandscapeTextGuidanceShow$2");
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", ((VideoPublishEditModel) afS174S0100000_5.l0).getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL((VideoPublishEditModel) afS174S0100000_5.l0));
        c0lab.LJ("shoot_way", ((VideoPublishEditModel) afS174S0100000_5.l0).mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL((VideoPublishEditModel) afS174S0100000_5.l0));
        u4.LIZIZ(c0lab, (VEUtils.VEVideoFileInfo) ((AbstractC19852312lt) obj).orNull(), (VideoPublishEditModel) afS174S0100000_5.l0);
        C20684815ws.LJIILLIIL("landscape_text_guide_show", c0lab.LIZ);
        C1C7U.LIZIZ("VideoEditMobHelperKt@d050.mobLandscapeTextGuidanceShow$2");
    }

    public static final void accept$3(AfS174S0100000_5 afS174S0100000_5, Object obj) {
        C1C7U.LIZ("ChooseVideoCoverView$Adapter@4970.loadThumb$1");
        Pair<?, ?> pair = (Pair) obj;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        C0FPB c0fpb = (C0FPB) afS174S0100000_5.l0;
        c0fpb.LLILZ[iIntValue] = pair;
        if (c0fpb.LLILZIL) {
            c0fpb.LLILZIL = false;
            c0fpb.notifyDataSetChanged();
        } else {
            c0fpb.notifyItemChanged(iIntValue);
        }
        C1C7U.LIZIZ("ChooseVideoCoverView$Adapter@4970.loadThumb$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$4(Y.AfS174S0100000_5 r5, java.lang.Object r6) {
        /*
            java.lang.String r4 = "AddYoursStickerTopicRepo@822c.requestRecommendTopicsByContent$2$1"
            X.C1C7U.LIZ(r4)
            com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi$AddYoursTopicRecommendResp r6 = (com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi.AddYoursTopicRecommendResp) r6
            java.util.List<com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi$AddYoursTopicRecommendInfo> r3 = r6.recommendTopics
            boolean r0 = r3.isEmpty()
            r2 = 1
            r1 = r0 ^ 1
            r0 = 0
            if (r1 == 0) goto L4a
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r0)
            com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi$AddYoursTopicRecommendInfo r0 = (com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi.AddYoursTopicRecommendInfo) r0
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r0 = r0.addYoursSticker
            if (r0 == 0) goto L48
            java.lang.String r0 = r0.getText()
        L21:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L4a
        L27:
            java.lang.Integer r0 = r6.statusCode
            if (r0 == 0) goto L44
            int r0 = r0.intValue()
            if (r0 != 0) goto L44
            if (r2 == 0) goto L44
            java.lang.Object r1 = r5.l0
            X.05Vn r1 = (X.InterfaceC1364105Vn) r1
            X.C189200o6.m2constructorimpl(r6)
            X.00o6 r0 = X.C189200o6.m1boximpl(r6)
            X.C189200o6.m2constructorimpl(r0)
            r1.resumeWith(r0)
        L44:
            X.C1C7U.LIZIZ(r4)
            return
        L48:
            r0 = 0
            goto L21
        L4a:
            r2 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS174S0100000_5.accept$4(Y.AfS174S0100000_5, java.lang.Object):void");
    }

    public static final void accept$5(AfS174S0100000_5 afS174S0100000_5, Object obj) {
        C1C7U.LIZ("AddYoursStickerTopicRepo@822c.requestRecommendTopicsByContent$2$2");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS174S0100000_5.l0;
        C098200Yq c098200Yq = new C098200Yq((Throwable) obj);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
        C1C7U.LIZIZ("AddYoursStickerTopicRepo@822c.requestRecommendTopicsByContent$2$2");
    }

    public static final void accept$6(AfS174S0100000_5 afS174S0100000_5, Object obj) {
        C1C7U.LIZ("LyricStickerPanelTagController@dcae.init$1");
        if (((Boolean) obj).booleanValue()) {
            ((LyricStickerPanelTagController) afS174S0100000_5.l0).LIZLLL();
        }
        C1C7U.LIZIZ("LyricStickerPanelTagController@dcae.init$1");
    }

    public static final void accept$7(AfS174S0100000_5 afS174S0100000_5, Object obj) {
        C1C7U.LIZ("LyricStickerPanelTagController@dcae.init$3");
        Pair pair = (Pair) obj;
        if (C1462570oAB.LJIILL((Effect) pair.getFirst()) && ((Boolean) pair.getSecond()).booleanValue()) {
            ((LyricStickerPanelTagController) afS174S0100000_5.l0).LIZIZ();
            ((LyricStickerPanelTagController) afS174S0100000_5.l0).LIZJ();
        }
        C1C7U.LIZIZ("LyricStickerPanelTagController@dcae.init$3");
    }

    public static final void accept$8(AfS174S0100000_5 afS174S0100000_5, Object obj) {
        C1C7U.LIZ("AvatarCreateCanvasData@a4a2.createNewCanvas$2");
        ((Function1) afS174S0100000_5.l0).invoke(Boolean.FALSE);
        C1C7U.LIZIZ("AvatarCreateCanvasData@a4a2.createNewCanvas$2");
    }
}
