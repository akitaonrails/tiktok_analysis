package X;

import Y.ARunnableS81S0200000_12;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766210U3v extends AbstractC761920Tug<C766220U3w, LiveEffect> {
    public final int LLILLJJLI;
    public final C766200U3u LLILLL;
    public final C0UA2 LLILZ;
    public Function1<? super LiveEffect, Unit> LLILZIL;

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    public final void LLLLLLIL() {
        InterfaceC761540Tu4 interfaceC761540Tu4;
        Iterator it2 = ((ArrayList) this.LL).iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.LJFF(((LiveEffect) it2.next()).getResourceId(), this.LLILLL.LIZ)) {
                break;
            } else {
                i++;
            }
        }
        LLLJ(i);
        C766200U3u c766200U3u = this.LLILLL;
        c766200U3u.LIZIZ = null;
        c766200U3u.LIZ = null;
        C0UA2 c0ua2 = this.LLILZ;
        if (c0ua2 == null || (interfaceC761540Tu4 = c0ua2.LIZJ) == null) {
            return;
        }
        interfaceC761540Tu4.LIZJ(null);
    }

    public final void LLLLLLL(List<? extends LiveEffect> list) {
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new C766240U3y(this.LL, list, "livebackground"), true);
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LL).addAll(list);
        c21341918fZLIZ.LIZJ(this);
        C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS81S0200000_12(list, this, 146));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C766220U3w c766220U3w = new C766220U3w(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), this.LLILLJJLI, viewGroup, false));
        try {
            View view = c766220U3w.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c766220U3w.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c766220U3w.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C766220U3w.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c766220U3w.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c766220U3w.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C766220U3w.class.getName();
        return c766220U3w;
    }

    public C766210U3v(int i, C766200U3u c766200U3u, C0UA2 c0ua2) {
        this.LLILLJJLI = i;
        this.LLILLL = c766200U3u;
        this.LLILZ = c0ua2;
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C500260Jjc.LLFFF(((C766220U3w) viewHolder).LLILLJJLI);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLLJIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C500260Jjc.LJIILLIIL(((C766220U3w) viewHolder).LLILLJJLI);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        List list;
        C766220U3w c766220U3w = (C766220U3w) viewHolder;
        LiveEffect liveEffect = (LiveEffect) obj;
        if (Intrinsics.LJFF(liveEffect.getResourceId(), this.LLILLL.LIZ)) {
            C500260Jjc.LLFFF(c766220U3w.LLILLJJLI);
        } else {
            C500260Jjc.LJIILLIIL(c766220U3w.LLILLJJLI);
        }
        C500260Jjc.LJLIIIL(500L, c766220U3w.itemView, new AwS221S0300000_12(this, liveEffect, c766220U3w, 28));
        C444140HbI.LIZ(c766220U3w.itemView, AFwS289S0000000_6.get$arr$(56));
        C1324720kZq c1324720kZq = c766220U3w.LL;
        UrlModel icon = liveEffect.getIcon();
        if (icon == null || (list = icon.urlList) == null) {
            list = C13BV.INSTANCE;
        }
        C766230U3x.LIZ(c1324720kZq, list, new Pair(Integer.valueOf(c766220U3w.LL.getWidth()), Integer.valueOf(c766220U3w.LL.getHeight())), ImageView.ScaleType.FIT_XY);
        c766220U3w.LL.setContentDescription(liveEffect.getName());
    }
}
