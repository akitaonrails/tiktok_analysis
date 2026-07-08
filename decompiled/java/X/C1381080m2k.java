package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0m2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381080m2k extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C1381070m2j LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1381080m2k(C1381070m2j c1381070m2j, Context context, long j) {
        super(1);
        this.LL = c1381070m2j;
        this.LLILLJJLI = context;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        C1381070m2j c1381070m2j = this.LL;
        Context context = this.LLILLJJLI;
        long j = this.LLILLL;
        c1381070m2j.getClass();
        ((ICLACaptionService) ServiceManager.get().getService(ICLACaptionService.class)).LJI(context, c1381070m2j.LLILLL, EnumC1390800mIQ.SHARE_PANEL, c1381070m2j.LLILLJJLI, true, Long.valueOf(j));
        return Unit.LIZ;
    }
}
