package X;

import com.bytedance.vmsdk.jsbridge.utils.ReadableArray;
import com.bytedance.vmsdk.jsbridge.utils.ReadableType;

/* JADX INFO: renamed from: X.1BQd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204611BQd implements InterfaceC2204631BQf {
    public static final C1085650eMF<C2204611BQd> LIZJ = new C1085650eMF<>(10);
    public ReadableArray LIZ;
    public int LIZIZ = -1;

    @Override // X.InterfaceC2204631BQf
    public final ReadableType getType() {
        ReadableArray readableArray = this.LIZ;
        if (readableArray != null) {
            return readableArray.getType(this.LIZIZ);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }
}
