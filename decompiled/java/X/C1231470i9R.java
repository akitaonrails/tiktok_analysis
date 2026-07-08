package X;

import Y.ARunnableS4S0310000_2;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.df.GroupChatDFLoadingFragment;
import com.ss.android.ugc.aweme.fangroup.model.GroupInfo;
import com.ss.android.ugc.aweme.openplatform.IGroupChatOpenPlatformServiceFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS58S1300000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0i9R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231470i9R implements InterfaceC1231480i9S {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final InterfaceC1231480i9S LJI() {
        C1311205Be.LIZ.getClass();
        IGroupChatOpenPlatformServiceFactory iGroupChatOpenPlatformServiceFactory = (IGroupChatOpenPlatformServiceFactory) C1311205Be.LIZJ.getValue();
        if (iGroupChatOpenPlatformServiceFactory != null) {
            return iGroupChatOpenPlatformServiceFactory.LIZ(this.LIZ, this.LIZIZ, this.LIZJ);
        }
        return null;
    }

    @Override // X.InterfaceC1231480i9S
    public final void LJ(Context context, C1228470i4b c1228470i4b) {
        InterfaceC1231480i9S interfaceC1231480i9SLJI = LJI();
        IMGroupChatApi.LIZIZ.getClass();
        C1618506Vj.LIZLLL(interfaceC1231480i9SLJI, "open_public_group_creation");
        if (interfaceC1231480i9SLJI != null) {
            ((C1229380i64) interfaceC1231480i9SLJI).LJ(context, c1228470i4b);
        } else {
            LJIIIIZZ(context, new AwS385S0200000_19(context, c1228470i4b, 25));
        }
    }

    @Override // X.InterfaceC1231480i9S
    public final void LJFF(Context context, C1228470i4b c1228470i4b) {
        InterfaceC1231480i9S interfaceC1231480i9SLJI = LJI();
        IMGroupChatApi.LIZIZ.getClass();
        C1618506Vj.LIZLLL(interfaceC1231480i9SLJI, "open_group_list");
        if (interfaceC1231480i9SLJI != null) {
            ((C1229380i64) interfaceC1231480i9SLJI).LJFF(context, c1228470i4b);
        } else {
            LJIIIIZZ(context, new AwS385S0200000_19(context, c1228470i4b, 24));
        }
    }

    public final void LJIIIIZZ(Context context, Function1<? super InterfaceC1231480i9S, Unit> function1) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Activity activityLIZIZ;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null && ((abstractC1387200mCcLJ = C1906580ziK.LJ()) == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null)) {
            return;
        }
        C08D9.LIZLLL().LIZ(new ARunnableS4S0310000_2(new DialogC1389620mGW(activityLIZ), this, function1, false, 0));
    }

    public C1231470i9R(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }

    @Override // X.InterfaceC1231480i9S
    public final void LIZIZ(Context context, C1230080i7C c1230080i7C, C1230090i7D c1230090i7D) {
        InterfaceC1231480i9S interfaceC1231480i9SLJI = LJI();
        IMGroupChatApi.LIZIZ.getClass();
        C1618506Vj.LIZLLL(interfaceC1231480i9SLJI, "join_group");
        if (interfaceC1231480i9SLJI != null) {
            interfaceC1231480i9SLJI.LIZIZ(context, c1230080i7C, null);
        } else {
            LJIIIIZZ(context, new AwS228S0300000_19(context, c1230080i7C, c1230090i7D, 7));
        }
    }

    @Override // X.InterfaceC1231480i9S
    public final void LIZLLL(Context context, C1228470i4b c1228470i4b, AbstractC1227390i2r abstractC1227390i2r) {
        InterfaceC1231480i9S interfaceC1231480i9SLJI = LJI();
        IMGroupChatApi.LIZIZ.getClass();
        C1618506Vj.LIZLLL(interfaceC1231480i9SLJI, "open_unified_create_group");
        if (interfaceC1231480i9SLJI != null) {
            ((C1229380i64) interfaceC1231480i9SLJI).LIZLLL(context, c1228470i4b, abstractC1227390i2r);
        } else {
            LJIIIIZZ(context, new AwS228S0300000_19(context, c1228470i4b, abstractC1227390i2r, 10));
        }
    }

    @Override // X.InterfaceC1231480i9S
    public final void LIZ(C1229390i65 c1229390i65, C1229400i66 c1229400i66, InterfaceC863580XuG interfaceC863580XuG, DialogC1389620mGW dialogC1389620mGW) {
        InterfaceC1231480i9S interfaceC1231480i9SLJI = LJI();
        IMGroupChatApi.LIZIZ.getClass();
        C1618506Vj.LIZLLL(interfaceC1231480i9SLJI, "create_group_chat");
        if (interfaceC1231480i9SLJI != null) {
            interfaceC1231480i9SLJI.LIZ(c1229390i65, c1229400i66, interfaceC863580XuG, null);
            return;
        }
        if (dialogC1389620mGW == null) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ == null) {
                return;
            }
            Activity activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
            if (activityLIZIZ != null) {
                LJIIIIZZ(activityLIZIZ, new AwS228S0300000_19(c1229390i65, c1229400i66, interfaceC863580XuG, 8));
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(activityLIZIZ);
            sbLIZ.append(" is not attached to an activity.");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        C08D9.LIZLLL().LIZ(new ARunnableS4S0310000_2(dialogC1389620mGW, this, new AwS228S0300000_19(c1229390i65, c1229400i66, interfaceC863580XuG, 9), true, 0));
    }

    @Override // X.InterfaceC1231480i9S
    public final void LIZJ(Context context, String str, C1230910i8X c1230910i8X, Function1<? super GroupInfo, Unit> function1) {
        InterfaceC1231480i9S interfaceC1231480i9SLJI = LJI();
        IMGroupChatApi.LIZIZ.getClass();
        C1618506Vj.LIZLLL(interfaceC1231480i9SLJI, "open_fan_group_list");
        if (interfaceC1231480i9SLJI != null) {
            ((C1229380i64) interfaceC1231480i9SLJI).LIZJ(context, str, c1230910i8X, function1);
        } else {
            LJIIIIZZ(context, new AwS58S1300000_19(context, (Context) str, (String) c1230910i8X, (C1230910i8X) function1, (Function1<? super GroupInfo, Unit>) 0));
        }
    }

    public final void LJII(int i, int i2, Fragment fragment, C1230910i8X c1230910i8X, String str) {
        ViewGroup viewGroup;
        InterfaceC1231480i9S interfaceC1231480i9SLJI = LJI();
        IMGroupChatApi.LIZIZ.getClass();
        C1618506Vj.LIZLLL(interfaceC1231480i9SLJI, "load_fan_group_list_assem");
        if (interfaceC1231480i9SLJI != null) {
            C1229380i64.LJI(i, i2, fragment, c1230910i8X, str);
            return;
        }
        View view = fragment.getView();
        if (view == null || (viewGroup = (ViewGroup) view.findViewById(i)) == null) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        int i3 = GroupChatDFLoadingFragment.LLJ;
        FrameLayout frameLayoutLIZ = C06LO.LIZ(-1, fragment.requireContext(), new AwS598S0100000_19(c259800zU, (C259800zU<C1749280vcc>) 11));
        frameLayoutLIZ.setId(View.generateViewId());
        C1311205Be c1311205Be = C1311205Be.LIZ;
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(fragment, 2);
        AnonymousClass0633 anonymousClass0633 = new AnonymousClass0633("com.ss.android.ugc.aweme.openplatform.GroupChatOpenPlatformServiceFactory", null, c259800zU, this, fragment, frameLayoutLIZ, str, i2, c1230910i8X);
        c1311205Be.getClass();
        C1311205Be.LIZJ(fragment, anonymousClass0633, awS563S0100000_19);
        viewGroup.addView(frameLayoutLIZ);
    }
}
