package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.147p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC202143147p<P, R> extends AbstractC1835360xrS<P, R> implements InterfaceC20023413We {
    public boolean LLILZIL;
    public Fragment LLILZLL;

    public AbstractC202143147p(SparkContext sparkContext) {
        Fragment next;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
        if (interfaceC1059280dfiLJJIJLIJ == null) {
            return;
        }
        Object objLJJIJLIJ = sparkContext.LJJIJLIJ();
        if (objLJJIJLIJ instanceof SparkPopup) {
            this.LLILZLL = (Fragment) objLJJIJLIJ;
        } else if (objLJJIJLIJ instanceof C19EG) {
            this.LLILZIL = true;
            Iterator<Fragment> it2 = ((C19EG) objLJJIJLIJ).getSupportFragmentManager().LJJLIIIJL().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next instanceof SparkFragment) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            this.LLILZLL = next;
        }
        if (interfaceC1059280dfiLJJIJLIJ instanceof InterfaceC1432560nNm) {
            ((InterfaceC1432560nNm) interfaceC1059280dfiLJJIJLIJ).KF(new InterfaceC1387820mDc(this) { // from class: X.147q
                public final /* synthetic */ AbstractC202143147p<P, R> LIZ;

                {
                    this.LIZ = this;
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
                @Override // X.InterfaceC1387820mDc
                public final void onActivityResult(int i, int i2, Intent intent) {
                    AbstractC202143147p<P, R> abstractC202143147p = this.LIZ;
                    if (abstractC202143147p.LLILZLL == null) {
                        return;
                    }
                    if (abstractC202143147p.LLILZIL) {
                        i &= 65535;
                    }
                    abstractC202143147p.onActivityResult(i, i2, intent);
                }
            });
        }
    }
}
