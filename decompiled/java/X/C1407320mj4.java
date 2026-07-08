package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult;
import com.ss.android.vesdk.VEEditor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mj4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.handler.AudioLoudnessHandler$onExtractAudio$1", f = "AudioLoudnessHandler.kt", l = {26}, m = "invokeSuspend")
public final class C1407320mj4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends LoudnessDetectResult>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407320mj4(int i, int i2, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407320mj4(this.LLILLL, this.LLILZ, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object linkedHashMap = obj;
        C1C7U.LIZ("AudioLoudnessHandler@cf39.onExtractAudio$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(linkedHashMap);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(linkedHashMap);
            List listSingletonList = Collections.singletonList(this.LLILLJJLI);
            List listSingletonList2 = Collections.singletonList(C2286608xc.LJ(this.LLILLL));
            List listSingletonList3 = Collections.singletonList(C2286608xc.LJ(this.LLILZ));
            this.LL = 1;
            if (listSingletonList.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listSingletonList) {
                    if (C2286708xd.LIZJ((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty() && listSingletonList.size() == listSingletonList2.size() && listSingletonList.size() == listSingletonList3.size()) {
                    C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i2 = 0;
                    for (Object obj3 : listSingletonList) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            LoudnessDetectResult loudnessDetectResult = (LoudnessDetectResult) ((LinkedHashMap) C1407440mjG.LIZ).get(obj3);
                            if (loudnessDetectResult != null && loudnessDetectResult.result == 0) {
                                linkedHashMap2.put(obj3, loudnessDetectResult);
                            } else {
                                arrayList2.add(obj3);
                                arrayList3.add(ListProtector.get(listSingletonList2, i2));
                                arrayList4.add(ListProtector.get(listSingletonList3, i2));
                            }
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        C189200o6.m2constructorimpl(linkedHashMap2);
                        c23260099m.resumeWith(linkedHashMap2);
                    } else {
                        com.ss.android.vesdk.LoudnessDetectResult[] loudnessDetectResultArrLJIILJJIL = VEEditor.LJIILJJIL((String[]) arrayList2.toArray(new String[0]), C13LP.LLII(arrayList3), C13LP.LLII(arrayList4));
                        int i4 = 0;
                        for (Object obj4 : arrayList2) {
                            int i5 = i4 + 1;
                            if (i4 >= 0) {
                                String str = (String) obj4;
                                com.ss.android.vesdk.LoudnessDetectResult loudnessDetectResult2 = loudnessDetectResultArrLJIILJJIL[i4];
                                LoudnessDetectResult loudnessDetectResult3 = new LoudnessDetectResult(-1, 0.0d, 0.0d, "");
                                loudnessDetectResult3.result = loudnessDetectResult2.result;
                                loudnessDetectResult3.avgLoudness = loudnessDetectResult2.avgLoudness;
                                loudnessDetectResult3.peakLoudness = loudnessDetectResult2.peakLoudness;
                                loudnessDetectResult3.audioPath = str;
                                C1407440mjG.LIZ.put(str, loudnessDetectResult3);
                                linkedHashMap2.put(str, loudnessDetectResult3);
                                i4 = i5;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        C189200o6.m2constructorimpl(linkedHashMap2);
                        c23260099m.resumeWith(linkedHashMap2);
                    }
                    linkedHashMap = c23260099m.LIZ();
                    if (linkedHashMap == C099R.LJFF()) {
                        C099Q.LIZJ(this);
                    }
                } else {
                    linkedHashMap = new LinkedHashMap();
                }
            }
            if (linkedHashMap == objLJFF) {
                C1C7U.LIZIZ("AudioLoudnessHandler@cf39.onExtractAudio$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AudioLoudnessHandler@cf39.onExtractAudio$1");
        return linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends LoudnessDetectResult>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
