package X;

import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.vesdk.VERecorder;
import java.util.List;

/* JADX INFO: renamed from: X.1DLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public interface InterfaceC2254431DLt {
    int callEffectAPI(VERecorder.IVECallEffectAPIRunnable iVECallEffectAPIRunnable, EnumC1687420u0q enumC1687420u0q, String str);

    int callEffectInterface(TEBundle tEBundle);

    int callEffectInterfaceWithObjectParams(TEBundle tEBundle, Object[] objArr);

    int callEffectInterfaceWithResult(TEBundle tEBundle, TEBundle tEBundle2);

    Object callEffectInterfaceWithResult(TEBundle tEBundle);

    void regBachAlgorithmCallback(List<C2178031ALx> list);

    void release();

    void setARTextBitmapCallback(InterfaceC21621119jV interfaceC21621119jV);

    void setARTextLimitCountCallback(InterfaceC2177981ALs interfaceC2177981ALs);

    void setARTextParagraphContentCallback(InterfaceC2177981ALs interfaceC2177981ALs);

    void setEffectAlgorithmInfoCallback(C1AM2 c1am2);

    void setFaceDetectListener(C1AM6 c1am6);

    void setFaceInfoCallback(C1AM3 c1am3);

    void setLandMarkDetectCallback(C1AM5 c1am5);

    void setSkeletonDetectCallback(InterfaceC2178021ALw interfaceC2178021ALw);

    void setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback);

    void unregBachAlgorithmCallback();
}
