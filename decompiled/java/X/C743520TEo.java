package X;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743520TEo extends C09AY implements Function1<ViewGroup.MarginLayoutParams, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C743520TEo(float f, float f2, float f3) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = f3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        marginLayoutParams2.width = (int) this.LL;
        marginLayoutParams2.height = (int) this.LLILLJJLI;
        marginLayoutParams2.topMargin = (int) this.LLILLL;
        return Unit.LIZ;
    }
}
