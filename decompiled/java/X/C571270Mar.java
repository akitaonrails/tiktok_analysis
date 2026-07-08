package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571270Mar extends C14LI {
    public final VideoPublishEditModel LIZLLL;
    public final String LJ;
    public final NLEModel LJFF;
    public final String LJI;
    public final EnumC2006507tX LJII;

    @Override // X.C14LI
    public final CreativeModel LIZ() {
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        if (videoPublishEditModel != null) {
            return videoPublishEditModel.creativeModel;
        }
        return null;
    }

    @Override // X.C14LI
    public final Float LIZIZ() {
        AudioRecorderParam veAudioRecorderParam;
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        if (videoPublishEditModel == null || (veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam()) == null) {
            return null;
        }
        return Float.valueOf(veAudioRecorderParam.getRecordVolume());
    }

    @Override // X.C14LI
    public final String LIZJ() {
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        if (videoPublishEditModel != null) {
            return videoPublishEditModel.getEnterFrom();
        }
        return null;
    }

    @Override // X.C14LI
    public final MusicBuzModel LIZLLL() {
        CreativeModel creativeModel;
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null) {
            return null;
        }
        return creativeModel.musicBuzModel;
    }

    @Override // X.C14LI
    public final NLEModel LJFF() {
        NLEInfoModel nLEInfoModel;
        NLEModel nLEModel = this.LJFF;
        if (nLEModel != null) {
            return nLEModel;
        }
        CreativeModel creativeModelLIZ = LIZ();
        if (creativeModelLIZ == null || (nLEInfoModel = creativeModelLIZ.nleInfoModel) == null) {
            return null;
        }
        return nLEInfoModel.nleModel;
    }

    @Override // X.C14LI
    public final String LJII() {
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        if (videoPublishEditModel != null) {
            return C1403540mcy.LJI(videoPublishEditModel, null);
        }
        return null;
    }

    @Override // X.C14LI
    public final boolean LJIIIIZZ() {
        VecNLETrackSPtr tracks;
        CreativeModel creativeModelLIZ;
        NLEInfoModel nLEInfoModel;
        NLEModel nLEModel = this.LJFF;
        if ((nLEModel == null && ((creativeModelLIZ = LIZ()) == null || (nLEInfoModel = creativeModelLIZ.nleInfoModel) == null || (nLEModel = nLEInfoModel.nleModel) == null)) || (tracks = nLEModel.getTracks()) == null) {
            return false;
        }
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            NLETrack next = it2.next();
            if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "BGM")) {
                return next != null;
            }
        }
        return false;
    }

    @Override // X.C14LI
    public final String LJI() {
        return this.LJ;
    }

    @Override // X.C14LI, X.InterfaceC20153913tR
    public final String getId() {
        return this.LJI;
    }

    @Override // X.InterfaceC20153913tR
    public final EnumC2006507tX getTaskType() {
        return this.LJII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C571270Mar(VideoPublishEditModel videoPublishEditModel, String str, String str2, NLEModel nLEModel, int i) {
        super(str);
        str2 = (i & 4) != 0 ? null : str2;
        nLEModel = (i & 8) != 0 ? null : nLEModel;
        this.LIZLLL = videoPublishEditModel;
        this.LJ = str2;
        this.LJFF = nLEModel;
        this.LJI = "EditMusicChangeTask";
        this.LJII = EnumC2006507tX.MUSIC_CHANGE;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            creativeToolsPluginService.LIZ();
        }
    }
}
