package Y;

import X.AbstractC707180Roa;
import X.C0RRI;
import X.C0WIY;
import X.C1C7U;
import X.C20684815ws;
import X.C705790RmL;
import X.C737380SwC;
import X.C737390SwD;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.api.FeedActionApi;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes12.dex */
public class ACallableS243S0200000_11 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS243S0200000_11 aCallableS243S0200000_11) {
        C1C7U.LIZ("IItemDislikeModel@90db.sendRequest$1");
        if (((C737380SwC) aCallableS243S0200000_11.l1).LL.booleanValue()) {
            ShareDependService.LIZ.getClass();
            ShareDependService shareDependServiceLJJJJI = ShareDependServiceImpl.LJJJJI();
            Object[] objArr = (Object[]) aCallableS243S0200000_11.l0;
            String strLJJIIJ = shareDependServiceLJJJJI.LJJIIJ(((Integer) objArr[1]).intValue(), (Aweme) objArr[0], "1");
            C1C7U.LIZIZ("IItemDislikeModel@90db.sendRequest$1");
            return strLJJIIJ;
        }
        ShareDependService.LIZ.getClass();
        ShareDependService shareDependServiceLJJJJI2 = ShareDependServiceImpl.LJJJJI();
        Object[] objArr2 = (Object[]) aCallableS243S0200000_11.l0;
        String strLJJIIJ2 = shareDependServiceLJJJJI2.LJJIIJ(((Integer) objArr2[1]).intValue(), (Aweme) objArr2[0], "");
        C1C7U.LIZIZ("IItemDislikeModel@90db.sendRequest$1");
        return strLJJIIJ2;
    }

    public static final Object call$1(ACallableS243S0200000_11 aCallableS243S0200000_11) {
        C1C7U.LIZ("FeedMultiTagLayout@629c.addCustomView$1");
        ((C705790RmL) aCallableS243S0200000_11.l0).addView((AbstractC707180Roa) aCallableS243S0200000_11.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedMultiTagLayout@629c.addCustomView$1");
        return unit;
    }

    public static final Object call$2(ACallableS243S0200000_11 aCallableS243S0200000_11) {
        C1C7U.LIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.updateViewBottomMargin$1");
        ((C0RRI) aCallableS243S0200000_11.l0).LLILLJJLI.Yh((View) aCallableS243S0200000_11.l1);
        Boolean bool = Boolean.FALSE;
        C1C7U.LIZIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.updateViewBottomMargin$1");
        return bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, X.0SJF] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, X.0SHm] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$3(Y.ACallableS243S0200000_11 r21) {
        /*
            java.lang.String r3 = "NewVideoDescDelegate@fb8f.preProcessHashtagTruncation$1"
            X.C1C7U.LIZ(r3)
            r1 = r21
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            com.ss.android.ugc.aweme.editpost.ClientText r0 = r0.getOriginalClientText()
            if (r0 == 0) goto L77
            java.lang.Object r4 = r1.l1
            X.0SHj r4 = (X.C718770SHj) r4
            java.lang.Object r8 = r1.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = (com.ss.android.ugc.aweme.feed.model.Aweme) r8
            r4.getClass()
            X.00zU r11 = new X.00zU
            r11.<init>()
            X.0SJF r0 = X.C718770SHj.LJJLIL(r8, r0)
            r11.element = r0
            X.00zU r12 = new X.00zU
            r12.<init>()
            T r1 = r11.element
            X.0SJF r1 = (X.C0SJF) r1
            X.0SHm r5 = r4.LLJZIJLIL
            if (r5 != 0) goto L39
            r0 = 0
            X.0SHm r5 = r4.LJIILIIL(r1, r8, r0)
        L39:
            r12.element = r5
            int r6 = r4.LLLFFI
            r7 = 0
            r9 = 1
            r10 = r7
            kotlin.Pair r2 = r4.LJLL(r5, r6, r7, r8, r9, r10)
            X.0SFO r0 = X.C0SFR.LIZ
            java.lang.String r16 = r8.getAid()
            T r1 = r11.element
            X.0SJF r1 = (X.C0SJF) r1
            java.lang.Object r0 = r2.getFirst()
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.String r19 = "preProcess"
            kotlin.jvm.internal.AwS170S0400000_11 r10 = new kotlin.jvm.internal.AwS170S0400000_11
            r15 = 3
            r13 = r4
            r14 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            r20 = 0
            r18 = r0
            r21 = r10
            r17 = r1
            X.C0SFR.LIZ(r16, r17, r18, r19, r20, r21)
            T r0 = r11.element
            X.0SJF r0 = (X.C0SJF) r0
            if (r0 == 0) goto L77
            java.lang.CharSequence r0 = X.C0SJF.LIZ(r0)
        L73:
            X.C1C7U.LIZIZ(r3)
            return r0
        L77:
            java.lang.String r0 = ""
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS243S0200000_11.call$3(Y.ACallableS243S0200000_11):java.lang.Object");
    }

    public static final Object call$4(ACallableS243S0200000_11 aCallableS243S0200000_11) {
        C1C7U.LIZ("VideoDiggVM@76c8.handleVideoDigg$1");
        if (TextUtils.equals("opus", ((VideoDiggVM) aCallableS243S0200000_11.l0).eventType)) {
            VideoDiggVM videoDiggVM = (VideoDiggVM) aCallableS243S0200000_11.l0;
            if (videoDiggVM.isMyProfile) {
                videoDiggVM.getContext();
                C20684815ws.LJIIJ(0L, "like", "personal_homepage", ((Aweme) aCallableS243S0200000_11.l1).getAid(), ((VideoDiggVM) aCallableS243S0200000_11.l0).zj());
            } else {
                videoDiggVM.getContext();
                C20684815ws.LJIIJ(0L, "like", "others_homepage", ((Aweme) aCallableS243S0200000_11.l1).getAid(), ((VideoDiggVM) aCallableS243S0200000_11.l0).zj());
            }
        } else {
            ((VideoDiggVM) aCallableS243S0200000_11.l0).getContext();
            C20684815ws.LJIIJ(0L, "like", ((VideoDiggVM) aCallableS243S0200000_11.l0).eventType, ((Aweme) aCallableS243S0200000_11.l1).getAid(), ((VideoDiggVM) aCallableS243S0200000_11.l0).zj());
        }
        C1C7U.LIZIZ("VideoDiggVM@76c8.handleVideoDigg$1");
        return null;
    }

    public static final Object call$5(ACallableS243S0200000_11 aCallableS243S0200000_11) throws Throwable {
        C737390SwD c737390SwD = (C737390SwD) aCallableS243S0200000_11.l0;
        Object[] objArr = (Object[]) aCallableS243S0200000_11.l1;
        c737390SwD.getClass();
        C1C7U.LIZ("ItemDiggModel@dcfa.sendRequest$1L");
        HashMap map = (HashMap) objArr[0];
        c737390SwD.LL = CastIntegerProtector.parseInt((String) map.get("type"));
        C0WIY<String, Integer> c0wiyLIZLLL = FeedActionApi.LIZLLL(map);
        C1C7U.LIZIZ("ItemDiggModel@dcfa.sendRequest$1L");
        return c0wiyLIZLLL;
    }

    public ACallableS243S0200000_11(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }

    public ACallableS243S0200000_11(C0RRI c0rri, View view, int i, int i2) {
        this.$t = i2;
        this.l0 = c0rri;
        this.l1 = view;
    }
}
