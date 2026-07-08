package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0W31, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.spi.OpenServiceImpl", f = "OpenServiceImpl.kt", l = {29, 29}, m = "assembleMafInfo")
public final class C0W31<T extends User> extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C816950W2z LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W31(C816950W2z c816950W2z, InterfaceC1364105Vn<? super C0W31> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c816950W2z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OpenServiceImpl@fc5a.assembleMafInfo$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, null, this);
        C1C7U.LIZIZ("OpenServiceImpl@fc5a.assembleMafInfo$1");
        return objLIZ;
    }
}
