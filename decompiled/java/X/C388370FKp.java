package X;

import Y.ACListenerS140S0100000_5;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388370FKp extends C388270FKf {
    public final ViewGroup LIZIZ;
    public final C1664680tQA<TextStickerModel> LIZJ;
    public final LifecycleOwner LIZLLL;
    public final C0FF8 LJ;
    public final LinearLayout LJFF;
    public final C0HZQ LJI;
    public boolean LJII;

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() {
        C786410Ut5.LJZL(C0F8Y.LJIIIIZZ(this.LIZJ.LIZ) ? 0 : 8, this.LJFF);
    }

    public C388370FKp(ViewGroup viewGroup, C388200FJy c388200FJy) {
        super(c388200FJy);
        this.LIZIZ = viewGroup;
        this.LIZJ = c388200FJy.LJ;
        this.LIZLLL = c388200FJy.LIZLLL;
        this.LJ = c388200FJy.LJFF;
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.nat);
        this.LJFF = linearLayout;
        C0HZQ c0hzq = (C0HZQ) viewGroup.findViewById(R.id.dq2);
        this.LJI = c0hzq;
        TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.z9x);
        boolean zLIZ = new C0EKG().LIZ();
        this.LJII = zLIZ;
        c0hzq.setChecked(zLIZ);
        C786410Ut5.R7(linearLayout, new ACListenerS140S0100000_5(this, 136));
        C786410Ut5.h9(tuxTextView, new ACListenerS140S0100000_5(this, 137));
        C786410Ut5.b9(c0hzq, new ACListenerS140S0100000_5(this, 138));
    }
}
