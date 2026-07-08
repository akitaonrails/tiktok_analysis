package X;

import android.content.Context;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import com.ss.android.ugc.aweme.story.streaks.StoryStreaksServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.126Q, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.streaks.StoryStreaksServiceImpl$enterStoryEditWithStreakPoster$1", f = "StoryStreaksServiceImpl.kt", l = {122}, m = "invokeSuspend")
public final class C126Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryStreaksServiceImpl LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ StoryStreakEnterEditParam LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C126Q(StoryStreaksServiceImpl storyStreaksServiceImpl, Context context, StoryStreakEnterEditParam storyStreakEnterEditParam, InterfaceC1364105Vn<? super C126Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyStreaksServiceImpl;
        this.LLILLL = context;
        this.LLILZ = storyStreakEnterEditParam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C126Q(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0247  */
    /* JADX WARN: Type inference failed for: r0v74, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v77, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r6v24, types: [com.ss.android.ugc.aweme.base.model.UrlModel] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
