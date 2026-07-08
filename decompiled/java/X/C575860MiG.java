package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.InitialFilterConfig;
import com.ss.android.ugc.aweme.creative.model.stickers.MentionStickerParam;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesRecordParam;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import java.io.Serializable;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MiG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C575860MiG implements Serializable {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public transient CreativeInitialModel LLJ;
    public transient Bundle LLJI;
    public AddYourRecordParam LLJIJIL;
    public MentionStickerParam LLJILJIL;
    public DMGroupChatStickerGroupInfo LLJILJILJ;
    public SecretRepliesRecordParam LLJILLL;
    public String LLJJ;
    public MusicModel LLJJI;
    public RecordConfig LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public Pair<String, String> LLJJIJIL;
    public Boolean LLJJJ;
    public ShootExtraData LLJJJIL;
    public boolean LLJJJJ;
    public InitialFilterConfig LLJJJJJIL;
    public Integer LLJJJJLIIL;

    public final AddYourRecordParam getAddYourRecordParam() {
        return this.LLJIJIL;
    }

    public final Integer getChooseScene() {
        return this.LLJJJJLIIL;
    }

    public final String getCreationId() {
        return this.LL;
    }

    public final DMGroupChatStickerGroupInfo getDmGroupChatStickerGroupInfo() {
        return this.LLJILJILJ;
    }

    public final boolean getEnableLivePhoto() {
        return this.LLJJJJ;
    }

    public final String getEnterFrom() {
        return this.LLILLJJLI;
    }

    public final String getEnterMethod() {
        return this.LLILLL;
    }

    public final Bundle getExtras() {
        return this.LLJI;
    }

    public final boolean getHasRecordEntrance() {
        return this.LLJJIJI;
    }

    public final InitialFilterConfig getInitialFilterConfig() {
        return this.LLJJJJJIL;
    }

    public final CreativeInitialModel getInitialModel() {
        return this.LLJ;
    }

    public final Boolean getLandingBack() {
        return this.LLJJJ;
    }

    public final MentionStickerParam getMentionStickerParam() {
        return this.LLJILJIL;
    }

    public final Pair<String, String> getMentionUser() {
        return this.LLJJIJIL;
    }

    public final String getMusicId() {
        return this.LLIZLLLIL;
    }

    public final MusicModel getMusicModel() {
        return this.LLJJI;
    }

    public final String getMusicOrigin() {
        return this.LLIZ;
    }

    public final String getMusicPath() {
        return this.LLJJ;
    }

    public final RecordConfig getRecordConfig() {
        return this.LLJJIII;
    }

    public final boolean getRecordFromFeed() {
        return this.LLJJIJIIJIL;
    }

    public final String getRelationEnterMethod() {
        return this.LLILZ;
    }

    public final SecretRepliesRecordParam getSecretRepliesStickerParam() {
        return this.LLJILLL;
    }

    public final ShootExtraData getShootExtraData() {
        return this.LLJJJIL;
    }

    public final String getShootFrom() {
        return this.LLILZLL;
    }

    public final String getShootWay() {
        return this.LLILZIL;
    }

    public final void setAddYourRecordParam(AddYourRecordParam addYourRecordParam) {
        this.LLJIJIL = addYourRecordParam;
    }

    public final void setChooseScene(Integer num) {
        this.LLJJJJLIIL = num;
    }

    public final void setCreationId(String str) {
        this.LL = str;
    }

    public final void setDmGroupChatStickerGroupInfo(DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo) {
        this.LLJILJILJ = dMGroupChatStickerGroupInfo;
    }

    public final void setEnableLivePhoto(boolean z) {
        this.LLJJJJ = z;
    }

    public final void setEnterFrom(String str) {
        this.LLILLJJLI = str;
    }

    public final void setEnterMethod(String str) {
        this.LLILLL = str;
    }

    public final void setExtras(Bundle bundle) {
        this.LLJI = bundle;
    }

    public final void setHasRecordEntrance(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setInitialFilterConfig(InitialFilterConfig initialFilterConfig) {
        this.LLJJJJJIL = initialFilterConfig;
    }

    public final void setInitialModel(CreativeInitialModel creativeInitialModel) {
        this.LLJ = creativeInitialModel;
    }

    public final void setLandingBack(Boolean bool) {
        this.LLJJJ = bool;
    }

    public final void setMentionStickerParam(MentionStickerParam mentionStickerParam) {
        this.LLJILJIL = mentionStickerParam;
    }

    public final void setMentionUser(Pair<String, String> pair) {
        this.LLJJIJIL = pair;
    }

    public final void setMusicId(String str) {
        this.LLIZLLLIL = str;
    }

    public final void setMusicModel(MusicModel musicModel) {
        this.LLJJI = musicModel;
    }

    public final void setMusicOrigin(String str) {
        this.LLIZ = str;
    }

    public final void setMusicPath(String str) {
        this.LLJJ = str;
    }

    public final void setRecordConfig(RecordConfig recordConfig) {
        this.LLJJIII = recordConfig;
    }

    public final void setRecordFromFeed(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public final void setRelationEnterMethod(String str) {
        this.LLILZ = str;
    }

    public final void setSecretRepliesStickerParam(SecretRepliesRecordParam secretRepliesRecordParam) {
        this.LLJILLL = secretRepliesRecordParam;
    }

    public final void setShootExtraData(ShootExtraData shootExtraData) {
        this.LLJJJIL = shootExtraData;
    }

    public final void setShootFrom(String str) {
        this.LLILZLL = str;
    }

    public final void setShootWay(String str) {
        this.LLILZIL = str;
    }
}
