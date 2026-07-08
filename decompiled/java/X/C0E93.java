package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E93, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E93 {
    public final C372480Ej0 LIZ;
    public final C0E5S LIZIZ;

    public C0E93(C372480Ej0 c372480Ej0, C0E5S c0e5s) {
        this.LIZ = c372480Ej0;
        this.LIZIZ = c0e5s;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
    public final void LIZ(C0E48 c0e48, VideoPublishEditModel videoPublishEditModel, Function0<Unit> function0, Function0<Unit> function02) {
        Object objLJJJLIIL = C13LP.LJJJLIIL(C354090DuR.LJI);
        C013C c013c = new C013C();
        C259800zU c259800zU = new C259800zU();
        VecNLETrackSPtr tracks = C350870DpF.LJI(c0e48).getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLLLJ(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NLETrack nLETrack2 = (NLETrack) it2.next();
            Iterator<NLETrackSlot> it3 = nLETrack2.getSlots().iterator();
            while (true) {
                if (it3.hasNext()) {
                    ?? next = it3.next();
                    if (Intrinsics.LJFF(((NLENode) next).getUUID(), objLJJJLIIL)) {
                        if (next != 0) {
                            c259800zU.element = next;
                            c013c.element = nLETrack2.getMainTrack();
                            break;
                        }
                    }
                }
            }
        }
        C1397580mTM c1397580mTM = new C1397580mTM(this.LIZ.requireActivity());
        c1397580mTM.LJI(this.LIZ.getString(2131830450));
        c1397580mTM.LIZIZ(this.LIZ.getString(2131830447));
        C985403tE.LIZ(c1397580mTM, new C0E92(this, videoPublishEditModel, c0e48, function0, c259800zU, c013c, function02));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }
}
