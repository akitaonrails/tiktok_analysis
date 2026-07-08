package X;

import Y.ARunnableS72S0200000_3;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.postpayment.impl.PostPaymentActionHostFragment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0uXM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707580uXM {
    public final C1707620uXQ LIZ;

    public C1707580uXM(C1707620uXQ c1707620uXQ) {
        this.LIZ = c1707620uXQ;
    }

    public static void LIZIZ(String str) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLSPostPayment, ");
        sbLIZ.append(str);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZ(AtomicBoolean atomicBoolean, C1707140uWe c1707140uWe, C1211110hcb c1211110hcb, C1707530uXH c1707530uXH, InterfaceC1707630uXR interfaceC1707630uXR) {
        boolean z;
        Object obj;
        final String upperCase;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        String str = c1707530uXH.LIZJ;
        if (str == null) {
            str = "completed";
        }
        InterfaceC1709310ua9 interfaceC1709310ua9LIZ = C1710990ucr.LIZ("CASHIER");
        interfaceC1709310ua9LIZ.setExtraParams(C2097908Jt.LIZJ(new Pair("action_session_id", c1211110hcb.actionSessionId)));
        Pair[] pairArr = new Pair[5];
        String str2 = c1707140uWe.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[0] = new Pair("action", str2);
        String str3 = c1707140uWe.LIZIZ;
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("action_url_present", obj);
        pairArr[2] = new Pair("page_name", "order_submit");
        if (!Intrinsics.LJFF(str, "completed")) {
            str4 = "1";
        }
        pairArr[3] = new Pair("result", str4);
        pairArr[4] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        interfaceC1709310ua9LIZ.LIZ("rd_pipo_post_payment_action_result", C2097608Jq.LJI(pairArr));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action finished: ");
        sbLIZ.append(str);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        String str5 = PostPaymentActionHostFragment._pnsPageId;
        String str6 = c1707140uWe.LIZ;
        if (str6 != null) {
            upperCase = str6.toUpperCase(Locale.ROOT);
        } else {
            upperCase = null;
        }
        final String str7 = c1211110hcb.actionSessionId;
        if (upperCase != null && !a0.LJJJIL(upperCase) && !a0.LJJJIL(str7)) {
            Runnable runnable = new Runnable() { // from class: X.0hca
                public final void LIZ() throws JSONException {
                    List<PostPaymentActionHostFragment> listLLIIII;
                    Set<PostPaymentActionHostFragment> set = PostPaymentActionHostFragment.LLJJ;
                    synchronized (set) {
                        try {
                            listLLIIII = C13LP.LLIIII(set);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    String str8 = upperCase;
                    String str9 = str7;
                    for (PostPaymentActionHostFragment postPaymentActionHostFragment : listLLIIII) {
                        C19EG activity = postPaymentActionHostFragment.getActivity();
                        if (activity != null && !activity.isFinishing() && !activity.isDestroyed() && Intrinsics.LJFF(postPaymentActionHostFragment.LLJILJIL, str8)) {
                            C1211110hcb c1211110hcb2 = postPaymentActionHostFragment.LLJILJILJ;
                            if (Intrinsics.LJFF(c1211110hcb2 != null ? c1211110hcb2.actionSessionId : null, str9)) {
                                postPaymentActionHostFragment.ip("before_business_notify", true);
                            }
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PostPaymentActionHostFragment$Companion@7ae4.closeBeforeBusinessNotify$closeTask$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PostPaymentActionHostFragment$Companion@7ae4.closeBeforeBusinessNotify$closeTask$1");
                }
            };
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                runnable.run();
            } else {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C786410Ut5.LJJZZIII(PostPaymentActionHostFragment.LLJILLL, new ARunnableS72S0200000_3(runnable, countDownLatch, 12));
                countDownLatch.await();
            }
        }
        interfaceC1707630uXR.LIZ(new C1707530uXH(c1707530uXH.LIZ, c1707530uXH.LIZIZ, str));
    }
}
