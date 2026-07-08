package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yH9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1851290yH9 extends C2217421BqW implements Function1<AIGenerationType, Unit> {
    public C1851290yH9(C1851340yHE c1851340yHE) {
        super(1, c1851340yHE, C1851340yHE.class, "onGenerationTypeSelected", "onGenerationTypeSelected(Lcom/ss/android/ugc/aweme/creative/model/editorpro/aigc/AIGenerationType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AIGenerationType aIGenerationType) {
        ((C1851340yHE) this.receiver).O4(aIGenerationType);
        return Unit.LIZ;
    }
}
