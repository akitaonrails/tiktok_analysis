package X;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689740u4a {
    public static final AtomicInteger LIZ = new AtomicInteger(0);

    public static final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super InterfaceC1692460u8y, Unit> function1) {
        return interfaceC1685750ty9.LIZ(new ClearAndSetSemanticsElement(function1));
    }

    public static final InterfaceC1685750ty9 LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, Function1<? super InterfaceC1692460u8y, Unit> function1) {
        return interfaceC1685750ty9.LIZ(new AppendedSemanticsElement(function1, z));
    }
}
