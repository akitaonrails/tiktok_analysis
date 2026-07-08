package X;

import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import avg.f;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mf.a;

/* JADX INFO: renamed from: X.10FQ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10FQ extends C10FO {
    public static final /* synthetic */ int LLJ = 0;
    public final MutableLiveData<List<TranslatedRegion>> LLIZ;
    public boolean LLIZLLLIL;

    public final List<String> getRegionCodeList() {
        List<TranslatedRegion> value = this.LLIZ.getValue();
        if (value == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(value, 10));
        Iterator<TranslatedRegion> it2 = value.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().code);
        }
        return arrayList;
    }

    public final void setReadOnly(boolean z) {
        this.LLIZLLLIL = z;
        if (z) {
            this.LL.setIcon((C419910GdJ) null);
        }
    }

    public C10FQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZ = new MutableLiveData<>();
        InterfaceC1457290o1f accountService = C0CHQ.LIZ().getAccountService();
        if (accountService.isLogin() && accountService.LJIILIIL()) {
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            setLeftTuxIcon(R.raw.icon_scope);
            setTitle(2131844967);
            setLabelText("");
            View.OnClickListener aCListenerS162S0100000_28 = new ACListenerS162S0100000_28(this, 52);
            a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS162S0100000_28) : aCListenerS162S0100000_28);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(aVar);
            return;
        }
        int visibility2 = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, this);
    }
}
