package X;

import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicLogIdInput;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mrR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412510mrR {
    public static final ConcurrentHashMap<String, InterfaceC1412480mrO> LIZ;

    static {
        ConcurrentHashMap<String, InterfaceC1412480mrO> concurrentHashMap = new ConcurrentHashMap<>();
        LIZ = concurrentHashMap;
        concurrentHashMap.put("default", new InterfaceC1412480mrO() { // from class: X.0mrT
            public static final /* synthetic */ int LIZ = 0;

            @Override // X.InterfaceC1412480mrO
            public final String LIZ(ShortVideoContext shortVideoContext) {
                LogPbBean logPb;
                String imprId;
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
                if (aVMusicExtractAVMusic == null || (logPb = aVMusicExtractAVMusic.getLogPb()) == null || (imprId = logPb.getImprId()) == null) {
                    return "";
                }
                return imprId;
            }

            @Override // X.InterfaceC1412480mrO
            public final String LIZIZ(VideoPublishEditModel videoPublishEditModel, MusicLogIdInput musicLogIdInput) {
                LogPbBean logPb;
                String imprId;
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
                if (aVMusicExtractAVMusic == null || (logPb = aVMusicExtractAVMusic.getLogPb()) == null || (imprId = logPb.getImprId()) == null) {
                    return "";
                }
                return imprId;
            }
        });
        concurrentHashMap.put("sync_page_recommend", new InterfaceC1412480mrO() { // from class: X.0mrS
            @Override // X.InterfaceC1412480mrO
            public final String LIZ(ShortVideoContext shortVideoContext) {
                LogPbBean logPb;
                String imprId;
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
                if (aVMusicExtractAVMusic == null || (logPb = aVMusicExtractAVMusic.getLogPb()) == null || (imprId = logPb.getImprId()) == null) {
                    return "";
                }
                return imprId;
            }

            @Override // X.InterfaceC1412480mrO
            public final String LIZIZ(VideoPublishEditModel videoPublishEditModel, MusicLogIdInput musicLogIdInput) {
                String musicId;
                LogPbBean logPb;
                String imprId;
                LogPbBean logPb2;
                String imprId2;
                MusicObject musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
                String str = null;
                if (musicObject != null) {
                    musicId = MusicBeanUtilKt.getMusicId(musicObject);
                } else {
                    musicId = null;
                }
                MixEditingModel mixEditingModel = videoPublishEditModel.creativeModel.mixEditingModel;
                SelectedMaterialItem selectedMaterialItem = mixEditingModel.selectedMaterialItem;
                if (selectedMaterialItem != null) {
                    str = selectedMaterialItem.bindMusicId;
                }
                TemplateMobParams templateMobParams = mixEditingModel.templateMobParams;
                if (templateMobParams != null && templateMobParams.autocutTemplateType == EnumC1412600mra.SOUND_SYNC_TEMPLATE.getValue()) {
                    AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
                    if (aVMusicExtractAVMusic == null || (logPb2 = aVMusicExtractAVMusic.getLogPb()) == null || (imprId2 = logPb2.getImprId()) == null) {
                        return "";
                    }
                    return imprId2;
                }
                if (Intrinsics.LJFF(musicId, str)) {
                    return videoPublishEditModel.creativeModel.mixEditingModel.requestId;
                }
                AVMusic aVMusicExtractAVMusic2 = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
                if (aVMusicExtractAVMusic2 == null || (logPb = aVMusicExtractAVMusic2.getLogPb()) == null || (imprId = logPb.getImprId()) == null) {
                    return "";
                }
                return imprId;
            }
        });
    }

    public static InterfaceC1412480mrO LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            InterfaceC1412480mrO interfaceC1412480mrO = LIZ.get("default");
            if (interfaceC1412480mrO != null) {
                return interfaceC1412480mrO;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        ConcurrentHashMap<String, InterfaceC1412480mrO> concurrentHashMap = LIZ;
        InterfaceC1412480mrO interfaceC1412480mrO2 = concurrentHashMap.get(str);
        if (interfaceC1412480mrO2 != null) {
            return interfaceC1412480mrO2;
        }
        InterfaceC1412480mrO interfaceC1412480mrO3 = concurrentHashMap.get("default");
        if (interfaceC1412480mrO3 != null) {
            return interfaceC1412480mrO3;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
