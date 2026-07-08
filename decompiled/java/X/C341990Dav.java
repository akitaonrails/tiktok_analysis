package X;

import Y.ARunnableS37S0300000_4;
import android.content.Context;
import android.text.BidiFormatter;
import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.pov.ISearchPovMarkdownAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS73S1300000_4;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Dav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341990Dav {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6002));

    public static InterfaceC342000Daw LIZIZ(C1860130yVP c1860130yVP, C21419418s4 c21419418s4, String str) {
        String strLIZ;
        StringBuilder sbLIZ;
        if (c21419418s4.LJJJJL && ((Number) C079H.LIZ.getValue()).intValue() == 0 && !BidiFormatter.getInstance().isRtl(str)) {
            try {
                MatchResult matchResultFind$default = Regex.find$default((Regex) LIZ.getValue(), str, 0, 2, null);
                if (matchResultFind$default != null && matchResultFind$default.LIZIZ().LL == 0) {
                    String str2 = matchResultFind$default.LIZ().get(1);
                    String str3 = matchResultFind$default.LIZ().get(2);
                    String str4 = matchResultFind$default.LIZ().get(3);
                    String strSubstring = str.substring(matchResultFind$default.LIZIZ().LLILLJJLI + 1);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str2);
                    sbLIZ2.append("\u2066");
                    sbLIZ2.append(str3);
                    sbLIZ2.append(str4);
                    sbLIZ2.append(strSubstring);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    if (u.LJIIZILJ(strLIZIZ, "\n", false)) {
                        sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(C13LN.LJLL(1, strLIZIZ));
                        sbLIZ.append("\u2069");
                        sbLIZ.append('\n');
                    } else {
                        sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append("\u2069");
                    }
                    str = C2188811AlT.LIZIZ(sbLIZ);
                } else if (u.LJIIZILJ(str, "\n", false)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("\u2066");
                    sbLIZ3.append(C13LN.LJLL(1, str));
                    sbLIZ3.append("\u2069");
                    sbLIZ3.append('\n');
                    str = C2188811AlT.LIZIZ(sbLIZ3);
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("\u2066");
                    sbLIZ4.append(str);
                    sbLIZ4.append("\u2069");
                    str = C2188811AlT.LIZIZ(sbLIZ4);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (c21419418s4.LJJIJIL && (strLIZ = C1529010ptL.LIZ(str)) != null) {
            str = strLIZ;
        }
        InterfaceC328690CuZ.LIZ.getClass();
        InterfaceC328690CuZ interfaceC328690CuZLIZ = C330610Cxf.LIZ();
        if (interfaceC328690CuZLIZ == null) {
            return null;
        }
        return interfaceC328690CuZLIZ.LIZIZ(c1860130yVP, str, c21419418s4, null);
    }

    public static void LIZ(C1860130yVP c1860130yVP, Context context, int i, int i2, ISearchPovMarkdownAbility iSearchPovMarkdownAbility, int i3) {
        int iIntValue;
        Integer numMt;
        if ((i3 & 2) != 0) {
            i = 41;
        }
        if ((i3 & 4) != 0) {
            i2 = R.attr.a1i;
        }
        if ((i3 & 8) != 0) {
            iSearchPovMarkdownAbility = null;
        }
        C21432318u9 c21432318u9 = C21432318u9.LIZ;
        if (C21432318u9.LIZIZ) {
            c21432318u9.getClass();
        } else {
            c21432318u9.getClass();
            C21432318u9.LIZIZ(context);
        }
        C444890HcV c444890HcV = new C444890HcV();
        if (iSearchPovMarkdownAbility != null && (numMt = iSearchPovMarkdownAbility.Mt()) != null) {
            i = numMt.intValue();
        }
        c444890HcV.LIZ(i);
        c1860130yVP.getPaint().setTextSize(c444890HcV.getTextSize());
        c1860130yVP.getPaint().setTypeface(c444890HcV.getTypeface());
        Integer numLIZJ = C1308910kAL.LIZJ(i2, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c1860130yVP.setTextColor(iIntValue);
    }

    public static void LIZJ(final C1860130yVP c1860130yVP, InterfaceC342000Daw interfaceC342000Daw, final InterfaceC328600CuQ interfaceC328600CuQ, InterfaceC328600CuQ interfaceC328600CuQ2, C0R20 c0r20, final InterfaceC328580CuO interfaceC328580CuO, C0GV2 c0gv2, C0GV3 c0gv3) {
        interfaceC342000Daw.LIZIZ(c1860130yVP, new InterfaceC328600CuQ() { // from class: X.0CuS
            @Override // X.InterfaceC328600CuQ
            public final void LIZ(View view, InterfaceC431020GvE interfaceC431020GvE, CharSequence charSequence, CharSequence charSequence2) {
                c1860130yVP.LLJJIJIIJIL = true;
                InterfaceC328600CuQ interfaceC328600CuQ3 = interfaceC328600CuQ;
                if (interfaceC328600CuQ3 != null) {
                    interfaceC328600CuQ3.LIZ(view, interfaceC431020GvE, charSequence, null);
                }
            }

            @Override // X.InterfaceC328600CuQ
            public final void LIZIZ(View view, InterfaceC431020GvE interfaceC431020GvE, List<? extends CharSequence> list, Map<String, ? extends Object> map) {
                c1860130yVP.LLJJIJIIJIL = true;
                InterfaceC328600CuQ interfaceC328600CuQ3 = interfaceC328600CuQ;
                if (interfaceC328600CuQ3 != null) {
                    interfaceC328600CuQ3.LIZIZ(view, interfaceC431020GvE, list, map);
                }
            }
        });
        interfaceC342000Daw.LJ(interfaceC328600CuQ2, c0r20);
        interfaceC342000Daw.LJII(c1860130yVP, new InterfaceC328580CuO() { // from class: X.0CuT
            @Override // X.InterfaceC328580CuO
            public final void LIZ(InterfaceC342000Daw interfaceC342000Daw2, View view, C1860910yWf c1860910yWf) {
                c1860130yVP.LLJJIJIIJIL = true;
                InterfaceC328580CuO interfaceC328580CuO2 = interfaceC328580CuO;
                if (interfaceC328580CuO2 != null) {
                    interfaceC328580CuO2.LIZ(interfaceC342000Daw2, view, c1860910yWf);
                }
            }
        });
        interfaceC342000Daw.LIZ(c0gv2);
        interfaceC342000Daw.LIZJ(c0gv3);
        c1860130yVP.LJJJJJ(interfaceC342000Daw, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(C1860130yVP c1860130yVP, String str, C21419418s4 c21419418s4, InterfaceC328600CuQ interfaceC328600CuQ, InterfaceC328600CuQ interfaceC328600CuQ2, C0R20 c0r20, InterfaceC328580CuO interfaceC328580CuO, C0GV2 c0gv2, C0GV3 c0gv3, C1263404wy c1263404wy, boolean z, AwS589S0100000_10 awS589S0100000_10, Function1 function1, int i) {
        AwS589S0100000_10 awS589S0100000_102 = awS589S0100000_10;
        boolean z2 = z;
        C1263404wy c1263404wy2 = c1263404wy;
        C0GV3 c0gv32 = c0gv3;
        C0GV2 c0gv22 = c0gv2;
        InterfaceC328580CuO interfaceC328580CuO2 = interfaceC328580CuO;
        C0R20 c0r202 = c0r20;
        InterfaceC328600CuQ interfaceC328600CuQ3 = interfaceC328600CuQ2;
        InterfaceC328600CuQ interfaceC328600CuQ4 = interfaceC328600CuQ;
        Function1 function12 = null;
        if ((i & 2) != 0) {
            c21419418s4 = null;
        }
        if ((i & 4) != 0) {
            interfaceC328600CuQ4 = null;
        }
        if ((i & 8) != 0) {
            interfaceC328600CuQ3 = null;
        }
        if ((i & 16) != 0) {
            c0r202 = null;
        }
        if ((i & 32) != 0) {
            interfaceC328580CuO2 = null;
        }
        if ((i & 64) != 0) {
            c0gv22 = null;
        }
        if ((i & 128) != 0) {
            c0gv32 = null;
        }
        if ((i & 256) != 0) {
            c1263404wy2 = null;
        }
        if ((i & 512) != 0) {
            z2 = false;
        }
        if ((i & 1024) != 0) {
            awS589S0100000_102 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0) {
            function12 = function1;
        }
        WeakReference weakReference = new WeakReference(c1860130yVP);
        C328680CuY c328680CuY = new C328680CuY(weakReference, interfaceC328600CuQ4, interfaceC328600CuQ3, c0r202, interfaceC328580CuO2, c0gv22, c0gv32, awS589S0100000_102, z2, function12);
        AwS73S1300000_4 awS73S1300000_4 = new AwS73S1300000_4(c1263404wy2, c1860130yVP, str, c21419418s4, 1);
        if (z2) {
            C823050WQl.LIZIZ().execute(new ARunnableS37S0300000_4(weakReference, awS73S1300000_4, c328680CuY, 21));
            return;
        }
        Object objInvoke = awS73S1300000_4.invoke();
        if (objInvoke == null) {
            return;
        }
        c328680CuY.invoke(objInvoke);
    }
}
