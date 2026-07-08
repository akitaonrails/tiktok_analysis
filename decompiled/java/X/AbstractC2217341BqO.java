package X;

/* JADX INFO: renamed from: X.1BqO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2217341BqO extends AbstractC2217431BqX implements InterfaceC2217311BqL {
    public abstract /* synthetic */ Object get();

    @Override // X.AbstractC2217471Bqb
    public final InterfaceC2217491Bqd computeReflected() {
        C13LE.LIZ.getClass();
        return this;
    }

    @Override // X.InterfaceC2217311BqL
    public Object getDelegate() {
        return ((InterfaceC2217311BqL) getReflected()).getDelegate();
    }

    @Override // X.AbstractC2217431BqX
    public InterfaceC2217301BqK getGetter() {
        ((InterfaceC2217311BqL) getReflected()).getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public AbstractC2217341BqO() {
    }

    @Override // X.AbstractC2217431BqX
    public /* bridge */ /* synthetic */ InterfaceC1221890htz getGetter() {
        getGetter();
        return null;
    }

    public AbstractC2217341BqO(Object obj) {
        super(obj);
    }

    public AbstractC2217341BqO(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
