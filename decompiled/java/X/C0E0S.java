package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.keva.Keva;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0E0S, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E0S {
    public static PthreadTimer LIZIZ;
    public static InterfaceC353530DtX LIZJ;
    public static AnonymousClass0956 LIZLLL;
    public static TuxIconDrawable LJFF;
    public static final C0E0S LIZ = new C0E0S();
    public static final C365600EVa LJ = new C365600EVa(25, 100);
    public static final Keva LJI = Keva.getRepo("ep_video_cutout_repo");

    public static void LIZJ() {
        PthreadTimer pthreadTimer = LIZIZ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        LIZIZ = null;
    }

    public static Object LIZIZ(InterfaceC360730ECh interfaceC360730ECh, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        interfaceC360730ECh.LJII("editor_pro_cutout", false, true, false, new C0E0V<ResourceItem>() { // from class: X.0E0T
            @Override // X.C0E0V, X.InterfaceC365520EUs
            public final void LIZ(C0EDV c0edv) {
                String message;
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<C354690DvP> interfaceC20236714Gf = c2252611DEt;
                    C13BV c13bv = C13BV.INSTANCE;
                    Integer numValueOf = Integer.valueOf(c0edv.LIZIZ);
                    Exception exc = c0edv.LIZ;
                    if (exc == null || (message = exc.getMessage()) == null) {
                        message = "";
                    }
                    C354690DvP c354690DvP = new C354690DvP(c13bv, message, false, numValueOf);
                    C189200o6.m2constructorimpl(c354690DvP);
                    interfaceC20236714Gf.resumeWith(c354690DvP);
                }
            }

            @Override // X.InterfaceC365520EUs
            public final void LIZIZ(List<? extends ResourceItem> list, boolean z) {
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<C354690DvP> interfaceC20236714Gf = c2252611DEt;
                    C354690DvP c354690DvP = new C354690DvP(list, "", true, null);
                    C189200o6.m2constructorimpl(c354690DvP);
                    interfaceC20236714Gf.resumeWith(c354690DvP);
                }
            }
        });
        c2252611DEt.LJJII(new AwS584S0100000_5(c2252611DEt, 1078));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static Object LIZ(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C569610MVr.LIZIZ().LJIIJ(new ArrayList<>(list), str, true, new C513401zI(c2252611DEt, 1));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static void LJ(LifecycleCoroutineScope lifecycleCoroutineScope, C0E48 c0e48, InterfaceC353530DtX interfaceC353530DtX) {
        AnonymousClass0956 anonymousClass0956 = LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LIZJ = interfaceC353530DtX;
        C365600EVa c365600EVa = LJ;
        c365600EVa.LIZIZ();
        c365600EVa.LIZ(AFwS234S0000000_5.get$arr$(516), lifecycleCoroutineScope);
        LIZLLL = C23250099c.LIZLLL(lifecycleCoroutineScope, null, null, new C353540DtY(c0e48, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4, X.C19EG r5, com.bytedance.ies.nle.editor_jni.NLETrackSlot r6, kotlin.jvm.functions.Function2 r7) {
        /*
            X.0Dta r0 = X.C353560Dta.LIZ
            r0.getClass()
            boolean r0 = X.C353560Dta.LIZ(r4)
            r4 = 0
            if (r0 == 0) goto L65
            X.0C64 r3 = X.C0C64.LJIILLIIL()
            r2 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "studio_magic_i2i_combine_gameplay_straightout_use_render_proxy"
            r1 = 1
            boolean r0 = r3.LJIIIZ(r2, r0, r1, r4)
            if (r0 == 0) goto L65
            boolean r0 = X.C353560Dta.LJIIIIZZ(r6)
            if (r0 != 0) goto L65
            X.0DqH r0 = X.C351510DqH.LIZ
            r0.getClass()
            com.bytedance.ies.nle.editor_jni.NLEResourceAV r0 = X.C351510DqH.LJJIIJZLJL(r6)
            if (r0 != 0) goto L37
            X.0Dui r0 = X.C354260Dui.LIZ
            r0.getClass()
            boolean r0 = X.C354260Dui.LJIILIIL(r6)
            if (r0 != 0) goto L65
        L37:
            boolean r0 = X.C357540E0a.LJIILL(r6)
            if (r0 == 0) goto L67
            if (r1 != 0) goto L67
            X.0mTM r2 = new X.0mTM
            r2.<init>(r5)
            r0 = 2131830430(0x7f11269e, float:1.9293857E38)
            r2.LJFF(r0)
            r2.LJII = r4
            r0 = 2131830429(0x7f11269d, float:1.9293855E38)
            r2.LIZ(r0)
            kotlin.jvm.internal.AwS580S0100000_1 r1 = new kotlin.jvm.internal.AwS580S0100000_1
            r0 = 854(0x356, float:1.197E-42)
            r1.<init>(r7, r0)
            X.C985403tE.LIZ(r2, r1)
            X.0mTF r0 = new X.0mTF
            r0.<init>(r2)
            r0.LIZLLL()
            return
        L65:
            r1 = 0
            goto L37
        L67:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.invoke(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E0S.LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.19EG, com.bytedance.ies.nle.editor_jni.NLETrackSlot, kotlin.jvm.functions.Function2):void");
    }

    public static void LJFF(C19EG c19eg, InterfaceC359850E8x interfaceC359850E8x, NLETrackSlot nLETrackSlot, boolean z) {
        boolean z2;
        TuxIconDrawable tuxIconDrawable;
        int iLIZ;
        int iLIZ2;
        if (interfaceC359850E8x == null || C301700Bs8.LIZ()) {
            return;
        }
        if (!C354090DuR.LJIIJJI()) {
            if (z) {
                interfaceC359850E8x.LJIIIZ("bottom_item_edit_cutout");
                return;
            } else {
                interfaceC359850E8x.LJIIIZ("bottom_item_overlay_edit_cutout");
                return;
            }
        }
        if (nLETrackSlot.getAIMatting() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object objLIZIZ = null;
        if (z2) {
            LIZ.getClass();
            if (LJFF == null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                Integer numLIZ = C0EJA.LIZ();
                if (numLIZ != null) {
                    iLIZ = C0EGK.LIZ(numLIZ.intValue());
                } else {
                    iLIZ = C0EGK.LIZ(28);
                }
                c419910GdJ.LIZIZ = iLIZ;
                Integer numLIZ2 = C0EJA.LIZ();
                if (numLIZ2 != null) {
                    iLIZ2 = C0EGK.LIZ(numLIZ2.intValue());
                } else {
                    iLIZ2 = C0EGK.LIZ(28);
                }
                c419910GdJ.LIZJ = iLIZ2;
                c419910GdJ.LIZ = R.raw.icon_color_right_bottom_checkbox;
                LJFF = c419910GdJ.LIZ(c19eg);
            }
            tuxIconDrawable = LJFF;
        } else {
            tuxIconDrawable = null;
        }
        C361980EHc c361980EHcLJ = interfaceC359850E8x.LJ("bottom_item_edit_cutout");
        C361980EHc c361980EHcLJ2 = interfaceC359850E8x.LJ("bottom_item_overlay_edit_cutout");
        if (z) {
            if (c361980EHcLJ != null) {
                objLIZIZ = c361980EHcLJ.LIZIZ("small_icon_res_id");
            }
            if (!Intrinsics.LJFF(objLIZIZ, tuxIconDrawable)) {
                interfaceC359850E8x.LIZ(tuxIconDrawable, "bottom_item_edit_cutout");
            }
        } else {
            if (c361980EHcLJ2 != null) {
                objLIZIZ = c361980EHcLJ2.LIZIZ("small_icon_res_id");
            }
            if (!Intrinsics.LJFF(objLIZIZ, tuxIconDrawable)) {
                interfaceC359850E8x.LIZ(tuxIconDrawable, "bottom_item_overlay_edit_cutout");
            }
        }
        CopyOnWriteArraySet<String> copyOnWriteArraySet = C354090DuR.LJI;
        ArrayList arrayList = new ArrayList();
        for (String str : copyOnWriteArraySet) {
            String str2 = str;
            if (str2 != null && !a0.LJJJIL(str2)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            if (z) {
                if (C352250DrT.LJIILIIL(nLETrackSlot)) {
                    interfaceC359850E8x.LJIIIZ("bottom_item_edit_cutout");
                    return;
                } else {
                    interfaceC359850E8x.LJIILLIIL("bottom_item_edit_cutout");
                    return;
                }
            }
            interfaceC359850E8x.LJIILLIIL("bottom_item_overlay_edit_cutout");
            return;
        }
        if (arrayList.contains(nLETrackSlot.getUUID())) {
            if (z) {
                interfaceC359850E8x.LJIILLIIL("bottom_item_edit_cutout");
                return;
            } else {
                interfaceC359850E8x.LJIILLIIL("bottom_item_overlay_edit_cutout");
                return;
            }
        }
        if (z) {
            interfaceC359850E8x.LJIIIZ("bottom_item_edit_cutout");
        } else {
            interfaceC359850E8x.LJIIIZ("bottom_item_overlay_edit_cutout");
        }
    }
}
