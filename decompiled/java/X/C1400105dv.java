package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.story.note.StoryThoughtMyDataManagerImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtMyDataManagerImpl$updateMyStoryNote$1$1", f = "StoryThoughtMyDataManagerImpl.kt", l = {}, m = "invokeSuspend")
public final class C1400105dv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryNoteDataCollection LL;
    public final /* synthetic */ StoryThoughtMyDataManagerImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1400105dv(StoryNoteDataCollection storyNoteDataCollection, StoryThoughtMyDataManagerImpl storyThoughtMyDataManagerImpl, String str, InterfaceC1364105Vn<? super C1400105dv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyNoteDataCollection;
        this.LLILLJJLI = storyThoughtMyDataManagerImpl;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1400105dv(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String json;
        C1C7U.LIZ("StoryThoughtMyDataManagerImpl@896a.updateMyStoryNote$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == null) {
            json = "";
        } else {
            json = GsonProtectorUtils.toJson((Gson) this.LLILLJJLI.LLIZ.getValue(), this.LL);
        }
        this.LLILLJJLI.LLILZLL.storeString(this.LLILLL, json);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtMyDataManagerImpl@896a.updateMyStoryNote$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
