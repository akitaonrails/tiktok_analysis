package X;

import android.view.View;
import com.ss.android.ugc.aweme.ui.BaseStickerPanelCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: renamed from: X.0HnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451510HnB extends C09AY implements Function1<C20248814Kw, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ EnumC2211841BhW LLILZIL;
    public final /* synthetic */ Function1<View, Boolean> LLILZLL;
    public final /* synthetic */ Function0<Float> LLIZ;
    public final /* synthetic */ BaseStickerPanelCell<InterfaceC1891350zJl> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C451510HnB(boolean z, boolean z2, float f, int i, EnumC2211841BhW enumC2211841BhW, Function1<? super View, Boolean> function1, Function0<Float> function0, BaseStickerPanelCell<InterfaceC1891350zJl> baseStickerPanelCell) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = f;
        this.LLILZ = i;
        this.LLILZIL = enumC2211841BhW;
        this.LLILZLL = function1;
        this.LLIZ = function0;
        this.LLIZLLLIL = baseStickerPanelCell;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20248814Kw c20248814Kw) {
        C20248814Kw c20248814Kw2 = c20248814Kw;
        boolean z = this.LL;
        boolean z2 = this.LLILLJJLI;
        float f = this.LLILLL;
        int i = this.LLILZ;
        EnumC2211841BhW enumC2211841BhW = this.LLILZIL;
        Function1<View, Boolean> function1 = this.LLILZLL;
        Function0<Float> function0 = this.LLIZ;
        c20248814Kw2.LJ = z;
        c20248814Kw2.LJFF = z2;
        c20248814Kw2.LJI = f;
        c20248814Kw2.LJIIIIZZ = i;
        c20248814Kw2.LJIIIZ = enumC2211841BhW;
        c20248814Kw2.LJIIJ = function1;
        c20248814Kw2.LJII = function0;
        c20248814Kw2.LIZIZ(new AwS620S0100000_6(this.LLIZLLLIL, 92));
        return Unit.LIZ;
    }
}
