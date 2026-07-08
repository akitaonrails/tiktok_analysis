package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingListAssem;
import java.util.List;

/* JADX INFO: renamed from: X.0wJD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775690wJD extends AbstractC214823195h {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC214823195h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public C1775690wJD(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(C1775690wJD c1775690wJD, int i) {
        List<C1742910vSL> list = ((ECTrendingListAssem) c1775690wJD.l0).Ho().getState().LLILZ;
        if (i >= list.size()) {
            return 2;
        }
        return ((C1742910vSL) ListProtector.get(list, i)).LIZ();
    }

    public static final int LJFF$1(C1775690wJD c1775690wJD, int i) {
        AbstractC1710370ubr abstractC1710370ubr;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, ((ViewOnAttachStateChangeListenerC20604515jv) c1775690wJD.l0).getState().LJII());
        EnumC1710490uc3 enumC1710490uc3LIZIZ = null;
        if ((objLJJJLZIJ instanceof AbstractC1710370ubr) && (abstractC1710370ubr = (AbstractC1710370ubr) objLJJJLZIJ) != null) {
            enumC1710490uc3LIZIZ = abstractC1710370ubr.LIZIZ();
        }
        if (!C13LP.LJJJJ(enumC1710490uc3LIZIZ, C1697810uHb.LJIIJJI(EnumC1710490uc3.EXPIRATION_DATE, EnumC1710490uc3.CVV))) {
            return 2;
        }
        return 1;
    }
}
