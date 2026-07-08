package X;

import android.content.Context;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565620MGi {
    public static final C565620MGi LIZ = new C565620MGi();
    public static boolean LIZIZ;

    public final synchronized void LIZ() {
        if (LIZIZ) {
            return;
        }
        C2497109qT.LIZ.getClass();
        C2497109qT.LIZIZ();
        LIZIZ = true;
    }

    public static InterfaceC1635410sex LIZIZ(C565620MGi c565620MGi, Context context, String str) {
        c565620MGi.getClass();
        InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(context, null);
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("source_category", "chat_shoot");
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("sticker_id", str);
        interfaceC1635410sexLIZ.yg(C2097608Jq.LJIIIIZZ(pairArr));
        return interfaceC1635410sexLIZ;
    }
}
