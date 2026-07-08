package X;

import android.view.View;
import com.bytedance.android.livesdkapi.depend.event.GiftPinCardPositionUpdateChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0exn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ViewOnLayoutChangeListenerC1108930exn implements View.OnLayoutChangeListener {
    public DataChannel LL;
    public C1108940exo LLILLJJLI;

    public ViewOnLayoutChangeListenerC1108930exn(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public final void LIZIZ(C1108940exo c1108940exo) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", String.valueOf(C500260Jjc.LJJLIIIJ(this.LL)));
        jSONObject.put("container_width", c1108940exo.LIZ);
        jSONObject.put("container_height", c1108940exo.LIZIZ);
        jSONObject.put("x_margin", c1108940exo.LIZJ);
        jSONObject.put("y_margin", c1108940exo.LIZLLL);
        C389001fE.LIZ("pin_card_container_change", jSONObject, System.currentTimeMillis(), false);
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zW(GiftPinCardPositionUpdateChannel.class, new C1108960exq(c1108940exo.LIZJ, c1108940exo.LIZLLL));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendUpdateJSEvent width ");
        sbLIZ.append(c1108940exo);
        C20441214yg.LIZIZ("LandscapeLivePinHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C1108940exo LIZ(View view, C1108940exo c1108940exo) {
        int iLJIIIZ;
        Double dValueOf;
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        if (InterfaceC465670INx.LJLILLLLZI.LIZIZ().booleanValue()) {
            iLJIIIZ = 0;
        } else {
            iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.as4);
        }
        double dLJJI = C497740JfY.LJJI(view.getWidth());
        double dLJJI2 = C497740JfY.LJJI(view.getHeight());
        double dLJJI3 = C497740JfY.LJJI(iLJIIIZ + C497740JfY.LJIIIZ(R.dimen.asa));
        double dLJJI4 = C497740JfY.LJJI(C497740JfY.LJIILLIIL() - (iArr[1] + view.getHeight()));
        if (c1108940exo != null) {
            dValueOf = Double.valueOf(c1108940exo.LIZJ);
        } else {
            dValueOf = null;
        }
        if (Intrinsics.LIZIZ(dValueOf, dLJJI3) && c1108940exo.LIZLLL == dLJJI4 && c1108940exo.LIZ == dLJJI && c1108940exo.LIZIZ == dLJJI2) {
            return null;
        }
        return new C1108940exo(dLJJI, dLJJI2, dLJJI3, dLJJI4);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1108940exo c1108940exoLIZ;
        if (view != null && view.getVisibility() == 0 && (c1108940exoLIZ = LIZ(view, this.LLILLJJLI)) != null) {
            this.LLILLJJLI = c1108940exoLIZ;
            LIZIZ(c1108940exoLIZ);
        }
    }
}
