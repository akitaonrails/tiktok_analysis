package X;

import Y.AObserverS236S0100000_34;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1BHA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BHA extends C1BHV {
    public static String LLILZ = "safe";
    public String LLILLJJLI = "";
    public SearchLandingPageViewModel LLILLL;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1.equals("not_secure") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r1.equals("protection") == false) goto L4;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ() {
        /*
            r2 = this;
            java.lang.String r1 = X.C1BHA.LLILZ
            int r0 = r1.hashCode()
            switch(r0) {
                case -1684858151: goto Lc;
                case -1380616235: goto L15;
                case -1095865757: goto L25;
                case 226612223: goto L2e;
                case 336650556: goto L3e;
                default: goto L9;
            }
        L9:
            java.lang.String r0 = r2.LLILLJJLI
            return r0
        Lc:
            java.lang.String r0 = "protection"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L49
            goto L9
        L15:
            java.lang.String r0 = "broken"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            r0 = 2131847171(0x7f116803, float:1.9327812E38)
            java.lang.String r0 = X.C20642515q3.LJI(r0)
            return r0
        L25:
            java.lang.String r0 = "not_secure"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L49
            goto L9
        L2e:
            java.lang.String r0 = "no_internet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            r0 = 2131847167(0x7f1167ff, float:1.9327804E38)
            java.lang.String r0 = X.C20642515q3.LJI(r0)
            return r0
        L3e:
            java.lang.String r0 = "loading"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r0 = ""
            return r0
        L49:
            r0 = 2131847176(0x7f116808, float:1.9327822E38)
            java.lang.String r0 = X.C20642515q3.LJI(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BHA.LIZIZ():java.lang.String");
    }

    @Override // X.C1BHV, X.C1BHQ
    public final void LIZ(SparkThirdContext sparkThirdContext) {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        if (sparkThirdContext == null) {
            return;
        }
        C19EG c19eg = (C19EG) sparkThirdContext.container;
        SearchLandingPageViewModel searchLandingPageViewModel = (SearchLandingPageViewModel) ViewModelProviders.of(c19eg).get(SearchLandingPageViewModel.class);
        this.LLILLL = searchLandingPageViewModel;
        if (searchLandingPageViewModel != null) {
            searchLandingPageViewModel.vQ2("safe");
        }
        SearchLandingPageViewModel searchLandingPageViewModel2 = this.LLILLL;
        if (searchLandingPageViewModel2 != null && (mutableLiveData2 = searchLandingPageViewModel2.LLILLJJLI) != null) {
            mutableLiveData2.observe(c19eg, new AObserverS236S0100000_34(this, 22));
        }
        SearchLandingPageViewModel searchLandingPageViewModel3 = this.LLILLL;
        if (searchLandingPageViewModel3 != null && (mutableLiveData = searchLandingPageViewModel3.LLILZ) != null) {
            mutableLiveData.observe(c19eg, new AObserverS236S0100000_34(this, 23));
        }
    }

    @Override // X.C1BHV, X.C1BHQ
    public final void setSubTitle(String str) {
        C1BH6.LIZ.getClass();
        C1BH6.LJ = str;
        try {
            String host = UriProtector.parse(str).getHost();
            if (host != null) {
                str = host;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (str.length() > 0) {
            str = C20642515q3.LJI(2131847179) + str;
        }
        super.setSubTitle(str);
    }

    @Override // X.C1BHV, X.C1BHQ
    public final void setTitle(String str) {
        this.LLILLJJLI = str;
        super.setTitle(LIZIZ());
    }
}
