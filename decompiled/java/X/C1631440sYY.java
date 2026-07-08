package X;

import Y.AObjectS246S0100000_25;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lnn.q;
import lth.o;

/* JADX INFO: renamed from: X.0sYY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631440sYY extends AbstractC2255721DQs<InterfaceC1652700t6q> implements InterfaceC1652700t6q, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1652700t6q LLILLL = this;
    public final a LLILZ = (a) getDiContainer().LJII(a.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1649530t1j.class, null);
    public final q LLILZLL = (q) getDiContainer().LJII(q.class, null);
    public final ShortVideoContext LLIZ = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), C565600MGg.class, null);
    public final C538770LBb<Boolean> LLJI = new C538770LBb<>(Boolean.TRUE);
    public boolean LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1631440sYY.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1631440sYY.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1631440sYY.class, "componentizationConfig", "getComponentizationConfig()Lcom/ss/android/ugc/aweme/shortvideo/ui/RecordContainerComponentizationConfig;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJILJILJ = 8;
    }

    private final InterfaceC1649530t1j Z1() {
        return (InterfaceC1649530t1j) this.LLILZIL.getValue(this, LLJILJIL[0]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJILJIL[1]);
    }

    private final C565600MGg getComponentizationConfig() {
        return (C565600MGg) this.LLJ.getValue(this, LLJILJIL[2]);
    }

    private final void o2() {
        String missionId;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C1624570sNT.LIZIZ(this.LLIZ.presetEffectId));
        List<String> list = this.LLIZ.creativeModel.recordEffectModel.effectReuseFlowStickerIds;
        if (list != null) {
            arrayList.addAll(list);
        }
        Mission mission = this.LLIZ.creativeModel.commerceModel.getMission();
        if (mission == null || (missionId = mission.getMissionId()) == null) {
            missionId = "";
        }
        l5a.a.LIZIZ.LIZIZ(this.LLIZ.getCreationId(), new C1429980nJc(EnumC1429920nJW.ENTER_RECORD, this.LLIZ, Collections.singletonList(new C1429950nJZ(arrayList, missionId, this.LLIZ.creativeModel.commerceModel.getRecordChallenge()))), getActivity());
    }

    @Override // X.InterfaceC1652700t6q
    public void bs1() {
        FaceStickerBean faceStickerBeanJr = this.LLILZLL.jr();
        if (faceStickerBeanJr != null && C1631030sXt.LIZ(faceStickerBeanJr)) {
            Z1().p7(false);
        }
        refresh();
    }

    public final void refresh() {
        FaceStickerBean faceStickerBeanJr = this.LLILZLL.jr();
        boolean z = false;
        boolean zLIZ = faceStickerBeanJr != null ? C1631030sXt.LIZ(faceStickerBeanJr) : false;
        if (!this.LLJIJIL || !zLIZ || !this.LLJI.LIZJ().booleanValue()) {
            C1658150tFd.LIZIZ(this.LL, "RecordCommerceTagScene");
            return;
        }
        if (((Boolean) C0APZ.LIZ.getValue()).booleanValue() && this.LL.findSceneByTag("RecordCommerceTagScene") == null) {
            C1658150tFd.LIZ(this.LL, R.id.sz5, new C1166950gTN(this.LLILZ.va()), "RecordCommerceTagScene");
        }
        final C1166950gTN c1166950gTN = (C1166950gTN) this.LL.findSceneByTag("RecordCommerceTagScene");
        if (c1166950gTN != null) {
            ShortVideoContext shortVideoContext = this.LLIZ;
            final FaceStickerBean faceStickerBeanJr2 = this.LLILZLL.jr();
            String str = this.LLIZ.shootWay;
            final C1631420sYW c1631420sYW = new C1631420sYW(faceStickerBeanJr2, str);
            if (faceStickerBeanJr2 == null || !C1631030sXt.LIZ(faceStickerBeanJr2)) {
                ((C19A3) c1166950gTN.mParentScene).hide(c1166950gTN);
                return;
            }
            ((C19A3) c1166950gTN.mParentScene).show(c1166950gTN);
            final FaceStickerCommerceBean faceStickerCommerceBean = faceStickerBeanJr2.getFaceStickerCommerceBean();
            final CommerceToolsModel commerceToolsModel = shortVideoContext.creativeModel.commerceModel;
            if (!commerceToolsModel.isShowedCommerceTransformBottomButton()) {
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C0LAB c0lab = new C0LAB();
                c0lab.LIZIZ(faceStickerBeanJr2.getStickerId(), "prop_id");
                c0lab.LJ("shoot_way", str);
                c0lab.LJ("carrier_type", "video_shoot_page");
                C2341909Fp.LIZ("show_transform_link", c0lab.LIZ);
                z = true;
            }
            faceStickerBeanJr2.getStickerId();
            TuxTextView tuxTextView = c1166950gTN.LLJILJIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            tuxTextView.setText(faceStickerCommerceBean.commerceStickerBuyText);
            LinearLayout linearLayout = c1166950gTN.LLJIJIL;
            if (linearLayout == null) {
                linearLayout = null;
            }
            C786410Ut5.R7(linearLayout, new View.OnClickListener() { // from class: X.0sYV
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    commerceToolsModel.setShowedCommerceTransformButton(true);
                    commerceToolsModel.setShowedCommerceTransformBottomButton(false);
                    List<InterfaceC2342209Fs> list2 = C2341909Fp.LIZ;
                    C0LAB c0lab2 = new C0LAB();
                    c0lab2.LIZIZ(faceStickerBeanJr2.getStickerId(), "prop_id");
                    c0lab2.LJ("shoot_way", c1631420sYW.LIZ);
                    c0lab2.LJ("carrier_type", "video_shoot_page");
                    C2341909Fp.LIZ("click_transform_link", c0lab2.LIZ);
                    InterfaceC1631430sYX interfaceC1631430sYX = o.LJIIIZ;
                    Activity activityRequireActivity = c1166950gTN.requireActivity();
                    String str2 = faceStickerCommerceBean.commerceStickerOpenUrl;
                    interfaceC1631430sYX.getClass();
                    if (!((ICommercializeFromMainOutService) PluggableExtentionKt.pluggableSpi(ICommercializeFromMainOutService.class)).LIZ(activityRequireActivity, str2)) {
                        InterfaceC1631430sYX interfaceC1631430sYX2 = o.LJIIIZ;
                        Activity activityRequireActivity2 = c1166950gTN.requireActivity();
                        C1166950gTN c1166950gTN2 = c1166950gTN;
                        String string = faceStickerCommerceBean.commerceStickerWebUrl;
                        String strValueOf = String.valueOf(faceStickerBeanJr2.getStickerId());
                        c1166950gTN2.getClass();
                        if (!TextUtils.isEmpty(string)) {
                            Uri.Builder builderAppendQueryParameter = UriProtector.parse(string).buildUpon().appendQueryParameter("enter_from", "commerce_sticker_button");
                            if (TextUtils.isEmpty(strValueOf)) {
                                strValueOf = "";
                            }
                            string = builderAppendQueryParameter.appendQueryParameter("sticker_id", strValueOf).build().toString();
                        }
                        interfaceC1631430sYX2.getClass();
                        ((ICommercializeFromMainOutService) PluggableExtentionKt.pluggableSpi(ICommercializeFromMainOutService.class)).openAdWebUrl(activityRequireActivity2, string, null);
                    }
                }
            });
            if (z) {
                CommerceToolsModel commerceToolsModel2 = this.LLIZ.creativeModel.commerceModel;
                commerceToolsModel2.setShowedCommerceTransformButton(true);
                commerceToolsModel2.setShowedCommerceTransformBottomButton(true);
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (!((Boolean) C0APZ.LIZ.getValue()).booleanValue()) {
            C1658150tFd.LIZ(this.LL, R.id.sz5, new C1166950gTN(this.LLILZ.va()), "RecordCommerceTagScene");
        }
        this.LLJI.LIZ(this, new AObjectS246S0100000_25(this, 422));
        this.LLILZ.RS().LIZ(this, new AObjectS246S0100000_25(this, 423));
        this.LLILZLL.Ma2().LIZ(this, new AObjectS246S0100000_25(this, 424));
        this.LLILZLL.dN1().LIZ(this, new AObjectS246S0100000_25(this, 425));
        C565600MGg componentizationConfig = getComponentizationConfig();
        if (componentizationConfig == null || !componentizationConfig.LIZ) {
            return;
        }
        C1429380nIe.LIZ = false;
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        if (this.LL.findSceneByTag("RecordCommerceTagScene") != null) {
            FaceStickerBean.NONE.getStickerId();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C565600MGg componentizationConfig = getComponentizationConfig();
        if (componentizationConfig == null || !componentizationConfig.LIZ) {
            return;
        }
        o2();
    }

    public InterfaceC1652700t6q W1() {
        return this.LLILLL;
    }

    public final C19A3 X1() {
        return this.LL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1652700t6q
    public void hV1(boolean z) {
        this.LLJI.LJII(Boolean.valueOf(z));
    }

    public final void w2(Effect effect) {
        bs1();
    }

    public C1631440sYY(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }
}
