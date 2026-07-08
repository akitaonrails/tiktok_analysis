package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.im.AIGroupShotResultModel;
import com.ss.android.ugc.aweme.wavepublish.dm.service.DMGroupShotEditPageServiceImpl;

/* JADX INFO: renamed from: X.0njW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.dm.service.DMGroupShotEditPageServiceImpl", f = "DMGroupShotEditPageServiceImpl.kt", l = {144}, m = "generateMediaModels")
public final class C1446040njW extends AbstractC23140094w {
    public CreativeInfo LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public AIGroupShotResultModel LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ DMGroupShotEditPageServiceImpl LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1446040njW(DMGroupShotEditPageServiceImpl dMGroupShotEditPageServiceImpl, InterfaceC1364105Vn<? super C1446040njW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = dMGroupShotEditPageServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMGroupShotEditPageServiceImpl@96c6.generateMediaModels$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLIZ.LIZIZ(null, null, this);
        C1C7U.LIZIZ("DMGroupShotEditPageServiceImpl@96c6.generateMediaModels$1");
        return objLIZIZ;
    }
}
