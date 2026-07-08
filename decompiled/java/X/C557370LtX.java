package X;

import Y.AfS177S0100000_8;
import android.text.SpannableString;
import android.text.style.MetricAffectingSpan;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.InputImage;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import ge.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS23S0010000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS59S1000000_8;

/* JADX INFO: renamed from: X.0LtX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557370LtX extends i<InterfaceC555210Lq3, C565400MFm, C557560Ltq, C557510Ltl> implements InterfaceC379610EuV, InterfaceC555210Lq3 {
    public final C19A3 LLJILJILJ;
    public final C553840Lnq LLJILLL;
    public final C1DRG LLJJ;
    public final C11NJ LLJJI;
    public final C11RK<C1279504zZ> LLJJIII;
    public SpannableString LLJJIJI;
    public List<C0M37> LLJJIJIIJIL;
    public List<? extends MetricAffectingSpan> LLJJIJIL;
    public final MutableLiveData<Boolean> LLJJJ;
    public final MutableLiveData<C557390LtZ> LLJJJIL;
    public final MutableLiveData<Pair<Boolean, List<MentionDataItem>>> LLJJJJ;
    public final MutableLiveData<C1279504zZ> LLJJJJJIL;
    public final MutableLiveData<Unit> LLJJJJLIIL;
    public final C11RK<List<InputBlock>> LLJJL;
    public final MutableLiveData<Pair<Integer, MentionDataItem>> LLJJLIIIJLLLLLLLZ;
    public final C11RK<String> LLJL;
    public int LLJLIL;

    public final void F4() {
        i3(AFwS239S0000000_8.get$arr$(245));
        InterfaceC555170Lpz inputBoxEventHandler$tools_ai_uikit_df_release = this.LLJILLL.getInputBoxEventHandler$tools_ai_uikit_df_release();
        if (inputBoxEventHandler$tools_ai_uikit_df_release != null) {
            inputBoxEventHandler$tools_ai_uikit_df_release.LIZIZ();
        }
    }

    @Override // X.InterfaceC555210Lq3
    public void hp() {
        i3(AFwS239S0000000_8.get$arr$(246));
    }

    @Override // X.InterfaceC555210Lq3
    public void ks() {
        i3(AFwS239S0000000_8.get$arr$(247));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C557560Ltq> o2() {
        return new AwS552S0100000_8(this, 814);
    }

    @Override // X.InterfaceC555210Lq3
    public boolean uK0() {
        List<C0M37> list = this.LLJJIJIIJIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C0M37> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LL);
        }
        return C13LP.LJJJJI(arrayList).size() >= T2().LIZIZ;
    }

    @Override // X.InterfaceC555210Lq3
    public List<InputBlock> uk() {
        MentionDataItem mentionDataItem;
        SpannableString spannableString = this.LLJJIJI;
        if (spannableString == null) {
            return C13BV.INSTANCE;
        }
        List<MetricAffectingSpan> list = this.LLJJIJIL;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (MetricAffectingSpan metricAffectingSpan : list) {
            int spanStart = spannableString.getSpanStart(metricAffectingSpan);
            int spanEnd = spannableString.getSpanEnd(metricAffectingSpan);
            if (spanStart > i) {
                C547680Ldu c547680Ldu = InputBlock.Companion;
                String string = spannableString.subSequence(i, spanStart).toString();
                c547680Ldu.getClass();
                arrayList.add(C547680Ldu.LIZJ(string));
            }
            if ((metricAffectingSpan instanceof C0M37) && (mentionDataItem = ((C0M37) metricAffectingSpan).LL) != null) {
                InputBlock.Companion.getClass();
                arrayList.add(C547680Ldu.LIZIZ(mentionDataItem));
            }
            if (metricAffectingSpan instanceof C1325340kaq) {
                C547680Ldu c547680Ldu2 = InputBlock.Companion;
                C1325340kaq c1325340kaq = (C1325340kaq) metricAffectingSpan;
                InputImage inputImage = new InputImage(c1325340kaq.LIZIZ().LIZ, c1325340kaq.LIZIZ().LIZIZ, c1325340kaq.LIZIZ().LIZJ, c1325340kaq.LIZIZ().LIZLLL, c1325340kaq.LIZIZ().LJFF, c1325340kaq.LIZIZ().LJI);
                c547680Ldu2.getClass();
                arrayList.add(C547680Ldu.LIZ(inputImage));
            }
            i = spanEnd;
        }
        if (i < spannableString.length()) {
            C547680Ldu c547680Ldu3 = InputBlock.Companion;
            String string2 = spannableString.subSequence(i, spannableString.length()).toString();
            c547680Ldu3.getClass();
            arrayList.add(C547680Ldu.LIZJ(string2));
        }
        return arrayList;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C557510Ltl> w2() {
        return new AwS552S0100000_8(this, 815);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLJJI.LIZ(this.LLJJIII.LJLILLLLZI(300L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 90)));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJJI.dispose();
    }

    @Override // X.InterfaceC555210Lq3
    public /* bridge */ /* synthetic */ LiveData As1() {
        return this.LLJJJJ;
    }

    public MutableLiveData<Boolean> H4() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC555210Lq3
    public /* bridge */ /* synthetic */ LiveData Ip1() {
        return this.LLJJJJLIIL;
    }

    public MutableLiveData<C1279504zZ> K4() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC555210Lq3
    public C11RK<List<InputBlock>> O0() {
        return this.LLJJL;
    }

    public MutableLiveData<Pair<Boolean, List<MentionDataItem>>> O4() {
        return this.LLJJJJ;
    }

    public MutableLiveData<C557390LtZ> P4() {
        return this.LLJJJIL;
    }

    public MutableLiveData<Unit> T4() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC555210Lq3
    public /* bridge */ /* synthetic */ LiveData Tu0() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC555210Lq3
    public /* bridge */ /* synthetic */ LiveData U8() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC555210Lq3
    public /* bridge */ /* synthetic */ LiveData UF1() {
        return this.LLJJJ;
    }

    public MutableLiveData<Pair<Integer, MentionDataItem>> Z4() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC555210Lq3
    public /* bridge */ /* synthetic */ LiveData gS() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJ;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC555210Lq3
    public C11RK<String> uo() {
        return this.LLJL;
    }

    private final void d5(List<InputBlock> list) {
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator<InputBlock> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().userItem != null) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C555160Lpy(list, this, null), 2);
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC555210Lq3
    public void A92(boolean z) {
        i3(new AwS23S0010000_8(z, 13));
    }

    @Override // X.InterfaceC555210Lq3
    public void Yz0(String str) {
        if (str.length() == 0) {
            return;
        }
        i3(new AwS59S1000000_8(str, 14));
    }

    @Override // X.InterfaceC555210Lq3
    public void dl(List<InputBlock> list) {
        d5(list);
        i3(new AwS587S0100000_8(list, (List<MentionDataItem>) 540));
    }

    @Override // X.InterfaceC555210Lq3
    public void ea(C551390Ljt c551390Ljt) {
        this.LLJLIL = c551390Ljt.LIZIZ;
        InterfaceC555170Lpz inputBoxEventHandler$tools_ai_uikit_df_release = this.LLJILLL.getInputBoxEventHandler$tools_ai_uikit_df_release();
        if (inputBoxEventHandler$tools_ai_uikit_df_release != null) {
            inputBoxEventHandler$tools_ai_uikit_df_release.LIZJ();
        }
        i3(new AwS587S0100000_8(c551390Ljt, 541));
    }

    @Override // X.InterfaceC555210Lq3
    public void iN0(C551290Ljj c551290Ljj) {
        i3(new AwS587S0100000_8(c551290Ljj, 537));
    }

    @Override // X.InterfaceC555210Lq3
    public void kv(List<MentionDataItem> list) {
        i3(new AwS587S0100000_8(list, (List<MentionDataItem>) 543));
    }

    @Override // X.InterfaceC555210Lq3
    public void rn(String str) {
        if (str.length() == 0) {
            return;
        }
        i3(new AwS59S1000000_8(str, 13));
    }

    @Override // X.InterfaceC555210Lq3
    public void sK1(boolean z) {
        if (z) {
            show();
        } else {
            hide();
        }
    }

    @Override // X.InterfaceC555210Lq3
    public void th2(List<C557390LtZ> list) {
        int i;
        if (list.isEmpty()) {
            return;
        }
        List<? extends MetricAffectingSpan> list2 = this.LLJJIJIL;
        int i2 = 0;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            Iterator<? extends MetricAffectingSpan> it2 = list2.iterator();
            i = 0;
            while (it2.hasNext()) {
                if ((it2.next() instanceof C1325340kaq) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C557390LtZ c557390LtZ : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList.add(C557390LtZ.LIZ(c557390LtZ, String.valueOf(i2 + i + 1), null, 111));
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        i3(new AwS587S0100000_8(arrayList, (List<MentionDataItem>) 536));
    }

    @Override // X.InterfaceC555210Lq3
    public void zq(C551430Ljx c551430Ljx) {
        i3(new AwS587S0100000_8(c551430Ljx, 535));
    }

    @Override // X.InterfaceC555210Lq3
    public void Y1(InterfaceC549270LgT interfaceC549270LgT, MentionDataItem mentionDataItem) {
        if (interfaceC549270LgT instanceof C549300LgW) {
            return;
        }
        if (mentionDataItem != null) {
            i3(new AwS587S0100000_8(mentionDataItem, 538));
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C555150Lpx(this, null), 3);
        }
    }

    public C557370LtX(C19A3 c19a3, C553840Lnq c553840Lnq, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c553840Lnq;
        this.LLJJ = c1drg;
        this.LLJJI = new C11NJ();
        this.LLJJIII = new C11RK<>();
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJJIJIIJIL = c13bv;
        this.LLJJIJIL = c13bv;
        this.LLJJJ = new MutableLiveData<>();
        this.LLJJJIL = new MutableLiveData<>();
        this.LLJJJJ = new MutableLiveData<>();
        this.LLJJJJJIL = new MutableLiveData<>();
        this.LLJJJJLIIL = new MutableLiveData<>();
        this.LLJJL = new C11RK<>();
        this.LLJJLIIIJLLLLLLLZ = new MutableLiveData<>();
        this.LLJL = new C11RK<>();
        this.LLJLIL = -1;
    }
}
