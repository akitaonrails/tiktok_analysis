package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FN9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FN9 {
    public final Map<Integer, String> LIZ;
    public final List<TextStickerModel> LIZIZ;
    public final C1463670oBx LIZJ;
    public final String LIZLLL;
    public final Bitmap LJ;
    public final InterfaceC497601wk LJFF;
    public final RectF LJI;
    public final View LJII;
    public final boolean LJIIIIZZ;
    public final Activity LJIIIZ;
    public final InterfaceC1450620nqu LJIIJ;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 50));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 49));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(31));

    public static void LIZ(C1463670oBx c1463670oBx) {
        NLEModel nLEModelLIZJ = c1463670oBx.LIZJ();
        VecNLETrackSPtr tracks = nLEModelLIZJ.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (Intrinsics.LJFF(nLETrack.getExtra("COMMENT_IMAGE_EDIT_FLATTEN"), "TEXT_BITMAP")) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            nLEModelLIZJ.removeTrack((NLETrack) it2.next());
        }
        c1463670oBx.jg();
    }

    public static Rect LIZIZ(Rect rect, Bitmap bitmap, Rect rect2) {
        float f;
        int iWidth = rect2.width();
        if (iWidth < 1) {
            iWidth = 1;
        }
        int iHeight = rect2.height();
        if (iHeight < 1) {
            iHeight = 1;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = width;
        float f3 = height;
        float f4 = f2 / f3;
        float f5 = iWidth;
        float f6 = iHeight;
        float f7 = f5 / f6;
        float fMin = Math.min(f5 / f2, f6 / f3);
        float f8 = 0.0f;
        if (f4 > f7) {
            float f9 = f5 / f4;
            f = (f6 - f9) / 2.0f;
            f6 = f9;
        } else {
            float f10 = f4 * f6;
            f = 0.0f;
            f8 = (f5 - f10) / 2.0f;
            f5 = f10;
        }
        Rect rect3 = new Rect(C13LZ.LJ((int) ((Math.max(rect.left, f8) - f8) / fMin), 0, width - 1), C13LZ.LJ((int) ((Math.max(rect.top, f) - f) / fMin), 0, height - 1), C13LZ.LJ((int) ((Math.min(rect.right, f5 + f8) - f8) / fMin), 1, width), C13LZ.LJ((int) ((Math.min(rect.bottom, f6 + f) - f) / fMin), 1, height));
        if (rect3.width() <= 0) {
            rect3.right = rect3.left + 1;
        }
        if (rect3.height() <= 0) {
            rect3.bottom = rect3.top + 1;
        }
        return rect3;
    }

    public C0FN9(Map map, List list, C1463670oBx c1463670oBx, String str, Bitmap bitmap, LifecycleCoroutineScope lifecycleCoroutineScope, RectF rectF, View view, boolean z, Activity activity, InterfaceC1450620nqu interfaceC1450620nqu) {
        this.LIZ = map;
        this.LIZIZ = list;
        this.LIZJ = c1463670oBx;
        this.LIZLLL = str;
        this.LJ = bitmap;
        this.LJFF = lifecycleCoroutineScope;
        this.LJI = rectF;
        this.LJII = view;
        this.LJIIIIZZ = z;
        this.LJIIIZ = activity;
        this.LJIIJ = interfaceC1450620nqu;
    }
}
