package X;

import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import com.ss.android.ugc.aweme.story.archive2.model.GetArchivedStoryIDsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Qt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel$requestCollectionAwemeData$1", f = "StoryArchiveV2ArchiveViewModel.kt", l = {127, 142}, m = "invokeSuspend")
public final class C332501Qt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public GetArchivedStoryIDsResponse LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ StoryArchiveV2ArchiveViewModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332501Qt(boolean z, StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModel, InterfaceC1364105Vn<? super C332501Qt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = z;
        this.LLILZLL = storyArchiveV2ArchiveViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C332501Qt c332501Qt = new C332501Qt(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c332501Qt.LLILZ = obj;
        return c332501Qt;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:23|(1:62)|24|(1:26)(1:28)|27|(2:30|31)|60|37|42|(1:44)|45|(1:47)|48|(2:50|51)(7:52|7|(1:9)|34|20|21|(2:54|55)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:9:0x0024, B:34:0x00b1], limit reached: 62 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0108 -> B:7:0x001d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C332501Qt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
