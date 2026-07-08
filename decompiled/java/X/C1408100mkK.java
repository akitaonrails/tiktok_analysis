package X;

import com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS266S0300000_22;

/* JADX INFO: renamed from: X.0mkK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408100mkK extends AbstractC2255721DQs<C0EZB> implements C0EZB, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final List<Integer> LLILZ = new ArrayList();
    public final List<C347470Djl> LLILZIL = new ArrayList();
    public final List<Integer> LLILZLL = new ArrayList();
    public final List<C347470Djl> LLIZ = new ArrayList();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1408100mkK.class, "mVideoPublishEditModel", "getMVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1408100mkK.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJ = 8;
    }

    public C0EZB X1() {
        return this;
    }

    private final InterfaceC1455860nzM Z1() {
        return (InterfaceC1455860nzM) this.LLILLL.getValue(this, LLIZLLLIL[1]);
    }

    public final VideoPublishEditModel o2() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLIZLLLIL[0]);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0mkM] */
    @Override // X.C0EZB
    public void jC() {
        if (o2().getOriginal() != 1 && o2().getOriginal() != 2 && !C1444940nhk.LJI(o2().getCanvasVideoData())) {
            if (!o2().creativeModel.draftInfoModel.isDraft || !o2().creativeModel.loudnessBalanceModel.balanceTypes.contains(2)) {
                return;
            }
            o2().creativeModel.loudnessBalanceModel.balanceTypes.clear();
            o2().creativeModel.loudnessBalanceModel.balanceTypes.add(2);
        }
        W1(this.LLILZ, this.LLILZIL);
        C1407440mjG.LIZ(Z1().g().getValue(), o2(), o2().mIsFromDraft ? C13LP.LLII(o2().creativeModel.loudnessBalanceModel.balanceTypes) : new int[]{0}, new InterfaceC1407460mjI() { // from class: X.0mkM
            @Override // X.InterfaceC1407460mjI
            public final void LIZ(C347470Djl[] c347470DjlArr) {
                boolean z;
                this.LIZ.LLILZIL.clear();
                C19719612Di.LJJII(this.LIZ.LLILZIL, c347470DjlArr);
                AudioAlgorithmModel audioAlgorithmModel = this.LIZ.o2().creativeModel.audioAlgorithmModel;
                if (c347470DjlArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                audioAlgorithmModel.isLoudnessOn = !z;
            }
        });
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (!o2().mIsFromDraft) {
            o2().creativeModel.loudnessBalanceModel.balanceTypes.clear();
        }
        jC();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1408100mkK(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void W1(List<Integer> list, List<C347470Djl> list2) {
        InterfaceC1452170ntP value = Z1().g().getValue();
        if (value != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
            if (c348100DkmLIZIZ != null) {
                for (C347470Djl c347470Djl : (C347470Djl[]) list2.toArray(new C347470Djl[0])) {
                    c348100DkmLIZIZ.LJFF().LJIIIIZZ(c347470Djl);
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.C0EZB
    public void cL1(String str, int i, InterfaceC1452170ntP interfaceC1452170ntP) {
        C348100Dkm c348100DkmLIZIZ;
        InterfaceC391070FUz interfaceC391070FUzLJFF;
        W1(this.LLILZLL, this.LLIZ);
        ArrayList arrayList = new ArrayList();
        if (str.length() > 0) {
            arrayList.add(2);
        }
        if (interfaceC1452170ntP != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) != null && (interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF()) != null && interfaceC391070FUzLJFF.LJJJJIZL(EnumC355960DxS.ORIGIN_VOICE_CONVERSION) != null) {
            arrayList.add(0);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        VideoPublishEditModel videoPublishEditModelO2 = o2();
        int[] iArrLLII = C13LP.LLII(arrayList);
        InterfaceC1407460mjI interfaceC1407460mjI = new InterfaceC1407460mjI() { // from class: X.0mkL
            @Override // X.InterfaceC1407460mjI
            public final void LIZ(C347470Djl[] c347470DjlArr) {
                boolean z;
                this.LIZ.LLIZ.clear();
                C19719612Di.LJJII(this.LIZ.LLIZ, c347470DjlArr);
                AudioAlgorithmModel audioAlgorithmModel = this.LIZ.o2().creativeModel.audioAlgorithmModel;
                if (c347470DjlArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                audioAlgorithmModel.isLoudnessOn = !z;
            }
        };
        if (interfaceC1452170ntP != null) {
            C1407420mjE c1407420mjE = new C1407420mjE();
            C1407440mjG.LIZIZ(videoPublishEditModelO2, iArrLLII, new AwS266S0300000_22(c1407420mjE, interfaceC1452170ntP, videoPublishEditModelO2, 19));
            for (C1407400mjC c1407400mjC : (ArrayList) c1407420mjE.LIZ()) {
                if (!videoPublishEditModelO2.creativeModel.loudnessBalanceModel.balanceTypes.contains(Integer.valueOf(c1407400mjC.LJI))) {
                    videoPublishEditModelO2.creativeModel.loudnessBalanceModel.balanceTypes.add(Integer.valueOf(c1407400mjC.LJI));
                }
            }
            C1444940nhk.LIZ(videoPublishEditModelO2.getCanvasVideoData());
            c1407420mjE.LIZIZ(videoPublishEditModelO2, interfaceC1452170ntP, interfaceC1407460mjI);
        }
    }
}
