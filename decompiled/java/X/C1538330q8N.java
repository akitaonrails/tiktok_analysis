package X;

import com.bytedance.hybrid.common.autoservice.ISDUIAPI;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q8N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538330q8N extends C09AY implements Function0<InterfaceC1538750q93<? extends InterfaceC1541990qEH>[]> {
    public C1538330q8N() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1538750q93<? extends InterfaceC1541990qEH>[] invoke() {
        InterfaceC1538750q93<? extends InterfaceC1541990qEH>[] interfaceC1538750q93Arr = new InterfaceC1538750q93[3];
        interfaceC1538750q93Arr[0] = C1538340q8O.LIZJ;
        C1536660q5g.LIZ.getClass();
        interfaceC1538750q93Arr[1] = C1536660q5g.LIZIZ;
        C587540N2q.LIZ.getClass();
        ISDUIAPI isduiapi = (ISDUIAPI) C587540N2q.LIZ(ISDUIAPI.class);
        interfaceC1538750q93Arr[2] = isduiapi != null ? isduiapi.getSduiKitViewProvider() : null;
        return interfaceC1538750q93Arr;
    }
}
