package X;

import Y.ACListenerS140S0100000_5;
import Y.AComparatorS24S0000000_5;
import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLEBranchListener;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.EffectMobParams;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS123S0110000_5;
import kotlin.jvm.internal.AwS145S0101000_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS26S1201000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS3S0000001_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS9S0200001_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import nv7.c0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0EPT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EPT extends i<InterfaceC1455500nym, C365100ETc, C364260EPw, C0EPQ> implements InterfaceC1455500nym, InterfaceC379610EuV {
    public static final C364130EPj LLLLIIIILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIIL;
    public static final int LLLLIILL;
    public final C1DRG LLJILJILJ;
    public final C19A3 LLJILLL;
    public final C385670FAf<Integer> LLJJ;
    public final LiveEvent<Unit> LLJJI;
    public final LiveEvent<Unit> LLJJIII;
    public final LiveEvent<Integer> LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public InterfaceC1452170ntP LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public NLEModel LLJLIL;
    public String LLJLILLLLZIIL;
    public long LLJLL;
    public long LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final InterfaceC1731706qJ LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public Pair<String, String> LLLFZ;
    public long LLLI;
    public Pair<Long, Long> LLLII;
    public final List<Function0<Boolean>> LLLIIII;
    public boolean LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C365260ETs LLLIL;
    public final Function0<C364260EPw> LLLILZ;
    public final Function0<C0EPQ> LLLILZJ;
    public C365100ETc LLLILZLLLI;
    public final Function0<C365100ETc> LLLIZZ;
    public C354000DuI LLLJ;
    public NLEBranchListener LLLJIL;
    public final C0EPU LLLJL;
    public final C361760EGg LLLL;
    public final boolean LLLLII;

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0EPj] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EPT.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0EPT.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C0EPT.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0), new C2217381BqS(C0EPT.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0), new C2217381BqS(C0EPT.class, "mixEditingMaterialApi", "getMixEditingMaterialApi()Lcom/ss/android/ugc/gamora/editor/mixediting/VideoMixEditingAssetsApi;", 0), new C2217381BqS(C0EPT.class, "video2ImageApi", "getVideo2ImageApi()Lcom/ss/android/ugc/aweme/image/switchmode/separate/Video2ImageSwitchWithoutMixEditingApi;", 0), new C2217381BqS(C0EPT.class, "memeAudioCaptionApiComponent", "getMemeAudioCaptionApiComponent()Lcom/ss/android/ugc/aweme/aicaption/MemeAudioCaptionApiComponent;", 0), new C2217381BqS(C0EPT.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C0EPT.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0), new C2217381BqS(C0EPT.class, "editEffectModelApiComponent", "getEditEffectModelApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectModelApiComponent;", 0)};
        LLLLIIIILLL = new Object() { // from class: X.0EPj
        };
        LLLLIILL = 8;
        C1446930nkx.LIZIZ("tiktok_effect", new C356630DyX());
    }

    private final void J8() {
        i3(new AwS584S0100000_5(this, 89));
        r8(this, false, true, null, -1);
        L6().LJFF.setValue(new C1452730nuJ(3, 0L, null));
        F4(this, 0);
    }

    private final InterfaceC362610EJn K6() {
        return (InterfaceC362610EJn) this.LLLIIL.getValue();
    }

    private final InterfaceC559500Lwy M5() {
        return (InterfaceC559500Lwy) this.LLJJJIL.getValue(this, LLLLIIL[3]);
    }

    private final InterfaceC364140EPk N5() {
        return (InterfaceC364140EPk) this.LLJZIJLIL.getValue(this, LLLLIIL[9]);
    }

    private final C0EPV N6() {
        return (C0EPV) this.LLLIILIL.getValue();
    }

    private final C1439740nZM P6() {
        return (C1439740nZM) this.LLJJJ.getValue(this, LLLLIIL[2]);
    }

    private final C1451630nsX R5() {
        return (C1451630nsX) this.LLJZ.getValue(this, LLLLIIL[8]);
    }

    private final C364240EPu S5() {
        return (C364240EPu) this.LLL.getValue();
    }

    private final C0EQY S6() {
        return (C0EQY) this.LLJJJJJIL.getValue(this, LLLLIIL[5]);
    }

    private final SafeHandler b1() {
        return (SafeHandler) this.LLLIIIL.getValue();
    }

    private final InterfaceC19530111b1 m6() {
        return (InterfaceC19530111b1) this.LLJL.getValue(this, LLLLIIL[6]);
    }

    private final void n9() {
        StickerChallenge stickerChallengeLIZ;
        HashMap<String, AVChallenge> stickerToChallenge;
        AVChallenge aVChallenge;
        List<AVChallenge> editEffectStickerChallengeList;
        ArrayList arrayList = new ArrayList();
        C1439740nZM c1439740nZMP6 = P6();
        if (c1439740nZMP6 != null && (editEffectStickerChallengeList = c1439740nZMP6.LIZ().getEditEffectStickerChallengeList()) != null) {
            for (AVChallenge aVChallenge2 : editEffectStickerChallengeList) {
                C1439740nZM c1439740nZMP62 = P6();
                if (c1439740nZMP62 != null) {
                    c1439740nZMP62.LIZJ(aVChallenge2.cid);
                }
            }
        }
        for (EffectPointModel effectPointModel : getEditModel().getEffectList()) {
            if (C123100dR.LIZ(effectPointModel.getChallenge())) {
                C1439740nZM c1439740nZMP63 = P6();
                if (c1439740nZMP63 == null || (stickerChallengeLIZ = c1439740nZMP63.LIZ()) == null || (stickerToChallenge = stickerChallengeLIZ.getStickerToChallenge()) == null || (aVChallenge = stickerToChallenge.get(effectPointModel.getChallenge())) == null) {
                    C1439740nZM c1439740nZMP64 = P6();
                    if (c1439740nZMP64 != null) {
                        String challenge = effectPointModel.getChallenge();
                        new C1645820svk(challenge, this).LIZ(new C364060EPc(c1439740nZMP64, challenge));
                    }
                } else {
                    arrayList.add(aVChallenge);
                }
            }
        }
        C1439740nZM c1439740nZMP65 = P6();
        if (c1439740nZMP65 != null) {
            c1439740nZMP65.LIZ().setEditEffectStickerChallengeList(arrayList);
        }
    }

    private final void t5() {
        ArrayList arrayList = new ArrayList();
        for (EffectPointModel effectPointModel : getEditModel().creativeModel.editEffectModel.effectList) {
            if (C123100dR.LIZ(effectPointModel.getKey())) {
                arrayList.add(effectPointModel.getKey());
            }
        }
        v5(arrayList, true);
    }

    public final C379400EuA E5() {
        return (C379400EuA) this.LLLF.getValue();
    }

    public final NLEEditor J6() {
        return (NLEEditor) this.LLJJL.getValue();
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJLLL.getValue(this, LLLLIIL[7]);
    }

    public final C0EPY L6() {
        return (C0EPY) this.LLLFF.getValue();
    }

    @Override // X.InterfaceC1455500nym
    public void Qh() {
        i3(AFwS234S0000000_5.get$arr$(50));
    }

    public final C356830Dyr U5() {
        return (C356830Dyr) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final EditEffectVideoModel d6() {
        return (EditEffectVideoModel) this.LLLFFI.getValue();
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLJJIJIIJIL.getValue(this, LLLLIIL[0]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJIJIL.getValue(this, LLLLIIL[1]);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        i3(AFwS234S0000000_5.get$arr$(52));
        super.hide();
        J6().removeConsumer(this.LLLJ);
        J6().setBranchListener(null);
        InterfaceC524950KiL interfaceC524950KiLD5 = D5();
        if (interfaceC524950KiLD5 != null) {
            interfaceC524950KiLD5.b8(K6());
        }
        C0EPY c0epyL6 = L6();
        boolean z = !C351220Dpo.LJJIJLIJ(J6().getModel()).isEmpty();
        InterfaceC1446740nke interfaceC1446740nke = c0epyL6.LIZIZ;
        int iLIZ = C1388580mEq.LIZ(R.attr.e1, c0epyL6.LIZ);
        int iLIZJ = ((int) C12ES.LIZJ(44.0f, c0epyL6.LIZ)) + ScreenUtils.getStatusBarHeight(c0epyL6.LIZ);
        int iLIZJ2 = (int) C12ES.LIZJ(c0epyL6.LJIIIZ, c0epyL6.LIZ);
        int iLIZ2 = c0epyL6.LIZ();
        c0.LIZ.n2();
        C1453160nv0 c1453160nv0LIZ = C1453170nv1.LIZ(iLIZ, iLIZJ, iLIZJ2, iLIZ2);
        c1453160nv0LIZ.LJIIL = new AwS123S0110000_5(c0epyL6, z, 0);
        interfaceC1446740nke.aM0(c1453160nv0LIZ);
        C1456140nzo.LIZIZ(c0epyL6.LIZIZ, true, false, false, false, 12);
        i3(AFwS234S0000000_5.get$arr$(54));
        boolean zLJFF = C356600DyU.LJFF(J6().getModel());
        if (N5() != null) {
            InterfaceC364140EPk interfaceC364140EPkN5 = N5();
            if (interfaceC364140EPkN5 != null) {
                interfaceC364140EPkN5.sI1(zLJFF);
            }
        } else {
            getEditModel().creativeModel.editEffectModel.hasClippedEffect = zLJFF;
        }
        C1451630nsX c1451630nsXR5 = R5();
        if (c1451630nsXR5 != null) {
            c1451630nsXR5.LIZIZ(AFwS234S0000000_5.get$arr$(55));
        }
        InterfaceC19530111b1 interfaceC19530111b1M6 = m6();
        if (interfaceC19530111b1M6 != null) {
            C1419240n2I.LIZ(interfaceC19530111b1M6, false, false, false, null, false, 30);
        }
        if (!getEditModel().creativeModel.imageEditModel.isVideoChildPageFromImage || (!C351220Dpo.LJJIJLIJ(J6().getModel()).isEmpty())) {
            InterfaceC1415760mwg interfaceC1415760mwgU6 = u6();
            if (interfaceC1415760mwgU6 != null) {
                interfaceC1415760mwgU6.be(true);
            }
            C0EQY c0eqyS6 = S6();
            if (c0eqyS6 != null) {
                c0eqyS6.be(true);
            }
        }
    }

    @Override // X.InterfaceC1455500nym
    public void mR0() {
        i3(AFwS234S0000000_5.get$arr$(51));
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        if (this.LLLLII) {
            i3(new AwS584S0100000_5(this, 77));
        } else if (getEditModel().isMultiVideoEdit()) {
            C118300cf c118300cf = new C118300cf();
            InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJJJLIIL;
            if (interfaceC1452170ntP == null) {
                interfaceC1452170ntP = null;
            }
            c118300cf.element = interfaceC1452170ntP.ng();
            i3(new AwS584S0100000_5(c118300cf, 79));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show duration: ");
            sbLIZ.append(c118300cf.element);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C356830Dyr c356830DyrU5 = U5();
        for (NLETrack nLETrack : C348520DlS.LIZIZ(c356830DyrU5.LJIIJJI())) {
            if (nLETrack.getSlots().isEmpty()) {
                c356830DyrU5.LJIIJJI().removeTrack(nLETrack);
            }
        }
        J6().commit();
        getEditModel().setNleModel(NLEModel.dynamicCast(J6().getModel().deepClone()));
        if (x5()) {
            this.LLJLIL = NLEModel.dynamicCast(J6().getModel().deepClone());
        } else {
            this.LLJLIL = null;
        }
        J6().done();
        J6().trim(0L, 0L);
        J6().addConsumer(this.LLLJ);
        J6().setBranchListener(this.LLLJIL);
        u7();
        J8();
        Qh();
        InterfaceC524950KiL interfaceC524950KiLD5 = D5();
        if (interfaceC524950KiLD5 != null) {
            interfaceC524950KiLD5.kF(K6());
        }
        C0EPY c0epyL6 = L6();
        InterfaceC1446740nke interfaceC1446740nke = c0epyL6.LIZIZ;
        int iLIZ = C1388580mEq.LIZ(R.attr.e1, c0epyL6.LIZ);
        int iLIZJ = ((int) C12ES.LIZJ(44.0f, c0epyL6.LIZ)) + ScreenUtils.getStatusBarHeight(c0epyL6.LIZ);
        int iLIZJ2 = (int) C12ES.LIZJ(c0epyL6.LJIIIZ, c0epyL6.LIZ);
        int iLIZ2 = c0epyL6.LIZ();
        c0.LIZ.n2();
        C1453160nv0 c1453160nv0LIZIZ = C1453170nv1.LIZIZ(iLIZ, iLIZJ, iLIZJ2, iLIZ2, false, false, 1984);
        c1453160nv0LIZIZ.LJIIL = AFwS191S0000000_5.get$arr$(54);
        c1453160nv0LIZIZ.LJIIJJI = AFwS191S0000000_5.get$arr$(55);
        interfaceC1446740nke.aM0(c1453160nv0LIZIZ);
        i3(AFwS234S0000000_5.get$arr$(42));
        C1451630nsX c1451630nsXR5 = R5();
        if (c1451630nsXR5 != null) {
            c1451630nsXR5.LIZIZ(AFwS234S0000000_5.get$arr$(43));
        }
        InterfaceC19530111b1 interfaceC19530111b1M6 = m6();
        if (interfaceC19530111b1M6 != null) {
            C1419240n2I.LIZ(interfaceC19530111b1M6, true, false, false, null, false, 30);
        }
        s7();
    }

    public final InterfaceC1415760mwg u6() {
        return (InterfaceC1415760mwg) this.LLJJJJ.getValue(this, LLLLIIL[4]);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01eb  */
    @Override // X.InterfaceC1455500nym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void xx() {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EPT.xx():void");
    }

    public final void y8() {
        C15O7<Boolean> c15o7Prepare;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJJJLIIL;
        if (interfaceC1452170ntP == null) {
            interfaceC1452170ntP = null;
        }
        Rect rectLLJLLIL = interfaceC1452170ntP.LLJLLIL();
        C0EPV c0epvN6 = N6();
        AwS406S0200000_5 awS406S0200000_5 = new AwS406S0200000_5(rectLLJLLIL, this, 13);
        AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 80);
        AbstractC364180EPo abstractC364180EPo = c0epvN6.LIZLLL;
        if (abstractC364180EPo != null) {
            if (Intrinsics.LJFF(Boolean.valueOf(abstractC364180EPo.LIZ()), Boolean.TRUE)) {
                awS406S0200000_5.invoke();
                return;
            }
            AbstractC364180EPo abstractC364180EPo2 = c0epvN6.LIZLLL;
            if (abstractC364180EPo2 == null || !abstractC364180EPo2.LIZIZ) {
                c0epvN6.LJII = awS549S0100000_5;
                if (abstractC364180EPo2 == null || (c15o7Prepare = abstractC364180EPo2.prepare()) == null) {
                    return;
                }
                c15o7Prepare.LJ(new C0FXD(c0epvN6, awS406S0200000_5, awS549S0100000_5, 0), C15O7.LJIIIIZZ, null);
            }
        }
    }

    private final InterfaceC524950KiL D5() {
        InterfaceC524950KiL interfaceC524950KiL = (InterfaceC524950KiL) getDiContainer().LJIIL(null, InterfaceC524950KiL.class);
        return interfaceC524950KiL == null ? C0MWZ.LIZ(this.LLJILLL) : interfaceC524950KiL;
    }

    private final void Xi() {
        JY0().sc1().observe(this, new AObjectS240S0100000_5(this, 11));
        ((LiveData) d6().LLJJIJIL.getValue()).observe(this, new AObserverS209S0100000_5(this, 3));
    }

    private final boolean Z4() {
        NLETrackSlot nLETrackSlot;
        C364110EPh c364110EPh = T2().LJI;
        long jLIZIZ = ((long) C814420VxA.LIZIZ((c364110EPh != null ? c364110EPh.LIZ : 0.0f) * T2().LJII)) * 1000;
        C375830EoP<NLETrackSlot> c375830EoP = T2().LJIIIZ;
        return c375830EoP != null && (nLETrackSlot = c375830EoP.LIZ) != null && jLIZIZ >= nLETrackSlot.getStartTime() && jLIZIZ <= nLETrackSlot.getEndTime();
    }

    private final void s7() {
        this.LLJLLIL = System.currentTimeMillis();
        getEditModel().creativeModel.mixEditingModel.effectMobParamsList.clear();
        for (EffectPointModel effectPointModel : getEditModel().creativeModel.editEffectModel.effectList) {
            List<EffectMobParams> list = getEditModel().creativeModel.mixEditingModel.effectMobParamsList;
            C0FPZ.LIZ.getClass();
            String key = effectPointModel.getKey();
            String str = "";
            if (key == null) {
                key = "";
            }
            String entrancePoint = effectPointModel.getEntrancePoint();
            if (entrancePoint == null) {
                entrancePoint = "";
            }
            String resourceId = effectPointModel.getResourceId();
            if (resourceId == null) {
                resourceId = "";
            }
            int index = effectPointModel.getIndex();
            boolean zBooleanValue = effectPointModel.getIsFromEditPro().booleanValue();
            boolean z = C1403700mdE.LIZJ(effectPointModel.getExtra()).length() > 0;
            String category = effectPointModel.getCategory();
            if (category != null) {
                str = category;
            }
            int i = 1280;
            list.add(new EffectMobParams(index, i, 0L, entrancePoint, key, resourceId, "", str, C1403700mdE.LIZJ(effectPointModel.getExtra()), zBooleanValue, z));
        }
    }

    private final void u7() {
        AbstractC364180EPo c574840Mgc;
        C0EPV c0epvN6 = N6();
        InterfaceC1452170ntP interfaceC1452170ntP = c0epvN6.LJ;
        if (interfaceC1452170ntP == null || c0epvN6.LIZLLL != null) {
            return;
        }
        if (c0epvN6.LIZIZ.isMultiVideoEdit()) {
            MultiEditVideoStatusRecordData multiEditVideoRecordData = c0epvN6.LIZIZ.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            c574840Mgc = new C574880Mgg(interfaceC1452170ntP, multiEditVideoRecordData.curMultiEditVideoRecordData, c0epvN6.LIZIZ.getPreviewInfo(), c0epvN6.LIZJ);
        } else {
            c574840Mgc = new C574840Mgc(interfaceC1452170ntP, c0epvN6.LIZIZ.getPreviewInfo());
        }
        c574840Mgc.LIZLLL = new AwS584S0100000_5(c0epvN6, 71);
        c0epvN6.LIZLLL = c574840Mgc;
    }

    private final boolean y7() {
        C364270EPx c364270EPx = T2().LJIIZILJ;
        return Intrinsics.LJFF("trick_effects", c364270EPx != null ? c364270EPx.LIZIZ : null);
    }

    @Override // X.InterfaceC1455500nym
    public void Fq() {
        AbstractC364180EPo abstractC364180EPo = N6().LIZLLL;
        if (abstractC364180EPo != null) {
            abstractC364180EPo.LIZIZ();
        }
    }

    public final long H5() {
        VecNLETrackSlotSPtr slots;
        if (getEditModel().isMvThemeVideoType()) {
            InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJJJLIIL;
            if (interfaceC1452170ntP == null) {
                interfaceC1452170ntP = null;
            }
            return ((long) interfaceC1452170ntP.mo51if()) * 1000;
        }
        NLETrack mainTrack = J6().getModel().getMainTrack();
        long endTime = 0;
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : slots) {
                endTime += nLETrackSlot.getEndTime() - nLETrackSlot.getStartTime();
            }
        }
        return endTime;
    }

    public final boolean I7() {
        C364270EPx c364270EPx = T2().LJIIZILJ;
        return C113I.LIZLLL(c364270EPx != null ? c364270EPx.LIZIZ : null);
    }

    @Override // X.InterfaceC1455500nym
    public void YI() {
        getEditModel().getEffectList().clear();
        U5().LJ();
    }

    public final void Z7() {
        if (!J6().canUndo()) {
            hide();
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(getActivity());
        c1397580mTM.LIZ(C296180BjE.LIZ() ? 2131830677 : 2131832366);
        C985403tE.LIZ(c1397580mTM, new AwS584S0100000_5(this, 73));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final void d7() {
        xx();
        hide();
        InterfaceC559500Lwy interfaceC559500LwyM5 = M5();
        if (interfaceC559500LwyM5 != null) {
            interfaceC559500LwyM5.Qk(false);
        }
        C1413450msx c1413450msx = C1413450msx.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        AwS584S0100000_5 awS584S0100000_5 = new AwS584S0100000_5(this, 88);
        c1413450msx.getClass();
        C1413450msx.LJIILJJIL(editModel, awS584S0100000_5);
    }

    public final void j9() {
        k5();
        i3(AFwS234S0000000_5.get$arr$(46));
    }

    public final void k5() {
        Boolean first = T2().LJIILLIIL.getFirst();
        if (first != null) {
            boolean zBooleanValue = first.booleanValue();
            if (T2().LJIILLIIL.getSecond().booleanValue()) {
                U5().LJI((zBooleanValue ? C0E1V.ADD_VIDEO_EFFECT : C0E1V.REPLACE_VIDEO_EFFECT).getNameId(), EnumC356070Dxd.DONE);
                i3(AFwS234S0000000_5.get$arr$(49));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Type inference failed for: r0v31, types: [T, com.bytedance.ies.nle.editor_jni.NLENode] */
    @Override // ge.i, X.AbstractC2255721DQs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EPT.onCreate():void");
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        C364210EPr.LIZ(this.LLJLILLLLZIIL);
    }

    @Override // X.InterfaceC1455500nym
    public void rF1() {
        ArrayList<EffectPointModel> effectList = getEditModel().getEffectList();
        ArrayList arrayList = new ArrayList();
        for (EffectPointModel effectPointModel : effectList) {
            if (effectPointModel.isMagic()) {
                arrayList.add(effectPointModel);
            }
        }
        d5(arrayList);
        W6(effectList);
        C5(effectList);
        if (C2550609z6.LIZ) {
            n9();
        }
    }

    public final boolean x5() {
        return getEditModel().creativeModel.imageEditModel.needToKeepEdit && getEditModel().creativeModel.imageEditModel.isVideoChildPageFromImage;
    }

    @Override // ge.i
    public Function0<C365100ETc> E3() {
        return this.LLLIZZ;
    }

    @Override // X.InterfaceC1455500nym
    public LiveEvent<Unit> Qx() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1455500nym
    public C385670FAf<Integer> Wk1() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1455500nym
    public LiveEvent<Unit> iT() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C364260EPw> o2() {
        return this.LLLILZ;
    }

    @Override // X.InterfaceC1455500nym
    public LiveEvent<Integer> rK1() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EPQ> w2() {
        return this.LLLILZJ;
    }

    private final void C5(List<? extends EffectPointModel> list) {
        EffectPointModel next;
        for (EffectPointModel effectPointModel : list) {
            String selectFrom = effectPointModel.getSelectFrom();
            if (selectFrom == null || selectFrom.length() == 0) {
                effectPointModel.setSelectFrom(getEditModel().mShootWay);
                effectPointModel.setIndex(-1);
                effectPointModel.setEntrancePoint("null");
            }
            if (C123100dR.LIZ(effectPointModel.getChallenge())) {
                Iterator<? extends EffectPointModel> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.getKey(), effectPointModel.getKey())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                EffectPointModel effectPointModel2 = next;
                if (effectPointModel2 != null) {
                    effectPointModel2.setChallenge(effectPointModel.getChallenge());
                }
            }
        }
    }

    private final void L1(int i) {
        C19EG activity = getActivity();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(i);
        creativeToastBuilder.duration(4000L);
        creativeToastBuilder.isTuxToast(true);
        C1390380mHk.LIZ(activity, 3010, creativeToastBuilder);
    }

    private final void W6(ArrayList<EffectPointModel> arrayList) {
        EffectPointModel effectPointModel;
        EffectPointModel next;
        Iterator<EffectPointModel> it2 = getEditModel().getEffectList().iterator();
        while (true) {
            effectPointModel = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (C123100dR.LIZ(next.musicId)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EffectPointModel effectPointModel2 = next;
        if (effectPointModel2 == null) {
            return;
        }
        Iterator<EffectPointModel> it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            EffectPointModel next2 = it3.next();
            if (Intrinsics.LJFF(next2.getKey(), effectPointModel2.getKey())) {
                effectPointModel = next2;
                break;
            }
        }
        EffectPointModel effectPointModel3 = effectPointModel;
        if (effectPointModel3 != null) {
            effectPointModel3.musicId = effectPointModel2.musicId;
            return;
        }
        InterfaceC1415760mwg interfaceC1415760mwgU6 = u6();
        if (interfaceC1415760mwgU6 == null) {
            return;
        }
        interfaceC1415760mwgU6.W82(effectPointModel2.musicId, "from_effect_panel");
    }

    private final void a9(boolean z) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLLI < 3000) {
            return;
        }
        this.LLLI = jCurrentTimeMillis;
        if (z) {
            string = getActivity().getString(2131857946, Float.valueOf(this.LLLIL.LJIILL / 1000.0f));
        } else {
            string = getActivity().getString(2131833401);
        }
        C19EG activity = getActivity();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(string);
        C1390380mHk.LIZ(activity, 3010, creativeToastBuilder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        v5(X.C1697810uHb.LJIILJJIL(((com.ss.android.ugc.aweme.effect.EffectPointModel) com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, 0)).getKey()), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d5(java.util.List<? extends com.ss.android.ugc.aweme.effect.EffectPointModel> r9) {
        /*
            r8 = this;
            int r0 = r9.size()
            r7 = 1
            if (r0 != r7) goto L61
            r6 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r6)
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = (com.ss.android.ugc.aweme.effect.EffectPointModel) r0
            java.lang.String r1 = r0.getCategory()
            java.lang.String r0 = ""
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L61
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.getEditModel()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel r0 = r0.editEffectModel
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r0.defaultEffectList
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
        L29:
            boolean r0 = r5.hasNext()
            r3 = -1
            if (r0 == 0) goto L4c
            java.lang.Object r2 = r5.next()
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r6)
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = (com.ss.android.ugc.aweme.effect.EffectPointModel) r0
            java.lang.String r1 = r0.getResourceId()
            java.lang.String r0 = r2.getResourceId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L62
            if (r4 != r3) goto L61
        L4c:
            java.lang.String[] r1 = new java.lang.String[r7]
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r6)
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = (com.ss.android.ugc.aweme.effect.EffectPointModel) r0
            java.lang.String r0 = r0.getKey()
            r1[r6] = r0
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r1)
            r8.v5(r0, r6)
        L61:
            return
        L62:
            int r4 = r4 + 1
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EPT.d5(java.util.List):void");
    }

    public static final void d8(C0EPT c0ept) {
        c0ept.U5().LJJII(new AwS549S0100000_5(c0ept, 76));
        c0ept.i3(new AwS584S0100000_5(c0ept, 76));
        c0ept.Qh();
        c0ept.i3(new AwS584S0100000_5(c0ept, 78));
        c0ept.hide();
    }

    private final boolean k7(EffectModel effectModel) {
        if (effectModel.isServerOrCombinedEffect().booleanValue()) {
            L1(2131833291);
            return false;
        }
        if (!effectModel.isClientEffect().booleanValue()) {
            return false;
        }
        L1(2131833292);
        return false;
    }

    private final void n5(EffectModel effectModel) {
        String str;
        List listLJJLIIIJILLIZJL;
        String[] strArr;
        StickerChallenge stickerChallengeLIZ;
        HashMap<String, AVChallenge> stickerToChallenge;
        C1439740nZM c1439740nZMP6;
        if (C2550609z6.LIZ && (str = effectModel.challenge) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null && (strArr = (String[]) listLJJLIIIJILLIZJL.toArray(new String[0])) != null) {
            for (String str2 : strArr) {
                C1439740nZM c1439740nZMP62 = P6();
                if (c1439740nZMP62 != null && (stickerChallengeLIZ = c1439740nZMP62.LIZ()) != null && (stickerToChallenge = stickerChallengeLIZ.getStickerToChallenge()) != null && !stickerToChallenge.containsKey(str2) && (c1439740nZMP6 = P6()) != null) {
                    new C1645820svk(str2, this).LIZ(new C364060EPc(c1439740nZMP6, str2));
                }
            }
        }
    }

    public final Boolean L7(Effect effect) {
        boolean z;
        String extra = effect.getExtra();
        if (extra == null) {
            return Boolean.FALSE;
        }
        boolean z2 = false;
        if (extra.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Boolean.FALSE;
        }
        try {
            C1446130njf.LIZ.getClass();
            String strLJFF = C1446130njf.LJFF(effect, "game_play_type");
            if (Intrinsics.LJFF(strLJFF, EnumC1429610nJ1.EDIT_EFFECT_SERVER.getType()) || Intrinsics.LJFF(strLJFF, EnumC1429610nJ1.EDIT_EFFECT_COMBINED.getType())) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isServerEffect :: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LIZIZ("Editing Effect", C2188811AlT.LIZIZ(sbLIZ));
            return Boolean.FALSE;
        }
    }

    @Override // X.InterfaceC1455500nym
    public void LLLL(int i) {
        C118300cf c118300cf = new C118300cf();
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJJJLIIL;
        if (interfaceC1452170ntP == null) {
            interfaceC1452170ntP = null;
        }
        c118300cf.element = interfaceC1452170ntP.ng();
        i3(new AwS584S0100000_5(c118300cf, 75));
        Fq();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r6.add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.effect.EffectPointModel> P8(java.util.List<com.ss.android.ugc.aweme.effect.EffectPointModel> r8) {
        /*
            r7 = this;
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r8.iterator()
        L9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.aweme.effect.EffectPointModel r4 = (com.ss.android.ugc.aweme.effect.EffectPointModel) r4
            java.util.Iterator r3 = r6.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = (com.ss.android.ugc.aweme.effect.EffectPointModel) r0
            java.lang.String r1 = r0.getKey()
            java.lang.String r0 = r4.getKey()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L19
            if (r2 != 0) goto L9
        L36:
            r6.add(r4)
            goto L9
        L3a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EPT.P8(java.util.List):java.util.List");
    }

    public final boolean T8(VideoPublishEditModel videoPublishEditModel) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "editing_effect_auto_apply_first_effect", true, false)) {
            return false;
        }
        return !Intrinsics.LJFF(C1416310mxZ.LJJIJIIJI(videoPublishEditModel, null, false), C1412630mrd.LIZLLL(EnumC1412640mre.AUTO_PICK_TEMPLATE));
    }

    @Override // X.InterfaceC1455500nym
    public void Tj(int i) {
        C356830Dyr c356830DyrU5 = U5();
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJJJLIIL;
        if (interfaceC1452170ntP == null) {
            interfaceC1452170ntP = null;
        }
        c356830DyrU5.LJJIII(((long) interfaceC1452170ntP.mo51if()) * 1000, true);
        xx();
    }

    public final boolean W7(String str) {
        if (!TextUtils.equals(str, "ugc_template") && !TextUtils.equals(str, "pugc_template")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1455500nym
    public void aH(boolean z) {
        getEditModel().setTimeEffect(null);
        C356830Dyr c356830DyrU5 = U5();
        c356830DyrU5.LIZJ.setValue(C1452720nuI.LJI());
        if (z) {
            C385050F7v.LJ(c356830DyrU5.LIZ);
        }
        Fq();
        i3(AFwS234S0000000_5.get$arr$(53));
    }

    public final boolean p8(int i) {
        Integer num = T2().LJIIJJI;
        if (num != null && num.intValue() == i) {
            return false;
        }
        C19558011fW c19558011fW = C19558011fW.LIZ;
        int i2 = T2().LJII;
        c19558011fW.getClass();
        if (C19558011fW.LIZLLL(i2, i)) {
            C19EG activity = getActivity();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131833535);
            C1390380mHk.LIZ(activity, 3010, creativeToastBuilder);
            return false;
        }
        return z8(i);
    }

    public final boolean z8(int i) {
        boolean z;
        Boolean boolValueOf;
        String nameId;
        NLETrackSlot slotByIndex;
        Integer num = T2().LJIIJJI;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJJJLIIL;
        if (interfaceC1452170ntP == null) {
            interfaceC1452170ntP = null;
        }
        Rect rectLLJLLIL = interfaceC1452170ntP.LLJLLIL();
        int i2 = 3;
        if (i != 1) {
            if (i == 2 || i == 3) {
                C364110EPh c364110EPh = T2().LJI;
                if (c364110EPh == null) {
                    return false;
                }
                int i3 = (int) (c364110EPh.LIZ * T2().LJII);
                if (T2().LJII - i3 < this.LLLIL.LJIILL) {
                    a9(true);
                    return false;
                }
                i3(new AwS20S0001000_5(i, 2));
                U5().LIZLLL(i, new Pair<>(Long.valueOf(i3), Long.valueOf(i3 + Math.min(r9, Math.max(this.LLLIL.LJIILL, T2().LJII / 5)))));
            }
        } else {
            AbstractC364180EPo abstractC364180EPo = N6().LIZLLL;
            if (abstractC364180EPo != null) {
                boolValueOf = Boolean.valueOf(abstractC364180EPo.LIZ());
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                i3(new AwS20S0001000_5(i, 1));
                U5().LIZLLL(i, null);
            } else {
                this.LLLFZ = new Pair<>(String.valueOf(i), "time");
                C0EPV c0epvN6 = N6();
                C19EG activity = getActivity();
                SafeHandler safeHandlerB1 = b1();
                c0epvN6.getClass();
                ProgressDialogC1397790mTh progressDialogC1397790mThLIZIZ = ProgressDialogC1397790mTh.LIZIZ(activity, activity.getString(R.string.txr));
                ACListenerS140S0100000_5 aCListenerS140S0100000_5 = new ACListenerS140S0100000_5(c0epvN6, 5);
                TuxIconView tuxIconView = (TuxIconView) progressDialogC1397790mThLIZIZ.findViewById(R.id.jz7);
                if (tuxIconView != null) {
                    C786410Ut5.a9(tuxIconView, aCListenerS140S0100000_5);
                }
                safeHandlerB1.postDelayed(new ARunnableS105S0100000_5(progressDialogC1397790mThLIZIZ, 13), Mp4ScreenVideoLoadTimeout.CONTROL);
                C0CNO.LIZLLL(0L, new AwS145S0101000_5(c0epvN6, 0, 1));
                c0epvN6.LJFF = progressDialogC1397790mThLIZIZ;
                y8();
                return false;
            }
        }
        L6().LIZIZ(rectLLJLLIL);
        C356830Dyr c356830DyrU5 = U5();
        EnumC356070Dxd enumC356070Dxd = EnumC356070Dxd.DONE;
        IntRange intRange = new IntRange(1, 3);
        if (num != null && intRange.LJLJL(num.intValue())) {
            nameId = C0E1V.REPLACE_VIDEO_EFFECT.getNameId();
        } else {
            nameId = C0E1V.ADD_VIDEO_EFFECT.getNameId();
        }
        c356830DyrU5.LJI(nameId, enumC356070Dxd);
        NLETrack nLETrackLIZLLL = C348520DlS.LIZLLL(J6().getModel());
        if (nLETrackLIZLLL == null || (slotByIndex = nLETrackLIZLLL.getSlotByIndex(0)) == null) {
            return false;
        }
        C356830Dyr c356830DyrU52 = U5();
        NLEModel model = J6().getModel();
        c356830DyrU52.getClass();
        slotByIndex.setExtra("nleExtraEffectTIME", String.valueOf(C356830Dyr.LJIILL(model)));
        i3(new AwS584S0100000_5(slotByIndex, 87));
        if (z) {
            L6().LJFF.setValue(new C1452730nuJ(3, 0L, null));
            r8(this, true, true, null, -1);
            return true;
        }
        if (i != 2) {
            i2 = -1;
        }
        long startTime = slotByIndex.getStartTime();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        r8(this, true, true, new Pair(Long.valueOf(startTime / j), Long.valueOf((slotByIndex.getEndTime() / j) - 1)), i2);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [X.0EPU] */
    /* JADX WARN: Type inference failed for: r0v55, types: [X.0EGg] */
    public C0EPT(C1DRG c1drg, C19A3 c19a3) {
        float f;
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c19a3;
        this.LLJJ = new h0(null);
        this.LLJJI = new C560530Lyd();
        this.LLJJIII = new C560530Lyd();
        this.LLJJIJI = new C560530Lyd();
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), C1439740nZM.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1415760mwg.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EQY.class, null);
        this.LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 88));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 82));
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19530111b1.class, null);
        this.LLJLLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJZ = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC364140EPk.class, null);
        this.LLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(53));
        this.LLLF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 78));
        this.LLLFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 81));
        this.LLLFFI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 83));
        this.LLLIIII = new ArrayList();
        this.LLLIIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 85));
        this.LLLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 77));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 84));
        if (C1415610mwR.LIZIZ() > C390810FTz.LIZ(360.0f)) {
            f = 28.0f;
        } else {
            f = 20.0f;
        }
        this.LLLIL = new C365260ETs(C390810FTz.LIZ(f));
        this.LLLILZ = new AwS549S0100000_5(this, 79);
        this.LLLILZJ = new AwS549S0100000_5(this, 86);
        this.LLLIZZ = new AwS549S0100000_5(this, 87);
        this.LLLJ = new C354000DuI() { // from class: X.0Dz7
            @Override // X.C354000DuI
            public final void LIZ() {
                C524780Ki4.LIZ.recordSingleValuePerfLog("tool_performance_record_edit_effect_apply", new AwS549S0100000_5(this.LIZ, 89));
                Pair<String, String> pair = this.LIZ.LLLFZ;
                if (!Intrinsics.LJFF(pair != null ? pair.getSecond() : null, "time")) {
                    this.LIZ.LLLFZ = null;
                }
                C0FPZ c0fpz = C0FPZ.LIZ;
                VideoPublishEditModel editModel = this.LIZ.getEditModel();
                InterfaceC1446740nke interfaceC1446740nkeJY0 = this.LIZ.JY0();
                c0fpz.getClass();
                C0FPZ.LIZIZ(editModel, interfaceC1446740nkeJY0);
                if (Intrinsics.LJFF(this.LIZ.T2().LJIIZILJ.LIZIZ, "")) {
                    return;
                }
                if (!this.LIZ.I7()) {
                    C0EPT c0ept = this.LIZ;
                    c0ept.i3(new AwS584S0100000_5(c0ept, 91));
                    return;
                }
                C356830Dyr c356830DyrU5 = this.LIZ.U5();
                NLETrack nLETrackLIZLLL = C348520DlS.LIZLLL(c356830DyrU5.LIZ.getModel());
                if (nLETrackLIZLLL != null && nLETrackLIZLLL.getSlots().size() == 0) {
                    c356830DyrU5.LIZ.getModel().removeTrack(nLETrackLIZLLL);
                }
                c356830DyrU5.LJI("", EnumC356070Dxd.COMMIT);
                C0EPT c0ept2 = this.LIZ;
                c0ept2.i3(new AwS584S0100000_5(c0ept2, 90));
            }
        };
        this.LLLJIL = new NLEBranchListener() { // from class: X.0Dz8
            @Override // com.bytedance.ies.nle.editor_jni.NLEBranchListener
            public final void onChanged() {
                C0EPT c0ept = this.LIZ;
                c0ept.i3(new AwS584S0100000_5(c0ept, 82));
            }
        };
        this.LLLJL = new InterfaceC365270ETt() { // from class: X.0EPU
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v25, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v37, types: [T, java.lang.Object] */
            @Override // X.InterfaceC365270ETt
            public final void LIZJ(NLETrackSlot nLETrackSlot) {
                if (nLETrackSlot == null) {
                    this.LIZ.j9();
                    return;
                }
                C0EPT.r8(this.LIZ, false, true, null, -1);
                float startTime = (nLETrackSlot.getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / this.LIZ.T2().LJII;
                InterfaceC1452170ntP interfaceC1452170ntP = this.LIZ.LLJJJJLIIL;
                if (interfaceC1452170ntP == null) {
                    interfaceC1452170ntP = null;
                }
                this.LIZ.i3(new AwS9S0200001_5(interfaceC1452170ntP.LLJLLIL(), nLETrackSlot, startTime, 0));
                this.LIZ.K4(true, null);
                if (!this.LIZ.I7()) {
                    this.LIZ.k5();
                    C259800zU c259800zU = new C259800zU();
                    String str = "";
                    c259800zU.element = "";
                    C259800zU c259800zU2 = new C259800zU();
                    if (C348520DlS.LJIIIIZZ(nLETrackSlot)) {
                        this.LIZ.U5().getClass();
                        String strLJIIZILJ = C356830Dyr.LJIIZILJ(nLETrackSlot, "nleExtraEffectCategory");
                        T t = str;
                        if (strLJIIZILJ != null) {
                            t = strLJIIZILJ;
                        }
                        c259800zU.element = t;
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(nLETrackSlot.getExtra("ep_magic_effect_id"), new String[]{","}, 0, 6);
                        if (listLJJLIIIJILLIZJL != null && !listLJJLIIIJILLIZJL.isEmpty()) {
                            c259800zU2.element = ListProtector.get(listLJJLIIIJILLIZJL, 0);
                        }
                    } else {
                        this.LIZ.U5().getClass();
                        String strLJII = C356830Dyr.LJII(nLETrackSlot);
                        T t2 = strLJII;
                        if (strLJII == null) {
                            t2 = "";
                        }
                        c259800zU.element = t2;
                        this.LIZ.U5().getClass();
                        String strLJIIL = C356830Dyr.LJIIL(nLETrackSlot);
                        T t3 = str;
                        if (strLJIIL != null) {
                            t3 = strLJIIL;
                        }
                        c259800zU2.element = t3;
                        if (nLETrackSlot.hasExtra("ep_anim_res_id")) {
                            c259800zU2.element = nLETrackSlot.getExtra("ep_anim_res_id");
                        }
                    }
                    this.LIZ.i3(new AwS371S0200000_5(c259800zU2, (C259800zU<String>) c259800zU, (C259800zU<String>) 9));
                    String str2 = (String) c259800zU.element;
                    if (str2 != null) {
                        this.LIZ.i3(new AwS56S1000000_5(str2, 2));
                    }
                }
            }

            @Override // X.InterfaceC365270ETt
            public final void LIZLLL(NLETrackSlot nLETrackSlot) {
                long endTime;
                if (C348520DlS.LJII(nLETrackSlot)) {
                    endTime = ((long) C348520DlS.LJ(nLETrackSlot)) * 1000;
                } else {
                    endTime = nLETrackSlot.getEndTime();
                }
                this.LIZ.LLLII = new Pair<>(Long.valueOf(nLETrackSlot.getStartTime()), Long.valueOf(endTime));
                C0EPY c0epyL6 = this.LIZ.L6();
                c0epyL6.LJI = null;
                c0epyL6.LJII = -1;
                C0EPT.r8(this.LIZ, false, false, null, -1);
                this.LIZ.i3(AFwS234S0000000_5.get$arr$(44));
            }

            @Override // X.InterfaceC365270ETt
            public final void LIZ(float f2, boolean z) {
                this.LIZ.i3(new C0EPW(z, f2));
                this.LIZ.K4(z, null);
            }

            @Override // X.InterfaceC365270ETt
            public final void LIZIZ(NLETrackSlot nLETrackSlot, float f2, boolean z, boolean z2) {
                this.LIZ.h8(nLETrackSlot, f2, z, z2);
                this.LIZ.K4(z2, Float.valueOf(f2));
                if (z2) {
                    this.LIZ.i3(new AwS3S0000001_5(f2, 2));
                }
            }
        };
        this.LLLL = new C113D() { // from class: X.0EGg
            @Override // X.C113D
            public final void LIZIZ() {
            }

            @Override // X.C113D
            public final boolean LIZJ(EffectModel effectModel) {
                return false;
            }

            @Override // X.C113D
            public final boolean LJ(int i) {
                return true;
            }

            @Override // X.C113D
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C113D
            public final void LJIIJ(EffectModel effectModel, String str, boolean z, EffectSearchModel effectSearchModel) {
            }

            @Override // X.C113D
            public final void LJIILIIL(String str, boolean z) {
            }

            @Override // X.C113D
            public final void LJIILJJIL(EffectModel effectModel) {
            }

            @Override // X.C113D
            public final void LJIJJLI(String str, List<? extends EffectPointModel> list) {
            }

            @Override // X.C113D
            public final boolean LJJ(EffectModel effectModel) {
                return true;
            }

            @Override // X.C113D
            public final void LIZ() {
                InterfaceC1452170ntP interfaceC1452170ntP = this.LIZ.LLJJJJLIIL;
                if (interfaceC1452170ntP == null) {
                    interfaceC1452170ntP = null;
                }
                this.LIZ.i3(new AwS584S0100000_5(interfaceC1452170ntP.LLJLLIL(), 84));
                C0EPT.r8(this.LIZ, false, true, null, -1);
            }

            @Override // X.C113D
            public final void LJIIIIZZ() {
                this.LIZ.i3(AFwS234S0000000_5.get$arr$(47));
            }

            @Override // X.C113D
            public final void LJIIIZ() {
                C365100ETc c365100ETc = this.LIZ.LLLILZLLLI;
                if (c365100ETc == null) {
                    c365100ETc = null;
                }
                c365100ETc.LLLLLJLJLL();
                this.LIZ.i3(AFwS234S0000000_5.get$arr$(48));
            }

            @Override // X.C113D
            public final boolean LJIIL() {
                return !this.LIZ.LLLIIIIL;
            }

            @Override // X.C113D
            public final void LJIILLIIL() {
                C365100ETc c365100ETc = this.LIZ.LLLILZLLLI;
                if (c365100ETc == null) {
                    c365100ETc = null;
                }
                c365100ETc.LLLLLJLJLL();
            }

            @Override // X.C113D
            public final void LJIIJJI(String str) {
                String str2;
                C364270EPx c364270EPx = this.LIZ.T2().LJIIZILJ;
                if (c364270EPx == null || (str2 = c364270EPx.LIZIZ) == null) {
                    str2 = "";
                }
                this.LIZ.LLLFZ = new Pair<>(str, str2);
            }

            @Override // X.C113D
            public final boolean LJIILL(EffectModel effectModel) {
                return !effectModel.isTrickEffect().booleanValue();
            }

            @Override // X.C113D
            public final void LJIIZILJ(EffectModel effectModel) {
                C365100ETc c365100ETc = this.LIZ.LLLILZLLLI;
                if (c365100ETc == null) {
                    c365100ETc = null;
                }
                String str = effectModel.designerId;
                C0EGS c0egs = new C0EGS(str, effectModel.designerEncryptedId, effectModel.source);
                LinearLayout linearLayout = c365100ETc.LLLIIII;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                C786410Ut5.LJZL(8, linearLayout);
                AnonymousClass0956 anonymousClass0956 = c365100ETc.LLLL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                if (C0EGG.LIZ(c0egs)) {
                    InterfaceC2257101DWa interfaceC2257101DWa = c365100ETc.LLLIILIL.get(str);
                    if (interfaceC2257101DWa != null) {
                        c365100ETc.LLLLLLJ(interfaceC2257101DWa.getAvatarThumb(), interfaceC2257101DWa.getNickname());
                        return;
                    } else {
                        c365100ETc.LLLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c365100ETc), C0PEM.LIZ, null, new C361740EGe(c365100ETc, c0egs, null), 2);
                        return;
                    }
                }
                c365100ETc.LLLLLJLJLL();
            }

            @Override // X.C113D
            public final boolean LJIJ(String str) {
                C0EPT c0ept = this.LIZ;
                C19A3 c19a32 = c0ept.LLJILLL;
                C365100ETc c365100ETc = c0ept.LLLILZLLLI;
                String first = null;
                if (c365100ETc == null) {
                    c365100ETc = null;
                }
                if (!c19a32.isShowing(c365100ETc)) {
                    this.LIZ.LLLFZ = null;
                }
                Pair<String, String> pair = this.LIZ.LLLFZ;
                if (pair != null) {
                    first = pair.getFirst();
                }
                return Intrinsics.LJFF(first, str);
            }

            @Override // X.C113D
            public final void LJIJJ(C364270EPx c364270EPx) {
                String str;
                if (c364270EPx.LIZ >= 0 && !Intrinsics.LJFF(c364270EPx.LIZIZ, "")) {
                    this.LIZ.i3(new AwS584S0100000_5(c364270EPx, 85));
                    C364270EPx c364270EPx2 = this.LIZ.T2().LJIIZILJ;
                    if (c364270EPx2 != null) {
                        str = c364270EPx2.LIZIZ;
                    } else {
                        str = null;
                    }
                    if (C113I.LIZLLL(str)) {
                        this.LIZ.y8();
                        C0EPT c0ept = this.LIZ;
                        c0ept.i3(new AwS584S0100000_5(c0ept, 86));
                    }
                }
            }

            @Override // X.C113D
            public final void LJI(int i, EffectModel effectModel) {
                C1413450msx.LJIIZILJ(C1413450msx.LIZ, this.LIZ.getEditModel(), effectModel.key, effectModel.category, i, false, false, null, Integer.valueOf(effectModel.source), effectModel.designerId, effectModel, null, null, null, new C1413460msy(95, null, null, C1403680mdC.LIZLLL(effectModel)), false, 23616);
            }

            @Override // X.C113D
            public final boolean LJII(int i, int i2) {
                String str;
                InterfaceC1415760mwg interfaceC1415760mwgU6;
                this.LIZ.k5();
                EffectModel effectModel = (EffectModel) ListProtector.get(C0F4X.LJ(), i);
                C364270EPx c364270EPx = this.LIZ.T2().LJIIZILJ;
                if (c364270EPx == null || (str = c364270EPx.LIZIZ) == null) {
                    str = "";
                }
                C1413450msx c1413450msx = C1413450msx.LIZ;
                VideoPublishEditModel editModel = this.LIZ.getEditModel();
                C1413460msy c1413460msy = new C1413460msy(95, null, null, C1403680mdC.LIZLLL(effectModel));
                c1413450msx.getClass();
                C1413450msx.LJIIJ(editModel, effectModel, str, c1413460msy, i2, false, false, "click_icon", "", false);
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_effect_template_mutually_exclusive", true, false) && (interfaceC1415760mwgU6 = this.LIZ.u6()) != null) {
                    interfaceC1415760mwgU6.Rn1(false);
                }
                VideoPublishEditModel editModel2 = this.LIZ.getEditModel();
                C0FPZ.LIZ.getClass();
                editModel2.creativeModel.mixEditingModel.effectMobParamsList.add(C0FPZ.LIZJ(effectModel));
                return this.LIZ.p8(i);
            }

            @Override // X.C113D
            public final List<EffectModel> LJIJI(int i, String str) {
                String extra;
                boolean z;
                ArrayList<EffectPointModel> effectList = this.LIZ.getEditModel().getEffectList();
                ArrayList arrayList = new ArrayList();
                for (EffectPointModel effectPointModel : effectList) {
                    EffectPointModel effectPointModel2 = effectPointModel;
                    C366400EYc.LIZ.getClass();
                    if (!C366400EYc.LIZIZ.LIZ(effectPointModel2.getKey()) && ((extra = effectPointModel2.getExtra()) == null || !a0.LJJIIZI(extra, "video_anim_type", false))) {
                        String category = effectPointModel2.getCategory();
                        if (category != null && category.length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if ((z && Intrinsics.LJFF(str, "trending02")) || Intrinsics.LJFF(effectPointModel2.getCategory(), str) || (Intrinsics.LJFF(str, "trending02") && Intrinsics.LJFF(effectPointModel2.getCategory(), "Favorite"))) {
                            arrayList.add(effectPointModel);
                        }
                    }
                }
                List listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(15), this.LIZ.P8(new ArrayList(arrayList)));
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
                Iterator it2 = listLJLLLL.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(C0EN0.LIZ((EffectPointModel) it2.next()));
                }
                return arrayList2;
            }

            @Override // X.C113D
            public final void LJIL(int i, EffectModel effectModel) {
                this.LIZ.WU0(effectModel, this.LIZ.T2().LJIIZILJ.LIZIZ, i);
            }

            @Override // X.C113D
            public final boolean LIZLLL(EffectModel effectModel, int i, boolean z) {
                String str;
                InterfaceC1415760mwg interfaceC1415760mwgU6;
                C364270EPx c364270EPx = this.LIZ.T2().LJIIZILJ;
                if (c364270EPx == null || (str = c364270EPx.LIZIZ) == null) {
                    str = "";
                }
                EffectSearchModel effectSearchModel = effectModel.searchModel;
                if (effectSearchModel == null || !Intrinsics.LJFF(effectSearchModel.getAppliedFromSearchPanel(), Boolean.TRUE)) {
                    C1413450msx c1413450msx = C1413450msx.LIZ;
                    VideoPublishEditModel editModel = this.LIZ.getEditModel();
                    C1413460msy c1413460msy = new C1413460msy(95, null, null, C1403680mdC.LIZLLL(effectModel));
                    c1413450msx.getClass();
                    C1413450msx.LJIIJ(editModel, effectModel, str, c1413460msy, i, false, false, "click_icon", "", false);
                }
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_effect_template_mutually_exclusive", true, false) && (interfaceC1415760mwgU6 = this.LIZ.u6()) != null) {
                    interfaceC1415760mwgU6.Rn1(false);
                }
                VideoPublishEditModel editModel2 = this.LIZ.getEditModel();
                C0FPZ.LIZ.getClass();
                editModel2.creativeModel.mixEditingModel.effectMobParamsList.add(C0FPZ.LIZJ(effectModel));
                return this.LIZ.KD(effectModel, str, i, z, true);
            }
        };
        Bundle argumentsSafely = ((AbstractC1447660nm8) getDiContainer().LJII(AbstractC214814194y.class, null)).getArgumentsSafely();
        this.LLLLII = C123100dR.LIZ(argumentsSafely != null ? argumentsSafely.getString("extra_edit_effect_uid") : null);
    }

    public static final void F4(C0EPT c0ept, Integer num) {
        int iLLL;
        InterfaceC1452170ntP interfaceC1452170ntP = null;
        if (num != null) {
            iLLL = num.intValue();
        } else {
            InterfaceC1452170ntP interfaceC1452170ntP2 = c0ept.LLJJJJLIIL;
            if (interfaceC1452170ntP2 == null) {
                interfaceC1452170ntP2 = null;
            }
            iLLL = interfaceC1452170ntP2.LLL();
        }
        InterfaceC1452170ntP interfaceC1452170ntP3 = c0ept.LLJJJJLIIL;
        if (interfaceC1452170ntP3 != null) {
            interfaceC1452170ntP = interfaceC1452170ntP3;
        }
        c0ept.i3(new AwS3S0000001_5(interfaceC1452170ntP.mf(iLLL) / c0ept.T2().LJII, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean o8(EffectModel effectModel, boolean z) {
        NLETrackSlot nLETrackSlot;
        boolean z2;
        long j;
        boolean z3;
        boolean z4;
        InterfaceC1452170ntP interfaceC1452170ntP;
        NLETrackSlot nLETrackSlotLIZIZ;
        NLETrackSlot next;
        long jLongValue;
        int layer;
        n5(effectModel);
        C0EPY c0epyL6 = L6();
        c0epyL6.LJFF.setValue(C1452730nuJ.LIZJ());
        ((ValueAnimator) c0epyL6.LJIIIIZZ.getValue()).cancel();
        c0epyL6.LJI = null;
        c0epyL6.LJII = -1;
        C375830EoP<NLETrackSlot> c375830EoP = T2().LJIIIZ;
        if (c375830EoP != null) {
            nLETrackSlot = c375830EoP.LIZ;
        } else {
            nLETrackSlot = null;
        }
        Boolean first = T2().LJIILLIIL.getFirst();
        List<NLETrack> listLJJIJLIJ = C351220Dpo.LJJIJLIJ(J6().getModel());
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = listLJJIJLIJ.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        Boolean boolHasRealDuration = effectModel.hasRealDuration();
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_normal_effect_default_duration_type", true) == 2 && !boolHasRealDuration.booleanValue() && (arrayList.isEmpty() || (Intrinsics.LJFF(first, Boolean.TRUE) && arrayList.size() == 1))) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJLL = System.currentTimeMillis();
        InterfaceC1452170ntP interfaceC1452170ntP2 = this.LLJJJJLIIL;
        if (interfaceC1452170ntP2 == null) {
            interfaceC1452170ntP2 = null;
        }
        Rect rectLLJLLIL = interfaceC1452170ntP2.LLJLLIL();
        long startTime = 0;
        if (nLETrackSlot != null && first != null && Z4() && !C348520DlS.LJIIIIZZ(nLETrackSlot)) {
            if (Intrinsics.LJFF(effectModel.key, C351220Dpo.LJJZ(nLETrackSlot))) {
                return false;
            }
            if (!z2) {
                startTime = nLETrackSlot.getStartTime();
            }
            C356830Dyr c356830DyrU5 = U5();
            String uuid = nLETrackSlot.getUUID();
            C357260DzY c357260DzY = new C357260DzY(first, this, startTime, effectModel, z2);
            c356830DyrU5.getClass();
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_global_effect_canvas_adapt_android", true, false)) {
                c356830DyrU5.LIZ();
            }
            boolean zLIZLLL = C351420Dq8.LIZLLL(c356830DyrU5.LJIIJJI());
            Iterator<NLETrack> it3 = C351220Dpo.LJJIJLIJ(c356830DyrU5.LJIIJJI()).iterator();
            while (true) {
                if (it3.hasNext()) {
                    NLETrack next2 = it3.next();
                    Iterator<NLETrackSlot> it4 = next2.getSlots().iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (Intrinsics.LJFF(next.getUUID(), uuid)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    NLETrackSlot nLETrackSlot2 = next;
                    if (nLETrackSlot2 != null) {
                        next2.removeSlot(nLETrackSlot2);
                        Long l = (Long) c357260DzY.invoke();
                        if (l == null) {
                            jLongValue = nLETrackSlot2.getEndTime();
                        } else {
                            jLongValue = l.longValue() + startTime;
                        }
                        nLETrackSlotLIZIZ = C350490Dod.LIZ(effectModel, startTime, jLongValue);
                        if (zLIZLLL) {
                            layer = nLETrackSlot2.getTransformZ();
                        } else {
                            layer = next2.getLayer() + 10000;
                        }
                        nLETrackSlotLIZIZ.setTransformZ(layer);
                        C356600DyU.LJII(nLETrackSlotLIZIZ, effectModel, c356830DyrU5.LJIIJJI(), EnumC356310Dy1.EDIT);
                        next2.addSlot(nLETrackSlotLIZIZ);
                    }
                } else {
                    nLETrackSlotLIZIZ = null;
                    break;
                }
            }
            U5().LJI(C0E1V.REPLACE_VIDEO_EFFECT.getNameId(), EnumC356070Dxd.COMMIT);
            z3 = true;
            z4 = false;
            interfaceC1452170ntP = null;
        } else {
            C364110EPh c364110EPh = T2().LJI;
            if (c364110EPh == null) {
                return false;
            }
            float f = c364110EPh.LIZ;
            if (z2) {
                j = 0;
            } else {
                j = ((long) ((int) (f * T2().LJII))) * 1000;
            }
            Long lT4 = T4(j, effectModel, true, z2);
            if (lT4 == null) {
                return false;
            }
            long jLongValue2 = lT4.longValue();
            k5();
            C1428470nHB.LLILZIL(getEditModel());
            z3 = true;
            z4 = false;
            interfaceC1452170ntP = null;
            nLETrackSlotLIZIZ = C356830Dyr.LIZIZ(U5(), effectModel, j, jLongValue2, this.LLLIL.LJIILJJIL, false, 48);
            i3(AFwS234S0000000_5.get$arr$(45));
        }
        L6().LIZIZ(rectLLJLLIL);
        if (nLETrackSlotLIZIZ != null) {
            i3(new AwS584S0100000_5(nLETrackSlotLIZIZ, 83));
            long startTime2 = nLETrackSlotLIZIZ.getStartTime();
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            long j3 = startTime2 / j2;
            long endTime = nLETrackSlotLIZIZ.getEndTime() / j2;
            InterfaceC1452170ntP interfaceC1452170ntP3 = this.LLJJJJLIIL;
            if (interfaceC1452170ntP3 == null) {
                interfaceC1452170ntP3 = interfaceC1452170ntP;
            }
            Long lValueOf = Long.valueOf(interfaceC1452170ntP3.Te((int) j3));
            InterfaceC1452170ntP interfaceC1452170ntP4 = this.LLJJJJLIIL;
            if (interfaceC1452170ntP4 == null) {
                interfaceC1452170ntP4 = interfaceC1452170ntP;
            }
            new Pair(lValueOf, Long.valueOf(interfaceC1452170ntP4.Te((int) endTime)));
            Pair pair = new Pair(Long.valueOf(j3), Long.valueOf(endTime));
            if (!z) {
                pair = interfaceC1452170ntP;
            }
            r8(this, z3, z3, pair, -1);
            return z3;
        }
        return z4;
    }

    private final void v5(List<String> list, final boolean z) {
        C565780MGy c565780MGy = new C565780MGy();
        ((InterfaceC1635410sex) c565780MGy.LIZ.getValue()).LJFF(list, false, null, new IFetchEffectListListener() { // from class: X.0DzE
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
                String msg;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unable to download effect from draft: ");
                if (exceptionResult != null) {
                    msg = exceptionResult.getMsg();
                } else {
                    msg = null;
                }
                sbLIZ.append(msg);
                C201955140j.LIZIZ("EditEffectComponentV2", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<Effect> list2) {
                List<Effect> list3 = list2;
                if (list3 != null) {
                    boolean z2 = z;
                    C0EPT c0ept = this;
                    if (z2) {
                        c0ept.getEditModel().creativeModel.editEffectModel.defaultEffectList = list3;
                        return;
                    }
                    if (list3.size() == 1 && Intrinsics.LJFF(c0ept.L7((Effect) ListProtector.get(list3, 0)), Boolean.TRUE)) {
                        Iterator<Effect> it2 = c0ept.getEditModel().creativeModel.editEffectModel.defaultEffectList.iterator();
                        int i = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (Intrinsics.LJFF(c0ept.L7(it2.next()), Boolean.TRUE)) {
                                if (i >= 0) {
                                    ListProtector.set(c0ept.getEditModel().creativeModel.editEffectModel.defaultEffectList, i, ListProtector.get(list3, 0));
                                    return;
                                }
                            } else {
                                i++;
                            }
                        }
                        c0ept.getEditModel().creativeModel.editEffectModel.defaultEffectList.add((Effect) ListProtector.get(list3, 0));
                        return;
                    }
                    c0ept.getEditModel().creativeModel.editEffectModel.defaultEffectList.addAll(list3);
                }
            }
        });
    }

    public final void K4(boolean z, Float f) {
        C364110EPh c364110EPh;
        if (f != null || ((c364110EPh = T2().LJI) != null && (f = Float.valueOf(c364110EPh.LIZ)) != null)) {
            float fFloatValue = f.floatValue();
            if (Float.isNaN(T2().LJII * fFloatValue)) {
                return;
            }
            int iLIZIZ = C814420VxA.LIZIZ(T2().LJII * fFloatValue);
            InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJJJLIIL;
            if (interfaceC1452170ntP == null) {
                interfaceC1452170ntP = null;
            }
            long jTe = interfaceC1452170ntP.Te(iLIZIZ);
            if (z) {
                L6().LJFF.setValue(new C1452730nuJ(3, jTe, null));
            } else {
                L6().LJFF.setValue(C1452730nuJ.LIZIZ(jTe));
            }
        }
    }

    public final boolean o7(EffectModel effectModel, Pair<? extends NLETrackSlot, ? extends NLETrackSlot> pair) {
        NLETrackSlot second = pair.getSecond();
        if (second != null) {
            i3(new AwS371S0200000_5(second, effectModel, 10));
            r8(this, true, true, null, -1);
            return true;
        }
        return false;
    }

    private final boolean n7(EffectModel effectModel, int i, boolean z) {
        if (S5().LIZIZ()) {
            C1428470nHB.LLILZIL(getEditModel());
            return o7(effectModel, U5().LJIJJLI(effectModel));
        }
        if (!z) {
            S5().LIZLLL(getActivity(), getEditModel(), new AwS406S0200000_5(this, effectModel, 14));
            return false;
        }
        return false;
    }

    public final boolean P4(EffectModel effectModel, String str, int i) {
        n5(effectModel);
        if (effectModel.isCombinedEffect().booleanValue()) {
            r8(this, true, true, null, -1);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        effectModel.index = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effect_panel_");
        sbLIZ.append(str);
        effectModel.selectFrom = C2188811AlT.LIZIZ(sbLIZ);
        effectModel.entrancePoint = "edit_page_panel";
        U5().LJIJJ(effectModel, C1664590tQ1.LJIIIZ(this), new C357020DzA(this, effectModel, str, i, jCurrentTimeMillis), new C357010Dz9(this, effectModel, str, i, jCurrentTimeMillis));
        return true;
    }

    @Override // X.InterfaceC1455500nym
    public void WU0(EffectModel effectModel, String str, int i) {
        C1414930mvL c1414930mvL = C1414930mvL.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        c1414930mvL.getClass();
        if (!C1414930mvL.LJII(editModel, false)) {
            return;
        }
        if (T2().LJI == null) {
            i3(AFwS234S0000000_5.get$arr$(56));
        }
        C1412870ms1 c1412870ms1 = C1412870ms1.LIZ;
        NLEEditor nLEEditorJ6 = J6();
        c1412870ms1.getClass();
        NLETrackSlot nLETrackSlotLIZ = C1412870ms1.LIZ(nLEEditorJ6);
        if (nLETrackSlotLIZ != null) {
            i3(new AwS584S0100000_5(nLETrackSlotLIZ, 74));
            long startTime = nLETrackSlotLIZ.getStartTime();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            long j2 = startTime / j;
            long endTime = nLETrackSlotLIZ.getEndTime() / j;
            InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJJJLIIL;
            InterfaceC1452170ntP interfaceC1452170ntP2 = null;
            if (interfaceC1452170ntP == null) {
                interfaceC1452170ntP = null;
            }
            Long lValueOf = Long.valueOf(interfaceC1452170ntP.Te((int) j2));
            InterfaceC1452170ntP interfaceC1452170ntP3 = this.LLJJJJLIIL;
            if (interfaceC1452170ntP3 != null) {
                interfaceC1452170ntP2 = interfaceC1452170ntP3;
            }
            new Pair(lValueOf, Long.valueOf(interfaceC1452170ntP2.Te((int) endTime)));
            r8(this, true, true, new Pair(Long.valueOf(j2), Long.valueOf(endTime)), -1);
        }
    }

    private final boolean T6(EffectModel effectModel, String str, int i, boolean z) {
        if (S5().LIZIZ()) {
            return P4(effectModel, str, i);
        }
        if (!z) {
            S5().LIZLLL(getActivity(), getEditModel(), new AwS26S1201000_5(this, effectModel, str, i, 0));
            return false;
        }
        return false;
    }

    public final Long T4(long j, EffectModel effectModel, boolean z, boolean z2) {
        Object next;
        long startTime;
        long jMin;
        Boolean boolHasRealDuration = effectModel.hasRealDuration();
        List<NLETrack> listLJJIJLIJ = C351220Dpo.LJJIJLIJ(J6().getModel());
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = listLJJIJLIJ.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSortedSlots(), arrayList);
        }
        Iterator it3 = C13LP.LJLLLL(new AComparatorS24S0000000_5(14), arrayList).iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (((NLETimeSpaceNode) next).getStartTime() > j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) next;
        if (nLETimeSpaceNode != null) {
            startTime = nLETimeSpaceNode.getStartTime();
        } else {
            startTime = ((long) T2().LJII) * 1000;
        }
        if (boolHasRealDuration.booleanValue()) {
            jMin = Math.min(startTime - j, ((long) effectModel.duration) * 1000);
        } else {
            jMin = startTime - j;
        }
        if (z && jMin < ((long) this.LLLIL.LJIILJJIL) * 1000) {
            a9(false);
            return null;
        }
        if (!boolHasRealDuration.booleanValue() && !z2) {
            return Long.valueOf(Math.min(jMin, ((long) this.LLLIL.LJIILIIL) * 1000));
        }
        return Long.valueOf(jMin);
    }

    public final void h8(NLETrackSlot nLETrackSlot, float f, boolean z, boolean z2) {
        int endTime;
        int i;
        String str;
        Object next;
        NLETrack mainTrack;
        NLEVideoAnimation next2;
        ArrayList<NLETimeSpaceNode> arrayList;
        String extra;
        Integer numLJIIJJI;
        NLENode nLENodeLJIILLIIL;
        Object next3;
        int iIntValue;
        long startTime;
        long startTime2;
        k5();
        int iLIZIZ = C814420VxA.LIZIZ(T2().LJII * f);
        boolean zLJII = C348520DlS.LJII(nLETrackSlot);
        if (zLJII) {
            endTime = C348520DlS.LJ(nLETrackSlot);
        } else {
            endTime = (int) (nLETrackSlot.getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        C365260ETs c365260ETs = this.LLLIL;
        if (zLJII) {
            i = c365260ETs.LJIILL;
        } else {
            i = c365260ETs.LJIILJJIL;
        }
        if (z) {
            if (endTime - iLIZIZ <= i) {
                a9(zLJII);
                iLIZIZ = endTime - i;
            }
        } else {
            long startTime3 = nLETrackSlot.getStartTime();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            if (((long) iLIZIZ) - (startTime3 / j) <= i) {
                a9(zLJII);
                iLIZIZ = ((int) (nLETrackSlot.getStartTime() / j)) + i;
            }
        }
        long j2 = ((long) iLIZIZ) * 1000;
        Pair<Long, Long> pair = this.LLLII;
        String str2 = "";
        if (pair == null) {
            str = "";
        } else if (Math.abs(j2 - pair.getFirst().longValue()) > ((long) this.LLLIL.LJIIZILJ) * 1000 && Math.abs(j2 - pair.getSecond().longValue()) > ((long) this.LLLIL.LJIIZILJ) * 1000) {
            if (z) {
                if (pair.getFirst().longValue() > j2) {
                    str = "head_left";
                } else {
                    str = "head_right";
                }
            } else if (pair.getSecond().longValue() > j2) {
                str = "tail_left";
            } else {
                str = "tail_right";
            }
        } else {
            return;
        }
        C1428470nHB.LLILZIL(getEditModel());
        if (zLJII) {
            C356830Dyr c356830DyrU5 = U5();
            Integer numLJIILL = C356830Dyr.LJIILL(c356830DyrU5.LJIIJJI());
            if (numLJIILL != null && (numLJIILL.intValue() == 2 || numLJIILL.intValue() == 3)) {
                if (z) {
                    startTime = j2;
                } else {
                    startTime = nLETrackSlot.getStartTime();
                }
                int iLJ = C348520DlS.LJ(nLETrackSlot);
                if (z) {
                    nLETrackSlot.setStartTime(j2);
                    startTime2 = (((long) iLJ) * 1000) - j2;
                } else {
                    startTime2 = j2 - nLETrackSlot.getStartTime();
                }
                String string = numLJIILL.toString();
                long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
                c356830DyrU5.LIZJ.setValue(C1452720nuI.LJFF(startTime / j3, (startTime + startTime2) / j3, string));
                if (z2) {
                    c356830DyrU5.LJI(C0E1V.CLIP.getNameId(), EnumC356070Dxd.DONE);
                } else {
                    c356830DyrU5.LJI("", EnumC356070Dxd.COMMIT);
                }
            }
            C356830Dyr c356830DyrU52 = U5();
            NLEModel model = J6().getModel();
            c356830DyrU52.getClass();
            NLETrackSlot nLETrackSlotLJIILLIIL = C356830Dyr.LJIILLIIL(model);
            if (nLETrackSlotLJIILLIIL != null) {
                i3(new AwS584S0100000_5(nLETrackSlotLJIILLIIL, 80));
            }
            if (!z2) {
                return;
            }
        } else {
            C356830Dyr c356830DyrU53 = U5();
            List<NLETrack> listLJJIJLIJ = C351220Dpo.LJJIJLIJ(c356830DyrU53.LJIIJJI());
            ArrayList arrayList2 = new ArrayList();
            Iterator<NLETrack> it2 = listLJJIJLIJ.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getSlots(), arrayList2);
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(((NLENode) next).getUUID(), nLETrackSlot.getUUID())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) next;
            if (nLETrackSlot2 != null) {
                if (z2) {
                    if (C351220Dpo.LLLLIL(nLETrackSlot)) {
                        arrayList = new ArrayList();
                        for (Object obj : arrayList2) {
                            if (C351220Dpo.LLLLIL((NLETrackSlot) obj)) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            if (!C351220Dpo.LLLLIL((NLETrackSlot) obj2)) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    long endTime2 = j2;
                    for (NLETimeSpaceNode nLETimeSpaceNode : arrayList) {
                        if (!Intrinsics.LJFF(nLETimeSpaceNode.getUUID(), nLETrackSlot.getUUID())) {
                            if (z) {
                                if (nLETimeSpaceNode.getStartTime() < j2 && nLETimeSpaceNode.getEndTime() > j2) {
                                    endTime2 = nLETimeSpaceNode.getEndTime();
                                }
                            } else if (nLETimeSpaceNode.getStartTime() < j2 && nLETimeSpaceNode.getEndTime() > j2) {
                                endTime2 = nLETimeSpaceNode.getStartTime();
                            }
                        }
                    }
                    j2 = endTime2;
                }
                if (z) {
                    nLETrackSlot2.setStartTime(j2);
                } else {
                    nLETrackSlot2.setEndTime(j2);
                }
                if (C351220Dpo.LLLLIL(nLETrackSlot2)) {
                    if (C348520DlS.LJI(c356830DyrU53.LJIIJJI()) && !((ArrayList) C348520DlS.LIZJ(c356830DyrU53.LJIIJJI())).isEmpty()) {
                        mainTrack = (NLETrack) ListProtector.get(C348520DlS.LIZJ(c356830DyrU53.LJIIJJI()), 0);
                    } else if (c356830DyrU53.LJIIJJI().getMainTrack() == null) {
                        mainTrack = new NLETrack();
                        mainTrack.setMainTrack(true);
                        c356830DyrU53.LJIIJJI().addTrack(mainTrack);
                    } else {
                        mainTrack = c356830DyrU53.LJIIJJI().getMainTrack();
                    }
                    NLETrackSlot nLETrackSlot3 = (NLETrackSlot) C13LP.LJJJLL(mainTrack.getSlots());
                    if (nLETrackSlot3 != null) {
                        Iterator<NLEVideoAnimation> it4 = nLETrackSlot3.getVideoAnims().iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next2 = it4.next();
                                if (Intrinsics.LJFF(next2.getExtra("anim_type"), nLETrackSlot2.getExtra("anim_type"))) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        NLEVideoAnimation nLEVideoAnimation = next2;
                        if (nLEVideoAnimation != null) {
                            if (z) {
                                nLEVideoAnimation.setStartTime(j2);
                            } else {
                                nLEVideoAnimation.setEndTime(j2);
                            }
                        }
                    }
                }
            }
            if (z2) {
                c356830DyrU53.LJI(C0E1V.CLIP.getNameId(), EnumC356070Dxd.DONE);
            } else {
                c356830DyrU53.LJI("", EnumC356070Dxd.COMMIT);
                return;
            }
        }
        int iIntValue2 = -1;
        if (C351220Dpo.LLLLIL(nLETrackSlot)) {
            Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(nLETrackSlot.getExtra("nleExtraEffectIndex"));
            if (numLJIIJJI2 != null) {
                iIntValue = numLJIIJJI2.intValue();
            } else {
                iIntValue = 0;
            }
            iIntValue2 = (-1) + iIntValue;
        } else {
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            if (mainSegment != null && (extra = mainSegment.getExtra("nleExtraEffectIndex")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(extra)) != null) {
                iIntValue2 = numLJIIJJI.intValue();
            }
        }
        C1413450msx c1413450msx = C1413450msx.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        String strLJIIIZ = U5().LJIIIZ(nLETrackSlot);
        U5().getClass();
        String strLJII = C356830Dyr.LJII(nLETrackSlot);
        c1413450msx.getClass();
        C0LAB c0labLJI = C1413450msx.LJI(editModel);
        c0labLJI.LJ("effect_id", strLJIIIZ);
        if (strLJII != null) {
            str2 = strLJII;
        }
        c0labLJI.LJ("tab_name", C1413450msx.LIZLLL(str2));
        int i2 = iIntValue2 + 1;
        c0labLJI.LIZ(i2, "effect_index");
        c0labLJI.LIZ(i2, "index");
        c0labLJI.LIZ(0, "is_editor_pro");
        c0labLJI.LIZ(0, "is_multi_track");
        c0labLJI.LJ("action_type", str);
        c0labLJI.LJ("effect_entrance_position", editModel.creativeModel.effectEntrancePosition);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("edit_effect_duration", c0labLJI.LIZ);
        C356830Dyr c356830DyrU54 = U5();
        c356830DyrU54.getClass();
        if (!C348520DlS.LJII(nLETrackSlot) && !C346680DiU.LIZIZ(nLETrackSlot)) {
            List<NLETrack> listLJJIJLIJ2 = C351220Dpo.LJJIJLIJ(c356830DyrU54.LJIIJJI());
            ArrayList arrayList3 = new ArrayList();
            Iterator<NLETrack> it5 = listLJJIJLIJ2.iterator();
            while (it5.hasNext()) {
                C19719612Di.LJJI(it5.next().getSlots(), arrayList3);
            }
            Iterator it6 = arrayList3.iterator();
            while (true) {
                if (it6.hasNext()) {
                    next3 = it6.next();
                    if (Intrinsics.LJFF(((NLENode) next3).getUUID(), nLETrackSlot.getUUID())) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            nLENodeLJIILLIIL = (NLENode) next3;
        } else {
            nLENodeLJIILLIIL = C356830Dyr.LJIILLIIL(c356830DyrU54.LJIIJJI());
        }
        if (nLENodeLJIILLIIL != null) {
            nLENodeLJIILLIIL.setExtra("is_edit_effect_duration", "true");
        }
    }

    public static final void r8(C0EPT c0ept, boolean z, boolean z2, Pair pair, final int i) {
        if (z2) {
            c0ept.i3(new AwS20S0010000_5(z, 2));
        }
        if (z) {
            if (pair != null) {
                final C0EPY c0epyL6 = c0ept.L6();
                final long jLongValue = ((Number) pair.getFirst()).longValue();
                final long jLongValue2 = ((Number) pair.getSecond()).longValue();
                c0epyL6.getClass();
                c0epyL6.LJFF.setValue(new C1452730nuJ(3, jLongValue, new InterfaceC1464180oCm() { // from class: X.0EPZ
                    @Override // X.InterfaceC1464180oCm
                    public final void onSeekDone(int i2) {
                        int i3 = i;
                        if (i3 != -1) {
                            c0epyL6.LJII = i3;
                        }
                        c0epyL6.LJI = new Pair<>(Long.valueOf(jLongValue), Long.valueOf(jLongValue2));
                        C01TT.LIZLLL(new AwS549S0100000_5(c0epyL6, 92));
                    }
                }));
            } else {
                C0EPY c0epyL62 = c0ept.L6();
                c0epyL62.LJI = null;
                c0epyL62.LJII = -1;
                ((ValueAnimator) c0epyL62.LJIIIIZZ.getValue()).start();
                c0epyL62.LIZJ.setLoopPlay(true);
                c0epyL62.LJFF.setValue(C1452730nuJ.LIZ());
            }
            Iterator<EffectMobParams> it2 = c0ept.getEditModel().creativeModel.mixEditingModel.effectMobParamsList.iterator();
            while (it2.hasNext()) {
                it2.next().applyTime += System.currentTimeMillis() - c0ept.LLJLLIL;
            }
            return;
        }
        C0EPY c0epyL63 = c0ept.L6();
        c0epyL63.LJFF.setValue(C1452730nuJ.LIZJ());
        ((ValueAnimator) c0epyL63.LJIIIIZZ.getValue()).cancel();
        c0epyL63.LJI = null;
        c0epyL63.LJII = -1;
        c0ept.LLJLLIL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1455500nym
    public boolean KD(EffectModel effectModel, String str, int i, boolean z, boolean z2) {
        if (T2().LJI == null) {
            i3(AFwS234S0000000_5.get$arr$(41));
        }
        if (!effectModel.isEnabled) {
            return k7(effectModel);
        }
        if (effectModel.isServerOrCombinedEffect().booleanValue()) {
            return T6(effectModel, str, i, z);
        }
        if (effectModel.isClientEffect().booleanValue()) {
            return P4(effectModel, str, i);
        }
        if (effectModel.isVideoAnimEffect().booleanValue()) {
            return n7(effectModel, i, z);
        }
        return o8(effectModel, z2);
    }
}
