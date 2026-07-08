package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ELJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELJ implements Serializable {
    public final transient boolean LL;
    public final transient boolean LLILLJJLI;
    public transient VideoPublishEditModel LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public String LLILZLL;
    public ArrayList<Pair<String, String>> LLIZ;
    public boolean LLIZLLLIL;
    public C0ELL LLJ;
    public ArrayList<AVMusic> LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public Boolean LLJILLL;
    public String LLJJ;
    public long LLJJI;
    public boolean LLJJIII;
    public transient boolean LLJJIJI;
    public transient boolean LLJJIJIIJIL;
    public transient boolean LLJJIJIL;
    public transient boolean LLJJJ;
    public transient boolean LLJJJIL;
    public transient float LLJJJJ;
    public transient boolean LLJJJJJIL;
    public transient boolean LLJJJJLIIL;
    public transient boolean LLJJL;
    public transient boolean LLJJLIIIJLLLLLLLZ;
    public transient boolean LLJL;
    public transient boolean LLJLIL;
    public transient boolean LLJLILLLLZIIL;
    public transient boolean LLJLL;
    public transient boolean LLJLLIL;
    public transient boolean LLJLLL;
    public transient Effect LLJZ;
    public transient C365920EWg LLJZIJLIL;
    public transient boolean LLL;
    public transient String LLLF;
    public transient C0EZH LLLFF;

    public C0ELJ() {
        this(false, false);
    }

    public final void setInitIntent(EnumC359990E9l enumC359990E9l) {
    }

    public final boolean enterFromSideMenu() {
        C0EZH c0ezh = this.LLLFF;
        if (c0ezh != null) {
            return c0ezh.LJ || c0ezh.LJIIJ || c0ezh.LIZJ || c0ezh.LJFF;
        }
        return false;
    }

    public final EnumC359990E9l getInitIntent() {
        C0EZH c0ezh = this.LLLFF;
        if (c0ezh != null) {
            return c0ezh.LJIIIZ;
        }
        return null;
    }

    public final C0ELK getPerformanceEnterFrom() {
        if (this.LL) {
            return C0ELK.FROM_EDITOR_ROOT;
        }
        if (this.LLILLJJLI) {
            return C0ELK.FROM_EDITOR_NOW;
        }
        if (!this.LLJJJ) {
            VideoPublishEditModel videoPublishEditModel = this.LLILLL;
            return (videoPublishEditModel != null && videoPublishEditModel.creativeModel.draftInfoModel.isDraft && videoPublishEditModel.mDraftToEditFrom == 0) ? C0ELK.FROM_DRAFT : C123100dR.LIZ(this.LLILZLL) ? C0ELK.FROM_ANCHOR : this.LLJJIJIIJIL ? C0ELK.FROM_CREATE_TEMPLATE : u4.LJJIL(this.LLILLL) ? C0ELK.FROM_EDITOR_TAB : u4.LJJIJIL(this.LLILLL) ? C0ELK.FROM_ALBUM : C0ELK.FROM_UNKNOWN;
        }
        if (this.LLJJJIL) {
            return C0ELK.FROM_RESTORE;
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LLILLL;
        if (videoPublishEditModel2 != null) {
            if (videoPublishEditModel2.mDraftToEditFrom == 0) {
                return C0ELK.FROM_DRAFT;
            }
            if (videoPublishEditModel2.mDraftToEditFrom == 2) {
                return C0ELK.FROM_FEED_RESTORE;
            }
        }
        return C0ELK.FROM_UNKNOWN;
    }

    public final boolean isCreatedFromEditNow() {
        VideoPublishEditModel videoPublishEditModel;
        return this.LLILLJJLI || (this.LLJJJ && (videoPublishEditModel = this.LLILLL) != null && videoPublishEditModel.creativeModel.nowsShootModel != null);
    }

    public final boolean isSpecialMode() {
        return this.LLIZLLLIL || this.LLJLLL || this.LLJ != null;
    }

    public final boolean getAutoOpenEPFromAIGC() {
        return this.LLJJJJLIIL;
    }

    public final boolean getAutoOpenEPFromAsyncMagic() {
        return this.LLJJJJJIL;
    }

    public final Effect getCaptionCaptionTemplate() {
        return this.LLJZ;
    }

    public final C0ELL getChangeBanMusicMode() {
        return this.LLJ;
    }

    public final VideoPublishEditModel getEditModel() {
        return this.LLILLL;
    }

    public final float getEditPageTextInputPositionY() {
        return this.LLJJJJ;
    }

    public final String getEditorProAnchorType() {
        return this.LLILZLL;
    }

    public final boolean getEffectMultiTrackMode() {
        return this.LLIZLLLIL;
    }

    public final boolean getEnableBeat() {
        return this.LLJL;
    }

    public final boolean getEnableFilter() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final boolean getEnableSticker() {
        return this.LLJLIL;
    }

    public final boolean getEnableTransition() {
        return this.LLJJL;
    }

    public final String getEnterFrom() {
        return this.LLJILJILJ;
    }

    public final C0EZH getEnterMode() {
        return this.LLLFF;
    }

    public final long getEnterMovePos() {
        return this.LLJJI;
    }

    public final String getEnterSelectSlotId() {
        return this.LLJJ;
    }

    public final String getEnterSelectedFuncType() {
        return this.LLLF;
    }

    public final boolean getFromCaptionClick() {
        return this.LLJLL;
    }

    public final boolean getFromRetouch() {
        return this.LLJLLIL;
    }

    public final ArrayList<Pair<String, String>> getInlineCaptionCaches() {
        return this.LLIZ;
    }

    public final C365920EWg getMobParam() {
        return this.LLJZIJLIL;
    }

    public final boolean getNeedStartEditorProImmediately() {
        return this.LLJJIJIL;
    }

    public final boolean getOnlyCaptionMode() {
        return this.LLJLILLLLZIIL;
    }

    public final String getRetakeCommitId() {
        return this.LLJIJIL;
    }

    public final boolean getRetouchMultiTrackMode() {
        return this.LLJLLL;
    }

    public final ArrayList<AVMusic> getStickPointMusicList() {
        return this.LLJI;
    }

    public final boolean isFromAIPlaygroundLoadingPage() {
        return this.LLILZIL;
    }

    public final boolean isFromCompatibleKeyFrame() {
        return this.LLL;
    }

    public final boolean isFromEditNow() {
        return this.LLILLJJLI;
    }

    public final boolean isFromEditRoot() {
        return this.LL;
    }

    public final boolean isFromText() {
        return this.LLJILJIL;
    }

    public final boolean isLaunchEditorProFromScheme() {
        return this.LLILZ;
    }

    public final Boolean isPhoto9To16() {
        return this.LLJILLL;
    }

    public final boolean isRestoreData() {
        return this.LLJJIJI;
    }

    public final boolean isRestoreFromDraft() {
        return this.LLJJJ;
    }

    public final boolean isRestoreFromSystem() {
        return this.LLJJJIL;
    }

    public final boolean isSlideInto() {
        return this.LLJJIII;
    }

    public final boolean isTemplateCreate() {
        return this.LLJJIJIIJIL;
    }

    public final void setAutoOpenEPFromAIGC(boolean z) {
        this.LLJJJJLIIL = z;
    }

    public final void setAutoOpenEPFromAsyncMagic(boolean z) {
        this.LLJJJJJIL = z;
    }

    public final void setCaptionCaptionTemplate(Effect effect) {
        this.LLJZ = effect;
    }

    public final void setChangeBanMusicMode(C0ELL c0ell) {
        this.LLJ = c0ell;
    }

    public final void setEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.LLILLL = videoPublishEditModel;
    }

    public final void setEditPageTextInputPositionY(float f) {
        this.LLJJJJ = f;
    }

    public final void setEditorProAnchorType(String str) {
        this.LLILZLL = str;
    }

    public final void setEffectMultiTrackMode(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setEnableBeat(boolean z) {
        this.LLJL = z;
    }

    public final void setEnableFilter(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public final void setEnableSticker(boolean z) {
        this.LLJLIL = z;
    }

    public final void setEnableTransition(boolean z) {
        this.LLJJL = z;
    }

    public final void setEnterFrom(String str) {
        this.LLJILJILJ = str;
    }

    public final void setEnterMode(C0EZH c0ezh) {
        this.LLLFF = c0ezh;
    }

    public final void setEnterMovePos(long j) {
        this.LLJJI = j;
    }

    public final void setEnterSelectSlotId(String str) {
        this.LLJJ = str;
    }

    public final void setEnterSelectedFuncType(String str) {
        this.LLLF = str;
    }

    public final void setFromAIPlaygroundLoadingPage(boolean z) {
        this.LLILZIL = z;
    }

    public final void setFromCaptionClick(boolean z) {
        this.LLJLL = z;
    }

    public final void setFromCompatibleKeyFrame(boolean z) {
        this.LLL = z;
    }

    public final void setFromRetouch(boolean z) {
        this.LLJLLIL = z;
    }

    public final void setFromText(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setInlineCaptionCaches(ArrayList<Pair<String, String>> arrayList) {
        this.LLIZ = arrayList;
    }

    public final void setLaunchEditorProFromScheme(boolean z) {
        this.LLILZ = z;
    }

    public final void setMobParam(C365920EWg c365920EWg) {
        this.LLJZIJLIL = c365920EWg;
    }

    public final void setNeedStartEditorProImmediately(boolean z) {
        this.LLJJIJIL = z;
    }

    public final void setOnlyCaptionMode(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public final void setPhoto9To16(Boolean bool) {
        this.LLJILLL = bool;
    }

    public final void setRestoreData(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setRestoreFromDraft(boolean z) {
        this.LLJJJ = z;
    }

    public final void setRestoreFromSystem(boolean z) {
        this.LLJJJIL = z;
    }

    public final void setRetakeCommitId(String str) {
        this.LLJIJIL = str;
    }

    public final void setRetouchMultiTrackMode(boolean z) {
        this.LLJLLL = z;
    }

    public final void setSlideInto(boolean z) {
        this.LLJJIII = z;
    }

    public final void setStickPointMusicList(ArrayList<AVMusic> arrayList) {
        this.LLJI = arrayList;
    }

    public final void setTemplateCreate(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public C0ELJ(boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLJJL = true;
        this.LLJJLIIIJLLLLLLLZ = true;
    }
}
