package X;

import Y.ARunnableS21S0400000_12;
import Y.AcS496S0100000_15;
import android.content.Context;
import android.os.Looper;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceOpenCameraEvent;
import com.tiktok.kmp.live.socialgamebusinessapi.service.ILiveDanceService;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aiU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945680aiU {
    public static final C945680aiU LIZ = new C945680aiU();

    public static boolean LIZ() {
        C947420alI c947420alILJII;
        C947590alZ c947590alZ;
        EnumC942260acy enumC942260acy;
        C949060anw c949060anwYo1;
        ILiveDanceService iLiveDanceService = (ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class);
        EnumC947440alK enumC947440alK = null;
        if (iLiveDanceService == null || (c949060anwYo1 = iLiveDanceService.Yo1()) == null) {
            c947420alILJII = null;
        } else {
            c947420alILJII = c949060anwYo1.LJII();
            if (c947420alILJII != null) {
                enumC947440alK = c947420alILJII.LIZJ;
            }
        }
        if (enumC947440alK != EnumC947440alK.PLAYING || c947420alILJII == null || (c947590alZ = c947420alILJII.LJIIIIZZ.get(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()))) == null || (enumC942260acy = c947590alZ.LIZJ) == null) {
            return false;
        }
        return enumC942260acy == EnumC942260acy.JOINED || enumC942260acy == EnumC942260acy.READY;
    }

    public static void LIZIZ(Function0 function0) {
        C19EG c19egLIZ;
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII != null) {
            c19egLIZ = C500260Jjc.LIZ(contextLJII);
        } else {
            c19egLIZ = null;
        }
        C782110Um9 c782110Um9 = new C782110Um9(c19egLIZ);
        c782110Um9.LJIIZILJ(2131854417);
        c782110Um9.LJII(2131854414);
        c782110Um9.LJIILL = false;
        c782110Um9.LJIILIIL(2131843701, new AcS496S0100000_15(function0, 55));
        c782110Um9.LJIIJ(2131843824, new InterfaceC743640TFa() { // from class: X.0aiY
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [X.0aiV, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, Y.ARunnableS21S0400000_12, java.lang.Runnable] */
    public static void LIZJ(final DataChannel dataChannel, int i, String str, String str2, final Function0 function0) {
        int i2;
        if (dataChannel == null) {
            return;
        }
        C945730aiZ.LIZ.getClass();
        C945730aiZ.LIZIZ(dataChannel, "show");
        final FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        if (fragmentManager == null) {
            return;
        }
        C1391960mKI c1391960mKI = new C1391960mKI();
        c1391960mKI.LJII = C497740JfY.LJIJI(2131854420);
        c1391960mKI.LJIIIIZZ = C497740JfY.LJIJI(2131854418);
        c1391960mKI.LIZ = false;
        final BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        C118300cf c118300cf = new C118300cf();
        if (i < 0) {
            i2 = 0;
        } else {
            i2 = i;
        }
        c118300cf.element = i2;
        final C259800zU c259800zU = new C259800zU();
        ?? r11 = new Runnable() { // from class: X.0aiV
            public final void LIZ() {
                Runnable runnable = c259800zU.element;
                if (runnable != null) {
                    bPEAHandler.removeCallbacks(runnable);
                }
                dataChannel.FQ2(MultiLetsDanceOpenCameraEvent.class);
                Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI("lets_dance_turn_on_camera");
                if (fragmentLJJJJZI instanceof DialogFragment) {
                    ((DialogFragment) fragmentLJJJJZI).dismissAllowingStateLoss();
                }
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
                C945730aiZ c945730aiZ = C945730aiZ.LIZ;
                DataChannel dataChannel2 = dataChannel;
                c945730aiZ.getClass();
                C945730aiZ.LIZIZ(dataChannel2, "auto_turn_on");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("action_type", "auto_turn_on_camera");
                C946950akX.LJIIIIZZ("camera_request_result", linkedHashMap);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LetsDanceDialogHelper@e61b.showTurnOnCameraPanel$autoTurnRunnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LetsDanceDialogHelper@e61b.showTurnOnCameraPanel$autoTurnRunnable$1");
            }
        };
        C1391990mKL c1391990mKL = new C1391990mKL();
        c1391990mKL.LIZ(C497740JfY.LJIJI(2131854419));
        c1391990mKL.LIZJ = new C945700aiW(str, str2, bPEAHandler, r11, c259800zU, dataChannel);
        C1391990mKL c1391990mKL2 = new C1391990mKL();
        c1391990mKL2.LIZ(C786410Ut5.j4(C497740JfY.LJIJI(2131854421), Arrays.copyOf(new Object[]{Integer.valueOf(c118300cf.element)}, 1)));
        c1391990mKL2.LIZJ = new C945710aiX(bPEAHandler, r11, c259800zU, dataChannel, function0);
        c1391960mKI.LJIIJJI = c1391990mKL2;
        c1391960mKI.LJIILIIL = c1391990mKL;
        c1391960mKI.LIZ().LIZ.show(fragmentManager, "lets_dance_turn_on_camera");
        ?? aRunnableS21S0400000_12 = new ARunnableS21S0400000_12(c118300cf, c1391990mKL2, c259800zU, bPEAHandler, 6);
        c259800zU.element = aRunnableS21S0400000_12;
        C786410Ut5.LJLIIL(1000L, bPEAHandler, aRunnableS21S0400000_12);
        C786410Ut5.LJLIIL(i * LSPassThroughRecordSizeConfig.DEFAULT, bPEAHandler, r11);
    }
}
