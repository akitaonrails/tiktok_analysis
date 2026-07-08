package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0Egl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371090Egl extends AbstractC1664490tPr<C371100Egm, C371080Egk> {
    public static final int LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
    public C368230Ec9 LLJJJIL;
    public C376320EpC LLJJJJ;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 718));

    public final float LLLLLJIL() {
        return ((Number) this.LLJJJJJIL.getValue()).floatValue();
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!C0E47.LIZ()) {
            return;
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ego
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C371100Egm) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 613));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Egp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C371100Egm) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 614));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Egq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C371100Egm) obj).LIZLLL;
            }
        }, new AwS584S0100000_5(this, 615));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!C0E47.LIZ()) {
            return new FrameLayout(requireSceneContext());
        }
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c0j, viewGroup, false);
        this.LLJJJIL = (C368230Ec9) viewGroup2.findViewById(R.id.yh7);
        this.LLJJJJ = (C376320EpC) viewGroup2.findViewById(R.id.yh2);
        C368230Ec9 c368230Ec9 = this.LLJJJIL;
        if (c368230Ec9 != null) {
            c368230Ec9.setFrameFetcher(new AwS619S0100000_5(this, 20));
            c368230Ec9.LJ(LLLLLJIL());
            int i = LLJJJJLIIL;
            c368230Ec9.setThumbWidth(i);
            c368230Ec9.setThumbHeight(i);
            c368230Ec9.setHalfDivideWidth(0.0f);
            c368230Ec9.setRound(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        }
        C376320EpC c376320EpC = this.LLJJJJ;
        if (c376320EpC != null) {
            c376320EpC.setMinStartMargin(0);
            c376320EpC.setMaxStartMargin((int) LLLLLJIL());
            c376320EpC.setOnProgressChangedListener(new InterfaceC371150Egr() { // from class: X.0Egn
                @Override // X.InterfaceC371150Egr
                public final void LIZJ(float f) {
                    this.LIZ.LLLLIL().LIZ.invoke(Long.valueOf((long) (f * this.LIZ.LLLLILI().LIZ.LIZIZ)));
                }
            });
        }
        return viewGroup2;
    }
}
