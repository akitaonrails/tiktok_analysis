package X;

import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0FXC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FXC implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            default:
                return null;
        }
    }

    public C0FXC(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(C0FXC c0fxc, C15O7 c15o7) {
        Unit unit;
        C1C7U.LIZ("MultiEditVideoHelper@300b.saveCoverImageWithCallback$2");
        Function0 function0 = (Function0) c0fxc.l0;
        if (function0 != null) {
            function0.invoke();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("MultiEditVideoHelper@300b.saveCoverImageWithCallback$2");
        return unit;
    }

    public static final Object then$1(C0FXC c0fxc, C15O7 c15o7) {
        TextStickerCompileResult textStickerCompileResult;
        C1C7U.LIZ("EditTextStickerComponent@10da.compile$1");
        if (c15o7.LJIIL() != null) {
            textStickerCompileResult = new TextStickerCompileResult(((C196925122x) c0fxc.l0).LJIIJ(), (C384910F7h) c15o7.LJIIL());
        } else {
            textStickerCompileResult = null;
        }
        C1C7U.LIZIZ("EditTextStickerComponent@10da.compile$1");
        return textStickerCompileResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$2(X.C0FXC r12, X.C15O7 r13) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FXC.then$2(X.0FXC, X.15O7):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$3(X.C0FXC r14, X.C15O7 r15) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FXC.then$3(X.0FXC, X.15O7):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$4(X.C0FXC r12, X.C15O7 r13) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FXC.then$4(X.0FXC, X.15O7):java.lang.Object");
    }
}
