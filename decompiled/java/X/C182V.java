package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingItem;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.182V, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C182V<T extends ViewGroup> extends C185J<T, C182Z> implements C182C {
    public final InterfaceC453990HrB<T> LIZLLL;
    public final C0HAN<T> LJ;
    public C0NOH LJFF;
    public C419140Gc4 LJI;
    public boolean LJII;
    public PromotionItem LJIIIIZZ;
    public final List<PromotionLabel> LJIIIZ;
    public SellingItem LJIIJ;
    public Map<String, String> LJIIJJI;
    public Map<String, ? extends Object> LJIIL;
    public boolean LJIILIIL;

    @Override // X.C182C
    public final void destroy() {
        C0NOH c0noh = this.LJFF;
        if (c0noh != null) {
            c0noh.LIZJ();
        }
    }

    public C182V(C18L9 c18l9, C419160Gc6 c419160Gc6, C428700GrU c428700GrU) {
        super(c18l9);
        this.LIZLLL = c419160Gc6;
        this.LJ = c428700GrU;
        this.LJIIIZ = new ArrayList();
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
    public final void LJIIJ(PromotionItem promotionItem, C182Z c182z, Integer num) {
        Long lLJIILIIL;
        String string;
        String endTime = promotionItem.getEndTime();
        if (endTime != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(endTime);
        } else {
            lLJIILIIL = null;
        }
        Integer type = promotionItem.getType();
        if (((type != null && 4 == type.intValue()) || C05IU.LIZ(promotionItem.getStyle())) && lLJIILIIL != null && lLJIILIIL.longValue() > 0) {
            Integer type2 = promotionItem.getType();
            if (type2 != null && 4 == type2.intValue()) {
                this.LJIILIIL = true;
            }
            long j = c182z.LIZIZ;
            long j2 = c182z.LIZJ;
            C0NOH c0noh = new C0NOH();
            C0NOI c0noiLIZIZ = C0NOL.LIZIZ(j, j2, promotionItem.getStartTime(), promotionItem.getEndTime());
            if (c0noiLIZIZ != null) {
                c0noh.LIZLLL(c0noiLIZIZ);
                if (c0noh.LIZIZ()) {
                    c0noh.LIZLLL(c0noiLIZIZ);
                    if (c0noh.LIZIZ()) {
                        c0noh.LIZ(new C182W(this, promotionItem, num));
                        C0NOH.LJ(c0noh);
                        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("count down first show state = ");
                        sbLIZ.append(c0noh.LIZJ);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c2341109Fh.getClass();
                        C2341109Fh.LJ(strLIZIZ);
                        LJIIJJI(c0noh.LIZJ, promotionItem, c0noh.LIZ, num);
                        Integer type3 = promotionItem.getType();
                        if (type3 != null && 4 == type3.intValue()) {
                            string = this.LIZJ.getResources().getString(2131836617);
                        } else {
                            string = "";
                        }
                        C419140Gc4 c419140Gc4 = this.LJI;
                        if (c419140Gc4 != null) {
                            String name = promotionItem.getName();
                            if (name != null) {
                                string = name;
                            }
                            c419140Gc4.setCountDowInfo(string);
                        }
                    } else {
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LJ("count down is out of time");
                    }
                } else {
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LJ("count down is out of time");
                }
            }
            this.LJFF = c0noh;
            return;
        }
        ((ViewGroup) this.LIZ).addView(this.LIZLLL.LIZ(this.LIZ, promotionItem, false), new ViewGroup.MarginLayoutParams(-2, -1));
        this.LJII = true;
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
    public final void LJIIJJI(int i, PromotionItem promotionItem, long j, Integer num) {
        C419140Gc4 c419140Gc4;
        int i2;
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        int i3;
        C419140Gc4 c419140Gc42;
        int iIntValue = 0;
        C1765700w36 c1765700w36 = null;
        if (2 == i) {
            if (this.LJI == null) {
                View viewLIZ = this.LIZLLL.LIZ(this.LIZ, promotionItem, true);
                if ((viewLIZ instanceof C419140Gc4) && (c419140Gc42 = (C419140Gc4) viewLIZ) != null) {
                    ((ViewGroup) this.LIZ).addView(c419140Gc42, new ViewGroup.MarginLayoutParams(-2, -1));
                } else {
                    c419140Gc42 = null;
                }
                this.LJI = c419140Gc42;
            }
            if (j <= 86400000 && (c419140Gc4 = this.LJI) != null) {
                if (c419140Gc4.LLILLL == null) {
                    C1765700w36 c1765700w362 = new C1765700w36(c419140Gc4.getContext(), null, 6);
                    c1765700w362.setTuxFont(c419140Gc4.LL);
                    c1765700w362.setTextColorRes(R.attr.eh);
                    c1765700w362.setMaxLines(1);
                    if (num != null) {
                        c1765700w362.LJJJJL(num.intValue(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), "23:59:59");
                    }
                    c419140Gc4.LLILLL = c1765700w362;
                    int iMeasureText = ((int) c1765700w362.getPaint().measureText("23:59:59")) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    C1765700w36 c1765700w363 = c419140Gc4.LLILLL;
                    if (c1765700w363 == null) {
                        c1765700w363 = null;
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMeasureText, -1);
                    layoutParams.setMarginStart(C679280Qkg.LIZ(4));
                    c419140Gc4.addView(c1765700w363, layoutParams);
                }
                if (j <= 86400000 && j >= 0) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                if (c419140Gc4.LLILZ != i2) {
                    c419140Gc4.LLILZ = i2;
                    C1765700w36 c1765700w364 = c419140Gc4.LLILLL;
                    if (c1765700w364 == null) {
                        c1765700w364 = null;
                    }
                    if (2 == i2) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    C786410Ut5.O(c1765700w364, i3);
                }
                C1765700w36 c1765700w365 = c419140Gc4.LLILLL;
                if (c1765700w365 != null) {
                    c1765700w36 = c1765700w365;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                }
                long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                long j3 = 60;
                long j4 = j2 / j3;
                long j5 = j4 / j3;
                long j6 = j2 % j3;
                long j7 = j4 % j3;
                long j8 = j5 % ((long) 24);
                StringBuilder sb = new StringBuilder();
                if (iIntValue != 1 || j8 > 0) {
                    if (j8 < 10) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('0');
                        sbLIZ.append(j8);
                        strValueOf = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        strValueOf = String.valueOf(j8);
                    }
                    sb.append(strValueOf);
                    sb.append(':');
                }
                if (j7 < 10) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('0');
                    sbLIZ2.append(j7);
                    strValueOf2 = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    strValueOf2 = String.valueOf(j7);
                }
                sb.append(strValueOf2);
                sb.append(':');
                if (j6 < 10) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append('0');
                    sbLIZ3.append(j6);
                    strValueOf3 = C2188811AlT.LIZIZ(sbLIZ3);
                } else {
                    strValueOf3 = String.valueOf(j6);
                }
                sb.append(strValueOf3);
                c1765700w36.setText(sb.toString());
            }
            this.LJII = true;
            return;
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("no need to show flash sale, currentState = ");
        sbLIZ4.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        C419140Gc4 c419140Gc43 = this.LJI;
        if (c419140Gc43 != null) {
            C786410Ut5.LJJJLZIJ(c419140Gc43, (ViewGroup) this.LIZ);
        }
        this.LJI = null;
        this.LJII = false;
    }
}
