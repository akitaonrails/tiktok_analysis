package X;

import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0drN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066510drN extends AbstractC1066520drO<C1066490drL> {
    public final C1353210lJn LL;
    public final WeakReference<InterfaceC1066540drQ> LLILLJJLI;

    public C1066510drN(C1353210lJn c1353210lJn) {
        super(c1353210lJn);
        this.LL = c1353210lJn;
        this.LLILLJJLI = new WeakReference<>(null);
    }

    @Override // X.AbstractC1066520drO
    public final void I5(C1066490drL c1066490drL) {
        if (c1066490drL.LJ && C296020Biy.LIZ()) {
            this.LL.setCommentStyle(true);
        }
        CommentStruct commentStruct = c1066490drL.LIZJ;
        if (commentStruct != null) {
            this.LL.setData(commentStruct);
        }
        if (this.LLILLJJLI.get() != null) {
            this.LL.setOnInternalEventListener(this.LLILLJJLI.get());
        }
    }
}
