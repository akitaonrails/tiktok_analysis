package X;

import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TeT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment$initObservers$24$1$1", f = "StoryThoughtAvatarCreationFragment.kt", l = {698, 699}, m = "invokeSuspend")
public final class C751870TeT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StoryThoughtAvatarCreationFragment LLILLL;
    public final /* synthetic */ C20580115fz LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751870TeT(StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment, C20580115fz c20580115fz, InterfaceC1364105Vn<? super C751870TeT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = storyThoughtAvatarCreationFragment;
        this.LLILZ = c20580115fz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C751870TeT c751870TeT = new C751870TeT(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c751870TeT.LLILLJJLI = obj;
        return c751870TeT;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004d -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "StoryThoughtAvatarCreationFragment@ce9f.initObservers$24$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L53
            if (r0 == r3) goto L30
            if (r0 != r4) goto L61
            java.lang.Object r2 = r7.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.C155000ia.LIZIZ(r8)
        L1a:
            boolean r0 = X.C2296808zG.LJI(r2)
            if (r0 == 0) goto L5b
            r7.LLILLJJLI = r2
            r7.LL = r3
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r5) goto L37
            X.C1C7U.LIZIZ(r6)
            return r5
        L30:
            java.lang.Object r2 = r7.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.C155000ia.LIZIZ(r8)
        L37:
            com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment r0 = r7.LLILLL
            com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM r1 = r0.WR()
            X.15fz r0 = r7.LLILZ
            android.widget.FrameLayout r0 = r0.LL
            android.content.Context r0 = r0.getContext()
            r7.LLILLJJLI = r2
            r7.LL = r4
            java.lang.Object r0 = r1.UQ2(r0, r7)
            if (r0 != r5) goto L1a
            X.C1C7U.LIZIZ(r6)
            return r5
        L53:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r2 = r7.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            goto L1a
        L5b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C751870TeT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
