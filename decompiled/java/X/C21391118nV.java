package X;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.IStorySafCompatAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.anim.IStoryDetailMorphAnimationAvatarAbility;
import com.ss.android.ugc.aweme.story.experiment.feed.StoryInboxAvatarMorphConfig;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18nV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21391118nV {
    public static final EnumC992320bvi LJFF(View view, String str) {
        Fragment fragmentLIZ;
        FragmentManager childFragmentManager;
        Fragment fragmentLJJJJZI;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        IViewPagerComponentAbility iViewPagerComponentAbility;
        C0SZ8 c0sz8LJLIL;
        InterfaceC494301wD interfaceC494301wDLIZ;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        String currentUid;
        View view2;
        View view3;
        View view4;
        EnumC992320bvi enumC992320bvi;
        View view5;
        Boolean boolValueOf;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        C21391218nW.LIZIZ(str);
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        Boolean boolValueOf2 = null;
        if (iDetailFeedSafService != null && (fragmentLIZ = iDetailFeedSafService.LIZ(view)) != null && (childFragmentManager = fragmentLIZ.getChildFragmentManager()) != null && (fragmentLJJJJZI = childFragmentManager.LJJJJZI("storyDetailFragment")) != null && (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragmentLJJJJZI)) != null && (iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IViewPagerComponentAbility.class, null)) != null && (c0sz8LJLIL = iViewPagerComponentAbility.LJLIL()) != null) {
            if (!(c0sz8LJLIL instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, IStoryDetailMorphAnimationAvatarAbility.class, null)) == null) {
                C0SZ8 c0sz8LLJLLL = c0sz8LJLIL.LLJLLL();
                if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                    interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, IStoryDetailMorphAnimationAvatarAbility.class, null);
                } else {
                    interfaceC494301wDLIZ = null;
                }
            }
            IStoryDetailMorphAnimationAvatarAbility iStoryDetailMorphAnimationAvatarAbility = (IStoryDetailMorphAnimationAvatarAbility) interfaceC494301wDLIZ;
            if (iStoryDetailMorphAnimationAvatarAbility != null && (currentUid = iStoryDetailMorphAnimationAvatarAbility.getCurrentUid()) != null) {
                View viewHy1 = iStoryDetailMorphAnimationAvatarAbility.Hy1();
                if (viewHy1 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(viewHy1.getWidth());
                    sbLIZ.append('x');
                    sbLIZ.append(viewHy1.getHeight());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                C21391318nX c21391318nXLIZIZ = C21391218nW.LIZIZ(str);
                if (c21391318nXLIZIZ != null) {
                    if (viewHy1 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(viewHy1.getWidth());
                        sbLIZ2.append('x');
                        sbLIZ2.append(viewHy1.getHeight());
                        sbLIZ2.append(", attached=");
                        sbLIZ2.append(viewHy1.isAttachedToWindow());
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    c21391318nXLIZIZ.LIZLLL();
                    StoryInboxAvatarMorphConfig storyInboxAvatarMorphConfig = (StoryInboxAvatarMorphConfig) C309130C9v.LIZ.getValue();
                    if (storyInboxAvatarMorphConfig == null || !storyInboxAvatarMorphConfig.translucent) {
                        C1600300rkK.LIZIZ.LIZ(currentUid);
                    }
                    C786940Utw c786940UtwLJII = C1600300rkK.LIZIZ.LJII(currentUid);
                    if (c786940UtwLJII != null) {
                        view2 = c786940UtwLJII.LIZ;
                        view3 = c786940UtwLJII.LIZIZ;
                        view4 = c786940UtwLJII.LIZJ;
                    } else {
                        view2 = null;
                        view3 = null;
                        view4 = null;
                    }
                    Objects.toString(view2);
                    Objects.toString(view3);
                    if (view2 != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(", circleSize=");
                        sbLIZ3.append(view2.getWidth());
                        sbLIZ3.append('x');
                        sbLIZ3.append(view2.getHeight());
                        sbLIZ3.append(", attached=");
                        if (view3 != null) {
                            boolValueOf = Boolean.valueOf(view3.isAttachedToWindow());
                        } else {
                            boolValueOf = null;
                        }
                        sbLIZ3.append(boolValueOf);
                        C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    Objects.toString(view4);
                    if (Intrinsics.LJFF(currentUid, c21391318nXLIZIZ.LJIIJ)) {
                        if (view2 != null && view3 != null && view3.isAttachedToWindow()) {
                            if (!c21391318nXLIZIZ.LIZIZ(view2, view3, view4, viewHy1)) {
                                enumC992320bvi = EnumC992320bvi.NOT_FOUND;
                            } else {
                                enumC992320bvi = EnumC992320bvi.SAME_UID_NEW_POS;
                            }
                        } else {
                            WeakReference<View> weakReference = c21391318nXLIZIZ.LIZLLL;
                            if (weakReference != null) {
                                view5 = weakReference.get();
                            } else {
                                view5 = null;
                            }
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("refreshForExit: same uid, skylight not found. oldCircle=");
                            sbLIZ4.append(view5);
                            sbLIZ4.append(", attached=");
                            if (view5 != null) {
                                boolValueOf2 = Boolean.valueOf(view5.isAttachedToWindow());
                            }
                            sbLIZ4.append(boolValueOf2);
                            C2188811AlT.LIZIZ(sbLIZ4);
                            if (view5 != null && view5.isAttachedToWindow()) {
                                int[] iArr = new int[2];
                                view5.getLocationOnScreen(iArr);
                                Rect rect = c21391318nXLIZIZ.LIZIZ;
                                int i = iArr[0];
                                rect.set(i, iArr[1], view5.getWidth() + i, iArr[1] + view5.getHeight());
                                enumC992320bvi = EnumC992320bvi.SAME_UID_NEW_POS;
                            } else {
                                enumC992320bvi = EnumC992320bvi.NOT_FOUND;
                            }
                        }
                    } else if (view2 == null || view3 == null || !view3.isAttachedToWindow() || !c21391318nXLIZIZ.LIZIZ(view2, view3, view4, viewHy1)) {
                        enumC992320bvi = EnumC992320bvi.NOT_FOUND;
                    } else {
                        c21391318nXLIZIZ.LJIIJ = currentUid;
                        enumC992320bvi = EnumC992320bvi.NEW_UID_FOUND;
                    }
                    if (enumC992320bvi != null) {
                        return enumC992320bvi;
                    }
                }
                return EnumC992320bvi.NOT_FOUND;
            }
        }
        return EnumC992320bvi.NOT_FOUND;
    }

    public static final C21389018nA LJ(C21391718nb c21391718nb, boolean z, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10 = 0.0f;
        if (z) {
            f2 = c21391718nb.LJFF;
            f3 = 0.0f;
            f4 = c21391718nb.LJI;
            f5 = c21391718nb.LJII;
        } else {
            f2 = 0.0f;
            f3 = c21391718nb.LJFF;
            f4 = c21391718nb.LJII;
            f5 = c21391718nb.LJI;
        }
        float f11 = 1.0f;
        if (z) {
            f6 = c21391718nb.LIZ;
        } else {
            f6 = 1.0f;
            f11 = c21391718nb.LIZ;
        }
        float f12 = f6 + ((f11 - f6) * f);
        if (z) {
            f7 = c21391718nb.LIZIZ;
            f8 = 0.0f;
        } else {
            f7 = 0.0f;
            f8 = c21391718nb.LIZIZ;
        }
        float f13 = ((f8 - f7) * f) + f7;
        if (z) {
            f9 = c21391718nb.LIZJ;
        } else {
            f9 = 0.0f;
            f10 = c21391718nb.LIZJ;
        }
        return new C21389018nA(f12, f13, f9 + ((f10 - f9) * f), f2 + ((f3 - f2) * f), f4 + ((f5 - f4) * f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.animation.Animator LIZ(android.view.View r24, android.view.View r25, final java.lang.String r26, final boolean r27, final boolean r28) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21391118nV.LIZ(android.view.View, android.view.View, java.lang.String, boolean, boolean):android.animation.Animator");
    }

    public static final void LIZIZ(C21391018nU c21391018nU, C21391718nb c21391718nb, boolean z, C21390118nL c21390118nL, float f) {
        if (c21391018nU == null) {
            return;
        }
        C21389018nA c21389018nALJ = LJ(c21391718nb, z, f);
        c21390118nL.setPivotX(0.0f);
        c21390118nL.setPivotY(0.0f);
        float f2 = c21389018nALJ.LIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21390118nL);
        c21390118nL.setScaleX(f2);
        float f3 = c21389018nALJ.LIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21390118nL);
        c21390118nL.setScaleY(f3);
        float f4 = c21389018nALJ.LIZIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21390118nL);
        c21390118nL.setTranslationX(f4);
        float f5 = c21389018nALJ.LIZJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21390118nL);
        c21390118nL.setTranslationY(f5);
        int iLJ = C13LZ.LJ(C814420VxA.LIZIZ(c21389018nALJ.LJ), 0, c21391718nb.LJ);
        float fMin = Math.min(iLJ, c21391718nb.LIZLLL) / 2.0f;
        float f6 = c21389018nALJ.LIZLLL;
        if (f6 <= fMin) {
            fMin = f6;
        }
        c21391018nU.LIZ = c21391718nb.LIZLLL;
        c21391018nU.LIZIZ = iLJ;
        c21391018nU.LIZJ = fMin;
        c21390118nL.invalidateOutline();
    }

    public static final Animator LIZJ(View view, View view2, String str, boolean z, boolean z2) {
        InterfaceC21392018ne c21389518nF;
        C21391318nX c21391318nXRemove;
        if (z) {
            if (str != null && (c21391318nXRemove = C21391218nW.LIZ.remove(str)) != null) {
                C21391618na c21391618na = c21391318nXRemove.LJIIIZ;
                if (c21391618na != null) {
                    c21391618na.LIZIZ.setImageBitmap(null);
                    c21391618na.LIZIZ();
                }
                c21391318nXRemove.LJIIIZ = null;
                c21391318nXRemove.LIZJ = null;
                c21391318nXRemove.LIZLLL = null;
                c21391318nXRemove.LJFF = null;
                Bitmap bitmap = c21391318nXRemove.LIZ;
                if (bitmap != null) {
                    bitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                }
                c21391318nXRemove.LIZ = null;
                c21391318nXRemove.LIZIZ.setEmpty();
                c21391318nXRemove.LJIIJ = null;
                c21391318nXRemove.LJII = 0.0f;
                c21391318nXRemove.LJIIIIZZ = 0.0f;
            }
        } else {
            C21391218nW.LIZJ(str);
        }
        if (z2) {
            c21389518nF = new C21389418nE();
        } else {
            c21389518nF = new C21389518nF(false);
        }
        if (z) {
            return c21389518nF.LIZIZ(view, view2);
        }
        return c21389518nF.LIZ(view, view2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZLLL(View view, InterfaceC21389118nB interfaceC21389118nB, C21390118nL c21390118nL, String str, C259800zU c259800zU, boolean z, boolean z2) {
        C21391318nX c21391318nXLIZIZ;
        C21390118nL c21390118nL2;
        Fragment fragmentLIZ;
        IStorySafCompatAbility iStorySafCompatAbility;
        if (!z) {
            try {
                c21390118nL.setClipToOutline(false);
                c21390118nL.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!z2 && (c21391318nXLIZIZ = C21391218nW.LIZIZ(str)) != null) {
                    c21391318nXLIZIZ.LIZLLL();
                }
                throw th;
            }
        }
        if (z2) {
            C21391618na c21391618na = (C21391618na) c259800zU.element;
            if (c21391618na != null) {
                c21391618na.LIZIZ.setImageBitmap(null);
                c21391618na.LIZIZ();
            }
            c259800zU.element = null;
            C21391318nX c21391318nXLIZIZ2 = C21391218nW.LIZIZ(str);
            if (c21391318nXLIZIZ2 != null) {
                C21391618na c21391618na2 = c21391318nXLIZIZ2.LJIIIZ;
                if (c21391618na2 != null) {
                    c21391618na2.LIZIZ.setImageBitmap(null);
                    c21391618na2.LIZIZ();
                }
                c21391318nXLIZIZ2.LJIIIZ = null;
            }
            if (interfaceC21389118nB == null || c21390118nL.getRenderNodeDriver() == interfaceC21389118nB) {
                c21390118nL.setRenderNodeDriver(null);
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21390118nL);
            c21390118nL.setScaleX(1.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21390118nL);
            c21390118nL.setScaleY(1.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21390118nL);
            c21390118nL.setTranslationX(0.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21390118nL);
            c21390118nL.setTranslationY(0.0f);
            C786410Ut5.S5(c21390118nL, 1.0f);
            c21390118nL.setClipToOutline(false);
            c21390118nL.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            C21391318nX c21391318nXLIZIZ3 = C21391218nW.LIZIZ(str);
            if (c21391318nXLIZIZ3 != null) {
                c21391318nXLIZIZ3.LIZLLL();
            }
            if (view instanceof C21390118nL) {
                c21390118nL2 = (C21390118nL) view;
            } else {
                c21390118nL2 = (C21390118nL) view.findViewById(R.id.tyd);
            }
            if (c21390118nL2 != null) {
                c21390118nL2.setTag(R.id.w9y, Boolean.TRUE);
            }
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService != null && (fragmentLIZ = iDetailFeedSafService.LIZ(view)) != null && (iStorySafCompatAbility = (IStorySafCompatAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), IStorySafCompatAbility.class, null)) != null) {
                iStorySafCompatAbility.j12();
                return;
            }
            return;
        }
        if (z && (interfaceC21389118nB == null || c21390118nL.getRenderNodeDriver() == interfaceC21389118nB)) {
            c21390118nL.setRenderNodeDriver(null);
        }
        C21391618na c21391618na3 = (C21391618na) c259800zU.element;
        if (c21391618na3 != null) {
            c21391618na3.LIZJ(1.0f);
        }
        C21391318nX c21391318nXLIZIZ4 = C21391218nW.LIZIZ(str);
        if (c21391318nXLIZIZ4 != null) {
            c21391318nXLIZIZ4.LIZLLL();
        }
        C21391618na c21391618na4 = (C21391618na) c259800zU.element;
        if (c21391618na4 != null) {
            c21391618na4.LIZIZ.setImageBitmap(null);
            c21391618na4.LIZIZ();
        }
        c259800zU.element = null;
        C21391318nX c21391318nXLIZIZ5 = C21391218nW.LIZIZ(str);
        if (c21391318nXLIZIZ5 != null) {
            C21391618na c21391618na5 = c21391318nXLIZIZ5.LJIIIZ;
            if (c21391618na5 != null) {
                c21391618na5.LIZIZ.setImageBitmap(null);
                c21391618na5.LIZIZ();
            }
            c21391318nXLIZIZ5.LJIIIZ = null;
        }
        C339190DRl.LIZIZ(view);
        C21391218nW.LIZJ(str);
        C21391318nX c21391318nXLIZIZ6 = C21391218nW.LIZIZ(str);
        if (c21391318nXLIZIZ6 != null) {
            c21391318nXLIZIZ6.LIZLLL();
        }
    }
}
