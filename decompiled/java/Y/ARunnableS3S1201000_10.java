package Y;

import X.C0BY4;
import X.C1533900q1E;
import X.C1537480q70;
import X.C1537720q7O;
import X.C1537830q7Z;
import X.C1537910q7h;
import X.C1539410qA7;
import X.C1C7U;
import X.C430210Gtv;
import X.C647500PaW;
import X.C647530PaZ;
import X.InterfaceC1531560pxS;
import X.ViewOnClickListenerC662370PyV;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.LynxSSRInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.AwS136S0201000_10;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS3S1201000_10 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1537910q7h c1537910q7h;
        C1537480q70 hybridContext;
        C1537720q7O c1537720q7O;
        C1537480q70 hybridContext2;
        if (C0BY4.LIZIZ()) {
            C647500PaW c647500PaW = C647500PaW.LIZ;
            String str = this.s0;
            c647500PaW.getClass();
            if (C647500PaW.LJIIJJI(str) != null && (c1537720q7O = ((C647530PaZ) this.l1).LIZIZ) != null && (hybridContext2 = c1537720q7O.getHybridContext()) != null) {
                hybridContext2.LJJ(C1533900q1E.class, C647500PaW.LJIIJJI(this.s0));
            }
        }
        C1537720q7O c1537720q7O2 = ((C647530PaZ) this.l1).LIZIZ;
        InterfaceC1531560pxS interfaceC1531560pxS = null;
        if (c1537720q7O2 != null && (hybridContext = c1537720q7O2.getHybridContext()) != null) {
            interfaceC1531560pxS = hybridContext.hybridParams;
        }
        if ((interfaceC1531560pxS instanceof C1537830q7Z) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            SearchMixFeed searchMixFeed = (SearchMixFeed) this.l2;
            c1537910q7h.LJIJJ = (TemplateData) new AwS136S0201000_10((C647530PaZ) this.l1, searchMixFeed, this.i3, 5).invoke();
            C1539410qA7 c1539410qA7 = C1539410qA7.LIZ;
            LynxSSRInfo lynxSSRInfo = searchMixFeed.lynxSSRInfo;
            c1539410qA7.getClass();
            c1537910q7h.LJJIL = C1539410qA7.LIZ(lynxSSRInfo);
        }
        C1537720q7O c1537720q7O3 = ((C647530PaZ) this.l1).LIZIZ;
        if (c1537720q7O3 != null) {
            c1537720q7O3.load();
        }
    }

    public static final void run$0(ARunnableS3S1201000_10 aRunnableS3S1201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SparkLitePreLayoutHelper@fd49.preUpdateLynxData$1$1$ssrLoadRunnable$1");
        try {
            aRunnableS3S1201000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkLitePreLayoutHelper@fd49.preUpdateLynxData$1$1$ssrLoadRunnable$1");
    }

    public static final void run$1(ARunnableS3S1201000_10 aRunnableS3S1201000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchUserViewHolder@dde6.loadAvatarView$1$3");
        try {
            ViewOnClickListenerC662370PyV.d6((C430210Gtv) aRunnableS3S1201000_10.l1, (User) aRunnableS3S1201000_10.l2, aRunnableS3S1201000_10.i3, aRunnableS3S1201000_10.s0, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchUserViewHolder@dde6.loadAvatarView$1$3");
    }

    public ARunnableS3S1201000_10(Object obj, Object obj2, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.l2 = obj2;
        this.i3 = i;
        this.s0 = str;
    }
}
