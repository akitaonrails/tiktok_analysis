package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.bytedance.android.livesdk.game.common.datachannel.BroadCastGameMomentChannel;
import com.bytedance.android.livesdk.game.data.GameClientAIMomentData;
import com.bytedance.android.livesdk.livesetting.game.GameKeytimeRecognitionLiveSetting;
import com.bytedance.android.livesdk.livesetting.game.GameMLBBHeroRecogSetting;
import com.bytedance.android.livesdk.livesetting.game.moment.LiveGameMomentImageSelfKillEffectArraySetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.151N, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C151N implements InterfaceC779640UiA {
    public static final float LJIIJ;
    public static final long LJIIJJI;
    public static final long LJIIL;
    public static final int LJIILIIL;
    public static final long LJIILJJIL;
    public static final long LJIILL;
    public final Room LIZ;
    public final boolean LIZIZ;
    public long LIZJ;
    public final C151F LIZLLL;
    public long LJ;
    public final C151F LJFF;
    public final C204515150v LJI;
    public final AtomicBoolean LJII;
    public final Map<Long, InterfaceC420801kM> LJIIIIZZ;
    public volatile long LJIIIZ;

    @Override // X.InterfaceC779640UiA
    public final String scene() {
        return "game_keytime_recognition_live";
    }

    static {
        GameKeytimeRecognitionLiveSetting gameKeytimeRecognitionLiveSetting = GameKeytimeRecognitionLiveSetting.INSTANCE;
        LJIIJ = gameKeytimeRecognitionLiveSetting.getValue().modelScoreKillThreshold;
        LJIIJJI = gameKeytimeRecognitionLiveSetting.getValue().screenshotInterval;
        LJIIL = gameKeytimeRecognitionLiveSetting.getValue().screenshotMaxInterval;
        LJIILIIL = gameKeytimeRecognitionLiveSetting.getValue().maxReportTask;
        LJIILJJIL = gameKeytimeRecognitionLiveSetting.getValue().highlightReportInterval;
        LJIILL = gameKeytimeRecognitionLiveSetting.getValue().serverInferInterval;
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LIZ() {
        return !(GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelOffloadOpt && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground()) && !this.LJII.get() && ((ConcurrentHashMap) this.LJIIIIZZ).size() < LJIILIIL && (System.currentTimeMillis() - this.LJIIIZ) / 1000 >= this.LIZJ / 1000;
    }

    @Override // X.InterfaceC779640UiA
    public final long LIZIZ() {
        return this.LJIIIZ + this.LIZJ;
    }

    @Override // X.InterfaceC779640UiA
    public final String LIZLLL() {
        return ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.KEY_TIME);
    }

    @Override // X.InterfaceC779640UiA
    public final void LJ() {
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).w82(C151B.KEY_TIME);
    }

    @Override // X.InterfaceC779640UiA
    public final void LJI() {
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).OV(C151B.KEY_TIME);
        C204515150v c204515150v = this.LJI;
        if (c204515150v != null) {
            c204515150v.LJI();
        }
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LJII() {
        return GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelOffloadOpt;
    }

    @Override // X.InterfaceC779640UiA
    public final C151B LIZJ() {
        return C151B.KEY_TIME;
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LJFF() {
        return this.LIZIZ;
    }

    public C151N(Room room) {
        long id;
        C204515150v c204515150v;
        this.LIZ = room;
        GameKeytimeRecognitionLiveSetting gameKeytimeRecognitionLiveSetting = GameKeytimeRecognitionLiveSetting.INSTANCE;
        this.LIZIZ = gameKeytimeRecognitionLiveSetting.getValue().modelOffloadToCloudInference;
        this.LIZJ = LJIIJJI;
        String strYh2 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.KEY_GAP);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LJFF = new C151F(strYh2, id);
        if (GameMLBBHeroRecogSetting.INSTANCE.getValue().enable) {
            c204515150v = new C204515150v(room);
        } else {
            c204515150v = null;
        }
        this.LJI = c204515150v;
        if (gameKeytimeRecognitionLiveSetting.getValue().costReportSwitcher) {
            this.LIZLLL = new C151F(((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.KEY_TIME), room != null ? room.getId() : 0L);
        }
        this.LJII = new AtomicBoolean(false);
        this.LJIIIIZZ = new ConcurrentHashMap();
        this.LJIIIZ = -1L;
    }

    public final void LJIIJ(float[] fArr, boolean z) {
        long j;
        if (z) {
            j = LJIILL;
        } else if (!z) {
            if (GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelOpt) {
                if (!C151K.LJIILIIL(fArr) && !C151K.LIZJ(fArr)) {
                    j = LJIIJJI;
                } else {
                    j = LJIIL;
                }
            } else if (!C151K.LJIIL(fArr) && !C151K.LIZIZ(fArr)) {
                j = LJIIJJI;
            } else {
                j = LJIIL;
            }
        } else {
            throw new C1954807lC();
        }
        this.LIZJ = j;
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public final void LJIIIZ(long j, String str, String str2) {
        String idStr;
        if (Intrinsics.LJFF(str, "kill") && Intrinsics.LJFF(str2, "self")) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
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
            dataChannelGlobal.HQ2(BroadCastGameMomentChannel.class, c204543151x);
        }
    }

    @Override // X.InterfaceC779640UiA
    public final void LJIIIIZZ(long j, long j2, ByteBuffer byteBuffer, int i, int i2, int i3, AbstractC1273900jFs abstractC1273900jFs, boolean z, String str, InterfaceC204502150i interfaceC204502150i) throws Throwable {
        ByteBuffer byteBufferAllocate;
        Bitmap bitmapCreateBitmap;
        Long lLJIILIIL;
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LJIIIZ = j;
        GameKeytimeRecognitionLiveSetting gameKeytimeRecognitionLiveSetting = GameKeytimeRecognitionLiveSetting.INSTANCE;
        if (gameKeytimeRecognitionLiveSetting.getValue().modelFusionTagOpt && ((lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null || !gameKeytimeRecognitionLiveSetting.isRecognitionLive(Long.valueOf(lLJIILIIL.longValue())))) {
            LJIIJ(new float[0], true);
            this.LJFF.LIZLLL(new AnonymousClass1517(0L), null, "game_keytime_recognition_live_invalid_fusion_id", str, false);
            return;
        }
        AnonymousClass1517 anonymousClass1517 = new AnonymousClass1517(j);
        anonymousClass1517.LIZ(j2);
        this.LJII.set(true);
        if (z) {
            byteBufferAllocate = byteBuffer;
        } else {
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
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getAIBuffer. exception=");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("GameKeyTimeInferModuleTag", C2188811AlT.LIZIZ(sbLIZ));
                byteBufferAllocate = byteBuffer;
            }
        }
        C23250099c.LJ(C23271099x.INSTANCE, new C151L(this, byteBufferAllocate, str, z, j, j2, byteBuffer, i, i2, i3, abstractC1273900jFs, interfaceC204502150i, anonymousClass1517, null));
    }
}
