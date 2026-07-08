package X;

import Y.ARunnableS3S0102000_7;
import Y.AfS176S0100000_7;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightNearByEntranceSetting;
import com.bytedance.android.livesdk.userservice.UserApi;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Ijw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.locationservice.ShowLocationUtil$initLocationSwitchInterval$2", f = "ShowLocationUtil.kt", l = {186, 490}, m = "invokeSuspend")
public final class C474980Ijw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ DataChannel LLILZ;
    public final /* synthetic */ Boolean LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ CompoundButton LLIZ;
    public final /* synthetic */ C16F5 LLIZLLLIL;
    public final /* synthetic */ View LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ C259800zU<C474990Ijx> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C474980Ijw(boolean z, DataChannel dataChannel, Boolean bool, View view, CompoundButton compoundButton, C16F5 c16f5, View view2, boolean z2, C259800zU<C474990Ijx> c259800zU, InterfaceC1364105Vn<? super C474980Ijw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = dataChannel;
        this.LLILZIL = bool;
        this.LLILZLL = view;
        this.LLIZ = compoundButton;
        this.LLIZLLLIL = c16f5;
        this.LLJ = view2;
        this.LLJI = z2;
        this.LLJIJIL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C474980Ijw(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        boolean z;
        C20743716Ff c20743716Ff;
        View viewFindViewById;
        CompoundButton compoundButton;
        boolean zLJJJI;
        long jLongValue2;
        long jLongValue3;
        C758980Tpw c758980Tpw;
        Object objLJIJ = obj;
        C1C7U.LIZ("ShowLocationUtil@5031.initLocationSwitchInterval$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJIJ);
                    jLongValue = ((Number) objLJIJ).longValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJIJ);
                jLongValue = ((Number) objLJIJ).longValue();
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            if (this.LLILLL) {
                DataChannel dataChannel = this.LLILZ;
                if (dataChannel != null && (c758980Tpw = (C758980Tpw) dataChannel.gg0(C751800TeM.class)) != null) {
                    this.LLILLJJLI = 1;
                    objLJIJ = c758980Tpw.LJIIIZ(this);
                    if (objLJIJ == objLJFF) {
                        C1C7U.LIZIZ("ShowLocationUtil@5031.initLocationSwitchInterval$2");
                        return objLJFF;
                    }
                    jLongValue = ((Number) objLJIJ).longValue();
                }
                jLongValue = 0;
            } else {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Long l = (Long) dataChannelGlobal.gg0(C1148080fyw.class);
                if (l != null) {
                    jLongValue2 = l.longValue();
                } else {
                    jLongValue2 = 3;
                }
                Boolean bool = this.LLILZIL;
                this.LL = bool;
                this.LLILLJJLI = 2;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                if (jLongValue2 == 3 && C500260Jjc.LJJJI(InterfaceC1106030et7.K8.LIZ()) && C500260Jjc.LJJJI(bool)) {
                    C480460Ism.LIZ().getClass();
                    ((UserApi) C480460Ism.LIZLLL(UserApi.class)).getUserAttr("18,32").LJFF(new C0UO0()).LJJIIZ(new AfS176S0100000_7(c2252611DEt, 277), new AfS176S0100000_7(c2252611DEt, 278));
                } else {
                    Long l2 = (Long) dataChannelGlobal.gg0(C1148080fyw.class);
                    if (l2 != null) {
                        jLongValue3 = l2.longValue();
                    } else {
                        jLongValue3 = 0;
                    }
                    Long lLJFF = C2286608xc.LJFF(jLongValue3);
                    C189200o6.m2constructorimpl(lLJFF);
                    c2252611DEt.resumeWith(lLJFF);
                }
                objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("ShowLocationUtil@5031.initLocationSwitchInterval$2");
                    return objLJFF;
                }
                jLongValue = ((Number) objLJIJ).longValue();
            }
        }
        boolean zBooleanValue = false;
        View view = null;
        if (!LiveSkylightNearByEntranceSetting.enableRequestLocation() && (jLongValue == 0 || jLongValue == 3 || C500260Jjc.LJJIFFI(this.LLILZIL))) {
            if (this.LLILLL) {
                zLJJJI = C500260Jjc.LJJJI(InterfaceC1106030et7.L8.LIZ());
            } else {
                zLJJJI = C500260Jjc.LJJJI(InterfaceC1106030et7.K8.LIZ());
            }
            if (zLJJJI) {
                View view2 = this.LLILZLL;
                if (view2 != null) {
                    C500260Jjc.LLFFF(view2);
                }
                CompoundButton compoundButton2 = this.LLIZ;
                if (compoundButton2 != null) {
                    C786410Ut5.w7(compoundButton2, null);
                }
                CompoundButton compoundButton3 = this.LLIZ;
                if (compoundButton3 != null) {
                    compoundButton3.setChecked(false);
                }
                CompoundButton compoundButton4 = this.LLIZ;
                if (compoundButton4 != null) {
                    compoundButton4.setEnabled(false);
                }
                C16F5 c16f5 = this.LLIZLLLIL;
                if (c16f5 != null) {
                    c16f5.setMovementMethod(null);
                }
                C16F5 c16f52 = this.LLIZLLLIL;
                if (c16f52 != null) {
                    c16f52.setEnabled(false);
                }
                C786410Ut5.T4(this.LLILZLL, 0.34f);
                View view3 = this.LLILZLL;
                final boolean z2 = this.LLILLL;
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Ijv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        if (z2) {
                            C766270U4b.LIZLLL(2131855683);
                        } else {
                            C766270U4b.LIZLLL(2131855690);
                        }
                    }
                }, view3);
            } else {
                View view4 = this.LLILZLL;
                if (view4 != null) {
                    C500260Jjc.LJIILIIL(view4);
                }
            }
        } else {
            if (this.LLILLL) {
                InterfaceC1106030et7.L8.LIZJ(true);
            } else {
                InterfaceC1106030et7.K8.LIZJ(true);
            }
            C786410Ut5.T4(this.LLILZLL, 1.0f);
            C16F5 c16f53 = this.LLIZLLLIL;
            if (c16f53 != null) {
                c16f53.setMovementMethod(LinkMovementMethod.getInstance());
            }
            C500260Jjc.LLFFF(this.LLILZLL);
            C16F5 c16f54 = this.LLIZLLLIL;
            if (c16f54 != null) {
                c16f54.setEnabled(true);
            }
            CompoundButton compoundButton5 = this.LLIZ;
            if (compoundButton5 != null) {
                compoundButton5.setEnabled(true);
            }
            View view5 = this.LLJ;
            if (view5 != null) {
                view5.setEnabled(true);
            }
            if (Intrinsics.LJFF(this.LLILZIL, true) && jLongValue == 1) {
                z = true;
            } else {
                z = false;
            }
            CompoundButton compoundButton6 = this.LLIZ;
            if (compoundButton6 != null) {
                compoundButton6.setChecked(z);
            }
            final View view6 = this.LLILZLL;
            final CompoundButton compoundButton7 = this.LLIZ;
            final boolean z3 = this.LLILLL;
            final C259800zU<C474990Ijx> c259800zU = this.LLJIJIL;
            final DataChannel dataChannel2 = this.LLILZ;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.0Ijs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view7) {
                    C817503Hh c817503Hh = C817503Hh.LL;
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C474930Ijr(view6, compoundButton7, z3, c259800zU, dataChannel2, null), 2);
                }
            };
            if (this.LLJI) {
                if (compoundButton7 instanceof C20743716Ff) {
                    c20743716Ff = (C20743716Ff) compoundButton7;
                } else {
                    c20743716Ff = null;
                }
                if (c20743716Ff != null) {
                    c20743716Ff.setToggleEnabled(false);
                    c20743716Ff.setDebounceClickEnabled(true);
                    c20743716Ff.setDelayInterval(500L);
                    c20743716Ff.setEnabled(false);
                    c20743716Ff.setDisabledAlpha(1.0f);
                    C1834150xpV.LJIIJ(c20743716Ff, true);
                    C786410Ut5.k8(c20743716Ff, onClickListener);
                }
            } else {
                C786410Ut5.I7(null, view6);
                View view7 = this.LLJ;
                if (view7 != null) {
                    C786410Ut5.I7(onClickListener, view7);
                }
            }
        }
        C474990Ijx c474990Ijx = this.LLJIJIL.element;
        if (c474990Ijx != null) {
            boolean z4 = this.LLILLL;
            Object parent = this.LLILZLL.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            }
            DataChannel dataChannel3 = this.LLILZ;
            if (view != null && (viewFindViewById = view.findViewById(R.id.mc8)) != null) {
                c474990Ijx.LIZ = viewFindViewById;
                View viewFindViewById2 = view.findViewById(R.id.mc5);
                if (viewFindViewById2 != null) {
                    c474990Ijx.LIZIZ = viewFindViewById2;
                    if (view.findViewById(R.id.nob) != null && (compoundButton = (CompoundButton) view.findViewById(R.id.nor)) != null) {
                        c474990Ijx.LIZJ = compoundButton;
                        View viewFindViewById3 = view.findViewById(R.id.noq);
                        if (viewFindViewById3 != null) {
                            c474990Ijx.LIZLLL = viewFindViewById3;
                            c474990Ijx.LJI = view.getContext();
                            c474990Ijx.LJ = z4;
                            c474990Ijx.LJFF = dataChannel3;
                            c474990Ijx.LIZ();
                            DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
                            Boolean bool2 = (Boolean) dataChannelGlobal2.gg0(C951980ase.class);
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            if (zBooleanValue) {
                                dataChannelGlobal2.JQ2(C951980ase.class, Boolean.FALSE);
                                int iLIZLLL = C497740JfY.LIZLLL(R.attr.eyj, c474990Ijx.LJI);
                                int iLIZLLL2 = C497740JfY.LIZLLL(R.attr.exe, c474990Ijx.LJI);
                                View view8 = c474990Ijx.LIZ;
                                if (view8 != null) {
                                    HandlerHook.viewPostDelay(view8, new ARunnableS3S0102000_7(c474990Ijx, iLIZLLL, iLIZLLL2, 1), 150L);
                                }
                            }
                        }
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShowLocationUtil@5031.initLocationSwitchInterval$2");
        return unit;
    }
}
