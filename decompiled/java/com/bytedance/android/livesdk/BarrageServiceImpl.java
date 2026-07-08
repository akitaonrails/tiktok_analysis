package com.bytedance.android.livesdk;

import X.C00FX;
import X.C0IX1;
import X.C1077900e9k;
import X.C1077910e9l;
import X.C1087840ePm;
import X.C1087930ePv;
import X.C19EG;
import X.C2188811AlT;
import X.C480460Ism;
import X.C786410Ut5;
import X.InterfaceC1085480eLy;
import X.InterfaceC782440Umg;
import android.content.Context;
import android.util.LruCache;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.like.LikeApi;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimOptimizedWidget;
import com.bytedance.android.livesdk.like.widget.OthersLikeWidget;
import com.bytedance.android.livesdk.like.widget.SelfLikeWidget;
import com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class BarrageServiceImpl implements IBarrageService {
    public final Map<Long, InterfaceC1085480eLy> LL = new HashMap();
    public final LruCache<Long, C0IX1> LLILLJJLI = new LruCache<>(5);

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final List<String> gB2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("K");
        arrayList.add("M");
        arrayList.add("B");
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final Class od2() {
        C1087930ePv.LIZJ = "OthersLikeWidget";
        return OthersLikeWidget.class;
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final void Zk() {
        C480460Ism.LIZ().getClass();
        ((LikeApi) C480460Ism.LIZLLL(LikeApi.class)).getIcons(0L, 0L, 1L);
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final Class Gp1() {
        return SelfLikeWidget.class;
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final Class Yh2() {
        return LikeUserInfoAnimOptimizedWidget.class;
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final String Ao2(long j) {
        if (j < 0) {
            return "";
        }
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.k4(Locale.US, "%.1f", new Object[]{Float.valueOf((j / 100) / 10.0f)}));
            sbLIZ.append('K');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j < 1000000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C786410Ut5.k4(Locale.US, "%.1f", new Object[]{Float.valueOf((j / 100000) / 10.0f)}));
            sbLIZ2.append('M');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C786410Ut5.k4(Locale.US, "%.1f", new Object[]{Float.valueOf((j / 100000000) / 10.0f)}));
        sbLIZ3.append('B');
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final void Dh0(long j) {
        InterfaceC1085480eLy interfaceC1085480eLy = (InterfaceC1085480eLy) ((HashMap) this.LL).remove(Long.valueOf(j));
        if (interfaceC1085480eLy != null) {
            interfaceC1085480eLy.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final InterfaceC1085480eLy O41(long j) {
        return (InterfaceC1085480eLy) ((HashMap) this.LL).get(Long.valueOf(j));
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final C0IX1 jF2(long j) {
        C0IX1 c0ix1 = this.LLILLJJLI.get(Long.valueOf(j));
        if (c0ix1 != null) {
            return c0ix1;
        }
        return new C0IX1();
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final void OW0(long j, C0IX1 c0ix1) {
        this.LLILLJJLI.put(Long.valueOf(j), c0ix1);
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final void dJ0(Fragment fragment, DataChannel dataChannel, InterfaceC782440Umg interfaceC782440Umg) {
        new C1077900e9k(fragment, dataChannel, interfaceC782440Umg);
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final C1087840ePm AW(DataChannel dataChannel, Context context, Room room, boolean z, ViewGroup viewGroup) {
        return new C1087840ePm(dataChannel, context, room, viewGroup);
    }

    public static void LIZ(Room room, boolean z, boolean z2, boolean z3, DataChannel dataChannel, LikeHelper likeHelper) {
        String str;
        String str2;
        String str3;
        String str4;
        if (likeHelper.LLJJJJLIIL) {
            str3 = "disabled_due_to_landscape_mode";
            str2 = "enabled";
            if (!z) {
                str = "disabled_due_to_landscape_mode";
            } else {
                str = "enabled";
            }
            if (z2) {
                str3 = "enabled";
            }
            if (z3) {
                str4 = "enabled";
            } else {
                str4 = "disabled_due_to_being_audience_and_mic_room";
            }
        } else {
            str = null;
            if (!room.getRoomAuthStatus().isEnableDigg()) {
                str2 = "disabled_by_room_auth";
            } else if (!UserService.getInstance().user().isLogin()) {
                str2 = "disabled_due_to_unlogin";
            } else if (((Boolean) dataChannel.gg0(UserIsAnchorChannel.class)).booleanValue() && DiggParamsSetting.INSTANCE.getValue().likeStyle != 1) {
                str2 = "disabled_due_to_being_anchor_and_ab";
            } else {
                str2 = null;
            }
            str3 = null;
            str4 = null;
        }
        C00FX.LIZ(room.getId(), UserService.getInstance().user().getCurrentUserId(), room.getOwnerUserId(), str2, str, str3, str4);
    }

    @Override // com.bytedance.android.livesdk.IBarrageService
    public final void JU(C19EG c19eg, LifecycleOwner lifecycleOwner, Room room, C1077910e9l c1077910e9l, boolean z, boolean z2, DataChannel dataChannel) {
        if (c19eg != null && lifecycleOwner != null && dataChannel != null) {
            if (room.getRoomAuthStatus() == null) {
                C00FX.LIZ(room.getId(), UserService.getInstance().user().getCurrentUserId(), room.getOwnerUserId(), "disabled_due_to_empty_room_auth", null, null, null);
                return;
            }
            LikeHelper likeHelper = new LikeHelper(c19eg, lifecycleOwner, room, z, z2, dataChannel);
            LIZ(room, true, z, z2, dataChannel, likeHelper);
            ((HashMap) this.LL).put(Long.valueOf(room.getId()), likeHelper);
            InterfaceC782440Umg interfaceC782440Umg = c1077910e9l.LIZ.LIZ;
            if (interfaceC782440Umg != null) {
                interfaceC782440Umg.L(likeHelper.LLILZIL);
            }
        }
    }
}
