package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.bytedance.android.livesdk.livesetting.game.GameRestRecognitionLiveSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.ss.android.ugc.aweme.ml.ab.SmartGameRestRecognitionExperiment;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1512, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1512 implements InterfaceC779640UiA {
    public final Room LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

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
        return SmartGameRestRecognitionExperiment.SCENE;
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LIZ() {
        boolean z = this.LIZIZ.get();
        Map<String, Object> map = C1338270kvh.LIZ;
        return !z;
    }

    @Override // X.InterfaceC779640UiA
    public final String LIZLLL() {
        String strYh2 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.KEY_GAP);
        Map<String, Object> map = C1338270kvh.LIZ;
        return strYh2;
    }

    @Override // X.InterfaceC779640UiA
    public final void LJ() {
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).w82(C151B.KEY_GAP);
        Map<String, Object> map = C1338270kvh.LIZ;
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
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // X.InterfaceC779640UiA
    public final C151B LIZJ() {
        return C151B.KEY_GAP;
    }

    public AnonymousClass1512(Room room) {
        this.LIZ = room;
    }

    @Override // X.InterfaceC779640UiA
    public final void LJIIIIZZ(long j, long j2, ByteBuffer byteBuffer, int i, int i2, int i3, AbstractC1273900jFs abstractC1273900jFs, boolean z, String str, InterfaceC204502150i interfaceC204502150i) throws Throwable {
        ByteBuffer byteBufferAllocate = byteBuffer;
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LIZIZ.set(true);
        if (i != 224 || i2 != 224) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
            Matrix matrix = new Matrix();
            matrix.postScale(224.0f / i, 224.0f / i2);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(224, 224, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapCreateBitmap, matrix, new Paint());
            byteBufferAllocate = ByteBuffer.allocate(200704);
            bitmapCreateBitmap2.copyPixelsToBuffer(byteBufferAllocate);
        }
        C23250099c.LJ(C23271099x.INSTANCE, new C204504150k(this, byteBufferAllocate, z, str, j2, interfaceC204502150i, null));
    }
}
