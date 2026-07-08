package X;

import Y.AObserverS221S0100000_17;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.serviceplus.PreviewServicePlusWidget;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151480g4Q extends AbstractC813200VvC {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC813200VvC
    public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        if (1 - this.$t != 0) {
            super.onFragmentDestroyed(fragmentManager, fragment);
        } else {
            onFragmentDestroyed$0(this, fragmentManager, fragment);
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        if (this.$t != 0) {
            super.onFragmentDetached(fragmentManager, fragment);
        } else {
            onFragmentDetached$0(this, fragmentManager, fragment);
        }
    }

    public C1151480g4Q(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFragmentDestroyed$0(C1151480g4Q c1151480g4Q, FragmentManager fragmentManager, Fragment fragment) {
        boolean z;
        IMessageManager iMessageManager;
        StarCommentViewModel starCommentViewModel;
        MutableLiveData<C1116210f9X> mutableLiveData;
        int size;
        long j;
        HashSet<String> hashSet;
        super.onFragmentDestroyed(fragmentManager, fragment);
        if (Intrinsics.LJFF(fragment, ((C1116230f9Z) c1151480g4Q.l0).LL)) {
            C1116230f9Z c1116230f9Z = (C1116230f9Z) c1151480g4Q.l0;
            DataChannel dataChannel = c1116230f9Z.LLILLJJLI;
            if (dataChannel != null) {
                StarCommentViewModel starCommentViewModel2 = c1116230f9Z.LLILLL;
                if (starCommentViewModel2 != null && (hashSet = starCommentViewModel2.LLJ) != null) {
                    size = hashSet.size();
                } else {
                    size = 0;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_get_queue_request_all");
                C1116240f9a.LIZIZ(c474500IjALIZ, dataChannel);
                c474500IjALIZ.LJJII(Integer.valueOf(C1116240f9a.LIZ), "request_count");
                c474500IjALIZ.LJJII(Integer.valueOf(C1116240f9a.LIZIZ), "success_count");
                c474500IjALIZ.LJJII(Integer.valueOf(C1116240f9a.LIZJ), "msg_count");
                c474500IjALIZ.LJJII(Integer.valueOf(size), "display_count");
                int i = C1116240f9a.LIZ;
                if (i != 0) {
                    j = C1116240f9a.LIZLLL / ((long) i);
                } else {
                    j = 0;
                }
                c474500IjALIZ.LJJII(Long.valueOf(j), "avg_duration");
                c474500IjALIZ.LJJII(Long.valueOf(SystemClock.elapsedRealtime() - C1116240f9a.LJFF), "live_duration");
                c474500IjALIZ.LIZ();
                C1116240f9a.LIZ = 0;
                C1116240f9a.LIZIZ = 0;
                C1116240f9a.LIZJ = 0;
                C1116240f9a.LIZLLL = 0L;
                C1116240f9a.LJ = 0L;
                C1116240f9a.LJFF = 0L;
                C1116240f9a.LJI.clear();
            }
            C1116230f9Z c1116230f9Z2 = (C1116230f9Z) c1151480g4Q.l0;
            DataChannel dataChannel2 = c1116230f9Z2.LLILLJJLI;
            if (dataChannel2 != null) {
                dataChannel2.zQ2(c1116230f9Z2.LL);
            }
            if (c1116230f9Z2.LLJJIII == 3) {
                z = true;
            } else {
                z = false;
            }
            C0165003f.LIZIZ = z;
            c1116230f9Z2.LLJIJIL = null;
            c1116230f9Z2.LLJILJIL = EnumC1116160f9S.UNKNOWN;
            c1116230f9Z2.LLJJ = 0;
            c1116230f9Z2.LLJILJILJ = false;
            c1116230f9Z2.LLJILLL = 0;
            c1116230f9Z2.LLJ.clear();
            c1116230f9Z2.LLJI.clear();
            C1116420f9s.LIZ = false;
            c1116230f9Z2.LLJJI.removeMessages(1);
            AObserverS221S0100000_17 aObserverS221S0100000_17 = c1116230f9Z2.LLJJIJIL;
            if (aObserverS221S0100000_17 != null && (starCommentViewModel = c1116230f9Z2.LLILLL) != null && (mutableLiveData = starCommentViewModel.LLILLJJLI) != null) {
                mutableLiveData.removeObserver(aObserverS221S0100000_17);
            }
            C1116130f9P c1116130f9P = c1116230f9Z2.LLJJIJI;
            if (c1116130f9P != null) {
                c1116130f9P.LIZ.LLILLJJLI.removeObserver(c1116130f9P.LJIILIIL);
                c1116130f9P.LIZ.LLILZ.removeObserver(c1116130f9P.LJIILJJIL);
                c1116130f9P.LIZ.LL.removeObserver(c1116130f9P.LJIILL);
            }
            C1116140f9Q c1116140f9Q = c1116230f9Z2.LLJJIJIIJIL;
            if (c1116140f9Q != null) {
                c1116140f9Q.LIZ.LLILLJJLI.removeObserver(c1116140f9Q.LJIIJ);
                c1116140f9Q.LIZ.LLILZ.removeObserver(c1116140f9Q.LJIIJJI);
                c1116140f9Q.LIZ.LL.removeObserver(c1116140f9Q.LJIIL);
            }
            StarCommentViewModel starCommentViewModel3 = c1116230f9Z2.LLILLL;
            if (starCommentViewModel3 != null) {
                starCommentViewModel3.LLJILJIL.removeMessages(1);
                starCommentViewModel3.LLJILJIL.removeMessages(2);
            }
            IMessageManager iMessageManager2 = c1116230f9Z2.LLILZLL;
            if (iMessageManager2 != null) {
                iMessageManager2.removeMessageListener(C001A.STAR_COMMENT_PUSH_MESSAGE.getIntType(), c1116230f9Z2);
            }
            IMessageManager iMessageManager3 = c1116230f9Z2.LLILZLL;
            if (iMessageManager3 != null) {
                iMessageManager3.removeMessageListener(C001A.MEMBER.getIntType(), c1116230f9Z2);
            }
            IMessageManager iMessageManager4 = c1116230f9Z2.LLILZLL;
            if (iMessageManager4 != null) {
                iMessageManager4.removeMessageListener(C001A.ROOM_VERIFY.getIntType(), c1116230f9Z2);
            }
            if (c1116230f9Z2.LLJJIII == 1 && (iMessageManager = c1116230f9Z2.LLILZLL) != null) {
                iMessageManager.removeMessageListener(C001A.STAR_COMMENT_NOTIFICATION_MESSAGE.getIntType(), c1116230f9Z2);
            }
            DataChannel dataChannel3 = c1116230f9Z2.LLILLJJLI;
            if (dataChannel3 != null) {
                dataChannel3.SX0(C1110110ezh.class, null);
            }
            ((C1116230f9Z) c1151480g4Q.l0).LL.requireFragmentManager().LLIILZL(c1151480g4Q);
        }
    }

    public static final void onFragmentDetached$0(C1151480g4Q c1151480g4Q, FragmentManager fragmentManager, Fragment fragment) {
        String string;
        if (fragment instanceof LiveSheetHostFragment) {
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                string = arguments.getString("com.bytedance.android.live.design.view.sheet.FRAGMENT_CLASS");
            } else {
                string = null;
            }
            if (Intrinsics.LJFF(string, "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingHostFragment")) {
                fragmentManager.LLIILZL(c1151480g4Q);
                ((PreviewServicePlusWidget) c1151480g4Q.l0).onResume();
            }
        }
    }
}
