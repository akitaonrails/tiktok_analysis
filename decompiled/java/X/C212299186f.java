package X;

import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.186f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212299186f implements InterfaceC212298186e<ViewGroup> {
    public final int LIZ;

    public C212299186f(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC212298186e
    public final TuxTextView LIZ(ViewGroup viewGroup) {
        return new TuxTextView(viewGroup.getContext(), null, 6, 0);
    }

    @Override // X.InterfaceC212298186e
    public final TuxTextView LIZJ(ViewGroup viewGroup) {
        return new TuxTextView(viewGroup.getContext(), null, 6, 0);
    }

    @Override // X.InterfaceC212298186e
    public final C212332187m LIZIZ(ViewGroup viewGroup, boolean z) {
        ViewGroup viewGroup2 = viewGroup;
        C212332187m c212332187m = (C212332187m) viewGroup2.findViewById(this.LIZ);
        if (c212332187m != null) {
            c212332187m.setCurrencyShowLeft(z);
            return c212332187m;
        }
        return new C212332187m(viewGroup2.getContext(), null, 6);
    }
}
