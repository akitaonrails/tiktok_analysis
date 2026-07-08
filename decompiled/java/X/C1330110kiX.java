package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0kiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330110kiX extends AbstractC1330120kiY<Bitmap> {
    public static boolean LIZLLL(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            C1328570kg3.LJIJI("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        C1328570kg3.LJIJI("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

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
    public final Object LIZJ(int i) {
        Object objPollFirst;
        C1330130kiZ<T> c1330130kiZ = this.LIZIZ;
        synchronized (c1330130kiZ) {
            C1330140kia c1330140kia = c1330130kiZ.LIZ.get(i);
            if (c1330140kia == null) {
                objPollFirst = null;
            } else {
                objPollFirst = c1330140kia.LIZJ.pollFirst();
                if (c1330130kiZ.LIZIZ != c1330140kia) {
                    c1330130kiZ.LIZ(c1330140kia);
                    C1330140kia c1330140kia2 = c1330130kiZ.LIZIZ;
                    if (c1330140kia2 == null) {
                        c1330130kiZ.LIZIZ = c1330140kia;
                        c1330130kiZ.LIZJ = c1330140kia;
                    } else {
                        c1330140kia.LIZLLL = c1330140kia2;
                        c1330140kia2.LIZ = c1330140kia;
                        c1330130kiZ.LIZIZ = c1330140kia;
                    }
                }
            }
        }
        LIZ(objPollFirst);
        Bitmap bitmap = (Bitmap) objPollFirst;
        if (bitmap == null || !LIZLLL(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJ(Object obj) {
        boolean zAdd;
        Bitmap bitmap = (Bitmap) obj;
        if (LIZLLL(bitmap)) {
            synchronized (this) {
                try {
                    zAdd = ((HashSet) this.LIZ).add(bitmap);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (zAdd) {
                this.LIZIZ.LIZIZ(C1327320ke2.LIZJ(bitmap), bitmap);
            }
        }
    }
}
