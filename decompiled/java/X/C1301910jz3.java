package X;

import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0jz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301910jz3 {
    public static final Map<EnumC1301920jz4, Set<EnumC1301920jz4>> LIZJ;
    public EnumC1301920jz4 LIZ;
    public EnumC1301920jz4 LIZIZ;

    static {
        EnumC1301920jz4 enumC1301920jz4 = EnumC1301920jz4.VOICE;
        EnumC1301920jz4 enumC1301920jz42 = EnumC1301920jz4.KEYBOARD;
        EnumC1301920jz4 enumC1301920jz43 = EnumC1301920jz4.LISTENING;
        EnumC1301920jz4 enumC1301920jz44 = EnumC1301920jz4.THINKING;
        EnumC1301920jz4 enumC1301920jz45 = EnumC1301920jz4.INTERRUPTED;
        EnumC1301920jz4 enumC1301920jz46 = EnumC1301920jz4.ANSWERING;
        EnumC1301920jz4 enumC1301920jz47 = EnumC1301920jz4.ANSWERED;
        LIZJ = C2097608Jq.LJIIIIZZ(new Pair(enumC1301920jz4, C13LQ.LJLIIL(new EnumC1301920jz4[]{enumC1301920jz42, enumC1301920jz43})), new Pair(enumC1301920jz42, C13LQ.LJLIIL(new EnumC1301920jz4[]{enumC1301920jz4, enumC1301920jz43})), new Pair(enumC1301920jz43, C13LQ.LJLIIL(new EnumC1301920jz4[]{enumC1301920jz44, enumC1301920jz45})), new Pair(enumC1301920jz44, C13LQ.LJLIIL(new EnumC1301920jz4[]{enumC1301920jz46, enumC1301920jz45})), new Pair(enumC1301920jz46, C13LQ.LJLIIL(new EnumC1301920jz4[]{enumC1301920jz47, enumC1301920jz45})), new Pair(enumC1301920jz45, C13LQ.LJLIIL(new EnumC1301920jz4[]{enumC1301920jz4, enumC1301920jz42})), new Pair(enumC1301920jz47, C13LQ.LJLIIL(new EnumC1301920jz4[]{enumC1301920jz4, enumC1301920jz42})));
    }

    public C1301910jz3() {
        EnumC1301920jz4 enumC1301920jz4 = EnumC1301920jz4.VOICE;
        this.LIZ = enumC1301920jz4;
        this.LIZIZ = enumC1301920jz4;
    }
}
