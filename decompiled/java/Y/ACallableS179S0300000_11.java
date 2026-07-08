package Y;

import X.C0SFB;
import X.C0SJF;
import X.C1C7U;
import X.C2188811AlT;
import X.C718770SHj;
import X.C718800SHm;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public class ACallableS179S0300000_11 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS179S0300000_11 aCallableS179S0300000_11) {
        C1C7U.LIZ("NewVideoDescDelegate@fb8f.refreshRichTextTranslatedLayout$2");
        C718770SHj c718770SHj = (C718770SHj) aCallableS179S0300000_11.l0;
        Aweme aweme = (Aweme) aCallableS179S0300000_11.l1;
        ClientText clientText = (ClientText) aCallableS179S0300000_11.l2;
        C0SJF c0sjfLJJLIL = c718770SHj.LLLF.LJII;
        if (c0sjfLJJLIL == null) {
            c0sjfLJJLIL = C718770SHj.LJJLIL(aweme, clientText);
        }
        C718770SHj c718770SHj2 = (C718770SHj) aCallableS179S0300000_11.l0;
        Aweme aweme2 = (Aweme) aCallableS179S0300000_11.l1;
        C718800SHm c718800SHmLJIILIIL = c718770SHj2.LLL;
        if (c718800SHmLJIILIIL == null) {
            c718800SHmLJIILIIL = c718770SHj2.LJIILIIL(c0sjfLJJLIL, aweme2, c718770SHj2.LLLLIIIILLL);
        }
        Pair pair = new Pair(c0sjfLJJLIL, c718800SHmLJIILIIL);
        C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.refreshRichTextTranslatedLayout$2");
        return pair;
    }

    public static final Object call$1(ACallableS179S0300000_11 aCallableS179S0300000_11) {
        String aid;
        Aweme aweme;
        C1C7U.LIZ("NewVideoDescDelegate@fb8f.refreshTranslatedLayout$2");
        C718770SHj c718770SHj = (C718770SHj) aCallableS179S0300000_11.l0;
        Aweme aweme2 = (Aweme) aCallableS179S0300000_11.l1;
        ClientText clientText = (ClientText) aCallableS179S0300000_11.l2;
        C0SJF c0sjfLJJLIL = c718770SHj.LLLF.LJI;
        if (c0sjfLJJLIL == null) {
            c0sjfLJJLIL = C718770SHj.LJJLIL(aweme2, clientText);
        }
        C718770SHj c718770SHj2 = (C718770SHj) aCallableS179S0300000_11.l0;
        Object objLIZ = c718770SHj2.LLLF.LJFF;
        if (objLIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getOriginalTransComponents ");
            VideoItemParams item = c718770SHj2.LLILLJJLI.getItem();
            if (item != null && (aweme = item.getAweme()) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
            objLIZ = C0SFB.LIZ(c0sjfLJJLIL);
        }
        Pair pair = new Pair(c0sjfLJJLIL, objLIZ);
        C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.refreshTranslatedLayout$2");
        return pair;
    }

    public ACallableS179S0300000_11(C718770SHj c718770SHj, Aweme aweme, ClientText clientText, int i) {
        this.$t = i;
        this.l0 = c718770SHj;
        this.l1 = aweme;
        this.l2 = clientText;
    }
}
