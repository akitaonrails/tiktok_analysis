package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.scene.Scene;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Efg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370420Efg extends AnonymousClass1136 {
    public final Scene LLIZLLLIL;
    public final ViewGroup LLJ;
    public final C113G LLJI;
    public final C113D LLJIJIL;
    public final Context LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public final TuxIconDrawable LLJJI;
    public final TuxIconDrawable LLJJIII;
    public final TuxIconDrawable LLJJIJI;
    public final boolean LLJJIJIIJIL;

    @Override // X.AnonymousClass1136
    public final int LIZIZ() {
        return 0;
    }

    @Override // X.AnonymousClass1136
    public final String LIZLLL() {
        return "";
    }

    @Override // X.AnonymousClass1136
    public final View LJI() {
        ViewGroup viewGroup;
        int i = 0;
        this.LLILZ = C786410Ut5.Td(C786410Ut5.ne(this.LLJ.getContext()), R.layout.c0w, this.LLJ, false);
        this.LLJ.addView(LJ());
        View viewFindViewById = LJ().findViewById(R.id.zop);
        C1652270t69.LIZIZ(48.0f, 48.0f, viewFindViewById);
        C473601ss.LIZ(600L, viewFindViewById, new AwS584S0100000_5(this, 968));
        this.LLJILJILJ = LJ().findViewById(R.id.ihk);
        this.LLJILLL = LJ().findViewById(R.id.ihl);
        this.LLJJ = LJ().findViewById(R.id.ihm);
        LJIIJJI(this.LLJILJILJ, this.LLJJI, false);
        LJIIJJI(this.LLJILLL, this.LLJJIII, true);
        LJIIJJI(this.LLJJ, this.LLJJIJI, false);
        View viewFindViewById2 = LJ().findViewById(R.id.naz);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ds);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(25));
        viewFindViewById2.setBackground(c384050F3z.LIZ(this.LLJILJIL));
        if (this.LLJJIJIIJIL) {
            View viewFindViewById3 = LJ().findViewById(R.id.jdz);
            if ((viewFindViewById3 instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById3) != null) {
                Iterator<View> it2 = new C09RD(viewGroup).iterator();
                while (true) {
                    C09RE c09re = (C09RE) it2;
                    if (!c09re.hasNext()) {
                        break;
                    }
                    Object next = c09re.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    View view = (View) next;
                    C12P4 c12p4 = view instanceof C12P4 ? (C12P4) view : null;
                    if (i == 0) {
                        C12P3 c12p3 = (C12P3) (c12p4 != null ? c12p4.getDrawable() : null);
                        c12p3.LIZJ(0.1f);
                        c12p3.LIZLLL(0.8f);
                        c12p4.setImageDrawable(null);
                        c12p4.setImageDrawable(c12p3);
                    } else if (i == 3) {
                        C12P3 c12p32 = (C12P3) (c12p4 != null ? c12p4.getDrawable() : null);
                        c12p32.LIZJ(0.8f);
                        c12p32.LIZLLL(0.1f);
                        c12p4.setImageDrawable(null);
                        c12p4.setImageDrawable(c12p32);
                    }
                    i = i2;
                }
            }
        }
        return LJ();
    }

    @Override // X.AnonymousClass1136
    public final C113G LIZ() {
        return this.LLJI;
    }

    public final void LJIIJJI(View view, TuxIconDrawable tuxIconDrawable, boolean z) {
        int iIntValue;
        int i;
        if (view == null) {
            return;
        }
        Integer numLIZJ = C0EJA.LIZJ(C390810FTz.LIZJ(this.LLJILJIL));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.LLJILJIL, R.style.y0);
        if (z) {
            i = R.attr.a02;
        } else {
            i = R.attr.zg;
        }
        if (C0EJA.LJFF() == 1 || C0EJA.LJFF() == 3) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = C1308910kAL.LIZ(i, contextThemeWrapper);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
            view.setBackground(c384050F3z.LIZ(this.LLIZLLLIL.requireSceneContext()));
            C1322090kVb c1322090kVb = (C1322090kVb) view.findViewById(R.id.lho);
            if (c1322090kVb != null) {
                c1322090kVb.setImageDrawable(tuxIconDrawable);
                ((FrameLayout.LayoutParams) c1322090kVb.getLayoutParams()).gravity = 17;
            }
        }
    }

    public C370420Efg(Scene scene, ViewGroup viewGroup, C113G c113g, C113D c113d) {
        int i;
        int i2;
        int i3;
        super(c113g, "", new ArrayList());
        this.LLIZLLLIL = scene;
        this.LLJ = viewGroup;
        this.LLJI = c113g;
        this.LLJIJIL = c113d;
        Context contextRequireSceneContext = scene.requireSceneContext();
        this.LLJILJIL = contextRequireSceneContext;
        if (C0EJA.LJI()) {
            i = R.raw.icon_crop;
        } else {
            i = R.raw.icon_crop_fill;
        }
        this.LLJJI = C357540E0a.LJJIJL(i, contextRequireSceneContext);
        if (C0EJA.LJI()) {
            i2 = R.raw.icon_color_triple_ellipse;
        } else {
            i2 = R.raw.icon_color_triple_ellipse_fill;
        }
        this.LLJJIII = C357540E0a.LJJIL(contextRequireSceneContext, i2, true);
        if (C0EJA.LJI()) {
            i3 = R.raw.icon_speaker_2_ltr;
        } else {
            i3 = R.raw.icon_speaker_2_fill_ltr;
        }
        this.LLJJIJI = C357540E0a.LJJIJL(i3, contextRequireSceneContext);
        this.LLJJIJIIJIL = C426750GoL.LIZLLL(contextRequireSceneContext);
    }
}
