package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.record.RecordMobModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0MWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569710MWb extends AbstractC2255721DQs<InterfaceC522890Kf1> implements InterfaceC522890Kf1, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public static final int LLILZ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), ShortVideoContext.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C569710MWb.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = 8;
    }

    public InterfaceC522890Kf1 W1() {
        return this;
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLJJLI.getValue(this, LLILLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C569710MWb(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC522890Kf1
    public void PW1(Context context) {
        String str;
        Bundle bundle = null;
        Scene scene = (Scene) getDiContainer().LJIIL(null, AbstractC214814194y.class);
        if (scene != null) {
            bundle = scene.mArguments;
        }
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null) {
            ShortVideoContext shortVideoContext = getShortVideoContext();
            if (shortVideoContext == null || (str = shortVideoContext.shootWay) == null) {
                str = "";
            }
            iExternalService.asyncService(str, new C580830MqH(bundle, context, this, 1));
        }
    }

    public final void X1(Bundle bundle) {
        CreativeModel creativeModel;
        RecordMobModel recordMobModel;
        bundle.putBoolean("is_record_camera_from_album_tab", true);
        bundle.putLong("extra_start_record_time", System.currentTimeMillis());
        boolean z = false;
        bundle.putBoolean("is_light_record_container_mode", false);
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (recordMobModel = creativeModel.recordMobModel) != null) {
            z = recordMobModel.isColdStart;
        }
        bundle.putBoolean("is_cold_start", z);
    }
}
