package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.bytedance.android.livesdk.livesetting.game.GameRestRecognitionLiveSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartGameRestRecognitionExperiment;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1511, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1511 implements InterfaceC779640UiA {
    public static final long LJI;
    public static final long LJII;
    public static final long LJIIIIZZ;
    public final Room LIZ;
    public final C151F LIZIZ;
    public volatile long LIZJ;
    public final AtomicBoolean LIZLLL;
    public long LJ;
    public final boolean LJFF;

    @Override // X.InterfaceC779640UiA
    public final boolean LJII() {
        return true;
    }

    @Override // X.InterfaceC779640UiA
    public final String scene() {
        return SmartGameRestRecognitionExperiment.SCENE;
    }

    static {
        GameRestRecognitionLiveSetting gameRestRecognitionLiveSetting = GameRestRecognitionLiveSetting.INSTANCE;
        long j = gameRestRecognitionLiveSetting.getValue().screenshotMinInterval;
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        LJI = j / j2;
        LJII = gameRestRecognitionLiveSetting.getValue().screenshotMaxInterval / j2;
        LJIIIIZZ = gameRestRecognitionLiveSetting.getValue().serverInferInterval / j2;
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LIZ() {
        return !this.LIZLLL.get() && (System.currentTimeMillis() - this.LIZJ) / 1000 >= this.LJ;
    }

    @Override // X.InterfaceC779640UiA
    public final long LIZIZ() {
        return this.LIZJ + (this.LJ * 1000);
    }

    @Override // X.InterfaceC779640UiA
    public final String LIZLLL() {
        return ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.KEY_GAP);
    }

    @Override // X.InterfaceC779640UiA
    public final void LJ() {
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).w82(C151B.KEY_GAP);
    }

    @Override // X.InterfaceC779640UiA
    public final void LJI() {
        if (this.LIZ != null) {
            GameTag gameTag = EnumC754690Tj1.SCREEN_RECORD.getGameTag();
            if (GameRestRecognitionLiveSetting.INSTANCE.isRecognitionLiveTag(gameTag != null ? gameTag.id : null)) {
                ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(EnumC19363810pI.UNKNOWN, "g_broadcast_game_rest_status");
            }
        }
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).OV(C151B.KEY_GAP);
    }

    @Override // X.InterfaceC779640UiA
    public final C151B LIZJ() {
        return C151B.KEY_GAP;
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LJFF() {
        return this.LJFF;
    }

    public AnonymousClass1511(Room room) {
        long id;
        this.LIZ = room;
        ILiveGameService iLiveGameService = (ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class);
        C151B c151b = C151B.KEY_GAP;
        String strYh2 = iLiveGameService.yh2(c151b);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LIZIZ = new C151F(strYh2, id);
        new C151F(((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(c151b), room != null ? room.getId() : 0L);
        this.LIZJ = -1L;
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = LJI;
        this.LJFF = true;
    }

    @Override // X.InterfaceC779640UiA
    public final void LJIIIIZZ(long j, long j2, ByteBuffer byteBuffer, int i, int i2, int i3, AbstractC1273900jFs abstractC1273900jFs, boolean z, String str, InterfaceC204502150i interfaceC204502150i) throws Throwable {
        int i4;
        ByteBuffer byteBufferAllocate = byteBuffer;
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LIZJ = j;
        AnonymousClass1517 anonymousClass1517 = new AnonymousClass1517(j);
        anonymousClass1517.LIZ(j2);
        this.LIZLLL.set(true);
        if (z) {
            i4 = 0;
        } else {
            if (i != 224 || i2 != 224) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
                Matrix matrix = new Matrix();
                float f = 224;
                matrix.postScale(f / i, f / i2);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(224, 224, Bitmap.Config.ARGB_8888);
                new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapCreateBitmap, matrix, new Paint());
                byteBufferAllocate = ByteBuffer.allocate(200704);
                bitmapCreateBitmap2.copyPixelsToBuffer(byteBufferAllocate);
            }
            i4 = 224;
        }
        C23250099c.LJ(C23271099x.INSTANCE, new C204509150p(this, byteBufferAllocate, z, str, i4, i4, anonymousClass1517, j2, interfaceC204502150i, null));
    }
}
