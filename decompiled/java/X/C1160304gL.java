package X;

import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailBottomShopCtaAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04gL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1160304gL extends C09AY implements Function1<C0SZ5, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160304gL(int i, int i2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0SZ5 c0sz5) {
        C0SZ5 c0sz52 = c0sz5;
        c0sz52.LL = C13LE.LIZ(PoiDetailBottomShopCtaAssem.class);
        c0sz52.LLIZLLLIL = this.LL;
        c0sz52.LLILLJJLI = String.valueOf(this.LLILLJJLI);
        c0sz52.LLJIJIL = C1163440gNi.LIZJ;
        return Unit.LIZ;
    }
}
