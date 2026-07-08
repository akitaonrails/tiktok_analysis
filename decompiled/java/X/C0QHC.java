package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.lynx.core.model.DynamicData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QHC, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QHC implements InterfaceC1611110s1l {
    public static final C0QHC LIZ = new C0QHC();

    @Override // X.InterfaceC1611110s1l
    public final boolean LJIL() {
        C670650QSh.LIZ.getClass();
        return C123100dR.LIZ(C670650QSh.LIZIZ.LJFF);
    }

    @Override // X.InterfaceC1611110s1l
    public final String L0() {
        DynamicPatch dynamicPatch;
        DynamicData dynamicData = (DynamicData) C13LP.LJJJLZIJ(0, C646980PZg.LIZ());
        if (dynamicData == null || (dynamicPatch = dynamicData.dynamicPatch) == null) {
            return null;
        }
        return dynamicPatch.schema;
    }

    @Override // X.InterfaceC1611110s1l
    public final void LJLLLL() {
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.07x1
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SearchIconGeneratorPartialImpl@6a9f.asyncPrepareSearchMultiCoinTaskConfig$1");
                try {
                    ((Number) C18115077p.LIZ.getValue()).intValue();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SearchIconGeneratorPartialImpl@6a9f.asyncPrepareSearchMultiCoinTaskConfig$1");
            }
        });
    }

    @Override // X.InterfaceC1611110s1l
    public final boolean LLIIIZ() {
        return C0QS0.LIZ();
    }

    @Override // X.InterfaceC1611110s1l
    public final void P() {
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0QE9
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SearchIconGeneratorPartialImpl@6a9f.asyncPrepareSearchVerticalTabConfig$1");
                try {
                    C0QD9.LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SearchIconGeneratorPartialImpl@6a9f.asyncPrepareSearchVerticalTabConfig$1");
            }
        });
    }

    @Override // X.InterfaceC1611110s1l
    public final void v0(Function0<Unit> function0) {
        C670650QSh.LIZ.getClass();
        C670650QSh.LIZJ = function0;
    }
}
