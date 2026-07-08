package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS426S0200000_25;

/* JADX INFO: renamed from: X.0t4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651460t4q {
    public final C1DRG LIZ;
    public final List<C1651470t4r> LIZIZ = new ArrayList();

    public C1651460t4q(C1DRG c1drg, C1651290t4Z c1651290t4Z) {
        this.LIZ = c1drg;
    }

    public final <STATE extends C1ETD, ACTION extends InterfaceC1659130tHD<? super STATE>, ITEM extends AbstractC1651450t4p<STATE, ACTION>> void LIZ(Class<STATE> cls, Class<ACTION> cls2, Function1<? super C1DRG, ? extends ITEM> function1) {
        ((ArrayList) this.LIZIZ).add(new C1651470t4r(cls, cls2, new AwS426S0200000_25((Function1) function1, this, (C1651460t4q) 150)));
    }
}
