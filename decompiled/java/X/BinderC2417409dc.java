package X;

import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class BinderC2417409dc extends AbstractBinderC2417509dd {
    public final /* synthetic */ MultiInstanceInvalidationService LL;

    public BinderC2417409dc(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.LL = multiInstanceInvalidationService;
    }

    public final void LJJJZ(int i, String[] strArr) {
        synchronized (this.LL.LLILLL) {
            try {
                String str = this.LL.LLILLJJLI.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                int iBeginBroadcast = beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        int iIntValue = ((Integer) getBroadcastCookie(i2)).intValue();
                        String str2 = this.LL.LLILLJJLI.get(Integer.valueOf(iIntValue));
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                getBroadcastItem(i2).LLJJJJJIL(strArr);
                            } catch (RemoteException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        finishBroadcast();
                        throw th;
                    }
                }
                finishBroadcast();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final int LLILLIZIL(InterfaceC2417609de interfaceC2417609de, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.LL.LLILLL) {
            try {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.LL;
                int i = multiInstanceInvalidationService.LL + 1;
                multiInstanceInvalidationService.LL = i;
                if (multiInstanceInvalidationService.LLILLL.register(interfaceC2417609de, Integer.valueOf(i))) {
                    this.LL.LLILLJJLI.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.LL;
                multiInstanceInvalidationService2.LL--;
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2417909dh
    public final void LLJJ(InterfaceC2417609de interfaceC2417609de, int i) {
        synchronized (this.LL.LLILLL) {
            try {
                unregister(interfaceC2417609de);
                this.LL.LLILLJJLI.remove(Integer.valueOf(i));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
