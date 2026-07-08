package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.FastGiftCombEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.fansclub.LiveReverseFanClubSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveFoldScreenFastGiftsSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS98S0210000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123190fKn implements InterfaceViewOnClickListenerC1102800enu, InterfaceC484670IzZ {
    public final Context LL;
    public InterfaceC1103130eoR LLILLJJLI;
    public DataChannel LLILLL;
    public InterfaceC1123150fKj LLILZ;
    public C1123170fKl LLILZIL;
    public C1123160fKk LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean f1() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
        C1123170fKl c1123170fKl = this.LLILZIL;
        if (c1123170fKl != null) {
            c1123170fKl.setBottomColorStyle(EnumC1102980eoC.HIGHLIGHT);
        }
        C1123160fKk c1123160fKk = this.LLILZLL;
        if (c1123160fKk != null) {
            c1123160fKk.setBottomColorStyle(EnumC1102980eoC.HIGHLIGHT);
        }
        InterfaceC1123150fKj interfaceC1123150fKj = this.LLILZ;
        if (interfaceC1123150fKj != null) {
            interfaceC1123150fKj.setBottomColorStyle(EnumC1102980eoC.HIGHLIGHT);
        }
    }

    @Override // X.InterfaceC484670IzZ
    public final Integer getComponentType() {
        return 168;
    }

    public C1123190fKn(Context context) {
        this.LL = context;
    }

    public static final int LIZ(DataChannel dataChannel) {
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE)) {
            return 1;
        }
        return 2;
    }

    public final void LIZJ(DataChannel dataChannel) {
        View currentView;
        int i;
        ViewGroup viewGroupLJFF;
        this.LLJ = false;
        InterfaceC1123150fKj interfaceC1123150fKj = this.LLILZ;
        if (interfaceC1123150fKj != null && (currentView = interfaceC1123150fKj.getCurrentView()) != null) {
            InterfaceC1123150fKj interfaceC1123150fKj2 = this.LLILZ;
            if (interfaceC1123150fKj2 != null && (viewGroupLJFF = interfaceC1123150fKj2.LJFF()) != null) {
                C786410Ut5.LJJJLZIJ(currentView, viewGroupLJFF);
            }
            if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE)) {
                i = 1;
            } else {
                i = 2;
            }
            C0IRK.LIZIZ().LIZLLL(i, this.LLILZ);
        }
    }

    public final void LIZLLL(DataChannel dataChannel) {
        int i;
        ViewGroup viewGroup;
        this.LLJ = false;
        C1123160fKk c1123160fKk = this.LLILZLL;
        ViewParent parent = null;
        if (c1123160fKk != null) {
            parent = c1123160fKk.getParent();
        }
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LLILZLL, viewGroup);
        }
        if (this.LLILZLL != null) {
            if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE)) {
                i = 1;
            } else {
                i = 2;
            }
            C0IRK.LIZIZ().LIZLLL(i, this.LLILZLL);
        }
    }

    public final void LJ(DataChannel dataChannel) {
        int i;
        ViewGroup viewGroup;
        this.LLJ = false;
        C1123170fKl c1123170fKl = this.LLILZIL;
        ViewParent parent = null;
        if (c1123170fKl != null) {
            parent = c1123170fKl.getParent();
        }
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LLILZIL, viewGroup);
        }
        if (this.LLILZIL != null) {
            if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE)) {
                i = 1;
            } else {
                i = 2;
            }
            C0IRK.LIZIZ().LIZLLL(i, this.LLILZIL);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LLJ && !this.LLIZLLLIL) {
            if (this.LLIZ) {
                C1123170fKl c1123170fKl = this.LLILZIL;
                if (c1123170fKl != null) {
                    c1123170fKl.performClick();
                    return;
                }
                return;
            }
            InterfaceC1123150fKj interfaceC1123150fKj = this.LLILZ;
            if (interfaceC1123150fKj == null) {
                return;
            }
            interfaceC1123150fKj.LJ();
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLILLJJLI = interfaceC1103130eoR;
        this.LLILLL = dataChannel;
        C1125270fO9.LIZ().CU0();
        if (this.LLIZLLLIL) {
            LIZLLL(dataChannel);
        } else if (this.LLIZ) {
            LJ(dataChannel);
        } else {
            LIZJ(dataChannel);
        }
        C1123170fKl c1123170fKl = this.LLILZIL;
        if (c1123170fKl != null) {
            c1123170fKl.LL = null;
        }
        C1123160fKk c1123160fKk = this.LLILZLL;
        if (c1123160fKk != null) {
            c1123160fKk.LL = null;
        }
        InterfaceC1123150fKj interfaceC1123150fKj = this.LLILZ;
        if (interfaceC1123150fKj != null) {
            interfaceC1123150fKj.LIZIZ();
        }
        this.LLJI = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0fKo] */
    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        Room room;
        this.LLILLJJLI = interfaceC1103130eoR;
        this.LLILLL = dataChannel;
        if (C1125270fO9.LIZ().Bq2()) {
            InterfaceC1103130eoR interfaceC1103130eoR2 = this.LLILLJJLI;
            if (interfaceC1103130eoR2 != null) {
                interfaceC1103130eoR2.LJI(false);
            }
            InterfaceC1103130eoR interfaceC1103130eoR3 = this.LLILLJJLI;
            if (interfaceC1103130eoR3 != null) {
                interfaceC1103130eoR3.LIZLLL();
            }
            C1125270fO9.LIZ().GE1(new InterfaceC1134150fcT() { // from class: X.0fKo
                @Override // X.InterfaceC1134150fcT
                public final void LIZIZ() {
                    DataChannel dataChannel2;
                    C1123190fKn c1123190fKn = this.LIZ;
                    if (c1123190fKn.LLIZLLLIL) {
                        DataChannel dataChannel3 = c1123190fKn.LLILLL;
                        if (dataChannel3 != null) {
                            C500260Jjc.LJJLIIIJILLIZJL(new AwS418S0200000_17(c1123190fKn, dataChannel3, 127));
                            return;
                        }
                        return;
                    }
                    if (!c1123190fKn.LLIZ || (dataChannel2 = c1123190fKn.LLILLL) == null) {
                        return;
                    }
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS418S0200000_17(c1123190fKn, dataChannel2, 128));
                }

                @Override // X.InterfaceC1134150fcT
                public final void LIZJ() {
                    C1123190fKn c1123190fKn = this.LIZ;
                    DataChannel dataChannel2 = c1123190fKn.LLILLL;
                    if (dataChannel2 != null) {
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS418S0200000_17(c1123190fKn, dataChannel2, 129));
                    }
                }

                @Override // X.InterfaceC1134150fcT
                public final void LIZ(boolean z) {
                    Object c098200Yq;
                    double dDoubleValue;
                    C118300cf c118300cf = new C118300cf();
                    try {
                        Double dLIZ = InterfaceC1106030et7.c7.LIZ();
                        if (dLIZ != null) {
                            dDoubleValue = dLIZ.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        c098200Yq = Integer.valueOf((int) dDoubleValue);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = 0;
                    }
                    c118300cf.element = ((Number) c098200Yq).intValue();
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS98S0210000_17(this.LIZ, z, c118300cf, 3));
                }
            });
        } else {
            LIZIZ(this.LLILLJJLI, this.LLILLL, false);
        }
        if (!this.LLJI) {
            this.LLJI = true;
            DataChannel dataChannel2 = this.LLILLL;
            if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
                C0IZP.LIZJ(room, "quick_gift");
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZIZ(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel, boolean z) {
        InterfaceC1123150fKj interfaceC1123150fKj;
        View currentView;
        ViewGroup viewGroupLJFF;
        InterfaceC1123150fKj interfaceC1123150fKj2;
        boolean zLJFF;
        float f;
        if (this.LLJ) {
            return;
        }
        this.LLJ = true;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        int iLIZ = LIZ(dataChannel);
        IHostPad iHostPad = (IHostPad) C1161920gLG.LIZJ(IHostPad.class);
        if ((iHostPad.isPad() || iHostPad.XM(this.LL) == 1) && LiveFoldScreenFastGiftsSettings.INSTANCE.getEnable()) {
            Object objLIZ = C0IRK.LIZIZ().LIZ(iLIZ, C1123280fKw.class);
            if (objLIZ instanceof InterfaceC1123150fKj) {
                interfaceC1123150fKj = (InterfaceC1123150fKj) objLIZ;
            } else {
                interfaceC1123150fKj = null;
            }
            this.LLILZ = interfaceC1123150fKj;
            if (interfaceC1123150fKj == null) {
                C1123280fKw c1123280fKw = new C1123280fKw(this.LL);
                if (dataChannel != null) {
                    c1123280fKw.LLILZ = dataChannel;
                    EnumC1102740eno.FAST_GIFT.hide(dataChannel);
                    C1102950eo9.LIZIZ(dataChannel);
                    c1123280fKw.LJII();
                    c1123280fKw.LJI();
                    c1123280fKw.setClipChildren(false);
                    c1123280fKw.LJIIIIZZ(null, 0);
                }
                this.LLILZ = c1123280fKw;
            }
        } else {
            Boolean boolLIZ = InterfaceC1093910eZZ.LLLLLLZZ.LIZ();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.LJFF(boolLIZ, bool) && LiveReverseFanClubSetting.INSTANCE.getValue()) {
                if (dataChannel != null) {
                    EnumC1102740eno.FAST_GIFT.hide(dataChannel);
                }
                if (interfaceC1103130eoR != null) {
                    interfaceC1103130eoR.LJI(false);
                    interfaceC1103130eoR.LIZLLL();
                }
                this.LLJ = false;
                return;
            }
            Object objLIZ2 = C0IRK.LIZIZ().LIZ(iLIZ, C1123210fKp.class);
            if (objLIZ2 instanceof InterfaceC1123150fKj) {
                interfaceC1123150fKj2 = (InterfaceC1123150fKj) objLIZ2;
            } else {
                interfaceC1123150fKj2 = null;
            }
            this.LLILZ = interfaceC1123150fKj2;
            if (interfaceC1123150fKj2 == null) {
                C1123210fKp c1123210fKp = new C1123210fKp(this.LL);
                DataChannel dataChannel2 = c1123210fKp.LLJ;
                if (dataChannel2 != dataChannel && dataChannel2 != null) {
                    dataChannel2.zQ2(c1123210fKp);
                }
                c1123210fKp.LLJ = dataChannel;
                if (dataChannel != null) {
                    dataChannel.CQ2(FastGiftCombEvent.class, c1123210fKp, c1123210fKp.LLJIJIL);
                    zLJFF = Intrinsics.LJFF(dataChannel.gg0(C780690Ujr.class), bool);
                } else {
                    zLJFF = false;
                }
                c1123210fKp.LLILZIL = zLJFF;
                c1123210fKp.setBackground(C1106260etU.LIZIZ(c1123210fKp.getContext()));
                c1123210fKp.LLJI = C1102950eo9.LIZIZ(dataChannel);
                if (c1123210fKp.LLILZIL) {
                    View viewLJFF = C0J3Y.LJFF(C0J3Y.LIZ, R.layout.hyf, null, false, c1123210fKp.getContext(), false, 52);
                    c1123210fKp.LL = (LiveIconView) viewLJFF.findViewById(R.id.y74);
                    C20743416Fc c20743416Fc = (C20743416Fc) viewLJFF.findViewById(R.id.y7s);
                    c1123210fKp.LLILZLL = c20743416Fc;
                    C500260Jjc.LJIILIIL(c20743416Fc);
                    DataChannel dataChannel3 = c1123210fKp.LLJ;
                    if (dataChannel3 != null && Intrinsics.LJFF(dataChannel3.gg0(C780690Ujr.class), bool)) {
                        c1123210fKp.LIZLLL(c1123210fKp);
                    } else {
                        c1123210fKp.LIZLLL(viewLJFF);
                    }
                    c1123210fKp.addView(viewLJFF);
                } else {
                    c1123210fKp.LL = new LiveIconView(c1123210fKp.getContext(), null);
                    DataChannel dataChannel4 = c1123210fKp.LLJ;
                    if (dataChannel4 != null && Intrinsics.LJFF(dataChannel4.gg0(C780690Ujr.class), bool)) {
                        c1123210fKp.LIZLLL(c1123210fKp);
                    } else {
                        c1123210fKp.LIZLLL(c1123210fKp.LL);
                    }
                    DataChannel dataChannel5 = c1123210fKp.LLJ;
                    if (dataChannel5 != null && Intrinsics.LJFF(dataChannel5.gg0(C0TZM.class), bool)) {
                        f = 24.0f;
                    } else {
                        f = 26.0f;
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(f), (int) C497740JfY.LIZIZ(f));
                    layoutParams.gravity = 17;
                    LiveIconView liveIconView = c1123210fKp.LL;
                    if (liveIconView != null) {
                        C786410Ut5.w6(liveIconView, layoutParams);
                    }
                    c1123210fKp.addView(c1123210fKp.LL);
                }
                if (c1123210fKp.getContext() != null) {
                    c1123210fKp.addView(C0J3Y.LJFF(C0J3Y.LIZ, R.layout.hyd, null, false, c1123210fKp.getContext(), false, 52));
                    C1126220fPg c1126220fPg = (C1126220fPg) c1123210fKp.findViewById(R.id.hp5);
                    if (c1126220fPg != null) {
                        c1126220fPg.setAnimationType(EnumC1123370fL5.FAST);
                        C500260Jjc.LJIILIIL(c1126220fPg);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126220fPg);
                        c1126220fPg.setScaleX(0.55f);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126220fPg);
                        c1126220fPg.setScaleY(0.55f);
                    } else {
                        c1126220fPg = null;
                    }
                    c1123210fKp.LLILLL = c1126220fPg;
                }
                c1123210fKp.LJI(dataChannel, z);
                c1123210fKp.setClipChildren(false);
                this.LLILZ = c1123210fKp;
            }
        }
        InterfaceC1123150fKj interfaceC1123150fKj3 = this.LLILZ;
        if (interfaceC1123150fKj3 != null) {
            interfaceC1123150fKj3.LIZJ(dataChannel, z);
        }
        InterfaceC1123150fKj interfaceC1123150fKj4 = this.LLILZ;
        if (interfaceC1123150fKj4 != null && (currentView = interfaceC1123150fKj4.getCurrentView()) != null) {
            InterfaceC1123150fKj interfaceC1123150fKj5 = this.LLILZ;
            if (interfaceC1123150fKj5 != null && (viewGroupLJFF = interfaceC1123150fKj5.LJFF()) != null) {
                C786410Ut5.LJJJLZIJ(currentView, viewGroupLJFF);
            }
            if (interfaceC1103130eoR != null) {
                interfaceC1103130eoR.addView(currentView);
                interfaceC1103130eoR.LIZIZ();
            }
            if ((this.LLILZ instanceof C1123280fKw) && interfaceC1103130eoR != null) {
                ViewGroup.LayoutParams layoutParams2 = interfaceC1103130eoR.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = -1;
                }
                if (interfaceC1103130eoR != null) {
                    interfaceC1103130eoR.setLayoutParams(layoutParams2);
                }
            }
        }
    }
}
