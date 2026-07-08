package X;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0xXN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822910xXN extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<? extends InterfaceC1782150wTd> LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final InterfaceC1823190xXp LLILZIL;
    public final C1822330xWR LLILZLL;
    public final Function1<InterfaceC1822900xXM, Unit> LLIZ;
    public final Function0<View> LLIZLLLIL;
    public final C2172981A2m<InterfaceC1782150wTd> LLJ = new C2172981A2m<>(this, new AbstractC339510DSr<InterfaceC1782150wTd>() { // from class: X.0wYc
        @Override // X.AbstractC339510DSr
        public final boolean LIZ(InterfaceC1782150wTd interfaceC1782150wTd, InterfaceC1782150wTd interfaceC1782150wTd2) {
            return Intrinsics.LJFF(interfaceC1782150wTd, interfaceC1782150wTd2);
        }

        @Override // X.AbstractC339510DSr
        public final boolean LIZIZ(InterfaceC1782150wTd interfaceC1782150wTd, InterfaceC1782150wTd interfaceC1782150wTd2) {
            InterfaceC1782150wTd interfaceC1782150wTd3 = interfaceC1782150wTd;
            InterfaceC1782150wTd interfaceC1782150wTd4 = interfaceC1782150wTd2;
            if ((interfaceC1782150wTd3 instanceof InterfaceC1822900xXM) && (interfaceC1782150wTd4 instanceof InterfaceC1822900xXM)) {
                return Intrinsics.LJFF(((InterfaceC1822900xXM) interfaceC1782150wTd3).getKey(), ((InterfaceC1822900xXM) interfaceC1782150wTd4).getKey());
            }
            return Intrinsics.LJFF(interfaceC1782150wTd3, interfaceC1782150wTd4);
        }
    });

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJ.LJFF.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LLJ.LJFF);
        if (objLJJJLZIJ instanceof C1822350xWT) {
            return 0;
        }
        if (!(objLJJJLZIJ instanceof InterfaceC1822900xXM) && (objLJJJLZIJ instanceof C1156360gCI)) {
            return 2;
        }
        return 1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
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
        C1822930xXP c1822930xXP;
        final InterfaceC1822900xXM interfaceC1822900xXM;
        C1782040wTS c1782040wTS;
        boolean z;
        int i2;
        boolean z2;
        LinearLayoutManager linearLayoutManager;
        int i3;
        int i4;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        String str;
        AbstractC1823000xXW abstractC1823000xXW;
        InterfaceC1782150wTd interfaceC1782150wTd = (InterfaceC1782150wTd) ListProtector.get(this.LLJ.LJFF, i);
        ColorStateList colorStateListValueOf = null;
        C1822350xWT c1822350xWT = null;
        if (getItemViewType(i) == 0) {
            if ((viewHolder instanceof AbstractC1823000xXW) && (abstractC1823000xXW = (AbstractC1823000xXW) viewHolder) != null) {
                if (interfaceC1782150wTd instanceof C1822350xWT) {
                    c1822350xWT = (C1822350xWT) interfaceC1782150wTd;
                }
                abstractC1823000xXW.I5(c1822350xWT);
                return;
            }
            return;
        }
        if (getItemViewType(i) != 1) {
            return;
        }
        if (viewHolder instanceof C1822930xXP) {
            c1822930xXP = (C1822930xXP) viewHolder;
        } else {
            c1822930xXP = null;
        }
        if (interfaceC1782150wTd instanceof InterfaceC1822900xXM) {
            interfaceC1822900xXM = (InterfaceC1822900xXM) interfaceC1782150wTd;
        } else {
            interfaceC1822900xXM = null;
        }
        if (c1822930xXP == null || interfaceC1822900xXM == null) {
            return;
        }
        c1822930xXP.LLILZLL = interfaceC1822900xXM;
        if (interfaceC1822900xXM instanceof C1782040wTS) {
            c1782040wTS = (C1782040wTS) interfaceC1822900xXM;
        } else {
            c1782040wTS = null;
        }
        int iIntValue6 = 0;
        if (c1782040wTS != null && (str = c1782040wTS.LJIILIIL) != null && (!a0.LJJJIL(str))) {
            z = true;
        } else {
            z = false;
        }
        LiveIconView liveIconView = c1822930xXP.LLILLL;
        liveIconView.setImageDrawable(null);
        int i5 = 16;
        C426750GoL.LJIIL(liveIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), 16);
        liveIconView.setIconAttr(interfaceC1822900xXM.LIZJ());
        if (z) {
            String str2 = ((C1782040wTS) interfaceC1822900xXM).LJIILIIL;
            i5 = 16;
            C426750GoL.LJIIL(liveIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 16);
            liveIconView.LJ();
            C1324610kZf url = C1819620xS4.LIZ().setUrl(str2);
            url.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            url.LJIILIIL = Boolean.TRUE;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ey9, liveIconView.getContext());
            if (numLIZJ != null) {
                iIntValue5 = numLIZJ.intValue();
            } else {
                iIntValue5 = 0;
            }
            float fLIZIZ = C497740JfY.LIZIZ(0.5f);
            url.LJJIIJ = iIntValue5;
            url.LJJIII = fLIZIZ;
            url.LJJI(liveIconView);
        }
        C16F5 c16f5 = c1822930xXP.LL;
        if (C454590Hs9.LIZ(c1822930xXP.itemView.getContext())) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        c16f5.setTextDirection(i2);
        c1822930xXP.LL.setText(interfaceC1822900xXM.getTitle());
        if (interfaceC1822900xXM.getDesc().length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C500260Jjc.LJIILIIL(c1822930xXP.LLILLJJLI);
            Paint.FontMetrics fontMetrics = c1822930xXP.LL.getPaint().getFontMetrics();
            if (fontMetrics.bottom - fontMetrics.top < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) {
                C16F5 c16f52 = c1822930xXP.LL;
                ViewGroup.LayoutParams layoutParams = c16f52.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    C786410Ut5.W5(c16f52, marginLayoutParams);
                    RunnableC781530UlD runnableC781530UlD = c1822930xXP.LLILZ;
                    ViewGroup.LayoutParams layoutParams2 = runnableC781530UlD.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                        C786410Ut5.W5(runnableC781530UlD, marginLayoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        } else {
            C500260Jjc.LLFFF(c1822930xXP.LLILLJJLI);
            c1822930xXP.LLILLJJLI.setText(interfaceC1822900xXM.getDesc());
            C16F5 c16f53 = c1822930xXP.LL;
            ViewGroup.LayoutParams layoutParams3 = c16f53.getLayoutParams();
            if (layoutParams3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.height = -2;
                marginLayoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                C786410Ut5.W5(c16f53, marginLayoutParams3);
                C500260Jjc.LJLJL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i5))), c1822930xXP.LLILZ);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        if (interfaceC1822900xXM.LJFF().isEmpty()) {
            C500260Jjc.LJIILIIL(c1822930xXP.LLILZ);
        } else {
            C500260Jjc.LLFFF(c1822930xXP.LLILZ);
            RunnableC781530UlD runnableC781530UlD2 = c1822930xXP.LLILZ;
            if (interfaceC1822900xXM instanceof C1782070wTV) {
                linearLayoutManager = new LinearLayoutManager(c1822930xXP.itemView.getContext(), 0, false);
            } else {
                linearLayoutManager = new LinearLayoutManager(c1822930xXP.itemView.getContext());
            }
            runnableC781530UlD2.setLayoutManager(linearLayoutManager);
            if (c1822930xXP.LLILZ.getAdapter() == null) {
                List<InterfaceC1782170wTf> listLJFF = interfaceC1822900xXM.LJFF();
                boolean z3 = this.LLILLJJLI;
                C1782070wTV c1782070wTVLJ = interfaceC1822900xXM.LJ();
                if (c1782070wTVLJ != null) {
                    i4 = c1782070wTVLJ.LJIIJ;
                } else {
                    i4 = 0;
                }
                C1823520xYM c1823520xYM = new C1823520xYM(listLJFF, z3, i4, this.LLILZIL);
                c1822930xXP.LLILZIL = c1823520xYM;
                c1822930xXP.LLILZ.setAdapter(c1823520xYM);
                C1823520xYM c1823520xYM2 = c1822930xXP.LLILZIL;
                if (c1823520xYM2 != null) {
                    c1823520xYM2.LLILZIL.LIZIZ(interfaceC1822900xXM.LJFF(), null);
                }
                c1822930xXP.LLILZ.invalidateItemDecorations();
            } else {
                C1823520xYM c1823520xYM3 = c1822930xXP.LLILZIL;
                if (c1823520xYM3 != null) {
                    C1782070wTV c1782070wTVLJ2 = interfaceC1822900xXM.LJ();
                    if (c1782070wTVLJ2 != null) {
                        i3 = c1782070wTVLJ2.LJIIJ;
                    } else {
                        i3 = 0;
                    }
                    c1823520xYM3.LLILLL = i3;
                }
                C1823520xYM c1823520xYM4 = c1822930xXP.LLILZIL;
                if (c1823520xYM4 != null) {
                    c1823520xYM4.LLILZIL.LIZIZ(interfaceC1822900xXM.LJFF(), null);
                }
                c1822930xXP.LLILZ.invalidateItemDecorations();
            }
            c1822930xXP.LLILZ.setItemAnimator(null);
            int itemDecorationCount = c1822930xXP.LLILZ.getItemDecorationCount();
            for (int i6 = 0; i6 < itemDecorationCount; i6++) {
                c1822930xXP.LLILZ.removeItemDecorationAt(i6);
            }
            c1822930xXP.LLILZ.addItemDecoration(new C0DXR() { // from class: X.0xXO
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    float fLIZIZ2;
                    float fLIZIZ3;
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    if (interfaceC1822900xXM.LJ() != null) {
                        if (childAdapterPosition > 0) {
                            if (C426750GoL.LJFF()) {
                                fLIZIZ2 = C418440Gaw.LIZIZ(0);
                            } else {
                                fLIZIZ2 = C418440Gaw.LIZIZ(8);
                            }
                            rect.left = C814420VxA.LIZIZ(fLIZIZ2);
                            if (C426750GoL.LJFF()) {
                                fLIZIZ3 = C418440Gaw.LIZIZ(8);
                            } else {
                                fLIZIZ3 = C418440Gaw.LIZIZ(0);
                            }
                            rect.right = C814420VxA.LIZIZ(fLIZIZ3);
                            return;
                        }
                        rect.left = 0;
                        rect.right = 0;
                        return;
                    }
                    if (childAdapterPosition > 0) {
                        rect.top = (int) C497740JfY.LIZIZ(8.0f);
                    } else {
                        rect.top = 0;
                    }
                }
            });
        }
        if (!z) {
            C426750GoL.LJIIL(c1822930xXP.LLILLL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), 16);
        }
        String key = interfaceC1822900xXM.getKey();
        switch (key.hashCode()) {
            case -1499838031:
                if (key.equals("direct_message")) {
                    LiveIconView liveIconView2 = c1822930xXP.LLILLL;
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a07, liveIconView2.getContext());
                    if (numLIZJ2 != null) {
                        iIntValue = numLIZJ2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    liveIconView2.setBackgroundTintList(ColorStateList.valueOf(iIntValue));
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1r, c1822930xXP.LLILLL.getContext());
                    if (numLIZJ3 != null) {
                        iIntValue6 = numLIZJ3.intValue();
                    }
                }
                break;
            case -1354571749:
                if (key.equals("course")) {
                    C426750GoL.LJIIL(c1822930xXP.LLILLL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), 16);
                    c1822930xXP.LLILLL.setBackgroundTintList(ColorStateList.valueOf(Color.argb(30, 117, 127, 234)));
                    iIntValue6 = Color.argb(255, 123, 132, 234);
                }
                break;
            case -1116288512:
                if (key.equals("fill_form")) {
                    LiveIconView liveIconView3 = c1822930xXP.LLILLL;
                    Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a0c, liveIconView3.getContext());
                    if (numLIZJ4 != null) {
                        iIntValue2 = numLIZJ4.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    liveIconView3.setBackgroundTintList(ColorStateList.valueOf(iIntValue2));
                    Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.mz, c1822930xXP.LLILLL.getContext());
                    if (numLIZJ5 != null) {
                        iIntValue6 = numLIZJ5.intValue();
                    }
                }
                break;
            case -262183029:
                if (key.equals("third_party_link")) {
                    LiveIconView liveIconView4 = c1822930xXP.LLILLL;
                    if (!z) {
                        Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.a0n, liveIconView4.getContext());
                        if (numLIZJ6 != null) {
                            iIntValue3 = numLIZJ6.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        colorStateListValueOf = ColorStateList.valueOf(iIntValue3);
                    }
                    liveIconView4.setBackgroundTintList(colorStateListValueOf);
                    Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.c9q, c1822930xXP.LLILLL.getContext());
                    if (numLIZJ7 != null) {
                        iIntValue6 = numLIZJ7.intValue();
                    }
                }
                break;
            case 1448769636:
                if (key.equals("booking_calendar")) {
                    LiveIconView liveIconView5 = c1822930xXP.LLILLL;
                    Integer numLIZJ8 = C1308910kAL.LIZJ(R.attr.a0n, liveIconView5.getContext());
                    if (numLIZJ8 != null) {
                        iIntValue4 = numLIZJ8.intValue();
                    } else {
                        iIntValue4 = 0;
                    }
                    liveIconView5.setBackgroundTintList(ColorStateList.valueOf(iIntValue4));
                    Integer numLIZJ9 = C1308910kAL.LIZJ(R.attr.c9q, c1822930xXP.LLILLL.getContext());
                    if (numLIZJ9 != null) {
                        iIntValue6 = numLIZJ9.intValue();
                    }
                }
                break;
        }
        if (z) {
            c1822930xXP.LLILLL.LJ();
        } else {
            c1822930xXP.LLILLL.setIconTint(iIntValue6);
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xXo
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                if (view != null) {
                    C1822910xXN c1822910xXN = this.LLILZ;
                    if (!c1822910xXN.LLILLJJLI) {
                        c1822910xXN.LLILZIL.LIZIZ(interfaceC1822900xXM);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, c1822930xXP.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLIZ;
        if (i != 0) {
            if (i != 1) {
                final View viewLJIILL = C500260Jjc.LJIILL(R.layout.gtx, viewGroup, false);
                viewHolderLIZ = new RecyclerView.ViewHolder(viewLJIILL) { // from class: X.0xY1
                };
            } else {
                C1822930xXP c1822930xXP = new C1822930xXP(C500260Jjc.LJIILL(R.layout.gtv, viewGroup, false));
                viewHolderLIZ = c1822930xXP;
                if (!this.LLILLJJLI) {
                    C2211631BhB.LJ(c1822930xXP.itemView, new C1823390xY9(c1822930xXP, this));
                    viewHolderLIZ = c1822930xXP;
                }
            }
        } else {
            viewHolderLIZ = C1822960xXS.LIZ(viewGroup, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, false, 2131856015, this.LLILZLL);
        }
        try {
            View view = viewHolderLIZ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolderLIZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLIZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLIZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLIZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLIZ.getClass().getName();
        return viewHolderLIZ;
    }

    public C1822910xXN(C13BV c13bv, boolean z, String str, String str2, C1822750xX7 c1822750xX7, C1822330xWR c1822330xWR, C1784880wY2 c1784880wY2, C1823400xYA c1823400xYA) {
        this.LL = c13bv;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c1822750xX7;
        this.LLILZLL = c1822330xWR;
        this.LLIZ = c1784880wY2;
        this.LLIZLLLIL = c1823400xYA;
    }
}
