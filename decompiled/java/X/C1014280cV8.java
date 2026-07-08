package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearAction;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cV8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014280cV8 {
    public static final void LIZ(List<AnoleComponentAppearAction> list, InterfaceC1014270cV7 interfaceC1014270cV7) {
        C1008500cLo c1008500cLoLIZ;
        if (list == null) {
            return;
        }
        for (AnoleComponentAppearAction anoleComponentAppearAction : list) {
            String str = anoleComponentAppearAction.type;
            if (Intrinsics.LJFF(str, EnumC1014300cVA.REGISTER_SHAKE.getTypeName())) {
                Map<String, Object> map = anoleComponentAppearAction.params;
                if (map != null && (c1008500cLoLIZ = C1008490cLn.LIZ(map)) != null) {
                    interfaceC1014270cV7.LIZIZ(c1008500cLoLIZ);
                }
            } else if (Intrinsics.LJFF(str, EnumC1014300cVA.UNREGISTER_SHAKE.getTypeName())) {
                interfaceC1014270cV7.LJIILLIIL();
            } else if (Intrinsics.LJFF(str, EnumC1014300cVA.PAUSE_VIDEO.getTypeName())) {
                interfaceC1014270cV7.pauseVideo();
            } else if (Intrinsics.LJFF(str, EnumC1014300cVA.RESUME_VIDEO.getTypeName())) {
                interfaceC1014270cV7.LJJLIIJ();
            } else if (Intrinsics.LJFF(str, EnumC1014300cVA.AUTO_REPORT_CLICK.getTypeName())) {
                interfaceC1014270cV7.U2();
            } else if (Intrinsics.LJFF(str, EnumC1014300cVA.AUTO_LOAD_IAB.getTypeName())) {
                interfaceC1014270cV7.o0();
            } else if (Intrinsics.LJFF(str, EnumC1014300cVA.DEALLOC_IAB.getTypeName())) {
                interfaceC1014270cV7.P();
            }
        }
    }
}
