package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.00HN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00HN {
    public static final /* synthetic */ int LIZ = 0;

    public static BarrageMessage.BarrageEvent LIZ(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("msg_type", String.valueOf(i));
        BarrageMessage.BarrageEvent barrageEvent = new BarrageMessage.BarrageEvent();
        barrageEvent.eventName = "livesdk_tiktokec_barrage_show";
        barrageEvent.params = linkedHashMap;
        return barrageEvent;
    }

    public static String LIZIZ(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("res://");
        sbLIZ.append(context.getPackageName());
        sbLIZ.append('/');
        sbLIZ.append(R.drawable.esj);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
