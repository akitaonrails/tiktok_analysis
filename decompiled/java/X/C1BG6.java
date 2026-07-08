package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: renamed from: X.1BG6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactManager", f = "IMContactManager.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 309, 329}, m = "innerFetchIMUserList")
public final class C1BG6 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public /* synthetic */ Object LLJIJIL;
    public final /* synthetic */ C1BG1 LLJILJIL;
    public int LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BG6(C1BG1 c1bg1, InterfaceC1364105Vn<? super C1BG6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJILJIL = c1bg1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactManager@fb8a.innerFetchIMUserList$1");
        this.LLJIJIL = obj;
        this.LLJILJILJ |= Integer.MIN_VALUE;
        Object objLJIJ = this.LLJILJIL.LJIJ(null, null, false, false, false, false, null, this);
        C1C7U.LIZIZ("IMContactManager@fb8a.innerFetchIMUserList$1");
        return objLJIJ;
    }
}
