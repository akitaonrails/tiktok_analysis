package X;

import Y.ACListenerS73S0300000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425450GmF implements InterfaceC425460GmG {
    public static final /* synthetic */ C425450GmF LIZIZ = new C425450GmF();

    @Override // X.InterfaceC425460GmG
    public final C425510GmL LIZ(ViewGroup viewGroup, int i, final Lifecycle lifecycle, final InterfaceC432280GxG interfaceC432280GxG) {
        if (i != 1) {
            if (i != 99) {
                if (i != 100) {
                    Context context = viewGroup.getContext();
                    FrameLayout frameLayout = new FrameLayout(context);
                    C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-2, -1));
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.e4);
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
                    frameLayout.setBackground(c384050F3z.LIZ(context));
                    return new C425510GmL(frameLayout, lifecycle, interfaceC432280GxG);
                }
                final View view = new View(viewGroup.getContext());
                return new C425510GmL(view, lifecycle, interfaceC432280GxG) { // from class: X.0GmI
                    @Override // X.C425510GmL
                    public final void I5(InterfaceC434700H2u interfaceC434700H2u, int i2) {
                        C425490GmJ c425490GmJ;
                        if ((interfaceC434700H2u instanceof C425490GmJ) && (c425490GmJ = (C425490GmJ) interfaceC434700H2u) != null) {
                            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                            View view2 = this.itemView;
                            int i3 = c425490GmJ.LL;
                            layoutParams.width = i3;
                            layoutParams.height = i3;
                            C786410Ut5.W5(view2, layoutParams);
                        }
                    }

                    {
                        super(view, lifecycle, interfaceC432280GxG);
                        C786410Ut5.W5(view, new C21681819tI(0, 0));
                    }
                };
            }
            return new C425470GmH(new LinearLayout(viewGroup.getContext()), lifecycle, interfaceC432280GxG);
        }
        Context context2 = viewGroup.getContext();
        int iIntValue = ((Number) interfaceC432280GxG.LIZIZ().invoke()).intValue();
        final TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
        C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-2, -1));
        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColorRes(R.attr.ee);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(iIntValue);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
        tuxTextView.setBackground(c384050F3z2.LIZ(context2));
        tuxTextView.setMaxLines(1);
        return new C425510GmL(tuxTextView, lifecycle, interfaceC432280GxG) { // from class: X.0GmK
            public final TextView LLILZIL;

            @Override // X.C425510GmL
            public final void I5(InterfaceC434700H2u interfaceC434700H2u, int i2) {
                this.LLILZ = interfaceC434700H2u;
                if (interfaceC434700H2u instanceof PromptModel) {
                    PromptModel promptModel = (PromptModel) interfaceC434700H2u;
                    if (Intrinsics.LJFF(promptModel.prompt, this.LLILZIL.getText().toString())) {
                        return;
                    }
                    this.LLILZIL.setText(promptModel.prompt);
                }
            }

            {
                super(tuxTextView, lifecycle, interfaceC432280GxG);
                this.LLILZIL = tuxTextView;
                C786410Ut5.I7(new ACListenerS73S0300000_6(this, lifecycle, interfaceC432280GxG, 7), this.itemView);
            }
        };
    }
}
