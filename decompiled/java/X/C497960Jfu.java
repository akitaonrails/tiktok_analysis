package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import webcast.api.sub.PrivilegeTag;

/* JADX INFO: renamed from: X.0Jfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497960Jfu extends AbstractC21673619ry<AbstractC498030Jg1> {
    public final Fragment LL;
    public final int LLILLJJLI;
    public final List<PrivilegeTag> LLILLL = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public final void LLLI(List<PrivilegeTag> list) {
        ((ArrayList) this.LLILLL).clear();
        ((ArrayList) this.LLILLL).addAll(list);
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return this.LLILLJJLI;
    }

    public C497960Jfu(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment, int i) {
        this.LL = subscriptionPrivilegeDetailFragment;
        this.LLILLJJLI = i;
    }

    public static final View LLLFZ(int i, ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((AbstractC498030Jg1) viewHolder).I5((PrivilegeTag) ListProtector.get(this.LLILLL, i), this.LLILLL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c497990Jfx;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        c497990Jfx = new C497990Jfx(LLLFZ(R.layout.hj9, viewGroup), this.LL);
                    } else {
                        c497990Jfx = new C497980Jfw(LLLFZ(R.layout.hin, viewGroup), this.LL);
                    }
                } else {
                    final View viewLLLFZ = LLLFZ(R.layout.hil, viewGroup);
                    c497990Jfx = new AbstractC498030Jg1(viewLLLFZ) { // from class: X.0Jfv
                        public final C16F5 LL;
                        public final C16F5 LLILLJJLI;

                        {
                            super(viewLLLFZ);
                            this.LL = (C16F5) viewLLLFZ.findViewById(R.id.ky9);
                            this.LLILLJJLI = (C16F5) viewLLLFZ.findViewById(R.id.kx_);
                        }

                        @Override // X.AbstractC498030Jg1
                        public final void I5(PrivilegeTag privilegeTag, List<PrivilegeTag> list) {
                            C16F5 c16f5 = this.LL;
                            if (c16f5 != null) {
                                c16f5.setText(privilegeTag.text);
                            }
                            C16F5 c16f52 = this.LLILLJJLI;
                            if (c16f52 != null) {
                                c16f52.setText(privilegeTag.desc);
                            }
                        }
                    };
                }
            } else {
                c497990Jfx = new C497980Jfw(LLLFZ(R.layout.him, viewGroup), this.LL);
            }
        } else {
            c497990Jfx = new C497990Jfx(LLLFZ(R.layout.hj9, viewGroup), this.LL);
        }
        try {
            View view = c497990Jfx.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c497990Jfx.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c497990Jfx.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c497990Jfx.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c497990Jfx.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c497990Jfx.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c497990Jfx.getClass().getName();
        return c497990Jfx;
    }
}
