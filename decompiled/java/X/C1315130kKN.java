package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.utils.GradientUtils;

/* JADX INFO: renamed from: X.0kKN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315130kKN extends AbstractC1315160kKQ {
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final float LLJILJIL;
    public final float LLJILJILJ;
    public final float LLJILLL;
    public final int LLJJ;
    public final float LLJJI;
    public final int LLJJIII;
    public final PointF LLJJIJI = new PointF(0.5f, 0.5f);

    public static float LJIIJJI(float f, float f2, int i) {
        if (i == 11) {
            return (f2 * f) / 100.0f;
        }
        switch (i) {
            case 32:
            case 35:
                return 0.0f;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return f2;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return f2 * 0.5f;
            default:
                return f;
        }
    }

    public C1315130kKN(ReadableArray readableArray) {
        this.LLJI = 36;
        this.LLJIJIL = 36;
        this.LLJILJIL = 0.5f;
        this.LLJILJILJ = 0.5f;
        if (readableArray == null) {
            LynxLog.e("RadialGradient", "native parser error, array is null");
            return;
        }
        if (readableArray.size() != 3) {
            LynxLog.e("RadialGradient", "native parser error, array.size must be 3");
        }
        ReadableArray array = readableArray.getArray(0);
        this.LLIZLLLIL = (int) array.getLong(0);
        int i = (int) array.getLong(1);
        this.LLJ = i;
        this.LLJI = (int) array.getLong(2);
        this.LLJILJIL = (float) array.getDouble(3);
        this.LLJIJIL = (int) array.getLong(4);
        this.LLJILJILJ = (float) array.getDouble(5);
        if (i == 4) {
            this.LLJILLL = (float) array.getDouble(10);
            this.LLJJ = array.getInt(11);
            this.LLJJI = (float) array.getDouble(12);
            this.LLJJIII = array.getInt(13);
        }
        LJIIJ(readableArray.getArray(1), readableArray.getArray(2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        PointF pointFLIZIZ;
        float f;
        float f2;
        float f3;
        this.LLILLL = rect.width();
        this.LLILZ = rect.height();
        this.LLJJIJI.x = LJIIJJI(this.LLJILJIL, this.LLILLL, this.LLJI);
        this.LLJJIJI.y = LJIIJJI(this.LLJILJILJ, this.LLILZ, this.LLJIJIL);
        PointF pointF = this.LLJJIJI;
        float f4 = pointF.x;
        float f5 = pointF.y;
        int i = this.LLJ;
        boolean z = true;
        if (i == 4) {
            if (this.LLJJ == 1) {
                f2 = this.LLILLL * this.LLJILLL;
            } else {
                f2 = this.LLJILLL;
            }
            if (this.LLJJIII == 1) {
                f3 = this.LLILZ * this.LLJJI;
            } else {
                f3 = this.LLJJI;
            }
            pointFLIZIZ = new PointF(f2, f3);
        } else {
            pointFLIZIZ = GradientUtils.LIZIZ(f4, f5, this.LLILLL, this.LLILZ, this.LLIZLLLIL, i);
        }
        int[] iArr = this.LLILZLL;
        if (iArr != null && iArr.length >= 2) {
            float[] fArr = this.LLIZ;
            if (fArr != null && fArr.length != iArr.length) {
                this.LLILLJJLI = null;
            } else {
                try {
                    float f6 = pointFLIZIZ.x;
                    if (f6 != 0.0f && pointFLIZIZ.y != 0.0f) {
                        z = false;
                    }
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = f6 / pointFLIZIZ.y;
                    }
                    this.LLILLJJLI = new RadialGradient(f4, f5, Math.max(pointFLIZIZ.x, 1.0f), this.LLILZLL, this.LLIZ, Shader.TileMode.CLAMP);
                    if (f != 1.0f) {
                        Matrix matrix = new Matrix();
                        matrix.preScale(1.0f, 1.0f / f, f4, f5);
                        this.LLILLJJLI.setLocalMatrix(matrix);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LLILLJJLI = null;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("exception:\n");
                    sbLIZ.append(e.toString());
                    LynxLog.w("BackgroundRadialGradientLayer", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        } else {
            this.LLILLJJLI = null;
        }
        super.setBounds(rect);
    }
}
