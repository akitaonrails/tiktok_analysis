package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qnw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1564100qnw {
    void init();

    boolean isInit();

    void onEvent(String str, JSONObject jSONObject, Function2<? super Boolean, ? super String, Unit> function2);

    boolean onEvent(String str, JSONObject jSONObject);

    void release();
}
