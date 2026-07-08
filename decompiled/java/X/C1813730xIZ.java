package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.LiveQuickPostFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xIZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1813730xIZ {
    public static final LiveQuickPostFragment LIZ(boolean z, int i, PostConfigModel postConfigModel, C19EG c19eg, Function2<? super PostConfigModel, ? super Boolean, Unit> function2, Function1<? super Integer, Unit> function1, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener, Function0<Unit> function0) {
        int value;
        LiveQuickPostFragment.LLJJJJLIIL.getClass();
        LiveQuickPostFragment liveQuickPostFragment = new LiveQuickPostFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "post_config_model", postConfigModel);
        liveQuickPostFragment.setArguments(bundle);
        liveQuickPostFragment.LLJILJILJ = i;
        String str = postConfigModel.roomId;
        if (str == null) {
            str = "";
        }
        liveQuickPostFragment.LLJILLL = str;
        Integer num = postConfigModel.privacyStatue;
        if (num != null) {
            value = num.intValue();
        } else {
            value = EnumC1813540xIG.PUBLIC.getValue();
        }
        liveQuickPostFragment.LLJ = value;
        liveQuickPostFragment.LLJI = function2;
        liveQuickPostFragment.LLJIJIL = function1;
        liveQuickPostFragment.LLJILJIL = function0;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = liveQuickPostFragment;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJJIJIIJIL = z;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLJLLIL = false;
        tuxSheet.LLILLL = false;
        DialogInterfaceOnDismissListenerC1864750ycr dialogInterfaceOnDismissListenerC1864750ycr = new DialogInterfaceOnDismissListenerC1864750ycr(onDismissListener, 3);
        c1390920mIc.LJI(16);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLILLJJLI = dialogInterfaceOnDismissListenerC1864750ycr;
        if (onCancelListener != null) {
            tuxSheet2.LL = onCancelListener;
        }
        if (C176600m4.LIZIZ(Boolean.valueOf(postConfigModel.forceDarkMode))) {
            c1390920mIc.LIZLLL(R.style.y0, false);
        } else {
            c1390920mIc.LIZ.LLJI = C1308910kAL.LIZJ(R.attr.zq, c19eg);
        }
        c1390920mIc.LIZ.show(c19eg.getSupportFragmentManager(), "LiveQuickPostFragment");
        return liveQuickPostFragment;
    }
}
