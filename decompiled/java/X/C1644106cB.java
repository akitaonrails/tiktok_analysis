package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model.ECBannerContent;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06cB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1644106cB extends C06O6<C06AH> {
    public final C1600706On LLILZ;
    public final C01GW LLILZIL;
    public final Set<C067L> LLILZLL;
    public final Set<EnumC1596306Mv> LLIZ;
    public ECBannerContent LLIZLLLIL;

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return (C067K) this.LLILZIL.getValue();
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLILZLL;
    }

    public C1644106cB(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1312));
        this.LLILZLL = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS});
        this.LLIZ = Collections.singleton(EnumC1596306Mv.EC_SELLER);
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        C1646606ca c1646606ca;
        View view = this.LLILLL;
        if ((view instanceof C1646606ca) && (c1646606ca = (C1646606ca) view) != null && c1646606ca.getVisibility() == 0) {
            int visibility = c1646606ca.getVisibility();
            c1646606ca.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c1646606ca);
            c1646606ca.LLZLI();
        }
        this.LLIZLLLIL = null;
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object c098200Yq;
        Long l;
        C06AH c06ah = (C06AH) c06oo;
        ECBannerContent eCBannerContent = this.LLIZLLLIL;
        if (eCBannerContent == null) {
            try {
                c098200Yq = (ECBannerContent) C051M.LIZIZ(ECBannerContent.class, c06ah.LIZJ.msgContent.tips);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            eCBannerContent = (ECBannerContent) c098200Yq;
        }
        this.LLIZLLLIL = eCBannerContent;
        if (c06ah.LIZ.isDebugMode()) {
            return C06OI.LIZ;
        }
        ECBannerContent eCBannerContent2 = this.LLIZLLLIL;
        if (eCBannerContent2 != null && (l = eCBannerContent2.orderId) != null) {
            if (C1646406cY.LIZ(l.longValue()) >= 3) {
                return new C06OH("Inactive count exceeded");
            }
            if (this.LLILZ.LJI.getChatType() == 3) {
                return new C06OH("Group chat");
            }
            return C06OI.LIZ;
        }
        return new C06OH("Missing order id");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // X.C06O6
    /* JADX INFO: renamed from: LJIIL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C06AH r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1644206cC
            if (r0 == 0) goto L4a
            r4 = r7
            X.06cC r4 = (X.C1644206cC) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L40
            if (r1 != r0) goto L50
            X.C155000ia.LIZIZ(r3)
        L22:
            X.06On r0 = r5.LLILZ
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r4 = r0.LJI
            android.view.View r3 = r5.LLILLL
            boolean r0 = r3 instanceof X.C1646606ca
            if (r0 == 0) goto L3d
            X.06ca r3 = (X.C1646606ca) r3
            if (r3 == 0) goto L3d
            com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model.ECBannerContent r2 = r5.LLIZLLLIL
            java.lang.String r1 = r4.getConversationId()
            java.lang.String r0 = r4.getSingleChatFromUserId()
            r3.LIZ(r2, r1, r0)
        L3d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r2) goto L22
            return r2
        L4a:
            X.06cC r4 = new X.06cC
            r4.<init>(r5, r7)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1644106cB.LJIIJ(X.06AH, X.05Vn):java.lang.Object");
    }
}
