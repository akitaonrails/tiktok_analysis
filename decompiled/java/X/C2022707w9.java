package X;

import java.util.function.BiConsumer;

/* JADX INFO: renamed from: X.07w9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2022707w9<T, U> implements BiConsumer {
    public final /* synthetic */ C259800zU<String> LIZ;

    public C2022707w9(C259800zU<String> c259800zU) {
        this.LIZ = c259800zU;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        boolean z;
        T t;
        String str = (String) obj;
        String str2 = (String) obj2;
        C259800zU<String> c259800zU = this.LIZ;
        if (c259800zU.element.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(": ");
            sbLIZ.append(str2);
            t = (T) C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LIZ.element);
            sbLIZ2.append('\n');
            sbLIZ2.append(str);
            sbLIZ2.append(": ");
            sbLIZ2.append(str2);
            t = (T) C2188811AlT.LIZIZ(sbLIZ2);
        }
        c259800zU.element = t;
    }
}
