package X;

import Y.ACListenerS129S0200000_27;
import Y.ACListenerS161S0100000_27;
import Y.AObserverS32S0500000_27;
import android.content.ComponentCallbacks2;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS165S0101000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import u4.q0;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1806980x7g extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static final /* synthetic */ int LLILZIL = 0;
    public final C1806860x7U LL;
    public final InterfaceC1807160x7y LLILLJJLI;
    public final IWalletService LLILLL;
    public List<? extends InterfaceC1806790x7N> LLILZ = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((InterfaceC1806790x7N) ListProtector.get(this.LLILZ, i)).getStyle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r8, int r9) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1806980x7g.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public C1806980x7g(C1806860x7U c1806860x7U, C1805360x54 c1805360x54, IWalletService iWalletService) {
        this.LL = c1806860x7U;
        this.LLILLJJLI = c1805360x54;
        this.LLILLL = iWalletService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<? extends Object> list) {
        C1806630x77 c1806630x77;
        List<IapListResult.ActivityDetail> list2;
        IapListResult.ActivityDetail next;
        LifecycleOwner lifecycleOwner;
        C1806650x79 c1806650x79;
        C1806040x6A c1806040x6A;
        int coins;
        long j;
        CurrencyInfo currencyInfo;
        String symbol;
        int coins2;
        long j2;
        CurrencyInfo currencyInfo2;
        String symbol2;
        C1805380x56 c1805380x56;
        boolean z;
        Drawable drawable;
        float f;
        C1805380x56 c1805380x562;
        Drawable drawable2;
        if (list.isEmpty()) {
            this.LLILLJJLI.LIZ((InterfaceC1806790x7N) C13LP.LJJJLZIJ(i, this.LLILZ), i);
        }
        int coins3 = 0;
        if (viewHolder instanceof C1807060x7o) {
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LLILZ);
            if ((objLJJJLZIJ instanceof C1805380x56) && (c1805380x56 = (C1805380x56) objLJJJLZIJ) != null) {
                C1807060x7o c1807060x7o = (C1807060x7o) viewHolder;
                c1807060x7o.getClass();
                if (!list.isEmpty()) {
                    if (!list.isEmpty()) {
                        Iterator<? extends Object> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (!(it2.next() instanceof C07UT)) {
                            }
                        }
                    }
                    boolean z2 = c1805380x56.LJFF;
                    View view = (View) c1807060x7o.LLILLL.getValue();
                    if (z2) {
                        drawable2 = (Drawable) c1807060x7o.LLIZ.getValue();
                    } else {
                        drawable2 = (Drawable) c1807060x7o.LLIZLLLIL.getValue();
                    }
                    view.setBackground(drawable2);
                    return;
                }
                ((TextView) c1807060x7o.LLILLJJLI.getValue()).setText(c1805380x56.LIZIZ);
                Drawable drawable3 = (Drawable) c1807060x7o.LLILZLL.getValue();
                if (drawable3 != null) {
                    if (C497740JfY.LJJ()) {
                        ((AppCompatTextView) c1807060x7o.LLILLJJLI.getValue()).setCompoundDrawables(null, null, drawable3, null);
                    } else {
                        ((AppCompatTextView) c1807060x7o.LLILLJJLI.getValue()).setCompoundDrawables(drawable3, null, null, null);
                    }
                }
                View view2 = (View) c1807060x7o.LLILZ.getValue();
                if (c1805380x56.LIZJ && c1805380x56.LIZLLL) {
                    z = true;
                } else {
                    z = false;
                }
                C500260Jjc.LJLJLJ(view2, z);
                View view3 = (View) c1807060x7o.LLILZIL.getValue();
                if (view3 != null) {
                    C500260Jjc.LLFFF(view3);
                }
                C500260Jjc.LJIILIIL(c1807060x7o.LLJI);
                TextView textView = (TextView) c1807060x7o.LLILZIL.getValue();
                if (textView != null) {
                    textView.setText(c1805380x56.LJ);
                }
                boolean z3 = c1805380x56.LJFF;
                View view4 = (View) c1807060x7o.LLILLL.getValue();
                if (z3) {
                    drawable = (Drawable) c1807060x7o.LLIZ.getValue();
                } else {
                    drawable = (Drawable) c1807060x7o.LLIZLLLIL.getValue();
                }
                view4.setBackground(drawable);
                boolean z4 = c1805380x56.LJIILIIL;
                ViewGroup viewGroup = (ViewGroup) c1807060x7o.LLILLL.getValue();
                if (z4) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                C786410Ut5.R4(f, viewGroup);
                c1807060x7o.itemView.setEnabled(z4);
                String str = c1805380x56.LJI;
                final boolean z5 = c1805380x56.LJFF;
                c1807060x7o.itemView.setContentDescription(str);
                q0.LJIJ(c1807060x7o.itemView, new C20094213jo() { // from class: X.0m54
                    @Override // X.C20094213jo
                    public final void onInitializeAccessibilityNodeInfo(View view5, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                        super.onInitializeAccessibilityNodeInfo(view5, accessibilityNodeInfoCompat);
                        accessibilityNodeInfoCompat.addAction(new C20092413jW(16, ""));
                        accessibilityNodeInfoCompat.setSelected(z5);
                    }
                });
                if (c1807060x7o.LL.isV3Phase2(0) && (c1805380x562 = c1805380x56.LJII) != null && c1805380x562.LJIIIIZZ == c1805380x56.LJIIIIZZ && c1805380x562.LJIIIZ != c1805380x56.LJIIIZ && Intrinsics.LJFF(c1805380x562.LJIIJ, c1805380x56.LJIIJ)) {
                    C500260Jjc.LLFFF(c1807060x7o.LLJI);
                    ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).runPriceAnim(c1807060x7o.LLJI, c1805380x56, c1805380x56.LJII, new AwS571S0100000_27(c1807060x7o, 1307));
                    return;
                }
                return;
            }
            return;
        }
        if (viewHolder instanceof C1805200x4o) {
            C1805200x4o c1805200x4o = (C1805200x4o) viewHolder;
            AbstractC1806300x6a abstractC1806300x6a = (AbstractC1806300x6a) ListProtector.get(this.LLILZ, i);
            c1805200x4o.LLILLJJLI.invoke();
            int i2 = abstractC1806300x6a.LIZ;
            String str2 = "";
            if (i2 != -2) {
                if (i2 != -1) {
                    C500260Jjc.LJIILIIL(c1805200x4o.itemView);
                    return;
                }
                BalanceStruct balanceStructG52 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().g52();
                if (balanceStructG52 == null || balanceStructG52.exchangeInfo == null || balanceStructG52.userBalance == null) {
                    return;
                }
                c1805200x4o.L5(abstractC1806300x6a);
                C786410Ut5.I7(new ACListenerS129S0200000_27(abstractC1806300x6a, c1805200x4o, 39), c1805200x4o.itemView);
                View view5 = c1805200x4o.itemView;
                BalanceStructExtra balanceStructExtra = balanceStructG52.exchangeInfo;
                if (balanceStructExtra != null) {
                    coins2 = (int) balanceStructExtra.getCoins();
                } else {
                    coins2 = 0;
                }
                Object[] objArr = new Object[3];
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                UserBalance userBalance = balanceStructG52.userBalance;
                if (userBalance != null) {
                    j2 = userBalance.balance;
                } else {
                    j2 = 0;
                }
                sbLIZ.append(j2);
                sbLIZ.append(' ');
                BalanceStructExtra balanceStructExtra2 = balanceStructG52.exchangeInfo;
                if (balanceStructExtra2 != null && (currencyInfo2 = balanceStructExtra2.getCurrencyInfo()) != null && (symbol2 = currencyInfo2.getSymbol()) != null) {
                    str2 = symbol2;
                }
                sbLIZ.append(str2);
                objArr[0] = C2188811AlT.LIZIZ(sbLIZ);
                objArr[1] = C1805200x4o.N5(-1);
                BalanceStructExtra balanceStructExtra3 = balanceStructG52.exchangeInfo;
                if (balanceStructExtra3 != null) {
                    coins3 = (int) balanceStructExtra3.getCoins();
                }
                objArr[2] = Integer.valueOf(coins3);
                view5.setContentDescription(C497740JfY.LJIIL(2131755789, coins2, objArr));
                return;
            }
            WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
            if (walletStructTF1 == null || walletStructTF1.LIZ == null) {
                return;
            }
            c1805200x4o.L5(abstractC1806300x6a);
            C786410Ut5.I7(new ACListenerS129S0200000_27(abstractC1806300x6a, c1805200x4o, 40), c1805200x4o.itemView);
            View view6 = c1805200x4o.itemView;
            BalanceStructExtra balanceStructExtra4 = walletStructTF1.LIZ;
            if (balanceStructExtra4 != null) {
                coins = (int) balanceStructExtra4.getCoins();
            } else {
                coins = 0;
            }
            Object[] objArr2 = new Object[3];
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            RevenueExchange revenueExchange = walletStructTF1.revenue;
            if (revenueExchange != null) {
                j = revenueExchange.balance;
            } else {
                j = 0;
            }
            sbLIZ2.append(j);
            sbLIZ2.append(' ');
            BalanceStructExtra balanceStructExtra5 = walletStructTF1.LIZ;
            if (balanceStructExtra5 != null && (currencyInfo = balanceStructExtra5.getCurrencyInfo()) != null && (symbol = currencyInfo.getSymbol()) != null) {
                str2 = symbol;
            }
            sbLIZ2.append(str2);
            objArr2[0] = C2188811AlT.LIZIZ(sbLIZ2);
            objArr2[1] = C1805200x4o.N5(-2);
            BalanceStructExtra balanceStructExtra6 = walletStructTF1.LIZ;
            if (balanceStructExtra6 != null) {
                coins3 = (int) balanceStructExtra6.getCoins();
            }
            objArr2[2] = Integer.valueOf(coins3);
            view6.setContentDescription(C497740JfY.LJIIL(2131755789, coins, objArr2));
            return;
        }
        if (viewHolder instanceof C1807070x7p) {
            C1807070x7p c1807070x7p = (C1807070x7p) viewHolder;
            AbstractC1806300x6a abstractC1806300x6a2 = (AbstractC1806300x6a) ListProtector.get(this.LLILZ, i);
            c1807070x7p.LLILLJJLI.invoke();
            c1807070x7p.LLILLL.setText(abstractC1806300x6a2.LIZIZ);
            c1807070x7p.LLILZ.setText(abstractC1806300x6a2.LIZJ);
            c1807070x7p.LLILLL.setEnabled(abstractC1806300x6a2.LIZLLL);
            c1807070x7p.LLILZ.setEnabled(abstractC1806300x6a2.LIZLLL);
            c1807070x7p.LLILZIL.setEnabled(abstractC1806300x6a2.LIZLLL);
            c1807070x7p.itemView.setContentDescription(abstractC1806300x6a2.LJ);
            C1591306Kx.LJII(c1807070x7p.itemView, Integer.valueOf(abstractC1806300x6a2.LJFF));
            C786410Ut5.I7(new ACListenerS129S0200000_27(abstractC1806300x6a2, c1807070x7p, 62), c1807070x7p.itemView);
            return;
        }
        if (viewHolder instanceof C1807190x81) {
            ((C1807190x81) viewHolder).I5((C1807200x82) ListProtector.get(this.LLILZ, i));
            return;
        }
        if (viewHolder instanceof C1807960x9G) {
            Object obj = ListProtector.get(this.LLILZ, i);
            if ((obj instanceof C1806040x6A) && (c1806040x6A = (C1806040x6A) obj) != null) {
                ((C1807960x9G) viewHolder).I5(c1806040x6A, list);
                return;
            }
            return;
        }
        if (viewHolder instanceof C1806070x6D) {
            ((C1806070x6D) viewHolder).I5((C1806030x69) ListProtector.get(this.LLILZ, i));
            return;
        }
        if (viewHolder instanceof C1807090x7r) {
            C1807090x7r c1807090x7r = (C1807090x7r) viewHolder;
            C1805610x5T c1805610x5T = (C1805610x5T) ListProtector.get(this.LLILZ, i);
            C12ES.LJIILL(4, c1807090x7r.LLILZIL);
            C12ES.LJIILL(0, c1807090x7r.LLILLJJLI);
            c1807090x7r.LLILLL.setText(c1805610x5T.LIZ.LIZIZ(c1807090x7r.itemView.getContext()));
            c1807090x7r.LLILZ.setText(c1805610x5T.LIZIZ);
            C786410Ut5.h8(c1807090x7r.LLILZ, new ACListenerS161S0100000_27(c1807090x7r, 221));
            return;
        }
        if (viewHolder instanceof C1807150x7x) {
            ((C1807150x7x) viewHolder).LL.setText(((C1005530cH1) ListProtector.get(this.LLILZ, i)).LIZ);
            return;
        }
        if (viewHolder instanceof C1807000x7i) {
            C1807000x7i c1807000x7i = (C1807000x7i) viewHolder;
            C1777900wMm c1777900wMm = (C1777900wMm) ListProtector.get(this.LLILZ, i);
            c1807000x7i.LLILLJJLI.setText(c1777900wMm.LIZ);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c1777900wMm.LIZIZ);
            sbLIZ3.append("  ");
            sbLIZ3.append(c1777900wMm.LIZJ);
            sbLIZ3.append("  ");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            SpannableString spannableString = new SpannableString(strLIZIZ);
            int iLJJJ = a0.LJJJ(strLIZIZ, c1777900wMm.LIZJ, 0, false, 6);
            int length = c1777900wMm.LIZJ.length() + iLJJJ;
            C786410Ut5.p2(spannableString, c1807000x7i.LLILZIL, iLJJJ, length, 33);
            C786410Ut5.p2(spannableString, c1807000x7i.LLILZLL, iLJJJ, length, 33);
            C786410Ut5.p2(spannableString, c1807000x7i.LLILZ, strLIZIZ.length() - 1, strLIZIZ.length(), 33);
            C786410Ut5.p2(spannableString, c1807000x7i.LLIZ, iLJJJ, strLIZIZ.length(), 33);
            c1807000x7i.LLILLL.setText(spannableString);
            return;
        }
        if (viewHolder instanceof C1807030x7l) {
            C1807030x7l c1807030x7l = (C1807030x7l) viewHolder;
            C1805590x5R c1805590x5R = (C1805590x5R) ListProtector.get(this.LLILZ, i);
            c1807030x7l.getClass();
            if (list.isEmpty()) {
                c1807030x7l.I5(c1805590x5R);
                return;
            }
            for (Object obj2 : list) {
                if (obj2 instanceof C07US) {
                    c1807030x7l.LLILLJJLI.setText(((C07US) obj2).LIZ);
                } else {
                    c1807030x7l.I5(c1805590x5R);
                    return;
                }
            }
            return;
        }
        if (viewHolder instanceof InterfaceC1807260x88) {
            Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i, this.LLILZ);
            if ((objLJJJLZIJ2 instanceof C1806650x79) && (c1806650x79 = (C1806650x79) objLJJJLZIJ2) != null) {
                Intrinsics.LJFF(c1806650x79.LIZ, "tiktok");
                new AwS606S0100000_27(this, 519);
                ((InterfaceC1807260x88) viewHolder).bind();
                return;
            }
            return;
        }
        if (viewHolder instanceof C1807050x7n) {
            C1807050x7n c1807050x7n = (C1807050x7n) viewHolder;
            ListProtector.get(this.LLILZ, i);
            C1806860x7U c1806860x7U = c1807050x7n.LLILLJJLI;
            if (c1806860x7U == null) {
                return;
            }
            ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(c1807050x7n.itemView.getContext());
            if (componentCallbacks2LIZ instanceof LifecycleOwner) {
                lifecycleOwner = (LifecycleOwner) componentCallbacks2LIZ;
            } else {
                lifecycleOwner = null;
            }
            C20744116Fj c20744116Fj = (C20744116Fj) c1807050x7n.itemView.findViewById(R.id.dgz);
            TextView textView2 = (TextView) c1807050x7n.itemView.findViewById(R.id.dh1);
            TextView textView3 = (TextView) c1807050x7n.itemView.findViewById(R.id.dh0);
            c1806860x7U.LJFF();
            if (lifecycleOwner != null) {
                c1806860x7U.LIZJ.removeObservers(lifecycleOwner);
                c1806860x7U.LIZJ.observe(lifecycleOwner, new AObserverS32S0500000_27(textView2, c1807050x7n, textView3, c20744116Fj, c1806860x7U, 1));
            }
            C786410Ut5.i8(c20744116Fj, new ACListenerS161S0100000_27(c1806860x7U, 172));
            return;
        }
        if (viewHolder instanceof C1807110x7t) {
            C1807110x7t c1807110x7t = (C1807110x7t) viewHolder;
            C1777890wMl c1777890wMl = (C1777890wMl) ListProtector.get(this.LLILZ, i);
            c1807110x7t.getClass();
            IapListResult.ActivityInfo activityInfo = c1777890wMl.LIZ;
            if (activityInfo != null && (list2 = activityInfo.activityList) != null) {
                Iterator<IapListResult.ActivityDetail> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.LJFF(next.activityId, "kyc_incentive_001")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                IapListResult.ActivityDetail activityDetail = next;
                if (activityDetail != null) {
                    AbstractC1805780x5k c1807280x8A = (AbstractC1805780x5k) ((LinkedHashMap) c1807110x7t.LLILLJJLI).get(activityDetail.activityId);
                    if (c1807280x8A == null) {
                        String str3 = activityDetail.activityId;
                        ViewGroup viewGroup2 = c1807110x7t.LL;
                        if (!Intrinsics.LJFF(str3, "kyc_incentive_001") || (c1807280x8A = new C1807280x8A(viewGroup2)) == null) {
                            C439101nJ.LJI(c1807110x7t.itemView);
                            return;
                        }
                    }
                    c1807110x7t.LLILLJJLI.put(activityDetail.activityId, c1807280x8A);
                    C12ES.LJIILL(0, c1807110x7t.itemView);
                    C786410Ut5.LJJJJI((ViewGroup) c1807110x7t.itemView);
                    ((ViewGroup) c1807110x7t.itemView).addView(c1807280x8A.itemView);
                    c1807280x8A.I5(activityDetail);
                    return;
                }
            }
            C439101nJ.LJI(c1807110x7t.itemView);
            return;
        }
        if (!(viewHolder instanceof InterfaceC1807270x89)) {
            return;
        }
        Object objLJJJLZIJ3 = C13LP.LJJJLZIJ(i, this.LLILZ);
        if ((objLJJJLZIJ3 instanceof C1806630x77) && (c1806630x77 = (C1806630x77) objLJJJLZIJ3) != null) {
            ((InterfaceC1807270x89) viewHolder).f5(Intrinsics.LJFF(c1806630x77.LIZ, "google_play"), new AwS165S0101000_27(this, i, 3));
        }
    }
}
