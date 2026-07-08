package X;

import X.C1766560w4U;
import X.C301730BsB;
import Y.AObserverS170S0200000_5;
import android.app.Activity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.sheet.BaseSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import nv7.c0;

/* JADX INFO: renamed from: X.0EHK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EHK {
    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel) {
        int i;
        EnumC357850E1f enumC357850E1f = EnumC357850E1f.ENABLE_PIP_VIDEO_ANIMATION_CONFIG;
        C0E5G.LIZJ(enumC357850E1f, 0);
        int iIntValue = ((Number) C0E5G.LIZIZ(enumC357850E1f, 0)).intValue();
        C363500EMy.LIZ.getClass();
        if (C363500EMy.LJIIJ(videoPublishEditModel)) {
            i = (iIntValue & (-3)) | 2;
        } else {
            i = (iIntValue & (-17)) | 8;
        }
        C0E5G.LIZ.LIZ(enumC357850E1f, Integer.valueOf(i));
    }

    public static final void LJFF(C19EG c19eg) {
        Integer numLIZJ;
        if (c19eg != null && (numLIZJ = C1308910kAL.LIZJ(C0EGL.LIZ(), c19eg)) != null) {
            int iIntValue = numLIZJ.intValue();
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19eg);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, immersionBarLJIILJJIL);
            tuxImmersionBar.LIZJ(false, true);
            tuxImmersionBar.LJFF(iIntValue);
            immersionBarLJIILJJIL.LJIIL();
            tuxImmersionBar.LIZLLL();
        }
    }

    public static final void LJI(final BaseSheet baseSheet) {
        if (baseSheet == null) {
            return;
        }
        if (baseSheet.getActivity() == null) {
            baseSheet.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.gamora.editorpro.startup.logic.UtilsKt$hideStatusBar$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_RESUME) {
                        onResume();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                public final void onResume() {
                    if (C301730BsB.LIZ()) {
                        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(baseSheet, false);
                        tuxImmersionBarLIZJ.LIZJ(false, true);
                        tuxImmersionBarLIZJ.LIZIZ.LJIIL();
                        tuxImmersionBarLIZJ.LIZLLL();
                    }
                }
            });
            return;
        }
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(baseSheet, false);
        tuxImmersionBarLIZJ.LIZJ(false, true);
        tuxImmersionBarLIZJ.LIZIZ.LJIIL();
        tuxImmersionBarLIZJ.LIZLLL();
    }

    public static final void LJII(C19EG c19eg) {
        C365800EVu.LIZ.LIZ(c19eg.getApplication());
        C0EHM.LIZ = C786410Ut5.P3(c19eg);
    }

    public static final void LJIIJJI(C19EG c19eg) {
        int i;
        if (c19eg == null) {
            return;
        }
        C21146717pB.LIZJ(c19eg, R.layout.fx1);
        C21146717pB.LIZJ(c19eg, R.layout.c1j);
        C21146717pB.LIZJ(c19eg, R.layout.c0g);
        if (C357780E0y.LIZ()) {
            i = R.layout.wb;
        } else {
            i = R.layout.wa;
        }
        C21146717pB.LIZJ(c19eg, i);
        C21146717pB.LIZJ(c19eg, R.layout.d3u);
    }

    public static final void LJIIL(C19EG c19eg) {
        if (c19eg == null) {
            return;
        }
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19eg);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, immersionBarLJIILJJIL);
        tuxImmersionBar.LIZJ(false, false);
        immersionBarLJIILJJIL.LJIIL();
        tuxImmersionBar.LIZLLL();
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        int i;
        EnumC357850E1f enumC357850E1f = EnumC357850E1f.ENABLE_PIP_VIDEO_ANIMATION_CONFIG;
        int i2 = 0;
        int iIntValue = ((Number) C0E5G.LIZIZ(enumC357850E1f, 0)).intValue();
        C363500EMy.LIZ.getClass();
        boolean z = true;
        if (C363500EMy.LJIIJ(videoPublishEditModel)) {
            if (((Boolean) C0AYC.LIZ.getValue()).booleanValue() || C357540E0a.LJIILJJIL(nLEModel) || C357540E0a.LJJIIJ(nLEModel)) {
                i2 = 1;
            }
            i = iIntValue & (-2);
        } else {
            if (!((Boolean) C273690Ao3.LIZ.getValue()).booleanValue() && !C357540E0a.LJIILJJIL(nLEModel) && !C357540E0a.LJJIIJ(nLEModel)) {
                z = false;
            }
            i = iIntValue & (-2);
            if (z) {
                i2 = 4;
            }
        }
        C0E5G.LIZ.LIZ(enumC357850E1f, Integer.valueOf(i | i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3, com.bytedance.ies.nle.editor_jni.NLEModel r4) {
        /*
            X.0EMy r0 = X.C363500EMy.LIZ
            r0.getClass()
            boolean r0 = X.C363500EMy.LJIIJ(r3)
            r3 = 1
            if (r0 != 0) goto L57
            boolean r0 = X.C0BYP.LIZ()
            if (r0 != 0) goto L57
            if (r4 == 0) goto L5d
            com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r0 = r4.getTracks()
            if (r0 == 0) goto L5d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L23:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = (com.bytedance.ies.nle.editor_jni.NLETrack) r0
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r0.getSlots()
            X.C19719612Di.LJJI(r0, r2)
            goto L23
        L37:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L5d
            java.util.Iterator r1 = r2.iterator()
        L41:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r0.getKeyframes()
            int r0 = r0.size()
            if (r0 <= 0) goto L41
        L57:
            X.0E1f r0 = X.EnumC357850E1f.ENABLE_KEY_FRAME
            X.C0E5G.LIZLLL(r0, r3)
            return
        L5d:
            r3 = 0
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EHK.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLEModel):void");
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        int i;
        int i2;
        EnumC357850E1f enumC357850E1f = EnumC357850E1f.ENABLE_SWING_PROPERTY_KEYFRAME;
        int iIntValue = ((Number) C0E5G.LIZIZ(enumC357850E1f, 0)).intValue();
        C363500EMy.LIZ.getClass();
        int i3 = 2;
        if (C363500EMy.LJIIJ(videoPublishEditModel)) {
            int i4 = iIntValue & (-2);
            if (!C0BVZ.LIZ(2, C0CIJ.UGC_SWING_KEYFRAME) && !C0BVZ.LIZ(2, C0CIJ.UGC_MASK) && !C357540E0a.LJJIIZI(nLEModel) && !C357540E0a.LJJIIZ(nLEModel)) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            i = i4 | i2;
        } else {
            int i5 = iIntValue & (-3);
            if (!C0BVZ.LIZ(1, C0CIJ.UGC_SWING_KEYFRAME) && !C0BVZ.LIZ(1, C0CIJ.UGC_MASK) && !C357540E0a.LJJIIZI(nLEModel) && !C357540E0a.LJJIIZ(nLEModel)) {
                i3 = 0;
            }
            i = i5 | i3;
        }
        C0E5G.LIZ.LIZ(enumC357850E1f, Integer.valueOf(i));
        if (i == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc A[PHI: r6
      0x00dc: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v5 java.lang.String) binds: [B:41:0x00cd, B:46:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIZ(com.bytedance.ies.nle.editor_jni.NLEModel r12, X.C19EG r13) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EHK.LJIIIZ(com.bytedance.ies.nle.editor_jni.NLEModel, X.19EG):void");
    }

    public static final <T> void LJIIJ(LiveData<T> liveData, LifecycleOwner lifecycleOwner, Observer<T> observer) {
        liveData.observe(lifecycleOwner, new AObserverS170S0200000_5(liveData, observer, 42));
    }

    public static final int LJ(int i, Activity activity, boolean z, boolean z2) {
        int iLIZJ = 0;
        if (z && !z2) {
            return 0;
        }
        if (C297330Bl5.LIZ() == 0 || C297330Bl5.LIZ() == 1 || !C357540E0a.LJIILLIIL(activity)) {
            iLIZJ = C497820Jfg.LIZJ(activity);
        }
        c0 c0Var = c0.LIZ;
        int iN2 = (i + iLIZJ) - c0Var.n2();
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" navbar height: ");
        sbLIZ.append(i);
        sbLIZ.append(" statusbar height: ");
        sbLIZ.append(iLIZJ);
        sbLIZ.append(" surface topmargin: ");
        sbLIZ.append(c0Var.n2());
        sbLIZ.append(", marginTop cal: ");
        sbLIZ.append(iN2);
        C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
        return iN2;
    }

    public static final void LJIIIIZZ(InterfaceC359850E8x interfaceC359850E8x, C0EGH c0egh, VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        if (C363740ENw.LJII(videoPublishEditModel, nLEModel)) {
            if (interfaceC359850E8x != null) {
                interfaceC359850E8x.LJIIIZ("bottom_item_root_caption");
                interfaceC359850E8x.LJIIIZ("bottom_item_text_captions");
            }
            if (c0egh != null && c0egh.LJIIL && c0egh.LJ().LIZLLL()) {
                c0egh.LJ().LJI(c0egh.LJFF(false));
                return;
            }
            return;
        }
        if (interfaceC359850E8x != null) {
            interfaceC359850E8x.LJIILLIIL("bottom_item_root_caption");
            interfaceC359850E8x.LJIILLIIL("bottom_item_text_captions");
        }
        if (c0egh == null || !c0egh.LJIIL || !c0egh.LJ().LIZLLL()) {
            return;
        }
        c0egh.LJ().LJI(c0egh.LJFF(true));
    }
}
