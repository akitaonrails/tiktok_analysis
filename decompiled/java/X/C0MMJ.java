package X;

import com.ss.android.ugc.aweme.social.creation.edit.StoryCanvasVideoHelper;

/* JADX INFO: renamed from: X.0MMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.StoryCanvasVideoHelper", f = "StoryCanvasVideoHelper.kt", l = {168}, m = "extractBackgroundFromFirstFrame")
public final class C0MMJ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StoryCanvasVideoHelper LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MMJ(StoryCanvasVideoHelper storyCanvasVideoHelper, InterfaceC1364105Vn<? super C0MMJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = storyCanvasVideoHelper;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryCanvasVideoHelper@2bb1.extractBackgroundFromFirstFrame$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(0, 0, null, this);
        C1C7U.LIZIZ("StoryCanvasVideoHelper@2bb1.extractBackgroundFromFirstFrame$1");
        return objLJ;
    }
}
