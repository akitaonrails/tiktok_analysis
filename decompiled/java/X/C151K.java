package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.game.GameKeytimeRecognitionLiveSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.151K, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C151K {
    public static final void LIZ(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final boolean LIZIZ(float[] fArr) {
        if (fArr == null) {
            return false;
        }
        int length = fArr.length;
        C151J c151j = C151J.DEFEAT_TIME;
        if (length <= c151j.getIdx() || fArr[c151j.getIdx()] < GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelScoreDefeatThreshold) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(float[] fArr) {
        if (fArr == null) {
            return false;
        }
        int length = fArr.length;
        C151I c151i = C151I.DEFEAT_TIME;
        if (length <= c151i.getIdx() || fArr[c151i.getIdx()] < GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelScoreDefeatThreshold) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(float[] fArr) {
        if (fArr == null) {
            return false;
        }
        int length = fArr.length;
        C151J c151j = C151J.ENEMY_KILL;
        if (length <= c151j.getIdx() || fArr[c151j.getIdx()] < GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelScoreEnemyThreshold) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(float[] fArr) {
        if (fArr == null) {
            return false;
        }
        int length = fArr.length;
        C151I c151i = C151I.ENEMY_KILL;
        if (length <= c151i.getIdx() || fArr[c151i.getIdx()] < GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelScoreEnemyThreshold) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(float[] fArr) {
        if (!LJII(fArr) && !LJIILIIL(fArr) && !LIZJ(fArr)) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(float[] fArr) {
        if (fArr != null) {
            int length = fArr.length;
            C151J c151j = C151J.KILL_TIME;
            if (length <= c151j.getIdx() || fArr[c151j.getIdx()] < GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelScoreKillThreshold) {
                return false;
            }
            if (!LJIIIIZZ(fArr) && !LJIIJ(fArr) && !LIZLLL(fArr)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean LJII(float[] fArr) {
        if (fArr != null) {
            int length = fArr.length;
            C151I c151i = C151I.ENEMY_KILL;
            if (length <= c151i.getIdx() || fArr[C151I.SELF_KILL.getIdx()] + fArr[C151I.TEAMMATE_KILL.getIdx()] + fArr[c151i.getIdx()] < GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelScoreKillThreshold) {
                return false;
            }
            if (!LJIIIZ(fArr) && !LJIIJJI(fArr) && !LJ(fArr)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(float[] fArr) {
        if (fArr == null) {
            return false;
        }
        int length = fArr.length;
        C151J c151j = C151J.SELF_KILL;
        if (length <= c151j.getIdx() || fArr[c151j.getIdx()] < GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelScoreSelfThreshold) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIZ(float[] fArr) {
        if (fArr == null) {
            return false;
        }
        int length = fArr.length;
        C151I c151i = C151I.SELF_KILL;
        if (length <= c151i.getIdx() || fArr[c151i.getIdx()] < GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelScoreSelfThreshold) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJ(float[] fArr) {
        if (fArr == null) {
            return false;
        }
        int length = fArr.length;
        C151J c151j = C151J.TEAMMATE_KILL;
        if (length <= c151j.getIdx() || fArr[c151j.getIdx()] < GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelScoreTeammateThreshold) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJJI(float[] fArr) {
        if (fArr == null) {
            return false;
        }
        int length = fArr.length;
        C151I c151i = C151I.TEAMMATE_KILL;
        if (length <= c151i.getIdx() || fArr[c151i.getIdx()] < GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelScoreTeammateThreshold) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIL(float[] fArr) {
        if (fArr == null) {
            return false;
        }
        int length = fArr.length;
        C151J c151j = C151J.VICTORY_TIME;
        if (length <= c151j.getIdx() || fArr[c151j.getIdx()] < GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelScoreVictoryThreshold) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILIIL(float[] fArr) {
        if (fArr == null) {
            return false;
        }
        int length = fArr.length;
        C151I c151i = C151I.VICTORY_TIME;
        if (length <= c151i.getIdx() || fArr[c151i.getIdx()] < GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelScoreVictoryThreshold) {
            return false;
        }
        return true;
    }

    public static final C0VSJ LJIILJJIL(ByteBuffer byteBuffer, int i, int i2, EnumC771350UNp enumC771350UNp, String str) {
        if (byteBuffer != null) {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                byteBuffer.rewind();
                bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
                C0VSJ c0vsjLIZIZ = C207206166i.LIZIZ(new C207207166j(str, enumC771350UNp, bitmapCreateBitmap, false, Bitmap.CompressFormat.PNG, 100, 780));
                bitmapCreateBitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                return c0vsjLIZIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("genReportFile failure. exception=");
                sbLIZ.append(e.getMessage());
                C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        }
        return null;
    }
}
