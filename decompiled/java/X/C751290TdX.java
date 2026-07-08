package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TdX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.controller.CommentSettingController", f = "CommentSettingController.kt", l = {136}, m = "switchComment")
public final class C751290TdX extends AbstractC23140094w {
    public boolean LL;
    public Function1 LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C751280TdW LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751290TdX(C751280TdW c751280TdW, InterfaceC1364105Vn<? super C751290TdX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c751280TdW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentSettingController@2f69.switchComment$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZIL.LJI(false, null, null, this);
        C1C7U.LIZIZ("CommentSettingController@2f69.switchComment$1");
        return objLJI;
    }
}
