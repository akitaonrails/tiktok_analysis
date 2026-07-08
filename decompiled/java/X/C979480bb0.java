package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.InteractDisconnectDialog;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979480bb0 extends C0J8P<C979520bb4, C979490bb1> {
    public final Fragment LIZIZ;
    public final C979500bb2 LIZJ;
    public final LifecycleOwner LIZLLL;
    public final Function1<Boolean, Unit> LJ;
    public final C977620bY0 LJFF;
    public final C977630bY1 LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final InterfaceC963450bB9 LJIIIZ;
    public final InterfaceC1631620sYq<EnumC919170a1j, List<C954460awe>, List<C954460awe>, Unit> LJIIJ;
    public final DataChannel LJIIJJI;
    public C979490bb1 LJIIL;
    public C979520bb4 LJIILIIL;
    public boolean LJIILJJIL;
    public InteractDisconnectDialog LJIILL;
    public C978750bZp LJIILLIIL;

    public final void LJIIIIZZ() {
        FragmentManager fragmentManager;
        InteractDisconnectDialog interactDisconnectDialog;
        boolean z = this.LJIIIIZZ;
        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 1015);
        InteractDisconnectDialog interactDisconnectDialog2 = new InteractDisconnectDialog();
        this.LJIILL = interactDisconnectDialog2;
        interactDisconnectDialog2.LLIZLLLIL = C497740JfY.LJIJI(2131842675);
        interactDisconnectDialog2.LLJ = C497740JfY.LJIJI(2131842676);
        interactDisconnectDialog2.LLJI = 3;
        interactDisconnectDialog2.LLJILJIL = C497740JfY.LJIJI(2131842737);
        interactDisconnectDialog2.LLJJI = new AwS559S0100000_15(this, 1018);
        interactDisconnectDialog2.LLJIJIL = C497740JfY.LJIJI(2131842677);
        interactDisconnectDialog2.LLJJ = new AwS559S0100000_15(awS559S0100000_15, 1019);
        interactDisconnectDialog2.LLJILJILJ = z;
        DataChannel dataChannelLJIIIZ = C782710Un7.LJIIIZ(C782710Un7.LIZ);
        if (dataChannelLJIIIZ != null && (fragmentManager = (FragmentManager) dataChannelLJIIIZ.gg0(C748880TZe.class)) != null && (interactDisconnectDialog = this.LJIILL) != null) {
            interactDisconnectDialog.show(fragmentManager, "InteractDisconnectDialog");
        }
        LJIIJ(this, "withdraw");
        C974540bT2.LIZ.LJJLI(0L, "withdraw", this.LJIIIIZZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI() {
        /*
            r5 = this;
            java.lang.String r4 = "TwoMatchInviterViewBinder"
            java.lang.String r0 = "start Invite"
            X.C20441214yg.LIZIZ(r4, r0)
            X.0a1j r3 = X.EnumC919170a1j.MATCH_TYPE_1V1
            boolean r0 = r5.LJII
            if (r0 == 0) goto L58
            X.0bY1 r0 = r5.LJI
            if (r0 == 0) goto L67
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.Boolean, java.util.List<X.0awe>>> r0 = r0.LJFF
            if (r0 == 0) goto L67
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
        L1b:
            if (r1 == 0) goto L67
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Object r2 = r1.get(r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r2 == 0) goto L67
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L67
            if (r1 == 0) goto L67
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L67
            X.0sYq<X.0a1j, java.util.List<X.0awe>, java.util.List<X.0awe>, kotlin.Unit> r0 = r5.LJIIJ
            r0.invoke(r3, r2, r1)
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r1 = r5.LJ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.invoke(r0)
            java.lang.String r4 = "invite"
            LJIIJ(r5, r4)
            X.0bT2 r3 = X.C974540bT2.LIZ
            boolean r2 = r5.LJIIIIZZ
            r0 = 0
            r3.LJJLI(r0, r4, r2)
            return
        L58:
            X.0bY0 r0 = r5.LJFF
            if (r0 == 0) goto L67
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.Boolean, java.util.List<X.0awe>>> r0 = r0.LJFF
            if (r0 == 0) goto L67
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            goto L1b
        L67:
            java.lang.String r0 = "self or rival is empty"
            X.C20441214yg.LJ(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C979480bb0.LJIIJJI():void");
    }

    public final void LJIIIZ(Map<Long, Boolean> map) {
        if (map != null) {
            if (!map.isEmpty()) {
                Iterator<Map.Entry<Long, Boolean>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    if (!it2.next().getValue().booleanValue()) {
                        return;
                    }
                }
            }
            InteractDisconnectDialog interactDisconnectDialog = this.LJIILL;
            if (interactDisconnectDialog == null || !interactDisconnectDialog.isShowing()) {
                return;
            }
            interactDisconnectDialog.dismiss();
        }
    }

    public final void LJIIL(long j) {
        C979520bb4 c979520bb4;
        Long l;
        C979520bb4 c979520bb42 = this.LJIILIIL;
        if (c979520bb42 != null) {
            c979520bb42.LJ = Long.valueOf(j);
        }
        C979490bb1 c979490bb1 = this.LJIIL;
        if (c979490bb1 != null && (c979520bb4 = c979490bb1.LLILZIL.LJIILIIL) != null && (l = c979520bb4.LJ) != null) {
            long jLongValue = l.longValue();
            C973100bQi c973100bQi = c979490bb1.LL;
            if (c973100bQi != null) {
                c973100bQi.setCountdown(jLongValue);
            }
        }
    }

    public static void LJIIJ(C979480bb0 c979480bb0, String str) {
        List<C954460awe> list;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData;
        Map<Boolean, List<C954460awe>> value;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData2;
        Map<Boolean, List<C954460awe>> value2;
        c979480bb0.getClass();
        C915980Zwa.LJII().LLILZLL(true);
        C977620bY0 c977620bY0 = c979480bb0.LJFF;
        List<C954460awe> list2 = null;
        if (c977620bY0 != null && (mutableLiveData2 = c977620bY0.LJFF) != null && (value2 = mutableLiveData2.getValue()) != null) {
            list = value2.get(Boolean.TRUE);
        } else {
            list = null;
        }
        C977620bY0 c977620bY02 = c979480bb0.LJFF;
        if (c977620bY02 != null && (mutableLiveData = c977620bY02.LJFF) != null && (value = mutableLiveData.getValue()) != null) {
            list2 = value.get(Boolean.FALSE);
        }
        C973660bRc c973660bRc = C973660bRc.LIZ;
        C973660bRc.LJJJLZIJ(str, list, list2, null, "1v1", false, null, LiveMatchTeamPairSetting.INSTANCE.isEnable(), false, false, C978440bZK.LJ(c979480bb0.LJIIJJI), null, null, null, 14920);
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C979520bb4 c979520bb4) {
        ((C979490bb1) viewHolder).I5();
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C979490bb1 c979490bb1 = new C979490bb1(this, C786410Ut5.Td(layoutInflater, R.layout.gct, viewGroup, false));
        this.LJIIL = c979490bb1;
        return c979490bb1;
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, C979520bb4 c979520bb4, List list) {
        ((C979490bb1) viewHolder).I5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C979480bb0(androidx.fragment.app.Fragment r14, X.C979500bb2 r15, androidx.lifecycle.LifecycleOwner r16, X.C979520bb4 r17, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C979480bb0.<init>(androidx.fragment.app.Fragment, X.0bb2, androidx.lifecycle.LifecycleOwner, X.0bb4, kotlin.jvm.functions.Function1):void");
    }
}
