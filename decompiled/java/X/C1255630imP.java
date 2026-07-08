package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0imP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255630imP implements InterfaceC1255580imK {
    @Override // X.InterfaceC1255580imK
    public final void LIZ(EnumC1255610imN enumC1255610imN) {
    }

    @Override // X.InterfaceC1255580imK
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1255580imK
    public final void LJII(Throwable th) {
    }

    @Override // X.InterfaceC1255580imK
    public final void LJFF() {
        C1253930ijf.LIZ.getClass();
        C1253930ijf.LJIILIIL(1, null);
    }

    @Override // X.InterfaceC1255580imK
    public final void LJI(Throwable th) {
        String strLIZIZ;
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        if (th instanceof C0XIR) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((C23112093u) th).getErrorCode());
            sbLIZ.append("");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "-1";
        }
        c1253930ijf.getClass();
        C1253930ijf.LJIILIIL(0, strLIZIZ);
    }

    @Override // X.InterfaceC1255580imK
    public final void LIZIZ(EnumC1255640imQ enumC1255640imQ, Object obj) {
        Context context;
        int i = C1255620imO.LIZ[enumC1255640imQ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new C1954807lC();
            }
        } else {
            if (obj instanceof Context) {
                context = (Context) obj;
            } else {
                context = null;
            }
            C810650Vr5.LIZ(context, "click_profile_avatar", "cancel");
        }
    }

    @Override // X.InterfaceC1255580imK
    public final void LIZLLL(EnumC1255610imN enumC1255610imN, boolean z) {
        if (z) {
            return;
        }
        int i = C1255620imO.LIZIZ[enumC1255610imN.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1253930ijf.LIZ.getClass();
                C1253930ijf.LJJ("bpea-profile_avatar_start_gallery");
                return;
            }
            throw new C1954807lC();
        }
        C1253930ijf.LIZ.getClass();
        C1253930ijf.LJJ("bpea-profile_avatar_take_photo");
    }

    @Override // X.InterfaceC1255580imK
    public final void LJ(EnumC1255610imN enumC1255610imN, HashMap<String, String> map) {
        int i = C1255620imO.LIZIZ[enumC1255610imN.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1232140iAW c1232140iAW = C1232140iAW.LIZ;
                if (map == null) {
                    map = new HashMap<>();
                }
                c1232140iAW.getClass();
                C1232140iAW.LJIIJ("click_upload_entrance", "click_edit_profile", map);
                return;
            }
            throw new C1954807lC();
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("type", "photo");
        map.put("enter_method", "click_icon");
        IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
        if (iRecordMobService == null) {
            return;
        }
        iRecordMobService.LIZLLL(new C1449410nox("", "profile_photo", "personal_homepage", null, null, null, null, null, 248), map);
    }
}
