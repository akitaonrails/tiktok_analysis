package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.widget.previewlive.layoutwidiget;

import X.C0H79;
import X.C0UO0;
import X.C0UPW;
import X.C20441214yg;
import X.C2188811AlT;
import X.C480460Ism;
import X.C786410Ut5;
import X.C939490aYV;
import X.C948060amK;
import X.C948100amO;
import X.C948450amx;
import Y.AfS181S0100000_12;
import Y.AfS184S0100000_15;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.liveinteract.api.AbsMultiGuestPreviewLiveLayoutWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.api.ILayoutSettingApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.widget.previewlive.layoutwidiget.MultiGuestPreviewLiveLayoutViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAddAutoAcceptInGoLivePageSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import webcast.api.linkmic_multi_guest.GuideLayoutDetailsParams;
import webcast.api.linkmic_multi_guest.GuideLayoutUpdateParams;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestPreviewLiveLayoutWidget extends AbsMultiGuestPreviewLiveLayoutWidget {
    public final ViewGroup LL;
    public final DataChannel LLILLJJLI;
    public MultiGuestPreviewLiveLayoutViewModel LLILLL;
    public MultiGuestLayoutRenderV2 LLILZ;

    @Override // com.bytedance.android.live.liveinteract.api.AbsMultiGuestPreviewLiveLayoutWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onCreate() {
        int iOptInt;
        int iOptInt2;
        JSONObject jSONObject;
        super.onCreate();
        if (C0H79.LIZ() == null) {
            C948450amx.LIZIZ.LJFF(new C948100amO(), "MULTI_GUEST_PREVIEW_LIVE_DATA_HOLDER");
        }
        final DataChannel dataChannel = this.LLILLJJLI;
        this.LLILLL = (MultiGuestPreviewLiveLayoutViewModel) new ViewModelProvider(this.widgetCallback.getFragment(), new ViewModelProvider.Factory(dataChannel) { // from class: X.0Imk
            public final DataChannel LIZ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            {
                this.LIZ = dataChannel;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                if (cls.isAssignableFrom(MultiGuestPreviewLiveLayoutViewModel.class)) {
                    return new MultiGuestPreviewLiveLayoutViewModel(this.LIZ);
                }
                throw new IllegalArgumentException("Unknown ViewModel class");
            }
        }).get(MultiGuestPreviewLiveLayoutViewModel.class);
        if (LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
            WeakReference<FrameLayout> weakReference = C0UPW.LIZ;
            FrameLayout frameLayout = weakReference != null ? weakReference.get() : null;
            WeakReference<FrameLayout> weakReference2 = C0UPW.LIZIZ;
            FrameLayout frameLayout2 = weakReference2 != null ? weakReference2.get() : null;
            DataChannel dataChannel2 = this.LLILLJJLI;
            if (frameLayout != null && frameLayout2 != null && dataChannel2 != null) {
                MultiGuestLayoutRenderV2 multiGuestLayoutRenderV2 = new MultiGuestLayoutRenderV2(true, null, frameLayout, frameLayout2, dataChannel2, new C939490aYV(frameLayout, frameLayout2, dataChannel2).LIZLLL("preview_live"), null);
                this.LLILZ = multiGuestLayoutRenderV2;
                multiGuestLayoutRenderV2.LIZ();
            }
        }
        Bundle arguments = this.widgetCallback.getFragment().getArguments();
        String string = arguments != null ? arguments.getString("sourceParams") : null;
        if (string != null) {
            try {
                jSONObject = new JSONObject(string);
                iOptInt = jSONObject.optInt("panel_type", -1);
                try {
                    iOptInt2 = jSONObject.optInt("mic_count", -1);
                } catch (Exception e) {
                    e = e;
                    iOptInt2 = -1;
                }
            } catch (Exception e2) {
                e = e2;
                iOptInt = -1;
                iOptInt2 = -1;
            }
            try {
                jSONObject.remove("panel_type");
                jSONObject.remove("mic_count");
                Bundle arguments2 = this.widgetCallback.getFragment().getArguments();
                if (arguments2 != null) {
                    C786410Ut5.LJJJI("sourceParams", C786410Ut5.J3(jSONObject), arguments2);
                }
            } catch (Exception e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("source params read fail, e: ");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJIIIZ("MultiGuestPreviewLiveLayoutWidget", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            iOptInt = -1;
            iOptInt2 = -1;
        }
        MultiGuestPreviewLiveLayoutViewModel multiGuestPreviewLiveLayoutViewModel = this.LLILLL;
        if (multiGuestPreviewLiveLayoutViewModel != null) {
            if (iOptInt == -1 || iOptInt2 == -1) {
                C948060amK c948060amK = multiGuestPreviewLiveLayoutViewModel.LLILLJJLI;
                c948060amK.getClass();
                C480460Ism.LIZ().getClass();
                ILayoutSettingApi iLayoutSettingApi = (ILayoutSettingApi) C480460Ism.LIZLLL(ILayoutSettingApi.class);
                GuideLayoutDetailsParams guideLayoutDetailsParams = new GuideLayoutDetailsParams();
                guideLayoutDetailsParams.frameSetting = 1L;
                guideLayoutDetailsParams.includeAnchorSetting = MultiGuestAddAutoAcceptInGoLivePageSetting.INSTANCE.enable();
                multiGuestPreviewLiveLayoutViewModel.LL.LIZ(iLayoutSettingApi.getGuideLayoutSetting(guideLayoutDetailsParams).LJFF(new C0UO0()).LJIILL(new AfS184S0100000_15(c948060amK, 215)).LJIIL(new AfS181S0100000_12(c948060amK, 311)).LJJIIJ());
                return;
            }
            C948060amK c948060amK2 = multiGuestPreviewLiveLayoutViewModel.LLILLJJLI;
            c948060amK2.getClass();
            GuideLayoutUpdateParams guideLayoutUpdateParams = new GuideLayoutUpdateParams();
            guideLayoutUpdateParams.guideLayoutUpdateScene = 2;
            guideLayoutUpdateParams.frameSetting = 1L;
            guideLayoutUpdateParams.panelLayoutType = iOptInt;
            guideLayoutUpdateParams.availableSpotForGuest = iOptInt2;
            C480460Ism.LIZ().getClass();
            multiGuestPreviewLiveLayoutViewModel.LL.LIZ(((ILayoutSettingApi) C480460Ism.LIZLLL(ILayoutSettingApi.class)).updateGuideLayout(guideLayoutUpdateParams).LJFF(new C0UO0()).LJIILL(new AfS184S0100000_15(c948060amK2, 216)).LJIIL(new AfS181S0100000_12(c948060amK2, 312)).LJJIIJ());
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        MultiGuestLayoutRenderV2 multiGuestLayoutRenderV2 = this.LLILZ;
        if (multiGuestLayoutRenderV2 != null) {
            multiGuestLayoutRenderV2.LIZJ();
        }
        C948450amx.LIZIZ.LJI("MULTI_GUEST_PREVIEW_LIVE_DATA_HOLDER");
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        MultiGuestLayoutRenderV2 multiGuestLayoutRenderV2 = this.LLILZ;
        if (multiGuestLayoutRenderV2 != null) {
            multiGuestLayoutRenderV2.LJIILIIL();
        }
    }

    public MultiGuestPreviewLiveLayoutWidget(ViewGroup viewGroup, DataChannel dataChannel) {
        this.LL = viewGroup;
        this.LLILLJJLI = dataChannel;
    }
}
