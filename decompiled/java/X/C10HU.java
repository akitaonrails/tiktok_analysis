package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.10HU, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10HU {
    public static final List<TranslatedRegion> LIZ(Intent intent) {
        Object[] objArr;
        Object serializableExtra = intent.getSerializableExtra("extra.region.list");
        if (serializableExtra == null || !(serializableExtra instanceof TranslatedRegion[]) || (objArr = (Object[]) serializableExtra) == null) {
            return null;
        }
        return C13LQ.LJJLL(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, java.lang.Object[]] */
    public static final void LIZIZ(Intent intent, List<TranslatedRegion> list) {
        intent.putExtra("extra.region.list", (Serializable) list.toArray(new TranslatedRegion[0]));
    }
}
