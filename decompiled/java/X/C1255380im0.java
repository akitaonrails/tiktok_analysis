package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.profile.business.account.multiaccount.ChooseAccountBottomSheetFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0im0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255380im0 {
    public static void LIZ(FragmentManager fragmentManager, final C1255390im1 c1255390im1, String str, Bundle bundle, DialogInterface.OnDismissListener onDismissListener, final DialogInterface.OnCancelListener onCancelListener) {
        String str2;
        String str3;
        String string;
        int i = 0;
        if (ChooseAccountBottomSheetFragment.LLILZIL != null) {
            if (c1255390im1 != null) {
                str3 = c1255390im1.LIZIZ;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(str3, "push_landing") && bundle != null && (string = bundle.getString("switch_account_sec_uid")) != null) {
                ChooseAccountBottomSheetFragment chooseAccountBottomSheetFragment = ChooseAccountBottomSheetFragment.LLILZIL;
                if (chooseAccountBottomSheetFragment != null) {
                    C1255340ilw c1255340ilw = chooseAccountBottomSheetFragment.LL;
                    if (c1255340ilw == null) {
                        c1255340ilw = null;
                    }
                    for (Object obj : (ArrayList) c1255340ilw.LLILZIL) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            if (Intrinsics.LJFF(((SignificantUserInfo) obj).secUid, string)) {
                                c1255340ilw.LLILZLL = i;
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    int itemCount = c1255340ilw.getItemCount();
                    if (itemCount > 2) {
                        c1255340ilw.notifyItemRangeChanged(1, itemCount - 2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        final ChooseAccountBottomSheetFragment chooseAccountBottomSheetFragment2 = new ChooseAccountBottomSheetFragment();
        Bundle bundle2 = new Bundle();
        if (c1255390im1 != null) {
            C786410Ut5.LJJJI("enter_from", c1255390im1.LIZ, bundle2);
            C786410Ut5.LJJJI("enter_method", c1255390im1.LIZIZ, bundle2);
            C786410Ut5.LJJJI("channel", c1255390im1.LIZJ, bundle2);
            C786410Ut5.LJJJI("sdk_name", c1255390im1.LIZLLL, bundle2);
            C786410Ut5.LJJJI("sdk_version", c1255390im1.LJ, bundle2);
            C786410Ut5.LJJJI("enter_source", c1255390im1.LJI, bundle2);
            C786410Ut5.LJJJI("auth_app", c1255390im1.LJII, bundle2);
            C786410Ut5.LJJJI("pattern", c1255390im1.LJFF, bundle2);
        }
        if (bundle != null) {
            C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        }
        chooseAccountBottomSheetFragment2.setArguments(bundle2);
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        boolean zLJ = c19252910Tv.LIZLLL().LIZIZ().LJ(null);
        if (zLJ) {
            InterfaceC1246800iYA interfaceC1246800iYALIZIZ = c19252910Tv.LIZLLL().LIZIZ();
            if (c1255390im1 != null) {
                str2 = c1255390im1.LIZ;
            } else {
                str2 = null;
            }
            interfaceC1246800iYALIZIZ.LIZIZ("I18nMyProfileFragment", "ChooseAccountBottomSheetFragment", str2);
        }
        C1390920mIc c1390920mIc = new C1390920mIc(zLJ, C1389340mG4.LIZJ(null, null).LIZIZ);
        c1390920mIc.LIZ.LLJJIJI = chooseAccountBottomSheetFragment2;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        if (onDismissListener != null) {
            tuxSheet.LLILLJJLI = onDismissListener;
        }
        tuxSheet.LL = new DialogInterface.OnCancelListener() { // from class: X.0ilz
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                String str4;
                DialogInterface.OnCancelListener onCancelListener2 = onCancelListener;
                if (onCancelListener2 != null) {
                    onCancelListener2.onCancel(dialogInterface);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - chooseAccountBottomSheetFragment2.LLILLL;
                C2344009Gk c2344009Gk = new C2344009Gk();
                C1255390im1 c1255390im12 = c1255390im1;
                String str5 = null;
                if (c1255390im12 != null) {
                    str4 = c1255390im12.LIZ;
                } else {
                    str4 = null;
                }
                c2344009Gk.LJIIIIZZ("enter_from", str4);
                C1255390im1 c1255390im13 = c1255390im1;
                if (c1255390im13 != null) {
                    str5 = c1255390im13.LIZIZ;
                }
                c2344009Gk.LJIIIIZZ("enter_method", str5);
                c2344009Gk.LJIIIIZZ("action_type", "dismiss");
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                C20684815ws.LJIILLIIL("account_list_click", c2344009Gk.LIZ);
            }
        };
        tuxSheet.show(fragmentManager, str);
    }
}
