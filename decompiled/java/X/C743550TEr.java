package X;

import Y.AfS41S1100000_3;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameDualDeviceOptimizeLibra;
import com.bytedance.android.livesdk.livesetting.broadcast.GameDualDeviceSchema;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameDualDeviceQRCodeParamsSetting;
import com.bytedance.android.livesdk.livesetting.game.GameDualDevicePublicScreenSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0TEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743550TEr {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(7));
    public static String LIZIZ;
    public static Bitmap LIZJ;

    public static int LIZIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static void LIZ(C09JN c09jn, C09JN c09jn2, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        String str;
        long id;
        Bitmap bitmap;
        C09JN c09jn3 = c09jn2;
        C0TFE.LIZ.getClass();
        List listLJI = C0TFE.LJI();
        ArrayList arrayList = (ArrayList) listLJI;
        int i = 0;
        if (!arrayList.isEmpty()) {
            str = (String) ListProtector.get(listLJI, 0);
        } else {
            str = "0.0.0.0";
        }
        if (C0TDF.LIZLLL() instanceof C0TCQ) {
            i = 12345;
        }
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        LiveGameDualDeviceQRCodeParamsSetting liveGameDualDeviceQRCodeParamsSetting = LiveGameDualDeviceQRCodeParamsSetting.INSTANCE;
        Integer fps = liveGameDualDeviceQRCodeParamsSetting.getFPS();
        Float bitRateScale = liveGameDualDeviceQRCodeParamsSetting.getBitRateScale();
        HashMap map = new HashMap();
        BroadcastGameDualDeviceOptimizeLibra broadcastGameDualDeviceOptimizeLibra = BroadcastGameDualDeviceOptimizeLibra.INSTANCE;
        map.put(broadcastGameDualDeviceOptimizeLibra.getSettingKeys(), Integer.valueOf(broadcastGameDualDeviceOptimizeLibra.getValue()));
        map.put(GameDualDevicePublicScreenSetting.getKey(), Integer.valueOf(GameDualDevicePublicScreenSetting.getValue()));
        String strLIZIZ = C0TFE.LIZIZ(GameDualDeviceSchema.INSTANCE.getValue(), str, i, id, C0TDF.LJFF(), C0TDF.LJ(), fps, bitRateScale, String.valueOf(UserService.getInstance().user().getCurrentUserId()), map, DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("qrCodeString = ");
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(",cacheStr = ");
        sbLIZ.append(LIZIZ);
        C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", C2188811AlT.LIZIZ(sbLIZ));
        C743540TEq.LJIIL(id, C0TDF.LJFF(), C0TDF.LJ(), fps, bitRateScale);
        if (arrayList.isEmpty()) {
            C743540TEq.LJIIJJI(id, 2003, null, "ip_empty", 8);
        }
        if (i <= 0) {
            C743540TEq.LJIIJJI(id, 2003, null, "port_empty", 8);
        }
        if (TextUtils.equals(strLIZIZ, LIZIZ) && (bitmap = LIZJ) != null) {
            if (c09jn != null) {
                c09jn.accept(bitmap);
            }
            C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "use cache bitmap");
        } else {
            if (c09jn3 == null) {
                c09jn3 = new C09JN() { // from class: X.082r
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("DualDeviceQRCodeHelper@3ef1.getQrCodeBitmap$onErrorFinal$1");
                        C20441214yg.LJ("DualDeviceQRCodeHelper", Log.getStackTraceString((Throwable) obj));
                        C1C7U.LIZIZ("DualDeviceQRCodeHelper@3ef1.getQrCodeBitmap$onErrorFinal$1");
                    }
                };
            }
            ((C0J1N) C11NZ.LJJJJZ(strLIZIZ).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.12K0
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    int i2;
                    C21621919jd c21621919jdLIZ = new C21625319kB().LIZ((String) obj, EnumC21623519jt.QR_CODE, C743550TEr.LIZIZ(), C743550TEr.LIZIZ(), null);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(C743550TEr.LIZIZ(), C743550TEr.LIZIZ(), Bitmap.Config.ARGB_8888);
                    int iLIZIZ = C743550TEr.LIZIZ();
                    for (int i3 = 0; i3 < iLIZIZ; i3++) {
                        int iLIZIZ2 = C743550TEr.LIZIZ();
                        for (int i4 = 0; i4 < iLIZIZ2; i4++) {
                            if (c21621919jdLIZ.LIZ(i3, i4)) {
                                i2 = -16777216;
                            } else {
                                i2 = -1;
                            }
                            bitmapCreateBitmap.setPixel(i3, i4, i2);
                        }
                    }
                    return bitmapCreateBitmap;
                }
            }).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new AfS41S1100000_3(c09jn, strLIZIZ, 0), c09jn3);
        }
    }
}
