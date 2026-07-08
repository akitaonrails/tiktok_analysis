package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15d5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20562115d5 implements InterfaceC20562615dA {
    public final EnumC1783170wVH LL = EnumC1783170wVH.HANDLER;

    public abstract VideoAdaptionResult LIZ(VideoAdaptionParams videoAdaptionParams, VideoAdaptionResult videoAdaptionResult);

    @Override // X.InterfaceC20562615dA
    public final EnumC1783170wVH getNodeType() {
        return this.LL;
    }

    @Override // X.InterfaceC20562615dA
    public final void Ui(Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20569715eJ.LJIIIZ(this, function0, interfaceC1604490rr5, c0raa);
    }

    @Override // X.InterfaceC20562615dA
    public final void ah(Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20569715eJ.LJII(this, function0, interfaceC1604490rr5, c0raa);
    }

    @Override // X.InterfaceC20562615dA
    public final void em(Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20569715eJ.LJIIJJI(this, function0, interfaceC1604490rr5, c0raa);
    }

    @Override // X.InterfaceC20562615dA
    public final void Lj(C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        C20569715eJ.LJ(this, c0t9y, interfaceC1604490rr5, c0raa, function0);
    }

    @Override // X.InterfaceC20562615dA
    public final void y5(C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        C20569715eJ.LIZJ(this, c0t9y, interfaceC1604490rr5, c0raa, function0);
    }

    @Override // X.InterfaceC20562615dA
    public final void zb(C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        C20569715eJ.LIZ(this, c0t9y, interfaceC1604490rr5, c0raa, function0);
    }
}
