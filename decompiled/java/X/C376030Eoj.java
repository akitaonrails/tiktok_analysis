package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Eoj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C376030Eoj extends C2217421BqW implements Function2<EditorProAIGCMediaItemModel, Boolean, Unit> {
    public C376030Eoj(C377730ErT c377730ErT) {
        super(2, c377730ErT, C377730ErT.class, "selectItem", "selectItem(Lcom/ss/android/ugc/aweme/creative/model/editorpro/aigc/EditorProAIGCMediaItemModel;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((C377730ErT) this.receiver).uK1(editorProAIGCMediaItemModel, zBooleanValue);
        return Unit.LIZ;
    }
}
