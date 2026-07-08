package X;

import Y.ACListenerS140S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS77S0100000_5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS33S2100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS93S0110000_5;
import u4.q0;

/* JADX INFO: renamed from: X.0EkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373410EkV extends AbstractC1664490tPr<C373330EkN, C373400EkU> {
    public final long LLJJJIL;
    public final Map<Integer, TuxIconDrawable> LLJJJJ;
    public final Map<Integer, Integer> LLJJJJJIL;
    public Long LLJJJJLIIL;
    public Long LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public TuxIconView LLJLLIL;
    public TuxIconView LLJLLL;
    public Integer LLJZ;
    public TuxIconView LLJZIJLIL;
    public TuxIconView LLL;
    public final C20094413jq LLLF;

    public C373410EkV() {
        disableSceneRestore();
        this.LLJJJIL = ((Number) C0E5G.LIZIZ(EnumC357850E1f.MAX_EDIT_VIDEO_LIMIT_TIME_MILLIS, Long.MAX_VALUE)).longValue();
        this.LLJJJJ = new LinkedHashMap();
        this.LLJJJJJIL = new LinkedHashMap();
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
        c1397760mTe.LIZJ = null;
        this.LLLF = c1397760mTe.LIZ();
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        C363500EMy c363500EMy = C363500EMy.LIZ;
        c363500EMy.getClass();
        if (!C363500EMy.LJIIJ) {
            c363500EMy.getClass();
            if (!C363500EMy.LJIIJJI) {
                return;
            }
        }
        TuxIconView tuxIconView = this.LLJLLL;
        if (tuxIconView != null) {
            C786410Ut5.LJLLLLLL(8, tuxIconView);
        }
    }

    public final void LLLLLJIL(TuxIconView tuxIconView) {
        if (tuxIconView == null) {
            return;
        }
        C427690Gpr.LJIIIZ(tuxIconView);
        int i = C20094413jq.LJIIZILJ;
        q0.LJIJ(tuxIconView, this.LLLF);
    }

    public final View LLLLLJLJLL(EnumC373450EkZ enumC373450EkZ) {
        switch (C373440EkY.LIZ[enumC373450EkZ.ordinal()]) {
            case 1:
                return this.LLL;
            case 2:
                return this.LLJZIJLIL;
            case 3:
                return this.LLJLL;
            case 4:
                return this.LLJLLL;
            case 5:
                return this.LLJLLIL;
            case 6:
                return this.LLJJLIIIJLLLLLLLZ;
            default:
                throw new C1954807lC();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        if (!C0E47.LIZ()) {
            return;
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EkS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C373330EkN) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 712));
        Context contextLIZIZ = C545820Lau.LIZIZ(this);
        Integer numLIZJ2 = null;
        if (contextLIZIZ != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.zs, contextLIZIZ);
            numLIZJ2 = C1308910kAL.LIZJ(R.attr.ei, contextLIZIZ);
        } else {
            numLIZJ = null;
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ekb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C373330EkN) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS214S0300000_5(this, numLIZJ, numLIZJ2, 16));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Eke
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C373330EkN) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 713));
        TuxIconView tuxIconView = this.LLJLLL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS140S0100000_5(this, 91));
        }
        TuxIconView tuxIconView2 = this.LLJLL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS140S0100000_5(this, 92));
        }
        TuxIconView tuxIconView3 = this.LLL;
        if (tuxIconView3 != null) {
            C786410Ut5.a9(tuxIconView3, new ACListenerS140S0100000_5(this, 93));
        }
        TuxIconView tuxIconView4 = this.LLJZIJLIL;
        if (tuxIconView4 != null) {
            C786410Ut5.a9(tuxIconView4, new ACListenerS140S0100000_5(this, 90));
        }
        TuxIconView tuxIconView5 = this.LLJLLIL;
        if (tuxIconView5 != null) {
            C786410Ut5.I7(new AkS77S0100000_5(this, 1), tuxIconView5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(0);
        ViewGroup viewGroup2 = (ViewGroup) C21146717pB.LIZIZ(requireSceneContext(), R.layout.d3u, viewGroup, false);
        C21690419ug c21690419ug = (C21690419ug) viewGroup2.findViewById(R.id.tv_time_container);
        if (c21690419ug != null) {
            c21690419ug.setHasFixSize(true);
        }
        TuxTextView tuxTextView = (TuxTextView) viewGroup2.findViewById(R.id.tv_time_split);
        ?? r9 = 0;
        Integer num = null;
        if (tuxTextView != null) {
            tuxTextView.setText("/");
        } else {
            tuxTextView = null;
        }
        this.LLJLILLLLZIIL = tuxTextView;
        this.LLJLL = (TuxIconView) viewGroup2.findViewById(R.id.lfg);
        this.LLJL = (TuxTextView) viewGroup2.findViewById(R.id.zgu);
        this.LLJLIL = (TuxTextView) viewGroup2.findViewById(R.id.tv_total_time);
        this.LLJJLIIIJLLLLLLLZ = viewGroup2.findViewById(R.id.niz);
        this.LLJZIJLIL = (TuxIconView) viewGroup2.findViewById(R.id.lfh);
        this.LLL = (TuxIconView) viewGroup2.findViewById(R.id.lfi);
        this.LLJLLL = (TuxIconView) viewGroup2.findViewById(R.id.lfe);
        this.LLJLLIL = (TuxIconView) viewGroup2.findViewById(R.id.lff);
        if (C293810BfP.LIZ()) {
            TuxIconView tuxIconView = this.LLJLL;
            if (tuxIconView != null) {
                ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                if (layoutParams != null) {
                    C1546210qL5.LIZ.getClass();
                    layoutParams.width = C814420VxA.LIZIZ(C1546210qL5.LIZ(80));
                    C786410Ut5.W5(tuxIconView, layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            TuxIconView tuxIconView2 = this.LLJLL;
            if (tuxIconView2 != null) {
                C1546210qL5.LIZ.getClass();
                C426750GoL.LJIIL(tuxIconView2, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(30))), Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(30))), Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(12))), 16);
            }
            TuxIconView tuxIconView3 = this.LLJLLL;
            if (tuxIconView3 != null) {
                ViewGroup.LayoutParams layoutParams2 = tuxIconView3.getLayoutParams();
                if (layoutParams2 != null) {
                    C1546210qL5.LIZ.getClass();
                    layoutParams2.width = C814420VxA.LIZIZ(C1546210qL5.LIZ(42));
                    C786410Ut5.W5(tuxIconView3, layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            TuxIconView tuxIconView4 = this.LLJLLL;
            if (tuxIconView4 != null) {
                C1546210qL5.LIZ.getClass();
                C426750GoL.LJIIIZ(tuxIconView4, null, null, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(0))), null, false, 27);
            }
            TuxIconView tuxIconView5 = this.LLJLLL;
            if (tuxIconView5 != null) {
                C1546210qL5.LIZ.getClass();
                C426750GoL.LJIIL(tuxIconView5, null, null, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(16))), null, 27);
            }
        }
        if (!C293820BfQ.LIZ()) {
            TuxIconView tuxIconView6 = this.LLJLLL;
            if (tuxIconView6 != null) {
                num = null;
                C426750GoL.LJIIL(tuxIconView6, Integer.valueOf(C0EGK.LIZ(8)), null, null, null, 30);
            }
            TuxIconView tuxIconView7 = this.LLL;
            Integer num2 = num;
            if (tuxIconView7 != null) {
                Integer num3 = num;
                C426750GoL.LJIIL(tuxIconView7, Integer.valueOf(C0EGK.LIZ(8)), num3, Integer.valueOf(C0EGK.LIZ(8)), num3, 26);
                num2 = num3;
            }
            TuxIconView tuxIconView8 = this.LLJZIJLIL;
            Integer num4 = num2;
            if (tuxIconView8 != null) {
                Integer num5 = num2;
                C426750GoL.LJIIL(tuxIconView8, Integer.valueOf(C0EGK.LIZ(8)), num5, Integer.valueOf(C0EGK.LIZ(8)), num5, 26);
                num4 = num5;
            }
            TuxIconView tuxIconView9 = this.LLJLLIL;
            r9 = num4;
            if (tuxIconView9 != null) {
                Integer num6 = num4;
                Integer num7 = num4;
                C426750GoL.LJIIL(tuxIconView9, Integer.valueOf(C0EGK.LIZ(8)), num6, Integer.valueOf(C0EGK.LIZ(8)), num7, 26);
                r9 = num7;
            }
        }
        LLLLLJIL(this.LLL);
        LLLLLJIL(this.LLJZIJLIL);
        LLLLLJIL(this.LLJLLL);
        LLLLLJIL(this.LLJLLIL);
        String string = getString(2131823177);
        String string2 = getString(2131823179);
        TuxIconView tuxIconView10 = this.LLJLL;
        if (tuxIconView10 != null) {
            int i = C20094413jq.LJIIZILJ;
            C1397760mTe c1397760mTe = new C1397760mTe();
            c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
            c1397760mTe.LIZJ = r9;
            c1397760mTe.LJIIIZ = new AwS33S2100000_5(this, string, string2, 1);
            q0.LJIJ(tuxIconView10, c1397760mTe.LIZ());
        }
        TuxTextView tuxTextView2 = this.LLJL;
        if (tuxTextView2 != null) {
            int i2 = C20094413jq.LJIIZILJ;
            C1397760mTe c1397760mTe2 = new C1397760mTe();
            c1397760mTe2.LJIIIZ = new AwS93S0110000_5(this, false, 11);
            C20094813ju.LIZ(tuxTextView2, c1397760mTe2.LIZ());
        }
        TuxTextView tuxTextView3 = this.LLJLIL;
        if (tuxTextView3 != null) {
            int i3 = C20094413jq.LJIIZILJ;
            C1397760mTe c1397760mTe3 = new C1397760mTe();
            c1397760mTe3.LJIIIZ = new AwS93S0110000_5(this, true, 11);
            C20094813ju.LIZ(tuxTextView3, c1397760mTe3.LIZ());
        }
        return viewGroup2;
    }
}
