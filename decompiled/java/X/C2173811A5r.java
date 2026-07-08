package X;

import androidx.activity.OnBackPressedDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173811A5r implements InterfaceC2173851A5v {
    public final AbstractC2173821A5s LL;
    public final /* synthetic */ OnBackPressedDispatcher LLILLJJLI;

    /* JADX WARN: Type inference failed for: r0v8, types: [X.1BqW, kotlin.jvm.functions.Function0] */
    @Override // X.InterfaceC2173851A5v
    public final void cancel() {
        this.LLILLJJLI.LIZJ.remove(this.LL);
        if (Intrinsics.LJFF(this.LLILLJJLI.LIZLLL, this.LL)) {
            this.LL.LIZ();
            this.LLILLJJLI.LIZLLL = null;
        }
        this.LL.LIZIZ.remove(this);
        ?? r0 = this.LL.LIZJ;
        if (r0 != 0) {
            r0.invoke();
        }
        this.LL.LIZJ = null;
    }

    public C2173811A5r(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC2173821A5s abstractC2173821A5s) {
        this.LLILLJJLI = onBackPressedDispatcher;
        this.LL = abstractC2173821A5s;
    }
}
