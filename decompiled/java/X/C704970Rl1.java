package X;

import Y.ARunnableS111S0100000_11;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rl1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704970Rl1 extends AbstractC705030Rl7<C704870Rkr> {
    public final InterfaceC705010Rl5 LJIILJJIL;
    public final Function0<C698920RbG> LJIILL;
    public final Function0<Function1<View, Unit>> LJIILLIIL;
    public final AtomicBoolean LJIIZILJ;

    public C704970Rl1() {
        throw null;
    }

    @Override // X.InterfaceC705050Rl9
    public final void onShow() {
        Aweme aweme;
        InterfaceC702810RhX interfaceC702810RhX;
        Aweme aweme2;
        C12EL c12elLIZ;
        Aweme aweme3;
        C704870Rkr c704870Rkr = (C704870Rkr) this.LJIIL;
        if (c704870Rkr == null || c704870Rkr.LIZIZ == null || !Intrinsics.LJFF(LIZLLL().LIZ, "exited")) {
            return;
        }
        LIZLLL().LIZ = "showing";
        View view = this.LJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        VideoItemParams videoItemParams = this.LJIIJJI;
        if (videoItemParams != null && (aweme3 = videoItemParams.getAweme()) != null) {
            aweme3.getAid();
        }
        InterfaceC705010Rl5 interfaceC705010Rl5 = this.LJIILJJIL;
        if (interfaceC705010Rl5 != null && (c12elLIZ = interfaceC705010Rl5.LIZ()) != null) {
            String str = c12elLIZ.LJFF;
            if (str == null || str.length() == 0) {
                C705340Rlc c705340Rlc = this.LJIILIIL;
                if (c705340Rlc != null) {
                    c705340Rlc.LIZIZ("cta_delay_exposure");
                }
            } else {
                C705340Rlc c705340Rlc2 = this.LJIILIIL;
                if (c705340Rlc2 != null) {
                    c705340Rlc2.LIZIZ("cta_has_exposure");
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", template: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", start reporting fdmt show, aid: ");
        VideoItemParams videoItemParams2 = this.LJIIJJI;
        String aid = null;
        sbLIZ.append((videoItemParams2 == null || (aweme2 = videoItemParams2.getAweme()) == null) ? null : aweme2.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        C704840Rko c704840Rko = this.LJII;
        if (c704840Rko != null) {
            ((LinkedHashMap) c704840Rko.LJIIIZ).clear();
        }
        C704840Rko c704840Rko2 = this.LJII;
        if (c704840Rko2 != null && (interfaceC702810RhX = c704840Rko2.LJI) != null) {
            interfaceC702810RhX.LIZIZ();
        }
        LJIILL();
        C20684815ws.LJFF().submit(new ARunnableS111S0100000_11(this, 196));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("component: ");
        sbLIZ2.append(this.LIZJ);
        sbLIZ2.append(", template: ");
        sbLIZ2.append(this.LJ);
        sbLIZ2.append(", finish reporting fdmt show, aid: ");
        VideoItemParams videoItemParams3 = this.LJIIJJI;
        if (videoItemParams3 != null && (aweme = videoItemParams3.getAweme()) != null) {
            aid = aweme.getAid();
        }
        sbLIZ2.append(aid);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.AbstractC705030Rl7
    public final void LJIILIIL() {
        super.LJIILIIL();
        InterfaceC705010Rl5 interfaceC705010Rl5 = this.LJIILJJIL;
        if (interfaceC705010Rl5 != null) {
            interfaceC705010Rl5.reset();
        }
    }

    @Override // X.InterfaceC705050Rl9
    public final void LIZ(String str) {
        if (!Intrinsics.LJFF(LIZLLL().LIZ, "showing")) {
            return;
        }
        LIZLLL().LIZ = "exited";
        C705340Rlc c705340Rlc = this.LJIILIIL;
        if (c705340Rlc != null) {
            c705340Rlc.LIZ("cta_delay_exposure");
        }
        this.LJIIZILJ.set(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0Rks] */
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
    @Override // X.AbstractC705030Rl7
    /* JADX INFO: renamed from: LJIJ, reason: merged with bridge method [inline-methods] */
    public final void LJIIZILJ(C704870Rkr c704870Rkr, Function0<Unit> function0) {
        ViewGroup viewGroup;
        Aweme aweme;
        final C698920RbG c698920RbGInvoke = this.LJIILL.invoke();
        InterfaceC705010Rl5 interfaceC705010Rl5 = this.LJIILJJIL;
        if (interfaceC705010Rl5 != 0) {
            VideoItemParams videoItemParams = this.LJIIJJI;
            String aid = null;
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                aid = aweme.getAid();
            }
            View view = this.LJI;
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                interfaceC705010Rl5.LIZIZ(aid, viewGroup, c704870Rkr.LIZIZ, new AwS590S0100000_11(this, 596), this.LJIILLIIL, new C12EP() { // from class: X.0Rks
                    @Override // X.C12EP
                    public final void LIZ(View view2, View view3) {
                        C698920RbG c698920RbG = c698920RbGInvoke;
                        if (c698920RbG != null) {
                            c698920RbG.LIZLLL(view2);
                        }
                        C698920RbG c698920RbG2 = c698920RbGInvoke;
                        if (c698920RbG2 != null) {
                            c698920RbG2.LIZLLL(view3);
                        }
                    }

                    @Override // X.C12EP
                    public final void LIZIZ(View view2, View view3) {
                        String str = "";
                        if (view3.isShown()) {
                            C698920RbG c698920RbG = c698920RbGInvoke;
                            if (c698920RbG != null) {
                                String str2 = this.LIZJ;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                c698920RbG.LIZIZ(view2, new C698390RaP(str2, true, false));
                            }
                            C698920RbG c698920RbG2 = c698920RbGInvoke;
                            if (c698920RbG2 != null) {
                                String str3 = this.LIZJ;
                                if (str3 != null) {
                                    str = str3;
                                }
                                c698920RbG2.LIZIZ(view3, new C698390RaP(str, false, true));
                                return;
                            }
                            return;
                        }
                        C698920RbG c698920RbG3 = c698920RbGInvoke;
                        if (c698920RbG3 == null) {
                            return;
                        }
                        String str4 = this.LIZJ;
                        if (str4 != null) {
                            str = str4;
                        }
                        c698920RbG3.LIZIZ(view2, new C698390RaP(str, true, true));
                    }
                });
            } else {
                return;
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.AbstractC705030Rl7
    public final void LJIIIZ(VideoItemParams videoItemParams, AbstractC704860Rkq abstractC704860Rkq, C705340Rlc c705340Rlc) {
        super.LJIIIZ(videoItemParams, abstractC704860Rkq, c705340Rlc);
    }

    public C704970Rl1(InterfaceC705010Rl5 interfaceC705010Rl5, Function0 function0, String str, String str2, View view, C704840Rko c704840Rko, AwS555S0100000_11 awS555S0100000_11) {
        super(str, str2, null, view, c704840Rko, 17);
        this.LJIILJJIL = interfaceC705010Rl5;
        this.LJIILL = function0;
        this.LJIILLIIL = awS555S0100000_11;
        this.LJIIZILJ = new AtomicBoolean(false);
    }
}
