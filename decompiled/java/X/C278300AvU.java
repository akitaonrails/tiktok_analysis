package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0AvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C278300AvU extends C09AY implements Function0<Boolean> {
    public C278300AvU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = false;
        if (((Boolean) C278330AvX.LIZJ.getValue()).booleanValue() && C278330AvX.LIZ) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - ((Keva) C277920Aus.LIZ.getValue()).getLong(C277920Aus.LIZIZ, jCurrentTimeMillis) <= ((long) ((Number) C277920Aus.LIZJ.getValue()).intValue()) * 1000) {
                z = true;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (boolValueOf.booleanValue()) {
            C01GW c01gw = C277920Aus.LIZ;
            Keva keva = (Keva) c01gw.getValue();
            String str = C277920Aus.LIZIZ;
            if (!keva.contains(str)) {
                ((Keva) c01gw.getValue()).storeLong(str, System.currentTimeMillis());
            }
        }
        return boolValueOf;
    }
}
