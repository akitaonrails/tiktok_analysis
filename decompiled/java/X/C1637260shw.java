package X;

import Y.AObjectS178S0000000_25;
import Y.AObjectS246S0100000_25;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS604S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0shw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637260shw extends C1637110shh {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C1664750tQH LLJJLIIIJLLLLLLLZ;
    public final C1664740tQG LLJL;
    public final C1664750tQH LLJLIL;
    public final C1664740tQG LLJLILLLLZIIL;
    public final C1664750tQH LLJLL;
    public final C1664740tQG LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1637260shw.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1637260shw.class, "shootModeSwitchApiComponent", "getShootModeSwitchApiComponent()Lcom/ss/android/ugc/aweme/social/creation/record/bottom/ShootModeSwitchApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1637260shw.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1637260shw.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1637260shw.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1637260shw.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLLL[0]);
    }

    @Override // X.C1637110shh, X.AbstractC1637220shs, X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onCreate() {
        LiveEvent<Boolean> liveEventAD0;
        C385670FAf<C1647390syH> bottomTabIndexChangeEvent;
        C1664750tQH c1664750tQH = this.LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        ((InterfaceC1647420syK) c1664750tQH.getValue(this, interfaceC2217461BqaArr[2])).xM((InterfaceC579050MnP) X1());
        super.onCreate();
        getPlanCUIApiComponent().nS().LIZ(this, new AObjectS246S0100000_25(this, 269));
        getPlanCUIApiComponent().E21().LIZ(this, new AObjectS246S0100000_25(this, 270));
        getPlanCUIApiComponent().A71().LIZ(this, new AObjectS178S0000000_25(this, 1));
        getPlanCUIApiComponent().Qf1().LIZ(this, new AObjectS246S0100000_25(this, 271));
        InterfaceC1647930sz9 interfaceC1647930sz9 = (InterfaceC1647930sz9) this.LLJL.getValue(this, interfaceC2217461BqaArr[1]);
        if (interfaceC1647930sz9 != null && (bottomTabIndexChangeEvent = interfaceC1647930sz9.getBottomTabIndexChangeEvent()) != null) {
            bottomTabIndexChangeEvent.LIZ(this, new AObjectS246S0100000_25(this, 272));
        }
        q qVar = (q) this.LLJJJJ.getValue(this, C1637110shh.LLJJL[2]);
        if (qVar != null && (liveEventAD0 = qVar.AD0()) != null) {
            liveEventAD0.LIZ(this, new AObjectS246S0100000_25(this, 273));
        }
        if (((Boolean) C0BMQ.LIZ.getValue()).booleanValue()) {
            getPlanCUIApiComponent().Ek().LJII(this, Lifecycle.State.CREATED, new AObjectS246S0100000_25(this, 274));
        }
        ((InterfaceC1648570t0B) this.LLJLL.getValue(this, interfaceC2217461BqaArr[4])).isRecording().LIZ(this, new AObjectS246S0100000_25(this, 275));
    }

    public final InterfaceC1649530t1j v3() {
        return (InterfaceC1649530t1j) this.LLJLILLLLZIIL.getValue(this, LLJLLL[3]);
    }

    @Override // X.C1637110shh, X.AbstractC1637220shs, X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onDestroy() {
        super.onDestroy();
        ((InterfaceC1647420syK) this.LLJLIL.getValue(this, LLJLLL[2])).xM(null);
    }

    public C1637260shw(C1DRG c1drg, C1652290t6B c1652290t6B, AwS604S0100000_25 awS604S0100000_25) {
        super(c1drg, c1652290t6B, R.id.sz5, awS604S0100000_25);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZ(this.LLIZ, a.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(this.LLIZ, InterfaceC1653800t8c.class, null);
        this.LLJLIL = C1664770tQJ.LIZ(this.LLIZ, InterfaceC1647420syK.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(this.LLIZ, InterfaceC1649530t1j.class, null);
        this.LLJLL = C1664770tQJ.LIZ(this.LLIZ, InterfaceC1648570t0B.class, null);
        this.LLJLLIL = C1664770tQJ.LIZIZ(this.LLIZ, q.class, null);
    }
}
