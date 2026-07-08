package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123170fKl extends FrameLayout {
    public DataChannel LL;
    public C1324720kZq LLILLJJLI;
    public C20743416Fc LLILLL;
    public boolean LLILZ;
    public EnumC1102980eoC LLILZIL;
    public Long LLILZLL;

    public final void LIZ() {
        if (C468250IXv.LIZJ(this.LL)) {
            C468250IXv.LJ(this.LL, "bottom_zone");
            return;
        }
        C0JT6<Double> c0jt6 = InterfaceC1106030et7.c7;
        c0jt6.LIZJ(Double.valueOf(((int) (c0jt6.LIZ() != null ? r0.doubleValue() : 0.0d)) + 1));
        C1126800fQc.LIZ.Wy0().LIZ(0, getContext(), "shortcut_gift", null, null, false);
        DataChannel dataChannel = this.LL;
        Room room = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        Gift fastGift = GiftManager.inst().getFastGift(room != null ? room.getId() : 0L);
        C1128760fTm.LJJJJJL(C1128760fTm.LJIIJ, this.LL, fastGift != null ? fastGift.id : 0L, true, false, "convenient_icon", "", "click", 0, null, "welcome_pack", null, C1125820fP2.LJFF().LIZ, null, null, null, 124928);
    }

    public final void LIZIZ() {
        List list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateFirstChargeIconAndText, bottomColorStyle = ");
        sbLIZ.append(this.LLILZIL);
        C20441214yg.LIZIZ("LiveFastFirstRechargeView", C2188811AlT.LIZIZ(sbLIZ));
        int i = C1103060eoK.LIZ[this.LLILZIL.ordinal()];
        if (i == 1) {
            C1143680frq.LIZLLL(this.LLILLJJLI, "tiktok_live_interaction_demand_11", "ttlive_icon_recharge_discount_gray.png");
            C1324720kZq c1324720kZq = this.LLILLJJLI;
            if (c1324720kZq != null) {
                C786410Ut5.h5(c1324720kZq, 0.75f);
            }
        } else if (i == 2) {
            C1143680frq.LIZLLL(this.LLILLJJLI, "tiktok_live_interaction_demand_11", "ttlive_icon_recharge_discount_full_color.png");
        } else if (i != 3) {
            C1143680frq.LIZLLL(this.LLILLJJLI, C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_revenue_normal_1"), "ttlive_fast_welcome_pack_icon.png");
        } else {
            DataChannel dataChannel = this.LL;
            if (dataChannel == null || (list = (List) dataChannel.gg0(C1102520enS.class)) == null || !list.contains(EnumC1102740eno.FAST_GIFT)) {
                C1143680frq.LIZLLL(this.LLILLJJLI, "tiktok_live_interaction_demand_11", "ttlive_icon_recharge_discount_gray.png");
                C1324720kZq c1324720kZq2 = this.LLILLJJLI;
                if (c1324720kZq2 != null) {
                    C786410Ut5.h5(c1324720kZq2, 0.75f);
                }
            } else {
                C1143680frq.LIZLLL(this.LLILLJJLI, "tiktok_live_interaction_demand_11", "ttlive_icon_recharge_discount_full_color.png");
            }
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
        DataChannel dataChannel2 = this.LL;
        Room room = dataChannel2 != null ? (Room) dataChannel2.gg0(RoomChannel.class) : null;
        Long l = this.LLILZLL;
        if (l != null) {
            if (Intrinsics.LJFF(l, room != null ? Long.valueOf(room.getId()) : null)) {
                return;
            }
        }
        C1125270fO9.LIZ().Sb1(this.LL, "show", "welcome_pack", true);
        C1123080fKc.LIZIZ(room, this.LL, null);
        this.LLILZLL = room != null ? Long.valueOf(room.getId()) : null;
    }

    public final void setBottomColorStyle(EnumC1102980eoC enumC1102980eoC) {
        this.LLILZIL = enumC1102980eoC;
        LIZIZ();
    }

    public C1123170fKl(DataChannel dataChannel, Context context) {
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
            C786410Ut5.Ya(this, new ACListenerS152S0100000_17(this, 100));
            addView(viewLJFF);
        } else {
            this.LLILLJJLI = new C1324720kZq(getContext());
            C786410Ut5.Ya(this, new ACListenerS152S0100000_17(this, 101));
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
