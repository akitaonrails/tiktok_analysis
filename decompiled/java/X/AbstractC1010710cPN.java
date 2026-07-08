package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;

/* JADX INFO: renamed from: X.0cPN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1010710cPN<T extends View> implements C0PPF {
    public final C1010580cPA LL;
    public final Aweme LLILLJJLI;
    public final AwemeSearchAdModel LLILLL;
    public final Context LLILZ;
    public final LifecycleOwner LLILZIL;

    public abstract T LIZIZ();

    public void LIZJ(InterfaceC1010450cOx interfaceC1010450cOx) {
    }

    public boolean LJFF(C1010580cPA c1010580cPA) {
        return true;
    }

    @Override // X.C0PPF
    public void bind() {
    }

    @Override // X.C0PPF
    public void onViewAttachedToWindow() {
    }

    @Override // X.C0PPF
    public void onViewDetachedFromWindow() {
    }

    public AbstractC1010710cPN(C1010580cPA c1010580cPA) {
        AwemeSearchAdModel searchAdInfo;
        Context context;
        AwemeRawAd awemeRawAd;
        this.LL = c1010580cPA;
        Aweme aweme = c1010580cPA.LJI.getAweme();
        this.LLILLJJLI = aweme;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            searchAdInfo = awemeRawAd.getSearchAdInfo();
        } else {
            searchAdInfo = null;
        }
        this.LLILLL = searchAdInfo;
        ViewGroup viewGroup = c1010580cPA.LIZ;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        this.LLILZ = context;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        ViewGroup viewGroup2 = c1010580cPA.LIZ;
        Context context2 = c1010580cPA.LJI.getContext();
        C19EG c19egLIZIZ = context2 != null ? C1388190mED.LIZIZ(context2) : null;
        sAFHelper.getClass();
        this.LLILZIL = SAFHelper.LJIJI(viewGroup2, c19egLIZIZ);
    }
}
