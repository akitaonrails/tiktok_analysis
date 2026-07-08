package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434500nQu {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(434));

    public static final C1436170nTb LIZ() {
        String string = ((Keva) LIZ.getValue()).getString("upload_param_key", "");
        if (string == null || string.length() == 0) {
            return null;
        }
        return (C1436170nTb) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), string, C1436170nTb.class);
    }

    public static final void LIZIZ(C1436170nTb c1436170nTb) {
        ((Keva) LIZ.getValue()).storeString("upload_param_key", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), c1436170nTb));
    }
}
