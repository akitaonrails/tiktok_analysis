package X;

import Y.ALAdapterS5S0200000_8;
import Y.ATListenerS457S0100000_25;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0tHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659580tHw extends AbstractC1664850tQR<C1678260tm4, C1464810oDn> {
    public ViewStub LIZLLL;
    public FrameLayout LJ;
    public C416490GUt LJFF;
    public C19713012Au LJI;
    public View LJII;
    public View LJIIIIZZ;
    public EnumC1462540oA8 LJIIIZ;
    public boolean LJIIJ;
    public View LJIIL;
    public View LJIILIIL;
    public TuxIconView LJIILJJIL;
    public FrameLayout LJIILL;
    public TuxTextView LJIILLIIL;
    public SmartImageView LJIIZILJ;
    public C1295960jpS LJIJ;
    public final int LJIJJ;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(572));
    public final int LJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));

    @Override // X.AbstractC1664850tQR
    public final void LIZIZ() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI() {
        View view = this.LJII;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LJII = null;
        T t = this.LIZIZ.LIZJ;
        C1464810oDn c1464810oDn = (C1464810oDn) t;
        if ((c1464810oDn != null ? c1464810oDn.LIZIZ : null) == EnumC1462540oA8.DEFAULT) {
            C1464810oDn c1464810oDn2 = (C1464810oDn) t;
            LJIIIIZZ(c1464810oDn2 != null ? c1464810oDn2.LIZIZ : null);
        }
    }

    public C1659580tHw() {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        this.LJIJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    }

    public final void LJIIIIZZ(EnumC1462540oA8 enumC1462540oA8) {
        View view;
        if (!C0MDL.LIZ()) {
            return;
        }
        if (this.LJII != null) {
            ((C13FE) this.LIZ).setValue(Boolean.FALSE);
        } else {
            ((C13FE) this.LIZ).setValue(Boolean.TRUE);
        }
        if (this.LJII != null) {
            SmartImageView smartImageView = this.LJIIZILJ;
            if (smartImageView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_live_photo_ai;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1t);
                c419910GdJ.LIZIZ = this.LJIJJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                c419910GdJ.LIZJ = this.LJIJJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                smartImageView.setImageDrawable(c419910GdJ.LIZ(smartImageView.getContext()));
            }
            int iLIZIZ = this.LJIJI + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            SmartImageView smartImageView2 = this.LJIIZILJ;
            if (smartImageView2 != null) {
                C426750GoL.LJIIL(smartImageView2, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), 16);
            }
            LJII(enumC1462540oA8, false);
            return;
        }
        if (this.LJIIIIZZ != null) {
            SmartImageView smartImageView3 = this.LJIIZILJ;
            if (smartImageView3 != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_color_live_photo_gradient;
                int i = this.LJIJJ;
                c419910GdJ2.LIZIZ = i;
                c419910GdJ2.LIZJ = i;
                smartImageView3.setImageDrawable(c419910GdJ2.LIZ(smartImageView3.getContext()));
            }
            SmartImageView smartImageView4 = this.LJIIZILJ;
            if (smartImageView4 != null) {
                C426750GoL.LJIIL(smartImageView4, Integer.valueOf(this.LJIJI), Integer.valueOf(this.LJIJI), Integer.valueOf(this.LJIJI), Integer.valueOf(this.LJIJI), 16);
            }
            if (enumC1462540oA8 != EnumC1462540oA8.DEFAULT || (view = this.LJIIIIZZ) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, view);
            return;
        }
        SmartImageView smartImageView5 = this.LJIIZILJ;
        if (smartImageView5 != null) {
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.raw.icon_color_live_photo_ai;
            int i2 = this.LJIJJ;
            c419910GdJ3.LIZIZ = i2;
            c419910GdJ3.LIZJ = i2;
            smartImageView5.setImageDrawable(c419910GdJ3.LIZ(smartImageView5.getContext()));
        }
        SmartImageView smartImageView6 = this.LJIIZILJ;
        if (smartImageView6 != null) {
            C426750GoL.LJIIL(smartImageView6, Integer.valueOf(this.LJIJI), Integer.valueOf(this.LJIJI), Integer.valueOf(this.LJIJI), Integer.valueOf(this.LJIJI), 16);
        }
        LJII(enumC1462540oA8, true);
    }

    public final void LJIIIZ(C1659490tHn c1659490tHn) {
        int iIntValue;
        Long l;
        if (c1659490tHn == null) {
            return;
        }
        Integer num = c1659490tHn.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C416490GUt c416490GUt = this.LJFF;
        if (c416490GUt != null) {
            c416490GUt.setProgress(iIntValue);
        }
        Integer num2 = c1659490tHn.LIZ;
        if ((num2 == null || num2.intValue() != 100) && (l = c1659490tHn.LIZJ) != null) {
            long jLongValue = l.longValue();
            C19713012Au c19713012Au = this.LJI;
            if (c19713012Au != null) {
                c19713012Au.LLLLLILLIL(jLongValue);
            }
            C19713012Au c19713012Au2 = this.LJI;
            if (c19713012Au2 != null) {
                String str = c1659490tHn.LIZIZ;
                if (str == null) {
                    str = "";
                }
                c19713012Au2.setDesc(str);
                return;
            }
            return;
        }
        C19713012Au c19713012Au3 = this.LJI;
        if (c19713012Au3 == null) {
            return;
        }
        c19713012Au3.l0();
    }

    @Override // X.AbstractC1664850tQR
    public final /* bridge */ /* synthetic */ void LJ(InterfaceC1461640o8g interfaceC1461640o8g) {
    }

    @Override // X.AbstractC1664850tQR
    public final View LJFF(Context context, InterfaceC1461640o8g interfaceC1461640o8g) {
        View viewLJLLLL;
        ViewParent parent;
        FrameLayout frameLayout;
        View viewFindViewById;
        C416490GUt c416490GUt;
        ViewGroup viewGroup;
        C1464810oDn c1464810oDn = (C1464810oDn) interfaceC1461640o8g;
        C19713012Au c19713012Au = null;
        boolean z = false;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d9z, null, false);
        this.LJIILIIL = viewTd;
        this.LJIIL = viewTd;
        this.LJIIZILJ = (SmartImageView) viewTd.findViewById(R.id.y74);
        this.LJIILL = (FrameLayout) viewTd.findViewById(R.id.cw5);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.y7m);
        this.LJIILLIIL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setText("");
        }
        this.LJIJ = (C1295960jpS) viewTd.findViewById(R.id.y7d);
        this.LJIILJJIL = (TuxIconView) viewTd.findViewById(R.id.y7h);
        viewTd.findViewById(R.id.ll5);
        viewTd.findViewById(R.id.lxg);
        this.LIZLLL = (ViewStub) viewTd.findViewById(R.id.view_stub_ai_live_plugin);
        if (c1464810oDn.LIZ) {
            viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) viewTd.findViewById(R.id.aop));
            View viewFindViewById2 = viewLJLLLL.findViewById(R.id.aoq);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            viewFindViewById2.setBackground(c384050F3z.LIZ(viewLJLLLL.getContext()));
            if (C0C09.LIZ()) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    C786410Ut5.W5(viewFindViewById2, layoutParams);
                    TuxTextView tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.aot);
                    if (tuxTextView2 != null) {
                        tuxTextView2.setTypeface(C1697580uHE.LIZIZ(0.0f, 400, 10.0f, 1.0f, null, 0.0f, 0, null, 241));
                        tuxTextView2.LJJJJI(10.0f);
                        tuxTextView2.setText(C0MED.LIZ(C0MEB.EDITING_PAGE_TOOLBAR_NEW_MODEL, new Object[0]));
                        C786410Ut5.LLLLZLL(tuxTextView2, 0);
                    }
                    View viewFindViewById3 = viewTd.findViewById(R.id.aor);
                    if (viewFindViewById3 != null) {
                        C786410Ut5.LJLLLLLL(8, viewFindViewById3);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        } else {
            viewLJLLLL = null;
        }
        this.LJII = viewLJLLLL;
        ViewStub viewStub = this.LIZLLL;
        if (viewStub != null) {
            parent = viewStub.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof ViewGroup) {
            ViewStub viewStub2 = this.LIZLLL;
            if (viewStub2 != null) {
                C786410Ut5.LJLLLL(viewStub2);
            }
            View view = this.LJIIL;
            if (view != null) {
                frameLayout = (FrameLayout) view.findViewById(R.id.aov);
            } else {
                frameLayout = null;
            }
            this.LJ = frameLayout;
            View view2 = this.LJIIL;
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.aoo);
            } else {
                viewFindViewById = null;
            }
            this.LJIIIIZZ = viewFindViewById;
            if (!C0MDL.LIZ()) {
                LJII(c1464810oDn.LIZIZ, false);
                this.LJIIIIZZ = null;
            }
            View view3 = this.LJIIL;
            if (view3 != null) {
                c416490GUt = (C416490GUt) view3.findViewById(R.id.s_4);
            } else {
                c416490GUt = null;
            }
            this.LJFF = c416490GUt;
            if (this.LJI == null) {
                SmartImageView smartImageView = this.LJIIZILJ;
                if (smartImageView != null) {
                    c19713012Au = new C19713012Au(smartImageView, this.LJ, smartImageView.getContext());
                }
                this.LJI = c19713012Au;
            }
            C19713012Au c19713012Au2 = this.LJI;
            if (c19713012Au2 == null || c19713012Au2.getParent() == null) {
                if ((viewTd instanceof ViewGroup) && (viewGroup = (ViewGroup) viewTd) != null) {
                    viewGroup.addView(this.LJI, 0);
                }
                viewTd.setOnTouchListener(new ATListenerS457S0100000_25(this, 8));
            }
        }
        VideoPublishEditModel videoPublishEditModel = c1464810oDn.LIZLLL;
        if (this.LJII == null) {
            SmartImageView smartImageView2 = this.LJIIZILJ;
            C1295960jpS c1295960jpS = this.LJIJ;
            if (C0MDL.LIZLLL(videoPublishEditModel) && c1295960jpS != null) {
                c1295960jpS.setAnimation(R.raw.tux_lottie_common_creation_ailive_icon);
                c1295960jpS.setRepeatCount(2);
                c1295960jpS.setRepeatMode(1);
                c1295960jpS.addAnimatorListener(new ALAdapterS5S0200000_8(c1295960jpS, smartImageView2, 5));
                c1295960jpS.playAnimation();
            }
        }
        if (c1464810oDn.LIZIZ == EnumC1462540oA8.PROGRESS) {
            z = true;
        }
        this.LJIIJ = z;
        LJIIIZ(c1464810oDn.LJ);
        LJIIJ(c1464810oDn.LIZIZ, c1464810oDn.LIZJ, c1464810oDn.LJ, true);
        LIZLLL(new C2217381BqS() { // from class: X.0tHx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1464810oDn) obj).LJIIIIZZ);
            }
        }, new AwS639S0100000_25(this, 152));
        LIZLLL(new C2217381BqS() { // from class: X.0tHv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1464810oDn) obj).LIZIZ;
            }
        }, new AwS639S0100000_25(this, 155));
        LIZLLL(new C2217381BqS() { // from class: X.0tHu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1464810oDn) obj).LJ;
            }
        }, new AwS639S0100000_25(this, 156));
        LIZLLL(new C2217381BqS() { // from class: X.0tHs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1464810oDn) obj).LJI);
            }
        }, new AwS639S0100000_25(this, 157));
        LIZLLL(new C2217381BqS() { // from class: X.0tHy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1464810oDn) obj).LJFF);
            }
        }, new AwS639S0100000_25(this, 158));
        LIZLLL(new C2217381BqS() { // from class: X.0oDo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1464810oDn) obj).LJII;
            }
        }, new AwS639S0100000_25(this, 153));
        LIZLLL(new C2217381BqS() { // from class: X.0tHt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1464810oDn) obj).LJIIIZ;
            }
        }, new AwS639S0100000_25(this, 154));
        return viewTd;
    }

    public final void LJII(EnumC1462540oA8 enumC1462540oA8, boolean z) {
        View view;
        if (z) {
            if (enumC1462540oA8 == EnumC1462540oA8.DEFAULT && this.LJII == null && (view = this.LJIIIIZZ) != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        View view2 = this.LJIIIIZZ;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(X.EnumC1462540oA8 r8, X.C1464760oDi r9, X.C1659490tHn r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1659580tHw.LJIIJ(X.0oA8, X.0oDi, X.0tHn, boolean):void");
    }
}
