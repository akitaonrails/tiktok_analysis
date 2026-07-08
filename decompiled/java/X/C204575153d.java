package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.debug.ui.MinisDebugSettingFragment;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.153d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204575153d {
    public static TuxSheet LIZ;
    public static MinisDebugSettingFragment LIZIZ;

    public static boolean LIZJ() {
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if ((schemaParserData != null ? schemaParserData.minisStage : null) != EnumC2192711Arl.MINIS_STAGE_NATIVE_DEBUG) {
            MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
            if (minisMetaResp == null) {
                return false;
            }
            Integer num = minisMetaResp.clientKeyType;
            int iOrdinal = EnumC1154300g8y.CLIENT_KEY_TYPE_SANDBOX.ordinal();
            if (num == null || num.intValue() != iOrdinal) {
                return false;
            }
        }
        return true;
    }

    public static int LJ() {
        EnumC2192711Arl enumC2192711Arl;
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData == null || (enumC2192711Arl = schemaParserData.minisStage) == null) {
            enumC2192711Arl = EnumC2192711Arl.MINIS_STAGE_PROD;
        }
        if (enumC2192711Arl == EnumC2192711Arl.MINIS_STAGE_NATIVE_DEBUG) {
            enumC2192711Arl = EnumC2192711Arl.MINIS_STAGE_DEBUG;
        }
        return enumC2192711Arl.ordinal();
    }

    public static boolean LIZ() {
        if (!LIZJ()) {
            return false;
        }
        C2197011Ayh.LIZ.getClass();
        return C2197011Ayh.LJ().optBoolean("IS_NATIVE_GAME_DEBUG_ENABLE_IAA_MOCK", false);
    }

    public static boolean LIZIZ() {
        if (!LIZJ()) {
            return false;
        }
        C2197011Ayh.LIZ.getClass();
        return C2197011Ayh.LJ().optBoolean("IS_NATIVE_GAME_DEBUG_ENABLE_IAP_MOCK", false);
    }

    public static boolean LIZLLL() {
        if (!LIZJ()) {
            return false;
        }
        C2197011Ayh.LIZ.getClass();
        return C2197011Ayh.LJ().optBoolean("IS_NATIVE_GAME_DEBUG_ENABLE_SUBSCRIPTION_MOCK", false);
    }

    public static void LJFF(C19EG c19eg, InterfaceC204573153b interfaceC204573153b) {
        TuxSheet tuxSheet;
        FragmentManager supportFragmentManager;
        MinisDebugSettingFragment minisDebugSettingFragment;
        new WeakReference(interfaceC204573153b);
        MinisDebugSettingFragment minisDebugSettingFragment2 = new MinisDebugSettingFragment();
        LIZIZ = minisDebugSettingFragment2;
        minisDebugSettingFragment2.LL = new C204574153c(interfaceC204573153b);
        C19EG c19egLIZ = C1507205vC.LIZ(c19eg);
        if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null && (minisDebugSettingFragment = LIZIZ) != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(1);
            tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = minisDebugSettingFragment;
            tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.153e
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C204575153d.LIZ = null;
                    int i = C2187451AjH.LIZ;
                }
            };
            tuxSheet.show(supportFragmentManager, "minis-MinisDebugSettingController");
        } else {
            tuxSheet = null;
        }
        LIZ = tuxSheet;
    }
}
