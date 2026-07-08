package X;

import com.bytedance.geckox.gson.AccessTypeAdapter;
import com.bytedance.geckox.gson.BooleanTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.e;

/* JADX INFO: renamed from: X.0qTS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551400qTS {
    public static final C1551400qTS LIZIZ = new C1551400qTS();
    public final Gson LIZ;

    public C1551400qTS() {
        e eVar = new e();
        eVar.LIZJ(new BooleanTypeAdapter(), Boolean.class);
        eVar.LIZJ(new AccessTypeAdapter(), EnumC797980VSa.class);
        eVar.LIZJ(new BooleanTypeAdapter(), Boolean.TYPE);
        this.LIZ = eVar.LIZ();
    }
}
