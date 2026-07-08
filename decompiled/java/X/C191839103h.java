package X;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.103h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C191839103h implements InterfaceC191837103f {
    public final int LIZ;

    @Override // X.InterfaceC191837103f
    public void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
    }

    public C191839103h(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC191837103f
    public final C191838103g LIZ(Context context, ViewGroup viewGroup) {
        return new C191838103g(C786410Ut5.Td(C786410Ut5.ne(context), this.LIZ, viewGroup, false));
    }

    @Override // X.InterfaceC191837103f
    public final void LJ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g, int i) {
        LIZIZ(abstractC191840103i, c191838103g);
    }
}
