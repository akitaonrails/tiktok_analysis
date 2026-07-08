package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.15M5, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public interface C15M5 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "back_url", required = false)
    String getBackUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "campaign_id", required = false)
    String getCampaignId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "completed_event", required = false)
    Boolean getCompletedEvent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "effect_id", required = false)
    String getEffectId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "from_group_id", required = false)
    String getFromGroupId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "group_id", required = false)
    String getGroupId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hashtags", primitiveClassType = String.class, required = false)
    List<String> getHashtags();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "landing_back", required = false)
    Number getLandingBack();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "music_selected_from", required = false)
    String getMusicSelectedFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "search_source", required = false)
    String getSearchSource();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shoot_entrance", required = false)
    String getShootEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shoot_way", required = false)
    String getShootWay();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "show_story_button", required = false)
    Boolean getShowStoryButton();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "source_platform_channel", required = false)
    String getSourcePlatformChannel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "text_sticker", required = false)
    String getTextSticker();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_music_chart", required = false)
    Number isMusicChart();
}
