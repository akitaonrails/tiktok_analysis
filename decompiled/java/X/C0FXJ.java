package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioFadeFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.startup.task.delay.CheckVoiceEffectResTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0FXJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FXJ extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(5);
    public final int $t;

    public static C0FXJ get$arr$(int i) {
        C0FXJ c0fxj = (C0FXJ) arr$.get(i);
        if (c0fxj != null) {
            return c0fxj;
        }
        arr$.compareAndSet(i, null, new C0FXJ(i));
        return (C0FXJ) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FXJ(int i) {
        super(4);
        this.$t = i;
    }

    public static final Object invoke$0(C0FXJ c0fxj, Object obj, Object obj2, Object obj3, Object obj4) {
        List<Effect> list = (List) obj;
        ((Boolean) obj2).booleanValue();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Effect effect : list) {
                if (C1664460tPo.LJFF(effect)) {
                    arrayList.add(effect);
                }
            }
        }
        if (arrayList.isEmpty()) {
            CheckVoiceEffectResTask.LLILLJJLI = false;
        }
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("available: ");
        sbLIZ.append(CheckVoiceEffectResTask.LLILLJJLI);
        C201955140j.LIZLLL(c563650M8t, "CheckVoiceEffectResTask", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$1(C0FXJ c0fxj, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        NLETrack nLETrack = (NLETrack) obj3;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj4;
        if (nLETrack.getTrackType() == NLETrackType.VIDEO && !nLETrack.getMainTrack() && C351220Dpo.LLIIJI(nLETrackSlot)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(X.C0FXJ r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r4 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r4
            boolean r0 = X.C351220Dpo.LJZL(r4)
            r3 = 1
            if (r0 != 0) goto L30
            com.bytedance.ies.nle.editor_jni.NLEAIMatting r0 = r4.getAIMatting()
            if (r0 == 0) goto L35
            com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting r0 = r0.getSegment()
            com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting r0 = com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting.dynamicCast(r0)
            if (r0 == 0) goto L35
            int r0 = r0.getMattingType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L35
            com.bytedance.ies.nle.editor_jni.NLEAIMattingType r0 = com.bytedance.ies.nle.editor_jni.NLEAIMattingType.MATTING_TYPE_SCRIPT_SALIENCY
            int r1 = r0.swigValue()
            int r0 = r2.intValue()
            r0 = r0 & r1
            if (r0 <= 0) goto L35
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L35:
            r3 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FXJ.invoke$2(X.0FXJ, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0022 A[EDGE_INSN: B:30:0x0022->B:10:0x0022 BREAK  A[LOOP:0: B:14:0x002c->B:32:0x002c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(X.C0FXJ r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r5 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r5
            com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr r1 = r5.getVideoEffects()
            boolean r0 = r1 instanceof java.util.Collection
            java.lang.String r2 = "editor_pro_effect_category"
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L46
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L46
        L14:
            com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr r1 = r5.getFilters()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L28
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L28
        L22:
            r3 = r4
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L28:
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLENode r0 = (com.bytedance.ies.nle.editor_jni.NLENode) r0
            java.lang.String r0 = r0.getExtra(r2)
            if (r0 == 0) goto L2c
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L2c
            r4 = 1
            goto L22
        L46:
            java.util.Iterator r1 = r1.iterator()
        L4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLENode r0 = (com.bytedance.ies.nle.editor_jni.NLENode) r0
            java.lang.String r0 = r0.getExtra(r2)
            if (r0 == 0) goto L4a
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 == 0) goto L23
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FXJ.invoke$3(X.0FXJ, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(C0FXJ c0fxj, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        NLESegmentAudioFadeFilter nLESegmentAudioFadeFilterDynamicCast;
        boolean z2;
        String strNLEFilterName_getAUDIO_FADE_FILTER = NLEEditorJniJNI.NLEFilterName_getAUDIO_FADE_FILTER();
        VecNLETrackSPtr tracks = ((NLEModel) obj2).getTracks();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            NLETrack next = it2.next();
            NLETrack nLETrack = next;
            if (C351220Dpo.LLLFF(nLETrack) || C351220Dpo.LLILL(nLETrack) || C351220Dpo.LLLILZLLLI(nLETrack)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList2);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                NLEFilter filterByName = ((NLETrackSlot) it4.next()).getFilterByName(strNLEFilterName_getAUDIO_FADE_FILTER);
                if (filterByName != null && (nLESegmentAudioFadeFilterDynamicCast = NLESegmentAudioFadeFilter.dynamicCast((NLENode) filterByName.getSegment())) != null) {
                    if (nLESegmentAudioFadeFilterDynamicCast.getFadeInLength() <= 0 && nLESegmentAudioFadeFilterDynamicCast.getFadeOutLength() <= 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    if (boolValueOf != null && boolValueOf.booleanValue()) {
                        break;
                    }
                }
            }
            z = false;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
