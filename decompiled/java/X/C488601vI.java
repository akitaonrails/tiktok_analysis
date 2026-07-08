package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.LivePcsDecorationCanvasTopOffset;

/* JADX INFO: renamed from: X.01vI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C488601vI {
    public static volatile C488301vF LIZ;

    public static C488301vF LIZ() {
        C488301vF c488301vF = LIZ;
        if (c488301vF != null) {
            return c488301vF;
        }
        LIZ = new C488301vF(LivePcsDecorationCanvasTopOffset.INSTANCE.getValue(), C418440Gaw.LIZIZ(Float.valueOf(57.0f)), C14KS.LJFF(), C14KS.LIZLLL());
        return LIZ;
    }
}
