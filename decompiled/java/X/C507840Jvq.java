package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Jvq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507840Jvq extends ConstraintLayout {
    public final ViewGroup LL;
    public final C427760Gpy LLILLJJLI;
    public final C16F5 LLILLL;

    public C507840Jvq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void e0(AbstractC507850Jvr abstractC507850Jvr, boolean z) {
        View viewFindViewById = findViewById(R.id.b8y);
        if (viewFindViewById != null) {
            C500260Jjc.LJLJLJ(viewFindViewById, !z);
        }
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            int i = abstractC507850Jvr.LIZJ;
            viewGroup.setPadding(i, i, i, i);
        }
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            c16f5.setTextSize(abstractC507850Jvr.LIZIZ);
        }
        C427760Gpy c427760Gpy = this.LLILLJJLI;
        if (c427760Gpy != null) {
            c427760Gpy.setSize(abstractC507850Jvr.LIZ);
        }
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 != null) {
            viewGroup2.setBackground(C507390Jv7.LIZ((int) C497740JfY.LIZIZ(abstractC507850Jvr.LIZLLL), C20736316Cj.LIZIZ(R.attr.ey_, getContext()), 0, (int) C497740JfY.LIZIZ(0.0f)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(final com.bytedance.android.livesdk.chatroom.api.SpaceActivityIndicator r14, final kotlin.jvm.functions.Function0<kotlin.Unit> r15) {
        /*
            r13 = this;
            java.util.List<com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo> r0 = r14.spaceActivityInfoList
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        Lb:
            boolean r0 = r1.hasNext()
            r8 = 0
            if (r0 == 0) goto L26
            java.lang.Object r0 = r1.next()
            com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo r0 = (com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo) r0
            com.bytedance.android.live.base.model.user.User r0 = r0.activityFromUserInfo
            if (r0 == 0) goto Lb
            com.bytedance.android.live.base.model.ImageModel r0 = r0.getAvatarThumb()
            if (r0 == 0) goto Lb
            r2.add(r0)
            goto Lb
        L26:
            r0 = 3
            java.util.List r2 = X.C13LP.LL(r2, r0)
            X.0Gpy r1 = r13.LLILLJJLI
            if (r1 == 0) goto L75
            int r0 = r2.size()
            r1.setTotalCount(r0)
        L36:
            java.util.Iterator r3 = r2.iterator()
            r5 = 0
        L3b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r3.next()
            int r2 = r5 + 1
            if (r5 < 0) goto L78
            com.bytedance.android.live.base.model.ImageModel r0 = (com.bytedance.android.live.base.model.ImageModel) r0
            X.0Gpy r4 = r13.LLILLJJLI
            if (r4 == 0) goto L73
            java.util.List r0 = X.C842240X2g.LIZ(r0)
            java.lang.Object r6 = X.C13LP.LJJJLL(r0)
            if (r6 != 0) goto L5b
            java.lang.String r6 = ""
        L5b:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Avatar "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r7 = X.C2188811AlT.LIZIZ(r1)
            r10 = 0
            r12 = 2040(0x7f8, float:2.859E-42)
            r9 = r8
            r11 = r8
            X.C427760Gpy.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L73:
            r5 = r2
            goto L3b
        L75:
            if (r2 == 0) goto L7c
            goto L36
        L78:
            X.C1697810uHb.LJIJI()
            throw r8
        L7c:
            X.0Jv8 r2 = new X.0Jv8
            r2.<init>()
            boolean r0 = X.C1848410yCV.LIZ
            if (r0 == 0) goto L8b
            avg.f r0 = new avg.f
            r0.<init>(r2)
            r2 = r0
        L8b:
            mf.a r1 = new mf.a
            r1.<init>(r2)
            X.1Bky r0 = X.C2213981Bky.LIZIZ
            boolean r0 = r0.isOffline()
            if (r0 == 0) goto L9d
            X.1Bhg r0 = X.C2211941Bhg.LIZ
            r0.injectViewListener(r13)
        L9d:
            r13.setOnClickListener(r1)
            X.16F5 r1 = r13.LLILLL
            if (r1 == 0) goto La9
            java.lang.String r0 = r14.notificationText
            r1.setText(r0)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C507840Jvq.h0(com.bytedance.android.livesdk.chatroom.api.SpaceActivityIndicator, kotlin.jvm.functions.Function0):void");
    }

    public C507840Jvq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ho5, this, true);
        this.LL = (ViewGroup) findViewById(R.id.bnu);
        C427760Gpy c427760Gpy = (C427760Gpy) findViewById(R.id.bin);
        this.LLILLJJLI = c427760Gpy;
        if (c427760Gpy != null) {
            c427760Gpy.setStacking(EnumC429060Gs4.FIRST_ON_TOP);
        }
        this.LLILLL = (C16F5) findViewById(R.id.kla);
        findViewById(R.id.b8y);
    }

    public /* synthetic */ C507840Jvq(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
