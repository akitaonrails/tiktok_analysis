package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ELQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELQ extends C09AY implements Function1<NLETrackSlot, Unit> {
    public final /* synthetic */ NLETrackSlot LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0ELT LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C0ELO LLILZLL;
    public final /* synthetic */ C259800zU<NLETrackSlot> LLIZ;
    public final /* synthetic */ C0EO0 LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ EditorProAIGCTemplateModel LLJI;
    public final /* synthetic */ NLETrack LLJIJIL;
    public final /* synthetic */ C0ELV LLJILJIL;
    public final /* synthetic */ C259800zU<NLETrackSlot> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ELQ(NLETrackSlot nLETrackSlot, String str, String str2, C0ELT c0elt, boolean z, C0ELO c0elo, C259800zU<NLETrackSlot> c259800zU, C0EO0 c0eo0, boolean z2, EditorProAIGCTemplateModel editorProAIGCTemplateModel, NLETrack nLETrack, C0ELV c0elv, C259800zU<NLETrackSlot> c259800zU2) {
        super(1);
        this.LL = nLETrackSlot;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c0elt;
        this.LLILZIL = z;
        this.LLILZLL = c0elo;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = c0eo0;
        this.LLJ = z2;
        this.LLJI = editorProAIGCTemplateModel;
        this.LLJIJIL = nLETrack;
        this.LLJILJIL = c0elv;
        this.LLJILJILJ = c259800zU2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, com.bytedance.ies.nle.editor_jni.NLENode, com.bytedance.ies.nle.editor_jni.NLETrackSlot] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NLETrackSlot nLETrackSlot) {
        String strLJJLIIIJ;
        NLEResourceNode resource;
        NLEResourceNode resource2;
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        NLESegmentTransition endTransition = this.LL.getEndTransition();
        if (endTransition != null) {
            nLETrackSlot2.setEndTransition(endTransition);
        }
        NLESegment mainSegment = nLETrackSlot2.getMainSegment();
        if (mainSegment != null && (resource2 = mainSegment.getResource()) != null) {
            resource2.setExtra("ep_ai_generated", "1");
        }
        C377740ErU.LJIIIIZZ(nLETrackSlot2, this.LLILLJJLI, this.LLILLL, this.LLILZ.LJII);
        if (this.LLILZIL) {
            nLETrackSlot2.setExtra("ai_playground_generated", "1");
        }
        NLESegment mainSegment2 = nLETrackSlot2.getMainSegment();
        if (mainSegment2 != null && (resource = mainSegment2.getResource()) != null) {
            resource.setExtra("ep_ai_generating", "1");
        }
        String strLJII = C352250DrT.LJII(this.LL);
        if (strLJII != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C377740ErU.LJ(nLETrackSlot2));
            arrayList.add(strLJII);
            if (arrayList.isEmpty()) {
                strLJJLIIIJ = "";
            } else {
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            }
            nLETrackSlot2.setExtra("creation_async_task_history", strLJJLIIIJ);
        }
        this.LLILZLL.H3(this.LL, nLETrackSlot2);
        this.LLIZ.element = nLETrackSlot2;
        Map<String, C0ELX> map = this.LLILZLL.LLJILJIL;
        String uuid = nLETrackSlot2.getUUID();
        C0ELT c0elt = this.LLILZ;
        map.put(uuid, new C0ELX(c0elt.LJIIIIZZ, c0elt.LIZ, nLETrackSlot2, c0elt.LJIIJ));
        this.LLILZLL.Z1(this.LL, nLETrackSlot2, this.LLIZLLLIL, this.LLJ);
        EditorProAIGCTemplateModel editorProAIGCTemplateModel = this.LLJI;
        if (editorProAIGCTemplateModel != null) {
            C377740ErU.LJII(nLETrackSlot2, editorProAIGCTemplateModel);
        }
        NLETrack nLETrack = this.LLJIJIL;
        if (nLETrack != null) {
            nLETrack.removeSlot(this.LL);
        }
        C0ELV c0elv = this.LLJILJIL;
        if (c0elv != null) {
            C0ELU.LIZ(nLETrackSlot2, c0elv);
        }
        C201955140j.LIZJ(C385300F8u.LIZIZ, "to Loading afterInsertFunc replace");
        this.LLJILJILJ.element = nLETrackSlot2;
        return Unit.LIZ;
    }
}
