package X;

import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;

/* JADX INFO: renamed from: X.0qFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543020qFw extends C09AY implements InterfaceC1685420txc<String, String, AbstractC1544900qIy, JSInjectConfig, C1544870qIv, Boolean> {
    public C1543020qFw() {
        super(5);
    }

    @Override // X.InterfaceC1685420txc
    public final Boolean invoke(String str, String str2, AbstractC1544900qIy abstractC1544900qIy, JSInjectConfig jSInjectConfig, C1544870qIv c1544870qIv) {
        boolean z;
        if (C1544760qIk.LIZIZ.putIfAbsent(str2, str) == null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
