package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Pet, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C650210Pet extends C21594419fC {
    public AbstractC650160Peo LLILZIL;

    @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (C650230Pev.LIZ) {
            return true;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (!(pagerAdapter instanceof AbstractC650160Peo)) {
            return;
        }
        this.LLILZIL = (AbstractC650160Peo) pagerAdapter;
        super.setAdapter(pagerAdapter);
    }

    public C650210Pet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addOnPageChangeListener(new C650220Peu(this));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void onPageScrolled(int i, float f, int i2) {
        if (getCurrentItem() == i) {
            int i3 = i + 1;
            if (f >= 0.1f && this.LLILZIL.LJJJI(i3)) {
                this.LLILZIL.getClass();
                this.LLILZIL.LJJIJL(i3, this);
                this.LLILZIL.LJIJI(this);
            }
        } else if (getCurrentItem() > i && 1.0f - f >= 0.1f && this.LLILZIL.LJJJI(i)) {
            this.LLILZIL.getClass();
            this.LLILZIL.LJJIJL(i, this);
            this.LLILZIL.LJIJI(this);
        }
        if (!Float.isNaN(f)) {
            super.onPageScrolled(i, f, i2);
            return;
        }
        super.onPageScrolled(i, 0.0f, i2);
        HashMap map = new HashMap();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append("");
        map.put("position", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(f);
        sbLIZ2.append("");
        map.put("offset", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(i2);
        sbLIZ3.append("");
        map.put("offsetPixels", C2188811AlT.LIZIZ(sbLIZ3));
        C1AF0.LIZLLL("search_pageScroll_crash", map);
    }
}
