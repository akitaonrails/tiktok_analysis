package X;

import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.ui.PGCSubSpaceEditorDialogFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DW4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.ui.PGCSubSpaceEditorDialogFragment$setupEmojiPagerIfNeeded$2$1", f = "PGCSubSpaceEditorDialogFragment.kt", l = {}, m = "invokeSuspend")
public final class C0DW4 extends C09AX implements Function2<List<? extends C1175004ii>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PGCSubSpaceEditorDialogFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DW4(PGCSubSpaceEditorDialogFragment pGCSubSpaceEditorDialogFragment, InterfaceC1364105Vn<? super C0DW4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pGCSubSpaceEditorDialogFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0DW4 c0dw4 = new C0DW4(this.LLILLJJLI, interfaceC1364105Vn);
        c0dw4.LL = obj;
        return c0dw4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PGCSubSpaceEditorDialogFragment@245a.setupEmojiPagerIfNeeded$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Collection collection = (Collection) this.LL;
        C0DW6 c0dw6 = this.LLILLJJLI.LLJJIII;
        if (c0dw6 != null) {
            C0DUC c0duc = c0dw6.LLJJI;
            ((ArrayList) c0duc.LLILLL).clear();
            ((ArrayList) c0duc.LLILLL).addAll(collection);
            c0duc.notifyDataSetChanged();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PGCSubSpaceEditorDialogFragment@245a.setupEmojiPagerIfNeeded$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends C1175004ii> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
