package X;

import Y.ACListenerS168S0100000_34;
import Y.ACListenerS91S0300000_27;
import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.0ybQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863860ybQ extends AbstractC1863870ybR {
    public C1863860ybQ(Context context) {
        C427870Gq9 avatar;
        super(context, null, 0);
        TuxTextView name = getName();
        if (name != null) {
            C786410Ut5.h9(name, new ACListenerS168S0100000_34(this, 36));
        }
        if (C298860BnY.LIZ() && (avatar = getAvatar()) != null) {
            C786410Ut5.P8(avatar, new ACListenerS168S0100000_34(this, 37));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1 A[PHI: r3
      0x00a1: PHI (r3v9 java.lang.String) = (r3v7 java.lang.String), (r3v10 java.lang.String) binds: [B:32:0x009f, B:30:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(android.view.View r23) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863860ybQ.LJ(android.view.View):void");
    }

    @Override // X.AbstractC1863890ybT
    public final void LIZLLL(InterfaceC21657319pL interfaceC21657319pL, AwS577S0100000_33 awS577S0100000_33) {
        TakoActiveBotItem takoActiveBotItem = (TakoActiveBotItem) interfaceC21657319pL;
        super.LIZLLL(takoActiveBotItem, awS577S0100000_33);
        C0OBG.LIZ(1000L, getExit());
        TuxTextView exit = getExit();
        if (exit != null) {
            C786410Ut5.h9(exit, new ACListenerS91S0300000_27(this, takoActiveBotItem, awS577S0100000_33, 10));
        }
    }
}
