package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.send.service.IMSendMessageServiceImplKt", f = "IMSendMessageServiceImpl.kt", l = {164, 166}, m = "runSerialOnceSafe")
public final class C874520YSk extends AbstractC23140094w {
    public Function1 LL;
    public Function1 LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public int LLILZIL;

    public C874520YSk(InterfaceC1364105Vn<? super C874520YSk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSendMessageServiceImplKt@b208.runSerialOnceSafe$1");
        this.LLILZ = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = C874530YSl.LIZ(null, null, null, this);
        C1C7U.LIZIZ("IMSendMessageServiceImplKt@b208.runSerialOnceSafe$1");
        return objLIZ;
    }
}
