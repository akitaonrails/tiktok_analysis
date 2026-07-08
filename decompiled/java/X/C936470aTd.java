package X;

import Y.AfS184S0100000_15;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowMaskOrderEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: renamed from: X.0aTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936470aTd extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public Integer LLJI;
    public ViewGroup LLJIJIL;
    public C16F5 LLJILJIL;

    public final void LJIIJJI() {
        ViewGroup viewGroupLJIIIZ = LJIIIZ(false);
        if (viewGroupLJIIIZ != null) {
            C917650ZzH.LJ(viewGroupLJIIIZ);
        } else {
            C439101nJ.LJI(this);
        }
    }

    /* JADX INFO: renamed from: getLayoutId, reason: collision with other method in class */
    public Void m42getLayoutId() {
        return null;
    }

    @Override // X.AbstractC939840aZ4
    public C940610aaJ getPriority() {
        return new C940610aaJ(100, 0, 2);
    }

    @Override // X.AbstractC939840aZ4
    public /* bridge */ /* synthetic */ Integer getLayoutId() {
        return (Integer) m42getLayoutId();
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutIdLazy() {
        return Integer.valueOf(R.layout.htr);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewGroup viewGroup;
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<Pair<Integer, Boolean>>> c11pq;
        super.onAttachedToWindow();
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity != null && posIdentity.type == 1 && (str = posIdentity.value) != null && (c938220aWS = this.LLJ.get()) != null && (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) != null && (c11pq = c938230aWTLIZJ.LJIIIIZZ) != null) {
            getCompositeDisposable().LIZ(new C11IW(c11pq.LJJIFFI().LJJIJIIJIL(new AfS184S0100000_15(this, 224))).LJIILL().LJIIZILJ());
        }
        if (!C917900Zzg.LIZ() || (viewGroup = this.LLJIJIL) == null) {
            return;
        }
        viewGroup.setBackgroundResource(R.drawable.ea_);
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.ORDER;
    }

    @Override // X.AbstractC939840aZ4
    public Integer getExternalHiddenViewWidth() {
        return this.LLJI;
    }

    public static C16F5 LJIIJ(C936470aTd c936470aTd) {
        C16F5 c16f5 = c936470aTd.LLJILJIL;
        if (c16f5 == null) {
            c16f5 = (C16F5) c936470aTd.LJI(R.id.n6a);
            if (c16f5 != null) {
                c936470aTd.LLJILJIL = c16f5;
            } else {
                return null;
            }
        }
        return c16f5;
    }

    public final ViewGroup LJIIIZ(boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.LLJIJIL;
        if (viewGroup2 == null) {
            if (z && (viewGroup2 = (ViewGroup) LJI(R.id.n6_)) != null) {
                this.LLJIJIL = viewGroup2;
                if (C917900Zzg.LIZ() && (viewGroup = this.LLJIJIL) != null) {
                    viewGroup.setBackgroundResource(R.drawable.ea_);
                }
            } else {
                return null;
            }
        }
        return viewGroup2;
    }

    public final void LJIILIIL(List<Pair<Integer, Boolean>> list) {
        Object obj;
        if (getExternalHiddenViewWidth() != null) {
            C937310aUz.LJII("OrderBizViewElement", "updateUiState hide as externalVisibilityType is false");
            LJIIJJI();
            return;
        }
        C937310aUz.LJII("OrderBizViewElement", "updateUiState");
        if (list.isEmpty()) {
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
            boolean z = true;
            if (interfaceC926960aEILIZJ != null && interfaceC926960aEILIZJ.LJIIJ("live_show")) {
                C01H3 c01h3 = (C01H3) getDataChannel().gg0(LiveShowMaskOrderEvent.class);
                if (c01h3 != null) {
                    if (!c01h3.LIZ) {
                        LJIIJJI();
                        return;
                    }
                    C01H9 c01h9 = c01h3.LIZIZ;
                    if (c01h9 == null) {
                        return;
                    }
                    List listLJIIL = C1697810uHb.LJIIL(c01h9.LIZ);
                    Iterable iterable = c01h9.LIZIZ;
                    if (iterable == null) {
                        iterable = C13BV.INSTANCE;
                    }
                    List listLJLIL = C13LP.LJLIL(iterable, listLJIIL);
                    Iterable iterable2 = c01h9.LIZJ;
                    if (iterable2 == null) {
                        iterable2 = C13BV.INSTANCE;
                    }
                    Iterator it2 = ((ArrayList) C13LP.LJLIL(iterable2, listLJLIL)).iterator();
                    while (true) {
                        obj = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        String str = ((ShowListUser) next).linkmicIdStr;
                        PosIdentity posIdentity = getWindow().getPosIdentity();
                        if (posIdentity != null && posIdentity.type == 1) {
                            obj = posIdentity.value;
                        }
                        if (Intrinsics.LJFF(str, obj)) {
                            obj = next;
                            break;
                        }
                    }
                    ShowListUser showListUser = (ShowListUser) obj;
                    if (showListUser != null) {
                        int i = showListUser.order;
                        if (showListUser.status != 3) {
                            z = false;
                        }
                        LJIIL(i, z);
                        return;
                    }
                    LJIIJJI();
                    return;
                }
                return;
            }
            LJIIJJI();
            return;
        }
        Pair pair = (Pair) C13LP.LJJJJZI(list);
        LJIIL(((Number) pair.getFirst()).intValue(), ((Boolean) pair.getSecond()).booleanValue());
    }

    @Override // X.AbstractC939840aZ4
    public void setExternalHiddenViewWidth(Integer num) {
        C938220aWS c938220aWS;
        String str;
        C11PQ<List<Pair<Integer, Boolean>>> c11pq;
        List<Pair<Integer, Boolean>> listLJLZ;
        Integer num2 = this.LLJI;
        this.LLJI = num;
        if (!Intrinsics.LJFF(num2, num) && (c938220aWS = this.LLJ.get()) != null) {
            PosIdentity posIdentity = getWindow().getPosIdentity();
            if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null) {
                str = "";
            }
            C938230aWT c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false);
            if (c938230aWTLIZJ != null && (c11pq = c938230aWTLIZJ.LJIIIIZZ) != null && (listLJLZ = c11pq.LJLZ()) != null) {
                LJIILIIL(listLJLZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(int r6, boolean r7) {
        /*
            r5 = this;
            r3 = 0
            X.C12ES.LJIILL(r3, r5)
            r4 = 1
            android.view.ViewGroup r0 = r5.LJIIIZ(r4)
            if (r0 == 0) goto L8c
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        Lf:
            r0 = 10
            if (r6 < r0) goto L73
            r1 = -2
            if (r2 == 0) goto L1c
            int r0 = r2.width
            if (r0 == r1) goto L25
            r2.width = r1
        L1c:
            android.view.ViewGroup r0 = r5.LJIIIZ(r4)
            if (r0 == 0) goto L25
            X.C786410Ut5.X5(r2, r0)
        L25:
            android.view.ViewGroup r0 = r5.LJIIIZ(r4)
            if (r0 == 0) goto L2e
            X.C917650ZzH.LJFF(r0)
        L2e:
            X.16F5 r1 = LJIIJ(r5)
            if (r1 == 0) goto L3b
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r1.setText(r0)
        L3b:
            if (r7 == 0) goto L58
            X.16F5 r2 = LJIIJ(r5)
            if (r2 == 0) goto L57
            android.content.Context r1 = r5.getContext()
            r0 = 2131103659(0x7f060fab, float:1.781979E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L54
            int r3 = r0.intValue()
        L54:
            r2.setTextColor(r3)
        L57:
            return
        L58:
            X.16F5 r2 = LJIIJ(r5)
            if (r2 == 0) goto L57
            android.content.Context r1 = r5.getContext()
            r0 = 2131103656(0x7f060fa8, float:1.7819784E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L6f
            int r3 = r0.intValue()
        L6f:
            r2.setTextColor(r3)
            return
        L73:
            r0 = 1094713344(0x41400000, float:12.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r1 = (int) r0
            if (r2 == 0) goto L82
            int r0 = r2.width
            if (r0 == r1) goto L25
            r2.width = r1
        L82:
            android.view.ViewGroup r0 = r5.LJIIIZ(r4)
            if (r0 == 0) goto L25
            X.C786410Ut5.X5(r2, r0)
            goto L25
        L8c:
            r2 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C936470aTd.LJIIL(int, boolean):void");
    }

    public C936470aTd(Context context, C957020b0m c957020b0m, DataChannel dataChannel, WeakReference weakReference) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
    }
}
