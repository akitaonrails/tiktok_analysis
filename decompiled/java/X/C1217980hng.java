package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217980hng extends C09AY implements Function1<C1218060hno, C1218060hno> {
    public final /* synthetic */ AuditRequestListViewModel LL;
    public final /* synthetic */ List<C1218000hni> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ List<Long> LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ EnumC1217990hnh LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217980hng(AuditRequestListViewModel auditRequestListViewModel, List<C1218000hni> list, boolean z, List<Long> list2, Context context, EnumC1217990hnh enumC1217990hnh, int i) {
        super(1);
        this.LL = auditRequestListViewModel;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = list2;
        this.LLILZIL = context;
        this.LLILZLL = enumC1217990hnh;
        this.LLIZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1218060hno invoke(C1218060hno c1218060hno) {
        int i;
        C1218060hno c1218060hno2 = c1218060hno;
        C627660Ojc<C1218000hni> c627660OjcCQ2 = this.LL.CQ2(this.LLILLJJLI);
        int size = this.LLILLJJLI.size();
        boolean z = this.LLILLL;
        List<Long> list = this.LLILZ;
        Resources resources = this.LLILZIL.getResources();
        if (this.LLILZLL == EnumC1217990hnh.APPROVE) {
            i = 2131755193;
        } else {
            i = 2131755194;
        }
        int i2 = this.LLIZ;
        return C1218060hno.LIZ(c1218060hno2, c627660OjcCQ2, null, size, z, list, new C291001Au(resources.getQuantityString(i, i2, Integer.valueOf(i2))), null, 66);
    }
}
