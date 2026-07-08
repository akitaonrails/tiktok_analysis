package X;

import X.C0XNO;
import android.util.Pair;
import java.util.List;

/* JADX INFO: renamed from: X.0XNN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0XNN<C extends C0XNO<?>> {
    public final C requestContent;
    public final List<Pair<String, String>> responseHeaders;
    public final long timing;

    public final C getRequestContent() {
        return this.requestContent;
    }

    public final List<Pair<String, String>> getResponseHeaders() {
        return this.responseHeaders;
    }

    public final long getTiming() {
        return this.timing;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0XNN(C c, List<? extends Pair<String, String>> list, long j) {
        this.requestContent = c;
        this.responseHeaders = list;
        this.timing = j;
    }
}
