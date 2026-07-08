package X;

import Y.AObjectS245S0100000_22;
import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import ge.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS108S0110000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mxR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416230mxR extends i<InterfaceC566060MIa, C1416270mxV, C1416250mxT, C1416260mxU> implements InterfaceC379610EuV, InterfaceC566060MIa {
    public static final C566150MIj LLJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final C1DRG LLJILJILJ;
    public final AISelfModel LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public Effect LLJJIJIL;
    public final Function0<C1416270mxV> LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1416230mxR.class, "toolbarApiComponent", "getToolbarApiComponent()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1416230mxR.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1416230mxR.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0)};
        LLJJJIL = new C566150MIj();
        LLJJJJJIL = 8;
    }

    private final void Sh() {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2381809Uy(this, null), 3);
    }

    private final C356830Dyr Z4() {
        return (C356830Dyr) this.LLJJIJIIJIL.getValue();
    }

    private final InterfaceC1460000o62 k5() {
        return (InterfaceC1460000o62) this.LLJJ.getValue(this, LLJJJJ[0]);
    }

    public final void H4() {
        Effect effect = this.LLJJIJIL;
        if (effect != null) {
            C1413450msx c1413450msx = C1413450msx.LIZ;
            VideoPublishEditModel editModel = getEditModel();
            Pair pair = new Pair(effect.getDesignerId(), String.valueOf(effect.getSource()));
            String effect_id = effect.getEffect_id();
            c1413450msx.getClass();
            C1413450msx.LJIILL(editModel, pair, effect_id, "", -1, 0, "video_edit_page");
        }
        this.LLJJIJIL = null;
        getEditModel().getEffectList().clear();
        C356830Dyr c356830DyrZ4 = Z4();
        if (c356830DyrZ4 != null) {
            c356830DyrZ4.LJ();
        }
        O4();
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJIII.getValue(this, LLJJJJ[2]);
    }

    public final IAIMEServices T4() {
        return (IAIMEServices) this.LLJJIJI.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJI.getValue(this, LLJJJJ[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1416250mxT> o2() {
        return AFwS210S0000000_22.get$arr$(198);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1416260mxU> w2() {
        return new AwS566S0100000_22(this, 429);
    }

    public final void O4() {
        boolean z = true;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "aiself_edit_effect_button", true, false)) {
            Effect effect = this.LLJJIJIL;
            if (effect == null) {
                i3(AFwS261S0000000_22.get$arr$(165));
                return;
            }
            ArrayList<EffectPointModel> arrayList = getEditModel().creativeModel.editEffectModel.effectList;
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                z = false;
            } else {
                Iterator<EffectPointModel> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (Intrinsics.LJFF(it2.next().getKey(), effect.getEffectId())) {
                        if (arrayList.size() != 1) {
                            break;
                        }
                    }
                }
                z = false;
            }
            i3(new AwS108S0110000_22(effect, z, 6));
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        k5().x8().observe(this, new AObjectS245S0100000_22(this, 110));
        C566150MIj c566150MIj = LLJJJIL;
        VideoPublishEditModel editModel = getEditModel();
        c566150MIj.getClass();
        vm1(C566150MIj.LIZ(editModel));
    }

    @Override // ge.i
    public Function0<C1416270mxV> E3() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    private final void F4(final List<String> list) {
        final C013C c013c = new C013C();
        new C565780MGy().LIZ(list, "editingeffect", new IFetchEffectListListener() { // from class: X.0mxS
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<Effect> list2) {
                InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
                C348100Dkm c348100DkmLIZIZ;
                List<Effect> list3 = list2;
                C013C c013c2 = c013c;
                if (!c013c2.element) {
                    c013c2.element = true;
                    AbstractC1452680nuE abstractC1452680nuEGc = this.JY0().gc();
                    if (abstractC1452680nuEGc != null && (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) != null) {
                        C1416230mxR c1416230mxR = this;
                        int duration = c348100DkmLIZIZ.LJIIIIZZ().getDuration();
                        if (list3 != null) {
                            for (Effect effect : list3) {
                                if (c1416230mxR.d5(duration, effect, c1416230mxR.getEditModel().getEffectList())) {
                                    c1416230mxR.K4(effect, duration);
                                    c1416230mxR.LLJJIJIL = effect;
                                }
                            }
                        }
                        c1416230mxR.getEditModel().getEffectList().addAll(c1416230mxR.P4(c348100DkmLIZIZ, duration));
                        c1416230mxR.O4();
                    }
                }
            }
        }, true);
    }

    @Override // X.InterfaceC566060MIa
    public void vm1(List<String> list) {
        if (list != null && !list.isEmpty()) {
            if (T4() != null && (!((Boolean) r1.LIZLLL(Boolean.FALSE)).booleanValue())) {
                Sh();
            }
            F4(list);
        }
    }

    public final void K4(Effect effect, long j) {
        getEditModel().creativeModel.editEffectModel.defaultEffectList.add(effect);
        C356830Dyr c356830DyrZ4 = Z4();
        if (c356830DyrZ4 != null) {
            C356830Dyr.LIZIZ(c356830DyrZ4, C0F4X.LIZ(-1, effect, "", ""), 0L, ((long) LSPassThroughRecordSizeConfig.DEFAULT) * j, 100, true, 32);
        }
    }

    public final ArrayList<EffectPointModel> P4(C348100Dkm c348100Dkm, int i) {
        ArrayList<EffectPointModel> arrayList = new ArrayList<>();
        Iterator it2 = ((ArrayList) C348370DlD.LIZIZ(c348100Dkm.LIZ.getModel())).iterator();
        while (it2.hasNext()) {
            arrayList.add(C363510EMz.LIZ((C348380DlE) it2.next(), false, i));
        }
        return arrayList;
    }

    public C1416230mxR(C19A3 c19a3, C1DRG c1drg, AISelfModel aISelfModel) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = aISelfModel;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJJIJI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(280));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 428));
        this.LLJJJ = AFwS210S0000000_22.get$arr$(199);
    }

    public final boolean d5(int i, Effect effect, List<? extends EffectPointModel> list) {
        EffectPointModel next;
        boolean z;
        Iterator<? extends EffectPointModel> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getKey(), effect.getEffectId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next != null) {
            z = true;
        } else {
            z = false;
        }
        if (i >= C0F4X.LIZJ(0, effect.getTags()) && !z) {
            return true;
        }
        return false;
    }
}
