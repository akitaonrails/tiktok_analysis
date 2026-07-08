package Y;

import X.AbstractC1387200mCc;
import X.AbstractC316870CbV;
import X.C01GW;
import X.C04UB;
import X.C09JN;
import X.C0FNV;
import X.C1370950lmP;
import X.C1371430lnB;
import X.C1375020lsy;
import X.C1375200ltG;
import X.C1377850lxX;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1906580ziK;
import X.C1C7U;
import X.C20145713s7;
import X.C2344809Gs;
import X.C259800zU;
import X.C786410Ut5;
import X.C838130WuJ;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.comment.likelist.ui.LikeListFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareFlavorService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS174S0400000_21;

/* JADX INFO: loaded from: classes22.dex */
public class AfS69S0400000_21 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS69S0400000_21 afS69S0400000_21, Object obj) {
        C1C7U.LIZ("LikeListFragment@d138.fetchLikeList$2");
        ((LikeListFragment) afS69S0400000_21.l0).UR((LikeListResponse) obj, null, (InterfaceC1364105Vn) afS69S0400000_21.l1, (List) afS69S0400000_21.l2, (List) ((C259800zU) afS69S0400000_21.l3).element);
        C1C7U.LIZIZ("LikeListFragment@d138.fetchLikeList$2");
    }

    public static final void accept$1(AfS69S0400000_21 afS69S0400000_21, Object obj) {
        C1C7U.LIZ("LikeListFragment@d138.fetchLikeList$3");
        Throwable th = (Throwable) obj;
        LikeListResponse likeListResponseYQ2 = ((LikeListFragment) afS69S0400000_21.l0).PR().yQ2();
        if (likeListResponseYQ2 != null) {
            ((LikeListFragment) afS69S0400000_21.l0).UR(likeListResponseYQ2, null, (InterfaceC1364105Vn) afS69S0400000_21.l1, (List) afS69S0400000_21.l2, (List) ((C259800zU) afS69S0400000_21.l3).element);
        } else {
            ((LikeListFragment) afS69S0400000_21.l0).UR(null, th, (InterfaceC1364105Vn) afS69S0400000_21.l1, (List) afS69S0400000_21.l2, (List) ((C259800zU) afS69S0400000_21.l3).element);
        }
        C1C7U.LIZIZ("LikeListFragment@d138.fetchLikeList$3");
    }

    public static final void accept$2(AfS69S0400000_21 afS69S0400000_21, Object obj) {
        C1C7U.LIZ("BaseCopyAction@bb2c.execute$2");
        String str = (String) obj;
        SharePackage.Companion.getClass();
        if (str.length() > 0) {
            ShareFlavorService.LIZ.getClass();
            C04UB.LIZ().LIZLLL(str);
            C1377850lxX c1377850lxX = (C1377850lxX) afS69S0400000_21.l1;
            Context context = (Context) afS69S0400000_21.l2;
            Dialog dialog = (Dialog) ((C01GW) afS69S0400000_21.l3).getValue();
            c1377850lxX.getClass();
            try {
                C20145713s7.LIZJ((ClipboardManager) C786410Ut5.H2(context, "clipboard"), ClipData.newPlainText(str, str), CertProviderManagerKt.findCert("bpea-228", 1476399114));
                if (c1377850lxX.LLILLJJLI) {
                    C1389890mGx c1389890mGx = new C1389890mGx(dialog);
                    c1389890mGx.LIZ(true);
                    c1389890mGx.LJIIJ(context.getString(C1377850lxX.LIZIZ()));
                    c1389890mGx.LJIIJJI();
                }
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZ(e);
            }
        } else {
            C1389890mGx c1389890mGx2 = new C1389890mGx((Dialog) ((C01GW) afS69S0400000_21.l3).getValue());
            c1389890mGx2.LIZ(true);
            c1389890mGx2.LJIIIZ(2131848062);
            c1389890mGx2.LJIIJJI();
        }
        C0FNV.LIZ((Dialog) ((C01GW) afS69S0400000_21.l3).getValue());
        C1C7U.LIZIZ("BaseCopyAction@bb2c.execute$2");
    }

    public static final void accept$3(AfS69S0400000_21 afS69S0400000_21, Object obj) {
        Activity activityLIZ;
        Activity activityLIZIZ;
        C1C7U.LIZ("SilentLinkShareHandler@ae19.handle$1");
        C1371430lnB c1371430lnB = new C1371430lnB((String) obj, (String) null, 6);
        C1370950lmP c1370950lmP = SharePackage.Companion;
        AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(659);
        AwS174S0400000_21 awS174S0400000_21 = new AwS174S0400000_21((C1375200ltG) afS69S0400000_21.l0, (C1375200ltG) afS69S0400000_21.l1, (Context) afS69S0400000_21.l2, (C1375020lsy) afS69S0400000_21.l3, (Function1<? super C1375020lsy, Unit>) 0);
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        c1370950lmP.getClass();
        C1370950lmP.LIZIZ(null, c1371430lnB, activityLIZ, aFwS252S0000000_16, awS174S0400000_21);
        C1C7U.LIZIZ("SilentLinkShareHandler@ae19.handle$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS69S0400000_21(Object obj, LikeListFragment likeListFragment, InterfaceC1364105Vn<? super AbstractC316870CbV<List<User>>> interfaceC1364105Vn, List<? extends User> list, C259800zU<List<String>> c259800zU) {
        this.$t = c259800zU;
        this.l0 = obj;
        this.l1 = likeListFragment;
        this.l2 = interfaceC1364105Vn;
        this.l3 = list;
    }
}
