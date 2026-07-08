package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qa6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555520qa6 extends C09AY implements Function1<String, InterfaceC665370Q7z> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1555520qa6(View view, LifecycleOwner lifecycleOwner) {
        super(1);
        this.LL = view;
        this.LLILLJJLI = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC665370Q7z invoke(String str) {
        return new C1555440qZy(this.LL, this.LLILLJJLI, str);
    }
}
