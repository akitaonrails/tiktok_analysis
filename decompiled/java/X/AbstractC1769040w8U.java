package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0w8U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1769040w8U {
    public C19EG LIZ;
    public Context LIZIZ;
    public CustomDotAssem LIZJ;
    public final C1769690w9X LIZLLL = new C1769690w9X(this);

    public abstract void LIZ(Map<String, String> map);

    public abstract InterfaceC1769710w9Z LIZLLL();

    public abstract String LJ();

    public abstract int LJFF();

    public abstract void LJI();

    public abstract void LJII();

    public abstract void LJIIIIZZ(EnumC1769360w90 enumC1769360w90, Function0 function0);

    public abstract void LJIIIZ();

    public abstract void LJIIJ(boolean z);

    public abstract void LJIIJJI(EnumC1769260w8q enumC1769260w8q);

    public abstract boolean LJIIL();

    public abstract boolean LJIILIIL();

    public abstract void LJIILJJIL(CustomDotAssem customDotAssem);

    public abstract void LJIILL();

    public abstract void LJIILLIIL();

    public abstract void LJIIZILJ(Bitmap bitmap, EnumC1769360w90 enumC1769360w90, Function0<Unit> function0);

    public abstract void LJIJ(int i);

    public abstract void LJIJI(Long l, String str);

    public abstract void LJIJJ(C1769140w8e c1769140w8e, AwS427S0200000_26 awS427S0200000_26, AwS392S0200000_26 awS392S0200000_26, AwS605S0100000_26 awS605S0100000_26);

    public abstract void LJIJJLI();

    public final BottomTabAbility LIZIZ() {
        MainActivityScope mainActivityScopeLIZLLL;
        if (!C297720Bli.LIZ()) {
            CustomDotAssem customDotAssem = this.LIZJ;
            if (customDotAssem == null || (mainActivityScopeLIZLLL = C0S4U.LIZLLL(customDotAssem)) == null) {
                return null;
            }
            return C1769510w9F.LIZ(mainActivityScopeLIZLLL);
        }
        CustomDotAssem customDotAssem2 = this.LIZJ;
        if (customDotAssem2 == null) {
            return null;
        }
        BottomTabAbility bottomTabAbility = customDotAssem2.LLILZIL;
        if (bottomTabAbility == null) {
            synchronized (customDotAssem2) {
                bottomTabAbility = customDotAssem2.LLILZIL;
                if (bottomTabAbility == null) {
                    C0QSJ c0qsjBo = customDotAssem2.bo();
                    BottomTabAbility bottomTabAbility2 = c0qsjBo != null ? (BottomTabAbility) c0qsjBo.getAbility(BottomTabAbility.class) : null;
                    customDotAssem2.LLILZIL = bottomTabAbility2;
                    return bottomTabAbility2;
                }
            }
        }
        return bottomTabAbility;
    }

    public final HomeTabAbility LIZJ() {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        if (!C296200BjG.LIZ()) {
            CustomDotAssem customDotAssem = this.LIZJ;
            if (customDotAssem == null || (interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(customDotAssem)) == null) {
                return null;
            }
            return (HomeTabAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, HomeTabAbility.class, null);
        }
        CustomDotAssem customDotAssem2 = this.LIZJ;
        if (customDotAssem2 == null) {
            return null;
        }
        HomeTabAbility homeTabAbility = customDotAssem2.LLILZLL;
        if (homeTabAbility == null) {
            synchronized (customDotAssem2) {
                homeTabAbility = customDotAssem2.LLILZLL;
                if (homeTabAbility == null) {
                    C0QSJ c0qsjBo = customDotAssem2.bo();
                    HomeTabAbility homeTabAbility2 = c0qsjBo != null ? (HomeTabAbility) c0qsjBo.getAbility(HomeTabAbility.class) : null;
                    customDotAssem2.LLILZLL = homeTabAbility2;
                    return homeTabAbility2;
                }
            }
        }
        return homeTabAbility;
    }
}
