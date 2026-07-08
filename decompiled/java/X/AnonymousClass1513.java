package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.api.GameSexualReportApi;
import com.bytedance.android.livesdk.livesetting.game.VirtualSexualModelOffloadOptSetting;
import com.bytedance.android.livesdk.livesetting.game.VirtualSexualModelScoreThresholdSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1513, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1513 implements InterfaceC779640UiA {
    public static final float LIZJ = VirtualSexualModelScoreThresholdSetting.INSTANCE.getValue();
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
    public final String scene() {
        return "virtual_sexual_game";
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LIZ() {
        boolean z = this.LIZIZ.get();
        Map<String, Object> map = C1338270kvh.LIZ;
        return !z;
    }

    @Override // X.InterfaceC779640UiA
    public final String LIZLLL() {
        String strYh2 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.SEXUAL);
        Map<String, Object> map = C1338270kvh.LIZ;
        return strYh2;
    }

    @Override // X.InterfaceC779640UiA
    public final void LJ() {
        try {
            ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).w82(C151B.SEXUAL);
            Map<String, Object> map = C1338270kvh.LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
    }

    @Override // X.InterfaceC779640UiA
    public final void LJI() {
        try {
            ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).OV(C151B.SEXUAL);
            Map<String, Object> map = C1338270kvh.LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
    }

    @Override // X.InterfaceC779640UiA
    public final boolean LJII() {
        boolean value = VirtualSexualModelOffloadOptSetting.INSTANCE.getValue();
        Map<String, Object> map = C1338270kvh.LIZ;
        return value;
    }

    @Override // X.InterfaceC779640UiA
    public final C151B LIZJ() {
        return C151B.SEXUAL;
    }

    public AnonymousClass1513(Room room) {
        this.LIZ = room;
    }

    public final Object LJIIJ(String str, ByteBuffer byteBuffer, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        long id;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        try {
            ILiveGameService iLiveGameService = (ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class);
            C151R c151r = new C151R() { // from class: X.150n
                @Override // X.C151R
                public final void LIZ(C204518150y c204518150y) {
                    Map<String, Object> map = C1338270kvh.LIZ;
                    c204518150y.LJ = AnonymousClass1513.LIZJ;
                    InterfaceC1364105Vn<C204518150y> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(c204518150y);
                    interfaceC1364105Vn2.resumeWith(c204518150y);
                }
            };
            C151B c151b = C151B.SEXUAL;
            Room room = this.LIZ;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            iLiveGameService.Zg2(byteBuffer, c151r, c151b, z, id, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map = C1338270kvh.LIZ;
            C189200o6.m2constructorimpl(null);
            c23260099m.resumeWith(null);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final void LJIIIZ(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, C204518150y c204518150y, long j) {
        float f;
        boolean z;
        long id;
        float f2 = 0.0f;
        if (c204518150y != null) {
            f = c204518150y.LIZ;
        } else {
            f = 0.0f;
        }
        float f3 = LIZJ;
        if (f >= f3) {
            z = true;
        } else {
            z = false;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            EnumC771350UNp enumC771350UNp = EnumC771350UNp.GAME_SEXUAL_DETECT;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sexual_");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append(".jpg");
            C0VSJ c0vsjLJIILJJIL = C151K.LJIILJJIL(byteBuffer, i, i2, enumC771350UNp, C2188811AlT.LIZIZ(sbLIZ));
            Room room = this.LIZ;
            String strYh2 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.SEXUAL);
            if (c0vsjLJIILJJIL != null) {
                System.currentTimeMillis();
                c0vsjLJIILJJIL.hashCode();
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                HashMap map2 = new HashMap();
                if (c204518150y != null) {
                    f2 = c204518150y.LIZ;
                }
                map2.put("room_id", Long.valueOf(id));
                map2.put("timestamp", Long.valueOf(j));
                map2.put("model_name", strYh2);
                map2.put("model_score", Float.valueOf(f2));
                map2.put("model_threshold", Float.valueOf(f3));
                map2.put("data_type", 1);
                MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
                multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", c0vsjLJIILJJIL));
                C480460Ism.LIZ().getClass();
                AbstractC19484711Kz<C470590Icr<Object>> abstractC19484711KzUploadSexualSignal = ((GameSexualReportApi) C480460Ism.LIZLLL(GameSexualReportApi.class)).uploadSexualSignal(map2, multipartTypedOutput);
                if (abstractC19484711KzUploadSexualSignal != null) {
                    abstractC19484711KzUploadSexualSignal.LIZ(new C16HZ(c0vsjLJIILJJIL, 1));
                }
            }
        }
        byteBuffer2.clear();
        byteBuffer.clear();
    }

    @Override // X.InterfaceC779640UiA
    public final void LJIIIIZZ(long j, long j2, ByteBuffer byteBuffer, int i, int i2, int i3, AbstractC1273900jFs abstractC1273900jFs, boolean z, String str, InterfaceC204502150i interfaceC204502150i) throws Throwable {
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
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200704);
            bitmapCreateBitmap2.copyPixelsToBuffer(byteBufferAllocate);
            if (byteBufferAllocate != null) {
                C23250099c.LJ(C23271099x.INSTANCE, new C204501150h(this, byteBufferAllocate, str, z, byteBuffer, i, i2, j2, interfaceC204502150i, null));
                return;
            }
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
        this.LIZIZ.set(false);
        interfaceC204502150i.LIZ();
    }
}
