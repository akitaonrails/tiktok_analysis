package X;

import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.im.sharepanel.api.service.IImActiveContactsProvider;
import com.ss.android.ugc.aweme.im.sharepanel.impl.service.IMActiveContactsProvider;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0rhz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598850rhz extends AbstractC1598350rhB<C1598860ri0> {
    public final IImActiveContactsProvider LIZLLL;
    public final List<C1598860ri0> LJ;
    public final SkylightListViewModel LJFF;
    public final int LJI;
    public final InterfaceC497601wk LJII;
    public final C1231704rr LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final int LJIIJ;
    public final C1DEV LJIIJJI;
    public Map<String, SocialAffinityItem> LJIIL;

    @Override // X.AbstractC1598350rhB
    public final Object LJ(EnumC1155010gA7 enumC1155010gA7) {
        return this;
    }

    @Override // X.AbstractC1598350rhB
    public final Unit LIZIZ() {
        return Unit.LIZ;
    }

    public C1598850rhz(InterfaceC1598020rge interfaceC1598020rge) {
        IMSharePanelApi.LIZ.getClass();
        IMActiveContactsProvider iMActiveContactsProviderLIZLLL = C1599690rjL.LIZ().LIZLLL();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        SkylightListViewModel skylightListViewModelVm = interfaceC1598020rge.vm();
        C1E8E.LIZ.getClass();
        int i = C1E8E.LIZJ().numOfInboxSkyLightStatusLimitCount;
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZ);
        C1231704rr c1231704rr = new C1231704rr("SkylightActivityStatusModule", null, 6);
        super(interfaceC1598020rge);
        this.LIZLLL = iMActiveContactsProviderLIZLLL;
        this.LJ = copyOnWriteArrayList;
        this.LJFF = skylightListViewModelVm;
        this.LJI = i;
        this.LJII = c054gLIZ;
        this.LJIIIIZZ = c1231704rr;
        this.LJIIIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1669));
        this.LJIIJ = interfaceC1598020rge.LIZLLL(6);
        this.LJIIJJI = C2191201ApK.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    @Override // X.AbstractC1598350rhB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn r13) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598850rhz.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6 A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:29:0x008d, B:30:0x0090, B:31:0x00a0, B:33:0x00a6, B:35:0x00b9, B:36:0x00bd, B:38:0x00d1, B:39:0x00de, B:41:0x00e8, B:44:0x00f2, B:45:0x00f9, B:47:0x00ff, B:49:0x0107, B:51:0x012b, B:53:0x012f, B:55:0x0137, B:61:0x014b, B:60:0x0146, B:59:0x0144, B:62:0x014f, B:63:0x0152, B:43:0x00ee), top: B:72:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1 A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:29:0x008d, B:30:0x0090, B:31:0x00a0, B:33:0x00a6, B:35:0x00b9, B:36:0x00bd, B:38:0x00d1, B:39:0x00de, B:41:0x00e8, B:44:0x00f2, B:45:0x00f9, B:47:0x00ff, B:49:0x0107, B:51:0x012b, B:53:0x012f, B:55:0x0137, B:61:0x014b, B:60:0x0146, B:59:0x0144, B:62:0x014f, B:63:0x0152, B:43:0x00ee), top: B:72:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:29:0x008d, B:30:0x0090, B:31:0x00a0, B:33:0x00a6, B:35:0x00b9, B:36:0x00bd, B:38:0x00d1, B:39:0x00de, B:41:0x00e8, B:44:0x00f2, B:45:0x00f9, B:47:0x00ff, B:49:0x0107, B:51:0x012b, B:53:0x012f, B:55:0x0137, B:61:0x014b, B:60:0x0146, B:59:0x0144, B:62:0x014f, B:63:0x0152, B:43:0x00ee), top: B:72:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:29:0x008d, B:30:0x0090, B:31:0x00a0, B:33:0x00a6, B:35:0x00b9, B:36:0x00bd, B:38:0x00d1, B:39:0x00de, B:41:0x00e8, B:44:0x00f2, B:45:0x00f9, B:47:0x00ff, B:49:0x0107, B:51:0x012b, B:53:0x012f, B:55:0x0137, B:61:0x014b, B:60:0x0146, B:59:0x0144, B:62:0x014f, B:63:0x0152, B:43:0x00ee), top: B:72:0x008d }] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:68:0x0159
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // X.AbstractC1598350rhB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.EnumC1155010gA7 r11, X.InterfaceC1364105Vn<? super X.AbstractC1598350rhB<X.C1598860ri0>> r12) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598850rhz.LIZJ(X.0gA7, X.05Vn):java.lang.Object");
    }
}
