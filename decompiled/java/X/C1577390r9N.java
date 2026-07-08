package X;

import Y.AfS9S0100100_24;
import com.ss.android.ugc.aweme.model.DramaDNUFeedCardConfig;
import com.ss.android.ugc.aweme.model.MiniDramaFeedCardRequest;
import com.ss.android.ugc.aweme.model.MiniDramaFeedCardResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0r9N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577390r9N {
    public int LIZ;
    public C11JF LIZJ;
    public MiniDramaFeedCardResponse LIZLLL;
    public C11JF LJ;
    public DramaDNUFeedCardConfig LJFF;
    public boolean LJII;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(517));
    public final List<InterfaceC1577470r9V> LJI = new ArrayList();

    public final void LIZIZ() {
        C11NZ<MiniDramaFeedCardResponse> c11nzLIZJ;
        C11JF c11jf;
        this.LIZ++;
        C11JF c11jf2 = this.LIZJ;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LIZJ) != null) {
            c11jf.dispose();
        }
        C1577320r9G.LIZIZ(C1577320r9G.LIZ, EnumC1577400r9O.FEED_CARD_REQUEST, Integer.valueOf(this.LIZ), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524284);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LJII = true;
        C1578500rBA c1578500rBA = C1578500rBA.LIZ;
        MiniDramaFeedCardRequest miniDramaFeedCardRequest = new MiniDramaFeedCardRequest("dnu", null, Integer.valueOf(this.LIZ));
        c1578500rBA.getClass();
        InterfaceC1577430r9R interfaceC1577430r9RLIZ = C1578500rBA.LIZ();
        InterfaceC420801kM interfaceC420801kMLJJLL = null;
        if (interfaceC1577430r9RLIZ != null && (c11nzLIZJ = interfaceC1577430r9RLIZ.LIZJ(miniDramaFeedCardRequest)) != null) {
            interfaceC420801kMLJJLL = c11nzLIZJ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS9S0100100_24(jCurrentTimeMillis, this, 6), new AfS9S0100100_24(jCurrentTimeMillis, this, 7));
        }
        this.LIZJ = (C11JF) interfaceC420801kMLJJLL;
    }

    public final void LIZ(InterfaceC1577470r9V interfaceC1577470r9V) {
        if (((ArrayList) this.LJI).contains(interfaceC1577470r9V)) {
            return;
        }
        ((ArrayList) this.LJI).add(interfaceC1577470r9V);
        MiniDramaFeedCardResponse miniDramaFeedCardResponse = this.LIZLLL;
        if (miniDramaFeedCardResponse != null) {
            interfaceC1577470r9V.LIZ(miniDramaFeedCardResponse);
        }
        DramaDNUFeedCardConfig dramaDNUFeedCardConfig = this.LJFF;
        if (dramaDNUFeedCardConfig != null) {
            interfaceC1577470r9V.LIZIZ(dramaDNUFeedCardConfig);
        }
    }
}
