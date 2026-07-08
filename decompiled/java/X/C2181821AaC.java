package X;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181821AaC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ C2181481AZe LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181821AaC(View view, C2181481AZe c2181481AZe) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = c2181481AZe;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        View view;
        if (this.LL != null) {
            WeakReference<View> weakReference = this.LLILLJJLI.LLJJ;
            if (!Intrinsics.LJFF(weakReference != null ? weakReference.get() : null, this.LL)) {
                this.LLILLJJLI.LLJJ = new WeakReference<>(this.LL);
                this.LLILLJJLI.LJJIFFI();
            }
            return Unit.LIZ;
        }
        WeakReference<View> weakReference2 = this.LLILLJJLI.LLJJ;
        if (weakReference2 != null && (view = weakReference2.get()) != null) {
            C500260Jjc.LJJJLL(view);
        }
        this.LLILLJJLI.LLJJ = null;
        this.LLILLJJLI.LJIIL();
        this.LLILLJJLI.LJIILJJIL();
        return Unit.LIZ;
    }
}
