package X;

import Y.ARunnableS17S1100000_12;
import android.os.Looper;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.api.coin.incentive.ICoinIncentiveService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fPN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126030fPN {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final ConcurrentHashMap<String, Runnable> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelAnimDelay: tag ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("ComboViewHelperV2", C2188811AlT.LIZIZ(sbLIZ));
        ConcurrentHashMap<String, Runnable> concurrentHashMap = LIZIZ;
        Runnable runnable = concurrentHashMap.get(str);
        if (runnable != null) {
            LIZ.removeCallbacks(runnable);
            concurrentHashMap.remove(str);
        }
    }

    public static boolean LIZLLL(long j) {
        if (C1125800fP0.LJFF() || GiftManager.inst().canSendGiftFree() || j == 0) {
            return true;
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin()) {
            ((ICoinIncentiveService) C1161920gLG.LIZJ(ICoinIncentiveService.class)).qY1();
        }
        int targetGiftDiamondCount = GiftManager.inst().getTargetGiftDiamondCount(j);
        if (targetGiftDiamondCount <= 0) {
            return true;
        }
        return ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LIZJ(targetGiftDiamondCount);
    }

    public static void LIZIZ(String str, long j, Function0 function0, Function0 function02) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executeAnimDelay: start tag ");
        sbLIZ.append(str);
        sbLIZ.append(", delay ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("ComboViewHelperV2", C2188811AlT.LIZIZ(sbLIZ));
        if (function0 != null) {
            function0.invoke();
        }
        ConcurrentHashMap<String, Runnable> concurrentHashMap = LIZIZ;
        ARunnableS17S1100000_12 aRunnableS17S1100000_12 = new ARunnableS17S1100000_12(function02, str, 13);
        C786410Ut5.LJLIIL(j, LIZ, aRunnableS17S1100000_12);
        concurrentHashMap.put(str, aRunnableS17S1100000_12);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC1126060fPQ LIZJ(long r6, X.C1125860fP6 r8, java.lang.Long r9, boolean r10, com.bytedance.android.live.gift.GiftGalleryExtra r11, java.lang.Boolean r12, java.lang.String r13, X.C1123400fL8 r14) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1126030fPN.LIZJ(long, X.0fP6, java.lang.Long, boolean, com.bytedance.android.live.gift.GiftGalleryExtra, java.lang.Boolean, java.lang.String, X.0fL8):X.0fPQ");
    }
}
