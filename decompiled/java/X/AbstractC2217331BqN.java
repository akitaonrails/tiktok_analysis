package X;

/* JADX INFO: renamed from: X.1BqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2217331BqN extends AbstractC2217361BqQ implements InterfaceC2217261BqG {
    public abstract /* synthetic */ Object get(Object obj);

    public abstract /* synthetic */ void set(Object obj, Object obj2);

    @Override // X.AbstractC2217471Bqb
    public InterfaceC2217491Bqd computeReflected() {
        C13LE.LIZ.getClass();
        return this;
    }

    @Override // X.AbstractC2217361BqQ, X.AbstractC2217431BqX
    public InterfaceC2217251BqF getGetter() {
        ((InterfaceC2217241BqE) getReflected()).getGetter();
        return null;
    }

    @Override // X.AbstractC2217361BqQ
    public InterfaceC2217271BqH getSetter() {
        ((InterfaceC2217261BqG) getReflected()).getSetter();
        return null;
    }

    public AbstractC2217331BqN() {
    }

    @Override // X.AbstractC2217361BqQ, X.AbstractC2217431BqX
    public /* bridge */ /* synthetic */ InterfaceC1221890htz getGetter() {
        getGetter();
        return null;
    }

    @Override // X.AbstractC2217361BqQ
    public /* bridge */ /* synthetic */ InterfaceC1221940hu4 getSetter() {
        getSetter();
        return null;
    }

    public AbstractC2217331BqN(Object obj) {
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

    public AbstractC2217331BqN(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
