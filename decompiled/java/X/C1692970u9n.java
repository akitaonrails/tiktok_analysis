package X;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692970u9n extends AbstractC20055413dY implements InterfaceC20062113ed {
    public Function1<? super C1209870hab, Boolean> LLJJ;
    public Function1<? super C1209870hab, Boolean> LLJJI;

    @Override // X.InterfaceC20062113ed
    public final boolean LJJZZI(KeyEvent keyEvent) {
        Function1<? super C1209870hab, Boolean> function1 = this.LLJJ;
        if (function1 != null) {
            return function1.invoke(new C1209870hab(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC20062113ed
    public final boolean LJLIL(KeyEvent keyEvent) {
        Function1<? super C1209870hab, Boolean> function1 = this.LLJJI;
        if (function1 != null) {
            return function1.invoke(new C1209870hab(keyEvent)).booleanValue();
        }
        return false;
    }

    public C1692970u9n(Function1<? super C1209870hab, Boolean> function1, Function1<? super C1209870hab, Boolean> function12) {
        this.LLJJ = function1;
        this.LLJJI = function12;
    }
}
