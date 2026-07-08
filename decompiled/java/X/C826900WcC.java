package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0WcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826900WcC {
    public static final C826900WcC LIZ = new C826900WcC();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(C830490Whz c830490Whz) {
        int i;
        IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpiForReal(IAwemeImManager.class);
        if (iAwemeImManager != null && iAwemeImManager.getProxy() != null) {
            try {
                String str = (String) c830490Whz.get("success_cnt");
                if (str != null) {
                    i = CastIntegerProtector.parseInt(str);
                } else {
                    i = 0;
                }
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                    C793770VBv.LJIIJJI("aweme_im_message_error_rate", 0, null);
                    i = i2;
                }
                String str2 = (String) c830490Whz.get("fail_cnt");
                if (str2 != null) {
                    int i3 = CastIntegerProtector.parseInt(str2);
                    while (true) {
                        int i4 = i3 - 1;
                        if (i3 > 0) {
                            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList2 = C794240VDq.LIZ;
                            C793770VBv.LJIIJJI("aweme_im_message_error_rate", 1, null);
                            i3 = i4;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZ(e);
            }
        }
    }
}
