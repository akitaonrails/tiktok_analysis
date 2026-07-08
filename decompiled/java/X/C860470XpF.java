package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.Scene;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C860470XpF {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(552));

    public static final boolean LIZIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static final void LIZ(String str) {
        if (!LIZIZ()) {
            return;
        }
        C0CHQ.LIZ().LJJJJI().endReport(str);
    }

    public static final void LIZLLL(RecyclerView recyclerView, final String str) {
        if (!C861880XrW.LIZ()) {
            return;
        }
        recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0XpH
            public boolean LL;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView2, int i) {
                boolean z;
                if (i == 0) {
                    if (this.LL) {
                        C860470XpF.LIZ(str);
                    }
                    z = false;
                } else {
                    if (!this.LL) {
                        C860470XpF.LJIIIIZZ(C860340Xp2.LIZ, str, -1L, null, EnumC860460XpE.SCROLL, 4);
                    }
                    z = true;
                }
                this.LL = z;
            }
        });
    }

    public static final void LJFF(C860330Xp1 c860330Xp1, JSONObject jSONObject) {
        Long lLJIILIIL;
        Double dLJII;
        Integer numLJIIJJI;
        String string;
        String string2;
        String string3;
        String string4;
        c860330Xp1.LJJII = Double.valueOf(jSONObject.optDouble("fps"));
        c860330Xp1.LJJIII = Integer.valueOf(jSONObject.optInt("drop_max"));
        c860330Xp1.LJJIIJ = Integer.valueOf(jSONObject.optInt("weighted_drop_count"));
        c860330Xp1.LJJIJ = Integer.valueOf(jSONObject.optInt("drop3"));
        Object objOpt = jSONObject.opt("drop3_dur");
        Long lLJIILIIL2 = null;
        if (objOpt != null && (string4 = objOpt.toString()) != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(string4);
        } else {
            lLJIILIIL = null;
        }
        c860330Xp1.LJJIIZI = lLJIILIIL;
        Object objOpt2 = jSONObject.opt("drop3_duration_ratio");
        if (objOpt2 != null && (string3 = objOpt2.toString()) != null) {
            dLJII = C2327809Ae.LJII(string3);
        } else {
            dLJII = null;
        }
        c860330Xp1.LJJIJIIJI = dLJII;
        c860330Xp1.LJJIJIIJIL = Integer.valueOf(jSONObject.optInt("level_1"));
        c860330Xp1.LJJIJIL = Integer.valueOf(jSONObject.optInt("level_2"));
        c860330Xp1.LJJIJL = Integer.valueOf(jSONObject.optInt("level_3"));
        c860330Xp1.LJJIJLIJ = Integer.valueOf(jSONObject.optInt("level_4"));
        Object objOpt3 = jSONObject.opt("drop7");
        if (objOpt3 != null && (string2 = objOpt3.toString()) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(string2);
        } else {
            numLJIIJJI = null;
        }
        c860330Xp1.LJJIL = numLJIIJJI;
        Object objOpt4 = jSONObject.opt("drop7_dur");
        if (objOpt4 != null && (string = objOpt4.toString()) != null) {
            lLJIILIIL2 = C2095008Iq.LJIILIIL(string);
        }
        c860330Xp1.LJJIZ = lLJIILIIL2;
    }

    public static final void LJII(String str, EnumC860460XpE enumC860460XpE) {
        LJIIIIZZ(C860340Xp2.LIZ, str, C861880XrW.LIZIZ().sceneCollectDuration, null, enumC860460XpE, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(X.InterfaceC332260D0u r5, final java.lang.String r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C05NF
            if (r0 == 0) goto L27
            r4 = r7
            X.05NF r4 = (X.C05NF) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L44
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L27:
            X.05NF r4 = new X.05NF
            r4.<init>(r7)
            goto L12
        L2d:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = LIZIZ()
            if (r0 == 0) goto L4d
            X.0XpD r0 = new X.0XpD
            r0.<init>()
            r4.LLILLJJLI = r1
            java.lang.Object r0 = r5.collect(r0, r4)
            if (r0 != r2) goto L47
            return r2
        L44:
            X.C155000ia.LIZIZ(r3)
        L47:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        L4d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C860470XpF.LIZJ(X.0D0u, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static final void LJ(C860330Xp1 c860330Xp1, JSONObject jSONObject, long j) {
        Long lLJIILIIL;
        Integer numLJIIJJI;
        String string;
        String string2;
        String string3;
        Object objOpt = jSONObject.opt("block_duration");
        Long lLJIILIIL2 = null;
        if (objOpt != null && (string3 = objOpt.toString()) != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(string3);
        } else {
            lLJIILIIL = null;
        }
        c860330Xp1.LJJIIJZLJL = lLJIILIIL;
        Object objOpt2 = jSONObject.opt("block_count");
        if (objOpt2 != null && (string2 = objOpt2.toString()) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(string2);
        } else {
            numLJIIJJI = null;
        }
        c860330Xp1.LJJIIZ = numLJIIJJI;
        if (j <= 0) {
            Object objOpt3 = jSONObject.opt("duration");
            if (objOpt3 != null && (string = objOpt3.toString()) != null) {
                lLJIILIIL2 = C2095008Iq.LJIILIIL(string);
            }
            c860330Xp1.LJJIFFI = lLJIILIIL2;
            return;
        }
        c860330Xp1.LJJIFFI = Long.valueOf(j);
    }

    public static final void LJI(C860330Xp1 c860330Xp1, Map<String, String> map, EnumC860460XpE enumC860460XpE) {
        Long l;
        if (c860330Xp1.LJJII == null && ((l = c860330Xp1.LJJIIJZLJL) == null || l.longValue() == 0)) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", c860330Xp1.LIZ);
        c0lab.LJ("enter_from", c860330Xp1.LIZIZ);
        c0lab.LJ("content_source", c860330Xp1.LIZJ);
        c0lab.LJ("content_type", c860330Xp1.LIZLLL);
        c0lab.LIZLLL(c860330Xp1.LJ, "is_multi_content");
        c0lab.LJ("shoot_way", c860330Xp1.LJFF);
        c0lab.LJ("effect_list", c860330Xp1.LJI);
        c0lab.LIZLLL(c860330Xp1.LJII, "beautify_used");
        c0lab.LIZLLL(c860330Xp1.LJIIIIZZ, "is_quality_improve");
        c0lab.LJ("filter_list", c860330Xp1.LJIIIZ);
        c0lab.LJ("sticker_list", c860330Xp1.LJIIJ);
        c0lab.LJ("prop_list", c860330Xp1.LJIIJJI);
        c0lab.LJ("music_id", c860330Xp1.LJIIL);
        c0lab.LJ(Scene.SCENE_SERVICE, c860330Xp1.LJIJJ);
        c0lab.LIZLLL(c860330Xp1.LJJIFFI, "duration");
        c0lab.LIZLLL(c860330Xp1.LJJII, "fps");
        c0lab.LIZLLL(c860330Xp1.LJJIII, "drop_max");
        c0lab.LIZLLL(c860330Xp1.LJJIIJ, "weighted_drop_count");
        c0lab.LIZLLL(c860330Xp1.LJJIIJZLJL, "block_duration");
        c0lab.LIZLLL(c860330Xp1.LJJIIZ, "block_count");
        c0lab.LIZLLL(c860330Xp1.LJJIJ, "fps_block_count");
        c0lab.LIZLLL(c860330Xp1.LJJIIZI, "fps_block_duration");
        c0lab.LIZLLL(c860330Xp1.LJJIJ, "drop3");
        c0lab.LIZLLL(c860330Xp1.LJJIIZI, "drop3_dur");
        c0lab.LIZLLL(c860330Xp1.LJJIJIIJI, "drop3_duration_ratio");
        c0lab.LIZLLL(c860330Xp1.LJJIJIIJIL, "level_1");
        c0lab.LIZLLL(c860330Xp1.LJJIJIL, "level_2");
        c0lab.LIZLLL(c860330Xp1.LJJIJL, "level_3");
        c0lab.LIZLLL(c860330Xp1.LJJIJLIJ, "level_4");
        c0lab.LIZ(enumC860460XpE.getType(), "action");
        c0lab.LIZLLL(c860330Xp1.LJJIL, "drop7");
        c0lab.LIZLLL(c860330Xp1.LJJIZ, "drop7_dur");
        Integer num = c860330Xp1.LJJ;
        if (num != null) {
            c0lab.LIZ(num.intValue(), "video_cnt");
        }
        Integer num2 = c860330Xp1.LJJI;
        if (num2 != null) {
            c0lab.LIZ(num2.intValue(), "pic_cnt");
        }
        Integer num3 = c860330Xp1.LJIJJLI;
        if (num3 != null) {
            num3.intValue();
            c0lab.LIZLLL(c860330Xp1.LJIJJLI, "creation_duration");
        }
        if (Intrinsics.LJFF(c860330Xp1.LIZIZ, "tool_edit_page") || Intrinsics.LJFF(c860330Xp1.LIZIZ, "tool_publish_page")) {
            c0lab.LIZ(c860330Xp1.LJIL, "source_is_hdr");
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c0lab.LJ(entry.getKey(), entry.getValue());
            }
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_performance_fps_info", c0lab.LIZ);
    }

    public static void LJIIIIZZ(C860330Xp1 c860330Xp1, String str, long j, Map map, EnumC860460XpE enumC860460XpE, int i) {
        EnumC860460XpE enumC860460XpE2 = enumC860460XpE;
        Map map2 = map;
        if ((i & 4) != 0) {
            map2 = null;
        }
        if ((i & 8) != 0) {
            enumC860460XpE2 = EnumC860460XpE.ANIM;
        }
        if (LIZIZ()) {
            C860330Xp1 c860330Xp12 = new C860330Xp1(c860330Xp1.LJJIFFI, c860330Xp1.LJJII, c860330Xp1.LJJIII, c860330Xp1.LJJIIJ, c860330Xp1.LJJIIJZLJL, c860330Xp1.LJJIIZ, c860330Xp1.LJJIIZI, c860330Xp1.LJJIJ, c860330Xp1.LJJIJIIJI, c860330Xp1.LJJIJIIJIL, c860330Xp1.LJJIJIL, c860330Xp1.LJJIJL, c860330Xp1.LJJIJLIJ, c860330Xp1.LJJIL, c860330Xp1.LJJIZ);
            c860330Xp12.LJIJJ = str;
            C0CHQ.LIZ().LJJJJI().getSceneFluencyInfo(str, j, new C859200XnC(c860330Xp12, j, map2, enumC860460XpE2), new AwS593S0100000_14(c860330Xp12, 338));
        }
    }
}
