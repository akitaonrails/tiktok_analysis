package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646050sw7 extends AbstractC2255721DQs<InterfaceC1168770gWJ> implements InterfaceC1168770gWJ, InterfaceC379610EuV {
    public static final C1646090swB LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final String LL;
    public final boolean LLILLJJLI;
    public final C19A3 LLILLL;
    public final C1DRG LLILZ;
    public final boolean LLILZIL;
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final ViewPager LLIZ;
    public final InterfaceC332260D0u<AbstractC540910LJh> LLIZLLLIL;
    public final C05YD<AbstractC540910LJh> LLJ;
    public final C01GW LLJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0swB] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1646050sw7.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = new Object() { // from class: X.0swB
        };
        LLJILJILJ = 8;
    }

    @Override // X.InterfaceC1168770gWJ
    public void V31(View view) {
    }

    public C1646050sw7 W1() {
        return this;
    }

    @Override // X.InterfaceC1168770gWJ
    public void notifyDataSetChanged() {
    }

    private final C1642760sqo Z1() {
        return (C1642760sqo) this.LLJI.getValue();
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLILZLL.getValue(this, LLJILJIL[0]);
    }

    @Override // X.InterfaceC1168770gWJ
    public void hide() {
        this.LLILLL.hide(Z1());
    }

    private final InterfaceC1648870t0f X1() {
        return getRecordAdapterApi().ir2().LIZJ();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLILLL.add(R.id.rn_, Z1(), "DMPlayroundViewPagerComponent");
        InterfaceC1648870t0f interfaceC1648870t0fX1 = X1();
        if (interfaceC1648870t0fX1 != null) {
            interfaceC1648870t0fX1.setUploadVisibility(8);
        }
        ViewPager viewPager = (ViewPager) this.LLILLL.findViewById(R.id.g1h);
        if (viewPager != null) {
            final Integer numValueOf = Integer.valueOf(viewPager.getChildCount());
            viewPager.addOnPageChangeListener(new C360660ECa() { // from class: X.0swA
                @Override // X.C360660ECa, X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    this.LL.LLIZLLLIL.setValue(new C540870LJd(i, true));
                }
            });
            if (numValueOf != null) {
                numValueOf.intValue();
                PagerAdapter pagerAdapter = new PagerAdapter() { // from class: X.0sw9
                    @Override // androidx.viewpager.widget.PagerAdapter
                    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
                    }

                    @Override // androidx.viewpager.widget.PagerAdapter
                    public final int getCount() {
                        return numValueOf.intValue();
                    }

                    @Override // androidx.viewpager.widget.PagerAdapter
                    public final Object LJJI(int i, ViewGroup viewGroup) {
                        return viewGroup.getChildAt(i);
                    }

                    @Override // androidx.viewpager.widget.PagerAdapter
                    public final boolean LJJIFFI(View view, Object obj) {
                        return Intrinsics.LJFF(view, obj);
                    }
                };
                if (viewPager != null) {
                    viewPager.setAdapter(pagerAdapter);
                }
            }
        }
        this.LLIZLLLIL.setValue(new C540870LJd(0, false));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1646060sw8(this, viewPager, null), 3);
    }

    @Override // X.InterfaceC1168770gWJ
    public C05YD<AbstractC540910LJh> at2() {
        return this.LLJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZ;
    }

    public final ViewPager o2() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1168770gWJ
    public void Uk1(int i) {
        this.LLIZLLLIL.setValue(new C540870LJd(i, true));
    }

    public C1646050sw7(String str, boolean z, C19A3 c19a3, C1DRG c1drg, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = c19a3;
        this.LLILZ = c1drg;
        this.LLILZIL = z2;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new AbstractC540910LJh() { // from class: X.0LJg
        });
        this.LLIZLLLIL = c2252321DDqLIZ;
        this.LLJ = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 406));
    }
}
