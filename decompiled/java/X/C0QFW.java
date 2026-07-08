package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QFW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QFW extends C09AY implements Function0<WeakReference<? extends Object>> {
    public final /* synthetic */ C2211641BhC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QFW(C2211641BhC c2211641BhC) {
        super(0);
        this.LL = c2211641BhC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final WeakReference<? extends Object> invoke() {
        C2211641BhC c2211641BhC = this.LL;
        if (c2211641BhC.LJJI) {
            return c2211641BhC.LJJIFFI;
        }
        if (c2211641BhC.LJJII) {
            return c2211641BhC.LJJIII;
        }
        return null;
    }
}
