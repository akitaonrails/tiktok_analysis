package X;

import com.ss.android.ugc.gamora.editorpro.model.EditorProCancelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Eio, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C372360Eio extends C2217421BqW implements Function1<EditorProCancelData, Unit> {
    public C372360Eio(C372050EiJ c372050EiJ) {
        super(1, c372050EiJ, C372050EiJ.class, "setCancelResult", "setCancelResult(Lcom/ss/android/ugc/gamora/editorpro/model/EditorProCancelData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EditorProCancelData editorProCancelData) {
        ((C372050EiJ) this.receiver).d8(editorProCancelData);
        return Unit.LIZ;
    }
}
