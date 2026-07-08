package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.als.EditCaptionFontViewModel;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.124t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class ViewOnClickListenerC196973124t extends Scene implements View.OnClickListener, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public final C1DRG LLJI;
    public final InterfaceC387610FHr LLJIJIL;
    public View LLJILJIL;
    public TuxIconView LLJILJILJ;
    public TuxIconView LLJILLL;
    public C387890FIt LLJJ;
    public C0FRI LLJJI;
    public TuxNavBar LLJJIII;
    public AkS95S0100000_29 LLJJJJ;
    public TextStickerData LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C1664750tQH LLJLILLLLZIIL;
    public InterfaceC524950KiL LLJLL;
    public String LLJLLL;
    public String LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public String LLLF;
    public String LLLFF;
    public int LLJJIJI = 1;
    public int LLJJIJIIJIL = -1;
    public int LLJJIJIL = 2;
    public int LLJJJ = -1;
    public String LLJJJIL = "default";
    public final ArrayList<TextStickerData> LLJJJJJIL = new ArrayList<>();
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1107));
    public final C196975124v LLJLLIL = new InterfaceC362610EJn() { // from class: X.124v
        @Override // X.InterfaceC362610EJn
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            ViewOnClickListenerC196973124t viewOnClickListenerC196973124t = this.LL;
            viewOnClickListenerC196973124t.LLJIJIL.LJI(0, viewOnClickListenerC196973124t.LLJJL);
            viewOnClickListenerC196973124t.LLLII().za0(viewOnClickListenerC196973124t.LLJJJJJIL);
            viewOnClickListenerC196973124t.LLLII().hide();
            return true;
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ViewOnClickListenerC196973124t.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final EditCaptionFontViewModel LLLII() {
        return (EditCaptionFontViewModel) this.LLJLIL.getValue();
    }

    public final String LLLIIIIL() {
        int i = this.LLJJIJIL;
        return i != 1 ? i != 3 ? getString(2131823164) : getString(2131823168) : getString(2131823166);
    }

    public final void LLLIL() {
        TuxIconView tuxIconView;
        int i = this.LLJJIJIL;
        if (i == 1) {
            TuxIconView tuxIconView2 = this.LLJILLL;
            tuxIconView = tuxIconView2 != null ? tuxIconView2 : null;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_lines_left_aligned;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ);
            return;
        }
        if (i == 2) {
            TuxIconView tuxIconView3 = this.LLJILLL;
            tuxIconView = tuxIconView3 != null ? tuxIconView3 : null;
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_lines_center_aligned;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ2);
            return;
        }
        if (i == 3) {
            TuxIconView tuxIconView4 = this.LLJILLL;
            tuxIconView = tuxIconView4 != null ? tuxIconView4 : null;
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.raw.icon_lines_right_aligned;
            c419910GdJ3.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ3);
        }
    }

    public final void LLLILZLLLI() {
        TuxIconView tuxIconView;
        int i = this.LLJJIJI;
        if (i == 1) {
            TuxIconView tuxIconView2 = this.LLJILJILJ;
            tuxIconView = tuxIconView2 != null ? tuxIconView2 : null;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_text_stroke;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ);
            return;
        }
        if (i == 2) {
            TuxIconView tuxIconView3 = this.LLJILJILJ;
            tuxIconView = tuxIconView3 != null ? tuxIconView3 : null;
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_text_background;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ2);
            return;
        }
        if (i == 3) {
            TuxIconView tuxIconView4 = this.LLJILJILJ;
            tuxIconView = tuxIconView4 != null ? tuxIconView4 : null;
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.raw.icon_color_text_transparent;
            tuxIconView.setTuxIcon(c419910GdJ3);
            return;
        }
        if (i == 4) {
            TuxIconView tuxIconView5 = this.LLJILJILJ;
            tuxIconView = tuxIconView5 != null ? tuxIconView5 : null;
            C419910GdJ c419910GdJ4 = new C419910GdJ();
            c419910GdJ4.LIZ = R.raw.icon_text_outline;
            c419910GdJ4.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ4);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        InterfaceC524950KiL interfaceC524950KiL = this.LLJLL;
        if (interfaceC524950KiL == null) {
            interfaceC524950KiL = null;
        }
        interfaceC524950KiL.b8(this.LLJLLIL);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        Scene scene = this.mParentScene;
        if (scene instanceof EditCaptionScene) {
            this.LLJJJJJIL.clear();
            Iterator<TextStickerData> it2 = C363730ENv.LJIIIIZZ(((EditCaptionScene) scene).LLLIIIL).iterator();
            while (it2.hasNext()) {
                this.LLJJJJJIL.add(it2.next().m187clone());
            }
        }
        this.LLJJJJLIIL = (TextStickerData) getScope().LJ("currentCaption");
        this.LLJJL = (String) getScope().LJ("currentLanguageCode");
        this.LLJJLIIIJLLLLLLLZ = (String) getScope().LJ("currentEnterWay");
        InterfaceC524950KiL interfaceC524950KiL = this.LLJLL;
        if (interfaceC524950KiL == null) {
            interfaceC524950KiL = null;
        }
        interfaceC524950KiL.kF(this.LLJLLIL);
        if (this.LLJL) {
            return;
        }
        C387890FIt c387890FIt = this.LLJJ;
        if (c387890FIt == null) {
            c387890FIt = null;
        }
        c387890FIt.LIZLLL(LLLIILIL(C0FI2.LJIJJ().LJIJ()));
        C0FI2.LJIJJ().LJIIIIZZ = new C0FIB() { // from class: X.124y
            @Override // X.C0FIB
            public final void accept(Object obj) {
                C1524805y2.LIZIZ(0L, new AwS430S0200000_29(this.LIZ, (ViewOnClickListenerC196973124t) obj, (List<TextFontStyleData>) 129));
            }
        };
        TextStickerData textStickerData = this.LLJJJJLIIL;
        if (textStickerData != null) {
            if (C13LQ.LJIILJJIL(textStickerData.getColor(), C0F9I.LJ())) {
                C0FRI c0fri = this.LLJJI;
                if (c0fri == null) {
                    c0fri = null;
                }
                c0fri.LIZJ(C13LQ.LJJLJ(C0F9I.LJ()));
            } else {
                C0FRI c0fri2 = this.LLJJI;
                if (c0fri2 == null) {
                    c0fri2 = null;
                }
                c0fri2.LIZ(textStickerData.getColor());
            }
        }
        TextStickerData textStickerData2 = this.LLJJJJLIIL;
        if (textStickerData2 != null) {
            this.LLJJIJI = textStickerData2.getBgMode();
            this.LLJJIJIL = textStickerData2.getAlign();
            this.LLJJJ = textStickerData2.getColor();
            LLLILZLLLI();
            LLLIL();
            C0FRI c0fri3 = this.LLJJI;
            if (c0fri3 == null) {
                c0fri3 = null;
            }
            c0fri3.setDefault(this.LLJJJ);
            C0FI2.LJIJJ().LJJJIL(1, textStickerData2.getFontType());
            C387890FIt c387890FIt2 = this.LLJJ;
            if (c387890FIt2 == null) {
                c387890FIt2 = null;
            }
            c387890FIt2.LJII(false);
            LLLILZ(C0FI2.LJIILIIL(1));
        }
        this.LLJL = true;
        this.LLJLLL = getString(2131823171);
        this.LLJZ = getString(2131823165);
        this.LLJZIJLIL = getString(2131823167);
        this.LLL = getString(2131823163);
        this.LLLF = getString(2131823169);
        this.LLLFF = getString(2131823170);
        getString(2131823166);
        getString(2131823168);
        getString(2131823164);
        TuxIconView tuxIconView = this.LLJILJILJ;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        final int i = 0;
        q0.LJIJ(tuxIconView, new C20094213jo(this, i) { // from class: X.12Z1
            public final int $t;
            public Object l0;

            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                switch (this.$t) {
                    case 0:
                        onInitializeAccessibilityNodeInfo$0(this, view, accessibilityNodeInfoCompat);
                        break;
                    case 1:
                        onInitializeAccessibilityNodeInfo$1(this, view, accessibilityNodeInfoCompat);
                        break;
                    default:
                        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                        break;
                }
            }

            {
                this.$t = i;
                this.l0 = this;
            }

            public static final void onInitializeAccessibilityNodeInfo$0(C12Z1 c12z1, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(((ViewOnClickListenerC196973124t) c12z1.l0).LLJLLL);
            }

            public static final void onInitializeAccessibilityNodeInfo$1(C12Z1 c12z1, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(((ViewOnClickListenerC196973124t) c12z1.l0).LLLFF);
            }
        });
        TuxIconView tuxIconView2 = this.LLJILLL;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        final int i2 = 1;
        q0.LJIJ(tuxIconView2, new C20094213jo(this, i2) { // from class: X.12Z1
            public final int $t;
            public Object l0;

            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                switch (this.$t) {
                    case 0:
                        onInitializeAccessibilityNodeInfo$0(this, view, accessibilityNodeInfoCompat);
                        break;
                    case 1:
                        onInitializeAccessibilityNodeInfo$1(this, view, accessibilityNodeInfoCompat);
                        break;
                    default:
                        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                        break;
                }
            }

            {
                this.$t = i2;
                this.l0 = this;
            }

            public static final void onInitializeAccessibilityNodeInfo$0(C12Z1 c12z1, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(((ViewOnClickListenerC196973124t) c12z1.l0).LLJLLL);
            }

            public static final void onInitializeAccessibilityNodeInfo$1(C12Z1 c12z1, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(((ViewOnClickListenerC196973124t) c12z1.l0).LLLFF);
            }
        });
        TuxIconView tuxIconView3 = this.LLJILJILJ;
        if (tuxIconView3 == null) {
            tuxIconView3 = null;
        }
        int i3 = this.LLJJIJI;
        q0.LJJIFFI(tuxIconView3, i3 != 1 ? i3 != 2 ? i3 != 4 ? this.LLLF : this.LLJZIJLIL : this.LLL : this.LLJZ);
        TuxIconView tuxIconView4 = this.LLJILLL;
        q0.LJJIFFI(tuxIconView4 != null ? tuxIconView4 : null, LLLIIIIL());
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<TextFontStyleData> LLLIILIL(List<? extends TextFontStyleData> list) {
        String fontResId;
        String resourceId;
        TextStickerData textStickerData = this.LLJJJJLIIL;
        String fontType = null;
        if (textStickerData != null) {
            fontResId = textStickerData.getFontResId();
        } else {
            fontResId = null;
        }
        if (!list.isEmpty() && fontResId != null && fontResId.length() != 0) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Effect effect = ((TextFontStyleData) next).LJ;
                if (effect != null) {
                    resourceId = effect.getResourceId();
                } else {
                    resourceId = null;
                }
                if (Intrinsics.LJFF(resourceId, fontResId)) {
                    if (next != null) {
                        return list;
                    }
                }
            }
            ArrayList arrayList = new ArrayList(list);
            TextStickerData textStickerData2 = this.LLJJJJLIIL;
            if (textStickerData2 != null) {
                fontType = textStickerData2.getFontType();
            }
            TextFontStyleData textFontStyleDataLJIILL = C0FI2.LJIILL(fontType);
            if (textFontStyleDataLJIILL != null) {
                ListProtector.add(arrayList, 0, textFontStyleDataLJIILL);
            }
            return arrayList;
        }
        return list;
    }

    public final void LLLILZ(TextFontStyleData textFontStyleData) {
        boolean z;
        if (textFontStyleData == null) {
            return;
        }
        int i = 1;
        if (textFontStyleData.enableBgColor == 1) {
            z = true;
        } else {
            z = false;
        }
        TuxIconView tuxIconView = null;
        if (!z) {
            if (this.LLJJIJIIJIL == -1 || this.LLJJIJI != 1) {
                this.LLJJIJIIJIL = this.LLJJIJI;
                this.LLJJIJI = 1;
            }
            if (textFontStyleData.LIZ()) {
                int i2 = this.LLJJIJIIJIL;
                if (i2 != 5) {
                    i = i2;
                }
                this.LLJJIJIIJIL = i;
                this.LLJJIJI = 5;
            }
            TuxIconView tuxIconView2 = this.LLJILJILJ;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            C786410Ut5.x5(tuxIconView2, 0.34f);
            TuxIconView tuxIconView3 = this.LLJILJILJ;
            if (tuxIconView3 == null) {
                tuxIconView3 = null;
            }
            tuxIconView3.setClickable(false);
            TuxIconView tuxIconView4 = this.LLJILJILJ;
            if (tuxIconView4 != null) {
                tuxIconView = tuxIconView4;
            }
            tuxIconView.setTag(Boolean.FALSE);
            return;
        }
        int i3 = this.LLJJIJIIJIL;
        if (i3 != -1) {
            this.LLJJIJI = i3;
        }
        TuxIconView tuxIconView5 = this.LLJILJILJ;
        if (tuxIconView5 == null) {
            tuxIconView5 = null;
        }
        C786410Ut5.x5(tuxIconView5, 1.0f);
        TuxIconView tuxIconView6 = this.LLJILJILJ;
        if (tuxIconView6 == null) {
            tuxIconView6 = null;
        }
        tuxIconView6.setClickable(true);
        TuxIconView tuxIconView7 = this.LLJILJILJ;
        if (tuxIconView7 != null) {
            tuxIconView = tuxIconView7;
        }
        tuxIconView.setTag(Boolean.TRUE);
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        View view;
        super.onActivityCreated(bundle);
        this.mView.bringToFront();
        Object parent = this.mView.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            view.bringToFront();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            com.bytedance.tux.icon.TuxIconView r0 = r14.LLJILJILJ
            r11 = 0
            if (r0 != 0) goto L6
            r0 = r11
        L6:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r15, r0)
            r2 = 2
            r1 = 1
            r3 = 3
            if (r0 == 0) goto L6c
            X.122r r0 = X.C196909122h.LIZIZ()
            X.0FLi r0 = r0.LIZIZ
            boolean r0 = r0.LIZ
            r4 = 4
            if (r0 == 0) goto L63
            int r0 = r14.LLJJIJI
            if (r0 == r1) goto L61
            if (r0 == r2) goto L23
            if (r0 == r4) goto L6a
        L22:
            r3 = 1
        L23:
            r14.LLJJIJI = r3
            r14.LLLILZLLLI()
            int r0 = r14.LLJJIJI
            r14.LLJJIJIIJIL = r0
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.als.EditCaptionFontViewModel r3 = r14.LLLII()
            int r0 = r14.LLJJIJI
            r3.M8(r0)
            X.0FHr r5 = r14.LLJIJIL
            int r7 = r14.LLJJIJI
            java.lang.String r6 = "caption"
            java.lang.String r9 = r14.LLJJL
            java.lang.String r10 = r14.LLJJLIIIJLLLLLLLZ
            r8 = 0
            r12 = r11
            r13 = r11
            r5.LJ(r6, r7, r8, r9, r10, r11, r12, r13)
            com.bytedance.tux.icon.TuxIconView r0 = r14.LLJILJILJ
            if (r0 == 0) goto L4a
            r11 = r0
        L4a:
            int r0 = r14.LLJJIJI
            if (r0 == r1) goto L5e
            if (r0 == r2) goto L5b
            if (r0 == r4) goto L58
            java.lang.String r0 = r14.LLLF
        L54:
            u4.q0.LJJIFFI(r11, r0)
        L57:
            return
        L58:
            java.lang.String r0 = r14.LLJZIJLIL
            goto L54
        L5b:
            java.lang.String r0 = r14.LLL
            goto L54
        L5e:
            java.lang.String r0 = r14.LLJZ
            goto L54
        L61:
            r3 = 4
            goto L23
        L63:
            int r0 = r14.LLJJIJI
            if (r0 == r1) goto L6a
            if (r0 == r2) goto L23
            goto L22
        L6a:
            r3 = 2
            goto L23
        L6c:
            com.bytedance.tux.icon.TuxIconView r0 = r14.LLJILLL
            if (r0 != 0) goto L71
            r0 = r11
        L71:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r15, r0)
            if (r0 == 0) goto L57
            int r0 = r14.LLJJIJIL
            if (r0 == r1) goto Laf
            if (r0 == r2) goto Lac
            if (r0 != r3) goto L81
            r14.LLJJIJIL = r2
        L81:
            r14.LLLIL()
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.als.EditCaptionFontViewModel r1 = r14.LLLII()
            int r0 = r14.LLJJIJIL
            r1.Xf(r0)
            X.0FHr r1 = r14.LLJIJIL
            int r0 = r14.LLJJIJIL
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r2 = 0
            java.lang.String r4 = "caption"
            java.lang.String r5 = r14.LLJJL
            java.lang.String r6 = r14.LLJJLIIIJLLLLLLLZ
            r1.LJII(r2, r3, r4, r5, r6)
            com.bytedance.tux.icon.TuxIconView r0 = r14.LLJILLL
            if (r0 == 0) goto La4
            r11 = r0
        La4:
            java.lang.String r0 = r14.LLLIIIIL()
            u4.q0.LJJIFFI(r11, r0)
            return
        Lac:
            r14.LLJJIJIL = r1
            goto L81
        Laf:
            r14.LLJJIJIL = r3
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC196973124t.onClick(android.view.View):void");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.124v] */
    public ViewOnClickListenerC196973124t(C1DRG c1drg, InterfaceC387610FHr interfaceC387610FHr) {
        this.LLJI = c1drg;
        this.LLJIJIL = interfaceC387610FHr;
        this.LLJLILLLLZIIL = C1664770tQJ.LIZ(c1drg, AbstractC214814194y.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        super.onViewCreated(view, bundle);
        View view2 = this.LLJILJIL;
        C387890FIt c387890FIt = null;
        if (view2 == null) {
            view2 = null;
        }
        this.LLJILJILJ = (TuxIconView) view2.findViewById(R.id.lwa);
        View view3 = this.LLJILJIL;
        if (view3 == null) {
            view3 = null;
        }
        this.LLJILLL = (TuxIconView) view3.findViewById(R.id.l89);
        View view4 = this.LLJILJIL;
        if (view4 == null) {
            view4 = null;
        }
        this.LLJJI = (C0FRI) view4.findViewById(R.id.e8b);
        View view5 = this.LLJILJIL;
        if (view5 == null) {
            view5 = null;
        }
        ViewGroup viewGroup = (ViewGroup) view5.findViewById(R.id.ih4);
        C387890FIt c387890FItLIZIZ = C387890FIt.LIZIZ(1, getSceneContext());
        this.LLJJ = c387890FItLIZIZ;
        c387890FItLIZIZ.LIZLLL(LLLIILIL(C0FI2.LJIJJ().LJIJ()));
        C387890FIt c387890FIt2 = this.LLJJ;
        if (c387890FIt2 == null) {
            c387890FIt2 = null;
        }
        viewGroup.addView(c387890FIt2);
        View view6 = this.LLJILJIL;
        if (view6 == null) {
            view6 = null;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view6.findViewById(R.id.bsm);
        this.LLJJIII = tuxNavBar;
        if (tuxNavBar == null) {
            tuxNavBar = null;
        }
        tuxNavBar.setNavBackground(255);
        TuxNavBar tuxNavBar2 = this.LLJJIII;
        if (tuxNavBar2 == null) {
            tuxNavBar2 = null;
        }
        C0OM1 c0om1 = new C0OM1();
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
        C1250300ido c1250300ido = new C1250300ido();
        Activity activity = this.mActivity;
        if (activity == null || (string = activity.getString(2131833383)) == null) {
            string = "Cancel";
        }
        c1250300ido.LIZJ = string;
        c1250300ido.LJ = true;
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LIZ(new AwS573S0100000_29(this, 1108));
        abstractC1250290idnArr[0] = c1250300ido;
        c0om1.LJ(abstractC1250290idnArr);
        AbstractC1250290idn[] abstractC1250290idnArr2 = new AbstractC1250290idn[1];
        C1250300ido c1250300ido2 = new C1250300ido();
        Activity activity2 = this.mActivity;
        if (activity2 == null || (string2 = activity2.getString(2131833422)) == null) {
            string2 = "Save";
        }
        c1250300ido2.LIZJ = string2;
        c1250300ido2.LJ = true;
        c1250300ido2.LIZLLL = EnumC638250P1r.PRIMARY;
        c1250300ido2.LIZ(new AwS573S0100000_29(this, 1109));
        abstractC1250290idnArr2[0] = c1250300ido2;
        c0om1.LIZIZ(abstractC1250290idnArr2);
        tuxNavBar2.setNavActions(c0om1);
        AkS95S0100000_29 akS95S0100000_29 = new AkS95S0100000_29(this, 98);
        this.LLJJJJ = akS95S0100000_29;
        TuxIconView tuxIconView = this.LLJILJILJ;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.a9(tuxIconView, akS95S0100000_29);
        TuxIconView tuxIconView2 = this.LLJILLL;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        AkS95S0100000_29 akS95S0100000_292 = this.LLJJJJ;
        if (akS95S0100000_292 == null) {
            akS95S0100000_292 = null;
        }
        C786410Ut5.a9(tuxIconView2, akS95S0100000_292);
        C0FRI c0fri = this.LLJJI;
        if (c0fri == null) {
            c0fri = null;
        }
        c0fri.setColorChangeListener(new C0FRK() { // from class: X.124w
            @Override // X.C0FRK
            public final void LIZ(int i) {
                ViewOnClickListenerC196973124t viewOnClickListenerC196973124t = this.LIZ;
                if (viewOnClickListenerC196973124t.LLJJJ == i) {
                    return;
                }
                viewOnClickListenerC196973124t.LLJJJ = i;
                viewOnClickListenerC196973124t.LLLII().z6(i);
                ViewOnClickListenerC196973124t viewOnClickListenerC196973124t2 = this.LIZ;
                viewOnClickListenerC196973124t2.LLJIJIL.LJFF("caption", i, viewOnClickListenerC196973124t2.LLJJL, viewOnClickListenerC196973124t2.LLJJLIIIJLLLLLLLZ, 0, null);
            }
        });
        C387890FIt c387890FIt3 = this.LLJJ;
        if (c387890FIt3 != null) {
            c387890FIt = c387890FIt3;
        }
        c387890FIt.setClickFontStyleListener(new InterfaceC387930FIx() { // from class: X.124u
            @Override // X.InterfaceC387930FIx
            public final void LIZ(TextFontStyleData textFontStyleData) {
                if (textFontStyleData == null) {
                    return;
                }
                this.LIZ.LLLILZ(textFontStyleData);
                C0FI2 c0fi2LJIJJ = C0FI2.LJIJJ();
                String str = textFontStyleData.fileName;
                this.LIZ.getClass();
                c0fi2LJIJJ.LJJJIL(1, str);
                ViewOnClickListenerC196973124t viewOnClickListenerC196973124t = this.LIZ;
                viewOnClickListenerC196973124t.LLJJJIL = textFontStyleData.fileName;
                viewOnClickListenerC196973124t.LLLII().FL(textFontStyleData.fileName, this.LIZ.LLJJIJI);
                ViewOnClickListenerC196973124t viewOnClickListenerC196973124t2 = this.LIZ;
                viewOnClickListenerC196973124t2.LLJIJIL.LJIIIIZZ(textFontStyleData, 0, "caption", viewOnClickListenerC196973124t2.LLJJL, false, viewOnClickListenerC196973124t2.LLJJLIIIJLLLLLLLZ, null, "trending");
            }
        });
        this.LLJLL = (InterfaceC524950KiL) ((AbstractC214814194y) this.LLJLILLLLZIIL.getValue(this, LLLFFI[0]));
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.emz, viewGroup, false);
        this.LLJILJIL = viewTd;
        if (viewTd == null) {
            return null;
        }
        return viewTd;
    }
}
