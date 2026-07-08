package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.condition.Condition;
import com.bytedance.android.livesdk.condition.ConditionData;
import com.bytedance.android.livesdk.condition.PlayCondition;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.android.livesdk.interaction.playentity.DrawGuessEntity;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestFeatureSupportTechSwitchSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS147S0110000_31;
import kotlin.jvm.internal.AwS14S1500000_31;
import kotlin.jvm.internal.AwS1S0320000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS49S0200100_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14kz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20356314kz implements PlayRule {
    public final CopyOnWriteArraySet<InterfaceC20354714kj> LL = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<InterfaceC20356214ky> LLILLJJLI = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<InterfaceC20357514lB> LLILLL = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<InterfaceC20357614lC> LLILZ = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<InterfaceC20357414lA> LLILZIL = new CopyOnWriteArraySet<>();
    public volatile String LLILZLL = "unknown";
    public volatile String LLIZ = "";
    public RunnableC20356014kw LLIZLLLIL;
    public DataChannel LLJ;
    public WeakReference<Context> LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public long LLJILLL;
    public Playbook LLJJ;
    public WeakReference<LiveSheetFragment> LLJJI;
    public InterfaceC1631620sYq<? super Condition, ? super LifecycleOwner, ? super C20361214lm, ? extends PlayCondition> LLJJIII;
    public InterfaceC1631630sYr<? super C20359414lU, ? super C20361214lm, ? super Long, ? super Function1<? super Context, Unit>, ? extends WeakReference<LiveSheetFragment>> LLJJIJI;
    public InterfaceC20357214l8 LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public void LJIILLIIL(String str) {
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public void LJIJ() {
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        return true;
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIL() {
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public void LJJIIZI(C20424814w2 c20424814w2) {
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public boolean LJJIJL(C20361214lm c20361214lm, boolean z) {
        return this instanceof DrawGuessEntity;
    }

    public void LJJIJLIJ() {
    }

    public void LJJIL() {
    }

    public void LJJIZ(C20361214lm c20361214lm, String str, C334801Rq c334801Rq, InterfaceC953350aur interfaceC953350aur, Context context) {
    }

    public abstract C20357914lF LJJJIL();

    public void LJJJJIZL() {
    }

    public boolean LJJJJLI(String str) {
        return true;
    }

    public boolean LJJJJLL() {
        return false;
    }

    public void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
    }

    public void LJJJLZIJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
    }

    public void LJJJZ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIJ() {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(this, 178));
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIJIIJI() {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(this, 177));
    }

    public final LifecycleRegistry LJJJI() {
        return (LifecycleRegistry) this.LLJJJJ.getValue();
    }

    public final C20354214ke LJJJJ() {
        return (C20354214ke) this.LLJJIJIL.getValue();
    }

    public final LifecycleRegistry LJJJJI() {
        return (LifecycleRegistry) this.LLJJJ.getValue();
    }

    public void LJJJJZI() {
        LiveSheetFragment liveSheetFragment;
        C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(this, 1608));
        Iterator<InterfaceC20357614lC> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        this.LLILZ.clear();
        WeakReference<LiveSheetFragment> weakReference = this.LLJJI;
        if (weakReference == null || (liveSheetFragment = weakReference.get()) == null) {
            return;
        }
        liveSheetFragment.close();
    }

    public final void LJJL() {
        RunnableC20356014kw runnableC20356014kw = this.LLIZLLLIL;
        if (runnableC20356014kw != null) {
            if (C1143300frE.LJIIJJI() != null) {
                String strLIZ = C979410bat.LIZ(221, "PlayEntity");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removeShowSettingPageTimeOutRunnable, name=");
                sbLIZ.append(LJJJIL().LIZ);
                AbstractC1143290frD.LJI(strLIZ, C2188811AlT.LIZIZ(sbLIZ));
            }
            C473410IhP.LIZ().removeCallbacks(runnableC20356014kw);
            this.LLIZLLLIL = null;
        }
    }

    public AbstractC20356314kz() {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        boolean z = room != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId();
        this.LLJIJIL = z;
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        this.LLJILJIL = (room2 == null || Long.valueOf(room2.getOwnerUserId()) == null || z) ? false : true;
        this.LLJILJILJ = C500260Jjc.LJJIL();
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(88));
        this.LLJJJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 176));
        this.LLJJJIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(87));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 175));
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIIJ() {
        LJJJIL().LJFF = 0;
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIILJJIL() {
        LJJJIL().LJFF = 0;
        LJJJIL().LJI = 0;
        LJJIL();
        C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(this, 1608));
        this.LLILZ.clear();
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJII() {
        LJJJIL().LJII = EnumC20429514wn.IDLE;
        LJJIJLIJ();
        this.LLILZIL.clear();
        C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(this, 1607));
    }

    public final boolean LJJJ() {
        return LJJJIL().LJI == 1;
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public void destroy() {
        C1AZW.LJIIJ(12, C979410bat.LIZ(227, LJJJIL().LIZ), "destroy", null, null);
        LJJLIIIIJ(0);
        this.LL.clear();
        this.LLILLJJLI.clear();
        this.LLILLL.clear();
        this.LLILZ.clear();
        C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(this, 1608));
        LJJII();
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final C20357914lF getConfig() {
        return LJJJIL();
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final boolean isRunning() {
        return LJJJIL().LJFF == 1;
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final Playbook LIZ() {
        return this.LLJJ;
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final String LJJIJIL() {
        return this.LLIZ;
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LIZIZ(DataChannel dataChannel) {
        this.LLJ = dataChannel;
        LJJJJIZL();
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LIZJ(InterfaceC20357614lC interfaceC20357614lC) {
        this.LLILZ.add(interfaceC20357614lC);
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJFF(C20361214lm c20361214lm) {
        Context context;
        if (LJJJJLL()) {
            return;
        }
        Long lValueOf = null;
        WeakReference<LiveSheetFragment> weakReferenceInvoke = null;
        if (Intrinsics.LJFF(c20361214lm.LJIIIIZZ, "auto")) {
            if (LJJIJL(c20361214lm, false)) {
                WeakReference<Context> weakReference = this.LLJI;
                if (weakReference != null && (context = weakReference.get()) != null) {
                    LJ(c20361214lm, "autoStart", new C334801Rq((String) null, (String) null, 7), new C20356414l0(this, c20361214lm), context);
                    return;
                } else {
                    C1AZW.LJFF(C979410bat.LIZ(192, LJJJIL().LIZ), "directStart error, context=null", null, null);
                    return;
                }
            }
            LJJIJ();
            return;
        }
        if (LJJIJL(c20361214lm, false)) {
            InterfaceC1631630sYr<? super C20359414lU, ? super C20361214lm, ? super Long, ? super Function1<? super Context, Unit>, ? extends WeakReference<LiveSheetFragment>> interfaceC1631630sYr = this.LLJJIJI;
            if (interfaceC1631630sYr != null) {
                weakReferenceInvoke = interfaceC1631630sYr.invoke(null, c20361214lm, null, new AwS397S0200000_31(this, c20361214lm, 22));
            }
            this.LLJJI = weakReferenceInvoke;
            return;
        }
        InterfaceC20357214l8 interfaceC20357214l8 = this.LLJJIJIIJIL;
        if (interfaceC20357214l8 != null) {
            interfaceC20357214l8.LIZLLL(new WeakReference<>(c20361214lm));
        }
        InterfaceC20357214l8 interfaceC20357214l82 = this.LLJJIJIIJIL;
        if (interfaceC20357214l82 != null) {
            interfaceC20357214l82.LJIIIZ(System.currentTimeMillis());
        }
        InterfaceC20357214l8 interfaceC20357214l83 = this.LLJJIJIIJIL;
        C20354214ke c20354214keLJJJJ = LJJJJ();
        Playbook playbook = this.LLJJ;
        if (playbook != null) {
            lValueOf = Long.valueOf(playbook.playbookId);
        }
        LJJ(c20361214lm, interfaceC20357214l83, c20354214keLJJJJ, "playbook", lValueOf, "", "playbook_entity");
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public void LJI(Function2 function2) {
        function2.invoke(Boolean.FALSE, "not implemented");
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJII(InterfaceC20354714kj interfaceC20354714kj) {
        this.LL.add(interfaceC20354714kj);
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIIIZ(C20358614lM c20358614lM) {
        this.LLJJIJI = c20358614lM;
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIIJJI(String str) {
        this.LLILZLL = str;
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final List<C20368314mv> LJIIL(C20361214lm c20361214lm) {
        Condition next;
        Condition condition;
        boolean z;
        List listLJIIJJI;
        List<Condition> list;
        ArrayList arrayList = new ArrayList();
        String str = c20361214lm.LJII;
        if (str == null) {
            str = "";
        }
        ConditionData conditionDataLIZ = C20356614l2.LIZ(str);
        for (String str2 : LJJJIL().LJIIJ) {
            if (conditionDataLIZ != null && (list = conditionDataLIZ.conditions) != null) {
                Iterator<Condition> it2 = list.iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.name, str2)) {
                        break;
                    }
                }
                next = null;
            } else {
                next = null;
            }
            if (next == null) {
                condition = new Condition(str2, null, null, 0);
            } else {
                condition = next;
            }
            EnumC20429614wo enumC20429614woLIZIZ = C20359314lT.LIZIZ(str2);
            String strLIZJ = C20359314lT.LIZJ(str2);
            if (next != null) {
                z = true;
            } else {
                z = false;
            }
            if (Intrinsics.LJFF(str2, "guest_count")) {
                listLJIIJJI = C1697810uHb.LJIIJJI(1, 2, 3, 4, 5, 6, 7, 8);
            } else if (Intrinsics.LJFF(str2, "cohost_count")) {
                listLJIIJJI = C1697810uHb.LJIIJJI(2, 3, 4);
            } else {
                listLJIIJJI = C1697810uHb.LJIIJJI(1, 2, 3, 4, 5, 6, 7, 8);
            }
            arrayList.add(new C20368314mv(condition, z, enumC20429614woLIZIZ, strLIZJ, listLJIIJJI));
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIILIIL(String str) {
        this.LLIZ = str;
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIILL(C20359914lZ c20359914lZ) {
        this.LLILZIL.add(c20359914lZ);
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIJI(WeakReference<Context> weakReference) {
        this.LLJI = weakReference;
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIJJLI(C20358314lJ c20358314lJ) {
        this.LLJJIII = c20358314lJ;
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJI(InterfaceC20357214l8 interfaceC20357214l8) {
        this.LLJJIJIIJIL = interfaceC20357214l8;
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIFFI(InterfaceC20357514lB interfaceC20357514lB) {
        this.LLILLL.add(interfaceC20357514lB);
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIII(C20361214lm c20361214lm) {
        Context context;
        if (LJJIJL(c20361214lm, false)) {
            WeakReference<Context> weakReference = this.LLJI;
            if (weakReference != null && (context = weakReference.get()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("directStart, name=");
                sbLIZ.append(LJJJIL().LIZ);
                C20441214yg.LJ("xuliwenTest", C2188811AlT.LIZIZ(sbLIZ));
                LJ(c20361214lm, "decoration", new C334801Rq((String) null, (String) null, 7), new InterfaceC953350aur() { // from class: X.14l9
                    @Override // X.InterfaceC953350aur
                    public final void LIZIZ() {
                        this.LIZ.getClass();
                    }

                    @Override // X.InterfaceC953350aur
                    public final void LIZ(boolean z, boolean z2) {
                        this.LIZ.getClass();
                    }
                }, context);
                return;
            }
            LJJIJIIJI();
            C20441214yg.LJ("PlaybookDecoration", "decoration error, context=null");
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS147S0110000_31(this, false, 3));
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIJ(Playbook playbook) {
        if (playbook != null) {
            this.LLJJ = playbook;
        }
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIJZLJL(InterfaceC20356214ky interfaceC20356214ky) {
        this.LLILLJJLI.add(interfaceC20356214ky);
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIJIIJIL(C20362514lz c20362514lz) {
        this.LLILLL.remove(c20362514lz);
    }

    public boolean LJJJJJL(String str) {
        if (Intrinsics.LJFF(this.LLILZLL, "editor")) {
            return LJJJJL(str);
        }
        return LJJJJLI(str);
    }

    public boolean LJJJJL(String str) {
        return LJJJJLI(str);
    }

    public void LJJJJZ(Context context) {
        C766270U4b.LJFF(2131854102, context);
    }

    public void LJJLI(C20361214lm c20361214lm) {
        LJJIJ();
    }

    public final void LJJLIIIIJ(int i) {
        if (i == LJJJIL().LJ) {
            return;
        }
        String strLIZ = C979410bat.LIZ(165, LJJJIL().LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update state, newState=");
        sbLIZ.append(i);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LJJJIL().LJ = i;
        Iterator<InterfaceC20357514lB> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(LJJJIL().LJ, this);
        }
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final C20361314ln LIZLLL(C20424814w2 c20424814w2, String str) {
        return LJJJLIIL(c20424814w2, PlayEntityUtilKt.LIZ(this, c20424814w2));
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIIIIZZ(C20361214lm c20361214lm, AwS432S0200000_31 awS432S0200000_31) {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS275S0300000_31(this, awS432S0200000_31, c20361214lm, 44));
    }

    public final void LJJJJJ(C20361314ln c20361314ln, long j) {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS49S0200100_31(this, c20361314ln, j, 0));
    }

    public C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        String str = LJJJIL().LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseUIConfig, stateData=");
        sbLIZ.append(c20424814w2);
        C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        return C20358014lG.LIZ();
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        String strLIZ = C979410bat.LIZ(67, LJJJIL().LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("readyToEdit, playbookTask=");
        sbLIZ.append(c20361214lm);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJIIZILJ(C20361214lm c20361214lm, boolean z, boolean z2, Function0<Unit> function0) {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS1S0320000_31(this, (AbstractC20356314kz) function0, (Function0<Unit>) z, z2, (boolean) c20361214lm, (C20361214lm) 0));
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJ(C20361214lm c20361214lm, String str, C334801Rq c334801Rq, InterfaceC953350aur interfaceC953350aur, Context context) {
        if (!this.LLJIJIL || System.currentTimeMillis() - this.LLJILLL < 500) {
            return;
        }
        this.LLJILLL = System.currentTimeMillis();
        if (LinkMicMultiGuestFeatureSupportTechSwitchSetting.INSTANCE.isEnable() && !LJJJJJL(c20361214lm.LJI)) {
            interfaceC953350aur.LIZ(true, false);
        } else if (!LJIJJ(c20361214lm, null, true)) {
            interfaceC953350aur.LIZ(false, false);
        } else {
            PlayEntityUtilKt.LJIIL(this, c20361214lm, null, new AwS14S1500000_31(this, c20361214lm, str, c334801Rq, interfaceC953350aur, context, 0), new AwS610S0100000_31(interfaceC953350aur, 96), Intrinsics.LJFF(str, "decoration"));
        }
    }

    @Override // com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        Context contextLJIIIIZZ;
        if (this.LLJIJIL) {
            if (lifecycleOwner != null && (contextLJIIIIZZ = PlayEntityUtilKt.LJIIIIZZ(lifecycleOwner)) != null) {
                if (!LinkMicMultiGuestFeatureSupportTechSwitchSetting.INSTANCE.isEnable()) {
                    PlayEntityUtilKt.LJI(this, c20361214lm, interfaceC20354714kj, null, null, 0L, 56);
                    return;
                }
                if (!LJJJJJL(c20361214lm.LJI)) {
                    LJJJJZ(contextLJIIIIZZ);
                    return;
                } else if (!LJIJJ(c20361214lm, interfaceC20354714kj, true)) {
                    PlayEntityUtilKt.LJI(this, c20361214lm, interfaceC20354714kj, null, null, 0L, 56);
                    return;
                } else {
                    PlayEntityUtilKt.LJIIL(this, c20361214lm, interfaceC20354714kj, new C20355914kv(interfaceC20354714kj, this, c20361214lm, lifecycleOwner, str, l, str2, str3), new AwS610S0100000_31(interfaceC20354714kj, 97), false);
                    return;
                }
            }
            PlayEntityUtilKt.LJI(this, c20361214lm, interfaceC20354714kj, null, null, 0L, 56);
            return;
        }
        String str4 = "playbook_entity";
        if (this.LLJILJIL) {
            if (str3.length() != 0) {
                str4 = str3;
            }
            LJJJLZIJ(c20361214lm, interfaceC20354714kj, lifecycleOwner, str4);
        } else if (this.LLJILJILJ) {
            if (str3.length() != 0) {
                str4 = str3;
            }
            LJJJZ(c20361214lm, interfaceC20354714kj, lifecycleOwner, str4);
        }
    }
}
