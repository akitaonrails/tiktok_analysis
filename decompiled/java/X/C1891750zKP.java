package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.emojisticker.api.model.StickerInteractionDetailsInsertion;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zKP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891750zKP implements InterfaceC19599811mG {
    public final Context LIZ;
    public final C1895007bY LIZIZ;
    public final DialogInterface.OnDismissListener LIZJ;
    public final int LIZLLL;
    public ViewOnAttachStateChangeListenerC20604515jv LJ;
    public C1749280vcc LJFF;
    public TuxSheet LJI;
    public final C01GW LJII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 913));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 915));
    public List<StickerInteractionDetailsInsertion> LJIIIZ = C13BV.INSTANCE;
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 914));

    public final C1891790zKT LIZJ() {
        return (C1891790zKT) this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC19599811mG
    public final void LJLJJI(Aweme aweme) {
        LIZJ().LIZJ(aweme);
    }

    @Override // X.InterfaceC19599811mG
    public final void LJLJJL(List<StickerInteractionDetailsInsertion> list) {
        TuxSheet tuxSheet;
        FragmentManager fragmentManager = (FragmentManager) this.LJII.getValue();
        if (fragmentManager != null && (tuxSheet = this.LJI) != null) {
            tuxSheet.show(fragmentManager, "InteractiveEmoji.SingleStickerListManager");
        }
        this.LJIIIZ = list;
    }

    @Override // X.InterfaceC19599811mG
    public final void LIZ(String str, String str2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1891270zJd(this, str, str2, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // X.InterfaceC19599811mG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C13BV r7, kotlin.jvm.internal.AwS585S0100000_6 r8) {
        /*
            r6 = this;
            r6.LJLJJL(r7)
            java.lang.Class<com.ss.android.ugc.aweme.IDetailFeedSafService> r0 = com.ss.android.ugc.aweme.IDetailFeedSafService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.IDetailFeedSafService r1 = (com.ss.android.ugc.aweme.IDetailFeedSafService) r1
            if (r1 == 0) goto L40
            X.0mCc r0 = X.C1906580ziK.LJFF()
            if (r0 == 0) goto L1d
            androidx.fragment.app.Fragment r5 = r0.LIZLLL()
        L1d:
            androidx.fragment.app.Fragment r0 = r1.LIZLLL(r5)
            if (r0 == 0) goto L40
            X.0mCc r0 = X.C1906580ziK.LJFF()
            if (r0 == 0) goto L3f
            androidx.fragment.app.Fragment r3 = r0.LIZLLL()
        L2d:
            if (r3 == 0) goto L3f
            X.0zKT r0 = r6.LIZJ()
            androidx.lifecycle.MutableLiveData<java.lang.Long> r2 = r0.LJI
            Y.AObserverS210S0100000_6 r1 = new Y.AObserverS210S0100000_6
            r0 = 44
            r1.<init>(r8, r0)
            r2.observe(r3, r1)
        L3f:
            return
        L40:
            android.content.Context r0 = r6.LIZ
            X.19EG r3 = X.C1388190mED.LIZIZ(r0)
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1891750zKP.LIZIZ(X.13BV, kotlin.jvm.internal.AwS585S0100000_6):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1891750zKP(android.content.Context r13, X.C1895007bY r14, android.content.DialogInterface.OnDismissListener r15, int r16) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1891750zKP.<init>(android.content.Context, X.07bY, android.content.DialogInterface$OnDismissListener, int):void");
    }
}
