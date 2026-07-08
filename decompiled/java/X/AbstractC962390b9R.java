package X;

import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.interact.model.QuickCohostContent;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostAllowQuickInviteWithManualInviteSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import wh6.AbS696S0100000_15;

/* JADX INFO: renamed from: X.0b9R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC962390b9R<D> extends AbstractC960400b6E<D> implements InterfaceC962360b9O {
    public final LifecycleOwner LLILZ;
    public final AbstractC960950b77 LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final View LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public String LLJJJJ;
    public final String LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;

    @Override // X.AbstractC960400b6E
    public void LLIILZL() {
        this.LL = false;
        X5();
    }

    public void b6(D d) {
    }

    @Override // X.InterfaceC962360b9O
    public final View LJJIZ() {
        return (View) this.LLJI.getValue();
    }

    @Override // X.InterfaceC962360b9O
    public final C16F5 LLLFFI() {
        return (C16F5) this.LLIZLLLIL.getValue();
    }

    public final C16F5 R5() {
        C16F5 c16f5 = new C16F5(this.itemView.getContext(), null);
        c16f5.LJJJI(R.style.a9i);
        c16f5.setTextColor(C497740JfY.LIZLLL(R.attr.ezq, this.itemView.getContext()));
        c16f5.setTextSize(0, C418440Gaw.LIZIZ(12));
        c16f5.setSingleLine();
        c16f5.setBackgroundResource(R.drawable.e5_);
        c16f5.setIncludeFontPadding(false);
        c16f5.setPadding(C439101nJ.LIZ(6), 0, C439101nJ.LIZ(6), 0);
        c16f5.setGravity(17);
        return c16f5;
    }

    public final C16F5 S5() {
        return (C16F5) this.LLIZ.getValue();
    }

    public final View T5() {
        return (View) this.LLJJIJI.getValue();
    }

    public final C1099610eil U5() {
        return (C1099610eil) this.LLJIJIL.getValue();
    }

    public final View V5() {
        return (View) this.LLJJJ.getValue();
    }

    public final View W5() {
        return (View) this.LLJJIII.getValue();
    }

    public final void X5() {
        C500260Jjc.LJIILIIL((View) this.LLJJI.getValue());
        C500260Jjc.LJIILIIL(W5());
        C500260Jjc.LJIILIIL(T5());
        C500260Jjc.LJIILIIL(V5());
    }

    @Override // X.InterfaceC962360b9O
    public final LiveIconView b2() {
        return (LiveIconView) this.LLJILJILJ.getValue();
    }

    @Override // X.InterfaceC962360b9O
    public final C16FS d0() {
        return (C16FS) this.LLJ.getValue();
    }

    @Override // X.InterfaceC962360b9O
    public final C16F5 x1() {
        return (C16F5) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC962360b9O
    public final C16F5 LLJL() {
        return S5();
    }

    @Override // X.InterfaceC962360b9O
    public final View LLLLIIL() {
        return this.LLJILLL;
    }

    public final void a6(C962370b9P c962370b9P) {
        Boolean boolValueOf;
        boolean z;
        Object obj;
        String str;
        C956250azX c956250azX = new C956250azX(c962370b9P.getClass(), 0L);
        if (!c962370b9P.LIZ) {
            AbstractC960950b77 abstractC960950b77 = this.LLILZIL;
            if (abstractC960950b77 != null) {
                boolValueOf = Boolean.valueOf(abstractC960950b77.LJIILIIL(c956250azX));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                c962370b9P.LIZ = true;
                AbstractC960950b77 abstractC960950b772 = this.LLILZIL;
                if (abstractC960950b772 != null) {
                    abstractC960950b772.LJJ(c956250azX);
                }
                C955400ayA c955400ayA = C955400ayA.LIZ;
                if (c962370b9P.LJ.isMatchValid && !C915980Zwa.LJII().LJJLIIIJJI()) {
                    z = true;
                } else {
                    z = false;
                }
                String type = C950220apo.LJII(false).getType();
                boolean z2 = !c962370b9P.LJFF;
                String str2 = this.LLJJJJ;
                String strLJJLIIIJ = C13LP.LJJLIIIJ(C960270b61.LIZ(), null, null, null, 0, null, AFwS250S0000000_15.get$arr$(90), 31);
                HashMap map = new HashMap();
                map.put("invitee_list", "random_match");
                map.put("connection_type", "anchor");
                map.put("core_connection_type", C915980Zwa.LIZLLL().oE2());
                String str3 = CardStruct.IStatusCode.DEFAULT;
                map.put("invitee_id", CardStruct.IStatusCode.DEFAULT);
                if (z) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_clickable", obj);
                map.put("click_time", type);
                map.put("connection_inviter_id", String.valueOf(C950220apo.LJFF()));
                map.put("connection_invitee_id", CardStruct.IStatusCode.DEFAULT);
                map.put("is_shared_screen", CardStruct.IStatusCode.DEFAULT);
                if (C915980Zwa.LJIIIZ().Jf()) {
                    map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "withdraw");
                } else {
                    map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "invite");
                }
                if (z2) {
                    str = "big_card";
                } else {
                    str = "small_card";
                }
                map.put("card_style", str);
                map.put("detailed_card_tag_style", str2);
                if (C1533950q1J.LJ(strLJJLIIIJ)) {
                    str3 = "1";
                }
                map.put("is_tag", str3);
                map.put("interest_tag", strLJJLIIIJ);
                if (C915980Zwa.LJI().LJIIJ().LIZ()) {
                    map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
                }
                C955400ayA.LJIILL(map, null);
                C955400ayA.LJIIL(c955400ayA, map, null, true, 10);
                C955400ayA.LJIIJ(map, true);
                map.put("linker_mode", String.valueOf(C915980Zwa.LJII().Uh()));
                C973690bRf.LJ(map, null, false);
                C955520ayM.LIZJ(map, null, null);
                C927870aFl.LIZ(C915980Zwa.LJI().LIZ().LLILLL(), map);
                C955400ayA.LLIILII("livesdk_connection_invite_show", map);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c6(boolean r3) {
        /*
            r2 = this;
            X.16FS r0 = r2.d0()
            r1 = 1
            if (r0 == 0) goto L3a
            boolean r0 = r0.isEnabled()
            if (r0 != r1) goto L3a
            boolean r0 = X.C949960apO.LIZ()
            if (r0 == 0) goto L3a
            X.0JT6<java.lang.Boolean> r0 = X.InterfaceC1104970erP.D2
            java.lang.Object r0 = r0.LIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L5e
            java.util.List r0 = X.C960270b61.LIZ()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L61
            if (r3 == 0) goto L5b
            boolean r0 = X.C962420b9U.LIZ()
            if (r0 == 0) goto L5b
            java.lang.String r0 = "normal"
        L37:
            r2.LLJJJJ = r0
            return
        L3a:
            android.view.View r0 = r2.T5()
            boolean r0 = X.C500260Jjc.LJJJJIZL(r0)
            if (r0 != 0) goto L61
            android.view.View r0 = r2.W5()
            boolean r0 = X.C500260Jjc.LJJJJIZL(r0)
            if (r0 == 0) goto L51
            java.lang.String r0 = "normal_tag"
            goto L37
        L51:
            android.view.View r0 = r2.V5()
            boolean r0 = X.C500260Jjc.LJJJJIZL(r0)
            if (r0 == 0) goto L5e
        L5b:
            java.lang.String r0 = "simplified_tag"
            goto L37
        L5e:
            java.lang.String r0 = "no_tag"
            goto L37
        L61:
            java.lang.String r0 = "after_selection"
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC962390b9R.c6(boolean):void");
    }

    public final void N5(List<QuickCohostContent> list, boolean z) {
        Integer numValueOf;
        float f;
        QuickCohostContent next;
        String str;
        String str2;
        int iLIZIZ;
        int iLIZ;
        QuickCohostContent next2;
        String str3;
        String str4;
        if (C500260Jjc.LJJJJIZL(T5())) {
            return;
        }
        C500260Jjc.LJIILIIL((View) this.LLJJI.getValue());
        C500260Jjc.LJIILIIL(W5());
        C500260Jjc.LJIILIIL(V5());
        View viewT5 = T5();
        if (viewT5 != null) {
            numValueOf = Integer.valueOf(viewT5.getVisibility());
        } else {
            numValueOf = null;
        }
        if (C949960apO.LIZ()) {
            if (z) {
                C500260Jjc.LJIILLIIL(T5());
            } else {
                return;
            }
        } else {
            InterfaceC1104970erP.E2.LIZJ(Double.valueOf(3.0d));
            C500260Jjc.LLFFF(T5());
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            return;
        }
        ImageView imageView = (ImageView) this.LLJJIJIL.getValue();
        if (imageView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C439101nJ.LIZ(12);
            c419910GdJ.LIZJ = C439101nJ.LIZ(12);
            c419910GdJ.LIZ = R.raw.icon_pen_on_paper;
            imageView.setImageDrawable(c419910GdJ.LIZ(this.itemView.getContext()));
        }
        C962400b9S c962400b9S = new C962400b9S(true, this, list, z, "after_selection");
        View viewT52 = T5();
        if (viewT52 != null) {
            C786410Ut5.I7(new AbS696S0100000_15(c962400b9S, 2), viewT52);
        }
        LinearLayout linearLayout = (LinearLayout) this.LLJJIJIIJIL.getValue();
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        List listLIZ = C960270b61.LIZ();
        C16F5 c16f5R5 = R5();
        TextPaint paint = c16f5R5.getPaint();
        if (listLIZ.size() > 1 && paint != null) {
            if (z) {
                iLIZIZ = (((C465640INu.LIZIZ(this.itemView.getContext()) - (C439101nJ.LIZ(16) * 2)) - C439101nJ.LIZ(6)) - (C439101nJ.LIZ(16) * 2)) - C439101nJ.LIZ(62);
                iLIZ = C439101nJ.LIZ(20);
            } else {
                iLIZIZ = (C465640INu.LIZIZ(this.itemView.getContext()) - (C439101nJ.LIZ(16) * 2)) - (C439101nJ.LIZ(16) * 2);
                iLIZ = C439101nJ.LIZ(20);
            }
            int i = iLIZIZ - iLIZ;
            try {
                float fLIZ = C439101nJ.LIZ(6) * 2;
                float fLIZ2 = C439101nJ.LIZ(4);
                float fMeasureText = paint.measureText("...") + fLIZ + fLIZ2;
                String name = getName();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("measureMaxShowCount isLargeCard:");
                sbLIZ.append(z);
                sbLIZ.append(", listViewMaxWidth:");
                sbLIZ.append(i);
                sbLIZ.append(", itemMinWidth:");
                sbLIZ.append(fMeasureText);
                C20441214yg.LIZIZ(name, C2188811AlT.LIZIZ(sbLIZ));
                Iterator it2 = listLIZ.iterator();
                float f2 = 0.0f;
                int i2 = 1;
                while (it2.hasNext()) {
                    long jLongValue = ((Number) it2.next()).longValue();
                    Iterator<QuickCohostContent> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (next2.contentId == jLongValue) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    QuickCohostContent quickCohostContent = next2;
                    if (quickCohostContent != null) {
                        str3 = quickCohostContent.displayText;
                    } else {
                        str3 = null;
                    }
                    if (C1533950q1J.LJ(str3)) {
                        if (i2 == listLIZ.size()) {
                            break;
                        }
                        if (quickCohostContent == null || (str4 = quickCohostContent.displayText) == null) {
                            str4 = "";
                        }
                        float fMeasureText2 = paint.measureText(str4) + fLIZ + fLIZ2;
                        String name2 = getName();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("measureMaxShowCount count:");
                        sbLIZ2.append(i2);
                        sbLIZ2.append(" curTotalWidth:");
                        sbLIZ2.append(f2);
                        sbLIZ2.append(", curItemNeededSpace:");
                        sbLIZ2.append(fMeasureText2);
                        C20441214yg.LIZIZ(name2, C2188811AlT.LIZIZ(sbLIZ2));
                        f2 += fMeasureText2;
                        if (f2 + fMeasureText < i) {
                            i2++;
                        } else {
                            C20441214yg.LJ(getName(), "measureMaxShowCount not enough room for next item, so break");
                            f = fMeasureText2 - fMeasureText;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            f = -1.0f;
        } else {
            f = -1.0f;
        }
        String name3 = getName();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("bindEditInterestTagView restrictItemMaxWidth:");
        sbLIZ3.append(f);
        C20441214yg.LIZIZ(name3, C2188811AlT.LIZIZ(sbLIZ3));
        Iterator it4 = listLIZ.iterator();
        int i3 = 0;
        while (it4.hasNext()) {
            long jLongValue2 = ((Number) it4.next()).longValue();
            Iterator<QuickCohostContent> it5 = list.iterator();
            while (true) {
                if (it5.hasNext()) {
                    next = it5.next();
                    if (next.contentId == jLongValue2) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            QuickCohostContent quickCohostContent2 = next;
            if (quickCohostContent2 != null) {
                str = quickCohostContent2.displayText;
            } else {
                str = null;
            }
            if (C1533950q1J.LJ(str)) {
                if (c16f5R5 == null) {
                    c16f5R5 = R5();
                }
                if (quickCohostContent2 == null || (str2 = quickCohostContent2.displayText) == null) {
                    str2 = "";
                }
                c16f5R5.setText(str2);
                if (i3 >= listLIZ.size() - 2) {
                    c16f5R5.setEllipsize(TextUtils.TruncateAt.END);
                }
                if (f > 0.0f && i3 == listLIZ.size() - 2) {
                    c16f5R5.setMaxWidth((int) f);
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C439101nJ.LIZ(20));
                layoutParams.setMarginEnd(C439101nJ.LIZ(4));
                layoutParams.gravity = 17;
                ViewGroup viewGroup = (ViewGroup) this.LLJJIJIIJIL.getValue();
                if (viewGroup != null) {
                    viewGroup.addView(c16f5R5, layoutParams);
                }
                i3++;
                c16f5R5 = null;
            }
        }
    }

    public final void P5(D d, boolean z) {
        String strJ4;
        if (!C500260Jjc.LJJJI(InterfaceC1104970erP.D2.LIZ())) {
            X5();
            return;
        }
        C16FS c16fsD0 = d0();
        if (c16fsD0 != null && c16fsD0.isEnabled() && C949960apO.LIZ()) {
            if (C960270b61.LIZJ != C950220apo.LJ()) {
                C960270b61.LIZIZ = C13BV.INSTANCE;
            }
            List<QuickCohostContent> list = C960270b61.LIZIZ;
            int size = list.size();
            if (size > 0) {
                if (size != 1) {
                    if (size != 2) {
                        strJ4 = C786410Ut5.j4(C497740JfY.LJIJI(2131851780), Arrays.copyOf(new Object[]{((QuickCohostContent) ListProtector.get(list, 0)).displayText, ((QuickCohostContent) ListProtector.get(list, 1)).displayText, ((QuickCohostContent) ListProtector.get(list, 2)).displayText}, 3));
                    } else {
                        strJ4 = C786410Ut5.j4(C497740JfY.LJIJI(2131851779), Arrays.copyOf(new Object[]{((QuickCohostContent) ListProtector.get(list, 0)).displayText, ((QuickCohostContent) ListProtector.get(list, 1)).displayText}, 2));
                    }
                } else {
                    strJ4 = C786410Ut5.j4(C497740JfY.LJIJI(2131851778), Arrays.copyOf(new Object[]{((QuickCohostContent) ListProtector.get(list, 0)).displayText}, 1));
                }
            } else {
                strJ4 = "";
            }
            if (strJ4.length() > 0) {
                C16F5 c16f5S5 = S5();
                if (c16f5S5 != null) {
                    c16f5S5.setText(strJ4);
                }
                TextView textView = (TextView) this.LLJJ.getValue();
                if (textView != null) {
                    textView.setText(strJ4);
                }
            } else {
                C16F5 c16f5S52 = S5();
                if (c16f5S52 != null) {
                    c16f5S52.setText(C497740JfY.LJIJI(2131851777));
                }
                TextView textView2 = (TextView) this.LLJJ.getValue();
                if (textView2 != null) {
                    textView2.setText(C497740JfY.LJIJI(2131851777));
                }
            }
            if (LiveCohostAllowQuickInviteWithManualInviteSetting.INSTANCE.isEnable()) {
                C500260Jjc.LJIILIIL(V5());
                C500260Jjc.LJIILLIIL(T5());
            }
            if (z && C962420b9U.LIZ()) {
                C500260Jjc.LLFFF((View) this.LLJJ.getValue());
                C500260Jjc.LJIILIIL(S5());
            } else {
                C500260Jjc.LJIILIIL((View) this.LLJJ.getValue());
                C500260Jjc.LLFFF(S5());
            }
            C500260Jjc.LLFFF((View) this.LLILZLL.getValue());
        } else {
            C500260Jjc.LJIILIIL((View) this.LLJJ.getValue());
            C500260Jjc.LJIILIIL(S5());
        }
        b6(d);
    }

    public AbstractC962390b9R(View view, LifecycleOwner lifecycleOwner, AbstractC960950b77 abstractC960950b77) {
        super(view);
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = abstractC960950b77;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILZLL = C452501pT.LIZ(enumC452301pR, new AwS559S0100000_15(view, 511));
        this.LLIZ = C452501pT.LIZ(enumC452301pR, new AwS559S0100000_15(view, 501));
        this.LLIZLLLIL = C452501pT.LIZ(enumC452301pR, new AwS559S0100000_15(view, 515));
        this.LLJ = C452501pT.LIZ(enumC452301pR, new AwS559S0100000_15(view, 500));
        this.LLJI = C452501pT.LIZ(enumC452301pR, new AwS559S0100000_15(view, 506));
        this.LLJIJIL = C452501pT.LIZ(enumC452301pR, new AwS559S0100000_15(view, 512));
        this.LLJILJIL = C452501pT.LIZ(enumC452301pR, new AwS559S0100000_15(view, 513));
        this.LLJILJILJ = C452501pT.LIZ(enumC452301pR, new AwS559S0100000_15(view, 514));
        this.LLJILLL = view;
        this.LLJJ = C1935407i4.LIZ(new AwS559S0100000_15(view, 505));
        this.LLJJI = C1935407i4.LIZ(new AwS559S0100000_15(view, 509));
        this.LLJJIII = C1935407i4.LIZ(new AwS559S0100000_15(view, 510));
        this.LLJJIJI = C1935407i4.LIZ(new AwS559S0100000_15(view, 503));
        this.LLJJIJIIJIL = C1935407i4.LIZ(new AwS559S0100000_15(view, 504));
        this.LLJJIJIL = C1935407i4.LIZ(new AwS559S0100000_15(view, 502));
        this.LLJJJ = C1935407i4.LIZ(new AwS559S0100000_15(view, 508));
        this.LLJJJIL = C1935407i4.LIZ(new AwS559S0100000_15(view, 507));
        this.LLJJJJ = "";
        this.LLJJJJJIL = C13LP.LJJLIIIJ(C960270b61.LIZ(), null, null, null, 0, null, AFwS250S0000000_15.get$arr$(91), 31);
    }
}
