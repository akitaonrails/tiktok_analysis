package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.aireply.LiveAIReplySettingFragment;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AwS443S0200000_7;
import wh6.AbS56S0200100_7;

/* JADX INFO: renamed from: X.0KVM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KVM extends AbstractC21673619ry<C0KVN> {
    public final LifecycleOwner LL;
    public final List<C0KVL> LLILLJJLI;
    public final View LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C0KVN c0kvn = (C0KVN) viewHolder;
        super.onViewDetachedFromWindow(c0kvn);
        c0kvn.LLJIJIL = null;
        c0kvn.LLJI.LIZJ();
        C2296808zG.LIZJ(c0kvn.LLJ, new CancellationException("view holder unbind"));
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C0KVN c0kvn = (C0KVN) viewHolder;
        super.onViewRecycled(c0kvn);
        c0kvn.LLJIJIL = null;
        c0kvn.LLJI.LIZJ();
        C2296808zG.LIZJ(c0kvn.LLJ, new CancellationException("view holder unbind"));
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        long id;
        User user;
        C0KVN c0kvn = (C0KVN) viewHolder;
        C0KVL c0kvl = (C0KVL) C13LP.LJJJLZIJ(i, this.LLILLJJLI);
        if (c0kvl != null) {
            c0kvn.LLJIJIL = c0kvl;
            if (c0kvl.LIZIZ) {
                C500260Jjc.LLFFF(c0kvn.LLILZLL);
                c0kvn.LLILZLL.setText(new BDDateFormat("MMM D, YYYY").LIZIZ(c0kvl.LIZ.replyTimeMs, Locale.getDefault()));
            } else {
                C500260Jjc.LJIILIIL(c0kvn.LLILZLL);
            }
            InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
            if ((currentUser instanceof User) && (user = (User) currentUser) != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            C1115360f8A c1115360f8A = C1115380f8C.LIZ;
            C1115380f8C.LIZLLL(new SpannableStringBuilder(c0kvl.LIZ.commentContent), c0kvn.LLIZ.getResources(), c0kvn.LLILLJJLI, new AwS443S0200000_7(c0kvl, c0kvn, 3));
            c0kvn.LLIZLLLIL.setText(c0kvl.LIZ.replyContent);
            C23250099c.LIZLLL(c0kvn.LLJ, null, null, new C0KVK(c0kvl, c0kvn, null), 3);
            c0kvn.LLILZ.setIconTint(C20736316Cj.LIZIZ(R.attr.ezt, c0kvn.LLILLL));
            c0kvn.LLILZIL.setIconTint(C20736316Cj.LIZIZ(R.attr.ezt, c0kvn.LLILLL));
            LiveIconView liveIconView = c0kvn.LLILZ;
            if (liveIconView != null) {
                C786410Ut5.I7(new AbS56S0200100_7(c0kvl, id, c0kvn, 0), liveIconView);
            }
            c0kvn.I5(c0kvl.LIZ);
            C786410Ut5.I7(new AbS56S0200100_7(c0kvl, id, c0kvn, 1), c0kvn.LLILZIL);
            if (!c0kvl.LIZJ) {
                c0kvn.LLJI.LIZIZ();
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0KVN c0kvn = new C0KVN(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fxv, viewGroup, false), this.LLILLL, this.LL);
        try {
            View view = c0kvn.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0kvn.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0kvn.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0KVN.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0kvn.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0kvn.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0KVN.class.getName();
        return c0kvn;
    }

    public C0KVM(LiveAIReplySettingFragment liveAIReplySettingFragment, DataChannel dataChannel, List list, C21578619ce c21578619ce) {
        this.LL = liveAIReplySettingFragment;
        this.LLILLJJLI = list;
        this.LLILLL = c21578619ce;
        Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        if (bool != null) {
            bool.booleanValue();
        }
    }
}
