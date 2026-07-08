package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.18vK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21439618vK extends AbstractC21447518wb {
    public final Set<String> LIZ = new LinkedHashSet();

    @Override // X.InterfaceC21445718wJ
    public final AbstractC21449018wq LIZ(InterfaceC21449618ww interfaceC21449618ww, C21443618vy c21443618vy) {
        C21440618vU c21440618vU = (C21440618vU) interfaceC21449618ww;
        int i = c21440618vU.LJ;
        CharSequence charSequence = c21440618vU.LIZ;
        if (c21440618vU.LJI < 4 && charSequence.charAt(i) == '<') {
            for (String str : this.LIZ) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("^<(?:");
                    sbLIZ.append(str);
                    sbLIZ.append(")(?:\\s|>|$)");
                    Pattern patternCompile = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ), 2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("</(?:");
                    sbLIZ2.append(str);
                    sbLIZ2.append(")>");
                    final Pattern patternCompile2 = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ2), 2);
                    if (patternCompile.matcher(charSequence.subSequence(i, charSequence.length())).find()) {
                        C21444418w6 c21444418w6 = new C21444418w6(new AbstractC21440018vO(patternCompile2) { // from class: X.18vM
                            public final Pattern LIZ;
                            public boolean LIZJ;
                            public final C21440118vP LIZIZ = new C21440118vP();
                            public final C21440418vS LIZLLL = new C21440418vS();

                            @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
                            public final void LJII() {
                                this.LIZIZ.LJFF = this.LIZLLL.LIZ.toString();
                            }

                            @Override // X.InterfaceC21443518vx
                            public final /* bridge */ /* synthetic */ AbstractC21439018vE LIZIZ() {
                                return this.LIZIZ;
                            }

                            {
                                this.LIZ = patternCompile2;
                            }

                            @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
                            public final void LIZJ(CharSequence charSequence2) {
                                C21440418vS c21440418vS = this.LIZLLL;
                                if (c21440418vS.LIZIZ != 0) {
                                    c21440418vS.LIZ.append('\n');
                                }
                                c21440418vS.LIZ.append(charSequence2);
                                c21440418vS.LIZIZ++;
                                Pattern pattern = this.LIZ;
                                if (pattern != null && pattern.matcher(charSequence2).find()) {
                                    this.LIZJ = true;
                                }
                            }

                            @Override // X.InterfaceC21443518vx
                            public final C21445418wG LJFF(InterfaceC21449618ww interfaceC21449618ww2) {
                                if (this.LIZJ) {
                                    return null;
                                }
                                C21440618vU c21440618vU2 = (C21440618vU) interfaceC21449618ww2;
                                if (c21440618vU2.LJII && this.LIZ == null) {
                                    return null;
                                }
                                return C21445418wG.LIZ(c21440618vU2.LIZIZ);
                            }
                        });
                        c21444418w6.LIZIZ = ((C21440618vU) interfaceC21449618ww).LIZIZ;
                        return c21444418w6;
                    }
                    continue;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return null;
        }
        return null;
    }
}
