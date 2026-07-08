package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.strategy.StrategyMediaInfo;
import com.ss.ttvideoengine.DataLoaderHelper;
import fyo.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475470oUz {
    public static boolean LIZLLL(C1475130oUR c1475130oUR) {
        InterfaceC1467050oHP interfaceC1467050oHP;
        if (c1475130oUR != null && c1475130oUR.LJJ == 1) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZJ("DataLoaderHelper", "[preload] live model, valid.");
            return true;
        }
        if (c1475130oUR != null && (interfaceC1467050oHP = c1475130oUR.LIZLLL) != null && c1475130oUR.LJ != null) {
            if (!TextUtils.isEmpty(interfaceC1467050oHP.LJJII(2))) {
                return true;
            }
            int i2 = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] videoId invalid.");
            if (c1475130oUR.LIZJ != null) {
                C1475490oV1 c1475490oV1 = new C1475490oV1(3);
                c1475490oV1.LIZJ = new e("kTTVideoErrorDomainDataLoaderPreload", -100001);
                c1475130oUR.LIZJ.LIZ(c1475490oV1);
            }
            return false;
        }
        int i3 = C2187451AjH.LIZ;
        C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] videoModel input invalid");
        if (c1475130oUR != null && c1475130oUR.LIZJ != null) {
            C1475490oV1 c1475490oV12 = new C1475490oV1(3);
            c1475490oV12.LIZJ = new e("kTTVideoErrorDomainDataLoaderPreload", -100001);
            c1475130oUR.LIZJ.LIZ(c1475490oV12);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C1475130oUR r9, java.lang.String r10, com.ss.ttvideoengine.DataLoaderHelper r11) {
        /*
            if (r9 == 0) goto La3
            X.0oVD r0 = r9.LJFF
            r7 = 0
            if (r0 == 0) goto L6b
            X.0oUx r6 = new X.0oUx
            java.util.Objects.requireNonNull(r11)
            X.0oVD r0 = r9.LJFF
            r6.<init>(r0)
        L11:
            X.0oUY r0 = r9.LIZJ
            if (r0 == 0) goto L1a
            X.0oV2 r7 = new X.0oV2
            r7.<init>(r0)
        L1a:
            X.0oHP r0 = r9.LIZLLL
            java.lang.String r1 = r0.LJIJ()
            boolean r0 = r9.LIZ()
            if (r0 == 0) goto L69
            java.lang.String r5 = r9.LIZJ()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L69
        L30:
            int r1 = r11.LJJJJI
            r0 = 1
            if (r1 != r0) goto L6d
            X.0oHP r0 = r9.LIZLLL
            if (r0 == 0) goto L6d
            java.util.List r1 = r0.LJIILL()
            if (r1 == 0) goto L6d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L6d
            java.util.Iterator r4 = r1.iterator()
        L49:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r4.next()
            X.0oTS r0 = (X.C1474520oTS) r0
            java.lang.String[] r3 = r0.LJIIJ()
            int r2 = r3.length
            r1 = 0
        L5b:
            if (r1 >= r2) goto L49
            r0 = r3[r1]
            boolean r0 = r11.LJIILLIIL(r0)
            if (r0 != 0) goto L66
            return
        L66:
            int r1 = r1 + 1
            goto L5b
        L69:
            r5 = r1
            goto L30
        L6b:
            r6 = r7
            goto L11
        L6d:
            int r0 = r11.LJJLIIIJL
            r2 = 2
            r0 = r0 & 2
            r8 = r10
            if (r0 != r2) goto La7
            com.bytedance.vcloud.strategy.StrategyMediaInfo$Builder r1 = new com.bytedance.vcloud.strategy.StrategyMediaInfo$Builder
            r1.<init>(r5, r7, r6)
            r1.sceneId(r8)
            int r0 = r9.LJJ
            r1.isLive(r0)
            boolean r0 = r9.LJIL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.isLast(r0)
            X.0oHP r0 = r9.LIZLLL
            if (r0 == 0) goto La4
            java.lang.String r0 = r0.LJJII(r2)
        L93:
            r1.mediaId(r0)
            com.bytedance.vcloud.strategy.StrategyMediaInfo r1 = r1.build()
            X.0oKo r0 = X.C790230UzF.LIZ
            com.bytedance.vcloud.strategy.StrategyCenter r0 = r0.LIZJ()
            r0.addStrategyMedia(r1, r8)
        La3:
            return
        La4:
            java.lang.String r0 = ""
            goto L93
        La7:
            X.0oKo r0 = X.C790230UzF.LIZ
            com.bytedance.vcloud.strategy.StrategyCenter r4 = r0.LIZJ()
            boolean r9 = r9.LJIL
            r10 = 0
            r4.addMedia(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1475470oUz.LIZ(X.0oUR, java.lang.String, com.ss.ttvideoengine.DataLoaderHelper):void");
    }

    public static void LIZIZ(List list, String str, DataLoaderHelper dataLoaderHelper) {
        C1475450oUx c1475450oUx;
        JSONObject jSONObjectLJII;
        String strLJJII;
        InterfaceC1467050oHP interfaceC1467050oHP;
        List<C1474520oTS> listLJIILL;
        if (list == null) {
            throw new NullPointerException("isEmpty");
        }
        ArrayList arrayList = new ArrayList();
        loop0: for (int i = 0; i < list.size(); i++) {
            C1475130oUR c1475130oUR = (C1475130oUR) ListProtector.get(list, i);
            if (c1475130oUR != null) {
                C1475500oV2 c1475500oV2 = null;
                if (c1475130oUR.LJFF != null) {
                    Objects.requireNonNull(dataLoaderHelper);
                    c1475450oUx = new C1475450oUx(c1475130oUR.LJFF);
                } else {
                    c1475450oUx = null;
                }
                C1475200oUY c1475200oUY = c1475130oUR.LIZJ;
                if (c1475200oUY != null) {
                    c1475500oV2 = new C1475500oV2(c1475200oUY);
                }
                if (c1475130oUR.LIZ()) {
                    jSONObjectLJII = c1475130oUR.LIZLLL();
                } else {
                    jSONObjectLJII = c1475130oUR.LIZLLL.LJII();
                }
                if (dataLoaderHelper.LJJJJI == 1 && (interfaceC1467050oHP = c1475130oUR.LIZLLL) != null && (listLJIILL = interfaceC1467050oHP.LJIILL()) != null && !listLJIILL.isEmpty()) {
                    Iterator<C1474520oTS> it2 = listLJIILL.iterator();
                    while (it2.hasNext()) {
                        for (String str2 : it2.next().LJIIJ()) {
                            if (!dataLoaderHelper.LJIILLIIL(str2)) {
                                break loop0;
                            }
                        }
                    }
                }
                StrategyMediaInfo.Builder builder = new StrategyMediaInfo.Builder(jSONObjectLJII, c1475500oV2, c1475450oUx);
                builder.sceneId(str);
                builder.isLive(c1475130oUR.LJJ);
                builder.isLast(Boolean.valueOf(c1475130oUR.LJIL));
                InterfaceC1467050oHP interfaceC1467050oHP2 = c1475130oUR.LIZLLL;
                if (interfaceC1467050oHP2 != null) {
                    strLJJII = interfaceC1467050oHP2.LJJII(2);
                } else {
                    strLJJII = "";
                }
                builder.mediaId(strLJJII);
                arrayList.add(builder.build());
            }
        }
        C790230UzF.LIZ.LIZJ().addStrategyMedias(arrayList, str);
    }

    public static void LIZJ(List list, String str, DataLoaderHelper dataLoaderHelper) {
        C1475450oUx c1475450oUx;
        String strLJJII;
        InterfaceC1467050oHP interfaceC1467050oHP;
        List<C1474520oTS> listLJIILL;
        if (list == null) {
            throw new NullPointerException("isEmpty");
        }
        ArrayList arrayList = new ArrayList();
        loop0: for (int i = 0; i < list.size(); i++) {
            C1475130oUR c1475130oUR = (C1475130oUR) ListProtector.get(list, i);
            if (c1475130oUR != null) {
                C1475500oV2 c1475500oV2 = null;
                if (c1475130oUR.LJFF != null) {
                    Objects.requireNonNull(dataLoaderHelper);
                    c1475450oUx = new C1475450oUx(c1475130oUR.LJFF);
                } else {
                    c1475450oUx = null;
                }
                C1475200oUY c1475200oUY = c1475130oUR.LIZJ;
                if (c1475200oUY != null) {
                    c1475500oV2 = new C1475500oV2(c1475200oUY);
                }
                String strLJIJ = c1475130oUR.LIZLLL.LJIJ();
                if (c1475130oUR.LIZ()) {
                    String strLIZJ = c1475130oUR.LIZJ();
                    if (!TextUtils.isEmpty(strLIZJ)) {
                        strLJIJ = strLIZJ;
                    }
                }
                boolean z = true;
                if (dataLoaderHelper.LJJJJI == 1 && (interfaceC1467050oHP = c1475130oUR.LIZLLL) != null && (listLJIILL = interfaceC1467050oHP.LJIILL()) != null && !listLJIILL.isEmpty()) {
                    Iterator<C1474520oTS> it2 = listLJIILL.iterator();
                    while (it2.hasNext()) {
                        for (String str2 : it2.next().LJIIJ()) {
                            if (!dataLoaderHelper.LJIILLIIL(str2)) {
                                break loop0;
                            }
                        }
                    }
                }
                StrategyMediaInfo.Builder builder = new StrategyMediaInfo.Builder(strLJIJ, c1475500oV2, c1475450oUx);
                builder.sceneId(str);
                builder.isLive(c1475130oUR.LJJ);
                if (i != list.size() - 1) {
                    z = false;
                }
                builder.isLast(Boolean.valueOf(z));
                InterfaceC1467050oHP interfaceC1467050oHP2 = c1475130oUR.LIZLLL;
                if (interfaceC1467050oHP2 != null) {
                    strLJJII = interfaceC1467050oHP2.LJJII(2);
                } else {
                    strLJJII = "";
                }
                builder.mediaId(strLJJII);
                arrayList.add(builder.build());
            }
        }
        C790230UzF.LIZ.LIZJ().refreshUnplayedMedias(arrayList, str);
    }

    public static void LJ(C1475130oUR c1475130oUR, String str, DataLoaderHelper dataLoaderHelper) {
        if (dataLoaderHelper.LJJIJLIJ != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(dataLoaderHelper);
            arrayList.add(c1475130oUR);
            arrayList.add(str);
            dataLoaderHelper.LJJIJLIJ.LIZ(111, arrayList);
            return;
        }
        LIZ(c1475130oUR, str, dataLoaderHelper);
    }

    public static void LJFF(List list, String str, DataLoaderHelper dataLoaderHelper) {
        if (!((ArrayList) list).isEmpty()) {
            if (dataLoaderHelper.LJJIJLIJ != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dataLoaderHelper);
                arrayList.add(list);
                arrayList.add(str);
                dataLoaderHelper.LJJIJLIJ.LIZ(117, arrayList);
                return;
            }
            LIZJ(list, str, dataLoaderHelper);
        }
    }
}
