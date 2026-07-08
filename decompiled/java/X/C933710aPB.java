package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aPB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933710aPB {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        List<LinkUser> listLJJJJ;
        InterfaceC954180awC interfaceC954180awCUU1 = C915980Zwa.LJIIIIZZ().UU1();
        if (interfaceC954180awCUU1 == null || (listLJJJJ = interfaceC954180awCUU1.LJJJJ()) == null) {
            return false;
        }
        Iterator<LinkUser> it2 = listLJJJJ.iterator();
        while (it2.hasNext()) {
            LinkUser next = it2.next();
            Long l = next.userId;
            long jLJFF = C950220apo.LJFF();
            if (l != null && l.longValue() == jLJFF) {
                return next != null;
            }
        }
        return false;
    }

    public static boolean LIZLLL() {
        List<LinkUser> listLJJJI;
        InterfaceC954180awC interfaceC954180awCUU1 = C915980Zwa.LJIIIIZZ().UU1();
        if (interfaceC954180awCUU1 == null || (listLJJJI = interfaceC954180awCUU1.LJJJI()) == null) {
            return false;
        }
        Iterator<LinkUser> it2 = listLJJJI.iterator();
        while (it2.hasNext()) {
            LinkUser next = it2.next();
            Long l = next.userId;
            long jLJFF = C950220apo.LJFF();
            if (l != null && l.longValue() == jLJFF) {
                return next != null;
            }
        }
        return false;
    }

    public static void LIZIZ(TextView textView) {
        try {
            C21382118m3.LIZJ(textView, 1);
            C21382118m3.LIZIZ(textView, 10, 13, 1, 1);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static int LJ(PosIdentity posIdentity) {
        Integer numLJIIJJI;
        if (posIdentity != null) {
            try {
                String str = posIdentity.value;
                if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
                    return numLJIIJJI.intValue();
                }
                return Integer.MAX_VALUE;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return Integer.MAX_VALUE;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void LIZ(View view, C957020b0m c957020b0m) {
        C19ME c19me;
        int iLIZ;
        int iLIZ2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            int width = c957020b0m.getWidth();
            if (width > C439101nJ.LIZ(78)) {
                ((ViewGroup.MarginLayoutParams) c19me).width = C439101nJ.LIZ(66);
                ((ViewGroup.MarginLayoutParams) c19me).height = C439101nJ.LIZ(20);
            } else if (width > C439101nJ.LIZ(70)) {
                ((ViewGroup.MarginLayoutParams) c19me).width = C439101nJ.LIZ(58);
                ((ViewGroup.MarginLayoutParams) c19me).height = C439101nJ.LIZ(20);
            } else {
                c19me.matchConstraintMaxWidth = 0;
                ((ViewGroup.MarginLayoutParams) c19me).width = -2;
                ((ViewGroup.MarginLayoutParams) c19me).height = -2;
            }
            if (width >= C439101nJ.LIZ(85)) {
                iLIZ = C439101nJ.LIZ(8);
            } else if (width >= C439101nJ.LIZ(56)) {
                iLIZ = C439101nJ.LIZ(6);
            } else {
                iLIZ = C439101nJ.LIZ(4);
            }
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = iLIZ;
            C786410Ut5.W5(view, c19me);
            if (view.getWidth() >= C439101nJ.LIZ(93)) {
                iLIZ2 = C439101nJ.LIZ(12);
            } else if (view.getWidth() >= C439101nJ.LIZ(85)) {
                iLIZ2 = C439101nJ.LIZ(10);
            } else {
                iLIZ2 = C439101nJ.LIZ(8);
            }
            view.setPadding(iLIZ2, C439101nJ.LIZ(2), iLIZ2, C439101nJ.LIZ(2));
        }
    }
}
