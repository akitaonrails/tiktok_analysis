package X;

import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import java.util.List;

/* JADX INFO: renamed from: X.1DOX, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public interface C1DOX {
    int beginGenVideoFrames(int i, int i2, boolean z, InterfaceC1464150oCj interfaceC1464150oCj);

    int cancelGenVideoFrame(int i);

    void clearNativeFromBingo();

    int genRandomSolve();

    int genSmartCutting();

    List<VEClipAlgorithmParam> getAllVideoRangeData();

    int initBingoAlgorithm();

    int initWithAlgorithm(String[] strArr, EnumC1464490oDH enumC1464490oDH);

    int removeAllVideoSound();

    int restoreAllVideoSound();

    int updateAlgorithmFromNormal();
}
