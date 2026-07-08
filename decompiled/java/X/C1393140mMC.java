package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mMC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393140mMC {
    public static final boolean LIZ(EnumC1392960mLu enumC1392960mLu, View view) {
        int i;
        C11GO c11go;
        int i2 = C1393130mMB.LIZ[enumC1392960mLu.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        i = R.id.xfq;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    i = R.id.xfr;
                }
            } else {
                i = R.id.xfs;
            }
        } else {
            i = R.id.xft;
        }
        C127M accessory = ((C127K) view.findViewById(i)).getAccessory();
        if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
            return c11go.LJIILIIL();
        }
        return false;
    }

    public static final void LIZIZ(Context context, View view, EnumC1392960mLu enumC1392960mLu, boolean z, C1393110mM9 c1393110mM9, InterfaceC1631620sYq<? super C127A, ? super EnumC1392960mLu, ? super Boolean, Unit> interfaceC1631620sYq) {
        int i;
        int i2 = C1393130mMB.LIZ[enumC1392960mLu.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        i = R.id.xfq;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    i = R.id.xfr;
                }
            } else {
                i = R.id.xfs;
            }
        } else {
            i = R.id.xft;
        }
        C127K c127k = (C127K) view.findViewById(i);
        C127A c127a = new C127A(context);
        c127a.LJIILJJIL(z);
        c127a.LJIILLIIL(new C1401920maM(interfaceC1631620sYq, c127a, enumC1392960mLu, c1393110mM9, 1));
        c127k.setAccessory(c127a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public static final void LIZJ(Context context, final Fragment fragment, final User user, final EnumC1393020mM0 enumC1393020mM0, C1393160mME c1393160mME, final C1393110mM9 c1393110mM9) {
        String str;
        InterfaceC1393170mMF interfaceC1393170mMF;
        FragmentManager supportFragmentManager;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null) {
            return;
        }
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cag, null, false);
        C1610870s1N.LIZ.getClass();
        boolean zLIZLLL = C1610870s1N.LIZLLL();
        Integer numValueOf = Integer.valueOf(R.attr.zq);
        if (zLIZLLL) {
            View viewFindViewById = viewTd.findViewById(R.id.nfk);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = numValueOf;
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            viewFindViewById.setBackground(c384050F3z.LIZ(context));
            InterfaceC1631620sYq<C127A, EnumC1392960mLu, Boolean, Unit> interfaceC1631620sYq = c1393160mME.LJFF;
            LIZIZ(context, viewTd, EnumC1392960mLu.STORIES, c1393160mME.LIZJ, c1393110mM9, interfaceC1631620sYq);
            LIZIZ(context, viewTd, EnumC1392960mLu.POSTS, c1393160mME.LIZLLL, c1393110mM9, interfaceC1631620sYq);
            LIZIZ(context, viewTd, EnumC1392960mLu.LIVES, c1393160mME.LJ, c1393110mM9, interfaceC1631620sYq);
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        } else {
            View viewFindViewById2 = viewTd.findViewById(R.id.xfq);
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = numValueOf;
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            viewFindViewById2.setBackground(c384050F3z2.LIZ(context));
            LIZIZ(context, viewTd, EnumC1392960mLu.ALL, c1393160mME.LIZIZ, c1393110mM9, c1393160mME.LJFF);
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
        }
        C259800zU c259800zU = new C259800zU();
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = c1393160mME.LIZ;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LJIIIIZZ = C1383370m6R.LJIIJ(2131823353);
        c1251150ifB.LIZJ(new AwS565S0100000_21(c259800zU, (C259800zU<TuxSheet>) 1668));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = false;
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0mMD
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                String str2;
                InterfaceC1393170mMF interfaceC1393170mMF2;
                C1393110mM9 c1393110mM92 = c1393110mM9;
                C1610870s1N.LIZ.getClass();
                if (C1610870s1N.LIZLLL()) {
                    str2 = "split_3";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
                C1393110mM9 c1393110mM9LIZ = C1393110mM9.LIZ(c1393110mM92, false, "cancel", str2, 223);
                c1587170rP9.getClass();
                C1587170rP9.LJIIIZ(c1393110mM9LIZ);
                C128Y c128y = fragment;
                User user2 = user;
                View view = viewTd;
                EnumC1393020mM0 enumC1393020mM02 = enumC1393020mM0;
                if (c128y != null && user2 != null && view != null && enumC1393020mM02 == EnumC1393020mM0.LONG_PRESS) {
                    EnumC1392960mLu enumC1392960mLu = EnumC1392960mLu.STORIES;
                    boolean zLIZ = C1393140mMC.LIZ(enumC1392960mLu, view);
                    EnumC1392960mLu enumC1392960mLu2 = EnumC1392960mLu.POSTS;
                    boolean zLIZ2 = C1393140mMC.LIZ(enumC1392960mLu2, view);
                    EnumC1392960mLu enumC1392960mLu3 = EnumC1392960mLu.LIVES;
                    boolean zLIZ3 = C1393140mMC.LIZ(enumC1392960mLu3, view);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (zLIZ) {
                        linkedHashSet.add(enumC1392960mLu);
                    }
                    if (zLIZ2) {
                        linkedHashSet.add(enumC1392960mLu2);
                    }
                    if (zLIZ3) {
                        linkedHashSet.add(enumC1392960mLu3);
                    }
                    if ((c128y instanceof InterfaceC1393170mMF) && (interfaceC1393170mMF2 = (InterfaceC1393170mMF) c128y) != null) {
                        interfaceC1393170mMF2.gg(user2.getUid(), linkedHashSet);
                    }
                }
                C1440005kM.LIZ(new C453940Hr6(false, false, 6));
            }
        };
        c1390920mIc.LJIIIIZZ(0);
        c1390920mIc.LIZ.LLJJIII = viewTd;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, activityLIZ);
        ?? r2 = c1390920mIc.LIZ;
        r2.LLJI = numLIZJ;
        c259800zU.element = r2;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            ((DialogFragment) c259800zU.element).show(supportFragmentManager, "FriendsMuteSettings");
        }
        if (C1610870s1N.LIZLLL()) {
            str = "split_3";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
        C1393110mM9 c1393110mM9LIZ = C1393110mM9.LIZ(c1393110mM9, false, null, str, 255);
        c1587170rP9.getClass();
        C1587170rP9.LJIIIZ(c1393110mM9LIZ);
        if (fragment != 0 && enumC1393020mM0 == EnumC1393020mM0.LONG_PRESS && (fragment instanceof InterfaceC1393170mMF) && (interfaceC1393170mMF = (InterfaceC1393170mMF) fragment) != null) {
            interfaceC1393170mMF.l4();
        }
        C1440005kM.LIZ(new C453940Hr6(true, false, 6));
    }
}
