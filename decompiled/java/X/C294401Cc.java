package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01Cc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C294401Cc<T, R> implements InterfaceC1487280oo2 {
    public static final C294401Cc<T, R> LL = new C294401Cc<>();

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            return Unit.LIZ;
        }
        throw new RuntimeException("server error");
    }
}
