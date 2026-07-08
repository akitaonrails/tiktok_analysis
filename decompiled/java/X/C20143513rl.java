package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13rl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20143513rl extends C09AY implements Function2<String, C20143613rm, C20143613rm> {
    public C20143513rl() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C20143613rm invoke(String str, C20143613rm c20143613rm) {
        C20143613rm c20143613rm2 = c20143613rm;
        if (c20143613rm2.LIZIZ.decrementAndGet() == 0) {
            return null;
        }
        return c20143613rm2;
    }
}
