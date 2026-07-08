package Y;

import X.C09JN;
import X.C176800m6;
import X.C1C7U;
import X.C20361214lm;
import X.C916750Zxp;
import X.InterfaceC923600a8s;
import X.InterfaceC979390bar;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.NoticeboardEntity;
import com.bytedance.android.live.liveinteract.multilive.model.LetViewerSingReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AfS28S0500000_15 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, com.bytedance.android.livesdk.model.message.linkcore.ApplyRequestResponse, com.bytedance.android.livesdk.model.message.linkcore.LinkMicUplinkBaseResp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS28S0500000_15 r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS28S0500000_15.accept$0(Y.AfS28S0500000_15, java.lang.Object):void");
    }

    public static final void accept$1(AfS28S0500000_15 afS28S0500000_15, Object obj) {
        C1C7U.LIZ("NoticeboardEntity@cd1e.readyToEdit$3");
        if (obj instanceof C176800m6) {
            ((NoticeboardEntity) afS28S0500000_15.l0).LJJLJLI((Context) afS28S0500000_15.l1, (C916750Zxp) afS28S0500000_15.l2, (InterfaceC979390bar) afS28S0500000_15.l3, (C20361214lm) afS28S0500000_15.l4);
        }
        C1C7U.LIZIZ("NoticeboardEntity@cd1e.readyToEdit$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS28S0500000_15(Object obj, KaraokeGuestViewModel karaokeGuestViewModel, LetViewerSingReq letViewerSingReq, InterfaceC923600a8s interfaceC923600a8s, Function1<? super Throwable, Unit> function1, Function1<? super Boolean, Unit> function12) {
        this.$t = function12;
        this.l0 = obj;
        this.l1 = karaokeGuestViewModel;
        this.l2 = letViewerSingReq;
        this.l3 = interfaceC923600a8s;
        this.l4 = function1;
    }
}
