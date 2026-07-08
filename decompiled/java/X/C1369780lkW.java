package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.LiveRepostAddNoteChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369780lkW extends AbstractC1366540lfI {
    public static final C01GW<Integer[]> LLJJIII = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(315));
    public final Context LL;
    public final InterfaceC1368050lhj LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final BaseSharePackage LLIZ;
    public final boolean LLIZLLLIL;
    public final int LLJ;
    public final Integer LLJI;
    public final C1369610lkF LLJIJIL;
    public List<? extends InterfaceC1369790lkX> LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;
    public final C1369860lke LLJJI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJILJIL.size();
    }

    @Override // X.AbstractC1366540lfI
    public final void LLLI(InterfaceC1369790lkX interfaceC1369790lkX) {
        int iIndexOf = this.LLJILJIL.indexOf(interfaceC1369790lkX);
        if (iIndexOf != -1) {
            ArrayList arrayList = new ArrayList(this.LLJILJIL);
            ListProtector.remove(arrayList, iIndexOf);
            this.LLJILJIL = arrayList;
            notifyItemRemoved(iIndexOf);
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i >= 0) {
            if (i < this.LLJILJIL.size()) {
                if (Intrinsics.LJFF(((InterfaceC1369790lkX) ListProtector.get(this.LLJILJIL, i)).key(), "invitation")) {
                    return 1;
                }
                if (i < 0) {
                    return 0;
                }
            }
            if (i < this.LLJILJIL.size()) {
                if (Intrinsics.LJFF(((InterfaceC1369790lkX) ListProtector.get(this.LLJILJIL, i)).key(), "repost")) {
                    return 2;
                }
                if (i < 0) {
                    return 0;
                }
            }
            if (i < this.LLJILJIL.size()) {
                if (Intrinsics.LJFF(((InterfaceC1369790lkX) ListProtector.get(this.LLJILJIL, i)).key(), "live_repost")) {
                    return 5;
                }
                if (i < 0) {
                    return 0;
                }
            }
            if (i < this.LLJILJIL.size()) {
                if (Intrinsics.LJFF(((InterfaceC1369790lkX) ListProtector.get(this.LLJILJIL, i)).key(), "live_repost_note")) {
                    return 7;
                }
                if (i < 0) {
                    return 0;
                }
            }
            if (i < this.LLJILJIL.size()) {
                if (Intrinsics.LJFF(((InterfaceC1369790lkX) ListProtector.get(this.LLJILJIL, i)).key(), "share_to_story")) {
                    return 3;
                }
                if (i < 0) {
                    return 0;
                }
            }
            if (i < this.LLJILJIL.size()) {
                if (Intrinsics.LJFF(((InterfaceC1369790lkX) ListProtector.get(this.LLJILJIL, i)).key(), "share_with_v2")) {
                    return 4;
                }
                if (i < 0) {
                    return 0;
                }
            }
            if (i < this.LLJILJIL.size() && Intrinsics.LJFF(((InterfaceC1369790lkX) ListProtector.get(this.LLJILJIL, i)).key(), "dnu_exchange")) {
                return 8;
            }
            return 0;
        }
        return 0;
    }

    @Override // X.AbstractC1366540lfI
    public final void setData(List<? extends InterfaceC1369790lkX> list) {
        this.LLJILJIL = list;
        if (this.LLJILJILJ) {
            Iterator<? extends InterfaceC1369790lkX> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (this.LLJJI.LIZ(it2.next().label())) {
                    this.LLJILLL = true;
                    break;
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC1366540lfI
    public final void LLLFZ(LiveRepostAddNoteChannel liveRepostAddNoteChannel, int i) {
        ArrayList arrayList = new ArrayList(this.LLJILJIL);
        ListProtector.add(arrayList, i, liveRepostAddNoteChannel);
        this.LLJILJIL = arrayList;
        notifyItemInserted(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1369800lkY LLLII(int r12, android.view.ViewGroup r13) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369780lkW.LLLII(int, android.view.ViewGroup):X.0lkY");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9 A[PHI: r2
      0x00e9: PHI (r2v6 int) = (r2v5 int), (r2v8 int), (r2v9 int), (r2v8 int) binds: [B:19:0x00be, B:33:0x0118, B:26:0x00e8, B:23:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, int r13) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369780lkW.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1369800lkY c1369800lkYLLLII = LLLII(i, viewGroup);
        try {
            View view = c1369800lkYLLLII.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1369800lkYLLLII.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1369800lkYLLLII.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1369800lkY.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1369800lkYLLLII.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1369800lkYLLLII.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1369800lkY.class.getName();
        return c1369800lkYLLLII;
    }

    public /* synthetic */ C1369780lkW(Context context, InterfaceC1368050lhj interfaceC1368050lhj, int i, boolean z, int i2, int i3, BaseSharePackage baseSharePackage, boolean z2, int i4) {
        this(context, interfaceC1368050lhj, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 8 : i3, (i4 & 64) != 0 ? null : baseSharePackage, (i4 & 128) != 0 ? false : z2, 0, null, null);
    }

    public C1369780lkW(Context context, InterfaceC1368050lhj interfaceC1368050lhj, int i, boolean z, int i2, int i3, BaseSharePackage baseSharePackage, boolean z2, int i4, Integer num, C1369610lkF c1369610lkF) {
        this.LL = context;
        this.LLILLJJLI = interfaceC1368050lhj;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
        this.LLIZ = baseSharePackage;
        this.LLIZLLLIL = z2;
        this.LLJ = i4;
        this.LLJI = num;
        this.LLJIJIL = c1369610lkF;
        this.LLJILJIL = C13BV.INSTANCE;
        this.LLJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 807));
        this.LLJJI = new C1369860lke();
    }
}
