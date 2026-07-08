package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tV2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667700tV2 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ TakoContentPreviewItem.Image LL;
    public final /* synthetic */ InterfaceC1361305Ul LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667700tV2(TakoContentPreviewItem.Image image, InterfaceC1361305Ul interfaceC1361305Ul, int i, float f, boolean z, Function0<Unit> function0, Function0<Unit> function02, int i2) {
        super(2);
        this.LL = image;
        this.LLILLJJLI = interfaceC1361305Ul;
        this.LLILLL = i;
        this.LLILZ = f;
        this.LLILZIL = z;
        this.LLILZLL = function0;
        this.LLIZ = function02;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1667680tV0.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1));
        return Unit.LIZ;
    }
}
