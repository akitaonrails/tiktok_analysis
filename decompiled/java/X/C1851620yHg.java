package X;

import Y.AObserverS229S0100000_27;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCPromptInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundGenerateParams;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.ImageInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS236S0300000_27;
import kotlin.jvm.internal.AwS271S0300000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0yHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851620yHg extends i<InterfaceC381730Exv, C1851680yHm, C1851630yHh, C1851730yHr> implements InterfaceC379610EuV, InterfaceC381730Exv {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final AIGCPromptInfo LLJJIII;
    public final Function0<C1851630yHh> LLJJIJI;
    public final Function0<C1851730yHr> LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1851620yHg.class, "originCreativeModel", "getOriginCreativeModel()Lcom/ss/android/ugc/aweme/creative/model/CreativeModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1851620yHg.class, "aiPlaygroundLoadingApi", "getAiPlaygroundLoadingApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundLoadingApi;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJJ = 8;
    }

    private final InterfaceC560800Lz4 F4() {
        return (InterfaceC560800Lz4) this.LLJJI.getValue(this, LLJJIJIL[1]);
    }

    private final CreativeModel K4() {
        return (CreativeModel) this.LLJJ.getValue(this, LLJJIJIL[0]);
    }

    private final void O4() {
        AIGCGenerationParam aIGCGenerationParam;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJJLL(H4().editorProAIGCInfoModel.editorProAIGCMediaItemModelList);
        if (editorProAIGCMediaItemModel == null || (aIGCGenerationParam = editorProAIGCMediaItemModel.param) == null) {
            aIGCGenerationParam = new AIGCGenerationParam(null, null, null, null, false, false, null, null, null, null, 0, 0, null, null, null, false, false, 0, false, null, null, null, null, null, null, false, false, false, null, null, 0, 0, null, null, null, -1, 7, null);
        }
        if (aIGCGenerationParam.aiPlaygroundGenerateParams.aiPlaygroundGenerationType != AIGenerationType.NONE) {
            i3(new AwS606S0100000_27(aIGCGenerationParam, 80));
        } else if (this.LLJJIII == null) {
            i3(AFwS269S0000000_27.get$arr$(42));
        } else {
            P4();
        }
    }

    private final void P4() {
        AIGCPromptInfo aIGCPromptInfo = this.LLJJIII;
        if (aIGCPromptInfo == null) {
            return;
        }
        String str = aIGCPromptInfo.prompt;
        int i = aIGCPromptInfo.duration;
        String str2 = aIGCPromptInfo.aspectRatio;
        AIGenerationType aIGenerationTypeLIZ = C378330EsR.LIZ(aIGCPromptInfo);
        List<ImageInfo> list = aIGCPromptInfo.images;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<ImageInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next();
            arrayList.add(new UploadImageParam("placeholder", -1, -1, false));
        }
        AIPlaygroundGenerateParams aIPlaygroundGenerateParams = new AIPlaygroundGenerateParams(aIGenerationTypeLIZ, arrayList);
        AIGCGenerationParam aIGCGenerationParam = new AIGCGenerationParam(null, AIGCGenerationParamType.T2V_TYPE, null, "", false, false, str, null, null, null, 0, i, str2, null, "", true, false, 0, false, null, null, null, null, null, aIPlaygroundGenerateParams, C1429490nIp.LIZ(), C1429490nIp.LIZ(), false, null, null, 0, 0, null, null, null, -117495899, 7, null);
        if (C378330EsR.LIZ(this.LLJJIII) == AIGenerationType.TEXT_TO_VIDEO) {
            i3(new AwS606S0100000_27(aIGCGenerationParam, 81));
            return;
        }
        i3(new AwS606S0100000_27(aIGCGenerationParam, 82));
        CreativeInfo creativeInfo = H4().creativeInfo;
        List<ImageInfo> list2 = aIGCPromptInfo.images;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (ImageInfo imageInfo : list2) {
            String str3 = imageInfo.url;
            int i2 = imageInfo.hasFace;
            boolean z = true;
            if (i2 != 1) {
                z = false;
            }
            arrayList2.add(new Pair(str3, Boolean.valueOf(z)));
        }
        AwS236S0300000_27 awS236S0300000_27 = new AwS236S0300000_27(aIGCGenerationParam, aIPlaygroundGenerateParams, this, 12);
        AwS271S0300000_27 awS271S0300000_27 = new AwS271S0300000_27(aIGCGenerationParam, aIPlaygroundGenerateParams, this, 2);
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Pair) it3.next()).getFirst());
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01WC(arrayList3, awS236S0300000_27, awS271S0300000_27, creativeInfo, arrayList2, null), 3);
    }

    @Override // X.InterfaceC381730Exv
    public void LLLIL() {
        i3(AFwS269S0000000_27.get$arr$(41));
    }

    private final void Xi() {
        F4().dX0().observe(this, new AObserverS229S0100000_27(this, 23));
    }

    public final CreativeModel H4() {
        return K4();
    }

    @Override // X.InterfaceC381730Exv
    public boolean onBackPressed() {
        if (F4().getVisibility()) {
            return false;
        }
        i3(AFwS269S0000000_27.get$arr$(43));
        return true;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        O4();
        Xi();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1851630yHh> o2() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1851730yHr> w2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC381730Exv
    public boolean LLLLILI(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        i3(new AwS606S0100000_27(bundle, 83));
        return true;
    }

    public final boolean T4(AIGCPromptInfo aIGCPromptInfo) {
        if (aIGCPromptInfo == null || C378330EsR.LIZ(aIGCPromptInfo) == AIGenerationType.TEXT_TO_VIDEO) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC381730Exv
    public void nK0(C377660ErM c377660ErM) {
        i3(new AwS606S0100000_27(c377660ErM, 84));
    }

    public C1851620yHg(C19A3 c19a3, C1DRG c1drg, Bundle bundle) {
        String string;
        AIGCPromptInfo aIGCPromptInfo;
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        AIGCPromptInfo aIGCPromptInfo2 = null;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), CreativeModel.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC560800Lz4.class, null);
        if (bundle != null && (string = bundle.getString("prompt_info")) != null && (aIGCPromptInfo = (AIGCPromptInfo) C051R.LIZ(string, AIGCPromptInfo.class)) != null) {
            List listLIZIZ = C1813810xIh.LIZIZ();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf((int) (((Number) it2.next()).doubleValue() * ((double) LSPassThroughRecordSizeConfig.DEFAULT))));
            }
            aIGCPromptInfo2 = (!(arrayList.isEmpty() ^ true) || arrayList.contains(Integer.valueOf(aIGCPromptInfo.duration))) ? aIGCPromptInfo : new AIGCPromptInfo(aIGCPromptInfo.prompt, aIGCPromptInfo.images, ((Number) C13LP.LJJJJZI(arrayList)).intValue(), aIGCPromptInfo.aspectRatio, aIGCPromptInfo.type);
        }
        this.LLJJIII = aIGCPromptInfo2;
        this.LLJJIJI = new AwS571S0100000_27(this, 213);
        this.LLJJIJIIJIL = new AwS571S0100000_27(this, 214);
    }
}
