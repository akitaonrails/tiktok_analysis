package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DPR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DPR extends C0DPS {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C19EG c19eg;
        Activity topActivity = ActivityStack.getTopActivity();
        if ((topActivity instanceof C19EG) && (c19eg = (C19EG) topActivity) != null) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                TuxTextView tuxTextView = new TuxTextView(c19eg, null, 6, 0);
                tuxTextView.setText("Repost incentive related requirements have been offline. If you have related questions, you can contact @jinxinlei");
                tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), 0);
                tuxTextView.setTuxFont(52);
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LJIIIIZZ(1);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(400));
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJL = iLIZIZ;
                tuxSheet.LLJJIJIIJIL = false;
                tuxSheet.LLJJIII = tuxTextView;
                c1390920mIc.LIZLLL(R.style.xm, false);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJLILLLLZIIL = false;
                tuxSheet2.show(c19eg.getSupportFragmentManager(), "TryRepost");
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0DPU.class, null), "");
        }
    }
}
