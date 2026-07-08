package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.ss.android.ugc.mediabox.bgplay.notification.BgPlayService;

/* JADX INFO: renamed from: X.0ooF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487410ooF {
    public C1ASD LIZ;
    public InterfaceC1528040prm LIZIZ;
    public int LIZJ = 3;
    public final ServiceConnectionC1528030prl LIZLLL = new ServiceConnection() { // from class: X.0prl
        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
            boolean z;
            long currentPosition;
            float fLIZ;
            IBinder iBinder2 = iBinder;
            int i = 2;
            boolean z2 = false;
            C1ASD c1asd = null;
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/ss/android/ugc/mediabox/bgplay/notification/BgPlayConnection$mConnection$1", "onServiceConnected", this, new Object[]{componentName, iBinder2}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3U8eG4yZOWwLZ3JzD5llRZ6dXV0sHJ+tf8W8saS3ElpXaI0LEZ2U7isL5uxMA==", null)));
            if (c0wsuLIZIZ.LIZ) {
                return;
            }
            Object[] objArr = c0wsuLIZIZ.LIZJ;
            if (objArr != null) {
                Object obj = objArr[0];
                Object obj2 = objArr[1];
                if (obj2 != null) {
                    iBinder2 = (IBinder) obj2;
                }
            }
            C1487410ooF c1487410ooF = this.LL;
            if (iBinder2 instanceof C1ASD) {
                c1asd = (C1ASD) iBinder2;
            }
            c1487410ooF.LIZ = c1asd;
            if (c1asd != null) {
                c1asd.LL.LLILZIL = this;
            }
            InterfaceC1528040prm interfaceC1528040prm = c1487410ooF.LIZIZ;
            if (interfaceC1528040prm != null && interfaceC1528040prm.isLoading()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 6;
            } else {
                InterfaceC1528040prm interfaceC1528040prm2 = this.LL.LIZIZ;
                if (interfaceC1528040prm2 != null && interfaceC1528040prm2.isPlaying()) {
                    i = 3;
                }
            }
            c1487410ooF.LIZJ = i;
            InterfaceC1528040prm interfaceC1528040prm3 = this.LL.LIZIZ;
            if (interfaceC1528040prm3 != null) {
                currentPosition = interfaceC1528040prm3.getCurrentPosition();
            } else {
                currentPosition = 0;
            }
            C1487410ooF c1487410ooF2 = this.LL;
            C1ASD c1asd2 = c1487410ooF2.LIZ;
            if (c1asd2 != null) {
                int i2 = c1487410ooF2.LIZJ;
                C1AS6 c1as6 = c1asd2.LL.LLILLJJLI;
                if (c1as6 != null) {
                    if (i2 == 3) {
                        z2 = true;
                    }
                    c1as6.LIZLLL(z2);
                }
            }
            C1487410ooF c1487410ooF3 = this.LL;
            C1ASD c1asd3 = c1487410ooF3.LIZ;
            if (c1asd3 != null) {
                int i3 = c1487410ooF3.LIZJ;
                C2179591ARx c2179591ARx = c1asd3.LL.LLILLL;
                if (c2179591ARx != null) {
                    c2179591ARx.LIZIZ(i3, currentPosition);
                }
            }
            C1487410ooF c1487410ooF4 = this.LL;
            C1ASD c1asd4 = c1487410ooF4.LIZ;
            if (c1asd4 != null) {
                InterfaceC1528040prm interfaceC1528040prm4 = c1487410ooF4.LIZIZ;
                if (interfaceC1528040prm4 != null) {
                    fLIZ = interfaceC1528040prm4.LIZ();
                } else {
                    fLIZ = 1.0f;
                }
                C2179591ARx c2179591ARx2 = c1asd4.LL.LLILLL;
                if (c2179591ARx2 != null) {
                    c2179591ARx2.LJIIIIZZ = fLIZ;
                }
            }
            C1487410ooF c1487410ooF5 = this.LL;
            C1ASD c1asd5 = c1487410ooF5.LIZ;
            if (c1asd5 != null) {
                InterfaceC1528040prm interfaceC1528040prm5 = c1487410ooF5.LIZIZ;
                BgPlayService bgPlayService = c1asd5.LL;
                bgPlayService.getClass();
                C1AS6 c1as62 = bgPlayService.LLILLJJLI;
                if (c1as62 != null) {
                    c1as62.LJI = interfaceC1528040prm5;
                }
                C2179591ARx c2179591ARx3 = bgPlayService.LLILLL;
                if (c2179591ARx3 != null) {
                    c2179591ARx3.LJFF = interfaceC1528040prm5;
                }
            }
        }
    };
}
