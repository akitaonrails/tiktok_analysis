package X;

import androidx.compose.ui.draw.DrawBehindElement;
import androidx.compose.ui.draw.DrawWithCacheElement;
import androidx.compose.ui.draw.DrawWithContentElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680910tqL {
    public static final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super InterfaceC1675870tiD, Unit> function1) {
        return interfaceC1685750ty9.LIZ(new DrawBehindElement(function1));
    }

    public static final InterfaceC1685750ty9 LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super C1681030tqX, C1681040tqY> function1) {
        return interfaceC1685750ty9.LIZ(new DrawWithCacheElement(function1));
    }

    public static final InterfaceC1685750ty9 LIZJ(InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super InterfaceC1669010tX9, Unit> function1) {
        return interfaceC1685750ty9.LIZ(new DrawWithContentElement(function1));
    }
}
