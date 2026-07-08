package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.0XPC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XPC implements Runnable {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL = "settings_page";
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC849390XTt LLILZIL;

    public C0XPC(Activity activity, InterfaceC849390XTt interfaceC849390XTt, String str, String str2) {
        this.LL = activity;
        this.LLILLJJLI = str;
        this.LLILZ = str2;
        this.LLILZIL = interfaceC849390XTt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r9 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r11 = this;
            X.0XPA r1 = X.C0XPA.LIZLLL
            r1.getClass()
            android.app.Application r0 = X.C0XPY.LIZIZ
            r1.LIZIZ(r0)
            X.0XPB[] r5 = r1.LIZIZ
            int r4 = r5.length
            r3 = 0
            r2 = 0
        Lf:
            if (r2 >= r4) goto L1b
            r1 = r5[r2]
            boolean r0 = r1.LIZJ
            if (r0 == 0) goto L6a
            java.lang.String r9 = r1.LIZ
            if (r9 != 0) goto L1d
        L1b:
            java.lang.String r9 = ""
        L1d:
            X.0mTM r1 = new X.0mTM
            android.app.Activity r0 = r11.LL
            r1.<init>(r0)
            r0 = 2131827384(0x7f111ab8, float:1.928768E38)
            r1.LJFF(r0)
            java.lang.String r0 = r11.LLILLJJLI
            r1.LIZIZ(r0)
            kotlin.jvm.internal.AwS2S3200000_13 r4 = new kotlin.jvm.internal.AwS2S3200000_13
            java.lang.String r7 = r11.LLILLL
            java.lang.String r8 = r11.LLILZ
            android.app.Activity r5 = r11.LL
            X.0XTt r6 = r11.LLILZIL
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.C985403tE.LIZ(r1, r4)
            r1.LJII = r3
            X.0mTF r0 = new X.0mTF
            r0.<init>(r1)
            r0.LIZLLL()
            X.0XGR r2 = new X.0XGR
            r2.<init>()
            java.lang.String r1 = r11.LLILLL
            java.lang.String r0 = "enter_from"
            r2.LIZLLL(r0, r1)
            java.lang.String r1 = r11.LLILZ
            java.lang.String r0 = "enter_method"
            r2.LIZLLL(r0, r1)
            java.lang.String r0 = "platform"
            r2.LIZLLL(r0, r9)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "bind_notify"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L6a:
            int r2 = r2 + 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XPC.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ShowBindDialogHandler@3329.show$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShowBindDialogHandler@3329.show$1");
    }
}
