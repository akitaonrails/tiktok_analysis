package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.100u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191774100u extends AnonymousClass1017<InterfaceC722480SVq> {
    public static final C191774100u LIZ;
    public static final List<Pair<AnonymousClass1018, InterfaceC722480SVq>> LIZIZ;
    public static final C191773100t LIZJ;

    static {
        C191774100u c191774100u = new C191774100u();
        LIZ = c191774100u;
        LIZIZ = new ArrayList();
        LIZJ = C191773100t.LIZ;
        c191774100u.LJ(EnumC191771100r.FILTER_ALL, new InterfaceC722480SVq() { // from class: X.100z
            @Override // X.InterfaceC722480SVq
            public final InterfaceC722440SVm<? extends C07XH> LIZ(final Context context, final Aweme aweme, final String str, Function0<Unit> function0) {
                final AFwS198S0000000_11 aFwS198S0000000_11 = (AFwS198S0000000_11) function0;
                return new AnonymousClass1014(context, aweme, str, aFwS198S0000000_11) { // from class: X.1010
                    {
                        AnonymousClass1012 anonymousClass1012 = new AnonymousClass1012(2131830102, EnumC1620106Vz.FILTER_ALL_BANNER, "filter_all_comments", AFwS187S0000000_2.get$arr$(887), null);
                    }
                };
            }
        });
        c191774100u.LJ(EnumC191771100r.CARE_MODE_RECOMMEND, new InterfaceC722480SVq() { // from class: X.100y
            @Override // X.InterfaceC722480SVq
            public final InterfaceC722440SVm<? extends C07XH> LIZ(Context context, Aweme aweme, String str, Function0<Unit> function0) {
                return new AnonymousClass1014(context, aweme, str, (AFwS198S0000000_11) function0) { // from class: X.100w
                    {
                        AnonymousClass1012 anonymousClass1012 = new AnonymousClass1012(2131830100, EnumC1620106Vz.VUL_CREATOR_BANNER, "care_mode_suggest", AFwS217S0000000_28.get$arr$(543), AFwS217S0000000_28.get$arr$(544));
                    }
                };
            }
        });
        c191774100u.LJ(EnumC191771100r.CARE_MODE_ON, new InterfaceC722480SVq() { // from class: X.100x
            @Override // X.InterfaceC722480SVq
            public final InterfaceC722440SVm<? extends C07XH> LIZ(Context context, Aweme aweme, String str, Function0<Unit> function0) {
                return new AnonymousClass1014(context, aweme, str, (AFwS198S0000000_11) function0) { // from class: X.100v
                    {
                        AnonymousClass1012 anonymousClass1012 = new AnonymousClass1012(2131830101, EnumC1620106Vz.CARE_MODE_ON_BANNER, "care_mode_on", AFwS217S0000000_28.get$arr$(500), AFwS217S0000000_28.get$arr$(501));
                    }
                };
            }
        });
        c191774100u.LJ(EnumC191771100r.PAUSE_INTERACTIONS, new InterfaceC722480SVq() { // from class: X.0SVY
            @Override // X.InterfaceC722480SVq
            public final InterfaceC722440SVm<? extends C07XH> LIZ(Context context, Aweme aweme, String str, Function0<Unit> function0) {
                return new C0SVV(context);
            }
        });
    }

    @Override // X.AnonymousClass1017
    public final List<Pair<AnonymousClass1018, InterfaceC722480SVq>> LIZ() {
        return LIZIZ;
    }

    @Override // X.AnonymousClass1017
    public final C101A LIZIZ() {
        return LIZJ;
    }
}
