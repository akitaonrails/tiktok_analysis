package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.subscription.preview.PreviewRangeSelectorFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1168390gVh implements Observer, InterfaceC1635506an {
    public final /* synthetic */ PreviewRangeSelectorFragment LL;

    public C1168390gVh(PreviewRangeSelectorFragment previewRangeSelectorFragment) {
        this.LL = previewRangeSelectorFragment;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, PreviewRangeSelectorFragment.class, "showErrorToastMessage", "showErrorToastMessage(Lcom/ss/android/ugc/aweme/subscription/preview/PreviewRangeSelectorToastMessageError;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged(java.lang.Object r9) {
        /*
            r8 = this;
            X.0gIQ r9 = (X.AbstractC1160160gIQ) r9
            com.ss.android.ugc.aweme.subscription.preview.PreviewRangeSelectorFragment r6 = r8.LL
            r6.getClass()
            X.0gIS r0 = X.C1160180gIS.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r0)
            if (r0 == 0) goto L28
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L89
            r0 = 2131830344(0x7f112648, float:1.9293683E38)
            java.lang.String r1 = r1.getString(r0)
        L1c:
            X.0mGx r0 = new X.0mGx
            r0.<init>(r6)
            r0.LJIIJ(r1)
            r0.LJIIJJI()
            return
        L28:
            X.0gIR r0 = X.C1160170gIR.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r0)
            if (r0 == 0) goto L3e
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L89
            r0 = 2131830341(0x7f112645, float:1.9293677E38)
            java.lang.String r1 = r1.getString(r0)
            goto L1c
        L3e:
            boolean r0 = r9 instanceof X.C1160150gIP
            if (r0 == 0) goto L8b
            X.0gIP r9 = (X.C1160150gIP) r9
            float r0 = r9.LIZ
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r7 = 0
            X.0HZe r0 = X.C10FS.LIZ(r7, r0)
            java.lang.Object r5 = r0.getSecond()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r0.getThird()
            boolean r0 = kotlin.text.a0.LJJJIL(r5)
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L77
            android.content.Context r2 = r6.getContext()
            if (r2 == 0) goto L89
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r7] = r5
            r1[r3] = r4
            r0 = 2131830343(0x7f112647, float:1.929368E38)
            java.lang.String r1 = r2.getString(r0, r1)
            goto L1c
        L77:
            android.content.Context r2 = r6.getContext()
            if (r2 == 0) goto L89
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r7] = r4
            r0 = 2131830342(0x7f112646, float:1.9293679E38)
            java.lang.String r1 = r2.getString(r0, r1)
            goto L1c
        L89:
            r1 = 0
            goto L1c
        L8b:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1168390gVh.onChanged(java.lang.Object):void");
    }
}
