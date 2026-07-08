package X;

import Y.ARunnableS75S0200000_6;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService;
import com.ss.android.ugc.aweme.feed.model.AIRemixInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M7S, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M7S implements InterfaceC1370310llN {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final C0M7D LLILLL;
    public final boolean LLILZ;
    public final C054G LLILZIL;
    public final BPEAHandler LLILZLL;
    public AnonymousClass0956 LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public int LLJ;
    public InterfaceC1362720lZ8 LLJI;
    public final C0M70 LLJIJIL;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_ai_remix_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_ai_remix_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return false;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return 2131846028;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "ai_remix";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    public final void LIZ() {
        Unit unit;
        try {
            InterfaceC1362720lZ8 interfaceC1362720lZ8 = this.LLJI;
            if (interfaceC1362720lZ8 != null) {
                interfaceC1362720lZ8.F8(new C572630Md3());
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        return Intrinsics.LJFF(this.LLILLL.getState().getValue(), C0M76.LIZ);
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return this.LLILZ && !this.LLILLL.LIZJ();
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.ShareButton;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    public final void LIZIZ(IAIRemixEntranceMobService iAIRemixEntranceMobService) {
        String firstGid;
        String str = this.LLILLJJLI;
        boolean zEnable = enable();
        String mobName = this.LLJIJIL.getMobName();
        String aid = this.LL.getAid();
        AIRemixInfo aIRemixInfo = this.LL.aiRemixInfo;
        String gamePlay = null;
        if (aIRemixInfo != null) {
            firstGid = aIRemixInfo.getFirstGid();
        } else {
            firstGid = null;
        }
        AIRemixInfo aIRemixInfo2 = this.LL.aiRemixInfo;
        if (aIRemixInfo2 != null) {
            gamePlay = aIRemixInfo2.getGamePlay();
        }
        this.LL.getAwemeType();
        iAIRemixEntranceMobService.LJFF(str, zEnable, mobName, aid, firstGid, gamePlay, this.LL);
    }

    public final void LJ(RecyclerView recyclerView) {
        AbstractC21673619ry adapter;
        AbstractC21673619ry adapter2;
        AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
        recyclerView.setItemAnimator(null);
        try {
            int i = this.LLJ;
            if (i >= 0 && (adapter = recyclerView.getAdapter()) != null && i < adapter.getItemCount() && (adapter2 = recyclerView.getAdapter()) != null) {
                adapter2.notifyItemChanged(this.LLJ);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        HandlerHook.viewPost(recyclerView, new ARunnableS75S0200000_6(recyclerView, itemAnimator, 86));
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
        this.LLJI = interfaceC1362720lZ8;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        String firstGid;
        String gamePlay;
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null && !creativeToolsBizPluginServiceLIZ.LIZ()) {
            CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ2 = C0LOV.LIZ();
            if (creativeToolsBizPluginServiceLIZ2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("airemix_");
                sbLIZ.append(C0M70.SHARE_PANEL.getMobName());
                creativeToolsBizPluginServiceLIZ2.LIZIZ(context, C2188811AlT.LIZIZ(sbLIZ), true);
                return;
            }
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            return;
        }
        IAIRemixEntranceMobService.LIZ.getClass();
        IAIRemixEntranceMobService iAIRemixEntranceMobServiceLIZ = C0M73.LIZ();
        String str = this.LLILLJJLI;
        boolean zEnable = enable();
        String mobName = this.LLJIJIL.getMobName();
        String aid = this.LL.getAid();
        AIRemixInfo aIRemixInfo = this.LL.aiRemixInfo;
        if (aIRemixInfo != null) {
            firstGid = aIRemixInfo.getFirstGid();
        } else {
            firstGid = null;
        }
        AIRemixInfo aIRemixInfo2 = this.LL.aiRemixInfo;
        if (aIRemixInfo2 != null) {
            gamePlay = aIRemixInfo2.getGamePlay();
        } else {
            gamePlay = null;
        }
        this.LL.getAwemeType();
        iAIRemixEntranceMobServiceLIZ.LIZIZ(str, zEnable, mobName, aid, firstGid, gamePlay, this.LL);
        C0M73.LIZ().LJIIIIZZ(this.LL.getAid(), this.LLILLL.getState().getValue());
        if (!this.LLILZ) {
            Activity activityLIZ = C085T.LIZ(context);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131846104);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        C0M75 value = this.LLILLL.getState().getValue();
        if (Intrinsics.LJFF(value, C0M78.LIZ)) {
            this.LLIZLLLIL = C23250099c.LIZLLL(this.LLILZIL, null, null, new C0M7T(context, this, null), 3);
            return;
        }
        if (Intrinsics.LJFF(value, C0M76.LIZ)) {
            C23250099c.LIZLLL(this.LLILZIL, null, null, new C563160M6w(this, context, new AwS552S0100000_8(this, context, 915), null), 3);
            return;
        }
        if (Intrinsics.LJFF(value, C0M77.LIZ)) {
            try {
                if (C036E.LIZ.LIZIZ()) {
                    Activity activityLIZ2 = C085T.LIZ(context);
                    if (activityLIZ2 == null) {
                        return;
                    }
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ2);
                    c1389890mGx2.LJIIIZ(2131846103);
                    c1389890mGx2.LJIIJJI();
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            Activity activityLIZ3 = C085T.LIZ(context);
            if (activityLIZ3 == null) {
                return;
            }
            C1389890mGx c1389890mGx3 = new C1389890mGx(activityLIZ3);
            c1389890mGx3.LJIIIZ(2131857244);
            c1389890mGx3.LJIIJJI();
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZLLL(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
        String firstGid;
        String gamePlay;
        this.LLJ = i;
        boolean zEnable = enable();
        IAIRemixEntranceMobService.LIZ.getClass();
        IAIRemixEntranceMobService iAIRemixEntranceMobServiceLIZ = C0M73.LIZ();
        String str = this.LLILLJJLI;
        boolean zEnable2 = enable();
        String mobName = this.LLJIJIL.getMobName();
        String aid = this.LL.getAid();
        AIRemixInfo aIRemixInfo = this.LL.aiRemixInfo;
        if (aIRemixInfo != null) {
            firstGid = aIRemixInfo.getFirstGid();
        } else {
            firstGid = null;
        }
        AIRemixInfo aIRemixInfo2 = this.LL.aiRemixInfo;
        if (aIRemixInfo2 != null) {
            gamePlay = aIRemixInfo2.getGamePlay();
        } else {
            gamePlay = null;
        }
        this.LL.getAwemeType();
        iAIRemixEntranceMobServiceLIZ.LJIIL(str, zEnable2, mobName, aid, firstGid, gamePlay, this.LL);
        if (this.LLILZ && Intrinsics.LJFF(this.LLILLL.getState().getValue(), C0M78.LIZ)) {
            C23250099c.LIZLLL(this.LLILZIL, null, null, new C445640Hdi(this, iAIRemixEntranceMobServiceLIZ, null), 3);
        } else {
            LIZIZ(iAIRemixEntranceMobServiceLIZ);
        }
        if (!this.LLILZ || !Intrinsics.LJFF(this.LLILLL.getState().getValue(), C0M78.LIZ)) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLIZ;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            return;
        }
        this.LLIZ = C23250099c.LIZLLL(this.LLILZIL, null, null, new C445650Hdj(this, zEnable, view, null), 3);
    }

    public C0M7S(Aweme aweme, String str, C0M7D c0m7d, boolean z) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = c0m7d;
        this.LLILZ = z;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILZIL = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
        this.LLILZLL = new BPEAHandler(Looper.getMainLooper());
        this.LLJ = -1;
        this.LLJIJIL = C0M70.SHARE_PANEL;
    }
}
