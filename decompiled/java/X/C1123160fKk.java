package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.FastGiftMetaData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123160fKk extends FrameLayout {
    public DataChannel LL;
    public C1324720kZq LLILLJJLI;
    public C20743416Fc LLILLL;
    public boolean LLILZ;
    public EnumC1102980eoC LLILZIL;
    public Long LLILZLL;

    public final View getCurrentView() {
        return this;
    }

    public final void LIZ() {
        String str;
        FastGiftMetaData fastGiftMetaData;
        String str2;
        FastGiftMetaData fastGiftMetaData2;
        Map<String, String> map;
        if (C468250IXv.LIZJ(this.LL)) {
            C468250IXv.LJ(this.LL, "bottom_zone");
            return;
        }
        DataChannel dataChannel = this.LL;
        C006A c006aLIZJ = null;
        Room room = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        Gift fastGift = GiftManager.inst().getFastGift(room != null ? room.getId() : 0L);
        C1126800fQc.LIZ.GN();
        C1123320fL0 c1123320fL0LIZIZ = C1121450fHz.LIZIZ(EnumC1121470fI1.FAST_GIFT_TP.getType());
        if (c1123320fL0LIZIZ == null || (fastGiftMetaData2 = (FastGiftMetaData) c1123320fL0LIZIZ.LIZLLL) == null || (map = fastGiftMetaData2.LIZ) == null || (str = map.get("button_type")) == null) {
            str = "touch_point_gift";
        }
        if (c1123320fL0LIZIZ != null && (fastGiftMetaData = (FastGiftMetaData) c1123320fL0LIZIZ.LIZLLL) != null && (str2 = fastGiftMetaData.schema) != null) {
            try {
                c006aLIZJ = C1161920gLG.LIZJ(IActionHandlerService.class);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            IActionHandlerService iActionHandlerService = (IActionHandlerService) c006aLIZJ;
            if (iActionHandlerService != null) {
                iActionHandlerService.handle(getContext(), new C495520Jby(str2).LIZLLL());
            }
        }
        C1128760fTm.LJJJJJL(C1128760fTm.LJIIJ, this.LL, fastGift != null ? fastGift.id : 0L, true, false, "convenient_icon", "", "click", 0, null, str, null, C1125820fP2.LJFF().LIZ, null, null, null, 124928);
    }

    public final void LIZIZ() {
        String str;
        C1126800fQc.LIZ.GN();
        C1123320fL0 c1123320fL0LIZIZ = C1121450fHz.LIZIZ(EnumC1121470fI1.FAST_GIFT_TP.getType());
        FastGiftMetaData fastGiftMetaData = c1123320fL0LIZIZ != null ? (FastGiftMetaData) c1123320fL0LIZIZ.LIZLLL : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateRevenueIconAndText, bottomColorStyle = ");
        sbLIZ.append(this.LLILZIL);
        C20441214yg.LIZIZ("LiveFastRevenueView", C2188811AlT.LIZIZ(sbLIZ));
        if (fastGiftMetaData == null) {
            return;
        }
        if (this.LLILZ) {
            C20743416Fc c20743416Fc = this.LLILLL;
            if (c20743416Fc != null) {
                c20743416Fc.setText(2131843921);
            }
            C20743416Fc c20743416Fc2 = this.LLILLL;
            if (c20743416Fc2 != null) {
                C500260Jjc.LLFFF(c20743416Fc2);
            }
        } else {
            C20743416Fc c20743416Fc3 = this.LLILLL;
            if (c20743416Fc3 != null) {
                C500260Jjc.LJIILIIL(c20743416Fc3);
            }
        }
        ImageModel imageModel = fastGiftMetaData.icon;
        if (imageModel != null) {
            C1819620xS4.LIZ().LJIIIZ(imageModel).LJJI(this.LLILLJJLI);
        }
        DataChannel dataChannel = this.LL;
        Room room = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        Long l = this.LLILZLL;
        if (l != null) {
            if (Intrinsics.LJFF(l, room != null ? Long.valueOf(room.getId()) : null)) {
                return;
            }
        }
        Map<String, String> map = fastGiftMetaData.LIZ;
        if (map == null || (str = map.get("button_type")) == null) {
            str = "touch_point_gift";
        }
        C1125270fO9.LIZ().Sb1(this.LL, "show", str, false);
        C1123080fKc.LIZIZ(room, this.LL, null);
        this.LLILZLL = room != null ? Long.valueOf(room.getId()) : null;
    }

    public final void setBottomColorStyle(EnumC1102980eoC enumC1102980eoC) {
        this.LLILZIL = enumC1102980eoC;
        LIZIZ();
    }

    public C1123160fKk(DataChannel dataChannel, Context context) {
        boolean zBooleanValue;
        Boolean bool;
        super(context, null);
        this.LL = dataChannel;
        this.LLILZIL = EnumC1102980eoC.DEFAULT;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C780690Ujr.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILZ = zBooleanValue;
        if (zBooleanValue) {
            View viewLJFF = C0J3Y.LJFF(C0J3Y.LIZ, R.layout.hyg, null, false, getContext(), false, 52);
            this.LLILLJJLI = (C1324720kZq) viewLJFF.findViewById(R.id.y7x);
            C20743416Fc c20743416Fc = (C20743416Fc) viewLJFF.findViewById(R.id.y7s);
            this.LLILLL = c20743416Fc;
            if (c20743416Fc != null) {
                C500260Jjc.LJIILIIL(c20743416Fc);
            }
            C786410Ut5.Za(this, new ACListenerS152S0100000_17(this, 102));
            addView(viewLJFF);
        } else {
            this.LLILLJJLI = new C1324720kZq(getContext());
            C786410Ut5.Za(this, new ACListenerS152S0100000_17(this, 103));
            int iLIZIZ = (int) C497740JfY.LIZIZ(5.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(26.0f), (int) C497740JfY.LIZIZ(26.0f));
            layoutParams.topMargin = iLIZIZ;
            layoutParams.setMarginStart(iLIZIZ);
            C1324720kZq c1324720kZq = this.LLILLJJLI;
            if (c1324720kZq != null) {
                C786410Ut5.u6(c1324720kZq, layoutParams);
            }
            addView(this.LLILLJJLI);
        }
        this.LLILZIL = C1102950eo9.LIZIZ(this.LL);
        LIZIZ();
        C1106270etV.LIZ(this, null, null);
        setClipChildren(false);
    }
}
