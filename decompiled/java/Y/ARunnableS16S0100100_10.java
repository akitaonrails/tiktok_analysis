package Y;

import X.C0PEM;
import X.C0R30;
import X.C1C7U;
import X.C2296808zG;
import X.C23250099c;
import X.C644060POa;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS16S0100100_10 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

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

    public static final void run$0(ARunnableS16S0100100_10 aRunnableS16S0100100_10) {
        boolean zLIZ;
        C1C7U.LIZ("TakoAnswerBaseAssem@27d.onBind$6");
        try {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0R30((TakoAnswerBaseAssem) aRunnableS16S0100100_10.l0, System.currentTimeMillis() - aRunnableS16S0100100_10.j1, null), 3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoAnswerBaseAssem@27d.onBind$6");
    }

    public static final void run$1(ARunnableS16S0100100_10 aRunnableS16S0100100_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchResultShowEventTrackerV2@6685.end$1");
        try {
            C644060POa c644060POa = C644060POa.LIZ;
            long j = aRunnableS16S0100100_10.j1;
            SearchResultParam searchResultParam = (SearchResultParam) aRunnableS16S0100100_10.l0;
            c644060POa.getClass();
            C644060POa.LJIIJJI(j, searchResultParam, C644060POa.LJII);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchResultShowEventTrackerV2@6685.end$1");
    }

    public ARunnableS16S0100100_10(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
