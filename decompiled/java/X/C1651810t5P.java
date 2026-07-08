package X;

import Y.AObjectS246S0100000_25;
import android.view.MotionEvent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS426S0200000_25;

/* JADX INFO: renamed from: X.0t5P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651810t5P extends AbstractC1651830t5R<InterfaceC1651990t5h> implements InterfaceC1651990t5h {
    public static final C1652020t5k LLJLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public static final int LLJZ;
    public static final UrlModel LLJZIJLIL;
    public final InterfaceC1651990t5h LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final C01GW LLJLIL;
    public final MutableLiveData<Boolean> LLJLILLLLZIIL;
    public final LiveData<Boolean> LLJLL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0t5k] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1651810t5P.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1651810t5P.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C2217381BqS(C1651810t5P.class, "recordGestureLogicComponent", "getRecordGestureLogicComponent()Lcom/bytedance/creativex/recorder/gesture/RecordGestureLogicComponent;", 0)};
        LLJLLIL = new Object() { // from class: X.0t5k
        };
        LLJZ = 8;
        LLJZIJLIL = new UrlModel();
    }

    private final C1650260t2u B3() {
        return (C1650260t2u) this.LLJL.getValue(this, LLJLLL[2]);
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLLL[1]);
    }

    private final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLJJL.getValue(this, LLJLLL[0]);
    }

    private final C1651820t5Q q3() {
        return (C1651820t5Q) this.LLJLIL.getValue();
    }

    @Override // X.InterfaceC1651990t5h
    public void YH2() {
        String strX1;
        C1650980t44 next;
        this.LLJLILLLLZIIL.setValue(Boolean.TRUE);
        Iterator<C1650980t44> it2 = this.LLILZ.getItems().iterator();
        while (true) {
            strX1 = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (next.LL == 19) {
                    break;
                }
            }
        }
        C1650980t44 c1650980t44 = next;
        if (c1650980t44 == null) {
            return;
        }
        int iLIZJ = C577500Mku.LIZJ(0);
        c1650980t44.LLILLL = iLIZJ;
        if (iLIZJ == R.raw.icon_camera_flash_fill) {
            strX1 = X1(2131824459);
        } else if (iLIZJ == R.raw.icon_camera_flash_slash_fill) {
            strX1 = X1(2131824458);
        }
        c1650980t44.LLJJJ = strX1;
        this.LLILZ.LIZ(c1650980t44, true);
    }

    @Override // X.AbstractC1651830t5R, X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        if (C295910Bin.LIZIZ() && C0CHQ.LIZ().getAccountService().isLogin() && !C0CHQ.LIZ().getAccountService().LIZ()) {
            Et(C0CHQ.LIZ().LJJIIZI().LJJJLIIL(false));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        q3().LIZ();
    }

    @Override // X.AbstractC1651830t5R
    public void registerObservers() {
        super.registerObservers();
        gq().hb1().LIZ(this, new AObjectS246S0100000_25(this, 128));
        C1650260t2u c1650260t2uB3 = B3();
        if (c1650260t2uB3 != null) {
            c1650260t2uB3.AL1(new AbstractC21664519qV() { // from class: X.0t5W
                @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    if (C1443960ngA.LJIIL(this.LL.getShortVideoContext()) && motionEvent != null && motionEvent.getAction() == 0) {
                        this.LL.c3().j5();
                    }
                    return false;
                }
            }, 24, 50);
        }
        getCameraApiComponent().vB1().LIZ(this, new AObjectS246S0100000_25(this, 129));
    }

    @Override // X.InterfaceC1651990t5h
    public LiveData<Boolean> fE() {
        return this.LLJLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJJJLIIL;
    }

    public InterfaceC1651990t5h v3() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1651990t5h
    public void Et(boolean z) {
        C1650980t44 next;
        if (z) {
            Keva repo = KevaImpl.getRepo("repo_tool_bar", 0);
            boolean zLJJJLIIL = C0CHQ.LIZ().LJJIIZI().LJJJLIIL(false);
            if (!repo.getBoolean("key_ai_caption_guide_had_show", false) && !zLJJJLIIL) {
                q3().LIZIZ();
                repo.storeBoolean("key_ai_caption_guide_had_show", true);
            }
        } else {
            q3().LIZ();
        }
        Iterator<C1650980t44> it2 = this.LLILZ.getItems().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LL == 21) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1650980t44 c1650980t44 = next;
        if (c1650980t44 != null && c1650980t44.LLJ == (!z)) {
            c1650980t44.LLJ = z;
            this.LLILZ.LIZ(c1650980t44, true);
        }
    }

    public C1651810t5P(C19A3 c19a3, C1DRG c1drg, int i, InterfaceC1651800t5O interfaceC1651800t5O, List<C1650980t44> list) {
        super(c19a3, c1drg, i, interfaceC1651800t5O, list, false);
        this.LLJJJJLIIL = this;
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), C1650260t2u.class, null);
        this.LLJLIL = C452501pT.LIZIZ(new AwS426S0200000_25(c19a3, this, 43));
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLJLILLLLZIIL = mutableLiveData;
        this.LLJLL = mutableLiveData;
    }
}
