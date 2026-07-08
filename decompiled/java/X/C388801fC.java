package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.01fC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C388801fC implements InterfaceC395901gL {
    public final int LL;
    public View LLILLJJLI;
    public TextView LLILLL;
    public final long LLILZ;
    public final long LLILZIL;
    public final C397301gZ LLILZLL;
    public final C01GW LLIZ;

    @Override // X.InterfaceC395901gL
    public final void LIZ(boolean z) {
    }

    @Override // X.InterfaceC395901gL
    public final void LIZIZ(boolean z) {
    }

    @Override // X.InterfaceC395901gL
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC395901gL
    public final int getLayoutId() {
        return R.layout.huc;
    }

    @Override // X.InterfaceC395901gL
    public final InterfaceC392301fl getStatusCallback() {
        return null;
    }

    @Override // X.InterfaceC395901gL
    public final C394501g7 getConfig() {
        return (C394501g7) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC395901gL
    public final boolean LJI() {
        return getConfig().LJFF;
    }

    @Override // X.InterfaceC395901gL
    public final void LJFF() {
        C397101gX.LIZ(this);
    }

    @Override // X.InterfaceC395901gL
    public final long getBoardId() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC395901gL
    public final C397301gZ getBoardSeiInfo() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC395901gL
    public final long getGroupId() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC395901gL
    public final View getView() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC395901gL
    public final void LIZJ(float f) {
        C397101gX.LIZLLL(this, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[PHI: r4
      0x0030: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:11:0x002e, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C388801fC(int r12, long r13, com.bytedance.ies.sdk.datachannel.DataChannel r15) {
        /*
            r11 = this;
            r11.<init>()
            r11.LL = r12
            r11.LLILZ = r13
            r11.LLILZIL = r13
            X.01gZ r2 = new X.01gZ
            java.lang.String r3 = java.lang.String.valueOf(r13)
            java.lang.String r5 = ""
            if (r15 == 0) goto L2d
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C500260Jjc.LJJLIIIIJ(r15)
            if (r0 == 0) goto L2d
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto L2d
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r4 = r0.toString()
            if (r4 != 0) goto L30
        L2d:
            r4 = r5
            if (r15 == 0) goto L45
        L30:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C500260Jjc.LJJLIIIIJ(r15)
            if (r0 == 0) goto L45
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L45
            r5 = r0
        L45:
            long r0 = android.os.SystemClock.currentThreadTimeMillis()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.String r7 = "queue"
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            r10 = 32280(0x7e18, float:4.5234E-41)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.LLILZLL = r2
            X.01gA r0 = new X.01gA
            r0.<init>()
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            r11.LLIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C388801fC.<init>(int, long, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    @Override // X.InterfaceC395901gL
    public final void LJ(float f, float f2, float f3, float f4) {
        C397101gX.LIZJ(this, f, f2);
    }
}
