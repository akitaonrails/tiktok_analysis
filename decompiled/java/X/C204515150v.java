package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.android.livesdk.livesetting.game.GameKeytimeRecognitionLiveSetting;
import com.bytedance.android.livesdk.livesetting.game.GameMLBBHeroRecogSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: renamed from: X.150v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204515150v implements InterfaceC779640UiA {
    public static final String LJFF;
    public static final boolean LJI;
    public static final long LJII;
    public static final float LJIIIIZZ;
    public static final float LJIIIZ;
    public static final float LJIIJ;
    public static final float LJIIJJI;
    public static final int LJIIL;
    public static final int LJIILIIL;
    public static final int LJIILJJIL;
    public static final float LJIILL;
    public final Room LIZ;
    public final Map<Integer, String> LIZIZ;
    public final AtomicBoolean LIZJ;
    public long LIZLLL;
    public final C151F LJ;

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
        LJFF = gameMLBBHeroRecogSetting.getValue().scene;
        LJI = gameMLBBHeroRecogSetting.getValue().instantInfer;
        LJII = gameMLBBHeroRecogSetting.getValue().interval;
        LJIIIIZZ = gameMLBBHeroRecogSetting.getValue().cropArea[0].floatValue();
        LJIIIZ = gameMLBBHeroRecogSetting.getValue().cropArea[1].floatValue();
        LJIIJ = gameMLBBHeroRecogSetting.getValue().cropArea[2].floatValue();
        LJIIJJI = gameMLBBHeroRecogSetting.getValue().cropArea[3].floatValue();
        LJIIL = gameMLBBHeroRecogSetting.getValue().resizeWidth;
        LJIILIIL = gameMLBBHeroRecogSetting.getValue().resizeHeight;
        LJIILJJIL = gameMLBBHeroRecogSetting.getValue().outputNum;
        LJIILL = gameMLBBHeroRecogSetting.getValue().threshold;
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LIZ() {
        boolean z = this.LIZJ.get();
        boolean z2 = System.currentTimeMillis() - this.LIZLLL >= LJII;
        Map<String, Object> map = C1338270kvh.LIZ;
        return !z && z2;
    }

    @Override // X.InterfaceC779640UiA
    public final long LIZIZ() {
        return this.LIZLLL + LJII;
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
        return LJFF;
    }

    public C204515150v(Room room) {
        C151F c151f;
        long id;
        this.LIZ = room;
        Map map = (Map) GsonProtectorUtils.fromJson(new Gson(), GameMLBBHeroRecogSetting.INSTANCE.getValue().indexToNameStr, new TypeToken<Map<String, ? extends String>>() { // from class: X.04XP
        }.getType());
        ArrayList arrayList = new ArrayList();
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            c151f = null;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
            if (numLJIIJJI != null) {
                arrayList.add(new Pair(Integer.valueOf(numLJIIJJI.intValue()), value));
            }
        }
        this.LIZIZ = C2097608Jq.LJIILLIIL(arrayList);
        this.LIZJ = new AtomicBoolean(false);
        if (GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().costReportSwitcher) {
            String strYh2 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.MLBB_HERO);
            Room room2 = this.LIZ;
            if (room2 != null) {
                id = room2.getId();
            } else {
                id = 0;
            }
            c151f = new C151F(strYh2, id);
        }
        this.LJ = c151f;
    }

    public static void LJIIIZ(AnonymousClass1517 anonymousClass1517, float f, boolean z, int i, String str, float f2) {
        long jCurrentTimeMillis = System.currentTimeMillis() - anonymousClass1517.LIZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_client_intelligent_mlbb_hero_result");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
        c474500IjALIZ.LJJIFFI(Float.valueOf(f), "threshold");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_success");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "hero_id");
        c474500IjALIZ.LJJII(str, "hero_name");
        c474500IjALIZ.LJJIFFI(Float.valueOf(f2), "hero_score");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC779640UiA
    public final void LJIIIIZZ(long j, long j2, ByteBuffer byteBuffer, int i, int i2, int i3, AbstractC1273900jFs abstractC1273900jFs, boolean z, String str, InterfaceC204502150i interfaceC204502150i) {
        ByteBuffer byteBufferAllocate;
        Bitmap bitmapCreateBitmap;
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LIZJ.set(true);
        AnonymousClass1517 anonymousClass1517 = new AnonymousClass1517(j);
        anonymousClass1517.LIZ(j2);
        try {
            byteBuffer.rewind();
            bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        } catch (Exception e) {
            e = e;
        }
        try {
            bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
            float fLIZLLL = C13LZ.LIZLLL(LJIIIIZZ, 0.0f, 1.0f);
            float fLIZLLL2 = C13LZ.LIZLLL(LJIIIZ, 0.0f, 1.0f);
            float f = i;
            int i4 = (int) (fLIZLLL * f);
            float f2 = i2;
            int i5 = (int) (fLIZLLL2 * f2);
            int iLIZLLL = (int) (f * C13LZ.LIZLLL(LJIIJ, 0.0f, 1.0f));
            int iLIZLLL2 = (int) (f2 * C13LZ.LIZLLL(LJIIJJI, 0.0f, 1.0f));
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
            int i6 = LJIIL;
            int i7 = LJIILIIL;
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
            C23250099c.LJ(C23271099x.INSTANCE, new C204516150w(this, byteBufferAllocate, str, z, interfaceC204502150i, byteBuffer, anonymousClass1517, j2, abstractC1273900jFs, null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("runBlocking error, msg: ");
            sbLIZ.append(th.getMessage());
            C20441214yg.LJ("GameMLBBHeroInferModule", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
