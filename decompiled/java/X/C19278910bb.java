package X;

import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19278910bb implements Consumer {
    public final /* synthetic */ Function1 LL;

    public C19278910bb(Function1 function1) {
        this.LL = function1;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        this.LL.invoke(obj);
    }
}
