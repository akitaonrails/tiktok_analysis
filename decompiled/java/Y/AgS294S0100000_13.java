package Y;

import X.AbstractC845670XFl;
import X.AbstractC845740XFs;
import X.C0XG1;
import X.C0XGR;
import X.C0XYO;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C1954807lC;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C793770VBv;
import X.C845580XFc;
import X.C845650XFj;
import X.C845680XFm;
import X.C845690XFn;
import X.C845700XFo;
import X.C845730XFr;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.sdk.account.otl.OneTapLoginShareInfo;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AgS294S0100000_13 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS294S0100000_13(SOTLFragment sOTLFragment, int i) {
        this.$t = i;
        this.l0 = sOTLFragment;
    }

    public static final Object emit$0(AgS294S0100000_13 agS294S0100000_13, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws JSONException {
        AbstractC845740XFs abstractC845740XFs = (AbstractC845740XFs) obj;
        if (abstractC845740XFs instanceof C0XG1) {
            SOTLFragment sOTLFragment = (SOTLFragment) agS294S0100000_13.l0;
            sOTLFragment.getClass();
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("login_panel_type", sOTLFragment.ZR().LL);
            c0xgr.LIZLLL("platform", sOTLFragment.ZR().LL);
            c0xgr.LIZLLL("is_register", CardStruct.IStatusCode.DEFAULT);
            c0xgr.LIZLLL("enter_from", sOTLFragment.SR().getEnterFrom());
            c0xgr.LIZLLL("enter_method", sOTLFragment.SR().getEnterMethod());
            C20684815ws.LJIILLIIL("login_success", c0xgr.LIZ);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("platform", sOTLFragment.ZR().LL);
            C793770VBv.LJII("login_success", jSONObject, null, null);
            C0XYO.LIZLLL(C0XYO.LIZ, ((SOTLFragment) agS294S0100000_13.l0).getActivity(), null, ((C0XG1) abstractC845740XFs).LIZ, false, null, false, 112);
        } else if (abstractC845740XFs instanceof C845730XFr) {
            SOTLFragment sOTLFragment2 = (SOTLFragment) agS294S0100000_13.l0;
            C845730XFr c845730XFr = (C845730XFr) abstractC845740XFs;
            String str = c845730XFr.LIZIZ;
            sOTLFragment2.getClass();
            C0XGR c0xgr2 = new C0XGR();
            c0xgr2.LIZLLL("login_panel_type", sOTLFragment2.ZR().LL);
            c0xgr2.LIZLLL("platform", sOTLFragment2.ZR().LL);
            c0xgr2.LIZLLL("is_register", CardStruct.IStatusCode.DEFAULT);
            c0xgr2.LIZLLL("error_code", str);
            c0xgr2.LIZLLL("enter_from", sOTLFragment2.SR().getEnterFrom());
            c0xgr2.LIZLLL("enter_method", sOTLFragment2.SR().getEnterMethod());
            C20684815ws.LJIILLIIL("login_failure", c0xgr2.LIZ);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("platform", sOTLFragment2.ZR().LL);
            jSONObject2.put("error_code", str);
            C793770VBv.LJII("login_failure", jSONObject2, null, null);
            C19EG activity = ((SOTLFragment) agS294S0100000_13.l0).getActivity();
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(c845730XFr.LIZ);
                c1389890mGx.LJIIJJI();
            }
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS294S0100000_13 agS294S0100000_13, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str;
        Pair pair = (Pair) obj;
        AbstractC845670XFl abstractC845670XFl = (AbstractC845670XFl) pair.getFirst();
        boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
        SOTLFragment sOTLFragment = (SOTLFragment) agS294S0100000_13.l0;
        String str2 = null;
        if (!sOTLFragment.LLILZIL) {
            sOTLFragment.LLILZIL = true;
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("login_panel_type", "SOTL");
            c0xgr.LIZLLL("enter_from", ((SOTLFragment) agS294S0100000_13.l0).SR().getEnterFrom());
            c0xgr.LIZLLL("enter_method", ((SOTLFragment) agS294S0100000_13.l0).SR().getEnterMethod());
            AbstractC845670XFl abstractC845670XFl2 = ((SOTLFragment) agS294S0100000_13.l0).LLIZ;
            if (abstractC845670XFl2 instanceof C845650XFj) {
                str = "token_available";
            } else if (abstractC845670XFl2 instanceof C845700XFo) {
                str = "no_token";
            } else if (abstractC845670XFl2 instanceof C845690XFn) {
                str = "loading";
            } else if (abstractC845670XFl2 instanceof C845680XFm) {
                str = "idle";
            } else {
                throw new C1954807lC();
            }
            c0xgr.LIZLLL("sotl_token_query_status", str);
            C20684815ws.LJIILLIIL("login_notify", c0xgr.LIZ);
            C793770VBv.LJII("login_notify", null, null, null);
        }
        if (zBooleanValue) {
            View view = ((SOTLFragment) agS294S0100000_13.l0).getView();
            if (view != null) {
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.vpz);
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.vpv);
                TuxSpinner tuxSpinner = (TuxSpinner) view.findViewById(R.id.vpx);
                View viewFindViewById = view.findViewById(R.id.vq1);
                C786410Ut5.LJZL(4, linearLayout);
                C786410Ut5.LJZL(4, linearLayout2);
                C786410Ut5.LLZILL(tuxSpinner, 0);
                viewFindViewById.setClickable(false);
            }
        } else {
            SOTLFragment sOTLFragment2 = (SOTLFragment) agS294S0100000_13.l0;
            View view2 = sOTLFragment2.getView();
            if (view2 != null) {
                LinearLayout linearLayout3 = (LinearLayout) view2.findViewById(R.id.vpz);
                LinearLayout linearLayout4 = (LinearLayout) view2.findViewById(R.id.vpv);
                TuxSpinner tuxSpinner2 = (TuxSpinner) view2.findViewById(R.id.vpx);
                View viewFindViewById2 = view2.findViewById(R.id.vq1);
                if (abstractC845670XFl instanceof C845650XFj) {
                    C786410Ut5.LLZILL(tuxSpinner2, 8);
                    C786410Ut5.LJZL(8, linearLayout4);
                    C786410Ut5.LJZL(0, linearLayout3);
                    viewFindViewById2.setClickable(true);
                    TextView textView = (TextView) view2.findViewById(R.id.vq3);
                    SmartImageView smartImageView = (SmartImageView) view2.findViewById(R.id.vpi);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    C845650XFj c845650XFj = (C845650XFj) abstractC845670XFl;
                    sbLIZ.append(c845650XFj.LIZ.username);
                    textView.setText(C2188811AlT.LIZIZ(sbLIZ));
                    OneTapLoginShareInfo oneTapLoginShareInfo = c845650XFj.LIZ;
                    String str3 = oneTapLoginShareInfo.avatarUrl;
                    if (str3.length() > 0 && !C845580XFc.LIZJ(str3)) {
                        str2 = str3;
                    } else if (sOTLFragment2.ZR().LLILZIL.getValue() != null && Intrinsics.LJFF(null, oneTapLoginShareInfo.username)) {
                        throw null;
                    }
                    Context context = view2.getContext();
                    if (str2 != null) {
                        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                        c1331670kl3LJIIIZ.LIZLLL("SOTLFragment");
                        c1331670kl3LJIIIZ.LJJIIZI(new TuxIconDrawable(context, R.raw.icon_color_default_avatar));
                        c1331670kl3LJIIIZ.LJJ(smartImageView);
                        C786410Ut5.h3(c1331670kl3LJIIIZ);
                    } else {
                        smartImageView.setImageDrawable(new TuxIconDrawable(context, R.raw.icon_color_default_avatar));
                    }
                } else {
                    C786410Ut5.LLZILL(tuxSpinner2, 8);
                    C786410Ut5.LJZL(8, linearLayout3);
                    C786410Ut5.LJZL(0, linearLayout4);
                    viewFindViewById2.setClickable(true);
                }
            }
            if (abstractC845670XFl instanceof C845650XFj) {
                SOTLFragment sOTLFragment3 = (SOTLFragment) agS294S0100000_13.l0;
                if (!sOTLFragment3.LLILZLL) {
                    sOTLFragment3.LLILZLL = true;
                    C0XGR c0xgr2 = new C0XGR();
                    c0xgr2.LIZLLL("enter_from", ((SOTLFragment) agS294S0100000_13.l0).SR().getEnterFrom());
                    c0xgr2.LIZLLL("enter_method", ((SOTLFragment) agS294S0100000_13.l0).SR().getEnterMethod());
                    C20684815ws.LJIILLIIL("sotl_panel_button_change", c0xgr2.LIZ);
                }
            }
        }
        return Unit.LIZ;
    }
}
