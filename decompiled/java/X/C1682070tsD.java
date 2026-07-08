package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tsD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682070tsD extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ ImageModel LLILLJJLI;
    public final /* synthetic */ ImageModel LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1682070tsD(long j, ImageModel imageModel, ImageModel imageModel2, float f, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.LL = j;
        this.LLILLJJLI = imageModel;
        this.LLILLL = imageModel2;
        this.LLILZ = f;
        this.LLILZIL = z;
        this.LLILZLL = interfaceC1685750ty9;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1682040tsA.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZ | 1), this.LLIZLLLIL);
        return Unit.LIZ;
    }
}
