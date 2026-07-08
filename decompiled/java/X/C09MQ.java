package X;

import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir2Assem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09MQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir2Assem$bindThumbnails$2", f = "SearchKeyframeOptDir2Assem.kt", l = {196, 200}, m = "invokeSuspend")
public final class C09MQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public SearchKeyframeOptDir2Assem LLILLL;
    public C659520Ptu LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ SearchKeyframeOptDir2Assem LLJ;
    public final /* synthetic */ Aweme LLJI;
    public final /* synthetic */ List<SearchKeyFramePoint> LLJIJIL;
    public final /* synthetic */ List<ImageView> LLJILJIL;
    public final /* synthetic */ C659520Ptu LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09MQ(SearchKeyframeOptDir2Assem searchKeyframeOptDir2Assem, Aweme aweme, List<SearchKeyFramePoint> list, List<? extends ImageView> list2, C659520Ptu c659520Ptu, InterfaceC1364105Vn<? super C09MQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = searchKeyframeOptDir2Assem;
        this.LLJI = aweme;
        this.LLJIJIL = list;
        this.LLJILJIL = list2;
        this.LLJILJILJ = c659520Ptu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09MQ(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009b -> B:10:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b5 -> B:7:0x002c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09MQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
