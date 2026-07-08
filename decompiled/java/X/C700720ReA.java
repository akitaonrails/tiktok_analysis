package X;

import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ReA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700720ReA {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Function2<C698680Ras, String, Boolean> LIZLLL;
    public final Function0<FeedComponentPriorityData> LJ;
    public final InterfaceC700740ReC LJFF;
    public final InterfaceC699200Rbi<?> LJI;
    public final InterfaceC700020Rd2<?> LJII;
    public final IFeedDebugService LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C700720ReA(String str, String str2, String str3, Function2<? super C698680Ras, ? super String, Boolean> function2, Function0<FeedComponentPriorityData> function0, InterfaceC700740ReC interfaceC700740ReC, InterfaceC699200Rbi<?> interfaceC699200Rbi, InterfaceC700020Rd2<?> interfaceC700020Rd2, IFeedDebugService iFeedDebugService) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = function2;
        this.LJ = function0;
        this.LJFF = interfaceC700740ReC;
        this.LJI = interfaceC699200Rbi;
        this.LJII = interfaceC700020Rd2;
        this.LJIIIIZZ = iFeedDebugService;
    }
}
