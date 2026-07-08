package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XL0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XL0 {
    public static C814380Vx6 LIZ(final C820370WGd c820370WGd, Function0 function0) {
        C0XL4 c0xl4 = new C0XL4();
        final C846940XKi c846940XKi = C846930XKh.LIZ;
        c846940XKi.getClass();
        C0XL9 c0xl9 = new C0XL9(c846940XKi, c820370WGd) { // from class: X.0XL6
        };
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c846940XKi.LIZ);
        arrayList.add(new C0XL7() { // from class: X.0XL1
            @Override // X.C0XL7
            public final C0XL5 LIZ(C847110XKz c847110XKz) {
                C820370WGd c820370WGd2 = c847110XKz.LIZJ;
                C0XL3 c0xl3 = new C0XL3();
                c0xl3.LIZ = c820370WGd2;
                c0xl3.LIZIZ = 0;
                c0xl3.LIZJ = "success";
                return new C0XL5(c0xl3);
            }
        });
        C0XL5 c0xl5LIZ = new C847110XKz(0, arrayList, c820370WGd, c0xl9).LIZ(c820370WGd);
        if (c0xl5LIZ.LIZ != 0) {
            return (C814380Vx6) c0xl4.invoke(c0xl5LIZ);
        }
        return (C814380Vx6) function0.invoke();
    }
}
