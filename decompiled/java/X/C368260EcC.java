package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368260EcC {
    public final InterfaceC369200Edi LIZ;
    public final Context LIZIZ;
    public final boolean LIZJ;
    public final Paint LIZLLL;
    public final Paint LJ;
    public final Paint LJFF;
    public final List<C368310EcH> LJI;
    public final C368390EcP LJII;
    public NLETrackSlot LJIIIIZZ;
    public final Path LJIIIZ;
    public final C01GW LJIIJ;

    public final boolean LJ() {
        return ((Boolean) this.LJIIJ.getValue()).booleanValue();
    }

    public final void LIZ(NLETrackSlot nLETrackSlot) {
        NLEResType resourceType;
        float f;
        float f2;
        boolean z;
        boolean z2;
        Paint paint;
        NLESegmentVideoAnimation segment;
        NLEResourceNode effectSDKVideoAnimation;
        ((ArrayList) this.LJI).clear();
        for (NLEVideoAnimation nLEVideoAnimation : nLETrackSlot.getVideoAnims()) {
            if (nLEVideoAnimation == null || (segment = nLEVideoAnimation.getSegment()) == null || (effectSDKVideoAnimation = segment.getEffectSDKVideoAnimation()) == null || (resourceType = effectSDKVideoAnimation.getResourceType()) == null) {
                resourceType = NLEResType.NONE;
            }
            if (resourceType != NLEResType.NONE && nLEVideoAnimation.getDuration() > 0) {
                float fLIZIZ = LIZIZ(nLEVideoAnimation.getStartTime());
                float fLIZIZ2 = LIZIZ(nLEVideoAnimation.getEndTime());
                if (this.LIZJ) {
                    f = 0.0f;
                } else {
                    f = this.LJII.LJI;
                }
                if (LJ()) {
                    f2 = fLIZIZ2;
                } else {
                    f2 = fLIZIZ;
                }
                if (!LJ()) {
                    fLIZIZ = fLIZIZ2;
                }
                RectF rectF = new RectF(f2, f, fLIZIZ, this.LIZ.getItemHeight() - f);
                if (nLEVideoAnimation.getStartTime() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (nLEVideoAnimation.getEndTime() == nLETrackSlot.getDuration()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i = C348620Dlc.LIZ[resourceType.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            paint = this.LJFF;
                        }
                    } else {
                        paint = this.LJ;
                    }
                } else {
                    paint = this.LIZLLL;
                }
                ((ArrayList) this.LJI).add(new C368310EcH(resourceType, rectF, paint, z, z2));
            }
        }
    }

    public final float LIZIZ(long j) {
        int iLIZJ = (int) (((j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * C360610EBv.LIZJ()) - 0.0f);
        if (LJ()) {
            return this.LIZ.getItemWidth() - iLIZJ;
        }
        return iLIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368260EcC.LIZJ(android.graphics.Canvas):void");
    }

    public static int LIZLLL(Context context, Integer num) {
        int iIntValue = 0;
        if (num == null) {
            return 0;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(num.intValue(), context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        return Color.argb(128, Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
    }

    public C368260EcC(InterfaceC369200Edi interfaceC369200Edi, Context context, boolean z) {
        this.LIZ = interfaceC369200Edi;
        this.LIZIZ = context;
        this.LIZJ = z;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.LIZLLL = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.LJ = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        this.LJFF = paint3;
        this.LJI = new ArrayList();
        this.LJII = C368130Ebz.LIZ(context);
        this.LJIIIZ = new Path();
        int iLIZLLL = LIZLLL(context, Integer.valueOf(R.attr.ob));
        int iLIZLLL2 = LIZLLL(context, Integer.valueOf(R.attr.ny));
        int iLIZLLL3 = LIZLLL(context, Integer.valueOf(R.attr.os));
        this.LJIIJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1173));
        paint.setColor(iLIZLLL);
        paint.setStyle(Paint.Style.FILL);
        paint2.setColor(iLIZLLL2);
        paint2.setStyle(Paint.Style.FILL);
        paint3.setColor(iLIZLLL3);
        paint3.setStyle(Paint.Style.FILL);
    }
}
