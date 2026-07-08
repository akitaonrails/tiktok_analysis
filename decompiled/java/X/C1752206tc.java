package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.dynamic.card.api.DynamicCardService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.impl.sharetouser.ShareToUserSheet;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import okio.ByteString;

/* JADX INFO: renamed from: X.06tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1752206tc {
    public static void LIZ(String str, Context context, String str2, final String str3, final Bundle bundle, final Function1 function1) {
        final FragmentManager supportFragmentManager;
        try {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                final ShareToUserSheet shareToUserSheet = new ShareToUserSheet();
                final ByteString byteStringLIZJ = C1496910p3Z.LIZJ(ByteString.Companion, Base64.decode(str2, 0));
                IMContactApi.LIZ.getClass();
                C069P.LIZ().LJ().LIZJ(new InterfaceC1480505qt() { // from class: X.06tb
                    @Override // X.InterfaceC1480505qt
                    public final void LIZ(Throwable th) {
                    }

                    @Override // X.InterfaceC1480505qt
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1480505qt
                    public final void LIZIZ(IMUser iMUser) {
                        Pair<Integer, Integer> pair;
                        ShareToUserSheet shareToUserSheet2 = shareToUserSheet;
                        ByteString byteString = byteStringLIZJ;
                        String str4 = str3;
                        Bundle bundle2 = bundle;
                        shareToUserSheet2.LLIZLLLIL = iMUser;
                        shareToUserSheet2.LLJ = byteString;
                        shareToUserSheet2.LLJI = str4;
                        shareToUserSheet2.LLJIJIL = bundle2;
                        DynamicCardService dynamicCardService = (DynamicCardService) PluggableExtentionKt.pluggableSpi$default(DynamicCardService.class, false, false, false, 14, null);
                        if (dynamicCardService == null || (pair = dynamicCardService.LJ(byteString)) == null) {
                            pair = new Pair<>(0, 0);
                        }
                        int iIntValue = pair.getFirst().intValue();
                        int iIntValue2 = pair.getSecond().intValue();
                        shareToUserSheet2.LLJILJIL = (int) (iIntValue * 0.7f);
                        shareToUserSheet2.LLJILJILJ = (int) (iIntValue2 * 0.7f);
                        shareToUserSheet2.LLJILLL = C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1752406te(byteString, iMUser, shareToUserSheet2, null), 3);
                        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                        c1390920mIc.LIZ.LLJJIJI = shareToUserSheet;
                        c1390920mIc.LJIIIIZZ(4);
                        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
                        c1390920mIc.LJI(53);
                        DialogInterfaceOnDismissListenerC1767806w8 dialogInterfaceOnDismissListenerC1767806w8 = new DialogInterfaceOnDismissListenerC1767806w8(function1, 2);
                        TuxSheet tuxSheet = c1390920mIc.LIZ;
                        tuxSheet.LLILLJJLI = dialogInterfaceOnDismissListenerC1767806w8;
                        shareToUserSheet.LLJJI = tuxSheet;
                        tuxSheet.show(supportFragmentManager, (String) null);
                    }
                }, str, null, "im_share", false);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            function1.invoke(Boolean.FALSE);
        }
    }
}
