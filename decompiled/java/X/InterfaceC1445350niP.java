package X;

import com.google.gson.Gson;
import java.util.List;

/* JADX INFO: renamed from: X.0niP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1445350niP {
    <T> T createDefaultRetrofit(Class<T> cls);

    <T> T createRetrofit(String str, boolean z, Class<T> cls);

    <T> T createRetrofitWithInterceptors(String str, boolean z, Class<T> cls, List<? extends InterfaceC1904907d9> list);

    String getApiHost();

    Gson getRetrofitFactoryGson();

    @InterfaceC1294060jmO
    <T> T retrofitCreate(String str, Class<T> cls);
}
