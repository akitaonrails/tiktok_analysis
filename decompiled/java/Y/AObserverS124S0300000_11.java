package Y;

import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes12.dex */
public class AObserverS124S0300000_11 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$0(Y.AObserverS124S0300000_11 r9, java.lang.Object r10) {
        /*
            java.lang.String r3 = "on_animation_end"
            X.C0SRK.LIZJ(r3)
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment r0 = (com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment) r0
            X.0SRL r0 = r0.LLJILJIL
            if (r0 == 0) goto La0
            X.0SM1 r0 = r0.LJIIL
            if (r0 == 0) goto La0
            boolean r0 = r0.jT0()
            r4 = 1
            if (r0 != r4) goto La0
        L18:
            java.util.LinkedHashMap<java.lang.String, java.lang.Long> r8 = X.C0SRK.LIZIZ
            long r6 = X.C0SRK.LIZIZ(r3)
            java.lang.String r2 = "show_enter_animation"
            long r0 = X.C0SRK.LIZIZ(r2)
            long r6 = r6 - r0
            X.0Ste r1 = new X.0Ste
            java.lang.String r0 = "post_mode_single_activity_performance"
            r1.<init>(r0)
            if (r4 == 0) goto L9d
            java.lang.String r4 = "1"
        L30:
            X.08Dt r5 = X.InterfaceC1210900hcG.LIZ
            java.lang.String r0 = "is_single_activity"
            r1.LJFF(r0, r4, r5)
            java.lang.String r4 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "animation_duration"
            r1.LJFF(r0, r4, r5)
            java.lang.String r0 = "page_create"
            X.C0SRK.LIZ(r1, r0)
            java.lang.String r0 = "page_create_end"
            X.C0SRK.LIZ(r1, r0)
            java.lang.String r0 = "page_create_view"
            X.C0SRK.LIZ(r1, r0)
            java.lang.String r0 = "page_create_view_end"
            X.C0SRK.LIZ(r1, r0)
            java.lang.String r0 = "root_fragment_create"
            X.C0SRK.LIZ(r1, r0)
            java.lang.String r0 = "root_fragment_create_end"
            X.C0SRK.LIZ(r1, r0)
            java.lang.String r0 = "root_fragment_create_view"
            X.C0SRK.LIZ(r1, r0)
            java.lang.String r0 = "root_fragment_create_view_end"
            X.C0SRK.LIZ(r1, r0)
            java.lang.String r0 = "activity_create"
            X.C0SRK.LIZ(r1, r0)
            java.lang.String r0 = "activity_create_end"
            X.C0SRK.LIZ(r1, r0)
            java.lang.String r0 = "init_animation"
            X.C0SRK.LIZ(r1, r0)
            X.C0SRK.LIZ(r1, r2)
            X.C0SRK.LIZ(r1, r3)
            r1.LJIILJJIL()
            r8.clear()
            r0 = -1
            X.C0SRK.LIZ = r0
            X.0SQh r5 = X.C721090SQh.LIZ
            java.lang.Object r4 = r9.l1
            com.ss.android.ugc.aweme.model.PostModeDetailParams r4 = (com.ss.android.ugc.aweme.model.PostModeDetailParams) r4
            java.lang.Object r3 = r9.l2
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.ss.android.ugc.aweme.feed.model.Aweme) r3
            java.lang.String r2 = "enter_animation_end"
            r1 = 0
            java.lang.String r0 = ""
            r5.getClass()
            X.C721090SQh.LIZIZ(r4, r3, r2, r0, r1)
            return
        L9d:
            java.lang.String r4 = "0"
            goto L30
        La0:
            r4 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS124S0300000_11.onChanged$0(Y.AObserverS124S0300000_11, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$1(Y.AObserverS124S0300000_11 r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS124S0300000_11.onChanged$1(Y.AObserverS124S0300000_11, java.lang.Object):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS124S0300000_11(com.ss.android.ugc.aweme.feed.model.Aweme r2, com.ss.android.ugc.aweme.model.PostModeDetailParams r3, com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS124S0300000_11.<init>(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.model.PostModeDetailParams, com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment, int):void");
    }
}
