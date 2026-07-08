package X;

import com.bytedance.mt.protector.impl.PatternProtector;

/* JADX INFO: renamed from: X.1DcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259541DcG {
    public static C2259371Dbz LIZ() {
        return C2259441Dc6.LIZ("makefile", C2259441Dc6.LJIIIIZZ("comment", C2259441Dc6.LJII(PatternProtector.compile("(^|[^\\\\])#(?:\\\\(?:\\r\\n|[\\s\\S])|[^\\\\\\r\\n])*"))), C2259441Dc6.LJIIIIZZ("string", C2259441Dc6.LJ(PatternProtector.compile("([\"'])(?:\\\\(?:\\r\\n|[\\s\\S])|(?!\\1)[^\\\\\\r\\n])*\\1"), false)), C2259441Dc6.LJIIIIZZ("builtin", C2259441Dc6.LIZLLL(PatternProtector.compile("\\.[A-Z][^:#=\\s]+(?=\\s*:(?!=))"))), C2259441Dc6.LJIIIIZZ("symbol", C2259441Dc6.LJI(PatternProtector.compile("^[^:=\\r\\n]+(?=\\s*:(?!=))", 8), false, false, null, C2259441Dc6.LIZ("inside", C2259441Dc6.LJIIIIZZ("variable", C2259441Dc6.LIZLLL(PatternProtector.compile("\\$+(?:[^(){}:#=\\s]+|(?=[({]))")))))), C2259441Dc6.LJIIIIZZ("variable", C2259441Dc6.LIZLLL(PatternProtector.compile("\\$+(?:[^(){}:#=\\s]+|\\([@*%<^+?][DF]\\)|(?=[({]))"))), C2259441Dc6.LJIIIIZZ("keyword", C2259441Dc6.LIZLLL(PatternProtector.compile("-include\\b|\\b(?:define|else|endef|endif|export|ifn?def|ifn?eq|include|override|private|sinclude|undefine|unexport|vpath)\\b")), C2259441Dc6.LJII(PatternProtector.compile("(\\()(?:addsuffix|abspath|and|basename|call|dir|error|eval|file|filter(?:-out)?|findstring|firstword|flavor|foreach|guile|if|info|join|lastword|load|notdir|or|origin|patsubst|realpath|shell|sort|strip|subst|suffix|value|warning|wildcard|word(?:s|list)?)(?=[ \\t])"))), C2259441Dc6.LJIIIIZZ("operator", C2259441Dc6.LIZLLL(PatternProtector.compile("(?:::|[?:+!])?=|[|@]"))), C2259441Dc6.LJIIIIZZ("punctuation", C2259441Dc6.LIZLLL(PatternProtector.compile("[:;(){}]"))));
    }
}
