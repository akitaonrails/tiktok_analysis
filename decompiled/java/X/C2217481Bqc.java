package X;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1Bqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217481Bqc<S, F> implements InterfaceC1844700y6W<S, F>, InterfaceC2217241BqE<S, F> {
    public final InterfaceC2217241BqE<S, F> LL;

    @Override // X.InterfaceC2217491Bqd
    public final F call(Object... objArr) {
        return this.LL.call(objArr);
    }

    @Override // X.InterfaceC2217491Bqd
    public final F callBy(Map<Object, ? extends Object> map) {
        return this.LL.callBy(map);
    }

    @Override // X.InterfaceC2217241BqE
    public final F get(S s) {
        return this.LL.get(s);
    }

    @Override // X.C13JU
    public final List<Annotation> getAnnotations() {
        return this.LL.getAnnotations();
    }

    @Override // X.InterfaceC2217241BqE
    public final Object getDelegate(S s) {
        return this.LL.getDelegate(s);
    }

    @Override // X.InterfaceC2217241BqE
    public final InterfaceC2217251BqF<S, F> getGetter() {
        this.LL.getGetter();
        return null;
    }

    @Override // X.InterfaceC2217491Bqd
    public final String getName() {
        return this.LL.getName();
    }

    @Override // X.InterfaceC2217491Bqd
    public final List<Object> getParameters() {
        return this.LL.getParameters();
    }

    @Override // X.InterfaceC2217491Bqd
    public final C09RO getReturnType() {
        return this.LL.getReturnType();
    }

    @Override // X.InterfaceC2217491Bqd
    public final List<C09R2> getTypeParameters() {
        return this.LL.getTypeParameters();
    }

    @Override // X.InterfaceC2217491Bqd
    public final EnumC1054550dY5 getVisibility() {
        return this.LL.getVisibility();
    }

    @Override // kotlin.jvm.functions.Function1
    public final F invoke(S s) {
        return this.LL.invoke(s);
    }

    @Override // X.InterfaceC2217491Bqd
    public final boolean isAbstract() {
        return this.LL.isAbstract();
    }

    @Override // X.InterfaceC2217461Bqa
    public final boolean isConst() {
        return this.LL.isConst();
    }

    @Override // X.InterfaceC2217491Bqd
    public final boolean isFinal() {
        return this.LL.isFinal();
    }

    @Override // X.InterfaceC2217461Bqa
    public final boolean isLateinit() {
        return this.LL.isLateinit();
    }

    @Override // X.InterfaceC2217491Bqd
    public final boolean isOpen() {
        return this.LL.isOpen();
    }

    @Override // X.InterfaceC2217491Bqd, X.InterfaceC2217451BqZ
    public final boolean isSuspend() {
        return this.LL.isSuspend();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2217481Bqc(InterfaceC2217241BqE<S, ? extends F> interfaceC2217241BqE) {
        this.LL = interfaceC2217241BqE;
    }
}
