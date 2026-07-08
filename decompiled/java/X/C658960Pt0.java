package X;

import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS159S1100000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658960Pt0 extends C658950Psz {
    public final C661470Px3 LLILZ;
    public final C01GW LLILZIL;

    private final WeakHandler LIZJ() {
        return (WeakHandler) this.LLILZIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C658960Pt0.LIZIZ():boolean");
    }

    @Override // X.C658950Psz, X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        C661470Px3 c661470Px3 = this.LLILZ;
        return c661470Px3 != null && c661470Px3.isPlaying();
    }

    @Override // X.C658950Psz, X.InterfaceC655620Pnc
    public final void LJJJJ() {
        super.LJJJJ();
        if (((Boolean) C1822007Bq.LIZ.getValue()).booleanValue()) {
            LIZJ().removeMessages(16);
        }
    }

    @Override // X.C658950Psz, X.InterfaceC655620Pnc
    public final void LLJJJ() {
        LIZJ().removeMessages(16);
        C661470Px3 c661470Px3 = this.LLILZ;
        if (c661470Px3 != null) {
            c661470Px3.LJIIJ();
        }
    }

    @Override // X.C658950Psz, X.InterfaceC655620Pnc
    public final void LLLLLILLIL() {
        LIZJ().removeMessages(16);
        C661470Px3 c661470Px3 = this.LLILZ;
        if (c661470Px3 != null) {
            c661470Px3.LLLLLILLIL();
        }
    }

    @Override // X.C658950Psz, X.InterfaceC655620Pnc
    public final void onDestroy() {
        LIZJ().removeCallbacksAndMessages(null);
        LIZJ().removeMessages(16);
        C661470Px3 c661470Px3 = this.LLILZ;
        if (c661470Px3 != null) {
            c661470Px3.O4();
        }
    }

    @Override // X.C658950Psz, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        String aid;
        C661470Px3 c661470Px3;
        Aweme aweme;
        boolean zLIZIZ = LIZIZ();
        if (message.what == 16 && (HandlerHook.getMessageObj(message.obj) instanceof Aweme)) {
            String aid2 = ((Aweme) HandlerHook.getMessageObj(message.obj)).getAid();
            C661490Px5 c661490Px5 = this.LLILLJJLI;
            if (c661490Px5 != null && (aweme = c661490Px5.LIZJ) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid2, aid) && zLIZIZ && (c661470Px3 = this.LLILZ) != null) {
                c661470Px3.LJIIJJI();
            }
        }
    }

    @Override // X.C658950Psz, X.InterfaceC655620Pnc
    public final void u4(long j) {
        Aweme aweme;
        boolean z = true;
        if (((Number) C1822107Br.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        Aweme aweme2 = null;
        aid = null;
        String aid = null;
        if (z) {
            C661490Px5 c661490Px5 = this.LLILLJJLI;
            if (c661490Px5 != null && (aweme = c661490Px5.LIZJ) != null) {
                aid = aweme.getAid();
            }
            C0CNO.LIZLLL(0L, new AwS159S1100000_10(aid, this, 7));
            return;
        }
        LIZJ().removeMessages(16);
        Message message = new Message();
        message.what = 16;
        C661490Px5 c661490Px52 = this.LLILLJJLI;
        if (c661490Px52 != null) {
            aweme2 = c661490Px52.LIZJ;
        }
        message.obj = aweme2;
        LIZJ().sendMessageDelayed(message, j);
    }

    public C658960Pt0(C661470Px3 c661470Px3, C661490Px5 c661490Px5) {
        super(c661470Px3, c661490Px5);
        this.LLILZ = c661470Px3;
        this.LLILZIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1275));
    }
}
