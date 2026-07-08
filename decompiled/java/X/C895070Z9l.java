package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Z9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895070Z9l implements InterfaceC895100Z9o {
    public static final C895070Z9l LIZ = new C895070Z9l();
    public static final HashMap<EnumC895080Z9m, List<String>> LIZIZ = new HashMap<>();
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("nudge", "nudge_back", "nudge_reference");
    public static final List<String> LIZLLL = C1697810uHb.LJIIJJI("interaction_name", "interaction_type", "enter_from", "enter_method", "message_type", "interaction_type", "interaction_name", "message_from");
    public static final InterfaceC1493505sz LJ = C0I0B.LJFF.LIZIZ();

    @Override // X.InterfaceC895100Z9o
    public final Map<String, String> LIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("message_type", EnumC895050Z9j.STICKER.getValue()), new Pair("a:light_interaction_name", "v1_basic_nudge_src"));
    }

    @Override // X.InterfaceC895100Z9o
    public final synchronized void LIZIZ(EnumC895080Z9m enumC895080Z9m) {
        LIZIZ.remove(enumC895080Z9m);
    }
}
