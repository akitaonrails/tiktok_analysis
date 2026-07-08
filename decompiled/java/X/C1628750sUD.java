package X;

import Y.AObjectS246S0100000_25;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS111S0110000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.text.a0;
import mn3.e0;

/* JADX INFO: renamed from: X.0sUD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628750sUD extends AbstractC2255721DQs<InterfaceC1448400nnK> implements InterfaceC1448400nnK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public boolean LLIZ;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 497));
    public VESize LLIZLLLIL = new VESize(0, 0);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1628750sUD.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1628750sUD.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1628750sUD.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1628750sUD.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJI = 8;
    }

    public InterfaceC1448400nnK W1() {
        return this;
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLILLJJLI.getValue(this, LLJ[0]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLILZIL.getValue(this, LLJ[3]);
    }

    public final Set<Integer> X1() {
        return (Set) this.LLILZLL.getValue();
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLILLL.getValue(this, LLJ[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZ.getValue(this, LLJ[2]);
    }

    public final Set<Integer> o2() {
        Set<Integer> setLLIIJI;
        List listLJJLIIIJILLIZJL;
        String strPreviewDowngradeSupportTab = InterfaceC1442520ndq.LJIIIZ.previewDowngradeSupportTab();
        if (strPreviewDowngradeSupportTab == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strPreviewDowngradeSupportTab, new String[]{","}, 0, 6)) == null) {
            setLLIIJI = null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
                if (numLJIIJJI != null) {
                    arrayList.add(numLJIIJJI);
                }
            }
            setLLIIJI = C13LP.LLIIJI(arrayList);
        }
        return (setLLIIJI == null || setLLIIJI.isEmpty()) ? C13LQ.LJLIIL(new Integer[]{10, 11, 14, 18}) : setLLIIJI;
    }

    public final VESize Z1() {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_camera_dynamic_resolution_downgrade_video_size_index", true);
        List<String> listLIZ = C07MM.LIZ();
        return (listLIZ == null || listLIZ.isEmpty() || iLJIJ >= listLIZ.size()) ? new VESize(576, 1024) : H2(AVSettingsWrapper.getVideoSize((String) ListProtector.get(listLIZ, iLJIJ)));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().fz1(this);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().fz1(null);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC1448400nnK
    public VESize getCurrentResolution() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1628750sUD(C1DRG c1drg) {
        this.LL = c1drg;
        Op().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 329));
    }

    public final void G2(boolean z) {
        if (this.LLIZ == z) {
            w2("not need change");
        } else {
            this.LLIZ = z;
            getCameraApiComponent().St2().getMediaController().a5(new AwS111S0110000_25(z, this, 12));
        }
    }

    public final VESize H2(int[] iArr) {
        if (iArr == null || iArr.length != 2) {
            iArr = null;
        }
        if (iArr != null) {
            return new VESize(iArr[0], iArr[1]);
        }
        return new VESize(576, 1024);
    }

    public final void w2(String str) {
        C201955140j.LIZLLL(C201967140v.LIZIZ, "preview_downgrade", str);
    }
}
