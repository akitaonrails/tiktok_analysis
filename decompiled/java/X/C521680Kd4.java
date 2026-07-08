package X;

import Y.AfS103S0300000_7;
import Y.AfS55S0110000_7;
import android.content.Context;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.floatwindow.FloatWindowTipsDialog;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Kd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521680Kd4 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                break;
        }
    }

    public C521680Kd4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onCheckedChanged$0(C521680Kd4 c521680Kd4, CompoundButton compoundButton, boolean z) {
        String str;
        long jLongValue;
        C0IR5 c0ir5;
        Long l;
        ((C20743716Ff) c521680Kd4.l0).setChecked(z);
        InterfaceC772190UQv.O3.LIZJ(Boolean.valueOf(z));
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = (BasePreviewSettingMainFragmentSheetInitializer) c521680Kd4.l1;
        basePreviewSettingMainFragmentSheetInitializer.getClass();
        String strCurrentRegionCode = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentRegionCode();
        DataChannel dataChannel = basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_aigc_toggle");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "timestamp");
        c474500IjALIZ.LJJII("before", "enter_type");
        c474500IjALIZ.LJJII(strCurrentRegionCode, "country_code");
        if (dataChannel != null && (c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class)) != null && (l = c0ir5.LIZLLL) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "user_id");
        c474500IjALIZ.LIZ();
    }

    public static final void onCheckedChanged$1(C521680Kd4 c521680Kd4, CompoundButton compoundButton, boolean z) {
        ((C500920Jkg) c521680Kd4.l0).LIZIZ.LJFF(Boolean.valueOf(z));
        C474500IjA c474500IjALIZ = C0IJT.LIZ(((C500920Jkg) c521680Kd4.l0).LIZJ);
        c474500IjALIZ.LJJII(((C500910Jkf) c521680Kd4.l1).LLILZLL.getValue(), "anchor_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LJJII(Long.valueOf(((Number) ((C500910Jkf) c521680Kd4.l1).LLILZIL.getValue()).longValue()), "room_id");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "to_status");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C0W78.LJFF(C497740JfY.LJII()))) ? 1 : 0), "overlay_permission");
        c474500IjALIZ.LJJII("live_take_detail", "event_page");
        c474500IjALIZ.LJJII(((C500920Jkg) c521680Kd4.l0).LJFF, "tab_name");
        c474500IjALIZ.LIZ();
    }

    public static final void onCheckedChanged$2(C521680Kd4 c521680Kd4, CompoundButton compoundButton, boolean z) {
        String str;
        long jLongValue;
        Room room;
        C0IR5 c0ir5;
        Long l;
        ((C20743716Ff) c521680Kd4.l0).setChecked(z);
        InterfaceC772190UQv.O3.LIZJ(Boolean.valueOf(z));
        C0J9Q c0j9q = (C0J9Q) c521680Kd4.l1;
        c0j9q.getClass();
        String strCurrentRegionCode = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentRegionCode();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_aigc_toggle");
        c474500IjALIZ.LJIJJLI(c0j9q.LLILLJJLI);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "timestamp");
        c474500IjALIZ.LJJII("during", "enter_type");
        c474500IjALIZ.LJJII(strCurrentRegionCode, "country_code");
        DataChannel dataChannel = c0j9q.LLILLJJLI;
        if (dataChannel != null && (c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class)) != null && (l = c0ir5.LIZLLL) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "user_id");
        c474500IjALIZ.LIZ();
        C0J9Q c0j9q2 = (C0J9Q) c521680Kd4.l1;
        DataChannel dataChannel2 = c0j9q2.LLILLJJLI;
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            C480460Ism.LIZ().getClass();
            ((RoomSwitchApi) C480460Ism.LIZLLL(RoomSwitchApi.class)).updateSwitch(room.getId(), 17, z, 0L).LJIILIIL(new C0UO0()).LJJLJLI(new AfS55S0110000_7(c0j9q2, z, 4));
        }
    }

    public static final void onCheckedChanged$3(C521680Kd4 c521680Kd4, CompoundButton compoundButton, boolean z) {
        Context context;
        LifecycleOwner lifecycleOwner;
        LifecycleOwner lifecycleOwner2;
        FragmentManager fragmentManagerLJJ;
        if (z) {
            C20743716Ff c20743716Ff = ((C500110JjN) c521680Kd4.l0).LL;
            LifecycleOwner lifecycleOwner3 = null;
            if (c20743716Ff != null) {
                context = c20743716Ff.getContext();
            } else {
                context = null;
            }
            if (!C0W78.LJFF(context)) {
                C0UVE.LJI("switch_open");
                ((C20743716Ff) c521680Kd4.l1).setChecked(false);
                C500110JjN c500110JjN = (C500110JjN) c521680Kd4.l0;
                DataChannel dataChannel = c500110JjN.LLILLL;
                if (dataChannel != null && dataChannel.LLILZ != null) {
                    C19489311Mt c19489311Mt = new C19489311Mt();
                    FloatWindowTipsDialog floatWindowTipsDialog = new FloatWindowTipsDialog();
                    floatWindowTipsDialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC521770KdD(c19489311Mt, 4));
                    C013C c013c = new C013C();
                    c013c.element = true;
                    DataChannel dataChannel2 = c500110JjN.LLILLL;
                    if (dataChannel2 != null) {
                        lifecycleOwner = dataChannel2.LLILZ;
                    } else {
                        lifecycleOwner = null;
                    }
                    LifecycleEventsObservable lifecycleEventsObservable = C11RB.LIZIZ(lifecycleOwner).LIZIZ;
                    DataChannel dataChannel3 = c500110JjN.LLILLL;
                    if (dataChannel3 != null) {
                        lifecycleOwner2 = dataChannel3.LLILZ;
                    } else {
                        lifecycleOwner2 = null;
                    }
                    C19481311Jr c19481311JrLJIIJ = c19489311Mt.LJIIJ(new C521850KdL(((C0J1N) lifecycleEventsObservable.LIZJ(C11RD.LJ(lifecycleOwner2))).LIZJ(new AfS103S0300000_7(c013c, c500110JjN, floatWindowTipsDialog, 9)), 3));
                    DataChannel dataChannel4 = c500110JjN.LLILLL;
                    if (dataChannel4 != null) {
                        lifecycleOwner3 = dataChannel4.LLILZ;
                    }
                    ((InterfaceC500100JjM) c19481311JrLJIIJ.LIZLLL(C11RD.LJ(lifecycleOwner3))).subscribe();
                    LiveIconView liveIconView = c500110JjN.LLILZIL;
                    if (liveIconView != null && (fragmentManagerLJJ = C520010KaN.LJJ(liveIconView, false)) != null) {
                        floatWindowTipsDialog.show(fragmentManagerLJJ, "videoFloatWindowTipsDialog");
                        return;
                    }
                    return;
                }
                return;
            }
            ((C20743716Ff) c521680Kd4.l1).setChecked(true);
            ((C500110JjN) c521680Kd4.l0).LIZ(true);
            return;
        }
        ((C20743716Ff) c521680Kd4.l1).setChecked(false);
        ((C500110JjN) c521680Kd4.l0).LIZ(false);
    }

    public static final void onCheckedChanged$4(C521680Kd4 c521680Kd4, CompoundButton compoundButton, boolean z) {
        Context context;
        LifecycleOwner lifecycleOwner;
        LifecycleOwner lifecycleOwner2;
        if (z) {
            C20743716Ff c20743716Ff = ((BasePreviewSettingMainFragmentSheet) c521680Kd4.l0).LLLLLL;
            LifecycleOwner lifecycleOwner3 = null;
            if (c20743716Ff != null) {
                context = c20743716Ff.getContext();
            } else {
                context = null;
            }
            if (!C0W78.LJFF(context)) {
                C0UVE.LJI("switch_open");
                ((C20743716Ff) c521680Kd4.l1).setChecked(false);
                BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet = (BasePreviewSettingMainFragmentSheet) c521680Kd4.l0;
                basePreviewSettingMainFragmentSheet.getClass();
                DataChannel dataChannelLJ = C475510Ikn.LJ(basePreviewSettingMainFragmentSheet);
                if (dataChannelLJ != null && dataChannelLJ.LLILZ != null) {
                    C19489311Mt c19489311Mt = new C19489311Mt();
                    FloatWindowTipsDialog floatWindowTipsDialog = new FloatWindowTipsDialog();
                    floatWindowTipsDialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC521770KdD(c19489311Mt, 7));
                    C013C c013c = new C013C();
                    c013c.element = true;
                    DataChannel dataChannelLJ2 = C475510Ikn.LJ(basePreviewSettingMainFragmentSheet);
                    if (dataChannelLJ2 != null) {
                        lifecycleOwner = dataChannelLJ2.LLILZ;
                    } else {
                        lifecycleOwner = null;
                    }
                    LifecycleEventsObservable lifecycleEventsObservable = C11RB.LIZIZ(lifecycleOwner).LIZIZ;
                    DataChannel dataChannelLJ3 = C475510Ikn.LJ(basePreviewSettingMainFragmentSheet);
                    if (dataChannelLJ3 != null) {
                        lifecycleOwner2 = dataChannelLJ3.LLILZ;
                    } else {
                        lifecycleOwner2 = null;
                    }
                    C19481311Jr c19481311JrLJIIJ = c19489311Mt.LJIIJ(new C521850KdL(((C0J1N) lifecycleEventsObservable.LIZJ(C11RD.LJ(lifecycleOwner2))).LIZJ(new AfS103S0300000_7(c013c, basePreviewSettingMainFragmentSheet, floatWindowTipsDialog, 12)), 5));
                    DataChannel dataChannelLJ4 = C475510Ikn.LJ(basePreviewSettingMainFragmentSheet);
                    if (dataChannelLJ4 != null) {
                        lifecycleOwner3 = dataChannelLJ4.LLILZ;
                    }
                    ((InterfaceC500100JjM) c19481311JrLJIIJ.LIZLLL(C11RD.LJ(lifecycleOwner3))).subscribe();
                    FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(basePreviewSettingMainFragmentSheet.getContext(), false);
                    if (fragmentManagerLJIL != null) {
                        floatWindowTipsDialog.show(fragmentManagerLJIL, "videoFloatWindowTipsDialog");
                        return;
                    }
                    return;
                }
                return;
            }
            ((C20743716Ff) c521680Kd4.l1).setChecked(true);
            ((BasePreviewSettingMainFragmentSheet) c521680Kd4.l0).uS(true);
            return;
        }
        ((C20743716Ff) c521680Kd4.l1).setChecked(false);
        ((BasePreviewSettingMainFragmentSheet) c521680Kd4.l0).uS(false);
    }

    public static final void onCheckedChanged$5(C521680Kd4 c521680Kd4, CompoundButton compoundButton, boolean z) {
        Context context;
        LifecycleOwner lifecycleOwner;
        LifecycleOwner lifecycleOwner2;
        if (z) {
            C20743716Ff c20743716Ff = ((BasePreviewSettingMainFragment) c521680Kd4.l0).LLL;
            LifecycleOwner lifecycleOwner3 = null;
            if (c20743716Ff != null) {
                context = c20743716Ff.getContext();
            } else {
                context = null;
            }
            if (!C0W78.LJFF(context)) {
                C0UVE.LJI("switch_open");
                ((C20743716Ff) c521680Kd4.l1).setChecked(false);
                BasePreviewSettingMainFragment basePreviewSettingMainFragment = (BasePreviewSettingMainFragment) c521680Kd4.l0;
                basePreviewSettingMainFragment.getClass();
                DataChannel dataChannelLJ = C475510Ikn.LJ(basePreviewSettingMainFragment);
                if (dataChannelLJ != null && dataChannelLJ.LLILZ != null) {
                    C19489311Mt c19489311Mt = new C19489311Mt();
                    FloatWindowTipsDialog floatWindowTipsDialog = new FloatWindowTipsDialog();
                    floatWindowTipsDialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC521770KdD(c19489311Mt, 6));
                    C013C c013c = new C013C();
                    c013c.element = true;
                    DataChannel dataChannelLJ2 = C475510Ikn.LJ(basePreviewSettingMainFragment);
                    if (dataChannelLJ2 != null) {
                        lifecycleOwner = dataChannelLJ2.LLILZ;
                    } else {
                        lifecycleOwner = null;
                    }
                    LifecycleEventsObservable lifecycleEventsObservable = C11RB.LIZIZ(lifecycleOwner).LIZIZ;
                    DataChannel dataChannelLJ3 = C475510Ikn.LJ(basePreviewSettingMainFragment);
                    if (dataChannelLJ3 != null) {
                        lifecycleOwner2 = dataChannelLJ3.LLILZ;
                    } else {
                        lifecycleOwner2 = null;
                    }
                    C19481311Jr c19481311JrLJIIJ = c19489311Mt.LJIIJ(new C521850KdL(((C0J1N) lifecycleEventsObservable.LIZJ(C11RD.LJ(lifecycleOwner2))).LIZJ(new AfS103S0300000_7(c013c, basePreviewSettingMainFragment, floatWindowTipsDialog, 11)), 4));
                    DataChannel dataChannelLJ4 = C475510Ikn.LJ(basePreviewSettingMainFragment);
                    if (dataChannelLJ4 != null) {
                        lifecycleOwner3 = dataChannelLJ4.LLILZ;
                    }
                    ((InterfaceC500100JjM) c19481311JrLJIIJ.LIZLLL(C11RD.LJ(lifecycleOwner3))).subscribe();
                    FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(basePreviewSettingMainFragment.getContext(), false);
                    if (fragmentManagerLJIL != null) {
                        floatWindowTipsDialog.show(fragmentManagerLJIL, "videoFloatWindowTipsDialog");
                        return;
                    }
                    return;
                }
                return;
            }
            ((C20743716Ff) c521680Kd4.l1).setChecked(true);
            ((BasePreviewSettingMainFragment) c521680Kd4.l0).NR(true);
            return;
        }
        ((C20743716Ff) c521680Kd4.l1).setChecked(false);
        ((BasePreviewSettingMainFragment) c521680Kd4.l0).NR(false);
    }
}
