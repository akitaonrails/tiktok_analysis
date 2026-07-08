package X;

import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.vesdk.VEUserConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nuf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452950nuf implements InterfaceC1452820nuS {
    public static final void LIZIZ() {
        C0FR9.LIZ = false;
        C1452960nug.LJIIIIZZ = false;
        C1452960nug.LJIIJ = C0BVH.LIZ();
        C1452960nug.LIZ = !C1411560mpu.LIZIZ;
        C1452960nug.LJIIJJI = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_nle_public_enable_swing_lock_seek", true, false);
        C1452960nug.LJIIL = true;
        C288850BTv.LIZ.getClass();
        C1452960nug.LJIILL = C288850BTv.LIZ();
        C1452960nug.LIZLLL = C0C64.LJIILLIIL().LJIIIZ(31744, "nle_api_time_cost_enable", true, false);
        C1452960nug.LJ = C0C64.LJIILLIIL().LJIIIZ(31744, "nle_api_thread_check_enable", true, false);
        C1452960nug.LJFF = C0C64.LJIILLIIL().LJIIL(0.0d, 31744, "nle_api_thread_sampling_prob", true);
    }

    public final C1463670oBx LIZ(SurfaceView surfaceView, C1452970nuh c1452970nuh) {
        if (c1452970nuh.LIZ == C00CM.NLEEditorType) {
            InterfaceC349870Dnd interfaceC349870Dnd = new InterfaceC349870Dnd() { // from class: X.0Dna
                @Override // X.InterfaceC349870Dnd
                public final void LIZ(InterfaceC1452170ntP interfaceC1452170ntP, float f, float f2) {
                    InterfaceC349860Dnc interfaceC349860DncYf = interfaceC1452170ntP.yf();
                    if (interfaceC349860DncYf instanceof C349850Dnb) {
                        NLEModel nLEModelInvoke = ((C349850Dnb) interfaceC349860DncYf).LIZ.invoke();
                        VecNLETrackSPtr tracks = nLEModelInvoke.getTracks();
                        if ((tracks instanceof Collection) && tracks.isEmpty()) {
                            return;
                        }
                        Iterator<NLETrack> it2 = tracks.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().getExtra("business"), "cutsame")) {
                                nLEModelInvoke.updateRelativeSizeWhileGlobalCanvasChanged(f, f2);
                                return;
                            }
                        }
                        return;
                    }
                    "this must be NLEEditor Data Model".toString();
                    throw new IllegalArgumentException("this must be NLEEditor Data Model");
                }
            };
            C1452960nug.LIZIZ = c1452970nuh.LJ;
            C1452960nug.LIZJ = c1452970nuh.LJFF;
            if (C1931007hM.LIZ()) {
                C201955140j.LJIIL("enable nleModel checker");
                C1452960nug.LJIILIIL = new C1418500n16(C1420480n4I.LIZ);
            }
            C1452960nug.LJIILJJIL = true;
            LIZIZ();
            HashMap map = new HashMap();
            Boolean bool = Boolean.TRUE;
            map.put("ve_enable_seek_parallel_decode", bool);
            map.put("ve_enable_seek_backward_drop_opt", bool);
            map.put("ve_enable_forward_ongoingseek_opt", bool);
            map.put("EnableMultiThreadDecode", bool);
            C1452960nug.LJI = map;
            VEUserConfig vEUserConfig = c1452970nuh.LIZLLL;
            if (vEUserConfig != null) {
                C2219091BtD.LIZLLL().i("NLEEditorCreator create ASNLEEditor with ve_user_config");
                if (surfaceView == null) {
                    String str = c1452970nuh.LIZIZ;
                    C1464020oCW c1464020oCW = EnumC1464030oCX.Companion;
                    int i = c1452970nuh.LJI;
                    c1464020oCW.getClass();
                    EnumC1464030oCX enumC1464030oCXLIZ = C1464020oCW.LIZ(i);
                    C1442030nd3 c1442030nd3 = EnumC1442010nd1.Companion;
                    int i2 = c1452970nuh.LJIIIIZZ;
                    c1442030nd3.getClass();
                    return new C1463670oBx(str, enumC1464030oCXLIZ, C1442030nd3.LIZ(i2), c1452970nuh.LJII, null, interfaceC349870Dnd, vEUserConfig, c1452970nuh.LJIIIZ, c1452970nuh.LJIIJ);
                }
                if (c1452970nuh.LIZJ > 0) {
                    String str2 = c1452970nuh.LIZIZ;
                    C1464020oCW c1464020oCW2 = EnumC1464030oCX.Companion;
                    int i3 = c1452970nuh.LJI;
                    c1464020oCW2.getClass();
                    EnumC1464030oCX enumC1464030oCXLIZ2 = C1464020oCW.LIZ(i3);
                    C1442030nd3 c1442030nd32 = EnumC1442010nd1.Companion;
                    int i4 = c1452970nuh.LJIIIIZZ;
                    c1442030nd32.getClass();
                    return new C1463670oBx(str2, enumC1464030oCXLIZ2, C1442030nd3.LIZ(i4), c1452970nuh.LJII, surfaceView, interfaceC349870Dnd, vEUserConfig, c1452970nuh.LJIIIZ, c1452970nuh.LJIIJ);
                }
                String str3 = c1452970nuh.LIZIZ;
                C1464020oCW c1464020oCW3 = EnumC1464030oCX.Companion;
                int i5 = c1452970nuh.LJI;
                c1464020oCW3.getClass();
                EnumC1464030oCX enumC1464030oCXLIZ3 = C1464020oCW.LIZ(i5);
                C1442030nd3 c1442030nd33 = EnumC1442010nd1.Companion;
                int i6 = c1452970nuh.LJIIIIZZ;
                c1442030nd33.getClass();
                return new C1463670oBx(str3, enumC1464030oCXLIZ3, C1442030nd3.LIZ(i6), c1452970nuh.LJII, surfaceView, interfaceC349870Dnd, vEUserConfig, c1452970nuh.LJIIIZ, c1452970nuh.LJIIJ);
            }
            if (surfaceView == null) {
                C2219091BtD.LIZLLL().i("NLEEditorCreator create ASNLEEditor without ve_user_config, surfaceView == null");
                String str4 = c1452970nuh.LIZIZ;
                C1464020oCW c1464020oCW4 = EnumC1464030oCX.Companion;
                int i7 = c1452970nuh.LJI;
                c1464020oCW4.getClass();
                EnumC1464030oCX enumC1464030oCXLIZ4 = C1464020oCW.LIZ(i7);
                C1442030nd3 c1442030nd34 = EnumC1442010nd1.Companion;
                int i8 = c1452970nuh.LJIIIIZZ;
                c1442030nd34.getClass();
                return new C1463670oBx(str4, enumC1464030oCXLIZ4, C1442030nd3.LIZ(i8), c1452970nuh.LJII, null, interfaceC349870Dnd, null, c1452970nuh.LJIIIZ, c1452970nuh.LJIIJ);
            }
            if (c1452970nuh.LIZJ > 0) {
                C2219091BtD.LIZLLL().i("NLEEditorCreator create ASNLEEditor without ve_user_config, params.handler > 0");
                String str5 = c1452970nuh.LIZIZ;
                C1464020oCW c1464020oCW5 = EnumC1464030oCX.Companion;
                int i9 = c1452970nuh.LJI;
                c1464020oCW5.getClass();
                EnumC1464030oCX enumC1464030oCXLIZ5 = C1464020oCW.LIZ(i9);
                C1442030nd3 c1442030nd35 = EnumC1442010nd1.Companion;
                int i10 = c1452970nuh.LJIIIIZZ;
                c1442030nd35.getClass();
                return new C1463670oBx(str5, enumC1464030oCXLIZ5, C1442030nd3.LIZ(i10), c1452970nuh.LJII, surfaceView, interfaceC349870Dnd, null, c1452970nuh.LJIIIZ, c1452970nuh.LJIIJ);
            }
            C2219091BtD.LIZLLL().i("NLEEditorCreator create ASNLEEditor");
            String str6 = c1452970nuh.LIZIZ;
            C1464020oCW c1464020oCW6 = EnumC1464030oCX.Companion;
            int i11 = c1452970nuh.LJI;
            c1464020oCW6.getClass();
            EnumC1464030oCX enumC1464030oCXLIZ6 = C1464020oCW.LIZ(i11);
            C1442030nd3 c1442030nd36 = EnumC1442010nd1.Companion;
            int i12 = c1452970nuh.LJIIIIZZ;
            c1442030nd36.getClass();
            return new C1463670oBx(str6, enumC1464030oCXLIZ6, C1442030nd3.LIZ(i12), c1452970nuh.LJII, surfaceView, interfaceC349870Dnd, null, c1452970nuh.LJIIIZ, c1452970nuh.LJIIJ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown editor type ");
        sbLIZ.append(c1452970nuh.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
