package X;

import Y.ARunnableS41S0300000_8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565320MFe {
    public static final C565320MFe LIZ = new C565320MFe();

    public static void LIZ(Context context, Bundle bundle, Integer num) {
        C199Y c199y;
        C128Y c128yLLLLIIIILLL;
        final C198H c198h;
        C569760MWg c569760MWg;
        C198H c198h2;
        Integer first;
        Integer second;
        AbstractC214793194d anonymousClass1951;
        Integer second2;
        final String str;
        AbstractC214814194y abstractC214814194y;
        Activity activityLIZ = C1388190mED.LIZ(context);
        C128Y c128yLLLLIIIILLL2 = null;
        if ((activityLIZ instanceof C199Y) && (c199y = (C199Y) activityLIZ) != null) {
            NavigationScene navigationScene = c199y.getNavigationScene();
            if (navigationScene != null) {
                c128yLLLLIIIILLL = navigationScene.LLLLIIIILLL();
            } else {
                c128yLLLLIIIILLL = null;
            }
            if ((c128yLLLLIIIILLL instanceof C198H) && (c198h = (C198H) c128yLLLLIIIILLL) != null) {
                if (num != null) {
                    final int iIntValue = num.intValue();
                    c569760MWg = new C569760MWg();
                    if ((c198h instanceof AbstractC214814194y) && (abstractC214814194y = (AbstractC214814194y) c198h) != null) {
                        str = abstractC214814194y.embeddedSceneId;
                    } else {
                        str = null;
                    }
                    c569760MWg.LIZIZ = new AbstractC565380MFk(str, iIntValue) { // from class: X.0MFf
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
                            throw new UnsupportedOperationException("Method not decompiled: X.C565330MFf.onResult(java.lang.Object):void");
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super((Scene) this.LIZ);
                            this.LIZIZ = str;
                            this.LIZJ = iIntValue;
                        }
                    };
                } else {
                    c569760MWg = null;
                }
                NavigationScene navigationScene2 = c199y.getNavigationScene();
                if (navigationScene2 != null) {
                    navigationScene2.LLLJL();
                    NavigationScene navigationScene3 = c199y.getNavigationScene();
                    if (navigationScene3 != null) {
                        c128yLLLLIIIILLL2 = navigationScene3.LLLLIIIILLL();
                    }
                    if ((c128yLLLLIIIILLL2 instanceof C198H) && (c198h2 = (C198H) c128yLLLLIIIILLL2) != null) {
                        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                        if (creativeToolsPluginService != null) {
                            creativeToolsPluginService.LIZ();
                        }
                        AbstractC214814194y abstractC214814194y2 = (AbstractC214814194y) C0CHQ.LIZ().LJIJJ().LJI("StoryEditContainerScene");
                        abstractC214814194y2.mArguments = C571310Mav.LIZ(bundle);
                        if (c569760MWg == null) {
                            c569760MWg = new C569760MWg();
                        }
                        Pair<Integer, Integer> pairLIZJ = C569770MWh.LIZJ(abstractC214814194y2.getStartAnimationType());
                        Integer first2 = pairLIZJ.getFirst();
                        if (first2 != null && first2.intValue() == 0 && (second2 = pairLIZJ.getSecond()) != null && second2.intValue() == 0) {
                            anonymousClass1951 = new C214798194i();
                        } else {
                            Integer first3 = pairLIZJ.getFirst();
                            if (first3 != null && first3.intValue() == 0) {
                                first = Integer.valueOf(R.anim.bj);
                            } else {
                                first = pairLIZJ.getFirst();
                            }
                            Integer second3 = pairLIZJ.getSecond();
                            if (second3 != null && second3.intValue() == 0) {
                                second = Integer.valueOf(R.anim.bj);
                            } else {
                                second = pairLIZJ.getSecond();
                            }
                            anonymousClass1951 = new AnonymousClass1951(first.intValue(), c199y, second.intValue());
                        }
                        anonymousClass1951.LJIIIIZZ(new ARunnableS41S0300000_8(abstractC214814194y2, navigationScene2, anonymousClass1951, 3));
                        c569760MWg.LIZJ = anonymousClass1951;
                        C0MWI c0mwiLJIJJ = C0CHQ.LIZ().LJIJJ();
                        abstractC214814194y2.getScene();
                        if (c0mwiLJIJJ.LIZLLL(abstractC214814194y2) && C0CHQ.LIZ().LJIJJ().LJII(c198h2.getScene())) {
                            c569760MWg.LIZ = false;
                        } else {
                            C0MWI c0mwiLJIJJ2 = C0CHQ.LIZ().LJIJJ();
                            abstractC214814194y2.getScene();
                            if (c0mwiLJIJJ2.LIZLLL(abstractC214814194y2) && (c198h2.getScene() instanceof InterfaceC560340LyK)) {
                                c569760MWg.LIZ = false;
                            } else {
                                c569760MWg.LIZ = true;
                            }
                        }
                        navigationScene2.LLLLLLLLLL(abstractC214814194y2, c569760MWg.LIZ());
                    }
                }
            }
        }
    }
}
