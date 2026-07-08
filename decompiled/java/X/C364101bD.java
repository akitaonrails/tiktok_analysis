package X;

import com.ss.android.ugc.ur.socialavatar.SocialAvatarImageAssetCDNConfigSettings;
import java.io.File;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01bD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl$fetchGeckoImageResource$1$2", f = "SocialAvatarServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C364101bD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1533790q13 LL;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, C364901bL, String, Unit> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C364101bD(C1533790q13 c1533790q13, InterfaceC1631620sYq<? super Boolean, ? super C364901bL, ? super String, Unit> interfaceC1631620sYq, String str, InterfaceC1364105Vn<? super C364101bD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1533790q13;
        this.LLILLJJLI = interfaceC1631620sYq;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C364101bD(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1533810q15 c1533810q15;
        File fileLJIIJ;
        C1C7U.LIZ("SocialAvatarServiceImpl@45de.fetchGeckoImageResource$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1533790q13 c1533790q13 = this.LL;
        if (c1533790q13 != null && c1533790q13.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (c1533790q13 != null) {
                fileLJIIJ = C1533790q13.LJIIJ(c1533790q13);
            } else {
                fileLJIIJ = null;
            }
            InterfaceC1631620sYq<Boolean, C364901bL, String, Unit> interfaceC1631620sYq = this.LLILLJJLI;
            if (interfaceC1631620sYq != null) {
                interfaceC1631620sYq.invoke(true, new C364901bL(fileLJIIJ, null, 2), null);
            }
        } else {
            DecimalFormat decimalFormat = SocialAvatarImageAssetCDNConfigSettings.LIZ;
            String strLIZ = SocialAvatarImageAssetCDNConfigSettings.LIZ(this.LLILLL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ISocialAvatarService fetchGeckoImageResource get gecko resources fails as ");
            C1533790q13 c1533790q132 = this.LL;
            if (c1533790q132 != null) {
                c1533810q15 = c1533790q132.LIZLLL;
            } else {
                c1533810q15 = null;
            }
            sbLIZ.append(c1533810q15);
            sbLIZ.append(", now try fetching CDN imageCDNUrl as ");
            sbLIZ.append(strLIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZ != null) {
                InterfaceC1631620sYq<Boolean, C364901bL, String, Unit> interfaceC1631620sYq2 = this.LLILLJJLI;
                if (interfaceC1631620sYq2 != null) {
                    interfaceC1631620sYq2.invoke(true, new C364901bL(null, strLIZ, 1), null);
                }
            } else {
                InterfaceC1631620sYq<Boolean, C364901bL, String, Unit> interfaceC1631620sYq3 = this.LLILLJJLI;
                if (interfaceC1631620sYq3 != null) {
                    interfaceC1631620sYq3.invoke(false, null, "Force fetch CDN Resource fails");
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarServiceImpl@45de.fetchGeckoImageResource$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
