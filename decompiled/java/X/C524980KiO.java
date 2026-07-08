package X;

import Y.ACListenerS112S0200000_8;
import Y.ACListenerS143S0100000_8;
import Y.ARunnableS108S0100000_8;
import Y.ARunnableS13S1200000_8;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.autopick.api.AutoPickServiceApi;
import com.ss.android.ugc.aweme.creative.model.AutoPickMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoPickModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS58S0210000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0KiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524980KiO extends AbstractC2255721DQs<InterfaceC522380KeC> implements InterfaceC522380KeC, InterfaceC379610EuV, InterfaceC484050IyZ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final C1DRG LL;
    public final InterfaceC522380KeC LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C530020KqW.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), ChooseMediaViewModel.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), C524000Kgo.class, null);
    public InterfaceC524950KiL LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public List<? extends TikTokMediaModel> LLJIJIL;
    public Map<String, LivePhotoInfo> LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C524980KiO.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C524980KiO.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C524980KiO.class, "mediaModelFactory", "getMediaModelFactory()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/model/TikTokMediaModelFactory;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C524980KiO.class, "chooseMediaViewModel", "getChooseMediaViewModel()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/ChooseMediaViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C524980KiO.class, "selectMaterialContext", "getSelectMaterialContext()Lcom/ss/android/ugc/aweme/shortvideo/album/SelectMaterialContext;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJILLL = 8;
    }

    private final ChooseMediaViewModel T2() {
        return (ChooseMediaViewModel) this.LLILZLL.getValue(this, LLJILJILJ[3]);
    }

    private final void Z4() {
        View viewFindViewById;
        LinearLayout linearLayout;
        boolean z;
        String string;
        int i;
        float f;
        VideoImageMixedController videoImageMixedController;
        LinearLayout.LayoutParams layoutParams;
        View viewFindViewById2 = q3().findViewById(R.id.oic);
        if (viewFindViewById2 == null || (viewFindViewById = viewFindViewById2.findViewById(R.id.wpy)) == null) {
            return;
        }
        ViewParent parent = viewFindViewById.getParent();
        if (!(parent instanceof LinearLayout) || (linearLayout = (LinearLayout) parent) == null) {
            return;
        }
        int childCount = linearLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C786410Ut5.LJLLLLLL(8, linearLayout.getChildAt(i2));
        }
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        }
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams3) != null) {
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
        linearLayout.setPadding(0, 0, 0, 0);
        C786410Ut5.d6(linearLayout, linearLayout.getLayoutParams());
        Context context = linearLayout.getContext();
        boolean zLIZ = C0C1J.LIZ();
        AutoPickServiceApi autoPickServiceApi = (AutoPickServiceApi) PluggableExtentionKt.pluggableSpi$default(AutoPickServiceApi.class, false, false, false, 14, null);
        if (autoPickServiceApi == null || !autoPickServiceApi.LJII()) {
            z = false;
            string = context.getString(R.string.creation_autocut_entry_point);
        } else {
            z = true;
            Integer numValueOf = Integer.valueOf(C786410Ut5.n3(context.getResources(), "pickForMe_album_pickingModal_ctaAutoCut", "string", context.getPackageName()));
            if (numValueOf.intValue() == 0 || (string = context.getString(numValueOf.intValue())) == null) {
                string = "AI AutoCut";
            }
        }
        C197039127h c197039127h = new C197039127h(context, null, 6, 0);
        c197039127h.LJJLI(true);
        c197039127h.setButtonSize(2);
        c197039127h.setText(string);
        if (zLIZ) {
            i = 0;
            f = 1.0f;
        } else {
            i = -1;
            f = 0.0f;
        }
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i, -1, f);
        layoutParams4.setMarginEnd(zLIZ ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) : 0);
        C786410Ut5.J6(c197039127h, layoutParams4);
        c197039127h.setButtonStartIcon(Integer.valueOf(z ? R.raw.icon_ai_autocut : R.raw.icon_autocut_clapperboard));
        if (z) {
            c197039127h.LJJJJL(new AwS58S0210000_4(context, zLIZ, zLIZ ? C960203pA.LIZIZ(context) ? C525030KiT.LIZJ : C525030KiT.LIZIZ : C525030KiT.LIZ, 0));
            c197039127h.setIconTintColorRes(R.attr.z_);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.asr, context);
            c197039127h.setTextColor(numLIZJ != null ? numLIZJ.intValue() : -16777216);
        } else {
            c197039127h.LJJJJL(null);
            c197039127h.setButtonVariant(1);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
            int iIntValue = numLIZJ2 != null ? numLIZJ2.intValue() : -1;
            if (!C960203pA.LIZIZ(context)) {
                iIntValue = -119723;
            }
            c197039127h.setIconTintColor(iIntValue);
        }
        C786410Ut5.U8(c197039127h, new ACListenerS143S0100000_8(this, 57));
        linearLayout.addView(c197039127h);
        if (zLIZ) {
            C197039127h c197039127h2 = new C197039127h(context, null, 6, 0);
            c197039127h2.setText(context.getString(R.string.m6n));
            c197039127h2.LJJLI(true);
            c197039127h2.setButtonVariant(0);
            c197039127h2.setButtonSize(3);
            C786410Ut5.J6(c197039127h2, new LinearLayout.LayoutParams(0, -1, 1.0f));
            C786410Ut5.U8(c197039127h2, new ACListenerS112S0200000_8(this, viewFindViewById, 3));
            linearLayout.addView(c197039127h2);
        }
        InterfaceC522120Kdm interfaceC522120Kdm = q3().videoImageMixedController;
        if ((interfaceC522120Kdm instanceof VideoImageMixedController) && (videoImageMixedController = (VideoImageMixedController) interfaceC522120Kdm) != null) {
            videoImageMixedController.LLLLIILL = true;
            videoImageMixedController.LLLLIILLL = new AwS552S0100000_8(this, 249);
        }
        q3().configureAutoPickFragmentAdapters$tools_camera_record_release(new ARunnableS108S0100000_8(this, 36));
        C201955140j.LJIILJJIL(C533790Kwb.LIZIZ, "AutoPickPreview [addMedia] setupAutoPickAddMediaDock done");
    }

    private final C530020KqW i3() {
        return (C530020KqW) this.LLILZIL.getValue(this, LLJILJILJ[2]);
    }

    private final AbstractC214814194y m3() {
        return (AbstractC214814194y) this.LLILLL.getValue(this, LLJILJILJ[0]);
    }

    private final C524000Kgo v3() {
        return (C524000Kgo) this.LLIZ.getValue(this, LLJILJILJ[4]);
    }

    @Override // X.InterfaceC522380KeC
    public void Kf2() {
        C19EG c19eg;
        Context contextLIZIZ = C545820Lau.LIZIZ(q3());
        if (!(contextLIZIZ instanceof C19EG) || (c19eg = (C19EG) contextLIZIZ) == null) {
            return;
        }
        if (C1447800nmM.LIZ(q3()) == null) {
            C1AF0.LIZIZ();
            return;
        }
        final AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(this, c19eg, 35);
        if (C0CIU.LIZJ()) {
            awS409S0200000_8.invoke();
            return;
        }
        C523800KgU c523800KgU = new C523800KgU();
        c523800KgU.LIZ = "bpea-tools_request_storage_permission_manual_click_upload_target34";
        c523800KgU.LIZIZ = "bpea-tools_request_storage_permission_manual_click_upload_target33";
        c523800KgU.LIZJ = "bpea-tools_request_storage_permission_manual_click_upload";
        C540290LGx.LJ(C540290LGx.LIZ, c19eg, getShortVideoContext(), new C0LH5() { // from class: X.0KhG
            @Override // X.C0LH5
            public final void LIZ(int[] iArr, String[] strArr) {
                Integer numValueOf;
                RecordPageOptionalConfig recordPageOptionalConfig = this.LIZ.getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
                if (recordPageOptionalConfig != null) {
                    numValueOf = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
                } else {
                    numValueOf = null;
                }
                C539630LEj.LIZIZ(numValueOf, C0L9X.SUCCESS);
                awS409S0200000_8.invoke();
            }
        }, null, new AwS552S0100000_8(this, 247), new AwS552S0100000_8(this, 248), null, null, false, false, false, false, false, null, null, c523800KgU.LIZ().LIZ(), false, 94152);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZ.getValue(this, LLJILJILJ[1]);
    }

    @Override // X.InterfaceC522380KeC
    public void hT() {
        InterfaceC524180Kh6 interfaceC524180Kh6LIZLLL;
        String creationId;
        AutoPickServiceApi autoPickServiceApi = (AutoPickServiceApi) PluggableExtentionKt.pluggableSpi$default(AutoPickServiceApi.class, false, false, false, 14, null);
        if (autoPickServiceApi != null) {
            CreativeInfo creativeInfo = getShortVideoContext().creativeInfo;
            autoPickServiceApi.LJIIIIZZ(creativeInfo != null ? creativeInfo.getCreationId() : null, getShortVideoContext().shootWay, getShortVideoContext().enterFrom);
        }
        AutoPickServiceApi autoPickServiceApi2 = (AutoPickServiceApi) PluggableExtentionKt.pluggableSpi$default(AutoPickServiceApi.class, false, false, false, 14, null);
        if (autoPickServiceApi2 == null || (interfaceC524180Kh6LIZLLL = autoPickServiceApi2.LIZLLL()) == null) {
            return;
        }
        MvChoosePhotoScene mvChoosePhotoSceneQ3 = q3();
        CreativeInfo creativeInfo2 = getShortVideoContext().creativeInfo;
        if (creativeInfo2 == null || (creationId = creativeInfo2.getCreationId()) == null) {
            creationId = "";
        }
        String str = getShortVideoContext().shootWay;
        if (str == null) {
            str = "";
        }
        String str2 = getShortVideoContext().enterFrom;
        interfaceC524180Kh6LIZLLL.LIZIZ(mvChoosePhotoSceneQ3, new C00EW(creationId, str, str2 != null ? str2 : ""), new AwS552S0100000_8(this, 246), AFwS194S0000000_8.get$arr$(149));
    }

    @Override // X.InterfaceC522380KeC
    public void jC0() {
        List<TikTokMediaModel> listLIZJ;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickPreview [onPanelClose] called, previewActive=");
        sbLIZ.append(kt1());
        sbLIZ.append(", selectedCount=");
        InterfaceC522120Kdm interfaceC522120Kdm = q3().videoImageMixedController;
        sbLIZ.append((interfaceC522120Kdm == null || (listLIZJ = interfaceC522120Kdm.LIZJ()) == null) ? null : Integer.valueOf(listLIZJ.size()));
        C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
        Hd2(false);
        Sv2(false);
        qS();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC524950KiL interfaceC524950KiL = this.LLIZLLLIL;
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.T4(this);
        }
        this.LLIZLLLIL = null;
        super.onDestroy();
    }

    private final String E3() {
        String creationId = getShortVideoContext().getCreationId();
        if (creationId == null && (creationId = q3().creativeInfo.getCreationId()) == null) {
            creationId = "no_creation_id";
        }
        String str = getShortVideoContext().creativeModel.autoPickModel.clusterId;
        if (str == null) {
            str = "no_cluster_id";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(creationId);
        sbLIZ.append('#');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H3() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r5.q3()
            androidx.viewpager.widget.ViewPager r0 = r0.viewPager
            r4 = 0
            if (r0 == 0) goto Lb1
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r1 = r5.q3()
            int r0 = r0.getCurrentItem()
            com.bytedance.scene.group.UserVisibleHintGroupScene r1 = r1.currentFragment$tools_camera_record_release(r0)
            boolean r0 = r1 instanceof X.AbstractC528270Knh
            if (r0 == 0) goto Lb1
            X.0Knh r1 = (X.AbstractC528270Knh) r1
            if (r1 == 0) goto Lb1
            X.0Kq4 r0 = r1.LLJJJ
            if (r0 != 0) goto La8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L26:
            boolean r0 = r5.fP0()
            if (r0 == 0) goto La5
            java.lang.String r0 = "on_pause"
            java.util.List r0 = r5.HB1(r0)
            java.util.List r2 = r5.e4(r0)
        L36:
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isAutoPickAddMedia="
            r3.append(r0)
            boolean r0 = r5.fP0()
            r3.append(r0)
            java.lang.String r0 = " currentAdapter="
            r3.append(r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r5.q3()
            X.0Kdm r0 = r0.videoImageMixedController
            if (r0 == 0) goto La3
            java.util.ArrayList r0 = r0.LJIL()
        L57:
            java.lang.String r0 = r5.qJ2(r0)
            r3.append(r0)
            java.lang.String r0 = " currentSelected="
            r3.append(r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r5.q3()
            X.0Kdm r0 = r0.videoImageMixedController
            if (r0 == 0) goto L6f
            java.util.List r4 = r0.LIZJ()
        L6f:
            java.lang.String r0 = r5.qJ2(r4)
            r3.append(r0)
            java.lang.String r0 = " fragmentSelected="
            r3.append(r0)
            java.lang.String r0 = r5.qJ2(r1)
            r3.append(r0)
            java.lang.String r0 = " latest="
            r3.append(r0)
            java.lang.String r0 = r5.qJ2(r2)
            r3.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r3)
            java.lang.String r0 = "onPause"
            r5.logDebug(r0, r1)
            boolean r0 = r5.fP0()
            if (r0 == 0) goto La2
            java.lang.String r0 = "add_media_album_pause"
            r5.SU(r2, r0)
        La2:
            return
        La3:
            r0 = r4
            goto L57
        La5:
            X.13BV r2 = X.C13BV.INSTANCE
            goto L36
        La8:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r0.LLJ
            r1.<init>(r0)
            goto L26
        Lb1:
            X.13BV r1 = X.C13BV.INSTANCE
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C524980KiO.H3():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void O3() {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C524980KiO.O3():void");
    }

    private final List<TikTokMediaModel> c3() {
        AbstractC528270Knh abstractC528270Knh;
        ViewPager viewPager = q3().viewPager;
        if (viewPager != null) {
            UserVisibleHintGroupScene userVisibleHintGroupSceneCurrentFragment$tools_camera_record_release = q3().currentFragment$tools_camera_record_release(viewPager.getCurrentItem());
            if ((userVisibleHintGroupSceneCurrentFragment$tools_camera_record_release instanceof AbstractC528270Knh) && (abstractC528270Knh = (AbstractC528270Knh) userVisibleHintGroupSceneCurrentFragment$tools_camera_record_release) != null) {
                C529740Kq4 c529740Kq4 = abstractC528270Knh.LLJJJ;
                return c529740Kq4 == null ? new ArrayList() : new ArrayList(c529740Kq4.LLJ);
            }
        }
        return C13BV.INSTANCE;
    }

    public final void d5() {
        Context contextLIZIZ = C545820Lau.LIZIZ(q3());
        if (contextLIZIZ != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131833394);
            C1390380mHk.LIZJ(contextLIZIZ, 1062, creativeToastBuilder);
        }
    }

    @Override // X.InterfaceC522380KeC
    public boolean fP0() {
        ArrayList<String> stringArrayList;
        Bundle bundle = q3().mArguments;
        return (bundle == null || (stringArrayList = bundle.getStringArrayList("key_auto_pick_pre_selected_media_ids")) == null || !(stringArrayList.isEmpty() ^ true)) ? false : true;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC524950KiL interfaceC524950KiLLIZ = q3().avListenableActivityRegistry;
        if (interfaceC524950KiLLIZ == null) {
            interfaceC524950KiLLIZ = C0MWZ.LIZ(q3());
        }
        this.LLIZLLLIL = interfaceC524950KiLLIZ;
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.Qh(this);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        H3();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        O3();
    }

    public final MvChoosePhotoScene q3() {
        return (MvChoosePhotoScene) m3();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // X.InterfaceC522380KeC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void qS() {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C524980KiO.qS():void");
    }

    @Override // X.InterfaceC522380KeC
    public boolean FY() {
        return this.LLJ;
    }

    public InterfaceC522380KeC H2() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC522380KeC
    public boolean kt1() {
        return this.LLJI;
    }

    @Override // X.InterfaceC522380KeC
    public List<TikTokMediaModel> pF0() {
        return this.LLJIJIL;
    }

    public C524980KiO(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final List<TikTokMediaModel> F4(String str) {
        boolean z;
        String strQJ2;
        ArrayList<TikTokMediaModel> arrayList;
        String strE3 = E3();
        C525000KiQ c525000KiQ = C525390Kj3.LIZ.get(strE3);
        C525000KiQ c525000KiQ2 = null;
        if (c525000KiQ != null) {
            c525000KiQ2 = new C525000KiQ(c525000KiQ.LIZIZ, c525000KiQ.LIZJ, C525390Kj3.LIZ(c525000KiQ.LIZ));
        }
        StringBuilder sb = new StringBuilder("source=");
        sb.append(str);
        sb.append(" sessionKey=");
        sb.append(strE3);
        sb.append(" found=");
        if (c525000KiQ2 != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(' ');
        if (c525000KiQ2 == null || (strQJ2 = qJ2(c525000KiQ2.LIZ)) == null) {
            strQJ2 = "";
        }
        sb.append(strQJ2);
        logDebug("peekAutoPickTransferSnapshot", sb.toString());
        if (c525000KiQ2 == null || (arrayList = c525000KiQ2.LIZ) == null) {
            return C13BV.INSTANCE;
        }
        return arrayList;
    }

    private final String G2(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -658897792) {
            if (iHashCode != -318184504) {
                if (iHashCode != 337546950 || !str.equals("add_media")) {
                    return "aipick_edit_page";
                }
                return "upload_page";
            }
            if (!str.equals("preview")) {
                return "aipick_edit_page";
            }
        } else if (!str.equals("nested_preview")) {
            return "aipick_edit_page";
        }
        if (!fP0()) {
            return "aipick_edit_page";
        }
        return "upload_preview_page";
    }

    private final List<TikTokMediaModel> P4(String str) {
        int i;
        List<AutoPickMediaModel> list = getShortVideoContext().creativeModel.autoPickModel.mediaList;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("source=");
            sbLIZ.append(str);
            sbLIZ.append(" persistedEmpty=true");
            logDebug("restoreAutoPickSelectedMediasFromPersistedOutput", C2188811AlT.LIZIZ(sbLIZ));
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (AutoPickMediaModel autoPickMediaModel : list) {
            if (!a0.LJJJIL(autoPickMediaModel.resId) && !a0.LJJJIL(autoPickMediaModel.filePath)) {
                MediaModel mediaModel = new MediaModel(autoPickMediaModel.resId);
                mediaModel.LJIILL(autoPickMediaModel.filePath);
                String str2 = autoPickMediaModel.filePath;
                mediaModel.originLocalUriPath = str2;
                mediaModel.width = autoPickMediaModel.width;
                mediaModel.height = autoPickMediaModel.height;
                mediaModel.duration = autoPickMediaModel.duration;
                mediaModel.thumbnail = str2;
                if (autoPickMediaModel.isVideoType) {
                    i = 4;
                } else {
                    i = 1;
                }
                mediaModel.type = i;
                C527240Km2 c527240Km2 = TikTokMediaModel.Companion;
                C530020KqW c530020KqWI3 = i3();
                c527240Km2.getClass();
                TikTokMediaModel tikTokMediaModelLIZJ = C527240Km2.LIZJ(c530020KqWI3, mediaModel);
                if (tikTokMediaModelLIZJ != null) {
                    arrayList.add(tikTokMediaModelLIZJ);
                }
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("source=");
        sbLIZ2.append(str);
        sbLIZ2.append(" persistedCount=");
        sbLIZ2.append(list.size());
        sbLIZ2.append(" restored=");
        sbLIZ2.append(qJ2(arrayList));
        logDebug("restoreAutoPickSelectedMediasFromPersistedOutput", C2188811AlT.LIZIZ(sbLIZ2));
        return arrayList;
    }

    private final Intent X1(String str) {
        List<TikTokMediaModel> listHB1 = HB1(str);
        if (listHB1.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("source=");
            sbLIZ.append(str);
            sbLIZ.append(" skip empty latest medias");
            logDebug("buildAutoPickAddMediaResultIntent", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        List<TikTokMediaModel> listE4 = e4(listHB1);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_result");
        SU(listE4, C2188811AlT.LIZIZ(sbLIZ2));
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("key_auto_pick_result_media_list", new ArrayList<>(listE4));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("source=");
        sbLIZ3.append(str);
        sbLIZ3.append(' ');
        sbLIZ3.append(qJ2(listE4));
        logDebug("buildAutoPickAddMediaResultIntent", C2188811AlT.LIZIZ(sbLIZ3));
        return intent;
    }

    private final Map<String, LivePhotoInfo> Z1(List<? extends TikTokMediaModel> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (TikTokMediaModel tikTokMediaModel : list) {
            LivePhotoInfo livePhotoInfo = tikTokMediaModel.livePhotoInfo;
            if (tikTokMediaModel.LJIIJJI() && livePhotoInfo != null) {
                linkedHashMap.put(((MediaModel) tikTokMediaModel).id, livePhotoInfo.copy(livePhotoInfo.videoPath, livePhotoInfo.videoDuration, livePhotoInfo.livePhotoPreviewModeStr, livePhotoInfo.hasUserClickedIcon));
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            return null;
        }
        return linkedHashMap;
    }

    private final List<TikTokMediaModel> e4(List<? extends TikTokMediaModel> list) {
        List listNR2;
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ChooseMediaViewModel chooseMediaViewModelT2 = T2();
        if (chooseMediaViewModelT2 == null || (listNR2 = chooseMediaViewModelT2.nR2()) == null) {
            listNR2 = C13BV.INSTANCE;
        }
        return C524990KiP.LIZ(false, list, listNR2, this.LLJILJIL);
    }

    private final void n5(List<? extends TikTokMediaModel> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (TikTokMediaModel tikTokMediaModel : list) {
            LivePhotoInfo livePhotoInfo = tikTokMediaModel.livePhotoInfo;
            if (tikTokMediaModel.LJIIJJI() && livePhotoInfo != null) {
                linkedHashMap.put(((MediaModel) tikTokMediaModel).id, livePhotoInfo);
            }
        }
        if (!linkedHashMap.isEmpty()) {
            q3().setPreSelectedLivePhotoInfoMap$tools_camera_record_release(linkedHashMap);
        }
    }

    private final HashMap<String, String> o2(List<? extends TikTokMediaModel> list) {
        HashMap<String, String> map = new HashMap<>();
        for (TikTokMediaModel tikTokMediaModel : list) {
            LivePhotoInfo livePhotoInfo = tikTokMediaModel.livePhotoInfo;
            if (tikTokMediaModel.LJIIJJI() && livePhotoInfo != null) {
                map.put(((MediaModel) tikTokMediaModel).id, livePhotoInfo.getLivePhotoPreviewMode());
            }
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<TikTokMediaModel> o4(List<? extends TikTokMediaModel> list) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (MediaModel mediaModel : list) {
            C527240Km2 c527240Km2 = TikTokMediaModel.Companion;
            C530020KqW c530020KqWI3 = i3();
            c527240Km2.getClass();
            arrayList.add(C527240Km2.LIZJ(c530020KqWI3, mediaModel));
        }
        return arrayList;
    }

    private final void w2(String str) {
        boolean z;
        String strE3 = E3();
        if (C525390Kj3.LIZ.remove(strE3) != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source=");
        sbLIZ.append(str);
        sbLIZ.append(" sessionKey=");
        sbLIZ.append(strE3);
        sbLIZ.append(" removed=");
        sbLIZ.append(z);
        logDebug("clearAutoPickTransferSnapshot", C2188811AlT.LIZIZ(sbLIZ));
    }

    private final void z4(List<? extends TikTokMediaModel> list) {
        ChooseMediaViewModel chooseMediaViewModelT2;
        Map<String, LivePhotoInfo> map = this.LLJILJIL;
        if (map == null) {
            return;
        }
        for (TikTokMediaModel tikTokMediaModel : list) {
            if (map.containsKey(((MediaModel) tikTokMediaModel).id) && tikTokMediaModel.LJIIJJI() && (chooseMediaViewModelT2 = T2()) != null) {
                chooseMediaViewModelT2.zR2(tikTokMediaModel);
                chooseMediaViewModelT2.yR2(new AwS587S0100000_8(tikTokMediaModel, 205));
            }
        }
    }

    @Override // X.InterfaceC522380KeC
    public void FE(String str) {
        List<TikTokMediaModel> listSU;
        List<TikTokMediaModel> listF4 = F4(str);
        if (!listF4.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_bridge_restore");
            SU(listF4, C2188811AlT.LIZIZ(sbLIZ));
            if (!fP0()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("_parent_consumed");
                w2(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        ChooseMediaViewModel chooseMediaViewModelT2 = T2();
        if (chooseMediaViewModelT2 == null || (listSU = chooseMediaViewModelT2.nR2()) == null) {
            listSU = C13BV.INSTANCE;
        }
        if (listSU.isEmpty()) {
            List<TikTokMediaModel> listP4 = P4(str);
            if (!listP4.isEmpty()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append("_persisted_restore");
                listSU = SU(listP4, C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("source=");
        sbLIZ4.append(str);
        sbLIZ4.append(" afterRestore isAutoPickAddMedia=");
        sbLIZ4.append(fP0());
        sbLIZ4.append(" bridge=");
        sbLIZ4.append(qJ2(listF4));
        sbLIZ4.append(" shared=");
        sbLIZ4.append(qJ2(listSU));
        logDebug("syncAutoPickSelectedMediasFromSharedState", C2188811AlT.LIZIZ(sbLIZ4));
        if (listSU.isEmpty()) {
            return;
        }
        Uw(listSU);
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(q3());
        if (navigationSceneLIZ != null && C523910Kgf.LIZIZ(navigationSceneLIZ, C526910KlV.class)) {
            ChooseMediaViewModel chooseMediaViewModelT22 = T2();
            if (chooseMediaViewModelT22 != null) {
                chooseMediaViewModelT22.wR2(new ArrayList(listSU));
            }
            ChooseMediaViewModel chooseMediaViewModelT23 = T2();
            if (chooseMediaViewModelT23 != null) {
                chooseMediaViewModelT23.xR2(new ArrayList<>(listSU));
            }
            ChooseMediaViewModel chooseMediaViewModelT24 = T2();
            if (chooseMediaViewModelT24 != null) {
                ArrayList arrayList = new ArrayList(listSU);
                chooseMediaViewModelT24.LLJJI = EnumC538230L8z.MIXED;
                chooseMediaViewModelT24.wR2(arrayList);
            }
        }
        if (fP0()) {
            O4(listSU, str);
        }
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("AutoPickPreview [");
        sbLIZ5.append(str);
        sbLIZ5.append("] restored shared medias count=");
        sbLIZ5.append(listSU.size());
        sbLIZ5.append(", isAutoPickAddMedia=");
        sbLIZ5.append(fP0());
        C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ5));
    }

    @Override // X.InterfaceC522380KeC
    public List<TikTokMediaModel> HB1(String str) {
        List<TikTokMediaModel> listLIZJ;
        List<TikTokMediaModel> listLJIL;
        List<TikTokMediaModel> list;
        InterfaceC522120Kdm interfaceC522120Kdm = q3().videoImageMixedController;
        if (interfaceC522120Kdm == null || (listLIZJ = interfaceC522120Kdm.LIZJ()) == null) {
            listLIZJ = C13BV.INSTANCE;
        }
        List<TikTokMediaModel> listC3 = c3();
        InterfaceC522120Kdm interfaceC522120Kdm2 = q3().videoImageMixedController;
        if (interfaceC522120Kdm2 == null || (listLJIL = interfaceC522120Kdm2.LJIL()) == null) {
            listLJIL = C13BV.INSTANCE;
        }
        if (listC3.size() > listLIZJ.size() || (!C0C64.LJIILLIIL().LJIIIZ(31744, "autopick_add_media_bridge_order_fix", true, true) && listC3.size() == listLIZJ.size() && (!listC3.isEmpty()) && !Q3(listC3, listLIZJ))) {
            list = listC3;
        } else if (!listLIZJ.isEmpty()) {
            list = listLIZJ;
        } else {
            list = listLJIL;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((MediaModel) obj).LJIIJJI()) {
                arrayList.add(obj);
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, AFwS239S0000000_8.get$arr$(80), 31);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source=");
        sbLIZ.append(str);
        sbLIZ.append(" controller=");
        sbLIZ.append(qJ2(listLIZJ));
        sbLIZ.append(" fragment=");
        sbLIZ.append(qJ2(listC3));
        sbLIZ.append(" adapter=");
        sbLIZ.append(qJ2(listLJIL));
        sbLIZ.append(" chosen=");
        sbLIZ.append(qJ2(list));
        sbLIZ.append(" livePhotos=[");
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(']');
        logDebug("getLatestAutoPickSelectedMediasForBridge", C2188811AlT.LIZIZ(sbLIZ));
        return list;
    }

    @Override // X.InterfaceC522380KeC
    public void Hd2(boolean z) {
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior;
        VideoImageMixedController videoImageMixedController;
        if (C0C1J.LIZ()) {
            InterfaceC522120Kdm interfaceC522120Kdm = q3().videoImageMixedController;
            if ((interfaceC522120Kdm instanceof VideoImageMixedController) && (videoImageMixedController = (VideoImageMixedController) interfaceC522120Kdm) != null) {
                videoImageMixedController.LJLJI(z);
            }
        }
        boolean z2 = !z;
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior2 = q3().behavior;
        if ((viewPagerBottomSheetBehavior2 == null || viewPagerBottomSheetBehavior2.isHideable() != z2) && (viewPagerBottomSheetBehavior = q3().behavior) != null) {
            viewPagerBottomSheetBehavior.setHideable(z2);
        }
    }

    @Override // X.InterfaceC522380KeC
    public void Kw2(TikTokMediaModel tikTokMediaModel) {
        Integer numValueOf;
        List<TikTokMediaModel> listLIZJ;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickPreview [selectMedia] id=");
        sbLIZ.append(((MediaModel) tikTokMediaModel).id);
        sbLIZ.append(", selectIndex=");
        sbLIZ.append(tikTokMediaModel.selectIndex);
        sbLIZ.append(", autoPickPreviewActive=");
        sbLIZ.append(kt1());
        sbLIZ.append(", currentSelectedCount=");
        InterfaceC522120Kdm interfaceC522120Kdm = q3().videoImageMixedController;
        if (interfaceC522120Kdm != null && (listLIZJ = interfaceC522120Kdm.LIZJ()) != null) {
            numValueOf = Integer.valueOf(listLIZJ.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
        q3().selectMediaInAlbum$tools_camera_record_release(tikTokMediaModel);
    }

    @Override // X.InterfaceC522380KeC
    public void Sv2(boolean z) {
        this.LLJI = z;
    }

    @Override // X.InterfaceC522380KeC
    public void Tu1(boolean z) {
        if (fP0() && !FY() && z) {
            this.LLJ = true;
            Z4();
        }
    }

    @Override // X.InterfaceC522380KeC
    public void Uw(List<? extends TikTokMediaModel> list) {
        this.LLJIJIL = list;
    }

    @Override // X.InterfaceC522380KeC
    public void Y40(List<? extends MediaModel> list) {
        ArrayList<TikTokMediaModel> arrayListNR2;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerAutoPickLoadingFlow: mediaList.size=");
        sbLIZ.append(list.size());
        C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
        List<MediaModel> selectedMediaModels$tools_camera_record_release = q3().getSelectedMediaModels$tools_camera_record_release();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(selectedMediaModels$tools_camera_record_release, 10));
        for (MediaModel mediaModel : selectedMediaModels$tools_camera_record_release) {
            C527240Km2 c527240Km2 = TikTokMediaModel.Companion;
            C530020KqW c530020KqWI3 = i3();
            c527240Km2.getClass();
            arrayList.add(C527240Km2.LIZJ(c530020KqWI3, mediaModel));
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (MediaModel mediaModel2 : list) {
            C527240Km2 c527240Km22 = TikTokMediaModel.Companion;
            C530020KqW c530020KqWI32 = i3();
            c527240Km22.getClass();
            arrayList2.add(C527240Km2.LIZJ(c530020KqWI32, mediaModel2));
        }
        if (W1(arrayList2, "auto_pick_loading")) {
            C201955140j.LJII(C533790Kwb.LIZIZ, "AutoPickPreview [auto_pick_loading] AI AutoCut abort: contains kids-mode video");
            return;
        }
        List<TikTokMediaModel> listSU = SU(arrayList2, "auto_pick_loading");
        if (listSU.isEmpty()) {
            listSU = arrayList2;
        }
        StringBuilder sb = new StringBuilder("incoming=");
        sb.append(qJ2(arrayList2));
        sb.append(" sharedInput=");
        sb.append(qJ2(listSU));
        sb.append(" shared=");
        ChooseMediaViewModel chooseMediaViewModelT2 = T2();
        if (chooseMediaViewModelT2 != null) {
            arrayListNR2 = chooseMediaViewModelT2.nR2();
        } else {
            arrayListNR2 = null;
        }
        sb.append(qJ2(arrayListNR2));
        sb.append(" selectBefore=");
        sb.append(qJ2(arrayList));
        logDebug("triggerAutoPickLoadingFlow", sb.toString());
        q3().replaceSelectedMediaModels$tools_camera_record_release(listSU);
        getShortVideoContext().creativeModel.autoPickModel.isFromAutoPickPanel = true;
        getShortVideoContext().creativeModel.autoPickModel.albumNavigationFlag = true;
        q3().setAlbumFromScene$tools_camera_record_release(EnumC538190L8v.AIPICK_ADD_PHOTO.getValue());
        List<MediaModel> selectedMediaModels$tools_camera_record_release2 = q3().getSelectedMediaModels$tools_camera_record_release();
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(selectedMediaModels$tools_camera_record_release2, 10));
        for (MediaModel mediaModel3 : selectedMediaModels$tools_camera_record_release2) {
            C527240Km2 c527240Km23 = TikTokMediaModel.Companion;
            C530020KqW c530020KqWI33 = i3();
            c527240Km23.getClass();
            arrayList3.add(C527240Km2.LIZJ(c530020KqWI33, mediaModel3));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("selectAfter=");
        sbLIZ2.append(qJ2(arrayList3));
        sbLIZ2.append(" isFromAutoPickPanel=");
        sbLIZ2.append(getShortVideoContext().creativeModel.autoPickModel.isFromAutoPickPanel);
        logDebug("triggerAutoPickLoadingFlow", C2188811AlT.LIZIZ(sbLIZ2));
        MvChoosePhotoScene.finishFromAutoPick$tools_camera_record_release$default(q3(), true, 0, 2, null);
    }

    @Override // X.InterfaceC522380KeC
    public void bR0(List<? extends TikTokMediaModel> list) {
        Integer numValueOf;
        List<TikTokMediaModel> listLIZJ;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickPreview [selectMedias] count=");
        sbLIZ.append(list.size());
        sbLIZ.append(", autoPickPreviewActive=");
        sbLIZ.append(kt1());
        sbLIZ.append(", currentSelectedCount=");
        InterfaceC522120Kdm interfaceC522120Kdm = q3().videoImageMixedController;
        if (interfaceC522120Kdm != null && (listLIZJ = interfaceC522120Kdm.LIZJ()) != null) {
            numValueOf = Integer.valueOf(listLIZJ.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
        q3().selectMediasInVideoTab$tools_camera_record_release(list);
    }

    @Override // X.InterfaceC522380KeC
    public boolean fL0(String str) {
        Intent intentX1;
        if (!fP0() || !(q3() instanceof SelectMaterialScene) || (intentX1 = X1(str)) == null) {
            return false;
        }
        q3().setResult(-1, intentX1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source=");
        sbLIZ.append(str);
        sbLIZ.append(" setResult=OK");
        logDebug("setAutoPickAddMediaResultIfNeeded", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    @Override // X.InterfaceC522380KeC
    public void lp(List<? extends TikTokMediaModel> list) {
        int size;
        Context contextLIZIZ = C545820Lau.LIZIZ(q3());
        if (contextLIZIZ == null) {
            return;
        }
        List<TikTokMediaModel> listB3 = B3(list, "open_add_media");
        if (C291330BbP.LIZ()) {
            listB3 = o4(listB3);
        }
        T4(listB3, "open_add_media_parent");
        H4(listB3, "open_add_media_parent");
        this.LLJILJIL = Z1(listB3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("beforeLaunch ");
        sbLIZ.append(qJ2(listB3));
        sbLIZ.append(" sessionKey=");
        sbLIZ.append(E3());
        sbLIZ.append(" savedLivePhotoCount=");
        Map<String, LivePhotoInfo> map = this.LLJILJIL;
        if (map != null) {
            size = map.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        logDebug("openAlbumForAutoPickAddMedia", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listB3, 10));
        Iterator<TikTokMediaModel> it2 = listB3.iterator();
        while (it2.hasNext()) {
            arrayList.add(((MediaModel) it2.next()).id);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i = v3().LIZ;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AutoPickPreview [addMedia] launching new album, preSelect ");
        sbLIZ2.append(arrayList2.size());
        sbLIZ2.append(" items, launchChooseScene=");
        sbLIZ2.append(i);
        sbLIZ2.append(", requestCode=1");
        C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ2));
        C533730KwV.LIZ.getClass();
        int iLJII = C533730KwV.LJII();
        HashMap<String, String> mapO2 = o2(listB3);
        Bundle bundle = new Bundle();
        bundle.putInt("key_support_flag", 14);
        bundle.putBoolean("key_enable_selected_medias_container_ui", true);
        bundle.putInt("key_photo_select_max_count", iLJII);
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", iLJII);
        bundle.putInt("key_video_select_min_count", 1);
        C786410Ut5.LJJJI("shoot_way", getShortVideoContext().shootWay, bundle);
        C786410Ut5.LJJJI("creation_id", getShortVideoContext().getCreationId(), bundle);
        C786410Ut5.LJJJI("enter_from", "video_shoot_page", bundle);
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putLong("Key_min_duration", C566050MHz.LIZIZ());
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", getShortVideoContext());
        bundle.putInt("key_choose_request_code", 1);
        bundle.putInt("key_set_column_count", 3);
        bundle.putInt("key_choose_scene", i);
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        C786410Ut5.LJJJIL(bundle, "key_auto_pick_pre_selected_media_ids", arrayList2);
        if (C291330BbP.LIZ()) {
            C786410Ut5.LJJIL(bundle, "key_auto_pick_pre_selected_media_models", new ArrayList(listB3));
        }
        bundle.putBoolean("Key_enable_multi_select", true);
        bundle.putBoolean("Key_enable_single_select", false);
        C786410Ut5.LJJJI("album_from_scene", EnumC538190L8v.AIPICK_ADD_PHOTO.getValue(), bundle);
        if (!mapO2.isEmpty()) {
            C786410Ut5.LJJIZ(bundle, "key_auto_pick_pre_selected_live_photo_modes", mapO2);
        }
        if (C297780Blo.LIZ()) {
            bundle.putBoolean("album_fluency_opt", true);
        }
        C0MWH.LIZLLL(contextLIZIZ, bundle, 1, 61231);
    }

    @Override // X.InterfaceC522380KeC
    public String qJ2(List<? extends TikTokMediaModel> list) {
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LL(list, 5), null, null, null, 0, null, AFwS239S0000000_8.get$arr$(79), 31);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("count=");
        sbLIZ.append(list.size());
        sbLIZ.append(", sample=[");
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC522380KeC
    public void x31(List<? extends MediaModel> list) {
        int i;
        int i2;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerAlbumRegularNextStepForAutoPick: mediaList.size=");
        sbLIZ.append(list.size());
        C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
        ArrayList<MediaModel> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (MediaModel mediaModel : list) {
            C527240Km2 c527240Km2 = TikTokMediaModel.Companion;
            C530020KqW c530020KqWI3 = i3();
            c527240Km2.getClass();
            arrayList.add(C527240Km2.LIZJ(c530020KqWI3, mediaModel));
        }
        if (W1(arrayList, "regular_next")) {
            C201955140j.LJII(C533790Kwb.LIZIZ, "AutoPickPreview [regular_next] abort: contains kids-mode video");
            return;
        }
        getShortVideoContext().creativeModel.autoPickModel.albumNavigationFlag = false;
        getShortVideoContext().creativeModel.autoPickModel.isFromAutoPickPanel = false;
        VideoImageMixedController videoImageMixedController = null;
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((MediaModel) it2.next()).LJIILJJIL() && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        if (i > 0) {
            if (arrayList.size() == 1) {
                i2 = 13;
            } else {
                i2 = 2;
            }
            for (MediaModel mediaModel2 : arrayList) {
                if (!mediaModel2.LJIILJJIL() && mediaModel2.duration <= 0) {
                    mediaModel2.duration = 3000L;
                }
            }
        } else {
            i2 = 11;
        }
        logDebug("triggerAlbumRegularNextStepForAutoPick", "resolvedType=" + i2 + " incoming=" + qJ2(arrayList));
        q3().replaceSelectedMediaModels$tools_camera_record_release(arrayList);
        InterfaceC522120Kdm interfaceC522120Kdm = q3().videoImageMixedController;
        if ((interfaceC522120Kdm instanceof VideoImageMixedController) && (videoImageMixedController = (VideoImageMixedController) interfaceC522120Kdm) != null) {
            videoImageMixedController.LJLJI(true);
        }
        try {
            q3().finishFromAutoPick$tools_camera_record_release(true, i2);
            if (videoImageMixedController != null) {
                videoImageMixedController.LJLJI(false);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (videoImageMixedController != null) {
                videoImageMixedController.LJLJI(false);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> B3(java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C524980KiO.B3(java.util.List, java.lang.String):java.util.List");
    }

    private final void O4(List<? extends TikTokMediaModel> list, String str) {
        List<? extends TikTokMediaModel> listLJIL;
        n5(list);
        k5(list, str);
        InterfaceC522120Kdm interfaceC522120Kdm = q3().videoImageMixedController;
        if (interfaceC522120Kdm == null || (listLJIL = interfaceC522120Kdm.LJIL()) == null) {
            listLJIL = C13BV.INSTANCE;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source=");
        sbLIZ.append(str);
        sbLIZ.append(" current=");
        sbLIZ.append(qJ2(listLJIL));
        sbLIZ.append(" incoming=");
        sbLIZ.append(qJ2(list));
        logDebug("restoreAutoPickAddMediaSelections", C2188811AlT.LIZIZ(sbLIZ));
        if (Q3(listLJIL, list)) {
            C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("AutoPickPreview [");
            sbLIZ2.append(str);
            sbLIZ2.append("] add-media restore skipped: same order count=");
            sbLIZ2.append(list.size());
            C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ2));
            q3().updateUIWhenChooseMedia$tools_camera_record_release(!list.isEmpty());
            return;
        }
        q3().restoreAutoPickSelections$tools_camera_record_release(list, i3());
        q3().updateUIWhenChooseMedia$tools_camera_record_release(!list.isEmpty());
        View view = q3().mView;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS13S1200000_8(this, str, list, 0));
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append("_post_restore");
            k5(list, C2188811AlT.LIZIZ(sbLIZ3));
        }
        C533790Kwb c533790Kwb2 = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("AutoPickPreview [");
        sbLIZ4.append(str);
        sbLIZ4.append("] add-media restore applied count=");
        sbLIZ4.append(list.size());
        C201955140j.LJIILJJIL(c533790Kwb2, C2188811AlT.LIZIZ(sbLIZ4));
    }

    private final boolean Q3(List<? extends TikTokMediaModel> list, List<? extends TikTokMediaModel> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        Iterable iterableLJIIIZ = C1697810uHb.LJIIIZ(list);
        if (!(iterableLJIIIZ instanceof Collection) || !((Collection) iterableLJIIIZ).isEmpty()) {
            Iterator<Integer> it2 = iterableLJIIIZ.iterator();
            while (it2.hasNext()) {
                int iNextInt = ((AbstractC2098408Jy) it2).nextInt();
                if (!Intrinsics.LJFF(((MediaModel) ListProtector.get(list, iNextInt)).id, ((MediaModel) ListProtector.get(list2, iNextInt)).id)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void T4(List<? extends TikTokMediaModel> list, String str) {
        if (list.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip empty source=");
            sbLIZ.append(str);
            sbLIZ.append(" sessionKey=");
            sbLIZ.append(E3());
            logDebug("saveAutoPickTransferSnapshot", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        String strE3 = E3();
        ArrayList arrayListLIZ = C525390Kj3.LIZ(list);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C525390Kj3.LIZ.put(strE3, new C525000KiQ(str, jCurrentTimeMillis, arrayListLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("saved source=");
        sbLIZ2.append(str);
        sbLIZ2.append(" sessionKey=");
        sbLIZ2.append(strE3);
        sbLIZ2.append(" updatedAt=");
        sbLIZ2.append(jCurrentTimeMillis);
        sbLIZ2.append(' ');
        sbLIZ2.append(qJ2(arrayListLIZ));
        logDebug("saveAutoPickTransferSnapshot", C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<TikTokMediaModel> W2(List<? extends TikTokMediaModel> list, String str) {
        List listB3;
        if (Intrinsics.LJFF(str, "add_media")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_ai_autocut");
            listB3 = HB1(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("_ai_autocut");
            listB3 = B3(list, C2188811AlT.LIZIZ(sbLIZ2));
        }
        boolean zIsEmpty = listB3.isEmpty();
        List list2 = listB3;
        if (zIsEmpty) {
            list2 = list;
        }
        if (W1(list2, str)) {
            return C13BV.INSTANCE;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("source=");
        sbLIZ3.append(str);
        sbLIZ3.append(" input=");
        sbLIZ3.append(qJ2(list));
        sbLIZ3.append(" latest=");
        sbLIZ3.append(qJ2(list2));
        logDebug("getCurrentAiAutoCutMedias", C2188811AlT.LIZIZ(sbLIZ3));
        return list2;
    }

    public final void H4(List<? extends TikTokMediaModel> list, String str) {
        if (list.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip empty source=");
            sbLIZ.append(str);
            logDebug("persistAutoPickSelectedMediasForOutput", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        ArrayList<MediaModel> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (TikTokMediaModel tikTokMediaModel : list) {
            TikTokMediaModel.Companion.getClass();
            arrayList.add(C527240Km2.LIZIZ(tikTokMediaModel));
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (MediaModel mediaModel : arrayList) {
            AutoPickMediaModel.Companion.getClass();
            arrayList2.add(C525010KiR.LIZ(mediaModel));
        }
        AutoPickModel autoPickModel = getShortVideoContext().creativeModel.autoPickModel;
        autoPickModel.mediaList.clear();
        autoPickModel.mediaList.addAll(arrayList2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("source=");
        sbLIZ2.append(str);
        sbLIZ2.append(" persistedCount=");
        sbLIZ2.append(arrayList2.size());
        sbLIZ2.append(' ');
        sbLIZ2.append(qJ2(list));
        logDebug("persistAutoPickSelectedMediasForOutput", C2188811AlT.LIZIZ(sbLIZ2));
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("AutoPickPreview [");
        sbLIZ3.append(str);
        sbLIZ3.append("] persisted mediaCount=");
        sbLIZ3.append(arrayList2.size());
        C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
    
        if (r7 == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    @Override // X.InterfaceC522380KeC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void HD1(java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r40, java.lang.String r41) {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C524980KiO.HD1(java.util.List, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    @Override // X.InterfaceC522380KeC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> SU(java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C524980KiO.SU(java.util.List, java.lang.String):java.util.List");
    }

    public final boolean W1(List<? extends TikTokMediaModel> list, String str) {
        TikTokMediaModel next;
        boolean zLIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<? extends TikTokMediaModel> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LJIILJJIL()) {
                    Context contextLIZIZ = C545820Lau.LIZIZ(q3());
                    Iterator<? extends TikTokMediaModel> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            TikTokMediaModel tikTokMediaModel = next;
                            if (tikTokMediaModel.LJIILJJIL()) {
                                String strLJIJ = C2471909mP.LJIJ(tikTokMediaModel);
                                if (contextLIZIZ != null) {
                                    zLIZ = C0L0K.LIZIZ(contextLIZIZ, strLJIJ, "video_upload", false, 24);
                                } else {
                                    zLIZ = C0L0K.LIZ(strLJIJ, AFwS239S0000000_8.get$arr$(78));
                                }
                                if (zLIZ) {
                                    break;
                                }
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    TikTokMediaModel tikTokMediaModel2 = next;
                    if (tikTokMediaModel2 == null) {
                        return false;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("source=");
                    sbLIZ.append(str);
                    sbLIZ.append(" blockedMediaId=");
                    sbLIZ.append(((MediaModel) tikTokMediaModel2).id);
                    sbLIZ.append(" medias=");
                    sbLIZ.append(qJ2(list));
                    logDebug("blockIfContainsKidsVideo", C2188811AlT.LIZIZ(sbLIZ));
                    return true;
                }
            }
        }
        return false;
    }

    public final void k5(List<? extends TikTokMediaModel> list, String str) {
        List<TikTokMediaModel> listLIZJ;
        List listLJIL;
        boolean z;
        VideoImageMixedController videoImageMixedController;
        ArrayList<TikTokMediaModel> arrayList = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : list) {
            TikTokMediaModel tikTokMediaModel2 = tikTokMediaModel;
            if (tikTokMediaModel2.LJIIJJI() && tikTokMediaModel2.livePhotoInfo != null) {
                arrayList.add(tikTokMediaModel);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        InterfaceC522120Kdm interfaceC522120Kdm = q3().videoImageMixedController;
        if (interfaceC522120Kdm == null || (listLIZJ = interfaceC522120Kdm.LIZJ()) == null) {
            listLIZJ = C13BV.INSTANCE;
        }
        InterfaceC522120Kdm interfaceC522120Kdm2 = q3().videoImageMixedController;
        if (interfaceC522120Kdm2 == null || (listLJIL = interfaceC522120Kdm2.LJIL()) == null) {
            listLJIL = C13BV.INSTANCE;
        }
        boolean z2 = false;
        for (TikTokMediaModel tikTokMediaModel3 : arrayList) {
            if (!C525050KiV.LIZIZ(tikTokMediaModel3, listLIZJ) && !z2) {
                z = false;
            } else {
                z = true;
            }
            if (!C525050KiV.LIZIZ(tikTokMediaModel3, listLJIL) && !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            InterfaceC522120Kdm interfaceC522120Kdm3 = q3().videoImageMixedController;
            if ((interfaceC522120Kdm3 instanceof VideoImageMixedController) && (videoImageMixedController = (VideoImageMixedController) interfaceC522120Kdm3) != null) {
                videoImageMixedController.LLJLL(tikTokMediaModel3);
            }
        }
        if (z2) {
            C201955140j.LJIILJJIL(C533790Kwb.LIZIZ, "AutoPickPreview [" + str + "] synced add-media LivePhoto state");
        }
    }

    @Override // X.InterfaceC522380KeC
    public void logDebug(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MvChoosePhotoScene.");
        sbLIZ.append(str);
        sbLIZ.append(": ");
        sbLIZ.append(str2);
        C201955140j.LIZIZ("AIDebug", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<TikTokMediaModel> K4(TikTokMediaModel tikTokMediaModel, List<? extends TikTokMediaModel> list, List<? extends TikTokMediaModel> list2) {
        if (!list.isEmpty() && !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((MediaModel) it2.next()).id);
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((MediaModel) it3.next()).id);
            }
            if (!Intrinsics.LJFF(arrayList, arrayList2) && arrayList2.contains(((MediaModel) tikTokMediaModel).id)) {
                Set setLLIIJI = C13LP.LLIIJI(arrayList);
                Set setLLIIJI2 = C13LP.LLIIJI(arrayList2);
                if (arrayList2.size() < arrayList.size() && setLLIIJI.containsAll(setLLIIJI2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("prefer shared deleted subset over explicit for preview open, mediaId=");
                    sbLIZ.append(((MediaModel) tikTokMediaModel).id);
                    sbLIZ.append(" explicit=");
                    sbLIZ.append(qJ2(list));
                    sbLIZ.append(" shared=");
                    sbLIZ.append(qJ2(list2));
                    logDebug("resolvePreviewInputMedias", C2188811AlT.LIZIZ(sbLIZ));
                    return list2;
                }
                return list;
            }
        }
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01a2, code lost:
    
        r6 = 0;
     */
    @Override // X.InterfaceC522380KeC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ce2(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r26, java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C524980KiO.ce2(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel, java.util.List, java.lang.String):void");
    }

    @Override // X.InterfaceC484050IyZ
    public boolean onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        List<? extends TikTokMediaModel> parcelableArrayListExtra;
        List listNR2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestCode=");
        sbLIZ.append(i);
        sbLIZ.append(" resultCode=");
        sbLIZ.append(i2);
        sbLIZ.append(" hasData=");
        if (intent != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" isAutoPickAddMedia=");
        sbLIZ.append(fP0());
        logDebug("onActivityResult", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 61231) {
            return false;
        }
        if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_auto_pick_result_media_list")) == null) {
            parcelableArrayListExtra = C13BV.INSTANCE;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("addMediaResult resultCode=");
        sbLIZ2.append(i2);
        sbLIZ2.append(' ');
        sbLIZ2.append(qJ2(parcelableArrayListExtra));
        logDebug("onActivityResult", C2188811AlT.LIZIZ(sbLIZ2));
        if (i2 == -1 && (!parcelableArrayListExtra.isEmpty())) {
            ChooseMediaViewModel chooseMediaViewModelT2 = T2();
            if (chooseMediaViewModelT2 == null || (listNR2 = chooseMediaViewModelT2.nR2()) == null) {
                listNR2 = C13BV.INSTANCE;
            }
            List<? extends TikTokMediaModel> listLIZ = C524990KiP.LIZ(true, parcelableArrayListExtra, listNR2, this.LLJILJIL);
            SU(listLIZ, "add_media_result");
            w2("add_media_result_authoritative");
            H4(listLIZ, "add_media_result_parent");
            FE("add_media_result");
            z4(listLIZ);
        }
        this.LLJILJIL = null;
        return true;
    }
}
