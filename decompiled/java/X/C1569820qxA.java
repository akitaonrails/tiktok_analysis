package X;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569820qxA implements InterfaceC1055110dYz {
    public final /* synthetic */ Function1<Bundle, Unit> LL;

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1569820qxA(Function1<? super Bundle, Unit> function1) {
        this.LL = function1;
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        this.LL.invoke(bundle);
    }
}
