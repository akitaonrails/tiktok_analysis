package X;

import X.C07XH;
import android.content.Context;
import com.ss.android.ugc.tiktok.tuc.model.TUCActionData;
import com.ss.android.ugc.tiktok.tuc.model.TUCEventData;
import com.ss.android.ugc.tiktok.tuc.model.TUCProcessData;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.101H, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C101H<M extends C07XH> implements InterfaceC722470SVp<M> {
    public final Context LIZ;

    public abstract C101D LIZIZ();

    public abstract int LIZJ(String str);

    public abstract int LIZLLL(String str);

    public abstract int LJ(String str);

    public C101H(Context context) {
        this.LIZ = context;
    }

    public final void LJFF(TUCProcessData tUCProcessData) {
        String str;
        System.currentTimeMillis();
        Context context = this.LIZ;
        C101D c101dLIZIZ = LIZIZ();
        TUCEventData tUCEventData = tUCProcessData.event;
        if (tUCEventData != null && (str = tUCEventData.eventName) != null) {
            Map<String, String> map = tUCEventData.injectExtra;
            if (map != null) {
                Map<String, String> map2 = tUCEventData.extra;
                if (map2 != null) {
                    map.putAll(map2);
                }
            } else {
                map = tUCEventData.extra;
            }
            C722430SVl.LIZ.invoke(str, map);
        }
        List<TUCActionData> list = tUCProcessData.actions;
        if (list != null) {
            C101C.LIZ(context, c101dLIZIZ, list, 0);
        }
        System.currentTimeMillis();
    }
}
