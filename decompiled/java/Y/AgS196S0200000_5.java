package Y;

import X.AnonymousClass0956;
import X.C0E48;
import X.C0FQS;
import X.C0LSZ;
import X.C1295960jpS;
import X.C15438062q;
import X.C1697810uHb;
import X.C201955140j;
import X.C2188811AlT;
import X.C23250099c;
import X.C350870DpF;
import X.C369780Eee;
import X.C377150EqX;
import X.C377590ErF;
import X.C379170Etn;
import X.C381150Ewz;
import X.C381160Ex0;
import X.C381170Ex1;
import X.C381180Ex2;
import X.C381230Ex7;
import X.C381270ExB;
import X.C381540Exc;
import X.C383070F0f;
import X.C383080F0g;
import X.C383090F0h;
import X.C383640F2k;
import X.C383650F2l;
import X.C385300F8u;
import X.C786410Ut5;
import X.EnumC382750EzZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.InterfaceC363160ELq;
import X.InterfaceC383170F0p;
import X.InterfaceC497601wk;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class AgS196S0200000_5 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            case 7:
                return emit$7(this, obj, interfaceC1364105Vn);
            case 8:
                return emit$8(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_ECAF /* 9 */:
                return emit$9(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return emit$10(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS196S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(AgS196S0200000_5 agS196S0200000_5, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C377590ErF c377590ErF = (C377590ErF) agS196S0200000_5.l0;
        ArrayList<C381540Exc> arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            C381540Exc c381540Exc = (C381540Exc) obj2;
            if (c377590ErF.D5(c381540Exc) && c381540Exc.LJIIIZ.length() == 0) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) agS196S0200000_5.l1;
        C377590ErF c377590ErF2 = (C377590ErF) agS196S0200000_5.l0;
        for (C381540Exc c381540Exc2 : arrayList) {
            C377150EqX c377150EqX = C377150EqX.LIZ;
            for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel : C377150EqX.LJIIJ(videoPublishEditModel, c381540Exc2.LIZ, C1697810uHb.LJIIJJI(EditorProAIGCMediaItemModelStatus.LOADING, EditorProAIGCMediaItemModelStatus.COMPLETE, EditorProAIGCMediaItemModelStatus.ERROR))) {
                NLETrackSlot nLETrackSlotK6 = c377590ErF2.K6(c381540Exc2, editorProAIGCMediaItemModel);
                if (nLETrackSlotK6 != null && c377590ErF2.T2(nLETrackSlotK6, c381540Exc2, editorProAIGCMediaItemModel, linkedHashMap)) {
                    NLEEditor nLEEditorN5 = c377590ErF2.n5();
                    if (nLEEditorN5 != null) {
                        Boolean.valueOf(nLEEditorN5.commit());
                    }
                    C385300F8u c385300F8u = C385300F8u.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Restored slot: taskId=");
                    sbLIZ.append(c381540Exc2.LIZ);
                    sbLIZ.append(", epId=");
                    sbLIZ.append(editorProAIGCMediaItemModel.epAIGCId);
                    sbLIZ.append(", slotId=");
                    sbLIZ.append(nLETrackSlotK6.getUUID());
                    sbLIZ.append(", status=");
                    sbLIZ.append(editorProAIGCMediaItemModel.status);
                    C201955140j.LIZLLL(c385300F8u, "EditorProAIGCComponent", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            C0E48 c0e48W1 = ((C377590ErF) agS196S0200000_5.l0).W1();
            if (c0e48W1 != null) {
                NLEModel nLEModelLJI = C350870DpF.LJI(c0e48W1);
                InterfaceC363160ELq interfaceC363160ELqC5 = ((C377590ErF) agS196S0200000_5.l0).C5();
                if (interfaceC363160ELqC5 != null) {
                    interfaceC363160ELqC5.zo2(nLEModelLJI, linkedHashMap);
                }
            }
            ((C377590ErF) agS196S0200000_5.l0).LLJILJIL = true;
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS196S0200000_5 agS196S0200000_5, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC383170F0p interfaceC383170F0p;
        List<C379170Etn> list = (List) obj;
        C383070F0f c383070F0f = (C383070F0f) agS196S0200000_5.l0;
        if (c383070F0f.LJIILJJIL.LIZ == EnumC382750EzZ.VIDEO && (interfaceC383170F0p = c383070F0f.LJ) != null) {
            interfaceC383170F0p.LIZ(list);
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C379170Etn> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        C383080F0g c383080F0g = ((C383070F0f) agS196S0200000_5.l0).LJIIIZ;
        c383080F0g.LIZLLL.LIZJ();
        c383080F0g.LJ.LIZJ();
        c383080F0g.LJIIJ = list;
        C369780Eee.LIZ.getClass();
        if (C369780Eee.LIZIZ() && list.size() == 1) {
            c383080F0g.LIZ((C379170Etn) ListProtector.get(list, 0));
        }
        c383080F0g.LIZIZ();
        int size2 = list.size();
        if (size2 != 0) {
            if (size2 != 1) {
                C383650F2l c383650F2l = c383080F0g.LIZLLL;
                c383650F2l.LIZLLL((C379170Etn) ListProtector.get(list, 0), true);
                String string = c383080F0g.LIZIZ.getContext().getString(2131834190);
                C786410Ut5.LJLLLLLL(0, (View) c383650F2l.LIZLLL.getValue());
                ((TextView) c383650F2l.LJ.getValue()).setText(string);
                C383640F2k c383640F2k = c383080F0g.LJ;
                ((C1295960jpS) c383640F2k.LJIIIZ.getValue()).setAnimation(R.raw.tux_lottie_common_creation_icon_ai_transition_arrow);
                c383640F2k.LIZLLL((C379170Etn) ListProtector.get(list, 1), true);
                String string2 = c383080F0g.LIZIZ.getContext().getString(2131834189);
                C786410Ut5.LJLLLLLL(0, (View) c383640F2k.LIZLLL.getValue());
                ((TextView) c383640F2k.LJ.getValue()).setText(string2);
            } else {
                c383080F0g.LIZLLL.LIZLLL((C379170Etn) ListProtector.get(list, 0), false);
            }
        }
        AnonymousClass0956 anonymousClass0956 = ((C383070F0f) agS196S0200000_5.l0).LJIILL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C383070F0f c383070F0f2 = (C383070F0f) agS196S0200000_5.l0;
        c383070F0f2.LJIILL = C23250099c.LIZLLL((InterfaceC497601wk) agS196S0200000_5.l1, null, null, new C383090F0h(list, c383070F0f2, arrayList, size, null), 3);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$10(Y.AgS196S0200000_5 r9, java.lang.Object r10, X.InterfaceC1364105Vn r11) {
        /*
            boolean r0 = r11 instanceof X.C0E0O
            if (r0 == 0) goto L9a
            r6 = r11
            X.0E0O r6 = (X.C0E0O) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r7 = 1
            if (r0 == 0) goto L25
            if (r0 != r7) goto La1
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r9.l0
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r10.iterator()
        L37:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r2 = r8.next()
            r1 = r2
            X.0LSZ r1 = (X.C0LSZ) r1
            java.lang.String r0 = r1.LJFF
            boolean r0 = X.C381270ExB.LIZ(r0)
            if (r0 == 0) goto L37
            java.lang.String r0 = r1.LJIIIZ
            int r0 = r0.length()
            if (r0 != 0) goto L37
            r3.add(r2)
            goto L37
        L58:
            Y.AComparatorS24S0000000_5 r1 = new Y.AComparatorS24S0000000_5
            r0 = 148(0x94, float:2.07E-43)
            r1.<init>(r0)
            java.util.List r1 = X.C13LP.LJLLLL(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L72:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r2.next()
            X.0LSZ r0 = (X.C0LSZ) r0
            java.lang.Object r1 = r9.l1
            com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel r1 = (com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel) r1
            X.0Exc r0 = X.C0LSP.LIZIZ(r0)
            r1.getClass()
            X.0Equ r0 = com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel.HQ2(r0)
            r3.add(r0)
            goto L72
        L91:
            r6.LLILLJJLI = r7
            java.lang.Object r0 = r4.emit(r3, r6)
            if (r0 != r5) goto L22
            return r5
        L9a:
            X.0E0O r6 = new X.0E0O
            r6.<init>(r9, r11)
            goto L12
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS196S0200000_5.emit$10(Y.AgS196S0200000_5, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$2(AgS196S0200000_5 agS196S0200000_5, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        List<C381540Exc> list = (List) obj;
        C381180Ex2 c381180Ex2 = (C381180Ex2) agS196S0200000_5.l0;
        C0FQS c0fqs = (C0FQS) agS196S0200000_5.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C381540Exc c381540Exc : list) {
            String str = c381540Exc.LIZLLL;
            String str2 = c381540Exc.LJ;
            arrayList.add(new C381230Ex7(str, c381540Exc.LJIILL, Intrinsics.LJFF(c381540Exc.LJFF, "ASYNC"), str2, c381540Exc.LJIILLIIL, c381540Exc.LJII, c381540Exc.toString()));
        }
        c381180Ex2.LJJIJ(c0fqs, arrayList);
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS196S0200000_5 agS196S0200000_5, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        List<C0LSZ> list = (List) obj;
        C381180Ex2 c381180Ex2 = (C381180Ex2) agS196S0200000_5.l0;
        C0FQS c0fqs = (C0FQS) agS196S0200000_5.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C0LSZ c0lsz : list) {
            String str = c0lsz.LIZLLL;
            String str2 = c0lsz.LJ;
            arrayList.add(new C381230Ex7(str, c0lsz.LJIILL, C381270ExB.LIZ(c0lsz.LJFF), str2, c0lsz.LJIILLIIL, c0lsz.LJII, c0lsz.toString()));
        }
        c381180Ex2.LJJIJ(c0fqs, arrayList);
        return Unit.LIZ;
    }

    public static final Object emit$4(AgS196S0200000_5 agS196S0200000_5, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        List<C381540Exc> list = (List) obj;
        C381150Ewz c381150Ewz = (C381150Ewz) agS196S0200000_5.l0;
        C0FQS c0fqs = (C0FQS) agS196S0200000_5.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C381540Exc c381540Exc : list) {
            String str = c381540Exc.LIZLLL;
            String str2 = c381540Exc.LJ;
            arrayList.add(new C381230Ex7(str, c381540Exc.LJIILL, Intrinsics.LJFF(c381540Exc.LJFF, "ASYNC"), str2, c381540Exc.LJIILLIIL, c381540Exc.LJII, c381540Exc.toString()));
        }
        c381150Ewz.LJJIJ(c0fqs, arrayList);
        return Unit.LIZ;
    }

    public static final Object emit$5(AgS196S0200000_5 agS196S0200000_5, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        List<C0LSZ> list = (List) obj;
        C381150Ewz c381150Ewz = (C381150Ewz) agS196S0200000_5.l0;
        C0FQS c0fqs = (C0FQS) agS196S0200000_5.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C0LSZ c0lsz : list) {
            String str = c0lsz.LIZLLL;
            String str2 = c0lsz.LJ;
            arrayList.add(new C381230Ex7(str, c0lsz.LJIILL, C381270ExB.LIZ(c0lsz.LJFF), str2, c0lsz.LJIILLIIL, c0lsz.LJII, c0lsz.toString()));
        }
        c381150Ewz.LJJIJ(c0fqs, arrayList);
        return Unit.LIZ;
    }

    public static final Object emit$6(AgS196S0200000_5 agS196S0200000_5, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        List<C381540Exc> list = (List) obj;
        C381170Ex1 c381170Ex1 = (C381170Ex1) agS196S0200000_5.l0;
        C0FQS c0fqs = (C0FQS) agS196S0200000_5.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C381540Exc c381540Exc : list) {
            String str = c381540Exc.LIZLLL;
            String str2 = c381540Exc.LJ;
            arrayList.add(new C381230Ex7(str, c381540Exc.LJIILL, Intrinsics.LJFF(c381540Exc.LJFF, "ASYNC"), str2, c381540Exc.LJIILLIIL, c381540Exc.LJII, c381540Exc.toString()));
        }
        c381170Ex1.LJJIJ(c0fqs, arrayList);
        return Unit.LIZ;
    }

    public static final Object emit$7(AgS196S0200000_5 agS196S0200000_5, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        List<C0LSZ> list = (List) obj;
        C381170Ex1 c381170Ex1 = (C381170Ex1) agS196S0200000_5.l0;
        C0FQS c0fqs = (C0FQS) agS196S0200000_5.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C0LSZ c0lsz : list) {
            String str = c0lsz.LIZLLL;
            String str2 = c0lsz.LJ;
            arrayList.add(new C381230Ex7(str, c0lsz.LJIILL, C381270ExB.LIZ(c0lsz.LJFF), str2, c0lsz.LJIILLIIL, c0lsz.LJII, c0lsz.toString()));
        }
        c381170Ex1.LJJIJ(c0fqs, arrayList);
        return Unit.LIZ;
    }

    public static final Object emit$8(AgS196S0200000_5 agS196S0200000_5, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        List<C381540Exc> list = (List) obj;
        C381160Ex0 c381160Ex0 = (C381160Ex0) agS196S0200000_5.l0;
        C0FQS c0fqs = (C0FQS) agS196S0200000_5.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C381540Exc c381540Exc : list) {
            String str = c381540Exc.LIZLLL;
            String str2 = c381540Exc.LJ;
            arrayList.add(new C381230Ex7(str, c381540Exc.LJIILL, Intrinsics.LJFF(c381540Exc.LJFF, "ASYNC"), str2, c381540Exc.LJIILLIIL, c381540Exc.LJII, c381540Exc.toString()));
        }
        c381160Ex0.LJJIJ(c0fqs, arrayList);
        return Unit.LIZ;
    }

    public static final Object emit$9(AgS196S0200000_5 agS196S0200000_5, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        List<C0LSZ> list = (List) obj;
        C381160Ex0 c381160Ex0 = (C381160Ex0) agS196S0200000_5.l0;
        C0FQS c0fqs = (C0FQS) agS196S0200000_5.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C0LSZ c0lsz : list) {
            String str = c0lsz.LIZLLL;
            String str2 = c0lsz.LJ;
            arrayList.add(new C381230Ex7(str, c0lsz.LJIILL, C381270ExB.LIZ(c0lsz.LJFF), str2, c0lsz.LJIILLIIL, c0lsz.LJII, c0lsz.toString()));
        }
        c381160Ex0.LJJIJ(c0fqs, arrayList);
        return Unit.LIZ;
    }
}
