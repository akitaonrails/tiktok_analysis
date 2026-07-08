package X;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zhy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906360zhy {
    public static final C1790550whB LIZ;
    public static final C1790450wh1 LIZIZ;
    public static C1906510ziD LIZJ;

    static {
        C1790550whB c1790550whB = new C1790550whB();
        LIZ = c1790550whB;
        LIZIZ = new C1790450wh1(c1790550whB);
        if (C295090BhT.LIZ()) {
            C1906380zi0 c1906380zi0 = C1906380zi0.LIZ;
            InterfaceC1906520ziE interfaceC1906520ziE = new InterfaceC1906520ziE() { // from class: X.0whF
                @Override // X.InterfaceC1906520ziE
                public final void LIZLLL(String str, C1906370zhz c1906370zhz, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC1906520ziE
                public final void LIZJ(Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1906360zhy.LIZJ = null;
                    }
                }

                @Override // X.InterfaceC1906520ziE
                public final void LIZ(C1906370zhz c1906370zhz, String str) {
                    C1906360zhy.LIZ.LIZ(str, C1790600whG.LIZ(c1906370zhz));
                }

                @Override // X.InterfaceC1906520ziE
                public final void LIZIZ(C1906370zhz c1906370zhz, String str) {
                    C1586120rNS.LIZ.getClass();
                    C1906360zhy.LIZ.LIZ(str, C1790600whG.LIZ(c1906370zhz));
                    C1790450wh1 c1790450wh1 = C1906360zhy.LIZIZ;
                    Iterator it2 = ((List) c1790450wh1.LIZJ.getValue()).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((InterfaceC1790610whH) next).LIZLLL(str)) {
                            if (next != null) {
                                return;
                            }
                        }
                    }
                    List list = (List) ((Map) c1790450wh1.LIZIZ.getValue()).get(str);
                    if (list == null) {
                        return;
                    }
                    Iterator it3 = list.iterator();
                    while (it3.hasNext() && !((InterfaceC1790610whH) it3.next()).LIZLLL(str)) {
                    }
                }

                @Override // X.InterfaceC1906520ziE
                public final void LJ(C1906370zhz c1906370zhz, String str) {
                    C1906360zhy.LIZ.LIZ(str, C1790600whG.LIZ(c1906370zhz));
                    C1906360zhy.LIZJ = null;
                }
            };
            c1906380zi0.getClass();
            ((ArrayList) C1906380zi0.LIZLLL).add(interfaceC1906520ziE);
        }
    }

    public static C1906460zi8 LIZ() {
        C1906510ziD c1906510ziD = LIZJ;
        if (c1906510ziD != null) {
            return c1906510ziD.LIZ;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x013d, code lost:
    
        r0 = (java.util.List) ((java.util.Map) r4.LIZIZ.getValue()).get(r3.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014d, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014f, code lost:
    
        r1 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0157, code lost:
    
        if (r1.hasNext() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0163, code lost:
    
        if (((X.InterfaceC1790610whH) r1.next()).LIZJ(r3) == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.EnumC1584360rKc r11) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1906360zhy.LIZLLL(X.0rKc):void");
    }

    public static void LJ(C1906370zhz c1906370zhz) {
        C19EG c19eg;
        Aweme aweme;
        c1906370zhz.LJIIIIZZ = c1906370zhz.LIZIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1906370zhz.LJFF = jCurrentTimeMillis;
        c1906370zhz.LJI = jCurrentTimeMillis + c1906370zhz.LIZLLL;
        c1906370zhz.LJII = true;
        Activity activityLIZ = C2421209eE.LIZ();
        if (activityLIZ instanceof C19EG) {
            c19eg = (C19EG) activityLIZ;
        } else {
            c19eg = null;
        }
        C1906380zi0 c1906380zi0 = C1906380zi0.LIZ;
        c1906380zi0.getClass();
        if (C1906380zi0.LJI() && c19eg != null && (aweme = C680080Qly.LIZIZ(c19eg).LLJILJILJ) != null) {
            c1906370zhz.LJIL = aweme.getGroupId();
            c1906370zhz.LJJ = AwemeExtKt.getAuthorUid(aweme);
        }
        C1584320rKY.LIZ.getClass();
        String str = C1584320rKY.LJII;
        if (str != null && c1906370zhz.LJIJJ == null) {
            c1906370zhz.LJIJJ = str;
        }
        c1906380zi0.getClass();
        C1906380zi0.LIZIZ.put(c1906370zhz.LIZIZ, c1906370zhz);
        Iterator it2 = ((ArrayList) C1906380zi0.LIZLLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1906520ziE) it2.next()).LIZ(c1906370zhz, c1906370zhz.LIZ);
        }
        if (C0BTQ.LIZ()) {
            if (C1906380zi0.LIZJ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mobBubbleShow, stayTimeRecorder is null, tooltipsKey:");
                sbLIZ.append(c1906370zhz.LIZ);
                sbLIZ.append(", tabName:");
                sbLIZ.append(c1906370zhz.LJJ);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            if (c1906370zhz.LJIILL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("mobBubbleShow, hasReport, key: ");
                sbLIZ2.append(c1906370zhz.LIZ);
                C2188811AlT.LIZIZ(sbLIZ2);
                return;
            }
            c1906370zhz.LJIILL = true;
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new RunnableC514801zW(C1906380zi0.LIZ(c1906370zhz.LIZIZ, c1906370zhz), 185));
        }
    }

    public static void LIZJ(EnumC1584360rKc enumC1584360rKc, EnumC1905820zh6 enumC1905820zh6) {
        C1906510ziD c1906510ziD;
        C1586120rNS c1586120rNS = C1586120rNS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyClick: ");
        sbLIZ.append(enumC1584360rKc);
        sbLIZ.append(", ");
        sbLIZ.append(enumC1905820zh6);
        C2188811AlT.LIZIZ(sbLIZ);
        c1586120rNS.getClass();
        C1906380zi0.LIZ.getClass();
        C1906380zi0.LIZJ(enumC1584360rKc, enumC1905820zh6, null);
        if (enumC1905820zh6 == EnumC1905820zh6.CLICK_TOOLTIPS && (c1906510ziD = LIZJ) != null) {
            c1906510ziD.LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1906460zi8 r8, X.C1906370zhz r9, X.InterfaceC1619130sEh r10, X.InterfaceC1790610whH r11) {
        /*
            X.0zi0 r7 = X.C1906380zi0.LIZ
            X.0rKc r3 = r8.LIZIZ
            X.0J74 r0 = X.C0J74.LIZ
            boolean r6 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r0)
            r1 = 0
            if (r11 == 0) goto L75
            java.lang.String r5 = r11.getRuleId()
            X.0wh4 r4 = r11.LIZ()
        L15:
            boolean r0 = r11 instanceof X.C1790470wh3
            if (r0 == 0) goto L6a
            X.0zi8 r0 = LIZ()
            if (r0 == 0) goto L73
            java.lang.String r2 = r0.LIZ
        L21:
            r7.getClass()
            org.json.JSONObject r3 = X.C1906380zi0.LIZ(r3, r9)
            java.lang.String r0 = "show_status"
            r3.put(r0, r6)
            if (r6 != 0) goto L55
            if (r4 == 0) goto L35
            java.lang.String r1 = r4.getType()
        L35:
            java.lang.String r0 = "block_type"
            r3.put(r0, r1)
            X.0wh4 r1 = X.EnumC1790480wh4.FREQUENCY
            if (r4 == r1) goto L42
            X.0wh4 r0 = X.EnumC1790480wh4.EXIT
            if (r4 != r0) goto L47
        L42:
            java.lang.String r0 = "block_type_detail"
            r3.put(r0, r5)
        L47:
            if (r4 == r1) goto L64
            X.0wh4 r0 = X.EnumC1790480wh4.OTHER_SHOWING
            if (r4 != r0) goto L55
            if (r2 == 0) goto L55
            int r0 = r2.length()
            if (r0 != 0) goto L64
        L55:
            android.os.Handler r2 = X.C799570VYd.LIZIZ()
            X.01zW r1 = new X.01zW
            r0 = 186(0xba, float:2.6E-43)
            r1.<init>(r3, r0)
            X.C786410Ut5.LJJZZIII(r2, r1)
            return
        L64:
            java.lang.String r0 = "block_tooltips_key"
            r3.put(r0, r2)
            goto L55
        L6a:
            boolean r0 = r11 instanceof X.C1790490wh5
            if (r0 == 0) goto L73
            X.0wh5 r11 = (X.C1790490wh5) r11
            java.lang.String r2 = r11.LJI
            goto L21
        L73:
            r2 = r1
            goto L21
        L75:
            r5 = r1
            r4 = r1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1906360zhy.LIZIZ(X.0zi8, X.0zhz, X.0sEh, X.0whH):void");
    }
}
