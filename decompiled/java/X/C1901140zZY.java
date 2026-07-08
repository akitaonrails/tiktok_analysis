package X;

import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0zZY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel", f = "NotificationResultViewModel.kt", l = {168}, m = "refreshByRequest$suspendImpl")
public final class C1901140zZY extends AbstractC23140094w {
    public NotificationResultViewModel LL;
    public EnumC1900750zYv LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ NotificationResultViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1901140zZY(NotificationResultViewModel notificationResultViewModel, InterfaceC1364105Vn<? super C1901140zZY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = notificationResultViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("NotificationResultViewModel@830a.refreshByRequest$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objGQ2 = NotificationResultViewModel.GQ2(this.LLILZ, null, null, this);
        C1C7U.LIZIZ("NotificationResultViewModel@830a.refreshByRequest$1");
        return objGQ2;
    }
}
