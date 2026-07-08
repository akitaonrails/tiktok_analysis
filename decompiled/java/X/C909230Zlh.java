package X;

import com.ss.android.ugc.aweme.im.actionbar.serviceimpl.ActionBarServiceImpl;

/* JADX INFO: renamed from: X.0Zlh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.actionbar.serviceimpl.ActionBarServiceImpl", f = "ActionBarServiceImpl.kt", l = {88, 95, 104}, m = "getActionBarConfigAsync")
public final class C909230Zlh extends AbstractC23140094w {
    public Object LL;
    public InterfaceC1707406mO LLILLJJLI;
    public boolean LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ ActionBarServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C909230Zlh(ActionBarServiceImpl actionBarServiceImpl, InterfaceC1364105Vn<? super C909230Zlh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = actionBarServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActionBarServiceImpl@3c09.getActionBarConfigAsync$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, null, false, this);
        C1C7U.LIZIZ("ActionBarServiceImpl@3c09.getActionBarConfigAsync$1");
        return objLIZIZ;
    }
}
