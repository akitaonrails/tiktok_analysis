package X;

import android.os.Looper;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.service.IQuickCoHostService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupResult;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0awJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954250awJ {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Type inference failed for: r10v0, types: [X.0awR] */
    public static InterfaceC954900axM LIZ(InterfaceC954180awC interfaceC954180awC, InterfaceC954320awQ interfaceC954320awQ, C956200azS c956200azS, long j) {
        IQuickCoHostService iQuickCoHostServiceLJIIIZ = C915980Zwa.LJIIIZ();
        if (!LiveDirectMatchSetting.INSTANCE.isEnabled()) {
            C20441214yg.LJIIIZ("DecoratedLinkMicSessionModule", "Setting is not enabled. DummyDecoratedLinkMicSession is used");
            return new C954160awA(interfaceC954180awC);
        }
        if (interfaceC954320awQ == null) {
            C20441214yg.LJ("DecoratedLinkMicSessionModule", "DummyDecoratedLinkMicSession is used");
            return new C954160awA(interfaceC954180awC);
        }
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ));
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        C964640bD4 c964640bD4 = new C964640bD4(c054gLIZ, AFwS189S0000000_3.get$arr$(1525), c956200azS);
        C954270awL c954270awL = new C954270awL(c054gLIZ, interfaceC954320awQ, new C955960az4(interfaceC954180awC, c964640bD4), interfaceC954180awC);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DecoratedLinkMicSession is created, originLinkMicSession=");
        sbLIZ.append(interfaceC954180awC);
        C20441214yg.LJIIIZ("DecoratedLinkMicSessionModule", C2188811AlT.LIZIZ(sbLIZ));
        return new C954170awB(interfaceC954180awC, new C954340awS(C784440Upu.LIZ(), C950220apo.LJFF(), c964640bD4), new C957570b1f(c784440UpuLIZ, bPEAHandler), new AbstractC957580b1g<C954620awu, ReplyInviteGroupResult>() { // from class: X.0awR
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.AbstractC957580b1g
            public final boolean LIZ(C954620awu c954620awu, AbstractC915270ZvR abstractC915270ZvR, InterfaceC920680a4A<ReplyInviteGroupResult> interfaceC920680a4A) {
                if (!Intrinsics.LJFF(abstractC915270ZvR, C915280ZvS.LIZ)) {
                    AbstractC957580b1g<DATA, RESULT> abstractC957580b1g = this.LIZ;
                    if (abstractC957580b1g != 0) {
                        return abstractC957580b1g.LIZ((DATA) c954620awu, abstractC915270ZvR, (InterfaceC920680a4A<RESULT>) interfaceC920680a4A);
                    }
                    return false;
                }
                interfaceC920680a4A.onSuccess(new ReplyInviteGroupResult("quick_battle"));
                return true;
            }
        }, c954270awL, c964640bD4, c954270awL, j, iQuickCoHostServiceLJIIIZ);
    }
}
