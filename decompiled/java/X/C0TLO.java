package X;

import Y.ARunnableS81S0200000_12;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0TLO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TLO extends AbstractC21673619ry<C744610TIt> {
    public static boolean LLJILJIL;
    public static boolean LLJILJILJ;
    public static boolean LLJILLL;
    public static Runnable LLJJI;
    public static long LLJJIII;
    public List<GiftPickWithScore> LL;
    public GiftPickWithScore LLILLJJLI;
    public final boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final DataChannel LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public boolean LLJ;
    public BPEAHandler LLJI = new BPEAHandler(Looper.getMainLooper());
    public long LLJIJIL;
    public static final HashMap<Long, Boolean> LLJJ = new HashMap<>();
    public static final C11NJ LLJJIJI = new C11NJ();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        String str;
        Context contextLJII;
        GiftPick giftPick;
        C744610TIt c744610TIt = (C744610TIt) viewHolder;
        if (this.LLILLJJLI != null) {
            i2 = i + 1;
        } else {
            i2 = i;
        }
        if (this.LLIZLLLIL) {
            str = "new";
        } else {
            str = "original";
        }
        C289401Ae.LIZ(c744610TIt.itemView, c744610TIt.LL, c744610TIt.LLILLJJLI, c744610TIt.LLILLL, (GiftPickWithScore) ListProtector.get(this.LL, i), this.LLILZLL, this.LLILLL, this.LLILZIL, new C1850840yGQ(this, i2, str));
        GiftPickWithScore giftPickWithScore = (GiftPickWithScore) ListProtector.get(this.LL, i);
        Map<String, Object> map = C1338270kvh.LIZ;
        AnimatorSet animatorSet = c744610TIt.LLILZLL;
        if (animatorSet != null && animatorSet.isRunning() && (giftPick = giftPickWithScore.giftPick) != null && giftPick.giftId == LLJJIII) {
            animatorSet.cancel();
            C786410Ut5.T4(c744610TIt.LLILZ, 0.0f);
            C786410Ut5.Jc(c744610TIt.LLILZ, 0.0f);
            C11JF c11jf = c744610TIt.LLIZ;
            if (c11jf != null) {
                LLJJIJI.LIZJ(c11jf);
            }
            c744610TIt.LLIZ = null;
            C786410Ut5.LLJJJJ(c744610TIt.LLILZIL, 8);
            c744610TIt.LLILZLL = null;
        }
        GiftPick giftPick2 = giftPickWithScore.giftPick;
        if (giftPick2 != null && giftPick2.giftId == LLJJIII && LLJILJIL) {
            LLJJ.put(Long.valueOf(LLJJIII), Boolean.TRUE);
            Context context = c744610TIt.LLILZ.getContext();
            if (context != null && (contextLJII = C1834150xpV.LJII(context)) != null) {
                c744610TIt.LLILZ.setBackgroundColor(C497740JfY.LIZLLL(R.attr.ey_, contextLJII));
            }
            if (c744610TIt.LLILZ.getParent() != null) {
                HandlerHook.viewPost(c744610TIt.LLILZ, new ARunnableS81S0200000_12(giftPickWithScore, c744610TIt, 43));
            }
        }
        View view = c744610TIt.itemView;
        if (i == 0 && this.LLILLJJLI != null) {
            C500260Jjc.LJLJL(C497740JfY.LJIIIZ(R.dimen.ap0), view);
        } else {
            C500260Jjc.LJLJL(0, view);
        }
        if (i == this.LL.size() - 1 || (!this.LLILLL && !this.LLIZLLLIL)) {
            C500260Jjc.LJJLJ(0, view);
        } else {
            C500260Jjc.LJJLJ(C497740JfY.LJIIIZ(R.dimen.ap9), view);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C744610TIt c744610TIt = new C744610TIt(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hx6, viewGroup, false));
        try {
            View view = c744610TIt.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c744610TIt.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c744610TIt.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C744610TIt.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c744610TIt.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c744610TIt.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C744610TIt.class.getName();
        return c744610TIt;
    }

    public C0TLO(List<GiftPickWithScore> list, GiftPickWithScore giftPickWithScore, boolean z, boolean z2, boolean z3, DataChannel dataChannel, String str, boolean z4) {
        this.LL = list;
        this.LLILLJJLI = giftPickWithScore;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = dataChannel;
        this.LLIZ = str;
        this.LLIZLLLIL = z4;
    }
}
