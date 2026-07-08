package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588050N4p {
    public final Map<String, Object> LIZ;

    public C588050N4p(Map<String, Object> map) {
        this.LIZ = map;
    }

    public final void LIZ(String str, Object obj) {
        if (obj == null || Intrinsics.LJFF(str, "ad_extra_data")) {
            return;
        }
        this.LIZ.put(str, obj);
    }
}
