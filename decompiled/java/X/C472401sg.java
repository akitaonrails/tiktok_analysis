package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir1Assem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01sg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir1Assem$bindThumbnails$2", f = "SearchKeyframeOptDir1Assem.kt", l = {147, 147}, m = "invokeSuspend")
public final class C472401sg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C376410EpL LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ SearchKeyframeOptDir1Assem LLIZ;
    public final /* synthetic */ Aweme LLIZLLLIL;
    public final /* synthetic */ List<SearchKeyFramePoint> LLJ;
    public final /* synthetic */ List<C376410EpL> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C472401sg(SearchKeyframeOptDir1Assem searchKeyframeOptDir1Assem, Aweme aweme, List<SearchKeyFramePoint> list, List<C376410EpL> list2, InterfaceC1364105Vn<? super C472401sg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = searchKeyframeOptDir1Assem;
        this.LLIZLLLIL = aweme;
        this.LLJ = list;
        this.LLJI = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C472401sg(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0090 -> B:7:0x0026). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0097 -> B:10:0x002d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "SearchKeyframeOptDir1Assem@9e64.bindThumbnails$2"
            X.C1C7U.LIZ(r10)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r11.LLILZLL
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L99
            if (r0 == r4) goto L65
            if (r0 != r5) goto Lc0
            int r9 = r11.LLILZIL
            X.0EpL r2 = r11.LLILZ
            java.lang.Object r8 = r11.LLILLL
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r7 = r11.LLILLJJLI
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r1 = r11.LL
            java.util.Map r1 = (java.util.Map) r1
            X.C155000ia.LIZIZ(r12)
        L26:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            if (r12 == 0) goto L96
            r2.setImageBitmap(r12)
        L2d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lba
            java.lang.Object r0 = r8.next()
            int r3 = r9 + 1
            if (r9 < 0) goto Lb5
            java.lang.Object r2 = X.C13LP.LJJJLZIJ(r9, r7)
            X.0EpL r2 = (X.C376410EpL) r2
            if (r2 == 0) goto L97
            if (r1 == 0) goto L97
            java.lang.Object r0 = r1.get(r0)
            X.0957 r0 = (X.AnonymousClass0957) r0
            if (r0 == 0) goto L97
            r11.LL = r1
            r11.LLILLJJLI = r7
            r11.LLILLL = r8
            r11.LLILZ = r2
            r11.LLILZIL = r3
            r11.LLILZLL = r4
            java.lang.Object r12 = r0.LJLIIIL(r11)
            if (r12 != r6) goto L63
            X.C1C7U.LIZIZ(r10)
            return r6
        L63:
            r9 = r3
            goto L78
        L65:
            int r9 = r11.LLILZIL
            X.0EpL r2 = r11.LLILZ
            java.lang.Object r8 = r11.LLILLL
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r7 = r11.LLILLJJLI
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r1 = r11.LL
            java.util.Map r1 = (java.util.Map) r1
            X.C155000ia.LIZIZ(r12)
        L78:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            if (r12 == 0) goto L96
            X.099G r0 = X.C397801ge.LIZ(r12, r2)
            r11.LL = r1
            r11.LLILLJJLI = r7
            r11.LLILLL = r8
            r11.LLILZ = r2
            r11.LLILZIL = r9
            r11.LLILZLL = r5
            java.lang.Object r12 = r0.LJLIIIL(r11)
            if (r12 != r6) goto L26
            X.C1C7U.LIZIZ(r10)
            return r6
        L96:
            r3 = r9
        L97:
            r9 = r3
            goto L2d
        L99:
            X.C155000ia.LIZIZ(r12)
            com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir1Assem r2 = r11.LLIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.LLIZLLLIL
            java.util.List<com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint> r0 = r11.LLJ
            java.util.Map r1 = X.C09MB.LIZJ(r2, r1, r0)
            java.util.List<com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint> r0 = r11.LLJ
            java.util.List r0 = X.C13LP.LL(r0, r5)
            java.util.List<X.0EpL> r7 = r11.LLJI
            java.util.Iterator r8 = r0.iterator()
            r9 = 0
            goto L2d
        Lb5:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        Lba:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        Lc0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C472401sg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
