package X;

import android.graphics.Point;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLiveOptCaptureResolutionSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLivePushResolutionRuleSettingSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.0Uhi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779360Uhi {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int i3 = i % i2;
            if (i3 == 0) {
                return i2;
            }
            return LIZ(i2, i3);
        }
        return 1;
    }

    public static Point LIZIZ(float f, int i) {
        int i2 = (int) (i * f);
        if (i2 % 16 == 0) {
            return new Point(i2, i);
        }
        int i3 = (((i2 + 16) - 1) / 16) * 16;
        int iFloor = (int) Math.floor(i3 / f);
        if (iFloor % 2 == 1) {
            iFloor++;
        }
        return new Point(i3, iFloor);
    }

    public static Point LIZJ(int i, int i2, int i3, int i4) {
        boolean z;
        float f;
        int iLIZ;
        int i5;
        int i6;
        int i7;
        String str;
        String strLIZIZ = InterfaceC772390URp.q.LIZIZ();
        String str2 = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        boolean z2 = false;
        if (strLIZIZ.length() == 0) {
            PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LLILZ.gg0(BroadcastShareScreenDefinition.class);
            if (quality != null && (str = quality.sdkKey) != null) {
                str2 = str;
            }
            strLIZIZ = str2;
        }
        String[] value = GameLivePushResolutionRuleSettingSetting.INSTANCE.getValue();
        if (strLIZIZ.length() > 0 && C13LQ.LJIILLIIL(strLIZIZ.toLowerCase(Locale.ROOT), value)) {
            z = true;
        } else {
            z = false;
        }
        float f2 = i;
        float f3 = i2;
        float f4 = f2 / f3;
        if (f4 < 1.0f) {
            f = f3 / f2;
        } else {
            f = f4;
        }
        if (z && f > 1.78f) {
            if (i <= i2) {
                f3 = f2;
                f2 = f3;
            }
            float f5 = f2 / f3;
            if (i3 > i4) {
                if (i < i3) {
                    return new Point(i, i2);
                }
                int iFloor = (int) Math.floor(i3 / f5);
                if (iFloor % 2 == 1) {
                    iFloor++;
                }
                return new Point(i3, iFloor);
            }
            if (i2 < i4) {
                return new Point(i, i2);
            }
            int iFloor2 = (int) Math.floor(i4 / f5);
            if (iFloor2 % 2 == 1) {
                iFloor2++;
            }
            return new Point(iFloor2, i4);
        }
        Point point = new Point(i3, i4);
        if (i > i2) {
            iLIZ = LIZ(i, i2);
        } else {
            iLIZ = LIZ(i2, i);
        }
        int i8 = (i / iLIZ) * 16;
        int i9 = (i2 / iLIZ) * 16;
        int i10 = i9;
        int i11 = i8;
        while (true) {
            i5 = i11 * i10;
            if (i5 >= i3 * i4) {
                break;
            }
            i11 += i8;
            i10 += i9;
            z2 = true;
        }
        if (GameLiveOptCaptureResolutionSetting.INSTANCE.getValue() == 1) {
            if (i <= i2) {
                f4 = f3 / f2;
            }
            if (i3 > i4) {
                Point pointLIZIZ = LIZIZ(f4, i4);
                i7 = pointLIZIZ.x;
                i6 = pointLIZIZ.y;
            } else {
                Point pointLIZIZ2 = LIZIZ(f4, i3);
                i6 = pointLIZIZ2.x;
                i7 = pointLIZIZ2.y;
            }
            Map<String, Object> map2 = C1338270kvh.LIZ;
            if (z2) {
                if (i5 < i6 * i7) {
                    return new Point(i11, i10);
                }
                return new Point(i7, i6);
            }
            return new Point(i7, i6);
        }
        if (z2) {
            point.x = i11;
            point.y = i10;
            Map<String, Object> map3 = C1338270kvh.LIZ;
            return point;
        }
        if (i <= i2) {
            f3 = f2;
            f2 = f3;
        }
        float f6 = f2 / f3;
        if (i3 > i4) {
            i3 = (((((int) (i4 * f6)) + 16) - 1) / 16) * 16;
        } else {
            i4 = (((((int) (i3 * f6)) + 16) - 1) / 16) * 16;
        }
        Map<String, Object> map4 = C1338270kvh.LIZ;
        Throwable th = new Throwable();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("width:");
        sbLIZ.append(i);
        sbLIZ.append(", height:");
        sbLIZ.append(i2);
        sbLIZ.append(", finalWidth:");
        sbLIZ.append(i3);
        sbLIZ.append(", finalHeight:");
        sbLIZ.append(i4);
        C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), th);
        point.x = i3;
        point.y = i4;
        return point;
    }
}
