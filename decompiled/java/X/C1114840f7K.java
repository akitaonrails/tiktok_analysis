package X;

import Y.ACListenerS83S0300000_17;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0f7K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114840f7K extends AbstractC21673619ry<AbstractC1114930f7T> {
    public final LifecycleOwner LL;
    public final ArrayList<C1114880f7O> LLILLJJLI = new ArrayList<>();
    public C195900pB LLILLL;
    public final /* synthetic */ QuickCommentWidget LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (!this.LLILLJJLI.isEmpty()) {
            return ((C1114880f7O) ListProtector.get(this.LLILLJJLI, i)).LIZ.type;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
    }

    public C1114840f7K(QuickCommentWidget quickCommentWidget, LifecycleOwner lifecycleOwner) {
        this.LLILZ = quickCommentWidget;
        this.LL = lifecycleOwner;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        AbstractC1114930f7T abstractC1114930f7T = (AbstractC1114930f7T) viewHolder;
        abstractC1114930f7T.itemView.setTag(R.id.en4, null);
        C1114880f7O c1114880f7O = (C1114880f7O) ListProtector.get(this.LLILLJJLI, i);
        int i2 = c1114880f7O.LIZJ + 1;
        c1114880f7O.LIZJ = i2;
        if (i2 == 1) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_inroom_quick_comment_show");
            c474500IjALIZ.LJIJJLI(c1114880f7O.LIZIZ);
            c474500IjALIZ.LJJII(c1114880f7O.LIZLLL, "show_type");
            c474500IjALIZ.LJJII(c1114880f7O.LIZ.text, "content");
            c1114880f7O.LIZ(c474500IjALIZ);
            c474500IjALIZ.LIZ();
        }
        abstractC1114930f7T.I5(abstractC1114930f7T, i);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1114860f7M;
        if (i == 1) {
            Context contextLJJIIZI = C520010KaN.LJJIIZI(viewGroup.getContext(), false);
            if (contextLJJIIZI == null) {
                contextLJJIIZI = this.LLILZ.context;
            }
            final View viewTd = C786410Ut5.Td(C786410Ut5.ne(contextLJJIIZI), R.layout.gu_, viewGroup, false);
            c1114860f7M = new AbstractC1114930f7T(viewTd) { // from class: X.0f7N
                public final C1324720kZq LL;

                {
                    super(viewTd);
                    this.LL = (C1324720kZq) viewTd.findViewById(R.id.lfr);
                }

                @Override // X.AbstractC1114930f7T
                public final void I5(AbstractC1114930f7T abstractC1114930f7T, int i2) {
                    EmoteModel emoteModel;
                    if (!(abstractC1114930f7T instanceof C1114870f7N) || (emoteModel = ((C1114880f7O) ListProtector.get(this.LLILLJJLI.LLILLJJLI, i2)).LIZ.emote) == null) {
                        return;
                    }
                    C1121670fIL.LJI(emoteModel.image, ((C1114870f7N) abstractC1114930f7T).LL);
                    View view = abstractC1114930f7T.itemView;
                    C1114840f7K c1114840f7K = this.LLILLJJLI;
                    C786410Ut5.I7(new ACListenerS83S0300000_17(c1114840f7K.LLILZ, emoteModel, c1114840f7K, 2), view);
                }
            };
        } else {
            Context contextLJJIIZI2 = C520010KaN.LJJIIZI(viewGroup.getContext(), false);
            if (contextLJJIIZI2 == null) {
                contextLJJIIZI2 = this.LLILZ.context;
            }
            c1114860f7M = new C1114860f7M(this, C786410Ut5.Td(C786410Ut5.ne(contextLJJIIZI2), R.layout.gu9, viewGroup, false), this.LL);
        }
        try {
            View view = c1114860f7M.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1114860f7M.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1114860f7M.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1114860f7M.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1114860f7M.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1114860f7M.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1114860f7M.getClass().getName();
        return c1114860f7M;
    }
}
