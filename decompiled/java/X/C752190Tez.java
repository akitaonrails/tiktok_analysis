package X;

import Y.ACListenerS147S0100000_12;
import Y.AUListenerS262S0100000_12;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0Tez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752190Tez extends ConstraintLayout {
    public final Context LL;
    public LiveIconView LLILLJJLI;
    public InterfaceC752180Tey LLILLL;
    public AnonymousClass0956 LLILZ;
    public final ConstraintLayout LLILZIL;
    public final ConstraintLayout LLILZLL;
    public final GradientDrawable LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public DataChannel LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public int LLJILLL;
    public final ValueAnimator LLJJ;
    public final ValueAnimator LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public ChatMessage LLJJIJIIJIL;
    public final HashMap<String, Object> LLJJIJIL;

    private final String getAnchorId() {
        return (String) this.LLJJIJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long getDuration() {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C752190Tez.getDuration():long");
    }

    private final long getRoomId() {
        return ((Number) this.LLJJIII.getValue()).longValue();
    }

    public final LiveIconView getIvGameCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lhz);
            this.LLILLJJLI = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    @Override // android.view.View
    public final GradientDrawable getBackground() {
        return this.LLIZ;
    }

    public final int getBlackColor() {
        return this.LLJI;
    }

    public final ConstraintLayout getCommentView() {
        return this.LLILZIL;
    }

    public final ConstraintLayout getContentView() {
        return this.LLILZLL;
    }

    public final DataChannel getDataChannel() {
        return this.LLJIJIL;
    }

    public final InterfaceC752180Tey getSmallMoreView() {
        return this.LLILLL;
    }

    public final void h0(boolean z) {
        String str;
        if (z) {
            str = "livesdk_anchor_floating_comment_msg_show";
        } else {
            str = "livesdk_anchor_floating_comment_msg_cancel";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJII(Long.valueOf(getRoomId()), "room_id");
        c474500IjALIZ.LJJII(getAnchorId(), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJILJILJ), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJILJIL), "show_duration");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLJILLL), "cancel_cnt");
        c474500IjALIZ.LIZ();
    }

    public final void setBlackColor(int i) {
        this.LLJI = i;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLJIJIL = dataChannel;
    }

    public final void setIvGameCloseFromXml(LiveIconView liveIconView) {
        this.LLILLJJLI = liveIconView;
    }

    public final void setSmallMoreView(InterfaceC752180Tey interfaceC752180Tey) {
        this.LLILLL = interfaceC752180Tey;
    }

    public C752190Tez(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C752190Tez(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = context;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.LLIZ = gradientDrawable;
        this.LLIZLLLIL = true;
        this.LLJ = true;
        this.LLJI = C497740JfY.LJFF(R.color.cw);
        this.LLJILJIL = 2000L;
        this.LLJJIII = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(109));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(108));
        ViewGroup.inflate(context, R.layout.hsm, this);
        C786410Ut5.g8(getIvGameCloseFromXml(), new ACListenerS147S0100000_12((Object) this, 181));
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C439101nJ.LIZ(4));
        this.LLILZIL = (ConstraintLayout) findViewById(R.id.ebv);
        this.LLILZLL = (ConstraintLayout) findViewById(R.id.vm8);
        ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(this, 21));
        this.LLJJ = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS262S0100000_12(this, 22));
        this.LLJJI = valueAnimatorOfFloat2;
        this.LLJJIJIL = new HashMap<>();
    }

    public final void e0(ChatMessage chatMessage, boolean z, boolean z2, int i, boolean z3) {
        LifecycleOwner lifecycleOwner;
        long id;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJILLL = i;
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        DataChannel dataChannel = this.LLJIJIL;
        if (dataChannel != null) {
            lifecycleOwner = dataChannel.LLILZ;
        } else {
            lifecycleOwner = null;
        }
        C1109070ey1 c1109070ey1YM0 = iPublicScreenService.YM0(lifecycleOwner, this.LL, chatMessage);
        this.LLJJIJIIJIL = chatMessage;
        User user = chatMessage.atUser;
        if (user != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        this.LLJILJILJ = id;
        C786410Ut5.LJJJJL(this.LLILZIL);
        this.LLILZIL.addView(c1109070ey1YM0, -1, -2);
        AnonymousClass0956 anonymousClass0956 = this.LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJILJIL = getDuration();
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILZ = C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C752170Tex(this, null), 2);
        this.LLIZ.setColor(this.LLJI);
        this.LLILZLL.setBackground(this.LLIZ);
        if (z3) {
            this.LLJJ.cancel();
            this.LLJJI.cancel();
            this.LLJJ.start();
            this.LLJJI.start();
        }
        h0(true);
    }
}
