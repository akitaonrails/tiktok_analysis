package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ETe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365120ETe extends C09AY implements Function1<C364270EPx, Unit> {
    public final /* synthetic */ C365100ETc LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C365120ETe(C365100ETc c365100ETc) {
        super(1);
        this.LL = c365100ETc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C364270EPx c364270EPx) {
        EnumC365130ETf enumC365130ETf;
        C365220ETo second;
        C365220ETo second2;
        String str = c364270EPx.LIZIZ;
        C365200ETm c365200ETm = this.LL.LLLILZJ;
        if (c365200ETm == null) {
            c365200ETm = null;
        }
        c365200ETm.getClass();
        if (C113I.LIZLLL(str)) {
            enumC365130ETf = EnumC365130ETf.LLILLL;
        } else if (C113I.LJFF(str)) {
            enumC365130ETf = EnumC365130ETf.LLILLJJLI;
        } else {
            enumC365130ETf = EnumC365130ETf.LL;
        }
        if (c365200ETm.LLJILJILJ != enumC365130ETf) {
            c365200ETm.LLJILJILJ = enumC365130ETf;
            if (enumC365130ETf == EnumC365130ETf.LLILLL) {
                Iterator it2 = ((LinkedHashMap) c365200ETm.LLILZIL).values().iterator();
                while (it2.hasNext()) {
                    C786410Ut5.S1((C365220ETo) it2.next(), 8);
                }
                Pair<? extends NLETrackSlot, C365220ETo> pair = c365200ETm.LLILZLL;
                if (pair != null && (second2 = pair.getSecond()) != null) {
                    C786410Ut5.S1(second2, 0);
                }
            } else {
                for (NLETrackSlot nLETrackSlot : ((LinkedHashMap) c365200ETm.LLILZIL).keySet()) {
                    if (c365200ETm.LLJILJILJ == EnumC365130ETf.LLILLJJLI) {
                        if (C351220Dpo.LLLLIL(nLETrackSlot)) {
                            C365220ETo c365220ETo = (C365220ETo) ((LinkedHashMap) c365200ETm.LLILZIL).get(nLETrackSlot);
                            if (c365220ETo != null) {
                                C786410Ut5.S1(c365220ETo, 0);
                            }
                        } else {
                            C365220ETo c365220ETo2 = (C365220ETo) ((LinkedHashMap) c365200ETm.LLILZIL).get(nLETrackSlot);
                            if (c365220ETo2 != null) {
                                C786410Ut5.S1(c365220ETo2, 8);
                            }
                        }
                    } else if (C351220Dpo.LLLLIL(nLETrackSlot)) {
                        C365220ETo c365220ETo3 = (C365220ETo) ((LinkedHashMap) c365200ETm.LLILZIL).get(nLETrackSlot);
                        if (c365220ETo3 != null) {
                            C786410Ut5.S1(c365220ETo3, 8);
                        }
                    } else {
                        C365220ETo c365220ETo4 = (C365220ETo) ((LinkedHashMap) c365200ETm.LLILZIL).get(nLETrackSlot);
                        if (c365220ETo4 != null) {
                            C786410Ut5.S1(c365220ETo4, 0);
                        }
                    }
                }
                Pair<? extends NLETrackSlot, C365220ETo> pair2 = c365200ETm.LLILZLL;
                if (pair2 != null && (second = pair2.getSecond()) != null) {
                    C786410Ut5.S1(second, 8);
                }
            }
            InterfaceC365270ETt interfaceC365270ETt = c365200ETm.LLILLJJLI;
            if (interfaceC365270ETt != null) {
                interfaceC365270ETt.LIZJ(null);
            }
            c365200ETm.requestLayout();
        }
        return Unit.LIZ;
    }
}
