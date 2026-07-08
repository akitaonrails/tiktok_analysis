package Y;

import X.C10515049h;
import X.C1748720vbi;
import X.C19EH;
import X.C1C7U;
import X.C786410Ut5;
import X.C972903rD;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter$AddressViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public class ARunnableS10S0400000_1 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Rect rect = new Rect();
        ((View) this.l0).getHitRect(rect);
        float fWidth = rect.left + (rect.width() / 2.0f);
        float fHeight = rect.top + (rect.height() / 2.0f);
        float fIntValue = ((Integer) this.l1) != null ? r0.intValue() / 2.0f : fWidth;
        float fIntValue2 = ((Integer) this.l2) != null ? r0.intValue() / 2.0f : fHeight;
        rect.top -= (int) (fHeight - fIntValue2);
        rect.bottom += (int) (fHeight + fIntValue2);
        rect.left -= (int) (fWidth - fIntValue);
        rect.right += (int) (fWidth + fIntValue);
        ((View) this.l3).setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public static final void run$0(ARunnableS10S0400000_1 aRunnableS10S0400000_1) {
        boolean zLIZ;
        C1C7U.LIZ("TouchDelegateExtKt@bd02.expandViewTouchArea$1$1");
        try {
            aRunnableS10S0400000_1.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TouchDelegateExtKt@bd02.expandViewTouchArea$1$1");
    }

    public static final void run$1(ARunnableS10S0400000_1 aRunnableS10S0400000_1) {
        boolean zLIZ;
        C1C7U.LIZ("AddressAdapter$AddressViewHolder@9596.onBind$1$3$7");
        try {
            C1748720vbi.LJFF(((AddressAdapter$AddressViewHolder) aRunnableS10S0400000_1.l0).itemView, new C10515049h(), new AwS545S0100000_1((Address) aRunnableS10S0400000_1.l1, 1561), new AwS100S0400000_1((Address) aRunnableS10S0400000_1.l1, (AddressAdapter$AddressViewHolder) aRunnableS10S0400000_1.l0, (ReachableAddress) aRunnableS10S0400000_1.l2, (C972903rD) aRunnableS10S0400000_1.l3, 17));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AddressAdapter$AddressViewHolder@9596.onBind$1$3$7");
    }

    public static final void run$2(ARunnableS10S0400000_1 aRunnableS10S0400000_1) {
        boolean zLIZ;
        C1C7U.LIZ("SeaOneStepOrderSubmitFragment@522e.showOrHideSummaryPanel$2");
        try {
            C19EH c19ehLJIIJ = ((FragmentManager) aRunnableS10S0400000_1.l0).LJIIJ();
            c19ehLJIIJ.LJIILL((Fragment) aRunnableS10S0400000_1.l1);
            c19ehLJIIJ.LJIIJ();
            C786410Ut5.LJZ(8, (FrameLayout) aRunnableS10S0400000_1.l2);
            C786410Ut5.ed((View) aRunnableS10S0400000_1.l3, r1.getHeight());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaOneStepOrderSubmitFragment@522e.showOrHideSummaryPanel$2");
    }

    public ARunnableS10S0400000_1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
