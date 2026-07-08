package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;

/* JADX INFO: renamed from: X.11j1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19579711j1 extends AbstractC19580211j6 {
    public final InterfaceC386401eo LJ;
    public final float[] LJFF;

    @Override // X.AbstractC19580211j6
    public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct interactStickerStruct) {
        return C19580611jA.LIZJ(j, interactStickerStruct);
    }

    @Override // X.AbstractC19580211j6
    public final void LJIIJJI(float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        interfaceC19579211iw.LIZ(this.LIZIZ.LJJ(f, f2));
    }

    public C19579711j1(Context context, C19579811j2 c19579811j2, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, InterfaceC386401eo interfaceC386401eo) {
        long jLLL;
        float[] fArr;
        super(context, c19579811j2, interactStickerStruct, c705930RmZ);
        this.LJ = interfaceC386401eo;
        if (interfaceC386401eo != null) {
            jLLL = interfaceC386401eo.LLL();
        } else {
            jLLL = 0;
        }
        List<NormalTrackTimeStamp> listLIZJ = C19580611jA.LIZJ(jLLL, interactStickerStruct);
        if (listLIZJ != null && !listLIZJ.isEmpty() && ListProtector.get(listLIZJ, 0) != null) {
            Object obj = ListProtector.get(listLIZJ, 0);
            if (obj != null) {
                RectF rectFLIZ = LIZ((NormalTrackTimeStamp) obj);
                float f = rectFLIZ.left;
                float f2 = rectFLIZ.top;
                float f3 = rectFLIZ.right;
                float f4 = rectFLIZ.bottom;
                fArr = new float[]{f, f2, f3, f2, f, f4, f3, f4};
                Matrix matrix = new Matrix();
                Object obj2 = ListProtector.get(listLIZJ, 0);
                if (obj2 != null) {
                    float rotation = ((NormalTrackTimeStamp) obj2).getRotation();
                    float f5 = fArr[2];
                    float f6 = fArr[0];
                    float f7 = ((f5 - f6) / 2.0f) + f6;
                    float f8 = fArr[5];
                    float f9 = fArr[3];
                    matrix.postRotate(rotation, f7, ((f8 - f9) / 2.0f) + f9);
                    matrix.mapPoints(fArr);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            fArr = null;
        }
        this.LJFF = fArr;
    }
}
