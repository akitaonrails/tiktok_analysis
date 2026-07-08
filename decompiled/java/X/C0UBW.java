package X;

import Y.ACListenerS79S0300000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.music.entity.Album;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UBW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UBW extends AbstractC21673619ry<C0UBX> {
    public final Function1<Album, Unit> LL;
    public long LLILLL;
    public long LLILZ;
    public final List<Album> LLILLJJLI = new ArrayList();
    public final String LLILZIL = "item_selected";

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C0UBW(AwS591S0100000_12 awS591S0100000_12) {
        this.LL = awS591S0100000_12;
    }

    public final int LLLI(long j) {
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (((Album) it2.next()).id != j) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static void LLLFZ(C0UBX c0ubx, boolean z) {
        if (z) {
            C786410Ut5.LJLLLLLL(0, c0ubx.LLILLL);
            c0ubx.LLILLJJLI.setTextColor(C497740JfY.LIZLLL(R.attr.eu5, c0ubx.itemView.getContext()));
        } else {
            C786410Ut5.LJLLLLLL(8, c0ubx.LLILLL);
            c0ubx.LLILLJJLI.setTextColor(C497740JfY.LIZLLL(R.attr.c9i, c0ubx.itemView.getContext()));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0UBX c0ubx = (C0UBX) viewHolder;
        Album album = (Album) ListProtector.get(this.LLILLJJLI, i);
        boolean z = true;
        C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(C1697810uHb.LJIILJJIL(album.cover));
        c1324610kZfLIZJ.LJIIIZ = R.drawable.el4;
        c1324610kZfLIZJ.LJJI(c0ubx.LL);
        c0ubx.LLILLJJLI.setText(album.name);
        if (this.LLILLL != album.id) {
            z = false;
        }
        LLLFZ(c0ubx, z);
        C500260Jjc.LJIILIIL(c0ubx.LLILZ);
        C786410Ut5.I7(new ACListenerS79S0300000_12(this, album, c0ubx, 27), c0ubx.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0UBX c0ubx = new C0UBX(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hey, viewGroup, false));
        try {
            View view = c0ubx.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0ubx.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0ubx.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0UBX.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0ubx.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0ubx.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0UBX.class.getName();
        return c0ubx;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        boolean z;
        C0UBX c0ubx = (C0UBX) viewHolder;
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), this.LLILZIL)) {
                    if (this.LLILLL == ((Album) ListProtector.get(this.LLILLJJLI, i)).id) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LLLFZ(c0ubx, z);
                } else {
                    super.onBindViewHolder(c0ubx, i, list);
                }
            }
            return;
        }
        super.onBindViewHolder(c0ubx, i, list);
    }
}
