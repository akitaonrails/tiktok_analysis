package X;

import Y.AObserverS229S0100000_27;
import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundGenerateParams;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS39S0010000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yHH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851370yHH extends i<InterfaceC1851490yHT, C1843370y4N, C1843410y4R, C1843430y4T> implements InterfaceC379610EuV, InterfaceC1851490yHT {
    public static final C1851460yHQ LLJJLIIIJLLLLLLLZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final int LLJLIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final CreativeModel LLJJ;
    public final C19EG LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final Function0<C1843410y4R> LLJJJJLIIL;
    public final Function0<C1843430y4T> LLJJL;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0yHQ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1851370yHH.class, "aiPlaygroundHeaderApi", "getAiPlaygroundHeaderApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundHeaderApi;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1851370yHH.class, "aiPlaygroundPromptApi", "getAiPlaygroundPromptApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundPromptApi;", 0), new C2217381BqS(C1851370yHH.class, "aiPlaygroundLogicApi", "getAiPlaygroundLogicApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/logic/AIPlaygroundLogicApi;", 0), new C2217381BqS(C1851370yHH.class, "aiPlaygroundLoadingApi", "getAiPlaygroundLoadingApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundLoadingApi;", 0), new C2217381BqS(C1851370yHH.class, "aiPlaygroundUploadApi", "getAiPlaygroundUploadApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundUploadApi;", 0), new C2217381BqS(C1851370yHH.class, "aiPlaygroundSettingsApi", "getAiPlaygroundSettingsApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundSettingsApi;", 0)};
        LLJJLIIIJLLLLLLLZ = new Object() { // from class: X.0yHQ
        };
        LLJLIL = 8;
    }

    private final InterfaceC1851400yHK d5() {
        return (InterfaceC1851400yHK) this.LLJJIJI.getValue(this, LLJL[1]);
    }

    private final InterfaceC1851450yHP k5() {
        return (InterfaceC1851450yHP) this.LLJJJIL.getValue(this, LLJL[5]);
    }

    private final InterfaceC1851500yHU n5() {
        return (InterfaceC1851500yHU) this.LLJJJ.getValue(this, LLJL[4]);
    }

    public final InterfaceC1851410yHL P4() {
        return (InterfaceC1851410yHL) this.LLJJIII.getValue(this, LLJL[0]);
    }

    public final InterfaceC560800Lz4 T4() {
        return (InterfaceC560800Lz4) this.LLJJIJIL.getValue(this, LLJL[3]);
    }

    public final InterfaceC560620Lym Z4() {
        return (InterfaceC560620Lym) this.LLJJIJIIJIL.getValue(this, LLJL[2]);
    }

    private final boolean H4() {
        String strYQ;
        List<UploadImageParam> listDo1;
        InterfaceC1851500yHU interfaceC1851500yHUN5;
        List<UploadImageParam> listDo12;
        String strYQ2;
        if (!C0CHQ.LIZ().getAccountService().isLogin() || !this.LLJJJJJIL) {
            return false;
        }
        InterfaceC1851400yHK interfaceC1851400yHKD5 = d5();
        if (((interfaceC1851400yHKD5 == null || (strYQ2 = interfaceC1851400yHKD5.yQ()) == null) ? 0 : strYQ2.length()) > 1500) {
            return false;
        }
        int i = C389470FOv.LIZ[T2().LIZ.ordinal()];
        if (i == 1) {
            InterfaceC1851400yHK interfaceC1851400yHKD52 = d5();
            if (interfaceC1851400yHKD52 == null || (strYQ = interfaceC1851400yHKD52.yQ()) == null || strYQ.length() <= 0) {
                return false;
            }
        } else if (i == 2) {
            InterfaceC1851500yHU interfaceC1851500yHUN52 = n5();
            if (interfaceC1851500yHUN52 == null || (listDo1 = interfaceC1851500yHUN52.Do1()) == null || !(!listDo1.isEmpty())) {
                return false;
            }
        } else if (i != 3 || (interfaceC1851500yHUN5 = n5()) == null || (listDo12 = interfaceC1851500yHUN5.Do1()) == null || listDo12.size() != 2) {
            return false;
        }
        return true;
    }

    private final void nD1() {
        MutableLiveData<List<UploadImageParam>> mutableLiveDataTf1;
        MutableLiveData<String> mutableLiveDataOd1;
        MutableLiveData<C1838890xx9> mutableLiveDataOP2;
        MutableLiveData<AIGenerationType> mutableLiveDataII1;
        InterfaceC1851410yHL interfaceC1851410yHLP4 = P4();
        if (interfaceC1851410yHLP4 != null && (mutableLiveDataII1 = interfaceC1851410yHLP4.iI1()) != null) {
            mutableLiveDataII1.observe(this, new AObserverS229S0100000_27(this, 16));
        }
        InterfaceC1851400yHK interfaceC1851400yHKD5 = d5();
        if (interfaceC1851400yHKD5 != null && (mutableLiveDataOP2 = interfaceC1851400yHKD5.oP2()) != null) {
            mutableLiveDataOP2.observe(this, new AObserverS229S0100000_27(this, 17));
        }
        InterfaceC1851400yHK interfaceC1851400yHKD52 = d5();
        if (interfaceC1851400yHKD52 != null && (mutableLiveDataOd1 = interfaceC1851400yHKD52.Od1()) != null) {
            mutableLiveDataOd1.observe(this, new AObserverS229S0100000_27(this, 18));
        }
        InterfaceC1851500yHU interfaceC1851500yHUN5 = n5();
        if (interfaceC1851500yHUN5 == null || (mutableLiveDataTf1 = interfaceC1851500yHUN5.Tf1()) == null) {
            return;
        }
        mutableLiveDataTf1.observe(this, new AObserverS229S0100000_27(this, 19));
    }

    private final AIGCGenerationParam v5() {
        List<UploadImageParam> listDo1;
        AIGenerationType aIGenerationType;
        String aspectRatio;
        EnumC382880Ezm promptType;
        String strYQ;
        InterfaceC1851500yHU interfaceC1851500yHUN5 = n5();
        if (interfaceC1851500yHUN5 == null || (listDo1 = interfaceC1851500yHUN5.Do1()) == null) {
            listDo1 = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (UploadImageParam uploadImageParam : listDo1) {
            if (true ^ a0.LJJJIL(uploadImageParam.path)) {
                arrayList.add(uploadImageParam);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((UploadImageParam) it2.next()).path);
        }
        boolean z = arrayList2.size() > 1;
        C1843410y4R c1843410y4RT2 = T2();
        if (c1843410y4RT2 == null || (aIGenerationType = c1843410y4RT2.LIZ) == null) {
            aIGenerationType = AIGenerationType.TEXT_TO_VIDEO;
        }
        AIPlaygroundGenerateParams aIPlaygroundGenerateParams = new AIPlaygroundGenerateParams(aIGenerationType, arrayList);
        AIGCGenerationParamType aIGCGenerationParamType = arrayList2.size() > 1 ? AIGCGenerationParamType.FL2V_TYPE : arrayList2.size() == 1 ? AIGCGenerationParamType.I2V_TYPE : AIGCGenerationParamType.T2V_TYPE;
        String str = (String) C13LP.LJJJLL(arrayList2);
        String str2 = "";
        if (str == null) {
            str = "";
        }
        InterfaceC1851400yHK interfaceC1851400yHKD5 = d5();
        if (interfaceC1851400yHKD5 != null && (strYQ = interfaceC1851400yHKD5.yQ()) != null) {
            str2 = strYQ;
        }
        InterfaceC1851450yHP interfaceC1851450yHPK5 = k5();
        int duration = interfaceC1851450yHPK5 != null ? interfaceC1851450yHPK5.getDuration() : 5000;
        InterfaceC1851450yHP interfaceC1851450yHPK52 = k5();
        if (interfaceC1851450yHPK52 == null || (aspectRatio = interfaceC1851450yHPK52.getAspectRatio()) == null) {
            aspectRatio = "9:16";
        }
        List list = arrayList2;
        if (!z) {
            list = C13BV.INSTANCE;
        }
        InterfaceC1851400yHK interfaceC1851400yHKD52 = d5();
        if (interfaceC1851400yHKD52 == null || (promptType = interfaceC1851400yHKD52.getPromptType()) == null) {
            promptType = EnumC382880Ezm.BY_USER;
        }
        return new AIGCGenerationParam(null, aIGCGenerationParamType, str, "", false, false, str2, null, null, null, 0, duration, aspectRatio, null, "", true, false, 0, false, list, null, Integer.valueOf(promptType.getValue()), null, null, aIPlaygroundGenerateParams, C1429490nIp.LIZ(), C1429490nIp.LIZ(), false, null, null, 0, 0, null, null, null, -120117343, 7, null);
    }

    public final void C5() {
        AIGCGenerationParam aIGCGenerationParamV5 = v5();
        if (aIGCGenerationParamV5 != null && M5(aIGCGenerationParamV5)) {
            if (!C1851390yHJ.LIZIZ.getBoolean(C1851390yHJ.LIZ(), false)) {
                D5(new AwS428S0200000_27(this, aIGCGenerationParamV5, 9));
                return;
            }
            IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ = C07OF.LIZ();
            if (iAIPlaygroundMobServiceLIZ != null) {
                iAIPlaygroundMobServiceLIZ.LJIIIIZZ(C380220EvU.LIZ(T2().LIZ), this.LLJJ);
            }
            E5(aIGCGenerationParamV5);
        }
    }

    public final void H5() {
        i3(new AwS39S0010000_27(H4() && !Intrinsics.LJFF(T2().LIZLLL, Boolean.FALSE), 6));
    }

    public final void K4() {
        InterfaceC1851400yHK interfaceC1851400yHKD5 = d5();
        if (interfaceC1851400yHKD5 != null) {
            interfaceC1851400yHKD5.LJJIL();
        }
    }

    @Override // X.InterfaceC1851490yHT
    public void Py() {
        AIGenerationType aIGenerationType = T2().LIZ;
        IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ = C07OF.LIZ();
        if (iAIPlaygroundMobServiceLIZ != null) {
            iAIPlaygroundMobServiceLIZ.LIZLLL(C380220EvU.LIZ(aIGenerationType), this.LLJJ);
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        nD1();
    }

    public final C19EG getActivity() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1843410y4R> o2() {
        return this.LLJJJJLIIL;
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
    }

    public final CreativeModel t5() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1843430y4T> w2() {
        return this.LLJJL;
    }

    private final void D5(Function0<Unit> function0) {
        if (C1429490nIp.LIZ()) {
            C384040F3y c384040F3y = C384040F3y.LIZ;
            C19EG c19eg = this.LLJJI;
            AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(function0, (Function0<Unit>) 74);
            c384040F3y.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c19eg.getString(2131825831));
            sbLIZ.append('\n');
            sbLIZ.append(c19eg.getString(2131825832));
            C384040F3y.LIZIZ(c19eg, C2188811AlT.LIZIZ(sbLIZ), c19eg.getString(2131829709), c19eg.getString(2131829708), false, 0, 0, awS606S0100000_27, null, true);
            return;
        }
        C384040F3y c384040F3y2 = C384040F3y.LIZ;
        C19EG c19eg2 = this.LLJJI;
        AwS606S0100000_27 awS606S0100000_272 = new AwS606S0100000_27(function0, (Function0<Unit>) 75);
        c384040F3y2.getClass();
        C384040F3y.LIZIZ(c19eg2, c19eg2.getString(2131829710, c19eg2.getString(2131829711)), c19eg2.getString(2131829709), c19eg2.getString(2131829708), false, 1, 1, awS606S0100000_272, null, true);
    }

    public static boolean F4(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    private final boolean M5(AIGCGenerationParam aIGCGenerationParam) {
        List<UploadImageParam> listDo1;
        boolean z;
        C377760ErW c377760ErW;
        InterfaceC1851500yHU interfaceC1851500yHUN5 = n5();
        if (interfaceC1851500yHUN5 == null || (listDo1 = interfaceC1851500yHUN5.Do1()) == null) {
            listDo1 = C13BV.INSTANCE;
        }
        if (aIGCGenerationParam.promptDescription.length() > 1500) {
            z = true;
        } else {
            z = false;
        }
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            c377760ErW = new C377760ErW(-7, null, 0, null, null, 29);
        } else if (!F4(this.LLJJI)) {
            c377760ErW = new C377760ErW(-47364, null, 0, null, null, 29);
        } else if (!this.LLJJJJJIL) {
            Keva keva = C1851390yHJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("max_ai_video_quota_");
            sbLIZ.append((String) C1851390yHJ.LIZ.getValue());
            c377760ErW = new C377760ErW(5, null, keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 15), null, null, 21);
        } else if (z) {
            c377760ErW = new C377760ErW(-5, null, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, null, null, 21);
        } else if (T2().LIZ == AIGenerationType.TEXT_TO_VIDEO && aIGCGenerationParam.promptDescription.length() == 0) {
            c377760ErW = new C377760ErW(-2, null, 0, null, null, 29);
        } else if (T2().LIZ == AIGenerationType.AI_TRANSITION && listDo1.size() < 2) {
            c377760ErW = new C377760ErW(-3, null, 0, null, null, 29);
        } else {
            if (T2().LIZ != AIGenerationType.IMAGE_TO_VIDEO || !listDo1.isEmpty()) {
                return true;
            }
            c377760ErW = new C377760ErW(-3, null, 0, null, null, 29);
        }
        C384040F3y c384040F3y = C384040F3y.LIZ;
        C19EG c19eg = this.LLJJI;
        c384040F3y.getClass();
        String strLIZ = C384040F3y.LIZ(c19eg, c377760ErW);
        if (!c19eg.isFinishing()) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(strLIZ);
            c1389890mGx.LIZ(false);
            c1389890mGx.LJIIJJI();
        }
        return false;
    }

    private final boolean x5(int i) {
        if (!C307460C3k.LIZ() || i <= 0) {
            return false;
        }
        return true;
    }

    public final void E5(AIGCGenerationParam aIGCGenerationParam) {
        List<String> listLJIIL = aIGCGenerationParam.imagePathList;
        if (listLJIIL.isEmpty()) {
            String str = aIGCGenerationParam.imagePath;
            if (!(!a0.LJJJIL(str))) {
                str = null;
            }
            listLJIIL = C1697810uHb.LJIIL(str);
        }
        if (!x5(listLJIIL.size())) {
            O4(aIGCGenerationParam, false);
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2497409qW(this, aIGCGenerationParam, listLJIIL, null), 3);
        }
    }

    @Override // X.InterfaceC1851490yHT
    public void cS0(String str) {
        String aspectRatio;
        int duration;
        String resourceId;
        IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ = C07OF.LIZ();
        if (iAIPlaygroundMobServiceLIZ != null) {
            CreativeModel creativeModel = this.LLJJ;
            String strLIZ = C380220EvU.LIZ(T2().LIZ);
            InterfaceC1851450yHP interfaceC1851450yHPK5 = k5();
            if (interfaceC1851450yHPK5 == null || (aspectRatio = interfaceC1851450yHPK5.getAspectRatio()) == null) {
                aspectRatio = "9:16";
            }
            InterfaceC1851450yHP interfaceC1851450yHPK52 = k5();
            if (interfaceC1851450yHPK52 != null) {
                duration = interfaceC1851450yHPK52.getDuration();
            } else {
                duration = 5000;
            }
            String strValueOf = String.valueOf(duration / LSPassThroughRecordSizeConfig.DEFAULT);
            InterfaceC1851400yHK interfaceC1851400yHKD5 = d5();
            if (interfaceC1851400yHKD5 == null || (resourceId = interfaceC1851400yHKD5.getResourceId()) == null) {
                resourceId = "";
            }
            iAIPlaygroundMobServiceLIZ.LJ(creativeModel, strLIZ, str, aspectRatio, strValueOf, resourceId);
        }
    }

    @Override // X.InterfaceC1851490yHT
    public void u82(C377660ErM c377660ErM) {
        boolean z;
        int i = c377660ErM.LIZLLL;
        int i2 = c377660ErM.LJ;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJJJJIL = z;
        Keva keva = C1851390yHJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("max_ai_video_quota_");
        sbLIZ.append((String) C1851390yHJ.LIZ.getValue());
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), i2);
        H5();
    }

    @Override // X.InterfaceC1851490yHT
    public void w91(boolean z) {
        i3(new AwS39S0010000_27(z, 4));
        if (z) {
            i3(new AwS39S0010000_27(H4(), 5));
        } else {
            i3(AFwS269S0000000_27.get$arr$(39));
        }
    }

    public final void O4(AIGCGenerationParam aIGCGenerationParam, boolean z) {
        if (this.LLJJJJ) {
            return;
        }
        this.LLJJJJ = true;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C560780Lz2(this, aIGCGenerationParam, null, z), 3);
    }

    @Override // X.InterfaceC1851490yHT
    public void io2(String str, String str2) {
        IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ = C07OF.LIZ();
        if (iAIPlaygroundMobServiceLIZ != null) {
            iAIPlaygroundMobServiceLIZ.LIZIZ(this.LLJJ, C380220EvU.LIZ(T2().LIZ), str2);
        }
    }

    public C1851370yHH(C19A3 c19a3, C1DRG c1drg, CreativeModel creativeModel, C19EG c19eg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = creativeModel;
        this.LLJJI = c19eg;
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851410yHL.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851400yHK.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC560620Lym.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC560800Lz4.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851500yHU.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851450yHP.class, null);
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = AFwS216S0000000_27.get$arr$(87);
        this.LLJJL = new AwS571S0100000_27(this, 210);
    }
}
