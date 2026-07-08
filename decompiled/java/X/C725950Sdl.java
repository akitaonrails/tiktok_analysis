package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Sdl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725950Sdl implements C15W0 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    @Override // X.C15W0
    public final Map<String, String> LIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", "homepage_explore"), new Pair("group_id", this.LIZ), new Pair("author_id", this.LIZIZ), new Pair("card_position", this.LIZJ));
    }

    @Override // X.C15W0
    public final String getEventName() {
        return "explore_long_press_card";
    }

    public C725950Sdl(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
