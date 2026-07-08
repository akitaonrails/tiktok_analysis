package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.bytedance.android.livesdk.livesetting.game.VirtualSexualModelOffloadOptSetting;
import com.bytedance.android.livesdk.livesetting.game.VirtualSexualModelScoreThresholdSetting;
import com.bytedance.android.livesdk.livesetting.game.VirtualSexualScreenshotIntervalSetting;
import com.bytedance.android.livesdk.livesetting.game.VirtualSexualScreenshotMaxIntervalSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1515, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1515 implements InterfaceC779640UiA {
    public static final float LJI = VirtualSexualModelScoreThresholdSetting.INSTANCE.getValue();
    public static final long LJII = VirtualSexualScreenshotIntervalSetting.INSTANCE.getValue();
    public static final long LJIIIIZZ = VirtualSexualScreenshotMaxIntervalSetting.INSTANCE.getValue();
    public static final int LJIIIZ = 5;
    public final Room LIZ;
    public long LIZIZ = LJII;
    public final C151F LIZJ;
    public final AtomicBoolean LIZLLL;
    public final Map<Long, InterfaceC420801kM> LJ;
    public volatile long LJFF;

    @Override // X.InterfaceC779640UiA
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC779640UiA
    public final String scene() {
        return "virtual_sexual_game";
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LIZ() {
        return !(VirtualSexualModelOffloadOptSetting.INSTANCE.getValue() && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground()) && !this.LIZLLL.get() && ((ConcurrentHashMap) this.LJ).size() < LJIIIZ && (System.currentTimeMillis() - this.LJFF) / 1000 >= this.LIZIZ / 1000;
    }

    @Override // X.InterfaceC779640UiA
    public final long LIZIZ() {
        return this.LJFF + this.LIZIZ;
    }

    @Override // X.InterfaceC779640UiA
    public final String LIZLLL() {
        return ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.SEXUAL);
    }

    @Override // X.InterfaceC779640UiA
    public final void LJ() {
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).w82(C151B.SEXUAL);
    }

    @Override // X.InterfaceC779640UiA
    public final void LJI() {
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).OV(C151B.SEXUAL);
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LJII() {
        return VirtualSexualModelOffloadOptSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC779640UiA
    public final C151B LIZJ() {
        return C151B.SEXUAL;
    }

    public AnonymousClass1515(Room room) {
        long id;
        this.LIZ = room;
        String strYh2 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.SEXUAL);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LIZJ = new C151F(strYh2, id);
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = new ConcurrentHashMap();
        this.LJFF = -1L;
    }

    @Override // X.InterfaceC779640UiA
    public final void LJIIIIZZ(long j, long j2, ByteBuffer byteBuffer, int i, int i2, int i3, AbstractC1273900jFs abstractC1273900jFs, boolean z, String str, InterfaceC204502150i interfaceC204502150i) throws Throwable {
        Bitmap bitmapCreateBitmap;
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LJFF = j;
        AnonymousClass1517 anonymousClass1517 = new AnonymousClass1517(j);
        anonymousClass1517.LIZ(j2);
        this.LIZLLL.set(true);
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
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200704);
            bitmapCreateBitmap2.copyPixelsToBuffer(byteBufferAllocate);
            if (byteBufferAllocate != null) {
                C23250099c.LJ(C23271099x.INSTANCE, new AnonymousClass1514(this, byteBufferAllocate, str, z, byteBuffer, i, i2, anonymousClass1517, j2, interfaceC204502150i, null));
            }
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getAIBuffer. exception=");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("GameSexualInferModuleTag", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
