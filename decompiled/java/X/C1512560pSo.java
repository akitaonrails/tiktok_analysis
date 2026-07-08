package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ml.process.bl.MLConfigModel;
import com.ss.bytenn.API;
import com.ss.bytenn.ByteNNConfig;
import com.ss.bytenn.Tensor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0pSo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512560pSo implements InterfaceC1512330pSR {
    public API LIZ;

    @Override // X.InterfaceC1512330pSR
    public final boolean LIZ(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
        API api = new API();
        this.LIZ = api;
        EnumC1512960pTS enumC1512960pTSCreateEngine = api.CreateEngine();
        if (enumC1512960pTSCreateEngine != EnumC1512960pTS.NO_ERROR) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("byteNN create engine failed with code ");
            sbLIZ.append(enumC1512960pTSCreateEngine);
            C1512320pSQ.LIZIZ(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
            return false;
        }
        ByteNNConfig byteNNConfig = new ByteNNConfig();
        try {
            EnumC1512570pSp enumC1512570pSp = EnumC1512570pSp.CPU;
            if (TextUtils.equals(mLConfigModel.bytenn_forward_type, "auto")) {
                enumC1512570pSp = EnumC1512570pSp.Auto;
            }
            byteNNConfig.init(enumC1512570pSp, mappedByteBuffer, null, "", "");
            int i = mLConfigModel.num_threads;
            if (i == 2) {
                byteNNConfig.setThreadNum(i);
            } else {
                byteNNConfig.setThreadNum(1);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        EnumC1512960pTS enumC1512960pTSInitEngine = this.LIZ.InitEngine(byteNNConfig);
        EnumC1512960pTS enumC1512960pTS = EnumC1512960pTS.NO_ERROR;
        if (enumC1512960pTSInitEngine != enumC1512960pTS) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("byteNN init engine failed with code ");
            sbLIZ2.append(enumC1512960pTSInitEngine);
            C1512320pSQ.LIZIZ(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2)));
        }
        if (C1512320pSQ.LIZ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(" createEngine bytenn initCode:");
            sbLIZ3.append(enumC1512960pTSInitEngine);
            sbLIZ3.append(" configModel:");
            sbLIZ3.append(mLConfigModel);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (enumC1512960pTSInitEngine != enumC1512960pTS) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1512330pSR
    public final void LIZIZ(ByteBuffer byteBuffer, float[][] fArr) {
        if (this.LIZ == null) {
            return;
        }
        ArrayList<Tensor> arrayList = new ArrayList<>();
        EnumC1512960pTS enumC1512960pTSGetEngineInputConfig = this.LIZ.GetEngineInputConfig(arrayList);
        EnumC1512960pTS enumC1512960pTS = EnumC1512960pTS.NO_ERROR;
        if (enumC1512960pTSGetEngineInputConfig != enumC1512960pTS) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("byteNN get engine input failed with code ");
            sbLIZ.append(enumC1512960pTSGetEngineInputConfig);
            C1512320pSQ.LIZIZ(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
            return;
        }
        try {
            ((Tensor) ListProtector.get(arrayList, 0)).setData(byteBuffer);
            this.LIZ.SetEngineInputs(arrayList);
            this.LIZ.Inference();
            ArrayList<Tensor> arrayList2 = new ArrayList<>();
            EnumC1512960pTS enumC1512960pTSGetEngineOutputs = this.LIZ.GetEngineOutputs(arrayList2);
            if (enumC1512960pTSGetEngineOutputs != enumC1512960pTS) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("byteNN inference get output failed with code ");
                sbLIZ2.append(enumC1512960pTSGetEngineOutputs);
                C1512320pSQ.LIZIZ(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2)));
                return;
            }
            ByteBuffer data = ((Tensor) ListProtector.get(arrayList2, 0)).getData();
            data.order(ByteOrder.nativeOrder());
            int i = 0;
            while (data.hasRemaining()) {
                float f = data.getFloat();
                float[] fArr2 = fArr[0];
                if (i < fArr2.length) {
                    fArr2[i] = f;
                }
                if (C1512320pSQ.LIZ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("bytenn holder output ");
                    sbLIZ3.append(i);
                    sbLIZ3.append(" is ");
                    sbLIZ3.append(f);
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
                i++;
            }
            if (C1512320pSQ.LIZ && i != fArr[0].length) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("bytenn inference error, outBuffer.size != resultBuffer.size, result.size:");
                sbLIZ4.append(i);
                sbLIZ4.append(" out.size:");
                sbLIZ4.append(fArr[0].length);
                C1512290pSN.LIZ("ml#evaluator", C2188811AlT.LIZIZ(sbLIZ4), null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1512290pSN.LIZ("ml#evaluator", "inference error: ", e);
            C1512320pSQ.LIZIZ(e);
        }
    }
}
