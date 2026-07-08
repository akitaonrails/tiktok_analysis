package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchResponse;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import java.util.Map;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC645560PTu {
    public static final /* synthetic */ int LJI = 0;
    public EnumC645610PTz LIZ;
    public String LIZIZ = "";
    public int LIZJ = -1;
    public Aweme LIZLLL;
    public String LJ;
    public Integer LJFF;

    public void LIZJ(Aweme aweme) {
    }

    public abstract ClickSearchViewModel LJ();

    public final boolean LIZIZ(C0PQX c0pqx) {
        try {
            if (c0pqx.LIZ == this.LIZ) {
                ClickSearchViewModel clickSearchViewModelLJ = LJ();
                EnumC645610PTz enumC645610PTz = this.LIZ;
                clickSearchViewModelLJ.getClass();
                if (ClickSearchViewModel.AQ2(enumC645610PTz)) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final void LJFF(C0PQX c0pqx) {
        EcClickSearchResponse ecClickSearchResponse;
        String str;
        Integer num;
        int iIntValue;
        EcClickSearchResponse ecClickSearchResponse2;
        if (LIZIZ(c0pqx) && c0pqx.LJI != null) {
            ClickSearchViewModel clickSearchViewModelLJ = LJ();
            AwS411S0200000_10 awS411S0200000_10 = new AwS411S0200000_10(c0pqx, this, 4);
            C0QRC<EcClickSearchResponse> c0qrc = c0pqx.LJI;
            if (c0qrc != null && (ecClickSearchResponse = c0qrc.LIZIZ) != null && ecClickSearchResponse.wordsList != null) {
                clickSearchViewModelLJ.FQ2();
                C0QRC<EcClickSearchResponse> c0qrc2 = c0pqx.LJI;
                if (c0qrc2 != null && (ecClickSearchResponse2 = c0qrc2.LIZIZ) != null) {
                    str = ecClickSearchResponse2.qrecVirtualEnable;
                } else {
                    str = null;
                }
                Intrinsics.LJFF(str, "1");
                if (((Boolean) awS411S0200000_10.invoke()).booleanValue() && (num = clickSearchViewModelLJ.LLIZ) != null && (iIntValue = num.intValue()) != -1) {
                    InterfaceC594520NTm interfaceC594520NTmLJIIIIZZ = C1202104n5.LIZ().LJIIIIZZ(c0pqx);
                    IEcomGeneralSearchService iEcomGeneralSearchServiceLIZ = C1202104n5.LIZ();
                    EnumC645610PTz enumC645610PTz = c0pqx.LIZ;
                    if (enumC645610PTz == null) {
                        enumC645610PTz = EnumC645610PTz.PRODUCT_IN_PRODUCT_CARD;
                    }
                    String str2 = c0pqx.LIZJ;
                    if (str2 == null) {
                        str2 = "";
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("position ");
                    sbLIZ.append(iIntValue);
                    iEcomGeneralSearchServiceLIZ.LJJ(enumC645610PTz, str2, "insert", C2188811AlT.LIZIZ(sbLIZ), Boolean.TRUE);
                    clickSearchViewModelLJ.zQ2(interfaceC594520NTmLJIIIIZZ, iIntValue);
                }
            }
            this.LJ = null;
            this.LJFF = null;
        }
    }

    public final void LJI(int i) {
        LJ().CQ2();
        ClickSearchViewModel clickSearchViewModelLJ = LJ();
        EnumC645610PTz enumC645610PTz = this.LIZ;
        clickSearchViewModelLJ.getClass();
        if (ClickSearchViewModel.AQ2(enumC645610PTz)) {
            ClickSearchViewModel clickSearchViewModelLJ2 = LJ();
            if (i == -1) {
                i = this.LIZJ;
            }
            clickSearchViewModelLJ2.xQ2().setValue(new C645520PTq(i, EnumC645530PTr.ENTER_DETAIL));
            ((C645550PTt) clickSearchViewModelLJ2.LLJILJILJ.getValue()).LIZIZ(i);
            C0PR3 c0pr3 = (C0PR3) clickSearchViewModelLJ2.LLJILLL.getValue();
            if (c0pr3 != null) {
                c0pr3.LIZIZ(i);
            }
        }
    }

    public AbstractC645560PTu(EnumC645610PTz enumC645610PTz, ClickSearchViewModel clickSearchViewModel) {
        this.LIZ = enumC645610PTz;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC645590PTx LIZLLL(X.EnumC645610PTz r7, com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC645560PTu.LIZLLL(X.0PTz, com.ss.android.ugc.aweme.feed.model.Aweme):X.0PTx");
    }

    public final void LIZ(int i, Aweme aweme, String str) {
        if (str.length() > 0) {
            this.LIZIZ = str;
        }
        if (i != -1) {
            this.LIZJ = i;
        }
        if (aweme != null) {
            this.LIZLLL = aweme;
        }
    }

    public final void LJII(String str, String str2, int i, Map<String, ? extends Object> map, EnumC645590PTx enumC645590PTx, C0PUB c0pub) {
        ClickSearchViewModel clickSearchViewModelLJ = LJ();
        EnumC645610PTz enumC645610PTz = this.LIZ;
        clickSearchViewModelLJ.getClass();
        boolean z = true;
        if (!ClickSearchViewModel.AQ2(enumC645610PTz)) {
            IEcomGeneralSearchService iEcomGeneralSearchServiceLIZ = C1202104n5.LIZ();
            EnumC645610PTz enumC645610PTz2 = this.LIZ;
            if (enumC645590PTx != EnumC645590PTx.ECOM) {
                z = false;
            }
            iEcomGeneralSearchServiceLIZ.LJJ(enumC645610PTz2, str2, "fail", "exp disable", Boolean.valueOf(z));
            return;
        }
        if (enumC645590PTx == null) {
            C1202104n5.LIZ().LJJ(this.LIZ, str2, "fail", "query/src no ecom intent", null);
            return;
        }
        int i2 = C645600PTy.LIZIZ[enumC645590PTx.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (LJ().LLJ) {
                        C1202104n5.LIZ().LJJ(this.LIZ, str2, "fail", "isRSInNextLine, break", Boolean.TRUE);
                        return;
                    } else if (LJ().LLILZLL) {
                        return;
                    }
                } else {
                    throw new C1954807lC();
                }
            }
        } else if (LJ().LLIZLLLIL || LJ().LLILZLL) {
            return;
        }
        this.LJ = str2;
        this.LJFF = Integer.valueOf(i);
        LJ().vQ2(this.LIZ, str, str2, i, map, enumC645590PTx, c0pub);
    }
}
