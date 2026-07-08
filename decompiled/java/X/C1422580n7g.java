package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0n7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422580n7g extends C09AY implements Function1<C1423070n8T, C1423070n8T> {
    public final /* synthetic */ List<C1419590n2r> LL;
    public final /* synthetic */ C1419590n2r LLILLJJLI;
    public final /* synthetic */ Rect LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ Bitmap LLILZIL;
    public final /* synthetic */ C1422890n8B LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1422580n7g(List<C1419590n2r> list, C1419590n2r c1419590n2r, Rect rect, float f, Bitmap bitmap, C1422890n8B c1422890n8B) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = c1419590n2r;
        this.LLILLL = rect;
        this.LLILZ = f;
        this.LLILZIL = bitmap;
        this.LLILZLL = c1422890n8B;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1423070n8T invoke(C1423070n8T c1423070n8T) {
        return C1423070n8T.LIZ(c1423070n8T, new C375830EoP(new C443120HZe(this.LL, new Pair(new C443120HZe(this.LLILLJJLI, this.LLILLL, Float.valueOf(this.LLILZ)), this.LLILZIL), this.LLILZLL)), null, null, null, false, null, false, false, null, null, null, null, 32763);
    }
}
