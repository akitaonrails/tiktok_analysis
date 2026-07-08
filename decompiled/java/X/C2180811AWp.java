package X;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AWp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180811AWp extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C1AXM LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ Pair<Integer, Integer> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2180811AWp(C1AXM c1axm, float f, Pair<Integer, Integer> pair) {
        super(1);
        this.LL = c1axm;
        this.LLILLJJLI = f;
        this.LLILLL = pair;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View view2 = view;
        C1AZW.LIZ.getClass();
        C1AZW.LIZ("LayoutFirstFrameOptLog", "setParent, ControlGroupSetParent", null, null);
        Rect rect = new Rect();
        view2.getGlobalVisibleRect(rect);
        this.LL.LLJI(view2, this.LLILLL, this.LL.LJJIFFI(rect, this.LLILLJJLI), view2.getWidth(), view2.getHeight(), ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad());
        return Unit.LIZ;
    }
}
