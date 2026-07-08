package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ELR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELR extends C09AY implements Function1<NLETrackSlot, Unit> {
    public final /* synthetic */ NLETrackSlot LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0ELT LLILLL;
    public final /* synthetic */ EditorProAIGCTemplateModel LLILZ;
    public final /* synthetic */ C259800zU<NLETrackSlot> LLILZIL;
    public final /* synthetic */ C0ELO LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ NLETrack LLIZLLLIL;
    public final /* synthetic */ C0ELV LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ELR(NLETrackSlot nLETrackSlot, String str, C0ELT c0elt, EditorProAIGCTemplateModel editorProAIGCTemplateModel, C259800zU<NLETrackSlot> c259800zU, C0ELO c0elo, boolean z, NLETrack nLETrack, C0ELV c0elv) {
        super(1);
        this.LL = nLETrackSlot;
        this.LLILLJJLI = str;
        this.LLILLL = c0elt;
        this.LLILZ = editorProAIGCTemplateModel;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c0elo;
        this.LLIZ = z;
        this.LLIZLLLIL = nLETrack;
        this.LLJ = c0elv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, com.bytedance.ies.nle.editor_jni.NLENode, com.bytedance.ies.nle.editor_jni.NLETrackSlot] */
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
        NLEResourceNode resource;
        NLEResourceNode resource2;
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        NLESegment mainSegment = nLETrackSlot2.getMainSegment();
        if (mainSegment != null && (resource2 = mainSegment.getResource()) != null) {
            resource2.setExtra("ep_ai_generated", "1");
        }
        NLESegment mainSegment2 = nLETrackSlot2.getMainSegment();
        if (mainSegment2 != null && (resource = mainSegment2.getResource()) != null) {
            resource.setExtra("ep_ai_generating", "1");
        }
        NLETrackSlot nLETrackSlot3 = this.LL;
        if (nLETrackSlot3 != null) {
            C0ELO c0elo = this.LLILZLL;
            boolean z = this.LLIZ;
            C0ELT c0elt = this.LLILLL;
            NLETrack nLETrack = this.LLIZLLLIL;
            C0ELV c0elv = this.LLJ;
            c0elo.Z1(nLETrackSlot3, nLETrackSlot2, C351490DqF.LIZIZ(nLETrackSlot2, c0elo.v3()), z);
            if (c0elt.LJIILJJIL) {
                c0elo.w2(nLETrackSlot3, nLETrackSlot2);
            }
            if (!c0elt.LJIILIIL && nLETrack != null) {
                nLETrack.removeSlot(nLETrackSlot3);
            }
            if (c0elv != null) {
                C0ELU.LIZ(nLETrackSlot2, c0elv);
            }
        }
        String string = this.LLILLJJLI;
        if (string.length() == 0) {
            string = UUID.randomUUID().toString();
        }
        C377740ErU.LJIIIIZZ(nLETrackSlot2, string, "not ready", this.LLILLL.LJII);
        C377740ErU.LJII(nLETrackSlot2, this.LLILZ);
        this.LLILZIL.element = nLETrackSlot2;
        Map<String, C0ELX> map = this.LLILZLL.LLJILJIL;
        String uuid = nLETrackSlot2.getUUID();
        C0ELT c0elt2 = this.LLILLL;
        map.put(uuid, new C0ELX(c0elt2.LJIIIIZZ, c0elt2.LIZ, nLETrackSlot2, c0elt2.LJIIJ));
        return Unit.LIZ;
    }
}
