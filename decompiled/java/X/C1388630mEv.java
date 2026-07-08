package X;

import Y.ACListenerS48S0201000_21;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.activestatus.api.analytics.ActivityStatusAnalyticsCommonLifecycleOwner;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388630mEv extends AbstractC2172971A2l<C1388670mEz, C1388640mEw> {
    public final String LLILLJJLI;
    public final InterfaceC897330ZId LLILLL;
    public final LifecycleOwner LLILZ;
    public int LLILZIL;
    public AwS618S0100000_4 LLILZLL;

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequenceLIZ;
        String strLIZIZ;
        C1388640mEw c1388640mEw = (C1388640mEw) viewHolder;
        C1388670mEz c1388670mEzLLLFZ = LLLFZ(i);
        c1388640mEw.LLJIJIL = c1388670mEzLLLFZ;
        if (Intrinsics.LJFF(c1388670mEzLLLFZ.LIZ.getUid(), CardStruct.IStatusCode.DEFAULT)) {
            ((IDMAvatarLoader) c1388640mEw.LLIZ.getValue()).LIZLLL(c1388640mEw.LLILLJJLI, null, c1388670mEzLLLFZ.LIZ.getDisplayAvatar(), new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
            C19727912Gn c19727912Gn = c1388640mEw.LLIZLLLIL;
            if (c19727912Gn != null) {
                C786410Ut5.d0(c19727912Gn, 8);
            }
        } else {
            ((IDMAvatarLoader) c1388640mEw.LLIZ.getValue()).LIZIZ(c1388670mEzLLLFZ.LIZ.getUid(), c1388670mEzLLLFZ.LIZ.getDisplayAvatar(), new C0ZKF(0, 2130971789, 0, 0, 0, (C0ZK1) null, 125));
        }
        TuxTextView tuxTextView = c1388640mEw.LLJ;
        if (Intrinsics.LJFF(c1388670mEzLLLFZ.LIZ.getUid(), CardStruct.IStatusCode.DEFAULT)) {
            int i2 = c1388670mEzLLLFZ.LIZIZ;
            if (i2 > 0) {
                charSequenceLIZ = c1388640mEw.LL.getContext().getString(2131831599, Integer.valueOf(i2));
            } else {
                charSequenceLIZ = c1388640mEw.LL.getContext().getString(2131831600);
            }
        } else {
            String str = "";
            if (c1388670mEzLLLFZ.LIZJ) {
                IMFriendsService.LIZ.getClass();
                IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
                if (iMFriendsServiceLIZ != null && (strLIZIZ = iMFriendsServiceLIZ.LIZIZ(c1388670mEzLLLFZ.LIZ.getUid(), c1388670mEzLLLFZ.LIZ.getDisplayName())) != null) {
                    str = strLIZIZ;
                }
                spannableStringBuilder = new SpannableStringBuilder(C1364100lbM.LIZ(str));
            } else {
                String displayName = c1388670mEzLLLFZ.LIZ.getDisplayName();
                if (displayName != null) {
                    str = displayName;
                }
                spannableStringBuilder = new SpannableStringBuilder(C1364100lbM.LIZ(str));
            }
            charSequenceLIZ = C0P0R.LIZ(spannableStringBuilder, c1388640mEw.LLJ.getPaint(), c1388640mEw.LLJI, c1388640mEw.LLJ.getMaxLines());
        }
        tuxTextView.setText(charSequenceLIZ);
        if (c1388640mEw.LLILLL != null) {
            C595710NYb c595710NYbLIZJ = C0O26.LIZJ(AFwS259S0000000_21.get$arr$(404), c1388670mEzLLLFZ.LIZ.getUid());
            InterfaceC897380ZIi.LIZIZ.getClass();
            c1388640mEw.I5(C896480ZEw.LIZJ(C897370ZIh.LIZ().LIZIZ(c595710NYbLIZJ)), c1388670mEzLLLFZ);
        }
        C786410Ut5.I7(new ACListenerS48S0201000_21(i, c1388640mEw, c1388670mEzLLLFZ, 8), c1388640mEw.LL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1388640mEw c1388640mEw = new C1388640mEw(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ckp, viewGroup, false), this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZLL, this.LLILZIL);
        try {
            View view = c1388640mEw.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1388640mEw.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1388640mEw.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1388640mEw.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1388640mEw.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1388640mEw.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1388640mEw.class.getName();
        return c1388640mEw;
    }

    public C1388630mEv(String str, C897520ZIw c897520ZIw, ActivityStatusAnalyticsCommonLifecycleOwner activityStatusAnalyticsCommonLifecycleOwner) {
        super(new AbstractC339510DSr<C1388670mEz>() { // from class: X.0mEy
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C1388670mEz c1388670mEz, C1388670mEz c1388670mEz2) {
                C1388670mEz c1388670mEz3 = c1388670mEz;
                C1388670mEz c1388670mEz4 = c1388670mEz2;
                if (c1388670mEz3.LIZIZ == c1388670mEz4.LIZIZ && c1388670mEz3.LIZJ == c1388670mEz4.LIZJ && Intrinsics.LJFF(C1388680mF0.LIZ(c1388670mEz3.LIZ), C1388680mF0.LIZ(c1388670mEz4.LIZ)) && Intrinsics.LJFF(c1388670mEz3.LIZ.getDisplayName(), c1388670mEz4.LIZ.getDisplayName())) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C1388670mEz c1388670mEz, C1388670mEz c1388670mEz2) {
                C1388670mEz c1388670mEz3 = c1388670mEz;
                C1388670mEz c1388670mEz4 = c1388670mEz2;
                if (Intrinsics.LJFF(c1388670mEz3.LIZ.getUid(), c1388670mEz4.LIZ.getUid()) && c1388670mEz3.LIZJ == c1388670mEz4.LIZJ) {
                    return true;
                }
                return false;
            }
        });
        this.LLILLJJLI = str;
        this.LLILLL = c897520ZIw;
        this.LLILZ = activityStatusAnalyticsCommonLifecycleOwner;
    }
}
