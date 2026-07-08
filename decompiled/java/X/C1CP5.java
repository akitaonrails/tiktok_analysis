package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1CP5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CP5 extends AbstractC2255721DQs<InterfaceC1456080nzi> implements InterfaceC1456080nzi, InterfaceC379610EuV, C1CPA, Handler.Callback {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LL;
    public final Function2<AbstractC1456460o0K, Runnable, Unit> LLILLJJLI;
    public int LLIZLLLIL;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(116));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(117));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(118));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 71));
    public AtomicInteger LLJ = new AtomicInteger(0);
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 241));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 72));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1CP5.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final void W1() {
        C0CNO.LIZLLL(0L, new AwS578S0100000_34(this, 73));
    }

    private final Handler Z1() {
        return (Handler) this.LLIZ.getValue();
    }

    private final InterfaceC1455860nzM o2() {
        return (InterfaceC1455860nzM) this.LLILLL.getValue(this, LLJILJIL[0]);
    }

    @Override // X.InterfaceC1456080nzi
    public LiveData<Integer> Ep2() {
        return (LiveData) this.LLJIJIL.getValue();
    }

    public final HandlerThread G2() {
        return (HandlerThread) this.LLILZLL.getValue();
    }

    public final MutableLiveData<Integer> H2() {
        return (MutableLiveData) this.LLILZ.getValue();
    }

    @Override // X.C1CPA
    public void LJLLLLLL() {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        this.LLJ.incrementAndGet();
        H2().setValue(3);
        AbstractC1452680nuE abstractC1452680nuEGc = o2().gc();
        if (abstractC1452680nuEGc != null && (vEEditorAutoStartStopArbiter = abstractC1452680nuEGc.LJFF) != null) {
            vEEditorAutoStartStopArbiter.LLIZLLLIL = false;
        }
        o2().zI2();
    }

    @Override // X.AbstractC2255721DQs
    /* JADX INFO: renamed from: X1, reason: merged with bridge method [inline-methods] */
    public InterfaceC1456080nzi getApiComponent() {
        return (InterfaceC1456080nzi) this.LLJI.getValue();
    }

    public final C1CP7 w2() {
        return (C1CP7) this.LLILZIL.getValue();
    }

    private final void T2() {
        C1CP7 c1cp7W2 = w2();
        AbstractC1452680nuE abstractC1452680nuEGc = o2().gc();
        InterfaceC1452170ntP interfaceC1452170ntPLJJ = abstractC1452680nuEGc != null ? abstractC1452680nuEGc.LJJ() : null;
        EnumC856530Xit enumC856530Xit = EnumC856530Xit.AUDIO_FADEOUT;
        c1cp7W2.getClass();
        C1CP7.LJFF = interfaceC1452170ntPLJJ;
        C1CP7.LIZIZ = enumC856530Xit;
        C1CP7.LIZ().clear();
        C1CP7.LIZIZ(C1CP8.INITIALIZED);
        C1CP7.LIZLLL(this.LLIZLLLIL);
        if (C1CP7.LJI == C1CP8.UNINITIALIZED || C1CP7.LJI == C1CP8.IDLE) {
            return;
        }
        EnumC856530Xit enumC856530Xit2 = C1CP7.LIZIZ;
        if ((enumC856530Xit2 != null ? enumC856530Xit2 : null) == enumC856530Xit) {
            int i = C1CP9.LIZ[C1CP7.LJI.ordinal()];
            if (i == 3) {
                LL();
                C1CP7.LIZ().add(this);
            } else if (i != 4) {
                C1CP7.LIZ().add(this);
            } else {
                LL();
                LJLLLLLL();
            }
        }
    }

    @Override // X.C1CPA
    public void LL() {
        long j;
        AbstractC1452680nuE abstractC1452680nuEGc = o2().gc();
        if (abstractC1452680nuEGc != null) {
            InterfaceC1452170ntP interfaceC1452170ntPLJJ = abstractC1452680nuEGc.LJJ();
            int duration = interfaceC1452170ntPLJJ.getDuration() - interfaceC1452170ntPLJJ.LLL();
            int i = this.LLIZLLLIL;
            if (duration > i) {
                duration = i;
            }
            j = duration;
        } else {
            j = 0;
        }
        Handler handlerZ1 = Z1();
        Message messageObtain = Message.obtain(Z1(), 3);
        messageObtain.arg1 = this.LLJ.get();
        C786410Ut5.LJLJLJ(handlerZ1, messageObtain, j >= 0 ? j : 0L);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLJ.set(0);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        G2().quitSafely();
        w2().getClass();
        C1CP8 c1cp8 = C1CP7.LJI;
        C1CP8 c1cp82 = C1CP8.UNINITIALIZED;
        if (c1cp8 != c1cp82) {
            C1CP7.LJFF = null;
            C1CP7.LIZ().clear();
        }
        C1CP7.LIZIZ(c1cp82);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        Integer value = H2().getValue();
        if (value != null) {
            if (value.intValue() == 1) {
                W1();
                AbstractC1452680nuE abstractC1452680nuEGc = o2().gc();
                if (abstractC1452680nuEGc != null) {
                    abstractC1452680nuEGc.LJJIIJ(true);
                }
                o2().F32(false);
            } else if (value.intValue() == 3 && o2().GF()) {
                AbstractC1452680nuE abstractC1452680nuEGc2 = o2().gc();
                if (abstractC1452680nuEGc2 != null) {
                    abstractC1452680nuEGc2.LJJIIJ(true);
                }
                o2().F32(false);
            }
        }
        H2().setValue(0);
        w2().getClass();
        C1CP7.LIZIZ(C1CP8.IDLE);
        super.onResume();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1456080nzi
    public void QN1(Integer num) {
        int iIntValue;
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioFadeout || AudioFadeoutComponent startAudioFadeout, certificateNum: ");
        sbLIZ.append(this.LLJ);
        interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
        o2().bk2();
        AbstractC1452680nuE abstractC1452680nuEGc = o2().gc();
        if (abstractC1452680nuEGc != null && (vEEditorAutoStartStopArbiter = abstractC1452680nuEGc.LJFF) != null) {
            vEEditorAutoStartStopArbiter.LLIZLLLIL = true;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = LSPassThroughRecordSizeConfig.DEFAULT;
        }
        this.LLIZLLLIL = iIntValue;
        C786410Ut5.LJLJJL(Z1(), Message.obtain(Z1(), 1));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 3 && message.arg1 == this.LLJ.get()) {
                W1();
                return false;
            }
            return false;
        }
        T2();
        H2().postValue(1);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1CP5(C1DRG c1drg, Function2<? super AbstractC1456460o0K, ? super Runnable, Unit> function2) {
        this.LL = c1drg;
        this.LLILLJJLI = function2;
    }
}
