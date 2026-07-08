package X;

import android.widget.LinearLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleSkuAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518260KUe extends C09AY implements Function2<UIAssem, C0KUR, Unit> {
    public final /* synthetic */ PcsServiceBioSingleSkuAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C518260KUe(PcsServiceBioSingleSkuAssem pcsServiceBioSingleSkuAssem) {
        super(2);
        this.LL = pcsServiceBioSingleSkuAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C0KUR c0kur) {
        EnumC518250KUd enumC518250KUd;
        int i = C518240KUc.LIZIZ[c0kur.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        LinearLayout linearLayout = this.LL.LLJJIJIIJIL;
                        if (linearLayout != null) {
                            C500260Jjc.LJIILIIL(linearLayout);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    LinearLayout linearLayout2 = this.LL.LLJJIJIIJIL;
                    if (linearLayout2 != null) {
                        C500260Jjc.LJIILIIL(linearLayout2);
                    }
                }
            } else {
                PcsServiceBioSingleSkuAssem pcsServiceBioSingleSkuAssem = this.LL;
                int i2 = C518240KUc.LIZ[pcsServiceBioSingleSkuAssem.LLJJJJJIL.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        enumC518250KUd = EnumC518250KUd.UNSPECIFIED;
                    } else {
                        enumC518250KUd = EnumC518250KUd.FETCH_NO_CACHE;
                    }
                } else {
                    enumC518250KUd = EnumC518250KUd.FETCH_AFTER_CACHE;
                }
                pcsServiceBioSingleSkuAssem.LLJJJJJIL = enumC518250KUd;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LOAD_SUCCESS -> ");
                sbLIZ.append(this.LL.LLJJJJJIL);
                C20441214yg.LIZIZ("PcsServiceBioSingleSkuAssem", C2188811AlT.LIZIZ(sbLIZ));
                this.LL.Ep();
            }
        } else if (this.LL.up().LLIZLLLIL) {
            this.LL.LLJJJJJIL = EnumC518250KUd.LOAD_FROM_CACHE;
            C20441214yg.LIZIZ("PcsServiceBioSingleSkuAssem", "BEFORE_LOAD_START -> LOAD_FROM_CACHE");
            this.LL.Ep();
        }
        return Unit.LIZ;
    }
}
