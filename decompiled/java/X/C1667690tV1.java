package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tV1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667690tV1 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1665870tS5 LL;
    public final /* synthetic */ TakoContentPreviewItem.Image LLILLJJLI;
    public final /* synthetic */ InterfaceC1361305Ul LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667690tV1(InterfaceC1665870tS5 interfaceC1665870tS5, TakoContentPreviewItem.Image image, InterfaceC1361305Ul interfaceC1361305Ul, int i, float f, boolean z, Function0<Unit> function0, Function0<Unit> function02, int i2, int i3) {
        super(2);
        this.LL = interfaceC1665870tS5;
        this.LLILLJJLI = image;
        this.LLILLL = interfaceC1361305Ul;
        this.LLILZ = i;
        this.LLILZIL = f;
        this.LLILZLL = z;
        this.LLIZ = function0;
        this.LLIZLLLIL = function02;
        this.LLJ = i2;
        this.LLJI = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1667680tV0.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJ | 1), this.LLJI);
        return Unit.LIZ;
    }
}
