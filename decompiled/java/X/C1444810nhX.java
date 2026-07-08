package X;

import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicCompatModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.LyricSceneCopyRight;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nhX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444810nhX {
    public static final MusicBuzModel LIZ(MusicBuzModel musicBuzModel) {
        Object c098200Yq;
        Parcel parcelObtain = Parcel.obtain();
        Object obj = null;
        try {
            parcelObtain.writeValue(musicBuzModel);
            parcelObtain.setDataPosition(0);
            Object value = parcelObtain.readValue(MusicBuzModel.class.getClassLoader());
            if (value instanceof MusicBuzModel) {
                c098200Yq = (MusicBuzModel) value;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        MusicBuzModel musicBuzModel2 = (MusicBuzModel) obj;
        parcelObtain.recycle();
        return musicBuzModel2;
    }

    public static final boolean LIZJ(MusicBuzModel musicBuzModel) {
        MusicCompatModel musicCompatModel;
        LyricSceneCopyRight lyricSceneCopyRight;
        MusicObject musicObject = musicBuzModel.music;
        if (musicObject != null && (musicCompatModel = musicObject.musicCompatModel) != null && (lyricSceneCopyRight = musicCompatModel.getLyricSceneCopyRight()) != null) {
            return lyricSceneCopyRight.getLyricSticker();
        }
        return false;
    }

    public static final String LIZIZ(MusicBuzModel musicBuzModel, String str) {
        if (!C297100Bki.LIZ() || str == null || str.length() == 0 || !Intrinsics.LJFF(str, musicBuzModel.onlinePath)) {
            return null;
        }
        return musicBuzModel.onlineKey;
    }
}
