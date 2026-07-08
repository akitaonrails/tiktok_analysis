package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mas, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571280Mas extends C14LI {
    public final ShortVideoContext LIZLLL;
    public final String LJ;
    public final EnumC2006507tX LJFF;

    @Override // X.C14LI
    public final Float LIZIZ() {
        return null;
    }

    @Override // X.C14LI
    public final String LJI() {
        return null;
    }

    @Override // X.C14LI
    public final CreativeModel LIZ() {
        ShortVideoContext shortVideoContext = this.LIZLLL;
        if (shortVideoContext != null) {
            return shortVideoContext.creativeModel;
        }
        return null;
    }

    @Override // X.C14LI
    public final String LIZJ() {
        ShortVideoContext shortVideoContext = this.LIZLLL;
        if (shortVideoContext != null) {
            return shortVideoContext.enterFrom;
        }
        return null;
    }

    @Override // X.C14LI
    public final MusicBuzModel LIZLLL() {
        CreativeModel creativeModel;
        ShortVideoContext shortVideoContext = this.LIZLLL;
        if (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null) {
            return null;
        }
        return creativeModel.musicBuzModel;
    }

    @Override // X.C14LI
    public final String LJII() {
        ShortVideoContext shortVideoContext = this.LIZLLL;
        if (shortVideoContext != null) {
            return C1403540mcy.LJI(shortVideoContext, null);
        }
        return null;
    }

    @Override // X.C14LI
    public final NLEModel LJFF() {
        NLEInfoModel nLEInfoModel;
        CreativeModel creativeModelLIZ = LIZ();
        if (creativeModelLIZ == null || (nLEInfoModel = creativeModelLIZ.nleInfoModel) == null) {
            return null;
        }
        return nLEInfoModel.nleModel;
    }

    @Override // X.C14LI
    public final boolean LJIIIIZZ() {
        NLEInfoModel nLEInfoModel;
        NLEModel nLEModel;
        VecNLETrackSPtr tracks;
        CreativeModel creativeModelLIZ = LIZ();
        if (creativeModelLIZ == null || (nLEInfoModel = creativeModelLIZ.nleInfoModel) == null || (nLEModel = nLEInfoModel.nleModel) == null || (tracks = nLEModel.getTracks()) == null) {
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

    @Override // X.C14LI, X.InterfaceC20153913tR
    public final String getId() {
        return this.LJ;
    }

    @Override // X.InterfaceC20153913tR
    public final EnumC2006507tX getTaskType() {
        return this.LJFF;
    }

    public C571280Mas(ShortVideoContext shortVideoContext) {
        super("enter_from_music_router");
        this.LIZLLL = shortVideoContext;
        this.LJ = "RecordMusicChangeTask";
        this.LJFF = EnumC2006507tX.MUSIC_CHANGE;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            creativeToolsPluginService.LIZ();
        }
    }
}
