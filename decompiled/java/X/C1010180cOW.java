package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [KEY] */
/* JADX INFO: renamed from: X.0cOW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010180cOW<KEY> extends C09AY implements Function1<WeakReference<KEY>, KEY> {
    public C1010180cOW() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Reference) obj).get();
    }
}
