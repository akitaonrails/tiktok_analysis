package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.feed.platform.ab.UnifyTouchDelegateScope;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695770RQx {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C695790RQz());

    public static final boolean LIZ(Context context, Aweme aweme, String str) {
        String genreType;
        boolean z;
        UnifyTouchDelegateScope unifyTouchDelegateScopeLIZIZ;
        UnifyTouchDelegateScope unifyTouchDelegateScopeLIZIZ2;
        List<String> list;
        List<String> list2;
        UnifyTouchDelegateScope unifyTouchDelegateScopeLIZIZ3;
        List<String> list3;
        List<String> list4;
        if (aweme == null || C0SXF.LJIL(context)) {
            return false;
        }
        if (C2105908Mv.LIZ(AwemeExtKt.getGenreType(aweme))) {
            genreType = "video";
        } else {
            genreType = AwemeExtKt.getGenreType(aweme);
        }
        UnifyTouchDelegateScope unifyTouchDelegateScopeLIZIZ4 = C695780RQy.LIZIZ();
        if (unifyTouchDelegateScopeLIZIZ4 != null && Intrinsics.LJFF(unifyTouchDelegateScopeLIZIZ4.enable, Boolean.TRUE)) {
            UnifyTouchDelegateScope unifyTouchDelegateScopeLIZIZ5 = C695780RQy.LIZIZ();
            if (unifyTouchDelegateScopeLIZIZ5 != null && (list4 = unifyTouchDelegateScopeLIZIZ5.scenes) != null && C13LP.LJJJJ(str, list4)) {
                z = true;
            } else {
                z = false;
            }
            if ((!z && ((unifyTouchDelegateScopeLIZIZ3 = C695780RQy.LIZIZ()) == null || (list3 = unifyTouchDelegateScopeLIZIZ3.scenes) == null || !list3.contains("all"))) || ((((unifyTouchDelegateScopeLIZIZ = C695780RQy.LIZIZ()) == null || (list2 = unifyTouchDelegateScopeLIZIZ.genres) == null || !C13LP.LJJJJ(genreType, list2)) && ((unifyTouchDelegateScopeLIZIZ2 = C695780RQy.LIZIZ()) == null || (list = unifyTouchDelegateScopeLIZIZ2.genres) == null || !list.contains("all"))) || ((InterfaceC1616630sAf) LIZ.getValue()).LJIIJ().isPad() == 1)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
