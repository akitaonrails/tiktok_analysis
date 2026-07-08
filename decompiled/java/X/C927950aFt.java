package X;

import Y.AfS184S0100000_15;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.ApplyGuideViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.IApplyGuideAbility;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0aFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927950aFt {
    public final DataChannel LIZ;
    public final LifecycleOwner LIZIZ;
    public IApplyGuideAbility LIZJ;
    public C11JF LIZLLL;

    public static void LIZ() {
        C940770aaZ.LIZ().LIZIZ();
        for (AbstractC939840aZ4 abstractC939840aZ4 : (ArrayList) C937830aVp.LIZIZ(EnumC939900aZA.VOICE_NO_GUEST, null)) {
            if (abstractC939840aZ4 instanceof C933730aPD) {
                ((C933730aPD) abstractC939840aZ4).LIZIZ(false, false);
            }
        }
    }

    public C927950aFt(VoiceChatWatchWidget voiceChatWatchWidget, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = voiceChatWatchWidget;
    }

    public final void LIZIZ(String str, boolean z) {
        Object next;
        long j;
        ApplyGuideViewModel viewModel;
        C937570aVP c937570aVPWQ2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeApplyGuide show:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("VoiceChatApplyGuideHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C940770aaZ.LIZ().LIZIZ();
            for (AbstractC939840aZ4 abstractC939840aZ4 : (ArrayList) C937830aVp.LIZIZ(EnumC939900aZA.VOICE_NO_GUEST, null)) {
                if (abstractC939840aZ4 instanceof C933730aPD) {
                    ((C933730aPD) abstractC939840aZ4).LIZIZ(true, false);
                }
            }
            C940770aaZ.LIZ().LIZIZ();
            Iterator it2 = ((ArrayList) C937830aVp.LIZIZ(EnumC939900aZA.VOICE_NO_GUEST, null)).iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    int iLJ = C933710aPB.LJ(((AbstractC939840aZ4) next).getWindow().getPosIdentity());
                    do {
                        Object next2 = it2.next();
                        int iLJ2 = C933710aPB.LJ(((AbstractC939840aZ4) next2).getWindow().getPosIdentity());
                        if (iLJ > iLJ2) {
                            next = next2;
                            iLJ = iLJ2;
                        }
                    } while (it2.hasNext());
                }
            }
            AbstractC939840aZ4 abstractC939840aZ42 = (AbstractC939840aZ4) next;
            if (abstractC939840aZ42 != null && (abstractC939840aZ42 instanceof C933730aPD)) {
                int iLJ3 = C933710aPB.LJ(abstractC939840aZ42.getWindow().getPosIdentity());
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                C927960aFu.LIZIZ(C930540aK4.LJIIIZ(), C927600aFK.LJI(), iLJ3, str, null);
                ((C933730aPD) abstractC939840aZ42).LIZIZ(true, true);
            }
            IApplyGuideAbility iApplyGuideAbility = this.LIZJ;
            if (iApplyGuideAbility != null && (viewModel = iApplyGuideAbility.getViewModel()) != null && (c937570aVPWQ2 = viewModel.wQ2()) != null) {
                j = c937570aVPWQ2.LIZ;
            } else {
                j = 0;
            }
            this.LIZLLL = (C11JF) C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS).LJIILIIL(new C0UO0()).LJJLJLI(new AfS184S0100000_15(this, 220));
            return;
        }
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LIZLLL = null;
        LIZ();
    }
}
