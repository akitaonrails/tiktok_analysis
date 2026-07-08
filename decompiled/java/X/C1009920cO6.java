package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cO6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009920cO6 implements InterfaceC1009890cO3 {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ ISearchAdEventLogger LIZIZ;
    public final /* synthetic */ Function2<String, C1005320cGg, Unit> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1009890cO3
    public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
        AnoleComponentModel anoleComponentModelAk;
        C1009960cOA c1009960cOALIZ;
        Boolean boolValueOf;
        C1007860cKm c1007860cKmLJIILIIL;
        if (interfaceC1007930cKt != null && (anoleComponentModelAk = interfaceC1007930cKt.Ak()) != null) {
            String str = null;
            Object obj = null;
            AwemeRawAd awemeRawAd = null;
            Object obj2 = null;
            if (abstractC991850bux instanceof C991870buz) {
                Aweme aweme = this.LIZ;
                ISearchAdEventLogger iSearchAdEventLogger = this.LIZIZ;
                String str2 = anoleComponentModelAk.type;
                if (Intrinsics.LJFF(str2, "search_product_anchor")) {
                    InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
                    if (interfaceC657510PqfLIZLLL != null && (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL.LJIILIIL()) != null) {
                        c1009960cOALIZ = c1007860cKmLJIILIIL.LIZ(aweme);
                    } else {
                        c1009960cOALIZ = null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("logSearchAdAnoleAnchorShow eventTrackState?.trackedAnchorShow = ");
                    if (c1009960cOALIZ != null) {
                        boolValueOf = Boolean.valueOf(c1009960cOALIZ.LIZ);
                    } else {
                        boolValueOf = null;
                    }
                    sbLIZ.append(boolValueOf);
                    C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2510609se.LIZ;
                    if (c1009960cOALIZ != null && c1009960cOALIZ.LIZ) {
                        return;
                    }
                    Map<String, ? extends Object> map = anoleComponentModelAk.data;
                    if (map != null) {
                        obj = map.get("anchor_style");
                    }
                    if (Intrinsics.LJFF(obj, EnumC1991207r4.IMAGE_ANCHOR.getValue())) {
                        if (iSearchAdEventLogger != null) {
                            C1009980cOC.LIZ.getClass();
                            iSearchAdEventLogger.logAd(C1009980cOC.LJJIIZI);
                        }
                    } else if (iSearchAdEventLogger != null) {
                        C1009980cOC.LIZ.getClass();
                        iSearchAdEventLogger.logAd(C1009980cOC.LJJIIJZLJL);
                    }
                    if (c1009960cOALIZ == null) {
                        return;
                    }
                    c1009960cOALIZ.LIZ = true;
                    return;
                }
                if (!Intrinsics.LJFF(str2, "search_cta")) {
                    return;
                }
                int i2 = C2510609se.LIZ;
                InterfaceC688220Qz6 interfaceC688220Qz6LJJI = C0R12.LIZIZ.LJJI();
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                interfaceC688220Qz6LJJI.LIZIZ(awemeRawAd);
                return;
            }
            if (abstractC991850bux instanceof C1005320cGg) {
                ISearchAdEventLogger iSearchAdEventLogger2 = this.LIZIZ;
                Function2<String, C1005320cGg, Unit> function2 = this.LIZJ;
                C1005320cGg c1005320cGg = (C1005320cGg) abstractC991850bux;
                if (function2 != null) {
                    function2.invoke(anoleComponentModelAk.type, c1005320cGg);
                }
                String str3 = anoleComponentModelAk.type;
                if (Intrinsics.LJFF(str3, "search_product_anchor")) {
                    Map<String, ? extends Object> map2 = anoleComponentModelAk.data;
                    if (map2 != null) {
                        obj2 = map2.get("anchor_style");
                    }
                    if (Intrinsics.LJFF(obj2, EnumC1991207r4.IMAGE_ANCHOR.getValue())) {
                        if (iSearchAdEventLogger2 == null) {
                            return;
                        }
                        C1009980cOC.LIZ.getClass();
                        iSearchAdEventLogger2.logAd(C1009980cOC.LJJIJ);
                        return;
                    }
                    if (iSearchAdEventLogger2 == null) {
                        return;
                    }
                    C1009980cOC.LIZ.getClass();
                    iSearchAdEventLogger2.logAd(C1009980cOC.LJJIIZ);
                    return;
                }
                if (!Intrinsics.LJFF(str3, "search_enhanced_style_anchor")) {
                    return;
                }
                if (c1005320cGg != null) {
                    str = c1005320cGg.LJ;
                }
                if (Intrinsics.LJFF(str, "anchor_image")) {
                    if (iSearchAdEventLogger2 == null) {
                        return;
                    }
                    C1009980cOC.LIZ.getClass();
                    iSearchAdEventLogger2.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LLF.getValue(), AFwS252S0000000_16.get$arr$(405));
                    return;
                }
                if (iSearchAdEventLogger2 == null) {
                    return;
                }
                C1009980cOC.LIZ.getClass();
                iSearchAdEventLogger2.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LLD.getValue(), AFwS252S0000000_16.get$arr$(406));
                return;
            }
            if (!(abstractC991850bux instanceof C989580brI)) {
                return;
            }
            T t = ((C989580brI) abstractC991850bux).LIZ;
            if (t instanceof C1007630cKP) {
                C1009940cO8.LJII(this.LIZ, this.LIZIZ, (C1007630cKP) t);
                return;
            }
            if (t instanceof C1895407bc) {
                ISearchAdEventLogger iSearchAdEventLogger3 = this.LIZIZ;
                int i3 = ((C1895407bc) t).LIZ;
                if (iSearchAdEventLogger3 == null) {
                    return;
                }
                C1009980cOC.LIZ.getClass();
                iSearchAdEventLogger3.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LJJJLZIJ.getValue(), new AwS124S0101000_16(i3, anoleComponentModelAk, 7));
                return;
            }
            if (!(t instanceof C641120PCs)) {
                return;
            }
            C1009940cO8.LJIIIIZZ(this.LIZIZ, (C641120PCs) t, anoleComponentModelAk, null);
        }
    }

    public C1009920cO6(Aweme aweme, SearchAdEventLogger searchAdEventLogger, Function2 function2) {
        this.LIZ = aweme;
        this.LIZIZ = searchAdEventLogger;
        this.LIZJ = function2;
    }
}
