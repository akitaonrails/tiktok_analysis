package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS153S1100000_4;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0D0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332130D0h {
    public final C331730CzT LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final Function1<PdpSupplementData, Unit> LIZJ;
    public final Function1<C0D3K, Unit> LIZLLL;
    public final Function1<String, Unit> LJ;
    public C0D27<C0D3K> LJFF;

    public final void LIZ(C332690D2l c332690D2l, PdpSupplementData pdpSupplementData, String str) {
        C0D27<C0D3K> c0d27 = this.LJFF;
        if (c0d27 != null) {
            c0d27.LIZ();
        }
        this.LJFF = new C0D27<>(this.LIZIZ, new C332120D0g(this, c332690D2l, str, pdpSupplementData, null), new AwS405S0200000_4(this, pdpSupplementData, 36), this.LIZLLL, new AwS583S0100000_4(this, 249), 0, "UcpProductFetcher", new AwS153S1100000_4(c332690D2l, str, 6), 0L, 15000L, false, 2656);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C332130D0h(C331730CzT c331730CzT, InterfaceC497601wk interfaceC497601wk, Function1<? super PdpSupplementData, Unit> function1, Function1<? super C0D3K, Unit> function12, Function1<? super String, Unit> function13) {
        this.LIZ = c331730CzT;
        this.LIZIZ = interfaceC497601wk;
        this.LIZJ = function1;
        this.LIZLLL = function12;
        this.LJ = function13;
    }
}
