package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: renamed from: X.0PV9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PV9 extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ int LLIZ = 0;
    public EcClickSearchWord LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public EnumC645610PTz LLILZIL;
    public ISearchContextAbility LLILZLL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public C0PV9(View view) {
        super(view);
        view.addOnAttachStateChangeListener(this);
        this.LLILLJJLI = "";
        this.LLILLL = "";
        this.LLILZ = "";
        this.LLILZIL = EnumC645610PTz.PRODUCT_IN_PRODUCT_CARD;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b A[PHI: r8
      0x001b: PHI (r8v6 java.lang.String) = (r8v0 java.lang.String), (r8v7 java.lang.String) binds: [B:12:0x0019, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f A[PHI: r8
      0x001f: PHI (r8v5 java.lang.String) = (r8v0 java.lang.String), (r8v6 java.lang.String) binds: [B:12:0x0019, B:14:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0022 A[PHI: r8 r9
      0x0022: PHI (r8v1 java.lang.String) = (r8v5 java.lang.String), (r8v6 java.lang.String) binds: [B:16:0x0020, B:14:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0022: PHI (r9v0 java.lang.String) = (r9v4 java.lang.String), (r9v5 java.lang.String) binds: [B:16:0x0020, B:14:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0026 A[PHI: r8 r9
      0x0026: PHI (r8v4 java.lang.String) = (r8v1 java.lang.String), (r8v5 java.lang.String) binds: [B:18:0x0024, B:16:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0026: PHI (r9v3 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:18:0x0024, B:16:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0029 A[PHI: r7 r8 r9
      0x0029: PHI (r7v2 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:18:0x0024, B:20:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r8v3 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String) binds: [B:18:0x0024, B:20:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:18:0x0024, B:20:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnAttachStateChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow(android.view.View r12) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchWord r0 = r11.LL
            r4 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.LIZ
            if (r0 != r4) goto La
        L9:
            return
        La:
            int r10 = r11.getPosition()
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchWord r0 = r11.LL
            java.lang.String r6 = ""
            if (r0 == 0) goto L18
            java.lang.String r8 = r0.word
            if (r8 != 0) goto L1b
        L18:
            r8 = r6
            if (r0 == 0) goto L1f
        L1b:
            java.lang.String r9 = r0.groupId
            if (r9 != 0) goto L22
        L1f:
            r9 = r6
            if (r0 == 0) goto L26
        L22:
            java.lang.String r7 = r0.imageUrl
            if (r7 != 0) goto L29
        L26:
            r7 = r6
            if (r0 == 0) goto L2e
        L29:
            java.lang.String r0 = r0.productId
            if (r0 == 0) goto L2e
            r6 = r0
        L2e:
            java.lang.String r5 = r11.LLILLJJLI
            java.lang.String r3 = r11.LLILLL
            java.lang.String r2 = r11.LLILZ
            X.0PTz r1 = r11.LLILZIL
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r0 = r11.LLILZLL
            java.util.Map r2 = X.C0PRU.LIZ(r5, r3, r2, r1, r0)
            java.lang.String r0 = "group_id"
            r2.put(r0, r9)
            java.lang.String r1 = "words_position"
            java.lang.String r0 = java.lang.String.valueOf(r10)
            r2.put(r1, r0)
            java.lang.String r0 = "words_content"
            r2.put(r0, r8)
            java.lang.String r0 = "picture_content"
            r2.put(r0, r7)
            java.lang.String r0 = "product_id"
            r2.put(r0, r6)
            X.0pL7 r0 = X.C1507790pL7.LIZ
            r0.getClass()
            java.lang.String r0 = "trending_words_show"
            X.C1507790pL7.LIZJ(r0, r2)
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchWord r0 = r11.LL
            if (r0 == 0) goto L9
            r0.LIZ = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PV9.onViewAttachedToWindow(android.view.View):void");
    }
}
