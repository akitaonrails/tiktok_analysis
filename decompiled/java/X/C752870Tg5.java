package X;

import Y.ACListenerS116S0200000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Tg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752870Tg5 extends AbstractC21673619ry<C752880Tg6> {
    public final DataChannel LL;
    public final EnumC748580TYa LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public List<C752860Tg4> LLILZ = new ArrayList();
    public final List<C752860Tg4> LLILZIL = new ArrayList();
    public Function1<? super Boolean, Unit> LLILZLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size();
    }

    public final void setData(List<C752860Tg4> list) {
        ((ArrayList) this.LLILZ).clear();
        ((ArrayList) this.LLILZIL).clear();
        ((ArrayList) this.LLILZIL).addAll(list);
        ((ArrayList) this.LLILZ).addAll(list);
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C752880Tg6 c752880Tg6 = new C752880Tg6(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.grx, viewGroup, false), this.LLILLJJLI, this.LL, this.LLILLL);
        try {
            View view = c752880Tg6.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c752880Tg6.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c752880Tg6.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C752880Tg6.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c752880Tg6.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c752880Tg6.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C752880Tg6.class.getName();
        return c752880Tg6;
    }

    @Override // X.AbstractC21673619ry
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    public C752870Tg5(DataChannel dataChannel, EnumC748580TYa enumC748580TYa, LifecycleOwner lifecycleOwner) {
        this.LL = dataChannel;
        this.LLILLJJLI = enumC748580TYa;
        this.LLILLL = lifecycleOwner;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        int i2;
        int i3;
        C752880Tg6 c752880Tg6 = (C752880Tg6) viewHolder;
        C752860Tg4 c752860Tg4 = (C752860Tg4) ListProtector.get(this.LLILZ, i);
        boolean z = !list.isEmpty();
        if (!C500260Jjc.LJJJIL(c752880Tg6.LLILLJJLI)) {
            C500260Jjc.LLFFF(c752880Tg6.LLILZIL);
            C16FS c16fs = c752880Tg6.LLILZLL;
            User user = c752860Tg4.LIZ;
            if (user != null && user.isAnchorMarked) {
                i2 = 2131853662;
            } else {
                i2 = 2131853659;
            }
            c16fs.setText(i2);
            C16FS c16fs2 = c752880Tg6.LLILZLL;
            User user2 = c752860Tg4.LIZ;
            if (user2 != null && user2.isAnchorMarked) {
                i3 = R.style.a8b;
            } else {
                i3 = R.style.a7u;
            }
            c16fs2.j0(i3);
            if (!z) {
                C1570050qxX.LIZ(new ACListenerS116S0200000_12(c752860Tg4, c752880Tg6, 3), c752880Tg6.LLILZLL);
            } else {
                return;
            }
        } else {
            C500260Jjc.LJIILIIL(c752880Tg6.LLILZIL);
        }
        C786410Ut5.H8(c752880Tg6.LLILZ, new ACListenerS116S0200000_12(c752860Tg4, c752880Tg6, 4));
        ImageModel imageModel = c752860Tg4.LJI;
        if (imageModel != null) {
            C0JSS.LJII(c752880Tg6.LLILZ, imageModel);
        } else {
            c752880Tg6.LLILZ.setImageResource(R.drawable.el_);
        }
        C786410Ut5.T7(c752880Tg6.LLIZLLLIL, new ACListenerS116S0200000_12(c752860Tg4, c752880Tg6, 5));
        EnumC748580TYa enumC748580TYa = c752880Tg6.LL;
        EnumC748580TYa enumC748580TYa2 = EnumC748580TYa.MARKED_VIEWER_LIST;
        if (enumC748580TYa == enumC748580TYa2) {
            c752880Tg6.LLIZLLLIL.setText(C0KVU.LIZIZ(c752860Tg4.LJ, c752860Tg4.LJFF));
        } else {
            c752880Tg6.LLIZLLLIL.setText(c752860Tg4.LJ);
        }
        C786410Ut5.T7(c752880Tg6.LLIZ, new ACListenerS116S0200000_12(c752860Tg4, c752880Tg6, 6));
        if (c752880Tg6.LL == enumC748580TYa2) {
            c752880Tg6.LLIZ.setText(c752860Tg4.LIZIZ);
        } else {
            c752880Tg6.LLIZ.setText(c752860Tg4.LJFF);
        }
    }
}
