package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iDr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234210iDr extends C09AY implements Function0<Map<String, String>> {
    public final /* synthetic */ C2005607tO LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1233510iCj LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ User LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1234210iDr(C2005607tO c2005607tO, boolean z, C1233510iCj c1233510iCj, long j, Integer num, User user, String str) {
        super(0);
        this.LL = c2005607tO;
        this.LLILLJJLI = z;
        this.LLILLL = c1233510iCj;
        this.LLILZ = j;
        this.LLILZIL = num;
        this.LLILZLL = user;
        this.LLIZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, String> invoke() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C2005607tO c2005607tO = this.LL;
        boolean z = this.LLILLJJLI;
        c2005607tO.getClass();
        c2344009Gk.LJIIIIZZ("is_login", AbstractC1223210hw7.LIZJ(z));
        c2344009Gk.LIZJ(this.LLILLL.LJ.getRawValue(), "share_type");
        c2344009Gk.LJIIIIZZ("share_source", this.LLILLL.LJFF);
        c2344009Gk.LJIIIIZZ("share_link_id", this.LLILLL.LIZ);
        c2344009Gk.LJIIIIZZ("share_uid", this.LLILLL.LIZIZ);
        c2344009Gk.LJIIIIZZ("checksum", this.LLILLL.LIZLLL);
        c2344009Gk.LIZLLL(this.LLILZ, "api_cost");
        Integer num = this.LLILZIL;
        User user = this.LLILZLL;
        String str = this.LLIZ;
        if (num != null && num.intValue() != 0) {
            c2344009Gk.LIZJ(num.intValue(), "error_code");
        }
        if (user != null) {
            c2344009Gk.LIZJ(user.getFollowStatus(), "follow_status");
            c2344009Gk.LJFF("is_succeed", "1");
        } else {
            c2344009Gk.LJFF("is_succeed", CardStruct.IStatusCode.DEFAULT);
        }
        if (!(str == null || str.length() == 0)) {
            try {
                Iterator<T> it2 = ((n) C08JS.LIZ(str, n.class)).entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    c2344009Gk.LJFF((String) entry.getKey(), ((k) entry.getValue()).LJIL());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("@LinkRelation", "parse statusMsg error", th);
            }
        }
        return c2344009Gk.LIZ;
    }
}
