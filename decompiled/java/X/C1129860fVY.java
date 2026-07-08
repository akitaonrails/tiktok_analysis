package X;

import Y.ACListenerS147S0100000_12;
import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fVY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129860fVY extends AbstractC1126560fQE {
    public final View LLLILZ;
    public final String LLLILZJ;
    public final View LLLILZLLLI;
    public final View LLLIZZ;
    public final View LLLJ;
    public final C16F5 LLLJIL;
    public final TextSwitcher LLLJL;
    public final View LLLL;
    public final View LLLLII;
    public final C16F5 LLLLIIIILLL;
    public final View LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public boolean LLLLIL;
    public AbstractC1126600fQI<? extends AnonymousClass0054> LLLLILI;
    public AbstractC1126600fQI<? extends AnonymousClass0054> LLLLJ;
    public final C01GW LLLLJI;
    public final C01GW LLLLL;
    public final C01GW LLLLLIL;

    public static boolean z6() {
        return C1130100fVw.LIZ.LJFF == 1;
    }

    @Override // X.AbstractC1126560fQE
    public final String R5() {
        return this.LLLILZJ;
    }

    public C1129860fVY(View view) {
        Integer numLIZJ;
        super(view);
        this.LLLILZ = view;
        this.LLLILZJ = "LiveGiftFavFreqHeaderViewHolder";
        this.LLLILZLLLI = view.findViewById(R.id.hq7);
        this.LLLIZZ = view.findViewById(R.id.h2e);
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.h25);
        this.LLLJ = view.findViewById(R.id.pbm);
        C16F5 c16f52 = (C16F5) view.findViewById(R.id.pbf);
        this.LLLJIL = c16f52;
        TextSwitcher textSwitcher = (TextSwitcher) view.findViewById(R.id.pc1);
        this.LLLJL = textSwitcher;
        View viewFindViewById = view.findViewById(R.id.pc0);
        this.LLLL = viewFindViewById;
        this.LLLLII = view.findViewById(R.id.pbx);
        this.LLLLIIIILLL = (C16F5) view.findViewById(R.id.pbz);
        View viewFindViewById2 = view.findViewById(R.id.pby);
        this.LLLLIIL = viewFindViewById2;
        C0JT6<Boolean> c0jt6 = InterfaceC1094160eZy.L1;
        Boolean boolLIZ = c0jt6.LIZ();
        Boolean bool = Boolean.TRUE;
        if ((!Intrinsics.LJFF(boolLIZ, bool)) && Intrinsics.LJFF(InterfaceC1094160eZy.K1.LIZ(), bool) && (!Intrinsics.LJFF(c0jt6.LIZ(), bool))) {
            c0jt6.LIZJ(bool);
        }
        C786410Ut5.l8(c16f5, new ACListenerS152S0100000_17(this, 91));
        C786410Ut5.l8(c16f52, new ACListenerS152S0100000_17(this, 92));
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 301), viewFindViewById2);
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: X.0Hz5
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                C16F5 c16f53 = new C16F5(this.LIZ.itemView.getContext(), null);
                C1129860fVY c1129860fVY = this.LIZ;
                C786410Ut5.y6(c16f53, new FrameLayout.LayoutParams(-2, -2));
                c16f53.LJJJI(R.style.a9i);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.c9i, c1129860fVY.itemView.getContext());
                if (numLIZJ2 != null) {
                    c16f53.setTextColor(numLIZJ2.intValue());
                }
                return c16f53;
            }
        });
        C0GR2 c0gr2 = new C0GR2();
        Context context = view.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c92, context)) != null) {
            c0gr2.LJI.setColor(numLIZJ.intValue());
        }
        viewFindViewById.setBackground(c0gr2);
        c16f5.LJJJI(R.style.a9i);
        c16f52.LJJJI(R.style.a9i);
        this.LLLLJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 315));
        this.LLLLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 316));
        this.LLLLLIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 317));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    @Override // X.AbstractC1126560fQE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(X.AbstractC1126600fQI<? extends X.AnonymousClass0054> r10, com.bytedance.ies.sdk.datachannel.DataChannel r11, int r12) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1129860fVY.N5(X.0fQI, com.bytedance.ies.sdk.datachannel.DataChannel, int):void");
    }
}
