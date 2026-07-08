package X;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.0Ygl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880690Ygl {
    public static final Set<EnumC880520YgU> LIZ = Collections.singleton(EnumC880520YgU.MESSAGE_REQUEST_SPAM);

    public static final EnumC880520YgU LIZ() {
        return C0CYO.LIZJ.LJIIIIZZ() ? EnumC880520YgU.ALL_WITHOUT_STORY_REACTIONS : EnumC880520YgU.ALL;
    }

    public static final boolean LIZIZ(EnumC880520YgU enumC880520YgU) {
        return C13LQ.LJLIIL(new EnumC880520YgU[]{EnumC880520YgU.ALL, EnumC880520YgU.ALL_WITHOUT_STORY_REACTIONS}).contains(enumC880520YgU);
    }
}
