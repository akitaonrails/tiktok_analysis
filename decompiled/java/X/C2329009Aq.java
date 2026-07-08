package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.ui.NoticeboardEnlargeFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3NoticeFixSetting;

/* JADX INFO: renamed from: X.09Aq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2329009Aq<T> implements InterfaceC300801Eo {
    public final /* synthetic */ NoticeboardEnlargeFragment LL;
    public final /* synthetic */ String LLILLJJLI;

    public C2329009Aq(NoticeboardEnlargeFragment noticeboardEnlargeFragment, String str) {
        this.LL = noticeboardEnlargeFragment;
        this.LLILLJJLI = str;
    }

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<Bitmap> interfaceC2329309At) {
        if (MultiGuestV3NoticeFixSetting.INSTANCE.getValue()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL.getViewLifecycleOwner()), C0PEM.LIZJ, null, new C2328709An(this.LLILLJJLI, interfaceC2329309At, null), 2);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2328809Ao(this.LLILLJJLI, interfaceC2329309At, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(java.lang.String r5, X.InterfaceC2329309At<android.graphics.Bitmap> r6, boolean r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof X.C2328909Ap
            if (r0 == 0) goto L48
            r4 = r8
            X.09Ap r4 = (X.C2328909Ap) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L33
            if (r1 != r0) goto L80
            boolean r7 = r4.LLILLJJLI
            X.09At r6 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L26:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r7 == 0) goto L68
            if (r3 == 0) goto L68
            boolean r0 = r3.isRecycled()
            if (r0 != 0) goto L68
            goto L4e
        L33:
            X.C155000ia.LIZIZ(r3)
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r5)
            r4.LL = r6
            r4.LLILLJJLI = r7
            r4.LLILZ = r0
            r0 = 0
            java.lang.Object r3 = X.C207206166i.LIZ(r1, r0, r4)
            if (r3 != r2) goto L26
            return r2
        L48:
            X.09Ap r4 = new X.09Ap
            r4.<init>(r8)
            goto L12
        L4e:
            boolean r0 = r3.isRecycled()     // Catch: java.lang.Exception -> L71
            if (r0 != 0) goto L5f
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Exception -> L71
            r0 = 0
            android.graphics.Bitmap r0 = r3.copy(r1, r0)     // Catch: java.lang.Exception -> L71
            r6.onSuccess(r0)     // Catch: java.lang.Exception -> L71
            goto L7d
        L5f:
            X.09Ar r0 = new X.09Ar     // Catch: java.lang.Exception -> L71
            r0.<init>()     // Catch: java.lang.Exception -> L71
            r6.onError(r0)     // Catch: java.lang.Exception -> L71
            goto L7d
        L68:
            X.09Ar r0 = new X.09Ar
            r0.<init>()
            r6.onError(r0)
            goto L7d
        L71:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.09Ar r0 = new X.09Ar
            r0.<init>()
            r6.onError(r0)
        L7d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2329009Aq.LIZ(java.lang.String, X.09At, boolean, X.05Vn):java.lang.Object");
    }
}
