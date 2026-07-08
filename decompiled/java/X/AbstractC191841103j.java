package X;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.103j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC191841103j extends AbstractC191840103i implements InterfaceC191837103f {
    public abstract int LJFF();

    @Override // X.InterfaceC191837103f
    public final C191838103g LIZ(Context context, ViewGroup viewGroup) {
        return new C191838103g(C786410Ut5.Td(C786410Ut5.ne(context), LJFF(), viewGroup, false));
    }

    @Override // X.InterfaceC191837103f
    public final void LJ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g, int i) {
        LIZIZ(abstractC191840103i, c191838103g);
    }
}
