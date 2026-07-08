package X;

/* JADX INFO: renamed from: X.1BqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2217351BqP extends AbstractC2217431BqX implements InterfaceC2217241BqE {
    public abstract /* synthetic */ Object get(Object obj);

    @Override // X.AbstractC2217471Bqb
    public InterfaceC2217491Bqd computeReflected() {
        C13LE.LIZ.getClass();
        return this;
    }

    @Override // X.AbstractC2217431BqX
    public InterfaceC2217251BqF getGetter() {
        ((InterfaceC2217241BqE) getReflected()).getGetter();
        return null;
    }

    public AbstractC2217351BqP() {
    }

    @Override // X.AbstractC2217431BqX
    public /* bridge */ /* synthetic */ InterfaceC1221890htz getGetter() {
        getGetter();
        return null;
    }

    public AbstractC2217351BqP(Object obj) {
        super(obj);
    }

    @Override // X.InterfaceC2217241BqE
    public Object getDelegate(Object obj) {
        return ((InterfaceC2217241BqE) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public AbstractC2217351BqP(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
