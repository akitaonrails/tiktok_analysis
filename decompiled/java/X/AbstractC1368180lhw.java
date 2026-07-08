package X;

import Y.AfS190S0100000_21;
import Y.AfS2S1101100_21;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.impl.experiment.ShareSimpleFuzzySearchConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lhw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1368180lhw extends AbstractC1381820m3w {
    public final String LLJ;
    public volatile String LLJI;
    public InterfaceC1368140lhs LLJIJIL;
    public final C01GW LLJILJIL;
    public final boolean LLJILJILJ;
    public final C557050Lt1 LLJILLL;
    public final C054G LLJJ;

    @Override // X.AbstractC1381820m3w, X.InterfaceC1369300ljk
    public final void LIZJ() {
        this.LLJIJIL = null;
        LJIIIZ().LJ();
        try {
            if (C2296808zG.LJI(this.LLJJ)) {
                C2296808zG.LIZJ(this.LLJJ, null);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final C11NJ LJIIIZ() {
        return (C11NJ) this.LLJILJIL.getValue();
    }

    public AbstractC1368180lhw(C1368260li4 c1368260li4) {
        super(c1368260li4);
        this.LLJ = "SupportSearchRelationModel";
        this.LLJILJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(696));
        this.LLJILJILJ = c1368260li4.LJIIJ;
        this.LLJILLL = new C557050Lt1(false);
        this.LLJJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    }

    @Override // X.AbstractC1381820m3w, X.InterfaceC1369300ljk
    public final void LJJZZIII(String str) {
        String string;
        if (str != null) {
            string = a0.LJLIIIL(str).toString();
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        if (string.length() > 0) {
            this.LLJI = string;
            String str2 = this.LLJI;
            if (str2 != null && str2.length() != 0) {
                List<IMContact> listData = data();
                final String str3 = this.LLJI;
                if (str3 != null) {
                    this.LLJI = null;
                    LJIIIZ().LJ();
                    long jNanoTime = System.nanoTime();
                    C19484011Ks c19484011KsLJJIJIIJI = AbstractC19484711Kz.LJII(new C1368190lhx(this, str3, listData)).LJJIJIIJI(C11S5.LIZ());
                    C19484011Ks c19484011KsLJJIJIIJI2 = AbstractC19484711Kz.LJII(new C1266100j3I(listData, str3, 2)).LJJIJIIJI(C11S5.LIZ());
                    InterfaceC500500Jk0 interfaceC500500Jk0 = new InterfaceC500500Jk0() { // from class: X.0Jjs
                        @Override // X.InterfaceC500500Jk0
                        public final Object apply(Object obj, Object obj2) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll((Collection) obj);
                            arrayList.addAll((Collection) obj2);
                            return arrayList;
                        }
                    };
                    final double dNanoTime = (System.nanoTime() - jNanoTime) / 1000000.0d;
                    final int size = ((ArrayList) listData).size();
                    LJIIIZ().LIZ(AbstractC19484711Kz.LJJJ(c19484011KsLJJIJIIJI, c19484011KsLJJIJIIJI2, interfaceC500500Jk0).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0lhr
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("SupportSearchRelationModel@b348.doRealSearch$1");
                            List<IMContact> list = (List) obj;
                            InterfaceC1368140lhs interfaceC1368140lhs = this.LL.LLJIJIL;
                            if (interfaceC1368140lhs != null) {
                                interfaceC1368140lhs.bK(list, str3, Integer.valueOf(size), Double.valueOf(dNanoTime), Double.valueOf(0.0d));
                            }
                            C1C7U.LIZIZ("SupportSearchRelationModel@b348.doRealSearch$1");
                        }
                    }, new AfS190S0100000_21(this, 33)));
                    return;
                }
                return;
            }
            return;
        }
        this.LLJI = null;
        InterfaceC1368140lhs interfaceC1368140lhs = this.LLJIJIL;
        if (interfaceC1368140lhs == null) {
            return;
        }
        interfaceC1368140lhs.qN2("", new ArrayList());
    }

    @Override // X.AbstractC1381820m3w, X.InterfaceC1369300ljk
    public final void LIZIZ(String str, String str2) {
        String string;
        int iIntValue;
        Integer num;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null) {
            string = "";
        }
        this.LLJI = string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call search with keyword = ");
        sbLIZ.append(this.LLJI);
        C2188811AlT.LIZIZ(sbLIZ);
        if (string.length() == 0) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("search: new keyword = ");
        sbLIZ2.append(this.LLJI);
        sbLIZ2.append(", is active = ");
        sbLIZ2.append(C2296808zG.LJI(this.LLJJ));
        sbLIZ2.append(", is searching = ");
        sbLIZ2.append(this.LLJILLL.LIZIZ());
        C2188811AlT.LIZIZ(sbLIZ2);
        if (C1368200lhy.LIZ()) {
            String str3 = this.LLJI;
            if (str3 != null && str3.length() != 0) {
                List<IMContact> listData = data();
                String str4 = this.LLJI;
                if (str4 != null) {
                    this.LLJI = null;
                    LJIIIZ().LJ();
                    long jNanoTime = System.nanoTime();
                    int size = ((ArrayList) listData).size();
                    C19484011Ks c19484011KsLJJIJIIJI = AbstractC19484711Kz.LJII(new C1368190lhx(this, str4, listData)).LJJIJIIJI(C11S5.LIZ());
                    C19484011Ks c19484011KsLJJIJIIJI2 = AbstractC19484711Kz.LJII(new C1266100j3I(listData, str4, 2)).LJJIJIIJI(C11S5.LIZ());
                    InterfaceC500500Jk0 interfaceC500500Jk0 = new InterfaceC500500Jk0() { // from class: X.0Jjt
                        @Override // X.InterfaceC500500Jk0
                        public final Object apply(Object obj, Object obj2) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll((Collection) obj);
                            arrayList.addAll((Collection) obj2);
                            return arrayList;
                        }
                    };
                    int length = str4.length();
                    ShareSimpleFuzzySearchConfig shareSimpleFuzzySearchConfig = (ShareSimpleFuzzySearchConfig) C1368200lhy.LIZIZ.getValue();
                    if (shareSimpleFuzzySearchConfig != null && (num = shareSimpleFuzzySearchConfig.threshold) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = Integer.MAX_VALUE;
                    }
                    if (length <= iIntValue) {
                        LJIIIZ().LIZ(AbstractC19484711Kz.LJJJ(c19484011KsLJJIJIIJI, c19484011KsLJJIJIIJI2, interfaceC500500Jk0).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS2S1101100_21(jNanoTime, this, str4, size, 0), new AfS190S0100000_21(this, 34)));
                        return;
                    } else {
                        LJIIIZ().LIZ(AbstractC19484711Kz.LJJIZ(c19484011KsLJJIJIIJI, c19484011KsLJJIJIIJI2, AbstractC19484711Kz.LJII(new C1402250mat(this, str4, listData, 1)).LJJIJIIJI(C11S5.LIZIZ), new InterfaceC953020auK() { // from class: X.0lk6
                            @Override // X.InterfaceC953020auK
                            public final Object LIZ(Object obj, Object obj2, Object obj3) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.addAll((Collection) obj);
                                List listLJLIL = C13LP.LJLIL((Iterable) obj3, (Collection) obj2);
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj4 : (ArrayList) listLJLIL) {
                                    if (hashSet.add(((BaseContact) obj4).getUid())) {
                                        arrayList2.add(obj4);
                                    }
                                }
                                arrayList.addAll(arrayList2);
                                return arrayList;
                            }
                        }).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS2S1101100_21(jNanoTime, this, str4, size, 1), new AfS190S0100000_21(this, 35)));
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (!C2296808zG.LJI(this.LLJJ) || !this.LLJILLL.LIZ(false, true)) {
            return;
        }
        C23250099c.LIZLLL(this.LLJJ, null, null, new C1368170lhv(this, str2, null), 3);
    }
}
