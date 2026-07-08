package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS23S0101000_12;
import Y.ATListenerS461S0100000_29;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.commercialize.anchor.service.GetLeadsAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.services.publish.IDebugAddLinkOptionService;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: renamed from: X.11G7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11G7 extends DialogC1389100mFg {
    public final List<AnchorPublishStruct> LLJILJIL;
    public final LifecycleOwner LLJILJILJ;
    public View LLJILLL;
    public RecyclerView LLJJ;
    public View LLJJI;
    public C19403510vh LLJJIII;
    public LinearLayout LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public EditText LLJJIJIL;
    public TuxIconView LLJJJ;
    public TuxTextView LLJJJIL;
    public View LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public RecyclerView LLJJL;
    public C19400410vC LLJJLIIIJLLLLLLLZ;
    public final List<C19400610vE> LLJL;
    public HashMap<String, AnchorPublishStruct> LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;

    public static boolean LJLIL() {
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        if (iAVPublishPageUIRefactorService != null) {
            return iAVPublishPageUIRefactorService.isRefactorPublishAddLinkOption();
        }
        return false;
    }

    public final boolean LJLI() {
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService;
        IDebugAddLinkOptionService iDebugAddLinkOptionServiceDebugAddLinkOptionService;
        return ((ArrayList) this.LLJL).size() >= 10 || !((iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null)) == null || (iDebugAddLinkOptionServiceDebugAddLinkOptionService = iAVPublishPageUIRefactorService.debugAddLinkOptionService()) == null || !iDebugAddLinkOptionServiceDebugAddLinkOptionService.mockAddedMoreThanLimitAnchors());
    }

    public final void LJLIIIL() {
        Editable editableLLJILLL;
        EditText editText = this.LLJJIJIL;
        if (editText != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMuW/7mDiSX+QwHCV+hWP1sLl6", null))) != null) {
            editableLLJILLL.clear();
        }
        C19403510vh c19403510vh = this.LLJJIII;
        if (c19403510vh != null) {
            c19403510vh.LL = this.LLJILJIL;
            c19403510vh.notifyDataSetChanged();
        }
        TuxIconView tuxIconView = this.LLJJJ;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        View view = this.LLJJJJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        LJLILLLLZI(false);
    }

    public final void LJLJI() {
        EditText editText = this.LLJJIJIL;
        if (editText != null) {
            editText.clearFocus();
            editText.setCursorVisible(false);
        }
        TuxTextView tuxTextView = this.LLJJJIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        LJLIIIL();
        LJLILLLLZI(false);
        C1069330dvv.LIZ(getContext(), this.LLJJI);
    }

    public final void LJLJJI() {
        C19403510vh c19403510vh = this.LLJJIII;
        if (c19403510vh != null) {
            c19403510vh.notifyDataSetChanged();
        }
    }

    public final void LJLJJL() {
        List<C19400610vE> list;
        C19400410vC c19400410vC = this.LLJJLIIIJLLLLLLLZ;
        if (c19400410vC != null && (list = c19400410vC.LLILLL) != null && ((ArrayList) list).size() != ((ArrayList) this.LLJL).size()) {
            ((ArrayList) this.LLJL).clear();
            ((ArrayList) this.LLJL).addAll(list);
        }
        LJLILLLLZI(false);
        View view = this.LLJJI;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS112S0100000_12(this, 233));
        }
    }

    public final void LJLJJLL() {
        for (AnchorPublishStruct anchorPublishStruct : this.LLJILJIL) {
            if (anchorPublishStruct.type == EnumC1430380nKG.GET_LEADS.getTYPE()) {
                int iLIZ = GetLeadsAnchorService.LJ().LIZ();
                anchorPublishStruct.getLeadsAnchorState = iLIZ;
                anchorPublishStruct.enable = iLIZ == 0;
            }
        }
        C19403510vh c19403510vh = this.LLJJIII;
        if (c19403510vh != null) {
            c19403510vh.LL = this.LLJILJIL;
            c19403510vh.notifyDataSetChanged();
        }
    }

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Collection collectionValues;
        Collection collectionValues2;
        RecyclerView recyclerView = this.LLJJ;
        String strLJJLIIIJ = null;
        List<AnchorPublishStruct> listSubList = this.LLJILJIL.subList(0, ((LinearLayoutManager) (recyclerView != null ? recyclerView.getLayoutManager() : null)).findLastVisibleItemPosition() + 1);
        ArrayList<AnchorPublishStruct> arrayList = new ArrayList();
        for (AnchorPublishStruct anchorPublishStruct : listSubList) {
            if (anchorPublishStruct.isNew) {
                arrayList.add(anchorPublishStruct);
            }
        }
        if (!arrayList.isEmpty()) {
            AnchorListManager.LIZ.getClass();
            C11G9 c11g9 = C11G9.TitleSeen;
            ArrayList arrayList2 = new ArrayList();
            for (AnchorPublishStruct anchorPublishStruct2 : arrayList) {
                if (anchorPublishStruct2.isNew) {
                    arrayList2.add(new AnchorListManager.AnchorAddLinkImpression(c11g9.getValue(), anchorPublishStruct2.type, anchorPublishStruct2.subtype));
                }
            }
            ((InterfaceC1849700yEa) AnchorListManager.LIZJ.create(InterfaceC1849700yEa.class)).LIZ(C1741890vQh.LJIIIIZZ(arrayList2));
        }
        C1393710mN7 c1393710mN7 = C1393710mN7.LIZ;
        List<AnchorPublishStruct> list = this.LLJILJIL;
        c1393710mN7.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", curUserId);
        AnchorListManager.LIZ.getClass();
        Map mapLJII = AnchorListManager.LJII();
        if (mapLJII != null && (collectionValues2 = mapLJII.values()) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(collectionValues2, ",", null, null, 0, null, AFwS259S0000000_21.get$arr$(394), 30);
        }
        c2344009Gk.LJIIIIZZ("origin_keys", strLJJLIIIJ);
        if (list != null) {
            Iterator<AnchorPublishStruct> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIL().contains(Integer.valueOf(it2.next().type))) {
                        break;
                    }
                } else {
                    AnchorListManager.LIZ.getClass();
                    Map mapLJII2 = AnchorListManager.LJII();
                    if (mapLJII2 != null && (collectionValues = mapLJII2.values()) != null) {
                        Iterator it3 = collectionValues.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIL().contains(Integer.valueOf(((AnchorPublishStruct) it3.next()).type))) {
                                    ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJZ(2001, new LinkedHashMap(c2344009Gk.LIZ));
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
        }
        LJLJI();
        LJLIIIL();
        super.dismiss();
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        if (this.LLJILJIL.isEmpty() && ((ArrayList) this.LLJL).isEmpty()) {
            return;
        }
        this.LLJLL = !this.LLJL.isEmpty();
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.11GJ
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AnchorPublishStruct next;
                AnchorPublishStruct next2;
                String str;
                int i;
                ExtensionMisc extensionMisc;
                MobParam mobParam;
                String str2;
                int i2;
                ExtensionMisc extensionMisc2;
                MobParam mobParam2;
                String str3;
                ExtensionMisc extensionMisc3;
                MobParam mobParam3;
                String str4;
                View viewFindViewById = ((C19GU) dialogInterface).findViewById(R.id.fpl);
                if (viewFindViewById != null) {
                    this.LL.getClass();
                    if (C11G7.LJLIL()) {
                        this.LL.LJLJJL();
                    } else {
                        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
                        bottomSheetBehaviorFrom.setPeekHeight(viewFindViewById.getHeight());
                        bottomSheetBehaviorFrom.setSkipCollapsed(false);
                        final C11G7 c11g7 = this.LL;
                        bottomSheetBehaviorFrom.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.11GI
                            @Override // X.AbstractC1177930gl5
                            public final void LIZJ(View view, float f) {
                                if (Math.abs(f) > 0.6d) {
                                    c11g7.LJLJI();
                                }
                            }

                            @Override // X.AbstractC1177930gl5
                            public final void LIZLLL(int i3, View view) {
                                if (i3 == 5) {
                                    C786410Ut5.LJIIIZ(c11g7);
                                }
                            }
                        });
                    }
                    C11G7 c11g72 = this.LL;
                    Iterator<AnchorPublishStruct> it2 = c11g72.LLJILJIL.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.type == EnumC1430380nKG.PAID_COLLECTION.getTYPE()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    AnchorPublishStruct anchorPublishStruct = next;
                    if (anchorPublishStruct != null) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        AnchorPublishStruct anchorPublishStruct2 = (AnchorPublishStruct) C13LP.LJJJLZIJ(0, c11g72.LLJILJIL);
                        if (anchorPublishStruct2 != null && (extensionMisc3 = anchorPublishStruct2.extensionMisc) != null && (mobParam3 = extensionMisc3.mobParam) != null && (str4 = mobParam3.creationId) != null) {
                            c2344009Gk.LJFF("creation_id", str4);
                        }
                        if (anchorPublishStruct.enable) {
                            c2344009Gk.LIZJ(1, "is_available");
                        } else {
                            c2344009Gk.LIZJ(0, "is_available");
                            c2344009Gk.LJFF("na_reason", "sound_not_compliant");
                        }
                        c2344009Gk.LJFF("button_for", String.valueOf(anchorPublishStruct.type));
                        AnchorListManager.LIZ.getClass();
                        c2344009Gk.LJFF("anchor_type", AnchorListManager.LJIIIIZZ(anchorPublishStruct));
                        c2344009Gk.LJFF("EVENT_ORIGIN_FEATURE", "TEMAI");
                        C20684815ws.LJIILLIIL("tiktokec_video_add_link_show", c2344009Gk.LIZ);
                    }
                    C11G7 c11g73 = this.LL;
                    boolean z = false;
                    boolean z2 = false;
                    for (AnchorPublishStruct anchorPublishStruct3 : c11g73.LLJILJIL) {
                        if (anchorPublishStruct3.type == EnumC1430380nKG.ANCHOR_SHOP_LINK.getTYPE()) {
                            z2 = anchorPublishStruct3.enable;
                            z = true;
                        }
                    }
                    if (z) {
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LJFF("EVENT_ORIGIN_FEATURE", "TEMAI");
                        c2344009Gk2.LJFF("anchor_type", "product");
                        c2344009Gk2.LJFF("author_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
                        c2344009Gk2.LJFF("button_for", "6");
                        c2344009Gk2.LJFF("page_name", "video_add_link");
                        if (z2) {
                            c2344009Gk2.LIZJ(1, "is_available");
                            i2 = 0;
                        } else {
                            i2 = 0;
                            c2344009Gk2.LIZJ(0, "is_available");
                            c2344009Gk2.LJFF("na_reason", "sound_not_compliant");
                        }
                        AnchorPublishStruct anchorPublishStruct4 = (AnchorPublishStruct) C13LP.LJJJLZIJ(i2, c11g73.LLJILJIL);
                        if (anchorPublishStruct4 != null && (extensionMisc2 = anchorPublishStruct4.extensionMisc) != null && (mobParam2 = extensionMisc2.mobParam) != null && (str3 = mobParam2.creationId) != null) {
                            c2344009Gk2.LJFF("creation_id", str3);
                        }
                        C1739200vMM.LIZ.getClass();
                        c2344009Gk2.LJFF("traceparent", C1739200vMM.LIZ());
                        for (Map.Entry<String, Integer> entry : ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIILLIIL().entrySet()) {
                            c2344009Gk2.LIZJ(entry.getValue().intValue(), entry.getKey());
                        }
                        C20684815ws.LJIILLIIL("tiktokec_video_add_link_show", c2344009Gk2.LIZ);
                    }
                    C11G7 c11g74 = this.LL;
                    Iterator<AnchorPublishStruct> it3 = c11g74.LLJILJIL.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJJ().contains(Integer.valueOf(next2.type))) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    AnchorPublishStruct anchorPublishStruct5 = next2;
                    if (anchorPublishStruct5 != null) {
                        boolean z3 = anchorPublishStruct5.enable;
                        C2344009Gk c2344009Gk3 = new C2344009Gk();
                        c2344009Gk3.LJFF("EVENT_ORIGIN_FEATURE", "TEMAI");
                        c2344009Gk3.LJFF("anchor_type", "shop_showwindow");
                        c2344009Gk3.LJFF("author_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
                        c2344009Gk3.LJFF("button_for", String.valueOf(anchorPublishStruct5.type));
                        c2344009Gk3.LJFF("page_name", "video_add_link");
                        if (z3) {
                            c2344009Gk3.LIZJ(1, "is_available");
                            i = 0;
                        } else {
                            i = 0;
                            c2344009Gk3.LIZJ(0, "is_available");
                            c2344009Gk3.LJFF("na_reason", "sound_not_compliant");
                        }
                        AnchorPublishStruct anchorPublishStruct6 = (AnchorPublishStruct) C13LP.LJJJLZIJ(i, c11g74.LLJILJIL);
                        if (anchorPublishStruct6 != null && (extensionMisc = anchorPublishStruct6.extensionMisc) != null && (mobParam = extensionMisc.mobParam) != null && (str2 = mobParam.creationId) != null) {
                            c2344009Gk3.LJFF("creation_id", str2);
                        }
                        C1739200vMM.LIZ.getClass();
                        c2344009Gk3.LJFF("traceparent", C1739200vMM.LIZ());
                        C20684815ws.LJIILLIIL("tiktokec_video_add_link_show", c2344009Gk3.LIZ);
                    }
                    for (AnchorPublishStruct anchorPublishStruct7 : this.LL.LLJILJIL) {
                        if (anchorPublishStruct7.type == EnumC1430380nKG.GET_LEADS.getTYPE()) {
                            C1050610dRj c1050610dRj = new C1050610dRj();
                            if (anchorPublishStruct7.enable) {
                                str = "1";
                            } else {
                                str = CardStruct.IStatusCode.DEFAULT;
                            }
                            c1050610dRj.LJI("ttelite_ba_lead_ba_video_show_getleads", new Pair<>("enable", str), new Pair<>("author_id", c1050610dRj.LIZLLL("from_uid_id")));
                        }
                        if (anchorPublishStruct7.type == EnumC1430380nKG.BA_PRODUCT_ANCHOR.getTYPE()) {
                            new C1050610dRj().LJI("ttelite_ba_video_product_publish_addlink_exp", new Pair<>("link_status", Integer.valueOf(anchorPublishStruct7.baProductLinkState)));
                        }
                        if (anchorPublishStruct7.type == EnumC1430380nKG.DM_ANCHOR.getTYPE()) {
                            new C1050610dRj().LJI("ttelite_ba_video_dm_publish_addlink_show", new Pair<>("link_status", Integer.valueOf(anchorPublishStruct7.baProductLinkState)));
                        }
                    }
                    for (AnchorPublishStruct anchorPublishStruct8 : this.LL.LLJILJIL) {
                        if (C1050930dSF.LIZIZ(Integer.valueOf(anchorPublishStruct8.type))) {
                            if (anchorPublishStruct8 != null) {
                                C20684815ws.LJIILLIIL("livesdk_video_post_add_link_page_module_show", C2097908Jt.LIZJ(new Pair("module_name", "game")));
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        });
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMuW/7mDiSX+QwHCV+hWP1sLl6", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
        super.show();
        c0wst.LIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
    }

    public static String LJLIIL(AnchorPublishStruct anchorPublishStruct) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(anchorPublishStruct.type);
        sbLIZ.append('(');
        sbLIZ.append(anchorPublishStruct.subtype);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJLILLLLZI(boolean z) {
        Float fValueOf = Float.valueOf(16.0f);
        if (z) {
            TuxTextView tuxTextView = this.LLJJJJJIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            TuxTextView tuxTextView2 = this.LLJJJJLIIL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
            RecyclerView recyclerView = this.LLJJL;
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 8);
            }
            RecyclerView recyclerView2 = this.LLJJ;
            if (recyclerView2 != null) {
                C426750GoL.LJIIIZ(recyclerView2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf))), null, null, false, 29);
            }
        } else if (!((ArrayList) this.LLJL).isEmpty()) {
            TuxTextView tuxTextView3 = this.LLJJJJJIL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
            }
            TuxTextView tuxTextView4 = this.LLJJJJLIIL;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 0);
            }
            RecyclerView recyclerView3 = this.LLJJL;
            if (recyclerView3 != null) {
                C786410Ut5.LLIZLLLIL(recyclerView3, 0);
            }
            RecyclerView recyclerView4 = this.LLJJL;
            if (recyclerView4 != null) {
                recyclerView4.invalidateItemDecorations();
            }
            RecyclerView recyclerView5 = this.LLJJ;
            if (recyclerView5 != null) {
                C426750GoL.LJIIIZ(recyclerView5, null, 0, null, null, false, 29);
            }
        } else {
            TuxTextView tuxTextView5 = this.LLJJJJJIL;
            if (tuxTextView5 != null) {
                C786410Ut5.LLLLZLL(tuxTextView5, 8);
            }
            RecyclerView recyclerView6 = this.LLJJL;
            if (recyclerView6 != null) {
                C786410Ut5.LLIZLLLIL(recyclerView6, 8);
            }
            if (this.LLJLL) {
                TuxTextView tuxTextView6 = this.LLJJJJLIIL;
                if (tuxTextView6 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView6, 0);
                }
                RecyclerView recyclerView7 = this.LLJJ;
                if (recyclerView7 != null) {
                    C426750GoL.LJIIIZ(recyclerView7, null, 0, null, null, false, 29);
                }
            } else {
                TuxTextView tuxTextView7 = this.LLJJJJLIIL;
                if (tuxTextView7 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView7, 8);
                }
                RecyclerView recyclerView8 = this.LLJJ;
                if (recyclerView8 != null) {
                    C426750GoL.LJIIIZ(recyclerView8, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf))), null, null, false, 29);
                }
            }
        }
        if (this.LLJILJIL.isEmpty()) {
            TuxTextView tuxTextView8 = this.LLJJJJLIIL;
            if (tuxTextView8 != null) {
                C786410Ut5.LLLLZLL(tuxTextView8, 8);
            }
            RecyclerView recyclerView9 = this.LLJJ;
            if (recyclerView9 != null) {
                C786410Ut5.LLIZLLLIL(recyclerView9, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v42, types: [T, X.09mW] */
    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        C0I7D c0i7d;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        View view;
        int i2;
        int iIntValue4;
        int iIntValue5;
        super.onCreate(bundle);
        if (LJLIL()) {
            i = R.layout.d1o;
        } else {
            i = R.layout.d1n;
        }
        setContentView(i);
        this.LLJILLL = findViewById(R.id.lc2);
        this.LLJJ = (RecyclerView) findViewById(R.id.b1v);
        this.LLJJI = findViewById(R.id.tqy);
        this.LLJJIJI = (LinearLayout) findViewById(R.id.b21);
        this.LLJJIJIIJIL = (FrameLayout) findViewById(R.id.b22);
        this.LLJJIJIL = (EditText) findViewById(R.id.hdh);
        this.LLJJJ = (TuxIconView) findViewById(R.id.cor);
        this.LLJJJIL = (TuxTextView) findViewById(R.id.z9j);
        EditText editText = this.LLJJIJIL;
        if (editText != null) {
            editText.setHint(C786410Ut5.N3(getContext()).getString(R.string.spp));
        }
        this.LLJJJJ = findViewById(R.id.pag);
        this.LLJJJJJIL = (TuxTextView) findViewById(R.id.z8i);
        this.LLJJJJLIIL = (TuxTextView) findViewById(R.id.z8c);
        this.LLJJL = (RecyclerView) findViewById(R.id.afp);
        int iIntValue6 = 0;
        if (this.LLJILJIL.size() < 6) {
            LinearLayout linearLayout = this.LLJJIJI;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
        } else if (LJLIL()) {
            View viewFindViewById = findViewById(R.id.q2f);
            if (viewFindViewById != null) {
                C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(96.0f)))), null, null, false, 29);
            }
            LinearLayout linearLayout2 = this.LLJJIJI;
            if (linearLayout2 != null) {
                C426750GoL.LJIIIZ(linearLayout2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), false, 16);
            }
            FrameLayout frameLayout = this.LLJJIJIIJIL;
            if (frameLayout != null) {
                frameLayout.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.ajw));
            }
            TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.b20);
            if (tuxIconView != null) {
                C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, null, false, 30);
                tuxIconView.setTintColorRes(R.attr.a1k);
            }
            EditText editText2 = this.LLJJIJIL;
            if ((editText2 instanceof C0I7D) && (c0i7d = (C0I7D) editText2) != null) {
                ViewGroup.LayoutParams layoutParams = c0i7d.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                }
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, c0i7d.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                c0i7d.setHintTextColor(iIntValue);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.u_, c0i7d.getContext());
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                c0i7d.setTextColor(iIntValue2);
                c0i7d.setTuxFont(101);
            }
        }
        this.LLJLIL = new HashMap<>();
        for (AnchorPublishStruct anchorPublishStruct : this.LLJILJIL) {
            HashMap<String, AnchorPublishStruct> map = this.LLJLIL;
            if (map != null) {
                map.put(LJLIIL(anchorPublishStruct), anchorPublishStruct);
            }
        }
        EditText editText3 = this.LLJJIJIL;
        if (editText3 != null) {
            editText3.setOnTouchListener(new ATListenerS461S0100000_29(this, 15));
        }
        View view2 = this.LLJJI;
        if (view2 != null) {
            view2.setOnTouchListener(new ATListenerS461S0100000_29(this, 16));
        }
        TuxIconView tuxIconView2 = this.LLJJJ;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS163S0100000_29(this, 175));
        }
        TuxTextView tuxTextView = this.LLJJJIL;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS163S0100000_29(this, 176));
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new C2472609mW();
        EditText editText4 = this.LLJJIJIL;
        if (editText4 != null) {
            editText4.addTextChangedListener(new C12YZ(c259800zU, this, 1));
        }
        if (LJLIL()) {
            View view3 = this.LLJJI;
            if (view3 != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1e, view3.getContext());
                if (numLIZJ3 != null) {
                    iIntValue5 = numLIZJ3.intValue();
                } else {
                    iIntValue5 = 0;
                }
                gradientDrawable.setColor(iIntValue5);
                float fLIZIZ = C418440Gaw.LIZIZ(14);
                gradientDrawable.setCornerRadii(new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, 0.0f, 0.0f, 0.0f, 0.0f});
                view3.setBackground(gradientDrawable);
                view3.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(230.0f))));
            }
            View view4 = this.LLJILLL;
            if (view4 != null) {
                C786410Ut5.I7(new ACListenerS163S0100000_29(this, 173), view4);
            }
            setCanceledOnTouchOutside(true);
            C19403510vh c19403510vh = new C19403510vh(this.LLJILJILJ, this.LLJILJIL);
            this.LLJJIII = c19403510vh;
            RecyclerView recyclerView = this.LLJJ;
            if (recyclerView != null) {
                recyclerView.setAdapter(c19403510vh);
            }
            RecyclerView recyclerView2 = this.LLJJ;
            if (recyclerView2 != null) {
                recyclerView2.getLayoutParams().height = -2;
                final Context context = getContext();
                recyclerView2.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.commercialize.anchor.AnchorPanel$setRecyclerViewNoScroll$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public final boolean canScrollVertically() {
                        return false;
                    }
                });
                recyclerView2.setNestedScrollingEnabled(false);
                recyclerView2.addItemDecoration(new C1058210ddz(recyclerView2.getContext()));
            }
            RecyclerView recyclerView3 = this.LLJJL;
            if (recyclerView3 != null) {
                C19400410vC c19400410vC = new C19400410vC(recyclerView3, new C746560TQg(this));
                this.LLJJLIIIJLLLLLLLZ = c19400410vC;
                List<C19400610vE> list = this.LLJL;
                ((ArrayList) c19400410vC.LLILLL).clear();
                ((ArrayList) c19400410vC.LLILLL).addAll(list);
                c19400410vC.notifyDataSetChanged();
                recyclerView3.setAdapter(this.LLJJLIIIJLLLLLLLZ);
                final Context context2 = getContext();
                recyclerView3.setLayoutManager(new LinearLayoutManager(context2) { // from class: com.ss.android.ugc.aweme.commercialize.anchor.AnchorPanel$setRecyclerViewNoScroll$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public final boolean canScrollVertically() {
                        return false;
                    }
                });
                recyclerView3.setNestedScrollingEnabled(false);
                recyclerView3.addItemDecoration(new C1058210ddz(recyclerView3.getContext()));
            }
            if (((ArrayList) this.LLJL).isEmpty()) {
                TuxTextView tuxTextView2 = this.LLJJJJJIL;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                }
                TuxTextView tuxTextView3 = this.LLJJJJLIIL;
                if (tuxTextView3 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView3, 8);
                }
                RecyclerView recyclerView4 = this.LLJJL;
                if (recyclerView4 != null) {
                    C786410Ut5.LLIZLLLIL(recyclerView4, 8);
                }
                RecyclerView recyclerView5 = this.LLJJ;
                if (recyclerView5 != null) {
                    C426750GoL.LJIIIZ(recyclerView5, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f)))), null, null, false, 29);
                }
            }
            Window window = getWindow();
            if (window != null) {
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1e, window.getContext());
                if (numLIZJ4 != null) {
                    iIntValue4 = numLIZJ4.intValue();
                } else {
                    iIntValue4 = 0;
                }
                window.setNavigationBarColor(iIntValue4);
                window.setStatusBarColor(0);
                window.clearFlags(1024);
                return;
            }
            return;
        }
        RecyclerView recyclerView6 = this.LLJJ;
        if (recyclerView6 != null) {
            C786410Ut5.p6(recyclerView6, recyclerView6.getLayoutParams());
        }
        int iLJIIIIZZ = C12ES.LJIIIIZZ(getContext()) - C497820Jfg.LIZJ(getContext());
        Window window2 = getWindow();
        if (window2 != null) {
            if (iLJIIIIZZ == 0) {
                i2 = -1;
            } else {
                i2 = iLJIIIIZZ;
            }
            window2.setLayout(-1, i2);
            window2.setGravity(80);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
        RecyclerView recyclerView7 = this.LLJJ;
        if (recyclerView7 != null) {
            HandlerHook.viewPost(recyclerView7, new ARunnableS23S0101000_12(iLJIIIIZZ, this, 11));
        }
        RecyclerView recyclerView8 = this.LLJJ;
        if (recyclerView8 != null) {
            recyclerView8.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C19403510vh c19403510vh2 = new C19403510vh(this.LLJILJILJ, this.LLJILJIL);
        this.LLJJIII = c19403510vh2;
        RecyclerView recyclerView9 = this.LLJJ;
        if (recyclerView9 != null) {
            recyclerView9.setAdapter(c19403510vh2);
        }
        View view5 = this.LLJILLL;
        if (view5 != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 174), view5);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.TuxSheet, R.attr.yq, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSheet__tux_sheetBackgroundColor, 1);
        typedArrayObtainStyledAttributes.recycle();
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setNavigationBarColor(color);
        }
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        if (iAVPublishPageUIRefactorService != null && iAVPublishPageUIRefactorService.fixPublishPageSheetColor()) {
            Drawable drawableLIZ = C420660GeW.LIZ(getContext().getResources(), R.drawable.a5_, getContext().getTheme());
            if (drawableLIZ != null && (view = this.LLJJI) != null) {
                view.setBackground(drawableLIZ);
            }
            if (window2 != null) {
                Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.a1e, getContext());
                if (numLIZJ5 != null) {
                    iIntValue3 = numLIZJ5.intValue();
                } else {
                    iIntValue3 = 0;
                }
                window2.setNavigationBarColor(iIntValue3);
            }
            RecyclerView recyclerView10 = this.LLJJ;
            if (recyclerView10 != null) {
                Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.a1e, getContext());
                if (numLIZJ6 != null) {
                    iIntValue6 = numLIZJ6.intValue();
                }
                recyclerView10.setBackgroundColor(iIntValue6);
            }
        }
    }

    public C11G7(Context context, LifecycleOwner lifecycleOwner, List list) {
        super(context, R.style.ac4);
        this.LLJILJIL = list;
        this.LLJILJILJ = lifecycleOwner;
        this.LLJL = new ArrayList();
    }
}
