package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.LabelCountdown;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.PinCardRefactorSettings;
import defpackage.d6;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS493S0200000_32;

/* JADX INFO: renamed from: X.184W, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C184W extends AbstractC212196182g<C18L9> {
    public C184W(C18L9 c18l9) {
        super("promotion_items", c18l9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.184Y] */
    public final void LJIIZILJ(C212244184c c212244184c) {
        long jLongValue;
        long jLongValue2;
        Integer num;
        Object obj;
        InterfaceC212245184d<T> interfaceC212245184d;
        C0NOH c0noh;
        String str;
        Long lLJIILIIL;
        String str2;
        Long lLJIILIIL2;
        C0NOH c0noh2;
        C184X<ViewGroup> c184x = this.LJII;
        if (c184x != null && (c0noh2 = c184x.LJIIIZ) != null) {
            c0noh2.LIZJ();
        }
        this.LJII = null;
        C786410Ut5.LJJJJI((ViewGroup) this.LIZ);
        ((LinkedHashMap) this.LJFF).clear();
        boolean z = true;
        this.LJIIIZ = true;
        this.LJ = false;
        if (!PinCardRefactorSettings.LIZ().promotionEnable) {
            LJIIJ(false);
            return;
        }
        int i = c212244184c.LIZLLL;
        if (i > 0) {
            ((C18L9) this.LIZ).setMaxTagCount(i);
        }
        List<PromotionLabel> list = c212244184c.LIZ;
        if (!list.isEmpty()) {
            int i2 = 0;
            for (PromotionLabel promotionLabel : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    PromotionLabel promotionLabel2 = promotionLabel;
                    if (promotionLabel2.type == 8) {
                        this.LJ = z;
                    }
                    long j = c212244184c.LIZIZ;
                    long j2 = c212244184c.LIZJ;
                    boolean z2 = c212244184c.LJ;
                    LabelCountdown labelCountdown = promotionLabel2.countdown;
                    if (labelCountdown != null && (str2 = labelCountdown.startTime) != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str2)) != null) {
                        jLongValue = lLJIILIIL2.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    LabelCountdown labelCountdown2 = promotionLabel2.countdown;
                    if (labelCountdown2 != null && (str = labelCountdown2.endTime) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                        jLongValue2 = lLJIILIIL.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    if ((4 == promotionLabel2.type || C05IU.LIZ(promotionLabel2.defaultStyle)) && jLongValue > 0 && jLongValue2 > 0) {
                        C0NOI c0noiLIZ = C0NOL.LIZ(jLongValue, jLongValue2, j, j2);
                        if (c0noiLIZ != null) {
                            C184X<ViewGroup> c184x2 = this.LJII;
                            if (c184x2 != null && (c0noh = c184x2.LJIIIZ) != null) {
                                c0noh.LIZJ();
                            }
                            ViewGroup viewGroup = (ViewGroup) this.LIZ;
                            C184X<ViewGroup> c184x3 = new C184X<>(viewGroup, z2, new InterfaceC212245184d<ViewGroup>(this) { // from class: X.184Y
                                public final /* synthetic */ AbstractC212196182g<ViewGroup> LIZ;

                                @Override // X.InterfaceC212245184d
                                public final void LIZ() {
                                    AbstractC212196182g<ViewGroup> abstractC212196182g = this.LIZ;
                                    abstractC212196182g.LJIIJ(((ViewGroup) abstractC212196182g.LIZ).getChildCount() > 0);
                                }

                                {
                                    this.LIZ = this;
                                }
                            });
                            Object objLIZ = C7726030a.LIZ(EnumC1981207pS.FLASH_SALE, this.LJI);
                            STYLE c1916707f3 = objLIZ;
                            if (objLIZ == null) {
                                c1916707f3 = new C1916707f3();
                            }
                            c184x3.LJI = c1916707f3;
                            c184x3.LJ = C184X.LJIILIIL(c1916707f3);
                            C212246184e c212246184e = new C212246184e(promotionLabel2, c0noiLIZ);
                            C0NOH c0noh3 = c184x3.LJIIIZ;
                            if (c0noh3 != null) {
                                c0noh3.LIZJ();
                            }
                            C212334187o c212334187o = c184x3.LJIIJ;
                            if (c212334187o != null) {
                                C786410Ut5.LJJJLZIJ(c212334187o, viewGroup);
                            }
                            c184x3.LJIIJ = null;
                            if (c184x3.LJIIL && (interfaceC212245184d = c184x3.LJIIIIZZ) != 0) {
                                interfaceC212245184d.LIZ();
                            }
                            c184x3.LJIIL = false;
                            c184x3.LJIIJJI = Integer.valueOf(promotionLabel2.type);
                            Map<String, Object> map = promotionLabel2.daInfo;
                            if (map != null && (obj = map.get("activity_name")) != null) {
                                obj.toString();
                            }
                            if (!c184x3.LJII && C212258184q.LJ(promotionLabel2)) {
                                if (c184x3.LJIIJ == null) {
                                    C212334187o c212334187oLJIIIIZZ = c184x3.LJIIL().LJIIIIZZ(c184x3.LIZLLL, promotionLabel2);
                                    viewGroup.addView(c212334187oLJIIIIZZ);
                                    c184x3.LJIIJ = c212334187oLJIIIIZZ;
                                    if (c212334187oLJIIIIZZ != null) {
                                        LabelCountdown labelCountdown3 = promotionLabel2.countdown;
                                        if (labelCountdown3 != null) {
                                            num = labelCountdown3.showStyle;
                                        } else {
                                            num = null;
                                        }
                                        c212334187oLJIIIIZZ.setCountDownShowStyle(num);
                                    }
                                }
                            } else {
                                C0NOH c0noh4 = new C0NOH();
                                c0noh4.LIZLLL(c0noiLIZ);
                                if (c0noh4.LIZIZ()) {
                                    c0noh4.LIZ(new AwS493S0200000_32((C184X) c184x3, (C184X<ViewGroup>) c212246184e, (C212246184e) 3));
                                    C0NOH.LJ(c0noh4);
                                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Type[");
                                    sbLIZ.append(c184x3.LJIIJJI);
                                    sbLIZ.append("] first show state = ");
                                    sbLIZ.append(c0noh4.LIZJ);
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    c2341109Fh.getClass();
                                    C2341109Fh.LJ(strLIZIZ);
                                    c184x3.LJIILJJIL(c0noh4.LIZJ, promotionLabel2, c0noh4.LIZ);
                                } else {
                                    C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("Type[");
                                    sbLIZ2.append(c184x3.LJIIJJI);
                                    sbLIZ2.append("] is out of time");
                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                    c2341109Fh2.getClass();
                                    C2341109Fh.LJ(strLIZIZ2);
                                }
                                c184x3.LJIIIZ = c0noh4;
                            }
                            this.LJII = c184x3;
                        }
                    } else {
                        int i4 = promotionLabel2.type;
                        if (i4 == 8) {
                            this.LJ = true;
                        }
                        Context context = this.LIZLLL;
                        C212337187r c212337187rLIZ = C18QY.LIZ(promotionLabel2, context, d6.LIZ(i4));
                        C212336187q c212336187q = new C212336187q(context, null, 0);
                        c212336187q.LIZJ(c212337187rLIZ);
                        this.LJFF.put(promotionLabel2, c212336187q);
                        ((ViewGroup) this.LIZ).addView(c212336187q);
                    }
                    z = true;
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (((ViewGroup) this.LIZ).getChildCount() <= 0) {
                z = false;
            }
            LJIIJ(z);
            return;
        }
        LJIIJ(false);
    }

    public C184W(C18L9 c18l9, String str) {
        super(str, c18l9);
    }
}
