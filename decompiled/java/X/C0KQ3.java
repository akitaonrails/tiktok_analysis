package X;

import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KQ3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KQ3 {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZIZ(Room room) {
        User owner;
        SubscribeInfo subscribeInfo;
        if (room != null && (owner = room.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
            return LIZJ(subscribeInfo.subEndTime);
        }
        return 0L;
    }

    public static long LIZJ(long j) {
        Date date;
        Date date2 = new Date(C963140bAe.LIZIZ());
        if (!Intrinsics.LJFF(C0KPJ.Me.LIZIZ(), Boolean.TRUE)) {
            date = new Date(j);
        } else {
            long jLIZIZ = C963140bAe.LIZIZ();
            C0K8F.LIZ.getClass();
            long j2 = 60;
            date = new Date((((j - jLIZIZ) / ((long) C538540LAe.LLJJJIL)) * ((long) 24) * j2 * j2 * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + jLIZIZ);
        }
        C0K8F.LIZ.getClass();
        return TimeUnit.DAYS.convert(Math.abs(date2.getTime() - date.getTime()), TimeUnit.MILLISECONDS);
    }

    public static long LIZ(long j, long j2) {
        Date date = new Date(j2);
        Date date2 = new Date(j);
        long jConvert = TimeUnit.DAYS.convert(Math.abs(date2.getTime() - date.getTime()), TimeUnit.MILLISECONDS);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showDate: ");
        sbLIZ.append(date);
        sbLIZ.append(' ');
        sbLIZ.append(j2);
        sbLIZ.append(" endDate: ");
        sbLIZ.append(j);
        sbLIZ.append(' ');
        sbLIZ.append(date2);
        C20441214yg.LIZIZ("CommonGuidanceCardUtil", C2188811AlT.LIZIZ(sbLIZ));
        return jConvert;
    }
}
