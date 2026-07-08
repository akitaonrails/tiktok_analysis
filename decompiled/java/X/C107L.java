package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS142S1100000_28;
import kotlin.jvm.internal.AwS23S1201000_28;

/* JADX INFO: renamed from: X.107L, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C107L extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C106Y LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C107L(boolean z, C106Y c106y, String str, View view, int i) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = c106y;
        this.LLILLL = str;
        this.LLILZ = view;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        int i;
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        if (this.LL) {
            i = R.string.fte;
        } else {
            i = 2131830797;
        }
        c1397620mTQ2.LJFF(i, new AwS23S1201000_28(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, 0));
        c1397620mTQ2.LJII(2131830798, new AwS142S1100000_28(this.LLILLJJLI, this.LLILLL, 5));
        c1397620mTQ2.LJFF = true;
        return Unit.LIZ;
    }
}
