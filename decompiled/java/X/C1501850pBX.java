package X;

import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0pBX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.kmp.network.runtime.KMPNetworkImpl", f = "KMPNetworkImpl.kt", l = {BdTuring.TYPE_SMS_VOICE}, m = "execute")
public final class C1501850pBX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1501840pBW LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1501850pBX(C1501840pBW c1501840pBW, InterfaceC1364105Vn<? super C1501850pBX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1501840pBW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KMPNetworkImpl@64df.execute$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("KMPNetworkImpl@64df.execute$1");
        return objLIZ;
    }
}
