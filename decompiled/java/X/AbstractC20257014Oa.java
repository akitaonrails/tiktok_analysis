package X;

import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.nimblecard.tako.component.NimbleAssemReusedContainer;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.14Oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20257014Oa<T> extends C14NT<View> {
    public NimbleAssemReusedContainer LJIIL;
    public AwS574S0100000_30 LJIILIIL;

    public abstract Function0<ReusedUIAssem<?>> LJJIIZ();

    public abstract InterfaceC1587906Jp LJJIIZI();

    public AbstractC20257014Oa(NimbleTemplateContext nimbleTemplateContext) {
        super(nimbleTemplateContext);
        this.LJIILIIL = new AwS574S0100000_30(this, 378);
    }

    @Override // X.C14NT, X.C14NX
    public void LJII(TemplateData templateData) {
        super.LJII(templateData);
        if (!this.LIZ.LLIZLLLIL) {
            AwS574S0100000_30 awS574S0100000_30 = this.LJIILIIL;
            if (awS574S0100000_30 != null) {
                awS574S0100000_30.invoke();
            }
            this.LJIILIIL = null;
        }
    }

    @Override // X.C14NT, X.C14NX
    public final void LJIILJJIL(Map<String, ? extends Object> map, C14NF c14nf) {
        NimbleAssemReusedContainer nimbleAssemReusedContainer;
        if (this.LIZ.LLIZLLLIL) {
            AwS574S0100000_30 awS574S0100000_30 = this.LJIILIIL;
            if (awS574S0100000_30 != null) {
                awS574S0100000_30.invoke();
            }
            this.LJIILIIL = null;
        }
        super.LJIILJJIL(map, c14nf);
        InterfaceC1587906Jp interfaceC1587906JpLJJIIZI = LJJIIZI();
        if (interfaceC1587906JpLJJIIZI != null && (nimbleAssemReusedContainer = this.LJIIL) != null) {
            nimbleAssemReusedContainer.LLJJJJLIIL(0, interfaceC1587906JpLJJIIZI, null);
        }
    }
}
