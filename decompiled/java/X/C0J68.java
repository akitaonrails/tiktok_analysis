package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [CALLBACK_MODEL] */
/* JADX INFO: renamed from: X.0J68, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J68<CALLBACK_MODEL> extends C09AY implements Function1<Pair<? extends WeakReference<C0CW2<CALLBACK_MODEL>>, ? extends List<? extends String>>, Boolean> {
    public C0J68() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        boolean z;
        if (((Reference) ((Pair) obj).getFirst()).get() == null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
