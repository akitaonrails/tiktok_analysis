package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS75S0301000_19;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0hph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.VoiceChanger$startFileVoiceChange$1$1", f = "VoiceChanger.kt", l = {348}, m = "invokeSuspend")
public final class C1219230hph extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19536511c3 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1211030hcT LLILZ;
    public final /* synthetic */ InterfaceC1219340hps LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219230hph(C19536511c3 c19536511c3, String str, C1211030hcT c1211030hcT, InterfaceC1219340hps interfaceC1219340hps, int i, InterfaceC1364105Vn<? super C1219230hph> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19536511c3;
        this.LLILLL = str;
        this.LLILZ = c1211030hcT;
        this.LLILZIL = interfaceC1219340hps;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219230hph(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceChanger@2446.startFileVoiceChange$1$1");
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
            C19536711c5 c19536711c5 = (C19536711c5) this.LLILLJJLI.LJIIIIZZ.getValue();
            final C19536511c3 c19536511c3 = this.LLILLJJLI;
            final String str = this.LLILLL;
            final C1211030hcT c1211030hcT = this.LLILZ;
            final InterfaceC1219340hps interfaceC1219340hps = this.LLILZIL;
            final int i2 = this.LLILZLL;
            InterfaceC19535711bv<C19536911c7> interfaceC19535711bv = new InterfaceC19535711bv<C19536911c7>() { // from class: X.11bZ
                @Override // X.InterfaceC19535711bv
                public final void LIZ(C1222820hvU c1222820hvU, C19535011bo c19535011bo) {
                    C19536911c7 c19536911c7 = (C19536911c7) c19535011bo;
                    if (Intrinsics.LJFF(c19536511c3.LJII.get(str), Boolean.TRUE)) {
                        int i3 = c1222820hvU.LIZ;
                        int i4 = 0;
                        if (i3 == 2) {
                            C19532911bT.LIZIZ(0, "pipeline_state_code");
                            C19532911bT.LIZJ(c19536911c7.LIZ.LIZLLL, "total_duration");
                            C19532911bT.LJFF();
                        } else if (i3 == 1) {
                            long j = c19536911c7.LIZ.LJI;
                            C19533811bc c19533811bc = c19536911c7.LJIIJ;
                            double d = c19533811bc.LIZJ;
                            int i5 = c19533811bc.LIZLLL;
                            if (c19533811bc.LJ) {
                                if (c19533811bc.LJFF) {
                                    i4 = 3;
                                } else {
                                    i4 = 1;
                                }
                            } else if (c19533811bc.LJFF) {
                                i4 = 2;
                            }
                            C19532911bT.LJ(c1222820hvU.LIZJ, j, d, i5, i4, c19533811bc.LJI, c19533811bc.LJII, "", null);
                        }
                        if (c1222820hvU.LIZ == 2) {
                            List<C19536311c1> list = c19536911c7.LJFF;
                            if (list != null) {
                                C1211030hcT c1211030hcT2 = c1211030hcT;
                                C1524805y2.LIZIZ(0L, new AwS75S0301000_19(i2, interfaceC1219340hps, c1211030hcT2, str, list, 1));
                                return;
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }

                @Override // X.InterfaceC19535711bv
                public final void LIZIZ(C1222820hvU c1222820hvU, C19535011bo c19535011bo) {
                    Pair pair;
                    C19536911c7 c19536911c7 = (C19536911c7) c19535011bo;
                    C19536511c3 c19536511c32 = c19536511c3;
                    int i3 = c19536511c32.LIZ;
                    double videoLength = ((double) c19536511c32.LIZJ.getVideoLength()) / 1000.0d;
                    if (c1222820hvU.LIZ == 2) {
                        C19533411bY.LIZ.clear();
                        C19533411bY.LIZIZ = false;
                        List<C19536311c1> list = c19536911c7.LIZLLL;
                        if (list.isEmpty()) {
                            pair = new Pair("", "");
                        } else {
                            Effect effect = ((C19536311c1) ListProtector.get(list, 0)).LIZJ;
                            String name = ((C19536311c1) ListProtector.get(list, 0)).LIZJ.getName();
                            String strLJII = C1664460tPo.LJII(((C19536311c1) ListProtector.get(list, 0)).LIZJ);
                            Iterator<C19536311c1> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (!Intrinsics.LJFF(it2.next().LIZJ.getEffectId(), effect.getEffectId())) {
                                    name = "Multiple";
                                    strLJII = "Multiple";
                                    break;
                                }
                            }
                            pair = new Pair(name, strLJII);
                        }
                        C19532911bT.LIZIZ(i3, "bizType");
                        C19532911bT.LIZLLL("effect_name", (String) pair.getFirst());
                        C19532911bT.LIZLLL("speakerID", (String) pair.getSecond());
                        C19532911bT.LIZIZ(0, "error_code");
                        C19532911bT.LIZLLL("error_msg", "");
                        C19532911bT.LIZIZ(0, "pipeline_state_code");
                        C19532911bT.LIZIZ(0, "pipeline_error_stage");
                        C19532911bT.LIZIZ(0, "process_track");
                        C19532911bT.LIZ(0.0d, "extract_audio_cache_rate");
                        C19532911bT.LIZ(0.0d, "upload_cache_rate");
                        C19532911bT.LIZ(0.0d, "changed_cache_rate");
                        C19532911bT.LIZ(0.0d, "export_duration");
                        C19532911bT.LIZJ(0L, "upload_duration");
                        C19532911bT.LIZJ(0L, "fetch_duration");
                        C19532911bT.LIZJ(0L, "download_duration");
                        C19532911bT.LIZIZ(c19536911c7.LIZLLL.size(), "total_slots_size");
                        C19532911bT.LIZIZ(0, "extract_max_file_length");
                        C19532911bT.LIZIZ(0, "upload_max_file_length");
                        C19532911bT.LIZIZ(0, "download_max_file_length");
                        C19532911bT.LIZ(videoLength, "video_duration");
                        C19532911bT.LIZLLL("logid", "");
                    }
                    if (Intrinsics.LJFF(c19536511c3.LJII.get(str), Boolean.TRUE) && c1222820hvU.LIZ == 1) {
                        int i4 = c1222820hvU.LIZJ;
                        C1211030hcT c1211030hcT2 = c1211030hcT;
                        C1524805y2.LIZIZ(0L, new C1210640hbq(i4, i2, interfaceC1219340hps, c1211030hcT2, str));
                    }
                }

                @Override // X.InterfaceC19535711bv
                public final void LIZJ(C1222820hvU c1222820hvU, C19535011bo c19535011bo) {
                    int iIntValue;
                    C19536911c7 c19536911c7 = (C19536911c7) c19535011bo;
                    if (Intrinsics.LJFF(c19536511c3.LJII.get(str), Boolean.TRUE)) {
                        int i3 = c1222820hvU.LIZ;
                        if (i3 == 2) {
                            C19532911bT.LIZIZ(-2, "pipeline_state_code");
                            C19532911bT.LIZJ(c19536911c7.LIZ.LIZLLL, "total_duration");
                            C19532911bT.LJFF();
                        } else {
                            int i4 = 1;
                            if (i3 == 1) {
                                C19532911bT.LIZIZ(c1222820hvU.LIZJ, "pipeline_error_stage");
                                long j = c19536911c7.LIZ.LJI;
                                C19533811bc c19533811bc = c19536911c7.LJIIJ;
                                double d = c19533811bc.LIZJ;
                                int i5 = c19533811bc.LIZLLL;
                                if (c19533811bc.LJ) {
                                    if (c19533811bc.LJFF) {
                                        i4 = 3;
                                    }
                                } else if (c19533811bc.LJFF) {
                                    i4 = 2;
                                } else {
                                    i4 = 0;
                                }
                                C19532911bT.LJ(c1222820hvU.LIZJ, j, d, i5, i4, c19533811bc.LJI, c19533811bc.LJII, c19533811bc.LJIIIZ, c19533811bc.LJIIIIZZ);
                            }
                        }
                        if (c1222820hvU.LIZ == 2) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("curHandlerName", c1222820hvU.LIZIZ);
                            linkedHashMap.put("curHandlerId", String.valueOf(c1222820hvU.LIZJ));
                            Integer num = (Integer) ((LinkedHashMap) C052500Hb.LIZ).get(Integer.valueOf(c1222820hvU.LIZJ));
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = -1;
                            }
                            C1524805y2.LIZIZ(0L, new AwS75S0301000_19(c1211030hcT, interfaceC1219340hps, str, i2, new C19536611c4(linkedHashMap, c19536911c7.LJFF, iIntValue, 8), 0));
                        }
                    }
                }
            };
            this.LL = 1;
            if (c19536711c5.LIZIZ(c19536711c5.LIZLLL(), interfaceC19535711bv, this) == objLJFF) {
                C1C7U.LIZIZ("VoiceChanger@2446.startFileVoiceChange$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceChanger@2446.startFileVoiceChange$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
