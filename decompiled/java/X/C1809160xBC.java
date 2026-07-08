package X;

import Y.ACListenerS129S0200000_27;
import Y.ACListenerS91S0300000_27;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchPosition;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchSugEntity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xBC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809160xBC extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final InterfaceC1809200xBG LL;
    public final List<LiveSearchSugEntity> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        int size = ((ArrayList) this.LLILLJJLI).size();
        return ((ArrayList) this.LLILLJJLI).size() > 0 ? size + 1 : size;
    }

    public C1809160xBC(C1809120xB8 c1809120xB8) {
        this.LL = c1809120xB8;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i < ((ArrayList) this.LLILLJJLI).size()) {
            return 1;
        }
        return 2;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C1809150xBB) {
            C1809150xBB c1809150xBB = (C1809150xBB) viewHolder;
            c1809150xBB.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trending_words_show");
            c474500IjALIZ.LJJIIZI(c1809150xBB.I5());
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C1809150xBB) {
            viewHolder.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.16F5, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.text.SpannableString, java.lang.CharSequence] */
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
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ?? spannableString;
        if (viewHolder instanceof C1809150xBB) {
            C1809150xBB c1809150xBB = (C1809150xBB) viewHolder;
            LiveSearchSugEntity liveSearchSugEntity = (LiveSearchSugEntity) ListProtector.get(this.LLILLJJLI, i);
            InterfaceC1809230xBJ interfaceC1809230xBJ = new InterfaceC1809230xBJ() { // from class: X.0xBD
                @Override // X.InterfaceC1809230xBJ
                public final int LIZ(LiveSearchSugEntity liveSearchSugEntity2) {
                    if (liveSearchSugEntity2 == null) {
                        return -1;
                    }
                    return ((ArrayList) this.LIZ.LLILLJJLI).indexOf(liveSearchSugEntity2);
                }

                @Override // X.InterfaceC1809230xBJ
                public final void LIZIZ(int i2, String str) {
                    if (i2 >= 0 && i2 < ((ArrayList) this.LIZ.LLILLJJLI).size()) {
                        ListProtector.remove(this.LIZ.LLILLJJLI, i2);
                        C2834017w.LIZIZ(str);
                        this.LIZ.notifyItemRemoved(i2);
                    }
                }
            };
            c1809150xBB.LLILZIL = liveSearchSugEntity;
            c1809150xBB.LLILZLL = interfaceC1809230xBJ;
            List<LiveSearchPosition> list = liveSearchSugEntity.highLightPositions;
            if (list != null) {
                Context context = c1809150xBB.itemView.getContext();
                String str = liveSearchSugEntity.content;
                if (str == null) {
                    str = "";
                }
                if (context != null && !TextUtils.isEmpty(str) && !C086I.LIZIZ(list)) {
                    spannableString = new SpannableString(str);
                    for (LiveSearchPosition liveSearchPosition : list) {
                        if (liveSearchPosition != null) {
                            int i2 = liveSearchPosition.begin;
                            int i3 = liveSearchPosition.end + 1;
                            int iMax = Math.max(0, i2);
                            if (!TextUtils.isEmpty(spannableString) && iMax <= i3 && iMax < spannableString.length() && i3 <= spannableString.length()) {
                                C786410Ut5.p2(spannableString, new StyleSpan(1), iMax, i3, 17);
                            }
                        }
                    }
                } else {
                    spannableString = new SpannableString(str);
                }
            } else {
                spannableString = liveSearchSugEntity.content;
            }
            c1809150xBB.LLILLL.setText(spannableString);
            if (Intrinsics.LJFF(liveSearchSugEntity.sugType, "history")) {
                c1809150xBB.LLILLJJLI.setIconAttr(R.attr.d4d);
                c1809150xBB.LLILZ.setIconAttr(R.attr.eo4);
            } else {
                c1809150xBB.LLILLJJLI.setIconAttr(R.attr.e2_);
                c1809150xBB.LLILZ.setIconAttr(R.attr.crp);
            }
            C786410Ut5.I7(new ACListenerS129S0200000_27(liveSearchSugEntity, c1809150xBB, 22), c1809150xBB.itemView);
            C786410Ut5.g8(c1809150xBB.LLILZ, new ACListenerS91S0300000_27(liveSearchSugEntity, interfaceC1809230xBJ, c1809150xBB, 7));
            c1809150xBB.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1864620yce(c1809150xBB, liveSearchSugEntity, 7));
            return;
        }
        if (viewHolder instanceof C1809220xBI) {
            viewHolder.getClass();
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1809150xBB;
        if (i != 1) {
            if (i != 2) {
                int i2 = C1809150xBB.LLIZ;
                c1809150xBB = new C1809150xBB(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gux, viewGroup, false), this.LL);
            } else {
                int i3 = C1809220xBI.LL;
                c1809150xBB = new C1809220xBI(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.guy, viewGroup, false));
            }
        } else {
            int i4 = C1809150xBB.LLIZ;
            c1809150xBB = new C1809150xBB(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gux, viewGroup, false), this.LL);
        }
        try {
            View view = c1809150xBB.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1809150xBB.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1809150xBB.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1809150xBB.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1809150xBB.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1809150xBB.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1809150xBB.getClass().getName();
        return c1809150xBB;
    }
}
