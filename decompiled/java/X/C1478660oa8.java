package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oa8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478660oa8 extends C09AY implements Function0<C584730MwZ> {
    public C1478660oa8() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0MwZ] */
    @Override // kotlin.jvm.functions.Function0
    public final C584730MwZ invoke() {
        return new InterfaceC584750Mwb() { // from class: X.0MwZ
            @Override // X.InterfaceC584750Mwb
            public final InterfaceC585080Mx8 LIZ(C585050Mx5 c585050Mx5) {
                String str;
                if (c585050Mx5 != null) {
                    str = c585050Mx5.LJ;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str, "cmd_adaptive_prerender")) {
                    return null;
                }
                return new C584370Mvz(c585050Mx5);
            }
        };
    }
}
