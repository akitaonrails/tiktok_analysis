package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0iAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.network.CheckNicknameApi", f = "CheckNicknameApi.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "checkNickname")
public final class C1232190iAb extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1232200iAc LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1232190iAb(C1232200iAc c1232200iAc, InterfaceC1364105Vn<? super C1232190iAb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1232200iAc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CheckNicknameApi@5079.checkNickname$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0, null, this);
        C1C7U.LIZIZ("CheckNicknameApi@5079.checkNickname$1");
        return objLIZ;
    }
}
