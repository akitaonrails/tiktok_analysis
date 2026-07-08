package X;

import com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS47S0310000_32;
import kotlin.jvm.internal.AwS83S0210000_32;
import lth.o;

/* JADX INFO: renamed from: X.191w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214734191w {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void LIZ(C539960LFq c539960LFq, AbsSceneAdaptationScene absSceneAdaptationScene, boolean z) {
        C109W c109w;
        List<AbstractC191843103l> listSingletonList;
        if (!C1444380ngq.LIZ()) {
            return;
        }
        List<AbstractC191843103l> listLJIILLIIL = ComplianceServiceProvider.LJIJJ().LJIILLIIL(absSceneAdaptationScene.requireSceneContext(), absSceneAdaptationScene, absSceneAdaptationScene);
        ArrayList arrayList = new ArrayList();
        for (AbstractC191843103l abstractC191843103l : listLJIILLIIL) {
            if (abstractC191843103l instanceof AbstractC191842103k) {
                listSingletonList = ((AbstractC191842103k) abstractC191843103l).LLILLJJLI;
            } else {
                listSingletonList = Collections.singletonList(abstractC191843103l);
            }
            C19719612Di.LJJI(listSingletonList, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof C109Y) {
                arrayList2.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<C109Y> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (hashSet.add(((C109Y) obj2).LLILZ)) {
                arrayList3.add(obj2);
            }
        }
        for (C109Y c109y : arrayList3) {
            String str = c109y.LLILZ;
            switch (str.hashCode()) {
                case 719326975:
                    if (str.equals("publish_permission") && (c109y instanceof C109W) && (c109w = (C109W) c109y) != null) {
                        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("register component ");
                        sbLIZ.append(AnonymousClass1922.class.getName());
                        sbLIZ.append(" api ");
                        sbLIZ.append(InterfaceC905270ZfJ.class.getName());
                        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC905270ZfJ.class, AnonymousClass1922.class, new AwS398S0200000_32(new C0ET4(), c539960LFq, c109w, 21));
                    }
                    break;
                case 950398559:
                    if (str.equals("comment") && !o.LJIIZILJ.LIZ()) {
                        EnumC1642750sqn enumC1642750sqn2 = EnumC1642750sqn.IMMEDIATE;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("register component ");
                        sbLIZ2.append(AnonymousClass1929.class.getName());
                        sbLIZ2.append(" api ");
                        sbLIZ2.append(C05YF.class.getName());
                        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn2, null, C05YF.class, AnonymousClass1929.class, new AwS83S0210000_32(new C0ET4(), c539960LFq, c109y, z, 0));
                    }
                    break;
                case 1296492712:
                    if (str.equals("allow_ai_remix") && C10IZ.LJII()) {
                        EnumC1642750sqn enumC1642750sqn3 = EnumC1642750sqn.IMMEDIATE;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("register component ");
                        sbLIZ3.append(C192E.class.getName());
                        sbLIZ3.append(" api ");
                        sbLIZ3.append(C05YF.class.getName());
                        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn3, null, C05YF.class, C192E.class, new AwS47S0310000_32(new C0ET4(), c539960LFq, absSceneAdaptationScene, c109y, z, 2));
                    }
                    break;
                case 1458418560:
                    if (str.equals("content_reuse_permission") && C10IZ.LJIIIZ()) {
                        EnumC1642750sqn enumC1642750sqn4 = EnumC1642750sqn.IMMEDIATE;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("register component ");
                        sbLIZ4.append(C192F.class.getName());
                        sbLIZ4.append(" api ");
                        sbLIZ4.append(C05YF.class.getName());
                        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn4, null, C05YF.class, C192F.class, new AwS47S0310000_32(new C0ET4(), c539960LFq, absSceneAdaptationScene, c109y, z, 1));
                    }
                    break;
            }
        }
    }
}
