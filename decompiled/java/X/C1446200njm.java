package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0njm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446200njm implements IMusicRequestParam {
    public final boolean LL;
    public String LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public Function0<? extends Object> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ long LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ C259800zU<Map<String, Object>> LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ boolean LLJJIJI;

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getCanFetchingSimilarSong() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getDisableCache() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getEnterFrom() {
        return "video_shoot_page";
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public Long getFirstMusicId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getInfoStickerList() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getItemId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getMicroAppId() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public int getMusicTag() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getMvId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public Long getReplaceMusicIndex() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public int getSoundPageScene() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getStrippedMetasongId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getTextContent() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isEditPageImageMode() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public Map<String, Object> getRecommendExtra() {
        return this.LLJJ.element;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getChallengeId() {
        AVChallenge aVChallenge = (AVChallenge) C13LP.LJJJLZIJ(0, C1443030nef.LJII().LIZ);
        if (aVChallenge != null) {
            return aVChallenge.cid;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isStickPointAutoMusic() {
        return IMusicRequestParam.DefaultImpls.isStickPointAutoMusic(this);
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getContentSource() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getContentType() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getCreationId() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getEffectId() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public long getMaxMusicDuration() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getMusicID() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public int getMusicMaxLoopDuration() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getNoWaitFrameResult() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getPinnedMusicId() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public Function0<Object> getRecommendMusicProvider() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getResourceId() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getShootWay() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getUnlimitedOnly() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public long getVideoDuration() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getWithoutUnderstanding() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isMusicLoop() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isReplaceMusic() {
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isUploadClickNext() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setMusicLoop(boolean z) {
        this.LLILLL = z;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setMusicMaxLoopDuration(int i) {
        this.LLILZ = i;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setNoWaitFrameResult(boolean z) {
        this.LLILZIL = z;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setPinnedMusicId(String str) {
        this.LLILLJJLI = str;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setRecommendMusicProvider(Function0<? extends Object> function0) {
        this.LLILZLL = function0;
    }

    public C1446200njm(ShortVideoContext shortVideoContext, String str, String str2, String str3, String str4, String str5, boolean z, long j, boolean z2, C259800zU<Map<String, Object>> c259800zU, String str6, String str7, boolean z3) {
        boolean z4;
        boolean z5;
        AVMusic aVMusicExtractAVMusic;
        int shootDuration;
        boolean zIsUnlimitedMusic;
        MusicBuzModel musicBuzModel;
        MusicObject musicObject;
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel2;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
        this.LLJI = str4;
        this.LLJIJIL = str5;
        this.LLJILJIL = z;
        this.LLJILJILJ = j;
        this.LLJILLL = z2;
        this.LLJJ = c259800zU;
        this.LLJJI = str6;
        this.LLJJIII = str7;
        this.LLJJIJI = z3;
        int iMin = 0;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_shoot_page_without_understanding", true, false) && Intrinsics.LJFF(getEnterFrom(), "video_shoot_page")) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.LL = z4;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (musicBuzModel2 = creativeModel.musicBuzModel) != null) {
            z5 = musicBuzModel2.shouldMusicLoop;
        } else {
            z5 = false;
        }
        this.LLILLL = z5;
        if (shortVideoContext != null) {
            List<String> list = C1442040nd4.LIZ;
            long maxShootingDuration = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration(!shortVideoContext.cameraComponentModel.mCurrentDurationMode, shortVideoContext);
            CreativeModel creativeModel2 = shortVideoContext.creativeModel;
            if (creativeModel2 != null && (musicBuzModel = creativeModel2.musicBuzModel) != null && (musicObject = musicBuzModel.music) != null) {
                aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicObject);
            } else {
                aVMusicExtractAVMusic = null;
            }
            if (C1458070o2v.LJFF()) {
                shootDuration = C1458070o2v.LIZLLL();
            } else if (aVMusicExtractAVMusic != null) {
                shootDuration = aVMusicExtractAVMusic.getShootDuration();
            } else {
                shootDuration = 0;
            }
            int i = (int) (maxShootingDuration <= 0 ? shortVideoContext.cameraComponentModel.mMaxDuration : maxShootingDuration);
            if (aVMusicExtractAVMusic != null) {
                zIsUnlimitedMusic = aVMusicExtractAVMusic.isUnlimitedMusic();
            } else {
                zIsUnlimitedMusic = false;
            }
            if (C1458070o2v.LJFF()) {
                if (zIsUnlimitedMusic) {
                    iMin = i;
                } else {
                    int iLIZJ = (int) C1442040nd4.LIZJ(aVMusicExtractAVMusic, shortVideoContext);
                    if (iLIZJ > shootDuration) {
                        iMin = Math.min(i, iLIZJ);
                    } else {
                        int i2 = shortVideoContext.shootMode;
                        iMin = (i2 == 16 || i2 == 29) ? Math.min(i, Math.min(iLIZJ, shootDuration)) : Math.min(i, shootDuration);
                    }
                }
            }
        }
        this.LLILZ = iMin;
        this.LLILZLL = AFwS210S0000000_22.get$arr$(556);
    }
}
