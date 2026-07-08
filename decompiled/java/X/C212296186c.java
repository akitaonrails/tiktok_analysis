package X;

import android.text.TextPaint;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.186c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212296186c implements InterfaceC212297186d<ViewGroup> {
    @Override // X.InterfaceC212297186d
    public final TuxTextView LIZ(ViewGroup viewGroup) {
        TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.gls);
        TextPaint paint = tuxTextView.getPaint();
        paint.setFlags(16);
        paint.setAntiAlias(true);
        return tuxTextView;
    }

    @Override // X.InterfaceC212297186d
    public final TuxTextView LIZJ(ViewGroup viewGroup) {
        return (TuxTextView) viewGroup.findViewById(R.id.gmc);
    }

    @Override // X.InterfaceC212297186d
    public final TuxTextView LIZLLL(ViewGroup viewGroup) {
        return (TuxTextView) viewGroup.findViewById(R.id.gm9);
    }

    @Override // X.InterfaceC212297186d
    public final TuxTextView LJ(ViewGroup viewGroup) {
        return (TuxTextView) viewGroup.findViewById(R.id.gk_);
    }

    @Override // X.InterfaceC212297186d
    public final TuxTextView LJFF(ViewGroup viewGroup) {
        TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.gko);
        tuxTextView.getPaint().setAntiAlias(true);
        tuxTextView.setGravity(17);
        return tuxTextView;
    }

    @Override // X.InterfaceC212297186d
    public final C212332187m LIZIZ(ViewGroup viewGroup, boolean z) {
        C212332187m c212332187m = (C212332187m) viewGroup.findViewById(R.id.gma);
        c212332187m.setCurrencyShowLeft(z);
        return c212332187m;
    }
}
