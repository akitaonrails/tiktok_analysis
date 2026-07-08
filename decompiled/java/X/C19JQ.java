package X;

import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.utils.WeakHandler;

/* JADX INFO: renamed from: X.19JQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19JQ implements InterfaceC1050080dQs {
    public boolean LIZ;
    public int LIZIZ;
    public InterfaceC1049730dQJ LIZJ;
    public final C19JV LIZLLL;
    public final C19JH LJ;
    public final WeakHandler LJFF = new WeakHandler(Looper.getMainLooper(), this);

    @Override // X.InterfaceC1050080dQs
    public final void handleMsg(Message message) {
        if (message.what == 1001) {
            InterfaceC1049730dQJ interfaceC1049730dQJ = this.LIZJ;
            if (interfaceC1049730dQJ != null) {
                interfaceC1049730dQJ.LIZIZ();
            }
            if (this.LIZ) {
                C786410Ut5.LJLJJI(1001, this.LIZIZ, this.LJFF);
            } else {
                this.LJFF.removeMessages(1001);
            }
        }
    }

    public C19JQ(C19JV c19jv, C19JH c19jh) {
        this.LIZLLL = c19jv;
        this.LJ = c19jh;
    }
}
