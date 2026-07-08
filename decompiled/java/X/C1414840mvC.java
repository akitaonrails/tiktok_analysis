package X;

import android.app.Application;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.CategoryInfo;
import com.ss.android.ugc.gamora.editor.mixediting.resource.model.MixEditingCategoryData;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.0mvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414840mvC extends C1423340n8u<MixEditingCategoryData, C1412860ms0, C1414920mvK, CategoryInfo, Asset, C1414880mvG, Object, C1414810mv9, AnonymousClass0067, Integer> {
    public final Application LIZLLL;
    public final LifecycleOwner LJ;
    public final InterfaceC1635410sex LJFF;
    public final Function0<List<AutoCutMediaModel>> LJI;
    public final Function0<CreativeInfo> LJII;
    public final Function0<String> LJIIIIZZ;
    public final Function0<VideoPublishEditModel> LJIIIZ;
    public final Function0<Boolean> LJIIJ;
    public final InterfaceC1453200nv4 LJIIJJI;
    public final Function0<InterfaceC1414530muh> LJIIL;
    public final Function2<String, String, IMusicRequestParam> LJIILIIL;
    public final Function0<C2268608ui> LJIILJJIL;
    public final Function0<Boolean> LJIILL;
    public int LJIJ;
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 956));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 955));
    public final C01GW LJIJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1199));
    public final C01GW LJIJJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1198));

    public final int LJ() {
        return ((Number) this.LJIJI.getValue()).intValue();
    }

    public final C1415940mwy LJFF() {
        return (C1415940mwy) this.LJIILLIIL.getValue();
    }

    public static void LJI(int i) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("type", "mix_editing_fetch_data");
        c0lab.LJ("duration", String.valueOf(i));
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_performance_operation_cost_time", c0lab.LIZ);
    }

    public final void LIZLLL(C1414880mvG c1414880mvG, final InterfaceC1414870mvF interfaceC1414870mvF) {
        final boolean z;
        int iLJ;
        if (c1414880mvG.LIZLLL) {
            this.LJIJ = 0;
        }
        if (C0BNK.LIZ() && !c1414880mvG.LJIILLIIL) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJ), C0PEM.LIZJ, null, new C1414860mvE(c1414880mvG, interfaceC1414870mvF, this, null), 2);
            return;
        }
        final C1414880mvG c1414880mvGLIZ = C1414880mvG.LIZ(c1414880mvG, this.LJIJ, LJ(), false, 67108860);
        final int iLJZI = C13LP.LJZI(c1414880mvGLIZ.LJIIL);
        if (c1414880mvGLIZ.LJIIZILJ && c1414880mvGLIZ.LIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[fetchAllPanelData]start requesting all panel, cursor=");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append(", pageSize=");
        sbLIZ.append(LJ());
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1423360n8w<MixEditingCategoryData, C1412860ms0, C1414920mvK, C1414810mv9, AnonymousClass0067> interfaceC1423360n8w = new InterfaceC1423360n8w<MixEditingCategoryData, C1412860ms0, C1414920mvK, C1414810mv9, AnonymousClass0067>() { // from class: X.0mvD
            @Override // X.InterfaceC1423360n8w
            public final void onCancel() {
            }

            @Override // X.InterfaceC1423360n8w
            public final void LIZ(C1414920mvK c1414920mvK) {
                interfaceC1414870mvF.LIZIZ(c1414920mvK);
                if (!C0BWH.LIZ()) {
                    this.LIZ.LJIJ = 0;
                }
            }

            @Override // X.InterfaceC1423360n8w
            public final void LIZIZ(List<? extends MixEditingCategoryData> list, C1414810mv9 c1414810mv9, C1423320n8s<MixEditingCategoryData, C1412860ms0, AnonymousClass0067, C1414920mvK> c1423320n8s) {
                List<C1412860ms0> list2;
                boolean z2;
                List<C1412860ms0> listLL;
                String str;
                String str2;
                Integer numValueOf;
                if (c1423320n8s != null && (list2 = c1423320n8s.LIZIZ) != null) {
                    if (c1423320n8s != null) {
                        z2 = c1423320n8s.LJFF;
                    } else {
                        z2 = false;
                    }
                    C0MJ8 c0mj82 = C0MJ8.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[fetchAllPanelData]mix asset list size=");
                    sbLIZ2.append(list2.size());
                    sbLIZ2.append(", hasMore=");
                    sbLIZ2.append(z2);
                    C201955140j.LIZJ(c0mj82, C2188811AlT.LIZIZ(sbLIZ2));
                    if (this.LIZ.LJIJ + list2.size() < ((Number) this.LIZ.LJIJJ.getValue()).intValue() && z2) {
                        InterfaceC1414870mvF interfaceC1414870mvF2 = interfaceC1414870mvF;
                        if (c1423320n8s != null) {
                            str2 = c1423320n8s.LJI;
                        } else {
                            str2 = null;
                        }
                        c1414810mv9.getClass();
                        interfaceC1414870mvF2.LIZ(list2, new C1414810mv9(true, str2));
                        C1414840mvC c1414840mvC = this.LIZ;
                        if (c1423320n8s != null && (numValueOf = Integer.valueOf(c1423320n8s.LIZJ)) != null) {
                            c1414840mvC.LJIJ = numValueOf.intValue();
                            if (!C0BWH.LIZ()) {
                                this.LIZ.LIZLLL(c1414880mvGLIZ, interfaceC1414870mvF);
                            }
                        } else {
                            "mix asset will not be null here".toString();
                            throw new IllegalArgumentException("mix asset will not be null here");
                        }
                    } else {
                        int iIntValue = ((Number) this.LIZ.LJIJJ.getValue()).intValue() - this.LIZ.LJIJ;
                        if (iIntValue > 0) {
                            listLL = C13LP.LL(list2, iIntValue);
                        } else {
                            listLL = C13BV.INSTANCE;
                        }
                        InterfaceC1414870mvF interfaceC1414870mvF3 = interfaceC1414870mvF;
                        if (c1423320n8s != null) {
                            str = c1423320n8s.LJI;
                        } else {
                            str = null;
                        }
                        c1414810mv9.getClass();
                        interfaceC1414870mvF3.LIZ(listLL, new C1414810mv9(false, str));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("[fetchAllPanelData]pagination finished, assetsToKeep=");
                        sbLIZ3.append(listLL.size());
                        sbLIZ3.append(", cursor=");
                        sbLIZ3.append(this.LIZ.LJIJ);
                        sbLIZ3.append(", pageSize=");
                        sbLIZ3.append(this.LIZ.LJ());
                        C201955140j.LIZJ(c0mj82, C2188811AlT.LIZIZ(sbLIZ3));
                        this.LIZ.LJIJ = 0;
                    }
                    if (C0BNK.LIZ() && z) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C576120Mig.LIZIZ), null, null, new C2301308zz(iLJZI, list2, null), 3);
                        return;
                    }
                    return;
                }
                "mix asset will not be null here, already handled".toString();
                throw new IllegalArgumentException("mix asset will not be null here, already handled");
            }

            @Override // X.InterfaceC1423360n8w
            public final /* bridge */ /* synthetic */ void LIZJ(List list, C1423470n97 c1423470n97, TemplateCategoryData templateCategoryData, List list2, C1422890n8B c1422890n8B) {
            }
        };
        InterfaceC1423420n92<CATEGORY, DATA, ERROR_DATA, ORI_CATEGORY, ORI_DATA, FETCH_CATEGORY_PARAM, FETCH_CATEGORY_RESULT_EXTRA, FETCH_DATA_RESULT_EXTRA_DATA> interfaceC1423420n92 = this.LIZIZ;
        if (interfaceC1423420n92 != 0) {
            interfaceC1423420n92.LIZIZ(c1414880mvGLIZ, new C1423290n8p(this, interfaceC1423360n8w));
        }
        if (LJ() <= 0) {
            iLJ = -1;
        } else {
            iLJ = (this.LJIJ / LJ()) + 1;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJ), C0PEM.LIZJ, null, new C1414830mvB(this, iLJ, null), 2);
    }

    public final void LIZJ(C1412860ms0 c1412860ms0, boolean z, InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz) {
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixAssetDownloader -> downloadData, ");
        sbLIZ.append(c1412860ms0.LIZ.getTitle());
        sbLIZ.append(' ');
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        ((InterfaceC1416020mx6) this.LJIIZILJ.getValue()).LIZJ(c1412860ms0, z, interfaceC1437705jz);
    }

    public C1414840mvC(Application application, C1414720mv0 c1414720mv0, InterfaceC1635410sex interfaceC1635410sex, AwS566S0100000_22 awS566S0100000_22, AwS566S0100000_22 awS566S0100000_222, AwS547S0100000_3 awS547S0100000_3, AwS566S0100000_22 awS566S0100000_223, AwS566S0100000_22 awS566S0100000_224, InterfaceC1453200nv4 interfaceC1453200nv4, Function0 function0, AwS636S0100000_22 awS636S0100000_22, AwS547S0100000_3 awS547S0100000_32, AwS566S0100000_22 awS566S0100000_225) {
        this.LIZLLL = application;
        this.LJ = c1414720mv0;
        this.LJFF = interfaceC1635410sex;
        this.LJI = awS566S0100000_22;
        this.LJII = awS566S0100000_222;
        this.LJIIIIZZ = awS547S0100000_3;
        this.LJIIIZ = awS566S0100000_223;
        this.LJIIJ = awS566S0100000_224;
        this.LJIIJJI = interfaceC1453200nv4;
        this.LJIIL = function0;
        this.LJIILIIL = awS636S0100000_22;
        this.LJIILJJIL = awS547S0100000_32;
        this.LJIILL = awS566S0100000_225;
    }
}
