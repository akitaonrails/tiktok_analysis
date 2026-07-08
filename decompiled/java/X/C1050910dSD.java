package X;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0dSD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050910dSD extends AbstractC1066890drz {
    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "app_page";
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        AFwS204S0000000_16 aFwS204S0000000_16 = AFwS204S0000000_16.get$arr$(378);
        return new C1400390mXt(aFwS204S0000000_16, aFwS204S0000000_16, aFwS204S0000000_16, aFwS204S0000000_16, null, 16);
    }

    public final void LJJIJIIJIL() {
        String schema;
        String schema2;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null || schema.length() <= 0) {
            return;
        }
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 == null || (schema2 = anchorCommonStruct2.getSchema()) == null) {
            schema2 = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        LJJIJIIJI(c2344009Gk, UriProtector.parse(schema2));
        C20684815ws.LJIILLIIL("livesdk_live_studio_permission_application_gip_hinge_show", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1050910dSD();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.GO_LIVE_STUDIO_ANCHOR.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        super.p1(c2344009Gk);
        LJJIJIIJIL();
    }

    public final void LJJIJIIJI(C2344009Gk c2344009Gk, Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri uri2;
        Aweme awemeLJIIZILJ = LJIIZILJ();
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && (uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "ls_glip_track_id");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        c2344009Gk.LJFF("ls_glip_track_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        c2344009Gk.LJFF("hinge_type", "live_studio_permission_application");
        c2344009Gk.LJFF("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJFF("item_id", awemeLJIIZILJ.getAid());
        c2344009Gk.LJFF("item_author_id", AwemeExtKt.getAuthorUid(awemeLJIIZILJ));
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String schema;
        String schema2;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null && schema.length() > 0) {
            InterfaceC1392640mLO interfaceC1392640mLO = null;
            if (1 != 0) {
                AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
                if (anchorCommonStruct2 == null || (schema2 = anchorCommonStruct2.getSchema()) == null) {
                    schema2 = "";
                }
                Uri uri = UriProtector.parse(schema2);
                InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
                if (interfaceC1392640mLO2 != null) {
                    interfaceC1392640mLO = interfaceC1392640mLO2;
                }
                Activity activityLIZIZ = interfaceC1392640mLO.LIZIZ();
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(schema2);
                c1537900q7g.getClass();
                new C1541950qED(activityLIZIZ, sparkContext).LIZIZ();
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                LJJIJIIJI(c2344009Gk2, uri);
                C20684815ws.LJIILLIIL("livesdk_live_studio_permission_application_gip_hinge_click", c2344009Gk2.LIZ);
            }
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLIIL(C712520RxC c712520RxC, Dialog dialog, boolean z, boolean z2, boolean z3) {
        LJJIJIIJIL();
    }
}
