package X;

import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import com.ss.android.ugc.profile.business.ur.platform.follow.HeaderCTAFollowComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0j3S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266200j3S implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void LIZIZ$0(C1266200j3S c1266200j3S) {
    }

    public static final /* synthetic */ void LIZIZ$1(C1266200j3S c1266200j3S) {
    }

    public static final /* synthetic */ void LIZIZ$2(C1266200j3S c1266200j3S) {
    }

    public static final /* synthetic */ void LIZIZ$3(C1266200j3S c1266200j3S) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
            case 3:
                LIZ$3(this);
                break;
            case 4:
                LIZ$4(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final /* synthetic */ void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
            case 3:
                LIZIZ$3(this);
                break;
            case 4:
                LIZIZ$4(this);
                break;
        }
    }

    public static final void LIZ$0(C1266200j3S c1266200j3S) {
        ((Function0) c1266200j3S.l0).invoke();
    }

    public static final void LIZ$1(C1266200j3S c1266200j3S) {
        ((AwemeListFragmentImpl) c1266200j3S.l0).xU("fresh_after_login", false, false);
    }

    public static final void LIZ$2(C1266200j3S c1266200j3S) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) c1266200j3S.l0;
        C1C7U.LIZ("AwemeListFragmentImpl@a373.lambda$onCreate$1$1L");
        awemeListFragmentImpl.W0();
    }

    public static final void LIZ$3(C1266200j3S c1266200j3S) {
        ((C1259490isd) c1266200j3S.l0).LLILLJJLI.invoke();
    }

    public static final void LIZ$4(C1266200j3S c1266200j3S) {
        ((HeaderCTAFollowComponent) c1266200j3S.l0).qq().vQ2(EnumC1252200igs.START);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("BaseUIComponent", "Follow click - not login, login success");
        ((HeaderCTAFollowComponent) c1266200j3S.l0).qq().xQ2();
        ((HeaderCTAFollowComponent) c1266200j3S.l0).bJ1("profile_follow");
        ((HeaderCTAFollowComponent) c1266200j3S.l0).Bm1(-1);
    }

    public static final void LIZIZ$4(C1266200j3S c1266200j3S) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("BaseUIComponent", "Follow click - not login, login cancel");
    }

    public C1266200j3S(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
