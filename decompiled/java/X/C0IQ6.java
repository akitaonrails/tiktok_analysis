package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.bytedance.android.livesdk.livesetting.performance.LiveRoomBackGroundImageOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0IQ6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IQ6 {
    public static final void LIZ(C1324720kZq c1324720kZq, List<String> list, Context context) {
        Object objValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadBackgroundGaussianView -> apply CLIENT gaussian blur, urls=");
        if (list != null) {
            objValueOf = Integer.valueOf(list.size());
        } else {
            objValueOf = "null";
        }
        sbLIZ.append(objValueOf);
        sbLIZ.append(", blurRadius=");
        LiveRoomBackGroundImageOptSetting liveRoomBackGroundImageOptSetting = LiveRoomBackGroundImageOptSetting.INSTANCE;
        sbLIZ.append(liveRoomBackGroundImageOptSetting.getConfig().blurRadius);
        C2188811AlT.LIZIZ(sbLIZ);
        if (context != null) {
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            c0jbnLIZ.LJIIIIZZ("live_bg", list);
            c0jbnLIZ.LJIL(C12ES.LJIIJ(context) / C12ES.LJIIIIZZ(context), liveRoomBackGroundImageOptSetting.getConfig().blurRadius, c1324720kZq);
            if (liveRoomBackGroundImageOptSetting.getConfig().use8888) {
                c0jbnLIZ.LJFF(Boolean.FALSE);
            }
            c0jbnLIZ.LJJI(c1324720kZq);
        }
    }

    public static final void LIZIZ(C1324720kZq c1324720kZq, List<String> list, Context context) {
        String packageName;
        if (context != null) {
            if (!C0IKQ.LIZ(list)) {
                LIZ(c1324720kZq, list, context);
                return;
            }
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context() != null) {
                packageName = context.getPackageName();
            } else {
                packageName = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("res://");
            sbLIZ.append(packageName);
            sbLIZ.append('/');
            sbLIZ.append(R.drawable.enu);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ArrayList arrayList = new ArrayList();
            arrayList.add(strLIZIZ);
            C1819620xS4.LIZ().LIZJ(arrayList).LJJI(c1324720kZq);
        }
    }

    public static final void LIZJ(C1324720kZq c1324720kZq, List<String> list, List<String> list2, Context context, final String str) {
        if (c1324720kZq == null) {
            return;
        }
        if (LiveRoomBackGroundImageOptSetting.INSTANCE.clientDrawBlur() && list2 != null && !list2.isEmpty()) {
            LIZ(c1324720kZq, list2, context);
            return;
        }
        if (list != null && !list.isEmpty()) {
            C1324610kZf c1324610kZfLJII = C1819620xS4.LIZ().LJII(0);
            c1324610kZfLJII.LJIIIIZZ("live_bg", list);
            c1324610kZfLJII.LJIJI = 0;
            if (str != null) {
                c1324610kZfLJII.LJIIL = new InterfaceC1142670fqD() { // from class: X.0IQ5
                    @Override // X.InterfaceC1142670fqD
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZIZ(Animatable animatable) {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZLLL(String str2, Exception exc) {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZJ(int i, int i2, String str2) {
                        C0IX5.LIZ(str);
                    }
                };
            }
            c1324610kZfLJII.LJJI(c1324720kZq);
        }
    }
}
