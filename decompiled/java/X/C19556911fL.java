package X;

import Y.AObserverS209S0100000_5;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.FilterEffectTabFragment;
import com.ss.android.ugc.aweme.effect.TimeEffectTabFragment;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import dmt.av.video.ReplayLiveData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11fL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19556911fL extends AbstractC2255721DQs<InterfaceC1455500nym> implements InterfaceC1455500nym, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public C19557611fS LLIZ;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLILZIL = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);
    public final h0<Integer> LLIZLLLIL = new h0<>(null);
    public final C560530Lyd<Unit> LLJ = new C560530Lyd<>();
    public final C560530Lyd<Unit> LLJI = new C560530Lyd<>();
    public final C560530Lyd<Integer> LLJIJIL = new C560530Lyd<>();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19556911fL.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19556911fL.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJILJILJ = 8;
    }

    @Override // X.InterfaceC1455500nym
    public void WU0(EffectModel effectModel, String str, int i) {
    }

    public InterfaceC1455500nym X1() {
        return this;
    }

    @Override // X.InterfaceC1455500nym
    public void mR0() {
    }

    @Override // X.InterfaceC1455500nym
    public void rF1() {
    }

    @Override // X.InterfaceC1455500nym
    public void xx() {
    }

    private final C1451630nsX o2() {
        return (C1451630nsX) this.LLILZLL.getValue(this, LLJILJIL[1]);
    }

    private final void w2() {
        Z1().g().observe(this, new AObserverS209S0100000_5(this, 2));
    }

    @Override // X.InterfaceC1455500nym
    public void Fq() {
        this.LLJ.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1455500nym
    public void Qh() {
        this.LLJI.LJIIJ(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    public final ArrayList<EffectPointModel> W1() {
        String string;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = getEditModel().getEffectList();
        if (C2550709z7.LIZ) {
            T tLIZ = 0;
            Bundle argumentsSafely = ((AbstractC1447660nm8) getDiContainer().LJII(AbstractC214814194y.class, null)).getArgumentsSafely();
            if (argumentsSafely != null && (string = argumentsSafely.getString("extra_edit_effect_uid")) != null) {
                EditEffectAnchorManager data = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).getData(string);
                if (data != null) {
                    ArrayList<EffectPointModel> effectList = getEditModel().getEffectList();
                    ArrayList arrayList = new ArrayList();
                    for (EffectPointModel effectPointModel : effectList) {
                        EffectPointModel effectPointModel2 = effectPointModel;
                        List<EditEffectAnchorInfo> data2 = data.getData();
                        if (!(data2 instanceof Collection) || !data2.isEmpty()) {
                            Iterator<EditEffectAnchorInfo> it2 = data2.iterator();
                            while (it2.hasNext()) {
                                if (Intrinsics.LJFF(it2.next().effectId, effectPointModel2.getKey())) {
                                    break;
                                }
                            }
                        }
                        arrayList.add(effectPointModel);
                    }
                    tLIZ = C09HN.LIZ(arrayList);
                }
                c259800zU.element = tLIZ;
            }
        }
        return (ArrayList) c259800zU.element;
    }

    public final InterfaceC1455860nzM Z1() {
        return (InterfaceC1455860nzM) this.LLILZIL.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLJILJIL[0]);
    }

    @Override // X.InterfaceC1455500nym
    public void hide() {
        C19557611fS c19557611fS = this.LLIZ;
        if (c19557611fS != null) {
            C19557511fR c19557511fRLLLIIIIL = c19557611fS.LLLIIIIL();
            c19557511fRLLLIIIIL.LJJJJLI.zQ2().setValue(Boolean.FALSE);
            c19557511fRLLLIIIIL.LIZLLL.removeObserver(c19557511fRLLLIIIIL.LJJJLIIL);
        }
        C1451630nsX c1451630nsXO2 = o2();
        if (c1451630nsXO2 != null) {
            c1451630nsXO2.LIZIZ(AFwS273S0000000_29.get$arr$(131));
        }
    }

    @Override // X.InterfaceC1455500nym
    public void show() {
        boolean z;
        InterfaceC1452170ntP value;
        if (this.LLIZ == null) {
            C19557611fS c19557611fS = new C19557611fS(getDiContainer());
            C1455880nzO c1455880nzO = new C1455880nzO(this);
            C19557511fR c19557511fRLLLIIIIL = c19557611fS.LLLIIIIL();
            c19557511fRLLLIIIIL.LJJJJLL = c1455880nzO;
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) C1659630tI1.LJFF(c1455880nzO.LJI()).get(EditEffectVideoModel.class);
            c19557511fRLLLIIIIL.LJJJJLI = editEffectVideoModel;
            editEffectVideoModel.LLIZ = c19557511fRLLLIIIIL.LJJJJLL;
            this.LLILLJJLI.add(this.LLILLL, c19557611fS, "EditEffectScene");
            this.LLIZ = c19557611fS;
        }
        if (getEditModel().isMultiVideoEdit() && (value = Z1().g().getValue()) != null) {
            LLLL(value.getDuration());
        }
        C19557611fS c19557611fS2 = this.LLIZ;
        if (c19557611fS2 != null) {
            C19557511fR c19557511fRLLLIIIIL2 = c19557611fS2.LLLIIIIL();
            boolean z2 = !((InterfaceC1461660o8i) c19557611fS2.LLJILJIL.getValue()).c0();
            c19557511fRLLLIIIIL2.LJI();
            if (c19557511fRLLLIIIIL2.LIZLLL == null) {
                c19557511fRLLLIIIIL2.LIZLLL = c19557511fRLLLIIIIL2.LJJJJLL.LJFF();
            }
            c19557511fRLLLIIIIL2.LIZLLL.observe(c19557511fRLLLIIIIL2.LJIIIIZZ, c19557511fRLLLIIIIL2.LJJJLIIL);
            c19557511fRLLLIIIIL2.LJJJJLI.zQ2().setValue(Boolean.TRUE);
            c19557511fRLLLIIIIL2.LJJJJLI.LLIZLLLIL = z2;
            C366400EYc c366400EYc = C366400EYc.LIZ;
            VideoPublishEditModel videoPublishEditModel = c19557511fRLLLIIIIL2.LIZ;
            InterfaceC1452170ntP interfaceC1452170ntP = c19557511fRLLLIIIIL2.LJJIII;
            NLEModel model = interfaceC1452170ntP instanceof C1463670oBx ? ((C1463670oBx) interfaceC1452170ntP).LIZLLL().LIZ.getModel() : null;
            c366400EYc.getClass();
            boolean zLJFF = C366400EYc.LJFF(videoPublishEditModel, model);
            c19557511fRLLLIIIIL2.LJJLI = zLJFF;
            C113Z c113z = c19557511fRLLLIIIIL2.LJJIZ;
            if (c113z != null) {
                z = c113z.getCurrentPage() != null && c19557511fRLLLIIIIL2.LJJIZ.getCurrentPage().LJII();
                c19557511fRLLLIIIIL2.LJJIZ.E0(c19557511fRLLLIIIIL2.LJJLI);
            } else {
                Fragment fragment = c19557511fRLLLIIIIL2.LJJIJIL.LLJIJIL;
                if (fragment == null || !(fragment instanceof TimeEffectTabFragment)) {
                    z = false;
                } else {
                    z = true;
                    if (zLJFF) {
                        ((TimeEffectTabFragment) fragment).MR(z2, true);
                    } else {
                        c19557511fRLLLIIIIL2.LJIL.setCurrentItem(0);
                    }
                }
                List<EffectCategoryResponse> list = c19557511fRLLLIIIIL2.LJJIJIL.LLJ;
                if (list != null && !list.isEmpty()) {
                    boolean zEquals = ((EffectCategoryResponse) ListProtector.get(list, list.size() - 1)).getKey().equals("time");
                    if (c19557511fRLLLIIIIL2.LJJLI) {
                        if (!zEquals) {
                            c19557511fRLLLIIIIL2.LJJIJIL.LLJJ = false;
                            c19557511fRLLLIIIIL2.LIZIZ(list);
                            c19557511fRLLLIIIIL2.LJJIJIL.setData(list);
                            c19557511fRLLLIIIIL2.LIZ(list);
                        }
                    } else if (zEquals) {
                        c19557511fRLLLIIIIL2.LJJIJIL.LLJJ = true;
                        C19561511g5 c19561511g5 = c19557511fRLLLIIIIL2.LJJ;
                        c19561511g5.removeTabAt(c19561511g5.getTabCount() - 1);
                        C194364112k c194364112k = c19557511fRLLLIIIIL2.LJJIJIL;
                        int i = 0;
                        while (true) {
                            if (i >= c194364112k.LLJ.size()) {
                                break;
                            }
                            if (ListProtector.get(c194364112k.LLJ, i) == null || !((EffectCategoryResponse) ListProtector.get(c194364112k.LLJ, i)).getKey().equals("time")) {
                                i++;
                            } else if (i != -1) {
                                ListProtector.remove(c194364112k.LLJ, i);
                                c194364112k.notifyDataSetChanged();
                            }
                        }
                    }
                }
                C366400EYc c366400EYc2 = C366400EYc.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = c19557511fRLLLIIIIL2.LIZ;
                c366400EYc2.getClass();
                c19557511fRLLLIIIIL2.LJJLIIIIJ = !C366400EYc.LIZIZ(videoPublishEditModel2);
                List<EffectCategoryResponse> list2 = c19557511fRLLLIIIIL2.LJJIJIL.LLJ;
                if (list2 != null && !list2.isEmpty() && !c19557511fRLLLIIIIL2.LJJLIIIIJ) {
                    C19557511fR.LJIILIIL("sticker", list2);
                    c19557511fRLLLIIIIL2.LJJIJIL.setData(list2);
                    c19557511fRLLLIIIIL2.LIZ(list2);
                }
                Fragment fragment2 = c19557511fRLLLIIIIL2.LJJIJIL.LLJIJIL;
                if (fragment2 != null && (fragment2 instanceof FilterEffectTabFragment)) {
                    ((LiveData) ((FilterEffectTabFragment) fragment2).LLJJJJJIL.getValue()).setValue(Boolean.valueOf(!r1.ZR()));
                }
            }
            if (c19557511fRLLLIIIIL2.LIZ.isMultiVideoEdit() && z) {
                c19557511fRLLLIIIIL2.LJIIJJI();
            }
            if (c19557611fS2.LLJJ && !C20510015Ni.LIZ.LJIIIIZZ()) {
                c19557611fS2.LLJJ = false;
                C1627000sRO.LIZIZ(c19557611fS2.requireApplicationContext(), true);
            }
        }
        C1451630nsX c1451630nsXO2 = o2();
        if (c1451630nsXO2 != null) {
            c1451630nsXO2.LIZIZ(AFwS273S0000000_29.get$arr$(132));
        }
    }

    @Override // X.InterfaceC1455500nym
    public void YI() {
        getEditModel().getEffectList().clear();
        ArrayList<EffectPointModel> arrayListDt = Z1().dt();
        if (!arrayListDt.isEmpty()) {
            int size = arrayListDt.size();
            int[] iArr = new int[size];
            String[] strArr = new String[arrayListDt.size()];
            for (int i = 0; i < size; i++) {
                iArr[i] = ((EffectPointModel) ListProtector.get(arrayListDt, i)).getIndex();
                strArr[i] = ((EffectPointModel) ListProtector.get(arrayListDt, i)).getUuid();
            }
            ReplayLiveData<C0EYM> replayLiveDataDS1 = Z1().dS1();
            C0EYM c0eym = new C0EYM();
            c0eym.LJI = 3;
            c0eym.LIZ = iArr;
            c0eym.LIZIZ = strArr;
            replayLiveDataDS1.setValue(c0eym);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        w2();
    }

    @Override // X.InterfaceC1455500nym
    public LiveEvent<Unit> Qx() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1455500nym
    public C385670FAf<Integer> Wk1() {
        return this.LLIZLLLIL;
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

    @Override // X.InterfaceC1455500nym
    public LiveEvent<Unit> iT() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1455500nym
    public LiveEvent<Integer> rK1() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1455500nym
    public void LLLL(int i) {
        this.LLIZLLLIL.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1455500nym
    public void Tj(int i) {
        this.LLJIJIL.LJIIJ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1455500nym
    public void aH(boolean z) {
        if (this.LLIZ == null && getEditModel().mIsFromDraft) {
            Z1().ZB2().setValue(C1452720nuI.LJI());
            getEditModel().setTimeEffect(null);
            InterfaceC1452170ntP value = Z1().g().getValue();
            if (value instanceof C1463670oBx) {
                C0EYJ c0eyjLIZLLL = ((C1463670oBx) value).LIZLLL().LIZLLL();
                c0eyjLIZLLL.LJIIIZ(false);
                c0eyjLIZLLL.LJIILLIIL();
                return;
            }
            return;
        }
        X1();
        Fq();
    }

    public C19556911fL(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
    }

    @Override // X.InterfaceC1455500nym
    public boolean KD(EffectModel effectModel, String str, int i, boolean z, boolean z2) {
        InterfaceC1452170ntP value = Z1().g().getValue();
        if (value != null) {
            long duration = value.getDuration();
            String str2 = effectModel.resDir;
            C0EYM c0eym = new C0EYM();
            c0eym.LJI = 5;
            c0eym.LJIIL = str2;
            c0eym.LIZJ = 0L;
            c0eym.LIZLLL = duration;
            c0eym.LJ = 0L;
            c0eym.LJFF = duration;
            c0eym.LJIIIIZZ = effectModel.color;
            c0eym.LJIILIIL = effectModel.key;
            c0eym.LJIILL = effectModel.name;
            c0eym.LJIIZILJ = effectModel.category;
            c0eym.LJIJ = effectModel.extra;
            Z1().dS1().setValue(c0eym);
            return false;
        }
        return false;
    }
}
