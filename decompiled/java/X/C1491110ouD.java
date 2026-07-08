package X;

import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;

/* JADX INFO: renamed from: X.0ouD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491110ouD implements InterfaceC1473700oS8 {
    public final /* synthetic */ Callback LIZ;

    public C1491110ouD(Callback callback) {
        this.LIZ = callback;
    }

    @Override // X.InterfaceC1473700oS8
    public final void LIZ(int i, C1473640oS2 c1473640oS2, int i2, String str) {
        Integer numValueOf;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (i != 0) {
            javaOnlyMap.put("errorCode", Integer.valueOf(i2));
            javaOnlyMap.put("errorMsg", str);
        } else {
            if (c1473640oS2 != null) {
                numValueOf = Integer.valueOf(c1473640oS2.LIZ());
            } else {
                numValueOf = null;
            }
            javaOnlyMap.put("duration", numValueOf);
        }
        this.LIZ.invoke(Integer.valueOf(i), javaOnlyMap);
    }
}
