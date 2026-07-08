package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService;
import com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftViewModel$deleteAllSelectedDrafts$1$1", f = "StoryThoughtDraftViewModel.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C337700DLs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryThoughtDraftViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C337700DLs(StoryThoughtDraftViewModel storyThoughtDraftViewModel, InterfaceC1364105Vn<? super C337700DLs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyThoughtDraftViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C337700DLs(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        ?? r0;
        C1C7U.LIZ("StoryThoughtDraftViewModel@35b7.deleteAllSelectedDrafts$1$1");
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
            List<C817600W5m> value = this.LLILLJJLI.LLILLJJLI.getValue();
            if (value != null) {
                StoryThoughtDraftViewModel storyThoughtDraftViewModel = this.LLILLJJLI;
                arrayList = new ArrayList();
                for (C817600W5m c817600W5m : value) {
                    if (storyThoughtDraftViewModel.LLILZIL.getValue().contains(c817600W5m.taskId)) {
                        arrayList.add(c817600W5m);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            if ((!arrayList.isEmpty()) && (r0 = (IStoryThoughtDraftService) PluggableExtentionKt.pluggableSpi$default(IStoryThoughtDraftService.class, false, false, false, 14, null)) != 0) {
                this.LL = 1;
                if (r0.LIZJ(arrayList, this) == objLJFF) {
                    C1C7U.LIZIZ("StoryThoughtDraftViewModel@35b7.deleteAllSelectedDrafts$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtDraftViewModel@35b7.deleteAllSelectedDrafts$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
