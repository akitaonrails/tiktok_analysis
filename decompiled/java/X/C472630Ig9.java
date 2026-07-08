package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdkapi.host.IHostFriends;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0Ig9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472630Ig9 {
    public final View LIZ;
    public final InterfaceC472640IgA LIZIZ;
    public AnonymousClass0956 LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(278));
    public View LJ;

    public final void LIZIZ() {
        View viewFindViewById;
        ViewGroup viewGroup;
        if (this.LJ != null) {
            return;
        }
        View view = this.LIZ;
        if (!(view instanceof ViewGroup) || view == null || (viewFindViewById = view.findViewById(R.id.n53)) == null) {
            return;
        }
        ViewParent parent = viewFindViewById.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        C786410Ut5.LJJJLZIJ(viewFindViewById, viewGroup);
        View viewVP = ((IHostFriends) this.LIZLLL.getValue()).vP(this.LIZ.getContext());
        viewVP.setId(R.id.n53);
        C786410Ut5.W5(viewVP, layoutParams);
        C786410Ut5.ed(viewVP, viewFindViewById.getTranslationY());
        viewVP.setTranslationZ(viewFindViewById.getTranslationZ());
        C500260Jjc.LJIILIIL(viewVP);
        this.LJ = viewVP;
        viewGroup.addView(viewVP);
    }

    public C472630Ig9(View view, InterfaceC472640IgA interfaceC472640IgA) {
        this.LIZ = view;
        this.LIZIZ = interfaceC472640IgA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0H1h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.livesdk.model.FeedItem r22, final androidx.lifecycle.LifecycleOwner r23, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r24) {
        /*
            r21 = this;
            r1 = r21
            X.0956 r0 = r1.LIZJ
            r10 = 0
            if (r0 == 0) goto La
            r0.LIZIZ(r10)
        La:
            r3 = r24
            r6 = r22
            if (r6 == 0) goto L2e
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r6.getRoom()
            if (r0 == 0) goto L2e
            com.bytedance.android.live.base.model.user.User r7 = r0.getOwner()
            if (r7 == 0) goto L2e
            r4 = r23
            if (r4 == 0) goto L2e
            int r5 = r6.type
            r2 = 19
            r0 = 20
            if (r5 == r0) goto L3b
            if (r5 == r2) goto L3e
            r0 = 21
            if (r5 == r0) goto L3e
        L2e:
            android.view.View r0 = r1.LJ
            if (r0 == 0) goto L35
            X.C500260Jjc.LJIILIIL(r0)
        L35:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.invoke(r0)
            return
        L3b:
            r12 = 1
        L3c:
            r13 = 0
            goto L42
        L3e:
            r12 = 0
            if (r5 != r2) goto L3c
            r13 = 1
        L42:
            long r8 = r7.getId()
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r6.getRoom()
            if (r0 == 0) goto L54
            long r5 = r0.getId()
            java.lang.Long r10 = java.lang.Long.valueOf(r5)
        L54:
            java.lang.Long r11 = r7.followStatus
            android.view.View r6 = r1.LJ
            if (r6 == 0) goto L81
            X.01GW r0 = r1.LIZLLL
            java.lang.Object r14 = r0.getValue()
            com.bytedance.android.livesdkapi.host.IHostFriends r14 = (com.bytedance.android.livesdkapi.host.IHostFriends) r14
            X.0Ig8 r5 = new X.0Ig8
            r5.<init>(r6, r7, r8, r10, r11, r12, r13)
            X.0H1h r2 = new X.0H1h
            r2.<init>()
            kotlin.jvm.internal.AwS585S0100000_6 r1 = new kotlin.jvm.internal.AwS585S0100000_6
            r0 = 295(0x127, float:4.13E-43)
            r1.<init>(r3, r0)
            r15 = r6
            r16 = r7
            r18 = r5
            r20 = r1
            r19 = r2
            r17 = r4
            r14.lc0(r15, r16, r17, r18, r19, r20)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C472630Ig9.LIZ(com.bytedance.android.livesdk.model.FeedItem, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1):void");
    }
}
