package X;

import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580700Mq4 {
    public static final boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "studio_creation_ugc_template_preview_style", true) == 2;
    }

    public static final void LIZ(BaseActivity baseActivity, C580710Mq5 c580710Mq5, int i) {
        MusicModel musicModelConvertToMusicModel;
        String musicId;
        List<TemplateSlot> second;
        String id;
        String musicPath;
        String str;
        String str2;
        C532330KuF templateData;
        C532330KuF templateData2;
        Long lValueOf;
        MusicModel musicModelConvertToMusicModel2;
        String idStr;
        UgcTemplateAlbumConfig ugcTemplateAlbumConfig = new UgcTemplateAlbumConfig();
        CreativeInfo creativeInfo = null;
        if (c580710Mq5 instanceof C19680111zD) {
            Music music = c580710Mq5.LIZ().getMusic();
            if (music != null && (idStr = music.getIdStr()) != null) {
                lValueOf = Long.valueOf(CastLongProtector.parseLong(idStr));
            } else {
                lValueOf = null;
            }
            Music music2 = c580710Mq5.LIZ().getMusic();
            if (music2 != null && (musicModelConvertToMusicModel2 = music2.convertToMusicModel()) != null) {
                if (lValueOf != null) {
                    musicModelConvertToMusicModel2.setId(lValueOf.longValue());
                }
            } else {
                musicModelConvertToMusicModel2 = null;
            }
            ugcTemplateAlbumConfig.setMusicModel(musicModelConvertToMusicModel2);
        } else {
            Music music3 = c580710Mq5.LIZ().getMusic();
            if (music3 != null) {
                musicModelConvertToMusicModel = music3.convertToMusicModel();
            } else {
                musicModelConvertToMusicModel = null;
            }
            if (c580710Mq5.LIZJ) {
                if (musicModelConvertToMusicModel != null) {
                    musicId = musicModelConvertToMusicModel.getMusicId();
                } else {
                    musicId = null;
                }
                if (Intrinsics.LJFF(musicId, c580710Mq5.LJII)) {
                    ugcTemplateAlbumConfig.setMusicModel(musicModelConvertToMusicModel);
                }
            } else {
                ugcTemplateAlbumConfig.setMusicModel(musicModelConvertToMusicModel);
            }
        }
        TemplateSlot templateSlot = c580710Mq5.LJIIJ;
        if (templateSlot != null) {
            double clipStart = templateSlot.getClipStart();
            double d = LSPassThroughRecordSizeConfig.DEFAULT;
            ugcTemplateAlbumConfig.setMusicStart((int) (clipStart * d));
            ugcTemplateAlbumConfig.setMusicEnd((int) (templateSlot.getClipEnd() * d));
        }
        ugcTemplateAlbumConfig.setMusicSlot(c580710Mq5.LJIIJ);
        Pair<Boolean, List<TemplateSlot>> pairLIZ = C531610Kt5.LIZ(c580710Mq5.LJIIIZ);
        if (pairLIZ.getFirst().booleanValue()) {
            second = pairLIZ.getSecond();
        } else {
            second = c580710Mq5.LJIIIZ;
        }
        List<TemplateSlot> second2 = C531620Kt6.LIZIZ(second, c580710Mq5.LIZJ).getSecond();
        ugcTemplateAlbumConfig.getSlotList().addAll(second2);
        ArrayList<Float> clipDurations = ugcTemplateAlbumConfig.getClipDurations();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(second2, 10));
        Iterator<TemplateSlot> it2 = second2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf((float) it2.next().getDuration()));
        }
        clipDurations.addAll(arrayList);
        Aweme awemeLIZ = c580710Mq5.LIZ();
        c580710Mq5.getClass();
        ugcTemplateAlbumConfig.setAnchor(C580710Mq5.LIZLLL(awemeLIZ));
        boolean z = c580710Mq5 instanceof C19680111zD;
        if (z) {
            ugcTemplateAlbumConfig.setTemplateId(((C19680111zD) c580710Mq5).LJIJJLI);
        } else {
            AnchorCommonStruct anchor = ugcTemplateAlbumConfig.getAnchor();
            if (anchor != null) {
                id = anchor.getId();
            } else {
                id = null;
            }
            ugcTemplateAlbumConfig.setTemplateId(id);
        }
        ugcTemplateAlbumConfig.setSlotIndex(i);
        InterfaceC19711912Aj interfaceC19711912Aj = (InterfaceC19711912Aj) c580710Mq5.LJFF(InterfaceC19711912Aj.class);
        if (interfaceC19711912Aj != null) {
            musicPath = interfaceC19711912Aj.getMusicPath();
        } else {
            musicPath = null;
        }
        ugcTemplateAlbumConfig.setMusicPath(musicPath);
        if (interfaceC19711912Aj != null && (templateData2 = interfaceC19711912Aj.getTemplateData()) != null) {
            str = templateData2.LIZ;
        } else {
            str = null;
        }
        ugcTemplateAlbumConfig.setTemplateUrl(str);
        if (interfaceC19711912Aj != null && (templateData = interfaceC19711912Aj.getTemplateData()) != null) {
            str2 = templateData.LIZIZ;
        } else {
            str2 = null;
        }
        ugcTemplateAlbumConfig.setTemplateMD5(str2);
        CreativeInfo creativeInfo2 = c580710Mq5.LIZIZ;
        if (creativeInfo2 != null) {
            creativeInfo = creativeInfo2;
        }
        ugcTemplateAlbumConfig.setCreativeInfo(creativeInfo);
        ugcTemplateAlbumConfig.setFromPUgc(c580710Mq5.LIZJ);
        ugcTemplateAlbumConfig.setPUGCTemplateFromAutoCutAnchor(c580710Mq5.LIZLLL);
        ugcTemplateAlbumConfig.setMainAnchorType(c580710Mq5.LJ);
        ugcTemplateAlbumConfig.setTtTemplateType(c580710Mq5.LJFF);
        ugcTemplateAlbumConfig.setEpTemplateInfo(c580710Mq5.LJI);
        ugcTemplateAlbumConfig.setTemplateMusicId(c580710Mq5.LJII);
        ugcTemplateAlbumConfig.setShootWay(c580710Mq5.LIZJ());
        ugcTemplateAlbumConfig.setHasMatting(c580710Mq5.LJIILL);
        ugcTemplateAlbumConfig.setEnterMethod(c580710Mq5.LJIILLIIL);
        ugcTemplateAlbumConfig.setRelationEnterMethod(c580710Mq5.LJIIZILJ);
        ugcTemplateAlbumConfig.setHasMagic(c580710Mq5.LJIJ);
        ugcTemplateAlbumConfig.setFeatureList(c580710Mq5.LJIJI);
        if (z) {
            C19680111zD c19680111zD = (C19680111zD) c580710Mq5;
            ugcTemplateAlbumConfig.setChallenges(c19680111zD.LJJI);
            ugcTemplateAlbumConfig.setAnchors(c19680111zD.LJJIFFI);
            ugcTemplateAlbumConfig.setOpenPlatformExtra(c19680111zD.LJJII);
            ugcTemplateAlbumConfig.setShootWay(c19680111zD.LJJ);
            ugcTemplateAlbumConfig.setReporterType(Integer.valueOf(c19680111zD.LJJIII));
            ugcTemplateAlbumConfig.setUgcTemplateTag("ugc_template_tag_game");
        }
        C1688680u2s.LJJ(baseActivity, ugcTemplateAlbumConfig);
    }
}
