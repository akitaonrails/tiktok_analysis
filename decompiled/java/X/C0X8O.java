package X;

/* JADX INFO: renamed from: X.0X8O, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0X8O implements C0X8S {
    public abstract <T> T LIZ(Class<T> cls);

    @Override // X.C0X8S
    public final <T> T create(Class<T> cls) {
        if (cls.getAnnotation(C0X8N.class) != null) {
            return (T) LIZ(cls);
        }
        throw new C837560WtO("The interface of the third-party network must be marked with the @ThirdPartyNetworkAPI annotation");
    }
}
