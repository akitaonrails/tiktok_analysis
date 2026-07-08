package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS112S0101000_4;
import kotlin.jvm.internal.AwS131S0201000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DG9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DG9 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final InterfaceC336350DGn LL;
    public final List<AbstractC335160DBy> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C0DG9(CheckoutFragment checkoutFragment) {
        this.LL = checkoutFragment;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LLILLJJLI, i);
        if (obj instanceof C335130DBv) {
            return 0;
        }
        if (obj instanceof C335140DBw) {
            return 1;
        }
        if (obj instanceof C335120DBu) {
            return 2;
        }
        if (obj instanceof C335110DBt) {
            return 3;
        }
        if (obj instanceof C335150DBx) {
            return 4;
        }
        if (Intrinsics.LJFF(obj, C335170DBz.LIZ)) {
            return 5;
        }
        throw new C1954807lC();
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
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) throws Throwable {
        int i2;
        int i3;
        int iIntValue;
        int i4;
        boolean z;
        float dimension;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        int i8;
        int i9;
        int i10;
        String fullName;
        String formattedLine1;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String formattedLine2;
        String formattedLine12;
        String formattedLine22;
        C0DAU c0dau;
        AbstractC335160DBy abstractC335160DBy = (AbstractC335160DBy) ListProtector.get(this.LLILLJJLI, i);
        String str = "";
        CheckoutStoredUserAddress checkoutStoredUserAddress = null;
        int i16 = 0;
        int i17 = 0;
        z = false;
        z = false;
        z = false;
        boolean z4 = false;
        int i18 = 8;
        if (abstractC335160DBy instanceof C335130DBv) {
            C336270DGf c336270DGf = (C336270DGf) viewHolder;
            AbstractC334660DAa abstractC334660DAa = ((C335130DBv) abstractC335160DBy).LIZ;
            final InterfaceC336350DGn interfaceC336350DGn = this.LL;
            c336270DGf.getClass();
            boolean z5 = abstractC334660DAa instanceof C0DAU;
            if (z5 && (c0dau = (C0DAU) abstractC334660DAa) != null) {
                checkoutStoredUserAddress = c0dau.LIZ;
            }
            final boolean z6 = abstractC334660DAa instanceof C334850DAt;
            boolean z7 = abstractC334660DAa instanceof C334840DAs;
            TuxTextView tuxTextView = c336270DGf.LL.LLIZLLLIL;
            if (checkoutStoredUserAddress == null || (fullName = checkoutStoredUserAddress.getFullName()) == null) {
                fullName = "";
            }
            tuxTextView.setText(fullName);
            TuxTextView tuxTextView2 = c336270DGf.LL.LLJ;
            if (checkoutStoredUserAddress == null || (formattedLine1 = checkoutStoredUserAddress.getFormattedLine1()) == null) {
                formattedLine1 = "";
            }
            tuxTextView2.setText(formattedLine1);
            TuxTextView tuxTextView3 = c336270DGf.LL.LLJI;
            if (checkoutStoredUserAddress != null && (formattedLine22 = checkoutStoredUserAddress.getFormattedLine2()) != null) {
                str = formattedLine22;
            }
            tuxTextView3.setText(str);
            c336270DGf.LL.LLIZ.setText(C0D9L.LIZ(2131857460));
            LinearLayout linearLayout = c336270DGf.LL.LLJIJIL;
            if (z6) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            C786410Ut5.LJLLLLLL(i11, linearLayout);
            LinearLayout linearLayout2 = c336270DGf.LL.LLILLJJLI;
            if (z5) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            C786410Ut5.LJLLLLLL(i12, linearLayout2);
            TuxIconView tuxIconView = c336270DGf.LL.LLILZ;
            if (z5) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            C786410Ut5.LJLLLLLL(i13, tuxIconView);
            ConstraintLayout constraintLayout = c336270DGf.LL.LLILZIL;
            if (z7) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            C786410Ut5.LJLLLLLL(i14, constraintLayout);
            TuxTextView tuxTextView4 = c336270DGf.LL.LLJ;
            if (z5 && checkoutStoredUserAddress != null && (formattedLine12 = checkoutStoredUserAddress.getFormattedLine1()) != null && !a0.LJJJIL(formattedLine12)) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            C786410Ut5.LJLLLLLL(i15, tuxTextView4);
            TuxTextView tuxTextView5 = c336270DGf.LL.LLJI;
            if (!z5 || checkoutStoredUserAddress == null || (formattedLine2 = checkoutStoredUserAddress.getFormattedLine2()) == null || a0.LJJJIL(formattedLine2)) {
                i17 = 8;
            }
            C786410Ut5.LJLLLLLL(i17, tuxTextView5);
            C786410Ut5.Y7(c336270DGf.LL.LL, new View.OnClickListener() { // from class: X.0DGv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (!z6) {
                        interfaceC336350DGn.Pf();
                    }
                }
            });
            return;
        }
        if (abstractC335160DBy instanceof C335140DBw) {
            C336220DGa c336220DGa = (C336220DGa) viewHolder;
            C0DB8 c0db8 = ((C335140DBw) abstractC335160DBy).LIZ;
            c336220DGa.getClass();
            if (c0db8 instanceof C0DB6) {
                c336220DGa.LLILLJJLI.c3(c336220DGa.LL.LLILLL);
                C786410Ut5.LJLLLLLL(0, c336220DGa.LL.LLILZIL);
                C786410Ut5.LJLLLLLL(8, c336220DGa.LL.LLILZ);
                C786410Ut5.LJLLLLLL(8, c336220DGa.LL.LLILLL);
                return;
            }
            if (c0db8 instanceof C0DB9) {
                C786410Ut5.LJLLLLLL(8, c336220DGa.LL.LLILZIL);
                C786410Ut5.LJLLLLLL(0, c336220DGa.LL.LLILZ);
                C786410Ut5.LJLLLLLL(8, c336220DGa.LL.LLILLL);
                C0DB9 c0db9 = (C0DB9) c0db8;
                c336220DGa.LL.LLILZ.LIZ(c0db9.LIZ, c0db9.LIZIZ, new AwS548S0100000_4(c336220DGa, 87));
                return;
            }
            if (c0db8 instanceof C0DB7) {
                c336220DGa.LLILLJJLI.c3(c336220DGa.LL.LLILLL);
                C786410Ut5.LJLLLLLL(8, c336220DGa.LL.LLILZIL);
                C786410Ut5.LJLLLLLL(8, c336220DGa.LL.LLILZ);
                C786410Ut5.LJLLLLLL(0, c336220DGa.LL.LLILLL);
                return;
            }
            throw new C1954807lC();
        }
        if (abstractC335160DBy instanceof C335120DBu) {
            C336230DGb c336230DGb = (C336230DGb) viewHolder;
            C335120DBu c335120DBu = (C335120DBu) abstractC335160DBy;
            int i19 = c335120DBu.LIZ;
            C334410D9b c334410D9b = c335120DBu.LIZIZ;
            C0DAO c0dao = c335120DBu.LIZJ;
            try {
                dimension = c336230DGb.itemView.getResources().getDimension(R.dimen.b7);
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                dimension = 0.0f;
            }
            c336230DGb.LL.LLILZIL.setText(c334410D9b.orderTitle);
            c336230DGb.LL.LLJILJIL.setText(c334410D9b.title);
            c336230DGb.LL.LLJILJILJ.setText(c334410D9b.variantText);
            c336230DGb.LL.LLIZ.setText(c334410D9b.currentPriceText);
            TuxTextView tuxTextView6 = c336230DGb.LL.LLIZ;
            String str2 = c334410D9b.currentPriceText;
            if (str2 != null && !a0.LJJJIL(str2)) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            C786410Ut5.LJLLLLLL(i5, tuxTextView6);
            TuxTextView tuxTextView7 = c336230DGb.LL.LLILZLL;
            String str3 = c334410D9b.originalPriceText;
            if (str3 == null) {
                str3 = "";
            }
            tuxTextView7.setText(str3);
            TuxTextView tuxTextView8 = c336230DGb.LL.LLILZLL;
            String str4 = c334410D9b.originalPriceText;
            if (str4 != null && !a0.LJJJIL(str4)) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            C786410Ut5.LJLLLLLL(i6, tuxTextView8);
            TuxTextView tuxTextView9 = c336230DGb.LL.LLILZLL;
            tuxTextView9.setPaintFlags(tuxTextView9.getPaintFlags() | 16);
            TuxTextView tuxTextView10 = c336230DGb.LL.LLILLL;
            String str5 = c334410D9b.discountText;
            if (str5 != null) {
                str = str5;
            }
            tuxTextView10.setText(str);
            TuxTextView tuxTextView11 = c336230DGb.LL.LLILLL;
            String str6 = c334410D9b.discountText;
            if (str6 != null && !a0.LJJJIL(str6)) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            C786410Ut5.LJLLLLLL(i7, tuxTextView11);
            if (a0.LJJJIL(c334410D9b.imageUrl)) {
                C0DJY.LIZ(c336230DGb.LL.LLILZ);
            } else {
                c336230DGb.LL.LLILZ.setScaleType(ImageView.ScaleType.CENTER_CROP);
                C0D8X.LIZ().LIZ(c334410D9b.imageUrl, c336230DGb.LL.LLILZ, dimension, null);
            }
            String str7 = c334410D9b.shippingInfoText;
            if (str7 != null && !a0.LJJJIL(str7)) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z8 = !z2;
            String str8 = c334410D9b.estDeliveryText;
            if (str8 != null && !a0.LJJJIL(str8)) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z9 = !z3;
            LinearLayout linearLayout3 = c336230DGb.LL.LLIZLLLIL;
            if (!z8 && !z9) {
                i8 = 8;
            } else {
                i8 = 0;
            }
            C786410Ut5.LJLLLLLL(i8, linearLayout3);
            TuxTextView tuxTextView12 = c336230DGb.LL.LLJI;
            if (z8) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            C786410Ut5.LJLLLLLL(i9, tuxTextView12);
            TuxTextView tuxTextView13 = c336230DGb.LL.LLILLJJLI;
            if (z9) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            C786410Ut5.LJLLLLLL(i10, tuxTextView13);
            View view = c336230DGb.LL.LLJ;
            if (z8 && z9) {
                i18 = 0;
            }
            C786410Ut5.LJLLLLLL(i18, view);
            c336230DGb.LL.LLJI.setText(c334410D9b.shippingInfoText);
            c336230DGb.LL.LLILLJJLI.setText(c334410D9b.estDeliveryText);
            if (!(c0dao instanceof C334790DAn) && !(c0dao instanceof C0DB1) && !(c0dao instanceof C0DAI) && !(c0dao instanceof C334800DAo)) {
                z4 = true;
            }
            c336230DGb.LL.LLJIJIL.setQuantity(c334410D9b.quantity);
            c336230DGb.LL.LLJIJIL.setEnabled(z4);
            c336230DGb.LL.LLJIJIL.setInputEnabled(true);
            c336230DGb.LL.LLJIJIL.setOnQuantityChanged(null);
            c336230DGb.LL.LLJIJIL.setOnBeginInput(null);
            c336230DGb.LL.LLJIJIL.setOnCommitInput(new AwS112S0101000_4(c336230DGb, i19, 0));
            c336230DGb.LL.LLJIJIL.setOnCancelInput(null);
            c336230DGb.LL.LLJIJIL.setOnTapMinus(new AwS131S0201000_4(c336230DGb, i19, c334410D9b, 0));
            c336230DGb.LL.LLJIJIL.setOnTapPlus(new AwS131S0201000_4(c336230DGb, i19, c334410D9b, 1));
            return;
        }
        if (abstractC335160DBy instanceof C335110DBt) {
            C336260DGe c336260DGe = (C336260DGe) viewHolder;
            C334540D9o c334540D9o = ((C335110DBt) abstractC335160DBy).LIZ;
            c336260DGe.getClass();
            List<String> list = c334540D9o.tags;
            ArrayList arrayList = new ArrayList();
            for (String str9 : list) {
                if (!a0.LJJJIL(str9)) {
                    arrayList.add(str9);
                }
            }
            C786410Ut5.LJJJJJL(c336260DGe.LL.LLILLL);
            if (!arrayList.isEmpty()) {
                c336260DGe.LL.LLILLJJLI.setText(c334540D9o.summaryText);
                C786410Ut5.LJLLLLLL(0, c336260DGe.LL.LLILLL);
                int i20 = 0;
                for (Object obj : arrayList) {
                    int i21 = i20 + 1;
                    if (i20 >= 0) {
                        CharSequence charSequence = (String) obj;
                        C0DGK c0dgk = c336260DGe.LL;
                        LinearLayout linearLayout4 = c0dgk.LLILLL;
                        if (i20 > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Context context = c0dgk.LL.getContext();
                        TextView textView = (TextView) C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i3x, c336260DGe.LL.LLILLL, false);
                        textView.setText(charSequence);
                        textView.setMaxWidth(C497820Jfg.LIZIZ(context) - (C336380DGq.LIZ(context.getResources(), R.dimen.b39) * 2));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        if (z) {
                            layoutParams.topMargin = C336380DGq.LIZ(context.getResources(), R.dimen.b3_);
                        }
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textView);
                        textView.setLayoutParams(layoutParams);
                        linearLayout4.addView(textView);
                        i20 = i21;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                return;
            }
            c336260DGe.LL.LLILLJJLI.setText(C0D9L.LIZ(2131857487));
            C786410Ut5.LJLLLLLL(8, c336260DGe.LL.LLILLL);
            return;
        }
        if (abstractC335160DBy instanceof C335150DBx) {
            C336280DGg c336280DGg = (C336280DGg) viewHolder;
            C334520D9m c334520D9m = ((C335150DBx) abstractC335160DBy).LIZ;
            c336280DGg.getClass();
            boolean zIsEmpty = c334520D9m.rows.isEmpty();
            LinearLayout linearLayout5 = c336280DGg.LL.LL;
            boolean z10 = !zIsEmpty;
            if (z10) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, linearLayout5);
            LinearLayout linearLayout6 = c336280DGg.LL.LLILLJJLI;
            if (z10) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, linearLayout6);
            C786410Ut5.LJLLLLLL(8, c336280DGg.LL.LLILLL);
            LinearLayout linearLayout7 = c336280DGg.LL.LLILZIL;
            if (!z10) {
                i16 = 8;
            }
            C786410Ut5.LJLLLLLL(i16, linearLayout7);
            C786410Ut5.LJLLLLLL(8, c336280DGg.LL.LLILZLL);
            C786410Ut5.LJJJJJL(c336280DGg.LL.LLILLJJLI);
            if (zIsEmpty) {
                c336280DGg.LL.LLIZ.setText(c334520D9m.totalAmount.formatted());
                return;
            }
            for (C334600D9u c334600D9u : c334520D9m.rows) {
                C0DGM c0dgmLIZ = C0DGM.LIZ(C786410Ut5.ne(c336280DGg.LL.LL.getContext()), c336280DGg.LL.LLILLJJLI);
                c0dgmLIZ.LLILLL.setText(c334600D9u.title);
                c0dgmLIZ.LLILLJJLI.setText(c334600D9u.amountText);
                Context context2 = c336280DGg.LL.LL.getContext();
                if (c334600D9u.isEmphasized()) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context2);
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = -15329245;
                    }
                } else {
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, context2);
                    if (numLIZJ2 != null) {
                        iIntValue = numLIZJ2.intValue();
                    } else {
                        iIntValue = -8158333;
                    }
                }
                if (c334600D9u.isEmphasized()) {
                    i4 = 52;
                } else {
                    i4 = 51;
                }
                c0dgmLIZ.LLILLL.setTuxFont(i4);
                c0dgmLIZ.LLILLJJLI.setTuxFont(i4);
                c0dgmLIZ.LLILLL.setTextColor(iIntValue);
                c0dgmLIZ.LLILLJJLI.setTextColor(iIntValue);
                c336280DGg.LL.LLILLJJLI.addView(c0dgmLIZ.LL);
            }
            c336280DGg.LL.LLIZ.setText(c334520D9m.totalAmount.formatted());
            return;
        }
        if (Intrinsics.LJFF(abstractC335160DBy, C335170DBz.LIZ)) {
            C336250DGd c336250DGd = (C336250DGd) viewHolder;
            c336250DGd.LL.LLIZLLLIL.setText(C0D9L.LIZ(2131857464));
            c336250DGd.LL.LLILZIL.setText(C0D9L.LIZ(2131857468));
            c336250DGd.LL.LLILZ.setText(C0D9L.LIZ(2131857467));
            c336250DGd.LL.LLILLL.setText(C0D9L.LIZ(2131857470));
            c336250DGd.LL.LLILLJJLI.setText(C0D9L.LIZ(2131857465));
            c336250DGd.LL.LLIZ.setText(C0D9L.LIZ(2131857466));
            c336250DGd.LL.LLILZLL.setText(C0D9L.LIZ(2131857469));
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c336270DGf;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.i3v, viewGroup, false);
                            LinearLayout linearLayout = (LinearLayout) viewTd;
                            int i2 = R.id.l1_;
                            if (C1616006Uk.LIZ(R.id.l1_, viewTd) != null) {
                                i2 = R.id.l3p;
                                if (C1616006Uk.LIZ(R.id.l3p, viewTd) != null) {
                                    i2 = R.id.l3y;
                                    if (C1616006Uk.LIZ(R.id.l3y, viewTd) != null) {
                                        i2 = R.id.lv2;
                                        if (C1616006Uk.LIZ(R.id.lv2, viewTd) != null) {
                                            i2 = R.id.lv8;
                                            if (C1616006Uk.LIZ(R.id.lv8, viewTd) != null) {
                                                i2 = R.id.lwl;
                                                if (C1616006Uk.LIZ(R.id.lwl, viewTd) != null) {
                                                    i2 = R.id.tv_shopping_subtitle;
                                                    TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.tv_shopping_subtitle, viewTd);
                                                    if (tuxTextView != null) {
                                                        i2 = R.id.tv_shopping_title;
                                                        TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.tv_shopping_title, viewTd);
                                                        if (tuxTextView2 != null) {
                                                            i2 = R.id.tv_sold_subtitle;
                                                            TuxTextView tuxTextView3 = (TuxTextView) C1616006Uk.LIZ(R.id.tv_sold_subtitle, viewTd);
                                                            if (tuxTextView3 != null) {
                                                                i2 = R.id.tv_sold_title;
                                                                TuxTextView tuxTextView4 = (TuxTextView) C1616006Uk.LIZ(R.id.tv_sold_title, viewTd);
                                                                if (tuxTextView4 != null) {
                                                                    i2 = R.id.tv_support_subtitle;
                                                                    TuxTextView tuxTextView5 = (TuxTextView) C1616006Uk.LIZ(R.id.tv_support_subtitle, viewTd);
                                                                    if (tuxTextView5 != null) {
                                                                        i2 = R.id.tv_support_title;
                                                                        TuxTextView tuxTextView6 = (TuxTextView) C1616006Uk.LIZ(R.id.tv_support_title, viewTd);
                                                                        if (tuxTextView6 != null) {
                                                                            i2 = R.id.tv_title;
                                                                            TuxTextView tuxTextView7 = (TuxTextView) C1616006Uk.LIZ(R.id.tv_title, viewTd);
                                                                            if (tuxTextView7 != null) {
                                                                                c336270DGf = new C336250DGd(new C0DGX(linearLayout, tuxTextView, tuxTextView2, tuxTextView3, tuxTextView4, tuxTextView5, tuxTextView6, tuxTextView7));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i2)));
                        }
                        c336270DGf = new C336280DGg(C0DGJ.LIZ(layoutInflaterNe, viewGroup));
                    } else {
                        c336270DGf = new C336260DGe(C0DGK.LIZ(layoutInflaterNe, viewGroup));
                    }
                } else {
                    View viewTd2 = C786410Ut5.Td(layoutInflaterNe, R.layout.i41, viewGroup, false);
                    int i3 = R.id.ucp_checkout_product_content;
                    if (C1616006Uk.LIZ(R.id.ucp_checkout_product_content, viewTd2) != null) {
                        i3 = R.id.ucp_checkout_product_delivery_text;
                        TuxTextView tuxTextView8 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_product_delivery_text, viewTd2);
                        if (tuxTextView8 != null) {
                            i3 = R.id.ucp_checkout_product_discount;
                            TuxTextView tuxTextView9 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_product_discount, viewTd2);
                            if (tuxTextView9 != null) {
                                i3 = R.id.ucp_checkout_product_image;
                                ImageView imageView = (ImageView) C1616006Uk.LIZ(R.id.ucp_checkout_product_image, viewTd2);
                                if (imageView != null) {
                                    i3 = R.id.ucp_checkout_product_order_title;
                                    TuxTextView tuxTextView10 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_product_order_title, viewTd2);
                                    if (tuxTextView10 != null) {
                                        i3 = R.id.ucp_checkout_product_original_price;
                                        TuxTextView tuxTextView11 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_product_original_price, viewTd2);
                                        if (tuxTextView11 != null) {
                                            i3 = R.id.ucp_checkout_product_price;
                                            TuxTextView tuxTextView12 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_product_price, viewTd2);
                                            if (tuxTextView12 != null) {
                                                i3 = R.id.ucp_checkout_product_price_group;
                                                if (C1616006Uk.LIZ(R.id.ucp_checkout_product_price_group, viewTd2) != null) {
                                                    i3 = R.id.ucp_checkout_product_shipping_chip;
                                                    LinearLayout linearLayout2 = (LinearLayout) C1616006Uk.LIZ(R.id.ucp_checkout_product_shipping_chip, viewTd2);
                                                    if (linearLayout2 != null) {
                                                        i3 = R.id.ucp_checkout_product_shipping_divider;
                                                        View viewLIZ = C1616006Uk.LIZ(R.id.ucp_checkout_product_shipping_divider, viewTd2);
                                                        if (viewLIZ != null) {
                                                            i3 = R.id.ucp_checkout_product_shipping_text;
                                                            TuxTextView tuxTextView13 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_product_shipping_text, viewTd2);
                                                            if (tuxTextView13 != null) {
                                                                i3 = R.id.ucp_checkout_product_stepper;
                                                                C11BJ c11bj = (C11BJ) C1616006Uk.LIZ(R.id.ucp_checkout_product_stepper, viewTd2);
                                                                if (c11bj != null) {
                                                                    i3 = R.id.ucp_checkout_product_title;
                                                                    TuxTextView tuxTextView14 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_product_title, viewTd2);
                                                                    if (tuxTextView14 != null) {
                                                                        i3 = R.id.ucp_checkout_product_variant;
                                                                        TuxTextView tuxTextView15 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_product_variant, viewTd2);
                                                                        if (tuxTextView15 != null) {
                                                                            i3 = R.id.ucp_demo_view;
                                                                            View viewLIZ2 = C1616006Uk.LIZ(R.id.ucp_demo_view, viewTd2);
                                                                            if (viewLIZ2 != null) {
                                                                                c336270DGf = new C336230DGb(new C0DGP((ConstraintLayout) viewTd2, tuxTextView8, tuxTextView9, imageView, tuxTextView10, tuxTextView11, tuxTextView12, linearLayout2, viewLIZ, tuxTextView13, c11bj, tuxTextView14, tuxTextView15, viewLIZ2), this.LL);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewTd2.getResources().getResourceName(i3)));
                }
            } else {
                View viewTd3 = C786410Ut5.Td(layoutInflaterNe, R.layout.i40, viewGroup, false);
                int i4 = R.id.ucp_checkout_payment_bottom_divider;
                View viewLIZ3 = C1616006Uk.LIZ(R.id.ucp_checkout_payment_bottom_divider, viewTd3);
                if (viewLIZ3 != null) {
                    i4 = R.id.ucp_checkout_payment_cashier_container;
                    FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.ucp_checkout_payment_cashier_container, viewTd3);
                    if (frameLayout != null) {
                        i4 = R.id.ucp_checkout_payment_content;
                        if (C1616006Uk.LIZ(R.id.ucp_checkout_payment_content, viewTd3) != null) {
                            i4 = R.id.ucp_checkout_payment_error_view;
                            C336440DGw c336440DGw = (C336440DGw) C1616006Uk.LIZ(R.id.ucp_checkout_payment_error_view, viewTd3);
                            if (c336440DGw != null) {
                                i4 = R.id.ucp_checkout_payment_loading_container;
                                LinearLayout linearLayout3 = (LinearLayout) C1616006Uk.LIZ(R.id.ucp_checkout_payment_loading_container, viewTd3);
                                if (linearLayout3 != null) {
                                    i4 = R.id.ucp_checkout_payment_subtitle;
                                    if (C1616006Uk.LIZ(R.id.ucp_checkout_payment_subtitle, viewTd3) != null) {
                                        i4 = R.id.ucp_checkout_payment_title;
                                        if (C1616006Uk.LIZ(R.id.ucp_checkout_payment_title, viewTd3) != null) {
                                            c336270DGf = new C336220DGa(new C336240DGc((ConstraintLayout) viewTd3, viewLIZ3, frameLayout, c336440DGw, linearLayout3), this.LL);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewTd3.getResources().getResourceName(i4)));
            }
        } else {
            View viewTd4 = C786410Ut5.Td(layoutInflaterNe, R.layout.i42, viewGroup, false);
            int i5 = R.id.ucp_checkout_address_block;
            LinearLayout linearLayout4 = (LinearLayout) C1616006Uk.LIZ(R.id.ucp_checkout_address_block, viewTd4);
            if (linearLayout4 != null) {
                i5 = R.id.ucp_checkout_address_bottom_spacer;
                View viewLIZ4 = C1616006Uk.LIZ(R.id.ucp_checkout_address_bottom_spacer, viewTd4);
                if (viewLIZ4 != null) {
                    i5 = R.id.ucp_checkout_address_chevron;
                    TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.ucp_checkout_address_chevron, viewTd4);
                    if (tuxIconView != null) {
                        i5 = R.id.ucp_checkout_address_content_bottom;
                        if (C1616006Uk.LIZ(R.id.ucp_checkout_address_content_bottom, viewTd4) != null) {
                            i5 = R.id.ucp_checkout_address_empty_chevron;
                            if (C1616006Uk.LIZ(R.id.ucp_checkout_address_empty_chevron, viewTd4) != null) {
                                i5 = R.id.ucp_checkout_address_empty_container;
                                ConstraintLayout constraintLayout = (ConstraintLayout) C1616006Uk.LIZ(R.id.ucp_checkout_address_empty_container, viewTd4);
                                if (constraintLayout != null) {
                                    i5 = R.id.ucp_checkout_address_empty_dot;
                                    View viewLIZ5 = C1616006Uk.LIZ(R.id.ucp_checkout_address_empty_dot, viewTd4);
                                    if (viewLIZ5 != null) {
                                        i5 = R.id.ucp_checkout_address_empty_text;
                                        TuxTextView tuxTextView16 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_address_empty_text, viewTd4);
                                        if (tuxTextView16 != null) {
                                            i5 = R.id.ucp_checkout_address_line1;
                                            TuxTextView tuxTextView17 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_address_line1, viewTd4);
                                            if (tuxTextView17 != null) {
                                                i5 = R.id.ucp_checkout_address_line2;
                                                TuxTextView tuxTextView18 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_address_line2, viewTd4);
                                                if (tuxTextView18 != null) {
                                                    i5 = R.id.ucp_checkout_address_line3;
                                                    TuxTextView tuxTextView19 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_address_line3, viewTd4);
                                                    if (tuxTextView19 != null) {
                                                        i5 = R.id.ucp_checkout_address_loading_container;
                                                        LinearLayout linearLayout5 = (LinearLayout) C1616006Uk.LIZ(R.id.ucp_checkout_address_loading_container, viewTd4);
                                                        if (linearLayout5 != null) {
                                                            i5 = R.id.ucp_checkout_address_title;
                                                            if (C1616006Uk.LIZ(R.id.ucp_checkout_address_title, viewTd4) != null) {
                                                                c336270DGf = new C336270DGf(new C0DGS((ConstraintLayout) viewTd4, linearLayout4, viewLIZ4, tuxIconView, constraintLayout, viewLIZ5, tuxTextView16, tuxTextView17, tuxTextView18, tuxTextView19, linearLayout5));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewTd4.getResources().getResourceName(i5)));
        }
        try {
            View view = c336270DGf.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c336270DGf.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c336270DGf.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c336270DGf.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c336270DGf.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c336270DGf.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c336270DGf.getClass().getName();
        return c336270DGf;
    }
}
