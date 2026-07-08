package Y;

import X.C0WIH;
import X.C0WIN;
import X.C0WIX;
import X.C2179971ATj;
import X.C786410Ut5;
import X.C820880WIc;
import X.InterfaceC820920WIg;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS1S1202000_13 implements Runnable {
    public final int $t;
    public int i3;
    public int i4;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        IBinder iBinderLIZ = ((C0WIN) ((InterfaceC820920WIg) this.l1)).LIZ();
        ((C820880WIc) this.l2).LIZ.LLILZ.remove(iBinderLIZ);
        C0WIX c0wix = new C0WIX(((C820880WIc) this.l2).LIZ, this.s0, this.i3, this.i4, (InterfaceC820920WIg) this.l1);
        ((C820880WIc) this.l2).LIZ.getClass();
        c0wix.LLILZLL = ((C820880WIc) this.l2).LIZ.LIZIZ(this.s0);
        ((C820880WIc) this.l2).LIZ.getClass();
        if (c0wix.LLILZLL == null) {
            try {
                ((C0WIN) ((InterfaceC820920WIg) this.l1)).LIZJ(2, null);
                return;
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        try {
            ((C820880WIc) this.l2).LIZ.LLILZ.put(iBinderLIZ, c0wix);
            iBinderLIZ.linkToDeath(c0wix, 0);
            MediaSessionCompat.Token token = ((C820880WIc) this.l2).LIZ.LLILZLL;
            if (token != null) {
                InterfaceC820920WIg interfaceC820920WIg = (InterfaceC820920WIg) this.l1;
                C0WIH c0wih = c0wix.LLILZLL;
                String str = c0wih.LIZ;
                Bundle bundle = c0wih.LIZIZ;
                C0WIN c0win = (C0WIN) interfaceC820920WIg;
                c0win.getClass();
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putInt("extra_service_version", 2);
                Bundle bundle2 = new Bundle();
                C786410Ut5.LJJJI("data_media_item_id", str, bundle2);
                C786410Ut5.LJJIJL(bundle2, "data_media_session_token", token);
                C786410Ut5.LJJIIZI(bundle2, bundle, "data_root_hints");
                c0win.LIZJ(1, bundle2);
            }
        } catch (RemoteException e2) {
            TryCatchGuardChecker.doCheck(e2);
            ((C820880WIc) this.l2).LIZ.LLILZ.remove(iBinderLIZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        r5 = new X.C0WIX(((X.C820880WIc) r11.l2).LIZ, r11.s0, r11.i4, r11.i3, (X.InterfaceC820920WIg) r11.l1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.l1
            X.0WIg r0 = (X.InterfaceC820920WIg) r0
            X.0WIN r0 = (X.C0WIN) r0
            android.os.IBinder r1 = r0.LIZ()
            java.lang.Object r0 = r11.l2
            X.0WIc r0 = (X.C820880WIc) r0
            androidx.media.MediaBrowserServiceCompat r0 = r0.LIZ
            X.0Whz<android.os.IBinder, X.0WIX> r0 = r0.LLILZ
            r0.remove(r1)
            java.lang.Object r0 = r11.l2
            X.0WIc r0 = (X.C820880WIc) r0
            androidx.media.MediaBrowserServiceCompat r0 = r0.LIZ
            java.util.ArrayList<X.0WIX> r0 = r0.LLILLL
            java.util.Iterator r4 = r0.iterator()
        L21:
            boolean r0 = r4.hasNext()
            r5 = 0
            if (r0 == 0) goto L5a
            java.lang.Object r3 = r4.next()
            X.0WIX r3 = (X.C0WIX) r3
            int r2 = r3.LLILLL
            int r0 = r11.i3
            if (r2 != r0) goto L21
            java.lang.String r0 = r11.s0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L40
            int r0 = r11.i4
            if (r0 > 0) goto L55
        L40:
            X.0WIX r5 = new X.0WIX
            java.lang.Object r0 = r11.l2
            X.0WIc r0 = (X.C820880WIc) r0
            androidx.media.MediaBrowserServiceCompat r6 = r0.LIZ
            java.lang.String r7 = r3.LL
            int r8 = r3.LLILLJJLI
            int r9 = r3.LLILLL
            java.lang.Object r10 = r11.l1
            X.0WIg r10 = (X.InterfaceC820920WIg) r10
            r5.<init>(r6, r7, r8, r9, r10)
        L55:
            r4.remove()
            if (r5 != 0) goto L6f
        L5a:
            X.0WIX r5 = new X.0WIX
            java.lang.Object r0 = r11.l2
            X.0WIc r0 = (X.C820880WIc) r0
            androidx.media.MediaBrowserServiceCompat r6 = r0.LIZ
            java.lang.String r7 = r11.s0
            int r8 = r11.i4
            int r9 = r11.i3
            java.lang.Object r10 = r11.l1
            X.0WIg r10 = (X.InterfaceC820920WIg) r10
            r5.<init>(r6, r7, r8, r9, r10)
        L6f:
            java.lang.Object r0 = r11.l2
            X.0WIc r0 = (X.C820880WIc) r0
            androidx.media.MediaBrowserServiceCompat r0 = r0.LIZ
            X.0Whz<android.os.IBinder, X.0WIX> r0 = r0.LLILZ
            r0.put(r1, r5)
            r0 = 0
            r1.linkToDeath(r5, r0)     // Catch: android.os.RemoteException -> L7f
            goto L84
        L7f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS1S1202000_13.LIZ$1():void");
    }

    public static final void run$0(ARunnableS1S1202000_13 aRunnableS1S1202000_13) {
        try {
            aRunnableS1S1202000_13.LIZ$0();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$1(ARunnableS1S1202000_13 aRunnableS1S1202000_13) {
        try {
            aRunnableS1S1202000_13.LIZ$1();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS1S1202000_13(int r2, int r3, android.os.Bundle r4, X.C820880WIc r5, X.C0WIN r6, java.lang.String r7, int r8) {
        /*
            r1 = this;
            r1.$t = r8
            if (r8 == 0) goto L13
            r0 = r1
            r0.l2 = r5
            r0.l1 = r6
            r0.i3 = r2
            r0.s0 = r7
            r0.i4 = r3
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l2 = r5
            r0.l1 = r6
            r0.s0 = r7
            r0.i3 = r2
            r0.i4 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS1S1202000_13.<init>(int, int, android.os.Bundle, X.0WIc, X.0WIN, java.lang.String, int):void");
    }
}
