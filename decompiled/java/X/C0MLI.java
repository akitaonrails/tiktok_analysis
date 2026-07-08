package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0MLI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MLI extends AbstractC2255721DQs<C0MLJ> implements C0MLJ, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final int LLILZIL;
    public final C1DRG LL;
    public final C0MLJ LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MLI.class, "editMode", "getEditMode()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = 8;
    }

    private final VideoPublishEditModel X1() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLILZ[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (!X1().creativeModel.onThisDayData.isFromOnThisDay() || TextUtils.isEmpty(X1().creativeModel.onThisDayData.getPastMemoryKey())) {
            return;
        }
        if (!C566780MKu.LIZ(X1().creativeModel)) {
            X1().isPrivate = C1416310mxZ.LJJIIZI(X1());
        }
        if (C566780MKu.LIZ(X1().creativeModel) || X1().creativeModel.onThisDayData.getViewedVideo() != 0) {
            return;
        }
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJIIIIZZ(X1().creativeModel.onThisDayData.getPastMemoryKey());
        X1().creativeModel.onThisDayData.setViewedVideo(1);
    }

    public C0MLJ W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0MLI(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
