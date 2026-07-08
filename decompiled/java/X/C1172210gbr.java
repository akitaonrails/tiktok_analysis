package X;

import Y.ACListenerS47S0201000_18;
import Y.AsS45S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0gbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172210gbr extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final C1172150gbl LL;
    public InterfaceC1172180gbo LLILLJJLI;
    public final C01GW LLILLL;
    public final List<InterfaceC1172200gbq> LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final AsS45S0100000_18 LLIZLLLIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZ).size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((InterfaceC1172200gbq) ListProtector.get(this.LLILZ, i)).getViewType();
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LJIJI(new C1208640hYc(this, layoutManager, 8));
        }
        recyclerView.addOnScrollListener(this.LLIZLLLIL);
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.removeOnScrollListener(this.LLIZLLLIL);
    }

    public C1172210gbr(C1172150gbl c1172150gbl, InterfaceC1172180gbo interfaceC1172180gbo) {
        this.LL = c1172150gbl;
        this.LLILLJJLI = interfaceC1172180gbo;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2744));
        this.LLILLL = c01gwLIZIZ;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c01gwLIZIZ.getValue());
        this.LLILZ = arrayList;
        this.LLIZLLLIL = new AsS45S0100000_18(this, 18);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        InterfaceC1172180gbo interfaceC1172180gbo;
        C1153370g7T c1153370g7T;
        InterfaceC1172200gbq interfaceC1172200gbq = (InterfaceC1172200gbq) ListProtector.get(this.LLILZ, i);
        this.LL.getViewHolderProvider();
        int i3 = 8;
        if (viewHolder instanceof C1172250gbv) {
            Object obj = ListProtector.get(this.LLILZ, i);
            if ((obj instanceof C1153370g7T) && (c1153370g7T = (C1153370g7T) obj) != null) {
                C1172250gbv c1172250gbv = (C1172250gbv) viewHolder;
                c1172250gbv.getClass();
                if (c1153370g7T.LIZ.length() > 0) {
                    c1172250gbv.LL.setText(c1153370g7T.LIZ);
                }
                if (c1153370g7T.LIZIZ.length() > 0) {
                    c1172250gbv.LLILLJJLI.setText(c1153370g7T.LIZIZ);
                    C786410Ut5.LLLLZLL(c1172250gbv.LLILLJJLI, 0);
                    return;
                } else {
                    C786410Ut5.LLLLZLL(c1172250gbv.LLILLJJLI, 8);
                    return;
                }
            }
            return;
        }
        if (viewHolder instanceof C1172220gbs) {
            if (!this.LLIZ && (interfaceC1172180gbo = this.LLILLJJLI) != null) {
                interfaceC1172180gbo.LIZ(interfaceC1172200gbq, i);
            }
            C1172220gbs c1172220gbs = (C1172220gbs) viewHolder;
            boolean z = this.LLIZ;
            boolean showItemAvatar = this.LL.getShowItemAvatar();
            boolean showItemImageIcon = this.LL.getShowItemImageIcon();
            c1172220gbs.LLILZIL.setLoading(z);
            if (z) {
                C786410Ut5.LJLLLLLL(8, c1172220gbs.LLILZ);
            } else {
                if (interfaceC1172200gbq.getCoverUrl().length() > 0) {
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(Collections.singletonList(interfaceC1172200gbq.getCoverUrl()));
                    urlModel.setUri(interfaceC1172200gbq.getCoverUrl());
                    C1324750kZt.LJI(c1172220gbs.LL, urlModel, -1, -1);
                }
                c1172220gbs.LLILLJJLI.setText(interfaceC1172200gbq.LIZ());
                List<String> avatarList = interfaceC1172200gbq.getAvatarList();
                if (showItemAvatar && (!avatarList.isEmpty())) {
                    C786410Ut5.LLLLLL(c1172220gbs.LLILLL, 0);
                    c1172220gbs.LLILLL.setTotalCount(avatarList.size());
                    c1172220gbs.LLILLL.setStacking(EnumC429060Gs4.FIRST_ON_TOP);
                    int i4 = 0;
                    for (String str : avatarList) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            C427760Gpy.LIZ(c1172220gbs.LLILLL, i4, str, "", null, null, false, null, 2040);
                            i4 = i5;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                } else {
                    C786410Ut5.LLLLLL(c1172220gbs.LLILLL, 8);
                }
                View view = c1172220gbs.LLILZ;
                if (showItemAvatar && (true ^ avatarList.isEmpty())) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, view);
                TuxIconView tuxIconView = c1172220gbs.LLILZLL;
                if (tuxIconView != null) {
                    if (showItemImageIcon) {
                        i3 = 0;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView, i3);
                }
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0gbw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                    }
                }, c1172220gbs.itemView);
            }
            C786410Ut5.I7(new ACListenerS47S0201000_18(this, interfaceC1172200gbq, i, 1), viewHolder.itemView);
            return;
        }
        if (!(viewHolder instanceof C1172240gbu)) {
            return;
        }
        final C1172240gbu c1172240gbu = (C1172240gbu) viewHolder;
        C786410Ut5.LLIL(c1172240gbu.LLILLL, 8);
        C786410Ut5.LLLZZIL(c1172240gbu.LLILLJJLI, 0);
        c1172240gbu.LLILLJJLI.LIZJ();
        C786410Ut5.S7(c1172240gbu.LLILZ, new View.OnClickListener() { // from class: X.0gbt
            public final /* synthetic */ boolean LL = false;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (this.LL) {
                    C786410Ut5.LLIL(c1172240gbu.LLILLL, 8);
                    C786410Ut5.LLLZZIL(c1172240gbu.LLILLJJLI, 0);
                    c1172240gbu.LLILLJJLI.LIZJ();
                    InterfaceC1172180gbo interfaceC1172180gbo2 = c1172240gbu.LL;
                    if (interfaceC1172180gbo2 != null) {
                        interfaceC1172180gbo2.LJJIIJ();
                    }
                }
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1172240gbu;
        this.LL.getViewHolderProvider();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    c1172240gbu = new C1172220gbs(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.os, viewGroup, false));
                } else {
                    c1172240gbu = new C1172220gbs(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.or, viewGroup, false));
                }
            } else {
                c1172240gbu = new C1172250gbv(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.oq, viewGroup, false));
            }
        } else {
            c1172240gbu = new C1172240gbu(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.op, viewGroup, false), this.LLILLJJLI);
        }
        try {
            View view = c1172240gbu.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1172240gbu.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1172240gbu.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1172240gbu.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1172240gbu.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1172240gbu.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1172240gbu.getClass().getName();
        return c1172240gbu;
    }
}
