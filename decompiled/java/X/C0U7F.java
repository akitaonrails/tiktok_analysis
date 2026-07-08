package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0U7F, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U7F extends C0UEN {
    public C0U9E LJFF = C0U9E.NORMAL;
    public C0U6H LJI;

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final LiveEffect LLJZIJLIL() {
        return new C0U7F();
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final C0U9E LJLIL() {
        return this.LJFF;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final C0U6H LJZI() {
        return this.LJI;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJLLI(C0U6H c0u6h) {
        this.LJI = c0u6h;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLJLILLLLZIIL(C0U9E c0u9e) {
        this.LJFF = c0u9e;
    }
}
