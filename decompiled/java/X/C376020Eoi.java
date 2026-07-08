package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Eoi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C376020Eoi extends C2217421BqW implements Function2<EditorProAIGCMediaItemModel, Boolean, Unit> {
    public C376020Eoi(C375990Eof c375990Eof) {
        super(2, c375990Eof, C375990Eof.class, "selectItem", "selectItem(Lcom/ss/android/ugc/aweme/creative/model/editorpro/aigc/EditorProAIGCMediaItemModel;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((C375990Eof) this.receiver).uK1(editorProAIGCMediaItemModel, zBooleanValue);
        return Unit.LIZ;
    }
}
