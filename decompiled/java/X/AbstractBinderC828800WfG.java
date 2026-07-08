package X;

import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0WfG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractBinderC828800WfG extends AbstractBinderC828790WfF {
    public final int LLILLJJLI;

    @Override // X.InterfaceC828830WfJ
    public final int LIZIZ() {
        return this.LLILLJJLI;
    }

    public abstract byte[] LLLIIL();

    public final int hashCode() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC828830WfJ
    public final InterfaceC820590WGz LIZLLL() {
        return new C0WH6(LLLIIL());
    }

    public AbstractBinderC828800WfG(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LIZIZ(z);
        this.LLILLJJLI = Arrays.hashCode(bArr);
    }

    public static byte[] LLILLIZIL(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        InterfaceC820590WGz interfaceC820590WGzLIZLLL;
        if (obj != null && (obj instanceof InterfaceC828830WfJ)) {
            try {
                InterfaceC828830WfJ interfaceC828830WfJ = (InterfaceC828830WfJ) obj;
                if (interfaceC828830WfJ.LIZIZ() != this.LLILLJJLI || (interfaceC820590WGzLIZLLL = interfaceC828830WfJ.LIZLLL()) == null) {
                    return false;
                }
                return Arrays.equals(LLLIIL(), (byte[]) C0WH6.LLLIIL(interfaceC820590WGzLIZLLL));
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
