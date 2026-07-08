package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0njn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446210njn implements IMusicRequestParam {
    public String LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public Function0<? extends Object> LLILZIL;
    public final boolean LLILZLL;
    public final /* synthetic */ VideoPublishEditModel LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ Long LLJJI;
    public final /* synthetic */ Long LLJJIII;
    public final /* synthetic */ String LLJJIJI;
    public final /* synthetic */ String LLJJIJIIJIL;
    public final /* synthetic */ boolean LLJJIJIL;
    public final /* synthetic */ long LLJJJ;
    public final /* synthetic */ boolean LLJJJIL;
    public final /* synthetic */ Map<String, Object> LLJJJJ;
    public final /* synthetic */ long LLJJJJJIL;
    public final /* synthetic */ int LLJJJJLIIL;
    public final /* synthetic */ String LLJJL;
    public final /* synthetic */ String LLJJLIIIJLLLLLLLZ;
    public final /* synthetic */ boolean LLJL;
    public final /* synthetic */ String LLJLIL;
    public final /* synthetic */ String LLJLILLLLZIIL;
    public final /* synthetic */ String LLJLL;

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getEnterFrom() {
        return "video_edit_page";
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public int getMusicTag() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getWithoutUnderstanding() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isUploadClickNext() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isEditPageImageMode() {
        IMusicExternalService iMusicExternalService;
        if (this.LLIZ == null || (iMusicExternalService = (IMusicExternalService) PluggableExtentionKt.pluggableSpi$default(IMusicExternalService.class, false, false, false, 14, null)) == null) {
            return false;
        }
        return iMusicExternalService.LIZ(this.LLIZ);
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getCanFetchingSimilarSong() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getChallengeId() {
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getContentSource() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getContentType() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getCreationId() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getDisableCache() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getEffectId() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public Long getFirstMusicId() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getInfoStickerList() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getItemId() {
        return this.LLJLL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public long getMaxMusicDuration() {
        return this.LLJJJ;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getMicroAppId() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getMusicID() {
        return this.LLJLIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public int getMusicMaxLoopDuration() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getMvId() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getNoWaitFrameResult() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getPinnedMusicId() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public Map<String, Object> getRecommendExtra() {
        return this.LLJJJJ;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public Function0<Object> getRecommendMusicProvider() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public Long getReplaceMusicIndex() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getResourceId() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getShootWay() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public int getSoundPageScene() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getStrippedMetasongId() {
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getTextContent() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getUnlimitedOnly() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public long getVideoDuration() {
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isMusicLoop() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isReplaceMusic() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isStickPointAutoMusic() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setMusicLoop(boolean z) {
        this.LLILLJJLI = z;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setMusicMaxLoopDuration(int i) {
        this.LLILLL = i;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setNoWaitFrameResult(boolean z) {
        this.LLILZ = z;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setPinnedMusicId(String str) {
        this.LL = str;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setRecommendMusicProvider(Function0<? extends Object> function0) {
        this.LLILZIL = function0;
    }

    public C1446210njn(VideoPublishEditModel videoPublishEditModel, Function0<? extends Object> function0, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Long l2, String str8, String str9, boolean z3, long j, boolean z4, Map<String, ? extends Object> map, long j2, int i, String str10, String str11, boolean z5, String str12, String str13, String str14) {
        boolean z6;
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        this.LLIZ = videoPublishEditModel;
        this.LLIZLLLIL = z2;
        this.LLJ = str;
        this.LLJI = str2;
        this.LLJIJIL = str3;
        this.LLJILJIL = str4;
        this.LLJILJILJ = str5;
        this.LLJILLL = str6;
        this.LLJJ = str7;
        this.LLJJI = l;
        this.LLJJIII = l2;
        this.LLJJIJI = str8;
        this.LLJJIJIIJIL = str9;
        this.LLJJIJIL = z3;
        this.LLJJJ = j;
        this.LLJJJIL = z4;
        this.LLJJJJ = map;
        this.LLJJJJJIL = j2;
        this.LLJJJJLIIL = i;
        this.LLJJL = str10;
        this.LLJJLIIIJLLLLLLLZ = str11;
        this.LLJL = z5;
        this.LLJLIL = str12;
        this.LLJLILLLLZIIL = str13;
        this.LLJLL = str14;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null) {
            z6 = musicBuzModel.shouldMusicLoop;
        } else {
            z6 = false;
        }
        this.LLILLJJLI = z6;
        this.LLILLL = videoPublishEditModel != null ? C1416310mxZ.LJJL(videoPublishEditModel, 0, null, 3) : 0;
        this.LLILZIL = function0;
        this.LLILZLL = z;
    }
}
