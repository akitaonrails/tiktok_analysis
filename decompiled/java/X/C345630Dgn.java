package X;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dgn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345630Dgn extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ Handler LLILLJJLI;
    public final /* synthetic */ List<ImageView> LLILLL;
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LLILZ;
    public final /* synthetic */ TextView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345630Dgn(C013C c013c, BPEAHandler bPEAHandler, List list, SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment, TextView textView) {
        super(1);
        this.LL = c013c;
        this.LLILLJJLI = bPEAHandler;
        this.LLILLL = list;
        this.LLILZ = subscriptionPrivilegeDetailFragment;
        this.LLILZIL = textView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            C013C c013c = this.LL;
            if (c013c.element) {
                c013c.element = false;
                Handler handler = this.LLILLJJLI;
                final TextView textView = this.LLILZIL;
                C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, handler, new Runnable() { // from class: X.0Dgm
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SubSpotlightItemViewHolder@41c0.onBindViewHolder$markWhite$1$1");
                        try {
                            C786410Ut5.LLIL(textView, 8);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SubSpotlightItemViewHolder@41c0.onBindViewHolder$markWhite$1$1");
                    }
                });
            }
        }
        List<ImageView> list = this.LLILLL;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LLILZ;
        Iterator<ImageView> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().setBackground(subscriptionPrivilegeDetailFragment.requireContext().getDrawable(R.drawable.e97));
        }
        List<ImageView> list2 = this.LLILLL;
        if (iIntValue > 4) {
            iIntValue = 4;
        }
        ((View) ListProtector.get(list2, iIntValue)).setBackground(this.LLILZ.requireContext().getDrawable(R.drawable.e96));
        return Unit.LIZ;
    }
}
