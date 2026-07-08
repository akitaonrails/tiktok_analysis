package X;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1Bqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2217471Bqb implements InterfaceC2217491Bqd, Serializable {
    public static final Object NO_RECEIVER = C2217501Bqe.LL;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public transient InterfaceC2217491Bqd reflected;
    public final String signature;

    public abstract InterfaceC2217491Bqd computeReflected();

    public AbstractC2217471Bqb() {
        this(NO_RECEIVER);
    }

    public InterfaceC2217491Bqd compute() {
        InterfaceC2217491Bqd interfaceC2217491Bqd = this.reflected;
        if (interfaceC2217491Bqd != null) {
            return interfaceC2217491Bqd;
        }
        computeReflected();
        this.reflected = this;
        return this;
    }

    public InterfaceC329330Cvb getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return C13LE.LIZ(cls);
        }
        C13LE.LIZ.getClass();
        return new C1554850qZ1(cls);
    }

    @Override // X.C13JU
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // X.InterfaceC2217491Bqd
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC2217491Bqd getReflected() {
        InterfaceC2217491Bqd interfaceC2217491BqdCompute = compute();
        if (interfaceC2217491BqdCompute != this) {
            return interfaceC2217491BqdCompute;
        }
        throw new C139O();
    }

    @Override // X.InterfaceC2217491Bqd
    public C09RO getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // X.InterfaceC2217491Bqd
    public List<C09R2> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // X.InterfaceC2217491Bqd
    public EnumC1054550dY5 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // X.InterfaceC2217491Bqd
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // X.InterfaceC2217491Bqd
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // X.InterfaceC2217491Bqd
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // X.InterfaceC2217491Bqd, X.InterfaceC2217451BqZ
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // X.InterfaceC2217491Bqd
    public String getName() {
        return this.name;
    }

    public String getSignature() {
        return this.signature;
    }

    public AbstractC2217471Bqb(Object obj) {
        this(obj, null, null, null, false);
    }

    @Override // X.InterfaceC2217491Bqd
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // X.InterfaceC2217491Bqd
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public AbstractC2217471Bqb(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
