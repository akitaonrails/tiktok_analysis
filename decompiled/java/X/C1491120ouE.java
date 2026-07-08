package X;

import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;

/* JADX INFO: renamed from: X.0ouE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491120ouE implements InterfaceC1473700oS8 {
    public final /* synthetic */ Callback LIZ;

    public C1491120ouE(Callback callback) {
        this.LIZ = callback;
    }

    @Override // X.InterfaceC1473700oS8
    public final void LIZ(int i, C1473640oS2 c1473640oS2, int i2, String str) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (i != 0) {
            javaOnlyMap.put("errorCode", Integer.valueOf(i2));
            javaOnlyMap.put("errorMsg", str);
        }
        this.LIZ.invoke(Integer.valueOf(i), javaOnlyMap);
    }
}
