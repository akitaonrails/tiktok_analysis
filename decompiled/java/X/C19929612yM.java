package X;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.12yM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19929612yM implements Comparable<C19929612yM> {
    public final Field LL;
    public final EnumC19936912zX LLILLJJLI;
    public final Class<?> LLILLL;
    public final int LLILZ;
    public final Field LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final C19931312yd LLJ;
    public final Field LLJI;
    public final Class<?> LLJIJIL;
    public final Object LLJILJIL;
    public final InterfaceC19931212yc LLJILJILJ;

    public static void LIZJ(int i) {
        if (i > 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fieldNumber must be positive: ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.lang.Comparable
    public final int compareTo(C19929612yM c19929612yM) {
        return this.LLILZ - c19929612yM.LLILZ;
    }

    public C19929612yM(Field field, int i, EnumC19936912zX enumC19936912zX, Class<?> cls, Field field2, int i2, boolean z, boolean z2, C19931312yd c19931312yd, Class<?> cls2, Object obj, InterfaceC19931212yc interfaceC19931212yc, Field field3) {
        this.LL = field;
        this.LLILLJJLI = enumC19936912zX;
        this.LLILLL = cls;
        this.LLILZ = i;
        this.LLILZIL = field2;
        this.LLILZLL = i2;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = c19931312yd;
        this.LLJIJIL = cls2;
        this.LLJILJIL = obj;
        this.LLJILJILJ = interfaceC19931212yc;
        this.LLJI = field3;
    }
}
