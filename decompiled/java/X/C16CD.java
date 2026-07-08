package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS112S0201000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.16CD, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16CD extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Context LL;
    public final Size LLILZ;
    public C16CC LLILZIL;
    public C16CH LLILZLL;
    public RecyclerView LLIZLLLIL;
    public List<C16CI> LLJI;
    public int LLJILJILJ;
    public final int LLILLJJLI = 1;
    public final ArrayList<TikTokMediaModel> LLILLL = new ArrayList<>();
    public int LLIZ = 1;
    public List<TikTokMediaModel> LLJ = new ArrayList();
    public final List<C16CI> LLJIJIL = new ArrayList();
    public final Map<Integer, Integer> LLJILJIL = new HashMap();

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    public final void LLLII() {
        if (this.LLJI == null) {
            this.LLJILJILJ = 0;
            return;
        }
        ((ArrayList) this.LLJIJIL).clear();
        Iterator<C16CI> it2 = this.LLJI.iterator();
        while (it2.hasNext()) {
            ((ArrayList) this.LLJIJIL).add(it2.next());
        }
        this.LLJILJILJ = ((ArrayList) this.LLJIJIL).size();
    }

    public final void LLLIIIIL() {
        int i = -1;
        for (TikTokMediaModel tikTokMediaModel : this.LLJ) {
            i++;
            Iterator<TikTokMediaModel> it2 = this.LLILLL.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(tikTokMediaModel.LJFF(), it2.next().LJFF())) {
                    notifyItemChanged(this.LLJILJILJ + i);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLIL() {
        C0WIY c0wiy;
        RecyclerView recyclerView = this.LLIZLLLIL;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                c0wiy = new C0WIY(Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()), Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition()));
            } else {
                c0wiy = new C0WIY(-1, -1);
            }
            int iIntValue = ((Number) c0wiy.LIZ).intValue();
            notifyItemRangeChanged(iIntValue, (((Number) c0wiy.LIZIZ).intValue() - iIntValue) + 1, new Object());
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJ.size() + this.LLJILJILJ;
    }

    public final void LLLILZ(View view) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width != this.LLILZ.getWidth() && layoutParams.height != this.LLILZ.getHeight()) {
            layoutParams.width = this.LLILZ.getWidth();
            layoutParams.height = this.LLILZ.getHeight();
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Class<?> cls;
        int iHashCode = 0;
        if (i < this.LLJILJILJ && (!this.LLJIJIL.isEmpty())) {
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LLJIJIL);
            Integer numValueOf = null;
            if (objLJJJLZIJ != null && (cls = objLJJJLZIJ.getClass()) != null) {
                iHashCode = cls.hashCode();
            }
            Map<Integer, Integer> map = this.LLJILJIL;
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            C16CI c16ci = (C16CI) C13LP.LJJJLZIJ(i, this.LLJIJIL);
            if (c16ci != null) {
                numValueOf = Integer.valueOf(c16ci.layoutRes());
            }
            ((HashMap) map).put(numValueOf2, numValueOf);
            return iHashCode;
        }
        return 1001;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C16CE c16ce;
        InterfaceC420801kM interfaceC420801kM;
        if ((viewHolder instanceof C16CE) && (interfaceC420801kM = (c16ce = (C16CE) viewHolder).LLIZLLLIL) != null && !interfaceC420801kM.isDisposed()) {
            c16ce.LLILZIL = "";
            c16ce.LLIZLLLIL = null;
            interfaceC420801kM.dispose();
        }
    }

    public C16CD(Context context, int i) {
        this.LL = context;
        C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
        Double dValueOf = Double.valueOf(1.5d);
        c1546210qL5.getClass();
        int iLJIIJ = (C12ES.LJIIJ(context) - ((i - 1) * C814420VxA.LIZIZ(C1546210qL5.LIZ(dValueOf)))) / i;
        this.LLILZ = new Size(iLJIIJ, (int) (((double) iLJIIJ) * 1.0d));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.16CJ] */
    public final void LLLFZ(C21341918fZ c21341918fZ, List<TikTokMediaModel> list) {
        final int i = this.LLJILJILJ;
        final ?? r2 = new C16CL(i) { // from class: X.16CJ
            public final int LIZ;

            {
                this.LIZ = i;
            }

            @Override // X.C16CL
            public final int LIZ(int i2) {
                return this.LIZ + i2;
            }
        };
        final RecyclerView recyclerView = this.LLIZLLLIL;
        if (recyclerView != null) {
            c21341918fZ.LIZIZ(new InterfaceC1891370zJn(this, recyclerView, r2) { // from class: X.16CG
                public final AbstractC21673619ry<? extends RecyclerView.ViewHolder> LL;
                public final RecyclerView LLILLJJLI;
                public final C16CL LLILLL;

                @Override // X.InterfaceC1891370zJn
                public final void LJZL(int i2, int i3) {
                    int iLIZ = this.LLILLL.LIZ(i2);
                    this.LL.notifyItemRangeInserted(iLIZ, i3);
                    if (iLIZ == 0) {
                        this.LLILLJJLI.scrollToPosition(0);
                    }
                }

                @Override // X.InterfaceC1891370zJn
                public final void LLI(int i2, int i3) {
                    this.LL.notifyItemMoved(this.LLILLL.LIZ(i2), this.LLILLL.LIZ(i3));
                }

                @Override // X.InterfaceC1891370zJn
                public final void LLIZLLLIL(int i2, int i3) {
                    this.LL.notifyItemRangeRemoved(this.LLILLL.LIZ(i2), i3);
                }

                {
                    this.LL = this;
                    this.LLILLJJLI = recyclerView;
                    this.LLILLL = r2;
                }

                @Override // X.InterfaceC1891370zJn
                public final void LLJJJJJIL(int i2, int i3, Object obj) {
                    this.LL.notifyItemRangeChanged(this.LLILLL.LIZ(i2), i3, obj);
                }
            });
        }
        this.LLJ = new ArrayList(list);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C16CE c16ce;
        if ((viewHolder instanceof C16CE) && (c16ce = (C16CE) viewHolder) != null) {
            LLLIILIL(c16ce, i, false);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C16CE c16ce;
        Object obj = ((HashMap) this.LLJILJIL).get(Integer.valueOf(i));
        if (obj == null) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (i != 1001 && num != null) {
            c16ce = new C16CE(C786410Ut5.Td(C786410Ut5.ne(this.LL), num.intValue(), viewGroup, false));
        } else {
            c16ce = new C16CE(C21146717pB.LIZIZ(this.LL, R.layout.an7, viewGroup, false));
            c16ce.LL = (SmartImageView) c16ce.itemView.findViewById(R.id.o5h);
            c16ce.LLILLJJLI = (TextView) c16ce.itemView.findViewById(R.id.kem);
            c16ce.LLILLL = (FrameLayout) c16ce.itemView.findViewById(R.id.i6h);
            c16ce.LLILZ = c16ce.itemView.findViewById(R.id.uy1);
        }
        try {
            View view = c16ce.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c16ce.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c16ce.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C16CE.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c16ce.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c16ce.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C16CE.class.getName();
        return c16ce;
    }

    public final void LLLI(TikTokMediaModel tikTokMediaModel, int i, boolean z) {
        int i2 = tikTokMediaModel.selectIndex;
        if (i2 >= 0) {
            tikTokMediaModel.selectIndex = -1;
            int size = this.LLILLL.size();
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                TikTokMediaModel tikTokMediaModel2 = (TikTokMediaModel) ListProtector.get(this.LLILLL, i4);
                if (TextUtils.equals(tikTokMediaModel2.LJIILLIIL(), tikTokMediaModel.LJIILLIIL())) {
                    i3 = i4;
                }
                int i5 = tikTokMediaModel2.selectIndex;
                if (i5 > i2) {
                    tikTokMediaModel2.selectIndex = i5 - 1;
                }
            }
            if (i3 >= 0) {
                ListProtector.remove(this.LLILLL, i3);
            }
            if (i != -1) {
                if (this.LLILLL.size() + 1 == this.LLILLJJLI) {
                    LLLIL();
                } else {
                    if (i >= 0) {
                        notifyItemChanged(i, new Object());
                    }
                    Iterator<TikTokMediaModel> it2 = this.LLILLL.iterator();
                    while (it2.hasNext()) {
                        notifyItemChanged(it2.next().originIndex, new Object());
                    }
                }
            } else {
                notifyItemChanged(tikTokMediaModel.originIndex);
                LLLIIIIL();
            }
            C16CH c16ch = this.LLILZLL;
            if (c16ch != null) {
                c16ch.LIZLLL(tikTokMediaModel, false);
            }
            C16CH c16ch2 = this.LLILZLL;
            if (c16ch2 != null) {
                c16ch2.LIZJ(this.LLILLL);
                return;
            }
            return;
        }
        C531320Ksc.LIZ(tikTokMediaModel.LJFF(), false, new AwS112S0201000_31(this, tikTokMediaModel, i, z, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIILIL(final X.C16CE r14, final int r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16CD.LLLIILIL(X.16CE, int, boolean):void");
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C16CE c16ce;
        if ((viewHolder instanceof C16CE) && (c16ce = (C16CE) viewHolder) != null) {
            LLLIILIL(c16ce, i, !list.isEmpty());
        }
    }
}
