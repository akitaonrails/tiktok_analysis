package X;

import org.json.JSONException;

/* JADX INFO: renamed from: X.06EN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.view.panel.StreakPetLynxPanel", f = "StreakPetLynxPanel.kt", l = {78}, m = "getData")
public final class C06EN extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C06EK LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06EN(C06EK c06ek, InterfaceC1364105Vn<? super C06EN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c06ek;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("StreakPetLynxPanel@7dcd.getData$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZLL.LIZIZ(false, this);
        C1C7U.LIZIZ("StreakPetLynxPanel@7dcd.getData$1");
        return objLIZIZ;
    }
}
