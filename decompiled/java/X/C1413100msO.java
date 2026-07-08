package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0msO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.VideoMixEditingMaterialComponent$onInsertForce$1", f = "VideoMixEditingMaterialComponent.kt", l = {1213, 1220}, m = "invokeSuspend")
public final class C1413100msO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1413070msL LLILLJJLI;
    public final /* synthetic */ C1413530mt5 LLILLL;
    public final /* synthetic */ C1412800mru LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1413100msO(C1413070msL c1413070msL, C1413530mt5 c1413530mt5, C1412800mru c1412800mru, InterfaceC1364105Vn<? super C1413100msO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1413070msL;
        this.LLILLL = c1413530mt5;
        this.LLILZ = c1412800mru;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1413100msO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long duration;
        Object objLIZIZ = obj;
        C1C7U.LIZ("VideoMixEditingMaterialComponent@1cfb.onInsertForce$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("VideoMixEditingMaterialComponent@1cfb.onInsertForce$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZIZ);
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            C1656670tDF c1656670tDF = C1656670tDF.LIZ;
            Effect effect = this.LLILLJJLI.LIZIZ;
            VideoPublishEditModel editModel = this.LLILLL.getEditModel();
            InterfaceC1452170ntP value = this.LLILLL.JY0().g().getValue();
            if (value != null) {
                duration = value.getDuration();
            } else {
                duration = 0;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1413070msL c1413070msL = this.LLILLJJLI;
            linkedHashMap.put("effect_id", c1413070msL.LIZIZ.getEffectId());
            linkedHashMap.put("resource_id", c1413070msL.LIZIZ.getResourceId());
            C1446210njn c1446210njnLJ = C1442040nd4.LJ(editModel, duration, false, null, null, false, 0L, false, linkedHashMap, null, false, 894);
            this.LL = 1;
            objLIZIZ = c1656670tDF.LIZIZ(effect, c1446210njnLJ, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("VideoMixEditingMaterialComponent@1cfb.onInsertForce$1");
                return objLJFF;
            }
        }
        AVMusic aVMusic = (AVMusic) objLIZIZ;
        if (aVMusic == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("VideoMixEditingMaterialComponent@1cfb.onInsertForce$1");
            return unit2;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1413090msN c1413090msN = new C1413090msN(this.LLILZ, this.LLILLJJLI, aVMusic, this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1413090msN) == objLJFF) {
            C1C7U.LIZIZ("VideoMixEditingMaterialComponent@1cfb.onInsertForce$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("VideoMixEditingMaterialComponent@1cfb.onInsertForce$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
