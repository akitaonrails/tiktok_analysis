package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.bytedance.android.livesdk.livesetting.performance.LiveRoomBackGroundImageOptSetting;
import java.util.List;

/* JADX INFO: renamed from: X.0IQ7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IQ7 {
    public static final void LIZ(C1324720kZq c1324720kZq, List list, List list2, Context context) {
        if (c1324720kZq == null) {
            return;
        }
        LiveRoomBackGroundImageOptSetting liveRoomBackGroundImageOptSetting = LiveRoomBackGroundImageOptSetting.INSTANCE;
        if (liveRoomBackGroundImageOptSetting.clientDrawBlur() && list2 != null && !list2.isEmpty()) {
            if (context != null) {
                C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                c0jbnLIZ.LJIIIIZZ("live_bg", list2);
                c0jbnLIZ.LJIL(C12ES.LJIIJ(context) / C12ES.LJIIIIZZ(context), liveRoomBackGroundImageOptSetting.getConfig().blurRadius, c1324720kZq);
                if (liveRoomBackGroundImageOptSetting.getConfig().use8888) {
                    c0jbnLIZ.LJFF(Boolean.FALSE);
                }
                c0jbnLIZ.LJJI(c1324720kZq);
                return;
            }
            return;
        }
        if (list != null && !list.isEmpty()) {
            C1324610kZf c1324610kZfLJII = C1819620xS4.LIZ().LJII(0);
            c1324610kZfLJII.LJIIIIZZ("live_bg", list);
            c1324610kZfLJII.LJIJI = 0;
            c1324610kZfLJII.LJIIL = new InterfaceC1142670fqD() { // from class: X.0IQ8
                public final /* synthetic */ String LIZ = "";

                @Override // X.InterfaceC1142670fqD
                public final void LIZ() {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZIZ(Animatable animatable) {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZLLL(String str, Exception exc) {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZJ(int i, int i2, String str) {
                    C0IX5.LIZ(this.LIZ);
                }
            };
            c1324610kZfLJII.LJJI(c1324720kZq);
        }
    }
}
