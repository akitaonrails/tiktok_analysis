package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.edit.RevealStoryCreationModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import java.io.File;
import kotlin.jvm.internal.AFwS330S0000000_5;

/* JADX INFO: renamed from: X.0F4G, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F4G {
    public static final AFwS330S0000000_5 LIZ = AFwS330S0000000_5.get$arr$(1);
    public static final AFwS330S0000000_5 LIZIZ = AFwS330S0000000_5.get$arr$(2);

    public static final C0F4H LIZIZ(Context context) {
        C0F4H c0f4h = new C0F4H(context);
        Paint paint = new Paint();
        paint.setColor(Color.argb(51, 255, 255, 255));
        c0f4h.setOverlayLayerPaint(paint);
        Paint paint2 = new Paint();
        paint2.setColor(Color.argb(38, 0, 0, 0));
        c0f4h.setBackdropLayerPaint(paint2);
        return c0f4h;
    }

    public static final void LIZ(C0F4H c0f4h, RevealStoryCreationModel revealStoryCreationModel, InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Float, ? extends Path> interfaceC1631620sYq) {
        String customCutoutName;
        String anywhereChannelPath;
        Object c098200Yq;
        C1529670puP c1529670puP = C1529670puP.LIZ;
        Object obj = null;
        if (revealStoryCreationModel != null) {
            customCutoutName = revealStoryCreationModel.getCustomCutoutName();
        } else {
            customCutoutName = null;
        }
        c1529670puP.getClass();
        if (customCutoutName != null && customCutoutName.length() != 0) {
            IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
            if (iMainService != null && (anywhereChannelPath = iMainService.getAnywhereChannelPath("story_thought_bg_res")) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(anywhereChannelPath);
                sbLIZ.append('/');
                sbLIZ.append(customCutoutName);
                File fileLJFF = C2114508Qd.LJFF(new C0VSJ(""), C2188811AlT.LIZIZ(sbLIZ));
                if (fileLJFF != null && fileLJFF.exists()) {
                    try {
                        c098200Yq = BitmapFactory.decodeFile(fileLJFF.getAbsolutePath());
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                        obj = c098200Yq;
                    }
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        c0f4h.setHollowLayerContent(new C371590EhZ(0.16f, bitmap, new RectF()));
                        return;
                    }
                }
            } else {
                c1529670puP.LIZIZ();
            }
        }
        c0f4h.setHollowLayerContent(new C371600Eha(new C118300cf(), new C118300cf(), new C259800zU(), interfaceC1631620sYq, c0f4h));
    }
}
