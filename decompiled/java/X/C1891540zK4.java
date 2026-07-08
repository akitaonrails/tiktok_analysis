package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.model.promote.PromoteModel;
import com.ss.android.ugc.aweme.commercialize.model.promote.PromoteTraffic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AFwS340S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zK4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891540zK4 implements C0SCM {
    public final InterfaceC1891550zK5 LL;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.C0SCM
    public final void open() {
        PromoteModel promoteModel;
        Boolean enableContainerStrategy;
        PromoteModel promoteModel2;
        PromoteTraffic traffic;
        String string = UUID.randomUUID().toString();
        Aweme aweme = this.LL.getAweme();
        Integer level = (aweme == null || (promoteModel2 = aweme.getPromoteModel()) == null || (traffic = promoteModel2.getTraffic()) == null) ? null : traffic.getLevel();
        Aweme aweme2 = this.LL.getAweme();
        boolean zBooleanValue = (aweme2 == null || (promoteModel = aweme2.getPromoteModel()) == null || (enableContainerStrategy = promoteModel.getEnableContainerStrategy()) == null) ? false : enableContainerStrategy.booleanValue();
        String strLIZLLL = C1911570zqN.LIZLLL(this.LL.getItemId(), this.LL.getEnterFrom(), Long.valueOf(System.currentTimeMillis()), this.LL.LIZIZ(), this.LL.getAweme(), string, this.LL.getPageType(), this.LL.LIZ(), this.LL.getSchema(), this.LL.getExtra());
        if (this.LL.getAweme() != null) {
            C1911570zqN c1911570zqN = C1911570zqN.LIZ;
            String strLIZ = this.LL.LIZ();
            String enterFrom = this.LL.getEnterFrom();
            c1911570zqN.getClass();
            if (C1911570zqN.LIZ(strLIZ, enterFrom) && C13LP.LJJJJ(level, C1866620yfs.LIZIZ)) {
                C1389805cG.LIZ();
                C1891520zK2 c1891520zK2 = C1891520zK2.LIZ;
                Context context = this.LL.getContext();
                c1891520zK2.getClass();
                C1891520zK2.LIZLLL = strLIZLLL;
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(strLIZLLL);
                c1537900q7g.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
                C1911600zqQ.LIZIZ.LJII(string, this.LL.getEnterFrom(), this.LL.LIZIZ());
                return;
            }
        }
        if (this.LL.getAweme() != null) {
            C1911570zqN c1911570zqN2 = C1911570zqN.LIZ;
            String strLIZ2 = this.LL.LIZ();
            String enterFrom2 = this.LL.getEnterFrom();
            c1911570zqN2.getClass();
            if (C1911570zqN.LIZ(strLIZ2, enterFrom2) && C1866610yfr.LIZIZ.contains(Integer.valueOf(C255850A0x.LIZ())) && !zBooleanValue) {
                C1891520zK2 c1891520zK22 = C1891520zK2.LIZ;
                Context context2 = this.LL.getContext();
                c1891520zK22.getClass();
                C1891520zK2.LIZLLL = strLIZLLL;
                C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
                SparkContext sparkContext2 = new SparkContext();
                sparkContext2.LJJLIIJ(strLIZLLL);
                c1537900q7g2.getClass();
                new C1541950qED(context2, sparkContext2).LIZIZ();
                C1911600zqQ.LIZIZ.LJII(string, this.LL.getEnterFrom(), this.LL.LIZIZ());
                return;
            }
        }
        if (!C113500bt.LIZ()) {
            C1049250dPX c1049250dPX = C1049250dPX.LIZ;
            Context context3 = this.LL.getContext();
            c1049250dPX.getClass();
            C1049250dPX.LIZIZ(context3, strLIZLLL);
            C1911600zqQ.LIZIZ.LJII(string, this.LL.getEnterFrom(), this.LL.LIZIZ());
            return;
        }
        C1537900q7g c1537900q7g3 = C1541950qED.LIZJ;
        Context context4 = this.LL.getContext();
        SparkContext sparkContext3 = new SparkContext();
        sparkContext3.LJJLIIJ(strLIZLLL);
        c1537900q7g3.getClass();
        new C1541950qED(context4, sparkContext3).LIZIZ();
        C1911600zqQ.LIZIZ.LJII(string, this.LL.getEnterFrom(), this.LL.LIZIZ());
    }

    @Override // X.C0SCM
    public final void preload() {
        String string;
        PromoteTraffic traffic;
        PromoteModel promoteModel;
        PromoteTraffic traffic2;
        PromoteModel promoteModel2;
        Boolean enableContainerStrategy;
        PromoteModel promoteModel3;
        PromoteTraffic traffic3;
        C1911570zqN.LJIIIZ();
        Aweme aweme = this.LL.getAweme();
        Integer level = (aweme == null || (promoteModel3 = aweme.getPromoteModel()) == null || (traffic3 = promoteModel3.getTraffic()) == null) ? null : traffic3.getLevel();
        Aweme aweme2 = this.LL.getAweme();
        boolean zBooleanValue = (aweme2 == null || (promoteModel2 = aweme2.getPromoteModel()) == null || (enableContainerStrategy = promoteModel2.getEnableContainerStrategy()) == null) ? false : enableContainerStrategy.booleanValue();
        Aweme aweme3 = this.LL.getAweme();
        if (((aweme3 == null || (promoteModel = aweme3.getPromoteModel()) == null || (traffic2 = promoteModel.getTraffic()) == null) ? false : Intrinsics.LJFF(traffic2.getNeedTrack(), Boolean.TRUE)) && C255850A0x.LIZ() == -1) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(System.currentTimeMillis() / 1000, "timestamp");
            c2344009Gk.LJIIIIZZ("uid", C1911570zqN.LJI());
            c2344009Gk.LJIIIIZZ("key", "Promote_entrance_performance_optimization");
            C20684815ws.LJIILLIIL("Promote_libra_track", c2344009Gk.LIZ);
        }
        String strLIZLLL = C1911570zqN.LIZLLL(this.LL.getItemId(), this.LL.getEnterFrom(), null, this.LL.LIZIZ(), this.LL.getAweme(), null, this.LL.getPageType(), this.LL.LIZ(), this.LL.getSchema(), this.LL.getExtra());
        if (this.LL.getAweme() != null) {
            C1911570zqN c1911570zqN = C1911570zqN.LIZ;
            String strLIZ = this.LL.LIZ();
            String enterFrom = this.LL.getEnterFrom();
            c1911570zqN.getClass();
            if (C1911570zqN.LIZ(strLIZ, enterFrom) && C13LP.LJJJJ(level, C1866620yfs.LIZIZ)) {
                String str = C1389805cG.LIZ;
                String itemId = this.LL.getItemId();
                Aweme aweme4 = this.LL.getAweme();
                if (itemId == null || aweme4 == null) {
                    return;
                }
                Map<String, C09AE> map = C1389805cG.LIZIZ;
                if (map.containsKey(itemId)) {
                    return;
                }
                PromoteModel promoteModel4 = aweme4.getPromoteModel();
                map.put(itemId, C23250099c.LIZLLL(C1389805cG.LIZJ, null, null, new C1891470zJx(aweme4, itemId, (promoteModel4 == null || (traffic = promoteModel4.getTraffic()) == null) ? null : traffic.getLevel(), strLIZLLL, null), 3));
                return;
            }
        }
        if (this.LL.getAweme() != null) {
            C1911570zqN c1911570zqN2 = C1911570zqN.LIZ;
            String strLIZ2 = this.LL.LIZ();
            String enterFrom2 = this.LL.getEnterFrom();
            c1911570zqN2.getClass();
            if (C1911570zqN.LIZ(strLIZ2, enterFrom2) && C1866610yfr.LIZJ.contains(Integer.valueOf(C255850A0x.LIZ())) && !zBooleanValue) {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LIZLLL(System.currentTimeMillis() / 1000, "timestamp");
                c2344009Gk2.LJIIIIZZ("uid", C1911570zqN.LJI());
                c2344009Gk2.LJIIIIZZ("key", "performance_opt_pre_create");
                C20684815ws.LJIILLIIL("Promote_libra_track", c2344009Gk2.LIZ);
                if (C1866610yfr.LIZIZ.contains(Integer.valueOf(C255850A0x.LIZ()))) {
                    C1891520zK2.LIZ.getClass();
                    C1529880puk c1529880puk = SparkContext.Companion;
                    String str2 = C1891520zK2.LIZIZ;
                    c1529880puk.getClass();
                    if (C1529880puk.LIZIZ(str2) == null) {
                        C1891520zK2.LIZJ = false;
                        C1537060q6K c1537060q6K = C1529590puH.LIZ;
                        C1097680efe c1097680efe = new C1097680efe();
                        c1097680efe.LJIIZILJ = true;
                        c1097680efe.LIZ = "tiktok_promote_spark_biz";
                        c1097680efe.LJ = true;
                        c1097680efe.LJIJ = 1;
                        c1097680efe.LJIJI = 600;
                        c1097680efe.LJIIIIZZ = AnonymousClass0208.get$arr$(68);
                        c1097680efe.LJIJJ = AFwS340S0000000_17.get$arr$(2);
                        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
                    }
                    if (strLIZLLL == null || a0.LJJJIL(strLIZLLL)) {
                        string = "";
                    } else {
                        Uri uriLJIIIIZZ = C1911570zqN.LJIIIIZZ(UriProtector.parse(strLIZLLL));
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJIIIIZZ, "url");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                            String string2 = C1911570zqN.LJIIIIZZ(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)).toString();
                            Uri.Builder builderClearQuery = uriLJIIIIZZ.buildUpon().clearQuery();
                            for (String str3 : UriProtector.getQueryParameterNames(uriLJIIIIZZ)) {
                                if (Intrinsics.LJFF(str3, "url")) {
                                    builderClearQuery.appendQueryParameter(str3, string2);
                                } else {
                                    Iterator<String> it2 = UriProtector.getQueryParameters(uriLJIIIIZZ, str3).iterator();
                                    while (it2.hasNext()) {
                                        builderClearQuery.appendQueryParameter(str3, it2.next());
                                    }
                                }
                            }
                            uriLJIIIIZZ = builderClearQuery.build();
                        }
                        string = uriLJIIIIZZ.toString();
                    }
                    C1891520zK2.LIZ(string);
                    return;
                }
            }
        }
        if (C113500bt.LIZ()) {
            return;
        }
        C1049250dPX c1049250dPX = C1049250dPX.LIZ;
        Context context = this.LL.getContext();
        c1049250dPX.getClass();
        C1049250dPX.LIZ(context, strLIZLLL, false);
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1891550zK5 Mh() {
        return this.LL;
    }

    public C1891540zK4(InterfaceC1891550zK5 interfaceC1891550zK5) {
        this.LL = interfaceC1891550zK5;
    }
}
