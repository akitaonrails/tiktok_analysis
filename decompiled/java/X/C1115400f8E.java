package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0f8E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115400f8E extends AbstractC21673619ry<AbstractC1115470f8L> {
    public final LayoutInflater LL;
    public final LifecycleOwner LLILLJJLI;
    public final List<C1115500f8O> LLILLL = new ArrayList();
    public C1115340f88 LLILZ;

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        C1115530f8R c1115530f8R = (C1115530f8R) ListProtector.get(this.LLILLL, i);
        if (c1115530f8R == null) {
            return 2;
        }
        return c1115530f8R.getType();
    }

    public C1115400f8E(Context context, LifecycleOwner lifecycleOwner) {
        this.LL = C786410Ut5.ne(context);
        this.LLILLJJLI = lifecycleOwner;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        AbstractC1115470f8L abstractC1115470f8L = (AbstractC1115470f8L) viewHolder;
        C1115500f8O c1115500f8O = (C1115500f8O) ListProtector.get(this.LLILLL, i);
        if (c1115500f8O != null) {
            if (c1115500f8O.getType() == 2) {
                C786410Ut5.LJLLLLLL(4, abstractC1115470f8L.itemView);
                return;
            }
            abstractC1115470f8L.I5(c1115500f8O, i);
            C1115340f88 c1115340f88 = this.LLILZ;
            if (c1115340f88 == null) {
                return;
            }
            abstractC1115470f8L.L5(c1115340f88);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1115430f8H;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) C497740JfY.LIZIZ(52.0f));
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    c1115430f8H = new C1115450f8J(C786410Ut5.Sd(R.layout.gsx, this.LL, null));
                    C786410Ut5.W5(c1115430f8H.itemView, layoutParams);
                } else {
                    final View viewSd = C786410Ut5.Sd(R.layout.gqd, this.LL, null);
                    c1115430f8H = new AbstractC1115470f8L<C1115520f8Q>(viewSd) { // from class: X.0f8F
                        public final C01GW LL;
                        public final C16F5 LLILLJJLI;

                        @Override // X.AbstractC1115470f8L
                        public final void L5(C1115340f88 c1115340f88) {
                        }

                        {
                            super(viewSd);
                            this.LL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(233));
                            this.LLILLJJLI = (C16F5) viewSd.findViewById(R.id.title);
                        }

                        @Override // X.AbstractC1115470f8L
                        public final void I5(C1115500f8O c1115500f8O, int i2) {
                            this.LLILLJJLI.setText(((C1115520f8Q) c1115500f8O).LL);
                            if (i2 == 0) {
                                C500260Jjc.LJLJL(((Number) this.LL.getValue()).intValue(), this.LLILLJJLI);
                            }
                        }
                    };
                }
            } else {
                c1115430f8H = new C1115390f8D(C786410Ut5.Sd(R.layout.gsx, this.LL, null), this.LLILLJJLI);
                C786410Ut5.W5(c1115430f8H.itemView, layoutParams);
            }
        } else {
            c1115430f8H = new C1115430f8H(C786410Ut5.Sd(R.layout.gtd, this.LL, null));
            C786410Ut5.W5(c1115430f8H.itemView, layoutParams);
        }
        try {
            View view = c1115430f8H.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1115430f8H.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1115430f8H.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1115430f8H.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1115430f8H.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1115430f8H.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1115430f8H.getClass().getName();
        return c1115430f8H;
    }
}
