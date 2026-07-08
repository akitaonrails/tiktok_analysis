package Y;

import X.C0TOS;
import X.C1295960jpS;
import X.C1533950q1J;
import X.C197039127h;
import X.C20684815ws;
import X.C2344009Gk;
import X.C745910TNt;
import X.C746100TOm;
import X.C770580UKq;
import X.C785000Uqo;
import X.C786320Usw;
import X.C786410Ut5;
import X.InterfaceC1124060fMC;
import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.Description;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ProductInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.PickYourPlanPageFragment;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class AObserverS78S0400000_12 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
        }
    }

    public static final void onChanged$0(AObserverS78S0400000_12 aObserverS78S0400000_12, Object obj) {
        String str;
        BottomLeftSlotWidget bottomLeftSlotWidget = (BottomLeftSlotWidget) aObserverS78S0400000_12.l0;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) aObserverS78S0400000_12.l1;
        IIconSlot iIconSlot = (IIconSlot) aObserverS78S0400000_12.l2;
        InterfaceC1124060fMC interfaceC1124060fMC = (InterfaceC1124060fMC) aObserverS78S0400000_12.l3;
        if (bottomLeftSlotWidget.LLJILJILJ && !TextUtils.isEmpty(slotViewModel.LLJLL)) {
            str = slotViewModel.LLJLL;
        } else {
            str = slotViewModel.LLJLILLLLZIIL;
        }
        if (Boolean.TRUE.equals(slotViewModel.LLILZ.getValue()) && !TextUtils.isEmpty(str)) {
            if (Boolean.FALSE.equals(obj)) {
                bottomLeftSlotWidget.LLIZLLLIL.cancelAnimation();
                C786410Ut5.LLD(8, bottomLeftSlotWidget.LLIZLLLIL);
                C786410Ut5.LJZI(0, bottomLeftSlotWidget.LLILLJJLI);
                return;
            }
            if (bottomLeftSlotWidget.LLIZLLLIL.isAnimating()) {
                bottomLeftSlotWidget.LLIZLLLIL.cancelAnimation();
            }
            C786410Ut5.LLD(0, bottomLeftSlotWidget.LLIZLLLIL);
            if (!str.contains("http") && !str.contains("https")) {
                bottomLeftSlotWidget.LLIZLLLIL.setImageAssetsFolder(null);
                bottomLeftSlotWidget.LLIZLLLIL.setAnimation(str);
            } else {
                bottomLeftSlotWidget.LLIZLLLIL.setAnimationFromUrl(str);
            }
            bottomLeftSlotWidget.LLIZLLLIL.addAnimatorListener(bottomLeftSlotWidget.LLJJIJI);
            bottomLeftSlotWidget.LLIZLLLIL.addAnimatorListener(iIconSlot.LIZ());
            bottomLeftSlotWidget.LLIZLLLIL.setFailureListener(new C786320Usw(bottomLeftSlotWidget, 0));
            bottomLeftSlotWidget.LLIZLLLIL.playAnimation();
            C770580UKq.LIZIZ(interfaceC1124060fMC, null);
            return;
        }
        bottomLeftSlotWidget.LLIZLLLIL.cancelAnimation();
        C786410Ut5.LLD(8, bottomLeftSlotWidget.LLIZLLLIL);
        C786410Ut5.LJZI(0, bottomLeftSlotWidget.LLILLJJLI);
    }

    public static final void onChanged$1(AObserverS78S0400000_12 aObserverS78S0400000_12, Object obj) {
        String str;
        if (((C785000Uqo) aObserverS78S0400000_12.l3).LLJILJIL && !TextUtils.isEmpty(((IIconSlot.SlotViewModel) aObserverS78S0400000_12.l0).LLJLL)) {
            str = ((IIconSlot.SlotViewModel) aObserverS78S0400000_12.l0).LLJLL;
        } else {
            str = ((IIconSlot.SlotViewModel) aObserverS78S0400000_12.l0).LLJLILLLLZIIL;
        }
        if (Boolean.TRUE.equals(((IIconSlot.SlotViewModel) aObserverS78S0400000_12.l0).LLILZ.getValue()) && !TextUtils.isEmpty(str)) {
            if (Boolean.FALSE.equals(obj)) {
                ((C785000Uqo) aObserverS78S0400000_12.l3).LLILZ.cancelAnimation();
                C786410Ut5.LLD(8, ((C785000Uqo) aObserverS78S0400000_12.l3).LLILZ);
                C786410Ut5.LLJJIJIL(((C785000Uqo) aObserverS78S0400000_12.l3).LLILZLL, 0);
                return;
            }
            C786410Ut5.LLD(0, ((C785000Uqo) aObserverS78S0400000_12.l3).LLILZ);
            if (!str.contains("http") && !str.contains("https")) {
                C1295960jpS c1295960jpS = ((C785000Uqo) aObserverS78S0400000_12.l3).LLILZ;
                ((IIconSlot.SlotViewModel) aObserverS78S0400000_12.l0).getClass();
                c1295960jpS.setImageAssetsFolder(null);
                ((C785000Uqo) aObserverS78S0400000_12.l3).LLILZ.setAnimation(str);
            } else {
                ((C785000Uqo) aObserverS78S0400000_12.l3).LLILZ.setAnimationFromUrl(str);
            }
            ((C785000Uqo) aObserverS78S0400000_12.l3).LLILZ.addAnimatorListener(((IIconSlot) aObserverS78S0400000_12.l1).LIZ());
            ((C785000Uqo) aObserverS78S0400000_12.l3).LLILZ.addAnimatorListener(new ALAdapterS9S0100000_12(aObserverS78S0400000_12, 24));
            ((C785000Uqo) aObserverS78S0400000_12.l3).LLILZ.setFailureListener(new C786320Usw((IIconSlot.SlotViewModel) aObserverS78S0400000_12.l0, 3));
            ((C785000Uqo) aObserverS78S0400000_12.l3).LLILZ.playAnimation();
            C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS78S0400000_12.l2, null);
            return;
        }
        ((C785000Uqo) aObserverS78S0400000_12.l3).LLILZ.cancelAnimation();
        C786410Ut5.LLD(8, ((C785000Uqo) aObserverS78S0400000_12.l3).LLILZ);
        C786410Ut5.LLJJIJIL(((C785000Uqo) aObserverS78S0400000_12.l3).LLILZLL, 0);
    }

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
    public static final void onChanged$2(AObserverS78S0400000_12 aObserverS78S0400000_12, Object obj) {
        String str;
        ProductInfo productInfo;
        Description description;
        String skippableButtonText;
        boolean z;
        String str2;
        int i;
        boolean zLJFF;
        Integer preTickingSelection;
        Description description2;
        Integer num = (Integer) obj;
        if (!Intrinsics.LJFF(((PickYourPlanPageFragment) aObserverS78S0400000_12.l0).LLILLJJLI, num)) {
            int i2 = 8;
            ProductInfo productInfo2 = null;
            String str3 = null;
            int iIntValue = 0;
            if (num != null && num.intValue() == 0) {
                C197039127h c197039127h = ((PickYourPlanPageFragment) aObserverS78S0400000_12.l0).LLJJ;
                if (c197039127h != null) {
                    OfferInfo offerInfo = (OfferInfo) aObserverS78S0400000_12.l1;
                    if (offerInfo != null) {
                        str3 = offerInfo.selectButtonText;
                    }
                    c197039127h.setText(str3);
                }
                C197039127h c197039127h2 = ((PickYourPlanPageFragment) aObserverS78S0400000_12.l0).LLJJ;
                if (c197039127h2 != null) {
                    c197039127h2.setEnabled(true);
                }
                C197039127h c197039127h3 = ((PickYourPlanPageFragment) aObserverS78S0400000_12.l0).LLJJI;
                if (c197039127h3 != null) {
                    C786410Ut5.LLLLLLJ(c197039127h3, 8);
                }
                OfferInfo offerInfo2 = (OfferInfo) aObserverS78S0400000_12.l1;
                if (offerInfo2 != null) {
                    offerInfo2.setSelected(true);
                }
                OfferInfo offerInfo3 = (OfferInfo) aObserverS78S0400000_12.l2;
                if (offerInfo3 != null) {
                    offerInfo3.setSelected(false);
                }
                OfferInfo offerInfo4 = (OfferInfo) aObserverS78S0400000_12.l1;
                if (offerInfo4 != null && (description2 = offerInfo4.selectedButtonDescription) != null) {
                    PickYourPlanPageFragment pickYourPlanPageFragment = (PickYourPlanPageFragment) aObserverS78S0400000_12.l0;
                    Context context = (Context) aObserverS78S0400000_12.l3;
                    TuxTextView tuxTextView = pickYourPlanPageFragment.LLJILLL;
                    if (tuxTextView != null) {
                        C746100TOm c746100TOm = C746100TOm.LIZ;
                        String str4 = description2.description;
                        List<String> list = description2.hyperText;
                        List<String> list2 = description2.hyperLink;
                        Integer numValueOf = Integer.valueOf(R.attr.a1h);
                        Boolean bool = Boolean.TRUE;
                        c746100TOm.getClass();
                        tuxTextView.setText(C746100TOm.LIZLLL(context, str4, list, list2, numValueOf, bool));
                    }
                    TuxTextView tuxTextView2 = pickYourPlanPageFragment.LLJILLL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
            } else {
                C197039127h c197039127h4 = ((PickYourPlanPageFragment) aObserverS78S0400000_12.l0).LLJJ;
                if (c197039127h4 != null) {
                    OfferInfo offerInfo5 = (OfferInfo) aObserverS78S0400000_12.l2;
                    if (offerInfo5 != null) {
                        str2 = offerInfo5.selectButtonText;
                    } else {
                        str2 = null;
                    }
                    c197039127h4.setText(str2);
                }
                PickYourPlanPageFragment pickYourPlanPageFragment2 = (PickYourPlanPageFragment) aObserverS78S0400000_12.l0;
                C197039127h c197039127h5 = pickYourPlanPageFragment2.LLJJ;
                if (c197039127h5 != null) {
                    if (pickYourPlanPageFragment2.LLJJL.getValue() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c197039127h5.setEnabled(z);
                }
                PickYourPlanPageFragment pickYourPlanPageFragment3 = (PickYourPlanPageFragment) aObserverS78S0400000_12.l0;
                C197039127h c197039127h6 = pickYourPlanPageFragment3.LLJJI;
                if (c197039127h6 != null) {
                    PickYourAdPlanPage pickYourAdPlanPage = pickYourPlanPageFragment3.LLJ;
                    if (pickYourAdPlanPage != null) {
                        skippableButtonText = pickYourAdPlanPage.getSkippableButtonText();
                    } else {
                        skippableButtonText = null;
                    }
                    if (C1533950q1J.LJ(skippableButtonText)) {
                        i2 = 0;
                    }
                    C786410Ut5.LLLLLLJ(c197039127h6, i2);
                }
                C197039127h c197039127h7 = ((PickYourPlanPageFragment) aObserverS78S0400000_12.l0).LLJJ;
                if (c197039127h7 == null || !c197039127h7.isEnabled()) {
                    C0TOS c0tos = C0TOS.LIZ;
                    OfferInfo offerInfo6 = (OfferInfo) aObserverS78S0400000_12.l2;
                    if (offerInfo6 != null && (productInfo = offerInfo6.productInfo) != null) {
                        str = productInfo.merchantId;
                    } else {
                        str = null;
                        if (offerInfo6 != null) {
                        }
                        MutableLiveData<IapProductDetail> mutableLiveData = ((PickYourPlanPageFragment) aObserverS78S0400000_12.l0).LLJJL;
                        c0tos.getClass();
                        C0TOS.LIZIZ(str, productInfo2, mutableLiveData, 2);
                    }
                    productInfo2 = offerInfo6.productInfo;
                    MutableLiveData<IapProductDetail> mutableLiveData2 = ((PickYourPlanPageFragment) aObserverS78S0400000_12.l0).LLJJL;
                    c0tos.getClass();
                    C0TOS.LIZIZ(str, productInfo2, mutableLiveData2, 2);
                }
                OfferInfo offerInfo7 = (OfferInfo) aObserverS78S0400000_12.l1;
                if (offerInfo7 != null) {
                    offerInfo7.setSelected(false);
                }
                OfferInfo offerInfo8 = (OfferInfo) aObserverS78S0400000_12.l2;
                if (offerInfo8 != null) {
                    offerInfo8.setSelected(true);
                }
                OfferInfo offerInfo9 = (OfferInfo) aObserverS78S0400000_12.l2;
                if (offerInfo9 != null && (description = offerInfo9.selectedButtonDescription) != null) {
                    PickYourPlanPageFragment pickYourPlanPageFragment4 = (PickYourPlanPageFragment) aObserverS78S0400000_12.l0;
                    Context context2 = (Context) aObserverS78S0400000_12.l3;
                    TuxTextView tuxTextView3 = pickYourPlanPageFragment4.LLJILLL;
                    if (tuxTextView3 != null) {
                        C746100TOm c746100TOm2 = C746100TOm.LIZ;
                        String str5 = description.description;
                        List<String> list3 = description.hyperText;
                        List<String> list4 = description.hyperLink;
                        Integer numValueOf2 = Integer.valueOf(R.attr.a1h);
                        Boolean bool2 = Boolean.TRUE;
                        c746100TOm2.getClass();
                        tuxTextView3.setText(C746100TOm.LIZLLL(context2, str5, list3, list4, numValueOf2, bool2));
                    }
                    TuxTextView tuxTextView4 = pickYourPlanPageFragment4.LLJILLL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
            }
            PickYourPlanPageFragment pickYourPlanPageFragment5 = (PickYourPlanPageFragment) aObserverS78S0400000_12.l0;
            Integer num2 = pickYourPlanPageFragment5.LLILLJJLI;
            int iIntValue2 = num.intValue();
            if (pickYourPlanPageFragment5.LLJJJJ) {
                pickYourPlanPageFragment5.LLJJJJ = false;
            } else if (num2 == null || num2.intValue() != iIntValue2) {
                boolean z2 = !pickYourPlanPageFragment5.LLJJJIL;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJ(pickYourPlanPageFragment5.LLJJJJLIIL, "enter_from");
                if (iIntValue2 == 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                c2344009Gk.LIZJ(i, "click_value");
                c2344009Gk.LIZLLL(System.currentTimeMillis() - pickYourPlanPageFragment5.LLJJJ, "click_time");
                c2344009Gk.LJ(Boolean.valueOf(z2), "first_click");
                if (pickYourPlanPageFragment5.LLJJIII) {
                    PickYourAdPlanPage pickYourAdPlanPage2 = pickYourPlanPageFragment5.LLJ;
                    if (pickYourAdPlanPage2 != null) {
                        zLJFF = Intrinsics.LJFF(pickYourAdPlanPage2.isSkippable(), Boolean.TRUE);
                    } else {
                        zLJFF = false;
                    }
                    c2344009Gk.LJ(Boolean.valueOf(zLJFF), "is_skippable");
                    PickYourAdPlanPage pickYourAdPlanPage3 = pickYourPlanPageFragment5.LLJ;
                    if (pickYourAdPlanPage3 != null && (preTickingSelection = pickYourAdPlanPage3.getPreTickingSelection()) != null) {
                        iIntValue = preTickingSelection.intValue();
                    }
                    c2344009Gk.LIZJ(iIntValue, "design_type");
                    c2344009Gk.LIZJ(pickYourPlanPageFragment5.LLIZLLLIL, "prompt_type");
                }
                C20684815ws.LJIILLIIL("click_ttadfree_pickplan", c2344009Gk.LIZ);
                pickYourPlanPageFragment5.LLJJJIL = true;
            }
            PickYourPlanPageFragment pickYourPlanPageFragment6 = (PickYourPlanPageFragment) aObserverS78S0400000_12.l0;
            pickYourPlanPageFragment6.LLILLJJLI = num;
            if (num2 != null) {
                int iIntValue3 = num2.intValue();
                C745910TNt c745910TNt = pickYourPlanPageFragment6.LLJILJILJ;
                if (c745910TNt != null) {
                    c745910TNt.notifyItemChanged(iIntValue3);
                }
            }
            C745910TNt c745910TNt2 = ((PickYourPlanPageFragment) aObserverS78S0400000_12.l0).LLJILJILJ;
            if (c745910TNt2 != null) {
                c745910TNt2.notifyItemChanged(num.intValue());
            }
            PickYourPlanPageFragment pickYourPlanPageFragment7 = (PickYourPlanPageFragment) aObserverS78S0400000_12.l0;
            RecyclerView recyclerView = pickYourPlanPageFragment7.LLJILJIL;
            if (recyclerView != null) {
                HandlerHook.viewPostDelay(recyclerView, new ARunnableS81S0200000_12(num, pickYourPlanPageFragment7, 117), 300L);
            }
            View view = ((PickYourPlanPageFragment) aObserverS78S0400000_12.l0).getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS81S0200000_12(num, (PickYourPlanPageFragment) aObserverS78S0400000_12.l0, 118));
            }
        }
    }

    public AObserverS78S0400000_12(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
