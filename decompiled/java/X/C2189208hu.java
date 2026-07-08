package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08hu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.EditPanelPanelFavoriteComponent$getPanelFavoritesFromLocal$3", f = "EditPanelPanelFavoriteComponent.kt", l = {}, m = "invokeSuspend")
public final class C2189208hu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Effect> LL;
    public final /* synthetic */ C2244708qr LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2189208hu(List<? extends Effect> list, C2244708qr c2244708qr, String str, InterfaceC1364105Vn<? super C2189208hu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c2244708qr;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2189208hu(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditPanelPanelFavoriteComponent@f6f8.getPanelFavoritesFromLocal$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Effect> list = this.LL;
        C2244708qr c2244708qr = this.LLILLJJLI;
        String str = this.LLILLL;
        for (Effect effect : list) {
            c2244708qr.LLIZLLLIL.put(new Pair<>(str, effect.getResourceId()), effect);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditPanelPanelFavoriteComponent@f6f8.getPanelFavoritesFromLocal$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
