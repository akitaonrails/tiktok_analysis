package X;

import Y.ACListenerS43S0201000_10;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommonImage;
import com.ss.android.ugc.aweme.feed.model.commercialize.ProductCard;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Qqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682980Qqe extends AbstractC21673619ry<C683000Qqg> {
    public final InterfaceC683010Qqh LL;
    public final int LLILLJJLI = C445120Hcs.LIZ(6);
    public final int LLILLL = C445120Hcs.LIZ(8);
    public final int LLILZ;
    public final float LLILZIL;
    public final int LLILZLL;
    public Integer LLIZ;
    public Integer LLIZLLLIL;
    public Integer LLJ;
    public Integer LLJI;
    public List<ProductCard> LLJIJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJIJIL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        this.LL.l(viewHolder.getAbsoluteAdapterPosition());
    }

    public C682980Qqe(Context context, InterfaceC683010Qqh interfaceC683010Qqh) {
        this.LL = interfaceC683010Qqh;
        int iLIZ = C445120Hcs.LIZ(16);
        this.LLILZ = iLIZ;
        this.LLILZIL = C445120Hcs.LIZ(8);
        this.LLILZLL = C12ES.LJIIJ(context) - (iLIZ * 2);
        this.LLJIJIL = C13BV.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.ss.android.ugc.aweme.base.model.UrlModel] */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int iIntValue;
        int iIntValue2;
        Integer num;
        List<String> list;
        List<String> list2;
        C1331070kk5 hierarchy;
        C1331070kk5 hierarchy2;
        Context context;
        int i2;
        Integer num2;
        Integer num3;
        C683000Qqg c683000Qqg = (C683000Qqg) viewHolder;
        ProductCard productCard = (ProductCard) ListProtector.get(this.LLJIJIL, i);
        View view = c683000Qqg.itemView;
        CommonImage commonImage = productCard.commonImage;
        if (commonImage != null && (num3 = commonImage.width) != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = 0;
        }
        CommonImage commonImage2 = productCard.commonImage;
        if (commonImage2 != null && (num2 = commonImage2.height) != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (iIntValue2 > 0 && iIntValue > 0) {
            int itemCount = getItemCount();
            if (itemCount < 4) {
                i2 = (this.LLILZLL - ((itemCount - 1) * this.LLILLL)) / itemCount;
            } else {
                i2 = (this.LLILZLL - (this.LLILLJJLI * 2)) / 3;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i2;
            layoutParams.height = (iIntValue2 * i2) / iIntValue;
            C786410Ut5.W5(view, layoutParams);
        }
        View view2 = c683000Qqg.itemView;
        if (view2 != null && (context = view2.getContext()) != null && C960203pA.LIZIZ(context)) {
            num = this.LLIZLLLIL;
        } else {
            num = this.LLIZ;
        }
        ProductCard productCard2 = (ProductCard) ListProtector.get(this.LLJIJIL, i);
        Integer num4 = this.LLJ;
        Integer num5 = this.LLJI;
        float f = this.LLILZIL;
        String str = productCard2.text;
        if (c683000Qqg.LL != null && str != null && str.length() != 0) {
            if (num4 != null) {
                c683000Qqg.LL.setTextColor(num4.intValue());
            }
            if (num5 != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(num5.intValue());
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
                c683000Qqg.LL.setBackground(gradientDrawable);
            }
            c683000Qqg.LL.setText(str);
            C786410Ut5.LLLLZLL(c683000Qqg.LL, 0);
        } else {
            TuxTextView tuxTextView = c683000Qqg.LL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        }
        CommonImage commonImage3 = productCard2.commonImage;
        if (commonImage3 != null && (list2 = commonImage3.urlList) != null && !list2.isEmpty()) {
            UrlModel urlModel = new UrlModel();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list2);
            urlModel.setUrlList(arrayList);
            C1320700kTM<InterfaceC1330440kj4> c1320700kTM = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0H0i
                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LIZLLL(String str2, Throwable th) {
                }

                @Override // X.C1320700kTM
                public final void LJII(String str2, C1325710kbR c1325710kbR, Throwable th) {
                }

                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final /* bridge */ /* synthetic */ void LJ(String str2, Object obj, Animatable animatable) {
                }

                @Override // X.C1320700kTM
                public final /* bridge */ /* synthetic */ void LJIIIIZZ(String str2, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable, C1325710kbR c1325710kbR, Map map) {
                }
            };
            if (num != null) {
                C1322110kVd c1322110kVd = c683000Qqg.LLILLJJLI;
                if (c1322110kVd != null && (hierarchy2 = c1322110kVd.getHierarchy()) != null) {
                    hierarchy2.LJIJ(new ColorDrawable(num.intValue()), 1);
                }
            } else {
                C1322110kVd c1322110kVd2 = c683000Qqg.LLILLJJLI;
                if (c1322110kVd2 != null && (hierarchy = c1322110kVd2.getHierarchy()) != null) {
                    hierarchy.LJJ(R.attr.a03);
                }
            }
            C1322410kW7.LIZ(c683000Qqg.LLILLJJLI, urlModel, c1320700kTM);
        }
        final View view3 = c683000Qqg.itemView;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS43S0201000_10(i, this, productCard, 0), view3);
            final C259800zU c259800zU = new C259800zU();
            CommonImage commonImage4 = productCard.commonImage;
            if (commonImage4 != null && (list = commonImage4.urlList) != null && !list.isEmpty()) {
                ?? urlModel2 = new UrlModel();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                urlModel2.setUrlList(arrayList2);
                c259800zU.element = urlModel2;
            }
            final String str2 = productCard.text;
            view3.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0Qqf
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view4) {
                    this.LL.LL.Yk(view3, c259800zU.element, str2);
                    return true;
                }
            });
        }
        if (i == 0) {
            C426750GoL.LJIIIZ(c683000Qqg.itemView, Integer.valueOf(this.LLILZ), 0, 0, 0, false, 16);
        } else if (i == getItemCount() - 1) {
            C426750GoL.LJIIIZ(c683000Qqg.itemView, 0, 0, Integer.valueOf(this.LLILZ), 0, false, 16);
        } else {
            C426750GoL.LJIIIZ(c683000Qqg.itemView, 0, 0, 0, 0, false, 16);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C683000Qqg c683000Qqg = new C683000Qqg(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eso, viewGroup, false));
        try {
            View view = c683000Qqg.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c683000Qqg.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c683000Qqg.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C683000Qqg.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c683000Qqg.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c683000Qqg.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C683000Qqg.class.getName();
        return c683000Qqg;
    }
}
