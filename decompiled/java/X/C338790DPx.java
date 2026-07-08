package X;

import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.ur.school.service.SchoolFlowLauncher;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338790DPx extends C09AY implements Function2<View, C1391990mKL, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C338790DPx(C19EG c19eg, String str, boolean z) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = c19eg;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, C1391990mKL c1391990mKL) {
        c1391990mKL.LIZIZ = this.LL;
        SchoolFlowLauncher schoolFlowLauncher = (SchoolFlowLauncher) PluggableExtentionKt.pluggableSpi$default(SchoolFlowLauncher.class, false, false, false, 14, null);
        if (schoolFlowLauncher != null) {
            schoolFlowLauncher.LIZ(this.LLILLJJLI, new C1245830iWb(EnumC338580DPc.EDIT_SCHOOL, new C1245860iWe(EnumC1231460i9Q.HOMEPAGE_HOT, null, null), false, EnumC338600DPe.POST, null, null, false, 116));
            C0DOO c0doo = C0DOO.LIZ;
            String str = this.LLILLL;
            c0doo.getClass();
            C0DOO.LIZ("school_community_page", str, "add_college", null);
        }
        return Unit.LIZ;
    }
}
