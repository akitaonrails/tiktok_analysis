package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.communication.SearchMusicMiddlePageScope;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681550QoL {
    public static C681550QoL LIZLLL;
    public static CharSequence LJ;
    public static Boolean LJFF;
    public static final String LJI = (String) C2508109sF.LIZ.getValue();
    public final boolean LIZ;
    public final C1D66 LIZIZ;
    public int LIZJ;

    public /* synthetic */ C681550QoL(Context context, String str) {
        this(context, null, str, false);
    }

    public C681550QoL(Context context, String str, String str2, boolean z) {
        C1D3S c1d3s;
        this.LIZ = z;
        Map<String, List<String>> mapLIZ = C682060QpA.LIZ();
        if (z) {
            c1d3s = C1D3S.PRELOAD;
        } else {
            c1d3s = C1D3S.NORMAL;
        }
        C1D66 c1d66 = new C1D66(context, str2, c1d3s, mapLIZ);
        this.LIZIZ = c1d66;
        c1d66.LJI(new InterfaceC2250311D5x() { // from class: X.1D6V
            public final Set<C1D61> LIZ = C13LQ.LJLIIL(new EnumC666230QBh[]{EnumC666230QBh.ENTER_MIDDLE_PAGE, EnumC666230QBh.EXIT_MIDDLE_PAGE});

            @Override // X.InterfaceC2250311D5x
            public final void destroy() {
            }

            @Override // X.InterfaceC2250311D5x
            public final int getPriority() {
                return 10;
            }

            @Override // X.InterfaceC2250311D5x
            public final Set<C13IQ<? extends InterfaceC2250311D5x>> getDependencies() {
                return C08CX.INSTANCE;
            }

            @Override // X.InterfaceC2250311D5x
            public final Set<C1D61> getLifecycleStages() {
                return this.LIZ;
            }

            @Override // X.InterfaceC2250311D5x
            public final AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63) {
                return C1156460gCS.LIZ;
            }

            @Override // X.InterfaceC2250311D5x
            public final AbstractC1156450gCR<?> executeImmediate(C1D63 c1d63) {
                C682020Qp6 c682020Qp6;
                JSONObject jSONObject;
                C682010Qp5 c682010Qp5;
                JSONObject jSONObject2;
                C1D61 c1d61 = c1d63.LIZ.LIZ;
                if (c1d61 == EnumC666230QBh.ENTER_MIDDLE_PAGE) {
                    C1537480q70 c1537480q70 = c1d63.LIZJ;
                    if (c1537480q70 != null && (c682010Qp5 = (C682010Qp5) c1537480q70.LIZLLL(C682010Qp5.class)) != null && (jSONObject2 = c682010Qp5.LIZ) != null) {
                        C1537480q70 c1537480q702 = c1d63.LIZJ;
                        if (c1537480q702 != null) {
                            c1537480q702.LJJIIJZLJL(jSONObject2, "searchMusicTransferEnter");
                        }
                    } else {
                        return new C1156430gCP(new NullPointerException("transferEnter params not found"));
                    }
                } else if (c1d61 == EnumC666230QBh.EXIT_MIDDLE_PAGE) {
                    C1537480q70 c1537480q703 = c1d63.LIZJ;
                    if (c1537480q703 != null && (c682020Qp6 = (C682020Qp6) c1537480q703.LIZLLL(C682020Qp6.class)) != null && (jSONObject = c682020Qp6.LIZ) != null) {
                        C1537480q70 c1537480q704 = c1d63.LIZJ;
                        if (c1537480q704 != null) {
                            c1537480q704.LJJIIJZLJL(jSONObject, "searchMusicTransferQuit");
                        }
                    } else {
                        return new C1156430gCP(new NullPointerException("transferQuit params not found"));
                    }
                }
                return new C1156440gCQ(EnumC115000c8.SUCCESS);
            }
        });
        c1d66.LJI(new InterfaceC2250311D5x() { // from class: X.1D6P
            public final Set<C1D61> LIZ = Collections.singleton(C1D6W.ON_TIMING_UPDATE);

            @Override // X.InterfaceC2250311D5x
            public final void destroy() {
            }

            @Override // X.InterfaceC2250311D5x
            public final int getPriority() {
                return 10;
            }

            @Override // X.InterfaceC2250311D5x
            public final Set<C13IQ<? extends InterfaceC2250311D5x>> getDependencies() {
                return C08CX.INSTANCE;
            }

            @Override // X.InterfaceC2250311D5x
            public final Set<C1D61> getLifecycleStages() {
                return this.LIZ;
            }

            @Override // X.InterfaceC2250311D5x
            public final AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63) {
                return C1156460gCS.LIZ;
            }

            @Override // X.InterfaceC2250311D5x
            public final AbstractC1156450gCR<?> executeImmediate(C1D63 c1d63) {
                String str3;
                C1537480q70 c1537480q70;
                InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
                View viewE1;
                Object ability;
                C006Y c006y = c1d63.LIZ.LIZJ;
                Object obj = null;
                if (!(c006y instanceof C682050Qp9)) {
                    c006y = null;
                }
                C682050Qp9 c682050Qp9 = (C682050Qp9) c006y;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lynx time: ");
                if (c682050Qp9 != null) {
                    str3 = c682050Qp9.LIZJ;
                } else {
                    str3 = null;
                }
                sbLIZ.append(str3);
                C2188811AlT.LIZIZ(sbLIZ);
                if (C301320BrW.LIZ() && c682050Qp9 != null && (c1537480q70 = c1d63.LIZJ) != null && (interfaceC1541990qEHLJIJJ = c1537480q70.LJIJJ()) != null && (viewE1 = interfaceC1541990qEHLJIJJ.e1()) != null) {
                    C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJ(viewE1, null), SearchMusicMiddlePageScope.class);
                    if (c0qsjLIZJ != null) {
                        ability = c0qsjLIZJ.getAbility(InterfaceC615300OBk.class);
                    } else {
                        ability = null;
                    }
                    if (ability instanceof InterfaceC615300OBk) {
                        obj = ability;
                    }
                    InterfaceC615300OBk interfaceC615300OBk = (InterfaceC615300OBk) obj;
                    if (interfaceC615300OBk != null) {
                        interfaceC615300OBk.Vh(c682050Qp9);
                    }
                }
                return new C1156440gCQ(EnumC115000c8.SUCCESS);
            }
        });
        str = str == null ? "" : str;
        c1d66.LJ(C651070PgH.class, new C651070PgH(EnumC681560QoM.HISTORY.getProcessorName()));
        c1d66.LIZJ(str, null);
    }
}
