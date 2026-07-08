package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [KEY] */
/* JADX INFO: renamed from: X.0cOY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1010200cOY<KEY> extends C2217421BqW implements Function1<KEY, WeakReference<KEY>> {
    public static final C1010200cOY LL = new C1010200cOY();

    public C1010200cOY() {
        super(1, WeakReference.class, "<init>", "<init>(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new WeakReference(obj);
    }
}
