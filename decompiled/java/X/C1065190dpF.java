package X;

import com.ss.android.ugc.profile.business.ur.edit.ProfileLemon8ServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065190dpF implements InterfaceC1065240dpK {
    public final /* synthetic */ ProfileLemon8ServiceImpl LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Function0<Unit> LIZJ;
    public final /* synthetic */ Function0<Unit> LIZLLL;

    @Override // X.InterfaceC1065240dpK
    public final void LIZ() {
        ProfileLemon8ServiceImpl profileLemon8ServiceImpl = this.LIZ;
        String str = this.LIZIZ;
        profileLemon8ServiceImpl.getClass();
        ProfileLemon8ServiceImpl.LJIJJLI("failure", str, "open_error");
        Function0<Unit> function0 = this.LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC1065240dpK
    public final void LIZIZ() {
        ProfileLemon8ServiceImpl profileLemon8ServiceImpl = this.LIZ;
        String str = this.LIZIZ;
        profileLemon8ServiceImpl.getClass();
        ProfileLemon8ServiceImpl.LJIJJLI("success", str, null);
        Function0<Unit> function0 = this.LIZJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void LIZJ() {
        ProfileLemon8ServiceImpl profileLemon8ServiceImpl = this.LIZ;
        String str = this.LIZIZ;
        profileLemon8ServiceImpl.getClass();
        ProfileLemon8ServiceImpl.LJIJJLI("failure", str, "no_capability");
        Function0<Unit> function0 = this.LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public C1065190dpF(ProfileLemon8ServiceImpl profileLemon8ServiceImpl, String str, Function0<Unit> function0, Function0<Unit> function02) {
        this.LIZ = profileLemon8ServiceImpl;
        this.LIZIZ = str;
        this.LIZJ = function0;
        this.LIZLLL = function02;
    }
}
