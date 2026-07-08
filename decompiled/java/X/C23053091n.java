package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.091n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23053091n {
    public static final C23053091n LIZ = new C23053091n();
    public static final MutableLiveData<String> LIZIZ = new MutableLiveData<>("");
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(384));

    public static final BatchDetailList LIZ(int i, String str, String str2, String str3, String str4) {
        LIZ.getClass();
        return ((DetailFeedService) LIZJ.getValue()).LIZIZ(i, str, str2, str3, str4);
    }
}
