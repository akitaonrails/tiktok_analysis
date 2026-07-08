package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.0FVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C391270FVt {
    public static final /* synthetic */ C391270FVt LIZ = new C391270FVt();

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C391270FVt c391270FVt, EnumC1466150oFx enumC1466150oFx, InterfaceC391240FVq interfaceC391240FVq, String str, Function1 function1, int i) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            function1 = AFwS234S0000000_5.get$arr$(119);
        }
        c391270FVt.getClass();
        StickerModel stickerModel = (StickerModel) C13LP.LJJJLL(interfaceC391240FVq.LLLILZLLLI(enumC1466150oFx));
        if (stickerModel == null) {
            interfaceC391240FVq.Tn0(enumC1466150oFx, null, str, function1);
        } else {
            interfaceC391240FVq.sS(stickerModel);
        }
    }
}
