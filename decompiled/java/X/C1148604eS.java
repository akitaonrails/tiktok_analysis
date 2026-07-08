package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.sku.PcsServiceSkuAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04eS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1148604eS extends C09AY implements Function1<C696590RUb, Unit> {
    public final /* synthetic */ C13IQ<? extends PcsServiceSkuAssem> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1148604eS(C13IQ<? extends PcsServiceSkuAssem> c13iq) {
        super(1);
        this.LL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C696590RUb c696590RUb2 = c696590RUb;
        c696590RUb2.LL = this.LL;
        c696590RUb2.LLIZLLLIL = R.id.vga;
        return Unit.LIZ;
    }
}
