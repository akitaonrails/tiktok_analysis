package X;

import Y.AfS202S0100000_33;
import android.content.DialogInterface;
import com.bytedance.android.live.copyrightreview.ReviewApi;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Amm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class DialogInterfaceOnClickListenerC2189621Amm implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
        }
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC2189621Amm dialogInterfaceOnClickListenerC2189621Amm, DialogInterface dialogInterface, int i) {
        CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) dialogInterfaceOnClickListenerC2189621Amm.l0;
        C11NJ c11nj = (C11NJ) dialogInterfaceOnClickListenerC2189621Amm.l1;
        Room room = (Room) dialogInterfaceOnClickListenerC2189621Amm.l2;
        copyrightViolationHelper.LLILZIL = true;
        C480460Ism.LIZ().getClass();
        c11nj.LIZ(((ReviewApi) C480460Ism.LIZLLL(ReviewApi.class)).notifyOfConfirmCopyright(room.getId()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS202S0100000_33(copyrightViolationHelper, 2), new AfS202S0100000_33(copyrightViolationHelper, 3)));
        dialogInterface.dismiss();
        CopyrightViolationHelper.LIZJ(room, false, "confirm");
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC2189621Amm dialogInterfaceOnClickListenerC2189621Amm, DialogInterface dialogInterface, int i) {
        ((C1AQ5) dialogInterfaceOnClickListenerC2189621Amm.l0).getClass();
        C1AQ8 c1aq8 = (C1AQ8) C1909107dp.LIZJ(C1AQ8.class, null);
        c1aq8.setAction("right");
        ((CompletionBlock) dialogInterfaceOnClickListenerC2189621Amm.l1).onSuccess(c1aq8, "");
        ((Function0) ((C259800zU) dialogInterfaceOnClickListenerC2189621Amm.l2).element).invoke();
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC2189621Amm dialogInterfaceOnClickListenerC2189621Amm, DialogInterface dialogInterface, int i) {
        ((C1AQ5) dialogInterfaceOnClickListenerC2189621Amm.l0).getClass();
        C1AQ8 c1aq8 = (C1AQ8) C1909107dp.LIZJ(C1AQ8.class, null);
        c1aq8.setAction("left");
        ((CompletionBlock) dialogInterfaceOnClickListenerC2189621Amm.l1).onSuccess(c1aq8, "");
        ((Function0) ((C259800zU) dialogInterfaceOnClickListenerC2189621Amm.l2).element).invoke();
    }

    public DialogInterfaceOnClickListenerC2189621Amm(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
