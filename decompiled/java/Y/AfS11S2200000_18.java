package Y;

import X.C09JN;
import X.C1171250gaJ;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1C7U;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListMainUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class AfS11S2200000_18 implements C09JN {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS11S2200000_18 afS11S2200000_18, Object obj) {
        List<Aweme> list;
        C1C7U.LIZ("CollectionListMainUIAssem$CollectionVHNew@519.onBindItemView$8$2");
        CollectionContentResponse collectionContentResponse = (CollectionContentResponse) obj;
        if (collectionContentResponse != null && (list = collectionContentResponse.items) != null && !list.isEmpty()) {
            ((CollectionListMainUIAssem) afS11S2200000_18.l2).LLJIJIL.put(afS11S2200000_18.s0, collectionContentResponse);
            C1171250gaJ c1171250gaJ = (C1171250gaJ) afS11S2200000_18.l3;
            c1171250gaJ.LLJI = collectionContentResponse;
            c1171250gaJ.I5(collectionContentResponse.items);
        } else {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(afS11S2200000_18.s1);
            c1331670kl3LJIIIZ.LJJ(((C1171250gaJ) afS11S2200000_18.l3).LLILLL);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        C1C7U.LIZIZ("CollectionListMainUIAssem$CollectionVHNew@519.onBindItemView$8$2");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS11S2200000_18 r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS11S2200000_18.accept$1(Y.AfS11S2200000_18, java.lang.Object):void");
    }

    public AfS11S2200000_18(Object obj, String str, Object obj2, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.l3 = obj2;
        this.s1 = str2;
    }
}
