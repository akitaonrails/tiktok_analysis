package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.07ka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1951007ka implements OpenResultCallback {
    public void LIZIZ() {
    }

    public void LIZJ() {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onActionResult(Object obj) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final /* synthetic */ void onEmpty() {
        C1951107kb.LIZ(this);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onFail(String str, String str2) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onIntercept(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onMatched(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onMissed(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final /* synthetic */ void onOpen(Intent intent) {
        C1951107kb.LIZIZ(this, intent);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onSuccess(Intent intent) {
    }

    public boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        Parcelable parcelable;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Integer) {
                smartRouteBuildRoute.withParam(entry.getKey(), ((Integer) entry.getValue()).intValue());
            } else if (value instanceof Long) {
                smartRouteBuildRoute.withParam(entry.getKey(), ((Long) entry.getValue()).longValue());
            } else if (value instanceof Float) {
                smartRouteBuildRoute.withParam(entry.getKey(), ((Float) entry.getValue()).floatValue());
            } else if (value instanceof Double) {
                smartRouteBuildRoute.withParam(entry.getKey(), ((Double) entry.getValue()).doubleValue());
            } else if (value instanceof Boolean) {
                smartRouteBuildRoute.withParam(entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            } else if (value instanceof String) {
                smartRouteBuildRoute.withParam(entry.getKey(), (String) entry.getValue());
            } else if (value instanceof Serializable) {
                smartRouteBuildRoute.withParam(entry.getKey(), (Serializable) entry.getValue());
            } else if (value instanceof Parcelable) {
                String key = entry.getKey();
                Object value2 = entry.getValue();
                if (value2 instanceof Parcelable) {
                    parcelable = (Parcelable) value2;
                } else {
                    parcelable = null;
                }
                smartRouteBuildRoute.withParam(key, parcelable);
            }
        }
        if (arrayList != null) {
            Iterator<Integer> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                smartRouteBuildRoute.addFlags(it2.next().intValue());
            }
        }
        smartRouteBuildRoute.withCallback(this);
        smartRouteBuildRoute.open();
        return true;
    }
}
