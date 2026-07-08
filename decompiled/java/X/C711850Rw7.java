package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.0Rw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C711850Rw7 extends C09AY implements Function1<C711590Rvh, View> {
    public C711850Rw7() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(C711590Rvh c711590Rvh) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C711590Rvh c711590Rvh2 = c711590Rvh;
        View viewTd = C786410Ut5.Td(c711590Rvh2.LIZJ, R.layout.ba9, c711590Rvh2.LIZ, false);
        ((C197039127h) viewTd.findViewById(R.id.d75)).LJJJJL(new AwS580S0100000_1(viewTd, 787));
        viewTd.findViewById(R.id.d75).setTag(R.id.ekt, Boolean.TRUE);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ("https://sf16-va.tiktokcdn.com/obj/eden-va2/jpyleh7ubrpsnuhd/cover_img.png");
        c1331670kl3LJIIIZ.LJJ((InterfaceC1334290kpH) viewTd.findViewById(R.id.cover));
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ca, viewTd.getContext());
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1b, viewTd.getContext());
        if (numLIZJ2 != null && numLIZJ != null) {
            View viewFindViewById = viewTd.findViewById(R.id.ev0);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LIZ = Integer.valueOf(C2441009hQ.LJIIJ(numLIZJ2.intValue(), numLIZJ.intValue()));
            viewFindViewById.setBackground(c384050F3z.LIZ(c711590Rvh2.LIZIZ));
        }
        int iLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL))) - C14LC.LJIILLIIL) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(17.0f)));
        ViewGroup.LayoutParams layoutParams = viewTd.findViewById(R.id.b95).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams2.bottomMargin = iLIZIZ;
            C786410Ut5.M6((TuxIconView) viewTd.findViewById(R.id.b95), marginLayoutParams2);
        }
        if (C11VU.LIZLLL(viewTd.getContext()) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(720))) {
            ((TuxTextView) viewTd.findViewById(R.id.zhs)).setTuxFont(61);
            ((TuxTextView) viewTd.findViewById(R.id.tv_tile)).setTuxFont(103);
            ViewGroup.LayoutParams layoutParams2 = viewTd.findViewById(R.id.ld1).getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
                marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
                C786410Ut5.G6((SmartImageView) viewTd.findViewById(R.id.ld1), marginLayoutParams);
            }
        }
        return viewTd;
    }
}
