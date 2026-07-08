package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.UserResponse;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XHJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XHJ<V> implements Callable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    public C0XHJ(int i, String str, String str2, String str3, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        UserResponse userResponseLIZIZ;
        C1C7U.LIZ("UserApiPresenter@8386.update$1");
        String str = C0XHH.LIZ;
        String str2 = this.LL;
        String str3 = this.LLILLJJLI;
        int i = this.LLILLL;
        boolean z = this.LLILZ;
        String str4 = this.LLILZIL;
        boolean zLJI = MethodIDManager.LJI(202216);
        HashMap map = new HashMap();
        map.put("page_from", String.valueOf(i));
        if (str4 != null) {
            map.put("enter_source", str4);
        }
        if (Intrinsics.LJFF(str2, "unique_id")) {
            map.put("login_name", str3);
            map.put("mt_update_username", "mt_update_username");
            userResponseLIZIZ = C0XHH.LIZIZ(map);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            map.put(str2, str3);
            map.put("confirmed", z ? "1" : CardStruct.IStatusCode.DEFAULT);
            userResponseLIZIZ = C0XHH.LIZIZ(map);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
        C1C7U.LIZIZ("UserApiPresenter@8386.update$1");
        return userResponseLIZIZ;
    }
}
