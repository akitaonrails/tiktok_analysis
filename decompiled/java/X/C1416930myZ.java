package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS266S0300000_22;

/* JADX INFO: renamed from: X.0myZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416930myZ extends AbstractC2255721DQs<InterfaceC1416960myc> implements InterfaceC1416960myc, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417050myl.class, null);
    public final InterfaceC1416960myc LLILZIL = this;
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1635410sex.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1416930myZ.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1416930myZ.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1416930myZ.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1416930myZ.class, "effectPlatform", "getEffectPlatform()Lcom/ss/android/ugc/aweme/effectplatform/IEffectPlatform;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLIZLLLIL = 8;
    }

    private final InterfaceC1417050myl Z1() {
        return (InterfaceC1417050myl) this.LLILZ.getValue(this, LLIZ[2]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILLL.getValue(this, LLIZ[1]);
    }

    private final InterfaceC1635410sex o2() {
        return (InterfaceC1635410sex) this.LLILZLL.getValue(this, LLIZ[3]);
    }

    private final VideoPublishEditModel w2() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLIZ[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        List<AutoCutMediaModel> list;
        super.onCreate();
        AutoCutModel autoCutModel = w2().creativeModel.autoCutModel;
        int i = autoCutModel.curTemplateType;
        String str = autoCutModel.curTemplateId;
        AutoCutThemeData autoCutThemeDataLIZJ = C1416110mxF.LIZJ(autoCutModel);
        String str2 = autoCutThemeDataLIZJ != null ? autoCutThemeDataLIZJ.templateUrl : null;
        if (!u4.LJJJJIZL(w2()) || !w2().mIsFromDraft || str == null || str2 == null || (list = C1417160myw.LJII(getActivity(), w2(), getDiContainer(), true).LIZ) == null || list.isEmpty()) {
            return;
        }
        C1419810n3D.LIZJ(null);
        final Pair pair = new Pair(Integer.valueOf(autoCutModel.curIndexFromSource), C1416110mxF.LJIIJJI(autoCutModel.curSource));
        if (C295320Bhq.LIZ()) {
            s sVar = s.LIZ;
            String str3 = autoCutModel.taskId;
            EnumC1417520mzW enumC1417520mzW = EnumC1417520mzW.TEMPLATE_PUGC;
            CreativeInfo creativeInfo = w2().getCreativeInfo();
            InterfaceC1635410sex interfaceC1635410sexO2 = o2();
            boolean zLJJJJIZL = u4.LJJJJIZL(w2());
            sVar.getClass();
            C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C1416940mya(this, pair, null), s.LJJJJLL(str3, "", str, str2, "", enumC1417520mzW, list, null, creativeInfo, false, false, i, "", null, null, interfaceC1635410sexO2, null, false, false, zLJJJJIZL, false, this)));
            return;
        }
        s sVar2 = s.LIZ;
        String str4 = autoCutModel.taskId;
        EnumC1417520mzW enumC1417520mzW2 = EnumC1417520mzW.TEMPLATE_PUGC;
        CreativeInfo creativeInfo2 = w2().getCreativeInfo();
        InterfaceC1635410sex interfaceC1635410sexO22 = o2();
        boolean zLJJJJIZL2 = u4.LJJJJIZL(w2());
        final C13BV c13bv = C13BV.INSTANCE;
        s.LJJJLIIL(str4, "", str, str2, "", enumC1417520mzW2, list, null, creativeInfo2, false, false, i, "", null, null, interfaceC1635410sexO22, null, false, false, zLJJJJIZL2, false, this, new C1417970n0F(c13bv) { // from class: X.0myb
            @Override // X.C1417970n0F
            public final void LIZJ(int i2, int i3, String str5) {
            }

            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onCompressDone(VecMeta vecMeta) {
            }

            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onCompressProgress(float f) {
            }

            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onFailure(String str5, int i2, String str6, UnorderedMapStrStr unorderedMapStrStr) {
            }

            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onFetchProgress(float f) {
            }

            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onNeedFetch(VecStr vecStr) {
            }

            @Override // X.C1417970n0F
            public final void LIZIZ(NLEModel nLEModel, Map<String, String> map) {
                this.LJII.W1(pair, nLEModel);
            }
        });
    }

    public InterfaceC1416960myc X1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1416930myZ(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void W1(Pair<Integer, ? extends C0MJ9> pair, NLEModel nLEModel) {
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            C01TT.LIZLLL(new AwS266S0300000_22(this, (C1416930myZ) pair, (Pair<Integer, ? extends C0MJ9>) nLEModel, (NLEModel) 4));
            return;
        }
        InterfaceC1417050myl interfaceC1417050mylZ1 = Z1();
        if (interfaceC1417050mylZ1 == null) {
            return;
        }
        interfaceC1417050mylZ1.g51(pair, nLEModel);
    }
}
