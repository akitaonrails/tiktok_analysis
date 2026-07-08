package X;

import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0E69, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E69 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C0E48 c0e48, boolean z, boolean z2, long j, Function0 function0, int i) {
        InterfaceC361710EGb previewPanelApi;
        Function0 function02 = function0;
        long j2 = j;
        boolean z3 = z2;
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            j2 = 0;
        }
        if ((i & 16) != 0) {
            function02 = null;
        }
        System.currentTimeMillis();
        IPreviewService iPreviewServiceLIZ = C357280Dza.LIZ();
        if (iPreviewServiceLIZ != null && (previewPanelApi = iPreviewServiceLIZ.getPreviewPanelApi()) != null) {
            if (!z) {
                previewPanelApi.XF1(true);
                if (c0e48 != null) {
                    c0e48.S7().LIZIZ(Boolean.FALSE, "full_bg_view_visibility", z3);
                }
                C354270Duj.LIZJ(j2, new AwS549S0100000_5(function02, (Function0<Unit>) 1127));
                return;
            }
            previewPanelApi.mi1(false, new C0E6A(z, z3, c0e48, j2, function02));
        }
    }
}
