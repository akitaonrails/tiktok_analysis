package X;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.dataChannel.MultiGuestFullScreenEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicBugFixLayoutContainerSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0abg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941460abg {
    public static final /* synthetic */ int LIZ = 0;

    public static Rect LIZ(Rect rect, C957020b0m c957020b0m, Context context) {
        Rect rect2;
        InterfaceC920220a3Q dataSource = C940770aaZ.LIZ().getDataSource();
        if ((LinkCoreModelKt.currentUserIsAnchor() || C500260Jjc.LJJIL()) && c957020b0m.LLJIJIL && LIZIZ(c957020b0m, dataSource, context, false) && !dataSource.LJIILJJIL()) {
            DataChannelGlobal.LLILZ.FQ2(MultiGuestFullScreenEvent.class, Boolean.TRUE);
            int iLJIJ = C497740JfY.LJIJ();
            int iLIZIZ = (int) C497740JfY.LIZIZ(57.0f);
            if (iLJIJ < iLIZIZ) {
                iLJIJ = iLIZIZ;
            }
            if (LinkMicBugFixLayoutContainerSizeSetting.INSTANCE.isEnable()) {
                rect2 = new Rect(rect);
                rect2.bottom = rect.bottom - iLJIJ;
            } else if (C500260Jjc.LJJIL() && LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
                rect2 = new Rect(rect);
                rect2.bottom = rect.bottom - iLJIJ;
            } else {
                rect2 = new Rect(rect);
                rect2.top = rect.top - iLJIJ;
                rect2.bottom = rect.bottom - iLJIJ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getRectAfterFOVOpt, topHeight = ");
            sbLIZ.append(iLJIJ);
            sbLIZ.append(", changedRect = ");
            sbLIZ.append(rect2);
            C20441214yg.LIZIZ("MultiGuestAnchorViewTopMarginHelper", C2188811AlT.LIZIZ(sbLIZ));
            return rect2;
        }
        DataChannelGlobal.LLILZ.FQ2(MultiGuestFullScreenEvent.class, Boolean.FALSE);
        return rect;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(X.C957020b0m r5, X.InterfaceC920220a3Q r6, android.content.Context r7, boolean r8) {
        /*
            java.util.List r0 = r6.LJIIIZ()
            java.util.Iterator r3 = r0.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lbf
            java.lang.Object r1 = r3.next()
            X.0b0m r1 = (X.C957020b0m) r1
            X.0ZwL r0 = r1.getShapeDescriptor()
            android.graphics.Rect r0 = r0.LIZ
            int r4 = r0.width()
            X.0ZwL r0 = r1.getShapeDescriptor()
            android.graphics.Rect r0 = r0.LIZ
            int r0 = r0.height()
            int r4 = r4 * r0
        L29:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r2 = r3.next()
            X.0b0m r2 = (X.C957020b0m) r2
            X.0ZwL r0 = r2.getShapeDescriptor()
            android.graphics.Rect r0 = r0.LIZ
            int r1 = r0.width()
            X.0ZwL r0 = r2.getShapeDescriptor()
            android.graphics.Rect r0 = r0.LIZ
            int r0 = r0.height()
            int r0 = r0 * r1
            if (r4 >= r0) goto L29
            r4 = r0
            goto L29
        L4e:
            X.0ZwL r0 = r5.getShapeDescriptor()
            android.graphics.Rect r0 = r0.LIZ
            int r3 = r0.width()
            X.0ZwL r0 = r5.getShapeDescriptor()
            android.graphics.Rect r0 = r0.LIZ
            int r0 = r0.height()
            int r3 = r3 * r0
            r5 = 1
            if (r8 == 0) goto Lbd
            X.01GW<X.0aFK> r0 = X.C927600aFK.LIZIZ
            X.0aFK r0 = X.C307001Gy.LIZ()
            r0.getClass()
            r1 = 7
            boolean r0 = X.C01ZD.LIZ(r1)
            if (r0 == 0) goto Lbd
            int r0 = r6.getPanelLayoutType()
            if (r0 != r1) goto Lbd
            int r0 = X.C14KS.LJFF()
            int r1 = r0 * 16
            int r0 = X.C14KS.LIZJ(r7)
            int r0 = r0 * 9
            if (r1 >= r0) goto Lbd
            if (r3 < r4) goto Lbd
            r2 = 1
        L8d:
            boolean r0 = r6.LJJIIZ()
            if (r0 != 0) goto Lbc
            boolean r0 = r6.LJ()
            if (r0 == 0) goto Lb9
            boolean r0 = r6.LJI()
            if (r0 != 0) goto Lb9
            int r0 = X.C14KS.LJFF()
            int r1 = r0 * 16
            int r0 = X.C14KS.LIZJ(r7)
            int r0 = r0 * 9
            if (r1 >= r0) goto Lb9
            boolean r0 = com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt.currentUserIsAnchor()
            boolean r0 = X.C932490aND.LIZ(r0)
            if (r0 == 0) goto Lbc
            if (r3 >= r4) goto Lbc
        Lb9:
            if (r2 != 0) goto Lbc
            r5 = 0
        Lbc:
            return r5
        Lbd:
            r2 = 0
            goto L8d
        Lbf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C941460abg.LIZIZ(X.0b0m, X.0a3Q, android.content.Context, boolean):boolean");
    }
}
