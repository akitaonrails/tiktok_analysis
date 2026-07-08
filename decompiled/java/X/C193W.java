package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import kotlin.Unit;
import kotlin.jvm.internal.AwS159S0400000_32;
import kotlin.jvm.internal.AwS276S0300000_32;

/* JADX INFO: renamed from: X.193W, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C193W extends AnonymousClass1931<C193Y, Unit, Unit> {
    public final Fragment LIZJ;
    public final IAVPublishExtension<?> LIZLLL;
    public C193Y LJ;

    @Override // X.AnonymousClass1931
    public final void LJFF(AbstractC1738640vLS abstractC1738640vLS) {
        this.LIZLLL.onUnbindOptionView();
    }

    public C193W(Fragment fragment, IAVPublishExtension<?> iAVPublishExtension) {
        this.LIZJ = fragment;
        this.LIZLLL = iAVPublishExtension;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass1931
    public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
        C193Y c193y = this.LJ;
        if (c193y == null) {
            C259800zU c259800zU = new C259800zU();
            ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).invokeMethodsSafely(this.LIZJ.requireActivity(), new AwS159S0400000_32(c259800zU, (C259800zU<View>) this, (C193W) context, (Context) viewGroup, (ViewGroup) 6));
            View view = (View) c259800zU.element;
            if (view == null) {
                view = new View(context);
            }
            c193y = new C193Y(view);
            this.LJ = c193y;
        }
        return c193y;
    }

    @Override // X.AnonymousClass1931
    public final void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj) {
        C193Y c193y = (C193Y) abstractC1738640vLS;
        if (!c193y.LL) {
            ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).invokeMethodsSafely(this.LIZJ.requireActivity(), new AwS276S0300000_32(this, c193y, c193x, 6));
            c193y.LL = true;
        }
    }
}
