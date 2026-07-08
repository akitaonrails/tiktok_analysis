package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HiddenItem;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HiddenUser;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HideAccountViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15ej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20572315ej extends AbstractC683590Qrd<HiddenItem> {
    public final HideAccountViewModel LL;

    public C20572315ej(HideAccountViewModel hideAccountViewModel) {
        super(false);
        this.LL = hideAccountViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC683590Qrd
    public final void setData(List<HiddenItem> list) {
        final List list2;
        final List list3 = this.mmItems;
        if (list3 == null) {
            list3 = C13BV.INSTANCE;
        }
        if (list == 0) {
            list2 = C13BV.INSTANCE;
        } else {
            list2 = list;
        }
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(list3, list2) { // from class: X.15et
            public final List<HiddenItem> LIZ;
            public final List<HiddenItem> LIZIZ;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            {
                this.LIZ = list3;
                this.LIZIZ = list2;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                return Intrinsics.LJFF(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                String str;
                HiddenUser hiddenUser = ((HiddenItem) ListProtector.get(this.LIZ, i)).user;
                String str2 = null;
                if (hiddenUser != null) {
                    str = hiddenUser.userId;
                } else {
                    str = null;
                }
                HiddenUser hiddenUser2 = ((HiddenItem) ListProtector.get(this.LIZIZ, i2)).user;
                if (hiddenUser2 != null) {
                    str2 = hiddenUser2.userId;
                }
                return Intrinsics.LJFF(str, str2);
            }
        }, true);
        this.mmItems = list;
        c21341918fZLIZ.LIZJ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
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
    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        boolean z2;
        int i2;
        ViewOnClickListenerC20572415ek viewOnClickListenerC20572415ek;
        String string;
        List<HiddenItem> data = getData();
        ?? r12 = 0;
        boolean z3 = false;
        r12 = 0;
        r12 = 0;
        if (data != null && (viewHolder instanceof ViewOnClickListenerC20572415ek) && (viewOnClickListenerC20572415ek = (ViewOnClickListenerC20572415ek) viewHolder) != null) {
            HiddenItem hiddenItem = (HiddenItem) ListProtector.get(data, i);
            viewOnClickListenerC20572415ek.LL = hiddenItem;
            HiddenUser hiddenUser = hiddenItem.user;
            if (hiddenUser == null) {
                z3 = false;
                hiddenUser = new HiddenUser("", "", "", 0, 0, "");
            }
            C427660Gpo.LJIIJJI(viewOnClickListenerC20572415ek.LLILLL, hiddenUser.avatar, z3, null, null, z3 ? 1 : 0, z3 ? 1 : 0, null, null, z3 ? 1 : 0, null, 1022);
            viewOnClickListenerC20572415ek.LLILZ.setText(hiddenUser.nickname);
            TuxTextView tuxTextView = viewOnClickListenerC20572415ek.LLILZIL;
            Resources resources = viewOnClickListenerC20572415ek.itemView.getContext().getResources();
            int i3 = hiddenUser.videoCount;
            Object[] objArr = new Object[1];
            objArr[z3 ? 1 : 0] = C1843500y4a.LIZIZ(i3);
            tuxTextView.setText(resources.getQuantityString(2131755372, i3, objArr));
            TuxTextView tuxTextView2 = viewOnClickListenerC20572415ek.LLILZLL;
            Resources resources2 = viewOnClickListenerC20572415ek.itemView.getContext().getResources();
            int i4 = hiddenUser.followerCount;
            Object[] objArr2 = new Object[1];
            objArr2[z3 ? 1 : 0] = C1843500y4a.LIZIZ(i4);
            tuxTextView2.setText(resources2.getQuantityString(2131755371, i4, objArr2));
            TuxTextView tuxTextView3 = viewOnClickListenerC20572415ek.LLIZ;
            String string2 = hiddenUser.bioContent;
            if (string2.length() == 0) {
                string2 = viewOnClickListenerC20572415ek.itemView.getContext().getString(2131835500);
            }
            tuxTextView3.setText(string2);
            C197039127h c197039127h = viewOnClickListenerC20572415ek.LLIZLLLIL;
            if (hiddenItem.isHidden()) {
                string = viewOnClickListenerC20572415ek.itemView.getContext().getString(2131835499);
            } else {
                string = viewOnClickListenerC20572415ek.itemView.getContext().getString(2131835498);
            }
            c197039127h.setText(string);
            viewOnClickListenerC20572415ek.LLIZLLLIL.setButtonVariant(hiddenItem.isHidden() ? 1 : 0);
            r12 = z3;
        }
        int basicItemCount = getBasicItemCount();
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (i == basicItemCount - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, view.getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = numLIZJ;
            if (z) {
                float f = iLIZIZ;
                c384050F3z.LJIIIIZZ = Float.valueOf(f);
                c384050F3z.LJIIIZ = Float.valueOf(f);
            }
            if (z2) {
                float f2 = iLIZIZ;
                c384050F3z.LJIIJ = Float.valueOf(f2);
                c384050F3z.LJIIJJI = Float.valueOf(f2);
            }
            Drawable[] drawableArr = new Drawable[1];
            drawableArr[r12] = c384050F3z.LIZ(view.getContext());
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            ?? r10 = r12;
            ?? r11 = r12;
            ?? r122 = r12;
            layerDrawable.setLayerInset(r10 == true ? 1 : 0, r11 == true ? 1 : 0, r122 == true ? 1 : 0, r122 == true ? 1 : 0, r122 == true ? 1 : 0);
            view.setBackground(layerDrawable);
            if (z) {
                i2 = iLIZIZ2;
            } else {
                i2 = 0;
            }
            if (z2) {
                r122 = iLIZIZ2;
            }
            C426750GoL.LJIIL(view, 0, Integer.valueOf(i2), 0, Integer.valueOf((int) r122), 16);
        }
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC20572415ek(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bd4, viewGroup, false));
    }
}
