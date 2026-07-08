package X;

import X.C1C7U;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.search.general.live.SearchLiveProductAnchorView$handler$1;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Q29, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q29 extends LinearLayout implements IExtendedTopLiveProductView {
    public static final /* synthetic */ int LLJILLL = 0;
    public final Function0<Unit> LL;
    public C655440PnK LLILLJJLI;
    public C654590Plx LLILLL;
    public InterfaceC662740Pz6 LLILZ;
    public String LLILZIL;
    public EnumC657940PrM LLILZLL;
    public String LLIZ;
    public final ConstraintLayout LLIZLLLIL;
    public final SmartImageView LLJ;
    public final TuxTextView LLJI;
    public final ViewFlipper LLJIJIL;
    public String LLJILJIL;
    public final SearchLiveProductAnchorView$handler$1 LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public View getView() {
        return this;
    }

    public final Product getProductInfo() {
        Aweme aweme;
        List<Product> productsInfo;
        C655440PnK c655440PnK = this.LLILLJJLI;
        if (c655440PnK == null || (aweme = c655440PnK.LIZ) == null || (productsInfo = aweme.getProductsInfo()) == null) {
            return null;
        }
        return (Product) C13LP.LJJJLL(productsInfo);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void pauseDisplay() {
        removeMessages(1);
        ViewFlipper viewFlipper = this.LLJIJIL;
        if (viewFlipper != null) {
            Animation inAnimation = viewFlipper.getInAnimation();
            Animation outAnimation = viewFlipper.getOutAnimation();
            viewFlipper.setInAnimation(null);
            viewFlipper.setOutAnimation(null);
            viewFlipper.setDisplayedChild(0);
            viewFlipper.setInAnimation(inAnimation);
            viewFlipper.setOutAnimation(outAnimation);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void resumeDisplay() {
        ViewFlipper viewFlipper = this.LLJIJIL;
        if (viewFlipper == null || viewFlipper.getChildCount() <= 1) {
            return;
        }
        ViewFlipper viewFlipper2 = this.LLJIJIL;
        if (viewFlipper2 != null) {
            viewFlipper2.setInAnimation(null);
            viewFlipper2.setOutAnimation(null);
            viewFlipper2.setDisplayedChild(0);
            try {
                viewFlipper2.setInAnimation(AnimationUtils.loadAnimation(viewFlipper2.getContext(), R.anim.lk));
                viewFlipper2.setOutAnimation(AnimationUtils.loadAnimation(viewFlipper2.getContext(), R.anim.lj));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                viewFlipper2.setInAnimation(null);
                viewFlipper2.setOutAnimation(null);
                C1AF0.LIZJ("Search live ecom anchor animation load error");
            }
        }
        removeMessages(1);
        sendEmptyMessageDelayed(1, 2000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            C662730Pz5 c662730Pz5 = C662730Pz5.LIZ;
            Product productInfo = getProductInfo();
            C655440PnK c655440PnK = this.LLILLJJLI;
            C654590Plx c654590Plx = this.LLILLL;
            InterfaceC662740Pz6 interfaceC662740Pz6 = this.LLILZ;
            String str = this.LLJILJIL;
            String str2 = this.LLIZ;
            PageFinder pageFinderVia = PageFinder.via((View) this);
            EnumC657940PrM enumC657940PrM = this.LLILZLL;
            c662730Pz5.getClass();
            C662730Pz5.LIZJ(productInfo, c655440PnK, c654590Plx, interfaceC662740Pz6, str, str2, pageFinderVia, enumC657940PrM);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("Search live ecom anchor show et error");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pauseDisplay();
        removeCallbacksAndMessages(null);
    }

    public final String getEntranceForm() {
        return this.LLJILJIL;
    }

    public final void setEntranceForm(String str) {
        this.LLJILJIL = str;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView
    public void setLiveProductSearchAbility(InterfaceC662740Pz6 interfaceC662740Pz6) {
        this.LLILZ = interfaceC662740Pz6;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c0  */
    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindProductData(X.C655440PnK r16, X.EnumC657940PrM r17) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Q29.bindProductData(X.0PnK, X.0PrM):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.ecommerce.search.general.live.SearchLiveProductAnchorView$handler$1] */
    public C0Q29(Context context, Function0 function0, int i) {
        C19ME c19me;
        super(context, null, 0);
        function0 = (i & 8) != 0 ? AFwS196S0000000_10.get$arr$(595) : function0;
        this.LL = function0;
        this.LLJILJIL = "search_live_single_entrance_without_discount";
        final Looper mainLooper = Looper.getMainLooper();
        this.LLJILJILJ = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.ecommerce.search.general.live.SearchLiveProductAnchorView$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("SearchLiveProductAnchorView@fc1f.handler$1");
                ViewFlipper viewFlipper = this.LL.LLJIJIL;
                if (viewFlipper != null && message.what == 1 && viewFlipper.getChildCount() > 1) {
                    ViewFlipper viewFlipper2 = this.LL.LLJIJIL;
                    if (viewFlipper2 != null) {
                        viewFlipper2.showNext();
                    }
                    sendEmptyMessageDelayed(1, 2000L);
                }
                C1C7U.LIZIZ("SearchLiveProductAnchorView@fc1f.handler$1");
            }
        };
        ConstraintLayout constraintLayout = (ConstraintLayout) C786410Ut5.LJLLJ(context, R.layout.brd, this).findViewById(R.id.ggt);
        this.LLIZLLLIL = constraintLayout;
        this.LLJ = (SmartImageView) constraintLayout.findViewById(R.id.rx4);
        this.LLJI = (TuxTextView) constraintLayout.findViewById(R.id.rx7);
        ViewFlipper viewFlipper = (ViewFlipper) constraintLayout.findViewById(R.id.rx5);
        this.LLJIJIL = viewFlipper;
        ViewGroup.LayoutParams layoutParams = viewFlipper != null ? viewFlipper.getLayoutParams() : null;
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            ((ViewGroup.MarginLayoutParams) c19me).width = 0;
            c19me.endToEnd = 0;
            ViewFlipper viewFlipper2 = this.LLJIJIL;
            if (viewFlipper2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFlipper2);
                viewFlipper2.setLayoutParams(c19me);
            }
        }
        try {
            constraintLayout.setOutlineProvider(new C0IDA(context.getResources().getDimensionPixelSize(R.dimen.b3z), 10));
            constraintLayout.setClipToOutline(true);
            C189200o6.m2constructorimpl(constraintLayout);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LLJ.setForeground(new ColorDrawable(134217728));
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView
    public final void bindExtraProductData(C654590Plx c654590Plx, String str, String str2) {
        this.LLILLL = c654590Plx;
        this.LLILZIL = str;
        this.LLIZ = str2;
    }
}
