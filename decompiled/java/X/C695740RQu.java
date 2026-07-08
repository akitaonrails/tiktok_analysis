package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0RQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695740RQu {
    public static final View LIZ(View view) {
        int id = view.getId();
        String str = C0RPZ.LJIIJJI;
        if (id == R.id.elx) {
            FeedBottomButtonContainer.LLLLIIIILLL.getClass();
            return view.findViewById(FeedBottomButtonContainer.LLLLIILL);
        }
        if (id == R.id.elt) {
            FcpMetaTagContainer.LLLIL.getClass();
            return view.findViewById(FcpMetaTagContainer.LLLILZJ);
        }
        VideoTagContainer.LLLJ.getClass();
        if (id == VideoTagContainer.LLLJL) {
            return view.findViewById(VideoTagContainer.LLLL);
        }
        return view;
    }

    public static final GlobalComponentData LIZIZ(View view) {
        C699090RbX c699090RbX;
        Object objLIZLLL = LIZLLL(C700100RdA.LJII, view);
        if ((objLIZLLL instanceof C699090RbX) && (c699090RbX = (C699090RbX) objLIZLLL) != null) {
            return c699090RbX.LLILLJJLI;
        }
        int id = view.getId();
        String str = C0RPZ.LJIIJJI;
        if (id == R.id.elm) {
            return new GlobalComponentData(null, 1, "bottom_tag_container", "", 0, null);
        }
        int id2 = view.getId();
        String str2 = C0RPZ.LJIIJJI;
        if (id2 == R.id.elz) {
            return new GlobalComponentData(null, 1, "title_container", "", 0, null);
        }
        int id3 = view.getId();
        String str3 = C0RPZ.LJIIJJI;
        if (id3 != R.id.ekj) {
            return null;
        }
        return new GlobalComponentData(null, 1, "annotation_container", "", 0, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (r4 != null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig LIZJ(android.view.View r7, boolean r8) {
        /*
            r3 = 2131368271(0x7f0a194f, float:1.8356487E38)
            java.lang.Object r1 = LIZLLL(r3, r7)
            boolean r0 = r1 instanceof com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig
            r6 = 0
            if (r0 == 0) goto L11
            com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig r1 = (com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig) r1
            if (r1 == 0) goto L11
            return r1
        L11:
            com.ss.android.ugc.aweme.feed.model.GlobalComponentData r5 = LIZIZ(r7)
            X.01GW r0 = X.C695730RQt.LIZ
            if (r5 == 0) goto L8b
            java.lang.String r4 = r5.getComponentKey()
            java.lang.String r2 = r5.getMatchedContainerKey()
        L21:
            com.ss.android.ugc.feed.platform.ab.UnifyComponentsMarginConfig r1 = X.C695730RQt.LIZIZ
            if (r1 == 0) goto L8e
            com.ss.android.ugc.feed.platform.ab.FeedComponentsMarginConfig r0 = r1.componentsMarginConfig
            if (r0 == 0) goto L37
            java.util.Map<java.lang.String, com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig> r0 = r0.componentCustomConfig
            if (r0 == 0) goto L37
            java.lang.Object r4 = r0.get(r4)
            com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig r4 = (com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig) r4
            if (r4 != 0) goto L51
            if (r1 == 0) goto L8e
        L37:
            com.ss.android.ugc.feed.platform.ab.FeedComponentsMarginConfig r0 = r1.componentsMarginConfig
            if (r0 == 0) goto L49
            java.util.Map<java.lang.String, com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig> r0 = r0.containerCustomConfig
            if (r0 == 0) goto L49
            java.lang.Object r4 = r0.get(r2)
            com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig r4 = (com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig) r4
            if (r4 != 0) goto L51
            if (r1 == 0) goto L8e
        L49:
            com.ss.android.ugc.feed.platform.ab.FeedComponentsMarginConfig r0 = r1.componentsMarginConfig
            if (r0 == 0) goto L8e
            com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig r4 = r0.leftContainerCommonSpace
            if (r4 == 0) goto L8e
        L51:
            int r1 = r7.getId()
            java.lang.String r0 = X.C0RPZ.LJIIJJI
            r0 = 2131368266(0x7f0a194a, float:1.8356477E38)
            if (r1 != r0) goto L74
            float r2 = r4.topGap
            float r1 = r4.bottomGap
            int r0 = com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM.LLILZLL
            float r0 = (float) r0
            float r1 = r1 - r0
            com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig r4 = r4.copy(r1, r2)
        L68:
            if (r5 == 0) goto L73
            java.lang.String r0 = r5.getComponentKey()
            if (r0 == 0) goto L73
            LJ(r3, r7, r4)
        L73:
            return r4
        L74:
            if (r8 != 0) goto L68
            int r1 = r7.getId()
            r0 = 2131368275(0x7f0a1953, float:1.8356495E38)
            if (r1 != r0) goto L68
            float r2 = r4.topGap
            float r1 = r4.bottomGap
            r0 = 4
            float r0 = (float) r0
            float r1 = r1 - r0
            com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig r4 = r4.copy(r1, r2)
            goto L68
        L8b:
            r4 = r6
            r2 = r6
            goto L21
        L8e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C695740RQu.LIZJ(android.view.View, boolean):com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig");
    }

    public static final Object LIZLLL(int i, View view) {
        try {
            return view.getTag(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("View getTag error: ");
            sbLIZ.append(e.getMessage());
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static final void LJ(int i, View view, Object obj) {
        try {
            view.setTag(i, obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("View setTag error: ");
            sbLIZ.append(e.getMessage());
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
