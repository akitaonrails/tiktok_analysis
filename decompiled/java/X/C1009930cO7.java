package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cO7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009930cO7 implements InterfaceC1009890cO3 {
    public final /* synthetic */ Function1<Boolean, Unit> LIZ;
    public final /* synthetic */ SearchAdEventLogger LIZIZ;
    public final /* synthetic */ Aweme LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1009890cO3
    public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
        AnoleComponentModel anoleComponentModelAk;
        if (interfaceC1007930cKt != null && (anoleComponentModelAk = interfaceC1007930cKt.Ak()) != null) {
            if (abstractC991850bux instanceof C1005320cGg) {
                if (Intrinsics.LJFF(anoleComponentModelAk.type, "search_shop_ad_card_header")) {
                    Function1<Boolean, Unit> function1 = this.LIZ;
                    if (function1 != null) {
                        function1.invoke(Boolean.FALSE);
                    }
                    SearchAdEventLogger searchAdEventLogger = this.LIZIZ;
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd((InterfaceC1023400cjq) C1009980cOC.LJJJLL.getValue());
                    return;
                }
                return;
            }
            if (!(abstractC991850bux instanceof C989580brI)) {
                return;
            }
            T t = ((C989580brI) abstractC991850bux).LIZ;
            if (t instanceof C1895407bc) {
                SearchAdEventLogger searchAdEventLogger2 = this.LIZIZ;
                int i = ((C1895407bc) t).LIZ;
                if (searchAdEventLogger2 == null) {
                    return;
                }
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger2.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LJJJLZIJ.getValue(), new AwS124S0101000_16(i, anoleComponentModelAk, 7));
                return;
            }
            if (t instanceof C641120PCs) {
                C1009940cO8.LJIIIIZZ(this.LIZIZ, (C641120PCs) t, anoleComponentModelAk, this.LIZ);
            } else {
                if (!(t instanceof C1007630cKP)) {
                    return;
                }
                C1009940cO8.LJII(this.LIZJ, this.LIZIZ, (C1007630cKP) t);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1009930cO7(Function1<? super Boolean, Unit> function1, SearchAdEventLogger searchAdEventLogger, Aweme aweme) {
        this.LIZ = function1;
        this.LIZIZ = searchAdEventLogger;
        this.LIZJ = aweme;
    }
}
