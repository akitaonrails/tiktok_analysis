package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.IApplyGuideAbility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aPE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933740aPE implements InterfaceC933750aPF {
    public final InterfaceC933750aPF LIZ;

    @Override // X.InterfaceC933750aPF
    public final void LIZ(AbstractC939840aZ4 abstractC939840aZ4) {
        this.LIZ.LIZ(abstractC939840aZ4);
    }

    @Override // X.InterfaceC933750aPF
    public final void LIZIZ(C933460aOm c933460aOm) {
        this.LIZ.LIZIZ(c933460aOm);
    }

    @Override // X.InterfaceC933750aPF
    public final void LIZJ(Function0 function0, Function1 function1) {
        this.LIZ.LIZJ(function0, function1);
    }

    @Override // X.InterfaceC933750aPF
    public final void LIZLLL(Function0 function0, Function1 function1, boolean z, boolean z2) {
        this.LIZ.LIZLLL(function0, function1, z, z2);
    }

    @Override // X.InterfaceC933750aPF
    public final void onDetach() {
        this.LIZ.onDetach();
    }

    public C933740aPE(final DataChannel dataChannel, final C933730aPD c933730aPD) {
        InterfaceC933750aPF c933720aPC;
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            c933720aPC = new C933720aPC(c933730aPD, dataChannel);
        } else {
            c933720aPC = new InterfaceC933750aPF(c933730aPD, dataChannel) { // from class: X.0aPG
                public final DataChannel LIZ;
                public final LifecycleOwner LIZIZ;
                public AbstractC939840aZ4 LIZJ;
                public C1319900kS4 LIZLLL;
                public IApplyGuideAbility LJ;

                @Override // X.InterfaceC933750aPF
                public final void LIZIZ(C933460aOm c933460aOm) {
                }

                @Override // X.InterfaceC933750aPF
                public final void LIZJ(Function0 function0, Function1 function1) {
                }

                @Override // X.InterfaceC933750aPF
                public final void onDetach() {
                }

                @Override // X.InterfaceC933750aPF
                public final void LIZ(AbstractC939840aZ4 abstractC939840aZ4) {
                    this.LIZJ = abstractC939840aZ4;
                    InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LIZ.gg0(C956790b0P.class);
                    IApplyGuideAbility iApplyGuideAbility = null;
                    if (interfaceC665370Q7z != null) {
                        iApplyGuideAbility = (IApplyGuideAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IApplyGuideAbility.class, null);
                    }
                    this.LJ = iApplyGuideAbility;
                }

                {
                    this.LIZ = dataChannel;
                    this.LIZIZ = c933730aPD;
                }

                /* JADX WARN: Removed duplicated region for block: B:80:0x0102  */
                @Override // X.InterfaceC933750aPF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZLLL(kotlin.jvm.functions.Function0 r12, kotlin.jvm.functions.Function1 r13, boolean r14, boolean r15) {
                    /*
                        Method dump skipped, instruction units count: 319
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C933760aPG.LIZLLL(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, boolean, boolean):void");
                }
            };
        }
        this.LIZ = c933720aPC;
    }
}
