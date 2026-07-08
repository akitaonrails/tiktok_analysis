package X;

import Y.ARunnableS81S0200000_12;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: renamed from: X.0T2G, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T2G implements InterfaceC1604070rqP {
    public final C0T2I LL;
    public final List<C0T2H> LLILLJJLI = C1697810uHb.LJIILJJIL(new C998450c5b(), new C0T4Y() { // from class: X.0c3y
        public static final /* synthetic */ int LIZJ = 0;
        public AbstractC1028360crq LIZIZ;

        @Override // X.C0T2H
        public final boolean LIZLLL() {
            return C07CW.LIZ() && (((Number) C07CW.LIZ.getValue()).intValue() & 2) != 0;
        }

        @Override // X.C0T2H
        public final boolean LJIIJJI(Aweme aweme) {
            return C1017070cZd.LLLII(aweme);
        }

        @Override // X.C0T2H
        public final void LIZ(Context context, Aweme aweme) {
            if (C1017070cZd.LLLII(aweme)) {
                LJIIIIZZ(context, aweme);
                AbstractC1028360crq abstractC1028360crq = this.LIZIZ;
                if (abstractC1028360crq != null) {
                    abstractC1028360crq.LJIL(aweme.getAid());
                }
            }
        }

        @Override // X.C0T2H
        public final void LJFF(Context context, Aweme aweme) {
            C997400c3u.LIZJ.LIZIZ();
            this.LIZIZ = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZIZ(C1000500c8u.LIZ(context, aweme), C1000500c8u.LIZIZ(context, aweme), null);
        }

        public final void LJIIIIZZ(Context context, Aweme aweme) {
            if (this.LIZIZ == null) {
                this.LIZIZ = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZLLL(C1000500c8u.LIZ(context, aweme), C1000500c8u.LIZIZ(context, aweme));
            }
        }

        @Override // X.C0T2H
        public final void LJ(int i, Context context, List list) {
            if (i >= 0 && i < list.size() && !AwemeExtKt.isAdTraffic((Aweme) ListProtector.get(list, i))) {
                int i2 = 0;
                for (Object obj : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        Aweme aweme = (Aweme) obj;
                        if (C1017070cZd.LLLII(aweme) && i2 + 6 < i) {
                            LJIIIIZZ(context, aweme);
                            AbstractC1028360crq abstractC1028360crq = this.LIZIZ;
                            if (abstractC1028360crq != null) {
                                abstractC1028360crq.LJIL(aweme.getAid());
                            }
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    });

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC1604070rqP
    public final void preRender() {
        Context context = ((C0T2F) this.LL).getContext();
        if (context == null) {
            return;
        }
        for (C0T2H c0t2h : this.LLILLJJLI) {
            BaseListFragmentPanel baseListFragmentPanel = ((C0T2F) this.LL).LIZ;
            c0t2h.LJ(baseListFragmentPanel.LLJLILLLLZIIL, context, baseListFragmentPanel.LLJL.Fg());
        }
        C786410Ut5.LJLIIL(100L, ((C0T2F) this.LL).LIZ.LLJLLIL, new ARunnableS81S0200000_12(context, this, 3));
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ C0T2I Mh() {
        return this.LL;
    }

    public C0T2G(C0T2F c0t2f) {
        this.LL = c0t2f;
    }
}
