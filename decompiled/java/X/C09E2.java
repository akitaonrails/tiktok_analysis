package X;

import com.google.gson.a;
import com.google.gson.b;

/* JADX INFO: renamed from: X.09E2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09E2 implements a {
    @Override // com.google.gson.a
    public final boolean shouldSkipClass(Class<?> cls) {
        return false;
    }

    @Override // com.google.gson.a
    public final boolean shouldSkipField(b bVar) {
        if (bVar.LIZ(C040H.class) != null) {
            return true;
        }
        return false;
    }
}
