package X;

import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: renamed from: X.01OP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.utils.InteractTextParseUtils", f = "InteractTextParseUtils.kt", l = {38}, m = "getSpannable")
public final class C01OP extends AbstractC23140094w {
    public Text LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C01OO LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01OP(C01OO c01oo, InterfaceC1364105Vn<? super C01OP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c01oo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InteractTextParseUtils@d546.getSpannable$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("InteractTextParseUtils@d546.getSpannable$1");
        return objLIZ;
    }
}
