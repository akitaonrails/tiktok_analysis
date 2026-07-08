package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.FreeTrialInfo;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetail;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TagInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514660KGi extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public boolean LL;
    public boolean LLILLJJLI;
    public C0KHR LLILLL;
    public List<SubscriptionProductDetailWithTemplateInfo> LLILZ;
    public ISubPackagePageAbility LLILZIL;
    public C513700KCq LLILZLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<SubscriptionProductDetailWithTemplateInfo> list = this.LLILZ;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void LLLFZ(C0KHR c0khr) {
        ViewGroup viewGroup;
        C0KHR c0khr2 = this.LLILLL;
        if (c0khr2 != null && (viewGroup = c0khr2.LL) != null) {
            viewGroup.setBackground(viewGroup.getContext().getDrawable(R.drawable.fbt));
        }
        ViewGroup viewGroup2 = c0khr.LL;
        viewGroup2.setBackground(viewGroup2.getContext().getDrawable(R.drawable.fc2));
        this.LLILLL = c0khr;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int i) {
        final SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo;
        String str;
        boolean z;
        String strLJIIL;
        int i2;
        String str2;
        String str3;
        List<SubscriptionProductDetail.PricePhase> list;
        SubscriptionProductDetail.PricePhase pricePhase;
        String str4;
        OfferInfo offerInfo;
        List<SubscriptionProductDetail.PricePhase> list2;
        SubscriptionProductDetail.PricePhase pricePhase2;
        TagInfo tagInfo;
        String str5;
        TagInfo tagInfo2;
        String str6;
        String str7;
        int i3;
        OfferInfo offerInfo2;
        FreeTrialInfo freeTrialInfo;
        List<SubscriptionProductDetailWithTemplateInfo> list3 = this.LLILZ;
        if (list3 != null && (subscriptionProductDetailWithTemplateInfo = (SubscriptionProductDetailWithTemplateInfo) C13LP.LJJJLZIJ(i, list3)) != null && (viewHolder instanceof C0KHR)) {
            C0KHR c0khr = (C0KHR) viewHolder;
            C16F5 c16f5 = c0khr.LLILLL;
            TemplateInfo templateInfo = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
            if (templateInfo == null || (str = templateInfo.tplName) == null) {
                str = "";
            }
            c16f5.setText(str);
            C16F5 c16f52 = c0khr.LLILZ;
            TemplateInfo templateInfo2 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
            if (templateInfo2 != null && templateInfo2.tplType == 1) {
                z = true;
            } else {
                z = false;
            }
            String str8 = null;
            if (z) {
                strLJIIL = C497740JfY.LJIJI(2131830325);
            } else if (C513940KDo.LJIIL(subscriptionProductDetailWithTemplateInfo)) {
                strLJIIL = C497740JfY.LJIJJ(2131830327, C513940KDo.LJIIIIZZ(subscriptionProductDetailWithTemplateInfo));
            } else if (C513940KDo.LJIILJJIL(subscriptionProductDetailWithTemplateInfo.getTemplateInfo()) && !C513940KDo.LJIIJJI(subscriptionProductDetailWithTemplateInfo)) {
                if (C513940KDo.LJIILIIL(subscriptionProductDetailWithTemplateInfo)) {
                    SubscriptionProductDetail subscriptionProductDetail = subscriptionProductDetailWithTemplateInfo.getSubscriptionProductDetail();
                    if (subscriptionProductDetail != null && (str3 = subscriptionProductDetail.offerId) != null && str3.length() > 0 && (list = subscriptionProductDetail.pricePhaseList) != null && (pricePhase = (SubscriptionProductDetail.PricePhase) C13LP.LJJJLL(list)) != null) {
                        str2 = pricePhase.price;
                    } else {
                        str2 = null;
                    }
                    strLJIIL = C497740JfY.LJIJJ(2131830323, str2, C513940KDo.LJIIIIZZ(subscriptionProductDetailWithTemplateInfo));
                } else {
                    strLJIIL = C497740JfY.LJIJI(2131830324);
                }
            } else if (C513940KDo.LJIIJJI(subscriptionProductDetailWithTemplateInfo)) {
                String strLJFF = C513940KDo.LJFF(subscriptionProductDetailWithTemplateInfo, true);
                TemplateInfo templateInfo3 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo3 != null) {
                    i2 = templateInfo3.renewalPeriod;
                } else {
                    i2 = 1;
                }
                strLJIIL = C497740JfY.LJIIL(2131755213, i2, strLJFF, Integer.valueOf(i2));
            } else {
                strLJIIL = null;
            }
            c16f52.setText(strLJIIL);
            boolean zLJIIJJI = C513940KDo.LJIIJJI(subscriptionProductDetailWithTemplateInfo);
            boolean zLJIILIIL = C513940KDo.LJIILIIL(subscriptionProductDetailWithTemplateInfo);
            boolean zLJIIL = C513940KDo.LJIIL(subscriptionProductDetailWithTemplateInfo);
            if (zLJIIL) {
                C16F5 c16f53 = c0khr.LLILZIL;
                TemplateInfo templateInfo4 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo4 != null && (offerInfo2 = templateInfo4.offerInfo) != null && (freeTrialInfo = offerInfo2.freeTrialInfo) != null) {
                    i3 = (int) freeTrialInfo.durationValue;
                } else {
                    i3 = 7;
                }
                c16f53.setText(C497740JfY.LJIIL(2131755212, i3, Integer.valueOf(i3)));
            } else {
                C16F5 c16f54 = c0khr.LLILZIL;
                SubscriptionProductDetail subscriptionProductDetail2 = subscriptionProductDetailWithTemplateInfo.getSubscriptionProductDetail();
                if (subscriptionProductDetail2 == null || (list2 = subscriptionProductDetail2.pricePhaseList) == null || (pricePhase2 = (SubscriptionProductDetail.PricePhase) C13LP.LJJJLZIJ(0, list2)) == null || (str4 = pricePhase2.price) == null) {
                    TemplateInfo templateInfo5 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    if (templateInfo5 != null && (offerInfo = templateInfo5.offerInfo) != null) {
                        str4 = offerInfo.discountMoneyDisplay;
                    } else {
                        TemplateInfo templateInfo6 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                        if (templateInfo6 != null) {
                            str4 = templateInfo6.moneyDisplay;
                        } else {
                            str4 = null;
                        }
                    }
                }
                c16f54.setText(str4);
                C500260Jjc.LLFFF(c16f54);
            }
            if (!zLJIILIIL && !zLJIIJJI && !zLJIIL) {
                C500260Jjc.LJIILIIL(c0khr.LLILZLL);
                C500260Jjc.LJIILIIL(c0khr.LLIZ);
            } else {
                TemplateInfo templateInfo7 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo7 != null && (tagInfo2 = templateInfo7.tagInfo) != null && (str6 = tagInfo2.promotionTitle) != null) {
                    if (C500260Jjc.LJJIIZ(str6)) {
                        c0khr.LLILZLL.setText(str6);
                        C500260Jjc.LLFFF(c0khr.LLILZLL);
                    } else {
                        C500260Jjc.LJIILIIL(c0khr.LLILZLL);
                    }
                }
                TemplateInfo templateInfo8 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo8 != null && (tagInfo = templateInfo8.tagInfo) != null && (str5 = tagInfo.promotionDesc) != null) {
                    if (C500260Jjc.LJJIIZ(str5)) {
                        c0khr.LLIZ.setText(str5);
                        if (zLJIIL) {
                            C500260Jjc.LJIILIIL(c0khr.LLIZ);
                        } else {
                            C500260Jjc.LLFFF(c0khr.LLIZ);
                        }
                    } else {
                        C500260Jjc.LJIILIIL(c0khr.LLIZ);
                    }
                }
            }
            ISubPackagePageAbility iSubPackagePageAbility = this.LLILZIL;
            if (iSubPackagePageAbility != null) {
                SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfoE7 = iSubPackagePageAbility.e7();
                if (this.LLILLJJLI) {
                    if (i == 0) {
                        this.LLILLJJLI = false;
                        ISubPackagePageAbility iSubPackagePageAbility2 = this.LLILZIL;
                        if (iSubPackagePageAbility2 != null) {
                            iSubPackagePageAbility2.WA(subscriptionProductDetailWithTemplateInfo);
                        }
                        LLLFZ(c0khr);
                    }
                } else if (subscriptionProductDetailWithTemplateInfoE7 != null) {
                    TemplateInfo templateInfo9 = subscriptionProductDetailWithTemplateInfoE7.getTemplateInfo();
                    if (templateInfo9 != null) {
                        str7 = templateInfo9.basePlanId;
                    } else {
                        str7 = null;
                    }
                    TemplateInfo templateInfo10 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    if (templateInfo10 != null) {
                        str8 = templateInfo10.basePlanId;
                    }
                    if (Intrinsics.LJFF(str7, str8)) {
                        LLLFZ(c0khr);
                    }
                } else if (this.LL) {
                    TemplateInfo templateInfo11 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    if (templateInfo11 != null && templateInfo11.tplType == 2) {
                        ISubPackagePageAbility iSubPackagePageAbility3 = this.LLILZIL;
                        if (iSubPackagePageAbility3 != null) {
                            iSubPackagePageAbility3.WA(subscriptionProductDetailWithTemplateInfo);
                        }
                        LLLFZ(c0khr);
                    }
                } else if (i == 0) {
                    ISubPackagePageAbility iSubPackagePageAbility4 = this.LLILZIL;
                    if (iSubPackagePageAbility4 != null) {
                        iSubPackagePageAbility4.WA(subscriptionProductDetailWithTemplateInfo);
                    }
                    LLLFZ(c0khr);
                }
            }
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0KGk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OfferInfo offerInfo3;
                    Map<String, String> map;
                    C513700KCq c513700KCqKu;
                    C513700KCq c513700KCqKu2;
                    ISubPackagePageAbility iSubPackagePageAbility5 = this.LL.LLILZIL;
                    if (iSubPackagePageAbility5 != null && C513940KDo.LJIIJ(iSubPackagePageAbility5.hd())) {
                        return;
                    }
                    TemplateInfo templateInfo12 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    Map<String, String> map2 = null;
                    if (templateInfo12 != null) {
                        offerInfo3 = templateInfo12.offerInfo;
                    } else {
                        offerInfo3 = null;
                    }
                    C513970KDr.LIZ(offerInfo3);
                    C514660KGi c514660KGi = this.LL;
                    if (c514660KGi.LLILZLL == null) {
                        ISubPackagePageAbility iSubPackagePageAbility6 = c514660KGi.LLILZIL;
                        if (iSubPackagePageAbility6 != null) {
                            c513700KCqKu2 = iSubPackagePageAbility6.Ku();
                        } else {
                            c513700KCqKu2 = null;
                        }
                        c514660KGi.LLILZLL = c513700KCqKu2;
                    }
                    C513700KCq c513700KCq = c514660KGi.LLILZLL;
                    if (c513700KCq != null) {
                        map = c513700KCq.LLILZIL;
                    } else {
                        map = null;
                    }
                    C0KDR.LIZLLL(map, subscriptionProductDetailWithTemplateInfo.getTemplateInfo());
                    C514660KGi c514660KGi2 = this.LL;
                    if (c514660KGi2.LLILZLL == null) {
                        ISubPackagePageAbility iSubPackagePageAbility7 = c514660KGi2.LLILZIL;
                        if (iSubPackagePageAbility7 != null) {
                            c513700KCqKu = iSubPackagePageAbility7.Ku();
                        } else {
                            c513700KCqKu = null;
                        }
                        c514660KGi2.LLILZLL = c513700KCqKu;
                    }
                    C513700KCq c513700KCq2 = c514660KGi2.LLILZLL;
                    if (c513700KCq2 != null) {
                        map2 = c513700KCq2.LLILZIL;
                    }
                    C0KDR.LIZJ(map2, subscriptionProductDetailWithTemplateInfo.getTemplateInfo());
                    this.LL.LLLFZ((C0KHR) viewHolder);
                    ISubPackagePageAbility iSubPackagePageAbility8 = this.LL.LLILZIL;
                    if (iSubPackagePageAbility8 != null) {
                        iSubPackagePageAbility8.WA(subscriptionProductDetailWithTemplateInfo);
                    }
                }
            }, viewHolder.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0KHR c0khr = new C0KHR(C500260Jjc.LJIILL(R.layout.hnx, viewGroup, false));
        try {
            View view = c0khr.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0khr.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0khr.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0KHR.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0khr.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0khr.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0KHR.class.getName();
        return c0khr;
    }
}
