package X;

import Y.ACListenerS122S0200000_19;
import Y.AObserverS223S0100000_19;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.service.ISeriesPricingService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0iGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236130iGx extends AbstractC21673619ry<C1236140iGy> {
    public final C1236120iGw LL;
    public final LifecycleOwner LLILLJJLI;
    public final Context LLILLL;
    public Long LLIZLLLIL;
    public final List<CollectionDetailModel> LLILZ = new ArrayList();
    public final List<Long> LLILZIL = new ArrayList();
    public final Set<Long> LLILZLL = new LinkedHashSet();
    public final Map<Long, C1576640r8A> LLIZ = new LinkedHashMap();
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(798));

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZ).size();
    }

    public final void LLLFZ(C1236040iGo c1236040iGo) {
        this.LLIZLLLIL = c1236040iGo.LIZJ;
        ((ArrayList) this.LLILZ).clear();
        ((ArrayList) this.LLILZ).addAll(c1236040iGo.LIZ);
        ((ArrayList) this.LLILZIL).clear();
        ((ArrayList) this.LLILZIL).addAll(c1236040iGo.LIZIZ);
        notifyDataSetChanged();
        List<CollectionDetailModel> list = c1236040iGo.LIZ;
        ArrayList arrayList = new ArrayList();
        for (CollectionDetailModel collectionDetailModel : list) {
            PriceInfo priceInfo = collectionDetailModel.priceInfo;
            if (priceInfo != null) {
                arrayList.add(new C1617190sBZ(collectionDetailModel.collectionId, priceInfo, collectionDetailModel.discountedPriceInfo, collectionDetailModel.singleVideoPriceInfo));
            }
        }
        ((ISeriesPricingService) this.LLJ.getValue()).LIZJ(this.LLILLL, arrayList).observe(this.LLILLJJLI, new AObserverS223S0100000_19(this, 78));
    }

    public final void LLLI(long j, boolean z) {
        if (z) {
            ((ArrayList) this.LLILZIL).add(Long.valueOf(j));
        } else {
            ((ArrayList) this.LLILZIL).remove(Long.valueOf(j));
        }
        this.LLILZLL.remove(Long.valueOf(j));
        Iterator it2 = ((ArrayList) this.LLILZ).iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (((CollectionDetailModel) it2.next()).collectionId == j) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        notifyItemChanged(i);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        boolean z;
        int i2;
        int i3;
        String str2;
        String str3;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        String string;
        Integer num;
        List<String> urlList;
        C1236140iGy c1236140iGy = (C1236140iGy) viewHolder;
        CollectionDetailModel collectionDetailModel = (CollectionDetailModel) ListProtector.get(this.LLILZ, i);
        boolean zContains = ((ArrayList) this.LLILZIL).contains(Long.valueOf(collectionDetailModel.collectionId));
        c1236140iGy.getClass();
        UrlModel urlModel = collectionDetailModel.collectionCover;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
            str = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(c1236140iGy.LLILLJJLI);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        c1236140iGy.LLILLL.setText(collectionDetailModel.collectionName);
        C1576640r8A c1576640r8A = (C1576640r8A) ((LinkedHashMap) c1236140iGy.LLJJ.LLIZ).get(Long.valueOf(collectionDetailModel.collectionId));
        TuxTextView tuxTextView = c1236140iGy.LLJILJIL;
        if (c1576640r8A != null && !c1576640r8A.LJIIIIZZ && C123100dR.LIZ(collectionDetailModel.voucherTag) && !collectionDetailModel.isLimitedFree()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, tuxTextView);
        tuxTextView.setText(collectionDetailModel.voucherTag);
        TuxTextView tuxTextView2 = c1236140iGy.LLJIJIL;
        if (c1576640r8A != null && !c1576640r8A.LJIIIIZZ && collectionDetailModel.discountedPriceInfo != null && !collectionDetailModel.isLimitedFree()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LJLLLLLL(i3, tuxTextView2);
        tuxTextView2.setPaintFlags(tuxTextView2.getPaintFlags() | 16);
        String str4 = null;
        if (c1576640r8A != null) {
            str2 = c1576640r8A.LIZIZ;
        } else {
            str2 = null;
        }
        tuxTextView2.setText(str2);
        if (collectionDetailModel.isLimitedFree()) {
            C786410Ut5.LJLLLLLL(8, c1236140iGy.LLILZ);
        }
        TuxTextView tuxTextView3 = c1236140iGy.LLILZ;
        C1236130iGx c1236130iGx = c1236140iGy.LLJJ;
        if (c1576640r8A != null) {
            str3 = c1576640r8A.LIZLLL;
        } else {
            str3 = null;
        }
        if (C123100dR.LIZ(str3)) {
            if (c1576640r8A != null) {
                str4 = c1576640r8A.LIZLLL;
            }
        } else if (c1576640r8A != null) {
            str4 = c1576640r8A.LIZIZ;
        }
        tuxTextView3.setText(str4);
        tuxTextView3.setTextColorRes(c1236130iGx.LL.LIZ);
        TuxTextView tuxTextView4 = c1236140iGy.LLILZIL;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, c1236140iGy.LLJJ.LLILLL);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iIntValue);
        int length = spannableStringBuilder.length();
        Resources resources = c1236140iGy.itemView.getResources();
        int i4 = collectionDetailModel.collectionVideoNum;
        spannableStringBuilder.append((CharSequence) resources.getQuantityString(2131755700, i4, Integer.valueOf(i4)));
        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ng, c1236140iGy.LLJJ.LLILLL);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(iIntValue2);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) " | ");
        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, c1236140iGy.LLJJ.LLILLL);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(iIntValue3);
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) C788990UxF.LIZ(collectionDetailModel.collectionTotalDuration, c1236140iGy.itemView.getResources()));
        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan3, length3, spannableStringBuilder.length(), 17);
        tuxTextView4.setText(spannableStringBuilder);
        if (c1236140iGy.LLJJ.LL.LJI) {
            C786410Ut5.LJLLLLLL(0, c1236140iGy.LLJI);
            c1236140iGy.LLJ.setText(a0.LJJJJJL('0', 2, String.valueOf(((ArrayList) c1236140iGy.LLJJ.LLILZ).indexOf(collectionDetailModel) + 1)));
        } else {
            C786410Ut5.LJLLLLLL(8, c1236140iGy.LLJI);
        }
        if (c1236140iGy.LLJJ.LL.LJ == EnumC1236010iGl.NOBUTTON) {
            C786410Ut5.LJLLLLLL(8, c1236140iGy.LLILZLL);
            c1236140iGy.LLILZLL.setLoading(false);
            c1236140iGy.LLILLJJLI.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108));
            c1236140iGy.LLILLJJLI.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108));
            c1236140iGy.LLILZ.setTextColorRes(R.attr.a1h);
            C786410Ut5.LJLLLLLL(8, c1236140iGy.LLIZLLLIL);
            C786410Ut5.LJLLLLLL(8, c1236140iGy.LLIZ);
            C786410Ut5.LJLLLLLL(8, c1236140iGy.LLJI);
        } else if (zContains) {
            String string2 = c1236140iGy.LL.getResources().getString(c1236140iGy.LLJJ.LL.LIZLLL);
            C786410Ut5.LJLLLLLL(8, c1236140iGy.LLILZLL);
            c1236140iGy.LLILZLL.setLoading(false);
            int i5 = C1236020iGm.LIZ[c1236140iGy.LLJJ.LL.LJ.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    c1236140iGy.LLIZLLLIL.setText(string2);
                    C786410Ut5.LJLLLLLL(0, c1236140iGy.LLIZLLLIL);
                    C786410Ut5.LJLLLLLL(8, c1236140iGy.LLIZ);
                }
            } else {
                c1236140iGy.LLIZ.setText(string2);
                C786410Ut5.LJLLLLLL(0, c1236140iGy.LLIZ);
                C786410Ut5.LJLLLLLL(8, c1236140iGy.LLIZLLLIL);
                C786410Ut5.U8(c1236140iGy.LLIZ, new ACListenerS122S0200000_19(c1236140iGy.LLJJ, collectionDetailModel, 90));
                c1236140iGy.LLIZ.setLoading(c1236140iGy.LLJJ.LLILZLL.contains(Long.valueOf(collectionDetailModel.collectionId)));
            }
        } else {
            C786410Ut5.LJLLLLLL(8, c1236140iGy.LLIZ);
            C786410Ut5.LJLLLLLL(8, c1236140iGy.LLIZLLLIL);
            C197039127h c197039127h = c1236140iGy.LLILZLL;
            if (collectionDetailModel.category != SeriesCategory.MINI_DRAMA || (num = c1236140iGy.LLJJ.LL.LIZJ) == null || (string = c1236140iGy.LL.getResources().getString(num.intValue())) == null) {
                string = c1236140iGy.LL.getResources().getString(c1236140iGy.LLJJ.LL.LIZIZ);
            }
            c197039127h.setText(string);
            C786410Ut5.LJLLLLLL(0, c1236140iGy.LLILZLL);
            C786410Ut5.U8(c1236140iGy.LLILZLL, new ACListenerS122S0200000_19(c1236140iGy.LLJJ, collectionDetailModel, 91));
            c1236140iGy.LLIZ.setLoading(false);
            c1236140iGy.LLILZLL.setLoading(c1236140iGy.LLJJ.LLILZLL.contains(Long.valueOf(collectionDetailModel.collectionId)));
        }
        C786410Ut5.I7(new ACListenerS122S0200000_19(c1236140iGy.LLJJ, collectionDetailModel, 89), c1236140iGy.LL);
        long j = collectionDetailModel.collectionId;
        Long l = c1236140iGy.LLJJ.LLIZLLLIL;
        if (l != null && j == l.longValue()) {
            c1236140iGy.LLJILJILJ.getBackground().setAlpha(204);
            C786410Ut5.LJLLLLLL(0, c1236140iGy.LLJILJILJ);
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a04, c1236140iGy.LLJJ.LLILLL);
            if (numLIZJ4 != null) {
                c1236140iGy.LLJILLL.setBackgroundColor(numLIZJ4.intValue());
                c1236140iGy.LLJILLL.getBackground().setAlpha(15);
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(8, c1236140iGy.LLJILJILJ);
        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.bx, c1236140iGy.LLJJ.LLILLL);
        if (numLIZJ5 == null) {
            return;
        }
        c1236140iGy.LLJILLL.setBackgroundColor(numLIZJ5.intValue());
        c1236140iGy.LLJILLL.getBackground().setAlpha(255);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1236140iGy c1236140iGy = new C1236140iGy(this, C786410Ut5.Td(C786410Ut5.ne(this.LLILLL), R.layout.bh1, viewGroup, false));
        try {
            View view = c1236140iGy.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1236140iGy.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1236140iGy.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1236140iGy.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1236140iGy.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1236140iGy.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1236140iGy.class.getName();
        return c1236140iGy;
    }

    public C1236130iGx(C1236120iGw c1236120iGw, LifecycleOwner lifecycleOwner, Context context) {
        this.LL = c1236120iGw;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = context;
    }
}
