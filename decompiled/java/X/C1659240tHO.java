package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tHO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659240tHO extends C1659140tHE implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final C1DRG LLJJLIIIJLLLLLLLZ;
    public EnumC1462540oA8 LLJL;
    public final C1664740tQG LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1659240tHO.class, "aiTheaterApi", "getAiTheaterApi()Lcom/ss/android/ugc/gamora/editor/aitheater/AITheaterEditFeatureApi;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C1659140tHE, X.InterfaceC1657880tFC
    public final C1654400t9a LIZLLL() {
        View viewLJJI = LJJI();
        SmartImageView smartImageViewLJIJI = LJIJI();
        FrameLayout frameLayout = this.LLJILJIL;
        if (frameLayout != null) {
            return new C1654400t9a(viewLJJI, smartImageViewLJIJI, frameLayout, LJIJJ(), LJJ(), null);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJJIIZ() {
        String string;
        C0MW8 c0mw8LJ;
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ == null || (c0mw8LJ = iAITheaterFeatureServiceLIZ.LJ()) == null || (string = c0mw8LJ.LIZJ()) == null) {
            string = LJJ().getContext().getString(2131826048);
        }
        LJJ().setText(string);
        SmartImageView smartImageViewLJIJI = LJIJI();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_cast;
        int i = this.LLJJJ;
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i;
        c419910GdJ.LIZLLL = -1;
        smartImageViewLJIJI.setImageDrawable(c419910GdJ.LIZ(LJIJI().getContext()));
        C426750GoL.LJIIL(LJIJI(), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), 16);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C1659140tHE, X.InterfaceC1657880tFC
    public final void LIZJ(i3 i3Var) {
        super.LIZJ(i3Var);
        if (i3Var.LLILLL.getType() == 1801) {
            LJJIIZI(i3Var.LLJJIJI, i3Var.LLJJIJIIJIL, true);
            C1659300tHU c1659300tHU = new C2217381BqS() { // from class: X.0tHU
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((i3) obj).LLJJIJI;
                }
            };
            Lifecycle.State state = Lifecycle.State.CREATED;
            LJJIFFI(c1659300tHU, state, new AwS604S0100000_25(this, 858));
            LJJIFFI(new C2217381BqS() { // from class: X.0tHS
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((i3) obj).LLJJJJ);
                }
            }, state, new AwS604S0100000_25(this, 859));
            InterfaceC1456730o0l interfaceC1456730o0l = (InterfaceC1456730o0l) this.LLJLIL.getValue(this, LLJLILLLLZIIL[0]);
            if (interfaceC1456730o0l != null) {
                interfaceC1456730o0l.A40();
            }
        }
    }

    @Override // X.C1659140tHE, X.AbstractC1659350tHZ
    public final void LJIIJJI(View view) {
        super.LJIIJJI(view);
    }

    @Override // X.C1659140tHE
    public final void LJIILIIL(int i) {
        super.LJIILIIL(i);
    }

    public C1659240tHO(LifecycleOwner lifecycleOwner, C1DRG c1drg) {
        super(lifecycleOwner, null, new C1659620tI0(new AwS569S0100000_25(c1drg, 1092)));
        this.LLJJLIIIJLLLLLLLZ = c1drg;
        this.LLJLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1456730o0l.class, null);
    }

    public final void LJJIIZI(EnumC1462540oA8 enumC1462540oA8, C1659490tHn c1659490tHn, boolean z) {
        if (this.LLJL == enumC1462540oA8) {
            return;
        }
        if (enumC1462540oA8 != null && C1464800oDm.LIZ[enumC1462540oA8.ordinal()] == 1) {
            LJJIIZ();
            LJIJJLI().cancelAnimation();
        } else {
            LJJIIZ();
        }
        this.LLJL = enumC1462540oA8;
    }
}
