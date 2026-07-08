package X;

import Y.ARunnableS18S0400000_9;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.Music;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Omm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629620Omm extends AbstractC1593880rZy {
    public final C19244010Qk LJ;
    public final WeakReference<Context> LJFF;
    public final EnumC631120OpC LJI;
    public final Music LJII;
    public final Function0<Boolean> LJIIIIZZ;
    public final Function0<DspPlatform> LJIIIZ;
    public final C629780On2 LJIIJ;
    public C629600Omk LJIIJJI;

    @Override // X.InterfaceC1590940rVE
    public final void LIZ() {
        C20684815ws.LJIILLIIL("tooltip_protection_check", LIZLLL("4010").LIZ);
    }

    @Override // X.InterfaceC1590940rVE
    public final boolean LIZIZ() {
        if (this.LJIIJ.LIZIZ() || Intrinsics.LJFF(this.LJIIIIZZ.invoke(), Boolean.TRUE)) {
            return false;
        }
        C629600Omk c629600OmkLJJLIIIIJ = C633020OsG.LIZIZ.LJJLIIIIJ(EnumC631120OpC.MUSIC_DETAIL, this.LJI, this.LJIIIZ.invoke(), this.LJII);
        this.LJIIJJI = c629600OmkLJJLIIIIJ;
        return c629600OmkLJJLIIIIJ != null;
    }

    @Override // X.InterfaceC1590940rVE
    public final void q0(Function0<Unit> function0) {
        View view;
        Context context;
        WeakReference<View> weakReference = this.LJ.LIZ;
        if (weakReference != null && (view = weakReference.get()) != null && (context = this.LJFF.get()) != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS18S0400000_9(this, context, view, function0, 5), 300L);
        }
    }

    public C629620Omm(C19244010Qk c19244010Qk, WeakReference weakReference, EnumC631120OpC enumC631120OpC, Music music, AwS553S0100000_9 awS553S0100000_9, AwS553S0100000_9 awS553S0100000_92) {
        super(c19244010Qk, weakReference);
        this.LJ = c19244010Qk;
        this.LJFF = weakReference;
        this.LJI = enumC631120OpC;
        this.LJII = music;
        this.LJIIIIZZ = awS553S0100000_9;
        this.LJIIIZ = awS553S0100000_92;
        this.LJIIJ = new C629780On2();
    }
}
