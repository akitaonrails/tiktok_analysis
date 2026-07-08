package X;

import com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS245S0000000_12;
import njp.a;

/* JADX INFO: renamed from: X.0cJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.playablecomponent.AnolePlayableComponentExtKt$parseGeckoAndLoadUrl$1$result$1", f = "AnolePlayableComponentExt.kt", l = {295}, m = "invokeSuspend")
public final class C1007340cJw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C1013880cUU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007340cJw(C1013880cUU c1013880cUU, InterfaceC1364105Vn<? super C1007340cJw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1013880cUU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007340cJw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJI;
        C1C7U.LIZ("AnolePlayableComponentExtKt@32dd.parseGeckoAndLoadUrl$1$result$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AwemeRawAd awemeRawAd = this.LLILLJJLI.LLILLJJLI.LIZLLL;
            this.LL = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C1022620cia.LJ("AnolePlayableComponent", "parseManifestJsonFile start");
            c2252611DEt.LJJII(AFwS245S0000000_12.get$arr$(162));
            String channelName = awemeRawAd.getChannelName();
            if (channelName == null) {
                channelName = "";
            }
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() == null || (strLJI = C1028210crb.LJI(channelName, "feed")) == null || strLJI.length() == 0) {
                C1022620cia.LJ("AnolePlayableComponent", "parseManifestJsonFile, gecko no exist");
                C189200o6.m2constructorimpl(false);
                c2252611DEt.resumeWith(false);
            }
            ICommerceGeckoPreloadService iCommerceGeckoPreloadService = (ICommerceGeckoPreloadService) PluggableExtentionKt.pluggableSpi$default(ICommerceGeckoPreloadService.class, false, false, false, 14, null);
            if (iCommerceGeckoPreloadService != null) {
                iCommerceGeckoPreloadService.LIZ(new C1048150dNl(channelName), new InterfaceC1040680dBi() { // from class: X.0U6I
                    @Override // X.InterfaceC1040680dBi
                    public final void LIZIZ() {
                        C1022620cia.LJ("AnolePlayableComponent", "parseManifestJsonFile, onParseFailed");
                        InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                        Boolean bool = Boolean.FALSE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC20236714Gf.resumeWith(bool);
                    }

                    @Override // X.InterfaceC1040680dBi
                    public final void LIZ(String str) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("parseManifestJsonFile, onParseSuccess: ");
                        sbLIZ.append(str);
                        C1022620cia.LJ("AnolePlayableComponent", C2188811AlT.LIZIZ(sbLIZ));
                        InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                        Boolean bool = Boolean.TRUE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC20236714Gf.resumeWith(bool);
                    }
                });
            }
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AnolePlayableComponentExtKt@32dd.parseGeckoAndLoadUrl$1$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AnolePlayableComponentExtKt@32dd.parseGeckoAndLoadUrl$1$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
