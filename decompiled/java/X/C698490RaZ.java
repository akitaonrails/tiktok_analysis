package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698490RaZ extends C09AY implements Function0<InterfaceC697420RXg> {
    public C698490RaZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC697420RXg invoke() {
        final ArrayList arrayList = new ArrayList();
        return new InterfaceC697420RXg(arrayList) { // from class: X.0Rab
            public final C698520Rac LIZ;
            public final C698500Raa LIZIZ;

            @Override // X.InterfaceC697420RXg
            public final /* bridge */ /* synthetic */ Function1 LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC697420RXg
            public final /* bridge */ /* synthetic */ Function1 LIZIZ() {
                return this.LIZIZ;
            }

            {
                this.LIZ = new C698520Rac(arrayList);
                this.LIZIZ = new C698500Raa(arrayList);
            }
        };
    }
}
