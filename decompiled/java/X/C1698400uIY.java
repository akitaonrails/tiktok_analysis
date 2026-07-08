package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.onlygiftselect.MatchOnlyGiftViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.chooseaccount.AuthorizedOrgAccountInfo;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.LoginChooseAccountsFragment;
import com.ss.android.ugc.aweme.account.org.create.OrgAccount;
import com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import com.ss.android.ugc.aweme.templateselect.Template;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0uIY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698400uIY extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4);
            case 7:
                return invoke$7(this, obj, obj2, obj3, obj4);
            case 8:
                return invoke$8(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698400uIY(C05P1 c05p1, MatchOnlyGiftViewModel matchOnlyGiftViewModel, int i) {
        super(4);
        this.$t = i;
        this.l0 = matchOnlyGiftViewModel;
        this.l1 = c05p1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1698400uIY(C1625240sOY c1625240sOY, C1625240sOY c1625240sOY2, InterfaceC1456340o08<InterfaceC1625290sOd> interfaceC1456340o08) {
        super(4);
        this.$t = interfaceC1456340o08;
        this.l0 = c1625240sOY;
        this.l1 = c1625240sOY2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1698400uIY(InterfaceC1631630sYr interfaceC1631630sYr, InterfaceC1631630sYr<? super Integer, ? super Boolean, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr2, C05P0<C1668650tWZ> c05p0) {
        super(4);
        this.$t = c05p0;
        this.l0 = interfaceC1631630sYr;
        this.l1 = interfaceC1631630sYr2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698400uIY(List list, C05P1 c05p1, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
        this.l1 = c05p1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698400uIY(List list, LoginChooseAccountsFragment loginChooseAccountsFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
        this.l1 = loginChooseAccountsFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698400uIY(List list, OrgAccountsListFragment orgAccountsListFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
        this.l1 = orgAccountsListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698400uIY(List list, StoryHighlightsCreationVM storyHighlightsCreationVM, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
        this.l1 = storyHighlightsCreationVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698400uIY(List list, Function1 function1, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
        this.l1 = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(X.C1698400uIY r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r0 = r17
            r14 = r16
            java.lang.Number r15 = (java.lang.Number) r15
            int r4 = r15.intValue()
            X.0tpg r14 = (X.InterfaceC1680500tpg) r14
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            r0 = r6 & 48
            r5 = 32
            if (r0 != 0) goto L21
            boolean r0 = r14.LJIJI(r4)
            if (r0 == 0) goto La7
            r0 = 32
        L20:
            r6 = r6 | r0
        L21:
            r1 = r6 & 145(0x91, float:2.03E-43)
            r0 = 144(0x90, float:2.02E-43)
            if (r1 != r0) goto L33
            boolean r0 = r14.LIZ()
            if (r0 == 0) goto L33
            r14.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            java.lang.Object r0 = r13.l1
            X.05P1 r0 = (X.C05P1) r0
            X.0bZW r0 = X.C1670050tYp.LIZLLL(r0)
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode> r0 = r0.LIZ
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode r1 = (com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode) r1
            com.bytedance.android.live.base.model.ImageModel r0 = r1.giftIconImage
            if (r0 == 0) goto L4d
            java.util.List r8 = r0.getUrls()
            if (r8 != 0) goto L4f
        L4d:
            X.13BV r8 = X.C13BV.INSTANCE
        L4f:
            java.lang.String r9 = r1.giftName
            if (r9 != 0) goto L55
            java.lang.String r9 = ""
        L55:
            long r10 = r1.giftPrice
            java.lang.Object r0 = r13.l1
            X.05P1 r0 = (X.C05P1) r0
            X.0bZW r0 = X.C1670050tYp.LIZLLL(r0)
            long r2 = r0.LIZJ
            long r0 = r1.giftId
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 1
            if (r7 != 0) goto La5
            r12 = 1
        L69:
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r14.LJJIIJZLJL(r0)
            java.lang.Object r0 = r13.l0
            com.bytedance.android.live.liveinteract.multimatch.business.dialog.onlygiftselect.MatchOnlyGiftViewModel r0 = (com.bytedance.android.live.liveinteract.multimatch.business.dialog.onlygiftselect.MatchOnlyGiftViewModel) r0
            boolean r2 = r14.LJII(r0)
            r0 = r6 & 112(0x70, float:1.57E-43)
            if (r0 == r5) goto L7c
            r1 = 0
        L7c:
            r2 = r2 | r1
            java.lang.Object r1 = r13.l0
            com.bytedance.android.live.liveinteract.multimatch.business.dialog.onlygiftselect.MatchOnlyGiftViewModel r1 = (com.bytedance.android.live.liveinteract.multimatch.business.dialog.onlygiftselect.MatchOnlyGiftViewModel) r1
            java.lang.Object r13 = r14.LJJ()
            if (r2 != 0) goto L90
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r13 != r0) goto L99
        L90:
            kotlin.jvm.internal.AwS163S0101000_25 r13 = new kotlin.jvm.internal.AwS163S0101000_25
            r0 = 1
            r13.<init>(r1, r4, r0)
            r14.LJJIJIIJI(r13)
        L99:
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            r14.LJ()
            r15 = 0
            r16 = r15
            X.C1670050tYp.LIZ(r8, r9, r10, r12, r13, r14, r15, r16)
            goto L30
        La5:
            r12 = 0
            goto L69
        La7:
            r0 = 16
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698400uIY.invoke$0(X.0uIY, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(X.C1698400uIY r25, java.lang.Object r26, java.lang.Object r27, java.lang.Object r28, java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698400uIY.invoke$1(X.0uIY, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(C1698400uIY c1698400uIY, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj4).booleanValue();
        C2347809Hw.LJ((String) obj3, C2347809Hw.LIZIZ(C1445850njD.LIZ), null, C786410Ut5.O3(((C1625240sOY) c1698400uIY.l0).LLJJI), new AwS604S0100000_25((InterfaceC1456340o08) c1698400uIY.l1, (InterfaceC1456340o08<InterfaceC1625290sOd>) obj2, (String) 334));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(C1698400uIY c1698400uIY, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(i & 1, z)) {
            AuthorizedOrgAccountInfo authorizedOrgAccountInfo = (AuthorizedOrgAccountInfo) ListProtector.get((List) c1698400uIY.l0, iIntValue);
            interfaceC1680500tpg.LJJIIJZLJL(1643498635);
            ((LoginChooseAccountsFragment) c1698400uIY.l1).QS(authorizedOrgAccountInfo, interfaceC1680500tpg, ((i & 14) >> 3) & 14);
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(C1698400uIY c1698400uIY, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(i & 1, z)) {
            Object obj5 = ListProtector.get((List) c1698400uIY.l0, iIntValue);
            int i4 = i & 14;
            interfaceC1680500tpg.LJJIIJZLJL(56769229);
            C1674430tft.LJ((StoryHighlightsCreationVM) c1698400uIY.l1, (StoryHighlightAwemePreview) obj5, interfaceC1680500tpg, (i4 & 112) | (StoryHighlightAwemePreview.$stable << 3));
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(C1698400uIY c1698400uIY, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(i & 1, z)) {
            interfaceC1680500tpg.LJJIIJZLJL(-1629614979);
            C1683920tvC.LIZIZ((C315970Ca3) ListProtector.get((List) c1698400uIY.l0, iIntValue), null, interfaceC1680500tpg, (((i & 112) | (i & 14)) >> 6) & 14, 2);
            interfaceC1680500tpg.LJJIIJZLJL(-883850668);
            if (iIntValue < ((List) ((C05P1) c1698400uIY.l1).getValue()).size() - 1) {
                C1665790tRx.LIZ(c.LJI(InterfaceC1685750ty9.LIZ, 12), interfaceC1680500tpg);
            }
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(C1698400uIY c1698400uIY, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(i & 1, z)) {
            Template template = (Template) ListProtector.get((List) c1698400uIY.l0, iIntValue);
            interfaceC1680500tpg.LJJIIJZLJL(-1866469847);
            C1673660tee.LJI(template, (Function1) c1698400uIY.l1, interfaceC1680500tpg, ((i & 14) >> 3) & 14);
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(C1698400uIY c1698400uIY, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(obj)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(i & 1, z)) {
            OrgAccount orgAccount = (OrgAccount) ListProtector.get((List) c1698400uIY.l0, iIntValue);
            interfaceC1680500tpg.LJJIIJZLJL(207946647);
            ((OrgAccountsListFragment) c1698400uIY.l1).SR(orgAccount, interfaceC1680500tpg, ((i & 14) >> 3) & 14);
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(C1698400uIY c1698400uIY, Object obj, Object obj2, Object obj3, Object obj4) {
        ((InterfaceC1631630sYr) c1698400uIY.l0).invoke(Integer.valueOf(((Number) obj2).intValue()), Boolean.valueOf(!C1668650tWZ.LIZJ(((C1668650tWZ) ((C05P0) c1698400uIY.l1).getValue()).LL, Float.NaN)), obj3, Integer.valueOf((((Number) obj4).intValue() >> 3) & 14));
        return Unit.LIZ;
    }
}
