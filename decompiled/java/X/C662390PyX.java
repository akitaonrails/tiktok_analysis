package X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662390PyX {
    public static ObjectAnimator LIZIZ;
    public static boolean LIZJ;
    public static long LIZLLL;
    public static boolean LJ;
    public static int LJFF;
    public static final C662390PyX LIZ = new C662390PyX();
    public static Integer LJI = 0;

    public static boolean LIZ(List list) {
        if (list == null) {
            return false;
        }
        for (Object obj : list) {
            if (((SearchUser) obj).awemeCards != null && (!r0.isEmpty())) {
                if (obj == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static void LIZJ(String str) {
        if (LIZLLL < 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZLLL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", jCurrentTimeMillis);
        jSONObject.put("logid", str);
        jSONObject.put("token_type", "user");
        jSONObject.put("search_id", str);
        AppLogNewUtils.onEventV3("search_horizontal_loading_show", jSONObject);
    }

    public static boolean LIZLLL(User user) {
        if (user != null && user.isEnableDirectMessage()) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(int i, String str) throws JSONException {
        if (LIZLLL < 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZLLL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", jCurrentTimeMillis);
        jSONObject.put("logid", str);
        jSONObject.put("token_type", "user");
        jSONObject.put("loading_status", i);
        jSONObject.put("search_id", str);
        AppLogNewUtils.onEventV3("search_horizontal_loadmore_result", jSONObject);
    }

    public static void LJ(SmartImageView smartImageView, boolean z) {
        Shape rectShape;
        int iIntValue;
        if (z) {
            rectShape = new OvalShape();
        } else {
            rectShape = new RectShape();
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bv, smartImageView.getContext());
        int iIntValue2 = 0;
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        int width = smartImageView.getWidth();
        int height = smartImageView.getHeight();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(rectShape);
        shapeDrawable.getPaint().setColor(iIntValue);
        shapeDrawable.setIntrinsicHeight(height);
        shapeDrawable.setIntrinsicWidth(width);
        smartImageView.setPlaceholderImage(shapeDrawable);
        C1331100kk8 c1331100kk8 = ((C1331070kk5) smartImageView.getHierarchy()).LIZJ;
        if (c1331100kk8 != null) {
            c1331100kk8.LJFF(C418440Gaw.LIZIZ(Float.valueOf(0.5f)));
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ng, smartImageView.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            }
            c1331100kk8.LJFF = iIntValue2;
        }
    }
}
