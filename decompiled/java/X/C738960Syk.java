package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.avatar.LandscapeAvatarAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS27S0200100_11;

/* JADX INFO: renamed from: X.0Syk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738960Syk implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final /* synthetic */ void LIZIZ$0(C738960Syk c738960Syk) {
    }

    public static final /* synthetic */ void LIZIZ$1(C738960Syk c738960Syk) {
    }

    public static final /* synthetic */ void LIZIZ$2(C738960Syk c738960Syk) {
    }

    public static final /* synthetic */ void LIZIZ$3(C738960Syk c738960Syk) {
    }

    public static final /* synthetic */ void LIZIZ$4(C738960Syk c738960Syk) {
    }

    public static final /* synthetic */ void LIZIZ$5(C738960Syk c738960Syk) {
    }

    public static final /* synthetic */ void LIZIZ$6(C738960Syk c738960Syk) {
    }

    public static final /* synthetic */ void LIZIZ$7(C738960Syk c738960Syk) {
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
            case 5:
                LIZ$5(this);
                break;
            case 6:
                LIZ$6(this);
                break;
            case 7:
                LIZ$7(this);
                break;
            case 8:
                LIZ$8(this);
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
            case 5:
                LIZIZ$5(this);
                break;
            case 6:
                LIZIZ$6(this);
                break;
            case 7:
                LIZIZ$7(this);
                break;
            case 8:
                LIZIZ$8(this);
                break;
        }
    }

    public static final void LIZ$0(C738960Syk c738960Syk) {
        if (!((VideoDiggVM) c738960Syk.l0).LLILLJJLI && ((Aweme) c738960Syk.l1).getUserDigg() == 0 && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            VideoDiggVM videoDiggVM = (VideoDiggVM) c738960Syk.l0;
            videoDiggVM.LL++;
            long jSQ2 = videoDiggVM.SQ2((Aweme) c738960Syk.l1, true);
            VideoDiggVM videoDiggVM2 = (VideoDiggVM) c738960Syk.l0;
            videoDiggVM2.withState(new AwS27S0200100_11(videoDiggVM2, jSQ2, (Aweme) c738960Syk.l1, 0));
            C1440005kM.LIZ(new C730120SkU(((Aweme) c738960Syk.l1).getAid(), jSQ2, 1, EnumC730430Skz.ICON));
            C734440SrS c734440SrS = C734440SrS.LIZ;
            String aid = ((Aweme) c738960Syk.l1).getAid();
            c734440SrS.getClass();
            C734440SrS.LJFF(1, 1, aid);
            ((VideoDiggVM) c738960Syk.l0).JQ2("click_double_like");
        }
    }

    public static final void LIZ$1(C738960Syk c738960Syk) {
        ((VideoDiggVM) c738960Syk.l0).RQ2((Function2) c738960Syk.l1);
    }

    public static final void LIZ$2(C738960Syk c738960Syk) {
        if (((C0SY1) ((LandscapeAvatarAssem) c738960Syk.l0).LLLIL.getValue()).LJIIIZ()) {
            ((Function0) c738960Syk.l1).invoke();
        }
    }

    public static final void LIZ$3(C738960Syk c738960Syk) {
        ((PostDiggViewModel) c738960Syk.l0).yQ2((Function2) c738960Syk.l1);
    }

    public static final void LIZ$4(C738960Syk c738960Syk) {
        ((C736280SuQ) c738960Syk.l0).LJIIJJI((View) c738960Syk.l1);
    }

    public static final void LIZ$5(C738960Syk c738960Syk) {
        ((C734790Ss1) c738960Syk.l0).LIZ((Context) c738960Syk.l1);
    }

    public static final void LIZ$6(C738960Syk c738960Syk) {
        ((C734140Sqy) c738960Syk.l0).LIZIZ((Aweme) c738960Syk.l1, null);
    }

    public static final void LIZ$7(C738960Syk c738960Syk) {
        ((C734210Sr5) c738960Syk.l0).LIZLLL((Aweme) c738960Syk.l1);
    }

    public static final void LIZ$8(C738960Syk c738960Syk) {
        Function0<Unit> function0 = ((C735220Ssi) c738960Syk.l0).LJ;
        if (function0 != null) {
            function0.invoke();
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c738960Syk.l1;
        Boolean bool = Boolean.TRUE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
    }

    public static final void LIZIZ$8(C738960Syk c738960Syk) {
        Function1<C0OAF, Unit> function1 = ((C735220Ssi) c738960Syk.l0).LJFF;
        if (function1 != null) {
            function1.invoke(new C0OAF(102, "login cancelled", null));
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c738960Syk.l1;
        Boolean bool = Boolean.FALSE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
    }

    public C738960Syk(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
