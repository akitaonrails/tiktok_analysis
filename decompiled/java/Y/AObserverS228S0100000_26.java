package Y;

import X.C11GO;
import X.C1207404nw;
import X.C1250250idj;
import X.C1389890mGx;
import X.C1709830uaz;
import X.C1738590vLN;
import X.C1744460vUq;
import X.C1751630vgP;
import X.C1761290vvz;
import X.C1761300vw0;
import X.C318570CeF;
import X.C786410Ut5;
import X.InterfaceC1710120ubS;
import android.content.res.Configuration;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.FeedbackPage;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;
import com.ss.android.ugc.aweme.changeregion.ui.MusCountryListActivity;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.pad.ShopMallPadAssem;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.prop.mobileefffect.ProgressBarDialog;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public class AObserverS228S0100000_26 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
        }
    }

    public AObserverS228S0100000_26(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS228S0100000_26 aObserverS228S0100000_26, Object obj) {
        TuxNavBar tuxNavBarHS = ((DistrictFragment) aObserverS228S0100000_26.l0).hS();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = (String) obj;
        tuxNavBarHS.LJIJJ(c1250250idj);
    }

    public static final void onChanged$1(AObserverS228S0100000_26 aObserverS228S0100000_26, Object obj) {
        boolean z;
        ShopMallPadAssem shopMallPadAssem = (ShopMallPadAssem) aObserverS228S0100000_26.l0;
        if (((Configuration) obj).orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        shopMallPadAssem.m185do(z);
    }

    public static final void onChanged$10(AObserverS228S0100000_26 aObserverS228S0100000_26, Object obj) {
        String str = (String) obj;
        if (str != null && !a0.LJJJIL(str)) {
            ((DistrictFragment) aObserverS228S0100000_26.l0).cS().getEditTextView().setHint(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public static final void onChanged$11(Y.AObserverS228S0100000_26 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS228S0100000_26.onChanged$11(Y.AObserverS228S0100000_26, java.lang.Object):void");
    }

    public static final void onChanged$12(AObserverS228S0100000_26 aObserverS228S0100000_26, Object obj) {
        NextLiveData<CopyOnWriteArrayList<C1761300vw0>> nextLiveData;
        CopyOnWriteArrayList<C1761300vw0> value;
        int size;
        C1761290vvz c1761290vvz;
        NextLiveData<C1761290vvz> nextLiveData2;
        String str;
        GalleryViewerViewModel galleryViewerViewModel;
        NextLiveData<C1761290vvz> nextLiveData3;
        C1761290vvz value2;
        C1761300vw0 c1761300vw0;
        NextLiveData<CopyOnWriteArrayList<C1761300vw0>> nextLiveData4;
        ((GalleryViewerFragment) aObserverS228S0100000_26.l0).LLLF = ((Integer) obj).intValue();
        GalleryViewerViewModel galleryViewerViewModel2 = ((GalleryViewerFragment) aObserverS228S0100000_26.l0).LLIZ;
        String str2 = null;
        if (galleryViewerViewModel2 != null && (nextLiveData = galleryViewerViewModel2.LLJJIII) != null && nextLiveData.getValue() != null) {
            GalleryViewerFragment galleryViewerFragment = (GalleryViewerFragment) aObserverS228S0100000_26.l0;
            GalleryViewerViewModel galleryViewerViewModel3 = galleryViewerFragment.LLIZ;
            if (galleryViewerViewModel3 != null && (nextLiveData4 = galleryViewerViewModel3.LLJJIII) != null) {
                value = nextLiveData4.getValue();
            } else {
                value = null;
            }
            int i = galleryViewerFragment.LLLF;
            if (value != null) {
                size = value.size();
            } else {
                size = 0;
            }
            if (i < size) {
                if (value != null && (c1761300vw0 = value.get(galleryViewerFragment.LLLF)) != null) {
                    c1761290vvz = c1761300vw0.LIZIZ;
                } else {
                    c1761290vvz = null;
                }
                GalleryViewerViewModel galleryViewerViewModel4 = galleryViewerFragment.LLIZ;
                if (galleryViewerViewModel4 != null) {
                    nextLiveData2 = galleryViewerViewModel4.LLJJIJI;
                } else {
                    nextLiveData2 = null;
                }
                if (c1761290vvz != null) {
                    str = c1761290vvz.LIZ;
                } else {
                    str = null;
                }
                if (nextLiveData2 != null && (value2 = nextLiveData2.getValue()) != null) {
                    str2 = value2.LIZ;
                }
                if (!Intrinsics.LJFF(str, str2) && (galleryViewerViewModel = galleryViewerFragment.LLIZ) != null && (nextLiveData3 = galleryViewerViewModel.LLJJIJI) != null) {
                    nextLiveData3.postValue(c1761290vvz);
                }
            }
        }
    }

    public static final void onChanged$13(AObserverS228S0100000_26 aObserverS228S0100000_26, Object obj) {
        MusCountryListActivity musCountryListActivity = (MusCountryListActivity) aObserverS228S0100000_26.l0;
        Collection<? extends Country> collection = (Collection) obj;
        C786410Ut5.LJIIJ(musCountryListActivity.LLJ);
        musCountryListActivity.LLILZ.addAll(collection);
        musCountryListActivity.LLILLL.addAll(collection);
        C1709830uaz c1709830uaz = musCountryListActivity.LLIZLLLIL;
        if (c1709830uaz != null) {
            c1709830uaz.notifyDataSetChanged();
        }
    }

    public static final void onChanged$14(AObserverS228S0100000_26 aObserverS228S0100000_26, Object obj) {
        MusCountryListActivity musCountryListActivity = (MusCountryListActivity) aObserverS228S0100000_26.l0;
        String str = (String) obj;
        String str2 = MusCountryListActivity._pnsPageId;
        musCountryListActivity.getClass();
        if (C1207404nw.LIZ()) {
            C1389890mGx c1389890mGx = new C1389890mGx(musCountryListActivity);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        } else {
            InterfaceC1710120ubS interfaceC1710120ubS = MusCountryListActivity.LLJI;
            if (interfaceC1710120ubS != null) {
                interfaceC1710120ubS.onError(str);
            }
        }
        musCountryListActivity.finish();
    }

    public static final void onChanged$15(AObserverS228S0100000_26 aObserverS228S0100000_26, Object obj) {
        String uid;
        C1751630vgP c1751630vgP;
        SellerInfo sellerInfo;
        User user;
        FollowStatus followStatus = (FollowStatus) obj;
        String userId = followStatus.getUserId();
        ProductPackStruct productPackStruct = ((PdpHeadNavBarWidget) aObserverS228S0100000_26.l0).LJIJI().LLJILLL;
        if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null && (user = sellerInfo.user) != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        if (Intrinsics.LJFF(userId, uid)) {
            if (followStatus.getFollowStatus() == 1 && (c1751630vgP = ((PdpHeadNavBarWidget) aObserverS228S0100000_26.l0).LLL) != null) {
                c1751630vgP.i0(false, null);
            }
            ((PdpHeadNavBarWidget) aObserverS228S0100000_26.l0).LLJLILLLLZIIL = followStatus.getFollowStatus();
        }
    }

    public static final void onChanged$2(AObserverS228S0100000_26 aObserverS228S0100000_26, Object obj) {
        C1738590vLN c1738590vLN = (C1738590vLN) obj;
        if (!c1738590vLN.LIZIZ) {
            c1738590vLN.LIZIZ = true;
            if (c1738590vLN.LIZ != 0) {
                ((Function0) aObserverS228S0100000_26.l0).invoke();
            }
        }
    }

    public static final void onChanged$3(AObserverS228S0100000_26 aObserverS228S0100000_26, Object obj) {
        C1738590vLN c1738590vLN = (C1738590vLN) obj;
        if (!c1738590vLN.LIZIZ) {
            c1738590vLN.LIZIZ = true;
            if (c1738590vLN.LIZ != 0) {
                ((Function0) aObserverS228S0100000_26.l0).invoke();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03bf  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r17v0, types: [kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$4(Y.AObserverS228S0100000_26 r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS228S0100000_26.onChanged$4(Y.AObserverS228S0100000_26, java.lang.Object):void");
    }

    public static final void onChanged$5(AObserverS228S0100000_26 aObserverS228S0100000_26, Object obj) {
        C1738590vLN c1738590vLN = (C1738590vLN) obj;
        if (!c1738590vLN.LIZIZ) {
            c1738590vLN.LIZIZ = true;
            if (c1738590vLN.LIZ != 0) {
                ((Function0) aObserverS228S0100000_26.l0).invoke();
            }
        }
    }

    public static final void onChanged$6(AObserverS228S0100000_26 aObserverS228S0100000_26, Object obj) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        C11GO c11go = (C11GO) ((FeedbackPage) aObserverS228S0100000_26.l0).MR().getAccessory();
        boolean z2 = false;
        if (iIntValue == 0) {
            z = true;
        } else {
            z = false;
        }
        c11go.LJIILJJIL(z);
        C11GO c11go2 = (C11GO) ((FeedbackPage) aObserverS228S0100000_26.l0).NR().getAccessory();
        if (iIntValue == 1) {
            z2 = true;
        }
        c11go2.LJIILJJIL(z2);
        if (iIntValue != 0 && iIntValue != 1) {
            return;
        }
        ((FeedbackPage) aObserverS228S0100000_26.l0).OR().setEnabled(true);
    }

    public static final void onChanged$7(AObserverS228S0100000_26 aObserverS228S0100000_26, Object obj) {
        ECMMKViewModel eCMMKViewModel;
        ECMMKContainerController eCMMKContainerController = ((ShopMallMixAssem) aObserverS228S0100000_26.l0).LLJILJILJ;
        if (eCMMKContainerController != null && (eCMMKViewModel = eCMMKContainerController.LLJJJJ) != null) {
            Iterator it2 = ((ArrayList) eCMMKViewModel.LLJILJIL).iterator();
            while (it2.hasNext()) {
                ((Function1) it2.next()).invoke(Unit.LIZ);
            }
        }
    }

    public static final void onChanged$8(AObserverS228S0100000_26 aObserverS228S0100000_26, Object obj) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aObserverS228S0100000_26.l0;
        String str = StickerPropDetailFragment._pnsPageId;
        stickerPropDetailFragment.getClass();
        if (obj instanceof C318570CeF) {
            FragmentManager fragmentManager = stickerPropDetailFragment.getFragmentManager();
            if (fragmentManager != null) {
                if (stickerPropDetailFragment.LLZZZZ == null) {
                    ProgressBarDialog progressBarDialog = new ProgressBarDialog(2131833763);
                    stickerPropDetailFragment.LLZZZZ = progressBarDialog;
                    progressBarDialog.setCancelable(false);
                }
                stickerPropDetailFragment.LLZZZZ.show(fragmentManager, "deletionEffectDialog");
                return;
            }
            return;
        }
        ProgressBarDialog progressBarDialog2 = stickerPropDetailFragment.LLZZZZ;
        if (progressBarDialog2 == null) {
            return;
        }
        progressBarDialog2.dismiss();
    }

    public static final void onChanged$9(AObserverS228S0100000_26 aObserverS228S0100000_26, Object obj) {
        C1744460vUq<District> c1744460vUq;
        String str = (String) obj;
        if (str != null && !a0.LJJJIL(str) && (c1744460vUq = ((DistrictFragment) aObserverS228S0100000_26.l0).LLJJIJIL) != null) {
            c1744460vUq.setHint(str);
        }
    }
}
