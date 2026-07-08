package X;

import android.content.Context;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HOD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HOD implements InterfaceC440230HOb<List<? extends C440440HOw>> {
    public final C05YD<C0HOM<? extends List<C440440HOw>>> LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(271));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(272));

    @Override // X.InterfaceC440230HOb
    public final Integer LIZ() {
        return null;
    }

    @Override // X.InterfaceC440230HOb
    public final void LJ() {
    }

    @Override // X.InterfaceC440230HOb
    public final int LIZIZ() {
        C440440HOw c440440HOw;
        C0HOM<? extends List<C440440HOw>> value = this.LIZ.getValue();
        if ((value instanceof C1372405Ys) && (c440440HOw = (C440440HOw) C13LP.LJJJLL((List) ((C1372405Ys) value).LIZIZ)) != null) {
            return c440440HOw.LJ;
        }
        return 0;
    }

    @Override // X.InterfaceC440230HOb
    public final Integer LIZJ() {
        C0HOM<? extends List<C440440HOw>> value = this.LIZ.getValue();
        if (value instanceof C1372405Ys) {
            return Integer.valueOf(((List) ((C1372405Ys) value).LIZIZ).size());
        }
        return 1;
    }

    @Override // X.InterfaceC440230HOb
    public final String LIZLLL() {
        C0HOF c0hof = C0HOE.Companion;
        C0HOM<? extends List<C440440HOw>> value = this.LIZ.getValue();
        String str = (String) this.LIZIZ.getValue();
        c0hof.getClass();
        C0HOE c0hoeLIZ = C0HOF.LIZ(value, str);
        if (c0hoeLIZ != null) {
            return c0hoeLIZ.getParam();
        }
        return null;
    }

    @Override // X.InterfaceC440230HOb
    public final C05YD<C0HOM<? extends List<? extends C440440HOw>>> getState() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0HOD(C05YD<? extends C0HOM<? extends List<C440440HOw>>> c05yd) {
        this.LIZ = c05yd;
    }

    @Override // X.InterfaceC440230HOb
    public final void LJFF(Context context, boolean z) {
        EnumC437540HDs enumC437540HDs;
        String str;
        if (this.LIZ.getValue() instanceof C05Z7) {
            enumC437540HDs = EnumC437540HDs.START_REGENERATE;
            str = "imagine_studio_upgrade_image";
        } else {
            enumC437540HDs = EnumC437540HDs.IDLE;
            str = "imagine_studio";
        }
        ISocialAvatarService iSocialAvatarService = (ISocialAvatarService) this.LIZJ.getValue();
        if (iSocialAvatarService != null) {
            iSocialAvatarService.LJIILLIIL(new C0HHA(context, "click_imagine_studio_generate", str, null, null, 0, false, z, null, true, null, 2808), enumC437540HDs, null);
        }
    }
}
