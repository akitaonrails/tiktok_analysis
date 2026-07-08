package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.portrait.model.PortraitAuthor;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.model.PortraitUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0MX0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MX0 extends AbstractC2172971A2l<C0MX3, RecyclerView.ViewHolder> {
    public final Function1<C0MX2, Unit> LLILLJJLI;
    public final Function1<C0MX2, Unit> LLILLL;
    public final Function2<PortraitStyleItem, Integer, Unit> LLILZ;
    public final Map<Integer, Boolean> LLILZIL;
    public int LLILZLL;
    public int LLIZ;

    public final void LLLIIIIL(GridLayoutManager gridLayoutManager) {
        C0MX2 c0mx2;
        int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            if (iFindFirstVisibleItemPosition >= 0 && iFindFirstVisibleItemPosition < this.LL.LJFF.size()) {
                Object obj = ((LinkedHashMap) this.LLILZIL).get(Integer.valueOf(iFindFirstVisibleItemPosition));
                Boolean bool = Boolean.TRUE;
                if (!Intrinsics.LJFF(obj, bool)) {
                    Object obj2 = ListProtector.get(this.LL.LJFF, iFindFirstVisibleItemPosition);
                    if ((obj2 instanceof C0MX2) && (c0mx2 = (C0MX2) obj2) != null) {
                        this.LLILZ.invoke(c0mx2.LIZ, Integer.valueOf(c0mx2.LIZIZ));
                        this.LLILZIL.put(Integer.valueOf(iFindFirstVisibleItemPosition), bool);
                    }
                }
            }
            if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                iFindFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return LLLFZ(i).LIZIZ();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C0MX5 c0mx5;
        C1390410mHn c1390410mHn;
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof C0MX5) && (c0mx5 = (C0MX5) viewHolder) != null && (c1390410mHn = c0mx5.LL) != null) {
            c1390410mHn.LIZJ();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C0MX5 c0mx5;
        C1390410mHn c1390410mHn;
        super.onViewDetachedFromWindow(viewHolder);
        if ((viewHolder instanceof C0MX5) && (c0mx5 = (C0MX5) viewHolder) != null && (c1390410mHn = c0mx5.LL) != null) {
            c1390410mHn.LIZLLL();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        String str;
        int iLIZIZ;
        String strLIZ;
        int i2;
        PortraitAuthor portraitAuthor;
        Long l;
        if (viewHolder instanceof C0MX1) {
            C0MX1 c0mx1 = (C0MX1) viewHolder;
            C0MX2 c0mx2 = (C0MX2) LLLFZ(i);
            Resources resources = c0mx1.itemView.getResources();
            EnumC1419230n2H enumC1419230n2H = c0mx2.LIZ.styleType;
            boolean z2 = true;
            if (enumC1419230n2H != null && enumC1419230n2H.equals(EnumC1419230n2H.OFFICIAL)) {
                z = true;
            } else {
                z = false;
            }
            TuxTextView tuxTextView = c0mx1.LLILZ;
            StringBuilder sb = new StringBuilder(e3.g);
            PortraitAuthor portraitAuthor2 = c0mx2.LIZ.author;
            if (portraitAuthor2 == null || (str = portraitAuthor2.name) == null || str.length() <= 0) {
                str = null;
            }
            sb.append(str);
            tuxTextView.setText(sb.toString());
            TuxTextView tuxTextView2 = c0mx1.LLILZ;
            if (z || (portraitAuthor = c0mx2.LIZ.author) == null || (l = portraitAuthor.userId) == null || l.longValue() <= 0) {
                z2 = false;
            }
            tuxTextView2.setClickable(z2);
            Long l2 = c0mx2.LIZ.postCount;
            if (l2 != null && l2.longValue() >= ((Number) C280260Aye.LIZ.getValue()).intValue()) {
                C786410Ut5.LLLLZLL(c0mx1.LLILZIL, 0);
                TuxTextView tuxTextView3 = c0mx1.LLILZIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C1675970tiN.LIZIZ(l2.longValue()));
                sbLIZ.append(' ');
                sbLIZ.append(resources.getString(2131825815));
                tuxTextView3.setText(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C786410Ut5.LLLLZLL(c0mx1.LLILZIL, 8);
            }
            View view = c0mx1.itemView;
            if ((this.LLILZLL <= 0 || this.LLIZ <= 0) && (iLIZIZ = (view.getResources().getDisplayMetrics().widthPixels - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))) / 2) > 0) {
                this.LLILZLL = iLIZIZ;
                this.LLIZ = (iLIZIZ * 260) / 173;
            }
            PortraitUrlModel portraitUrlModel = c0mx2.LIZ.coverUrl;
            if (portraitUrlModel == null || (strLIZ = C0MXA.LIZ(portraitUrlModel)) == null) {
                strLIZ = "";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strLIZ);
            int i3 = this.LLILZLL;
            if (i3 > 0 && (i2 = this.LLIZ) > 0) {
                c1331670kl3LJIIIZ.LJIIIIZZ = i3;
                c1331670kl3LJIIIZ.LJIIIZ = i2;
            }
            c1331670kl3LJIIIZ.LJJ(c0mx1.LLILLL);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            c0mx1.LLILZLL = c0mx2;
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c0mx5;
        if (i != 2) {
            if (i != 3) {
                c0mx5 = new C0MX1(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.n7, viewGroup, false), this.LLILLJJLI, this.LLILLL);
            } else {
                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.n6, viewGroup, false);
                c0mx5 = new RecyclerView.ViewHolder(viewTd) { // from class: X.0MX8
                };
            }
        } else {
            c0mx5 = new C0MX5(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.n5, viewGroup, false));
        }
        try {
            View view = c0mx5.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0mx5.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0mx5.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0mx5.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0mx5.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0mx5.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0mx5.getClass().getName();
        return c0mx5;
    }

    public C0MX0(AwS587S0100000_8 awS587S0100000_8, AwS587S0100000_8 awS587S0100000_82, AwS622S0100000_8 awS622S0100000_8) {
        super(new AbstractC339510DSr<C0MX3>() { // from class: X.0MX4
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C0MX3 c0mx3, C0MX3 c0mx32) {
                return Intrinsics.LJFF(c0mx3, c0mx32);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C0MX3 c0mx3, C0MX3 c0mx32) {
                return Intrinsics.LJFF(c0mx3.LIZ(), c0mx32.LIZ());
            }
        });
        this.LLILLJJLI = awS587S0100000_8;
        this.LLILLL = awS587S0100000_82;
        this.LLILZ = awS622S0100000_8;
        this.LLILZIL = new LinkedHashMap();
    }
}
