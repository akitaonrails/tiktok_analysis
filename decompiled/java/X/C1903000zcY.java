package X;

import Y.ACListenerS130S0200000_28;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zcY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903000zcY extends AbstractC1903430zdF<C0ZBB> implements C0Z37<C0ZBB>, InterfaceC1508640pMU {
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "FollowerGuideVH";
    }

    public C1903000zcY(View view) {
        super(view);
        this.LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 952));
        this.LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(view, 951));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 949));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 950));
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        C0ZBB c0zbb = (C0ZBB) interfaceC1891350zJl;
        ImageView imageView = (ImageView) this.LLJILJIL.getValue();
        if (imageView != null) {
            imageView.setImageDrawable(new C415350GQj());
        }
        TextView textView = (TextView) this.LLJ.getValue();
        if (textView != null) {
            textView.setText(2131837177);
        }
        TextView textView2 = (TextView) this.LLJI.getValue();
        if (textView2 != null) {
            textView2.setText(2131837178);
        }
        TuxIconView tuxIconView = (TuxIconView) this.LLJIJIL.getValue();
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS130S0200000_28(this, c0zbb, 56));
        }
        C786410Ut5.I7(new ACListenerS130S0200000_28(this, c0zbb, 57), this.itemView);
    }
}
