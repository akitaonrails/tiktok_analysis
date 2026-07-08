package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HiddenItem;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HiddenUser;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HideAccountViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS97S0100000_31;
import kotlin.Pair;
import kotlin.jvm.internal.AwS2S2101000_31;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.15ek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class ViewOnClickListenerC20572415ek extends RecyclerView.ViewHolder implements View.OnClickListener {
    public HiddenItem LL;
    public final View LLILLJJLI;
    public final C427660Gpo LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;
    public final C197039127h LLIZLLLIL;

    public ViewOnClickListenerC20572415ek(View view) {
        super(view);
        this.LLILLJJLI = view.findViewById(R.id.tsc);
        this.LLILLL = (C427660Gpo) view.findViewById(R.id.l9h);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.zz3);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.tv_video_count);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.zmi);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.zas);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.ct2);
        this.LLIZLLLIL = c197039127h;
        C786410Ut5.I7(this, view);
        C786410Ut5.I7(new AkS97S0100000_31(this, 14), c197039127h);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HiddenItem hiddenItem;
        HiddenUser hiddenUser;
        String str;
        String str2;
        C20572315ej c20572315ej;
        HideAccountViewModel hideAccountViewModel;
        HiddenItem hiddenItem2;
        HiddenUser hiddenUser2;
        String str3;
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.tsc) {
            Context context = view.getContext();
            HiddenItem hiddenItem3 = this.LL;
            if (hiddenItem3 != null && (hiddenUser2 = hiddenItem3.user) != null && (str3 = hiddenUser2.userId) != null) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//user/profile");
                smartRouteBuildRoute.withParam("uid", str3);
                smartRouteBuildRoute.open();
                return;
            }
            return;
        }
        if (id != R.id.ct2 || (hiddenItem = this.LL) == null || (hiddenUser = hiddenItem.user) == null || (str = hiddenUser.userId) == null) {
            return;
        }
        String str4 = hiddenUser.nickname;
        if (str4 == null) {
            str4 = "";
        }
        C1610870s1N.LIZ.getClass();
        boolean zIsHidden = false;
        if (C1610870s1N.LIZLLL() && (hiddenItem2 = this.LL) != null) {
            C1393160mME muteActionSheetConfig = hiddenItem2.toMuteActionSheetConfig(new C20572515el(this, str, str4));
            C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
            Context context2 = this.itemView.getContext();
            EnumC1393020mM0 enumC1393020mM0 = EnumC1393020mM0.SETTINGS;
            HiddenItem hiddenItem4 = this.LL;
            if (hiddenItem4 != null) {
                zIsHidden = hiddenItem4.isHidden();
            }
            c1589640rT8.b3(context2, null, null, enumC1393020mM0, muteActionSheetConfig, new C1393110mM9(zIsHidden, "content_preference", "click_muted_account", "", 0, "show", null, 448));
            return;
        }
        AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter = getBindingAdapter();
        if ((bindingAdapter instanceof C20572315ej) && (c20572315ej = (C20572315ej) bindingAdapter) != null && (hideAccountViewModel = c20572315ej.LL) != null) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            hideAccountViewModel.vQ2();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                hideAccountViewModel.setState(new AwS597S0100000_18(hideAccountViewModel, 815));
            } else {
                hideAccountViewModel.withState(new AwS2S2101000_31(bindingAdapterPosition, str, hideAccountViewModel, str4, 0));
            }
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("to_user_id", str);
        HiddenItem hiddenItem5 = this.LL;
        if (hiddenItem5 != null && hiddenItem5.isHidden()) {
            str2 = "undo";
        } else {
            str2 = "hide";
        }
        pairArr[1] = new Pair("type", str2);
        C20684815ws.LJIILLIIL("tns_hidden_accounts_page_click", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
