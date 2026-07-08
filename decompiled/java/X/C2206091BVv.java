package X;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.autofill.AutofillValue;
import android.webkit.WebView;
import java.util.Map;

/* JADX INFO: renamed from: X.1BVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2206091BVv extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public InterfaceC1038080d7W LLIZLLLIL;
    public boolean LLIZ = true;
    public final C1BW5 LLJ = new C1ET3() { // from class: X.1BW5
        @Override // X.C1ET3
        public final void LJIJJLI() {
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZLLLIL;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.goBack();
            }
            super.LJIJJLI();
        }

        @Override // X.C1ET3
        public final void LJJ() {
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZLLLIL;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.goForward();
            }
            super.LJJ();
        }

        @Override // X.C1ET3
        public final boolean LIZJ() {
            boolean zLIZJ = super.LIZJ();
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZLLLIL;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.canGoBack();
            }
            return zLIZJ;
        }

        @Override // X.C1ET3
        public final boolean LJ() {
            boolean zLJ = super.LJ();
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZLLLIL;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.canGoForward();
            }
            return zLJ;
        }

        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj<?> getExtension() {
            return this.LL;
        }

        @Override // X.C1ET3
        public final void LIZIZ(SparseArray<AutofillValue> sparseArray) {
            super.LIZIZ(sparseArray);
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZLLLIL;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.LJJIIJ(sparseArray);
            }
        }

        @Override // X.C1ET3
        public final void LJJII(String str) {
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZLLLIL;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.LJJ(str);
            }
            super.LJJII(str);
        }

        @Override // X.C1ET3
        public final boolean LJJJJLI(MotionEvent motionEvent) {
            C1ET2 c1et2;
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZLLLIL;
            if (interfaceC1038080d7W != null) {
                C1ET2 extendable = getExtendable();
                if (extendable instanceof WebView) {
                    c1et2 = extendable;
                } else {
                    c1et2 = null;
                }
                interfaceC1038080d7W.LJIILLIIL(c1et2, motionEvent);
            }
            return super.LJJJJLI(motionEvent);
        }

        @Override // X.C1ET3
        public final void LJJIII(String str, Map<String, String> map) {
            super.LJJIII(str, map);
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZLLLIL;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.LIZIZ();
            }
        }

        @Override // X.C1ET3
        public final void LJJJJ(int i, int i2, boolean z, boolean z2) {
            C1ET2 c1et2;
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZLLLIL;
            if (interfaceC1038080d7W != null) {
                C1ET2 extendable = getExtendable();
                if (extendable instanceof WebView) {
                    c1et2 = extendable;
                } else {
                    c1et2 = null;
                }
                interfaceC1038080d7W.LJIIL(c1et2, z, z2);
            }
            super.LJJJJ(i, i2, z, z2);
        }

        @Override // X.C1ET3
        public final void LJJJJJ(int i, int i2, int i3, int i4) {
            super.LJJJJJ(i, i2, i3, i4);
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZLLLIL;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.onScrollChanged(i, i2, i3, i4);
            }
        }
    };

    @Override // X.AbstractC1541650qDj
    public void LIZJ() {
        LJFF(AbstractC1541650qDj.LLILZLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C1541640qDi r11) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2206091BVv.LJFF(X.0qDi):void");
    }
}
