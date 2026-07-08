package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.1BFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.data.dao.room.IMUserBaseInfoDaoBase", f = "IMUserBaseInfoDaoBase.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "insertOrReplace")
public final class C2201901BFs extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2201851BFn LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2201901BFs(C2201851BFn c2201851BFn, InterfaceC1364105Vn<? super C2201901BFs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c2201851BFn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUserBaseInfoDaoBase@847c.insertOrReplace$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLJJLI.LJII(null, this);
        C1C7U.LIZIZ("IMUserBaseInfoDaoBase@847c.insertOrReplace$1");
        return objLJII;
    }
}
