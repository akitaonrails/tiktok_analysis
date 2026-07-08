package X;

import com.ss.android.ugc.tools.chat.message.compact.IMEventProtocolDispatcher;

/* JADX INFO: renamed from: X.0ZeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.compact.IMEventProtocolDispatcher", f = "IMEventProtocolDispatcher.kt", l = {53}, m = "interceptMessageEvent")
public final class C904760ZeU extends AbstractC23140094w {
    public InterfaceC904740ZeS LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ IMEventProtocolDispatcher LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C904760ZeU(IMEventProtocolDispatcher iMEventProtocolDispatcher, InterfaceC1364105Vn<? super C904760ZeU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = iMEventProtocolDispatcher;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMEventProtocolDispatcher@bd52.interceptMessageEvent$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objNX1 = this.LLILZ.NX1(null, this);
        C1C7U.LIZIZ("IMEventProtocolDispatcher@bd52.interceptMessageEvent$1");
        return objNX1;
    }
}
