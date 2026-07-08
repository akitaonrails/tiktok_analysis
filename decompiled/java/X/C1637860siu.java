package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import mn3.e0;

/* JADX INFO: renamed from: X.0siu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637860siu extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LL;
    public boolean LLILLL;
    public Drawable LLILZ;
    public final C05YF LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1621970sJH.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1637860siu.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1637860siu.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1637860siu.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1637860siu.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1637860siu.class, "recordModeApiComponent", "getRecordModeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJIJIL = 8;
    }

    private final InterfaceC1621970sJH X1() {
        return (InterfaceC1621970sJH) this.LLJ.getValue(this, LLJI[4]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILZLL.getValue(this, LLJI[1]);
    }

    private final e0 getCameraApiComponent() {
        return (e0) this.LLIZ.getValue(this, LLJI[2]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLIZLLLIL.getValue(this, LLJI[3]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZIL.getValue(this, LLJI[0]);
    }

    private final View W1() {
        return getActivity().findViewById(R.id.tya);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        View previewView = getCameraApiComponent().getPreviewView();
        if (getShortVideoContext().creativeModel.recordData.isEditorProToRecord || getShortVideoContext().creativeModel.recordData.isEditorProToRecordRetake) {
            this.LLILLL = true;
            View viewW1 = W1();
            if (viewW1 != null) {
                this.LLILZ = viewW1.getBackground();
                viewW1.setBackgroundColor(-16777216);
            }
            C786410Ut5.Ob(previewView, 1.0f);
            C786410Ut5.pc(previewView, 1.0f);
            C786410Ut5.Jc(previewView, 0.0f);
            C786410Ut5.ed(previewView, 0.0f);
        }
        if (getShortVideoContext().cameraComponentModel.isEditorProRecordMode) {
            X1().Ud1(true);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        View viewW1;
        super.onDestroy();
        if (!this.LLILLL || (viewW1 = W1()) == null) {
            return;
        }
        viewW1.setBackground(this.LLILZ);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (getShortVideoContext().creativeModel.recordData.isEditorProToRecordRetake && !X1().CP1().LIZJ().booleanValue()) {
            getRecordControlApi().Ll0();
            X1().Ud1(true);
            X1().Um(true);
        }
        if (getShortVideoContext().creativeModel.recordData.isEditorProToRecord) {
            X1().Ud1(true);
        }
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1637860siu(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
