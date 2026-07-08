package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0xc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825800xc2 extends AbstractC1826160xcc<AbstractC1826120xcY, AbstractC991520buQ<? extends Unit>> {
    public final Context LIZ;
    public final InterfaceC1826050xcR LIZIZ;

    public final AbstractC991520buQ<Unit> LIZ(C1825880xcA c1825880xcA) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        PcsDialogAbility pcsDialogAbility;
        InterfaceC665370Q7z interfaceC665370Q7z = c1825880xcA.LIZIZ;
        C1822330xWR c1822330xWR = null;
        if (interfaceC665370Q7z != null && (pcsDialogAbility = (PcsDialogAbility) C1558520qew.LIZ(interfaceC665370Q7z, PcsDialogAbility.class, null)) != null) {
            pcsDialogAbility.cj0();
        }
        if (c1825880xcA.LIZ.LLIZ.length() == 0) {
            return new C991530buR(new IllegalArgumentException("DM schema is empty"), "Cannot send DM without schema");
        }
        Context context = this.LIZ;
        if (context != null) {
            this.LIZIZ.LIZIZ(context, c1825880xcA.LIZ.LLIZ, null, C2097608Jq.LJ(), null);
            InterfaceC665370Q7z interfaceC665370Q7z2 = c1825880xcA.LIZIZ;
            if (interfaceC665370Q7z2 != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z2, "source_default_key", C1822330xWR.class, null)) != null) {
                c1822330xWR = (C1822330xWR) interfaceC1555100qZQLIZIZ.getSource();
            }
            C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_service_bio_dm_click_count_live_session");
            C1822730xX5.LJ(EnumC1123040fKY.DM, c1822330xWR);
            C1822730xX5.LIZIZ(new C1822950xXR("click", "dm_header", null, "", null, null, EnumC1420700n4e.FEATURE_LIST, c1822330xWR, 52));
        }
        return new C991510buP(Unit.LIZ);
    }

    public final AbstractC991520buQ<Unit> LIZIZ(C1825930xcF c1825930xcF) throws JSONException {
        if (c1825930xcF.LIZ.LLILZ.length() == 0) {
            return new C991530buR(new IllegalArgumentException("Email address is empty"), "Cannot send email without address");
        }
        Context context = this.LIZ;
        if (context != null) {
            C1749450vct c1749450vct = C1749450vct.LIZ;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("text", c1825930xcF.LIZ.LLILZ), new Pair("toast", C497740JfY.LJIJI(2131856028)));
            EnumC1749470vcv enumC1749470vcv = EnumC1749470vcv.DEFAULT;
            Map mapLJ = C2097608Jq.LJ();
            c1749450vct.getClass();
            C1749450vct.LIZIZ(context, mapLJIIJ, enumC1749470vcv, mapLJ);
        }
        C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_service_bio_email_click_count_live_session");
        return new C991510buP(Unit.LIZ);
    }

    public final AbstractC991520buQ<Unit> LIZJ(C1825940xcG c1825940xcG) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        if (c1825940xcG.LIZ.LLILZIL.length() == 0) {
            return new C991530buR(new IllegalArgumentException("Phone number is empty"), "Cannot call without phone number");
        }
        Context context = this.LIZ;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LIZ.LLJJIJI = C497740JfY.LJIJI(2131855965);
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZ = c1825940xcG.LIZ.LLILZIL;
            c1247510iZJ.LIZ(new C1825860xc8(this, c1825940xcG));
            c1390850mIV.LIZIZ(c1247510iZJ);
            c1390850mIV.LIZLLL(2131855843);
            c1390850mIV.LIZJ().show(supportFragmentManager, "ProfileContactPhoneActionSheet");
        }
        C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_service_bio_phone_click_count_live_session");
        return new C991510buP(Unit.LIZ);
    }

    public final void LIZLLL(AbstractC1826120xcY abstractC1826120xcY) {
        try {
            if (abstractC1826120xcY instanceof C1825940xcG) {
                LIZJ((C1825940xcG) abstractC1826120xcY);
            } else if (abstractC1826120xcY instanceof C1825930xcF) {
                LIZIZ((C1825930xcF) abstractC1826120xcY);
            } else {
                if (abstractC1826120xcY instanceof C1825880xcA) {
                    LIZ((C1825880xcA) abstractC1826120xcY);
                    return;
                }
                throw new C1954807lC();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            new C991530buR(e, "Failed to launch contact action");
        }
    }

    public C1825800xc2(Context context, C490610JLv c490610JLv) {
        this.LIZ = context;
        this.LIZIZ = c490610JLv;
    }
}
