package X;

import Y.ACListenerS113S0200000_9;
import Y.AObserverS213S0100000_9;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import avg.f;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mf.a;

/* JADX INFO: renamed from: X.0OHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616980OHw implements C0OR4, Observer<EnumC617010OHz> {
    public final C0OR2 LL;
    public C604810Nnr LLILLJJLI;
    public Long LLILLL;
    public InterfaceC1631630sYr<? super Context, ? super C604810Nnr, ? super C604870Nnx, ? super Function1<? super Boolean, Unit>, Unit> LLILZIL;
    public boolean LLILZLL;
    public final NextLiveData<EnumC617010OHz> LLILZ = new NextLiveData<>();
    public final AObserverS213S0100000_9 LLIZ = new AObserverS213S0100000_9(this, 11);

    @Override // X.C0OR4
    public final void LJJIJIIJIL() {
    }

    public C616980OHw(C0OR2 c0or2) {
        this.LL = c0or2;
    }

    public final void LIZ(C604810Nnr c604810Nnr) {
        LifecycleOwner lifecycleOwner = c604810Nnr.LIZIZ;
        if (lifecycleOwner != null) {
            this.LLILZ.observe(lifecycleOwner, this.LLIZ);
        }
        C0OI0 c0oi0 = EnumC617010OHz.Companion;
        int i = c604810Nnr.LIZJ;
        c0oi0.getClass();
        EnumC617010OHz enumC617010OHzLIZ = C0OI0.LIZ(i);
        LifecycleOwner lifecycleOwner2 = c604810Nnr.LIZIZ;
        if (lifecycleOwner2 != null) {
            C0OI1 c0oi1 = C0OI1.LIZ;
            long j = c604810Nnr.LIZ;
            c0oi1.getClass();
            EnumC617010OHz enumC617010OHzLIZ2 = C0OI1.LIZ(j, lifecycleOwner2, this);
            if (enumC617010OHzLIZ2 != null && enumC617010OHzLIZ2.getStatus() != c604810Nnr.LIZJ && enumC617010OHzLIZ2 != EnumC617010OHz.INVALID) {
                enumC617010OHzLIZ = enumC617010OHzLIZ2;
            }
        }
        this.LLILZ.setValue(enumC617010OHzLIZ);
    }

    public final void LIZJ(int i) {
        C604850Nnv.LIZ.getClass();
        C604860Nnw c604860Nnw = C604850Nnv.LIZIZ.get(Integer.valueOf(i));
        if (c604860Nnw != null) {
            this.LL.setButtonVariant(c604860Nnw.LIZIZ);
            C0OR2 c0or2 = this.LL;
            c0or2.setText(c0or2.getCtx().getText(c604860Nnw.LIZ));
            this.LLILZIL = c604860Nnw.LIZJ;
            this.LLILZLL = c604860Nnw.LIZLLL;
        }
    }

    @Override // X.C0OR4
    public final void LJIIL(C604810Nnr c604810Nnr) {
        LifecycleCoroutineScope lifecycleScope;
        this.LLILLL = Long.valueOf(c604810Nnr.LIZ);
        this.LLILLJJLI = c604810Nnr;
        C0OR2 c0or2 = this.LL;
        c0or2.setButtonSize(1);
        c0or2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        c0or2.setTuxFont(42);
        c0or2.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
        c0or2.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)));
        View.OnClickListener aCListenerS113S0200000_9 = new ACListenerS113S0200000_9(this, c0or2, 27);
        if (C1848410yCV.LIZ) {
            aCListenerS113S0200000_9 = new f(aCListenerS113S0200000_9);
        }
        a aVar = new a(aCListenerS113S0200000_9);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0or2);
        }
        c0or2.setOnClickListener(aVar);
        this.LL.setLoading(false);
        if (c604810Nnr.LIZJ != EnumC617010OHz.INVALID.getStatus() && C123100dR.LIZ(c604810Nnr.LJ)) {
            LIZ(c604810Nnr);
            return;
        }
        this.LL.setLoading(true);
        LifecycleOwner lifecycleOwner = c604810Nnr.LIZIZ;
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C604880Nny(this, c604810Nnr, null), 2);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(EnumC617010OHz enumC617010OHz) {
        this.LLILZ.setValue(enumC617010OHz);
        Function1<EnumC617010OHz, Unit> subscribeChangeListener = this.LL.getSubscribeChangeListener();
        if (subscribeChangeListener != null) {
            subscribeChangeListener.invoke(enumC617010OHz);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(kotlin.jvm.internal.AwS478S0200000_9 r12, X.InterfaceC1364105Vn r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C604890Nnz
            if (r0 == 0) goto L6f
            r10 = r13
            X.0Nnz r10 = (X.C604890Nnz) r10
            int r2 = r10.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r10.LLILZ = r2
        L12:
            java.lang.Object r4 = r10.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LLILZ
            r1 = 1
            if (r0 == 0) goto L4c
            if (r0 != r1) goto L75
            X.0sYq r12 = r10.LL
            X.C155000ia.LIZIZ(r4)
        L24:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse r4 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse) r4
            if (r4 == 0) goto L49
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSubscriptionInfo r3 = r4.subscriptionInfo
            if (r3 == 0) goto L49
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo r0 = r4.accountInfo
            if (r0 == 0) goto L49
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.channelOwner
            if (r0 == 0) goto L49
            java.lang.String r2 = r0.getUid()
            if (r2 == 0) goto L49
            int r0 = r3.subscribeStatus
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            boolean r0 = r3.noNeedFollowOnSubscribe
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12.invoke(r1, r0, r2)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4c:
            X.C155000ia.LIZIZ(r4)
            java.lang.Long r0 = r11.LLILLL
            if (r0 == 0) goto L49
            long r4 = r0.longValue()
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r3 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()
            r10.LL = r12
            r10.LLILZ = r1
            X.0Nol r0 = X.EnumC605370Nol.ACCOUNT_INFO_LOAD_TYPE_DEFAULT
            int r6 = r0.getType()
            r7 = 0
            r8 = r7
            r9 = r7
            java.lang.Object r4 = r3.LJIJJLI(r4, r6, r7, r8, r9, r10)
            if (r4 != r2) goto L24
            return r2
        L6f:
            X.0Nnz r10 = new X.0Nnz
            r10.<init>(r11, r13)
            goto L12
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C616980OHw.LIZIZ(kotlin.jvm.internal.AwS478S0200000_9, X.05Vn):java.lang.Object");
    }
}
