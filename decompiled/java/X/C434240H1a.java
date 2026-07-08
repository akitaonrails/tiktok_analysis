package X;

import android.view.View;
import com.bytedance.android.livesdk.game.gamelist.GameTopicCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.gamelist.GameTopicCell$fitGameEventNameWidth$1", f = "GameTopicCell.kt", l = {}, m = "invokeSuspend")
public final class C434240H1a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ GameTopicCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C434240H1a(GameTopicCell gameTopicCell, InterfaceC1364105Vn<? super C434240H1a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = gameTopicCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434240H1a(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameTopicCell@9877.fitGameEventNameWidth$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.I5().getVisibility() == 0) {
            this.LL.I5().addOnLayoutChangeListener(new C0IDP(this.LL, 13));
        } else {
            Integer numLJ = C2286608xc.LJ(((View) this.LL.LLILLL.getValue()).getWidth());
            if (numLJ.intValue() > 0) {
                GameTopicCell gameTopicCell = this.LL;
                gameTopicCell.L5().setMaxWidth(numLJ.intValue());
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameTopicCell@9877.fitGameEventNameWidth$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
