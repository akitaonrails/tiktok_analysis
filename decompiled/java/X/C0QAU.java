package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0QAU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QAU extends LinearLayout implements IExtendedTopLiveProductView {
    public static final /* synthetic */ int LLJJIJI = 0;
    public final int LL;
    public final Function0<Unit> LLILLJJLI;
    public LinearLayout LLILLL;
    public final LinearLayout LLILZ;
    public final TuxIconView LLILZIL;
    public final SmartImageView LLILZLL;
    public final ConstraintLayout LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxIconView LLJ;
    public C655440PnK LLJI;
    public C654590Plx LLJIJIL;
    public InterfaceC662740Pz6 LLJILJIL;
    public String LLJILJILJ;
    public Product LLJILLL;
    public List<String> LLJJ;
    public EnumC657940PrM LLJJI;
    public String LLJJIII;

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public View getView() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void pauseDisplay() {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void resumeDisplay() {
    }

    public final LinearLayout getContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eqx);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final void setContainerFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView
    public void setLiveProductSearchAbility(InterfaceC662740Pz6 interfaceC662740Pz6) {
        this.LLJILJIL = interfaceC662740Pz6;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindProductData(X.C655440PnK r10, X.EnumC657940PrM r11) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QAU.bindProductData(X.0PnK, X.0PrM):void");
    }

    public C0QAU(Context context, int i, AwS554S0100000_10 awS554S0100000_10) {
        super(context, null, 0);
        this.LL = i;
        this.LLILLJJLI = awS554S0100000_10;
        this.LLJJ = new ArrayList();
        this.LLILZ = (LinearLayout) C786410Ut5.LJLLJ(context, R.layout.f0f, this);
        this.LLILZIL = (TuxIconView) findViewById(R.id.rxr);
        this.LLILZLL = (SmartImageView) findViewById(R.id.rxs);
        this.LLIZLLLIL = (TuxTextView) findViewById(R.id.rzz);
        this.LLJ = (TuxIconView) findViewById(R.id.rx8);
        this.LLIZ = (ConstraintLayout) findViewById(R.id.xlh);
        addOnAttachStateChangeListener(new C0R45(this, 38));
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView
    public final void bindExtraProductData(C654590Plx c654590Plx, String str, String str2) {
        this.LLJIJIL = c654590Plx;
        this.LLJILJILJ = str;
        this.LLJJIII = str2;
    }
}
