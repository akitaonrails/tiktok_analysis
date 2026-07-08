package X;

import Y.ACListenerS122S0200000_19;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iC2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233080iC2 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Function1<MinisSubscriptionInfo, Unit> LL;
    public final List<AbstractC1881807Yq> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C1233080iC2(AwS598S0100000_19 awS598S0100000_19) {
        this.LL = awS598S0100000_19;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LLILLJJLI, i);
        if (obj instanceof C1881707Yp) {
            return 0;
        }
        if (obj instanceof C1881907Yr) {
            return 2;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        AbstractC1881807Yq abstractC1881807Yq = (AbstractC1881807Yq) ListProtector.get(this.LLILLJJLI, i);
        if (abstractC1881807Yq instanceof C1881707Yp) {
            ((C1233100iC4) viewHolder).LL.setText(((C1881707Yp) abstractC1881807Yq).LIZ);
            return;
        }
        if (abstractC1881807Yq instanceof C1881907Yr) {
            C1233090iC3 c1233090iC3 = (C1233090iC3) viewHolder;
            c1233090iC3.getClass();
            MinisSubscriptionInfo minisSubscriptionInfo = ((C1881907Yr) abstractC1881807Yq).LIZ;
            c1233090iC3.LLILLL.setText(minisSubscriptionInfo.clientName);
            c1233090iC3.LLILZ.setText(minisSubscriptionInfo.minisDesc);
            TextView textView = c1233090iC3.LLILZIL;
            if (Intrinsics.LJFF(minisSubscriptionInfo.isMock, Boolean.TRUE)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLIL(textView, i2);
            final String str = minisSubscriptionInfo.clientIcon;
            C427870Gq9 c427870Gq9 = c1233090iC3.LLILLJJLI;
            if (c427870Gq9 != null) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadIconImg, minisIconUrl:");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                if (str != null) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                    c1331670kl3LJIIIZ.LJJ(c427870Gq9);
                    c1331670kl3LJIIIZ.LIZLLL("MinisStatusView");
                    c1331670kl3LJIIIZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0iMK
                        @Override // X.InterfaceC427850Gq7
                        public final void cm(Uri uri, View view, Throwable th) {
                            int i4 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onFailed，url:");
                            sbLIZ2.append(uri);
                            sbLIZ2.append(", minisIconUrl:");
                            sbLIZ2.append(str);
                            sbLIZ2.append(", view:");
                            sbLIZ2.append(view);
                            sbLIZ2.append(", throwable:");
                            sbLIZ2.append(th);
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                            int i4 = C2187451AjH.LIZ;
                        }
                    });
                }
            }
            C786410Ut5.I7(new ACListenerS122S0200000_19(c1233090iC3, minisSubscriptionInfo, 85), c1233090iC3.itemView);
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1233100iC4;
        if (i != 0) {
            if (i == 2) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dne, viewGroup, false);
                C1378990lzN.LIZIZ(viewTd, Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), null, 16);
                c1233100iC4 = new C1233090iC3(viewTd, this.LL);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown view type: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            c1233100iC4 = new C1233100iC4(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dnf, viewGroup, false));
        }
        try {
            View view = c1233100iC4.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1233100iC4.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1233100iC4.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1233100iC4.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1233100iC4.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1233100iC4.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1233100iC4.getClass().getName();
        return c1233100iC4;
    }
}
