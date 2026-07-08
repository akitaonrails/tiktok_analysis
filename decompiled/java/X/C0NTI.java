package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.image.bottombar.CommentImageEditBottomBarComponent$onSave$textList$1", f = "CommentImageEditBottomBarComponent.kt", l = {}, m = "invokeSuspend")
public final class C0NTI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>>, Object> {
    public final /* synthetic */ C1451860nsu LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NTI(C1451860nsu c1451860nsu, InterfaceC1364105Vn<? super C0NTI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1451860nsu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NTI(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object arrayList;
        List<TextStickerModel> listC1;
        C1C7U.LIZ("CommentImageEditBottomBarComponent@a28c.onSave$textList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1450620nqu interfaceC1450620nquX5 = this.LL.x5();
        if (interfaceC1450620nquX5 != null && (listC1 = interfaceC1450620nquX5.c1()) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(listC1, 10));
            Iterator<TextStickerModel> it2 = listC1.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getTextStr());
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("CommentImageEditBottomBarComponent@a28c.onSave$textList$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
