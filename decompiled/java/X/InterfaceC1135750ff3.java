package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ff3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040D
public interface InterfaceC1135750ff3 extends XBaseParamModel {
    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 1, type = DefaultType.INT), isGetter = true, keyPath = "allow_charge", required = false)
    Number getAllowCharge();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "close_gift_panel", required = false)
    Boolean getCloseGiftPanel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "close_gift_panel_immediate", required = false)
    Boolean getCloseGiftPanelImmediate();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "combo_offset_x", required = false)
    Number getComboOffsetX();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "combo_offset_y", required = false)
    Number getComboOffsetY();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gift_count", required = false)
    Number getGiftCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gift_enter_from", required = false)
    String getGiftEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gift_id", required = false)
    Number getGiftId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gift_track_type", required = false)
    String getGiftTrackType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "show_combo", required = false)
    Boolean getShowCombo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "source", required = false)
    String getSource();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "stream_goal_entrance", required = false)
    String getStreamGoalEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "toast_delay_seconds", required = false)
    Number getToastDelaySeconds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_event_report", required = false)
    Boolean isEventReport();
}
