package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1BhO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211761BhO implements Serializable, Cloneable {
    public static final C2211911Bhd Companion = new Object() { // from class: X.1Bhd
    };
    public static final long serialVersionUID = 1;
    public final WeakReference<View> LL;
    public final AbstractC2211791BhR LLILLJJLI;
    public final EnumC2211841BhW LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public Integer LLILZLL;
    public String LLIZ;
    public float LLIZLLLIL;

    public final AbstractC2211791BhR getProvider() {
        if (!C1767060w5I.LIZ) {
            return this.LLILLJJLI;
        }
        View view = this.LL.get();
        Object tag = view != null ? view.getTag(R.id.vshot_tag_provider) : null;
        if (tag instanceof C2190411Ao3) {
            return ((C2190411Ao3) tag).LIZ.get(Integer.valueOf(hashCode()));
        }
        return null;
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public Object clone() {
        return super.clone();
    }

    public final String getBTM_CD() {
        Function0<String> function0LIZLLL;
        String strInvoke;
        AbstractC2211791BhR provider = getProvider();
        return (provider == null || (function0LIZLLL = provider.LIZLLL()) == null || (strInvoke = function0LIZLLL.invoke()) == null) ? "def" : strInvoke;
    }

    public final String getEventName() {
        Function0<String> function0LIZIZ;
        AbstractC2211791BhR provider = getProvider();
        if (provider == null || (function0LIZIZ = provider.LIZIZ()) == null) {
            return null;
        }
        return function0LIZIZ.invoke();
    }

    public final int getExposePeriodSpecification() {
        AbstractC2211791BhR provider = getProvider();
        if (provider != null) {
            return provider.LIZJ();
        }
        return 500;
    }

    public final InterfaceC2211921Bhe getOnDismissCallback() {
        AbstractC2211791BhR provider = getProvider();
        if (provider != null) {
            return provider.LJ();
        }
        return null;
    }

    public final InterfaceC2211931Bhf getOnExposeCallback() {
        AbstractC2211791BhR provider = getProvider();
        if (provider != null) {
            return provider.LJFF();
        }
        return null;
    }

    public final InterfaceC2211901Bhc getOnExposeWithPivCallback() {
        AbstractC2211791BhR provider = getProvider();
        if (provider != null) {
            return provider.LJI();
        }
        return null;
    }

    public final Map<String, String> getParams() {
        Map<String, String> mapLJII;
        AbstractC2211791BhR provider = getProvider();
        return (provider == null || (mapLJII = provider.LJII()) == null) ? new HashMap() : mapLJII;
    }

    public final boolean getRepeatedInsidePage() {
        AbstractC2211791BhR provider = getProvider();
        if (provider != null) {
            return provider.LJIIIIZZ();
        }
        return false;
    }

    public final boolean getRepeatedWhenBack() {
        AbstractC2211791BhR provider = getProvider();
        if (provider != null) {
            return provider.LJIIIZ();
        }
        return false;
    }

    public final Function1<View, Boolean> getVisibilityChecker() {
        AbstractC2211791BhR provider = getProvider();
        if (provider != null) {
            return provider.LJIIJJI();
        }
        return null;
    }

    public final float getVisiblePercent() {
        Function0<Float> function0LJIILIIL;
        AbstractC2211791BhR provider = getProvider();
        if (provider != null && (function0LJIILIIL = provider.LJIILIIL()) != null) {
            return function0LJIILIIL.invoke().floatValue();
        }
        AbstractC2211791BhR provider2 = getProvider();
        if (provider2 != null) {
            return provider2.LJIIL();
        }
        return 0.5f;
    }

    public final boolean isCommon() {
        AbstractC2211791BhR provider = getProvider();
        if (provider != null) {
            return provider.LJIILJJIL();
        }
        return false;
    }

    public final int getActivityID() {
        return this.LLILZIL;
    }

    public final String getCarrierID$btm_release() {
        return this.LLIZ;
    }

    public final float getCurrentPiv() {
        return this.LLIZLLLIL;
    }

    public final Integer getDialogTag$btm_release() {
        return this.LLILZLL;
    }

    public final boolean getLastShowState() {
        return this.LLILZ;
    }

    public final EnumC2211841BhW getStrategy() {
        return this.LLILLL;
    }

    public final WeakReference<View> getViewRef() {
        return this.LL;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2211761BhO) || this.LL.get() != ((C2211761BhO) obj).LL.get()) {
            return false;
        }
        return true;
    }

    public final void setActivityID(int i) {
        this.LLILZIL = i;
    }

    public final void setCarrierID$btm_release(String str) {
        this.LLIZ = str;
    }

    public final void setCurrentPiv(float f) {
        this.LLIZLLLIL = f;
    }

    public final void setDialogTag$btm_release(Integer num) {
        this.LLILZLL = num;
    }

    public final void setLastShowState(boolean z) {
        this.LLILZ = z;
    }

    public C2211761BhO(WeakReference<View> weakReference, AbstractC2211791BhR abstractC2211791BhR) {
        Object tag;
        this.LL = weakReference;
        if (C1767060w5I.LIZ) {
            View view = weakReference.get();
            if (view != null) {
                tag = view.getTag(R.id.vshot_tag_provider);
            } else {
                tag = null;
            }
            if (tag instanceof C2190411Ao3) {
                ((C2190411Ao3) tag).LIZ.put(Integer.valueOf(hashCode()), abstractC2211791BhR);
            } else {
                C2190411Ao3 c2190411Ao3 = new C2190411Ao3();
                c2190411Ao3.LIZ.put(Integer.valueOf(hashCode()), abstractC2211791BhR);
                View view2 = weakReference.get();
                if (view2 != null) {
                    view2.setTag(R.id.vshot_tag_provider, c2190411Ao3);
                }
            }
        } else {
            this.LLILLJJLI = abstractC2211791BhR;
        }
        this.LLILLL = abstractC2211791BhR.LJIIJ();
        this.LLIZLLLIL = -1.0f;
    }
}
