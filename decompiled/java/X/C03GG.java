package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.dependency.network.NetworkUtilDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.03GG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03GG extends LinearLayout {
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;

    public final Map<String, Object> getExtraParams() {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            INetworkUtilDependencyService iNetworkUtilDependencyServiceCreateINetworkUtilDependencyServicebyMonsterPlugin = NetworkUtilDependencyService.createINetworkUtilDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, INetworkUtilDependencyService.class.getName(), iNetworkUtilDependencyServiceCreateINetworkUtilDependencyServicebyMonsterPlugin != null ? iNetworkUtilDependencyServiceCreateINetworkUtilDependencyServicebyMonsterPlugin.getClass().getName() : null, iNetworkUtilDependencyServiceCreateINetworkUtilDependencyServicebyMonsterPlugin != null);
            iECommerceHostService = iNetworkUtilDependencyServiceCreateINetworkUtilDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(INetworkUtilDependencyService.class);
        }
        return C2097908Jt.LIZJ(new Pair("network_type", Integer.valueOf(((INetworkUtilDependencyService) iECommerceHostService).isWifi(getContext()) ? 1 : 0)));
    }

    public C03GG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        SmartImageView smartImageView = new SmartImageView(context);
        this.LL = smartImageView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LLILLJJLI = tuxTextView;
        setOrientation(1);
        setGravity(1);
        setBackground(C14MI.LIZ(context, R.drawable.b6x));
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C786410Ut5.G6(this.LL, layoutParams);
        addView(smartImageView);
        C786410Ut5.R6(this.LLILLJJLI, new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setMaxHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        addView(tuxTextView);
        setGravity(17);
        tuxTextView.setTextAlignment(4);
    }
}
