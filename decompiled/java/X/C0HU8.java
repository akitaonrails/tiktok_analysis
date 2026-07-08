package X;

import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.common.ui.markdown.style.LinkUnderLineSpan;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HU8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HU8 {
    public static String LJ;
    public final View LIZ;
    public final TakoCardAbility LIZIZ;
    public final C433870Gzp LIZJ = new InterfaceC426480Gnu() { // from class: X.0Gzp
        @Override // X.InterfaceC426480Gnu
        public final void LIZ(LinkUnderLineSpan linkUnderLineSpan, CharSequence charSequence, Map map) {
            TakoCardAbility takoCardAbility = this.LIZ.LIZIZ;
            if (takoCardAbility != null) {
                takoCardAbility.mu2(linkUnderLineSpan, charSequence, map);
            }
        }
    };
    public final C0HUB LIZLLL = new InterfaceC418240Gac() { // from class: X.0HUB
        @Override // X.InterfaceC418240Gac
        public final void LIZ(List list) {
            TakoCardAbility takoCardAbility;
            C0HU8 c0hu8 = this.LIZ;
            View view = c0hu8.LIZ;
            if (view != null && (takoCardAbility = c0hu8.LIZIZ) != null) {
                takoCardAbility.Kk(view, list, "click_superscript", "reply");
            }
        }

        @Override // X.InterfaceC418240Gac
        public final void LIZIZ(InterfaceC418250Gad interfaceC418250Gad, CharSequence charSequence, Map<String, ? extends Object> map) {
            TakoCardAbility takoCardAbility = this.LIZ.LIZIZ;
            if (takoCardAbility != null) {
                takoCardAbility.Gh0();
            }
        }

        @Override // X.InterfaceC418240Gac
        public final void LIZJ(InterfaceC418250Gad interfaceC418250Gad, CharSequence charSequence, Map<String, ? extends Object> map) {
            TakoCardAbility takoCardAbility = this.LIZ.LIZIZ;
            if (takoCardAbility != null) {
                takoCardAbility.ZA2(interfaceC418250Gad, charSequence, map);
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Gzp] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0HUB] */
    public C0HU8(C14J2 c14j2, TakoCardAbility takoCardAbility) {
        this.LIZ = c14j2;
        this.LIZIZ = takoCardAbility;
    }

    public final void LIZ(C14J2 c14j2, C0HUA c0hua) {
        Integer numValueOf;
        int i;
        List<C433010GyR> listLIZIZ = C433000GyQ.LIZIZ(c0hua.LL);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        int i2 = 0;
        for (C433010GyR c433010GyR : listLIZIZ) {
            String str = c433010GyR.LIZ;
            boolean z = c433010GyR.LIZIZ;
            if (z) {
                i = i2 + 1;
                numValueOf = Integer.valueOf(i2);
            } else {
                numValueOf = null;
                i = i2;
            }
            arrayList.add(new C1889607ag(numValueOf, str, z));
            i2 = i;
        }
        C1857690yRT.LIZIZ(c14j2, arrayList.size(), new C0HSN(this));
        LIZIZ(c14j2, arrayList, this.LIZIZ, false);
    }

    public final void LIZIZ(C14J2 c14j2, List list, TakoCardAbility takoCardAbility, boolean z) {
        String str;
        CharSequence c444910HcX;
        boolean z2;
        Spannable spannableLIZ;
        int iLIZIZ;
        Message messageYy1;
        String str2;
        Message messageYy12;
        Message messageYy13;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZIZ2;
        C08QT c08qt = new C08QT(C09RB.LJIIJJI(new C08LY(new C09RD(c14j2), AFwS236S0000000_6.get$arr$(523))));
        int i = 0;
        while (c08qt.hasNext()) {
            Object next = c08qt.next();
            int i2 = i + 1;
            if (i >= 0) {
                C1858620ySy c1858620ySy = (C1858620ySy) next;
                c1858620ySy.setMovementMethod(C430980GvA.LIZ);
                c1858620ySy.setClickable(false);
                c1858620ySy.setLongClickable(false);
                ViewGroup.LayoutParams layoutParams = c1858620ySy.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    if (i == 0) {
                        iLIZIZ2 = 0;
                    } else {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    }
                    marginLayoutParams.topMargin = iLIZIZ2;
                }
                C1889607ag c1889607ag = (C1889607ag) C1856050yOp.LIZ(i, list);
                if (c1889607ag != null) {
                    if (takoCardAbility != null && (messageYy13 = takoCardAbility.Yy1()) != null) {
                        str = messageYy13.uuid;
                    } else {
                        str = null;
                    }
                    if (!Intrinsics.LJFF(str, LJ)) {
                        c1858620ySy.setText(c1889607ag.LL);
                        if (takoCardAbility != null && (messageYy12 = takoCardAbility.Yy1()) != null) {
                            str2 = messageYy12.uuid;
                        } else {
                            str2 = null;
                        }
                        LJ = str2;
                    }
                    if (z) {
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0HU9(c1889607ag, c1858620ySy, this, takoCardAbility, null), 3);
                    } else {
                        try {
                            String strLIZIZ = c1889607ag.LL;
                            C0HUB c0hub = this.LIZLLL;
                            C433870Gzp c433870Gzp = this.LIZJ;
                            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("rank", c1889607ag.LLILLL));
                            if (takoCardAbility != null && (messageYy1 = takoCardAbility.Yy1()) != null && C1858670yT3.LJIILIIL(messageYy1)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                strLIZIZ = C1859900yV2.LIZIZ.LIZIZ(strLIZIZ);
                            }
                            try {
                                spannableLIZ = new C2273481Dyk(strLIZIZ, new C426450Gnr(c1858620ySy, c0hub, c433870Gzp, mapLIZJ, z2)).LIZ();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        if (spannableLIZ != null) {
                            if (c1889607ag.LLILLJJLI) {
                                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                            } else {
                                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                            }
                            c1858620ySy.setPadding(0, 0, 0, iLIZIZ);
                            c444910HcX = new C444910HcX(spannableLIZ);
                        } else {
                            c444910HcX = c1889607ag.LL;
                        }
                        c1858620ySy.setText(c444910HcX);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
