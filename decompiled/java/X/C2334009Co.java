package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: renamed from: X.09Co, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2334009Co {
    public Gson LIZ;

    public C2334009Co(Gson gson) {
        this.LIZ = gson;
    }

    public final <T> TypeAdapter<T> LIZ(TypeToken<T> typeToken) {
        return this.LIZ.LJIIIZ(typeToken);
    }

    public final <T> TypeAdapter<T> LIZIZ(Class<T> cls) {
        return this.LIZ.LJIIJ(cls);
    }
}
