package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tabicon.ITabIconService;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585830rMz extends C09AY implements Function0<Set<C1BL2>> {
    public C1585830rMz() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<C1BL2> invoke() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C1585140rLs());
        if (((Boolean) C0B75.LIZ.getValue()).booleanValue()) {
            linkedHashSet.add(new C1BL2() { // from class: X.0rN1
                @Override // X.C1BL2
                public final void LIZ() {
                }

                @Override // X.C1BL2
                public final void LIZIZ() {
                    ITabIconService iTabIconService = (ITabIconService) PluggableExtentionKt.pluggableSpi$default(ITabIconService.class, false, false, false, 14, null);
                    if (iTabIconService != null) {
                        iTabIconService.LIZ(false);
                    }
                }
            });
        }
        return linkedHashSet;
    }
}
