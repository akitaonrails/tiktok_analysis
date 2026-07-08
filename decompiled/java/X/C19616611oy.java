package X;

import android.content.Context;
import android.graphics.PointF;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventPageLynxUrl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19616611oy implements InterfaceC19625011qK {
    public final Context LL;
    public final C705930RmZ LLILLJJLI;
    public final Aweme LLILLL;
    public final C19EG LLILZ;
    public final boolean LLILZIL;
    public final Function0<String> LLILZLL;

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
        return false;
    }

    @Override // X.InterfaceC19625011qK
    public final JSONObject d3() throws JSONException {
        C0R60 c0r60;
        JSONObject jSONObject = new JSONObject();
        C705930RmZ c705930RmZ = this.LLILLJJLI;
        jSONObject.put("enter_from", (c705930RmZ == null || (c0r60 = c705930RmZ.LJIIZILJ) == null) ? null : c0r60.LIZ);
        Function0<String> function0 = this.LLILZLL;
        jSONObject.put("enter_position", function0 != null ? function0.invoke() : null);
        return jSONObject;
    }

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct) {
        long jLongValue;
        String str;
        Context context;
        CountDownStickerStruct countDownStickerStruct = interactStickerStruct.getCountDownStickerStruct();
        if (countDownStickerStruct == null) {
            return false;
        }
        String strValueOf = String.valueOf(countDownStickerStruct.getEventId());
        Long expiredTime = countDownStickerStruct.getExpiredTime();
        if (expiredTime != null) {
            jLongValue = expiredTime.longValue();
        } else {
            jLongValue = 0;
        }
        if (interactStickerStruct.getType() == EnumC1466150oFx.LIVE_EVENT_STORY.getType()) {
            str = "story";
        } else {
            str = "sticker";
        }
        String liveEvent60PercentSchema = LiveEventPageLynxUrl.INSTANCE.getLiveEvent60PercentSchema();
        if (liveEvent60PercentSchema.length() != 0 && (context = this.LL) != null) {
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, liveEvent60PercentSchema, new C19616811p0(strValueOf, str, jLongValue, this));
        }
        return true;
    }

    @Override // X.InterfaceC19625011qK
    public final void o4(InteractStickerStruct interactStickerStruct, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        String str;
        if (this.LLILZIL) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILZ);
            c1389890mGx.LJIIIZ(2131851059);
            c1389890mGx.LJIIJJI();
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZ), C0PEM.LIZJ, null, new C19616711oz(interactStickerStruct, z, this, function02, function0, null), 2);
        }
        C705930RmZ c705930RmZ = this.LLILLJJLI;
        boolean z2 = this.LLILZIL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_register");
        C19615611oo.LIZ(c474500IjALIZ, interactStickerStruct, c705930RmZ, z2);
        if (C19615611oo.LIZLLL(interactStickerStruct)) {
            str = "story";
        } else {
            str = "sticker";
        }
        c474500IjALIZ.LJJII(str, "register_position");
        c474500IjALIZ.LJJII(1, "is_free");
        c474500IjALIZ.LJJII(C19615611oo.LIZJ(interactStickerStruct.getCountDownStickerStruct()), "event_status");
        c474500IjALIZ.LIZ();
    }

    public C19616611oy(Context context, C705930RmZ c705930RmZ, Aweme aweme, C19EG c19eg, boolean z, Function0<String> function0) {
        this.LL = context;
        this.LLILLJJLI = c705930RmZ;
        this.LLILLL = aweme;
        this.LLILZ = c19eg;
        this.LLILZIL = z;
        this.LLILZLL = function0;
    }
}
