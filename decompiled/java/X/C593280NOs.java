package X;

import com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl;

/* JADX INFO: renamed from: X.0NOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl", f = "AwemeManageServiceImpl.kt", l = {149}, m = "batchInsertEntities")
public final class C593280NOs extends AbstractC23140094w {
    public InterfaceC593180NOi LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AwemeManageServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593280NOs(AwemeManageServiceImpl awemeManageServiceImpl, InterfaceC1364105Vn<? super C593280NOs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = awemeManageServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemeManageServiceImpl@876f.batchInsertEntities$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, this);
        C1C7U.LIZIZ("AwemeManageServiceImpl@876f.batchInsertEntities$1");
        return objLIZ;
    }
}
