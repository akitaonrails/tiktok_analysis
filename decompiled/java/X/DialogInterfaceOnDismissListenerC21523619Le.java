package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel;
import com.ss.android.ugc.aweme.newcreatoredit.translation.NewCreatorCaptionEditTranslationFragment;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19Le, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class DialogInterfaceOnDismissListenerC21523619Le implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC21523619Le(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC21523619Le dialogInterfaceOnDismissListenerC21523619Le, DialogInterface dialogInterface) {
        DialogFragment dialogFragment = (DialogFragment) dialogInterfaceOnDismissListenerC21523619Le.l0;
        Dialog dialog = dialogFragment.mDialog;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC21523619Le dialogInterfaceOnDismissListenerC21523619Le, DialogInterface dialogInterface) {
        NewCreatorCaptionEditTranslationFragment newCreatorCaptionEditTranslationFragment = (NewCreatorCaptionEditTranslationFragment) dialogInterfaceOnDismissListenerC21523619Le.l0;
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = newCreatorCaptionEditTranslationFragment.LLILZ;
        if (newCreatorCaptionEditViewModel != null) {
            newCreatorCaptionEditViewModel.LLIZLLLIL.setValue(Boolean.FALSE);
        }
        if (newCreatorCaptionEditTranslationFragment.LLILZ != null && C123100dR.LIZ(NewCreatorCaptionEditViewModel.yQ2()) && !newCreatorCaptionEditTranslationFragment.oS()) {
            LinearLayout linearLayout = newCreatorCaptionEditTranslationFragment.LLJZIJLIL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
            ViewGroup viewGroup = newCreatorCaptionEditTranslationFragment.LLLFF;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
                return;
            }
            return;
        }
        newCreatorCaptionEditTranslationFragment.sS();
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC21523619Le dialogInterfaceOnDismissListenerC21523619Le, DialogInterface dialogInterface) {
        ((AnonymousClass1941) dialogInterfaceOnDismissListenerC21523619Le.l0).E5(dialogInterface);
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC21523619Le dialogInterfaceOnDismissListenerC21523619Le, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC21523619Le.l0).invoke();
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC21523619Le dialogInterfaceOnDismissListenerC21523619Le, DialogInterface dialogInterface) {
        LiveData<Effect> liveData;
        Effect value;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "effect_guidance_picker_fix", true, true) || ((liveData = ((UploadPicStickerARPresenter) dialogInterfaceOnDismissListenerC21523619Le.l0).LLLII) != null && (value = liveData.getValue()) != null && ((UploadPicStickerARPresenter) dialogInterfaceOnDismissListenerC21523619Le.l0).LJJIJIIJI(value))) {
            ((UploadPicStickerARPresenter) dialogInterfaceOnDismissListenerC21523619Le.l0).LJJJJL();
        }
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC21523619Le dialogInterfaceOnDismissListenerC21523619Le, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC21523619Le.l0).invoke();
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC21523619Le dialogInterfaceOnDismissListenerC21523619Le, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC21523619Le.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
