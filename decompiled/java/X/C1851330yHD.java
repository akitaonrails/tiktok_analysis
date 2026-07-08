package X;

import Y.AObserverS229S0100000_27;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import ge.i;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS39S0001000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yHD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851330yHD extends i<InterfaceC1851450yHP, C1826530xdD, C1826640xdO, C1826580xdI> implements InterfaceC379610EuV, InterfaceC1851450yHP {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final Map<AIGenerationType, Integer> LLJJIJIIJIL;
    public final Map<AIGenerationType, Integer> LLJJIJIL;
    public final Function0<C1826640xdO> LLJJJ;
    public final Function0<C1826580xdI> LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1851330yHD.class, "aiPlaygroundHeaderApi", "getAiPlaygroundHeaderApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundHeaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1851330yHD.class, "aiPlaygroundPromptApi", "getAiPlaygroundPromptApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundPromptApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1851330yHD.class, "aiPlaygroundUploadApi", "getAiPlaygroundUploadApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundUploadApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1851330yHD.class, "aiPlaygroundGenerateApi", "getAiPlaygroundGenerateApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundGenerateApi;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJJJJJIL = 8;
    }

    private final InterfaceC1851490yHT F4() {
        return (InterfaceC1851490yHT) this.LLJJIJI.getValue(this, LLJJJJ[3]);
    }

    private final InterfaceC1851400yHK K4() {
        return (InterfaceC1851400yHK) this.LLJJI.getValue(this, LLJJJJ[1]);
    }

    private final InterfaceC1851500yHU O4() {
        return (InterfaceC1851500yHU) this.LLJJIII.getValue(this, LLJJJJ[2]);
    }

    public final InterfaceC1851410yHL H4() {
        return (InterfaceC1851410yHL) this.LLJJ.getValue(this, LLJJJJ[0]);
    }

    @Override // X.InterfaceC1851450yHP
    public void LLLIL() {
        this.LLJJIJIIJIL.clear();
        this.LLJJIJIL.clear();
        i3(AFwS269S0000000_27.get$arr$(40));
    }

    private final void nD1() {
        MutableLiveData<C1838890xx9> mutableLiveDataOP2;
        MutableLiveData<AIGenerationType> mutableLiveDataII1;
        InterfaceC1851410yHL interfaceC1851410yHLH4 = H4();
        if (interfaceC1851410yHLH4 != null && (mutableLiveDataII1 = interfaceC1851410yHLH4.iI1()) != null) {
            mutableLiveDataII1.observe(this, new AObserverS229S0100000_27(this, 20));
        }
        InterfaceC1851400yHK interfaceC1851400yHKK4 = K4();
        if (interfaceC1851400yHKK4 == null || (mutableLiveDataOP2 = interfaceC1851400yHKK4.oP2()) == null) {
            return;
        }
        mutableLiveDataOP2.observe(this, new AObserverS229S0100000_27(this, 21));
    }

    @Override // X.InterfaceC1851450yHP
    public String getAspectRatio() {
        List<UploadImageParam> listDo1;
        int i;
        String str;
        AIGenerationType aIGenerationType = T2().LIZ;
        if (aIGenerationType != AIGenerationType.IMAGE_TO_VIDEO && aIGenerationType != AIGenerationType.AI_TRANSITION) {
            if (aIGenerationType != AIGenerationType.TEXT_TO_VIDEO) {
                return "";
            }
            Integer num = this.LLJJIJIL.get(aIGenerationType);
            return (num == null || (str = (String) C13LP.LJJJLZIJ(num.intValue(), C1813810xIh.LIZ())) == null) ? "9:16" : str;
        }
        InterfaceC1851500yHU interfaceC1851500yHUO4 = O4();
        if (interfaceC1851500yHUO4 == null || (listDo1 = interfaceC1851500yHUO4.Do1()) == null || !(!listDo1.isEmpty())) {
            return "";
        }
        UploadImageParam uploadImageParam = (UploadImageParam) C13LP.LJJJLZIJ(0, listDo1);
        int i2 = -1;
        if (uploadImageParam != null) {
            i = uploadImageParam.width;
            i2 = uploadImageParam.height;
        } else {
            i = -1;
        }
        Pair<Integer, Integer> pairZ4 = Z4(i, i2);
        if (pairZ4 == null) {
            return "9:16";
        }
        int iIntValue = pairZ4.getFirst().intValue();
        int iIntValue2 = pairZ4.getSecond().intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iIntValue);
        sbLIZ.append(':');
        sbLIZ.append(iIntValue2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1851450yHP
    public int getDuration() {
        Integer num = this.LLJJIJIIJIL.get(T2().LIZ);
        if (num != null) {
            Double d = (Double) C13LP.LJJJLZIJ(num.intValue(), C1813810xIh.LIZIZ());
            return (int) ((d != null ? d.doubleValue() : 0.0d) * ((double) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        if (C307450C3j.LIZ()) {
            return ((Number) C305480ByE.LIZJ.getValue()).intValue();
        }
        return 5000;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        nD1();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1826640xdO> o2() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1826580xdI> w2() {
        return this.LLJJJIL;
    }

    public final void T4(String str) {
        InterfaceC1851490yHT interfaceC1851490yHTF4 = F4();
        if (interfaceC1851490yHTF4 != null) {
            interfaceC1851490yHTF4.cS0(str);
        }
    }

    public final void d5(int i) {
        i3(new AwS39S0001000_27(i, 0));
        this.LLJJIJIL.put(T2().LIZ, Integer.valueOf(i));
    }

    public final void k5(int i) {
        i3(new AwS39S0001000_27(i, 1));
        this.LLJJIJIIJIL.put(T2().LIZ, Integer.valueOf(i));
    }

    public C1851330yHD(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851410yHL.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851400yHK.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851500yHU.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851490yHT.class, null);
        this.LLJJIJIIJIL = new LinkedHashMap();
        this.LLJJIJIL = new LinkedHashMap();
        this.LLJJJ = AFwS216S0000000_27.get$arr$(88);
        this.LLJJJIL = new AwS571S0100000_27(this, 211);
    }

    private final int P4(int i, int i2) {
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        if (iAbs == 0) {
            return iAbs2;
        }
        if (iAbs2 == 0) {
            return iAbs;
        }
        while (true) {
            int i3 = iAbs;
            iAbs = iAbs2;
            if (iAbs2 != 0) {
                iAbs2 = i3 % iAbs2;
            } else {
                return i3;
            }
        }
    }

    private final Pair<Integer, Integer> Z4(int i, int i2) {
        if (i > 0 && i2 > 0) {
            int iP4 = P4(i, i2);
            return new Pair<>(Integer.valueOf(i / iP4), Integer.valueOf(i2 / iP4));
        }
        return null;
    }

    @Override // X.InterfaceC1851450yHP
    public void IC2(int i, String str) {
        int iIndexOf;
        if (T2().LIZ == AIGenerationType.TEXT_TO_VIDEO) {
            int iIndexOf2 = C1813810xIh.LIZIZ().indexOf(Double.valueOf(((double) i) / 1000.0d));
            if (C1813810xIh.LIZ().contains(str)) {
                iIndexOf = C1813810xIh.LIZ().indexOf(str);
            } else {
                iIndexOf = 0;
            }
            d5(iIndexOf);
            k5(iIndexOf2);
        }
    }
}
