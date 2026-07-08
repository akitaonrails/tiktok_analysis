package X;

import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05uX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1503105uX {
    public static final /* synthetic */ int LIZ = 0;

    public static IMAIBotInfo LIZIZ() {
        IMAIBotInfo iMAIBotInfo;
        C15408061m c15408061m = C15408061m.LIZ;
        C15390060u.LL.getClass();
        int i = C15390060u.LLILLJJLI;
        EnumC1510605vk enumC1510605vk = EnumC1510605vk.CACHE;
        c15408061m.getClass();
        List listLJII = C15408061m.LJII(i, enumC1510605vk);
        if (listLJII != null && (iMAIBotInfo = (IMAIBotInfo) C13LP.LJJJLL(listLJII)) != null) {
            return iMAIBotInfo;
        }
        List listLJII2 = C15408061m.LJII(i, EnumC1510605vk.LOCAL);
        if (listLJII2 != null) {
            return (IMAIBotInfo) C13LP.LJJJLL(listLJII2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.Collection, java.util.List] */
    public static void LIZ(Function1 function1) {
        C259800zU c259800zU = new C259800zU();
        C15408061m c15408061m = C15408061m.LIZ;
        C15390060u.LL.getClass();
        int i = C15390060u.LLILLJJLI;
        EnumC1510605vk enumC1510605vk = EnumC1510605vk.CACHE;
        c15408061m.getClass();
        ?? LJII = C15408061m.LJII(i, enumC1510605vk);
        c259800zU.element = LJII;
        Object objLJJJLZIJ = null;
        if (C866950Xzh.LIZIZ(LJII)) {
            List list = (List) c259800zU.element;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            }
            function1.invoke(objLJJJLZIJ);
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1502905uV(null, function1, c259800zU), 3);
    }
}
