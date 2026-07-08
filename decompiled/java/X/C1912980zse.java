package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishSetting;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0zse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912980zse {
    public static BusinessGoodsPublishSetting LIZ;

    public static List<BusinessGoodsPublishSetting> LIZ() {
        C19259110Wf c19259110Wf = C746350TPl.LIZ;
        if (c19259110Wf.LJIIL == null) {
            c19259110Wf.LJIIL = new C2230608oa<>("draft_business_goods", "");
        }
        String strLIZ = c19259110Wf.LJIIL.LIZ();
        return !TextUtils.isEmpty(strLIZ) ? (List) GsonProtectorUtils.fromJson(new Gson(), strLIZ, new TypeToken<List<BusinessGoodsPublishSetting>>() { // from class: X.0zsf
        }.getType()) : new ArrayList();
    }
}
