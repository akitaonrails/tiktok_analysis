package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0gQK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165060gQK implements InterfaceC736910SvR<C1165230gQb> {
    public long LL = -1;
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public final String LLILZ = "PLAYLIST_DETAIL";
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(654));

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final InterfaceC149400hg getOperator() {
        return new C1165230gQb();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r24, X.InterfaceC1364105Vn<? super X.AbstractC1623806Xk<kotlin.Unit>> r25) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1165060gQK.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, X.05Vn):java.lang.Object");
    }

    public final void LIZIZ(MixStruct mixStruct, Long l, Function1<? super MixStruct, Unit> function1) {
        if (this.LL > 0 && l != null) {
            C1202980hPU.LIZ(this.LLILLJJLI, this.LLILZ, this.LL, l.longValue(), SystemClock.elapsedRealtime(), C297190Bkr.LIZ(), new InterfaceC1164020gOe() { // from class: X.0gOm
                @Override // X.InterfaceC1164020gOe
                public final void onEvent(Map map) {
                    C20684815ws.LJIILLIIL("power_preload_duration_key", map);
                }
            });
        }
        if (function1 != null) {
            function1.invoke(mixStruct);
        }
    }
}
