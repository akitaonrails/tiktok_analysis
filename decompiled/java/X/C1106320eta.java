package X;

import Y.ACListenerS152S0100000_17;
import Y.ACListenerS86S1100000_17;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106320eta implements InterfaceC1106350etd {
    public final Uri LIZ;
    public final WeakReference<SparkContext> LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;

    @Override // X.InterfaceC1106350etd
    public final View LIZ() {
        SparkSchemaParam sparkSchemaParamLJJJI;
        int radius;
        LayoutInflater layoutInflater;
        Context topContext;
        SparkContext sparkContext = this.LIZIZ.get();
        if (sparkContext != null) {
            C1529880puk c1529880puk = SparkContext.Companion;
            sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
        } else {
            sparkSchemaParamLJJJI = null;
        }
        AbsSparkPopupSchemaParam absSparkPopupSchemaParam = sparkSchemaParamLJJJI instanceof SparkPopupSchemaParam ? (AbsSparkPopupSchemaParam) sparkSchemaParamLJJJI : null;
        if (absSparkPopupSchemaParam != null) {
            radius = absSparkPopupSchemaParam.getRadius();
            absSparkPopupSchemaParam.setRadius(0);
        } else {
            radius = 0;
        }
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        Object objH2 = (iHostAction == null || (topContext = iHostAction.getTopContext()) == null) ? null : C786410Ut5.H2(topContext, "layout_inflater");
        if (!(objH2 instanceof LayoutInflater) || (layoutInflater = (LayoutInflater) objH2) == null) {
            return null;
        }
        View viewSd = C786410Ut5.Sd(R.layout.gp0, layoutInflater, null);
        C786410Ut5.W5(viewSd, new ViewGroup.LayoutParams(-1, C497740JfY.LJIIIZ(R.dimen.azu)));
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZ, "title");
        if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            ((TextView) viewSd.findViewById(R.id.y0i)).setText(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZ, "show_title_close"), "1") || Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZ, "show_title_close"), "true")) {
            View viewFindViewById = viewSd.findViewById(R.id.y0a);
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 89), viewFindViewById);
        }
        if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZ, "show_title_back"), "1")) {
            View viewFindViewById2 = viewSd.findViewById(R.id.y09);
            SparkContext sparkContext2 = this.LIZIZ.get();
            if (sparkContext2 != null) {
                sparkContext2.LJJJJZI(new C1151940g5A(viewFindViewById2, 3));
            }
        }
        boolean z = Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZ, "show_title_share"), "1") || Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZ, "show_title_share"), "true");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZ, "url");
        if (z && !TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
            View viewFindViewById3 = viewSd.findViewById(R.id.y0h);
            C786410Ut5.LJLLLLLL(0, viewFindViewById3);
            C786410Ut5.I7(new ACListenerS86S1100000_17(this, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, 2), viewFindViewById3);
        }
        C417850GZz.LIZJ(radius, viewSd);
        this.LIZJ = Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZ, "title_bar_share_add_report_action"), "1") || Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZ, "title_bar_share_add_report_action"), "true");
        this.LIZLLL = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZ, "report_schema");
        return viewSd;
    }

    public C1106320eta(Uri uri, SparkContext sparkContext) {
        this.LIZ = uri;
        this.LIZIZ = new WeakReference<>(sparkContext);
    }
}
