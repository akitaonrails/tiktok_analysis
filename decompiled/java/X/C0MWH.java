package X;

import Y.ARunnableS2S1400000_8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MWH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MWH {
    public static final C0MWH LIZ = new C0MWH();

    public static void LJIJJ(Context context) {
        Activity activityLIZ;
        if (((Boolean) C277350Atx.LIZ.getValue()).booleanValue() && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C786410Ut5.ae(0, activityLIZ, 0);
        }
    }

    public static void LIZIZ(Context context, Bundle bundle) {
        C1411560mpu.LIZIZ = false;
        bundle.putInt("extra_request_code", 12359);
        LJIIL(context, bundle, "AILivePromptDependencyRootScene", null, 12359, null, false, 104);
    }

    public static void LJFF(Context context, Bundle bundle) {
        LJIIL(context, bundle, "MagicTaskLoadingContainerScene", null, null, null, false, 96);
    }

    public static final void LJI(Context context, Bundle bundle) {
        Bundle bundle2 = bundle;
        C1411560mpu.LIZIZ = false;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        LJIIL(context, bundle2, "ImageEditRootScene", null, Integer.valueOf(bundle2.getInt("extra_request_code", 1002)), null, false, 104);
    }

    public static final void LJIILIIL(Context context, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        LJIIL(context, bundle2, "TextToImageScene", null, null, null, false, 120);
    }

    public static final void LJIILL(Context context, Bundle bundle) {
        Bundle bundle2 = bundle;
        C1411560mpu.LIZIZ = false;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        LJIIL(context, bundle2, "VideoEditContainerScene", null, null, null, false, 120);
    }

    public static final void LJIILLIIL(Context context, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        int i = bundle2.getInt("extra_request_code", 1002);
        C1411560mpu.LIZIZ = false;
        LJIIL(context, bundle2, "VideoEditContainerScene", null, Integer.valueOf(i), null, false, 104);
    }

    public static boolean LJIJI(Context context, Bundle bundle) {
        String string;
        if (!C300010BpP.LIZ() || !C297150Bkn.LIZ()) {
            return false;
        }
        if (bundle != null) {
            string = bundle.getString("shoot_way");
        } else {
            string = null;
        }
        if (!Intrinsics.LJFF("direct_shoot", string) || !(context instanceof InterfaceC1711206n0) || bundle.getInt("restore", 0) != 0) {
            return false;
        }
        return true;
    }

    public static void LJIJJLI(InterfaceC20597015ii interfaceC20597015ii, String str) {
        Scene scene;
        NavigationScene navigationScene = interfaceC20597015ii.getNavigationScene();
        if (navigationScene != null) {
            navigationScene.LLLJL();
        }
        List<Scene> listKI = interfaceC20597015ii.kI();
        int size = listKI.size() - 1;
        while (true) {
            if (-1 >= size || (scene = (Scene) C13LP.LJJJLZIJ(size, listKI)) == null) {
                break;
            }
            if (!Intrinsics.LJFF(scene.getClass().getSimpleName(), str)) {
                size--;
            } else if (scene instanceof AbstractC214814194y) {
                int i = C0MWM.LIZ[((AbstractC214814194y) scene).getLaunchMode().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new C1954807lC();
                            }
                        } else {
                            return;
                        }
                    } else if (size == listKI.size() - 1) {
                        return;
                    }
                }
            }
        }
        List<Fragment> listLJJLIIIJL = interfaceC20597015ii.getSupportFragmentManager().LJJLIIIJL();
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : listLJJLIIIJL) {
            if (fragment instanceof DialogFragment) {
                arrayList.add(fragment);
            }
        }
        if (!arrayList.isEmpty()) {
            C19EH c19ehLJIIJ = interfaceC20597015ii.getSupportFragmentManager().LJIIJ();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c19ehLJIIJ.LJIIZILJ((Fragment) it2.next());
            }
            c19ehLJIIJ.LJIIL();
        }
    }

    public static C569760MWg LIZ(C569760MWg c569760MWg, final int i, final C198H c198h) {
        AbstractC214814194y abstractC214814194y;
        AbstractC214814194y abstractC214814194y2;
        if (c569760MWg == null) {
            c569760MWg = new C569760MWg();
        }
        final String str = null;
        str = null;
        final String str2 = null;
        final AbstractC214814194y abstractC214814194y3 = null;
        str = null;
        if (C214928199i.LIZIZ) {
            if ((c198h instanceof AbstractC214814194y) && (abstractC214814194y2 = (AbstractC214814194y) c198h) != null) {
                str2 = abstractC214814194y2.embeddedSceneId;
            }
            c569760MWg.LIZIZ = new AbstractC565380MFk(str2, i) { // from class: X.0MFg
                public final /* synthetic */ String LIZIZ;
                public final /* synthetic */ int LIZJ;

                /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
                @Override // X.InterfaceC363130ELn
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onResult(java.lang.Object r5) {
                    /*
                        r4 = this;
                        X.198H r3 = r4.LIZ
                        boolean r0 = r3 instanceof X.AbstractC214814194y
                        r2 = 0
                        if (r0 == 0) goto L16
                        X.194y r3 = (X.AbstractC214814194y) r3
                        if (r3 == 0) goto L17
                        java.lang.String r1 = r3.embeddedSceneId
                    Ld:
                        java.lang.String r0 = r4.LIZIZ
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 != 0) goto L19
                        return
                    L16:
                        r3 = r2
                    L17:
                        r1 = r2
                        goto Ld
                    L19:
                        if (r5 != 0) goto L24
                        if (r3 == 0) goto L23
                        int r1 = r4.LIZJ
                        r0 = 0
                        r3.onResult(r1, r0, r2)
                    L23:
                        return
                    L24:
                        boolean r0 = r5 instanceof X.C0MFN
                        if (r0 == 0) goto L23
                        X.0MFN r5 = (X.C0MFN) r5
                        if (r5 == 0) goto L23
                        int r2 = r4.LIZJ
                        if (r3 == 0) goto L23
                        int r1 = r5.LIZ
                        android.content.Intent r0 = r5.LIZIZ
                        r3.onResult(r2, r1, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C565340MFg.onResult(java.lang.Object):void");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super((Scene) this.LIZ);
                    this.LIZIZ = str2;
                    this.LIZJ = i;
                }
            };
            return c569760MWg;
        }
        if (!C293940Bfc.LIZ() && C289940BYa.LIZ() <= 0.0f) {
            if (c198h instanceof AbstractC214814194y) {
                abstractC214814194y3 = (AbstractC214814194y) c198h;
            }
            c569760MWg.LIZIZ = new InterfaceC363130ELn() { // from class: X.0MFi
                @Override // X.InterfaceC363130ELn
                public final void onResult(Object obj) {
                    C0MFN c0mfn;
                    if ((obj instanceof C0MFN) && (c0mfn = (C0MFN) obj) != null) {
                        AbstractC214814194y abstractC214814194y4 = abstractC214814194y3;
                        int i2 = i;
                        if (abstractC214814194y4 != null) {
                            abstractC214814194y4.onResult(i2, c0mfn.LIZ, c0mfn.LIZIZ);
                        }
                    }
                }
            };
            return c569760MWg;
        }
        if ((c198h instanceof AbstractC214814194y) && (abstractC214814194y = (AbstractC214814194y) c198h) != null) {
            str = abstractC214814194y.embeddedSceneId;
        }
        c569760MWg.LIZIZ = new InterfaceC363130ELn() { // from class: X.0MFh
            @Override // X.InterfaceC363130ELn
            public final void onResult(Object obj) {
                AbstractC214814194y abstractC214814194y4;
                C0MFN c0mfn;
                C198H c198h2 = c198h;
                String str3 = null;
                if (c198h2 instanceof AbstractC214814194y) {
                    abstractC214814194y4 = (AbstractC214814194y) c198h2;
                    if (abstractC214814194y4 != null) {
                        str3 = abstractC214814194y4.embeddedSceneId;
                    }
                } else {
                    abstractC214814194y4 = null;
                }
                if (Intrinsics.LJFF(str3, str) && (obj instanceof C0MFN) && (c0mfn = (C0MFN) obj) != null) {
                    int i2 = i;
                    if (abstractC214814194y4 != null) {
                        abstractC214814194y4.onResult(i2, c0mfn.LIZ, c0mfn.LIZIZ);
                    }
                }
            }
        };
        return c569760MWg;
    }

    public static void LIZJ(Context context, Bundle bundle, boolean z) {
        Integer num;
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (z) {
            num = 12360;
        } else {
            num = null;
        }
        LJIIL(context, bundle2, "AITheaterCreationScene", null, num, null, true, 40);
    }

    public static final void LJIIJJI(Context context, Bundle bundle, Integer num) {
        Bundle bundle2 = bundle;
        boolean zLJI = MethodIDManager.LJI(71737);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        LJIIL(context, bundle2, "VideoPublishContainerScene", null, num, null, false, 104);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LIZLLL(Context context, Bundle bundle, int i, Integer num) {
        String str;
        bundle.putInt("key_choose_request_code", i);
        if (bundle.getBoolean("key_ep_aigc_new_album_style", false)) {
            str = "EPAICreateSelectMaterialScene";
        } else {
            str = "SelectMaterialScene";
        }
        LJIIL(context, bundle, str, null, num, null, false, 104);
    }

    public static void LJ(Context context, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("creationId", str, bundle);
        if (str2 == null) {
            str2 = "";
        }
        C786410Ut5.LJJJI("themeName", str2, bundle);
        C786410Ut5.LJJJI("template_consume_loading_source", str3, bundle);
        LJIIL(context, bundle, "AutoPickLoadingRootScene", null, null, null, false, 104);
    }

    public static final void LJII(CreativeToolContainerScene creativeToolContainerScene, String str, Bundle bundle, C569760MWg c569760MWg) {
        NavigationScene navigationScene = creativeToolContainerScene.LLJLIL;
        if (navigationScene == null) {
            return;
        }
        C12WG.LIZJ(navigationScene, new ARunnableS2S1400000_8(bundle, navigationScene, creativeToolContainerScene, c569760MWg, str, 1));
    }

    public static final void LJIIIIZZ(SAAActivity sAAActivity, String str, Bundle bundle, C569760MWg c569760MWg) {
        NavigationScene navigationScene = sAAActivity.LLIZ;
        if (navigationScene == null) {
            return;
        }
        C12WG.LIZJ(navigationScene, new ARunnableS2S1400000_8(bundle, navigationScene, sAAActivity, c569760MWg, str, 2));
    }

    public static void LJIILJJIL(Context context, Bundle bundle, boolean z, int i) {
        boolean z2;
        boolean z3 = false;
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8) == 0) {
            z3 = z;
        }
        if (z2) {
            if (z3) {
                LJIIL(context, bundle, "CreationOnThisDayPreviewScene", null, null, null, false, 120);
                return;
            } else {
                LJIIL(context, bundle, "OnThisDayCardPreviewScene", null, null, null, false, 120);
                return;
            }
        }
        LJIIL(context, bundle, "OnThisDayVideoPreviewScene", null, null, null, false, 120);
    }

    public static final void LJIIZILJ(Context context, Bundle bundle, Bundle bundle2, Integer num) {
        String str;
        Bundle bundle3 = bundle;
        if (bundle3 == null) {
            bundle3 = new Bundle();
        }
        if (bundle3.containsKey("exterior_record_model")) {
            str = "ExteriorVideoRecordScene";
        } else if (bundle3.containsKey("social_record_model")) {
            str = "SocialVideoRecordScene";
        } else {
            LIZ.getClass();
            if (LJIJI(context, bundle3)) {
                str = "VideoLightRecordContainerScene";
            } else {
                str = "VideoRecordNewScene";
            }
        }
        LJIIL(context, bundle3, str, bundle2, num, null, false, 96);
    }

    public static void LJIJ(NavigationScene navigationScene, final C198H c198h, CreativeToolContainerScene creativeToolContainerScene, final int i, AbstractC214793194d abstractC214793194d) {
        if (creativeToolContainerScene instanceof Scene) {
            C569760MWg c569760MWg = new C569760MWg();
            c569760MWg.LIZIZ = new AbstractC565380MFk(i) { // from class: X.199J
                public final /* synthetic */ int LIZIZ;

                /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
                @Override // X.InterfaceC363130ELn
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onResult(java.lang.Object r5) {
                    /*
                        r4 = this;
                        boolean r0 = r5 instanceof X.C20630615o8
                        r3 = 0
                        if (r0 == 0) goto L17
                        X.15o8 r5 = (X.C20630615o8) r5
                        if (r5 == 0) goto L18
                        int r2 = r5.LIZ
                    Lb:
                        X.198H r1 = r4.LIZ
                        int r0 = r4.LIZIZ
                        if (r5 == 0) goto L13
                        android.content.Intent r3 = r5.LIZIZ
                    L13:
                        r1.onResult(r0, r2, r3)
                        return
                    L17:
                        r5 = r3
                    L18:
                        r2 = -1
                        goto Lb
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C199J.onResult(java.lang.Object):void");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super((Scene) this.LIZ);
                    this.LIZIZ = i;
                }
            };
            c569760MWg.LJ = true;
            c569760MWg.LJII = true;
            c569760MWg.LJFF = true;
            c569760MWg.LJIIL = false;
            if (abstractC214793194d != null) {
                c569760MWg.LIZJ = abstractC214793194d;
            }
            navigationScene.LLLLLLLLLL(creativeToolContainerScene, c569760MWg.LIZ());
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(creativeToolContainerScene);
        sbLIZ.append(" must be a Scene");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIZ(android.app.Activity r19, com.bytedance.scene.navigation.NavigationScene r20, X.C198H r21, java.lang.String r22, android.os.Bundle r23, X.C569760MWg r24) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MWH.LJIIIZ(android.app.Activity, com.bytedance.scene.navigation.NavigationScene, X.198H, java.lang.String, android.os.Bundle, X.0MWg):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b5, code lost:
    
        if (r6 != false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(android.content.Context r12, android.os.Bundle r13, java.lang.String r14, android.os.Bundle r15, java.lang.Integer r16, X.C569760MWg r17, boolean r18, int r19) {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MWH.LJIIL(android.content.Context, android.os.Bundle, java.lang.String, android.os.Bundle, java.lang.Integer, X.0MWg, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(java.lang.String r14, X.AbstractC214814194y r15, android.os.Bundle r16, X.C569760MWg r17, android.app.Activity r18, android.os.Bundle r19, X.C198H r20, com.bytedance.scene.navigation.NavigationScene r21, X.InterfaceC21498119Bj r22, boolean r23, boolean r24, boolean r25, int r26) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MWH.LJIIJ(java.lang.String, X.194y, android.os.Bundle, X.0MWg, android.app.Activity, android.os.Bundle, X.198H, com.bytedance.scene.navigation.NavigationScene, X.19Bj, boolean, boolean, boolean, int):void");
    }
}
