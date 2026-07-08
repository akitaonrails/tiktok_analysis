package X;

/* JADX INFO: renamed from: X.0TdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.controller.CommentSettingController", f = "CommentSettingController.kt", l = {189}, m = "switchCommentTray")
public final class C751310TdZ extends AbstractC23140094w {
    public boolean LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C751280TdW LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751310TdZ(C751280TdW c751280TdW, InterfaceC1364105Vn<? super C751310TdZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c751280TdW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentSettingController@2f69.switchCommentTray$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZ.LJII(false, null, this);
        C1C7U.LIZIZ("CommentSettingController@2f69.switchCommentTray$1");
        return objLJII;
    }
}
