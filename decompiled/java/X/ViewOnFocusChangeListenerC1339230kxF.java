package X;

import android.view.View;

/* JADX INFO: renamed from: X.0kxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class ViewOnFocusChangeListenerC1339230kxF implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) throws Throwable {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
        }
    }

    public ViewOnFocusChangeListenerC1339230kxF(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onFocusChange$0(X.ViewOnFocusChangeListenerC1339230kxF r7, android.view.View r8, boolean r9) throws java.lang.Throwable {
        /*
            java.lang.Object r4 = r7.l0
            com.bytedance.ies.xelement.input.LynxBaseInputView r4 = (com.bytedance.ies.xelement.input.LynxBaseInputView) r4
            java.lang.Object r8 = r7.l1
            X.18oS r8 = (X.C21397018oS) r8
            r4.LLJJIII = r9
            java.lang.String r7 = "dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxHeYGA/Jtubh98gQcGH6y2BEP+T7FgE8="
            java.lang.String r6 = "value"
            r5 = 0
            if (r9 == 0) goto L61
            boolean r0 = r4.LLJJIJIL
            if (r0 == 0) goto L39
            j27.s r0 = r4.mContext
            X.0jtu r3 = r0.LLIZ
            X.0jfm r2 = new X.0jfm
            int r1 = r4.getSign()
            java.lang.String r0 = "focus"
            r2.<init>(r1, r0)
            X.0WZX r0 = new X.0WZX
            r0.<init>(r7, r5)
            android.text.Editable r0 = X.C2204961BRm.LLLLII(r8, r0)
            if (r0 == 0) goto L33
            java.lang.String r5 = r0.toString()
        L33:
            r2.LIZIZ(r5, r6)
            r3.LIZIZ(r2)
        L39:
            com.lynx.tasm.behavior.ui.LynxBaseUI r2 = r4.getParentBaseUI()
            j27.s r0 = r4.mContext
            r0.LIZIZ()
        L42:
            if (r2 == 0) goto L92
            java.lang.String r1 = r2.getTagName()
            java.lang.String r0 = "x-overlay-ng"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L8a
            java.lang.String r1 = r2.getTagName()
            java.lang.String r0 = "x-overlay"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L8a
            com.lynx.tasm.behavior.ui.LynxBaseUI r2 = r2.getParentBaseUI()
            goto L42
        L61:
            boolean r0 = r4.LLJJJ
            if (r0 == 0) goto La7
            j27.s r0 = r4.mContext
            X.0jtu r3 = r0.LLIZ
            X.0jfm r2 = new X.0jfm
            int r1 = r4.getSign()
            java.lang.String r0 = "blur"
            r2.<init>(r1, r0)
            X.0WZX r0 = new X.0WZX
            r0.<init>(r7, r5)
            android.text.Editable r0 = X.C2204961BRm.LLLLII(r8, r0)
            if (r0 == 0) goto L83
            java.lang.String r5 = r0.toString()
        L83:
            r2.LIZIZ(r5, r6)
            r3.LIZIZ(r2)
            return
        L8a:
            X.0kEK r0 = r2.getTouchEventDispatcher()
            if (r0 == 0) goto L92
            r0.LJIIIIZZ = r4
        L92:
            j27.s r0 = r4.mContext
            X.0kEK r0 = r0.LLIZLLLIL
            if (r0 == 0) goto L9a
            r0.LJIIIIZZ = r4
        L9a:
            X.0kVI r0 = r4.LLJZ
            boolean r0 = r0.LIZLLL()
            if (r0 == 0) goto La7
            X.0kVI r0 = r4.LLJZ
            r0.LJ()
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC1339230kxF.onFocusChange$0(X.0kxF, android.view.View, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onFocusChange$1(X.ViewOnFocusChangeListenerC1339230kxF r5, android.view.View r6, boolean r7) throws java.lang.Throwable {
        /*
            java.lang.Object r3 = r5.l0
            com.lynx.xelement.input.LynxUIBaseInput r3 = (com.lynx.xelement.input.LynxUIBaseInput) r3
            java.lang.Object r6 = r5.l1
            X.18iU r6 = (X.C21360018iU) r6
            r0 = r7 ^ 1
            r3.LLJJI = r0
            if (r7 == 0) goto L15
            boolean r0 = r3.LLJJJJJIL
            if (r0 != 0) goto L15
            r3.LJJJI()
        L15:
            j27.s r0 = r3.mContext
            X.0jtu r5 = r0.LLIZ
            X.0jfm r4 = new X.0jfm
            int r1 = r3.getSign()
            if (r7 == 0) goto L6a
            java.lang.String r0 = "focus"
        L23:
            r4.<init>(r1, r0)
            X.0WZX r2 = new X.0WZX
            java.lang.String r0 = "dzBzEg4jUdKSTVItQB+BaKOt8ms1tTPDRvA/Uy6bc4QYeygK0tWZ"
            r1 = 0
            r2.<init>(r0, r1)
            android.text.Editable r0 = X.C2204961BRm.LLLLZLL(r6, r2)
            if (r0 == 0) goto L38
            java.lang.String r1 = r0.toString()
        L38:
            java.lang.String r0 = "value"
            r4.LIZIZ(r1, r0)
            r5.LIZIZ(r4)
            if (r7 == 0) goto L7d
            com.lynx.tasm.behavior.ui.LynxBaseUI r2 = r3.getParentBaseUI()
            j27.s r0 = r3.mContext
            r0.LIZIZ()
        L4b:
            if (r2 == 0) goto L75
            java.lang.String r1 = r2.getTagName()
            java.lang.String r0 = "x-overlay-ng"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L6d
            java.lang.String r1 = r2.getTagName()
            java.lang.String r0 = "overlay"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L6d
            com.lynx.tasm.behavior.ui.LynxBaseUI r2 = r2.getParentBaseUI()
            goto L4b
        L6a:
            java.lang.String r0 = "blur"
            goto L23
        L6d:
            X.0kEK r0 = r2.getTouchEventDispatcher()
            if (r0 == 0) goto L75
            r0.LJIIIIZZ = r3
        L75:
            j27.s r0 = r3.mContext
            X.0kEK r0 = r0.LLIZLLLIL
            if (r0 == 0) goto L7d
            r0.LJIIIIZZ = r3
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC1339230kxF.onFocusChange$1(X.0kxF, android.view.View, boolean):void");
    }
}
