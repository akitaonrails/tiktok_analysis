package X;

import Y.ACListenerS161S0100000_27;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.WalletRechargeService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveOptimalRechargeListSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS165S0101000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1806990x7h extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final List<C1806600x74> LL;
    public final InterfaceC1806590x73 LLILLJJLI;
    public final RechargeViewModel LLILLL;
    public String LLILZ = "google_play";
    public Diamond LLILZIL = null;
    public final Drawable LLILZLL;
    public int LLIZ;

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((C1806600x74) ListProtector.get(this.LL, i)).LIZ;
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1805260x4u;
        WalletRechargeService walletRechargeService = (WalletRechargeService) PluggableExtentionKt.pluggableSpi$default(WalletRechargeService.class, false, false, false, 14, null);
        if (walletRechargeService != null) {
            walletRechargeService.LJIIJJI();
        }
        if (i != -2 && i != -1) {
            if (i != 3) {
                if (i != 4) {
                    switch (i) {
                        case 7:
                            c1805260x4u = new C1807140x7w(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hxb, viewGroup, false));
                            break;
                        case 8:
                            c1805260x4u = new C1807190x81(viewGroup, this.LLILLJJLI);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1805260x4u = new C1806070x6D(viewGroup, this.LLILLJJLI);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1805260x4u = new C1807960x9G(viewGroup, this.LLILLJJLI);
                            break;
                        default:
                            c1805260x4u = new C1807020x7k(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gpz, viewGroup, false));
                            break;
                    }
                } else {
                    c1805260x4u = new C1807010x7j(viewGroup);
                }
            } else {
                c1805260x4u = new AbstractC1805770x5j(viewGroup) { // from class: X.0x5a
                    public final ViewGroup LL;
                    public final Map<String, AbstractC1805780x5k> LLILLJJLI;

                    {
                        super(R.layout.gp6, viewGroup);
                        this.LL = viewGroup;
                        this.LLILLJJLI = new LinkedHashMap();
                    }

                    @Override // X.AbstractC1805770x5j
                    public final void I5(C1806990x7h c1806990x7h) {
                        IapListResult.ActivityInfo activityInfo;
                        List<IapListResult.ActivityDetail> list;
                        IapListResult.ActivityDetail next;
                        IapListResult.ListResultExtra listResultExtraLJII;
                        C1804840x4E c1804840x4E = c1806990x7h.LLILLL.LLIZ;
                        if (c1804840x4E != null && (listResultExtraLJII = c1804840x4E.LJII()) != null) {
                            activityInfo = listResultExtraLJII.activityInfo;
                        } else {
                            activityInfo = null;
                        }
                        if (activityInfo != null && (list = activityInfo.activityList) != null) {
                            Iterator<IapListResult.ActivityDetail> it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
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
                                AbstractC1805780x5k c1807280x8A = (AbstractC1805780x5k) ((LinkedHashMap) this.LLILLJJLI).get(activityDetail.activityId);
                                if (c1807280x8A == null) {
                                    String str = activityDetail.activityId;
                                    ViewGroup viewGroup2 = this.LL;
                                    if (!Intrinsics.LJFF(str, "kyc_incentive_001") || (c1807280x8A = new C1807280x8A(viewGroup2)) == null) {
                                        C439101nJ.LJI(this.itemView);
                                        return;
                                    }
                                }
                                this.LLILLJJLI.put(activityDetail.activityId, c1807280x8A);
                                C12ES.LJIILL(0, this.itemView);
                                C786410Ut5.LJJJJI((ViewGroup) this.itemView);
                                ((ViewGroup) this.itemView).addView(c1807280x8A.itemView);
                                c1807280x8A.I5(activityDetail);
                                return;
                            }
                        }
                        C439101nJ.LJI(this.itemView);
                    }
                };
            }
        } else {
            c1805260x4u = new C1805260x4u(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gqi, viewGroup, false));
        }
        try {
            View view = c1805260x4u.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1805260x4u.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1805260x4u.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1805260x4u.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1805260x4u.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1805260x4u.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1805260x4u.getClass().getName();
        return c1805260x4u;
    }

    public C1806990x7h(List list, InterfaceC1806590x73 interfaceC1806590x73, RechargeViewModel rechargeViewModel) {
        this.LL = list;
        this.LLILLJJLI = interfaceC1806590x73;
        this.LLILLL = rechargeViewModel;
        Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.el0);
        this.LLILZLL = drawableLJIIJ;
        this.LLIZ = -1;
        int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
        int i = 0;
        if (drawableLJIIJ != null) {
            drawableLJIIJ.setBounds(0, 0, iLIZIZ, iLIZIZ);
        }
        for (Object obj : (ArrayList) list) {
            int i2 = i + 1;
            if (i >= 0) {
                if (((C1806600x74) obj).LIZ != 0) {
                    i = i2;
                } else {
                    return;
                }
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i, List<? extends Object> list) {
        C1804170x39 value;
        C1806040x6A c1806040x6A;
        int coins;
        long j;
        CurrencyInfo currencyInfo;
        String symbol;
        int coins2;
        long j2;
        CurrencyInfo currencyInfo2;
        String symbol2;
        Object obj;
        final Diamond diamond;
        float f;
        int coins3 = 0;
        String str = null;
        if (viewHolder instanceof C1807020x7k) {
            C1806600x74 c1806600x74 = (C1806600x74) C13LP.LJJJLZIJ(i, this.LL);
            if (c1806600x74 != null) {
                obj = c1806600x74.LIZIZ;
            } else {
                obj = null;
            }
            if ((obj instanceof Diamond) && (diamond = (Diamond) obj) != null) {
                if (list.contains("RECHARGE_PAYLOAD_SELECT") && LiveOptimalRechargeListSetting.INSTANCE.getValue()) {
                    ((C1807020x7k) viewHolder).I5(i, this, diamond);
                    return;
                }
                C1807020x7k c1807020x7k = (C1807020x7k) viewHolder;
                Diamond diamond2 = this.LLILZIL;
                String str2 = this.LLILZ;
                TuxTextView tuxTextView = c1807020x7k.LLILLJJLI;
                if (tuxTextView != null) {
                    tuxTextView.setText(String.valueOf(diamond.count));
                }
                Drawable drawable = this.LLILZLL;
                if (drawable != null) {
                    if (C497740JfY.LJJ()) {
                        TuxTextView tuxTextView2 = c1807020x7k.LLILLJJLI;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setCompoundDrawables(null, null, drawable, null);
                        }
                    } else {
                        TuxTextView tuxTextView3 = c1807020x7k.LLILLJJLI;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setCompoundDrawables(drawable, null, null, null);
                        }
                    }
                }
                c1807020x7k.I5(i, this, diamond);
                String str3 = diamond.iapId;
                Diamond diamond3 = this.LLILLL.LLLLIIL;
                if (diamond3 != null) {
                    str = diamond3.iapId;
                }
                if (Intrinsics.LJFF(str3, str) && C1804050x2x.LIZ().LIZJ()) {
                    ImageView imageView = c1807020x7k.LLILZ;
                    if (imageView != null) {
                        C786410Ut5.LJZI(0, imageView);
                    }
                } else {
                    ImageView imageView2 = c1807020x7k.LLILZ;
                    if (imageView2 != null) {
                        C786410Ut5.LJZI(8, imageView2);
                    }
                }
                TextView textView = c1807020x7k.LLILZIL;
                if (textView != null) {
                    C500260Jjc.LLFFF(textView);
                }
                if (Intrinsics.LJFF(str2, "tiktok")) {
                    TextView textView2 = c1807020x7k.LLILZIL;
                    if (textView2 != null) {
                        textView2.setText(C1804850x4F.LJI(diamond));
                    }
                } else {
                    TextView textView3 = c1807020x7k.LLILZIL;
                    if (textView3 != null) {
                        textView3.setText(diamond.price);
                    }
                }
                c1807020x7k.itemView.setOnTouchListener(new ViewOnTouchListenerC789480Uy2());
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0x7q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1806990x7h c1806990x7h = this;
                        c1806990x7h.LLILLL.LLLIIIIL = true;
                        c1806990x7h.LLILLJJLI.LJIIJ(diamond);
                        if (LiveOptimalRechargeListSetting.INSTANCE.getValue()) {
                            this.notifyItemChanged(i, "RECHARGE_PAYLOAD_SELECT");
                            C1806990x7h c1806990x7h2 = this;
                            int i2 = c1806990x7h2.LLIZ;
                            if (i2 != -1) {
                                c1806990x7h2.notifyItemChanged(i2, "RECHARGE_PAYLOAD_SELECT");
                                return;
                            }
                            return;
                        }
                        this.notifyDataSetChanged();
                    }
                }, c1807020x7k.itemView);
                boolean zIR2 = this.LLILLL.iR2(C1804850x4F.LJFF(diamond));
                ViewGroup viewGroup = c1807020x7k.LLILLL;
                if (viewGroup != null) {
                    if (zIR2) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    C786410Ut5.R4(f, viewGroup);
                }
                c1807020x7k.itemView.setEnabled(zIR2);
                View view = c1807020x7k.LL;
                int i2 = diamond.count;
                view.setContentDescription(C497740JfY.LJIIL(2131755791, i2, Integer.valueOf(i2), diamond.price));
                q0.LJIJ(c1807020x7k.LL, new C20094213jo() { // from class: X.0x8K
                    @Override // X.C20094213jo
                    public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                        String str4;
                        super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                        accessibilityNodeInfoCompat.addAction(new C20092413jW(16, ""));
                        String str5 = diamond.iapId;
                        Diamond value2 = this.LLILLL.LLLLIILL.getValue();
                        if (value2 != null) {
                            str4 = value2.iapId;
                        } else {
                            str4 = null;
                        }
                        accessibilityNodeInfoCompat.setSelected(Intrinsics.LJFF(str5, str4));
                    }
                });
                if (!((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isV3Phase2(0)) {
                    return;
                }
                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).inflateAnimPriceLayout(c1807020x7k.LLILZLL, diamond, diamond2, Intrinsics.LJFF(str2, "google_play"), AFwS269S0000000_27.get$arr$(498), new AwS571S0100000_27(c1807020x7k, 1397));
                return;
            }
            return;
        }
        if (viewHolder instanceof C1805260x4u) {
            C1805260x4u c1805260x4u = (C1805260x4u) viewHolder;
            C1806990x7h c1806990x7h = c1805260x4u.LLILZIL;
            c1806990x7h.LLILLL.LLLJL = true;
            int itemViewType = c1806990x7h.getItemViewType(i);
            String str4 = "";
            if (itemViewType != -2) {
                if (itemViewType != -1) {
                    C500260Jjc.LJIILIIL(c1805260x4u.itemView);
                    return;
                }
                BalanceStruct balanceStructG52 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().g52();
                if (balanceStructG52 == null || balanceStructG52.exchangeInfo == null) {
                    return;
                }
                C1806990x7h c1806990x7h2 = c1805260x4u.LLILZIL;
                if (balanceStructG52.userBalance == null) {
                    return;
                }
                c1805260x4u.I5(-1);
                C786410Ut5.I7(new ACListenerS161S0100000_27(c1806990x7h2, 205), c1805260x4u.itemView);
                View view2 = c1805260x4u.itemView;
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
                    str4 = symbol2;
                }
                sbLIZ.append(str4);
                objArr[0] = C2188811AlT.LIZIZ(sbLIZ);
                objArr[1] = C1151100g3o.LIZIZ(-1);
                BalanceStructExtra balanceStructExtra3 = balanceStructG52.exchangeInfo;
                if (balanceStructExtra3 != null) {
                    coins3 = (int) balanceStructExtra3.getCoins();
                }
                objArr[2] = Integer.valueOf(coins3);
                view2.setContentDescription(C497740JfY.LJIIL(2131755789, coins2, objArr));
                return;
            }
            WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
            if (walletStructTF1 == null || walletStructTF1.LIZ == null) {
                return;
            }
            C1806990x7h c1806990x7h3 = c1805260x4u.LLILZIL;
            c1805260x4u.I5(-2);
            C786410Ut5.I7(new ACListenerS161S0100000_27(c1806990x7h3, 206), c1805260x4u.itemView);
            View view3 = c1805260x4u.itemView;
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
                str4 = symbol;
            }
            sbLIZ2.append(str4);
            objArr2[0] = C2188811AlT.LIZIZ(sbLIZ2);
            objArr2[1] = C1151100g3o.LIZIZ(-2);
            BalanceStructExtra balanceStructExtra6 = walletStructTF1.LIZ;
            if (balanceStructExtra6 != null) {
                coins3 = (int) balanceStructExtra6.getCoins();
            }
            objArr2[2] = Integer.valueOf(coins3);
            view3.setContentDescription(C497740JfY.LJIIL(2131755789, coins, objArr2));
            return;
        }
        if (viewHolder instanceof C1807190x81) {
            ((C1807190x81) viewHolder).I5((C1807200x82) ((C1806600x74) ListProtector.get(this.LL, i)).LIZIZ);
            return;
        }
        if (viewHolder instanceof C1807960x9G) {
            Object obj2 = ((C1806600x74) ListProtector.get(this.LL, i)).LIZIZ;
            if ((obj2 instanceof C1806040x6A) && (c1806040x6A = (C1806040x6A) obj2) != null) {
                ((C1807960x9G) viewHolder).I5(c1806040x6A, list);
                return;
            }
            return;
        }
        if (viewHolder instanceof C1806070x6D) {
            ((C1806070x6D) viewHolder).I5((C1806030x69) ((C1806600x74) ListProtector.get(this.LL, i)).LIZIZ);
            return;
        }
        if (viewHolder instanceof AbstractC1805770x5j) {
            Object obj3 = ((C1806600x74) ListProtector.get(this.LL, i)).LIZIZ;
            if ((obj3 instanceof Diamond) && obj3 != null) {
                ((AbstractC1805770x5j) viewHolder).I5(this);
                return;
            }
            return;
        }
        if (viewHolder instanceof InterfaceC1807260x88) {
            Intrinsics.LJFF(this.LLILZ, "tiktok");
            new AwS606S0100000_27(this, 658);
            ((InterfaceC1807260x88) viewHolder).bind();
        } else {
            if (!(viewHolder instanceof InterfaceC1807270x89)) {
                return;
            }
            InterfaceC1807270x89 interfaceC1807270x89 = (InterfaceC1807270x89) viewHolder;
            LiveData<C1804170x39> liveDataZQ0 = this.LLILLL.ZQ0();
            if (liveDataZQ0 != null && (value = liveDataZQ0.getValue()) != null) {
                str = value.LIZJ;
            }
            interfaceC1807270x89.f5(Intrinsics.LJFF(str, "google_play"), new AwS165S0101000_27(this, i, 4));
        }
    }
}
