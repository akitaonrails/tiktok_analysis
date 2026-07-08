package X;

import Y.ACListenerS152S0100000_17;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.android.livesdk.model.message.AISummaryMessage;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0f1O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111160f1O extends AbstractC1110760f0k<C160900jX> {
    public final boolean LLILZ;
    public final SimpleLiveTextView LLILZIL;
    public final C421320Gfa LLILZLL;
    public final C16F5 LLIZ;
    public final C21627319kV LLIZLLLIL;

    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1111160f1O.P5(java.lang.String):void");
    }

    public final void R5(C160900jX c160900jX) {
        float fLIZIZ;
        float fLIZIZ2;
        int i;
        int i2;
        C421320Gfa c421320Gfa = this.LLILZLL;
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (this.LLILZ) {
            fLIZIZ = C418440Gaw.LIZIZ(20);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(16);
        }
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(fLIZIZ);
        if (this.LLILZ) {
            fLIZIZ2 = C418440Gaw.LIZIZ(20);
        } else {
            fLIZIZ2 = C418440Gaw.LIZIZ(16);
        }
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(fLIZIZ2);
        c160900jX.getClass();
        c419910GdJ.LIZ = R.raw.icon_ai_library;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ey7);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LLILZLL.getContext());
        C384050F3z c384050F3z = new C384050F3z();
        if (this.LLILZ) {
            i = 32;
        } else {
            i = 28;
        }
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
        if (this.LLILZ) {
            i2 = 32;
        } else {
            i2 = 28;
        }
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.exq);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        c421320Gfa.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.LLILZLL.getContext())));
    }

    @Override // X.AbstractC1111020f1A
    public final void L5(final C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q) {
        C160900jX c160900jX = (C160900jX) interfaceC1112060f2q;
        this.LLIZ.setText(C154600iW.LIZ(((AISummaryMessage) c160900jX.LJIL).title, c160900jX));
        this.LLILZIL.setText(this.LLIZLLLIL.LJ(c160900jX.getContent(), new InterfaceC21543319St() { // from class: X.0f1l
            @Override // X.InterfaceC21543319St
            public final boolean LIZ(int i, CharSequence charSequence) {
                return c1109770ez9.LIZJ;
            }
        }));
        ImageModel imageModelLJLLLLLL = c160900jX.LJLLLLLL();
        if (imageModelLJLLLLLL != null) {
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(imageModelLJLLLLLL.getUrls());
            c1324610kZfLIZJ.LJI = -1;
            c1324610kZfLIZJ.LJII = -1;
            c1324610kZfLIZJ.LJIIL = new C1151770g4t(this, c160900jX, 3);
            c1324610kZfLIZJ.LJJI(this.LLILZLL);
        } else {
            R5(c160900jX);
        }
        if (c1109770ez9.LJI) {
            this.LLILZLL.setDrawAnchorMark(false);
        }
    }

    public C1111160f1O(View view, boolean z, boolean z2, boolean z3) throws Throwable {
        super(view);
        this.LLILZ = z2;
        SimpleLiveTextView simpleLiveTextView = (SimpleLiveTextView) view.findViewById(R.id.text);
        this.LLILZIL = simpleLiveTextView;
        C421320Gfa c421320Gfa = (C421320Gfa) view.findViewById(R.id.k55);
        this.LLILZLL = c421320Gfa;
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.y3j);
        this.LLIZ = c16f5;
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.c9l, view.getContext());
        this.LLIZLLLIL = C21627319kV.LIZJ();
        AbstractViewOnLongClickListenerC1111100f1I abstractViewOnLongClickListenerC1111100f1I = new AbstractViewOnLongClickListenerC1111100f1I() { // from class: X.0f1Y
            @Override // X.AbstractViewOnLongClickListenerC1111100f1I
            public final void LIZ() {
                C1111160f1O c1111160f1O = this.LLILLJJLI;
                C160900jX c160900jX = c1111160f1O.LLILLJJLI;
                c1111160f1O.P5(c160900jX != null ? c160900jX.LLJLIL("long_press") : null);
            }
        };
        if (c421320Gfa != null) {
            c421320Gfa.setOnLongClickListener(abstractViewOnLongClickListenerC1111100f1I);
        }
        C1098990ehl.LIZ(new ACListenerS152S0100000_17(this, 209), c16f5);
        c16f5.setOnLongClickListener(abstractViewOnLongClickListenerC1111100f1I);
        C1570050qxX.LIZ(new ACListenerS152S0100000_17(this, 210), simpleLiveTextView);
        simpleLiveTextView.setOnLongClickListener(abstractViewOnLongClickListenerC1111100f1I);
        c16f5.setTextColor(iLIZIZ);
        if (z2) {
            AbstractC1111020f1A.I5(simpleLiveTextView, z);
            AbstractC1111020f1A.I5(c16f5, z);
        } else {
            C1152540g68.LIZJ(simpleLiveTextView, z3, z);
            C1152540g68.LJ(c16f5, z3, z);
        }
    }
}
