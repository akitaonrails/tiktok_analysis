package X;

import Y.ACListenerS153S0100000_18;
import Y.ARunnableS23S1100000_18;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishModel;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionBiz;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionVisible;
import com.ss.android.ugc.aweme.services.publish.EditPostMobParam;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS115S0400000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0hLS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200480hLS implements IAVPublishExtension<PoiPublishModel> {
    public final String LL = "PoiEditPostPublishExtensionV2";
    public PoiPublishExtensionVM LLILLJJLI;
    public Context LLILLL;
    public ExtensionMisc LLILZ;
    public View LLILZIL;

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onDestroy() {
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final PoiPublishModel provideExtensionData() {
        PoiPublishExtensionVM poiPublishExtensionVM = this.LLILLJJLI;
        if (poiPublishExtensionVM == null) {
            poiPublishExtensionVM = null;
        }
        PoiData poiData = poiPublishExtensionVM.getState().LLILLJJLI;
        PoiMobParam poiMobParam = poiData != null ? poiData.mobParam : null;
        String str = poiMobParam != null ? poiMobParam.enterMethod : null;
        PoiPublishExtensionVM poiPublishExtensionVM2 = this.LLILLJJLI;
        String str2 = (poiPublishExtensionVM2 == null ? null : poiPublishExtensionVM2).LLILLJJLI;
        String str3 = poiMobParam != null ? poiMobParam.searchId : null;
        if (poiPublishExtensionVM2 == null) {
            poiPublishExtensionVM2 = null;
        }
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapperLIZ = poiPublishExtensionVM2.getState().LL.LIZ();
        int i = poiSearchResultWrapperLIZ != null ? poiSearchResultWrapperLIZ.useSessionCache : 0;
        String str4 = poiMobParam != null ? poiMobParam.enterFrom : null;
        PoiPublishExtensionVM poiPublishExtensionVM3 = this.LLILLJJLI;
        return new PoiPublishModel(poiData, str, str2, str3, i, str4, new PoiMobParam(null, null, null, null, null, null, null, "", false, 0, null, null, (poiPublishExtensionVM3 == null ? null : poiPublishExtensionVM3).LLJJIJIIJIL, Integer.valueOf((poiPublishExtensionVM3 != null ? poiPublishExtensionVM3 : null).LLJJIJI)));
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

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onUnbindOptionView() {
        IAVPublishExtension.DefaultImpls.onUnbindOptionView(this);
    }

    public C1200480hLS(int i) {
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
        PoiPublishExtensionVM poiPublishExtensionVM = this.LLILLJJLI;
        if (poiPublishExtensionVM == null) {
            poiPublishExtensionVM = null;
        }
        poiPublishExtensionVM.getClass();
        AssemViewModel.selectSubscribe$default(poiPublishExtensionVM, C1200520hLW.LL, null, null, null, new AwS595S0100000_16((Function0) function0, (Function0<Unit>) 318), 14, null);
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

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onAddHashTag(String str, List<? extends TextExtraStruct> list) {
        IAVPublishExtension.DefaultImpls.onAddHashTag(this, str, list);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onBindOptionView(Fragment fragment, View view) {
        C723850SaN.LIZ(fragment, false, null, new AwS384S0200000_18(fragment, this, 249), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onExtensionEnable(Map<AVPublishExtensionBiz, ? extends AVPublishExtensionVisible> map, boolean z) {
        Integer num;
        ExtensionMisc extensionMisc;
        String str;
        ExtensionMisc extensionMisc2;
        String str2;
        ExtensionMisc extensionMisc3;
        Integer num2;
        Integer num3;
        String string;
        ExtensionMisc extensionMisc4;
        String str3;
        ExtensionMisc extensionMisc5;
        String str4;
        ExtensionMisc extensionMisc6;
        Integer num4;
        String str5;
        PoiPublishExtensionVM poiPublishExtensionVM = this.LLILLJJLI;
        String str6 = null;
        View view = null;
        if (poiPublishExtensionVM == null) {
            poiPublishExtensionVM = null;
        }
        poiPublishExtensionVM.LLJI = z;
        AVPublishExtensionVisible aVPublishExtensionVisible = map.get(AVPublishExtensionBiz.POI);
        if (aVPublishExtensionVisible == null) {
            aVPublishExtensionVisible = AVPublishExtensionVisible.GONE;
        }
        AVPublishExtensionVisible aVPublishExtensionVisible2 = aVPublishExtensionVisible;
        View view2 = this.LLILZIL;
        if (view2 == null) {
            view2 = null;
        }
        C1200510hLV c1200510hLV = (C1200510hLV) view2.findViewById(R.id.r3m);
        int i = C1200490hLT.LIZ[aVPublishExtensionVisible2.ordinal()];
        String str7 = "inbox";
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    int visibility = c1200510hLV.getVisibility();
                    c1200510hLV.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, c1200510hLV);
                    return;
                }
                throw new C1954807lC();
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1200510hLV);
            c1200510hLV.setAlpha(0.34f);
            int visibility2 = c1200510hLV.getVisibility();
            c1200510hLV.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, c1200510hLV);
            c1200510hLV.setInterceptTouchEvent(true);
            View.OnClickListener aCListenerS153S0100000_18 = new ACListenerS153S0100000_18(this, 185);
            if (C1848410yCV.LIZ) {
                aCListenerS153S0100000_18 = new f(aCListenerS153S0100000_18);
            }
            a aVar = new a(aCListenerS153S0100000_18);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c1200510hLV);
            }
            c1200510hLV.setOnClickListener(aVar);
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            ExtensionMisc extensionMisc7 = this.LLILZ;
            if (extensionMisc7 == null) {
                extensionMisc7 = null;
            }
            EditPostMobParam editPostMobParam = extensionMisc7.editPostMobParam;
            if (editPostMobParam != null) {
                num3 = editPostMobParam.awemeType;
            } else {
                num3 = null;
            }
            c1185430gxB.getClass();
            C1185430gxB.LJIJ(true, num3);
            ExtensionMisc extensionMisc8 = this.LLILZ;
            if (extensionMisc8 == null) {
                extensionMisc8 = null;
            }
            if (C289340BVs.LIZ(extensionMisc8.poiPublishModel)) {
                C1201050hMN c1201050hMN = C1201050hMN.LIZ;
                ExtensionMisc extensionMisc9 = this.LLILZ;
                if (extensionMisc9 == null) {
                    extensionMisc4 = null;
                } else {
                    extensionMisc4 = extensionMisc9;
                }
                EditPostMobParam editPostMobParam2 = extensionMisc4.editPostMobParam;
                if (editPostMobParam2 != null) {
                    str3 = editPostMobParam2.authorId;
                } else {
                    str3 = null;
                }
                if (extensionMisc9 == null) {
                    extensionMisc5 = null;
                } else {
                    extensionMisc5 = extensionMisc9;
                }
                EditPostMobParam editPostMobParam3 = extensionMisc5.editPostMobParam;
                if (editPostMobParam3 != null) {
                    str4 = editPostMobParam3.groupId;
                } else {
                    str4 = null;
                }
                if (extensionMisc9 == null) {
                    extensionMisc6 = null;
                } else {
                    extensionMisc6 = extensionMisc9;
                }
                EditPostMobParam editPostMobParam4 = extensionMisc6.editPostMobParam;
                if (editPostMobParam4 != null) {
                    num4 = editPostMobParam4.awemeType;
                } else {
                    num4 = null;
                }
                if (extensionMisc9 == null) {
                    extensionMisc9 = null;
                }
                EditPostMobParam editPostMobParam5 = extensionMisc9.editPostMobParam;
                if (editPostMobParam5 != null) {
                    str5 = editPostMobParam5.afterPostDays;
                } else {
                    str5 = null;
                }
                if (!z) {
                    str7 = "edit_post";
                }
                c1201050hMN.getClass();
                C1201050hMN.LIZLLL(num4, "edit_post", str3, str4, str5, str7, null, null, null);
            }
            if (!z) {
                return;
            }
            View view3 = this.LLILZIL;
            if (view3 == null) {
                view3 = null;
            }
            Context context = view3.getContext();
            if (context != null) {
                string = context.getString(2131844758);
            } else {
                string = null;
            }
            View view4 = this.LLILZIL;
            if (view4 != null) {
                view = view4;
            }
            HandlerHook.viewPostDelay(view, new ARunnableS23S1100000_18(this, string, 3), 10L);
            return;
        }
        int visibility3 = c1200510hLV.getVisibility();
        c1200510hLV.setVisibility(0);
        C1602160rnK.LIZIZ(visibility3, 0, c1200510hLV);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1200510hLV);
        c1200510hLV.setAlpha(1.0f);
        C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
        ExtensionMisc extensionMisc10 = this.LLILZ;
        if (extensionMisc10 == null) {
            extensionMisc10 = null;
        }
        EditPostMobParam editPostMobParam6 = extensionMisc10.editPostMobParam;
        if (editPostMobParam6 != null) {
            num = editPostMobParam6.awemeType;
        } else {
            num = null;
        }
        c1185430gxB2.getClass();
        C1185430gxB.LJIJ(false, num);
        ExtensionMisc extensionMisc11 = this.LLILZ;
        if (extensionMisc11 == null) {
            extensionMisc11 = null;
        }
        if (!C289340BVs.LIZ(extensionMisc11.poiPublishModel)) {
            return;
        }
        C1201050hMN c1201050hMN2 = C1201050hMN.LIZ;
        ExtensionMisc extensionMisc12 = this.LLILZ;
        if (extensionMisc12 == null) {
            extensionMisc = null;
        } else {
            extensionMisc = extensionMisc12;
        }
        EditPostMobParam editPostMobParam7 = extensionMisc.editPostMobParam;
        if (editPostMobParam7 != null) {
            str = editPostMobParam7.authorId;
        } else {
            str = null;
        }
        if (extensionMisc12 == null) {
            extensionMisc2 = null;
        } else {
            extensionMisc2 = extensionMisc12;
        }
        EditPostMobParam editPostMobParam8 = extensionMisc2.editPostMobParam;
        if (editPostMobParam8 != null) {
            str2 = editPostMobParam8.groupId;
        } else {
            str2 = null;
        }
        if (extensionMisc12 == null) {
            extensionMisc3 = null;
        } else {
            extensionMisc3 = extensionMisc12;
        }
        EditPostMobParam editPostMobParam9 = extensionMisc3.editPostMobParam;
        if (editPostMobParam9 != null) {
            num2 = editPostMobParam9.awemeType;
        } else {
            num2 = null;
        }
        if (extensionMisc12 == null) {
            extensionMisc12 = null;
        }
        EditPostMobParam editPostMobParam10 = extensionMisc12.editPostMobParam;
        if (editPostMobParam10 != null) {
            str6 = editPostMobParam10.afterPostDays;
        }
        if (!z) {
            str7 = "edit_post";
        }
        c1201050hMN2.getClass();
        C1201050hMN.LIZLLL(num2, "edit_post", str, str2, str6, str7, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSoftKeyboardHide(String str, List<? extends TextExtraStruct> list) {
        IAVPublishExtension.DefaultImpls.onSoftKeyboardHide(this, str, list);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onActivityResult(int i, int i2, Intent intent) {
        PoiData poiData;
        IAVPublishExtension.DefaultImpls.onActivityResult(this, i, i2, intent);
        if (i == 111 && intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra("poi");
            PoiPublishExtensionVM poiPublishExtensionVM = null;
            if (serializableExtra != null) {
                PoiPublishExtensionVM poiPublishExtensionVM2 = this.LLILLJJLI;
                if (poiPublishExtensionVM2 == null) {
                    poiPublishExtensionVM2 = null;
                }
                if (serializableExtra instanceof PoiData) {
                    poiData = (PoiData) serializableExtra;
                } else {
                    poiData = null;
                }
                poiPublishExtensionVM2.yQ2(poiData);
            }
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (intent.getStringExtra("keyword") == null) {
                PoiPublishExtensionVM poiPublishExtensionVM3 = this.LLILLJJLI;
                if (poiPublishExtensionVM3 == null) {
                    poiPublishExtensionVM3 = null;
                }
                poiPublishExtensionVM3.LL = "default_search_poi";
            } else {
                PoiPublishExtensionVM poiPublishExtensionVM4 = this.LLILLJJLI;
                if (poiPublishExtensionVM4 == null) {
                    poiPublishExtensionVM4 = null;
                }
                poiPublishExtensionVM4.LL = "search_poi";
            }
            try {
                String stringExtra = intent.getStringExtra("log_id");
                if (stringExtra != null) {
                    PoiPublishExtensionVM poiPublishExtensionVM5 = this.LLILLJJLI;
                    if (poiPublishExtensionVM5 == null) {
                        poiPublishExtensionVM5 = null;
                    }
                    poiPublishExtensionVM5.LLILLJJLI = stringExtra;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                String stringExtra2 = intent.getStringExtra("search_id");
                if (stringExtra2 != null) {
                    PoiPublishExtensionVM poiPublishExtensionVM6 = this.LLILLJJLI;
                    if (poiPublishExtensionVM6 != null) {
                        poiPublishExtensionVM = poiPublishExtensionVM6;
                    }
                    poiPublishExtensionVM.LLILLL = stringExtra2;
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final View onCreateOptionView(Context context, ViewGroup viewGroup, View view) {
        ExtensionMisc extensionMisc = this.LLILZ;
        if (extensionMisc == null) {
            extensionMisc = null;
        }
        Context context2 = extensionMisc.sceneContext;
        if (context2 == null && (context2 = this.LLILLL) == null) {
            context2 = null;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context2), R.layout.e9j, viewGroup, false);
        this.LLILZIL = viewTd;
        if (viewTd == null) {
            return null;
        }
        return viewTd;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onJumpToShootFromLynxWithPoiData(PoiData poiData, Integer num, String str) {
        IAVPublishExtension.DefaultImpls.onJumpToShootFromLynxWithPoiData(this, poiData, num, str);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreate(Fragment fragment, View view, LifecycleOwner lifecycleOwner, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, IAVPublishExtension.Callback callback, View view2) {
        AssemVMLazy assemVMLazy;
        boolean z;
        this.LLILLL = fragment.requireContext();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiPublishExtensionVM.class);
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 2617);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(961);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) fragment, 2618), aFwS256S0000000_18, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18(fragment, 2619), aFwS256S0000000_18, null, null, null);
            z = false;
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            z = false;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) fragment, 2620), aFwS256S0000000_18, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLILLJJLI = (PoiPublishExtensionVM) assemVMLazy.getValue();
        C723850SaN.LIZ(fragment, z, null, new AwS115S0400000_18(fragment, extensionMisc, callback, publishOutput, 17), 3);
        this.LLILZ = extensionMisc;
        PoiData poiData = publishOutput.poiData;
        if (poiData != null) {
            poiData.toString();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreateMultiViewPublish(Fragment fragment, View view, LifecycleOwner lifecycleOwner, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, List<UploadableDraftEffect> list, List<UploadableMobileEffect> list2, ExtensionMisc extensionMisc, IAVPublishExtension.Callback callback, View view2) {
        IAVPublishExtension.DefaultImpls.onCreateMultiViewPublish(this, fragment, view, lifecycleOwner, bundle, aVPublishContentType, publishOutput, list, list2, extensionMisc, callback, view2);
    }
}
