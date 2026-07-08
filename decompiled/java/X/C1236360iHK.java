package X;

import Y.ACListenerS122S0200000_19;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.fragment.PaidSeriesAddedListFragment;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel.PaidSeriesAddedSeriesViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0iHK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236360iHK extends AbstractC21673619ry<C1236370iHL> {
    public final InterfaceC1236380iHM LL;
    public final long LLILLJJLI;
    public final boolean LLILLL;
    public final LifecycleOwner LLILZ;
    public final Context LLILZIL;
    public Long LLIZLLLIL;
    public final List<CollectionDetailModel> LLILZLL = new ArrayList();
    public final Map<Long, C1576640r8A> LLIZ = new LinkedHashMap();
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(799));

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZLL).size();
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
        int i4;
        int i5;
        boolean z2;
        List<String> urlList;
        C1236370iHL c1236370iHL = (C1236370iHL) viewHolder;
        CollectionDetailModel collectionDetailModel = (CollectionDetailModel) ListProtector.get(this.LLILZLL, i);
        c1236370iHL.getClass();
        UrlModel urlModel = collectionDetailModel.collectionCover;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
            str = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(c1236370iHL.LL);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        c1236370iHL.LLILLJJLI.setText(collectionDetailModel.collectionName);
        C1576640r8A c1576640r8A = (C1576640r8A) ((LinkedHashMap) c1236370iHL.LLJILJIL.LLIZ).get(Long.valueOf(collectionDetailModel.collectionId));
        TuxTextView tuxTextView = c1236370iHL.LLJI;
        if (c1576640r8A != null && !c1576640r8A.LJIIIIZZ && C123100dR.LIZ(collectionDetailModel.voucherTag) && !collectionDetailModel.isLimitedFree()) {
            z = true;
        } else {
            z = false;
        }
        int i6 = 8;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, tuxTextView);
        tuxTextView.setText(collectionDetailModel.voucherTag);
        TuxTextView tuxTextView2 = c1236370iHL.LLJ;
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
            C786410Ut5.LJLLLLLL(8, c1236370iHL.LLILLL);
        }
        TuxTextView tuxTextView3 = c1236370iHL.LLILLL;
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
        TuxTextView tuxTextView4 = c1236370iHL.LLILZ;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, c1236370iHL.LLJILJIL.LLILZIL);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iIntValue);
        int length = spannableStringBuilder.length();
        Resources resources = c1236370iHL.itemView.getResources();
        int i7 = collectionDetailModel.collectionVideoNum;
        spannableStringBuilder.append((CharSequence) resources.getQuantityString(2131755700, i7, Integer.valueOf(i7)));
        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ng, c1236370iHL.LLJILJIL.LLILZIL);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(iIntValue2);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) " | ");
        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, c1236370iHL.LLJILJIL.LLILZIL);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(iIntValue3);
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) C788990UxF.LIZ(collectionDetailModel.collectionTotalDuration, c1236370iHL.itemView.getResources()));
        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan3, length3, spannableStringBuilder.length(), 17);
        tuxTextView4.setText(spannableStringBuilder);
        c1236370iHL.LLIZLLLIL.setText(a0.LJJJJJL('0', 2, String.valueOf(((ArrayList) c1236370iHL.LLJILJIL.LLILZLL).indexOf(collectionDetailModel) + 1)));
        FrameLayout frameLayout = c1236370iHL.LLILZLL;
        if (((ArrayList) c1236370iHL.LLJILJIL.LLILZLL).size() > 1 && i != 0) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        C786410Ut5.LJLLLLLL(i4, frameLayout);
        C786410Ut5.O7(c1236370iHL.LLILZLL, new ACListenerS122S0200000_19(c1236370iHL.LLJILJIL, collectionDetailModel, 92));
        C786410Ut5.O7(c1236370iHL.LLILZIL, new ACListenerS122S0200000_19(c1236370iHL.LLJILJIL, collectionDetailModel, 93));
        C197039127h c197039127h = c1236370iHL.LLIZ;
        if (!c1236370iHL.LLJILJIL.LLILLL) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        C786410Ut5.LJLLLLLL(i5, c197039127h);
        long j = collectionDetailModel.collectionId;
        Long l = c1236370iHL.LLJILJIL.LLIZLLLIL;
        if (l != null && j == l.longValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1236370iHL.LLJIJIL.getBackground().setAlpha(204);
        LinearLayout linearLayout = c1236370iHL.LLJIJIL;
        if (z2) {
            i6 = 0;
        }
        C786410Ut5.LJLLLLLL(i6, linearLayout);
        if (z2) {
            C197039127h c197039127h2 = c1236370iHL.LLIZ;
            C1236360iHK c1236360iHK = c1236370iHL.LLJILJIL;
            c197039127h2.setButtonVariant(1);
            c197039127h2.setText(c197039127h2.getContext().getString(2131847361));
            C786410Ut5.U8(c197039127h2, new ACListenerS122S0200000_19(c1236360iHK, collectionDetailModel, 94));
            return;
        }
        C197039127h c197039127h3 = c1236370iHL.LLIZ;
        C1236360iHK c1236360iHK2 = c1236370iHL.LLJILJIL;
        c197039127h3.setButtonVariant(0);
        c197039127h3.setText(c197039127h3.getContext().getString(2131847360));
        C786410Ut5.U8(c197039127h3, new ACListenerS122S0200000_19(c1236360iHK2, collectionDetailModel, 95));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1236370iHL c1236370iHL = new C1236370iHL(this, C786410Ut5.Td(C786410Ut5.ne(this.LLILZIL), R.layout.bh3, viewGroup, false));
        try {
            View view = c1236370iHL.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1236370iHL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1236370iHL.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1236370iHL.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1236370iHL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1236370iHL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1236370iHL.class.getName();
        return c1236370iHL;
    }

    public C1236360iHK(PaidSeriesAddedSeriesViewModel paidSeriesAddedSeriesViewModel, long j, boolean z, PaidSeriesAddedListFragment paidSeriesAddedListFragment, Context context) {
        this.LL = paidSeriesAddedSeriesViewModel;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = paidSeriesAddedListFragment;
        this.LLILZIL = context;
    }
}
