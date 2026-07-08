package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel;
import com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel$initFontListData$1$effectFontTask$1", f = "BoardTextDynamicStyleViewModel.kt", l = {129}, m = "invokeSuspend")
public final class C469650IbL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<BoardTextFontStyleData>>, Object> {
    public int LL;
    public final /* synthetic */ BoardTextDynamicStyleViewModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C469650IbL(BoardTextDynamicStyleViewModel boardTextDynamicStyleViewModel, Context context, InterfaceC1364105Vn<? super C469650IbL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = boardTextDynamicStyleViewModel;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C469650IbL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BoardTextDynamicStyleViewModel@9bd6.initFontListData$1$effectFontTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (((ArrayList) this.LLILLJJLI.LLILLJJLI).isEmpty()) {
                BoardTextDynamicStyleViewModel boardTextDynamicStyleViewModel = this.LLILLJJLI;
                Context context = this.LLILLL;
                this.LL = 1;
                boardTextDynamicStyleViewModel.getClass();
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                C1839560xyE.LJIIIIZZ(context, new C474300Iiq(c2252611DEt, boardTextDynamicStyleViewModel));
                Object objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("BoardTextDynamicStyleViewModel@9bd6.initFontListData$1$effectFontTask$1");
                    return objLJFF;
                }
            }
        }
        List<BoardTextFontStyleData> list = this.LLILLJJLI.LLILLJJLI;
        C1C7U.LIZIZ("BoardTextDynamicStyleViewModel@9bd6.initFontListData$1$effectFontTask$1");
        return list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<BoardTextFontStyleData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
