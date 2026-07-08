package X;

import android.app.Activity;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS154S0101000_14;

/* JADX INFO: renamed from: X.0Yaz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877110Yaz implements InterfaceC863600XuI<List<? extends SetConversationSettingInfoResponseBody>> {
    public final /* synthetic */ Function0<Unit> LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ Function0<Unit> LIZJ;
    public final /* synthetic */ Function1<List<SetConversationSettingInfoResponseBody>, Unit> LIZLLL;

    @Override // X.InterfaceC863600XuI
    public final void LIZIZ(C0YMW c0ymw) {
        Function0<Unit> function0 = this.LIZ;
        if (function0 != null) {
            function0.invoke();
        }
        Activity activity = this.LIZIZ;
        if (activity != null) {
            IIMErrorUtils.LIZ.getClass();
            IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
            if (iIMErrorUtilsLIZ != null) {
                iIMErrorUtilsLIZ.LIZIZ(activity);
            }
        }
    }

    @Override // X.InterfaceC863600XuI
    public final void onSuccess(List<? extends SetConversationSettingInfoResponseBody> list) {
        List<? extends SetConversationSettingInfoResponseBody> list2 = list;
        Function0<Unit> function0 = this.LIZ;
        if (function0 != null) {
            function0.invoke();
        }
        if (list2 == null) {
            Activity activity = this.LIZIZ;
            if (activity != null) {
                IIMErrorUtils.LIZ.getClass();
                IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                if (iIMErrorUtilsLIZ != null) {
                    iIMErrorUtilsLIZ.LIZIZ(activity);
                    return;
                }
                return;
            }
            return;
        }
        if (list2.isEmpty()) {
            Function0<Unit> function02 = this.LIZJ;
            if (function02 == null) {
                return;
            }
            function02.invoke();
            return;
        }
        if (!list2.isEmpty()) {
            for (SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody : list2) {
                Integer num = setConversationSettingInfoResponseBody.status;
                int value = C0YIG.CONV_NOT_FOUND.getValue();
                if (num == null || num.intValue() != value) {
                    Integer num2 = setConversationSettingInfoResponseBody.status;
                    int value2 = C0YIG.CONV_DISSOLVED.getValue();
                    if (num2 == null || num2.intValue() != value2) {
                        this.LIZLLL.invoke((List<SetConversationSettingInfoResponseBody>) list2);
                        return;
                    }
                }
            }
        }
        Activity activity2 = this.LIZIZ;
        if (activity2 != null) {
            C0CNO.LIZLLL(0L, new AwS154S0101000_14(list2.size(), activity2, 4));
        }
    }

    public C877110Yaz(Activity activity, Function0 function0, C877400YbS c877400YbS, Function1 function1) {
        this.LIZ = function0;
        this.LIZIZ = activity;
        this.LIZJ = c877400YbS;
        this.LIZLLL = function1;
    }
}
