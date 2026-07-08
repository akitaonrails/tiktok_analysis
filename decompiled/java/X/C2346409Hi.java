package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.tools.type_adapter.BooleanAsIntTypeAdapter;

/* JADX INFO: renamed from: X.09Hi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2346409Hi {
    public static final Gson LIZ;

    static {
        e eVar = new e();
        eVar.LJIIJ = true;
        eVar.LIZJ(new BooleanAsIntTypeAdapter(), Integer.TYPE);
        LIZ = eVar.LIZ();
    }
}
