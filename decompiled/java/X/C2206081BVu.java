package X;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.autofill.AutofillValue;
import android.webkit.WebView;
import java.util.Map;

/* JADX INFO: renamed from: X.1BVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206081BVu extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public InterfaceC1038080d7W LLIZ;
    public final C1BW6 LLIZLLLIL = new C1ET3() { // from class: X.1BW6
        @Override // X.C1ET3
        public final void LJIJJLI() {
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZ;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.goBack();
            }
            super.LJIJJLI();
        }

        @Override // X.C1ET3
        public final void LJJ() {
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZ;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.goForward();
            }
            super.LJJ();
        }

        @Override // X.C1ET3
        public final boolean LIZJ() {
            boolean zLIZJ = super.LIZJ();
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZ;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.canGoBack();
            }
            return zLIZJ;
        }

        @Override // X.C1ET3
        public final boolean LJ() {
            boolean zLJ = super.LJ();
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZ;
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
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZ;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.LJJIIJ(sparseArray);
            }
        }

        @Override // X.C1ET3
        public final void LJJII(String str) {
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZ;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.LJJ(str);
            }
            super.LJJII(str);
        }

        @Override // X.C1ET3
        public final boolean LJJJJLI(MotionEvent motionEvent) {
            C1ET2 c1et2;
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZ;
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
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZ;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.LIZIZ();
            }
        }

        @Override // X.C1ET3
        public final void LJJJJ(int i, int i2, boolean z, boolean z2) {
            C1ET2 c1et2;
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZ;
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
            InterfaceC1038080d7W interfaceC1038080d7W = this.LL.LLIZ;
            if (interfaceC1038080d7W != null) {
                interfaceC1038080d7W.onScrollChanged(i, i2, i3, i4);
            }
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0148  */
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
    @Override // X.AbstractC1541650qDj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2206081BVu.LIZJ():void");
    }
}
