package X;

import com.ss.android.ugc.aweme.IMAiGroupShotConfig;
import com.ss.android.ugc.aweme.IMAiGroupShotServiceImpl;
import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry;

/* JADX INFO: renamed from: X.0wVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.IMAiGroupShotServiceImpl", f = "IMAiGroupShotServiceImpl.kt", l = {134}, m = "startGroupShotOutsideChatForceTemplateId")
public final class C1783440wVi extends AbstractC23140094w {
    public C19EG LL;
    public AIGroupShotEntry.OutChat LLILLJJLI;
    public IMAiGroupShotConfig.TemplateConfig.Selected LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ IMAiGroupShotServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783440wVi(IMAiGroupShotServiceImpl iMAiGroupShotServiceImpl, InterfaceC1364105Vn<? super C1783440wVi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = iMAiGroupShotServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMAiGroupShotServiceImpl@5e19.startGroupShotOutsideChatForceTemplateId$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, null, null, null, this);
        C1C7U.LIZIZ("IMAiGroupShotServiceImpl@5e19.startGroupShotOutsideChatForceTemplateId$1");
        return objLIZIZ;
    }
}
