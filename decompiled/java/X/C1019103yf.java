package X;

import java.util.Map;
import kotlin.jvm.internal.AwS210S0300000_1;

/* JADX INFO: renamed from: X.03yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1019103yf {
    public static final void LIZ(EnumC1014603xw enumC1014603xw, Throwable th, Map<String, ? extends Object> map) {
        if (th != null) {
            C1AF0.LJ(th);
        } else {
            C1AF0.LIZJ(enumC1014603xw.getMsg());
        }
        C1018703yb.LIZLLL("rd_tiktokec_gec_custom_exception", new AwS210S0300000_1(enumC1014603xw, (EnumC1014603xw) th, (Throwable) map, (Map<String, ? extends Object>) 51));
    }
}
