package X;

import Y.ACListenerS141S0100000_6;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419270GcH extends FrameLayout {
    public final C415610GRj LL;
    public final C16F5 LLILLJJLI;
    public final View LLILLL;
    public final ImageView LLILZ;
    public EnumC429510Gsn LLILZIL;
    public DataChannel LLILZLL;
    public View LLIZ;

    public final View getContentView() {
        return this.LLIZ;
    }

    public final DataChannel getDataChannel() {
        return this.LLILZLL;
    }

    public final void setContentView(View view) {
        this.LLIZ = view;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLILZLL = dataChannel;
    }

    public C419270GcH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.LLILZIL = EnumC429510Gsn.FANS_CLUB;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.g6_, this, true);
        this.LL = (C415610GRj) findViewById(R.id.wx0);
        C16F5 c16f5 = (C16F5) findViewById(R.id.ml5);
        this.LLILLJJLI = c16f5;
        View viewFindViewById = findViewById(R.id.tme);
        this.LLILLL = viewFindViewById;
        this.LLILZ = (ImageView) findViewById(R.id.tmf);
        findViewById(R.id.dgb);
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, new ACListenerS141S0100000_6(this, 128));
        }
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS141S0100000_6(this, 129), viewFindViewById);
        }
        C415610GRj c415610GRj = this.LL;
        if (c415610GRj != null) {
            HandlerHook.viewPost(c415610GRj, new ARunnableS106S0100000_6((Object) this, 238));
        }
        C1143680frq.LIZLLL(this.LLILZ, "tiktok_live_new_style_fans_club_join_dialog", "ttlive_icon_super_fan_text_unselected.png");
    }
}
