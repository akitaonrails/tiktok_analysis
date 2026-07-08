package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Elb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374090Elb extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Context LL;
    public List<C373800El8> LLILLJJLI;
    public InterfaceC374610EmR LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final C01GW LLILZLL;
    public final LayerDrawable LLIZ;
    public final LayerDrawable LLIZLLLIL;

    public C374090Elb() {
        throw null;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C374090Elb(Context context) {
        ArrayList arrayList = new ArrayList();
        this.LL = context;
        this.LLILLJJLI = arrayList;
        this.LLILZ = true;
        this.LLILZIL = C353850Du3.LIZ(null);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 577));
        this.LLILZLL = c01gwLIZIZ;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a03, (Context) c01gwLIZIZ.getValue());
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c384050F3z.LIZ(context)});
        layerDrawable.setLayerInset(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        this.LLIZ = layerDrawable;
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c384050F3z2.LJ = C1308910kAL.LIZJ(R.attr.a1h, (Context) c01gwLIZIZ.getValue());
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZ = C1308910kAL.LIZJ(R.attr.a03, (Context) c01gwLIZIZ.getValue());
        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{c384050F3z2.LIZ(context), c384050F3z3.LIZ(context)});
        layerDrawable2.setLayerInset(1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        this.LLIZLLLIL = layerDrawable2;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        EnumC373830ElB enumC373830ElB;
        C373800El8 c373800El8 = (C373800El8) C13LP.LJJJLZIJ(i, this.LLILLJJLI);
        if (c373800El8 != null) {
            enumC373830ElB = c373800El8.LIZ;
        } else {
            enumC373830ElB = null;
        }
        if (enumC373830ElB == EnumC373830ElB.SPLIT_LINE) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(final androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
        /*
            r7 = this;
            java.util.List<X.0El8> r0 = r7.LLILLJJLI
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r9)
            X.0El8 r3 = (X.C373800El8) r3
            boolean r0 = r8 instanceof X.C374110Eld
            if (r0 != 0) goto Ld
            return
        Ld:
            r4 = r8
            X.0Eld r4 = (X.C374110Eld) r4
            com.bytedance.tux.input.TuxTextView r2 = r4.LL
            int r1 = r3.LIZLLL
            if (r1 == 0) goto Lc0
            android.content.Context r0 = r7.LL
            java.lang.String r0 = r0.getString(r1)
        L1c:
            r2.setText(r0)
            boolean r0 = r7.LLILZIL
            r6 = 0
            if (r0 == 0) goto Lbe
            r0 = 3
            X.0ElB[] r5 = new X.EnumC373830ElB[r0]
            X.0ElB r0 = X.EnumC373830ElB.MANUAL_CUTOUT
            r5[r6] = r0
            X.0ElB r0 = X.EnumC373830ElB.CHROMA_KEY
            r2 = 1
            r5[r2] = r0
            r1 = 2
            X.0ElB r0 = X.EnumC373830ElB.STROKE
            r5[r1] = r0
            java.util.List r1 = X.C1697810uHb.LJIIJJI(r5)
            X.0ElB r0 = r3.LIZ
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lbe
        L41:
            boolean r1 = r3.LJ
            if (r1 == 0) goto Lb1
            if (r2 != 0) goto Lb1
            X.0GdJ r5 = r3.LIZJ
        L49:
            com.bytedance.tux.icon.TuxIconView r2 = r4.LLILLJJLI
            if (r5 == 0) goto Laf
            r1 = 28
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r5.LIZIZ = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r5.LIZJ = r0
        L6b:
            r2.setTuxIcon(r5)
            com.bytedance.tux.icon.TuxIconView r1 = r4.LLILLJJLI
            boolean r0 = r3.LJFF
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto Lab
            r0 = 1065353216(0x3f800000, float:1.0)
        L78:
            X.C786410Ut5.x5(r1, r0)
            com.bytedance.tux.input.TuxTextView r1 = r4.LL
            boolean r0 = r3.LJFF
            if (r0 != 0) goto L84
            r2 = 1053609165(0x3ecccccd, float:0.4)
        L84:
            X.C786410Ut5.B5(r1, r2)
            android.widget.FrameLayout r1 = r4.LLILLL
            android.graphics.drawable.LayerDrawable r0 = r7.LLIZ
            r1.setBackground(r0)
            boolean r0 = r3.LJI
            if (r0 == 0) goto L9d
            android.widget.FrameLayout r1 = r4.LLILLL
            boolean r0 = r3.LJ
            if (r0 == 0) goto La8
            android.graphics.drawable.LayerDrawable r0 = r7.LLIZLLLIL
        L9a:
            r1.setBackground(r0)
        L9d:
            android.view.View r1 = r8.itemView
            X.0Elf r0 = new X.0Elf
            r0.<init>()
            X.C786410Ut5.I7(r0, r1)
            return
        La8:
            android.graphics.drawable.LayerDrawable r0 = r7.LLIZ
            goto L9a
        Lab:
            r0 = 1053609165(0x3ecccccd, float:0.4)
            goto L78
        Laf:
            r5 = 0
            goto L6b
        Lb1:
            X.0GdJ r5 = r3.LIZIZ
            if (r2 == 0) goto L49
            com.bytedance.tux.icon.TuxIconView r0 = r4.LLILZ
            if (r1 != 0) goto Lba
            r6 = 4
        Lba:
            X.C786410Ut5.LLLLLLZZ(r0, r6)
            goto L49
        Lbe:
            r2 = 0
            goto L41
        Lc0:
            java.lang.String r0 = ""
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C374090Elb.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c374110Eld;
        if (i == 1) {
            final View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.c0v, viewGroup, false);
            c374110Eld = new RecyclerView.ViewHolder(viewTd) { // from class: X.0EmP
            };
        } else {
            c374110Eld = new C374110Eld(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.c0t, viewGroup, false));
        }
        try {
            View view = c374110Eld.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c374110Eld.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c374110Eld.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c374110Eld.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c374110Eld.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c374110Eld.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c374110Eld.getClass().getName();
        return c374110Eld;
    }
}
