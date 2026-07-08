package X;

import com.ss.android.ugc.aweme.feed.model.im.AIGroupShotMediaModel;
import com.ss.android.ugc.aweme.wavepublish.dm.service.DMGroupShotEditPageServiceImpl;

/* JADX INFO: renamed from: X.0njX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.dm.service.DMGroupShotEditPageServiceImpl", f = "DMGroupShotEditPageServiceImpl.kt", l = {104}, m = "createDMGroupShotIntent")
public final class C1446050njX extends AbstractC23140094w {
    public AIGroupShotMediaModel LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ DMGroupShotEditPageServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1446050njX(DMGroupShotEditPageServiceImpl dMGroupShotEditPageServiceImpl, InterfaceC1364105Vn<? super C1446050njX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = dMGroupShotEditPageServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMGroupShotEditPageServiceImpl@96c6.createDMGroupShotIntent$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, this);
        C1C7U.LIZIZ("DMGroupShotEditPageServiceImpl@96c6.createDMGroupShotIntent$1");
        return objLIZ;
    }
}
