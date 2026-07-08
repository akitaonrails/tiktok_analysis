package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabIconViewConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0NLJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NLJ {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(562));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(561));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(560));

    public final Keva LJ() {
        return (Keva) this.LIZIZ.getValue();
    }

    public static String LIZLLL(TabDynamicIconInfo tabDynamicIconInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(tabDynamicIconInfo.tabKey);
        sbLIZ.append('_');
        sbLIZ.append(tabDynamicIconInfo.iconId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(TabDynamicIconInfo tabDynamicIconInfo) {
        List<String> listLIZ;
        List<String> listLIZ2;
        LJ().erase(LIZLLL(tabDynamicIconInfo));
        C0NKZ c0nkz = (C0NKZ) this.LIZJ.getValue();
        TabIconViewConfig tabIconViewConfig = tabDynamicIconInfo.topTabIconConfig;
        if (tabIconViewConfig != null && (listLIZ2 = C0NLV.LIZ(tabIconViewConfig)) != null) {
            Iterator<String> it2 = listLIZ2.iterator();
            while (it2.hasNext()) {
                c0nkz.LIZJ(it2.next());
            }
        }
        TabIconViewConfig tabIconViewConfig2 = tabDynamicIconInfo.bottomTabIconConfig;
        if (tabIconViewConfig2 != null && (listLIZ = C0NLV.LIZ(tabIconViewConfig2)) != null) {
            Iterator<String> it3 = listLIZ.iterator();
            while (it3.hasNext()) {
                c0nkz.LIZJ(it3.next());
            }
        }
    }

    public final void LIZIZ(String str) {
        TabDynamicIconInfo tabDynamicIconInfo;
        String string = LJ().getString(str, null);
        if (string != null && (tabDynamicIconInfo = (TabDynamicIconInfo) C309390CAv.LIZ(string, TabDynamicIconInfo.class)) != null) {
            LIZ(tabDynamicIconInfo);
        }
        LJ().erase(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.util.List<com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo> r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C0NLL
            if (r0 == 0) goto L8c
            r6 = r10
            X.0NLL r6 = (X.C0NLL) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r5 = 1
            if (r0 == 0) goto L5b
            if (r0 != r5) goto L95
            java.lang.Object r4 = r6.LL
            java.util.Iterator r4 = (java.util.Iterator) r4
            X.C155000ia.LIZIZ(r1)
        L26:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo r3 = (com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo) r3
            r6.LL = r4
            r6.LLILZ = r5
            X.01GW r0 = r8.LIZJ
            java.lang.Object r2 = r0.getValue()
            X.0NKZ r2 = (X.C0NKZ) r2
            X.0NKg r1 = new X.0NKg
            r0 = 0
            r1.<init>(r3, r2, r0)
            java.lang.Object r1 = X.C2296808zG.LJ(r1, r6)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L50
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L50:
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L58
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L58:
            if (r1 != r7) goto L26
            return r7
        L5b:
            X.C155000ia.LIZIZ(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r9.iterator()
        L67:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo r0 = (com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo) r0
            X.0NLR r1 = r0.LIZ
            if (r1 == 0) goto L67
            boolean r0 = r1.LIZ
            if (r0 != 0) goto L67
            boolean r0 = r1.LIZJ
            if (r0 != 0) goto L67
            r4.add(r2)
            goto L67
        L84:
            r4.isEmpty()
            java.util.Iterator r4 = r4.iterator()
            goto L26
        L8c:
            X.0NLL r6 = new X.0NLL
            r6.<init>(r8, r10)
            goto L12
        L92:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NLJ.LJFF(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.util.List<com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo> r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C0NLM
            if (r0 == 0) goto L6f
            r7 = r11
            X.0NLM r7 = (X.C0NLM) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r2 = r7.LLILLJJLI
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L3e
            if (r0 != r5) goto L78
            java.lang.Object r1 = r7.LL
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.C155000ia.LIZIZ(r2)
        L27:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo r0 = (com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo) r0
            r7.LL = r1
            r7.LLILZ = r5
            java.lang.Object r0 = r9.LIZJ(r0, r6, r7)
            if (r0 != r8) goto L27
            return r8
        L3e:
            X.C155000ia.LIZIZ(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r10.iterator()
        L4a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo r0 = (com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo) r0
            X.0NLR r1 = r0.LIZ
            if (r1 == 0) goto L4a
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L4a
            boolean r0 = r1.LIZJ
            if (r0 != 0) goto L4a
            r4.add(r2)
            goto L4a
        L67:
            r4.isEmpty()
            java.util.Iterator r1 = r4.iterator()
            goto L27
        L6f:
            X.0NLM r7 = new X.0NLM
            r7.<init>(r9, r11)
            goto L12
        L75:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NLJ.LJI(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo r22, boolean r23, X.InterfaceC1364105Vn<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NLJ.LIZJ(com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo, boolean, X.05Vn):java.lang.Object");
    }
}
