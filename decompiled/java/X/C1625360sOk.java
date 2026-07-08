package X;

import android.content.Context;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0sOk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625360sOk {
    public static List LIZ(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getResources().getStringArray(R.array.u)) {
            EffectCategoryModel effectCategoryModel = new EffectCategoryModel((String) null, (String) null, (String) null, (UrlModel) null, (UrlModel) null, (List) null, (List) null, (String) null, false, (String) null, 1023, (DefaultConstructorMarker) null);
            effectCategoryModel.setName(str);
            arrayList.add(effectCategoryModel);
        }
        return arrayList;
    }
}
