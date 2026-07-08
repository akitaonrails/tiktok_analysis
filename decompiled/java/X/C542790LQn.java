package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0LQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C542790LQn {
    public static final /* synthetic */ int LIZ = 0;

    public static DuetLayoutBean LIZIZ(Effect effect) {
        try {
            return (DuetLayoutBean) new Gson().LJII(JSONObjectProtectorUtils.getString(new JSONObject(effect.getExtra()), "duet_layout_mode"), DuetLayoutBean.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LIZJ(Effect effect) {
        String str;
        DuetLayoutBean duetLayoutBeanLIZIZ = LIZIZ(effect);
        if (duetLayoutBeanLIZIZ == null || (str = duetLayoutBeanLIZIZ.name) == null) {
            return "";
        }
        return str;
    }

    public static String LIZ(int i, Effect effect) {
        int size;
        DuetLayoutBean duetLayoutBeanLIZIZ = LIZIZ(effect);
        if (duetLayoutBeanLIZIZ == null) {
            return "";
        }
        List<String> list = duetLayoutBeanLIZIZ.directionStatus;
        if (list != null) {
            size = list.size();
        } else {
            size = -1;
        }
        if (size <= i) {
            return "";
        }
        return (String) ListProtector.get(duetLayoutBeanLIZIZ.directionStatus, i);
    }
}
