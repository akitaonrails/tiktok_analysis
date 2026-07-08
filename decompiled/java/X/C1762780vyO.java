package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0vyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762780vyO {
    public final List<MediaItem> LIZ;
    public final SeaPdpViewModel LIZIZ;
    public final InterfaceC1763260vzA LIZJ;
    public final Function0<Integer> LIZLLL;
    public final Function1<Integer, Unit> LJ;

    public final boolean LIZ() {
        return this.LIZIZ.lS2() || this.LIZLLL.invoke().intValue() >= 1;
    }

    public C1762780vyO(List list, SeaPdpViewModel seaPdpViewModel, C1762790vyP c1762790vyP, AwS570S0100000_26 awS570S0100000_26, AwS605S0100000_26 awS605S0100000_26) {
        this.LIZ = list;
        this.LIZIZ = seaPdpViewModel;
        this.LIZJ = c1762790vyP;
        this.LIZLLL = awS570S0100000_26;
        this.LJ = awS605S0100000_26;
    }
}
