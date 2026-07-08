package X;

import android.view.MotionEvent;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import kotlin.jvm.internal.AwS569S0100000_25;
import mn3.e0;
import pyl.s;

/* JADX INFO: renamed from: X.0swT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646270swT extends AbstractC1646210swN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public volatile boolean LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final C1664750tQH LLJ;
    public final C1664750tQH LLJI;
    public final C1664750tQH LLJIJIL;
    public final C1664750tQH LLJILJIL;
    public final C1664740tQG LLJILJILJ;
    public final C1664740tQG LLJILLL;
    public final C1664750tQH LLJJ;
    public final C1664740tQG LLJJI;
    public final C01GW LLJJIII;
    public final C1646280swU LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1646270swT.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1646270swT.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1646270swT.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1646270swT.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1646270swT.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1646270swT.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1646270swT.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1646270swT.class, "cameraGestureComponent", "getCameraGestureComponent()Lcom/bytedance/creativex/recorder/gesture/RecordGestureLogicComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1646270swT.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
    }

    @Override // X.AbstractC1646210swN
    public final int LIZ() {
        EnumC1660550tJV enumC1660550tJV = EnumC1660550tJV.VIDEO_MODE;
        EnumC1448590nnd enumC1448590nndLIZ = C1650480t3G.LIZ();
        Boolean bool = LIZLLL().creativeModel.defaultEnableMP4Encoding;
        return C1660530tJT.LJFF(enumC1660550tJV, enumC1448590nndLIZ, bool != null ? bool.booleanValue() : false);
    }

    public final ShortVideoContext LIZLLL() {
        return (ShortVideoContext) this.LLIZLLLIL.getValue(this, LLJJIJIIJIL[0]);
    }

    @Override // X.AbstractC1646210swN, X.InterfaceC1646450swl
    public final void m5(C1646490swp c1646490swp) {
        if (!this.LLIZ) {
            return;
        }
        ((C1650260t2u) this.LLJJ.getValue(this, LLJJIJIIJIL[7])).bQ2(this.LLJJIJI);
        super.m5(c1646490swp);
        this.LLIZ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    @Override // X.AbstractC1646210swN, X.InterfaceC1646450swl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yf(X.C1646490swp r9) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1646270swT.yf(X.0swp):void");
    }

    @Override // X.AbstractC1646210swN
    public final void LIZJ(boolean z, EnumC1448590nnd enumC1448590nnd) {
        super.LIZJ(z, enumC1448590nnd);
        C1664750tQH c1664750tQH = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        ((InterfaceC1650190t2n) c1664750tQH.getValue(this, interfaceC2217461BqaArr[2])).NF(s.NORMAL);
        ((InterfaceC1650190t2n) this.LLJI.getValue(this, interfaceC2217461BqaArr[2])).u92().LIZIZ().LIZIZ.LJJJ.LJJIII("ClientState", 6);
        ((C1650260t2u) this.LLJJ.getValue(this, interfaceC2217461BqaArr[7])).S60(this.LLJJIJI);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0swU] */
    public C1646270swT(C1646620sx2 c1646620sx2, LifecycleOwner lifecycleOwner, C1DRG c1drg) {
        super(c1646620sx2, lifecycleOwner, c1drg);
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLJ = C1664770tQJ.LIZ(c1drg, InterfaceC1647420syK.class, null);
        this.LLJI = C1664770tQJ.LIZ(c1drg, e0.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1638550sk1.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(c1drg, a.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1649820t2C.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(c1drg, C1631190sY9.class, "lazyControlProgressConfig");
        this.LLJJ = C1664770tQJ.LIZ(c1drg, C1650260t2u.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(c1drg, C1645380sv2.class, "lazyBeautyFilter");
        this.LLJJIII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1061));
        this.LLJJIJI = new InterfaceC1650280t2w() { // from class: X.0swU
            @Override // X.InterfaceC1650280t2w
            public final void le(MotionEvent motionEvent) {
                if (C539900LFk.LJI(this.LIZ.LIZLLL())) {
                    return;
                }
                C1646270swT c1646270swT = this.LIZ;
                ((e0) c1646270swT.LLJI.getValue(c1646270swT, C1646270swT.LLJJIJIIJIL[2])).wb2(motionEvent.getX(), motionEvent.getY());
            }
        };
    }
}
