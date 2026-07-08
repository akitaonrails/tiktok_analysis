package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0Ssk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.optimistic.base.LoginOptimisticPlugin", f = "LoginOptimisticPlugin.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "execute")
public final class C735240Ssk extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C735220Ssi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C735240Ssk(C735220Ssi c735220Ssi, InterfaceC1364105Vn<? super C735240Ssk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c735220Ssi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoginOptimisticPlugin@8a8e.execute$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("LoginOptimisticPlugin@8a8e.execute$1");
        return objLIZ;
    }
}
