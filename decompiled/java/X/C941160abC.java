package X;

import android.graphics.Rect;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0abC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941160abC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List list, C937850aVr c937850aVr) {
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(new AnonymousClass0042("LayoutDataSource"));
        if (c937850aVr == null) {
            arrayList.add(new C0238006a("dataSource", "null", null));
            return;
        }
        LIZIZ("roomId", list, new AwS559S0100000_15(c937850aVr, 878));
        LIZIZ("maxMicCount", list, new AwS559S0100000_15(c937850aVr, 879));
        LIZIZ("pageType", list, new AwS559S0100000_15(c937850aVr, 880));
        LIZIZ("panelLayoutType", list, new AwS559S0100000_15(c937850aVr, 881));
        LIZIZ("layout_key", list, new AwS559S0100000_15(c937850aVr, 882));
        LIZIZ("originLayoutStyle", list, new AwS559S0100000_15(c937850aVr, 883));
        LIZIZ("originMaxMicCount", list, new AwS559S0100000_15(c937850aVr, 884));
        LIZIZ("enlargeStatus", list, new AwS559S0100000_15(c937850aVr, 885));
        LIZIZ("isFullScreenLayout", list, new AwS559S0100000_15(c937850aVr, 886));
        LIZIZ("isZoomedLayout", list, new AwS559S0100000_15(c937850aVr, 871));
        LIZIZ("enlargedPosIdentity", list, new AwS559S0100000_15(c937850aVr, 872));
        LIZIZ("isPanelLayout", list, new AwS559S0100000_15(c937850aVr, 873));
        LIZIZ("isFixLayout", list, new AwS559S0100000_15(c937850aVr, 874));
        LIZIZ("isFloatingLayout", list, new AwS559S0100000_15(c937850aVr, 875));
        LIZIZ("isDoubleLargeOrDoubleCampLayout", list, new AwS559S0100000_15(c937850aVr, 876));
        LIZIZ("isInDisableEnlargeLayout", list, new AwS559S0100000_15(c937850aVr, 877));
        List<C957020b0m> listLJIIIZ = c937850aVr.LJIIIZ();
        arrayList.add(new AnonymousClass0042("windowInfoList"));
        arrayList.add(new C0238006a("windowCount", String.valueOf(listLJIIIZ.size()), null));
        int i = 0;
        for (C957020b0m c957020b0m : listLJIIIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                C957020b0m c957020b0m2 = c957020b0m;
                C915830ZwL shapeDescriptor = c957020b0m2.getShapeDescriptor();
                Rect rect = shapeDescriptor.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("window[");
                sbLIZ.append(i);
                sbLIZ.append(']');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sb = new StringBuilder(e3.e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("spotId=");
                sbLIZ2.append(c957020b0m2.getSpotId());
                sbLIZ2.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("identity=");
                sbLIZ3.append(c957020b0m2.getIdentity());
                sbLIZ3.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("posIdentity=");
                sbLIZ4.append(c957020b0m2.getPosIdentity());
                sbLIZ4.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ4));
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("contentLinkMicId=");
                sbLIZ5.append(c957020b0m2.getContentLinkMicId());
                sbLIZ5.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ5));
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("winState=");
                sbLIZ6.append(c957020b0m2.getWinState());
                sbLIZ6.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ6));
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("onlineState=");
                sbLIZ7.append(c957020b0m2.getOnlineState());
                sbLIZ7.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ7));
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("isAnchor=");
                sbLIZ8.append(c957020b0m2.LLJIJIL);
                sbLIZ8.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ8));
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("isSelf=");
                sbLIZ9.append(c957020b0m2.LLJILJIL);
                sbLIZ9.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ9));
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("zOrder=");
                sbLIZ10.append(c957020b0m2.getZOrder());
                sbLIZ10.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ10));
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append("rect=(");
                sbLIZ11.append(rect.left);
                sbLIZ11.append(',');
                sbLIZ11.append(rect.top);
                sbLIZ11.append(',');
                sbLIZ11.append(rect.right);
                sbLIZ11.append(',');
                sbLIZ11.append(rect.bottom);
                sbLIZ11.append("), ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ11));
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append("radius=");
                sbLIZ12.append(shapeDescriptor.LIZIZ);
                sbLIZ12.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ12));
                StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                sbLIZ13.append("streamId=");
                sbLIZ13.append(c957020b0m2.getStreamId());
                sbLIZ13.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ13));
                StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                sbLIZ14.append("linkMicId=");
                sbLIZ14.append(c957020b0m2.getLinkMicId());
                sbLIZ14.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ14));
                sb.append(e3.f);
                arrayList.add(new C0238006a(strLIZIZ, sb.toString(), null));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static final C1850507Mp LIZJ(C937850aVr c937850aVr, C940490aa7 c940490aa7) {
        Object c098200Yq;
        Long lValueOf;
        Long l;
        EnumC940090aZT enumC940090aZT;
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new AnonymousClass0042("Basic Info"));
            if (c940490aa7 != null) {
                lValueOf = Long.valueOf(c940490aa7.LIZ);
            } else {
                lValueOf = null;
            }
            arrayList.add(new C0238006a("roomId", String.valueOf(lValueOf), null));
            if (c940490aa7 != null) {
                l = c940490aa7.LIZIZ;
            } else {
                l = null;
            }
            arrayList.add(new C0238006a("roomOwnerUserId", String.valueOf(l), null));
            if (c940490aa7 != null) {
                enumC940090aZT = c940490aa7.LJFF;
            } else {
                enumC940090aZT = null;
            }
            arrayList.add(new C0238006a("pageType", String.valueOf(enumC940090aZT), null));
            LIZ(arrayList, c937850aVr);
            c098200Yq = new C1850507Mp(arrayList);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            c098200Yq = new C1850507Mp(Collections.singletonList(new C0238006a("error", message, null)));
        }
        return (C1850507Mp) c098200Yq;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(java.lang.String r3, java.util.List r4, kotlin.jvm.functions.Function0 r5) {
        /*
            java.lang.Object r0 = r5.invoke()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lc
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L31
        Lc:
            java.lang.String r2 = "null"
            goto L31
        Lf:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L2a
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L2a:
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
        L31:
            X.006a r1 = new X.006a
            r0 = 0
            r1.<init>(r3, r2, r0)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C941160abC.LIZIZ(java.lang.String, java.util.List, kotlin.jvm.functions.Function0):void");
    }
}
