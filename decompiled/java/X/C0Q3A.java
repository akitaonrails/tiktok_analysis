package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Q3A, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q3A extends C09AY implements Function2<C0Q39, C0Q3B, C0Q39> {
    public C0Q3A() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C0Q39 invoke(C0Q39 c0q39, C0Q3B c0q3b) {
        C0Q39 c0q392 = c0q39;
        C0Q3B c0q3b2 = c0q3b;
        String str = c0q3b2.LL;
        String str2 = c0q3b2.LLILLJJLI;
        if (str2.length() <= 0) {
            str2 = c0q392.LLILLJJLI;
        }
        return new C0Q39(str, c0q392.LLILLL, c0q392.LLILZ, c0q392.LLILZIL, str2, c0q392.LLILZLL);
    }
}
