package X;

import android.content.Context;
import android.view.View;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qEH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1541990qEH {
    void LIZ(String str, JSONObject jSONObject);

    void LJIJJLI();

    void LLD(boolean z);

    boolean T0();

    void U0(Map<String, ? extends Object> map);

    void V0(String str);

    void W0(Context context);

    @InterfaceC1294060jmO
    void X0(String str, List<? extends Object> list);

    void Y0(String str, Map<String, ? extends Object> map);

    boolean Z0();

    void a1();

    void b1(Map<String, ? extends Object> map);

    void c1(String str, Map<String, ? extends Object> map);

    void d1(String str);

    View e1();

    void f1(SparkSchemaParam sparkSchemaParam);

    Object getAndRemoveForestResponse();

    Map<String, Object> getGlobalProps();

    C1537480q70 getHybridContext();

    String getSchema();

    void load();

    void load(String str);

    void onHide();

    void onShow();

    void reload();

    void updateData(Map<String, ? extends Object> map);
}
