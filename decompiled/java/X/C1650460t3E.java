package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.HashMap;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t3E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650460t3E implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LL;
    public final C1664740tQG LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664740tQG LLILZIL;
    public final C1664750tQH LLILZLL;
    public final CreativeInfo LLIZ = LIZJ().creativeInfo;
    public final HashMap<Integer, String> LLIZLLLIL = new HashMap<>();
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 473));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 471));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 472));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1650460t3E.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/aweme/infinisticker/RecordInfiniStickerApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1650460t3E.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1650460t3E.class, "bottomTabApi", "getBottomTabApi()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1650460t3E.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1650460t3E.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public final C1650980t44 LIZIZ() {
        return (C1650980t44) this.LLJIJIL.getValue();
    }

    public final ShortVideoContext LIZJ() {
        return (ShortVideoContext) this.LLILLL.getValue(this, LLJILJIL[1]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1650460t3E(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1647520syU.class, null);
        this.LLILLL = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1648020szI.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1646220swO.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
    }

    public final String LIZ(int i) {
        HashMap<Integer, String> map = this.LLIZLLLIL;
        Integer numValueOf = Integer.valueOf(i);
        String strLJI = map.get(numValueOf);
        if (strLJI == null) {
            strLJI = C20642515q3.LJI(i);
            map.put(numValueOf, strLJI);
        }
        return strLJI;
    }
}
