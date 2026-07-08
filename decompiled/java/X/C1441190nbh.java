package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.AiMeStyleInfo;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pyl.s;

/* JADX INFO: renamed from: X.0nbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441190nbh extends ArrayList<TimeSpeedModelExtension> {
    public transient s LL;
    public transient FaceStickerBean LLILLJJLI;
    public transient AiMeStyleInfo LLILLL;
    public transient List<AVChallenge> LLILZ;
    public transient int LLILZIL;
    public BeautyMetadata LLILZLL;
    public String LLIZ;
    public transient int LLIZLLLIL;
    public transient int LLJ;
    public float LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public String LLJJ;
    public transient Bundle LLJJI;
    public String segmentBeginTime;

    public C1441190nbh() {
        this.LLILZIL = -1;
        this.LLIZLLLIL = -1;
        this.LLJ = -1;
        this.LLJI = -1.0f;
    }

    public C1441190nbh(Collection<? extends TimeSpeedModelExtension> collection) {
        super(collection);
        this.LLILZIL = -1;
        this.LLIZLLLIL = -1;
        this.LLJ = -1;
        this.LLJI = -1.0f;
    }

    public long end(long j, Bundle bundle) {
        return end(j, null, null, null, null, null, null, null, null, bundle, null, null, null);
    }

    public void begin(s sVar, Bundle bundle, Bundle bundle2) {
        this.LL = sVar;
        this.LLILLJJLI = (FaceStickerBean) bundle.getParcelable("currentSticker");
        this.LLJIJIL = bundle.getBoolean("is_uploadtype_sticker");
        this.LLJILJIL = bundle.getInt("upload_type_sticker_media_size");
        this.LLJILJILJ = bundle.getBoolean("is_texttype_sticker");
        this.LLILZ = bundle.getParcelableArrayList("currentChallenge");
        this.LLILZIL = bundle.getInt("cameraId", -1);
        this.LLILZLL = (BeautyMetadata) bundle.getSerializable("beautyMetadata");
        this.LLIZ = bundle.getString("cameraLensInfo");
        this.segmentBeginTime = String.valueOf(SystemClock.elapsedRealtime());
        boolean z = false;
        if (bundle.getInt("is_use_mirror_mode", 0) == 1) {
            z = true;
        }
        this.LLJILLL = z;
        this.LLIZLLLIL = bundle.getInt("tabOrder", -1);
        this.LLJ = bundle.getInt("imprPosition", -1);
        this.LLJI = bundle.getFloat("effect_intensity", -1.0f);
        this.LLJJ = bundle.getString("mp4_file_path", "");
        this.LLJJI = bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long end(long r61, com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo r63, java.util.List<java.lang.String> r64, java.util.List<java.lang.String> r65, X.C1441200nbi r66, com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo r67, com.ss.android.ugc.aweme.sticker.model.BackgroundVideo r68, com.ss.android.ugc.aweme.sticker.model.DiyPropVideo r69, java.lang.String r70, android.os.Bundle r71, java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo> r72, com.ss.android.ugc.aweme.sticker.model.NewGreenScreenEffectModel r73, com.ss.android.ugc.aweme.shortvideo.model.RecordFilterModel r74) {
        /*
            Method dump skipped, instruction units count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1441190nbh.end(long, com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo, java.util.List, java.util.List, X.0nbi, com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo, com.ss.android.ugc.aweme.sticker.model.BackgroundVideo, com.ss.android.ugc.aweme.sticker.model.DiyPropVideo, java.lang.String, android.os.Bundle, java.util.List, com.ss.android.ugc.aweme.sticker.model.NewGreenScreenEffectModel, com.ss.android.ugc.aweme.shortvideo.model.RecordFilterModel):long");
    }
}
