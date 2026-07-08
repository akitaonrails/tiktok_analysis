package X;

import android.graphics.Typeface;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditFontViewModel;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xPH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817890xPH extends C09AY implements Function1<C0O2V, C0O2V> {
    public final /* synthetic */ FullyCustomizedBoardEditFontViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817890xPH(FullyCustomizedBoardEditFontViewModel fullyCustomizedBoardEditFontViewModel) {
        super(1);
        this.LL = fullyCustomizedBoardEditFontViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0O2V invoke(C0O2V c0o2v) {
        Typeface second;
        Pair<C1817980xPQ, Typeface> pairLIZ;
        C0O2V c0o2v2 = c0o2v;
        InterfaceC971680bOQ interfaceC971680bOQ = this.LL.LL;
        if (interfaceC971680bOQ != null && (pairLIZ = interfaceC971680bOQ.LIZ()) != null) {
            second = pairLIZ.getSecond();
        } else {
            second = null;
        }
        return new C0O2V(c0o2v2.LL, new C291001Au(second));
    }
}
