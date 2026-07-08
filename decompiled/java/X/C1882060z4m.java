package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882060z4m implements InterfaceC1880940z2y, InterfaceC1882630z5h {
    public final InterfaceC1882450z5P LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C308990C9h());
    public Set<String> LLILLL = C08CX.INSTANCE;

    @Override // X.InterfaceC1883360z6s
    public final void LLLZI() {
        C1882650z5j.LIZJ("gamePartnershipMixViewDownload", this);
        C1882650z5j.LIZJ("gamePartnershipMixViewDownloadCompletion", this);
    }

    @Override // X.InterfaceC1883360z6s
    public final void LJLJL() {
        C1882650z5j.LIZLLL(this);
    }

    public C1882060z4m(AbstractC1882430z5N abstractC1882430z5N) {
        this.LL = abstractC1882430z5N;
    }

    @Override // X.InterfaceC1880940z2y
    public final void LIZ(Function1<? super JSONObject, Unit> function1) {
        ((Set) this.LLILLJJLI.getValue()).remove(function1);
    }

    @Override // X.InterfaceC1880940z2y
    public final void LIZIZ(Function1<? super JSONObject, Unit> function1) {
        ((Set) this.LLILLJJLI.getValue()).add(function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(final kotlin.jvm.functions.Function0 r19, final kotlin.jvm.functions.Function1 r20) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1882060z4m.LJIIJ(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0119  */
    @Override // X.InterfaceC1882630z5h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(java.lang.String r7, X.InterfaceC1881290z3X r8) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1882060z4m.LJIJJLI(java.lang.String, X.0z3X):void");
    }

    @Override // X.InterfaceC1880940z2y
    public final void LJII(InterfaceC1880710z2b interfaceC1880710z2b, Function0<Unit> function0, Function0<Unit> function02) {
        C843920X8s c843920X8sJe0;
        C1882200z50 c1882200z50 = new C1882200z50(this, function0, function02);
        C1882250z55 c1882250z55 = new C1882250z55(function02);
        C843930X8t c843930X8tLIZ = interfaceC1880710z2b.LIZ(this.LL.getPage());
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
        if (iGamePartnershipService != null && (c843920X8sJe0 = iGamePartnershipService.Je0()) != null) {
            c843920X8sJe0.LJ(this.LL.getPage().getContext(), c843930X8tLIZ, new C1882170z4x(c1882200z50, c1882250z55));
        }
    }
}
