package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0soD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1641150soD extends C1641170soF {
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public boolean LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public Integer LJJIJIL;
    public boolean LJJIJL;

    /* JADX WARN: Type inference failed for: r16v0, types: [X.0tNE] */
    public final C1662860tNE LIZ() {
        final Context context = this.LIZ;
        final boolean z = this.LIZIZ;
        final int i = this.LIZJ;
        final int i2 = this.LJ;
        final int i3 = this.LJFF;
        final int i4 = this.LJI;
        final int i5 = this.LJII;
        final int i6 = this.LJIIIIZZ;
        final boolean z2 = this.LJIIIZ;
        final int i7 = this.LJJIIJ;
        final int i8 = this.LJJIIJZLJL;
        final int i9 = this.LJIIJ;
        final int i10 = this.LJIIJJI;
        final int i11 = this.LJIIL;
        final int i12 = this.LJIILIIL;
        final boolean z3 = this.LJIILLIIL;
        final boolean z4 = this.LJIIZILJ;
        final int i13 = this.LJIJI;
        final int i14 = this.LJIJJLI;
        final int i15 = this.LJIL;
        int i16 = this.LIZLLL;
        if (i16 == -1) {
            i16 = i;
        }
        final int i17 = this.LJJIIZ;
        final int i18 = this.LJJIIZI;
        final boolean z5 = this.LJIJ;
        final boolean z6 = this.LJJ;
        final boolean z7 = this.LJJI;
        final boolean z8 = this.LJJIJ;
        final boolean z9 = this.LJJII;
        final boolean z10 = this.LJJIFFI;
        final int i19 = this.LJJIJIIJI;
        final int i20 = this.LJJIJIIJIL;
        final Integer num = this.LJJIJIL;
        final int i21 = this.LJIJJ;
        final boolean z11 = this.LJJIJL;
        final int i22 = i16;
        return new C1662850tND(context, z, i, i2, i3, i4, i5, i6, z2, i7, i8, i9, i10, i11, i12, z3, z4, i13, i14, i15, i22, i17, i18, z5, z6, z7, z8, z9, z10, i19, i20, num, i21, z11) { // from class: X.0tNE
            public final boolean LLLLL;

            @Override // X.C1662850tND, X.C1662870tNF
            public final View LIZLLL(Context context2) {
                FrameLayout.LayoutParams layoutParams;
                int imgWidth;
                int imgHeight;
                FrameLayout.LayoutParams layoutParams2;
                if (!getEnableSimplifyLayout()) {
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.fv0, frameLayout, false);
                    C786410Ut5.W5(viewTd, new FrameLayout.LayoutParams(-1, -1));
                    frameLayout.addView(viewTd);
                    C1324800kZy c1324800kZy = (C1324800kZy) viewTd.findViewById(R.id.gx9);
                    ViewGroup.LayoutParams layoutParams3 = c1324800kZy.getLayoutParams();
                    if (this.LLJL) {
                        imgWidth = getImgLayoutWidth();
                    } else {
                        imgWidth = getImgWidth();
                    }
                    if (this.LLJL) {
                        imgHeight = getImgLayoutHeight();
                    } else {
                        imgHeight = getImgHeight();
                    }
                    layoutParams3.width = imgWidth;
                    layoutParams3.height = imgHeight;
                    C786410Ut5.o7(c1324800kZy, layoutParams3);
                    if (this.LLJL) {
                        layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    } else {
                        layoutParams2 = new FrameLayout.LayoutParams(getImgWidth(), getImgHeight());
                    }
                    C786410Ut5.a6(frameLayout, layoutParams2);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new C1698020uHw(this, 2));
                    return frameLayout;
                }
                View viewLJIIJJI = LJIIJJI(context2);
                if (getRoundRadiusForIcon() > 0) {
                    viewLJIIJJI.setOutlineProvider(new C1698020uHw(this, 1));
                    viewLJIIJJI.setClipToOutline(true);
                }
                if (getEnableExpandBorder()) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                } else {
                    layoutParams = new FrameLayout.LayoutParams(getImgWidth(), getImgHeight());
                }
                C786410Ut5.W5(viewLJIIJJI, layoutParams);
                return viewLJIIJJI;
            }

            @Override // X.C1662850tND, X.C1662870tNF
            public final View LJFF(Context context2) {
                Typeface typefaceLIZ;
                AnonymousClass1280 anonymousClass1280 = new AnonymousClass1280(context2);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(anonymousClass1280);
                anonymousClass1280.setLayoutParams(layoutParams);
                anonymousClass1280.setGravity(1);
                anonymousClass1280.setMaxHeight((int) C11VU.LIZ(14.0f));
                anonymousClass1280.setPadding((int) C11VU.LIZ(3.0f), 0, (int) C11VU.LIZ(3.0f), 0);
                anonymousClass1280.setTextAlignment(5);
                anonymousClass1280.setMaxWidth(getImgWidth());
                C19736612Jw c19736612Jw = C19736612Jw.LIZ;
                c19736612Jw.getClass();
                InterfaceC1609810rzf interfaceC1609810rzf = (InterfaceC1609810rzf) C19736612Jw.LIZJ.getValue(c19736612Jw, C19736612Jw.LIZIZ[0]);
                if (interfaceC1609810rzf != null && (typefaceLIZ = interfaceC1609810rzf.LIZ(71)) != null) {
                    anonymousClass1280.setTypeface(typefaceLIZ);
                }
                anonymousClass1280.setSingleLine();
                anonymousClass1280.setEllipsize(null);
                anonymousClass1280.setHorizontalFadingEdgeEnabled(true);
                anonymousClass1280.setFadingEdgeLength(8);
                return anonymousClass1280;
            }

            @Override // X.C1662850tND
            public final void LJIIJ(FrameLayout frameLayout) {
                if (!this.LLLLL) {
                    super.LJIIJ(frameLayout);
                    return;
                }
                C1324800kZy c1324800kZy = new C1324800kZy(getContext());
                c1324800kZy.setId(R.id.gx9);
                c1324800kZy.setScaleType(ImageView.ScaleType.CENTER_CROP);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                C786410Ut5.o7(c1324800kZy, layoutParams);
                addView(c1324800kZy);
            }

            {
                this.LLLLL = z11;
                LJIILL();
            }
        };
    }

    public C1641150soD(Context context) {
        super(context);
        this.LJJIIJ = 12;
        this.LJJIIJZLJL = 20;
        this.LJJIIZ = R.drawable.a_y;
        this.LJJIIZI = R.drawable.aa0;
        this.LJJIJIIJI = 58;
        this.LJJIJIIJIL = 58;
    }
}
