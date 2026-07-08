package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tsK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682140tsK extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ ImageModel LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ InterfaceC1671600tbK LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ ImageModel LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1682140tsK(ImageModel imageModel, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1671600tbK interfaceC1671600tbK, boolean z, Integer num, ImageModel imageModel2, int i, int i2) {
        super(2);
        this.LL = imageModel;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = interfaceC1671600tbK;
        this.LLILZ = z;
        this.LLILZIL = num;
        this.LLILZLL = imageModel2;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1682110tsH.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZ | 1), this.LLIZLLLIL);
        return Unit.LIZ;
    }
}
