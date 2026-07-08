package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.04C8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C04C8 extends C04C7 {
    @Override // X.C04C7, X.C041O
    public final HashMap<String, Object> LIZ() {
        return new HashMap<>();
    }

    public C04C8(String str) {
        super(str);
    }

    public final void LJ(Integer num) {
        if (num != null) {
            num.intValue();
            this.LIZIZ.put("coupon_order", num);
        }
    }

    public final void LJFF(String str) {
        if (str != null) {
            this.LIZIZ.put("coupon_zone", str);
        }
    }
}
