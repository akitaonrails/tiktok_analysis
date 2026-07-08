package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.publicscreen.api.GameBackgroundColorChannel;
import com.bytedance.android.live.publicscreen.api.NewMessageNumChannel;
import com.bytedance.android.livesdk.livesetting.game.GameFloatWindowMsgStrategySetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UhW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779240UhW extends C779160UhO implements InterfaceC752180Tey {
    public final LinkedList<ChatMessage> LJI;
    public final LinkedList<GiftMessage> LJII;
    public final DataChannel LJIIIIZZ;
    public final Context LJIIIZ;
    public final C11NJ LJIIJ;
    public InterfaceC420801kM LJIIJJI;
    public InterfaceC779250UhX LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public final LinearLayout LJIIZILJ;
    public final C752190Tez LJIJ;
    public final C779520Uhy LJIJI;
    public final LinkedList<C752230Tf3> LJIJJ;
    public boolean LJIJJLI;

    public final void LJIIZILJ() {
        this.LJIJJLI = false;
        LJIILLIIL(true);
        if (this.LJIIJ.LJI() > 0) {
            C11NJ c11nj = this.LJIIJ;
            InterfaceC420801kM interfaceC420801kM = this.LJIIJJI;
            if (interfaceC420801kM == null) {
                interfaceC420801kM = null;
            }
            c11nj.LIZJ(interfaceC420801kM);
        }
    }

    @Override // X.C779160UhO, X.InterfaceC779170UhP
    public final int getResId() {
        return R.id.myb;
    }

    @Override // X.InterfaceC752180Tey
    public final boolean LIZJ() {
        ChatMessage chatMessagePoll;
        Map<String, Object> map = C1338270kvh.LIZ;
        InterfaceC779250UhX interfaceC779250UhX = this.LJIIL;
        if (C500260Jjc.LJJJI(interfaceC779250UhX != null ? Boolean.valueOf(interfaceC779250UhX.LJ()) : null) || !this.LJII.isEmpty() || C500260Jjc.LJJJI((Boolean) this.LJIIIIZZ.gg0(C779300Uhc.class)) || (chatMessagePoll = this.LJI.poll()) == null) {
            return false;
        }
        this.LJIJ.e0(chatMessagePoll, this.LJIILL, this.LJIILLIIL, this.LJIILJJIL, false);
        LJIILL(InterfaceC772390URp.LLLZIIL.LIZIZ().booleanValue());
        LJIJ();
        return true;
    }

    @Override // X.InterfaceC752180Tey
    public final boolean LIZLLL() {
        return this.LJI.isEmpty() && this.LJII.isEmpty();
    }

    @Override // X.C779160UhO
    public final void LJI() {
        this.LJIIJ.dispose();
        C752190Tez c752190Tez = this.LJIJ;
        DataChannel dataChannel = c752190Tez.LLJIJIL;
        if (dataChannel != null) {
            dataChannel.zQ2(c752190Tez);
        }
        super.LJI();
    }

    public final void LJIJ() {
        View view = this.LIZLLL;
        if (view != null) {
            view.measure(0, 0);
        }
        if (this.LIZLLL.getMeasuredWidth() != 0) {
            LJIIL(this.LIZLLL.getMeasuredWidth(), this.LIZLLL.getMeasuredHeight());
            InterfaceC779250UhX interfaceC779250UhX = this.LJIIL;
            if (interfaceC779250UhX != null) {
                this.LIZLLL.getMeasuredWidth();
                this.LIZLLL.getMeasuredHeight();
                interfaceC779250UhX.LIZJ();
            }
        }
    }

    @Override // X.InterfaceC752180Tey
    public final void LIZIZ(boolean z) {
        InterfaceC779250UhX interfaceC779250UhX;
        if (z) {
            int i = this.LJIILJJIL + 1;
            this.LJIILJJIL = i;
            if (i >= GameFloatWindowMsgStrategySetting.INSTANCE.getConfig().maxCountChat && (interfaceC779250UhX = this.LJIIL) != null) {
                interfaceC779250UhX.LIZ();
            }
        }
        AnonymousClass0956 anonymousClass0956 = this.LJIJ.LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C439101nJ.LJI(this.LJIJ);
    }

    public final void LJIILL(boolean z) {
        int iIntValue;
        if (z) {
            Integer num = (Integer) this.LJIIIIZZ.gg0(NewMessageNumChannel.class);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            this.LJIIIIZZ.zW(NewMessageNumChannel.class, Integer.valueOf(iIntValue - 1));
        }
    }

    public final void LJIILLIIL(boolean z) {
        LIZIZ(false);
        Iterator<C752230Tf3> it2 = this.LJIJJ.iterator();
        while (it2.hasNext()) {
            it2.next().e0(false, false);
        }
        C786410Ut5.LJJJJJL(this.LJIIZILJ);
        this.LJIJJ.clear();
        C439101nJ.LJI(this.LJIJI);
        if (z) {
            C439101nJ.LJI(this.LIZLLL);
        }
    }

    @Override // X.InterfaceC752180Tey
    public final void LIZ(C752230Tf3 c752230Tf3, boolean z) {
        InterfaceC779250UhX interfaceC779250UhX;
        if (z) {
            int i = this.LJIILIIL + 1;
            this.LJIILIIL = i;
            if (i >= GameFloatWindowMsgStrategySetting.INSTANCE.getConfig().maxCountGift && (interfaceC779250UhX = this.LJIIL) != null) {
                interfaceC779250UhX.LIZIZ();
            }
        }
        this.LJIJJ.remove(c752230Tf3);
        C786410Ut5.LJJL(c752230Tf3, this.LJIIZILJ);
        LJIJ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C779240UhW(LinkedList linkedList, LinkedList linkedList2, DataChannel dataChannel) {
        View viewSd;
        Context contextLJIIIIZZ = C497740JfY.LJIIIIZZ();
        super(contextLJIIIIZZ);
        this.LJI = linkedList;
        this.LJII = linkedList2;
        this.LJIIIIZZ = dataChannel;
        this.LJIIIZ = contextLJIIIIZZ;
        this.LJIIJ = new C11NJ();
        this.LJIILL = true;
        this.LJIILLIIL = true;
        this.LJIJJ = new LinkedList<>();
        C439101nJ.LIZ(215);
        C439101nJ.LIZ(36);
        this.LJIJJLI = true;
        if (C497740JfY.LJJ()) {
            viewSd = C786410Ut5.Sd(R.layout.hsp, C786410Ut5.ne(contextLJIIIIZZ), null);
        } else {
            viewSd = C786410Ut5.Sd(R.layout.hso, C786410Ut5.ne(contextLJIIIIZZ), null);
        }
        this.LIZLLL = viewSd;
        LJII(0, 0);
        LJIIL(0, 0);
        this.LJIIZILJ = (LinearLayout) viewSd.findViewById(R.id.j0z);
        C752190Tez c752190Tez = (C752190Tez) viewSd.findViewById(R.id.ef1);
        this.LJIJ = c752190Tez;
        C779520Uhy c779520Uhy = (C779520Uhy) viewSd.findViewById(R.id.vxq);
        this.LJIJI = c779520Uhy;
        c779520Uhy.h0(false, dataChannel, null);
        c752190Tez.LLILLL = this;
        c752190Tez.LLJIJIL = dataChannel;
        dataChannel.CQ2(GameBackgroundColorChannel.class, c752190Tez, new AwS591S0100000_12(c752190Tez, 1091));
        C439101nJ.LJI(c752190Tez);
    }
}
