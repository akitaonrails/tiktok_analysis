package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.google.gson.h;

/* JADX INFO: renamed from: X.07iW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1938207iW {
    public static final /* synthetic */ int LIZIZ = 0;
    public final AbstractC1938207iW LIZ;

    public abstract void LIZIZ(SchemaBundle schemaBundle);

    public final void LIZ(SchemaBundle schemaBundle) {
        LIZIZ(schemaBundle);
        schemaBundle.commit();
    }

    public AbstractC1938207iW(h hVar, int i) {
        this.LIZ = C1938607ia.LIZ(hVar, i + 1);
    }
}
