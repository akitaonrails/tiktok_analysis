package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.OverlayImageEditPreviewAssem;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01DU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01DU extends C09AY implements Function2<Long, Throwable, Unit> {
    public final /* synthetic */ OverlayImageEditPreviewAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01DU(OverlayImageEditPreviewAssem overlayImageEditPreviewAssem) {
        super(2);
        this.LL = overlayImageEditPreviewAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Long l, Throwable th) {
        int i;
        long jLongValue = l.longValue();
        Throwable th2 = th;
        OverlayImageEditPreviewAssem overlayImageEditPreviewAssem = this.LL;
        overlayImageEditPreviewAssem.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_image_load");
        c474500IjALIZ.LJJII("overlay_image", "image_kind");
        if (th2 == null) {
            i = 0;
        } else {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "result");
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "duration_ms");
        String str = ((C01DP) overlayImageEditPreviewAssem.LLJJI.getValue()).LLJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "decoration_set_id");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(((C01DP) overlayImageEditPreviewAssem.LLJJI.getValue()).LL.id), "item_id");
        c474500IjALIZ.LJJII("decoration_editor", Scene.SCENE_SERVICE);
        if (th2 != null) {
            c474500IjALIZ.LJJII(-1, "error_code");
            String message = th2.getMessage();
            if (message != null) {
                str2 = message;
            }
            c474500IjALIZ.LJJII(str2, "error_msg");
        }
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
