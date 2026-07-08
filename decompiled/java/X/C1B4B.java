package X;

import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.share.ClientScopeResponse;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1B4B, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B4B {
    public final C1B4P LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final MutableLiveData<C1B4Q> LIZLLL;
    public final MutableLiveData LJ;
    public final MutableLiveData<Unit> LJFF;
    public final MutableLiveData LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public ClientScopeResponse LJIIJ;

    public C1B4B(C1B4P c1b4p, String str, String str2) {
        this.LIZ = c1b4p;
        this.LIZIZ = str;
        this.LIZJ = str2;
        MutableLiveData<C1B4Q> mutableLiveData = new MutableLiveData<>();
        this.LIZLLL = mutableLiveData;
        this.LJ = mutableLiveData;
        MutableLiveData<Unit> mutableLiveData2 = new MutableLiveData<>();
        this.LJFF = mutableLiveData2;
        this.LJI = mutableLiveData2;
        this.LJII = "aweme.share";
        this.LJIIIIZZ = "share.channel.video";
        this.LJIIIZ = "share.channel.photo";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C1402840mbq r19, android.app.Activity r20, X.InterfaceC1364105Vn r21) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B4B.LIZIZ(X.0mbq, android.app.Activity, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.app.Activity r12, X.C1402840mbq r13, java.lang.String r14, java.lang.String r15, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.share.ClientScopeResponse> r16) throws java.lang.Exception {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C1B4L
            if (r0 == 0) goto L54
            r10 = r3
            X.1B4L r10 = (X.C1B4L) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r10.LLILLL = r2
        L14:
            java.lang.Object r3 = r10.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L5a
            X.C155000ia.LIZIZ(r3)
        L24:
            com.ss.android.ugc.aweme.share.ClientScopeResponse r3 = (com.ss.android.ugc.aweme.share.ClientScopeResponse) r3
            r11.LJIIJ = r3
            if (r3 == 0) goto L62
            return r3
        L2b:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.share.ClientScopeResponse r0 = r11.LJIIJ
            if (r0 == 0) goto L33
            return r0
        L33:
            java.lang.String r3 = r13.mClientKey
            boolean r7 = X.C1B46.LJII(r12)
            java.lang.String r4 = r11.LIZJ
            if (r4 == 0) goto L62
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            java.lang.String r5 = X.C0WI6.LIZ(r0, r4)
            java.lang.String r6 = r13.getSdkNameForServer()
            r10.LLILLL = r1
            r9 = r15
            r8 = r14
            java.lang.Object r3 = X.C2194101Au0.LIZ(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r3 != r2) goto L24
            return r2
        L54:
            X.1B4L r10 = new X.1B4L
            r10.<init>(r11, r3)
            goto L14
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L62:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "Caller package is missing"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B4B.LIZ(android.app.Activity, X.0mbq, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static void LIZJ(C1B4B c1b4b, Activity activity, C1402840mbq c1402840mbq, String str, MusicModel musicModel, boolean z, int i) {
        boolean z2;
        boolean z3 = z;
        MusicModel musicModel2 = musicModel;
        String str2 = str;
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            musicModel2 = null;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1b4b.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1B4I(activity, c1b4b, c1402840mbq, new C580380MpY(), z2, str2, musicModel2, z3, null), 3);
    }
}
