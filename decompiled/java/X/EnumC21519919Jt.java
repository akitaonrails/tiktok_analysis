package X;

/* JADX INFO: renamed from: X.19Jt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public enum EnumC21519919Jt {
    X,
    Y;

    public static EnumC21519919Jt valueOf(String str) {
        return (EnumC21519919Jt) C08FF.LIZ(EnumC21519919Jt.class, str);
    }

    public final EnumC21519819Js toProperty() {
        return this == X ? EnumC21519819Js.TRANSLATION_X : EnumC21519819Js.TRANSLATION_Y;
    }
}
