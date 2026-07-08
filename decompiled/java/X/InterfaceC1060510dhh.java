package X;

import android.content.Context;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dhh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1060510dhh {
    InterfaceC1051760dTa getJavaMethodByName(WeakReference<Context> weakReference, IESJsBridge iESJsBridge, String str);

    Map<String, InterfaceC1051760dTa> getJavaMethods(WeakReference<Context> weakReference, IESJsBridge iESJsBridge);

    void notifyFromRnAndH5(JSONObject jSONObject);
}
