package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS258S0300000_14;

/* JADX INFO: renamed from: X.0YkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882850YkF extends AbstractC880120Yfq {
    public final boolean LLJ;
    public final int LLJI;
    public final int LLJIJIL;

    @Override // X.AbstractC880120Yfq
    public final int LJ() {
        return 0;
    }

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        Set<String> conversationTags;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.LLJ) {
            arrayList2.add(EnumC879080YeA.SPAM);
        } else {
            arrayList.add(EnumC879080YeA.SPAM);
        }
        C0Y8T c0y8t = this.LLILZ;
        if (c0y8t != null && (conversationTags = c0y8t.getConversationTags()) != null && conversationTags.contains(EnumC879080YeA.SECONDARY.getValue())) {
            arrayList2.add(EnumC879080YeA.SECONDARY);
        }
        this.LLILZLL.LIZIZ(arrayList, arrayList2, Boolean.FALSE, new C914130Ztb(this, C1383370m6R.LJIIJ(this.LLJ ? 2131845314 : 2131845313), "SpamOrUnspamAction", new AwS258S0300000_14(this, (C882850YkF) arrayList2, (List<EnumC879080YeA>) arrayList, (List<EnumC879080YeA>) 17), 2));
        AbstractC880120Yfq.LJFF(this, this.LLJ ? "unspam" : "spam", null, null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // X.AbstractC880120Yfq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI() {
        /*
            r5 = this;
            X.10Ec r4 = X.C19212010Ec.LIZJ
            java.util.List r0 = r4.LJIIIIZZ()
            com.ss.android.ugc.aweme.inbox.filter.FilterTabType r3 = com.ss.android.ugc.aweme.inbox.filter.FilterTabType.SPAM
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L3e
            X.0Y8T r0 = r5.LLILZ
            if (r0 == 0) goto L3e
            boolean r0 = r0.isGroupChat()
            if (r0 == 0) goto L27
            X.0Ye3 r2 = r5.LLILLL
            boolean r1 = r2 instanceof X.C878950Ydx
            r0 = 0
            if (r1 == 0) goto L25
            X.0Ydx r2 = (X.C878950Ydx) r2
            if (r2 == 0) goto L25
            com.ss.android.ugc.aweme.inbox.filter.FilterTabType r0 = r2.LLILLL
        L25:
            if (r0 != r3) goto L3e
        L27:
            boolean r0 = r4.LJLLLLLL()
            r1 = 0
            if (r0 == 0) goto L36
            X.0Y8T r0 = r5.LLILZ
            boolean r0 = X.C879070Ye9.LJ(r0, r1)
            if (r0 != 0) goto L3e
        L36:
            X.0Y8T r0 = r5.LLILZ
            boolean r0 = X.AbstractC880120Yfq.LJII(r0)
            if (r0 == 0) goto L3f
        L3e:
            r1 = 1
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C882850YkF.LJI():boolean");
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return this.LLJI;
    }

    public C882850YkF(Activity activity, C879540Yeu c879540Yeu, C878950Ydx c878950Ydx) {
        int i;
        int i2;
        super(activity, c879540Yeu, c878950Ydx);
        C0Y8T c0y8t = this.LLILZ;
        boolean z = false;
        if (c0y8t != null && C879070Ye9.LJ(c0y8t, false)) {
            z = true;
        }
        this.LLJ = z;
        if (z) {
            i = 2131830294;
        } else {
            i = 2131845267;
        }
        this.LLJI = i;
        if (z) {
            i2 = R.raw.icon_inbox;
        } else {
            i2 = R.raw.icon_exclamation_mark_polygon;
        }
        this.LLJIJIL = i2;
    }
}
