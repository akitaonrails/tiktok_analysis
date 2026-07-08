package Y;

import X.C09JN;
import X.C1043010dFT;
import X.C1161040gJq;
import X.C1C7U;
import X.C5182020e;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.slash.page.SlashFragment;
import kotlin.jvm.internal.AwS105S0110000_18;

/* JADX INFO: loaded from: classes19.dex */
public class AfS58S0110000_18 implements C09JN {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS58S0110000_18 afS58S0110000_18, Object obj) {
        C1C7U.LIZ("RavenFragment@d0e1.startRequest$3");
        ((RavenFragment) afS58S0110000_18.l0).US((C1161040gJq) obj, afS58S0110000_18.z1);
        ((RavenFragment) afS58S0110000_18.l0).LLLLLJIL = false;
        C1C7U.LIZIZ("RavenFragment@d0e1.startRequest$3");
    }

    public static final void accept$1(AfS58S0110000_18 afS58S0110000_18, Object obj) {
        C1C7U.LIZ("RavenFragment@d0e1.startRequest$4");
        Throwable th = (Throwable) obj;
        ((RavenFragment) afS58S0110000_18.l0).oT(th, afS58S0110000_18.z1);
        ((RavenFragment) afS58S0110000_18.l0).LLLLLJIL = false;
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new C5182020e(th, 104));
        C1C7U.LIZIZ("RavenFragment@d0e1.startRequest$4");
    }

    public static final void accept$2(AfS58S0110000_18 afS58S0110000_18, Object obj) {
        C1C7U.LIZ("VideoCollectionContentViewModel@f4ab.getNextPageVideosInCollection$1$2");
        ((VideoCollectionContentViewModel) afS58S0110000_18.l0).setState(new AwS105S0110000_18((CollectionContentResponse) obj, afS58S0110000_18.z1, 4));
        C1C7U.LIZIZ("VideoCollectionContentViewModel@f4ab.getNextPageVideosInCollection$1$2");
    }

    public static final void accept$3(AfS58S0110000_18 afS58S0110000_18, Object obj) {
        C1C7U.LIZ("SlashFragment@ca1a.startRequest$4");
        SlashFragment.bV((SlashFragment) afS58S0110000_18.l0, (Throwable) obj, afS58S0110000_18.z1, false, 4, null);
        ((SlashFragment) afS58S0110000_18.l0).LLLIIIL = false;
        C1C7U.LIZIZ("SlashFragment@ca1a.startRequest$4");
    }

    public static final void accept$4(AfS58S0110000_18 afS58S0110000_18, Object obj) {
        C1C7U.LIZ("RavenFragment@d0e1.submitFirstScreenResponse$6");
        Throwable th = (Throwable) obj;
        ((RavenFragment) afS58S0110000_18.l0).oT(th, true);
        RavenFragment ravenFragment = (RavenFragment) afS58S0110000_18.l0;
        ravenFragment.LLLLLJIL = false;
        if (afS58S0110000_18.z1) {
            ravenFragment.oS();
            RavenFragment ravenFragment2 = (RavenFragment) afS58S0110000_18.l0;
            ravenFragment2.getClass();
            ravenFragment2.IT("submitFirstScreenResponse error");
        }
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new C5182020e(th, 467));
        C1C7U.LIZIZ("RavenFragment@d0e1.submitFirstScreenResponse$6");
    }

    public static final void accept$5(AfS58S0110000_18 afS58S0110000_18, Object obj) {
        C1C7U.LIZ("VideoCollectionContentViewModel@f4ab.getNextPageVideosInAllFavorites$1$2");
        ((VideoCollectionContentViewModel) afS58S0110000_18.l0).setState(new AwS105S0110000_18((CollectionContentResponse) obj, afS58S0110000_18.z1, 16));
        C1C7U.LIZIZ("VideoCollectionContentViewModel@f4ab.getNextPageVideosInAllFavorites$1$2");
    }

    public static final void accept$6(AfS58S0110000_18 afS58S0110000_18, Object obj) {
        C1C7U.LIZ("VideoCollectionContentViewModel@f4ab.getNextPageVideosInCandidate$1$3");
        ((VideoCollectionContentViewModel) afS58S0110000_18.l0).setState(new AwS105S0110000_18((CollectionContentResponse) obj, afS58S0110000_18.z1, 19));
        C1C7U.LIZIZ("VideoCollectionContentViewModel@f4ab.getNextPageVideosInCandidate$1$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS58S0110000_18(Object obj, RavenFragment<CONTEXT> ravenFragment, boolean z) {
        this.$t = z ? 1 : 0;
        this.l0 = obj;
        this.z1 = ravenFragment;
    }
}
