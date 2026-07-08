package X;

import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS61S1000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0POK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0POK implements C0PN3 {
    public static final /* synthetic */ int LLLJL = 0;
    public SearchResultParam LL;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public String LLIZ;
    public int LLIZLLLIL;
    public C0PSG LLJ;
    public int LLJIJIL;
    public Integer LLJILJIL;
    public Integer LLJILJILJ;
    public Integer LLJILLL;
    public int LLJJ;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public String LLJJJJLIIL;
    public Integer LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public String LLJLIL;
    public String LLJLLL;
    public Integer LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public String LLLFFI;
    public String LLLFZ;
    public String LLLI;
    public boolean LLLII;
    public Integer LLLIIII;
    public String LLLIIIIL;
    public Long LLLIIIL;
    public Long LLLIIL;
    public Long LLLIILIL;
    public Long LLLIL;
    public String LLLILZ;
    public int LLLILZJ;
    public String LLILLJJLI = "";
    public String LLILZLL = "";
    public String LLJI = "";
    public String LLJJI = "";
    public String LLJJIII = "";
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(317));
    public Long LLJLILLLLZIIL = 0L;
    public Long LLJLL = 0L;
    public Long LLJLLIL = 0L;
    public Integer LLLF = 0;
    public Integer LLLFF = 0;
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(318));
    public int LLLIZZ = -1;
    public int LLLJ = -1;
    public String LLLJIL = "";

    static {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (C0PO4.LIZ == 0) {
            C0PO4.LIZ = C341940Daq.LIZIZ(C14KQ.LJIIIIZZ(contextLIZ));
        }
        if (C0PO4.LIZIZ == 0) {
            C0PO4.LIZIZ = C341940Daq.LIZIZ(C14KQ.LJ(contextLIZ));
        }
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LLILLJJLI.hashCode() * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZLLLIL) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL) * 31;
        Integer num = this.LLJILJIL;
        int iIntValue = (iHashCode + (num != null ? num.intValue() : -1)) * 31;
        Integer num2 = this.LLJILJILJ;
        int iIntValue2 = (iIntValue + (num2 != null ? num2.intValue() : -1)) * 31;
        Integer num3 = this.LLJILLL;
        return iIntValue2 + (num3 != null ? num3.intValue() : -1);
    }

    public final String toString() {
        return "SearchMixFeedRequest(keyword='" + this.LLILLJJLI + "', cursor=" + this.LLILLL + ", count=" + this.LLILZ + ", pullRefresh=" + this.LLILZIL + ", searchId='" + this.LLILZLL + "', correctType=" + this.LLIZLLLIL + ", searchSource='" + this.LLJI + "', hotSearchSource=" + this.LLJIJIL + ", sortType=" + this.LLJILJILJ + ", filterBy=" + this.LLJILLL + ", clientWidth=" + this.LLJJ + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x072d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C15O7<X.C1515820pY4<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList>> LIZIZ() {
        /*
            Method dump skipped, instruction units count: 1852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0POK.LIZIZ():X.15O7");
    }

    public static int LIZJ(String str) {
        EnumC1876780ywG enumC1876780ywGLIZ;
        if (((IPNSConsentSDKConfigService) ServiceManager.get().getService(IPNSConsentSDKConfigService.class)).LIZ() != null && (enumC1876780ywGLIZ = C1915720zx4.LIZ(str, null)) != null) {
            return enumC1876780ywGLIZ.getI();
        }
        return EnumC1876780ywG.CONSENT_NOT_PRESENT_IN_CACHE.getI();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(C0POK.class, obj.getClass())) {
            return false;
        }
        C0POK c0pok = (C0POK) obj;
        if (this.LLILLL == c0pok.LLILLL && this.LLILZ == c0pok.LLILZ && this.LLILZIL == c0pok.LLILZIL && this.LLIZLLLIL == c0pok.LLIZLLLIL && this.LLJIJIL == c0pok.LLJIJIL && Intrinsics.LJFF(this.LLJILJILJ, c0pok.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c0pok.LLJILLL) && Intrinsics.LJFF(this.LLILLJJLI, c0pok.LLILLJJLI) && Intrinsics.LJFF(this.LLILZLL, c0pok.LLILZLL) && Intrinsics.LJFF(this.LLJI, c0pok.LLJI)) {
            return true;
        }
        return false;
    }

    @Override // X.C0PN3
    public final void LIZ(int i, String str) {
        Long lValueOf;
        this.LLLII = true;
        this.LLLIIII = Integer.valueOf(i);
        this.LLLIIIIL = str;
        Long l = this.LLLIIIL;
        if (l != null) {
            lValueOf = Long.valueOf(System.currentTimeMillis() - l.longValue());
        } else {
            lValueOf = null;
        }
        this.LLLIIL = lValueOf;
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParam = this.LL;
        c644060POa.getClass();
        C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
        c0po5LJII.LJIILIIL();
        c0po5LJII.LJIL(2);
        if (!Intrinsics.LJFF(c0po5LJII, C640870PBt.LIZ)) {
            c0po5LJII.LJIIZILJ = i;
        }
        c0po5LJII.LIZLLL();
        C644210POp c644210POp = C644210POp.LIZ;
        AwS61S1000000_10 awS61S1000000_10 = new AwS61S1000000_10(str, 5);
        c644210POp.getClass();
        awS61S1000000_10.invoke(C644210POp.LJ);
    }
}
