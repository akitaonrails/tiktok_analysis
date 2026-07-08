package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderRsp;

/* JADX INFO: renamed from: X.03lo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC939403lo {
    public static final C939303ln LIZ = C939303ln.LIZ;

    @InterfaceC1501240pAY("/api/v1/mall/flash_sale/set_reminder")
    C11NZ<Response<ReminderRsp>> LIZ(@C040I ReminderRequest reminderRequest);
}
