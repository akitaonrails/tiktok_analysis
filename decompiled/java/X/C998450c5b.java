package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0c5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998450c5b extends C0T4Y {
    public static final /* synthetic */ int LJ = 0;
    public C997400c3u LIZIZ;
    public final AbstractC1028360crq[] LIZJ = new AbstractC1028360crq[3];
    public final C01GW LIZLLL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS204S0000000_16.get$arr$(6));

    @Override // X.C0T2H
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.C0T2H
    public final boolean LJIIJJI(Aweme aweme) {
        return C1017070cZd.LJLIIL(aweme);
    }

    @Override // X.C0T2H
    public final void LIZ(Context context, Aweme aweme) {
        if (C1017070cZd.LJLIIL(aweme)) {
            LJIIIIZZ(context, aweme);
            int i = 0;
            for (Object obj : (ArrayList) C13LQ.LJIJI(this.LIZJ)) {
                int i2 = i + 1;
                Integer numValueOf = null;
                if (i >= 0) {
                    AbstractC1028360crq abstractC1028360crq = (AbstractC1028360crq) obj;
                    AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
                    if (awemeRawAdLJJIJLIJ != null) {
                        numValueOf = Integer.valueOf(awemeRawAdLJJIJLIJ.getRit());
                    }
                    abstractC1028360crq.LJIL(C1000490c8t.LIZ(i, numValueOf, aweme.getAid()));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // X.C0T2H
    public final void LJFF(Context context, Aweme aweme) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new C997400c3u();
        }
        C997400c3u c997400c3u = this.LIZIZ;
        if (c997400c3u != null) {
            c997400c3u.LIZIZ();
        }
        if (!C1051600dTK.LIZIZ(aweme, ((Boolean) C1051600dTK.LJIIIIZZ.getValue()).booleanValue())) {
            C811103Ev.LIZ("AdHybridCarouselTagPreRender");
            int length = this.LIZJ.length;
            for (int i = 0; i < length; i++) {
                this.LIZJ[i] = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZIZ(C1000490c8t.LIZJ(context, aweme), C1000490c8t.LIZIZ(context, aweme, i), null);
            }
            return;
        }
        C811103Ev.LIZ("AdHybridCarouselTagPreRender");
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LIZLLL.getValue();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ.LLIILII(), null, new C1001560cAc(this, context, aweme, null), 2);
    }

    public final void LJIIIIZZ(Context context, Aweme aweme) {
        int length = this.LIZJ.length;
        for (int i = 0; i < length; i++) {
            AbstractC1028360crq[] abstractC1028360crqArr = this.LIZJ;
            if (abstractC1028360crqArr[i] == null) {
                abstractC1028360crqArr[i] = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZLLL(C1000490c8t.LIZJ(context, aweme), C1000490c8t.LIZIZ(context, aweme, i));
            }
        }
    }

    @Override // X.C0T2H
    public final void LJ(int i, Context context, List list) {
        Integer numValueOf;
        if (i >= 0 && i < list.size() && !AwemeExtKt.isAdTraffic((Aweme) ListProtector.get(list, i))) {
            ArrayList<Aweme> arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    if (C1017070cZd.LJLIIL((Aweme) obj) && i2 + 6 < i) {
                        arrayList.add(obj);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            for (Aweme aweme : arrayList) {
                LJIIIIZZ(context, aweme);
                int i4 = 0;
                for (Object obj2 : (ArrayList) C13LQ.LJIJI(this.LIZJ)) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        AbstractC1028360crq abstractC1028360crq = (AbstractC1028360crq) obj2;
                        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
                        if (awemeRawAdLJJIJLIJ != null) {
                            numValueOf = Integer.valueOf(awemeRawAdLJJIJLIJ.getRit());
                        } else {
                            numValueOf = null;
                        }
                        abstractC1028360crq.LJIL(C1000490c8t.LIZ(i4, numValueOf, aweme.getAid()));
                        i4 = i5;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    }
}
