package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS11S0102000_29;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.vesdk.VEEditor;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.11fU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19557811fU {
    public static final /* synthetic */ int LJJJJZI = 0;
    public VideoPublishEditModel LIZ;
    public AbstractC364180EPo LIZIZ;
    public ReplayLiveData LIZJ;
    public MutableLiveData<C1452730nuJ> LIZLLL;
    public StoredLiveData LJ;
    public MutableLiveData<Boolean> LJFF;
    public SafeHandler LJI;
    public Scene LJII;
    public C19557911fV LJIIIIZZ;
    public LinearLayout LJIIIZ;
    public FrameLayout LJIIJ;
    public ImageView LJIIJJI;
    public RelativeLayout LJIIL;
    public TextView LJIILIIL;
    public RelativeLayout LJIILJJIL;
    public LinearLayout LJIILL;
    public C19412810xC LJIILLIIL;
    public TextView LJIIZILJ;
    public TextView LJIJ;
    public C0MS4 LJIJI;
    public C19561511g5 LJIJJ;
    public C12UW LJIJJLI;
    public CutMultiVideoViewModel LJIL;
    public VEVideoCoverGeneratorImpl LJJ;
    public InterfaceC1452170ntP LJJI;
    public C19559511fl LJJIFFI;
    public C19560811fy LJJII;
    public C19559211fi LJJIII;
    public int LJJIIJ;
    public RunnableC19558411fa LJJIIJZLJL;
    public RunnableC19558811fe LJJIIZ;
    public View LJJIIZI;
    public C194363112j LJJIJ;
    public boolean LJJIJIIJI;
    public C19EG LJJIJIIJIL;
    public EffectPointModel LJJIJIL;
    public EffectPointModel LJJIJL;
    public C1452720nuI LJJIJLIJ;
    public String LJJIZ;
    public ArrayList<EffectPointModel> LJJJ;
    public ArrayList<EffectPointModel> LJJJI;
    public SafeHandler LJJJJ;
    public EditEffectVideoModel LJJJJI;
    public InterfaceC19558511fb LJJJJIZL;
    public C565780MGy LJJJJJ;
    public C19774712Yn LJJJJJL;
    public InterfaceC524950KiL LJJJJLL;
    public final C19559311fj LJJIL = new C19559311fj();
    public int LJJJIL = -1;
    public boolean LJJJJL = false;
    public boolean LJJJJLI = false;
    public final C19560111fr LJJJJZ = new InterfaceC362610EJn() { // from class: X.11fr
        @Override // X.InterfaceC362610EJn
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            C19557811fU c19557811fU = this.LL;
            if (i == 4) {
                if (c19557811fU.LJJIJIIJI) {
                    TextView textView = c19557811fU.LJIJ;
                    if (textView != null) {
                        textView.performClick();
                        return true;
                    }
                    return true;
                }
                return false;
            }
            c19557811fU.getClass();
            return false;
        }
    };

    public final void LJIIJJI() {
        this.LJJIIJZLJL = null;
        this.LJJIIZ = null;
        this.LJI.removeCallbacksAndMessages(null);
        this.LJJJJ.removeCallbacksAndMessages(null);
    }

    public final void LJIILJJIL() {
        LJIL(0, false);
        this.LJIIIIZZ.setVideoDuration(this.LJJI.mo51if());
        int iNg = this.LJJI.ng();
        this.LJIJJLI.LJJII(iNg);
        this.LJJIL.LIZIZ(iNg);
    }

    public final boolean LIZ() {
        if (!this.LJJIJIIJI) {
            return true;
        }
        if (!this.LJJIFFI.LIZLLL()) {
            return false;
        }
        MutableLiveData<C1452730nuJ> mutableLiveData = this.LIZLLL;
        long j = this.LJJIL.LIZIZ;
        if (j < 0) {
            j = 0;
        }
        mutableLiveData.setValue(C1452730nuJ.LIZLLL(j));
        LJIL((int) this.LJJIL.LIZJ, false);
        LJIIIZ();
        return true;
    }

    public final void LIZJ() {
        if (this.LJJI == null) {
            return;
        }
        int iLIZIZ = (int) this.LJJIFFI.LIZIZ();
        long jLIZJ = this.LJJIFFI.LIZJ();
        if ((this.LJJIFFI.LIZ || iLIZIZ < this.LJJI.getDuration()) && (!this.LJJIFFI.LIZ || iLIZIZ > 0)) {
            C19559311fj c19559311fj = this.LJJIL;
            long j = iLIZIZ;
            c19559311fj.LIZIZ = j;
            c19559311fj.LIZJ = jLIZJ;
            this.LIZLLL.setValue(C1452730nuJ.LIZLLL(j));
        } else {
            this.LIZLLL.setValue(C1452730nuJ.LIZLLL(0L));
        }
        LJIIJ();
    }

    public final int LJ() {
        return (this.LJIIJ.getHeight() == 0 ? (int) C12ES.LIZJ(276.0f, this.LJJIJIIJIL) : this.LJIIJ.getHeight()) + 16;
    }

    public final int LJFF() {
        return this.LJIILJJIL.getHeight() == 0 ? (int) C12ES.LIZJ(52.0f, this.LJJIJIIJIL) : this.LJIILJJIL.getHeight();
    }

    public final int LJI() {
        return (((ScreenUtils.getFullScreenHeight(this.LJJIJIIJIL) - LJFF()) - LJ()) - ScreenUtils.getStatusBarHeight(this.LJJIJIIJIL)) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LJJIJIIJIL);
    }

    public final void LJII() {
        if (this.LIZIZ == null) {
            if (this.LIZ.isFastImport() || this.LIZ.isCutSameVideoType()) {
                this.LIZIZ = new C574840Mgc(this.LJJI, this.LIZ.getPreviewInfo());
                C201955140j.LIZ("generate reverse video ,using new api");
            } else if (this.LIZ.isMultiVideoEdit()) {
                this.LIZIZ = new C574860Mge(this.LJJI, this.LIZ.getMultiEditVideoRecordData().curMultiEditVideoRecordData);
            } else {
                this.LIZIZ = new C574840Mgc(this.LJJI, this.LIZ.getPreviewInfo());
                C201955140j.LIZ("generate reverse video ,using old api");
            }
        }
    }

    public final void LJIIIZ() {
        this.LIZLLL.setValue(C1452730nuJ.LIZJ());
        C1462750oAT.LIZ(this.LJIIJJI, true);
        ImageView imageView = this.LJIIJJI;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
    }

    public final void LJIIJ() {
        this.LIZLLL.setValue(C1452730nuJ.LIZ());
        C1462750oAT.LIZ(this.LJIIJJI, false);
        ImageView imageView = this.LJIIJJI;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
    }

    public final void LJIILIIL() {
        EffectPointModel effectPointModel = this.LJJIJIL;
        if (effectPointModel == null || CardStruct.IStatusCode.DEFAULT.equals(effectPointModel.getKey())) {
            this.LJIIIIZZ.LIZIZ(0, true);
            LJIIZILJ(null, false, false);
            return;
        }
        if ("1".equals(this.LJJIJIL.getKey())) {
            this.LJIIIIZZ.LIZIZ(this.LJJIIJ, true);
            LJIIZILJ(null, false, false);
            return;
        }
        LJIJJ(true);
        ArrayList arrayList = new ArrayList();
        EffectPointModel effectPointModel2 = new EffectPointModel();
        int startPoint = this.LJJIJIL.getStartPoint();
        int endPoint = this.LJJIJIL.getEndPoint();
        effectPointModel2.setUiStartPoint(startPoint);
        effectPointModel2.setUiEndPoint(endPoint);
        arrayList.add(effectPointModel2);
        LJIIZILJ(arrayList, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILL() {
        this.LJJJI = new ArrayList<>(this.LJJJ);
        EffectPointModel effectPointModel = this.LJJIJIL;
        if (effectPointModel != null) {
            this.LJJIJL = effectPointModel.m190clone();
        }
        if (this.LJ.getValue() != 0) {
            this.LJJIJLIJ = ((C1452720nuI) this.LJ.getValue()).clone();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ() {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19557811fU.LJIJ():void");
    }

    public final void LJJI() {
        ((LiveData) this.LJJJJI.LLJIJIL.getValue()).setValue(Float.valueOf(this.LJIJJLI.getSelectedTime()));
        LJJIFFI(true);
    }

    public final boolean LJIJJLI() {
        VideoPublishEditModel videoPublishEditModel;
        return (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_edit_enable_time_effect_category", true, true) || (videoPublishEditModel = this.LIZ) == null || videoPublishEditModel.isStitchMode() || this.LIZ.isMvThemeVideoType()) ? false : true;
    }

    public final void LIZIZ(List<EffectCategoryResponse> list) {
        if (list != null && !list.isEmpty()) {
            this.LJIJJ.removeAllTabs();
            this.LJIJJ.setMaxTabModeForCount(list.size());
            for (int i = 0; i < list.size(); i++) {
                int i2 = C19561511g5.LLILZ;
                C19471311Fv c19471311Fv = new C19471311Fv(this.LJJIJIIJIL);
                c19471311Fv.setText(((EffectCategoryResponse) ListProtector.get(list, i)).getName());
                c19471311Fv.LIZ(i, list.size());
                c19471311Fv.setTag(Integer.valueOf(i));
                C786410Ut5.sb(c19471311Fv, new ACListenerS163S0100000_29(this, 4));
                C19561511g5 c19561511g5 = this.LJIJJ;
                C12H3 c12h3NewTab = c19561511g5.newTab();
                c12h3NewTab.LJ = c19471311Fv;
                c12h3NewTab.LIZIZ();
                c19561511g5.addTab(c12h3NewTab);
            }
        }
    }

    public final boolean LIZLLL(List<EffectCategoryResponse> list) {
        boolean z;
        if (list == null) {
            list = new ArrayList<>();
        }
        boolean z2 = true;
        int i = 0;
        if (this.LIZ.isMvThemeVideoType() && !this.LIZ.isPhotoMvMode()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (ListProtector.get(list, i2) != null && C113I.LIZJ(((EffectCategoryResponse) ListProtector.get(list, i2)).getKey())) {
                    if (i2 != -1) {
                        ListProtector.remove(list, i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        if (LJIJJLI()) {
            EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
            effectCategoryResponse.setName(this.LJJIJIIJIL.getString(2131849531));
            list.add(effectCategoryResponse);
        } else {
            z2 = false;
        }
        while (true) {
            if (i >= list.size()) {
                break;
            }
            if (ListProtector.get(list, i) != null && C113I.LJFF(((EffectCategoryResponse) ListProtector.get(list, i)).getKey())) {
                if (i != -1) {
                    ListProtector.remove(list, i);
                }
            } else {
                i++;
            }
        }
        return z2;
    }

    public final void LJIIIIZZ(boolean z) {
        if (z) {
            this.LIZ.setEffectList(new ArrayList<>(this.LJJJJIZL.dt()));
            this.LIZ.setTimeEffect(this.LJJIJIL);
            if (this.LIZ.getTimeEffect() != null && this.LIZ.getTimeEffect().getKey().equals("1") && this.LJJJJIZL.LIZIZ().getValue() != null) {
                this.LIZ.getPreviewInfo().updateReverseVideoContent(this.LIZIZ.LIZLLL(), this.LIZIZ.LIZJ(), this.LIZIZ.LJFF());
            }
            if (this.LIZ.getTimeEffect() != null) {
                this.LIZ.getEffectList().add(this.LIZ.getTimeEffect());
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", this.LIZ.getCreationId());
            c0lab.LJ("shoot_way", this.LIZ.mShootWay);
            c0lab.LIZ(this.LIZ.getDraftId(), "draft_id");
            if (this.LIZ.getEffectList() != null) {
                StringBuilder sb = new StringBuilder();
                for (EffectPointModel effectPointModel : this.LIZ.getEffectList()) {
                    if (!TextUtils.isEmpty(effectPointModel.getName())) {
                        sb.append(effectPointModel.getName());
                        sb.append(",");
                    }
                }
                if (sb.length() > 0) {
                    c0lab.LJ("effect_name", sb.substring(0, sb.length() - 1));
                    return;
                }
                return;
            }
            return;
        }
        this.LIZ.setEffectList(new ArrayList<>(this.LJJJJIZL.dt()));
        this.LIZ.setTimeEffect(this.LJJIJIL);
        if (this.LIZ.getTimeEffect() != null) {
            this.LIZ.getEffectList().add(this.LIZ.getTimeEffect());
        }
    }

    public final void LJIIL(String str) {
        ArrayList<EffectPointModel> effectPointModels = this.LJIIIIZZ.getEffectPointModels();
        if (C0IKQ.LIZ(effectPointModels)) {
            return;
        }
        VEEditor.VEState state = this.LJJI.getState();
        C19557911fV c19557911fV = this.LJIIIIZZ;
        c19557911fV.LLILZLL.remove(c19557911fV.LIZJ(str));
        c19557911fV.LL.postInvalidate();
        if (effectPointModels.isEmpty()) {
            this.LIZLLL.setValue(C1452730nuJ.LIZLLL(0L));
            LJIL((int) this.LJJIFFI.LIZ(0L), false);
        } else {
            EffectPointModel effectPointModel = (EffectPointModel) ListProtector.get(effectPointModels, effectPointModels.size() - 1);
            int uiEndPoint = effectPointModel.getUiEndPoint();
            if (effectPointModel.isFromEnd() ^ this.LJJIFFI.LIZ) {
                uiEndPoint = this.LJJI.mo51if() - uiEndPoint;
            }
            LJIL(uiEndPoint, false);
            this.LIZLLL.setValue(C1452730nuJ.LIZLLL(uiEndPoint));
        }
        if (state == VEEditor.VEState.STARTED) {
            LJIIIZ();
        }
    }

    public final void LJIJI(boolean z) {
        if (z) {
            C786410Ut5.LJZL(0, this.LJIILL);
            C786410Ut5.LJZL(8, this.LJIIIZ);
            C19412810xC c19412810xC = this.LJIILLIIL;
            if (c19412810xC != null) {
                c19412810xC.LIZLLL();
                return;
            }
            return;
        }
        C19412810xC c19412810xC2 = this.LJIILLIIL;
        if (c19412810xC2 != null) {
            c19412810xC2.LIZJ();
        }
        C786410Ut5.LJZL(8, this.LJIILL);
        C786410Ut5.LJZL(0, this.LJIIIZ);
    }

    public final void LJIJJ(boolean z) {
        this.LJIJJLI.LJJIJ(z);
    }

    public final void LJJIFFI(boolean z) {
        C19394710uH c19394710uH;
        if (z) {
            c19394710uH = new C19394710uH(this.LJIJJLI.getSelectedTime(), 1);
        } else {
            c19394710uH = new C19394710uH(this.LJJI.mo51if(), 0);
        }
        this.LJJJJI.CQ2().setValue(c19394710uH);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19557811fU.LJIILLIIL(int, boolean):void");
    }

    public final void LJIL(int i, boolean z) {
        CutMultiVideoViewModel cutMultiVideoViewModel;
        C19557911fV c19557911fV = this.LJIIIIZZ;
        if (c19557911fV != null) {
            c19557911fV.LJII(i);
        }
        if (this.LJIJJLI != null && (cutMultiVideoViewModel = this.LJIL) != null && !z) {
            cutMultiVideoViewModel.LLILLL.setValue(Long.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJ(long j, long j2) {
        String key;
        EffectPointModel effectPointModel;
        LJJI();
        int currentItem = this.LJIJI.getCurrentItem();
        if (currentItem < this.LJJIJ.getCount()) {
            key = this.LJJIJ.LJJIJL(currentItem).getKey();
        } else {
            key = null;
        }
        if (C19558011fW.LIZJ(this.LJIJI, this.LJJIJ, LJIJJLI())) {
            C1452720nuI c1452720nuI = (C1452720nuI) this.LJ.getValue();
            if (c1452720nuI != null && (effectPointModel = this.LJJIJIL) != null) {
                int i = (int) j;
                effectPointModel.setStartPoint(i);
                int i2 = (int) j2;
                this.LJJIJIL.setEndPoint(i2);
                this.LJJIJIL.setUiStartPoint(i);
                this.LJJIJIL.setUiEndPoint(i2);
                this.LJ.setValue(C1452720nuI.LJFF(j, j2, c1452720nuI.LL));
                this.LIZLLL.setValue(C1452730nuJ.LIZLLL(j));
                EffectPointModel effectPointModel2 = this.LJJIJIL;
                if (effectPointModel2 != null && effectPointModel2.getKey() != null) {
                    String key2 = this.LJJIJIL.getKey();
                    this.LJJIL.LIZLLL.put(key2, Long.valueOf(j));
                    this.LJJIL.LJ.put(key2, Long.valueOf(Math.abs(j2 - j)));
                }
            } else {
                return;
            }
        } else if (C113I.LIZJ(key)) {
            C0EYM c0eym = new C0EYM();
            c0eym.LJI = 6;
            c0eym.LIZJ = j;
            c0eym.LIZLLL = j2;
            c0eym.LJ = j;
            c0eym.LJFF = j2;
            c0eym.LJII = this.LJJIFFI.LIZ;
            this.LIZJ.setValue(c0eym);
        }
        LJIIJ();
    }

    public final void LJIIZILJ(List<EffectPointModel> list, boolean z, boolean z2) {
        int i;
        this.LJIJJLI.LJJIJ(z);
        boolean z3 = !z;
        C19557911fV c19557911fV = this.LJIIIIZZ;
        if (z3) {
            i = 0;
        } else {
            i = 8;
        }
        int visibility = c19557911fV.getVisibility();
        c19557911fV.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c19557911fV);
        if (z) {
            if (!C0IKQ.LIZ(list)) {
                int uiStartPoint = ((EffectPointModel) ListProtector.get(list, 0)).getUiStartPoint();
                int uiEndPoint = ((EffectPointModel) ListProtector.get(list, 0)).getUiEndPoint();
                if (uiStartPoint >= 0 && uiEndPoint >= 0 && !this.LJIJJLI.LJJJ(uiStartPoint, uiEndPoint, false)) {
                    HandlerHook.viewPostDelay(this.LJIJJLI, new ARunnableS11S0102000_29(this, uiStartPoint, uiEndPoint, 0), 300L);
                }
                this.LJIJJLI.LJJIJIIJI(true, z2, null);
                return;
            }
            this.LJIJJLI.LJJIJIIJI(false, z2, null);
        }
    }
}
