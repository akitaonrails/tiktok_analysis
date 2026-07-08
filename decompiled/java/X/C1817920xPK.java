package X;

import android.graphics.Typeface;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditFontViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xPK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817920xPK extends C09AY implements Function2<C1817980xPQ, Typeface, Unit> {
    public final /* synthetic */ FullyCustomizedBoardEditFontViewModel LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817920xPK(FullyCustomizedBoardEditFontViewModel fullyCustomizedBoardEditFontViewModel, int i) {
        super(2);
        this.LL = fullyCustomizedBoardEditFontViewModel;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1817980xPQ c1817980xPQ, Typeface typeface) {
        this.LL.xQ2(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
