package X;

import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0qIK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544500qIK extends AbstractC1544480qII<ReadableMap> {
    public InterfaceC634840OvC LIZJ;
    public final C1549580qQW LIZLLL;

    @Override // X.AbstractC1544480qII
    public final EnumC1063300dmC LIZ() {
        return EnumC1063300dmC.LYNX;
    }

    @Override // X.AbstractC1544480qII
    public final /* bridge */ /* synthetic */ InterfaceC1544510qIL<ReadableMap> LIZIZ() {
        return this.LIZLLL;
    }

    public C1544500qIK(InterfaceC1063710dmr interfaceC1063710dmr, ReadableMap readableMap) {
        super(interfaceC1063710dmr, readableMap);
        C1549580qQW c1549580qQW = new C1549580qQW();
        c1549580qQW.LIZ = this.LIZJ;
        this.LIZLLL = c1549580qQW;
    }

    @Override // X.AbstractC1544480qII
    public final ReadableMap LIZLLL(int i, String str) {
        HashMap map = new HashMap();
        map.put("code", Integer.valueOf(i));
        map.put("msg", str);
        return JavaOnlyMap.from(map);
    }
}
