package X;

import android.app.Activity;
import android.text.TextPaint;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01zO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC514001zO implements Runnable {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        TuxTextView tuxTextViewLJLI;
        TextPaint paint;
        String strLIZIZ;
        TuxTextView tuxTextViewLJLI2 = ((ProfileInfoNicknameProtocol) this.l1).LJLI();
        if (tuxTextViewLJLI2 == null || tuxTextViewLJLI2.getLineCount() <= 1 || (tuxTextViewLJLI = ((ProfileInfoNicknameProtocol) this.l1).LJLI()) == null || (paint = tuxTextViewLJLI.getPaint()) == null) {
            return;
        }
        float fMeasureText = paint.measureText(this.s0);
        TuxTextView tuxTextViewLJLI3 = ((ProfileInfoNicknameProtocol) this.l1).LJLI();
        if (tuxTextViewLJLI3 != null) {
            int width = tuxTextViewLJLI3.getWidth();
            float fLIZIZ = (width - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80))) / fMeasureText;
            int length = (int) ((this.s0.length() * fLIZIZ) - 4);
            if (length >= this.s0.length()) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("viewWidth is ");
                sbLIZ.append(width);
                sbLIZ.append(", originWidth is ");
                sbLIZ.append(fMeasureText);
                sbLIZ.append(", title is ");
                sbLIZ.append(this.s0);
                sbLIZ.append(", showRate is ");
                sbLIZ.append(fLIZIZ);
                C1720106oR.LJI("InfoNicknameTag", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (length <= 2 || length >= this.s0.length()) {
                strLIZIZ = "";
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((Object) this.s0.subSequence(0, length));
                sbLIZ2.append("...");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            ((ProfileInfoNicknameProtocol) this.l1).LJLLL(this.i2, strLIZIZ);
        }
    }

    public final void LIZ$1() {
        Activity activityLIZIZ;
        Activity activityLIZ;
        C1389890mGx c1389890mGx;
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF == null || (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null) {
            return;
        }
        String str = this.s0;
        int i = this.i2;
        Integer num = (Integer) this.l1;
        if (str != null) {
            c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LIZ(true);
        } else {
            c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LIZ(true);
        }
        if (num != null) {
            c1389890mGx.LJFF(num.intValue());
        }
        c1389890mGx.LJIIJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$0(X.RunnableC514001zO r8) {
        /*
            java.lang.Object r7 = r8.l1
            com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget r7 = (com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget) r7
            int r5 = r8.i2
            java.lang.String r4 = r8.s0
            r7.getClass()
            java.lang.String r6 = "LinkControlWidget@1079.onReceiveReply$1L"
            X.C1C7U.LIZ(r6)
            android.content.Context r3 = r7.context
            if (r3 != 0) goto L1d
            java.lang.String r0 = ""
        L16:
            X.C766270U4b.LJIIJJI(r0)
            X.C1C7U.LIZIZ(r6)
            return
        L1d:
            r0 = 5
            if (r5 == r0) goto L9f
            r0 = 11
            if (r5 == r0) goto L96
            r0 = 14
            if (r5 == r0) goto L9f
            r0 = 16
            if (r5 == r0) goto L8e
            r0 = 22
            r2 = 2131841195(0x7f1150ab, float:1.9315691E38)
            if (r5 == r0) goto L89
            r0 = 24
            r1 = 2131840604(0x7f114e5c, float:1.9314492E38)
            if (r5 == r0) goto L6c
            r0 = 26
            if (r5 == r0) goto L64
            r0 = 31
            if (r5 == r0) goto L5c
            r0 = 28
            if (r5 == r0) goto L57
            r0 = 29
            if (r5 == r0) goto L4f
            java.lang.String r0 = r3.getString(r1)
            goto L16
        L4f:
            r0 = 2131851716(0x7f1179c4, float:1.933703E38)
            java.lang.String r0 = r3.getString(r0)
            goto L16
        L57:
            java.lang.String r0 = r3.getString(r2)
            goto L16
        L5c:
            r0 = 2131851848(0x7f117a48, float:1.9337298E38)
            java.lang.String r0 = r3.getString(r0)
            goto L16
        L64:
            r0 = 2131841163(0x7f11508b, float:1.9315626E38)
            java.lang.String r0 = r3.getString(r0)
            goto L16
        L6c:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L79
            android.content.Context r0 = r7.context
            java.lang.String r0 = r0.getString(r1)
            goto L16
        L79:
            android.content.Context r2 = r7.context
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r4
            r0 = 2131842170(0x7f11547a, float:1.9317669E38)
            java.lang.String r0 = r2.getString(r0, r1)
            goto L16
        L89:
            java.lang.String r0 = r3.getString(r2)
            goto L16
        L8e:
            r0 = 2131841157(0x7f115085, float:1.9315614E38)
            java.lang.String r0 = r3.getString(r0)
            goto L16
        L96:
            r0 = 2131841131(0x7f11506b, float:1.9315561E38)
            java.lang.String r0 = r3.getString(r0)
            goto L16
        L9f:
            r0 = 2131841103(0x7f11504f, float:1.9315505E38)
            java.lang.String r0 = r3.getString(r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC514001zO.run$0(X.01zO):void");
    }

    public static final void run$1(RunnableC514001zO runnableC514001zO) {
        boolean zLIZ;
        C1C7U.LIZ("TakoDisclaimerItemView@2eca.bindContent$2");
        try {
            Function2 function2 = (Function2) runnableC514001zO.l1;
            String str = runnableC514001zO.s0;
            if (str == null) {
                str = "";
            }
            function2.invoke(str, Integer.valueOf(runnableC514001zO.i2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoDisclaimerItemView@2eca.bindContent$2");
    }

    public static final void run$2(RunnableC514001zO runnableC514001zO) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileInfoNicknameProtocol@8e9f.actionsAfterUpdateUI$3$onGlobalLayout$1");
        try {
            runnableC514001zO.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileInfoNicknameProtocol@8e9f.actionsAfterUpdateUI$3$onGlobalLayout$1");
    }

    public static final void run$3(RunnableC514001zO runnableC514001zO) {
        boolean zLIZ;
        C1C7U.LIZ("ToastUtilsKt@2b0e.showGlobalToast$1");
        try {
            runnableC514001zO.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ToastUtilsKt@2b0e.showGlobalToast$1");
    }

    public RunnableC514001zO(Object obj, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i2 = i;
        this.s0 = str;
    }

    public RunnableC514001zO(int i, ProfileInfoNicknameProtocol profileInfoNicknameProtocol, Integer num, String str, int i2) {
        this.$t = i2;
        this.l1 = profileInfoNicknameProtocol;
        this.s0 = str;
        this.i2 = i;
    }
}
