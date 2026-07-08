package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0qUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552250qUp<IN> implements InterfaceC1552320qUw<IN>, Serializable {
    public final InterfaceC1552320qUw<IN> LL;

    @Override // X.InterfaceC1552320qUw
    public final Object restart() {
        return this.LL.restart();
    }

    public C1552250qUp(InterfaceC1552320qUw<IN> interfaceC1552320qUw) {
        this.LL = interfaceC1552320qUw;
    }

    @Override // X.InterfaceC1552320qUw
    public final <I> I getInputForType(Class<? extends AbstractC1552240qUo<I, ?>> cls) {
        return (I) this.LL.getInputForType(cls);
    }

    @Override // X.InterfaceC1552320qUw
    public final <T> T getInterceptorByType(Class<? extends AbstractC1552240qUo> cls) {
        return (T) this.LL.getInterceptorByType(cls);
    }

    @Override // X.InterfaceC1552320qUw
    public final <O> O getOutputForType(Class<? extends AbstractC1552240qUo<?, O>> cls) {
        return (O) this.LL.getOutputForType(cls);
    }

    @Override // X.InterfaceC1552320qUw
    public final Object getPipelineData(String str) {
        return this.LL.getPipelineData(str);
    }

    @Override // X.InterfaceC1552320qUw
    public final Object proceed(IN in) {
        return this.LL.proceed(in);
    }

    @Override // X.InterfaceC1552320qUw
    public final void setPipelineData(String str, Object obj) {
        this.LL.setPipelineData(str, obj);
    }
}
