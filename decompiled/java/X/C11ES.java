package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ExecutionException;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11ES, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11ES extends RecyclerView.ViewHolder implements WeakHandler.IHandler {
    public final SmartImageView LL;
    public Banner LLILLJJLI;
    public int LLILLL;
    public final WeakHandler LLILZ;
    public String LLILZIL;
    public final C11DI LLILZLL;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        User user;
        Context context = this.itemView.getContext();
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        int i = message.what;
        if (messageObj instanceof ExecutionException) {
            messageObj = ((Throwable) messageObj).getCause();
        }
        if (messageObj instanceof C0XIR) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
            c1389890mGx.LJIIJ(((C0XIR) messageObj).getErrorMsg());
            c1389890mGx.LJIIJJI();
            return;
        }
        if (messageObj instanceof Exception) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(this.itemView);
            c1389890mGx2.LJIIIZ(2131837963);
            c1389890mGx2.LJIIJJI();
        } else if (i == C2277881EDy.LIZIZ.getMessageProfile()) {
            if (messageObj instanceof User) {
                user = (User) HandlerHook.getMessageObj(message.obj);
            } else if (!(messageObj instanceof UserResponse)) {
                return;
            } else {
                user = ((UserResponse) messageObj).getUser();
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.mLogData.requestId = this.LLILLJJLI.getRequestId();
            enterRoomConfig.mRoomsData.enterFromMerge = "discovery";
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().LJIIIIZZ(context, user, enterRoomConfig);
        }
    }

    public C11ES(C11DI c11di, View view) {
        super(view);
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.u3q);
        this.LL = smartImageView;
        this.LLILZ = new WeakHandler(Looper.getMainLooper(), this);
        this.LLILZIL = "";
        this.LLILZLL = c11di;
        C786410Ut5.Q8(smartImageView, new ACListenerS163S0100000_29(this, 203));
    }

    public final void I5(String str, String str2) {
        String bid;
        String bid2;
        C20684815ws.LJIIJJI("banner_click", this.LLILLL + 1, "click", String.valueOf(this.LLILLJJLI.getCreativeId()));
        String strLIZ = C10ZJ.LIZ(str);
        C11EQ c11eq = new C11EQ();
        c11eq.setBannerId(this.LLILLJJLI.getBid());
        c11eq.setClientOrder(this.LLILLL + 1);
        c11eq.setTagId(strLIZ);
        c11eq.setEnterFrom("discovery");
        C20684815ws.LJIILLIIL("banner_click", c11eq.buildParams());
        if (this.LLILLJJLI.isAd()) {
            C1029590ctp.LIZLLL().LIZJ(this.itemView.getContext(), this.LLILLJJLI, this.LLILLL + 1);
        }
        if (!C018G.LIZLLL("aweme://challenge/detail/:id", str) && !u.LJJIIJZLJL(str, "sslocal://challenge/detail", false)) {
            if (u.LJJIIJZLJL(str, "aweme://sticker/detail", false)) {
                String strSubstring = str.substring(a0.LJJJJ(str, '/', 0, 6) + 1);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("group_id", "");
                    jSONObject.put("author_id", "");
                    jSONObject.put("process_id", this.LLILZIL);
                    jSONObject.put("impr_type", "");
                    jSONObject.put("prop_id", strSubstring);
                    jSONObject.put("enter_from", "discovery");
                    jSONObject.put("enter_method", "click_trending_cell");
                    Banner banner = this.LLILLJJLI;
                    if (banner != null && (bid2 = banner.getBid()) != null) {
                        jSONObject.put("banner_id", bid2);
                    }
                    C20684815ws.LJIJ("enter_prop_detail", jSONObject);
                    return;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("enter_from", "banner");
            jSONObject2.put("enter_method", "click_banner");
            jSONObject2.put("process_id", this.LLILZIL);
            jSONObject2.put("tag_id", strLIZ);
            jSONObject2.put("scene_id", "1008");
            jSONObject2.put("shoot_enter_from", "discovery");
            Banner banner2 = this.LLILLJJLI;
            if (banner2 != null && (bid = banner2.getBid()) != null) {
                jSONObject2.put("banner_id", bid);
            }
            jSONObject2.put("is_bundled", !TextUtils.isEmpty(str2) ? 1 : 0);
            if (str2 != null) {
                jSONObject2.put("prop_id", str2);
            }
            C20684815ws.LJIJ("enter_tag_detail", jSONObject2);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
