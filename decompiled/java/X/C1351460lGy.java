package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lGy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.multipanel.HorizontalEmojiMiniPanel$addMiniEmojiPanel$1", f = "HorizontalEmojiMiniPanel.kt", l = {272}, m = "invokeSuspend")
public final class C1351460lGy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1351440lGw LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1351460lGy(C1351440lGw c1351440lGw, InterfaceC1364105Vn<? super C1351460lGy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1351440lGw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1351460lGy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("HorizontalEmojiMiniPanel@cf65.addMiniEmojiPanel$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1351440lGw c1351440lGw = this.LLILLJJLI;
            c1351440lGw.getClass();
            C0I2X.LIZ.getClass();
            List<CommentPersonalizedEmoji> listLIZIZ = C0I2X.LIZIZ();
            c1351440lGw.LLIZLLLIL = listLIZIZ;
            ViewGroup viewGroup = c1351440lGw.LL;
            if (viewGroup != null) {
                if (((ArrayList) listLIZIZ).isEmpty()) {
                    i = 4;
                } else {
                    i = 0;
                }
                C786410Ut5.LJLZ(i, viewGroup);
            }
            this.LLILLJJLI.LJIIIIZZ();
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1351480lH0 c1351480lH0 = new C1351480lH0(this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1351480lH0) == objLJFF) {
                C1C7U.LIZIZ("HorizontalEmojiMiniPanel@cf65.addMiniEmojiPanel$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HorizontalEmojiMiniPanel@cf65.addMiniEmojiPanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
