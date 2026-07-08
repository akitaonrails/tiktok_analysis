package X;

import Y.AObjectS313S0200000_17;
import Y.ARunnableS117S0100000_17;
import Y.AfS186S0100000_17;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.gift.NormalGiftDisplayStatusEvent;
import com.bytedance.android.livesdk.gift.base.platform.business.tray.model.LiveGiftRemoteHideTrayEvent;
import com.bytedance.android.livesdk.livesetting.gift.GiftUseNewGiftTrayV3;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftReceivingRefactorSetting;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS37S0310000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ffL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135930ffL {
    public C1135910ffJ LIZ;
    public InterfaceC1136220ffo LIZIZ;
    public ViewGroup LIZLLL;
    public DataChannel LJ;
    public int LJFF;
    public boolean LJII;
    public EnumC1083260eIO LJIIIZ;
    public final ArrayList<C1135940ffM> LIZJ = new ArrayList<>(2);
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS117S0100000_17 LJIIIIZZ = new ARunnableS117S0100000_17(this, 309);
    public C1267904xh LJIIJ = new C1267904xh(false);
    public final C1135950ffN LJIIJJI = new C1135950ffN(new AwS561S0100000_17(this, 657));

    public final boolean LJFF() {
        return this.LIZIZ != null && LiveGiftReceivingRefactorSetting.INSTANCE.isAsyncQueue();
    }

    public final void LJIIIZ() {
        C1135950ffN c1135950ffN = this.LJIIJJI;
        c1135950ffN.LJFF++;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNewReceivedMessage latest(");
        sbLIZ.append(c1135950ffN.LJFF);
        sbLIZ.append(')');
        C1138230fj3.LIZJ("LiveGiftTrayBlockMonitor", C2188811AlT.LIZIZ(sbLIZ));
        C1138230fj3.LIZJ("LiveGiftTrayBlockMonitor", "onMessageEnqueue");
        if (c1135950ffN.LIZIZ) {
            C20441214yg.LIZIZ("LiveGiftTrayBlockMonitor", "onMessageEnqueue reported");
            return;
        }
        if (c1135950ffN.LIZJ) {
            C20441214yg.LIZIZ("LiveGiftTrayBlockMonitor", "onMessageEnqueue monitoring");
            return;
        }
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground()) {
            C20441214yg.LIZIZ("LiveGiftTrayBlockMonitor", "onMessageEnqueue app not in foreground");
            return;
        }
        c1135950ffN.LIZJ = true;
        c1135950ffN.LJ = System.currentTimeMillis();
        c1135950ffN.LJIILJJIL.LIZ(C11NZ.LJLJJLL(60L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(c1135950ffN, 195)));
        List<C1135810ff9> listInvoke = c1135950ffN.LIZ.invoke();
        c1135950ffN.LJIIJJI = C1135950ffN.LIZIZ(0, listInvoke);
        c1135950ffN.LJIIL = C1135950ffN.LIZIZ(1, listInvoke);
        C1138230fj3.LIZJ("LiveGiftTrayBlockMonitor", "onMessageEnqueue start detect duration:60");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onMessageEnqueue start detect zero:");
        sbLIZ2.append(c1135950ffN.LJIIJJI);
        C1138230fj3.LIZJ("LiveGiftTrayBlockMonitor", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onMessageEnqueue start detect one:");
        sbLIZ3.append(c1135950ffN.LJIIL);
        C1138230fj3.LIZJ("LiveGiftTrayBlockMonitor", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final int LJIIJ() {
        ArrayList<C1135940ffM> arrayList = this.LIZJ;
        int i = 0;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<C1135940ffM> it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next().LJFF != EnumC1136300ffw.IDLE && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public final int LJIIJJI() {
        C1135810ff9 c1135810ff9;
        int i = 0;
        for (C1135940ffM c1135940ffM : this.LIZJ) {
            if (c1135940ffM.LJFF != EnumC1136300ffw.IDLE && (c1135810ff9 = c1135940ffM.LJIIIZ) != null && c1135810ff9.LJJJLIIL) {
                i++;
            }
        }
        return i;
    }

    public final void LJIILIIL() {
        C1267904xh c1267904xh = new C1267904xh(this.LJIIIZ == EnumC1083260eIO.SHOW);
        if (Intrinsics.LJFF(c1267904xh, this.LJIIJ)) {
            return;
        }
        this.LJIIJ = c1267904xh;
        Iterator<C1135940ffM> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILLIIL = c1267904xh;
        }
    }

    public final Boolean LJIILJJIL() {
        InterfaceC1136220ffo interfaceC1136220ffo = this.LIZIZ;
        if (interfaceC1136220ffo != null) {
            return Boolean.valueOf(interfaceC1136220ffo.LJIIIIZZ());
        }
        C1135910ffJ c1135910ffJ = this.LIZ;
        if (c1135910ffJ != null) {
            return Boolean.valueOf(c1135910ffJ.LIZ.isEmpty());
        }
        return null;
    }

    public final void LIZ() {
        if (LJFF()) {
            if (this.LJII) {
                return;
            }
            this.LJII = true;
            C786410Ut5.LJJZZIII(this.LJI, this.LJIIIIZZ);
            return;
        }
        C1133910fc5.LJI("LiveGiftTrayGroupController", "awakeTrayController");
        for (C1135940ffM c1135940ffM : this.LIZJ) {
            EnumC1136300ffw enumC1136300ffw = c1135940ffM.LJFF;
            if (enumC1136300ffw == EnumC1136300ffw.IDLE || enumC1136300ffw == EnumC1136300ffw.WAITING) {
                C1133910fc5.LJI("LiveGiftTrayGroupController", "tryConsumeMessage");
                c1135940ffM.LJJIFFI();
            }
        }
    }

    public final C1135810ff9 LIZIZ(C1135940ffM c1135940ffM) {
        C1135810ff9 c1135810ff9;
        C1135810ff9 c1135810ff9LIZJ;
        GiftMessage giftMessage;
        C1135810ff9 next;
        C1135810ff9 next2;
        if (LJFF() || (c1135810ff9 = c1135940ffM.LJIIIZ) == null) {
            return null;
        }
        ArrayList<C1135940ffM> arrayList = this.LIZJ;
        ArrayList arrayList2 = new ArrayList();
        Iterator<C1135940ffM> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1135810ff9 c1135810ff92 = it2.next().LJIIIZ;
            if (c1135810ff92 != null) {
                arrayList2.add(c1135810ff92);
            }
        }
        InterfaceC1136220ffo interfaceC1136220ffo = this.LIZIZ;
        if (interfaceC1136220ffo != null) {
            c1135810ff9LIZJ = interfaceC1136220ffo.LIZJ(arrayList2, c1135810ff9.LJJJLIIL);
            if (c1135810ff9LIZJ == null) {
                return null;
            }
        } else {
            C1135910ffJ c1135910ffJ = this.LIZ;
            if (c1135910ffJ != null && !c1135810ff9.LJJJLIIL) {
                if (!c1135910ffJ.LIZ.isEmpty()) {
                    Iterator<C1135810ff9> it3 = c1135910ffJ.LIZ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            C1133690fbj.LIZ.getClass();
                            if (C1133690fbj.LJ(next)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    c1135810ff9LIZJ = next;
                    if (c1135810ff9LIZJ == null) {
                        Iterator<C1135810ff9> it4 = c1135910ffJ.LIZ.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next2 = it4.next();
                                C1135810ff9 c1135810ff93 = next2;
                                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                                Iterator it5 = arrayList2.iterator();
                                while (it5.hasNext()) {
                                    arrayList3.add(((C1135810ff9) it5.next()).LIZLLL);
                                }
                                if (!arrayList3.contains(c1135810ff93.LIZLLL)) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        c1135810ff9LIZJ = next2;
                        if (c1135810ff9LIZJ != null) {
                        }
                    }
                } else {
                    c1135810ff9LIZJ = (C1135810ff9) C13LP.LJJJLL(c1135910ffJ.LIZIZ);
                    if (c1135810ff9LIZJ == null || (giftMessage = c1135810ff9LIZJ.LIZ) == null || !giftMessage.LLILLJJLI) {
                        C1133690fbj.LIZ.getClass();
                        if (C1133690fbj.LJ(c1135810ff9LIZJ)) {
                            if (c1135810ff9LIZJ != null) {
                            }
                        }
                    }
                }
            }
            return null;
        }
        if (Intrinsics.LJFF(LJIIL(c1135810ff9LIZJ), c1135940ffM) && !Intrinsics.LJFF(c1135940ffM.LJIJJ, c1135810ff9LIZJ)) {
            Iterator<C1135940ffM> it6 = this.LIZJ.iterator();
            while (it6.hasNext()) {
                it6.next().LJIJJ = c1135810ff9LIZJ;
            }
            return c1135810ff9LIZJ;
        }
        return null;
    }

    public final C1135810ff9 LIZJ(C1135940ffM c1135940ffM) {
        boolean z;
        C1135810ff9 c1135810ff9;
        DataChannel dataChannel = this.LJ;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            z = true;
        } else {
            z = false;
        }
        if (z || c1135940ffM.LJFF == EnumC1136300ffw.IDLE) {
            return null;
        }
        for (C1135940ffM c1135940ffM2 : this.LIZJ) {
            if (!Intrinsics.LJFF(c1135940ffM2, c1135940ffM) && c1135940ffM2.LJFF != EnumC1136300ffw.IDLE) {
                C1133690fbj c1133690fbj = C1133690fbj.LIZ;
                C1135810ff9 c1135810ff92 = c1135940ffM2.LJIIIZ;
                c1133690fbj.getClass();
                if (C1133690fbj.LJ(c1135810ff92) && ((c1135810ff9 = c1135940ffM.LJIIIZ) == null || !c1135810ff9.LJJJLIIL)) {
                    return c1135940ffM2.LJIIIZ;
                }
            }
        }
        return null;
    }

    public final void LJ(C1135810ff9 c1135810ff9) {
        InterfaceC1136220ffo interfaceC1136220ffo = this.LIZIZ;
        if (interfaceC1136220ffo != null) {
            interfaceC1136220ffo.LJIIJJI(c1135810ff9);
            return;
        }
        C1135910ffJ c1135910ffJ = this.LIZ;
        if (c1135910ffJ == null) {
            return;
        }
        c1135910ffJ.LJIJ(c1135810ff9, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x03ec, code lost:
    
        if (r5 == null) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1135810ff9 LJII(X.C1136320ffy r33) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135930ffL.LJII(X.0ffy):X.0ff9");
    }

    public final C1135940ffM LJIIL(C1135810ff9 c1135810ff9) {
        C1135940ffM c1135940ffM;
        C1135810ff9 c1135810ff92;
        C1135810ff9 c1135810ff93;
        C1135810ff9 c1135810ff94;
        int i;
        int i2;
        C1135810ff9 c1135810ff95;
        C1135810ff9 c1135810ff96;
        int i3;
        int i4;
        GiftMessage giftMessage;
        Iterator<C1135940ffM> it2 = this.LIZJ.iterator();
        while (true) {
            c1135940ffM = null;
            if (!it2.hasNext()) {
                break;
            }
            C1135940ffM next = it2.next();
            C1135940ffM c1135940ffM2 = next;
            if (Intrinsics.LJFF(c1135810ff9.LIZLLL, c1135940ffM2.LJIILL()) && c1135940ffM2.LJFF == EnumC1136300ffw.JUMPING) {
                if (next != null) {
                    return null;
                }
            }
        }
        for (C1135940ffM c1135940ffM3 : this.LIZJ) {
            if (c1135940ffM3.LJFF == EnumC1136300ffw.JUMPING && ((c1135810ff92 = c1135940ffM3.LJIIIZ) == null || !c1135810ff92.LJJJLIIL)) {
                C1133690fbj.LIZ.getClass();
                if (!C1133690fbj.LJ(c1135810ff92)) {
                    if (c1135810ff9.LJJJLIIL) {
                        if (c1135940ffM == null || (c1135810ff93 = c1135940ffM3.LJIIIZ) == null || ((c1135810ff94 = c1135940ffM.LJIIIZ) != null && (i = c1135810ff93.LJFF) <= (i2 = c1135810ff94.LJFF) && (i != i2 || c1135810ff93.LJ <= c1135810ff94.LJ))) {
                            c1135940ffM = c1135940ffM3;
                        }
                    } else if (C1133690fbj.LJ(c1135810ff9) || ((giftMessage = c1135810ff9.LIZ) != null && giftMessage.LLILLJJLI)) {
                        if (c1135940ffM == null || (c1135810ff95 = c1135940ffM3.LJIIIZ) == null || ((c1135810ff96 = c1135940ffM.LJIIIZ) != null && (i3 = c1135810ff95.LJFF) <= (i4 = c1135810ff96.LJFF) && (i3 != i4 || c1135810ff95.LJ <= c1135810ff96.LJ))) {
                            c1135940ffM = c1135940ffM3;
                        }
                    }
                }
            }
        }
        return c1135940ffM;
    }

    public final void LJI(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markTrayBusy: isBusy=");
        sbLIZ.append(z);
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C1133910fc5.LJII("LiveGiftTrayGroupController", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            DataChannel dataChannel = this.LJ;
            if (dataChannel != null) {
                dataChannel.LC0(NormalGiftDisplayStatusEvent.class, Boolean.FALSE);
            }
            ViewGroup viewGroup = this.LIZLLL;
            if (viewGroup != null) {
                C500260Jjc.LLFFF(viewGroup);
                return;
            }
            return;
        }
        DataChannel dataChannel2 = this.LJ;
        if (dataChannel2 != null) {
            dataChannel2.LC0(NormalGiftDisplayStatusEvent.class, Boolean.TRUE);
        }
        ViewGroup viewGroup2 = this.LIZLLL;
        if (viewGroup2 == null) {
            return;
        }
        C500260Jjc.LJIILLIIL(viewGroup2);
    }

    public final void LJIIIIZZ(C1136320ffy c1136320ffy, Function1<? super C1135810ff9, Unit> function1) {
        if (!LJFF()) {
            function1.invoke(LJII(c1136320ffy));
            return;
        }
        C118300cf c118300cf = new C118300cf();
        Iterator<C1135940ffM> it2 = this.LIZJ.iterator();
        while (true) {
            String str = null;
            if (!it2.hasNext()) {
                break;
            }
            C1135940ffM next = it2.next();
            if (next.LJFF != EnumC1136300ffw.IDLE) {
                c118300cf.element++;
                C1135810ff9 c1135810ff9 = c1136320ffy.LIZ;
                if (c1135810ff9 != null) {
                    str = c1135810ff9.LIZLLL;
                }
                if (!Intrinsics.LJFF(str, next.LJIILL())) {
                    c1136320ffy.LIZIZ.add(next.LJIILL());
                }
                if (next.LIZ > 0) {
                    c1136320ffy.LIZJ = true;
                }
            }
        }
        int i = this.LJFF;
        if (i > 0) {
            c1136320ffy.LIZJ = true;
        }
        boolean z = !c1136320ffy.LIZJ;
        if (z) {
            this.LJFF = i + 1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needMessageAsync, request = ");
        sbLIZ.append(c1136320ffy);
        C1133910fc5.LJI("LiveGiftTrayGroupController", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1136220ffo interfaceC1136220ffo = this.LIZIZ;
        if (interfaceC1136220ffo != null) {
            interfaceC1136220ffo.LJI(c1136320ffy, new AwS37S0310000_17(z, (boolean) this, (C1135930ffL) c118300cf, (C118300cf) function1, (Function1<? super C1135810ff9, Unit>) 4));
            return;
        }
        if (z) {
            this.LJFF--;
        }
        function1.invoke(null);
    }

    public final void LIZLLL(final boolean z, final int i, final C1104160eq6 c1104160eq6, final Function0<Unit> function0) {
        long showTrayStartTimeInMillis;
        final ArrayList<C1135940ffM> arrayList = this.LIZJ;
        DataChannel dataChannel = this.LJ;
        final LinkedList linkedList = new LinkedList();
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.observeForever(new Observer<Integer>() { // from class: X.0ffO
            /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
            @Override // androidx.lifecycle.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onChanged(java.lang.Integer r9) {
                /*
                    Method dump skipped, instruction units count: 260
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1135960ffO.onChanged(java.lang.Object):void");
            }
        });
        for (C1135940ffM c1135940ffM : arrayList) {
            AObjectS313S0200000_17 aObjectS313S0200000_17 = new AObjectS313S0200000_17(mutableLiveData, linkedList, 14);
            c1135940ffM.getClass();
            C1135810ff9 c1135810ff9 = c1135940ffM.LJIIIZ;
            C1136990fh3 c1136990fh3 = c1135940ffM.LJIIJ;
            Object obj = null;
            if (c1135810ff9 != null) {
                c1135940ffM.LJJI = true;
                if (GiftUseNewGiftTrayV3.INSTANCE.isPhaseTwo()) {
                    C1138090fip c1138090fip = c1135940ffM.LJIIJJI;
                    if (c1138090fip != null) {
                        c1138090fip.onEvent(new C1136660fgW(c1135810ff9, new AwS418S0200000_17(c1135940ffM, aObjectS313S0200000_17, 136)));
                    }
                } else if (c1136990fh3 != null) {
                    c1136990fh3.LJIILIIL(c1135810ff9, null, new AwS418S0200000_17(c1135940ffM, aObjectS313S0200000_17, 137));
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c1136990fh3 != null) {
                    showTrayStartTimeInMillis = c1136990fh3.getShowTrayStartTimeInMillis();
                } else {
                    showTrayStartTimeInMillis = 0;
                }
                C1136940fgy.LIZ.LJ(c1135940ffM.LJIILJJIL, c1135810ff9, Long.valueOf(jCurrentTimeMillis - showTrayStartTimeInMillis), false, true);
                if (c1136990fh3 != null) {
                    c1136990fh3.setShowTrayStartTimeInMillis(0L);
                    if (Unit.LIZ == null) {
                    }
                }
                obj = null;
            }
            aObjectS313S0200000_17.invoke(obj);
        }
        if (dataChannel != null) {
            dataChannel.FQ2(LiveGiftRemoteHideTrayEvent.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(android.view.ViewGroup r10, boolean r11, X.C1104160eq6 r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135930ffL.LJIILL(android.view.ViewGroup, boolean, X.0eq6, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r9.LJJI().LJIILL != 1001) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c7 A[EDGE_INSN: B:85:0x00c7->B:55:0x00c7 BREAK  A[LOOP:2: B:50:0x00b3->B:87:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILLIIL(X.InterfaceC1136020ffU r9, boolean r10, kotlin.jvm.functions.Function0<X.C1135810ff9> r11, kotlin.jvm.functions.Function1<? super X.C1135810ff9, kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135930ffL.LJIILLIIL(X.0ffU, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):boolean");
    }
}
