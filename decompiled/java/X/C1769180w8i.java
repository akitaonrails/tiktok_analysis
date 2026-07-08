package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CountCfg;

/* JADX INFO: renamed from: X.0w8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.task.uitask.base.BadgeTaskBase", f = "BadgeTaskBase.kt", l = {132}, m = "show$suspendImpl")
public final class C1769180w8i extends AbstractC23140094w {
    public AbstractC1769090w8Z LL;
    public CountCfg LLILLJJLI;
    public C1769130w8d LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AbstractC1769090w8Z LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1769180w8i(AbstractC1769090w8Z abstractC1769090w8Z, InterfaceC1364105Vn<? super C1769180w8i> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = abstractC1769090w8Z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BadgeTaskBase@2182.show$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIIZ = AbstractC1769090w8Z.LJIIIZ(this.LLILZIL, this);
        C1C7U.LIZIZ("BadgeTaskBase@2182.show$1");
        return objLJIIIZ;
    }
}
