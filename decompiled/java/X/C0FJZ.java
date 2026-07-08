package X;

import Y.ACListenerS140S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FJZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FJZ extends AbstractC388140FJs {
    public final ViewGroup LIZIZ;
    public final C388200FJy LIZJ;
    public final RecyclerView LIZLLL;
    public TuxIconView LJ;
    public TuxIconView LJFF;
    public TuxIconView LJI;
    public View LJII;
    public View LJIIIIZZ;
    public View LJIIIZ;
    public final C1664680tQA<TextStickerModel> LJIIJ;
    public C0P0T LJIIJJI;
    public final List<C388080FJm> LJIIL;
    public C387970FJb LJIILIIL;
    public final C01GW LJIILJJIL;

    /* JADX WARN: Removed duplicated region for block: B:73:0x01f4  */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.0FJa] */
    @Override // X.C0FKZ, X.InterfaceC388800FMg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FJZ.LJI():void");
    }

    @Override // X.AbstractC388140FJs
    public final void LJIIIZ() {
        C388080FJm next;
        C387970FJb c387970FJb = this.LJIILIIL;
        if (c387970FJb != null) {
            Iterator<C388080FJm> it2 = c387970FJb.LL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (next.LIZ() == 5) {
                        break;
                    }
                }
            }
            C388080FJm c388080FJm = next;
            if (c388080FJm != null) {
                int iIndexOf = c387970FJb.LL.indexOf(c388080FJm);
                if (c388080FJm.LJ) {
                    c388080FJm.LJ = false;
                    c388080FJm.LIZIZ = R.raw.icon_text_to_speech;
                    c387970FJb.notifyItemChanged(iIndexOf);
                }
            }
        }
        TuxIconView tuxIconView = this.LJ;
        if (tuxIconView == null) {
            return;
        }
        tuxIconView.setClickable(false);
        C786410Ut5.x5(tuxIconView, 0.5f);
        tuxIconView.setImageResource(R.drawable.c8c);
    }

    @Override // X.AbstractC388140FJs
    public final void LJIIJ() {
        TTSModel ttsModel = this.LJIIJ.LIZ.getTtsModel();
        LJIIJJI(ttsModel != null ? ttsModel.hasReadTextAudio : false);
    }

    public final boolean LJIILLIIL() {
        InterfaceC388160FJu interfaceC388160FJuLJIIJ;
        C388200FJy c388200FJy = this.LIZJ;
        if (!c388200FJy.LJIIIZ.LJJ.LIZLLL || C0F8Y.LJIIIIZZ(c388200FJy.LJ.LIZ)) {
            return false;
        }
        C388200FJy c388200FJy2 = this.LIZJ;
        if (c388200FJy2.LJIL) {
            return false;
        }
        C0FF8 c0ff8 = c388200FJy2.LJFF;
        return ((c0ff8 == null || (interfaceC388160FJuLJIIJ = c0ff8.LJIIJ()) == null) ? null : interfaceC388160FJuLJIIJ.S4()) != EnumC388580FLk.ONLY_EDITOR;
    }

    public final void LJIJ() {
        C0FGR c0fgrLIZJ;
        C0FGR c0fgrLIZJ2;
        int mode = this.LJIIJ.LIZ.getMode();
        this.LJIIJ.LIZLLL(new AwS20S0001000_5(mode != 1 ? mode != 2 ? mode != 4 ? 1 : 2 : 3 : 4, 37), true);
        C0FF8 c0ff8 = this.LIZJ.LJFF;
        if (c0ff8 != null && (c0fgrLIZJ2 = c0ff8.LIZJ()) != null) {
            c0fgrLIZJ2.LJ(this.LJIIJ.LIZ, C0FHF.CLICK.getValue(), null, null);
        }
        C0FF8 c0ff82 = this.LIZJ.LJFF;
        if (c0ff82 == null || (c0fgrLIZJ = c0ff82.LIZJ()) == null) {
            return;
        }
        c0fgrLIZJ.LJIIJ(this.LJIIJ.LIZ);
    }

    @Override // X.AbstractC388140FJs
    public final void LJIILIIL() {
        TuxIconView tuxIconView;
        C0FGR c0fgrLIZJ;
        if (C388010FJf.LIZ()) {
            return;
        }
        C391040FUw c391040FUw = C391040FUw.LIZ;
        c391040FUw.getClass();
        if (!C391040FUw.LJI() || (tuxIconView = this.LJ) == null) {
            return;
        }
        if (!tuxIconView.isLaidOut() || tuxIconView.isLayoutRequested()) {
            tuxIconView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391520FWs(c391040FUw, this, 3));
            return;
        }
        try {
            C391040FUw.LIZIZ();
            C450720Hlu c450720Hlu = new C450720Hlu(this.LIZIZ.getContext());
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = tuxIconView;
            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
            c1391600mJi.LJII = 3000L;
            c1391600mJi.LJIJJ = false;
            c450720Hlu.LJIIJ(2131850133);
            C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
            this.LJIIJJI = c0p0tLIZIZ;
            c0p0tLIZIZ.show();
            C0FF8 c0ff8 = this.LIZJ.LJFF;
            if (c0ff8 == null || (c0fgrLIZJ = c0ff8.LIZJ()) == null) {
                return;
            }
            c0fgrLIZJ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIILL() {
        if (C444960Hcc.LIZIZ() || !this.LIZJ.LJIIIZ.LIZJ || this.LIZJ.LJIL) {
            return;
        }
        if (this.LJIIJ.LIZ.getTextTemplateModel().enableTextTemplate && !this.LJIIJ.LIZ.getTextTemplateModel().isHint) {
            this.LIZJ.LJIIL.LIZLLL.invoke(EnumC388580FLk.ONLY_EDITOR, Boolean.FALSE);
        } else {
            this.LIZJ.LJIIL.LJFF.invoke(Boolean.FALSE);
            this.LIZJ.LJIIL.LJ.invoke(Boolean.TRUE);
        }
    }

    @Override // X.AbstractC388140FJs
    public final void LJIIIIZZ(boolean z) {
        C388080FJm c388080FJm = null;
        if (z) {
            TuxIconView tuxIconView = this.LJFF;
            if (tuxIconView == null) {
                tuxIconView = null;
            }
            C786410Ut5.x5(tuxIconView, 1.0f);
            TuxIconView tuxIconView2 = this.LJFF;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            tuxIconView2.setClickable(true);
            TuxIconView tuxIconView3 = this.LJFF;
            if (tuxIconView3 == null) {
                tuxIconView3 = null;
            }
            tuxIconView3.setTag(Boolean.TRUE);
        } else {
            TuxIconView tuxIconView4 = this.LJFF;
            if (tuxIconView4 == null) {
                tuxIconView4 = null;
            }
            C786410Ut5.x5(tuxIconView4, 0.34f);
            TuxIconView tuxIconView5 = this.LJFF;
            if (tuxIconView5 == null) {
                tuxIconView5 = null;
            }
            tuxIconView5.setClickable(false);
            TuxIconView tuxIconView6 = this.LJFF;
            if (tuxIconView6 == null) {
                tuxIconView6 = null;
            }
            tuxIconView6.setTag(Boolean.FALSE);
        }
        C387970FJb c387970FJb = this.LJIILIIL;
        if (c387970FJb != null) {
            Iterator<C388080FJm> it2 = c387970FJb.LL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C388080FJm next = it2.next();
                if (next.LIZ() == 3) {
                    c388080FJm = next;
                    break;
                }
            }
            C388080FJm c388080FJm2 = c388080FJm;
            if (c388080FJm2 != null && c388080FJm2.LJ != z) {
                int iIndexOf = c387970FJb.LL.indexOf(c388080FJm2);
                c388080FJm2.LJ = z;
                c387970FJb.notifyItemChanged(iIndexOf);
            }
        }
    }

    @Override // X.AbstractC388140FJs
    public final void LJIIJJI(boolean z) {
        C388080FJm next;
        C387970FJb c387970FJb = this.LJIILIIL;
        if (c387970FJb != null) {
            C391040FUw.LIZ.getClass();
            boolean zLJI = C391040FUw.LJI();
            Iterator<C388080FJm> it2 = c387970FJb.LL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LIZ() == 5) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C388080FJm c388080FJm = next;
            if (c388080FJm != null && (!c388080FJm.LJ || c388080FJm.LJII != z)) {
                int iIndexOf = c387970FJb.LL.indexOf(c388080FJm);
                c388080FJm.LJ = true;
                c388080FJm.LJII = z;
                c388080FJm.LJIIIIZZ = zLJI;
                c387970FJb.notifyItemChanged(iIndexOf);
            }
            C391040FUw.LIZ.getClass();
            if (C391040FUw.LJI()) {
                C391040FUw.LIZIZ();
            }
        }
        TuxIconView tuxIconView = this.LJ;
        if (tuxIconView == null) {
            return;
        }
        tuxIconView.setClickable(true);
        C786410Ut5.x5(tuxIconView, 1.0f);
        if (z) {
            tuxIconView.setImageResource(R.drawable.c8b);
        } else {
            tuxIconView.setImageResource(R.drawable.c8c);
        }
    }

    @Override // X.AbstractC388140FJs
    public final void LJIIL(boolean z) {
        int i;
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LLIZLLLIL(recyclerView, i);
        }
    }

    @Override // X.AbstractC388140FJs
    public final void LJIILJJIL(boolean z) {
        C388080FJm next;
        C387970FJb c387970FJb = this.LJIILIIL;
        if (c387970FJb != null) {
            Iterator<C388080FJm> it2 = c387970FJb.LL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LIZ() == 6) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C388080FJm c388080FJm = next;
            if (c388080FJm != null) {
                int iIndexOf = c387970FJb.LL.indexOf(c388080FJm);
                c388080FJm.LJ = z;
                if (((Boolean) C0AZN.LIZ.getValue()).booleanValue()) {
                    c388080FJm.LIZIZ = R.raw.icon_text_template_round;
                } else {
                    c388080FJm.LIZIZ = R.raw.icon_text_template;
                }
                c387970FJb.notifyItemChanged(iIndexOf);
            }
        }
    }

    public final void LJIIZILJ(String str) {
        C0FF8 c0ff8 = this.LIZJ.LJFF;
        if (c0ff8 != null && c0ff8.LJIILJJIL(this.LJIIJ.LIZ, str) != 0) {
            ViewGroup viewGroup = this.LIZIZ;
            KeyboardUtils.LIZ(viewGroup.getContext(), viewGroup);
        } else {
            this.LIZJ.LJIIL.LIZ.invoke();
        }
    }

    public final void LJIJI(int i) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c419910GdJ.LIZ = R.raw.icon_lines_right_aligned;
                }
            } else {
                c419910GdJ.LIZ = R.raw.icon_lines_center_aligned;
            }
        } else {
            c419910GdJ.LIZ = R.raw.icon_lines_left_aligned;
        }
        TuxIconView tuxIconView = this.LJI;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        tuxIconView.setTuxIcon(c419910GdJ);
        LJIJJ(4, c419910GdJ, true);
    }

    public C0FJZ(ViewGroup viewGroup, C388200FJy c388200FJy, RecyclerView recyclerView) {
        TuxIconView tuxIconView;
        super(c388200FJy);
        this.LIZIZ = viewGroup;
        this.LIZJ = c388200FJy;
        this.LIZLLL = recyclerView;
        C1664680tQA<TextStickerModel> c1664680tQA = c388200FJy.LJ;
        this.LJIIJ = c1664680tQA;
        this.LJIIL = new ArrayList();
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1573));
        if (c388200FJy.LJIIIZ.LIZLLL) {
            TuxIconView tuxIconView2 = (TuxIconView) viewGroup.findViewById(R.id.yx5);
            this.LJ = tuxIconView2;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            }
        }
        this.LJFF = (TuxIconView) viewGroup.findViewById(R.id.xp1);
        this.LJI = (TuxIconView) viewGroup.findViewById(R.id.awm);
        this.LJII = viewGroup.findViewById(R.id.e8j);
        this.LJIIIIZZ = viewGroup.findViewById(R.id.e8h);
        View viewFindViewById = viewGroup.findViewById(R.id.e8i);
        if (viewFindViewById != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
            c384050F3z.LIZJ = Float.valueOf(C1919207fS.LJI());
            viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
        } else {
            viewFindViewById = null;
        }
        this.LJIIIZ = viewFindViewById;
        if (c388200FJy.LJIIIZ.LIZLLL && (tuxIconView = this.LJ) != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS140S0100000_5(this, 150));
        }
        TuxIconView tuxIconView3 = this.LJFF;
        C786410Ut5.a9(tuxIconView3 == null ? null : tuxIconView3, new ACListenerS140S0100000_5(this, 151));
        TuxIconView tuxIconView4 = this.LJI;
        C786410Ut5.a9(tuxIconView4 != null ? tuxIconView4 : null, new ACListenerS140S0100000_5(this, 152));
        View view = this.LJII;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 153), view);
        }
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0F9U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((TextStickerModel) obj).getMode());
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1135));
        c388200FJy.LJ(new AwS584S0100000_5(this, 1140), C13LE.LIZ(C0FHG.class));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0F9W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((TextStickerModel) obj).getAlign());
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1143));
        c388200FJy.LJIIJ.LIZ(new C2217381BqS() { // from class: X.0FHD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387990FJd) obj).LIZIZ;
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1108));
        c388200FJy.LJIIJJI.LIZ(new C2217381BqS() { // from class: X.0FJh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0FKT) obj).LIZ;
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1112));
    }

    public final void LJIJJ(int i, C419910GdJ c419910GdJ, boolean z) {
        C388080FJm next;
        C387970FJb c387970FJb = this.LJIILIIL;
        if (c387970FJb != null) {
            Iterator<C388080FJm> it2 = c387970FJb.LL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LIZ() == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C388080FJm c388080FJm = next;
            if (c388080FJm != null) {
                if (c388080FJm.LJ == z && c388080FJm.LIZIZ == c419910GdJ.LIZ) {
                    return;
                }
                int iIndexOf = c387970FJb.LL.indexOf(c388080FJm);
                c388080FJm.LIZIZ = c419910GdJ.LIZ;
                c388080FJm.LJ = z;
                c387970FJb.notifyItemChanged(iIndexOf);
            }
        }
    }
}
