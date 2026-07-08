package X;

import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;
import qo2.w;
import tikcast.api.wallet.tiktok.GetABSStatusResponse;

/* JADX INFO: renamed from: X.0x1X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class DialogC1803170x1X extends AbstractDialogC972150bPB {
    public final Context LLJI;
    public final InterfaceC1796910wrR LLJIJIL;
    public final DialogC780480UjW LLJILJIL;
    public InterfaceC1797090wrj LLJILJILJ;
    public View LLJILLL;
    public TextView LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public final List<ImageView> LLJJIJI;
    public ImageView LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public Diamond LLJJJ;
    public GetABSStatusResponse.ABSData LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public boolean LLJJJJLIIL;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g7a;
    }

    public final String LJL() {
        int iHashCode;
        String str;
        GetABSStatusResponse.ABSData aBSData = this.LLJJJIL;
        String lowerCase = (aBSData == null || (str = aBSData.priorityRegion) == null) ? null : str.toLowerCase(Locale.ROOT);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttlive_ic_google_fop_set_");
        if (lowerCase == null || ((iHashCode = lowerCase.hashCode()) == 3124 ? !lowerCase.equals("au") : !(iHashCode == 3152 ? lowerCase.equals("br") : iHashCode == 3355 ? lowerCase.equals(FollowStatusChangeMethod.PARAM_UID) : iHashCode == 3365 ? lowerCase.equals("in") : iHashCode == 3398 ? lowerCase.equals("jp") : iHashCode == 3431 ? lowerCase.equals("kr") : iHashCode == 3742 ? lowerCase.equals("us") : !(iHashCode == 3879 ? !lowerCase.equals("za") : !(iHashCode == 100289 && lowerCase.equals("eea")))))) {
            lowerCase = "gb";
        }
        sbLIZ.append(lowerCase);
        sbLIZ.append(".png");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C19GI, X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYC5pn5y+ba7YaF5ui+jkRFixWr5hc2pvwEYkbqss=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            C19GI c19gi = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (C19GI) obj;
            super.show();
            c0wst.LIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", null, objArr, c19gi, c0wzw, true);
        }
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        Diamond diamond = this.LLJJJ;
        int i = diamond != null ? diamond.count : 0;
        String str = this.LLJJJJ;
        String str2 = this.LLJJJJJIL;
        boolean z = this.LLJJJJLIIL;
        c1803800x2Y.getClass();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        boolean z2 = room != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId();
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("abs_status", "1");
        pairArr[1] = new Pair("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        w.LIZ.getClass();
        pairArr[2] = new Pair("room_id", String.valueOf(w.LJIJJ()));
        pairArr[3] = new Pair("recharge_package", String.valueOf(i));
        pairArr[4] = new Pair("request_page", str2);
        pairArr[5] = new Pair("charge_reason", str);
        pairArr[6] = new Pair("pay_method", C1796440wqg.LIZ());
        pairArr[7] = new Pair("request_id", w.LJIJI());
        pairArr[8] = new Pair("is_anchor", z2 ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[9] = new Pair("is_first_recharge", z ? "1" : CardStruct.IStatusCode.DEFAULT);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_billing_choice_page_show");
        c474500IjALIZ.LJJIIZI(mapLJIIIIZZ);
        c474500IjALIZ.LIZ();
    }

    @Override // X.C19GI, android.app.Dialog
    public final void onStop() {
        super.onStop();
        DialogC780480UjW dialogC780480UjW = this.LLJILJIL;
        dialogC780480UjW.dismiss();
        C785410UrT.LIZ(dialogC780480UjW);
        this.LLJILJILJ = null;
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        List<String> list;
        ViewGroup.LayoutParams layoutParams2;
        super.onCreate(bundle);
        this.LLJILLL = findViewById(R.id.j3v);
        if (C1804000x2s.LIZ(getContext())) {
            View view = this.LLJILLL;
            if (view != null && (layoutParams2 = view.getLayoutParams()) != null) {
                layoutParams2.width = C439101nJ.LIZ(500);
            }
            Window window = getWindow();
            if (window != null) {
                window.setLayout(-2, -2);
                window.setGravity(81);
            }
        } else {
            View view2 = this.LLJILLL;
            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                layoutParams.width = -1;
            }
        }
        this.LLJJ = (TextView) findViewById(R.id.j3t);
        this.LLJJI = findViewById(R.id.j3w);
        this.LLJJIII = findViewById(R.id.j3u);
        ((ArrayList) this.LLJJIJI).add(findViewById(R.id.yy));
        ((ArrayList) this.LLJJIJI).add(findViewById(R.id.yz));
        ((ArrayList) this.LLJJIJI).add(findViewById(R.id.z0));
        ((ArrayList) this.LLJJIJI).add(findViewById(R.id.z1));
        ((ArrayList) this.LLJJIJI).add(findViewById(R.id.z2));
        this.LLJJIJIIJIL = (ImageView) findViewById(R.id.yu);
        this.LLJJIJIL = (TextView) findViewById(R.id.yw);
        View view3 = this.LLJJI;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 203), view3);
        }
        View view4 = this.LLJJIII;
        if (view4 != null) {
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 204), view4);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append((Object) getContext().getText(2131844602));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(getContext().getText(2131844603)).append((CharSequence) strLIZIZ);
        C1864480ycQ c1864480ycQ = new C1864480ycQ(this, 4);
        String string = spannableStringBuilderAppend.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        C786410Ut5.q2(spannableStringBuilderAppend, c1864480ycQ, a0.LJJJ(lowerCase, strLIZIZ.toLowerCase(locale), 0, false, 6) + 1, lowerCase.length(), 34);
        TextView textView = this.LLJJ;
        if (textView != null) {
            textView.setText(spannableStringBuilderAppend);
        }
        TextView textView2 = this.LLJJ;
        if (textView2 != null) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TextView textView3 = this.LLJJ;
        if (textView3 != null) {
            textView3.setHighlightColor(C446980Hfs.LIZ(getContext(), R.color.dr));
        }
        try {
            C1143680frq.LJ(this.LLJJIJIIJIL, "tiktok_live_wallet_resource", LJL(), ImageView.ScaleType.FIT_XY);
            GetABSStatusResponse.ABSData aBSData = this.LLJJJIL;
            if (aBSData != null && (list = aBSData.absPipoAvatars) != null && !list.isEmpty()) {
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        if (i < 5) {
                            ImageView imageView = (ImageView) ((ArrayList) this.LLJJIJI).get(i);
                            C786410Ut5.LJZI(0, imageView);
                            C1324610kZf url = C1819620xS4.LIZ().setUrl(list.get(i));
                            url.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                            url.LJJI(imageView);
                            i++;
                        } else {
                            TextView textView4 = this.LLJJIJIL;
                            if (textView4 != null) {
                                C786410Ut5.LLIL(textView4, 0);
                            }
                        }
                    } else {
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        setOnCancelListener(new DialogInterfaceOnCancelListenerC1864700ycm(this, 7));
    }

    public DialogC1803170x1X(Context context, InterfaceC1796910wrR interfaceC1796910wrR) {
        super(context);
        this.LLJI = context;
        this.LLJIJIL = interfaceC1796910wrR;
        C780470UjV c780470UjV = new C780470UjV(getContext());
        c780470UjV.LIZIZ = getContext().getString(2131851961);
        this.LLJILJIL = c780470UjV.LIZ();
        this.LLJJIJI = new ArrayList();
        this.LLJJJJ = "";
        this.LLJJJJJIL = "";
    }
}
