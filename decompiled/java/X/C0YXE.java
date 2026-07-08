package X;

import X.C0NZB;
import com.bytedance.tts.pigeon.GECPigeon;

/* JADX INFO: renamed from: X.0YXE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YXE<COMPONENT_API extends C0NZB> implements C01GW<COMPONENT_API> {
    public final C0YXF<COMPONENT_API> LL;

    @Override // X.C01GW
    public final Object getValue() {
        C0YXF<COMPONENT_API> c0yxf = this.LL;
        if (!c0yxf.LLILZ) {
            c0yxf.LLILLL = (COMPONENT_API) C0YXD.LIZLLL(c0yxf.LL, c0yxf.LLILLJJLI);
            c0yxf.LLILZ = true;
        }
        COMPONENT_API component_api = c0yxf.LLILLL;
        if (component_api != null) {
            return component_api;
        }
        "component api is null".toString();
        throw new IllegalStateException("component api is null");
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LL.LLILZ;
    }

    public C0YXE(GECPigeon gECPigeon, C19719912Dl c19719912Dl) {
        this.LL = new C0YXF<>(gECPigeon, c19719912Dl);
    }
}
