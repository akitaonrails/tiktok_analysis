package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel$compileRecordAudio$2", f = "AudioRecordActivityViewModel.kt", l = {177}, m = "invokeSuspend")
public final class C314670CVd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ AudioRecordActivityViewModel LLILLL;
    public final /* synthetic */ C0E48 LLILZ;
    public final /* synthetic */ VideoPublishEditModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314670CVd(AudioRecordActivityViewModel audioRecordActivityViewModel, C0E48 c0e48, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C314670CVd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = audioRecordActivityViewModel;
        this.LLILZ = c0e48;
        this.LLILZIL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314670CVd(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

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
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        C1C7U.LIZ("AudioRecordActivityViewModel@463c.compileRecordAudio$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = new C259800zU();
            c259800zU.element = "";
            C1DFB c1dfb = C0PEM.LIZJ;
            C352170DrL c352170DrL = new C352170DrL(this.LLILLL, c259800zU, this.LLILZ, this.LLILZIL, null);
            this.LL = c259800zU;
            this.LLILLJJLI = 1;
            if (C23250099c.LJI(this, c1dfb, c352170DrL) == objLJFF) {
                C1C7U.LIZIZ("AudioRecordActivityViewModel@463c.compileRecordAudio$2");
                return objLJFF;
            }
        }
        this.LLILLL.LLILZ.setValue(c259800zU.element);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AudioRecordActivityViewModel@463c.compileRecordAudio$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
