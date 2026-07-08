package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.zhihu.matisse.internal.entity.Item;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.147H, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C147H<VH extends RecyclerView.ViewHolder> extends AbstractC21673619ry<VH> {
    public Cursor LL;
    public int LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        Cursor cursor = this.LL;
        if (cursor == null || cursor.isClosed()) {
            return 0;
        }
        return this.LL.getCount();
    }

    public C147H() {
        setHasStableIds(true);
        LLLFZ(null);
    }

    public final void LLLFZ(Cursor cursor) {
        if (cursor == this.LL) {
            return;
        }
        if (cursor != null) {
            this.LL = cursor;
            this.LLILLJJLI = cursor.getColumnIndexOrThrow("_id");
            notifyDataSetChanged();
        } else {
            notifyItemRangeRemoved(0, getItemCount());
            this.LL = null;
            this.LLILLJJLI = -1;
        }
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        Cursor cursor = this.LL;
        if (cursor != null && !cursor.isClosed()) {
            if (this.LL.moveToPosition(i)) {
                return this.LL.getLong(this.LLILLJJLI);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Could not move cursor to position ");
            sbLIZ.append(i);
            sbLIZ.append(" when trying to get an item id");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IllegalStateException("Cannot lookup item id when cursor is in invalid state.");
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (this.LL.moveToPosition(i)) {
            if (Item.LIZLLL(this.LL).id == -1) {
                return 1;
            }
            return 2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Could not move cursor to position ");
        sbLIZ.append(i);
        sbLIZ.append(" when trying to get item view type.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [REQUEST, X.0kbR] */
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
    public final void onBindViewHolder(VH vh, int i) {
        int i2;
        Drawable.ConstantState constantState;
        Cursor cursor = this.LL;
        if (cursor != null && !cursor.isClosed()) {
            if (this.LL.moveToPosition(i)) {
                Cursor cursor2 = this.LL;
                C147I c147i = (C147I) this;
                if (vh instanceof C147J) {
                    C147J c147j = (C147J) vh;
                    Drawable[] compoundDrawables = c147j.LL.getCompoundDrawables();
                    TypedArray typedArrayObtainStyledAttributes = vh.itemView.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.bfb});
                    int color = typedArrayObtainStyledAttributes.getColor(0, 0);
                    typedArrayObtainStyledAttributes.recycle();
                    for (int i3 = 0; i3 < compoundDrawables.length; i3++) {
                        Drawable drawable = compoundDrawables[i3];
                        if (drawable != null && (constantState = drawable.getConstantState()) != null) {
                            Drawable drawableMutate = constantState.newDrawable().mutate();
                            drawableMutate.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                            drawableMutate.setBounds(drawable.getBounds());
                            compoundDrawables[i3] = drawableMutate;
                        }
                    }
                    c147j.LL.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
                    return;
                }
                if (vh instanceof C147K) {
                    C147K c147k = (C147K) vh;
                    Item itemLIZLLL = Item.LIZLLL(cursor2);
                    C147A c147a = c147k.LL;
                    Context context = c147a.getContext();
                    if (c147i.LLIZLLLIL == 0) {
                        int i4 = ((GridLayoutManager) c147i.LLIZ.getLayoutManager()).LLILLJJLI;
                        int dimensionPixelSize = (context.getResources().getDisplayMetrics().widthPixels - (context.getResources().getDimensionPixelSize(R.dimen.a78) * (i4 - 1))) / i4;
                        c147i.LLIZLLLIL = dimensionPixelSize;
                        c147i.LLIZLLLIL = (int) (dimensionPixelSize * c147i.LLILZ.LJIIIZ);
                    }
                    c147a.LLILZLL = new C147B(c147i.LLIZLLLIL, c147i.LLILZ.LJFF, vh);
                    C147A c147a2 = c147k.LL;
                    c147a2.LLILZIL = itemLIZLLL;
                    ImageView imageView = c147a2.LLILLL;
                    if (itemLIZLLL.LIZ()) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    C786410Ut5.LJZI(i2, imageView);
                    c147a2.LLILLJJLI.setCountable(c147a2.LLILZLL.LIZIZ);
                    C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(c147a2.LLILZIL.uri);
                    int i5 = c147a2.LLILZLL.LIZ;
                    c1325700kbQLIZLLL.LIZJ = new C1324630kZh(i5, i5);
                    ?? LIZ = c1325700kbQLIZLLL.LIZ();
                    if (c147a2.LLILZIL.LIZ()) {
                        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                        c1320810kTXLIZJ.LJIILJJIL = c147a2.LL.getController();
                        c1320810kTXLIZJ.LIZLLL = LIZ;
                        c1320810kTXLIZJ.LJIIJJI = true;
                        c147a2.LL.setController(c1320810kTXLIZJ.LIZ());
                    } else {
                        c147a2.LL.setImageRequest(LIZ);
                    }
                    if (c147a2.LLILZIL.LIZJ()) {
                        C786410Ut5.LLIL(c147a2.LLILZ, 0);
                        c147a2.LLILZ.setText(DateUtils.formatElapsedTime(c147a2.LLILZIL.duration / 1000));
                    } else {
                        C786410Ut5.LLIL(c147a2.LLILZ, 8);
                    }
                    c147k.LL.setOnMediaGridClickListener(c147i);
                    C147A c147a3 = c147k.LL;
                    if (c147i.LLILZ.LJFF) {
                        int iLIZIZ = c147i.LLILLL.LIZIZ(itemLIZLLL);
                        if (iLIZIZ > 0) {
                            c147a3.setCheckEnabled(true);
                            c147a3.setCheckedNum(iLIZIZ);
                            return;
                        } else if (c147i.LLILLL.LJ()) {
                            c147a3.setCheckEnabled(false);
                            c147a3.setCheckedNum(Integer.MIN_VALUE);
                            return;
                        } else {
                            c147a3.setCheckEnabled(true);
                            c147a3.setCheckedNum(iLIZIZ);
                            return;
                        }
                    }
                    if (c147i.LLILLL.LIZIZ.contains(itemLIZLLL)) {
                        c147a3.setCheckEnabled(true);
                        c147a3.setChecked(true);
                        return;
                    } else if (c147i.LLILLL.LJ()) {
                        c147a3.setCheckEnabled(false);
                        c147a3.setChecked(false);
                        return;
                    } else {
                        c147a3.setCheckEnabled(true);
                        c147a3.setChecked(false);
                        return;
                    }
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Could not move cursor to position ");
            sbLIZ.append(i);
            sbLIZ.append(" when trying to bind view holder");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IllegalStateException("Cannot bind view holder when cursor is in invalid state.");
    }
}
