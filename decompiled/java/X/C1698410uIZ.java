package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS302S0300000_25;

/* JADX INFO: renamed from: X.0uIZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698410uIZ extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1698410uIZ(C563600M8o c563600M8o, C563600M8o c563600M8o2, Function1<? super C563580M8m, Unit> function1, SocialMediaPickerViewModel socialMediaPickerViewModel) {
        super(4);
        this.$t = socialMediaPickerViewModel;
        this.l0 = c563600M8o;
        this.l1 = c563600M8o2;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698410uIZ(List list, FollowCreatorsViewModel followCreatorsViewModel, InterfaceC898260ZLs interfaceC898260ZLs, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
        this.l1 = followCreatorsViewModel;
        this.l2 = interfaceC898260ZLs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698410uIZ(List list, StoryHighlightsCreationVM storyHighlightsCreationVM, C1674360tfm c1674360tfm, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
        this.l1 = storyHighlightsCreationVM;
        this.l2 = c1674360tfm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698410uIZ(List list, StoryHighlightsCreationVM storyHighlightsCreationVM, C1674400tfq c1674400tfq, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
        this.l1 = storyHighlightsCreationVM;
        this.l2 = c1674400tfq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698410uIZ(List list, Function1 function1, Function0 function0, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
        this.l1 = function1;
        this.l2 = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$0(X.C1698410uIZ r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            java.lang.Number r8 = (java.lang.Number) r8
            int r3 = r8.intValue()
            X.0tpg r9 = (X.InterfaceC1680500tpg) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r1 = r10.intValue()
            r0 = r1 & 6
            if (r0 != 0) goto La2
            boolean r0 = r9.LJJIIJ(r7)
            if (r0 == 0) goto L9f
            r2 = 4
        L19:
            r2 = r2 | r1
        L1a:
            r0 = r1 & 48
            if (r0 != 0) goto L27
            boolean r0 = r9.LJIJI(r3)
            if (r0 == 0) goto L9c
            r0 = 32
        L26:
            r2 = r2 | r0
        L27:
            r1 = r2 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 == r0) goto L9a
            r1 = 1
        L2e:
            r0 = r2 & 1
            boolean r0 = r9.LJIJJLI(r0, r1)
            if (r0 == 0) goto L96
            java.lang.Object r0 = r6.l0
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            r5 = r2 & 14
            X.0tes r4 = (X.C1673800tes) r4
            r0 = -1034876547(0xffffffffc251097d, float:-52.259266)
            r9.LJJIIJZLJL(r0)
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r9.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel r0 = (com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel) r0
            boolean r1 = r9.LJII(r0)
            boolean r0 = r9.LJII(r4)
            r1 = r1 | r0
            java.lang.Object r0 = r6.l2
            X.0ZLs r0 = (X.InterfaceC898260ZLs) r0
            boolean r0 = r9.LJII(r0)
            r1 = r1 | r0
            java.lang.Object r3 = r9.LJJ()
            if (r1 != 0) goto L73
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r3 != r0) goto L84
        L73:
            kotlin.jvm.internal.AwS269S0300000_25 r3 = new kotlin.jvm.internal.AwS269S0300000_25
            java.lang.Object r2 = r6.l1
            com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel r2 = (com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel) r2
            java.lang.Object r1 = r6.l2
            X.0ZLs r1 = (X.InterfaceC898260ZLs) r1
            r0 = 6
            r3.<init>(r2, r4, r1, r0)
            r9.LJJIJIIJI(r3)
        L84:
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r9.LJ()
            int r0 = r5 >> 3
            r0 = r0 & 14
            X.C1673770tep.LIZJ(r4, r3, r9, r0)
            r9.LJ()
        L93:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L96:
            r9.LIZJ()
            goto L93
        L9a:
            r1 = 0
            goto L2e
        L9c:
            r0 = 16
            goto L26
        L9f:
            r2 = 2
            goto L19
        La2:
            r2 = r1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698410uIZ.invoke$0(X.0uIZ, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(C1698410uIZ c1698410uIZ, Object obj, Object obj2, Object obj3, Object obj4) {
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
            StoryHighlightAwemePreview storyHighlightAwemePreview = (StoryHighlightAwemePreview) ListProtector.get((List) c1698410uIZ.l0, iIntValue);
            interfaceC1680500tpg.LJJIIJZLJL(-1876233815);
            C1674290tff.LIZ(C13Z4.LIZJ(-1142985422, new AwS302S0300000_25((StoryHighlightsCreationVM) c1698410uIZ.l1, (C1674360tfm) c1698410uIZ.l2, storyHighlightAwemePreview, 7), interfaceC1680500tpg), interfaceC1680500tpg, 6);
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(C1698410uIZ c1698410uIZ, Object obj, Object obj2, Object obj3, Object obj4) {
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
            int i4 = i & 14;
            StoryHighlightAwemePreview storyHighlightAwemePreview = (StoryHighlightAwemePreview) ListProtector.get((List) c1698410uIZ.l0, iIntValue);
            interfaceC1680500tpg.LJJIIJZLJL(-627083164);
            C1674390tfp.LIZIZ((StoryHighlightsCreationVM) c1698410uIZ.l1, (C1674400tfq) c1698410uIZ.l2, storyHighlightAwemePreview, interfaceC1680500tpg, ((i4 << 3) & 896) | (StoryHighlightAwemePreview.$stable << 6));
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(X.C1698410uIZ r28, java.lang.Object r29, java.lang.Object r30, java.lang.Object r31, java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698410uIZ.invoke$3(X.0uIZ, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(C1698410uIZ c1698410uIZ, Object obj, Object obj2, Object obj3, Object obj4) {
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
            interfaceC1680500tpg.LJJIIJZLJL(857769710);
            C1683340tuG.LIZ((C1683410tuN) ListProtector.get((List) c1698410uIZ.l0, iIntValue), (Function1) c1698410uIZ.l1, (Function0) c1698410uIZ.l2, interfaceC1680500tpg, ((i & 14) >> 3) & 14);
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }
}
