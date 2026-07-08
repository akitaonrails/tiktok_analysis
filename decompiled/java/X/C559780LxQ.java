package X;

import Y.AObjectS203S0300000_8;
import Y.AObjectS351S0100000_8;
import Y.AObjectS527S0100000_8;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LxQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559780LxQ extends AbstractC21673619ry<C421020Gf6> {
    public final C559790LxR LL;
    public final Function2<MediaItem, Integer, Unit> LLILLJJLI;
    public final List<MediaItem> LLILLL;
    public final Set<Integer> LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C421020Gf6 c421020Gf6 = (C421020Gf6) viewHolder;
        MediaItem mediaItem = (MediaItem) ListProtector.get(this.LLILLL, i);
        Uri uriLIZIZ = mediaItem.LIZIZ();
        C417420GYi c417420GYi = (C417420GYi) c421020Gf6.itemView.findViewById(R.id.xul);
        if (Intrinsics.LJFF(uriLIZIZ, Uri.EMPTY)) {
            c417420GYi.setTag(R.id.xul, null);
            c417420GYi.setImageResource(0);
        } else if (!Intrinsics.LJFF(c417420GYi.getTag(R.id.xul), uriLIZIZ)) {
            c417420GYi.setTag(R.id.xul, uriLIZIZ);
            this.LL.LIZ(c421020Gf6.itemView.getContext(), uriLIZIZ, c417420GYi, c421020Gf6.itemView.getMeasuredWidth(), c421020Gf6.itemView.getMeasuredHeight());
        }
        View viewFindViewById = c421020Gf6.itemView.findViewById(R.id.gcl);
        View viewFindViewById2 = c421020Gf6.itemView.findViewById(R.id.res);
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        if (this.LLILZ.contains(Integer.valueOf(i))) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
        } else {
            C786410Ut5.LJLLLLLL(4, viewFindViewById2);
        }
        C560180Ly4.LIZ(c421020Gf6.itemView, new AObjectS203S0300000_8(mediaItem, this, c421020Gf6, 0));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(viewGroup) { // from class: X.0Gf6
            {
                super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c8c, viewGroup, false));
            }
        };
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C421020Gf6.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C421020Gf6.class.getName();
        return viewHolder;
    }

    public C559780LxQ(C559790LxR c559790LxR, List list, AObjectS527S0100000_8 aObjectS527S0100000_8) {
        this.LL = c559790LxR;
        this.LLILLJJLI = aObjectS527S0100000_8;
        ArrayList arrayList = new ArrayList();
        this.LLILLL = arrayList;
        this.LLILZ = new LinkedHashSet();
        arrayList.addAll(list);
        c559790LxR.LIZIZ(new AObjectS351S0100000_8(this, 6));
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        if (!list.isEmpty()) {
            for (Object obj : list) {
                View viewFindViewById = viewHolder.itemView.findViewById(R.id.res);
                C417420GYi c417420GYi = (C417420GYi) viewHolder.itemView.findViewById(R.id.xul);
                if (Intrinsics.LJFF(obj, 0)) {
                    if (this.LLILZ.contains(Integer.valueOf(i))) {
                        C786410Ut5.LJLLLLLL(0, viewFindViewById);
                    } else {
                        C786410Ut5.LJLLLLLL(4, viewFindViewById);
                    }
                } else if (Intrinsics.LJFF(obj, 1)) {
                    Uri uriLIZIZ = ((MediaItem) ListProtector.get(this.LLILLL, i)).LIZIZ();
                    if (Intrinsics.LJFF(uriLIZIZ, Uri.EMPTY)) {
                        c417420GYi.setTag(R.id.xul, null);
                        c417420GYi.setImageResource(0);
                    } else {
                        c417420GYi.setTag(R.id.xul, uriLIZIZ);
                        this.LL.LIZ(viewHolder.itemView.getContext(), uriLIZIZ, c417420GYi, viewHolder.itemView.getMeasuredWidth(), viewHolder.itemView.getMeasuredHeight());
                    }
                }
            }
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
    }
}
