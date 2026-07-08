package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0Kaw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520360Kaw extends AbstractC520380Kay {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJFF;
    public final Room LJI;

    @Override // X.InterfaceC520350Kav
    public final int LIZLLL() {
        return 1;
    }

    @Override // X.InterfaceC520350Kav
    public final String LIZ() {
        return this.LIZJ.tabTitle;
    }

    @Override // X.InterfaceC520350Kav
    public final void onDestroy() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJFF;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIFFI(true);
        }
        this.LJFF = null;
    }

    @Override // X.InterfaceC520350Kav
    public final void onHide() {
        this.LIZLLL = 0L;
        ViewGroup viewGroup = this.LJ;
        if (viewGroup != null) {
            C786410Ut5.LJJJLZIJ(this.LJFF, viewGroup);
        }
    }

    @Override // X.InterfaceC520350Kav
    public final void onShow() {
        this.LIZLLL = System.currentTimeMillis();
        if (this.LJFF == null) {
            this.LJFF = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(this.LIZ, this.LIZJ.tabSchema, null, true, new AwS586S0100000_7(this, 554));
        }
        ViewGroup viewGroup = this.LJ;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        ViewGroup viewGroup2 = this.LJ;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.LJFF, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        }
        Room room = this.LJI;
        Long lValueOf = room != null ? Long.valueOf(room.getId()) : null;
        Room room2 = this.LJI;
        Long lValueOf2 = room2 != null ? Long.valueOf(room2.getOwnerUserId()) : null;
        Long lValueOf3 = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
        CustomTab customTab = this.LIZJ;
        C182700n3.LIZ(lValueOf, lValueOf2, lValueOf3, "multi_tab_remove", 1, 1, customTab.tabSchema, customTab.tabTitle);
    }

    public C520360Kaw(Context context, DataChannel dataChannel, CustomTab customTab) {
        super(context, dataChannel, customTab);
        this.LJI = (Room) dataChannel.gg0(RoomChannel.class);
    }
}
