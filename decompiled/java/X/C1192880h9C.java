package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitSlashFragment;
import irm.AkS87S0100000_18;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0h9C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192880h9C extends C09AY implements Function2<C03H5, EnumC1192930h9H, Unit> {
    public final /* synthetic */ PoiOrderSubmitSlashFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1192880h9C(PoiOrderSubmitSlashFragment poiOrderSubmitSlashFragment) {
        super(2);
        this.LL = poiOrderSubmitSlashFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, EnumC1192930h9H enumC1192930h9H) {
        DialogFragment dialogFragment;
        int iLIZIZ;
        Dialog dialog;
        boolean z;
        Fragment parentFragment = this.LL.getParentFragment();
        if (parentFragment != null && parentFragment.isAdded() && (parentFragment instanceof TuxSheet)) {
            dialogFragment = (DialogFragment) parentFragment;
        } else {
            dialogFragment = null;
        }
        if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
            if (enumC1192930h9H == EnumC1192930h9H.NONE) {
                z = true;
            } else {
                z = false;
            }
            dialog.setCanceledOnTouchOutside(z);
        }
        if (enumC1192930h9H != EnumC1192930h9H.NONE) {
            PoiOrderSubmitSlashFragment poiOrderSubmitSlashFragment = this.LL;
            if (poiOrderSubmitSlashFragment.LLZ == null && poiOrderSubmitSlashFragment.tW() && poiOrderSubmitSlashFragment.getView() != null && poiOrderSubmitSlashFragment.getContext() != null) {
                View view = new View(poiOrderSubmitSlashFragment.getContext());
                C786410Ut5.I7(new AkS87S0100000_18(poiOrderSubmitSlashFragment, 73), view);
                Context context = poiOrderSubmitSlashFragment.getContext();
                if (context != null) {
                    iLIZIZ = C497820Jfg.LIZIZ(context);
                } else {
                    iLIZIZ = 0;
                }
                PopupWindow popupWindow = new PopupWindow(view, iLIZIZ, poiOrderSubmitSlashFragment.iW());
                if (Build.VERSION.SDK_INT >= 29) {
                    popupWindow.setIsClippedToScreen(true);
                }
                C786410Ut5.k3(popupWindow, poiOrderSubmitSlashFragment.getView(), 48, 0, 0);
                poiOrderSubmitSlashFragment.LLZ = popupWindow;
            }
        } else {
            PoiOrderSubmitSlashFragment poiOrderSubmitSlashFragment2 = this.LL;
            PopupWindow popupWindow2 = poiOrderSubmitSlashFragment2.LLZ;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
            poiOrderSubmitSlashFragment2.LLZ = null;
        }
        return Unit.LIZ;
    }
}
