package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsPaymentResultNativeQuerySettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.polling.PaymentFinishPollingActivity;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C908803gs {
    public static String LIZIZ;
    public static final C908803gs LIZ = new C908803gs();
    public static final ConcurrentHashMap<String, C897703f5> LIZJ = new ConcurrentHashMap<>();

    public static void LIZIZ() {
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZ("ec_pay_result_polling_done", "{}");
        }
    }

    public static void LIZ(C897703f5 c897703f5, String str) {
        LIZJ.put(str, c897703f5);
    }

    public static void LIZJ(Context context, String str) {
        String str2;
        PaymentMethod paymentMethod;
        if (Intrinsics.LJFF(LIZIZ, str)) {
            return;
        }
        LIZIZ = str;
        C897703f5 c897703f5 = LIZJ.get(str);
        if (c897703f5 != null) {
            PaymentInfo paymentInfo = c897703f5.LJI;
            NewPayInfo newPayInfoLIZ = null;
            if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                str2 = paymentMethod.id;
            } else {
                str2 = null;
            }
            if (PipoTtsPaymentResultNativeQuerySettings.LIZ(str2)) {
                String str3 = PaymentFinishPollingActivity._pnsPageId;
                Intent intent = new Intent(context, (Class<?>) PaymentFinishPollingActivity.class);
                intent.addFlags(536870912);
                intent.putExtra("biz_id", str);
                if (context != null) {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, context);
                    C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Yp3KbDa9IxWXNAtqZjSccVCKrJ4M+gLA1bfz4NIXHFaGzhriQ==", null));
                }
                C907803gi c907803gi = C907803gi.LIZ;
                NewPayInfo newPayInfo = c897703f5.LIZLLL;
                if (newPayInfo != null) {
                    newPayInfoLIZ = NewPayInfo.LIZ(newPayInfo, PayResult.DONE);
                }
                c897703f5.LIZLLL = newPayInfoLIZ;
                c907803gi.LJIJJLI(c897703f5, "start_native_poll", false);
            }
        }
    }
}
