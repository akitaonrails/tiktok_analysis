package X;

import android.util.Log;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.NoSuchElementException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0tCG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656060tCG {
    public final InterfaceC1650230t2r LIZ;
    public final C1656050tCF LIZIZ;
    public final CameraComponentModel LIZJ;

    public static void LIZ(C1644050sst c1644050sst) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", c1644050sst.LIZ);
            jSONObject.put("error_message", c1644050sst.LJFF);
            jSONObject.put("exception", Log.getStackTraceString(new Throwable("delete last segments")));
            C2219091BtD c2219091BtD = C2219091BtD.LIZ;
            c2219091BtD.getClass();
            ((InterfaceC1656280tCc) C2219091BtD.LJII.getValue(c2219091BtD, C2219091BtD.LIZIZ[5])).LIZ(C00CO.SERVICE_RECORD_SEGMENTS_DELETE_ILLEGAL, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void onEvent(C1644050sst c1644050sst) {
        C1441190nbh c1441190nbhLIZIZ = this.LIZJ.LIZIZ();
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteLastFragmentEventHandlerFactory:onEvent,is segment empty");
        sbLIZ.append(c1441190nbhLIZIZ.isEmpty());
        interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
        if (!c1441190nbhLIZIZ.isEmpty()) {
            this.LIZIZ.v3(C1656260tCa.LIZ);
            if (!c1441190nbhLIZIZ.isEmpty()) {
                TimeSpeedModelExtension timeSpeedModelExtensionRemove = c1441190nbhLIZIZ.remove(c1441190nbhLIZIZ.size() - 1);
                ((C1656090tCJ) this.LIZIZ.o7()).LJIIJJI.removeLastSegment();
                CameraComponentModel cameraComponentModel = this.LIZJ;
                long jCalculateRealTime = TimeSpeedModelExtension.calculateRealTime(c1441190nbhLIZIZ);
                if (cameraComponentModel.isRetakeMode) {
                    cameraComponentModel.mRetakeTime = jCalculateRealTime;
                } else {
                    cameraComponentModel.mTotalRecordingTime = jCalculateRealTime;
                }
                this.LIZJ.recordContext.filterLabels.removeLastArray();
                this.LIZJ.recordContext.filterEnterMethod.removeLastArray();
                this.LIZJ.recordContext.filterIds.removeLastArray();
                this.LIZJ.recordContext.filterValues.removeLastArray();
                this.LIZJ.recordContext.smoothSkinLabels.removeLast();
                this.LIZJ.recordContext.reshapeLabels.removeLast();
                this.LIZJ.recordContext.tanningLabels.removeLast();
                this.LIZJ.recordContext.eyesLables.removeLast();
                CameraComponentModel cameraComponentModel2 = this.LIZJ;
                if (cameraComponentModel2.duetContext.windowInfoList.size() > 0) {
                    ListProtector.remove(cameraComponentModel2.duetContext.windowInfoList, r1.size() - 1);
                }
                this.LIZIZ.i3(C1649650t1v.LIZ(this.LIZJ.LIZJ(), c1441190nbhLIZIZ, true));
                this.LIZ.w61(new C1648160szW(4));
                this.LIZIZ.V2(true);
                this.LIZIZ.w2(c1644050sst);
                this.LIZIZ.G2(timeSpeedModelExtensionRemove);
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        } else {
            try {
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("DeleteLastFragmentEventHandlerFactory:onEvent,deleteLastFrag when segments in business is empty.reason:");
                sbLIZ2.append(c1644050sst.LJFF);
                sbLIZ2.append(",recordState:");
                sbLIZ2.append(c1644050sst.LIZ);
                interfaceC1463990oCTLIZLLL2.w(C2188811AlT.LIZIZ(sbLIZ2));
                this.LIZIZ.w2(c1644050sst);
                LIZ(c1644050sst);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (c1441190nbhLIZIZ.isEmpty()) {
            if (!this.LIZJ.LJIIJJI()) {
                this.LIZIZ.l72(this.LIZJ.mCurrentDurationMode, false);
            }
            this.LIZIZ.q3();
        }
        this.LIZIZ.O3();
    }

    public C1656060tCG(InterfaceC1650230t2r interfaceC1650230t2r, C1656050tCF c1656050tCF, CameraComponentModel cameraComponentModel) {
        this.LIZ = interfaceC1650230t2r;
        this.LIZIZ = c1656050tCF;
        this.LIZJ = cameraComponentModel;
    }
}
