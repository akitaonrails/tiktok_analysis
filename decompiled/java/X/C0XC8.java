package X;

import Y.ARunnableS82S0200000_13;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0XC8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XC8 implements Handler.Callback {
    public static final C844810XCd LLIZ = new AbstractC824140WUq<C588280N5m>() { // from class: X.0XCd
        @Override // X.AbstractC824140WUq
        public final C588280N5m LIZ(Object[] objArr) {
            return new C588280N5m((Context) objArr[0]);
        }
    };
    public final C844770XBz LL;
    public final BPEAHandler LLILLJJLI = new BPEAHandler(C824170WUt.LIZLLL(null), this);
    public final C0XD7 LLILLL;
    public final C844630XBl LLILZ;
    public C0XC0 LLILZIL;
    public C844740XBw LLILZLL;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1236) {
            C0XC4 c0xc4 = (C0XC4) HandlerHook.getMessageObj(message.obj);
            if (this.LL.LJJIFFI && !((C0XCO) this.LLILLL).LLILLJJLI) {
                BPEAHandler bPEAHandler = this.LLILLJJLI;
                Message messageObtainMessage = bPEAHandler.obtainMessage(1236, c0xc4);
                c0xc4.getClass();
                C786410Ut5.LJLJLJ(bPEAHandler, messageObtainMessage, 60000L);
            } else if (!c0xc4.LJFF) {
                C824170WUt.LJFF(new ARunnableS82S0200000_13(this, c0xc4, 90), null);
                return false;
            }
        }
        return false;
    }

    public static void LIZ(C844890XCl c844890XCl, C0XC4 c0xc4) {
        if (c0xc4 != null) {
            if (c844890XCl.LIZ) {
                c0xc4.LJIIIIZZ(c844890XCl.LIZLLL);
                c0xc4.LJII(c844890XCl.LIZ);
                c0xc4.LIZ();
            } else {
                if (c844890XCl.LIZIZ != 4) {
                    return;
                }
                c0xc4.LJIIIIZZ(c844890XCl.LIZLLL);
                c0xc4.LJII(c844890XCl.LIZ);
                c0xc4.LIZ();
            }
        }
    }

    public C0XC8(C844770XBz c844770XBz, C0XD7 c0xd7, C844630XBl c844630XBl) {
        this.LL = c844770XBz;
        this.LLILLL = c0xd7;
        this.LLILZ = c844630XBl;
    }
}
