package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13iF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20084513iF extends C09AY implements Function0<C20053713dH> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ Function1<Context, T> LLILLJJLI;
    public final /* synthetic */ C13Z1 LLILLL;
    public final /* synthetic */ InterfaceC20041513bJ LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ View LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20084513iF(Context context, Function1<? super Context, ? extends T> function1, C13Z1 c13z1, InterfaceC20041513bJ interfaceC20041513bJ, int i, View view) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = function1;
        this.LLILLL = c13z1;
        this.LLILZ = interfaceC20041513bJ;
        this.LLILZIL = i;
        this.LLILZLL = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C20053713dH invoke() {
        return new C20084613iG(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, (InterfaceC20055013dU) this.LLILZLL).getLayoutNode();
    }
}
