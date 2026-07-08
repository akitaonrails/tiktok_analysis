package X;

import Y.AfS184S0100000_15;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.ApplyGuideViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.IApplyGuideAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.utils.ApplyGuideSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aFz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928010aFz implements LifecycleOwner {
    public IApplyGuideAbility LL;
    public C11JF LLILLJJLI;
    public int LLILZ;
    public User LLILZIL;
    public String LLILLL = "";
    public final C01GW LLILZLL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 220));
    public final LifecycleRegistry LLIZ = new LifecycleRegistry(this);

    public static void LIZ() {
        C940770aaZ.LIZ().LIZIZ();
        for (AbstractC939840aZ4 abstractC939840aZ4 : (ArrayList) C937830aVp.LIZIZ(EnumC939900aZA.NO_GUEST, null)) {
            if (abstractC939840aZ4 instanceof C934190aPx) {
                ((C934190aPx) abstractC939840aZ4).LJIILL(false, false, null, false);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLIZ;
    }

    public C928010aFz(DataChannel dataChannel) {
    }

    public final void LIZJ(User user, boolean z) {
        String str;
        C940770aaZ.LIZ().LIZIZ();
        Object next = null;
        Iterator it2 = ((ArrayList) C937830aVp.LIZIZ(EnumC939900aZA.NO_GUEST, null)).iterator();
        if (it2.hasNext()) {
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
        AbstractC939840aZ4 abstractC939840aZ4 = (AbstractC939840aZ4) next;
        if (abstractC939840aZ4 != null && (abstractC939840aZ4 instanceof C934190aPx)) {
            if (z) {
                int i = this.LLILZ;
                C957020b0m window = abstractC939840aZ4.getWindow();
                window.getClass();
                if (i == System.identityHashCode(window)) {
                    C20441214yg.LIZIZ("ApplyLinkMicHandler", "showApplyGuide show on the same");
                    return;
                }
                LIZ();
            }
            C957020b0m window2 = abstractC939840aZ4.getWindow();
            window2.getClass();
            this.LLILZ = System.identityHashCode(window2);
            this.LLILZIL = user;
            C20441214yg.LIZIZ("ApplyLinkMicHandler", "showApplyGuide show apply request resume=" + z);
            ((C934190aPx) abstractC939840aZ4).LJIILL(true, true, user, z);
            int iLIZJ = C940770aaZ.LIZ().getDataSource().LIZJ() + (-1);
            Room roomLJIIIZ = C930540aK4.LJIIIZ();
            int iLJ3 = C933710aPB.LJ(abstractC939840aZ4.getWindow().getPosIdentity());
            String str2 = this.LLILLL;
            if (ApplyGuideSetting.INSTANCE.getStyle() > 0) {
                str = "2";
            } else {
                str = "1";
            }
            C927960aFu.LIZIZ(roomLJIIIZ, iLIZJ, iLJ3, str2, str);
        }
    }

    public final void LIZIZ(User user, String str, boolean z) {
        long j;
        ApplyGuideViewModel viewModel;
        C937570aVP c937570aVPWQ2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeApplyGuide show:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("ApplyLinkMicHandler", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            this.LLILLL = str;
            if (ApplyGuideSetting.INSTANCE.getStyle() != 2) {
                C940770aaZ.LIZ().LIZIZ();
                for (AbstractC939840aZ4 abstractC939840aZ4 : (ArrayList) C937830aVp.LIZIZ(EnumC939900aZA.NO_GUEST, null)) {
                    if (abstractC939840aZ4 instanceof C934190aPx) {
                        ((C934190aPx) abstractC939840aZ4).LJIILL(true, false, null, false);
                    }
                }
            }
            LIZJ(user, false);
            C11JF c11jf = this.LLILLJJLI;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LLILLJJLI = null;
            this.LLILZ = 0;
            this.LLILZIL = null;
            IApplyGuideAbility iApplyGuideAbility = this.LL;
            if (iApplyGuideAbility != null && (viewModel = iApplyGuideAbility.getViewModel()) != null && (c937570aVPWQ2 = viewModel.wQ2()) != null) {
                j = c937570aVPWQ2.LIZ;
            } else {
                j = 0;
            }
            this.LLILLJJLI = (C11JF) C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS).LJIILIIL(new C0UO0()).LJJLJLI(new AfS184S0100000_15(this, 112));
            return;
        }
        C11JF c11jf2 = this.LLILLJJLI;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LLILLJJLI = null;
        this.LLILZ = 0;
        this.LLILZIL = null;
        LIZ();
    }
}
