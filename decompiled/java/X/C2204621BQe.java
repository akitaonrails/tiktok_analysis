package X;

import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableType;

/* JADX INFO: renamed from: X.1BQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204621BQe implements InterfaceC2204631BQf {
    public static final C1085650eMF<C2204621BQe> LIZJ = new C1085650eMF<>(10);
    public ReadableMap LIZ;
    public String LIZIZ;

    @Override // X.InterfaceC2204631BQf
    public final ReadableType getType() {
        String str;
        ReadableMap readableMap = this.LIZ;
        if (readableMap == null || (str = this.LIZIZ) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return readableMap.getType(str);
    }
}
