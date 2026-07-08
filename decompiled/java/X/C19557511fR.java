package X;

import Y.ACListenerS163S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS11S0102000_29;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.vesdk.VEEditor;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.11fR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19557511fR {
    public static final int LJJLIIIJLLLLLLLZ = C366700EZg.LIZ(266.0d);
    public VideoPublishEditModel LIZ;
    public AbstractC364180EPo LIZIZ;
    public ReplayLiveData LIZJ;
    public MutableLiveData<C1452730nuJ> LIZLLL;
    public StoredLiveData LJ;
    public MutableLiveData<Boolean> LJFF;
    public SafeHandler LJII;
    public LifecycleOwner LJIIIIZZ;
    public C19557911fV LJIIIZ;
    public LinearLayout LJIIJ;
    public FrameLayout LJIIJJI;
    public FrameLayout LJIIL;
    public ImageView LJIILIIL;
    public TuxIconView LJIILJJIL;
    public RelativeLayout LJIILL;
    public TextView LJIILLIIL;
    public RelativeLayout LJIIZILJ;
    public LinearLayout LJIJ;
    public C19412810xC LJIJI;
    public TextView LJIJJ;
    public TextView LJIJJLI;
    public C0MS4 LJIL;
    public C19561511g5 LJJ;
    public C12UW LJJI;
    public CutMultiVideoViewModel LJJIFFI;
    public VEVideoCoverGeneratorImpl LJJII;
    public InterfaceC1452170ntP LJJIII;
    public C19559611fm LJJIIJ;
    public C19560811fy LJJIIJZLJL;
    public C19559011fg LJJIIZ;
    public int LJJIIZI;
    public RunnableC19558211fY LJJIJ;
    public RunnableC19558611fc LJJIJIIJI;
    public View LJJIJIIJIL;
    public C194364112k LJJIJIL;
    public C19EG LJJIJLIJ;
    public Scene LJJIL;
    public C113Z LJJIZ;
    public EffectPointModel LJJJ;
    public EffectPointModel LJJJI;
    public C1452720nuI LJJJIL;
    public ArrayList<EffectPointModel> LJJJJIZL;
    public ArrayList<EffectPointModel> LJJJJJ;
    public SafeHandler LJJJJL;
    public EditEffectVideoModel LJJJJLI;
    public InterfaceC19558511fb LJJJJLL;
    public C565780MGy LJJJJZ;
    public C19774712Yn LJJJJZI;
    public AObserverS231S0100000_29 LJJJLIIL;
    public final boolean LJJLIIIJ;
    public boolean LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public C194371112r LJJLIIIJJIZ;
    public InterfaceC524950KiL LJJLIIIJL;
    public final C19560011fq LJJLIIIJLJLI;
    public final MutableLiveData<Boolean> LJI = new MutableLiveData<>(Boolean.FALSE);
    public boolean LJJIJL = false;
    public final C19559311fj LJJJJ = new C19559311fj();
    public String LJJJJI = "";
    public int LJJJJJL = -1;
    public boolean LJJJLL = false;
    public boolean LJJJLZIJ = false;
    public boolean LJJJZ = false;
    public boolean LJJL = false;
    public boolean LJJLI = true;
    public boolean LJJLIIIIJ = true;

    public final void LJIIL() {
        this.LJJIJ = null;
        this.LJJIJIIJI = null;
        this.LJII.removeCallbacksAndMessages(null);
        this.LJJJJL.removeCallbacksAndMessages(null);
    }

    public final int LIZJ() {
        return this.LJJIII.getDuration();
    }

    public final int LIZLLL() {
        return this.LJIIZILJ.getHeight() == 0 ? (int) C12ES.LIZJ(52.0f, this.LJJIJLIJ) : this.LJIIZILJ.getHeight();
    }

    public final int LJ() {
        return (((ScreenUtils.getFullScreenHeight(this.LJJIJLIJ) - LIZLLL()) - this.LJJLIIIJJI) - ScreenUtils.getStatusBarHeight(this.LJJIJLIJ)) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LJJIJLIJ);
    }

    public final int LJFF() {
        return this.LJJIII.mo51if();
    }

    public final void LJI() {
        if (this.LIZIZ == null) {
            if (this.LIZ.isMultiVideoEdit()) {
                this.LIZIZ = new C574880Mgg(this.LJJIII, this.LIZ.getMultiEditVideoRecordData().curMultiEditVideoRecordData, this.LIZ.getPreviewInfo(), null);
            } else if (this.LIZ.isFastImport() || this.LIZ.isCutSameVideoType()) {
                this.LIZIZ = new C574840Mgc(this.LJJIII, this.LIZ.getPreviewInfo());
            } else {
                this.LIZIZ = new C574840Mgc(this.LJJIII, this.LIZ.getPreviewInfo());
            }
        }
    }

    public final void LJIIIIZZ() {
        if (this.LJJIII != null) {
            long jLIZIZ = this.LJJIIJ.LIZIZ();
            if ((this.LJJIIJ.LIZ || iLLL < LIZJ()) && (!this.LJJIIJ.LIZ || iLLL > 0)) {
                C19559311fj c19559311fj = this.LJJJJ;
                long j = iLLL;
                c19559311fj.LIZIZ = j;
                c19559311fj.LIZJ = jLIZIZ;
                this.LIZLLL.setValue(C1452730nuJ.LIZLLL(j));
            } else {
                this.LIZLLL.setValue(C1452730nuJ.LIZLLL(0L));
            }
            LJIIJ();
        }
        C1413450msx c1413450msx = C1413450msx.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        String str = this.LJJJJI;
        c1413450msx.getClass();
        C1413450msx.LJIIIZ(videoPublishEditModel, str, true);
    }

    public final void LJIIIZ() {
        this.LIZLLL.setValue(C1452730nuJ.LIZJ());
        ImageView imageView = this.LJIILIIL;
        if (imageView == null || imageView.getVisibility() == 0) {
            return;
        }
        C1462750oAT.LIZ(this.LJIILIIL, true);
        C786410Ut5.LJZI(0, this.LJIILIIL);
    }

    public final void LJIIJ() {
        this.LIZLLL.setValue(C1452730nuJ.LIZ());
        C1462750oAT.LIZ(this.LJIILIIL, false);
        ImageView imageView = this.LJIILIIL;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
    }

    public final void LJIIJJI() {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.LJI.getValue())) {
            return;
        }
        this.LIZIZ.prepare().LJ(new C19774512Yl(this, 6), C15O7.LJIIIIZZ, null);
        this.LJI.setValue(bool);
    }

    public final void LJIILL() {
        EffectPointModel effectPointModel = this.LJJJ;
        if (effectPointModel == null || CardStruct.IStatusCode.DEFAULT.equals(effectPointModel.getKey())) {
            this.LJIIIZ.LIZIZ(0, true);
            LJIJ(null, false, false);
            return;
        }
        if ("1".equals(this.LJJJ.getKey())) {
            this.LJIIIZ.LIZIZ(this.LJJIIZI, true);
            LJIJ(null, false, false);
            return;
        }
        LJIJJLI(true);
        ArrayList arrayList = new ArrayList();
        EffectPointModel effectPointModel2 = new EffectPointModel();
        int startPoint = this.LJJJ.getStartPoint();
        int endPoint = this.LJJJ.getEndPoint();
        effectPointModel2.setUiStartPoint(startPoint);
        effectPointModel2.setUiEndPoint(endPoint);
        arrayList.add(effectPointModel2);
        LJIJ(arrayList, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILLIIL() {
        this.LJJJJJ = new ArrayList<>(this.LJJJJIZL);
        EffectPointModel effectPointModel = this.LJJJ;
        if (effectPointModel != null) {
            this.LJJJI = effectPointModel.m190clone();
        }
        if (this.LJ.getValue() != 0) {
            this.LJJJIL = ((C1452720nuI) this.LJ.getValue()).clone();
        }
        EffectPointModel effectPointModel2 = this.LJJJI;
        if (effectPointModel2 == null || !effectPointModel2.getKey().equals("1")) {
            ((LiveData) this.LJJJJLI.LLJJIJI.getValue()).setValue(Boolean.FALSE);
        } else {
            ((LiveData) this.LJJJJLI.LLJJIJI.getValue()).setValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI() {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19557511fR.LJIJI():void");
    }

    public final void LJJI() {
        ((LiveData) this.LJJJJLI.LLJIJIL.getValue()).setValue(Float.valueOf(this.LJJI.getSelectedTime()));
        LJJIFFI(true);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.11fq] */
    public C19557511fR() {
        this.LJJLIIIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_edit_effect_panel_type", true) == 2;
        this.LJJLIIIJILLIZJL = false;
        this.LJJLIIIJLJLI = new InterfaceC362610EJn() { // from class: X.11fq
            @Override // X.InterfaceC362610EJn
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                C19557511fR c19557511fR = this.LL;
                if (i == 4) {
                    if (c19557511fR.LJJIJL) {
                        TextView textView = c19557511fR.LJIJJLI;
                        if (textView != null) {
                            textView.performClick();
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                c19557511fR.getClass();
                return false;
            }
        };
    }

    static {
        C366700EZg.LIZ(480.0d);
    }

    public final void LIZ(List<EffectCategoryResponse> list) {
        if (!list.isEmpty()) {
            this.LJJ.removeAllTabs();
            this.LJJ.setMaxTabModeForCount(list.size());
            for (int i = 0; i < list.size(); i++) {
                int i2 = C19561511g5.LLILZ;
                C19471311Fv c19471311Fv = new C19471311Fv(this.LJJIJLIJ);
                c19471311Fv.setText(((EffectCategoryResponse) ListProtector.get(list, i)).getName());
                c19471311Fv.LIZ(i, list.size());
                c19471311Fv.setTag(Integer.valueOf(i));
                C786410Ut5.sb(c19471311Fv, new ACListenerS163S0100000_29(this, 43));
                C19561511g5 c19561511g5 = this.LJJ;
                C12H3 c12h3NewTab = c19561511g5.newTab();
                c12h3NewTab.LJ = c19471311Fv;
                c12h3NewTab.LIZIZ();
                c19561511g5.addTab(c12h3NewTab);
            }
        }
    }

    public final void LIZIZ(List list) {
        boolean z;
        if (list == null) {
            list = new ArrayList();
        }
        boolean zLIZ = C574590MgD.LIZ();
        if (C574590MgD.LIZ() && !this.LIZ.isMvThemeVideoType()) {
            z = true;
        } else {
            z = false;
        }
        for (EffectCategoryResponse effectCategoryResponse : list) {
            C366400EYc c366400EYc = C366400EYc.LIZ;
            List<Effect> totalEffects = effectCategoryResponse.getTotalEffects();
            boolean z2 = this.LJJJZ;
            c366400EYc.getClass();
            C366400EYc.LJ(totalEffects, zLIZ, z, z2);
        }
        C366400EYc c366400EYc2 = C366400EYc.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        c366400EYc2.getClass();
        boolean z3 = !C366400EYc.LIZIZ(videoPublishEditModel);
        this.LJJLIIIIJ = z3;
        if (!z3) {
            LJIILIIL("sticker", list);
        }
        if (!this.LJJL) {
            LJIILIIL("motion", list);
        }
        if (this.LJJLI) {
            EffectCategoryResponse effectCategoryResponse2 = new EffectCategoryResponse();
            effectCategoryResponse2.setName(this.LJJIJLIJ.getString(2131849531));
            effectCategoryResponse2.setKey("time");
            list.add(effectCategoryResponse2);
        }
    }

    public final void LJII(boolean z) {
        if (z) {
            this.LIZ.setEffectList(new ArrayList<>(this.LJJJJLL.dt()));
            this.LIZ.setTimeEffect(this.LJJJ);
            if (this.LIZ.getTimeEffect() != null && this.LIZ.getTimeEffect().getKey().equals("1") && this.LJJJJLL.LIZIZ().getValue() != null) {
                this.LIZ.getPreviewInfo().updateReverseVideoContent(this.LIZIZ.LIZLLL(), this.LIZIZ.LIZJ(), this.LIZIZ.LJFF());
            }
            if (this.LIZ.getTimeEffect() != null) {
                this.LIZ.getEffectList().add(this.LIZ.getTimeEffect());
            }
            InterfaceC1452170ntP interfaceC1452170ntP = this.LJJIII;
            if (interfaceC1452170ntP instanceof C1463670oBx) {
                C366400EYc c366400EYc = C366400EYc.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LIZ;
                NLEModel model = ((C1463670oBx) interfaceC1452170ntP).LIZLLL().LIZ.getModel();
                c366400EYc.getClass();
                C366400EYc.LJI(model, videoPublishEditModel, null);
            }
            C1413450msx c1413450msx = C1413450msx.LIZ;
            VideoPublishEditModel videoPublishEditModel2 = this.LIZ;
            c1413450msx.getClass();
            C1413450msx.LJIILJJIL(videoPublishEditModel2, null);
            return;
        }
        this.LIZ.setEffectList(new ArrayList<>(this.LJJJJLL.dt()));
        this.LIZ.setTimeEffect(this.LJJJ);
        if (this.LIZ.getTimeEffect() == null) {
            return;
        }
        this.LIZ.getEffectList().add(this.LIZ.getTimeEffect());
    }

    public final void LJIJJ(boolean z) {
        if (z) {
            C786410Ut5.LJZL(0, this.LJIJ);
            C786410Ut5.LJZL(8, this.LJIIJ);
            C19412810xC c19412810xC = this.LJIJI;
            if (c19412810xC != null) {
                c19412810xC.LIZLLL();
                return;
            }
            return;
        }
        C19412810xC c19412810xC2 = this.LJIJI;
        if (c19412810xC2 != null) {
            c19412810xC2.LIZJ();
        }
        C786410Ut5.LJZL(8, this.LJIJ);
        C786410Ut5.LJZL(0, this.LJIIJ);
    }

    public final void LJIJJLI(boolean z) {
        this.LJJI.LJJIJ(z);
    }

    public final void LJJIFFI(boolean z) {
        C19394710uH c19394710uH;
        if (z) {
            c19394710uH = new C19394710uH(this.LJJI.getSelectedTime(), 1);
        } else {
            c19394710uH = new C19394710uH(LJFF(), 0);
        }
        this.LJJJJLI.CQ2().setValue(c19394710uH);
    }

    public static void LJIILIIL(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            if (ListProtector.get(list, i) != null && ((EffectCategoryResponse) ListProtector.get(list, i)).getKey().startsWith(str)) {
                if (i != -1) {
                    ListProtector.remove(list, i);
                    return;
                }
                return;
            }
        }
    }

    public final void LJIILJJIL(long j, String str) {
        if (C0IKQ.LIZ(this.LJIIIZ.getEffectPointModels())) {
            return;
        }
        VEEditor.VEState state = this.LJJIII.getState();
        C19557911fV c19557911fV = this.LJIIIZ;
        c19557911fV.LLILZLL.remove(c19557911fV.LIZJ(str));
        c19557911fV.LL.postInvalidate();
        LJIL((int) j, false);
        this.LIZLLL.setValue(C1452730nuJ.LIZLLL(j));
        if (state == VEEditor.VEState.STARTED) {
            LJIIIZ();
        }
    }

    public final void LJIL(int i, boolean z) {
        CutMultiVideoViewModel cutMultiVideoViewModel;
        C19557911fV c19557911fV = this.LJIIIZ;
        if (c19557911fV != null) {
            c19557911fV.LJII(i);
        }
        if (this.LJJI != null && (cutMultiVideoViewModel = this.LJJIFFI) != null && !z) {
            cutMultiVideoViewModel.LLILLL.setValue(Long.valueOf(i));
        }
        if (this.LJJJJLI != null && this.LJJIIJ != null) {
            if (i >= this.LJJIII.getDuration()) {
                this.LJJJJLI.LLJJJ = true;
            } else {
                this.LJJJJLI.LLJJJ = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(int r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19557511fR.LJIIZILJ(int, boolean, boolean):void");
    }

    public final void LJIJ(List<EffectPointModel> list, boolean z, boolean z2) {
        int i;
        this.LJJI.LJJIJ(z);
        boolean z3 = !z;
        C19557911fV c19557911fV = this.LJIIIZ;
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
                if (uiStartPoint >= 0 && uiEndPoint >= 0 && !this.LJJI.LJJJ(uiStartPoint, uiEndPoint, false)) {
                    HandlerHook.viewPostDelay(this.LJJI, new ARunnableS11S0102000_29(this, uiStartPoint, uiEndPoint, 1), 300L);
                }
                this.LJJI.LJJIJIIJI(true, z2, null);
                return;
            }
            this.LJJI.LJJIJIIJI(false, z2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(long r9, long r11, boolean r13) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19557511fR.LJJ(long, long, boolean):void");
    }
}
