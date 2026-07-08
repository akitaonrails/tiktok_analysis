package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0O8S, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0O8S implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C0O8Q c0o8q = (C0O8Q) obj2;
        C0O8O c0o8oLIZIZ = ((C0O8O) obj).LIZIZ(c0o8q.getKey());
        if (c0o8oLIZIZ != C0O8R.LIZIZ) {
            return new C0O8P(c0o8q, c0o8oLIZIZ);
        }
        return c0o8q;
    }
}
