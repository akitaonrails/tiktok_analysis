package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08hv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.EditPanelPanelFavoriteComponent$fetchPanelFavorites$effectsFromLocal$1", f = "EditPanelPanelFavoriteComponent.kt", l = {91}, m = "invokeSuspend")
public final class C2189308hv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Effect>>, Object> {
    public int LL;
    public final /* synthetic */ C2244708qr LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2189308hv(C2244708qr c2244708qr, String str, InterfaceC1364105Vn<? super C2189308hv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2244708qr;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2189308hv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditPanelPanelFavoriteComponent@f6f8.fetchPanelFavorites$effectsFromLocal$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2244708qr c2244708qr = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            obj = c2244708qr.T2(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EditPanelPanelFavoriteComponent@f6f8.fetchPanelFavorites$effectsFromLocal$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EditPanelPanelFavoriteComponent@f6f8.fetchPanelFavorites$effectsFromLocal$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Effect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
