package X;

import com.bytedance.live.render.utils.BooleanTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.c;
import com.google.gson.e;

/* JADX INFO: renamed from: X.09Cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2334609Cu {
    public static final Gson LIZ;
    public static final Gson LIZIZ;

    static {
        e eVar = new e();
        eVar.LIZJ = c.LOWER_CASE_WITH_UNDERSCORES;
        eVar.LIZJ(new BooleanTypeAdapter(), Boolean.class);
        eVar.LIZJ(new BooleanTypeAdapter(), Boolean.TYPE);
        LIZ = eVar.LIZ();
        LIZIZ = new Gson();
    }
}
