package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vYL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746630vYL {
    public static void LIZ(FragmentManager fragmentManager, C1747010vYx c1747010vYx, Function1 function1) {
        DeliveryInstructionFragment deliveryInstructionFragment = new DeliveryInstructionFragment();
        deliveryInstructionFragment.LLIZ = c1747010vYx;
        deliveryInstructionFragment.LLJILLL = function1;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        int iLIZIZ = (int) C958103op.LIZIZ();
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZIZ;
        tuxSheet.LLJJIJI = deliveryInstructionFragment;
        tuxSheet.LLILLJJLI = deliveryInstructionFragment;
        tuxSheet.LLILZIL = true;
        c1390920mIc.LJI(16);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJLL = true;
        tuxSheet2.LLJLILLLLZIIL = false;
        tuxSheet2.show(fragmentManager, "delivery_instruction_fragment");
    }
}
