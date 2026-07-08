package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1021, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1021 extends AnonymousClass1017<InterfaceC722500SVs> {
    public static final AnonymousClass1021 LIZ;
    public static final List<Pair<AnonymousClass1018, InterfaceC722500SVs>> LIZIZ;
    public static final AnonymousClass1026 LIZJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1026] */
    static {
        AnonymousClass1021 anonymousClass1021 = new AnonymousClass1021();
        LIZ = anonymousClass1021;
        LIZIZ = new ArrayList();
        LIZJ = new C101A() { // from class: X.1026
            @Override // X.C101A
            public final String getScenario() {
                return "card_mask";
            }

            @Override // X.C101A
            public final String LIZ(int i) {
                if (i == AnonymousClass1027.CONTENT_CHECK.ordinal()) {
                    return "content_check";
                }
                if (i == AnonymousClass1027.PROHIBITED.ordinal()) {
                    return "prohibit";
                }
                if (i == AnonymousClass1027.GENERIC.ordinal()) {
                    return "report";
                }
                if (i == AnonymousClass1027.MODERATION.ordinal()) {
                    return "moderation";
                }
                if (i == AnonymousClass1027.RESTRICTED.ordinal()) {
                    return "nrnff";
                }
                return "";
            }
        };
        anonymousClass1021.LJ(AnonymousClass1022.CONTENT_CHECK, new InterfaceC722500SVs() { // from class: X.1020
            @Override // X.InterfaceC722500SVs
            public final InterfaceC722440SVm<? extends C07XH> LIZ(Context context, Aweme aweme, String str, Function0<Unit> function0) {
                return new C191803101x(context, aweme, str, function0);
            }
        });
        anonymousClass1021.LJ(AnonymousClass1022.PROHIBITED, new InterfaceC722500SVs() { // from class: X.0SVz
            @Override // X.InterfaceC722500SVs
            public final InterfaceC722440SVm<? extends C07XH> LIZ(Context context, Aweme aweme, String str, Function0<Unit> function0) {
                return new C722560SVy(context, aweme, str, function0);
            }
        });
        anonymousClass1021.LJ(AnonymousClass1022.GENERIC, new InterfaceC722500SVs() { // from class: X.0SVd
            @Override // X.InterfaceC722500SVs
            public final InterfaceC722440SVm<? extends C07XH> LIZ(Context context, Aweme aweme, String str, Function0<Unit> function0) {
                return new C722330SVb(context, aweme, str, function0);
            }
        });
        anonymousClass1021.LJ(AnonymousClass1022.MODERATION, new InterfaceC722500SVs() { // from class: X.1024
            @Override // X.InterfaceC722500SVs
            public final InterfaceC722440SVm<? extends C07XH> LIZ(Context context, Aweme aweme, String str, Function0<Unit> function0) {
                return new C191801101v(context, aweme, function0);
            }
        });
        anonymousClass1021.LJ(AnonymousClass1022.RESTRICTED, new InterfaceC722500SVs() { // from class: X.1025
            @Override // X.InterfaceC722500SVs
            public final InterfaceC722440SVm<? extends C07XH> LIZ(Context context, Aweme aweme, String str, Function0<Unit> function0) {
                return new C191802101w(context, aweme, function0);
            }
        });
    }

    @Override // X.AnonymousClass1017
    public final List<Pair<AnonymousClass1018, InterfaceC722500SVs>> LIZ() {
        return LIZIZ;
    }

    @Override // X.AnonymousClass1017
    public final C101A LIZIZ() {
        return LIZJ;
    }
}
