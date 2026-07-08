package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS143S0201000_19;
import kotlin.jvm.internal.AwS159S0101000_19;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0hpi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.VoiceChanger$startFilterVoiceChange$1$1", f = "VoiceChanger.kt", l = {417}, m = "invokeSuspend")
public final class C1219240hpi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19536511c3 LLILLJJLI;
    public final /* synthetic */ InterfaceC1219340hps LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219240hpi(C19536511c3 c19536511c3, InterfaceC1219340hps interfaceC1219340hps, String str, int i, InterfaceC1364105Vn<? super C1219240hpi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19536511c3;
        this.LLILLL = interfaceC1219340hps;
        this.LLILZ = str;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219240hpi(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceChanger@2446.startFilterVoiceChange$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C19534911bn c19534911bn = (C19534911bn) this.LLILLJJLI.LJIIIZ.getValue();
            final InterfaceC1219340hps interfaceC1219340hps = this.LLILLL;
            final String str = this.LLILZ;
            final int i2 = this.LLILZIL;
            final C19536511c3 c19536511c3 = this.LLILLJJLI;
            InterfaceC19535711bv<C19534711bl> interfaceC19535711bv = new InterfaceC19535711bv<C19534711bl>() { // from class: X.0hvT
                @Override // X.InterfaceC19535711bv
                public final void LIZ(C1222820hvU c1222820hvU, C19535011bo c19535011bo) {
                    List<C19536311c1> list;
                    C19534711bl c19534711bl = (C19534711bl) c19535011bo;
                    if (c1222820hvU.LIZ == 2 && Intrinsics.LJFF(c19536511c3.LJII.get(str), Boolean.TRUE) && (list = c19534711bl.LIZLLL) != null) {
                        C1524805y2.LIZIZ(0L, new AwS143S0201000_19(i2, interfaceC1219340hps, str, list, 1));
                    }
                }

                @Override // X.InterfaceC19535711bv
                public final void LIZIZ(C1222820hvU c1222820hvU, C19535011bo c19535011bo) {
                    List<? extends Effect> list;
                    C19534711bl c19534711bl = (C19534711bl) c19535011bo;
                    if (c1222820hvU.LIZ == 1 && c1222820hvU.LIZJ == 20 && (list = c19534711bl.LJ) != null && (!((ArrayList) list).isEmpty())) {
                        C1524805y2.LIZIZ(0L, new AwS159S0101000_19(interfaceC1219340hps, str, i2, 5));
                    }
                }

                @Override // X.InterfaceC19535711bv
                public final void LIZJ(C1222820hvU c1222820hvU, C19535011bo c19535011bo) {
                    C19534711bl c19534711bl = (C19534711bl) c19535011bo;
                    if (c1222820hvU.LIZ == 2 && Intrinsics.LJFF(c19536511c3.LJII.get(str), Boolean.TRUE)) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("curHandlerName", c1222820hvU.LIZIZ);
                        linkedHashMap.put("curHandlerId", String.valueOf(c1222820hvU.LIZJ));
                        C1524805y2.LIZIZ(0L, new AwS143S0201000_19(interfaceC1219340hps, str, i2, new C19536611c4(linkedHashMap, c19534711bl.LIZLLL, 100, 8), 0));
                    }
                }
            };
            this.LL = 1;
            if (c19534911bn.LIZIZ(c19534911bn.LIZLLL(), interfaceC19535711bv, this) == objLJFF) {
                C1C7U.LIZIZ("VoiceChanger@2446.startFilterVoiceChange$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceChanger@2446.startFilterVoiceChange$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
