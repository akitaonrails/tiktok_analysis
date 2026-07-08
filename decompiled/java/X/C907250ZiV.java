package X;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0ZiV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907250ZiV extends C1659140tHE implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final C1DRG LLJJLIIIJLLLLLLLZ;
    public final C1664740tQG LLJL;
    public TuxSpinner LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C907250ZiV.class, "aiApi", "getAiApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/TemplateAutoCutAIApi;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C1659140tHE
    public final void LJIIL() {
        LJJIFFI(new C2217381BqS() { // from class: X.0ZiW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((i3) obj).LLIZ);
            }
        }, Lifecycle.State.CREATED, new AwS593S0100000_14(this, 181));
        ((C0ETY) this.LLJJLIIIJLLLLLLLZ.LJII(C0ETY.class, null)).Sd(InterfaceC1417440mzO.class, new AwS593S0100000_14(this, 180));
    }

    @Override // X.C1659140tHE, X.AbstractC1659350tHZ, X.InterfaceC1657880tFC
    public final void LJ() {
        super.LJ();
        TuxSpinner tuxSpinner = this.LLJLIL;
        if (tuxSpinner != null) {
            C786410Ut5.LLZILL(tuxSpinner, 8);
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C1659140tHE, X.AbstractC1659350tHZ
    public final void LJIIJJI(View view) {
        super.LJIIJJI(view);
        this.LLJLIL = (TuxSpinner) view.findViewById(R.id.bf1);
    }

    public final void LJJIIZ(boolean z) {
        InterfaceC1417440mzO interfaceC1417440mzO;
        if (!z && (interfaceC1417440mzO = (InterfaceC1417440mzO) this.LLJL.getValue(this, LLJLILLLLZIIL[0])) != null && interfaceC1417440mzO.ol0()) {
            TuxSpinner tuxSpinner = this.LLJLIL;
            if (tuxSpinner != null) {
                C786410Ut5.LLZILL(tuxSpinner, 0);
                return;
            }
            return;
        }
        TuxSpinner tuxSpinner2 = this.LLJLIL;
        if (tuxSpinner2 == null) {
            return;
        }
        C786410Ut5.LLZILL(tuxSpinner2, 8);
    }

    public C907250ZiV(LifecycleOwner lifecycleOwner, C1DRG c1drg, List<View> list) {
        super(lifecycleOwner, list, new C1659620tI0(new AwS558S0100000_14(c1drg, 1177)));
        this.LLJJLIIIJLLLLLLLZ = c1drg;
        this.LLJL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1417440mzO.class, null);
    }
}
