package X;

import androidx.fragment.app.Fragment;
import com.bytedance.jedi.arch.JediViewModel;

/* JADX INFO: renamed from: X.0P4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C638920P4g implements InterfaceC1255404vg {
    public final int $t;

    @Override // X.InterfaceC1255404vg
    public final InterfaceC1603360rpG LIZ(C2189821An6 c2189821An6, AbstractC1255880imo<?, ?> abstractC1255880imo, JediViewModel<?> jediViewModel) {
        switch (this.$t) {
            case 0:
                return LIZ$0(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 1:
                return LIZ$1(this, c2189821An6, abstractC1255880imo, jediViewModel);
            default:
                return null;
        }
    }

    public C638920P4g(int i) {
        this.$t = i;
    }

    public static final InterfaceC1603360rpG LIZ$0(C638920P4g c638920P4g, C2189821An6 c2189821An6, final AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<AbstractC1255880imo, C1255920ims<AbstractC1255880imo>>(abstractC1255880imo) { // from class: X.0P2i
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return 8000;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mModel = abstractC1255880imo;
                this.mPresenter = new C1255920ims();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final boolean init(Fragment fragment) {
                if (this.mModel != 0) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                this.mPresenter.LIZJ(c2189821An62.getAid());
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$1(C638920P4g c638920P4g, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C630680OoU(c2189821An6);
    }
}
