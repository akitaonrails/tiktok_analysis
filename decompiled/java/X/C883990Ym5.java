package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ym5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883990Ym5 extends C09AY implements Function0<C883920Yly> {
    public C883990Ym5() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Yly] */
    @Override // kotlin.jvm.functions.Function0
    public final C883920Yly invoke() {
        return new AbstractC883730Ylf() { // from class: X.0Yly
            public final String LJIIL = "SocialInboxChatListBridge";

            @Override // X.AbstractC883730Ylf
            public final InterfaceC1517505wr LJIILIIL() {
                return C1517405wq.LIZ;
            }

            @Override // X.AbstractC883730Ylf
            public final String LJIJ() {
                return this.LJIIL;
            }

            @Override // X.AbstractC883730Ylf
            public final void LJJ(FilterTabType filterTabType, Set<? extends EnumC880480YgQ> set) {
                C878950Ydx c878950Ydx;
                InterfaceC884640Yn8 config;
                InterfaceC884020Ym8 interfaceC884020Ym8 = this.LJ;
                InterfaceC879010Ye3 key = null;
                if (interfaceC884020Ym8 != null && (config = interfaceC884020Ym8.getConfig()) != null) {
                    key = config.getKey();
                }
                if ((key instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) key) != null) {
                    C1729806q0.LIZ(c878950Ydx, new C883910Ylx(c878950Ydx, filterTabType, set, this, null));
                }
            }
        };
    }
}
