package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ln3.a;

/* JADX INFO: renamed from: X.0moD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.EffectET$onStickerChanged$1$1", f = "EffectET.kt", l = {}, m = "invokeSuspend")
public final class C1410510moD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1448710nnp LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ C1449000noI LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410510moD(C1448710nnp c1448710nnp, Effect effect, C1449000noI c1449000noI, InterfaceC1364105Vn<? super C1410510moD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1448710nnp;
        this.LLILLJJLI = effect;
        this.LLILLL = c1449000noI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410510moD(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ComposerBeautyBuriedInfo composerBeautyBuriedInfo;
        C12I9 c12i9Je;
        C12I9 c12i9Je2;
        C1C7U.LIZ("EffectET@c9c7.onStickerChanged$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1448710nnp c1448710nnp = this.LL;
        Effect effect = this.LLILLJJLI;
        C1449000noI c1449000noI = this.LLILLL;
        Integer numValueOf = null;
        if (c1449000noI != null) {
            str = c1449000noI.LJII;
        } else {
            str = null;
        }
        String strLIZJ = c1448710nnp.LIZJ(0);
        if (strLIZJ != null) {
            C0LAB c0lab = new C0LAB();
            c1448710nnp.LIZ(c0lab, strLIZJ);
            ShortVideoContext shortVideoContext = c1448710nnp.LLILZ;
            if (shortVideoContext != null) {
                c0lab.LJ("enter_from", shortVideoContext.enterFrom);
                c0lab.LJ("shoot_way", shortVideoContext.shootWay);
                c0lab.LJ("creation_id", shortVideoContext.getCreationId());
            }
            c0lab.LJ("effect_sticker_id", effect.getEffectId());
            c0lab.LJ("resource_id", effect.getResourceId());
            c0lab.LJ(Scene.SCENE_SERVICE, c1448710nnp.LL);
            String str2 = c1448710nnp.LLILLJJLI;
            if (str2 != null) {
                c0lab.LJ("camera_type", str2);
            }
            C01GW<a> c01gw = c1448710nnp.LLILZLL;
            if (c01gw != null) {
                a value = c01gw.getValue();
                if (value != null) {
                    numValueOf = Integer.valueOf(value.Ty0());
                }
            } else {
                a aVar = (a) c1448710nnp.LLIZ.getValue(c1448710nnp, C1448710nnp.LLJILJILJ[0]);
                if (aVar != null) {
                    numValueOf = Integer.valueOf(aVar.Ty0());
                }
            }
            c0lab.LIZLLL(numValueOf, "beautify_used");
            c0lab.LIZ(1, "is_composer");
            if (C294160Bfy.LIZ()) {
                C01GW<a> c01gw2 = c1448710nnp.LLILZLL;
                if (c01gw2 != null) {
                    a value2 = c01gw2.getValue();
                    if (value2 == null || (c12i9Je2 = value2.je()) == null || (composerBeautyBuriedInfo = c12i9Je2.Ne()) == null) {
                        composerBeautyBuriedInfo = new ComposerBeautyBuriedInfo(0, 0, 0, null, 15, null);
                    }
                } else {
                    a aVar2 = (a) c1448710nnp.LLIZ.getValue(c1448710nnp, C1448710nnp.LLJILJILJ[0]);
                    if (aVar2 == null || (c12i9Je = aVar2.je()) == null || (composerBeautyBuriedInfo = c12i9Je.Ne()) == null) {
                        composerBeautyBuriedInfo = new ComposerBeautyBuriedInfo(0, 0, 0, null, 15, null);
                    }
                }
                c0lab.LIZ(C1409940mnI.LIZJ(composerBeautyBuriedInfo, C1409940mnI.LIZJ), "beauty_status");
                c0lab.LJ("beautify_info", C1409940mnI.LJ(composerBeautyBuriedInfo));
            }
            if (str == null) {
                str = "";
            }
            c0lab.LJ("prop_launch_ui_point", str);
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C2341909Fp.LIZ("tool_performance_effect_status", c0lab.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectET@c9c7.onStickerChanged$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
