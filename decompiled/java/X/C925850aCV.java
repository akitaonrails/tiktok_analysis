package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0aCV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925850aCV {
    public static final List<C925880aCY> LIZ;
    public static final List<C925880aCY> LIZIZ;
    public static final List<C925880aCY> LIZJ;
    public static final List<C925880aCY> LIZLLL;

    static {
        EnumC925840aCU enumC925840aCU = EnumC925840aCU.ENTER_ACTION;
        EnumC925840aCU enumC925840aCU2 = EnumC925840aCU.GET_SHARED_PANEL;
        EnumC925840aCU enumC925840aCU3 = EnumC925840aCU.JOIN_DIRECT;
        LIZ = C1697810uHb.LJIIJJI(new C925880aCY("enter_action_to_get_shared_panel", enumC925840aCU, enumC925840aCU2), new C925880aCY("get_shared_panel_to_join_direct", enumC925840aCU2, enumC925840aCU3), new C925880aCY("join_direct_to_connection_success", enumC925840aCU3, EnumC925840aCU.CONNECTION_SUCCESS_INVITE));
        EnumC925840aCU enumC925840aCU4 = EnumC925840aCU.APPLY;
        LIZIZ = C1697810uHb.LJIIJJI(new C925880aCY("enter_action_to_apply_direct", enumC925840aCU, enumC925840aCU4), new C925880aCY("apply_to_connection_success_direct", enumC925840aCU4, EnumC925840aCU.CONNECTION_SUCCESS_DIRECT));
        LIZJ = Collections.singletonList(new C925880aCY("apply_to_permitIM_auto", enumC925840aCU4, EnumC925840aCU.PERMIT_IM));
        LIZLLL = Collections.singletonList(new C925880aCY("apply_to_connection_success_auto", enumC925840aCU4, EnumC925840aCU.CONNECTION_SUCCESS_AUTO));
    }
}
