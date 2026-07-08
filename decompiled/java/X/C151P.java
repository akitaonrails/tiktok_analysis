package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.bytedance.android.livesdk.game.common.datachannel.BroadCastGameMomentChannel;
import com.bytedance.android.livesdk.game.data.GameClientAIMomentData;
import com.bytedance.android.livesdk.livesetting.game.GameKeytimeRecognitionLiveSetting;
import com.bytedance.android.livesdk.livesetting.game.moment.LiveGameMomentImageSelfKillEffectArraySetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.151P, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C151P implements InterfaceC779640UiA {
    public static final float LIZLLL = GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelScoreKillThreshold;
    public final Room LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public C11JF LIZJ;

    @Override // X.InterfaceC779640UiA
    public final long LIZIZ() {
        return 0L;
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LJII() {
        return false;
    }

    @Override // X.InterfaceC779640UiA
    public final String scene() {
        return "game_keytime_recognition_live";
    }

    public static int LJIIIZ() {
        try {
            int iAppId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId();
            if (iAppId == 1180) {
                return GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().deploymentIdList.get(1).intValue();
            }
            if (iAppId == 1233) {
                return GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().deploymentIdList.get(0).intValue();
            }
            if (iAppId == 473824) {
                return GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().deploymentIdList.get(2).intValue();
            }
            return -1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map = C1338270kvh.LIZ;
            return -1;
        }
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LIZ() {
        boolean z = this.LIZIZ.get();
        Map<String, Object> map = C1338270kvh.LIZ;
        return !z;
    }

    @Override // X.InterfaceC779640UiA
    public final String LIZLLL() {
        String strYh2 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.KEY_TIME);
        Map<String, Object> map = C1338270kvh.LIZ;
        return strYh2;
    }

    @Override // X.InterfaceC779640UiA
    public final void LJ() {
        Map<String, Object> map = C1338270kvh.LIZ;
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).w82(C151B.KEY_TIME);
    }

    @Override // X.InterfaceC779640UiA
    public final void LJI() {
        Map<String, Object> map = C1338270kvh.LIZ;
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).OV(C151B.KEY_TIME);
    }

    @Override // X.InterfaceC779640UiA
    public final C151B LIZJ() {
        return C151B.KEY_TIME;
    }

    public C151P(Room room) {
        this.LIZ = room;
    }

    public static boolean LJIIJ(float[] fArr) {
        if (GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelOpt) {
            return C151K.LJFF(fArr);
        }
        return LJIIJ(fArr);
    }

    public final void LJIIJJI(long j, String str, String str2) {
        String idStr;
        if (Intrinsics.LJFF(str, "kill") && Intrinsics.LJFF(str2, "self")) {
            C204543151x c204543151x = new C204543151x();
            c204543151x.LIZ = 1;
            GameClientAIMomentData gameClientAIMomentData = new GameClientAIMomentData();
            gameClientAIMomentData.messageType = 2;
            gameClientAIMomentData.recognitionEnd = "Android";
            gameClientAIMomentData.eventTime = j;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            Room room = this.LIZ;
            if (room != null) {
                idStr = room.getIdStr();
            } else {
                idStr = null;
            }
            sbLIZ.append(idStr);
            sbLIZ.append('_');
            sbLIZ.append(j);
            gameClientAIMomentData.uniqueId = C2188811AlT.LIZIZ(sbLIZ);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C13LQ.LJJLJ(LiveGameMomentImageSelfKillEffectArraySetting.INSTANCE.getValue()));
            gameClientAIMomentData.momentEffects = arrayList;
            c204543151x.LIZJ = gameClientAIMomentData;
            DataChannelGlobal.LLILZ.HQ2(BroadCastGameMomentChannel.class, c204543151x);
            Map<String, Object> map = C1338270kvh.LIZ;
        }
    }

    @Override // X.InterfaceC779640UiA
    public final void LJIIIIZZ(long j, long j2, ByteBuffer byteBuffer, int i, int i2, int i3, AbstractC1273900jFs abstractC1273900jFs, boolean z, String str, InterfaceC204502150i interfaceC204502150i) throws Throwable {
        ByteBuffer byteBufferAllocate;
        Bitmap bitmapCreateBitmap;
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LIZIZ.set(true);
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        } catch (Exception e) {
            e = e;
        }
        try {
            bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
            Matrix matrix = new Matrix();
            matrix.postScale(224.0f / i, 224.0f / i2);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(224, 224, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapCreateBitmap, matrix, new Paint());
            byteBufferAllocate = ByteBuffer.allocate(200704);
            bitmapCreateBitmap2.copyPixelsToBuffer(byteBufferAllocate);
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map2 = C1338270kvh.LIZ;
            byteBufferAllocate = byteBuffer;
        }
        C23250099c.LJ(C23271099x.INSTANCE, new C151M(this, byteBufferAllocate, str, z, interfaceC204502150i, byteBuffer, j2, abstractC1273900jFs, null));
    }
}
