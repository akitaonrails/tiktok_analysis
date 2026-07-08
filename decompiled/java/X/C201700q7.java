package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.Map;

/* JADX INFO: renamed from: X.00q7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C201700q7 {
    public final Context LIZ;
    public final C201600q6 LIZIZ;
    public final C011V LIZJ;
    public final LifecycleOwner LIZLLL;
    public final DataChannel LJ;
    public final Map<String, String> LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillboardConfig(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lifeCycleOwner=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", dataChannel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C201700q7(Context context, C201600q6 c201600q6, C011V c011v, LiveWidget liveWidget, DataChannel dataChannel, Map map) {
        this.LIZ = context;
        this.LIZIZ = c201600q6;
        this.LIZJ = c011v;
        this.LIZLLL = liveWidget;
        this.LJ = dataChannel;
        this.LJFF = map;
    }

    public /* synthetic */ C201700q7(Context context, C201600q6 c201600q6, C011V c011v, LiveRecyclableWidget liveRecyclableWidget, DataChannel dataChannel, Map map, int i) {
        this(context, c201600q6, c011v, liveRecyclableWidget, (i & 16) != 0 ? null : dataChannel, (i & 32) != 0 ? C2097608Jq.LJ() : map);
    }
}
