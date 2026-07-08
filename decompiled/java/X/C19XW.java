package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19XW, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19XW extends LinearLayout implements InterfaceC469360Ias, InterfaceC1846340y9A, C19XY {
    public C415580GRg[] LL;
    public ViewPager LLILLJJLI;
    public C21599719g3 LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public C19XX LLJ;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
    }

    public int getCount() {
        PagerAdapter adapter;
        ViewPager viewPager = this.LLILLJJLI;
        if (viewPager != null) {
            PagerAdapter adapter2 = viewPager.getAdapter();
            if (adapter2 == null) {
                return 0;
            }
            return adapter2 instanceof C21595819fQ ? ((C21595819fQ) adapter2).LLILLJJLI.getCount() : adapter2.getCount();
        }
        C21599719g3 c21599719g3 = this.LLILLL;
        if (c21599719g3 == null || (adapter = c21599719g3.getAdapter()) == null) {
            return 0;
        }
        return adapter instanceof C21595819fQ ? ((C21595819fQ) adapter).LLILLJJLI.getCount() : adapter.getCount();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        super.setOrientation(i);
        if (i == 0) {
            setGravity(16);
        } else {
            setGravity(1);
        }
    }

    public void setUpViewPager(C21599719g3 c21599719g3) {
        if (c21599719g3 != null) {
            if (this.LLILLL != null) {
                c21599719g3.LJJIIJZLJL(this);
                List<C19XY> list = c21599719g3.LLLLIIL;
                if (list != null) {
                    ((ArrayList) list).remove(this);
                }
            }
            this.LLILLL = c21599719g3;
            PagerAdapter adapter = c21599719g3.getAdapter();
            c21599719g3.LIZLLL(this);
            if (c21599719g3.LLLLIIL == null) {
                c21599719g3.LLLLIIL = new ArrayList();
            }
            ((ArrayList) c21599719g3.LLLLIIL).add(this);
            if (adapter == null) {
                return;
            }
            DataSetObserver dataSetObserver = this.LLJ;
            if (dataSetObserver != null) {
                adapter.LJJIJIIJIL(dataSetObserver);
            }
            C19XX c19xx = new C19XX(this, this, adapter);
            this.LLJ = c19xx;
            adapter.LJJII(c19xx);
            setUpViews(adapter);
            return;
        }
        throw new NullPointerException("viewPager == null.");
    }

    public void setUpViews(PagerAdapter pagerAdapter) {
        int count;
        if (pagerAdapter instanceof C21595819fQ) {
            count = ((C21595819fQ) pagerAdapter).LLILLJJLI.getCount();
        } else {
            count = pagerAdapter.getCount();
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LL = new C415580GRg[count];
        int i = this.LLIZ / 2;
        for (int i2 = 0; i2 < count; i2++) {
            C415580GRg c415580GRg = new C415580GRg(getContext());
            c415580GRg.setSolidColor(this.LLILZIL);
            c415580GRg.setStrokeColor(this.LLILZLL);
            int i3 = this.LLILZ;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
            if (getOrientation() == 1) {
                layoutParams.setMargins(0, i, 0, i);
            } else {
                layoutParams.setMargins(i, 0, i, 0);
            }
            addView(c415580GRg, layoutParams);
            this.LL[i2] = c415580GRg;
        }
    }

    public void setUpViewPager(ViewPager viewPager) {
        if (viewPager != null) {
            if (this.LLILLJJLI != null) {
                viewPager.removeOnPageChangeListener(this);
                viewPager.removeOnAdapterChangeListener(this);
            }
            this.LLILLJJLI = viewPager;
            PagerAdapter adapter = viewPager.getAdapter();
            viewPager.addOnPageChangeListener(this);
            viewPager.addOnAdapterChangeListener(this);
            if (adapter == null) {
                return;
            }
            DataSetObserver dataSetObserver = this.LLJ;
            if (dataSetObserver != null) {
                adapter.LJJIJIIJIL(dataSetObserver);
            }
            C19XX c19xx = new C19XX(this, this, adapter);
            this.LLJ = c19xx;
            adapter.LJJII(c19xx);
            setUpViews(adapter);
            return;
        }
        throw new NullPointerException("viewPager == null.");
    }

    public C19XW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.C19XY
    public final void LIZ(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C19XX c19xx;
        if (pagerAdapter != null && (c19xx = this.LLJ) != null) {
            pagerAdapter.LJJIJIIJIL(c19xx);
        }
        if (pagerAdapter2 != null) {
            C19XX c19xx2 = new C19XX(this, this, pagerAdapter2);
            this.LLJ = c19xx2;
            pagerAdapter2.LJJII(c19xx2);
        }
    }

    public C19XW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LL = new C415580GRg[0];
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ViewPagerIndicatorLayout, 0, 0);
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.ViewPagerIndicatorLayout_indicatorSolidColor, -1);
        this.LLILZLL = typedArrayObtainStyledAttributes.getColor(R$styleable.ViewPagerIndicatorLayout_indicatorStrokeColor, -1);
        this.LLILZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ViewPagerIndicatorLayout_indicatorSize, (int) C12ES.LIZJ(4.0f, context));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ViewPagerIndicatorLayout_indicatorStrokeWidth, 0);
        float f = 0.5f;
        float f2 = typedArrayObtainStyledAttributes.getFloat(R$styleable.ViewPagerIndicatorLayout_indicatorUnselectedAlpha, 0.5f);
        if (f2 > 0.0f && f2 <= 1.0f) {
            f = f2;
        }
        this.LLIZLLLIL = (int) (f * 255.0f);
        this.LLIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ViewPagerIndicatorLayout_indicatorSpace, (int) C12ES.LIZJ(4.0f, context));
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 0) {
            setGravity(16);
        } else {
            setGravity(1);
        }
    }

    @Override // X.InterfaceC1846340y9A
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C19XX c19xx;
        if (pagerAdapter != null && (c19xx = this.LLJ) != null) {
            pagerAdapter.LJJIJIIJIL(c19xx);
        }
        if (pagerAdapter2 != null) {
            C19XX c19xx2 = new C19XX(this, this, pagerAdapter2);
            this.LLJ = c19xx2;
            pagerAdapter2.LJJII(c19xx2);
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        int count = getCount();
        if (count == 0) {
            return;
        }
        if (count != this.LL.length) {
            ViewPager viewPager = this.LLILLJJLI;
            if (viewPager != null) {
                setUpViews(viewPager.getAdapter());
            }
            C21599719g3 c21599719g3 = this.LLILLL;
            if (c21599719g3 != null) {
                setUpViews(c21599719g3.getAdapter());
            }
        }
        int i3 = i % count;
        C415580GRg c415580GRg = this.LL[i3];
        c415580GRg.setStrokeAlpha(0);
        c415580GRg.setFillAlpha((int) (((Math.sin((((double) (1.0f - f)) * 3.141592653589793d) / 2.0d) * 255.0d) / 2.0d) + ((double) this.LLIZLLLIL)));
        int i4 = (i3 + 1) % count;
        C415580GRg c415580GRg2 = this.LL[i4];
        c415580GRg2.setStrokeAlpha(0);
        c415580GRg2.setFillAlpha((int) (((Math.sin((((double) f) * 3.141592653589793d) / 2.0d) * 255.0d) / 2.0d) + ((double) this.LLIZLLLIL)));
        for (int i5 = 0; i5 < count; i5++) {
            if (i5 != i3 && i5 != i4) {
                C415580GRg c415580GRg3 = this.LL[i5];
                c415580GRg3.setStrokeAlpha(0);
                c415580GRg3.setFillAlpha(this.LLIZLLLIL);
            }
        }
    }
}
