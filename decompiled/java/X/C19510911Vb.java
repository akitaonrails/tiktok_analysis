package X;

import Y.AObserverS225S0100000_22;
import Y.AObserverS228S0100000_26;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import avg.f;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.edit.MultiAnchorEditModel;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionBiz;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionVisible;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.services.publish.IDebugAddLinkOptionService;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS157S0400000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.11Vb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19510911Vb implements IAVPublishExtension<MultiAnchorEditModel> {
    public WeakReference<Context> LLILLJJLI;
    public ExtensionMisc LLILLL;
    public View LLILZ;
    public C19471511Fx LLILZIL;
    public C11G7 LLIZ;
    public LifecycleOwner LLIZLLLIL;
    public boolean LLJI;
    public AVPublishExtensionVisible LLJILJIL;
    public final String LL = "MultiAnchorPublishEditPostExtension";
    public final MutableLiveData<C1738590vLN<Unit>> LLILZLL = new MutableLiveData<>();
    public final AnchorLock$IAnchorStateService LLJ = (AnchorLock$IAnchorStateService) PluggableExtentionKt.pluggableSpi$default(AnchorLock$IAnchorStateService.class, false, false, false, 14, null);
    public final MutableLiveData<List<AnchorTransData>> LLJIJIL = new MutableLiveData<>();
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(85));

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final MultiAnchorEditModel provideExtensionData() {
        List<AnchorTransData> value = this.LLJIJIL.getValue();
        if (value == null) {
            value = C13BV.INSTANCE;
        }
        return new MultiAnchorEditModel(value);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final Integer getAnchorIconRawId() {
        return IAVPublishExtension.DefaultImpls.getAnchorIconRawId(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final UrlModel getAnchorIconUrl() {
        return IAVPublishExtension.DefaultImpls.getAnchorIconUrl(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getAnchorText() {
        return IAVPublishExtension.DefaultImpls.getAnchorText(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final boolean isDisplayAnchor() {
        return IAVPublishExtension.DefaultImpls.isDisplayAnchor(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onDestroy() {
        onUnbindOptionView();
        C11G7 c11g7 = this.LLIZ;
        if (c11g7 != null) {
            c11g7.dismiss();
            C785410UrT.LIZ(c11g7);
        }
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLILZ = null;
        WeakReference<Context> weakReference = this.LLILLJJLI;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.LLILLJJLI = null;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onUnbindOptionView() {
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJJI(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getName() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onAccountUpdate() {
        IAVPublishExtension.DefaultImpls.onAccountUpdate(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onResume() {
        IAVPublishExtension.DefaultImpls.onResume(this);
    }

    public final List<AnchorTransData> LIZ(AnchorTransData anchorTransData) {
        ArrayList<AnchorTransData> arrayList = new ArrayList();
        List<AnchorTransData> value = this.LLJIJIL.getValue();
        if (value != null) {
            Iterator<AnchorTransData> it2 = value.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        InterfaceC710290Rtb interfaceC710290RtbLIZ = C19513411Wa.LIZ();
        if (interfaceC710290RtbLIZ != null && ((C19513511Wb) interfaceC710290RtbLIZ).LIZIZ() != null && C19512911Vv.LJ(anchorTransData, arrayList)) {
            return arrayList;
        }
        arrayList.add(anchorTransData);
        ArrayList arrayList2 = new ArrayList();
        for (AnchorTransData anchorTransData2 : arrayList) {
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    AnchorTransData anchorTransData3 = (AnchorTransData) it3.next();
                    if (anchorTransData3 == null || !Intrinsics.LJFF(anchorTransData2.title, anchorTransData3.title) || !Intrinsics.LJFF(anchorTransData2.extra, anchorTransData3.extra)) {
                    }
                } else {
                    arrayList2.add(anchorTransData2);
                    break;
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    public final void LIZIZ(View view) {
        ?? arrayList;
        int size;
        boolean z;
        List<C19400610vE> addedAnchorList;
        C11G7 c11g7;
        List<C19400610vE> addedAnchorList2;
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService;
        IDebugAddLinkOptionService iDebugAddLinkOptionServiceDebugAddLinkOptionService;
        this.LLILZLL.setValue(new C1738590vLN<>(Unit.LIZ));
        AnchorListManager.LIZ.getClass();
        List listLJI = AnchorListManager.LJI();
        C11G7 c11g72 = null;
        if (!C19719512Dh.LJI(listLJI)) {
            listLJI = null;
        }
        boolean zEnableToastCenter = false;
        if (listLJI != null) {
            arrayList = new ArrayList();
            for (Object obj : listLJI) {
                if (((AnchorPublishStruct) obj).type == EnumC1430380nKG.NEWS.getTYPE()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        List<AnchorTransData> value = this.LLJIJIL.getValue();
        if (value != null) {
            size = value.size();
        } else {
            size = 0;
        }
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService2 = (IAVPublishPageUIRefactorService) this.LLJILJILJ.getValue();
        if (iAVPublishPageUIRefactorService2 != null && iAVPublishPageUIRefactorService2.isRefactorPublishAddLinkOption()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            view.getContext();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ() || ((iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) this.LLJILJILJ.getValue()) != null && (iDebugAddLinkOptionServiceDebugAddLinkOptionService = iAVPublishPageUIRefactorService.debugAddLinkOptionService()) != null && iDebugAddLinkOptionServiceDebugAddLinkOptionService.mockNetworkNotAvailable())) {
                C19471511Fx c19471511Fx = this.LLILZIL;
                if (c19471511Fx != null && (addedAnchorList2 = c19471511Fx.getAddedAnchorList()) != null && addedAnchorList2.isEmpty()) {
                    C1389890mGx c1389890mGx = new C1389890mGx(view);
                    c1389890mGx.LJIIIZ(2131829876);
                    c1389890mGx.LIZ(true);
                    c1389890mGx.LJIIJJI();
                    return;
                }
            }
        } else {
            if (size >= 10) {
                IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService3 = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
                if (iAVPublishPageUIRefactorService3 != null) {
                    zEnableToastCenter = iAVPublishPageUIRefactorService3.enableToastCenter();
                }
                if (zEnableToastCenter) {
                    C1389880mGw c1389880mGw = new C1389880mGw(view);
                    c1389880mGw.LJIIIIZZ(2131826558);
                    c1389880mGw.LJIIJ();
                    return;
                } else {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(view);
                    c1389890mGx2.LJIIIZ(2131826558);
                    c1389890mGx2.LJIIJJI();
                    return;
                }
            }
            view.getContext();
            try {
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (!C036E.LIZ.LIZIZ()) {
                C1389890mGx c1389890mGx3 = new C1389890mGx(view);
                c1389890mGx3.LJIIIZ(2131829876);
                c1389890mGx3.LJIIJJI();
                return;
            }
        }
        C11G7 c11g73 = this.LLIZ;
        if (c11g73 == null || c11g73.LLJLILLLLZIIL) {
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            if (iExternalService != null) {
                iExternalService.publishService();
            }
            LifecycleOwner lifecycleOwner = this.LLIZLLLIL;
            if (lifecycleOwner != null) {
                c11g72 = new C11G7(view.getContext(), lifecycleOwner, arrayList);
            }
            this.LLIZ = c11g72;
            for (AnchorPublishStruct anchorPublishStruct : arrayList) {
                anchorPublishStruct.enable = true;
                ExtensionMisc extensionMisc = this.LLILLL;
                if (extensionMisc != null) {
                    anchorPublishStruct.setExtensionMisc(extensionMisc);
                }
                anchorPublishStruct.setOnClickAction(new AwS157S0400000_29(view, (View) this, (C19510911Vb) anchorPublishStruct, (AnchorPublishStruct) arrayList, (List<AnchorPublishStruct>) 3));
            }
        }
        C19471511Fx c19471511Fx2 = this.LLILZIL;
        if (c19471511Fx2 != null && (addedAnchorList = c19471511Fx2.getAddedAnchorList()) != null && (c11g7 = this.LLIZ) != null) {
            ((ArrayList) c11g7.LLJL).clear();
            ((ArrayList) c11g7.LLJL).addAll(addedAnchorList);
            C19400410vC c19400410vC = c11g7.LLJJLIIIJLLLLLLLZ;
            if (c19400410vC != null) {
                ((ArrayList) c19400410vC.LLILLL).clear();
                ((ArrayList) c19400410vC.LLILLL).addAll(addedAnchorList);
                c19400410vC.notifyDataSetChanged();
            }
        }
        C11G7 c11g74 = this.LLIZ;
        if (c11g74 != null) {
            c11g74.setOnCancelListener(new C12YJ(this, 0));
        }
        C11G7 c11g75 = this.LLIZ;
        if (c11g75 != null) {
            C1391850mK7.LIZIZ(c11g75, "edit_postpage_add_anchors_link_nscreen");
            c11g75.show();
            C785410UrT.LIZIZ(c11g75);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(c11g75);
            C816490W1f.LIZ(c11g75);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void callbackAnchors(List<CreateAnchorInfo> list) {
        IAVPublishExtension.DefaultImpls.callbackAnchors(this, list);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final boolean haveAnchors(int i) {
        return IAVPublishExtension.DefaultImpls.haveAnchors(this, i);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void observeClick(Function0<Unit> function0) {
        this.LLILZLL.observeForever(new AObserverS228S0100000_26(function0, 2));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAsyncAnchor(C1799610wvn c1799610wvn) {
        AnchorTransData anchorTransData;
        if (c1799610wvn != null && (anchorTransData = c1799610wvn.LIZ) != null) {
            anchorTransData.setAddTime(Long.valueOf(SystemClock.elapsedRealtime()));
            this.LLJIJIL.setValue(LIZ(anchorTransData));
        }
        C11G7 c11g7 = this.LLIZ;
        if (c11g7 != null) {
            c11g7.dismiss();
            C785410UrT.LIZ(c11g7);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onBackPressed(PublishOutput publishOutput) {
        IAVPublishExtension.DefaultImpls.onBackPressed(this, publishOutput);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onJumpToShootFromFypWithPoiData(PoiData poiData) {
        IAVPublishExtension.DefaultImpls.onJumpToShootFromFypWithPoiData(this, poiData);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onPublish(PublishOutput publishOutput) {
        IAVPublishExtension.DefaultImpls.onPublish(this, publishOutput);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSaveDraft(PublishOutput publishOutput) {
        IAVPublishExtension.DefaultImpls.onSaveDraft(this, publishOutput);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void registerOnAddAnchorListener(Function0<Unit> function0) {
        IAVPublishExtension.DefaultImpls.registerOnAddAnchorListener(this, function0);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void registerOnRemoveAnchorListener(Function1<? super Integer, Unit> function1) {
        IAVPublishExtension.DefaultImpls.registerOnRemoveAnchorListener(this, function1);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void unregisterOnAddAnchorListener(Function0<Unit> function0) {
        IAVPublishExtension.DefaultImpls.unregisterOnAddAnchorListener(this, function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.util.List<com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct> r30, java.util.List<com.ss.android.ugc.aweme.creative.model.AnchorTransData> r31) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19510911Vb.LIZJ(java.util.List, java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onAddHashTag(String str, List<? extends TextExtraStruct> list) {
        IAVPublishExtension.DefaultImpls.onAddHashTag(this, str, list);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onBindOptionView(Fragment fragment, View view) {
        ViewGroup anchorListContent;
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (!eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJIJJ(this);
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_plus;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        C19471511Fx c19471511Fx = this.LLILZIL;
        if (c19471511Fx != null) {
            c19471511Fx.setLeftIcon(c419910GdJ);
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_chevron_right_offset_ltr;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C19471511Fx c19471511Fx2 = this.LLILZIL;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (c19471511Fx2 != null && (anchorListContent = c19471511Fx2.getAnchorListContent()) != null) {
            ViewGroup.LayoutParams layoutParams = anchorListContent.getLayoutParams();
            if ((layoutParams instanceof RelativeLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            }
            C786410Ut5.X5(marginLayoutParams, anchorListContent);
        }
        C19471511Fx c19471511Fx3 = this.LLILZIL;
        if (c19471511Fx3 != null) {
            c19471511Fx3.setRightIcon(c419910GdJ2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onExtensionEnable(Map<AVPublishExtensionBiz, ? extends AVPublishExtensionVisible> map, boolean z) {
        ?? arrayList;
        AVPublishExtensionVisible aVPublishExtensionVisible;
        AnchorListManager.LIZ.getClass();
        List listLJI = AnchorListManager.LJI();
        if (!C19719512Dh.LJI(listLJI)) {
            listLJI = null;
        }
        if (listLJI != null) {
            arrayList = new ArrayList();
            for (Object obj : listLJI) {
                if (((AnchorPublishStruct) obj).type == EnumC1430380nKG.NEWS.getTYPE()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (!arrayList.isEmpty()) {
            AVPublishExtensionVisible aVPublishExtensionVisible2 = map.get(AVPublishExtensionBiz.NEWS);
            if (aVPublishExtensionVisible2 == null) {
                aVPublishExtensionVisible2 = AVPublishExtensionVisible.GONE;
            }
            aVPublishExtensionVisible = aVPublishExtensionVisible2;
        } else {
            aVPublishExtensionVisible = AVPublishExtensionVisible.GONE;
        }
        this.LLJILJIL = aVPublishExtensionVisible;
        int i = C1200500hLU.LIZ[aVPublishExtensionVisible.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C19471511Fx c19471511Fx = this.LLILZIL;
                    if (c19471511Fx != null) {
                        int visibility = c19471511Fx.getVisibility();
                        c19471511Fx.setVisibility(8);
                        C1602160rnK.LIZIZ(visibility, 8, c19471511Fx);
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            C19471511Fx c19471511Fx2 = this.LLILZIL;
            if (c19471511Fx2 == null) {
                return;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19471511Fx2);
            c19471511Fx2.setAlpha(0.34f);
            int visibility2 = c19471511Fx2.getVisibility();
            c19471511Fx2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, c19471511Fx2);
            c19471511Fx2.setClickable(false);
            c19471511Fx2.setInterceptTouchEvent(true);
            View.OnClickListener fVar = new View.OnClickListener() { // from class: X.11Vk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            };
            if (C1848410yCV.LIZ) {
                fVar = new f(fVar);
            }
            a aVar = new a(fVar);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c19471511Fx2);
            }
            c19471511Fx2.setOnClickListener(aVar);
            return;
        }
        C19471511Fx c19471511Fx3 = this.LLILZIL;
        if (c19471511Fx3 != null) {
            int visibility3 = c19471511Fx3.getVisibility();
            c19471511Fx3.setVisibility(0);
            C1602160rnK.LIZIZ(visibility3, 0, c19471511Fx3);
        }
        C19471511Fx c19471511Fx4 = this.LLILZIL;
        if (c19471511Fx4 == null) {
            return;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19471511Fx4);
        c19471511Fx4.setAlpha(1.0f);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSoftKeyboardHide(String str, List<? extends TextExtraStruct> list) {
        IAVPublishExtension.DefaultImpls.onSoftKeyboardHide(this, str, list);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onActivityResult(int i, int i2, Intent intent) {
        IAVPublishExtension.DefaultImpls.onActivityResult(this, i, i2, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final View onCreateOptionView(Context context, ViewGroup viewGroup, View view) {
        C19471511Fx c19471511Fx = new C19471511Fx(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19471511Fx);
        c19471511Fx.setLayoutParams(layoutParams);
        c19471511Fx.setClickable(true);
        c19471511Fx.setOnAddClickListener(new AwS608S0100000_29(this, 100));
        this.LLILZIL = c19471511Fx;
        return c19471511Fx;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onJumpToShootFromLynxWithPoiData(PoiData poiData, Integer num, String str) {
        IAVPublishExtension.DefaultImpls.onJumpToShootFromLynxWithPoiData(this, poiData, num, str);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreate(Fragment fragment, View view, LifecycleOwner lifecycleOwner, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, IAVPublishExtension.Callback callback, View view2) {
        boolean z;
        String url;
        Uri uri;
        this.LLILZ = view;
        this.LLILLJJLI = new WeakReference<>(fragment.requireContext());
        this.LLILLL = extensionMisc;
        this.LLIZLLLIL = lifecycleOwner;
        if (extensionMisc.isImageMode()) {
            z = true;
        } else {
            z = false;
        }
        this.LLJI = z;
        this.LLJIJIL.observe(lifecycleOwner, new AObserverS225S0100000_22(this, 15));
        List<AnchorCommonStruct> list = publishOutput.anchors;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (AnchorCommonStruct anchorCommonStruct : list) {
                String schema = anchorCommonStruct.getSchema();
                if (schema == null || (uri = UriProtector.parse(schema)) == null || (url = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")) == null || url.length() == 0) {
                    url = anchorCommonStruct.getUrl();
                }
                String keyword = anchorCommonStruct.getKeyword();
                arrayList.add(new AnchorTransData(anchorCommonStruct.getType(), anchorCommonStruct.getExtra(), keyword, "", 0, "", anchorCommonStruct.getIcon(), true, url, anchorCommonStruct.getLanguage(), Long.MAX_VALUE, "", anchorCommonStruct.subType(), true, null, null, null, null, 0, -1, null, null));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.LLJIJIL.setValue(LIZ((AnchorTransData) it2.next()));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreateMultiViewPublish(Fragment fragment, View view, LifecycleOwner lifecycleOwner, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, List<UploadableDraftEffect> list, List<UploadableMobileEffect> list2, ExtensionMisc extensionMisc, IAVPublishExtension.Callback callback, View view2) {
        IAVPublishExtension.DefaultImpls.onCreateMultiViewPublish(this, fragment, view, lifecycleOwner, bundle, aVPublishContentType, publishOutput, list, list2, extensionMisc, callback, view2);
    }
}
