package X;

import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.DeleteFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.ShareExtService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HIN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HIN {
    public static void LIZ(final C19EG c19eg, final Aweme aweme, C0HTT c0htt, C0T4J c0t4j, final AwS555S0100000_11 awS555S0100000_11) {
        DeleteFragment deleteFragment = new DeleteFragment();
        deleteFragment.LL = aweme;
        deleteFragment.LLILLJJLI = c0htt;
        final String str = c0t4j.LJIIIIZZ;
        if (str == null) {
            str = "";
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = deleteFragment;
        tuxSheet.LLJJIJIIJIL = false;
        c1390920mIc.LJIIIIZZ(1);
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.0HIO
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJIIJ(aweme);
                Function0<Unit> function0 = awS555S0100000_11;
                if (function0 != null) {
                    function0.invoke();
                }
                if (Intrinsics.LJFF(str, "long_press") && !c19eg.isFinishing() && !c19eg.isDestroyed()) {
                    C1440005kM.LIZ(new C1372310lob(1, c19eg.hashCode()));
                }
                C1440005kM.LIZ(new C453940Hr6(false, true, 4));
            }
        };
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLILLJJLI = onDismissListener;
        tuxSheet2.show(c19eg.getSupportFragmentManager(), "DeleteFragment");
    }
}
