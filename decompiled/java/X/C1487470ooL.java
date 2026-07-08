package X;

import android.content.Context;
import com.ss.android.ugc.aweme.api.IGetApps;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.XiaomiMiniCardStatusCheckTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ooL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487470ooL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ XiaomiMiniCardStatusCheckTask LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1487470ooL(XiaomiMiniCardStatusCheckTask xiaomiMiniCardStatusCheckTask, Context context) {
        super(0);
        this.LL = xiaomiMiniCardStatusCheckTask;
        this.LLILLJJLI = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        XiaomiMiniCardStatusCheckTask xiaomiMiniCardStatusCheckTask = this.LL;
        Context context = this.LLILLJJLI;
        xiaomiMiniCardStatusCheckTask.getClass();
        ((IGetApps) ServiceManager.get().getService(IGetApps.class)).LIZLLL(context);
        return Unit.LIZ;
    }
}
