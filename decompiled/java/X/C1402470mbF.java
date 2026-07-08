package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402470mbF {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0bfa  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x1523  */
    /* JADX WARN: Removed duplicated region for block: B:920:0x1996  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r86, boolean r87, boolean r88, java.lang.String r89, java.lang.String r90, boolean r91) {
        /*
            Method dump skipped, instruction units count: 7183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402470mbF.LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, boolean, java.lang.String, java.lang.String, boolean):void");
    }

    public static int LIZ(VideoPublishEditModel videoPublishEditModel) {
        int i;
        MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
        MusicObject musicObject = musicBuzModel.music;
        if (musicObject != null) {
            i = (int) (musicObject.previewStartTime * LSPassThroughRecordSizeConfig.DEFAULT);
        } else {
            i = 0;
        }
        int i2 = musicBuzModel.clipShootDuration + i;
        int i3 = musicBuzModel.musicStartFromCut;
        if (i3 >= i && i3 + videoPublishEditModel.getVideoLength() <= i2) {
            return 0;
        }
        return 1;
    }

    public static NLEModel LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        String nleData = videoPublishEditModel.getNleData();
        if (nleData != null && nleData.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        NLENode nLENodeDeepClone = null;
        if (z) {
            return null;
        }
        C0FGC.LIZ(2);
        if (C350300DoK.LIZ() && !videoPublishEditModel.getNleDataChange() && videoPublishEditModel.getNleModel() != null) {
            NLEModel nleModel = videoPublishEditModel.getNleModel();
            if (nleModel != null) {
                nLENodeDeepClone = nleModel.deepClone();
            }
            return NLEModel.dynamicCast(nLENodeDeepClone);
        }
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
        if (C350300DoK.LIZ()) {
            videoPublishEditModel.setNleModel(NLEModel.dynamicCast(nLEEditorLIZ.getModel().deepClone()));
            videoPublishEditModel.setNleDataChange(false);
        }
        return nLEEditorLIZ.getModel();
    }

    public static Pair LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        EditEffectAnchorManager data;
        String str2;
        if (str == null || (data = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).getData(str)) == null || !(!data.isTemplate()) || (str2 = videoPublishEditModel.mShootWay) == null) {
            return null;
        }
        int iHashCode = str2.hashCode();
        if (iHashCode != 1441490006) {
            if (iHashCode != 1820168897 || !str2.equals("editing_effect_template")) {
                return null;
            }
            C1402470mbF c1402470mbF = C1402440mbC.LIZ;
            List<EditEffectAnchorInfo> data2 = data.getData();
            c1402470mbF.getClass();
            return new Pair("is_default_effect_template", LIZJ(data2, videoPublishEditModel));
        }
        if (!str2.equals("editing_effect_page")) {
            return null;
        }
        C1402470mbF c1402470mbF2 = C1402440mbC.LIZ;
        List<EditEffectAnchorInfo> data3 = data.getData();
        c1402470mbF2.getClass();
        return new Pair("is_default_effect", LIZJ(data3, videoPublishEditModel));
    }

    public static String LIZJ(List list, VideoPublishEditModel videoPublishEditModel) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((EditEffectAnchorInfo) it2.next()).effectId);
        }
        ArrayList<EffectPointModel> arrayList2 = videoPublishEditModel.getEditEffectModel().effectList;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator<EffectPointModel> it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(it3.next().getKey());
        }
        if (!arrayList.isEmpty()) {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                if (!arrayList3.contains(it4.next())) {
                    return CardStruct.IStatusCode.DEFAULT;
                }
            }
            return "1";
        }
        return "1";
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LIZ(z ? 1 : 0, "is_virtual_feed");
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "enterbackground");
        C20684815ws.LJIILLIIL("preview_page_exit_background", c0lab.LIZ);
    }
}
