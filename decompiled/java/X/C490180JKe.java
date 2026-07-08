package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.google.gson.n;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0JKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490180JKe implements InterfaceC736910SvR<C0JKY> {
    public static final C490180JKe LL = new C490180JKe();
    public static final HashMap<String, n> LLILLJJLI = new HashMap<>();
    public static final C490480JLi LLILLL = new C490480JLi();

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final InterfaceC149400hg getOperator() {
        return LLILLL;
    }

    public static void LIZ(n nVar) {
        if (nVar != null) {
            HashMap<String, n> map = LLILLJJLI;
            map.clear();
            map.put(String.valueOf(UserService.getInstance().user().getCurrentUserId()), nVar);
        }
    }
}
