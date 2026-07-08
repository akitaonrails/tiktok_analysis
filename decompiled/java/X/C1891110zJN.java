package X;

import Y.ACListenerS130S0200000_28;
import Y.AfS182S0100000_13;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creatorcenter.InspirationSettingApi;
import kotlin.jvm.internal.AwS394S0200000_28;

/* JADX INFO: renamed from: X.0zJN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891110zJN {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.10dr, X.10i0] */
    public static void LIZ(C19318810i2 c19318810i2, Context context) {
        C1891120zJO.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inspiration_setting_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        C259800zU c259800zU = new C259800zU();
        ?? c19292910dr = new C19292910dr(new C19319810iC(repo.getBoolean("inspiration_setting_enable", true), context.getString(2131830123), new ACListenerS130S0200000_28(c259800zU, repo, 18), true, null, null, null, context.getString(2131830121), false, false, true, null, 113648));
        c259800zU.element = c19292910dr;
        c19318810i2.LIZ(c19292910dr);
        AwS394S0200000_28 awS394S0200000_28 = new AwS394S0200000_28(c259800zU, (C259800zU<C19292910dr>) repo, (Keva) 17);
        InspirationSettingApi.LIZ.getClass();
        C1891130zJP.LIZ().LIZ().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS182S0100000_13(awS394S0200000_28, 63), new C09JN() { // from class: X.00NY
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("InspirationSetting@a510.isCheck$2");
                C1C7U.LIZIZ("InspirationSetting@a510.isCheck$2");
            }
        });
    }
}
