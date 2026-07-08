package X;

import com.ss.android.ugc.aweme.feed.api.BaseControllerContext;
import com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mBZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386550mBZ extends AbstractC1386560mBa<C0279007p> {
    @Override // X.InterfaceC1386630mBh
    public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
        return LJFF(c1387240mCg, null);
    }

    @Override // X.InterfaceC1386630mBh
    public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
        return LJII(c1387240mCg, null);
    }

    @Override // X.InterfaceC1386630mBh
    public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
        return LJI(c1387240mCg, null);
    }

    public static InterfaceC1282004zy LJ(Class cls, List list) {
        if (list == null) {
            return null;
        }
        for (Object obj : (ArrayList) list) {
            if (cls.isInstance(obj)) {
                return (InterfaceC1282004zy) cls.cast(obj);
            }
        }
        return null;
    }

    public static C0279007p LJFF(C1387240mCg c1387240mCg, List list) {
        IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
        BaseControllerContext baseControllerContext = c1387240mCg.LJI;
        C0279007p c0279007p = new C0279007p();
        String strLIZLLL = AbstractC1386560mBa.LIZLLL(iFeedMobParamsProvider, baseControllerContext);
        C1386540mBY c1386540mBY = (C1386540mBY) LJ(C1386540mBY.class, list);
        if (c1386540mBY != null && (Intrinsics.LJFF("chat", c1386540mBY.LL) || Intrinsics.LJFF(c1386540mBY.LL, "chat_inline_msg"))) {
            if (Intrinsics.LJFF("click_feed_dm_reply_msg", strLIZLLL)) {
                strLIZLLL = "click_quoted_message";
            }
            c0279007p.LL = strLIZLLL;
        }
        return c0279007p;
    }

    public static C0279007p LJI(C1387240mCg c1387240mCg, List list) {
        IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
        BaseControllerContext baseControllerContext = c1387240mCg.LJI;
        C0279007p c0279007p = new C0279007p();
        String strLIZLLL = AbstractC1386560mBa.LIZLLL(iFeedMobParamsProvider, baseControllerContext);
        C1386540mBY c1386540mBY = (C1386540mBY) LJ(C1386540mBY.class, list);
        if (c1386540mBY != null && (Intrinsics.LJFF("chat", c1386540mBY.LL) || Intrinsics.LJFF(c1386540mBY.LL, "chat_inline_msg"))) {
            if (Intrinsics.LJFF("click_feed_dm_reply_msg", strLIZLLL)) {
                strLIZLLL = "click_quoted_message";
            }
            c0279007p.LL = strLIZLLL;
        }
        return c0279007p;
    }

    public static C0279007p LJII(C1387240mCg c1387240mCg, List list) {
        IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
        BaseControllerContext baseControllerContext = c1387240mCg.LJI;
        C0279007p c0279007p = new C0279007p();
        String strLIZLLL = AbstractC1386560mBa.LIZLLL(iFeedMobParamsProvider, baseControllerContext);
        C1386540mBY c1386540mBY = (C1386540mBY) LJ(C1386540mBY.class, list);
        if (c1386540mBY != null && (Intrinsics.LJFF("chat", c1386540mBY.LL) || Intrinsics.LJFF(c1386540mBY.LL, "chat_inline_msg"))) {
            if (Intrinsics.LJFF("click_feed_dm_reply_msg", strLIZLLL)) {
                strLIZLLL = "click_quoted_message";
            }
            c0279007p.LL = strLIZLLL;
        }
        return c0279007p;
    }
}
