package X;

import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: X.0tfy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674480tfy {
    public final StoryHighlightsCreationVM LIZ;
    public final InterfaceC332260D0u<C1674360tfm> LIZIZ;
    public final InterfaceC332260D0u<C1674510tg1> LIZJ;
    public final InterfaceC332260D0u<C1674400tfq> LIZLLL;
    public final C2252321DDq LJ;
    public final C2252321DDq LJFF;

    public final void LIZIZ() {
        InterfaceC332260D0u<C1674360tfm> interfaceC332260D0u = this.LIZIZ;
        interfaceC332260D0u.setValue(C1674360tfm.LIZ(interfaceC332260D0u.getValue(), null, this.LIZJ.getValue().LIZIZ, this.LIZJ.getValue().LIZIZ, null, null, 25));
        LIZJ();
    }

    public final void LIZJ() {
        C2252321DDq c2252321DDq = this.LJ;
        List listLJJJJJ = (List) c2252321DDq.getValue();
        if (listLJJJJJ.size() > 1) {
            listLJJJJJ = C13LP.LJJJJJ(1, listLJJJJJ);
        }
        c2252321DDq.setValue(listLJJJJJ);
    }

    public final boolean LIZ(EnumC1674410tfr enumC1674410tfr) {
        if (C13LP.LJJLIIIJL((List) this.LJ.getValue()) == enumC1674410tfr) {
            return true;
        }
        return false;
    }

    public final void LJFF(EnumC1674410tfr enumC1674410tfr) {
        if (LIZ(enumC1674410tfr)) {
            return;
        }
        C2252321DDq c2252321DDq = this.LJ;
        c2252321DDq.setValue(C13LP.LJLILLLLZI(enumC1674410tfr, (Collection) c2252321DDq.getValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(android.content.Context r20, X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674480tfy.LIZLLL(android.content.Context, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(android.content.Context r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C1674530tg3
            if (r0 == 0) goto L80
            r4 = r15
            X.0tg3 r4 = (X.C1674530tg3) r4
            int r2 = r4.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r4.LLIZ = r2
        L12:
            java.lang.Object r11 = r4.LLILZIL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLIZ
            r3 = 1
            if (r0 == 0) goto L42
            if (r0 != r3) goto L86
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection$CoverType r9 = r4.LLILZ
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview r8 = r4.LLILLL
            java.lang.Object r6 = r4.LLILLJJLI
            java.util.List r6 = (java.util.List) r6
            X.0D0u r2 = r4.LL
            X.C155000ia.LIZIZ(r11)
        L2c:
            r7 = 0
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            r12 = 933(0x3a5, float:1.307E-42)
            X.0tg1 r5 = new X.0tg1
            r10 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r2.setValue(r5)
            X.0tfr r0 = X.EnumC1674410tfr.CREATION
            r13.LJFF(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L42:
            X.C155000ia.LIZIZ(r11)
            X.0D0u<X.0tfm> r0 = r13.LIZIZ
            java.lang.Object r0 = r0.getValue()
            X.0tfm r0 = (X.C1674360tfm) r0
            java.util.List<com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview> r0 = r0.LIZIZ
            java.lang.Object r8 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview r8 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview) r8
            if (r8 != 0) goto L5a
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5a:
            X.0D0u<X.0tg1> r2 = r13.LIZJ
            X.0D0u<X.0tfm> r0 = r13.LIZIZ
            java.lang.Object r0 = r0.getValue()
            X.0tfm r0 = (X.C1674360tfm) r0
            java.util.List<com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview> r6 = r0.LIZIZ
            com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection$CoverType r9 = com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection.CoverType.STORY_COVER
            com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM r1 = r13.LIZ
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r8.coverImgUrl
            r4.LL = r2
            r4.LLILLJJLI = r6
            r4.LLILLL = r8
            r4.LLILZ = r9
            r4.LLIZ = r3
            r1.getClass()
            java.lang.Object r11 = com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM.CQ2(r14, r0, r4)
            if (r11 != r5) goto L2c
            return r5
        L80:
            X.0tg3 r4 = new X.0tg3
            r4.<init>(r13, r15)
            goto L12
        L86:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674480tfy.LJ(android.content.Context, X.05Vn):java.lang.Object");
    }

    public C1674480tfy(StoryHighlightsCreationVM storyHighlightsCreationVM, C2252321DDq c2252321DDq, C2252321DDq c2252321DDq2, C2252321DDq c2252321DDq3) {
        this.LIZ = storyHighlightsCreationVM;
        this.LIZIZ = c2252321DDq;
        this.LIZJ = c2252321DDq2;
        this.LIZLLL = c2252321DDq3;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C13BV.INSTANCE);
        this.LJ = c2252321DDqLIZ;
        this.LJFF = c2252321DDqLIZ;
    }
}
