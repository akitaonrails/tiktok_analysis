package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Cp9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325330Cp9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LinearLayoutManager LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ double LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C325330Cp9(LinearLayoutManager linearLayoutManager, int i, Context context, double d) {
        super(0);
        this.LL = linearLayoutManager;
        this.LLILLJJLI = i;
        this.LLILLL = context;
        this.LLILZ = d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1861330yXL.LJII(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, 8);
        return Unit.LIZ;
    }
}
