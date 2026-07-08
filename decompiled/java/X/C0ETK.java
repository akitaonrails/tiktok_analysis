package X;

import Y.ATListenerS439S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.als.LiveEvent;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ETK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ETK extends AbstractC381020Ewm<InterfaceC357900E1k> implements InterfaceC357900E1k, InterfaceC379610EuV {
    public static final C0ETM LLJJIJIIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public static final Set<String> LLJJJIL;
    public static final Set<String> LLJJJJ;
    public static final Set<String> LLJJJJJIL;
    public final Activity LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final String LLILZLL;
    public final C0EZ4 LLIZ;
    public final C1DRG LLIZLLLIL;
    public boolean LLJ;
    public final int LLJI;
    public int LLJIJIL;
    public float LLJILJIL;
    public final int LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final C560530Lyd<Unit> LLJJ;
    public final C560530Lyd<EnumC357140DzM> LLJJI;
    public final C560530Lyd<Pair<EnumC357140DzM, Boolean>> LLJJIII;
    public final C0ETL LLJJIJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ETM] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0ETK.class, "panelHeightApi", "getPanelHeightApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelHeightApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIIJIL = new Object() { // from class: X.0ETM
        };
        LLJJJ = 8;
        LLJJJIL = C13LQ.LJLIIL(new String[]{"volume_panel", "speed_panel", "tts_panel", "voice_effect", "magic_panel", "video_anim_panel", "video_transition", "filter_panel", "adjust_opacity_panel", "lyrics_sticker_effects"});
        LLJJJJ = C13LQ.LJLIIL(new String[]{"inline_caption", "inline_caption_font", "video_effect_panel", "audio_beats", "speed_curve_edit_panel"});
        LLJJJJJIL = Collections.singleton("async_tasks");
    }

    public InterfaceC357900E1k X1() {
        return this;
    }

    private final boolean G2() {
        return LLJJJJ.contains(this.LLILZLL);
    }

    private final boolean H2() {
        return LLJJJJJIL.contains(this.LLILZLL);
    }

    private final void W2() {
        View viewFindViewById = this.LLILLL.findViewById(this.LLJI);
        if (viewFindViewById != null) {
            viewFindViewById.setImportantForAccessibility(this.LLJIJIL);
            this.LLJIJIL = 0;
        }
    }

    private final void o2() {
        View view;
        View view2 = this.LLILZIL;
        if (view2 != null) {
            if (!view2.isLaidOut() || view2.isLayoutRequested()) {
                view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(this, 9));
            } else if (oI1()) {
                Context context = view2.getContext();
                if (context != null && !FZ0()) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.bn);
                    c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(12));
                    c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(12));
                    view2.setBackground(c384050F3z.LIZ(context));
                }
                if (this.LLIZ.LIZ.invoke().booleanValue()) {
                    view2.setOnTouchListener(new ATListenerS439S0100000_5(this, 6));
                }
            }
        }
        if ((oI1() || this.LLIZ.LIZLLL.invoke().booleanValue()) && (view = this.LLILZ) != null) {
            view.setOnTouchListener(new ATListenerS439S0100000_5(this, 7));
        }
    }

    private final boolean w2() {
        return LLJJJIL.contains(this.LLILZLL);
    }

    public final InterfaceC360570EBr Z1() {
        return (InterfaceC360570EBr) this.LLJILLL.getValue(this, LLJJIJIL[0]);
    }

    private final void T2() {
        View view;
        if ((oI1() || this.LLIZ.LIZLLL.invoke().booleanValue()) && (view = this.LLILZ) != null) {
            view.setOnTouchListener(null);
        }
    }

    @Override // X.InterfaceC357900E1k
    public boolean oI1() {
        boolean zW2 = w2();
        boolean zG2 = G2();
        boolean zH2 = H2();
        if (C0E2B.LIZ()) {
            return zW2 || zG2 || zH2;
        }
        return false;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC358840E5a interfaceC358840E5aBo;
        super.onCreate();
        c3(4);
        o2();
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || (interfaceC358840E5aBo = c0e48W1.Bo()) == null) {
            return;
        }
        interfaceC358840E5aBo.LIZLLL(this.LLJJIJI);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC358840E5a interfaceC358840E5aBo;
        W2();
        T2();
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (interfaceC358840E5aBo = c0e48W1.Bo()) != null) {
            interfaceC358840E5aBo.LIZJ(this.LLJJIJI);
        }
        super.onDestroy();
    }

    @Override // X.InterfaceC357900E1k
    public boolean FZ0() {
        return this.LLJ;
    }

    @Override // X.InterfaceC357900E1k
    public LiveEvent<Unit> VD1() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC357900E1k
    public LiveEvent<Pair<EnumC357140DzM, Boolean>> eb1() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC357900E1k
    public LiveEvent<EnumC357140DzM> tI() {
        return this.LLJJI;
    }

    private final void c3(int i) {
        View viewFindViewById = this.LLILLL.findViewById(this.LLJI);
        if (viewFindViewById != null) {
            this.LLJIJIL = viewFindViewById.getImportantForAccessibility();
            viewFindViewById.setImportantForAccessibility(i);
        }
    }

    @Override // X.InterfaceC357900E1k
    public void qc1(boolean z) {
        this.LLJ = z;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0ETL] */
    public C0ETK(Activity activity, View view, View view2, String str, C0EZ4 c0ez4, C1DRG c1drg, boolean z) {
        super(c1drg);
        this.LLILLL = activity;
        this.LLILZ = view;
        this.LLILZIL = view2;
        this.LLILZLL = str;
        this.LLIZ = c0ez4;
        this.LLIZLLLIL = c1drg;
        this.LLJ = z;
        this.LLJI = R.id.f7k;
        this.LLJILJILJ = C0FU0.LIZ(30.0f);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC360570EBr.class, null);
        this.LLJJ = new C560530Lyd<>();
        this.LLJJI = new C560530Lyd<>();
        this.LLJJIII = new C560530Lyd<>();
        this.LLJJIJI = new InterfaceC357170DzP() { // from class: X.0ETL
            @Override // X.InterfaceC357170DzP
            public final void LIZJ(EnumC357140DzM enumC357140DzM) {
                this.LIZ.LLJJI.LJIIJ(enumC357140DzM);
            }

            @Override // X.InterfaceC357170DzP
            public final void LIZIZ(EnumC357140DzM enumC357140DzM, boolean z2) {
                this.LIZ.LLJJIII.LJIIJ(new Pair<>(enumC357140DzM, Boolean.valueOf(z2)));
            }
        };
    }
}
