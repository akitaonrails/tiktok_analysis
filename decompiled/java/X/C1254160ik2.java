package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.profile.IProfileLemon8Service;
import com.ss.android.ugc.aweme.profile.model.Lemon8Struct;
import com.ss.android.ugc.profile.business.ur.edit.ProfileLemon8ServiceImpl;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS126S1100000_12;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0ik2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254160ik2 implements IProfileLemon8Service {
    public static final C1254160ik2 LIZIZ = new C1254160ik2();
    public final /* synthetic */ IProfileLemon8Service LIZ;

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LIZ(String str, AwS133S1100000_19 awS133S1100000_19, AwS126S1100000_12 awS126S1100000_12) {
        this.LIZ.LIZ(str, awS133S1100000_19, awS126S1100000_12);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final boolean LIZIZ(C19EG c19eg) {
        return this.LIZ.LIZIZ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LIZJ(Context context, Map<String, String> map) {
        this.LIZ.LIZJ(context, map);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LIZLLL(Activity activity, String str, boolean z) {
        this.LIZ.LIZLLL(activity, str, z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final boolean LJ(C19EG c19eg) {
        return this.LIZ.LJ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJFF(Context context, Lemon8Struct lemon8Struct) {
        this.LIZ.LJFF(context, lemon8Struct);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final boolean LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJII(ViewGroup viewGroup, C0TGX c0tgx) {
        this.LIZ.LJII(viewGroup, c0tgx);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJIIIIZZ(Context context, Map<String, String> map) {
        this.LIZ.LJIIIIZZ(context, map);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJIIIZ(int i, Activity activity) {
        this.LIZ.LJIIIZ(i, activity);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final String LJIIJ(String str, String str2, String str3) {
        return this.LIZ.LJIIJ(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJIIJJI(Activity activity, Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02) {
        this.LIZ.LJIIJJI(activity, map, function0, function02);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJIIL(C19EG c19eg, String str, Function1 function1, Function1 function12) {
        this.LIZ.LJIIL(c19eg, str, function1, function12);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJIILIIL(AwS563S0100000_19 awS563S0100000_19, AwS385S0200000_19 awS385S0200000_19) {
        this.LIZ.LJIILIIL(awS563S0100000_19, awS385S0200000_19);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJIILJJIL(C19EG c19eg) {
        this.LIZ.LJIILJJIL(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final boolean LJIILL(C19EG c19eg) {
        return this.LIZ.LJIILL(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final void LJIILLIIL(String str, String str2, String str3, String str4, String str5, String str6) {
        this.LIZ.LJIILLIIL(str, str2, str3, str4, str5, str6);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileLemon8Service
    public final String LJIIZILJ(String str, String str2) {
        return this.LIZ.LJIIZILJ(str, str2);
    }

    public C1254160ik2() {
        IProfileLemon8Service iProfileLemon8Service;
        Object objLIZ = C04TD.LIZ(IProfileLemon8Service.class, false);
        if (objLIZ != null) {
            iProfileLemon8Service = (IProfileLemon8Service) objLIZ;
        } else {
            if (C04TD.I6 == null) {
                synchronized (IProfileLemon8Service.class) {
                    if (C04TD.I6 == null) {
                        C04TD.I6 = new ProfileLemon8ServiceImpl();
                    }
                }
            }
            iProfileLemon8Service = C04TD.I6;
        }
        this.LIZ = iProfileLemon8Service;
    }
}
