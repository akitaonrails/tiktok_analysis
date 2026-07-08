package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f4Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113130f4Z extends FrameLayout {
    public C16F5 LL;
    public C1111720f2I LLILLJJLI;
    public final C1086580eNk LLILLL;
    public final TextView LLILZ;
    public InterfaceC776970Udr LLILZIL;
    public final TextView LLILZLL;
    public final ArrayList<C1111770f2N> LLIZ;
    public C1111770f2N LLIZLLLIL;
    public boolean LLJ;
    public final C236100vf LLJI;
    public C1113190f4f LLJIJIL;
    public final C1113140f4a LLJILJIL;

    public final void setIsActivitiesTab(boolean z) {
    }

    public final void LIZ() {
        if (!(!this.LLIZ.isEmpty())) {
            C439101nJ.LJI(this.LLILZLL);
            C439101nJ.LJI(this.LLILLL);
            C12ES.LJIILL(0, this.LLILZ);
            return;
        }
        if (this.LLJ) {
            C1111770f2N c1111770f2N = this.LLIZLLLIL;
            if (c1111770f2N != null) {
                TextView textView = this.LLILZLL;
                CharSequence content = c1111770f2N.getContent();
                if (content != null) {
                    textView.setText(content);
                    c1111770f2N.LJJL(new C1109990ezV(textView, content));
                }
            }
            C12ES.LJIILL(0, this.LLILZLL);
            C439101nJ.LJI(this.LLILLL);
        } else {
            C439101nJ.LJI(this.LLILZLL);
            C12ES.LJIILL(0, this.LLILLL);
        }
        C439101nJ.LJI(this.LLILZ);
    }

    public final C16F5 getMessagesHintViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.o_f);
            this.LL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final boolean getCollapsed() {
        return this.LLJ;
    }

    public final void setCollapsed(boolean z) {
        this.LLJ = z;
        LIZ();
    }

    public final void setMessagesHintViewFromXml(C16F5 c16f5) {
        this.LL = c16f5;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.LLILZIL != null && i == 0) {
            this.LLJI.LIZIZ("tab_switch", !this.LLIZ.isEmpty());
        }
        super.setVisibility(i);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0f4a] */
    public C1113130f4Z(Context context, AttributeSet attributeSet) {
        long id;
        super(context, attributeSet, 0);
        this.LLIZ = new ArrayList<>();
        this.LLJ = true;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LLJI = new C236100vf(strValueOf, id, "message_hover");
        C786410Ut5.LJLLJ(context, R.layout.hrq, this);
        C1086580eNk c1086580eNk = (C1086580eNk) findViewById(R.id.yud);
        this.LLILLL = c1086580eNk;
        this.LLILZ = (TextView) findViewById(R.id.yr6);
        this.LLILZLL = (TextView) findViewById(R.id.ixz);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c1086580eNk.getLayoutParams();
        layoutParams.height = -1;
        C1086580eNk c1086580eNk2 = this.LLILLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1086580eNk2);
        c1086580eNk2.setLayoutParams(layoutParams);
        this.LLJILJIL = new AnonymousClass0128() { // from class: X.0f4a
            @Override // X.AnonymousClass0128
            public final void LIZ(IMessage iMessage) {
                if (!(iMessage instanceof GiftMessage) || !InterfaceC772390URp.LLLZIL.LIZIZ().booleanValue()) {
                    return;
                }
                this.LIZ.getClass();
                if (!Intrinsics.LJFF(InterfaceC772390URp.LLLZ.LIZIZ(), Boolean.TRUE)) {
                    return;
                }
                int size = this.LIZ.LLIZ.size();
                this.LIZ.LLIZ.add(new C1111770f2N((GiftMessage) iMessage));
                C1113130f4Z c1113130f4Z = this.LIZ;
                c1113130f4Z.LLIZLLLIL = (C1111770f2N) C13LP.LJJLIIIJJI(c1113130f4Z.LLIZ);
                this.LIZ.LIZ();
                C1111720f2I c1111720f2I = this.LIZ.LLILLJJLI;
                if (c1111720f2I != null) {
                    c1111720f2I.notifyItemInserted(size);
                }
                C1113190f4f c1113190f4f = this.LIZ.LLJIJIL;
                if (c1113190f4f != null) {
                    c1113190f4f.LIZ(1);
                }
                int size2 = this.LIZ.LLIZ.size();
                if (size2 > 0 && !this.LIZ.LLILLL.canScrollVertically(1)) {
                    this.LIZ.LLILLL.scrollToPosition(size2 - 1);
                }
            }
        };
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.LLILZIL == null) {
            return;
        }
        if (i == 0 && getVisibility() == 0) {
            InterfaceC776970Udr interfaceC776970Udr = this.LLILZIL;
            if (interfaceC776970Udr != null) {
                interfaceC776970Udr.LIZIZ();
            }
            C1113190f4f c1113190f4f = this.LLJIJIL;
            if (c1113190f4f != null) {
                C1113190f4f.LIZLLL(c1113190f4f, EnumC1091490eVf.NORMAL, 6);
            }
            this.LLJI.LIZIZ("hover_unfold", !this.LLIZ.isEmpty());
            return;
        }
        this.LLJI.LIZ(!this.LLIZ.isEmpty());
    }
}
