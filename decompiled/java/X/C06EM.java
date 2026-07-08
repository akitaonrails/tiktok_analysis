package X;

import org.json.JSONException;

/* JADX INFO: renamed from: X.06EM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.view.panel.StreakPetLynxPanel", f = "StreakPetLynxPanel.kt", l = {124}, m = "open")
public final class C06EM extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C06EK LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06EM(C06EK c06ek, InterfaceC1364105Vn<? super C06EM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c06ek;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("StreakPetLynxPanel@7dcd.open$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, this);
        C1C7U.LIZIZ("StreakPetLynxPanel@7dcd.open$1");
        return objLIZ;
    }
}
