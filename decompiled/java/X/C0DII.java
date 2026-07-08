package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DII, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DII extends FrameLayout {
    public final TuxTextView LL;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            if (r4 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.getCurUser()
            com.ss.android.ugc.aweme.feed.model.CollabInfo r0 = r4.getCollabInfo()
            if (r0 == 0) goto L44
            java.util.List<com.ss.android.ugc.aweme.feed.model.CollaboratorInfo> r1 = r0.collaborators
            if (r1 == 0) goto L44
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.CollaboratorInfo r0 = (com.ss.android.ugc.aweme.feed.model.CollaboratorInfo) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            java.lang.String r0 = r0.getUid()
            r2.add(r0)
            goto L28
        L3e:
            java.util.Set r2 = X.C13LP.LLIIJI(r2)
            if (r2 != 0) goto L46
        L44:
            X.08CX r2 = X.C08CX.INSTANCE
        L46:
            java.lang.String r1 = r3.getUid()
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r4)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L57
            java.lang.String r0 = "author"
            return r0
        L57:
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L60
            java.lang.String r0 = "collaber"
            return r0
        L60:
            java.lang.String r0 = "user"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DII.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    public C0DII(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.a1h, this);
        this.LL = (TuxTextView) findViewById(R.id.e_w);
    }
}
