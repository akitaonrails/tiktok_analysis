package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.android.livesdk.livesetting.game.GameMLBBHeroRecogSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: renamed from: X.150u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204514150u implements InterfaceC779640UiA {
    public static final String LJ;
    public static final long LJFF;
    public static final float LJI;
    public static final float LJII;
    public static final float LJIIIIZZ;
    public static final float LJIIIZ;
    public static final int LJIIJ;
    public static final int LJIIJJI;
    public static final int LJIIL;
    public static final float LJIILIIL;
    public final Room LIZ;
    public final Map<Integer, String> LIZIZ;
    public final AtomicBoolean LIZJ;
    public long LIZLLL;

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

    static {
        GameMLBBHeroRecogSetting gameMLBBHeroRecogSetting = GameMLBBHeroRecogSetting.INSTANCE;
        LJ = gameMLBBHeroRecogSetting.getValue().scene;
        LJFF = gameMLBBHeroRecogSetting.getValue().interval;
        LJI = gameMLBBHeroRecogSetting.getValue().cropArea[0].floatValue();
        LJII = gameMLBBHeroRecogSetting.getValue().cropArea[1].floatValue();
        LJIIIIZZ = gameMLBBHeroRecogSetting.getValue().cropArea[2].floatValue();
        LJIIIZ = gameMLBBHeroRecogSetting.getValue().cropArea[3].floatValue();
        LJIIJ = gameMLBBHeroRecogSetting.getValue().resizeWidth;
        LJIIJJI = gameMLBBHeroRecogSetting.getValue().resizeHeight;
        LJIIL = gameMLBBHeroRecogSetting.getValue().outputNum;
        LJIILIIL = gameMLBBHeroRecogSetting.getValue().threshold;
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LIZ() {
        boolean z = this.LIZJ.get();
        boolean z2 = System.currentTimeMillis() - this.LIZLLL >= LJFF;
        Map<String, Object> map = C1338270kvh.LIZ;
        return !z && z2;
    }

    @Override // X.InterfaceC779640UiA
    public final String LIZLLL() {
        String strYh2 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.MLBB_HERO);
        Map<String, Object> map = C1338270kvh.LIZ;
        return strYh2;
    }

    @Override // X.InterfaceC779640UiA
    public final void LJ() {
        Map<String, Object> map = C1338270kvh.LIZ;
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).w82(C151B.MLBB_HERO);
    }

    @Override // X.InterfaceC779640UiA
    public final void LJI() {
        Map<String, Object> map = C1338270kvh.LIZ;
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).OV(C151B.MLBB_HERO);
    }

    @Override // X.InterfaceC779640UiA
    public final C151B LIZJ() {
        return C151B.MLBB_HERO;
    }

    @Override // X.InterfaceC779640UiA
    public final String scene() {
        return LJ;
    }

    public C204514150u(Room room) {
        this.LIZ = room;
        Map map = (Map) GsonProtectorUtils.fromJson(new Gson(), GameMLBBHeroRecogSetting.INSTANCE.getValue().indexToNameStr, new TypeToken<Map<String, ? extends String>>() { // from class: X.04XQ
        }.getType());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
            if (numLJIIJJI != null) {
                arrayList.add(new Pair(Integer.valueOf(numLJIIJJI.intValue()), value));
            }
        }
        this.LIZIZ = C2097608Jq.LJIILLIIL(arrayList);
        this.LIZJ = new AtomicBoolean(false);
    }

    @Override // X.InterfaceC779640UiA
    public final void LJIIIIZZ(long j, long j2, ByteBuffer byteBuffer, int i, int i2, int i3, AbstractC1273900jFs abstractC1273900jFs, boolean z, String str, InterfaceC204502150i interfaceC204502150i) {
        ByteBuffer byteBufferAllocate;
        Bitmap bitmapCreateBitmap;
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LIZJ.set(true);
        try {
            byteBuffer.rewind();
            bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        } catch (Exception e) {
            e = e;
        }
        try {
            bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
            float fLIZLLL = C13LZ.LIZLLL(LJI, 0.0f, 1.0f);
            float fLIZLLL2 = C13LZ.LIZLLL(LJII, 0.0f, 1.0f);
            float f = i;
            int i4 = (int) (fLIZLLL * f);
            float f2 = i2;
            int i5 = (int) (fLIZLLL2 * f2);
            int iLIZLLL = (int) (f * C13LZ.LIZLLL(LJIIIIZZ, 0.0f, 1.0f));
            int iLIZLLL2 = (int) (f2 * C13LZ.LIZLLL(LJIIIZ, 0.0f, 1.0f));
            if (i4 >= iLIZLLL) {
                iLIZLLL = i;
                i4 = 0;
            }
            if (i5 >= iLIZLLL2) {
                iLIZLLL2 = i2;
                i5 = 0;
            }
            int iLJ = C13LZ.LJ(i4, 0, i - 1);
            int iLJ2 = C13LZ.LJ(i5, 0, i2 - 1);
            Rect rect = new Rect(iLJ, iLJ2, C13LZ.LJ(iLIZLLL, iLJ + 1, i), C13LZ.LJ(iLIZLLL2, iLJ2 + 1, i2));
            int i6 = LJIIJ;
            int i7 = LJIIJJI;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i6, i7, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapCreateBitmap, rect, new Rect(0, 0, i6, i7), new Paint(3));
            byteBufferAllocate = ByteBuffer.allocate(i6 * i7 * 4);
            bitmapCreateBitmap2.copyPixelsToBuffer(byteBufferAllocate);
            byteBufferAllocate.rewind();
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map2 = C1338270kvh.LIZ;
            byteBuffer.rewind();
            byteBufferAllocate = byteBuffer;
        }
        try {
            C23250099c.LJ(C23271099x.INSTANCE, new C204511150r(this, byteBufferAllocate, str, z, interfaceC204502150i, byteBuffer, j2, abstractC1273900jFs, null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("runBlocking error, msg: ");
            sbLIZ.append(th.getMessage());
            C20441214yg.LJ("SimpleGameMLBBHeroInferModule", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
