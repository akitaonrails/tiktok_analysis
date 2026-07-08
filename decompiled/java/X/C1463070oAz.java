package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker;
import com.ss.android.vesdk.VEEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463070oAz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1463020oAu LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1463070oAz(boolean z, C1463020oAu c1463020oAu, boolean z2, boolean z3, boolean z4) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c1463020oAu;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL) {
            this.LLILLJJLI.y8().LIZ();
        }
        if (this.LLILLL) {
            this.LLILLJJLI.LLLLLLJ.setValue(Boolean.valueOf(this.LLILZ));
        }
        if (this.LLILZIL && !this.LLILLJJLI.da(this.LLILLL)) {
            this.LLILLJJLI.H4().LIZLLL(-1L, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, true);
        }
        if (!this.LLILZ) {
            InterfaceC1452170ntP value = this.LLILLJJLI.B3().g().getValue();
            if (value != null) {
                value.restoreAllVideoSound();
            }
            InterfaceC1418580n1E interfaceC1418580n1ET9 = this.LLILLJJLI.t9();
            if (interfaceC1418580n1ET9 != null) {
                C1414930mvL.LIZ.getClass();
                interfaceC1418580n1ET9.Hr1(true, false, C1414930mvL.LJIILIIL());
            }
            AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(this.LLILLJJLI.LLLIIIL);
            if (abstractC214814194yLIZ != null) {
                C1463020oAu c1463020oAu = this.LLILLJJLI;
                ((IVideoLengthChecker) ServiceManager.get().getService(IVideoLengthChecker.class)).LIZJ(abstractC214814194yLIZ, c1463020oAu.getEditModel(), c1463020oAu.B3(), (AbstractC1453750nvx) c1463020oAu.LLLIIIL);
            }
            this.LLILLJJLI.T2().mR2(-1);
        }
        if (C294050Bfn.LIZ()) {
            this.LLILLJJLI.p8();
        }
        return Unit.LIZ;
    }
}
