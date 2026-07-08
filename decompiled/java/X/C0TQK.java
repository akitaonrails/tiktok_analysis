package X;

import Y.AObserverS216S0100000_12;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty.ThirdPartyAdvertiserList;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty.ThirdPartyVM;
import com.zhiliaoapp.musically.R;
import defpackage.AdvertiserModel;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TQK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0TQK extends BaseActivity {
    public ThirdPartyVM LLILLJJLI;
    public C0TQL LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public final ArrayList<AdvertiserModel> LL = new ArrayList<>();
    public final HashMap<String, Integer> LLILLL = new HashMap<>();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 354));

    public void LLLLLZL() {
    }

    public C0TQL LLLLZLL() {
        return null;
    }

    public void LLLLZLLIL(C0TQQ c0tqq) {
    }

    public void LLLLZLLLI() {
    }

    public abstract void LLLZIL(ThirdPartyAdvertiserList thirdPartyAdvertiserList);

    public final C0TQL LLLLZI() {
        C0TQL c0tql = this.LLILZ;
        if (c0tql != null) {
            return c0tql;
        }
        return null;
    }

    public final ThirdPartyVM LLLLZIL() {
        ThirdPartyVM thirdPartyVM = this.LLILLJJLI;
        if (thirdPartyVM != null) {
            return thirdPartyVM;
        }
        return null;
    }

    public final void init() {
        this.LLILLJJLI = (ThirdPartyVM) ViewModelProviders.of(this, new C786090UsZ(4)).get(ThirdPartyVM.class);
        C0TQL c0tqlLLLLZLL = LLLLZLL();
        if (c0tqlLLLLZLL == null) {
            c0tqlLLLLZLL = new C0TQL();
        }
        this.LLILZ = c0tqlLLLLZLL;
        LLLLZI().LLILLJJLI = this.LL;
        LLLLZI().LLILLL = (C0TQD) this.LLIZLLLIL.getValue();
        LLLLZIL().LLILLJJLI.observe(this, new AObserverS216S0100000_12(this, 109));
        LLLLZIL().LLILLL.observe(this, new AObserverS216S0100000_12(this, 110));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        activityConfiguration(AFwS245S0000000_12.get$arr$(64));
        super.onCreate(bundle);
        setTheme(R.style.my);
        init();
    }

    public final void LLLZ(int i, Integer num, Integer num2, Long l) {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIIZ(i);
        if (num != null) {
            c1389890mGx.LJFF(num.intValue());
        }
        if (num2 != null) {
            c1389890mGx.LJII(num2.intValue());
        }
        if (l != null) {
            c1389890mGx.LIZLLL(l.longValue());
        }
        c1389890mGx.LJIIJJI();
    }
}
