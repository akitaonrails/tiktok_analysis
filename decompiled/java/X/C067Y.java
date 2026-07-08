package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.SessionListTopNoticeViewModel;
import com.ss.android.ugc.aweme.im.common.model.ImChatNoticeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067Y, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.SessionListTopNoticeViewModel$fetchTopNotice$1", f = "SessionListTopNoticeViewModel.kt", l = {152, 167, 182}, m = "invokeSuspend")
public final class C067Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public ImChatNoticeModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ SessionListTopNoticeViewModel LLILLL;
    public final /* synthetic */ EnumC15556067e LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C067Y(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, EnumC15556067e enumC15556067e, int i, int i2, boolean z, int i3, InterfaceC1364105Vn<? super C067Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = sessionListTopNoticeViewModel;
        this.LLILZ = enumC15556067e;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = z;
        this.LLIZLLLIL = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C067Y(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d2  */
    /* JADX WARN: Type inference failed for: r0v45, types: [com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.05Vn, com.ss.android.ugc.aweme.im.common.model.ImChatNoticeModel] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C067Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
