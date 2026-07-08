package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0F31, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F31 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<C0F32> LL = new ArrayList();
    public C0F3A LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001f A[PHI: r3
      0x001f: PHI (r3v1 android.graphics.Bitmap) = (r3v0 android.graphics.Bitmap), (r3v3 android.graphics.Bitmap) binds: [B:3:0x0003, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0E3i, X.0F35] */
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
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r6, final int r7) {
        /*
            r5 = this;
            X.0F3A r4 = r5.LLILLJJLI
            r3 = 0
            if (r4 == 0) goto L1f
            java.util.List<X.0F32> r0 = r5.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            X.0F32 r0 = (X.C0F32) r0
            java.lang.String r2 = r0.LIZ
            java.util.List<X.0F32> r0 = r5.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            X.0F32 r0 = (X.C0F32) r0
            long r0 = r0.LIZIZ
            android.graphics.Bitmap r3 = r4.LIZIZ(r0, r2)
            if (r3 != 0) goto L36
        L1f:
            X.0F35 r1 = new X.0F35
            r1.<init>()
            boolean r0 = r6 instanceof X.C0F3B
            if (r0 == 0) goto L2f
            r0 = r6
            X.0F3B r0 = (X.C0F3B) r0
            if (r0 == 0) goto L2f
            r0.LLILLJJLI = r1
        L2f:
            X.0F3A r0 = r5.LLILLJJLI
            if (r0 == 0) goto L36
            r0.LIZJ(r1)
        L36:
            java.util.List<X.0F32> r0 = r5.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            X.0F32 r0 = (X.C0F32) r0
            float r1 = r0.LIZJ
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L5e
            int r2 = X.C0F39.LIZIZ
        L48:
            boolean r0 = r6 instanceof X.C0F3B
            if (r0 == 0) goto L5d
            X.0F3B r6 = (X.C0F3B) r6
            if (r6 == 0) goto L5d
            android.widget.ImageView r1 = r6.LL
            if (r1 == 0) goto L5d
            r0 = -5
            X.C372570Ej9.LIZJ(r2, r0, r1)
            if (r3 == 0) goto L5d
            r1.setImageBitmap(r3)
        L5d:
            return
        L5e:
            int r0 = X.C0F39.LIZIZ
            float r1 = (float) r0
            java.util.List<X.0F32> r0 = r5.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            X.0F32 r0 = (X.C0F32) r0
            float r0 = r0.LIZJ
            float r1 = r1 * r0
            int r2 = (int) r1
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F31.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0F3B c0f3b = new C0F3B(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c1i, viewGroup, false));
        try {
            View view = c0f3b.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0f3b.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0f3b.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0F3B.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0f3b.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0f3b.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0F3B.class.getName();
        return c0f3b;
    }
}
