package X;

/* JADX INFO: renamed from: X.0qUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1552320qUw<IN> {
    <I> I getInputForType(Class<? extends AbstractC1552240qUo<I, ?>> cls);

    <T> T getInterceptorByType(Class<? extends AbstractC1552240qUo> cls);

    <O> O getOutputForType(Class<? extends AbstractC1552240qUo<?, O>> cls);

    Object getPipelineData(String str);

    Object proceed(IN in);

    Object restart();

    void setPipelineData(String str, Object obj);
}
