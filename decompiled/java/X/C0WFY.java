package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0WFY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WFY {
    public static volatile C0WFY LIZIZ;
    public static InterfaceC2110008Ok LIZJ;
    public final C0WFS LIZ;

    public final ArrayList<Integer> LIZ() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        String strLIZJ = this.LIZ.LIZJ("auto_connect_disabled");
        if (TextUtils.isEmpty(strLIZJ)) {
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONArray(strLIZJ);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(Integer.valueOf(JSONArrayProtectorUtils.getInt(jSONArray, i)));
            }
            Logger.debug();
            return arrayList;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return arrayList;
        }
    }

    public final boolean LIZJ() {
        return this.LIZ.LIZ("frontier_enabled", true);
    }

    public C0WFY(Context context) {
        C0WFS c0wfs;
        Context contextN3 = C786410Ut5.N3(context);
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            if (WsChannelMultiProcessSharedProvider.LLJ == null) {
                WsChannelMultiProcessSharedProvider.LLJ = new C0WFS(contextN3);
            }
            c0wfs = WsChannelMultiProcessSharedProvider.LLJ;
        }
        this.LIZ = c0wfs;
    }

    public static C0WFY LIZIZ(Context context) {
        if (LIZIZ == null) {
            synchronized (C0WFY.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0WFY(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}
