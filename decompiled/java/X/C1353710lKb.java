package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.view.View;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1353710lKb {
    public final Context LIZ;
    public final int LIZIZ;
    public final C01GW LIZJ;
    public Boolean LIZLLL;
    public Boolean LJ;
    public Boolean LJFF;
    public final int LJI;
    public AbstractC1340120kyg LJII;
    public AbstractC1340120kyg LJIIIIZZ;
    public Comment LJIIIZ;
    public InterfaceC1340280kyw LJIIJ;
    public InterfaceC1340280kyw LJIIJJI;
    public InterfaceC1340280kyw LJIIL;
    public final SpannableString LJIILIIL;
    public final SpannableString LJIILJJIL;
    public final SpannableString LJIILL;
    public final SpannableString LJIILLIIL;
    public final SpannableString LJIIZILJ;
    public final SpannableString LJIJ;

    public final void LIZLLL() {
        Boolean boolValueOf;
        User user;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        Comment comment = this.LJIIIZ;
        this.LIZLLL = Boolean.valueOf(iAccountUserServiceLJFF.LIZJ((comment == null || (user = comment.getUser()) == null) ? null : user.getUid()));
        if (C161N.LIZIZ.LJJII(this.LJIIIZ)) {
            boolean z = C2547709yd.LIZ;
            boolValueOf = Boolean.valueOf(C2547709yd.LIZ);
        } else {
            boolValueOf = Boolean.TRUE;
        }
        this.LJ = boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("evaluateIsShow isMe:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isDntShow:");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", translatable:");
        Comment comment2 = this.LJIIIZ;
        sbLIZ.append(comment2 != null ? comment2.isCommentTranslatable() : null);
        sbLIZ.append(", translated:");
        Comment comment3 = this.LJIIIZ;
        sbLIZ.append(comment3 != null ? Boolean.valueOf(comment3.isTranslated()) : null);
        sbLIZ.append(", this:");
        sbLIZ.append(this);
        sbLIZ.append(", text:");
        Comment comment4 = this.LJIIIZ;
        sbLIZ.append(comment4 != null ? comment4.getText() : null);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LJ() {
        if (!C0BJF.LIZ() || this.LJIIJJI == null || this.LJIIIIZZ == null) {
            return false;
        }
        if (this.LJIIJ != null) {
            AbstractC1340120kyg abstractC1340120kyg = this.LJII;
            if (abstractC1340120kyg instanceof C1340020kyW) {
                if (((C1340020kyW) abstractC1340120kyg).LIZIZ) {
                    return false;
                }
            } else {
                if (Intrinsics.LJFF(abstractC1340120kyg, C1340030kyX.LIZIZ) || Intrinsics.LJFF(abstractC1340120kyg, C1340130kyh.LIZIZ)) {
                    return false;
                }
                if (abstractC1340120kyg != null) {
                    throw new C1954807lC();
                }
            }
        }
        return true;
    }

    public final void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset isMe:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isDntShow:");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isKeepLinebreak: ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", translatable:");
        Comment comment = this.LJIIIZ;
        sbLIZ.append(comment != null ? comment.isCommentTranslatable() : null);
        sbLIZ.append(", translated:");
        Comment comment2 = this.LJIIIZ;
        sbLIZ.append(comment2 != null ? Boolean.valueOf(comment2.isTranslated()) : null);
        sbLIZ.append(", this:");
        sbLIZ.append(this);
        sbLIZ.append(", text:");
        Comment comment3 = this.LJIIIZ;
        sbLIZ.append(comment3 != null ? comment3.getText() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
    }

    public C1353710lKb(Context context) {
        int iIntValue;
        this.LIZ = context;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LIZIZ = iIntValue;
        this.LIZJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1208));
        this.LJI = C1353700lKa.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\u2066");
        sbLIZ.append(context.getResources().getString(2131829019));
        sbLIZ.append("\u2069");
        SpannableString spannableStringLIZIZ = LIZIZ(new SpannableString(C2188811AlT.LIZIZ(sbLIZ)));
        this.LJIILIIL = spannableStringLIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("\u2066");
        sbLIZ2.append(context.getResources().getString(2131829020));
        sbLIZ2.append("...");
        sbLIZ2.append("\u2069");
        SpannableString spannableStringLIZIZ2 = LIZIZ(new SpannableString(C2188811AlT.LIZIZ(sbLIZ2)));
        this.LJIILJJIL = spannableStringLIZIZ2;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("\u2066");
        sbLIZ3.append(context.getResources().getString(2131829018));
        sbLIZ3.append("\u2069");
        SpannableString spannableStringLIZIZ3 = LIZIZ(new SpannableString(C2188811AlT.LIZIZ(sbLIZ3)));
        this.LJIILL = spannableStringLIZIZ3;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("\u2067");
        sbLIZ4.append(context.getResources().getString(2131829020));
        sbLIZ4.append("...");
        sbLIZ4.append("\u2069");
        SpannableString spannableStringLIZIZ4 = LIZIZ(new SpannableString(C2188811AlT.LIZIZ(sbLIZ4)));
        this.LJIILLIIL = spannableStringLIZIZ4;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("\u2067");
        sbLIZ5.append(context.getResources().getString(2131829018));
        sbLIZ5.append("\u2069");
        SpannableString spannableStringLIZIZ5 = LIZIZ(new SpannableString(C2188811AlT.LIZIZ(sbLIZ5)));
        this.LJIIZILJ = spannableStringLIZIZ5;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("\u2067");
        sbLIZ6.append(context.getResources().getString(2131829019));
        sbLIZ6.append("\u2069");
        SpannableString spannableStringLIZIZ6 = LIZIZ(new SpannableString(C2188811AlT.LIZIZ(sbLIZ6)));
        this.LJIJ = spannableStringLIZIZ6;
        LJII(spannableStringLIZIZ);
        LJII(spannableStringLIZIZ6);
        LJII(spannableStringLIZIZ3);
        LJII(spannableStringLIZIZ5);
        LJII(spannableStringLIZIZ2);
        LJII(spannableStringLIZIZ4);
        LJI(spannableStringLIZIZ, new AwS565S0100000_21(this, 1204));
        LJI(spannableStringLIZIZ6, new AwS565S0100000_21(this, 1205));
        LJI(spannableStringLIZIZ3, new AwS565S0100000_21(this, 1206));
        LJI(spannableStringLIZIZ5, new AwS565S0100000_21(this, 1207));
        LJFF();
    }

    public static SpannableString LIZIZ(SpannableString spannableString) {
        boolean z;
        boolean z2;
        String string = spannableString.toString();
        if (string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((char) 8288);
            sbLIZ.append((char) 8288);
            return new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        }
        char cLJLLI = C13LN.LJLLI(string);
        if (cLJLLI != 8206 && cLJLLI != 8207) {
            z2 = false;
        } else {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder((string.length() * 2) + 2);
        if (z2) {
            sb.append(cLJLLI);
            sb.append((char) 8288);
            int length = string.length();
            for (int i = 1; i < length; i++) {
                sb.append(string.charAt(i));
                sb.append((char) 8288);
            }
        } else {
            sb.append((char) 8288);
            int length2 = string.length();
            for (int i2 = 0; i2 < length2; i2++) {
                sb.append(string.charAt(i2));
                sb.append((char) 8288);
            }
        }
        return new SpannableString(sb);
    }

    public final void LIZJ(boolean z) {
        InterfaceC1340280kyw interfaceC1340280kyw;
        if (LJ()) {
            InterfaceC1340280kyw interfaceC1340280kyw2 = this.LJIIJJI;
            if (interfaceC1340280kyw2 != null) {
                interfaceC1340280kyw2.LIZ(z);
                return;
            }
            return;
        }
        InterfaceC1340280kyw interfaceC1340280kyw3 = this.LJIIJ;
        if (interfaceC1340280kyw3 != null) {
            interfaceC1340280kyw3.LIZ(z);
        }
        if (C0BJF.LIZ() && this.LJIIJJI != null && this.LJIIIIZZ != null && (interfaceC1340280kyw = this.LJIIL) != null) {
            interfaceC1340280kyw.LIZ(z);
        }
    }

    public final void LJII(SpannableString spannableString) {
        C786410Ut5.p2(spannableString, new C444920HcY(62, false), 0, spannableString.length(), 33);
        C786410Ut5.p2(spannableString, new CharacterStyle() { // from class: X.0lKd
            @Override // android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                if (textPaint == null) {
                    return;
                }
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.LIZ.LIZIZ);
            }
        }, 0, spannableString.length(), 33);
    }

    public final void LJI(SpannableString spannableString, final Function0<Unit> function0) {
        C786410Ut5.p2(spannableString, new AbstractC1353420lK8() { // from class: X.0lKc
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                function0.invoke();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.LLILLL.LIZIZ);
            }
        }, 0, spannableString.length(), 33);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x014e A[PHI: r1
      0x014e: PHI (r1v4 android.text.SpannableString) = (r1v1 android.text.SpannableString), (r1v3 android.text.SpannableString), (r1v12 android.text.SpannableString) binds: [B:121:0x02b5, B:57:0x014c, B:52:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.tux.input.TuxTextView r12, android.text.StaticLayout r13, boolean r14, int r15, int r16) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1353710lKb.LIZ(com.bytedance.tux.input.TuxTextView, android.text.StaticLayout, boolean, int, int):void");
    }
}
