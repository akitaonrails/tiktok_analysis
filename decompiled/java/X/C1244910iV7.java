package X;

import com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0iV7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1244910iV7 extends C2217421BqW implements Function2<String, Function0<? extends Unit>, Unit> {
    public C1244910iV7(Object obj) {
        super(2, obj, SystemNotificationListViewModel.class, "reportTabShowEvent", "reportTabShowEvent(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Function0<? extends Unit> function0) {
        Function0<? extends Unit> function02 = function0;
        SystemNotificationListViewModel systemNotificationListViewModel = (SystemNotificationListViewModel) this.receiver;
        if (str == null) {
            systemNotificationListViewModel.getClass();
        } else if (!((CopyOnWriteArraySet) systemNotificationListViewModel.LLILZIL.getValue()).contains(str)) {
            ((CopyOnWriteArraySet) systemNotificationListViewModel.LLILZ.getValue()).add(str);
            function02.invoke();
        }
        return Unit.LIZ;
    }
}
