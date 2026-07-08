package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0EA1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0EA1 extends C2217421BqW implements Function0<Unit> {
    public C0EA1(C0EA5 c0ea5) {
        super(0, c0ea5, C0EA5.class, "applyToAll", "applyToAll()V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ?? arrayList;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        NLETrack nLETrackRn;
        VecNLETrackSlotSPtr sortedSlots;
        C0E55 player;
        C0EA5 c0ea5 = (C0EA5) this.receiver;
        C0E48 c0e48Invoke = c0ea5.LIZJ.invoke();
        if (c0e48Invoke != null && (player = c0e48Invoke.getPlayer()) != null) {
            player.pause(false);
        }
        C0E48 c0e48Invoke2 = c0ea5.LIZJ.invoke();
        NLETrackSlot nLETrackSlotLLLLLLIL = c0e48Invoke2 != null ? c0e48Invoke2.LLLLLLIL() : null;
        List<C351410Dq7> listLJIIJ = C351220Dpo.LJIIJ(nLETrackSlotLLLLLLIL);
        C0E48 c0e48Invoke3 = c0ea5.LIZJ.invoke();
        if (c0e48Invoke3 == null || (nLETrackRn = c0e48Invoke3.Rn()) == null || (sortedSlots = nLETrackRn.getSortedSlots()) == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList();
            for (NLETrackSlot nLETrackSlot : sortedSlots) {
                NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                if (nLETrackSlotLLLLLLIL == null || nLETrackSlot2.getId() != nLETrackSlotLLLLLLIL.getId()) {
                    arrayList.add(nLETrackSlot);
                }
            }
        }
        for (NLETrackSlot nLETrackSlot3 : arrayList) {
            for (C351410Dq7 c351410Dq7 : (ArrayList) C351220Dpo.LJIIJ(nLETrackSlot3)) {
                C0E48 c0e48Invoke4 = c0ea5.LIZJ.invoke();
                if (c0e48Invoke4 != null && (interfaceC351350Dq1LLFII2 = c0e48Invoke4.LLFII()) != null) {
                    interfaceC351350Dq1LLFII2.LJJIZ(nLETrackSlot3, c351410Dq7.LIZ.LIZIZ, 0, false, EnumC356070Dxd.NONE);
                }
            }
            for (C351410Dq7 c351410Dq72 : (ArrayList) listLJIIJ) {
                ArrayList arrayListLIZ = C09HN.LIZ(c351410Dq72.LIZ.LIZJ);
                if (arrayListLIZ != null && (!arrayListLIZ.isEmpty())) {
                    C351390Dq5 c351390Dq5 = c351410Dq72.LIZ;
                    C351410Dq7 c351410Dq73 = new C351410Dq7(new C351390Dq5(c351390Dq5.LIZ, c351390Dq5.LIZIZ, arrayListLIZ, c351390Dq5.LIZLLL), c351410Dq72.LIZIZ);
                    C0E48 c0e48Invoke5 = c0ea5.LIZJ.invoke();
                    if (c0e48Invoke5 != null && (interfaceC351350Dq1LLFII = c0e48Invoke5.LLFII()) != null) {
                        interfaceC351350Dq1LLFII.LJJLIIJ(nLETrackSlot3, c351410Dq73, EnumC356070Dxd.NONE);
                    }
                }
            }
        }
        c0ea5.LJ.LIZIZ(C0E1V.APPLY_TO_ALL.getNameId(), "");
        C0EAE c0eae = C0EAE.LIZ;
        C0EAE.LJIILJJIL(c0ea5.LJ.LJJJLIIL(), C0EA0.APPLY);
        return Unit.LIZ;
    }
}
