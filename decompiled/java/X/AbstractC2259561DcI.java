package X;

import com.bytedance.mt.protector.impl.PatternProtector;

/* JADX INFO: renamed from: X.1DcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2259561DcI {
    public static C2259371Dbz LIZ() {
        C2259341Dbw c2259341DbwLJIIIIZZ = C2259441Dc6.LJIIIIZZ("entity", C2259441Dc6.LIZLLL(PatternProtector.compile("&#?[\\da-z]{1,8};", 2)));
        return C2259441Dc6.LIZ("markup", C2259441Dc6.LJIIIIZZ("comment", C2259441Dc6.LIZLLL(PatternProtector.compile("<!--[\\s\\S]*?-->"))), C2259441Dc6.LJIIIIZZ("prolog", C2259441Dc6.LIZLLL(PatternProtector.compile("<\\?[\\s\\S]+?\\?>"))), C2259441Dc6.LJIIIIZZ("doctype", C2259441Dc6.LIZLLL(PatternProtector.compile("<!DOCTYPE[\\s\\S]+?>", 2))), C2259441Dc6.LJIIIIZZ("cdata", C2259441Dc6.LIZLLL(PatternProtector.compile("<!\\[CDATA\\[[\\s\\S]*?]]>", 2))), C2259441Dc6.LJIIIIZZ("tag", C2259441Dc6.LJI(PatternProtector.compile("<\\/?(?!\\d)[^\\s>\\/=$<%]+(?:\\s+[^\\s>\\/=]+(?:=(?:(\"|')(?:\\\\[\\s\\S]|(?!\\1)[^\\\\])*\\1|[^\\s'\">=]+))?)*\\s*\\/?>", 2), false, true, null, C2259441Dc6.LIZ("inside", C2259441Dc6.LJIIIIZZ("tag", C2259441Dc6.LJI(PatternProtector.compile("^<\\/?[^\\s>\\/]+", 2), false, false, null, C2259441Dc6.LIZ("inside", C2259441Dc6.LJIIIIZZ("punctuation", C2259441Dc6.LIZLLL(PatternProtector.compile("^<\\/?"))), C2259441Dc6.LJIIIIZZ("namespace", C2259441Dc6.LIZLLL(PatternProtector.compile("^[^\\s>\\/:]+:")))))), C2259441Dc6.LJIIIIZZ("attr-value", C2259441Dc6.LJI(PatternProtector.compile("=(?:(\"|')(?:\\\\[\\s\\S]|(?!\\1)[^\\\\])*\\1|[^\\s'\">=]+)", 2), false, false, null, C2259441Dc6.LIZ("inside", C2259441Dc6.LJIIIIZZ("punctuation", C2259441Dc6.LIZLLL(PatternProtector.compile("^=")), C2259441Dc6.LJII(PatternProtector.compile("(^|[^\\\\])[\"']"))), c2259341DbwLJIIIIZZ))), C2259441Dc6.LJIIIIZZ("punctuation", C2259441Dc6.LIZLLL(PatternProtector.compile("\\/?>"))), C2259441Dc6.LJIIIIZZ("attr-name", C2259441Dc6.LJI(PatternProtector.compile("[^\\s>\\/]+"), false, false, null, C2259441Dc6.LIZ("inside", C2259441Dc6.LJIIIIZZ("namespace", C2259441Dc6.LIZLLL(PatternProtector.compile("^[^\\s>\\/:]+:"))))))))), c2259341DbwLJIIIIZZ);
    }
}
