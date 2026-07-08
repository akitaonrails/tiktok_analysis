package X;

import Y.ACListenerS168S0100000_34;
import Y.ARunnableS18S1100000_13;
import Y.ARunnableS26S1100000_21;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel;
import com.ss.android.ugc.aweme.minis.viewmodel.SingleLiveEvent;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1Aye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196981Aye {
    public final Activity LIZ;
    public MinisViewModel LIZIZ;
    public final boolean LIZJ;
    public final C1749280vcc LIZLLL;
    public final View LJ;
    public final InterfaceC2196671Ay9 LJFF;
    public C1295960jpS LJI;
    public C427870Gq9 LJII;
    public int LJIIIIZZ;
    public View LJIIIZ;
    public TuxTextView LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public TuxTextView LJIILIIL;
    public TuxTextView LJIILJJIL;
    public C2196581Ay0 LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;

    public final void LJI() {
        C1295960jpS c1295960jpS = this.LJI;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        C1295960jpS c1295960jpS2 = this.LJI;
        if (c1295960jpS2 != null) {
            C786410Ut5.LLD(8, c1295960jpS2);
        }
        this.LJI = null;
    }

    public final void LIZJ(C427870Gq9 c427870Gq9) {
        if (c427870Gq9 == null) {
            return;
        }
        C786410Ut5.P8(c427870Gq9, new ACListenerS168S0100000_34(this, 35));
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadIconImg, minisIconUrl:");
        sbLIZ.append(this.LJIIJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        String str = this.LJIIJJI;
        if (str != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(c427870Gq9);
            c1331670kl3LJIIIZ.LIZLLL("MinisStatusView");
            c1331670kl3LJIIIZ.LJIIJ(new C1265730j2h(this, 3));
        }
    }

    public final void LIZLLL(String str) {
        Activity activity = this.LIZ;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS18S1100000_13(this, str, 18));
        }
    }

    public final void LJ(String str) {
        Activity activity = this.LIZ;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS26S1100000_21(this, str, 3));
        }
    }

    public static void LIZIZ(Activity activity, String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jumpTermPage, url:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (activity != null) {
            SparkThirdContext sparkThirdContext = new SparkThirdContext();
            sparkThirdContext.url = str;
            sparkThirdContext.statusView = new C1905960zhK();
            sparkThirdContext.bizCert = new ThirdPartyBizCert(402685961);
            sparkThirdContext.actions = null;
            sparkThirdContext.disableOpenInSystem = true;
            sparkThirdContext.progressBar = new C1067800dtS();
            C1554300qY8.LIZIZ(activity, sparkThirdContext);
        }
    }

    public final void LJFF(TuxTextView tuxTextView, int i) {
        EnumC2192711Arl enumC2192711Arl;
        EnumC2192711Arl enumC2192711Arl2;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
        NetworkResponse<MinisMetaResp> value;
        MinisMetaResp minisMetaResp;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showDebugMsg, monitorCode:");
        sbLIZ.append(i);
        sbLIZ.append(", minisStage: ");
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        String str = null;
        if (schemaParserData != null) {
            enumC2192711Arl = schemaParserData.minisStage;
        } else {
            enumC2192711Arl = null;
        }
        sbLIZ.append(enumC2192711Arl);
        C2188811AlT.LIZIZ(sbLIZ);
        SchemaParserData schemaParserData2 = C2195221Avo.LJII;
        if (schemaParserData2 != null) {
            enumC2192711Arl2 = schemaParserData2.minisStage;
        } else {
            enumC2192711Arl2 = null;
        }
        if (enumC2192711Arl2 == EnumC2192711Arl.MINIS_STAGE_DEBUG) {
            MinisViewModel minisViewModel = this.LIZIZ;
            if (minisViewModel != null && (singleLiveEvent = minisViewModel.LLILLJJLI) != null && (value = singleLiveEvent.getValue()) != null && (minisMetaResp = value.data) != null) {
                str = minisMetaResp.clientKey;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ErrorCode:");
            sbLIZ2.append(i);
            sbLIZ2.append("\nClientKey:");
            sbLIZ2.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            if (tuxTextView != null) {
                tuxTextView.setGravity(3);
                tuxTextView.setText(strLIZIZ);
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                return;
            }
            return;
        }
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setGravity(3);
        tuxTextView.setText("");
        C786410Ut5.LLLLZLL(tuxTextView, 8);
    }

    public C2196981Aye(C19EG c19eg, MinisViewModel minisViewModel, boolean z, C1749280vcc c1749280vcc, View view, InterfaceC2196671Ay9 interfaceC2196671Ay9) {
        this.LIZ = c19eg;
        this.LIZIZ = minisViewModel;
        this.LIZJ = z;
        this.LIZLLL = c1749280vcc;
        this.LJ = view;
        this.LJFF = interfaceC2196671Ay9;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init, refresher:");
        sbLIZ.append(interfaceC2196671Ay9);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, android.graphics.drawable.Drawable] */
    public static void LIZ(C2196981Aye c2196981Aye, Context context, View view, InterfaceC2196671Ay9 interfaceC2196671Ay9, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        TextView textView;
        TextView textView2;
        C197039127h c197039127h;
        TuxTextView tuxTextView;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
        NetworkResponse<MinisMetaResp> value;
        MinisMetaResp minisMetaResp;
        String str;
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            z3 = false;
        }
        if ((i2 & 64) != 0) {
            z4 = false;
        }
        c2196981Aye.getClass();
        ImageView imageView = null;
        if (view != null) {
            imageView = (ImageView) view.findViewById(R.id.off);
            textView = (TextView) view.findViewById(R.id.ofh);
            textView2 = (TextView) view.findViewById(R.id.ofg);
            c197039127h = (C197039127h) view.findViewById(R.id.teg);
            tuxTextView = (TuxTextView) view.findViewById(R.id.ofe);
        } else {
            textView = null;
            textView2 = null;
            c197039127h = null;
            tuxTextView = null;
        }
        c2196981Aye.LJFF(tuxTextView, i);
        C259800zU c259800zU = new C259800zU();
        Activity activity = c2196981Aye.LIZ;
        if (activity != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.ph;
            c259800zU.element = c0hti.LIZ(activity);
        }
        String str2 = "";
        if (z3) {
            if (imageView != null) {
                imageView.setImageDrawable((Drawable) c259800zU.element);
            }
            if (textView != null) {
                textView.setText(context.getString(2131822202));
            }
            if (textView2 != null) {
                textView2.setText("");
            }
            if (c197039127h != null) {
                C786410Ut5.LLLLLLJ(c197039127h, 4);
                return;
            }
            return;
        }
        if (z) {
            if (imageView != null) {
                imageView.setImageDrawable((Drawable) c259800zU.element);
            }
            if (textView != null) {
                textView.setText(context.getString(2131822220));
            }
            if (textView2 != null) {
                textView2.setText("");
            }
            if (c197039127h == null) {
                return;
            }
            C786410Ut5.LLLLLLJ(c197039127h, 4);
            return;
        }
        if (z4) {
            if (imageView != null) {
                imageView.setImageDrawable((Drawable) c259800zU.element);
            }
            if (textView != null) {
                textView.setText(context.getString(2131822331));
            }
            String str3 = c2196981Aye.LJIIL;
            if (str3 != null && (!a0.LJJJIL(str3))) {
                str2 = str3;
            } else {
                MinisViewModel minisViewModel = c2196981Aye.LIZIZ;
                if (minisViewModel != null && (singleLiveEvent = minisViewModel.LLILLJJLI) != null && (value = singleLiveEvent.getValue()) != null && (minisMetaResp = value.data) != null && (str = minisMetaResp.name) != null) {
                    str2 = str;
                }
            }
            if (textView2 != null) {
                textView2.setText(C786410Ut5.j4(context.getString(2131822330), Arrays.copyOf(new Object[]{str2}, 1)));
            }
            if (c197039127h == null) {
                return;
            }
            C786410Ut5.LLLLLLJ(c197039127h, 4);
            return;
        }
        if (z2) {
            if (imageView != null) {
                imageView.setImageDrawable((Drawable) c259800zU.element);
            }
            if (textView != null) {
                textView.setText(context.getString(2131822210));
            }
            if (textView2 != null) {
                textView2.setText("");
            }
            if (c197039127h == null) {
                return;
            }
            C786410Ut5.LLLLLLJ(c197039127h, 4);
            return;
        }
        if (c197039127h != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 0);
            C786410Ut5.U8(c197039127h, new ACListenerS168S0100000_34(interfaceC2196671Ay9, 34));
        }
        if (imageView != null) {
            imageView.setImageDrawable((Drawable) c259800zU.element);
        }
        if (textView != null) {
            textView.setText(context.getString(2131822223));
        }
        if (textView2 == null) {
            return;
        }
        textView2.setText(context.getString(2131822222));
    }
}
