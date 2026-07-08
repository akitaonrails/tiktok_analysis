package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Oce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623340Oce extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C623340Oce(int i, View view, boolean z) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = view;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        if (this.LL) {
            C786410Ut5.LJLLLLLL(8, this.LLILLJJLI);
        }
        this.LLILLJJLI.getLayoutParams().height = this.LLILLL;
        return Unit.LIZ;
    }
}
