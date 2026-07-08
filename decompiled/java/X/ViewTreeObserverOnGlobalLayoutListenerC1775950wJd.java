package X;

import Y.ARunnableS126S0100000_26;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionViewModel;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS2S3010000_26;
import kotlin.jvm.internal.AwS38S0010000_26;

/* JADX INFO: renamed from: X.0wJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1775950wJd implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1775950wJd viewTreeObserverOnGlobalLayoutListenerC1775950wJd) {
        if (C1756030vnV.LIZJ((InterfaceC1740480vOQ) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l0, (Function0) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l1, (Function0) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l2)) {
            C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1775950wJd);
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1775950wJd viewTreeObserverOnGlobalLayoutListenerC1775950wJd) {
        boolean z;
        String string;
        Object obj;
        Object obj2;
        Integer num;
        String string2;
        Object obj3;
        Object obj4;
        Integer num2;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(148));
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l0;
        if (view != null) {
            view.getWindowVisibleDisplayFrame((Rect) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l1);
        }
        int height = ((View) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l2).getHeight();
        Rect rect = (Rect) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l1;
        boolean z2 = true;
        if (height - (rect.bottom - rect.top) >= iLIZIZ) {
            z = true;
        } else {
            z = false;
        }
        AddressAssociateFragment addressAssociateFragment = (AddressAssociateFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3;
        if (z != addressAssociateFragment.LLJJIII) {
            addressAssociateFragment.LLJJIII = z;
            String string3 = null;
            if (z) {
                if (!addressAssociateFragment.LLJJJJ) {
                    addressAssociateFragment.LLJJJJ = true;
                    addressAssociateFragment.LLJJJIL = System.currentTimeMillis();
                    C1746780vYa c1746780vYa = ((AddressAssociateFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).ZR().LLJILJILJ;
                    String str = ((AddressAssociateFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).ZR().LLIZ;
                    AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams = ((AddressAssociateFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).LLJJIJIIJIL;
                    if (addressAssociateEnterParams == null || (num2 = addressAssociateEnterParams.sourcePage) == null || num2.intValue() != 1) {
                        z2 = false;
                    }
                    HashMap<String, Object> map = ((AddressAssociateFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).ZR().LLJILJIL;
                    if (map != null && (obj4 = map.get("entrance_info")) != null) {
                        string2 = obj4.toString();
                    } else {
                        string2 = null;
                    }
                    HashMap<String, Object> map2 = ((AddressAssociateFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).ZR().LLJILJIL;
                    if (map2 != null && (obj3 = map2.get("fill_type")) != null) {
                        string3 = obj3.toString();
                    }
                    c1746780vYa.getClass();
                    AddressAssociateFragment addressAssociateFragment2 = AddressAssociateFragment.LLJJLIIIJLLLLLLLZ;
                    if (addressAssociateFragment2 != null) {
                        C1748720vbi.LIZIZ(addressAssociateFragment2, new C10510049c(), new AwS2S3010000_26(str, z2, string3, string2, 1));
                        return;
                    }
                    return;
                }
                return;
            }
            if (!addressAssociateFragment.LLJJJJ) {
                return;
            }
            addressAssociateFragment.LLJJJJ = false;
            C0I7D c0i7d = addressAssociateFragment.LLJILJIL;
            if (c0i7d != null) {
                c0i7d.clearFocus();
            }
            C1746780vYa c1746780vYa2 = ((AddressAssociateFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).ZR().LLJILJILJ;
            String str2 = ((AddressAssociateFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).ZR().LLIZ;
            Long lValueOf = Long.valueOf(System.currentTimeMillis() - ((AddressAssociateFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).LLJJJIL);
            AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams2 = ((AddressAssociateFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).LLJJIJIIJIL;
            if (addressAssociateEnterParams2 == null || (num = addressAssociateEnterParams2.sourcePage) == null || num.intValue() != 1) {
                z2 = false;
            }
            HashMap<String, Object> map3 = ((AddressAssociateFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).ZR().LLJILJIL;
            if (map3 != null && (obj2 = map3.get("entrance_info")) != null) {
                string = obj2.toString();
            } else {
                string = null;
            }
            HashMap<String, Object> map4 = ((AddressAssociateFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).ZR().LLJILJIL;
            if (map4 != null && (obj = map4.get("fill_type")) != null) {
                string3 = obj.toString();
            }
            c1746780vYa2.getClass();
            C1746780vYa.LIZIZ(lValueOf, str2, string, string3, z2);
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1775950wJd viewTreeObserverOnGlobalLayoutListenerC1775950wJd) {
        DisplayMetrics displayMetrics;
        Resources resources;
        float f = 148;
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l0;
        if (view != null && (resources = view.getResources()) != null) {
            displayMetrics = resources.getDisplayMetrics();
        } else {
            displayMetrics = null;
        }
        boolean z = true;
        int iApplyDimension = (int) TypedValue.applyDimension(1, f, displayMetrics);
        View view2 = (View) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l0;
        if (view2 != null) {
            view2.getWindowVisibleDisplayFrame((Rect) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l1);
        }
        int height = ((View) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l2).getHeight();
        Rect rect = (Rect) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l1;
        if (height - (rect.bottom - rect.top) < iApplyDimension) {
            z = false;
        }
        AddressEditFragment addressEditFragment = (AddressEditFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3;
        if (z != addressEditFragment.LLJJJ) {
            addressEditFragment.LLJJJ = z;
            if (z) {
                C197039127h c197039127hIS = addressEditFragment.iS();
                if (c197039127hIS != null) {
                    C786410Ut5.LLLLLLJ(c197039127hIS, 8);
                }
                TuxTextView tuxTextViewCS = ((AddressEditFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).cS();
                if (tuxTextViewCS != null) {
                    C786410Ut5.LLLLZLL(tuxTextViewCS, 8);
                }
                View viewHS = ((AddressEditFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).hS();
                if (viewHS != null) {
                    C786410Ut5.LJLLLLLL(8, viewHS);
                    return;
                }
                return;
            }
            AddressEditViewModel addressEditViewModelMS = addressEditFragment.mS();
            addressEditViewModelMS.getClass();
            addressEditViewModelMS.setState(new AwS38S0010000_26(false, 18));
            C197039127h c197039127hIS2 = ((AddressEditFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).iS();
            if (c197039127hIS2 != null) {
                C786410Ut5.LLLLLLJ(c197039127hIS2, 0);
            }
            TuxTextView tuxTextViewCS2 = ((AddressEditFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).cS();
            if (tuxTextViewCS2 != null) {
                C786410Ut5.LLLLZLL(tuxTextViewCS2, 0);
            }
            View viewHS2 = ((AddressEditFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).hS();
            if (viewHS2 != null) {
                C786410Ut5.LJLLLLLL(0, viewHS2);
            }
            C450740Hlw c450740HlwGS = ((AddressEditFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).gS();
            if (c450740HlwGS != null) {
                c450740HlwGS.clearFocus();
            }
            ((AddressEditFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).sS();
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1775950wJd viewTreeObserverOnGlobalLayoutListenerC1775950wJd) {
        DisplayMetrics displayMetrics;
        float f = 148;
        Resources resources = ((View) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l0).getResources();
        if (resources != null) {
            displayMetrics = resources.getDisplayMetrics();
        } else {
            displayMetrics = null;
        }
        boolean z = true;
        int iApplyDimension = (int) TypedValue.applyDimension(1, f, displayMetrics);
        ((View) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l0).getWindowVisibleDisplayFrame((Rect) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l1);
        int height = ((View) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l2).getHeight();
        Rect rect = (Rect) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l1;
        if (height - (rect.bottom - rect.top) < iApplyDimension) {
            z = false;
        }
        DeliveryInstructionFragment deliveryInstructionFragment = (DeliveryInstructionFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3;
        if (z != deliveryInstructionFragment.LLJILJIL) {
            deliveryInstructionFragment.LLJILJIL = z;
            if (z) {
                C197039127h c197039127hVR = deliveryInstructionFragment.VR();
                if (c197039127hVR != null) {
                    C786410Ut5.LLLLLLJ(c197039127hVR, 4);
                }
                DeliveryInstructionViewModel.jR2(((DeliveryInstructionFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).ZR());
                return;
            }
            C197039127h c197039127hVR2 = deliveryInstructionFragment.VR();
            if (c197039127hVR2 != null) {
                C786410Ut5.LLLLLLJ(c197039127hVR2, 0);
            }
            RecyclerView recyclerViewWR = ((DeliveryInstructionFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3).WR();
            if (recyclerViewWR != null) {
                recyclerViewWR.clearFocus();
            }
            View view = (View) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l0;
            if (view == null) {
                return;
            }
            HandlerHook.viewPostDelay(view, new ARunnableS126S0100000_26((DeliveryInstructionFragment) viewTreeObserverOnGlobalLayoutListenerC1775950wJd.l3, 131), 50L);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1775950wJd(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
