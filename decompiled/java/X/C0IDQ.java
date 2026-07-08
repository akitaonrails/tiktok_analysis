package X;

import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.TextInputSheetFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0IDQ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDQ implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
            case 3:
                onCancel$3(this, dialogInterface);
                break;
        }
    }

    public static final void onCancel$0(C0IDQ c0idq, DialogInterface dialogInterface) {
        String string;
        CharSequence message;
        C1237360iIw c1237360iIw = ((TextInputSheetFragment) c0idq.l0).LLILZLL;
        C443120HZe c443120HZe = null;
        if (c1237360iIw != null && (message = c1237360iIw.getMessage()) != null) {
            string = message.toString();
        } else {
            string = null;
        }
        C0H7H c0h7h = ((TextInputSheetFragment) c0idq.l0).LLJJJIL;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c0idq.l1;
        if (string != null && (!a0.LJJJIL(string))) {
            c443120HZe = new C443120HZe(string, c0h7h, Boolean.FALSE);
        }
        C189200o6.m2constructorimpl(c443120HZe);
        interfaceC20236714Gf.resumeWith(c443120HZe);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCancel$1(C0IDQ c0idq, DialogInterface dialogInterface) {
        DialogFragment dialogFragment = (DialogFragment) ((C259800zU) c0idq.l0).element;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        Function1 function1 = (Function1) c0idq.l1;
        if (function1 != null) {
            function1.invoke(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCancel$2(C0IDQ c0idq, DialogInterface dialogInterface) {
        DialogFragment dialogFragment = (DialogFragment) ((C259800zU) c0idq.l0).element;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        Function1 function1 = (Function1) c0idq.l1;
        if (function1 != null) {
            function1.invoke(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCancel$3(C0IDQ c0idq, DialogInterface dialogInterface) {
        AbstractC439520HLi abstractC439520HLi;
        TuxPanel tuxPanel = (TuxPanel) ((C259800zU) c0idq.l0).element;
        if (tuxPanel != null) {
            abstractC439520HLi = tuxPanel.LLJILLL;
        } else {
            abstractC439520HLi = null;
        }
        if (Intrinsics.LJFF(abstractC439520HLi, C439530HLj.LIZ)) {
            C439470HLd c439470HLd = C439470HLd.LIZ;
            EnumC439790HMj enumC439790HMj = (EnumC439790HMj) c0idq.l1;
            EnumC439500HLg enumC439500HLg = EnumC439500HLg.CLICK_X;
            c439470HLd.getClass();
            C439470HLd.LIZJ(enumC439790HMj, enumC439500HLg);
            return;
        }
        if (Intrinsics.LJFF(abstractC439520HLi, C439540HLk.LIZ)) {
            C439470HLd c439470HLd2 = C439470HLd.LIZ;
            EnumC439790HMj enumC439790HMj2 = (EnumC439790HMj) c0idq.l1;
            EnumC439500HLg enumC439500HLg2 = EnumC439500HLg.CLICK_BACKGROUND;
            c439470HLd2.getClass();
            C439470HLd.LIZJ(enumC439790HMj2, enumC439500HLg2);
            return;
        }
        if (!Intrinsics.LJFF(abstractC439520HLi, C439510HLh.LIZ)) {
            return;
        }
        C439470HLd c439470HLd3 = C439470HLd.LIZ;
        EnumC439790HMj enumC439790HMj3 = (EnumC439790HMj) c0idq.l1;
        EnumC439500HLg enumC439500HLg3 = EnumC439500HLg.CLICK_BACK;
        c439470HLd3.getClass();
        C439470HLd.LIZJ(enumC439790HMj3, enumC439500HLg3);
    }

    public C0IDQ(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
