package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.18va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21441218va extends AbstractC21440018vO {
    public static final Pattern[][] LJ = {new Pattern[]{null, null}, new Pattern[]{PatternProtector.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), PatternProtector.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{PatternProtector.compile("^<!--"), PatternProtector.compile("-->")}, new Pattern[]{PatternProtector.compile("^<[?]"), PatternProtector.compile("\\?>")}, new Pattern[]{PatternProtector.compile("^<![A-Z]"), PatternProtector.compile(">")}, new Pattern[]{PatternProtector.compile("^<!\\[CDATA\\["), PatternProtector.compile("\\]\\]>")}, new Pattern[]{PatternProtector.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{PatternProtector.compile("^(?:<[A-Za-z][A-Za-z0-9-_]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-_]*\\s*[>])\\s*$", 2), null}};
    public final Pattern LIZIZ;
    public final C21440118vP LIZ = new C21440118vP();
    public boolean LIZJ = false;
    public C21445218wE LIZLLL = new C21445218wE();

    @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
    public final void LJII() {
        this.LIZ.LJFF = this.LIZLLL.LIZ.toString();
        this.LIZLLL = null;
    }

    @Override // X.InterfaceC21443518vx
    public final AbstractC21439018vE LIZIZ() {
        return this.LIZ;
    }

    public C21441218va(Pattern pattern) {
        this.LIZIZ = pattern;
    }

    @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
    public final void LIZJ(CharSequence charSequence) {
        C21445218wE c21445218wE = this.LIZLLL;
        if (c21445218wE.LIZIZ != 0) {
            c21445218wE.LIZ.append('\n');
        }
        c21445218wE.LIZ.append(charSequence);
        c21445218wE.LIZIZ++;
        Pattern pattern = this.LIZIZ;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.LIZJ = true;
        }
    }

    @Override // X.InterfaceC21443518vx
    public final C21445418wG LJFF(InterfaceC21449618ww interfaceC21449618ww) {
        if (this.LIZJ) {
            return null;
        }
        C21440618vU c21440618vU = (C21440618vU) interfaceC21449618ww;
        if (c21440618vU.LJII && this.LIZIZ == null) {
            return null;
        }
        return C21445418wG.LIZ(c21440618vU.LIZIZ);
    }
}
