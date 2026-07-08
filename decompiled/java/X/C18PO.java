package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.CancellationException;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18PO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18PO {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        C01GW c01gw = C21278818Pa.LIZ;
        Aweme aweme = C21278818Pa.LIZIZ;
        if (aweme == null) {
            return "";
        }
        C21279318Pf c21279318PfLIZJ = C21278818Pa.LIZJ(aweme, null);
        if (c21279318PfLIZJ == null) {
            return "";
        }
        VSACardsResponse.VSACardData vSACardData = c21279318PfLIZJ.LJFF;
        String str = vSACardData != null ? vSACardData.cardSchema : null;
        if ((true ^ (str == null || a0.LJJJIL(str)) ? str : null) == null) {
            return "";
        }
        try {
            return AnonymousClass0185.LJ(UriProtector.parse(str), "previous_page");
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return "";
        }
    }
}
