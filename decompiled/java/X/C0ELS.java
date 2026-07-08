package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ELS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELS extends C09AY implements Function1<NLETrackSlot, Unit> {
    public final /* synthetic */ C259800zU<NLETrackSlot> LL;
    public final /* synthetic */ NLETrackSlot LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C0ELT LLILZIL;
    public final /* synthetic */ C0ELO LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ C259800zU<NLETrackSlot> LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ C0EO0 LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ NLETrack LLJILJIL;
    public final /* synthetic */ C0ELV LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ELS(C259800zU<NLETrackSlot> c259800zU, NLETrackSlot nLETrackSlot, String str, String str2, C0ELT c0elt, C0ELO c0elo, boolean z, C259800zU<NLETrackSlot> c259800zU2, String str3, C0EO0 c0eo0, boolean z2, NLETrack nLETrack, C0ELV c0elv) {
        super(1);
        this.LL = c259800zU;
        this.LLILLJJLI = nLETrackSlot;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c0elt;
        this.LLILZLL = c0elo;
        this.LLIZ = z;
        this.LLIZLLLIL = c259800zU2;
        this.LLJ = str3;
        this.LLJI = c0eo0;
        this.LLJIJIL = z2;
        this.LLJILJIL = nLETrack;
        this.LLJILJILJ = c0elv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.bytedance.ies.nle.editor_jni.NLENode, com.bytedance.ies.nle.editor_jni.NLETrackSlot] */
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
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        this.LL.element = nLETrackSlot2;
        NLESegmentTransition endTransition = this.LLILLJJLI.getEndTransition();
        if (endTransition != null) {
            nLETrackSlot2.setEndTransition(endTransition);
        }
        C377740ErU.LJIIIIZZ(nLETrackSlot2, this.LLILLL, this.LLILZ, this.LLILZIL.LJII);
        this.LLILZLL.H3(this.LLILLJJLI, nLETrackSlot2);
        if (this.LLIZ) {
            nLETrackSlot2.setExtra("ai_playground_generated", "1");
        }
        this.LLIZLLLIL.element = nLETrackSlot2;
        NLESegment mainSegment = nLETrackSlot2.getMainSegment();
        if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
            resource.setExtra("ep_ai_generated", "1");
        }
        this.LLILZLL.LLJILJIL.remove(this.LLJ);
        this.LLILZLL.Z1(this.LLILLJJLI, nLETrackSlot2, this.LLJI, this.LLJIJIL);
        NLETrack nLETrack = this.LLJILJIL;
        if (nLETrack != null) {
            nLETrack.removeSlot(this.LLILLJJLI);
        }
        C0ELV c0elv = this.LLJILJILJ;
        if (c0elv != null) {
            C0ELU.LIZ(nLETrackSlot2, c0elv);
        }
        C201955140j.LIZJ(C385300F8u.LIZIZ, "to normal slot afterInsertFunc replace");
        return Unit.LIZ;
    }
}
