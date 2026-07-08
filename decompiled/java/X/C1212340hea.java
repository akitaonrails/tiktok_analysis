package X;

import X.AbstractC1255880imo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.subscription.service.IPaidContentFullAwemeService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0hea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212340hea<T extends AbstractC1255880imo<Aweme, ?>> extends C1255920ims<T> {
    public int LLILZLL;
    public int LLIZ;
    public int LLJ;
    public String LLILZIL = "";
    public String LLIZLLLIL = "";
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(598));

    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        T t = this.LL;
        if (t == 0 || this.LLILLJJLI == 0) {
            return;
        }
        AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) t;
        List<Aweme> listLJIJI = LJIJI(abstractC1255880imo != null ? abstractC1255880imo.getItems() : null);
        boolean z = false;
        if ((listLJIJI.isEmpty()) && this.LLJ < 1) {
            LIZJ(Integer.valueOf(((AbstractC1255880imo) this.LL).mListQueryType), Boolean.TRUE, this.LLILZIL, Integer.valueOf(this.LLILZLL), Integer.valueOf(this.LLIZ), this.LLIZLLLIL);
            this.LLJ++;
            return;
        }
        this.LLJ = 0;
        T t2 = this.LL;
        int i = ((AbstractC1255880imo) t2).mListQueryType;
        if (i == 1) {
            ((InterfaceC1212360hec) this.LLILLJJLI).LLJJJIL(listLJIJI, ((AbstractC1255880imo) t2).isHasMore());
            return;
        }
        if (i == 2) {
            ((InterfaceC1212360hec) this.LLILLJJLI).mE(listLJIJI, !((AbstractC1255880imo) t2).isNewDataEmpty());
            return;
        }
        if (i == 4) {
            InterfaceC1212360hec interfaceC1212360hec = (InterfaceC1212360hec) this.LLILLJJLI;
            if (((AbstractC1255880imo) t2).isHasMore() && !((AbstractC1255880imo) this.LL).isNewDataEmpty()) {
                z = true;
            }
            interfaceC1212360hec.Pj(listLJIJI, z);
        }
    }

    @Override // X.C1260870iur
    public final void LJIILJJIL() {
        super.LJIILJJIL();
    }

    @Override // X.C1260870iur
    public final boolean LIZJ(Object... objArr) {
        String str;
        Integer num;
        int iIntValue;
        String str2;
        Integer num2;
        Object obj = objArr[2];
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        this.LLILZIL = str;
        Object objLJJIIZ = C13LQ.LJJIIZ(3, objArr);
        if (objLJJIIZ instanceof Integer) {
            num = (Integer) objLJJIIZ;
        } else {
            num = null;
        }
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILZLL = iIntValue;
        Object objLJJIIZ2 = C13LQ.LJJIIZ(4, objArr);
        if ((objLJJIIZ2 instanceof Integer) && (num2 = (Integer) objLJJIIZ2) != null) {
            iIntValue2 = num2.intValue();
        }
        this.LLIZ = iIntValue2;
        Object objLJJIIZ3 = C13LQ.LJJIIZ(5, objArr);
        if (!(objLJJIIZ3 instanceof String) || (str2 = (String) objLJJIIZ3) == null) {
            str2 = "";
        }
        this.LLIZLLLIL = str2;
        return super.LIZJ(Arrays.copyOf(objArr, objArr.length));
    }

    public final List<Aweme> LJIJI(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Aweme aweme : list) {
                if (C0SXF.LJJ(aweme)) {
                    arrayList.add(aweme);
                }
            }
        }
        if (((Boolean) C281350B0z.LIZ.getValue()).booleanValue()) {
            return new ArrayList(((IPaidContentFullAwemeService) this.LLJI.getValue()).LIZIZ(arrayList, true));
        }
        return arrayList;
    }

    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        super.onFailed(exc);
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC1212360hec) k).Wi(exc);
        }
        this.LLJ = 0;
    }
}
