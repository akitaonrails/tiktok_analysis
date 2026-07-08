package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.LabelIcon;
import com.zhiliaoapp.musically.R;
import g1c.AjS3S0301000_26;
import g1c.AjS40S0200000_1;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS79S0301000_26;
import kotlin.reflect.KTypeProjection;
import t2b.c;

/* JADX INFO: renamed from: X.0vhf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752410vhf extends AbstractC21673619ry<C1752420vhg> {
    public final ECBaseFragment LL;
    public final c LLILLJJLI;
    public final PdpViewModel LLILLL;
    public List<Feed> LLILZ = new ArrayList();
    public String LLILZIL = "";

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<PromotionLabel> list;
        PromotionLabel promotionLabel;
        boolean z;
        Image image;
        String str;
        Price price;
        String str2;
        PromotionLabel promotionLabel2;
        String str3;
        String str4;
        Map map;
        Type type;
        boolean z2;
        int i2;
        int i3;
        LabelIcon labelIcon;
        int i4;
        int i5;
        String str5;
        int iLIZ;
        LabelIcon labelIcon2;
        List<PromotionLabel> list2;
        Price price2;
        List<Image> list3;
        C1752420vhg c1752420vhg = (C1752420vhg) viewHolder;
        List<Feed> list4 = this.LLILZ;
        Image image2 = null;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            z = false;
        } else {
            Iterator<Feed> it2 = list4.iterator();
            while (it2.hasNext()) {
                FeedProduct feedProduct = it2.next().product;
                if (feedProduct != null && (list = feedProduct.promotionLabels) != null && (promotionLabel = (PromotionLabel) C13LP.LJJJLZIJ(0, list)) != null && C212258184q.LIZLLL(promotionLabel) && (promotionLabel.icon != null || promotionLabel.text != null)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (getItemCount() >= 1) {
            Feed feed = (Feed) ListProtector.get(this.LLILZ, i % getItemCount());
            if (feed != null) {
                c1752420vhg.getClass();
                FeedProduct feedProduct2 = feed.product;
                if (feedProduct2 != null && (list3 = feedProduct2.images) != null) {
                    image = (Image) C13LP.LJJJLZIJ(0, list3);
                } else {
                    image = null;
                }
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LJ = C1326790kdB.LJ(image);
                EnumC1338240kve enumC1338240kve = EnumC1338240kve.FIT_CENTER;
                c1331670kl3LJ.LJJ = enumC1338240kve;
                EnumC1338240kve enumC1338240kve2 = EnumC1338240kve.CENTER;
                c1331670kl3LJ.LJIILIIL = R.drawable.b5l;
                c1331670kl3LJ.LJIILLIIL = enumC1338240kve2;
                c1331670kl3LJ.LIZLLL("ShopRecommendProductVH");
                c cVar = c1752420vhg.LLILLJJLI;
                c1752420vhg.itemView.getContext();
                c1331670kl3LJ.LJJI = cVar.LJLLLL();
                c1331670kl3LJ.LJJ((InterfaceC1334290kpH) c1752420vhg.itemView.findViewById(R.id.rxu));
                C786410Ut5.h3(c1331670kl3LJ);
                C1744700vVE.LJII(c1752420vhg.itemView.findViewById(R.id.rxu), c1752420vhg.LLILLJJLI.LLJJI(), c1752420vhg.LLILLJJLI.LLJJI());
                FeedProduct feedProduct3 = feed.product;
                if (feedProduct3 != null && (price2 = feedProduct3.price) != null) {
                    str = price2.pricePrefix;
                } else {
                    str = null;
                }
                String str6 = "";
                if (str != null && feedProduct3.price.pricePrefix.length() > 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(feed.product.price.pricePrefix);
                    sbLIZ.append(' ');
                    spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
                    C786410Ut5.q2(spannableStringBuilder, new C444920HcY(81, false), 0, feed.product.price.pricePrefix.length(), 33);
                    String str7 = feed.product.price.minPrice;
                    if (str7 != null) {
                        str6 = str7;
                    }
                    spannableStringBuilder.append((CharSequence) str6);
                    ((TextView) c1752420vhg.itemView.findViewById(R.id.rza)).setText(spannableStringBuilder);
                } else {
                    TextView textView = (TextView) c1752420vhg.itemView.findViewById(R.id.rza);
                    FeedProduct feedProduct4 = feed.product;
                    if (feedProduct4 != null && (price = feedProduct4.price) != null && (str2 = price.minPrice) != null) {
                        str6 = str2;
                    }
                    textView.setText(str6);
                }
                FeedProduct feedProduct5 = feed.product;
                if (feedProduct5 != null && (list2 = feedProduct5.promotionLabels) != null) {
                    promotionLabel2 = (PromotionLabel) C13LP.LJJJLZIJ(0, list2);
                } else {
                    promotionLabel2 = null;
                }
                View view = c1752420vhg.itemView;
                View viewFindViewById = view.findViewById(R.id.rwz);
                if (viewFindViewById != null) {
                    if (promotionLabel2 != null && C212258184q.LIZLLL(promotionLabel2) && (promotionLabel2.icon != null || promotionLabel2.text != null)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i2, viewFindViewById);
                    if (viewFindViewById.getVisibility() == 0) {
                        View viewFindViewById2 = view.findViewById(R.id.rwy);
                        if (promotionLabel2 != null && promotionLabel2.icon != null) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        C786410Ut5.LJLLLLLL(i3, viewFindViewById2);
                        if (C1744700vVE.LJ(view.getContext(), null)) {
                            if (promotionLabel2 != null && (labelIcon2 = promotionLabel2.icon) != null) {
                                image2 = labelIcon2.darkIcon;
                            }
                        } else if (promotionLabel2 != null && (labelIcon = promotionLabel2.icon) != null) {
                            image2 = labelIcon.lightIcon;
                        }
                        View viewFindViewById3 = view.findViewById(R.id.rwy);
                        if (promotionLabel2 != null && promotionLabel2.icon != null) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        C786410Ut5.LJLLLLLL(i4, viewFindViewById3);
                        if (image2 != null) {
                            Integer width = image2.getWidth();
                            int iIntValue = 18;
                            if (width != null) {
                                iLIZ = C679280Qkg.LIZ(width.intValue());
                            } else {
                                iLIZ = C679280Qkg.LIZ(18);
                            }
                            Integer height = image2.getHeight();
                            if (height != null) {
                                iIntValue = height.intValue();
                            }
                            int iLIZ2 = C679280Qkg.LIZ(iIntValue);
                            ViewGroup.LayoutParams layoutParams = view.findViewById(R.id.rwy).getLayoutParams();
                            layoutParams.width = (layoutParams.height * iLIZ) / iLIZ2;
                            C786410Ut5.G6((SmartImageView) view.findViewById(R.id.rwy), layoutParams);
                            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image2.toImageUrlModel());
                            c1331670kl3LIZLLL.LJJ((InterfaceC1334290kpH) view.findViewById(R.id.rwy));
                            c1331670kl3LIZLLL.LJIIIIZZ = iLIZ;
                            c1331670kl3LIZLLL.LJIIIZ = iLIZ2;
                            c1331670kl3LIZLLL.LJJ = enumC1338240kve;
                            C786410Ut5.h3(c1331670kl3LIZLLL);
                        }
                        C786410Ut5.I7(new AjS40S0200000_1(promotionLabel2, view, 84), view.findViewById(R.id.rwy));
                        View viewFindViewById4 = view.findViewById(R.id.rx1);
                        if (promotionLabel2 != null && promotionLabel2.text != null) {
                            i5 = 0;
                        } else {
                            i5 = 8;
                        }
                        C786410Ut5.LJLLLLLL(i5, viewFindViewById4);
                        if (promotionLabel2 != null && (str5 = promotionLabel2.text) != null) {
                            ((TextView) view.findViewById(R.id.rx1)).setText(str5);
                            ((TextView) view.findViewById(R.id.rx1)).setPaintFlags(8);
                            C786410Ut5.I7(new AjS40S0200000_1(promotionLabel2, view, 85), view.findViewById(R.id.rx1));
                        }
                    } else if (z) {
                        C786410Ut5.LJLLLLLL(0, view.findViewById(R.id.rx0));
                    }
                }
                FeedProduct feedProduct6 = feed.product;
                if (feedProduct6 != null) {
                    str3 = feedProduct6.id;
                    str4 = feedProduct6.logExtra;
                } else {
                    str3 = null;
                    str4 = null;
                }
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        C13JX c13jx = KTypeProjection.LIZJ;
                        C13JW c13jwLJII = C13LE.LJII(String.class);
                        c13jx.getClass();
                        type = C2371409Qy.LIZJ(C13LE.LJIIIZ(Map.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJ(Object.class))));
                    } else {
                        type = new TypeToken<Map<String, ? extends Object>>() { // from class: X.00WX
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str4, type);
                    if (!(objFromJson instanceof Map)) {
                        objFromJson = null;
                    }
                    map = (Map) objFromJson;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    map = null;
                }
                C786410Ut5.I7(new AjS3S0301000_26(c1752420vhg, feed, map, i, 1), c1752420vhg.itemView.findViewById(R.id.rxu));
                if (str3 != null && !((ArrayList) c1752420vhg.LLILLL.LLZIL).contains(str3)) {
                    ((ArrayList) c1752420vhg.LLILLL.LLZIL).add(str3);
                    if (c1752420vhg.LLILLL.LLJLILLLLZIIL != null) {
                        C1054004Ag.LJJJJZ(new AwS79S0301000_26(i, feed, c1752420vhg, map, 1), false);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1752420vhg c1752420vhg = new C1752420vhg(viewGroup, this.LLILLL, this.LLILZIL, this.LL, this.LLILLJJLI);
        try {
            View view = c1752420vhg.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1752420vhg.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1752420vhg.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1752420vhg.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1752420vhg.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1752420vhg.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1752420vhg.class.getName();
        return c1752420vhg;
    }

    public C1752410vhf(PdpViewModel pdpViewModel, ECBaseFragment eCBaseFragment, c cVar) {
        this.LL = eCBaseFragment;
        this.LLILLJJLI = cVar;
        this.LLILLL = pdpViewModel;
    }
}
